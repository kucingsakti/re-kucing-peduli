package com.bumptech.glide.load;

import p232y1.c;

/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(0),
    JPEG(1),
    RAW(2),
    PNG_A(3),
    PNG(4),
    WEBP_A(5),
    WEBP(6),
    ANIMATED_WEBP(7),
    AVIF(8),
    UNKNOWN(9);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f7640s;

    ImageHeaderParser$ImageType(int i10) {
        this.f7640s = z;
    }

    public boolean hasAlpha() {
        return this.f7640s;
    }

    public boolean isWebp() {
        int i10 = c.a[ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3;
    }
}
