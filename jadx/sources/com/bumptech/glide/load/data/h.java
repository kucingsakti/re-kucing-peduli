package com.bumptech.glide.load.data;

import H1.w;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final I1.a f7650u = new I1.a(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7651s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f7652t;

    public h() {
        this.f7651s = 0;
        this.f7652t = new HashMap();
    }

    @Override // com.bumptech.glide.load.data.g
    public Object a() {
        switch (this.f7651s) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f7652t).rewind();
            case 2:
                return this.f7652t;
            default:
                w wVar = (w) this.f7652t;
                wVar.reset();
                return wVar;
        }
    }

    @Override // com.bumptech.glide.load.data.g
    public void b() {
        switch (this.f7651s) {
            case 1:
            case 2:
                break;
            default:
                ((w) this.f7652t).b();
                break;
        }
    }

    public ParcelFileDescriptor e() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f7652t).rewind();
    }

    public h(InputStream inputStream, B1.g gVar) {
        this.f7651s = 3;
        w wVar = new w(inputStream, gVar);
        this.f7652t = wVar;
        wVar.mark(5242880);
    }

    public h(ParcelFileDescriptor parcelFileDescriptor) {
        this.f7651s = 1;
        this.f7652t = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public h(Object obj) {
        this.f7651s = 2;
        this.f7652t = obj;
    }

    private final void c() {
    }

    private final void d() {
    }
}
