package p182s4;

import p144o8.c;

/* JADX INFO: renamed from: s4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0779p extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f14705s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f14706t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ X f14707u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14708v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0779p(X x8, c cVar) {
        super(cVar);
        this.f14707u = x8;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f14706t = obj;
        this.f14708v |= Integer.MIN_VALUE;
        return this.f14707u.a(null, this);
    }
}
