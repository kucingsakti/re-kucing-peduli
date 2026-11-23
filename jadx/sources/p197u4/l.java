package p197u4;

import p144o8.c;

/* JADX INFO: loaded from: classes.dex */
public final class l extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f15336s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f15337t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15338u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, c cVar) {
        super(cVar);
        this.f15337t = nVar;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f15336s = obj;
        this.f15338u |= Integer.MIN_VALUE;
        return this.f15337t.c(null, null, this);
    }
}
