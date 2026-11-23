package T2;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.navigation.NavBackStackEntryState;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.material.badge.BadgeState$State;
import com.google.firebase.messaging.RemoteMessage;
import com.smarteist.autoimageslider.IndicatorView.draw.data.PositionSavedState;
import java.util.Locale;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                BadgeState$State badgeState$State = new BadgeState$State();
                badgeState$State.f9443A = 255;
                badgeState$State.f9445C = -2;
                badgeState$State.f9446D = -2;
                badgeState$State.f9447E = -2;
                badgeState$State.f9454L = Boolean.TRUE;
                badgeState$State.f9464s = parcel.readInt();
                badgeState$State.f9465t = (Integer) parcel.readSerializable();
                badgeState$State.f9466u = (Integer) parcel.readSerializable();
                badgeState$State.f9467v = (Integer) parcel.readSerializable();
                badgeState$State.f9468w = (Integer) parcel.readSerializable();
                badgeState$State.f9469x = (Integer) parcel.readSerializable();
                badgeState$State.f9470y = (Integer) parcel.readSerializable();
                badgeState$State.f9471z = (Integer) parcel.readSerializable();
                badgeState$State.f9443A = parcel.readInt();
                badgeState$State.f9444B = parcel.readString();
                badgeState$State.f9445C = parcel.readInt();
                badgeState$State.f9446D = parcel.readInt();
                badgeState$State.f9447E = parcel.readInt();
                badgeState$State.f9449G = parcel.readString();
                badgeState$State.f9450H = parcel.readString();
                badgeState$State.f9451I = parcel.readInt();
                badgeState$State.f9453K = (Integer) parcel.readSerializable();
                badgeState$State.f9455M = (Integer) parcel.readSerializable();
                badgeState$State.f9456N = (Integer) parcel.readSerializable();
                badgeState$State.f9457O = (Integer) parcel.readSerializable();
                badgeState$State.P = (Integer) parcel.readSerializable();
                badgeState$State.f9458Q = (Integer) parcel.readSerializable();
                badgeState$State.f9459R = (Integer) parcel.readSerializable();
                badgeState$State.f9462U = (Integer) parcel.readSerializable();
                badgeState$State.f9460S = (Integer) parcel.readSerializable();
                badgeState$State.f9461T = (Integer) parcel.readSerializable();
                badgeState$State.f9454L = (Boolean) parcel.readSerializable();
                badgeState$State.f9448F = (Locale) parcel.readSerializable();
                badgeState$State.f9463V = (Boolean) parcel.readSerializable();
                return badgeState$State;
            case 1:
                PositionSavedState positionSavedState = new PositionSavedState(parcel);
                positionSavedState.f10312s = parcel.readInt();
                positionSavedState.f10313t = parcel.readInt();
                positionSavedState.f10314u = parcel.readInt();
                return positionSavedState;
            case 2:
                return new ParcelImpl(parcel);
            case 3:
                return new ActivityResult(parcel);
            case 4:
                i.f(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                i.c(parcelable);
                return new IntentSenderRequest((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 5:
                int iR = SafeParcelReader.r(parcel);
                Bundle bundleB = null;
                while (parcel.dataPosition() < iR) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 2) {
                        SafeParcelReader.q(parcel, i10);
                    } else {
                        bundleB = SafeParcelReader.b(parcel, i10);
                    }
                }
                SafeParcelReader.j(parcel, iR);
                return new RemoteMessage(bundleB);
            case 6:
                return new zzd(parcel.readStrongBinder());
            case 7:
                i.f(parcel, "inParcel");
                return new NavBackStackEntryState(parcel);
            default:
                return new BinderWrapper(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new BadgeState$State[i10];
            case 1:
                return new PositionSavedState[i10];
            case 2:
                return new ParcelImpl[i10];
            case 3:
                return new ActivityResult[i10];
            case 4:
                return new IntentSenderRequest[i10];
            case 5:
                return new RemoteMessage[i10];
            case 6:
                return new zzd[i10];
            case 7:
                return new NavBackStackEntryState[i10];
            default:
                return new BinderWrapper[i10];
        }
    }
}
