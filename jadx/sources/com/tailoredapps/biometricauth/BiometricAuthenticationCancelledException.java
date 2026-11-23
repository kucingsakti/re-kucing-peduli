package com.tailoredapps.biometricauth;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tailoredapps/biometricauth/BiometricAuthenticationCancelledException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "biometricauth-rxjava2_release"}, k = 1, mv = {1, 4, 2})
public final class BiometricAuthenticationCancelledException extends RuntimeException {
    public BiometricAuthenticationCancelledException() {
        super("The Authentication has been cancelled");
    }
}
