package com.bumptech.glide.load.data;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class l implements f {
    public final B1.g a;

    public l(B1.g gVar) {
        this.a = gVar;
    }

    @Override // com.bumptech.glide.load.data.f
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.f
    public final g b(Object obj) {
        return new h((InputStream) obj, this.a);
    }
}
