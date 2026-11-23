package retrofit2;

import java.util.Objects;
import ya.L;

/* JADX INFO: loaded from: classes.dex */
public class HttpException extends RuntimeException {
    public HttpException(L l4) {
        Objects.requireNonNull(l4, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        X9.L l10 = l4.a;
        sb.append(l10.f5534v);
        sb.append(" ");
        sb.append(l10.f5533u);
        super(sb.toString());
    }
}
