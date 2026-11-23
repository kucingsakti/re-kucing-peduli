package A6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p076h8.f;
import p086i8.i;
import p086i8.y;
import p086i8.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Set a = i.K(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission.SYSTEM_ALERT_WINDOW", "android.permission.WRITE_SETTINGS", "android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.REQUEST_INSTALL_PACKAGES", "android.permission.POST_NOTIFICATIONS", "android.permission.BODY_SENSORS_BACKGROUND"});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f319b = null;

    static {
        Map mapW = y.w(new f("android.permission.READ_CALENDAR", "android.permission-group.CALENDAR"), new f("android.permission.WRITE_CALENDAR", "android.permission-group.CALENDAR"), new f("android.permission.READ_CALL_LOG", "android.permission-group.CALL_LOG"), new f("android.permission.WRITE_CALL_LOG", "android.permission-group.CALL_LOG"), new f("android.permission.PROCESS_OUTGOING_CALLS", "android.permission-group.CALL_LOG"), new f("android.permission.CAMERA", "android.permission-group.CAMERA"), new f("android.permission.READ_CONTACTS", "android.permission-group.CONTACTS"), new f("android.permission.WRITE_CONTACTS", "android.permission-group.CONTACTS"), new f("android.permission.GET_ACCOUNTS", "android.permission-group.CONTACTS"), new f("android.permission.ACCESS_FINE_LOCATION", "android.permission-group.LOCATION"), new f("android.permission.ACCESS_COARSE_LOCATION", "android.permission-group.LOCATION"), new f("android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission-group.LOCATION"), new f("android.permission.RECORD_AUDIO", "android.permission-group.MICROPHONE"), new f("android.permission.READ_PHONE_STATE", "android.permission-group.PHONE"), new f("android.permission.READ_PHONE_NUMBERS", "android.permission-group.PHONE"), new f("android.permission.CALL_PHONE", "android.permission-group.PHONE"), new f("android.permission.ANSWER_PHONE_CALLS", "android.permission-group.PHONE"), new f("com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission-group.PHONE"), new f("android.permission.USE_SIP", "android.permission-group.PHONE"), new f("android.permission.ACCEPT_HANDOVER", "android.permission-group.PHONE"), new f("android.permission.BODY_SENSORS", "android.permission-group.SENSORS"), new f("android.permission.ACTIVITY_RECOGNITION", "android.permission-group.ACTIVITY_RECOGNITION"), new f("android.permission.SEND_SMS", "android.permission-group.SMS"), new f("android.permission.RECEIVE_SMS", "android.permission-group.SMS"), new f("android.permission.READ_SMS", "android.permission-group.SMS"), new f("android.permission.RECEIVE_WAP_PUSH", "android.permission-group.SMS"), new f("android.permission.RECEIVE_MMS", "android.permission-group.SMS"), new f("android.permission.READ_EXTERNAL_STORAGE", "android.permission-group.STORAGE"), new f("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission-group.STORAGE"), new f("android.permission.ACCESS_MEDIA_LOCATION", "android.permission-group.STORAGE"));
        LinkedHashMap linkedHashMapC = y.C(z.t(new f("android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission-group.STORAGE")));
        linkedHashMapC.putAll(mapW);
        Map mapA = y.A(linkedHashMapC);
        LinkedHashMap linkedHashMapC2 = y.C(y.w(new f("android.permission.BLUETOOTH_SCAN", "android.permission-group.NEARBY_DEVICES"), new f("android.permission.BLUETOOTH_ADVERTISE", "android.permission-group.NEARBY_DEVICES"), new f("android.permission.BLUETOOTH_CONNECT", "android.permission-group.NEARBY_DEVICES")));
        linkedHashMapC2.putAll(mapA);
        Map mapA2 = y.A(linkedHashMapC2);
        LinkedHashMap linkedHashMapC3 = y.C(y.w(new f("android.permission.READ_MEDIA_IMAGES", "android.permission-group.READ_MEDIA_VISUAL"), new f("android.permission.READ_MEDIA_VIDEO", "android.permission-group.READ_MEDIA_VISUAL"), new f("android.permission.READ_MEDIA_AUDIO", "android.permission-group.READ_MEDIA_AURAL"), new f("android.permission.POST_NOTIFICATIONS", "android.permission-group.NOTIFICATIONS"), new f("android.permission.NEARBY_WIFI_DEVICES", "android.permission-group.NEARBY_DEVICES"), new f("android.permission.BODY_SENSORS_BACKGROUND", "android.permission-group.SENSORS")));
        linkedHashMapC3.putAll(mapA2);
        y.A(linkedHashMapC3);
    }
}
