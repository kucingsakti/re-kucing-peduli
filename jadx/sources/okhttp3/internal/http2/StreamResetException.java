package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
import p048ea.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class StreamResetException extends IOException {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f13841s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(a aVar) {
        super(i.k(aVar, "stream was reset: "));
        i.f(aVar, "errorCode");
        this.f13841s = aVar;
    }
}
