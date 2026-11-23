package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new zza();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7874s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f7875t;

    public Scope(int i10, String str) {
        Preconditions.f(str, "scopeUri must not be null or empty");
        this.f7874s = i10;
        this.f7875t = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f7875t.equals(((Scope) obj).f7875t);
    }

    public final int hashCode() {
        return this.f7875t.hashCode();
    }

    public final String toString() {
        return this.f7875t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f7874s);
        SafeParcelWriter.e(parcel, 2, this.f7875t);
        SafeParcelWriter.j(parcel, i11);
    }
}
