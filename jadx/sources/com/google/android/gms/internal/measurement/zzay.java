package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzay {
    public final ArrayList a = new ArrayList();

    public abstract zzaq a(String str, zzh zzhVar, ArrayList arrayList);

    public final void b(String str) {
        if (!this.a.contains(zzg.b(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException(E0.a.h("Command not implemented: ", str));
    }
}
