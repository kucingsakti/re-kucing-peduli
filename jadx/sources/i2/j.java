package i2;

import java.io.Closeable;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Closeable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Provider f12183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public V.h f12184t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Provider f12185u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p090j2.e f12186v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Provider f12187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Provider f12188x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Provider f12189y;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((p148p2.g) ((p148p2.d) this.f12188x.get())).close();
    }
}
