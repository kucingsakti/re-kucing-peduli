package ma;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes.dex */
public interface v extends Closeable, Flushable {
    void C(f fVar, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    y e();

    void flush();
}
