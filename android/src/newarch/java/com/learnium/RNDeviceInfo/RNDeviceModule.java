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
import java.util.HashMap;
import javax.annotation.Nonnull;

public class RNDeviceModule extends NativeRNDeviceInfoSpec {

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
  public Map<String, Object> getTypedExportedConstants() {
    return implementation.getConstants();
  }

  @Override
  public void addListener(String eventName) {
    // Keep: Required for RN built in Event Emitter Calls.
  }

  @Override
  public void removeListeners(double count) {
    // Keep: Required for RN built in Event Emitter Calls.
  }

  @Override
  public void isEmulator(Promise p) {
    implementation.isEmulator(p);
  }

  @SuppressLint("HardwareIds")
  @Override
  public boolean isEmulatorSync() {
    return implementation.isEmulatorSync();
  }

  @Override
  public double getFontScaleSync() {
    return (double) implementation.getFontScaleSync();
  }

  @Override
  public void getFontScale(Promise p) {
    implementation.getFontScale(p);
  }

  @Override
  public boolean isPinOrFingerprintSetSync() {
    return implementation.isPinOrFingerprintSetSync();
  }

  @Override
  public void isPinOrFingerprintSet(Promise p) {
    implementation.isPinOrFingerprintSet(p);
  }

  @Override
  @SuppressWarnings("ConstantConditions")
  public String getIpAddressSync() {
    return implementation.getIpAddressSync();
  }

  @Override
  public void getIpAddress(Promise p) {
    implementation.getIpAddress(p);
  }

  @SuppressWarnings("deprecation")
  @Override
  public boolean isCameraPresentSync() {
    return implementation.isCameraPresentSync();
  }

  @Override
  public void isCameraPresent(Promise p) {
    implementation.isCameraPresent(p);
  }

  @SuppressLint("HardwareIds")
  @Override
  public String getMacAddressSync() {
    return implementation.getMacAddressSync();
  }

  @Override
  public void getMacAddress(Promise p) {
    implementation.getMacAddress(p);
  }

  @Override
  public String getCarrierSync() {
    return implementation.getCarrierSync();
  }

  @Override
  public void getCarrier(Promise p) {
    implementation.getCarrier(p);
  }

  @Override
  public double getTotalDiskCapacitySync() {
    return implementation.getTotalDiskCapacitySync();
  }

  @Override
  public void getTotalDiskCapacity(Promise p) { p.resolve(getTotalDiskCapacitySync()); }

  @Override
  public double getFreeDiskStorageSync() {
    return implementation.getFreeDiskStorageSync();
  }

  @Override
  public void getFreeDiskStorage(Promise p) {
    implementation.getFreeDiskStorage(p);
  }

  @Deprecated
  @Override
  public double getTotalDiskCapacityOldSync() {
    return implementation.getTotalDiskCapacityOldSync();
  }
  @Override
  public void getTotalDiskCapacityOld(Promise p) {
    implementation.getTotalDiskCapacityOld(p);
  }

  @Override
  public double getFreeDiskStorageOldSync() {
    return implementation.getFreeDiskStorageOldSync();
  }

  @Override
  public void getFreeDiskStorageOld(Promise p) {
    implementation.getFreeDiskStorageOld(p);
  }

  @Override
  public boolean isBatteryChargingSync(){
    return implementation.isBatteryChargingSync();
  }

  @Override
  public void isBatteryCharging(Promise p) {
    implementation.isBatteryCharging(p);
  }

  @Override
  public double getUsedMemorySync() {
    return implementation.getUsedMemorySync();
  }

  @Override
  public void getUsedMemory(Promise p) {
    implementation.getUsedMemory(p);
  }

  @Override
  public WritableMap getPowerStateSync() {
    return implementation.getPowerStateSync();
  }

  @Override
  public void getPowerState(Promise p) {
    implementation.getPowerState(p);
  }

  @Override
  public double getBatteryLevelSync() {
    return implementation.getBatteryLevelSync();
  }

  @Override
  public void getBatteryLevel(Promise p) {
    implementation.getBatteryLevel(p);
  }

  @Override
  public boolean isAirplaneModeSync() {
    return implementation.isAirplaneModeSync();
  }

  @Override
  public void isAirplaneMode(Promise p) { 
    implementation.isAirplaneMode(p);
  }

  @Override
  public boolean hasGmsSync() {
    return implementation.hasGmsSync();
  }

  @Override
  public void hasGms(Promise p) {
    implementation.hasGms(p);
  }

  @Override
  public boolean hasHmsSync() {
    return implementation.hasHmsSync();
  }

  @Override
  public void hasHms(Promise p) {
    implementation.hasHms(p);
  }

  @Override
  public boolean hasSystemFeatureSync(String feature) {
    return implementation.hasSystemFeatureSync(feature);
  }

  @Override
  public void hasSystemFeature(String feature, Promise p) {
    implementation.hasSystemFeature(feature,p);
  }

  @Override
  public WritableArray getSystemAvailableFeaturesSync() {
    return implementation.getSystemAvailableFeaturesSync();
  }

  @Override
  public void getSystemAvailableFeatures(Promise p) {
    implementation.getSystemAvailableFeatures(p);
  }

  @Override
  public boolean isLocationEnabledSync() {
    return implementation.isLocationEnabledSync();
  }

  @Override
  public void isLocationEnabled(Promise p) {
    implementation.isLocationEnabled(p);
  }

  @Override
  public boolean isHeadphonesConnectedSync() {
    return implementation.isHeadphonesConnectedSync();
  }

  @Override
  public void isHeadphonesConnected(Promise p) {
    implementation.isHeadphonesConnected(p);
  }

  @Override
  public WritableMap getAvailableLocationProvidersSync() {
    return implementation.getAvailableLocationProvidersSync();
  }

  @Override
  public void getAvailableLocationProviders(Promise p) {
    implementation.getAvailableLocationProviders(p);
  }

  @Override
  public String getInstallReferrerSync() {
    return implementation.getInstallReferrerSync();
  }

  @Override
  public void getInstallReferrer(Promise p) {
    implementation.getInstallReferrer(p);
  }

  @Override
  public String getInstallerPackageNameSync() {
    return implementation.getInstallerPackageNameSync();
  }

  @Override
  public void getInstallerPackageName(Promise p) {
    implementation.getInstallerPackageName(p);
  }

  @Override
  public double getFirstInstallTimeSync() {
    return implementation.getFirstInstallTimeSync();
  }

  @Override
  public void getFirstInstallTime(Promise p) {
    implementation.getFirstInstallTime(p);
  }

  @Override
  public double getLastUpdateTimeSync() {
    return implementation.getLastUpdateTimeSync();
  }

  @Override
  public void getLastUpdateTime(Promise p) {
    implementation.getLastUpdateTime(p);
  }

  @Override
  public String getDeviceNameSync() {
    return implementation.getDeviceNameSync();
  }

  @Override
  public void getDeviceName(Promise p) {
    implementation.getDeviceName(p);
  }

  @SuppressLint({"HardwareIds", "MissingPermission"})
  @Override
  public String getSerialNumberSync() {
    return implementation.getSerialNumberSync();
  }

  @Override
  public void getSerialNumber(Promise p) {
    implementation.getSerialNumber(p);
  }

  @Override
  public String getDeviceSync() {
    return implementation.getDeviceSync();
  }

  @Override
  public void getDevice(Promise p) {
    implementation.getDevice(p);
  }

  @Override
  public String getBuildIdSync() {
    return implementation.getBuildIdSync();
  }

  @Override
  public void getBuildId(Promise p) {
    implementation.getBuildId(p);
  }

  @Override
  public double getApiLevelSync() {
    return (double) implementation.getApiLevelSync();
  }

  @Override
  public void getApiLevel(Promise p) {
    implementation.getApiLevel(p);
  }

  @Override
  public String getBootloaderSync() {
    return implementation.getBootloaderSync();
  }

  @Override
  public void getBootloader(Promise p) {
    implementation.getBootloader(p);
  }

  @Override
  public String getDisplaySync() {
    return implementation.getDisplaySync();
  }

  @Override
  public void getDisplay(Promise p) {
    implementation.getDisplay(p);
  }

  @Override
  public String getFingerprintSync() {
    return implementation.getFingerprintSync();
  }

  @Override
  public void getFingerprint(Promise p) {
    implementation.getFingerprint(p);
  }

  @Override
  public String getHardwareSync() {
    return implementation.getHardwareSync();
  }

  @Override
  public void getHardware(Promise p) {
    implementation.getHardware(p);
  }

  @Override
  public String getHostSync() {
    return implementation.getHostSync();
  }

  @Override
  public void getHost(Promise p) {
    implementation.getHost(p);
  }

  @Override
  public String getProductSync() {
    return implementation.getProductSync();
  }

  @Override
  public void getProduct(Promise p) {
    implementation.getProduct(p);
  }

  @Override
  public String getTagsSync() {
    return implementation.getTagsSync();
  }

  @Override
  public void getTags(Promise p) {
    implementation.getTags(p);
  }

  @Override
  public String getTypeSync() {
    return implementation.getTypeSync();
  }

  @Override
  public void getType(Promise p) {
    implementation.getType(p);
  }

  @Override
  public String getSystemManufacturerSync() {
    return implementation.getSystemManufacturerSync();
  }

  @Override
  public void getSystemManufacturer(Promise p) {
    implementation.getSystemManufacturer(p);
  }

  @Override
  public String getCodenameSync() {
    return implementation.getCodenameSync();
  }

  @Override
  public void getCodename(Promise p) {
    implementation.getCodename(p);
  }

  @Override
  public String getIncrementalSync() {
    return implementation.getIncrementalSync();
  }

  @Override
  public void getIncremental(Promise p) {
    implementation.getIncremental(p);
  }

  @SuppressLint("HardwareIds")
  @Override
  public String getUniqueIdSync() {
    return implementation.getUniqueIdSync();
  }

  @Override
  public void getUniqueId(Promise p) {
    implementation.getUniqueId(p);
  }

  @SuppressLint("HardwareIds")
  @Override
  public String getAndroidIdSync() {
    return implementation.getAndroidIdSync();
  }

  @Override
  public void getAndroidId(Promise p) {
    implementation.getAndroidId(p);
  }

  @Override
  public double getMaxMemorySync() {
    return implementation.getMaxMemorySync();
  }

  @Override
  public void getMaxMemory(Promise p) {
    implementation.getMaxMemory(p);
  }

  @Override
  public double getTotalMemorySync() {
    return implementation.getTotalMemorySync();
  }

  @Override
  public void getTotalMemory(Promise p) {
    implementation.getTotalMemory(p);
  }

  @Override
  @SuppressWarnings({"ConstantConditions", "deprecation"})
  public String getInstanceIdSync() {
    return implementation.getInstanceIdSync();

  }
  @Override
  public void getInstanceId(Promise p) {
    implementation.getInstanceId(p);
  }

  @Override
  public String getBaseOsSync() {
    return implementation.getBaseOsSync();
  }

  @Override
  public void getBaseOs(Promise p) {
    implementation.getBaseOs(p);
  }

  @Override
  public String getPreviewSdkIntSync() {
    return implementation.getPreviewSdkIntSync();
  }

  @Override
  public void getPreviewSdkInt(Promise p) {
    implementation.getPreviewSdkInt(p);
  }

  @Override
  public String getSecurityPatchSync() {
    return implementation.getSecurityPatchSync();
  }

  @Override
  public void getSecurityPatch(Promise p) {
    implementation.getSecurityPatch(p);
  }

  @Override
  public String getUserAgentSync() {
    return implementation.getUserAgentSync();
  }

  @Override
  public void getUserAgent(Promise p) {
    implementation.getUserAgent(p);
  }

  @SuppressLint({"HardwareIds", "MissingPermission"})
  @Override
  public String getPhoneNumberSync() {
    return implementation.getPhoneNumberSync();
  }

  @Override
  public void getPhoneNumber(Promise p) {
    implementation.getPhoneNumber(p);
  }

  @Override
  public WritableArray getSupportedAbisSync() {
   return implementation.getSupportedAbisSync();
  }

  @Override
  public void getSupportedAbis(Promise p) {
    implementation.getSupportedAbis(p);
  }

  @Override
  public WritableArray getSupported32BitAbisSync() {
    return implementation.getSupported32BitAbisSync();
  }

  @Override
  public void getSupported32BitAbis(Promise p) {
    implementation.getSupported32BitAbis(p);
  }

  @Override
  public WritableArray getSupported64BitAbisSync() {
    return implementation.getSupported64BitAbisSync();
  }

  @Override
  public void getSupported64BitAbis(Promise p) {
    implementation.getSupported64BitAbis(p);
  }
}
