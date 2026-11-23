package p035d5;

import p210v8.e;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private final String payload;
    private final Integer retryAfterSeconds;
    private final Integer retryLimit;
    private final int statusCode;
    private final Throwable throwable;

    public a(int i10, String str, Throwable th, Integer num, Integer num2) {
        this.statusCode = i10;
        this.payload = str;
        this.throwable = th;
        this.retryAfterSeconds = num;
        this.retryLimit = num2;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    public final Integer getRetryLimit() {
        return this.retryLimit;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final boolean isSuccess() {
        int i10 = this.statusCode;
        return i10 == 200 || i10 == 202 || i10 == 304 || i10 == 201;
    }

    public /* synthetic */ a(int i10, String str, Throwable th, Integer num, Integer num2, int i11, e eVar) {
        this(i10, str, (i11 & 4) != 0 ? null : th, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : num2);
    }
}
