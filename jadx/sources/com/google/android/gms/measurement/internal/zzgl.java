package com.google.android.gms.measurement.internal;

import M2.C0313w;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class zzgl {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0313w f9075e;

    public zzgl(C0313w c0313w, long j) {
        this.f9075e = c0313w;
        Preconditions.e("health_monitor");
        Preconditions.b(j > 0);
        this.a = "health_monitor:start";
        this.f9072b = "health_monitor:count";
        this.f9073c = "health_monitor:value";
        this.f9074d = j;
    }

    public final void a() {
        C0313w c0313w = this.f9075e;
        c0313w.W0();
        ((zzhj) c0313w.f577s).f9120F.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = c0313w.f1().edit();
        editorEdit.remove(this.f9072b);
        editorEdit.remove(this.f9073c);
        editorEdit.putLong(this.a, jCurrentTimeMillis);
        editorEdit.apply();
    }
}
