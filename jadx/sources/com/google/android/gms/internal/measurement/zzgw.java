package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class zzgw {
    public static final p212w.e a = new p212w.e(0);

    public static synchronized Uri a(String str) {
        Uri uri;
        p212w.e eVar = a;
        uri = (Uri) eVar.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            eVar.put(str, uri);
        }
        return uri;
    }
}
