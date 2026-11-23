package com.google.android.gms.measurement.internal;

import M2.C0313w;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class zzgk {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0313w f9071e;

    public zzgk(C0313w c0313w, String str, boolean z6) {
        this.f9071e = c0313w;
        Preconditions.e(str);
        this.a = str;
        this.f9068b = z6;
    }

    public final void a(boolean z6) {
        SharedPreferences.Editor editorEdit = this.f9071e.f1().edit();
        editorEdit.putBoolean(this.a, z6);
        editorEdit.apply();
        this.f9070d = z6;
    }

    public final boolean b() {
        if (!this.f9069c) {
            this.f9069c = true;
            this.f9070d = this.f9071e.f1().getBoolean(this.a, this.f9068b);
        }
        return this.f9070d;
    }
}
