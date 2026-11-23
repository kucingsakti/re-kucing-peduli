package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FileOutputStream f7646s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte[] f7647t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final B1.g f7648u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7649v;

    public c(FileOutputStream fileOutputStream, B1.g gVar) {
        this.f7646s = fileOutputStream;
        this.f7648u = gVar;
        this.f7647t = (byte[]) gVar.d(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f7646s;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f7647t;
            if (bArr != null) {
                this.f7648u.h(bArr);
                this.f7647t = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i10 = this.f7649v;
        FileOutputStream fileOutputStream = this.f7646s;
        if (i10 > 0) {
            fileOutputStream.write(this.f7647t, 0, i10);
            this.f7649v = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        byte[] bArr = this.f7647t;
        int i11 = this.f7649v;
        int i12 = i11 + 1;
        this.f7649v = i12;
        bArr[i11] = (byte) i10;
        if (i12 != bArr.length || i12 <= 0) {
            return;
        }
        this.f7646s.write(bArr, 0, i12);
        this.f7649v = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f7649v;
            FileOutputStream fileOutputStream = this.f7646s;
            if (i15 == 0 && i13 >= this.f7647t.length) {
                fileOutputStream.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f7647t.length - i15);
            System.arraycopy(bArr, i14, this.f7647t, this.f7649v, iMin);
            int i16 = this.f7649v + iMin;
            this.f7649v = i16;
            i12 += iMin;
            byte[] bArr2 = this.f7647t;
            if (i16 == bArr2.length && i16 > 0) {
                fileOutputStream.write(bArr2, 0, i16);
                this.f7649v = 0;
            }
        } while (i12 < i11);
    }
}
