package tk.rabidbeaver.libraries;

import android.util.SparseIntArray;

public class DataMain {
    public static final int ANY_KEY_BOOT_BY_MCU = 0;
    public static final int ANY_KEY_BOOT_BY_UI = 1;
    public static int[] APP_ID_SEQUENCE = new int[20];
    //public static final LimitStack APP_ID_STACK = new LimitStack(20);
    public static int ARM_RESET_MODE = 1;
    public static final int AUTO_BLACK_SCREEN = 0;
    public static final int AUTO_STANDBY = 1;
    public static boolean ArmMuteOpenMusicStream = false;
    public static final int BACKCAR_RADAR_ENABLE_BY_MCU = 0;
    public static final int BACKCAR_RADAR_ENABLE_BY_UI = 1;
    public static final int BACKCAR_TRACK_ENABLE_BY_MCU = 0;
    public static final int BACKCAR_TRACK_ENABLE_BY_UI = 1;
    //public static final ModuleCallbackList CB_LIST = new ModuleCallbackList();
    public static int CUSTOMER_KEY_SERVER = 0;
    public static boolean ECLink_back_channel = false;
    public static final int HANDBRAKE_ENABLE_BY_MCU = 0;
    public static final int HANDBRAKE_ENABLE_BY_UI = 1;
    //public static final ModuleCallbackList[] MCLS = new ModuleCallbackList[120];
    public static int MCU_CUSTOMER_KEY_UI = 1;
    public static final int MCU_ENTER_PLAYPAUSE = 0;
    public static final int MCU_ENTER_TOUI = 1;
    public static final SparseIntArray MCU_ERROR_CODE = new SparseIntArray(64);
    public static final int MCU_ROLL_LEFT_PREV = 0;
    public static final int MCU_ROLL_LEFT_TOUI = 1;
    public static final int MCU_ROLL_RIGHT_NEXT = 0;
    public static final int MCU_ROLL_RIGHT_TOUI = 1;
    public static final int MCU_STATE_FROM_MCU = 0;
    public static final int MCU_STATE_FROM_NONE = 1;
    //public static final LimitStack MCU_STATE_STACK = new LimitStack(20);
    public static final int OSD_TIME_BY_MCU = 0;
    public static final int OSD_TIME_BY_UI = 1;
    public static boolean SLEEP_CONTROL_RELAYS = false;
    public static boolean SLEEP_OUT_BACKCAR = false;
    public static final int STANDBY_BY_MCU = 0;
    public static final int STANDBY_BY_UI = 1;
    public static boolean ScreenPortVolUIShow = false;
    public static final int[] VIDEO_ID_MAP_PORT = new int[10];
    public static int backcarOr360camera;
    public static int go2AppLastDelay = 2000;
    public static boolean ledColorEnable = false;
    public static int mCutAccDelay = 3;
    public static int mVideoOnChannel = -1;
    public static boolean mVideoWaitOpen = false;
    public static boolean needFytSetVideoPosition = false;
    public static int rebootTimes = 50;
    public static int s360BackCarEnable;
    public static int sAccOn;
    public static int sAccOnForUi = 1;
    public static int sAmbientLightColor;
    public static int sAmbientLightOn;
    public static int sAnyKeyBoot;
    public static int sAnyKeyBootDef = 1;
    public static int sAnyKeyBootType = 0;
    public static int sAppId;
    public static int sAppIdForce = -1;
    public static int sAppIdPre;
    public static int sAppIdSequnceIndex;
    public static int sAppIdUIRequest = -1;
    public static boolean sArmMuteAnd3702Mute = true;
    public static boolean sArmMuteAndAmpMute = false;
    public static int sAudioPlayStatus;
    public static int sAutoBlackScreen;
    public static int sAutoBlackScreenDef;
    public static int sAutoBlackScreenRemain;
    public static int sAutoType = 0;
    public static int sAuxEnable = 1;
    public static int sAuxEnableDef = 1;
    public static int sBackcarMirror;
    public static int sBackcarMirrorDef;
    public static int sBackcarRadar;
    public static int sBackcarRadarEnable;
    public static int sBackcarRadarEnableDef = 1;
    public static int sBackcarRadarEnableType = 0;
    public static int sBackcarTrackEnable;
    public static int sBackcarTrackEnableDef = 1;
    public static int sBackcarTrackEnableType = 0;
    public static int sBackcarType;
    public static int sBlackScreen;
    public static int sBrightDayMax = 255;
    public static int sBrightDayMin = 155;
    public static int sBrightLevel;
    public static int sBrightLevelDay;
    public static int sBrightLevelDayDef = 100;
    public static int[] sBrightLevelDayTable = new int[]{40, 65, 90};
    public static int sBrightLevelMax = 100;
    public static int sBrightLevelNight;
    public static int sBrightLevelNightDef = 50;
    public static int[] sBrightLevelNightTable = new int[]{30, 60, 80};
    public static int sBrightLevelStep = 5;
    public static int sBrightNightMax = 255;
    public static int sBrightNightMin = 155;
    public static int sBspAirKey;
    public static boolean sCanbusFrame2Ui = false;
    public static int sCarBackcar;
    //public static ICmdMain sCmd = new Stub();
    public static int sCncAux1;
    public static int sCncAux2;
    public static int sCutAccDelayCloseScreen;
    public static int sCutAccPower;
    public static int sCutAccTurnOffLcdc;
    public static int sCutAccTurnOffLcdcDef;
    public static int sDeviceType;
    //public static IEventHandler sEHAutoBlackScreen;
    //public static IEventHandler sEHBrightLevel;
    public static int sEcarLink = 1;
    public static int sEcarLinkDef = 1;
    public static int sExistSd1OnArm;
    public static int sExistSd2OnArm;
    public static int sExistUsbOnArm;
    public static int sFanCycle;
    public static int sFlashWrite;
    public static String sFolderName;
    public static int sGo2LastTopDenied;
    public static int sGpsAngle;
    public static int sGpsSpeed;
    public static int sHandbrake = 1;
    public static int sHandbrakeEnable;
    public static int sHandbrakeEnableDef = 1;
    public static int sHandbrakeEnableType = 0;
    public static int sHostBackcar;
    public static int sHostbackcarEnable = 1;
    public static String sId3Album;
    public static String sId3Artist;
    public static String sId3Title;
    public static boolean sIsShowVol = true;
    public static boolean sJumpAppByMcuOn;
    public static boolean sJumpAppByPowerOn = true;
    public static boolean sJumpBtByStartActivity = false;
    public static int sLampOnAlawys;
    public static int sLamplet;
    public static int sLampletByTime;
    public static int sLampletCleanOn;
    public static int sLampletColorCtrl;
    public static int sLampletOnBoot;
    public static int sLanguage = 1;
    public static String sLastTopThirdPlayer;
    public static boolean sLastTopThirdPlayerIsMutex;
    public static int sLedColor;
    public static int sMcu0x0AFlag;
    public static boolean sMcuActived = true;
    public static int sMcuAirKey;
    public static int sMcuAirKeyfunction;
    public static int sMcuBootOn;
    public static int sMcuCarUsb;
    public static int sMcuEnter = 0;
    //public static IEventHandler sMcuKeyDown;
    //public static IEventHandler sMcuKeyEnter;
    //public static IEventHandler sMcuKeyLeft;
    //public static IEventHandler sMcuKeyPause;
    //public static IEventHandler sMcuKeyPlay;
    //public static IEventHandler sMcuKeyRight;
    //public static IEventHandler sMcuKeyUp;
    public static int sMcuNeedUpdate;
    public static int sMcuOn;
    public static int sMcuOnForUi = 1;
    public static int sMcuPowerOption;
    public static int sMcuRequestVideoAv1 = -1;
    public static int sMcuRequestVideoAv2 = -1;
    public static int sMcuRequestVideoAv3 = -1;
    public static int sMcuRollLeft = 0;
    public static int sMcuRollRight = 0;
    public static String sMcuSerial;
    public static int sMcuState = 27;
    public static int sMcuStateFrom = 0;
    public static String sMcuVer;
    public static int sMdiaType;
    public static int sMirrorUpDownAv1;
    public static int sMirrorUpDownAv2;
    public static int sMirrorUpDownAv3;
    public static int sModuleId = 0;
    public static boolean sMuteBtMusicStream = false;
    public static int sMuteBtMusicTickByWifi;
    public static int sMuteTickByChangeAppId;
    public static int sMuteTickByChangeAppIdEnable = 1;
    public static int sNaviOnBoot;
    public static int sNaviOnBootDef = 0;
    public static int sNaviOnBootDone;
    public static String sNaviPackage;
    //public static String sNaviPackageDef = FinalChip.BSP_PLATFORM_Null;
    public static int sOnResetState;
    public static int sOsdTime;
    public static int sOsdTimeDef = 1;
    public static int sOsdTimeType = 0;
    public static int sPanelKeyEnable;
    public static int sPanelKeyType;
    public static int sPanelKeyTypeCnt;
    public static int sPanoramaOn;
    public static boolean sPhoneFront = true;
    public static int sPlayStatus;
    public static int sPlayTime;
    public static int sPlayTotalTime;
    public static boolean sPowerOn2TopApp = true;
    public static int sRadar;
    public static int sRadarFl = 10;
    public static int sRadarFml = 10;
    public static int sRadarFmr = 10;
    public static int sRadarFr = 10;
    public static int sRadarLSB = 10;
    public static int sRadarLSF = 10;
    public static int sRadarLSMB = 10;
    public static int sRadarLSMF = 10;
    public static int sRadarParkEnable;
    public static int sRadarRSB = 10;
    public static int sRadarRSF = 10;
    public static int sRadarRSMB = 10;
    public static int sRadarRSMF = 10;
    public static int sRadarRl = 10;
    public static int sRadarRml = 10;
    public static int sRadarRmr = 10;
    public static int sRadarRr = 10;
    public static int sRandomMode;
    public static int sRepeatMode;
    public static int sReserveAction0;
    public static int sReserveAction1;
    public static int sRollKeyEnable;
    public static int sRollKeyType;
    public static int sSignalNtscPal = 0;
    public static int sSignalOn = 0;
    public static int sSleepAirplane;
    public static int sSleepAirplaneDef = 1;
    public static int sSleepWakeup = 1;
    public static String sSpiMcuVer;
    public static String sSpiOsdVer;
    public static int sStandby;
    public static int sStandbyType = 0;
    public static int sStartStopEnable;
    public static int sSteerAngle = -1;
    public static int sTempOut = 1073741824;
    public static String sTopAppWhenMcuOff;
    public static int sTrack;
    public static int sTrackCnt;
    public static int sTrunkState;
    public static int sUsbErrorEnable;
    public static int sUsbErrorEnableDef = 0;
    public static int sVaAudioOccupeid;
    public static int sVaAudioOccupiedTick;
    public static int sVideoHeight;
    public static int sVideoId = 0;
    public static int sVideoIdBeenSet = 0;
    public static int sVideoOffsetX;
    public static int sVideoOffsetY;
    public static int sVideoPlayStatus;
    public static int sVideoPosId;
    public static int sVideoWidth;
    public static boolean sendSpectrumToMcu = false;
    public static boolean testStandby = false;
}
