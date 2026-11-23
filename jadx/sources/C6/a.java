package C6;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static a f946t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public G6.a f947s;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        G6.a aVar = this.f947s;
        if (aVar != null) {
            try {
                aVar.f1701b.f1919i.close(false);
                this.f947s = null;
            } catch (Exception e10) {
                throw new IOException(e10);
            }
        }
    }
}
