package p039e0;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import ma.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class m extends OutputStream {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10629s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f10630t;

    public m(f fVar) {
        this.f10630t = fVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.f10629s;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f10629s) {
            case 0:
                ((FileOutputStream) this.f10630t).flush();
                break;
        }
    }

    public String toString() {
        switch (this.f10629s) {
            case 1:
                return ((f) this.f10630t) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        switch (this.f10629s) {
            case 0:
                ((FileOutputStream) this.f10630t).write(i10);
                break;
            default:
                ((f) this.f10630t).d0(i10);
                break;
        }
    }

    public m(FileOutputStream fileOutputStream) {
        this.f10630t = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        switch (this.f10629s) {
            case 0:
                i.f(bArr, "bytes");
                ((FileOutputStream) this.f10630t).write(bArr, i10, i11);
                break;
            default:
                i.f(bArr, JsonStorageKeyNames.DATA_KEY);
                ((f) this.f10630t).b0(bArr, i10, i11);
                break;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        switch (this.f10629s) {
            case 0:
                i.f(bArr, "b");
                ((FileOutputStream) this.f10630t).write(bArr);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
