package net.ohrz.coldlauncher.aidl;

interface IFreezeCallback {
    void freezePackage(String packageNameList);
    void defrostPackage(String packageNameList);
}