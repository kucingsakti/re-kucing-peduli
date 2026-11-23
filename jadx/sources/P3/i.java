package P3;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class i extends InputStream {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3880s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3881t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f3882u;

    public i(k kVar, h hVar) {
        this.f3882u = kVar;
        this.f3880s = kVar.t(hVar.a + 4);
        this.f3881t = hVar.f3879b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f3881t;
        if (i12 <= 0) {
            return -1;
        }
        if (i11 > i12) {
            i11 = i12;
        }
        int i13 = this.f3880s;
        k kVar = this.f3882u;
        kVar.n(i13, i10, i11, bArr);
        this.f3880s = kVar.t(this.f3880s + i11);
        this.f3881t -= i11;
        return i11;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f3881t == 0) {
            return -1;
        }
        k kVar = this.f3882u;
        kVar.f3884s.seek(this.f3880s);
        int i10 = kVar.f3884s.read();
        this.f3880s = kVar.t(this.f3880s + 1);
        this.f3881t--;
        return i10;
    }
}
