package com.bumptech.glide;

import U1.n;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class k implements N1.b {
    public final p195u1.b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f7628b;

    public k(l lVar, p195u1.b bVar) {
        this.f7628b = lVar;
        this.a = bVar;
    }

    @Override // N1.b
    public final void a(boolean z6) {
        if (z6) {
            synchronized (this.f7628b) {
                p195u1.b bVar = this.a;
                for (Q1.c cVar : n.e((Set) bVar.f15290u)) {
                    if (!cVar.k() && !cVar.g()) {
                        cVar.clear();
                        if (bVar.f15289t) {
                            ((HashSet) bVar.f15291v).add(cVar);
                        } else {
                            cVar.i();
                        }
                    }
                }
            }
        }
    }
}
