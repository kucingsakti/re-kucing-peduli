package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f6576s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f6577t;

    public BackStackState(ArrayList arrayList, ArrayList arrayList2) {
        this.f6576s = arrayList;
        this.f6577t = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f6576s);
        parcel.writeTypedList(this.f6577t);
    }

    public BackStackState(Parcel parcel) {
        this.f6576s = parcel.createStringArrayList();
        this.f6577t = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
