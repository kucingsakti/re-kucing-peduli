package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class H implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager.SavedState savedState = new StaggeredGridLayoutManager.SavedState();
        savedState.f7039s = parcel.readInt();
        savedState.f7040t = parcel.readInt();
        int i10 = parcel.readInt();
        savedState.f7041u = i10;
        if (i10 > 0) {
            int[] iArr = new int[i10];
            savedState.f7042v = iArr;
            parcel.readIntArray(iArr);
        }
        int i11 = parcel.readInt();
        savedState.f7043w = i11;
        if (i11 > 0) {
            int[] iArr2 = new int[i11];
            savedState.f7044x = iArr2;
            parcel.readIntArray(iArr2);
        }
        savedState.f7046z = parcel.readInt() == 1;
        savedState.f7037A = parcel.readInt() == 1;
        savedState.f7038B = parcel.readInt() == 1;
        savedState.f7045y = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new StaggeredGridLayoutManager.SavedState[i10];
    }
}
