package p197u4;

import p144o8.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f15302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public V9.a f15303t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f15304u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f15305v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15306w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, c cVar) {
        super(cVar);
        this.f15305v = dVar;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f15304u = obj;
        this.f15306w |= Integer.MIN_VALUE;
        return this.f15305v.d(this);
    }
}
