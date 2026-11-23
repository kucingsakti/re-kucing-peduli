package com.google.android.gms.measurement.internal;

import M2.C0313w;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class zzgn {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0313w f9082d;

    public zzgn(C0313w c0313w, String str) {
        this.f9082d = c0313w;
        Preconditions.e(str);
        this.a = str;
    }

    public final String a() {
        if (!this.f9080b) {
            this.f9080b = true;
            this.f9081c = this.f9082d.f1().getString(this.a, null);
        }
        return this.f9081c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f9082d.f1().edit();
        editorEdit.putString(this.a, str);
        editorEdit.apply();
        this.f9081c = str;
    }
}
