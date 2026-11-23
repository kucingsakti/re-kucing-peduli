package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new F();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7033s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7034t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f7035u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7036v;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f7033s + ", mGapDir=" + this.f7034t + ", mHasUnwantedGapAfter=" + this.f7036v + ", mGapPerSpan=" + Arrays.toString(this.f7035u) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7033s);
        parcel.writeInt(this.f7034t);
        parcel.writeInt(this.f7036v ? 1 : 0);
        int[] iArr = this.f7035u;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f7035u);
        }
    }
}
