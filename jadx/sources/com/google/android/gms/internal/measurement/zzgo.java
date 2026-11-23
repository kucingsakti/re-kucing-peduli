package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class zzgo implements zzgt {
    public final p212w.i a;

    public zzgo(p212w.i iVar) {
        this.a = iVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzgt
    public final String a(Uri uri, String str, String str2) {
        p212w.i iVar;
        if (uri != null) {
            iVar = (p212w.i) this.a.get(uri.toString());
        } else {
            iVar = null;
        }
        if (iVar == null) {
            return null;
        }
        if (str != null) {
            str2 = p231y.a.c(str, str2);
        }
        return (String) iVar.get(str2);
    }
}
