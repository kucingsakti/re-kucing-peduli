package com.google.android.material.badge;

import T2.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class BadgeState$State implements Parcelable {
    public static final Parcelable.Creator<BadgeState$State> CREATOR = new b(0);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f9444B;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Locale f9448F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f9449G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CharSequence f9450H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f9451I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f9452J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Integer f9453K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Integer f9455M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Integer f9456N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Integer f9457O;
    public Integer P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Integer f9458Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Integer f9459R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Integer f9460S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Integer f9461T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Integer f9462U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Boolean f9463V;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9464s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Integer f9465t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Integer f9466u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f9467v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f9468w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f9469x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Integer f9470y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Integer f9471z;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f9443A = 255;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f9445C = -2;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f9446D = -2;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f9447E = -2;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Boolean f9454L = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f9464s);
        parcel.writeSerializable(this.f9465t);
        parcel.writeSerializable(this.f9466u);
        parcel.writeSerializable(this.f9467v);
        parcel.writeSerializable(this.f9468w);
        parcel.writeSerializable(this.f9469x);
        parcel.writeSerializable(this.f9470y);
        parcel.writeSerializable(this.f9471z);
        parcel.writeInt(this.f9443A);
        parcel.writeString(this.f9444B);
        parcel.writeInt(this.f9445C);
        parcel.writeInt(this.f9446D);
        parcel.writeInt(this.f9447E);
        String str = this.f9449G;
        parcel.writeString(str != null ? str.toString() : null);
        CharSequence charSequence = this.f9450H;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        parcel.writeInt(this.f9451I);
        parcel.writeSerializable(this.f9453K);
        parcel.writeSerializable(this.f9455M);
        parcel.writeSerializable(this.f9456N);
        parcel.writeSerializable(this.f9457O);
        parcel.writeSerializable(this.P);
        parcel.writeSerializable(this.f9458Q);
        parcel.writeSerializable(this.f9459R);
        parcel.writeSerializable(this.f9462U);
        parcel.writeSerializable(this.f9460S);
        parcel.writeSerializable(this.f9461T);
        parcel.writeSerializable(this.f9454L);
        parcel.writeSerializable(this.f9448F);
        parcel.writeSerializable(this.f9463V);
    }
}
