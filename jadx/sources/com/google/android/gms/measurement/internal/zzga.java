package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class zzga {
    public String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f9064d;

    public static zzga b(zzbd zzbdVar) {
        String str = zzbdVar.f8923s;
        Bundle bundleT = zzbdVar.f8924t.T();
        zzga zzgaVar = new zzga();
        zzgaVar.a = str;
        zzgaVar.f9062b = zzbdVar.f8925u;
        zzgaVar.f9064d = bundleT;
        zzgaVar.f9063c = zzbdVar.f8926v;
        return zzgaVar;
    }

    public final zzbd a() {
        return new zzbd(this.a, new zzbc(new Bundle(this.f9064d)), this.f9062b, this.f9063c);
    }

    public final String toString() {
        return "origin=" + this.f9062b + ",name=" + this.a + ",params=" + String.valueOf(this.f9064d);
    }
}
