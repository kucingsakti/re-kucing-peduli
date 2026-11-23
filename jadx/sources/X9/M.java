package X9;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class M extends Reader {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ma.h f5539s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Charset f5540t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5541u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InputStreamReader f5542v;

    public M(ma.h hVar, Charset charset) {
        p210v8.i.f(hVar, "source");
        p210v8.i.f(charset, "charset");
        this.f5539s = hVar;
        this.f5540t = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        p076h8.m mVar;
        this.f5541u = true;
        InputStreamReader inputStreamReader = this.f5542v;
        if (inputStreamReader == null) {
            mVar = null;
        } else {
            inputStreamReader.close();
            mVar = p076h8.m.a;
        }
        if (mVar == null) {
            this.f5539s.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i10, int i11) throws IOException {
        p210v8.i.f(cArr, "cbuf");
        if (this.f5541u) {
            throw new IOException("Stream closed");
        }
        InputStreamReader inputStreamReader = this.f5542v;
        if (inputStreamReader == null) {
            ma.h hVar = this.f5539s;
            inputStreamReader = new InputStreamReader(hVar.V(), Y9.c.s(hVar, this.f5540t));
            this.f5542v = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i10, i11);
    }
}
