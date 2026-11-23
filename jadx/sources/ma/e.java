package ma;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class e extends InputStream {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13187s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f13188t;

    public /* synthetic */ e(h hVar, int i10) {
        this.f13187s = i10;
        this.f13188t = hVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        switch (this.f13187s) {
            case 0:
                return (int) Math.min(((f) this.f13188t).f13190t, Integer.MAX_VALUE);
            default:
                r rVar = (r) this.f13188t;
                if (rVar.f13214u) {
                    throw new IOException("closed");
                }
                return (int) Math.min(rVar.f13213t.f13190t, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f13187s) {
            case 0:
                break;
            default:
                ((r) this.f13188t).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f13187s) {
            case 0:
                f fVar = (f) this.f13188t;
                if (fVar.f13190t > 0) {
                    return fVar.t() & 255;
                }
                return -1;
            default:
                r rVar = (r) this.f13188t;
                if (rVar.f13214u) {
                    throw new IOException("closed");
                }
                f fVar2 = rVar.f13213t;
                if (fVar2.f13190t == 0 && rVar.f13212s.u(fVar2, 8192L) == -1) {
                    return -1;
                }
                return fVar2.t() & 255;
        }
    }

    public final String toString() {
        switch (this.f13187s) {
            case 0:
                return ((f) this.f13188t) + ".inputStream()";
            default:
                return ((r) this.f13188t) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        switch (this.f13187s) {
            case 0:
                p210v8.i.f(bArr, "sink");
                return ((f) this.f13188t).p(bArr, i10, i11);
            default:
                p210v8.i.f(bArr, JsonStorageKeyNames.DATA_KEY);
                r rVar = (r) this.f13188t;
                if (!rVar.f13214u) {
                    o1.f.c(bArr.length, i10, i11);
                    f fVar = rVar.f13213t;
                    if (fVar.f13190t == 0 && rVar.f13212s.u(fVar, 8192L) == -1) {
                        return -1;
                    }
                    return fVar.p(bArr, i10, i11);
                }
                throw new IOException("closed");
        }
    }

    private final void a() {
    }
}
