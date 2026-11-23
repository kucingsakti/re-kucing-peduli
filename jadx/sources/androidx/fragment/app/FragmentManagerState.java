package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a(3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f6585s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f6586t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public BackStackRecordState[] f6587u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6588v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f6589w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f6590x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f6591y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList f6592z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f6585s);
        parcel.writeStringList(this.f6586t);
        parcel.writeTypedArray(this.f6587u, i10);
        parcel.writeInt(this.f6588v);
        parcel.writeString(this.f6589w);
        parcel.writeStringList(this.f6590x);
        parcel.writeTypedList(this.f6591y);
        parcel.writeTypedList(this.f6592z);
    }
}
