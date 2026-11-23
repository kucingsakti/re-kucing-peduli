package p039e0;

import p144o8.c;

/* JADX INFO: loaded from: classes.dex */
public final class w extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C f10672s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f10673t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C f10674u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10675v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C c10, c cVar) {
        super(cVar);
        this.f10674u = c10;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f10673t = obj;
        this.f10675v |= Integer.MIN_VALUE;
        return this.f10674u.f(this);
    }
}
