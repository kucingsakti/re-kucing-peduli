package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractSet {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10110s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f10111t;

    public /* synthetic */ i(k kVar, int i10) {
        this.f10110s = i10;
        this.f10111t = kVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f10110s) {
            case 0:
                this.f10111t.clear();
                break;
            default:
                this.f10111t.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        j jVarA;
        switch (this.f10110s) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                k kVar = this.f10111t;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                j jVar = null;
                if (key != null) {
                    try {
                        jVarA = kVar.a(key, false);
                    } catch (ClassCastException unused) {
                        jVarA = null;
                    }
                    break;
                } else {
                    jVarA = null;
                }
                if (jVarA != null && Objects.equals(jVarA.f10120z, entry.getValue())) {
                    jVar = jVarA;
                }
                return jVar != null;
            default:
                return this.f10111t.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f10110s) {
            case 0:
                return new h(this.f10111t, 0);
            default:
                return new h(this.f10111t, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        j jVarA;
        switch (this.f10110s) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                k kVar = this.f10111t;
                Object key = entry.getKey();
                j jVar = null;
                if (key != null) {
                    try {
                        jVarA = kVar.a(key, false);
                    } catch (ClassCastException unused) {
                        jVarA = null;
                    }
                    break;
                } else {
                    jVarA = null;
                }
                if (jVarA != null && Objects.equals(jVarA.f10120z, entry.getValue())) {
                    jVar = jVarA;
                }
                if (jVar == null) {
                    return false;
                }
                kVar.c(jVar, true);
                return true;
            default:
                k kVar2 = this.f10111t;
                j jVarA2 = null;
                if (obj != null) {
                    try {
                        jVarA2 = kVar2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (jVarA2 != null) {
                    kVar2.c(jVarA2, true);
                }
                return jVarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f10110s) {
            case 0:
                break;
        }
        return this.f10111t.f10125v;
    }
}
