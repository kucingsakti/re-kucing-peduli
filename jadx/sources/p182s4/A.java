package p182s4;

import Q9.h;
import p123m8.d;
import p144o8.c;

/* JADX INFO: loaded from: classes.dex */
public final class A extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f14597s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14598t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h f14599u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(h hVar, d dVar) {
        super(dVar);
        this.f14599u = hVar;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f14597s = obj;
        this.f14598t |= Integer.MIN_VALUE;
        return this.f14599u.a(null, this);
    }
}
