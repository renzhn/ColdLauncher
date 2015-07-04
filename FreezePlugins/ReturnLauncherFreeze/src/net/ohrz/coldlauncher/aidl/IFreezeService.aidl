package net.ohrz.coldlauncher.aidl;

import net.ohrz.coldlauncher.aidl.IFreezeCallback;

interface IFreezeService {
    void defrostPackage(String packageName, boolean launchAfterDefrost);
    void onLauncherResume();
    void onScreenLock();
    void onUserPresent();
    void registerCallback(IFreezeCallback cb);   
    void unregisterCallback(IFreezeCallback cb);   
}
