package ma;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public interface h extends w, ReadableByteChannel {
    long D(f fVar);

    String U(Charset charset);

    InputStream V();

    f d();

    boolean f(long j);

    int x(p pVar);
}
