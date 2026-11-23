package com.ferfalk.simplesearchview;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        SimpleSearchView.SavedState savedState = new SimpleSearchView.SavedState(parcel);
        savedState.f7694s = parcel.readString();
        savedState.f7695t = parcel.readInt() == 1;
        savedState.f7696u = parcel.readInt();
        savedState.f7697v = parcel.readString();
        savedState.f7698w = parcel.readInt() == 1;
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new SimpleSearchView.SavedState[i10];
    }
}
