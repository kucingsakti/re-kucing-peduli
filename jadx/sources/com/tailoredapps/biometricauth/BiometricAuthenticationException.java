package com.tailoredapps.biometricauth;

import kotlin.Metadata;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/tailoredapps/biometricauth/BiometricAuthenticationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "biometricauth-rxjava2_release"}, k = 1, mv = {1, 4, 2})
public final class BiometricAuthenticationException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricAuthenticationException(CharSequence charSequence) {
        super(charSequence.toString());
        i.f(charSequence, "errorString");
    }
}
