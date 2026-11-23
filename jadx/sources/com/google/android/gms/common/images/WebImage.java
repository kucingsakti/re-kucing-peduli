package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new zah();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8040s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Uri f8041t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f8042u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8043v;

    public WebImage(int i10, Uri uri, int i11, int i12) {
        this.f8040s = i10;
        this.f8041t = uri;
        this.f8042u = i11;
        this.f8043v = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (Objects.a(this.f8041t, webImage.f8041t) && this.f8042u == webImage.f8042u && this.f8043v == webImage.f8043v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8041t, Integer.valueOf(this.f8042u), Integer.valueOf(this.f8043v)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "Image " + this.f8042u + "x" + this.f8043v + " " + this.f8041t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8040s);
        SafeParcelWriter.d(parcel, 2, this.f8041t, i10);
        SafeParcelWriter.k(parcel, 3, 4);
        parcel.writeInt(this.f8042u);
        SafeParcelWriter.k(parcel, 4, 4);
        parcel.writeInt(this.f8043v);
        SafeParcelWriter.j(parcel, i11);
    }
}
