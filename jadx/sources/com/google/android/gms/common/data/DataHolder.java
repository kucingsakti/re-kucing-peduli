package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@KeepName
@SafeParcelable.Class
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8032s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String[] f8033t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Bundle f8034u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CursorWindow[] f8035v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f8036w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Bundle f8037x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f8038y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8039z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f8031A = true;

    @KeepForSdk
    public static class Builder {
    }

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f8032s = i10;
        this.f8033t = strArr;
        this.f8035v = cursorWindowArr;
        this.f8036w = i11;
        this.f8037x = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                if (!this.f8039z) {
                    this.f8039z = true;
                    int i10 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f8035v;
                        if (i10 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i10].close();
                        i10++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        boolean z6;
        try {
            if (this.f8031A && this.f8035v.length > 0) {
                synchronized (this) {
                    z6 = this.f8039z;
                }
                if (!z6) {
                    close();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        String[] strArr = this.f8033t;
        if (strArr != null) {
            int i12 = SafeParcelWriter.i(parcel, 1);
            parcel.writeStringArray(strArr);
            SafeParcelWriter.j(parcel, i12);
        }
        SafeParcelWriter.g(parcel, 2, this.f8035v, i10);
        SafeParcelWriter.k(parcel, 3, 4);
        parcel.writeInt(this.f8036w);
        SafeParcelWriter.a(parcel, 4, this.f8037x);
        SafeParcelWriter.k(parcel, 1000, 4);
        parcel.writeInt(this.f8032s);
        SafeParcelWriter.j(parcel, i11);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}
