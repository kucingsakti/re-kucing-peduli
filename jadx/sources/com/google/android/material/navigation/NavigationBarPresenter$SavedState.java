package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: loaded from: classes.dex */
class NavigationBarPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator<NavigationBarPresenter$SavedState> CREATOR = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ParcelableSparseArray f9751t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f9750s);
        parcel.writeParcelable(this.f9751t, 0);
    }
}
