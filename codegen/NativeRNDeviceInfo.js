// @flow
import type { TurboModule } from 'react-native/Libraries/TurboModule/RCTExport';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
      +getConstants: () => {|
            deviceId: ?string,
            bundleId: ? string,
            systemName: ? string,
            systemVersion: ? string,
            appVersion: ? string,
            buildNumber: ? string,
            isTablet: ? boolean,
            appName: ? string,
            brand: ? string,
            model: ? string,
            deviceType: ? string,
      |};
      
      +addListener: (eventName: string) => void;
      +removeListeners: (count: number) => void;
      +isEmulator: () => Promise<boolean>;
      +isEmulatorSync: () => boolean;
      +getFontScaleSync: () => number;
      +getFontScale: () => Promise<number>;
      +isPinOrFingerprintSetSync: () => boolean;
      +isPinOrFingerprintSet: () => Promise<boolean>;
      +getIpAddressSync: () => string;
      +getIpAddress: () => Promise<string>;
      +isCameraPresentSync: () => boolean;
      +isCameraPresent: () => Promise<boolean>;
      +getMacAddressSync: () => string;
      +getMacAddress: () => Promise<string>;
      +getCarrierSync: () => string;
      +getCarrier: () => Promise<string>;
      +getTotalDiskCapacitySync: () => number;
      +getTotalDiskCapacity: () => Promise<number>;
      +getFreeDiskStorageSync: () => number;
      +getFreeDiskStorage: () => Promise<number>;
      +getTotalDiskCapacityOldSync: () => number;
      +getTotalDiskCapacityOld: () => Promise<number>;
      +getFreeDiskStorageOldSync: () => number;
      +getFreeDiskStorageOld: () => Promise<number>;
      +isBatteryChargingSync: () => boolean;
      +isBatteryCharging: () => Promise<boolean>;
      +getUsedMemorySync: () => number;
      +getUsedMemory: () => Promise<number>;
      +getPowerStateSync: () => Object;
      +getPowerState: () => Promise<Object>;
      +getBatteryLevelSync: () => number;
      +getBatteryLevel: () => Promise<number>;
      +isAirplaneModeSync: () => boolean;
      +isAirplaneMode: () => Promise<boolean>;
      +hasGmsSync: () => boolean;
      +hasGms: () => Promise<boolean>;
      +hasHmsSync: () => boolean;
      +hasHms: () => Promise<boolean>;
      +hasSystemFeatureSync: (feature: string) => boolean;
      +hasSystemFeature: (feature: string) => Promise<boolean>;
      +getSystemAvailableFeaturesSync: () => Array<Object>;
      +getSystemAvailableFeatures: () => Promise<Array<Object>>;
      +isLocationEnabledSync: () => boolean;
      +isLocationEnabled: () => Promise<boolean>;
      +isHeadphonesConnectedSync: () => boolean;
      +isHeadphonesConnected: () => Promise<boolean>;
      +getAvailableLocationProvidersSync: () => Object;
      +getAvailableLocationProviders: () => Promise<Object>;
      +getInstallReferrerSync: () => string;
      +getInstallReferrer: () => Promise<string>;
      +getInstallerPackageNameSync: () => string;
      +getInstallerPackageName: () => Promise<string>;
      +getFirstInstallTimeSync: () => number;
      +getFirstInstallTime: () => Promise<number>;
      +getLastUpdateTimeSync: () => number;
      +getLastUpdateTime: () => Promise<number>;
      +getDeviceNameSync: () => string;
      +getDeviceName: () => Promise<string>;
      +getSerialNumberSync: () => string;
      +getSerialNumber: () => Promise<string>;
      +getDeviceSync: () => string;
      +getDevice: () => Promise<string>;
      +getBuildIdSync: () => string;
      +getBuildId: () => Promise<string>;
      +getApiLevelSync: () => number;
      +getApiLevel: () => Promise<number>;
      +getBootloaderSync: () => string;
      +getBootloader: () => Promise<string>;
      +getDisplaySync: () => string;
      +getDisplay: () => Promise<string>;
      +getFingerprintSync: () => string;
      +getFingerprint: () => Promise<string>;
      +getHardwareSync: () => string;
      +getHardware: () => Promise<string>;
      +getHostSync: () => string;
      +getHost: () => Promise<string>;
      +getProductSync: () => string;
      +getProduct: () => Promise<string>;
      +getTagsSync: () => string;
      +getTags: () => Promise<string>;
      +getTypeSync: () => string;
      +getType: () => Promise<string>;
      +getSystemManufacturerSync: () => string;
      +getSystemManufacturer: () => Promise<string>;
      +getCodenameSync: () => string;
      +getCodename: () => Promise<string>;
      +getIncrementalSync: () => string;
      +getIncremental: () => Promise<string>;
      +getUniqueIdSync: () => string;
      +getUniqueId: () => Promise<string>;
      +getAndroidIdSync: () => string;
      +getAndroidId: () => Promise<string>;
      +getMaxMemorySync: () => number;
      +getMaxMemory: () => Promise<number>;
      +getTotalMemorySync: () => number;
      +getTotalMemory: () => Promise<number>;
      +getInstanceIdSync: () => string;
      +getInstanceId: () => Promise<string>;
      +getBaseOsSync: () => string;
      +getBaseOs: () => Promise<string>;
      +getPreviewSdkIntSync: () => string;
      +getPreviewSdkInt: () => Promise<string>;
      +getSecurityPatchSync: () => string;
      +getSecurityPatch: () => Promise<string>;
      +getUserAgentSync: () => string;
      +getUserAgent: () => Promise<string>;
      +getPhoneNumberSync: () => string;
      +getPhoneNumber: () => Promise<string>;
      +getSupportedAbisSync: () => Array<Object>;
      +getSupportedAbis: () => Promise<Array<Object>>;
      +getSupported32BitAbisSync: () => Array<Object>;
      +getSupported32BitAbis: () => Promise<Array<Object>>;
      +getSupported64BitAbisSync: () => Array<Object>;
      +getSupported64BitAbis: () => Promise<Array<Object>>;
}

export default (TurboModuleRegistry.get<Spec> (
      'RNDeviceInfoModule'
): ?Spec);