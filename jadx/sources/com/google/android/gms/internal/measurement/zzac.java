package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzac {
    public zzad a = new zzad("", 0, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzad f8451b = new zzad("", 0, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f8452c = new ArrayList();

    public final Object clone() {
        zzad zzadVar = (zzad) this.a.clone();
        zzac zzacVar = new zzac();
        zzacVar.a = zzadVar;
        zzacVar.f8451b = (zzad) zzadVar.clone();
        zzacVar.f8452c = new ArrayList();
        Iterator it = this.f8452c.iterator();
        while (it.hasNext()) {
            zzacVar.f8452c.add((zzad) ((zzad) it.next()).clone());
        }
        return zzacVar;
    }
}
