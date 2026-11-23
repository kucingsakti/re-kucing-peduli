package com.google.android.gms.measurement.internal;

import M2.C0313w;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class zzgm {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0313w f9079e;

    public zzgm(C0313w c0313w, String str, long j) {
        this.f9079e = c0313w;
        Preconditions.e(str);
        this.a = str;
        this.f9076b = j;
    }

    public final long a() {
        if (!this.f9077c) {
            this.f9077c = true;
            this.f9078d = this.f9079e.f1().getLong(this.a, this.f9076b);
        }
        return this.f9078d;
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.f9079e.f1().edit();
        editorEdit.putLong(this.a, j);
        editorEdit.apply();
        this.f9078d = j;
    }
}
