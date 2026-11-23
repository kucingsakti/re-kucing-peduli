package com.google.android.gms.common.api;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public class CommonStatusCodes {
    @KeepForSdk
    public CommonStatusCodes() {
    }

    public static String a(int i10) {
        switch (i10) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            default:
                return AbstractC0487g.g(i10, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return "ERROR";
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case MobileAdsBridge.CODE_21 /* 21 */:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}
