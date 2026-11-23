package p197u4;

import p144o8.c;

/* JADX INFO: loaded from: classes.dex */
public final class i extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j f15326s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f15327t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f15328u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15329v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, c cVar) {
        super(cVar);
        this.f15328u = jVar;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f15327t = obj;
        this.f15329v |= Integer.MIN_VALUE;
        return this.f15328u.b(this);
    }
}
