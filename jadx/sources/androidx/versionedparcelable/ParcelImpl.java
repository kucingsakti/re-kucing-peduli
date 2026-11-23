package androidx.versionedparcelable;

import T2.b;
import X0.c;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f7183s;

    public ParcelImpl(Parcel parcel) {
        this.f7183s = new X0.b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        new X0.b(parcel).i(this.f7183s);
    }
}
