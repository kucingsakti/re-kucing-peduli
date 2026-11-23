package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class zzix {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile zzix f8673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzix f8674c = new zzix(0);
    public final Map a;

    public zzix() {
        this.a = new HashMap();
    }

    public final zzjk.zzf a(zzkt zzktVar, int i10) {
        return (zzjk.zzf) this.a.get(new C0573h0(zzktVar, i10));
    }

    public zzix(int i10) {
        this.a = Collections.EMPTY_MAP;
    }
}
