package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0591q0 implements Map.Entry {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map.Entry f8406s;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8406s.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzjx) this.f8406s.getValue()) == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzkt)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        zzjx zzjxVar = (zzjx) this.f8406s.getValue();
        zzkt zzktVar = zzjxVar.a;
        zzjxVar.f8695b = null;
        zzjxVar.a = (zzkt) obj;
        return zzktVar;
    }
}
