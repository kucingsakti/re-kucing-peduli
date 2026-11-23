package K0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class e implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f2524b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2524b;
    }

    public final void g0(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            parcelObtain.writeStringArray(strArr);
            this.f2524b.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
