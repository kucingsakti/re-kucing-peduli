package com.tonyodev.fetch2.exception;

import kotlin.Metadata;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/tonyodev/fetch2/exception/FetchException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "fetch2_release"}, k = 1, mv = {1, 4, 0})
public class FetchException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchException(String str) {
        super(str);
        i.g(str, "message");
    }
}
