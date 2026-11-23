package com.google.android.gms.common;

import E0.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.Arrays;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class ConnectionResult extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7821s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7822t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final PendingIntent f7823u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f7824v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ConnectionResult f7820w = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zzb();

    public ConnectionResult(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f7821s = i10;
        this.f7822t = i11;
        this.f7823u = pendingIntent;
        this.f7824v = str;
    }

    public static String W(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
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
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        return "CANCELED";
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case MobileAdsBridge.CODE_21 /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return a.g("UNKNOWN_ERROR_CODE(", i10, ")");
                }
        }
    }

    public final boolean K() {
        return (this.f7822t == 0 || this.f7823u == null) ? false : true;
    }

    public final boolean T() {
        return this.f7822t == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f7822t == connectionResult.f7822t && Objects.a(this.f7823u, connectionResult.f7823u) && Objects.a(this.f7824v, connectionResult.f7824v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7822t), this.f7823u, this.f7824v});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(W(this.f7822t), "statusCode");
        toStringHelper.a(this.f7823u, "resolution");
        toStringHelper.a(this.f7824v, "message");
        return toStringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f7821s);
        SafeParcelWriter.k(parcel, 2, 4);
        parcel.writeInt(this.f7822t);
        SafeParcelWriter.d(parcel, 3, this.f7823u, i10);
        SafeParcelWriter.e(parcel, 4, this.f7824v);
        SafeParcelWriter.j(parcel, i11);
    }

    public ConnectionResult(int i10) {
        this(1, i10, null, null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}
