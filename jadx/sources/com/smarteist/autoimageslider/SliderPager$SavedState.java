package com.smarteist.autoimageslider;

import E0.a;
import N6.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
public class SliderPager$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SliderPager$SavedState> CREATOR = new k(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10315u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Parcelable f10316v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ClassLoader f10317w;

    public SliderPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.f10315u = parcel.readInt();
        this.f10316v = parcel.readParcelable(classLoader);
        this.f10317w = classLoader;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return a.j(sb, this.f10315u, "}");
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f10315u);
        parcel.writeParcelable(this.f10316v, i10);
    }
}
