package androidx.viewpager2.widget;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new ViewPager2.SavedState(parcel, null);
        }
        ViewPager2.SavedState savedState = new ViewPager2.SavedState(parcel);
        savedState.f7204s = parcel.readInt();
        savedState.f7205t = parcel.readInt();
        savedState.f7206u = parcel.readParcelable(null);
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new ViewPager2.SavedState[i10];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new ViewPager2.SavedState(parcel, classLoader);
        }
        ViewPager2.SavedState savedState = new ViewPager2.SavedState(parcel);
        savedState.f7204s = parcel.readInt();
        savedState.f7205t = parcel.readInt();
        savedState.f7206u = parcel.readParcelable(null);
        return savedState;
    }
}
