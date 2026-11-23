package p039e0;

import p144o8.c;

/* JADX INFO: loaded from: classes.dex */
public final class z extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C f10686s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f10687t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f10688u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f10689v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C f10690w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10691x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C c10, c cVar) {
        super(cVar);
        this.f10690w = c10;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f10689v = obj;
        this.f10691x |= Integer.MIN_VALUE;
        return this.f10690w.i(null, null, this);
    }
}
