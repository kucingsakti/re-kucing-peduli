package U1;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class k extends FilterInputStream {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4877s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4878t;

    public k(e eVar) {
        super(eVar);
        this.f4878t = Integer.MIN_VALUE;
    }

    private final synchronized void b(int i10) {
        super.mark(i10);
        this.f4878t = i10;
    }

    private final synchronized void c() {
        super.reset();
        this.f4878t = Integer.MIN_VALUE;
    }

    public long a(long j) {
        int i10 = this.f4878t;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j <= ((long) i10)) ? j : i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.f4877s) {
            case 0:
                int i10 = this.f4878t;
                return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
            default:
                return Math.min(super.available(), this.f4878t);
        }
    }

    public void g(long j) {
        int i10 = this.f4878t;
        if (i10 == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f4878t = (int) (((long) i10) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        switch (this.f4877s) {
            case 0:
                b(i10);
                break;
            default:
                super.mark(i10);
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f4877s) {
            case 0:
                if (a(1L) == -1) {
                    return -1;
                }
                int i10 = super.read();
                g(1L);
                return i10;
            default:
                if (this.f4878t <= 0) {
                    return -1;
                }
                int i11 = super.read();
                if (i11 < 0) {
                    return i11;
                }
                this.f4878t--;
                return i11;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f4877s) {
            case 0:
                c();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        switch (this.f4877s) {
            case 0:
                long jA = a(j);
                if (jA == -1) {
                    return 0L;
                }
                long jSkip = super.skip(jA);
                g(jSkip);
                return jSkip;
            default:
                long jSkip2 = super.skip(Math.min(j, this.f4878t));
                if (jSkip2 >= 0) {
                    this.f4878t = (int) (((long) this.f4878t) - jSkip2);
                }
                return jSkip2;
        }
    }

    public k(ByteArrayInputStream byteArrayInputStream, int i10) {
        super(byteArrayInputStream);
        this.f4878t = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        switch (this.f4877s) {
            case 0:
                int iA = (int) a(i11);
                if (iA == -1) {
                    return -1;
                }
                int i12 = super.read(bArr, i10, iA);
                g(i12);
                return i12;
            default:
                int i13 = this.f4878t;
                if (i13 <= 0) {
                    return -1;
                }
                int i14 = super.read(bArr, i10, Math.min(i11, i13));
                if (i14 < 0) {
                    return i14;
                }
                this.f4878t -= i14;
                return i14;
        }
    }
}
