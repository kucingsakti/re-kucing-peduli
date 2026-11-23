package com.smarteist.autoimageslider.IndicatorView.draw.data;

import T2.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class PositionSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<PositionSavedState> CREATOR = new b(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10312s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10313t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10314u;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f10312s);
        parcel.writeInt(this.f10313t);
        parcel.writeInt(this.f10314u);
    }
}
