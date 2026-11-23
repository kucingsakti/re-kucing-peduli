package E1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: E1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0182d implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f1303t;

    public /* synthetic */ C0182d(Object obj, int i10) {
        this.f1302s = i10;
        this.f1303t = obj;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f1302s) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f1303t.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        int i10 = this.f1302s;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        switch (this.f1302s) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i10 = this.f1302s;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        switch (this.f1302s) {
            case 0:
                try {
                    dVar.g(U1.b.a((File) this.f1303t));
                } catch (IOException e10) {
                    Log.isLoggable("ByteBufferFileLoader", 3);
                    dVar.f(e10);
                    return;
                }
                break;
            default:
                dVar.g(this.f1303t);
                break;
        }
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
