package com.onesignal.common.exceptions;

import kotlin.Metadata;
import p210v8.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/onesignal/common/exceptions/BackendException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "statusCode", "", "response", "", "retryAfterSeconds", "(ILjava/lang/String;Ljava/lang/Integer;)V", "getResponse", "()Ljava/lang/String;", "getRetryAfterSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatusCode", "()I", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BackendException extends Exception {
    private final String response;
    private final Integer retryAfterSeconds;
    private final int statusCode;

    public /* synthetic */ BackendException(int i10, String str, Integer num, int i11, e eVar) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : num);
    }

    public final String getResponse() {
        return this.response;
    }

    public final Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public BackendException(int i10, String str, Integer num) {
        this.statusCode = i10;
        this.response = str;
        this.retryAfterSeconds = num;
    }
}
