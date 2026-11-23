package com.bumptech.glide.load.data;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class i extends FilterInputStream {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f7653u = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f7654v = 31;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte f7655s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7656t;

    public i(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 < -1 || i10 > 8) {
            throw new IllegalArgumentException(AbstractC0487g.g(i10, "Cannot add invalid orientation: "));
        }
        this.f7655s = (byte) i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i10;
        int i11;
        int i12 = this.f7656t;
        if (i12 < 2 || i12 > (i11 = f7654v)) {
            i10 = super.read();
        } else {
            i10 = i12 == i11 ? this.f7655s : f7653u[i12 - 2] & 255;
        }
        if (i10 != -1) {
            this.f7656t++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f7656t = (int) (((long) this.f7656t) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f7656t;
        int i14 = f7654v;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f7655s;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int iMin = Math.min(i14 - i13, i11);
            System.arraycopy(f7653u, this.f7656t - 2, bArr, i10, iMin);
            i12 = iMin;
        }
        if (i12 > 0) {
            this.f7656t += i12;
        }
        return i12;
    }
}
