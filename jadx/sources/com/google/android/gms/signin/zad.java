package com.google.android.gms.signin;

import N2.a;
import N2.b;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public final class zad {
    public static final a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Api f9380b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        new Api.ClientKey();
        a aVar = new a();
        a = aVar;
        new b();
        new Scope(1, "profile");
        new Scope(1, "email");
        f9380b = new Api("SignIn.API", aVar, clientKey);
    }
}
