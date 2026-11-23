package com.bumptech.glide.load;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class HttpException extends IOException {
    public HttpException(String str, int i10, IOException iOException) {
        super(str + ", status code: " + i10, iOException);
    }
}
