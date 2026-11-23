package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new zae();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f8193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Long f8194u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Long f8195v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f8196w;

    @Retention(RetentionPolicy.CLASS)
    public @interface InstallState {
    }

    public static class ProgressInfo {
    }

    public ModuleInstallStatusUpdate(int i10, int i11, Long l4, Long l10, int i12) {
        this.f8192s = i10;
        this.f8193t = i11;
        this.f8194u = l4;
        this.f8195v = l10;
        this.f8196w = i12;
        if (l4 != null && l10 != null && l10.longValue() != 0 && l10.longValue() == 0) {
            throw new IllegalArgumentException("Given Long is zero");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8192s);
        SafeParcelWriter.k(parcel, 2, 4);
        parcel.writeInt(this.f8193t);
        SafeParcelWriter.c(parcel, 3, this.f8194u);
        SafeParcelWriter.c(parcel, 4, this.f8195v);
        SafeParcelWriter.k(parcel, 5, 4);
        parcel.writeInt(this.f8196w);
        SafeParcelWriter.j(parcel, i11);
    }
}
