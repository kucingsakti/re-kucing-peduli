package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
class FragmentManager$LaunchedFragmentInfo implements Parcelable {
    public static final Parcelable.Creator<FragmentManager$LaunchedFragmentInfo> CREATOR = new a(2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f6583s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6584t;

    public FragmentManager$LaunchedFragmentInfo(String str, int i10) {
        this.f6583s = str;
        this.f6584t = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6583s);
        parcel.writeInt(this.f6584t);
    }
}
