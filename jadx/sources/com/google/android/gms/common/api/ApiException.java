package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class ApiException extends Exception {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Status f7849s;

    /* JADX WARN: Illegal instructions before constructor call */
    public ApiException(Status status) {
        int i10 = status.f7880s;
        String str = status.f7881t;
        super(i10 + ": " + (str == null ? "" : str));
        this.f7849s = status;
    }
}
