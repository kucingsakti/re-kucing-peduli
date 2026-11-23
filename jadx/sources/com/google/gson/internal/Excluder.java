package com.google.gson.internal;

import com.google.gson.u;
import com.google.gson.v;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Excluder implements v, Cloneable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Excluder f10013u = new Excluder();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f10014s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f10015t;

    public Excluder() {
        List list = Collections.EMPTY_LIST;
        this.f10014s = list;
        this.f10015t = list;
    }

    public static boolean d(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    @Override // com.google.gson.v
    public final u a(final com.google.gson.i iVar, final p243z4.a aVar) {
        final boolean z6;
        final boolean z10;
        boolean zD = d(aVar.a);
        if (zD) {
            z6 = true;
        } else {
            c(true);
            z6 = false;
        }
        if (zD) {
            z10 = true;
        } else {
            c(false);
            z10 = false;
        }
        if (z6 || z10) {
            return new u() { // from class: com.google.gson.internal.Excluder.1
                public u a;

                @Override // com.google.gson.u
                public final Object b(A4.a aVar2) throws IOException {
                    if (z10) {
                        aVar2.d0();
                        return null;
                    }
                    u uVarD = this.a;
                    if (uVarD == null) {
                        uVarD = iVar.d(Excluder.this, aVar);
                        this.a = uVarD;
                    }
                    return uVarD.b(aVar2);
                }

                @Override // com.google.gson.u
                public final void c(A4.b bVar, Object obj) throws IOException {
                    if (z6) {
                        bVar.n();
                        return;
                    }
                    u uVarD = this.a;
                    if (uVarD == null) {
                        uVarD = iVar.d(Excluder.this, aVar);
                        this.a = uVarD;
                    }
                    uVarD.c(bVar, obj);
                }
            };
        }
        return null;
    }

    public final void c(boolean z6) {
        Iterator it = (z6 ? this.f10014s : this.f10015t).iterator();
        if (it.hasNext()) {
            throw E0.a.e(it);
        }
    }

    public final Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }
}
