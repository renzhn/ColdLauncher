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
		 * ���ⶳӦ��ʱ����
		 * 
		 * @param packageName
		 *            �ⶳӦ�õİ���
		 * @param launchAfterDefrost
		 *            �Ƿ�Ϊ���ⶳ�������������û����������������Ӧ������ʱΪ true������������糤��ͼ��ⶳʱΪ false
		 */
		@Override
		public void defrostPackage(String packageName, boolean launchAfterDefrost) {
			Log.i(TAG, "Defrost package: " + packageName + ", launchAfterDefrost: " + launchAfterDefrost);
			if (launchAfterDefrost) {
				mToFreezePackage = packageName;
			}
		}

		/**
		 * ���û�����������ʱ����
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
		 * ������ʱ����
		 * 
		 * ע��Ҳ���Բ�ʹ������������ڲ����ͨ�����������Ĺ㲥ʵ��
		 */
		@Override
		public void onScreenLock() {
			Log.i(TAG, "onScreenLock");
		}

		/**
		 * ��������Ļʱ����
		 */
		@Override
		public void onUserPresent() {
			Log.i(TAG, "onUserPresent");
		}

		/**
		 * ע�ᶳ��Ӧ�õĻص���һ�㲻���޸ģ�
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
	 * ����Ӧ�õĻص��������������ķ���ȥ����Ӧ�ã�һ�㲻���޸ģ�
	 * 
	 * ע��Ҳ���Բ�ʹ�ô˻ص����ڲ���е��� ROOT ���� `pm disable` �������Ƽ�ʹ�ô˻ص���
	 * ��Ϊ��������汻��װΪϵͳӦ�ÿ���ʹ�ó���ķ�ROOT ���᷽��
	 * 
	 * @param packageNameList
	 *            Ҫ�����Ӧ�ð��б��������֮���á�|���ֿ�
	 */
	void freezePackage(String packageNameList) {
		Log.i(TAG, "freezePackage�� " + packageNameList);
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
	 * �ⶳӦ�õĻص��������������ķ���ȥ�ⶳӦ�ã�һ�㲻���޸ģ�
	 * 
	 * ע���ڱ������û���õ��˷���
	 * 
	 * @param packageNameList
	 *            Ҫ�ⶳ��Ӧ�ð��б��������֮���á�|���ֿ�
	 */
	void defrostPackage(String packageNameList) {
		Log.i(TAG, "defrostPackage�� " + packageNameList);
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
