package X9;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class O implements Closeable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public M f5547s;

    public abstract long a();

    public abstract A b();

    public abstract ma.h c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Y9.c.d(c());
    }
}
