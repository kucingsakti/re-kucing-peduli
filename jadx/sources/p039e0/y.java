package p039e0;

import p144o8.c;

/* JADX INFO: loaded from: classes.dex */
public final class y extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f10681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f10682t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f10683u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C f10684v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10685w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C c10, c cVar) {
        super(cVar);
        this.f10684v = c10;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f10683u = obj;
        this.f10685w |= Integer.MIN_VALUE;
        return this.f10684v.h(this);
    }
}
