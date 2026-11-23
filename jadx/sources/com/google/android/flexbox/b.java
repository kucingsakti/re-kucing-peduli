package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        FlexboxLayoutManager.LayoutParams layoutParams = new FlexboxLayoutManager.LayoutParams(-2, -2);
        layoutParams.f7730w = 0.0f;
        layoutParams.f7731x = 1.0f;
        layoutParams.f7732y = -1;
        layoutParams.f7733z = -1.0f;
        layoutParams.f7727C = 16777215;
        layoutParams.f7728D = 16777215;
        layoutParams.f7730w = parcel.readFloat();
        layoutParams.f7731x = parcel.readFloat();
        layoutParams.f7732y = parcel.readInt();
        layoutParams.f7733z = parcel.readFloat();
        layoutParams.f7725A = parcel.readInt();
        layoutParams.f7726B = parcel.readInt();
        layoutParams.f7727C = parcel.readInt();
        layoutParams.f7728D = parcel.readInt();
        layoutParams.f7729E = parcel.readByte() != 0;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
        return layoutParams;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new FlexboxLayoutManager.LayoutParams[i10];
    }
}
