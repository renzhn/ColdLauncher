package net.ohrz.coldlauncher.plugin.returnlauncherfreeze;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import net.ohrz.coldlauncher.aidl.IFreezeCallback;
import net.ohrz.coldlauncher.aidl.IFreezeService;

public class FreezeService extends Service {

	static final String TAG = "FreezeService";

	public void onStart(Intent intent, int startId) {
		super.onStart(intent, startId);
	}

	public void onDestroy() {
		super.onDestroy();
	}

	public IBinder onBind(Intent intent) {
		return addBinder;
	}

	private String mToFreezePackage = null;

	private final IFreezeService.Stub addBinder = new IFreezeService.Stub() {

		/**
		 * 当解冻应用时调用
		 * 
		 * @param packageName
		 *            解冻应用的包名
		 * @param launchAfterDefrost
		 *            是否为“解冻并启动”，当用户在冷桌面点击冻结的应用启动时为 true，其他情况比如长按图标解冻时为 false
		 */
		@Override
		public void defrostPackage(String packageName, boolean launchAfterDefrost) {
			Log.i(TAG, "Defrost package: " + packageName + ", launchAfterDefrost: " + launchAfterDefrost);
			if (launchAfterDefrost) {
				mToFreezePackage = packageName;
			}
		}

		/**
		 * 当用户返回冷桌面时调用
		 */
		@Override
		public void onLauncherResume() {
			Log.i(TAG, "onLauncherResume");
			if (mToFreezePackage != null) {
				freezePackage(mToFreezePackage);
				mToFreezePackage = null;
			}
		}

		/**
		 * 当锁屏时调用
		 * 
		 * 注：也可以不使用这个方法，在插件中通过监听锁屏的广播实现
		 */
		@Override
		public void onScreenLock() {
			Log.i(TAG, "onScreenLock");
		}

		/**
		 * 当解锁屏幕时调用
		 */
		@Override
		public void onUserPresent() {
			Log.i(TAG, "onUserPresent");
		}

		/**
		 * 注册冻结应用的回调（一般不需修改）
		 */
		@Override
		public void registerCallback(IFreezeCallback cb) {
			if (cb != null) {
				mFreezeCallbacks.register(cb);
			}
		}

		@Override
		public void unregisterCallback(IFreezeCallback cb) {
			if (cb != null) {
				mFreezeCallbacks.unregister(cb);
			}
		}
	};

	final RemoteCallbackList<IFreezeCallback> mFreezeCallbacks = new RemoteCallbackList<IFreezeCallback>();

	/**
	 * 冻结应用的回调，会调用冷桌面的方法去冻结应用（一般不需修改）
	 * 
	 * 注：也可以不使用此回调，在插件中调用 ROOT 命令 `pm disable` 。但是推荐使用此回调，
	 * 因为如果冷桌面被安装为系统应用可以使用超快的非ROOT 冻结方法
	 * 
	 * @param packageNameList
	 *            要冻结的应用包列表，多个包名之间用“|”分开
	 */
	void freezePackage(String packageNameList) {
		Log.i(TAG, "freezePackage： " + packageNameList);
		final int N = mFreezeCallbacks.beginBroadcast();
		for (int i = 0; i < N; i++) {
			try {
				mFreezeCallbacks.getBroadcastItem(i).freezePackage(packageNameList);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}
		mFreezeCallbacks.finishBroadcast();
	}

	/**
	 * 解冻应用的回调，会调用冷桌面的方法去解冻应用（一般不需修改）
	 * 
	 * 注：在本插件中没有用到此方法
	 * 
	 * @param packageNameList
	 *            要解冻的应用包列表，多个包名之间用“|”分开
	 */
	void defrostPackage(String packageNameList) {
		Log.i(TAG, "defrostPackage： " + packageNameList);
		final int N = mFreezeCallbacks.beginBroadcast();
		for (int i = 0; i < N; i++) {
			try {
				mFreezeCallbacks.getBroadcastItem(i).defrostPackage(packageNameList);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}
		mFreezeCallbacks.finishBroadcast();
	}
}
