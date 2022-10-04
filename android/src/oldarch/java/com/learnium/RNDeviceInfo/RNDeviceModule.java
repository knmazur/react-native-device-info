package com.learnium.RNDeviceInfo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;

import java.lang.reflect.Method;
import java.util.Map;

import javax.annotation.Nonnull;

@ReactModule(name = RNDeviceModuleImpl.NAME)
public class RNDeviceModule extends ReactContextBaseJavaModule {

  private RNDeviceModuleImpl implementation;
  public RNDeviceModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.implementation = new RNDeviceModuleImpl(reactContext);
  }

  @Override
  public void initialize() {
    super.initialize();
    implementation.initialize();
  }

  @Override
  public void onCatalystInstanceDestroy() {
    super.onCatalystInstanceDestroy();
    implementation.onCatalystInstanceDestroy();
  }

  @Override
  @Nonnull
  public String getName() {
    return RNDeviceModuleImpl.NAME;
  }

  @Override
  public Map<String, Object> getConstants() {
    return implementation.getConstants();
  }

  @ReactMethod
  public void addListener(String eventName) {
    // Keep: Required for RN built in Event Emitter Calls.
  }

  @ReactMethod
  public void removeListeners(Integer count) {
    // Keep: Required for RN built in Event Emitter Calls.
  }

  @ReactMethod
  public void isEmulator(Promise p) {
    implementation.isEmulator(p);
  }

  @SuppressLint("HardwareIds")
  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean isEmulatorSync() {
    return implementation.isEmulatorSync();
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public float getFontScaleSync() {
    return implementation.getFontScaleSync();
  }

  @ReactMethod
  public void getFontScale(Promise p) {
    implementation.getFontScale(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean isPinOrFingerprintSetSync() {
    return implementation.isPinOrFingerprintSetSync();
  }

  @ReactMethod
  public void isPinOrFingerprintSet(Promise p) {
    implementation.isPinOrFingerprintSet(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  @SuppressWarnings("ConstantConditions")
  public String getIpAddressSync() {
    return implementation.getIpAddressSync();
  }

  @ReactMethod
  public void getIpAddress(Promise p) {
    implementation.getIpAddress(p);
  }

  @SuppressWarnings("deprecation")
  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean isCameraPresentSync() {
    return implementation.isCameraPresentSync();
  }

  @ReactMethod
  public void isCameraPresent(Promise p) {
    implementation.isCameraPresent(p);
  }

  @SuppressLint("HardwareIds")
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getMacAddressSync() {
    return implementation.getMacAddressSync();
  }

  @ReactMethod
  public void getMacAddress(Promise p) {
    implementation.getMacAddress(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getCarrierSync() {
    return implementation.getCarrierSync();
  }

  @ReactMethod
  public void getCarrier(Promise p) {
    implementation.getCarrier(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getTotalDiskCapacitySync() {
    return implementation.getTotalDiskCapacitySync();
  }

  @ReactMethod
  public void getTotalDiskCapacity(Promise p) { p.resolve(getTotalDiskCapacitySync()); }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getFreeDiskStorageSync() {
    return implementation.getFreeDiskStorageSync();
  }

  @ReactMethod
  public void getFreeDiskStorage(Promise p) {
    implementation.getFreeDiskStorage(p);
  }

  @Deprecated
  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getTotalDiskCapacityOldSync() {
    return implementation.getTotalDiskCapacityOldSync();
  }
  @ReactMethod
  public void getTotalDiskCapacityOld(Promise p) {
    implementation.getTotalDiskCapacityOld(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getFreeDiskStorageOldSync() {
    return implementation.getFreeDiskStorageOldSync();
  }

  @ReactMethod
  public void getFreeDiskStorageOld(Promise p) {
    implementation.getFreeDiskStorageOld(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean isBatteryChargingSync(){
    return implementation.isBatteryChargingSync();
  }

  @ReactMethod
  public void isBatteryCharging(Promise p) {
    implementation.isBatteryCharging(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getUsedMemorySync() {
    return implementation.getUsedMemorySync();
  }

  @ReactMethod
  public void getUsedMemory(Promise p) {
    implementation.getUsedMemory(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableMap getPowerStateSync() {
    return implementation.getPowerStateSync();
  }

  @ReactMethod
  public void getPowerState(Promise p) {
    implementation.getPowerState(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getBatteryLevelSync() {
    return implementation.getBatteryLevelSync();
  }

  @ReactMethod
  public void getBatteryLevel(Promise p) {
    implementation.getBatteryLevel(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean isAirplaneModeSync() {
    return implementation.isAirplaneModeSync();
  }

  @ReactMethod
  public void isAirplaneMode(Promise p) { 
    implementation.isAirplaneMode(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean hasGmsSync() {
    return implementation.hasGmsSync();
  }

  @ReactMethod
  public void hasGms(Promise p) {
    implementation.hasGms(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean hasHmsSync() {
    return implementation.hasHmsSync();
  }

  @ReactMethod
  public void hasHms(Promise p) {
    implementation.hasHms(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean hasSystemFeatureSync(String feature) {
    return implementation.hasSystemFeatureSync(feature);
  }

  @ReactMethod
  public void hasSystemFeature(String feature, Promise p) {
    implementation.hasSystemFeature(feature,p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray getSystemAvailableFeaturesSync() {
    return implementation.getSystemAvailableFeaturesSync();
  }

  @ReactMethod
  public void getSystemAvailableFeatures(Promise p) {
    implementation.getSystemAvailableFeatures(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean isLocationEnabledSync() {
    return implementation.isLocationEnabledSync();
  }

  @ReactMethod
  public void isLocationEnabled(Promise p) {
    implementation.isLocationEnabled(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean isHeadphonesConnectedSync() {
    return implementation.isHeadphonesConnectedSync();
  }

  @ReactMethod
  public void isHeadphonesConnected(Promise p) {
    implementation.isHeadphonesConnected(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableMap getAvailableLocationProvidersSync() {
    return implementation.getAvailableLocationProvidersSync();
  }

  @ReactMethod
  public void getAvailableLocationProviders(Promise p) {
    implementation.getAvailableLocationProviders(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getInstallReferrerSync() {
    return implementation.getInstallReferrerSync();
  }

  @ReactMethod
  public void getInstallReferrer(Promise p) {
    implementation.getInstallReferrer(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getInstallerPackageNameSync() {
    return implementation.getInstallerPackageNameSync();
  }

  @ReactMethod
  public void getInstallerPackageName(Promise p) {
    implementation.getInstallerPackageName(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getFirstInstallTimeSync() {
    return implementation.getFirstInstallTimeSync();
  }

  @ReactMethod
  public void getFirstInstallTime(Promise p) {
    implementation.getFirstInstallTime(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getLastUpdateTimeSync() {
    return implementation.getLastUpdateTimeSync();
  }

  @ReactMethod
  public void getLastUpdateTime(Promise p) {
    implementation.getLastUpdateTime(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getDeviceNameSync() {
    return implementation.getDeviceNameSync();
  }

  @ReactMethod
  public void getDeviceName(Promise p) {
    implementation.getDeviceName(p);
  }

  @SuppressLint({"HardwareIds", "MissingPermission"})
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getSerialNumberSync() {
    return implementation.getSerialNumberSync();
  }

  @ReactMethod
  public void getSerialNumber(Promise p) {
    implementation.getSerialNumber(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getDeviceSync() {
    return implementation.getDeviceSync();
  }

  @ReactMethod
  public void getDevice(Promise p) {
    implementation.getDevice(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getBuildIdSync() {
    return implementation.getBuildIdSync();
  }

  @ReactMethod
  public void getBuildId(Promise p) {
    implementation.getBuildId(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public int getApiLevelSync() {
    return implementation.getApiLevelSync();
  }

  @ReactMethod
  public void getApiLevel(Promise p) {
    implementation.getApiLevel(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getBootloaderSync() {
    return implementation.getBootloaderSync();
  }

  @ReactMethod
  public void getBootloader(Promise p) {
    implementation.getBootloader(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getDisplaySync() {
    return implementation.getDisplaySync();
  }

  @ReactMethod
  public void getDisplay(Promise p) {
    implementation.getDisplay(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getFingerprintSync() {
    return implementation.getFingerprintSync();
  }

  @ReactMethod
  public void getFingerprint(Promise p) {
    implementation.getFingerprint(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getHardwareSync() {
    return implementation.getHardwareSync();
  }

  @ReactMethod
  public void getHardware(Promise p) {
    implementation.getHardware(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getHostSync() {
    return implementation.getHostSync();
  }

  @ReactMethod
  public void getHost(Promise p) {
    implementation.getHost(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getProductSync() {
    return implementation.getProductSync();
  }

  @ReactMethod
  public void getProduct(Promise p) {
    implementation.getProduct(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getTagsSync() {
    return implementation.getTagsSync();
  }

  @ReactMethod
  public void getTags(Promise p) {
    implementation.getTags(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getTypeSync() {
    return implementation.getTypeSync();
  }

  @ReactMethod
  public void getType(Promise p) {
    implementation.getType(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getSystemManufacturerSync() {
    return implementation.getSystemManufacturerSync();
  }

  @ReactMethod
  public void getSystemManufacturer(Promise p) {
    implementation.getSystemManufacturer(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getCodenameSync() {
    return implementation.getCodenameSync();
  }

  @ReactMethod
  public void getCodename(Promise p) {
    implementation.getCodename(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getIncrementalSync() {
    return implementation.getIncrementalSync();
  }

  @ReactMethod
  public void getIncremental(Promise p) {
    implementation.getIncremental(p);
  }

  @SuppressLint("HardwareIds")
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getUniqueIdSync() {
    return implementation.getUniqueIdSync();
  }

  @ReactMethod
  public void getUniqueId(Promise p) {
    implementation.getUniqueId(p);
  }

  @SuppressLint("HardwareIds")
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getAndroidIdSync() {
    return implementation.getAndroidIdSync();
  }

  @ReactMethod
  public void getAndroidId(Promise p) {
    implementation.getAndroidId(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getMaxMemorySync() {
    return implementation.getMaxMemorySync();
  }

  @ReactMethod
  public void getMaxMemory(Promise p) {
    implementation.getMaxMemory(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getTotalMemorySync() {
    return implementation.getTotalMemorySync();
  }

  @ReactMethod
  public void getTotalMemory(Promise p) {
    implementation.getTotalMemory(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  @SuppressWarnings({"ConstantConditions", "deprecation"})
  public String getInstanceIdSync() {
    return implementation.getInstanceIdSync();

  }
  @ReactMethod
  public void getInstanceId(Promise p) {
    implementation.getInstanceId(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getBaseOsSync() {
    return implementation.getBaseOsSync();
  }

  @ReactMethod
  public void getBaseOs(Promise p) {
    implementation.getBaseOs(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getPreviewSdkIntSync() {
    return implementation.getPreviewSdkIntSync();
  }

  @ReactMethod
  public void getPreviewSdkInt(Promise p) {
    implementation.getPreviewSdkInt(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getSecurityPatchSync() {
    return implementation.getSecurityPatchSync();
  }

  @ReactMethod
  public void getSecurityPatch(Promise p) {
    implementation.getSecurityPatch(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getUserAgentSync() {
    return implementation.getUserAgentSync();
  }

  @ReactMethod
  public void getUserAgent(Promise p) {
    implementation.getUserAgent(p);
  }

  @SuppressLint({"HardwareIds", "MissingPermission"})
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getPhoneNumberSync() {
    return implementation.getPhoneNumberSync();
  }

  @ReactMethod
  public void getPhoneNumber(Promise p) {
    implementation.getPhoneNumber(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray getSupportedAbisSync() {
   return implementation.getSupportedAbisSync();
  }

  @ReactMethod
  public void getSupportedAbis(Promise p) {
    implementation.getSupportedAbis(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray getSupported32BitAbisSync() {
    return implementation.getSupported32BitAbisSync();
  }

  @ReactMethod
  public void getSupported32BitAbis(Promise p) {
    implementation.getSupported32BitAbis(p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray getSupported64BitAbisSync() {
    return implementation.getSupported64BitAbisSync();
  }

  @ReactMethod
  public void getSupported64BitAbis(Promise p) {
    implementation.getSupported64BitAbis(p);
  }
}
