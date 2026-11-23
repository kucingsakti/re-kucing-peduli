package p039e0;

import p144o8.c;

/* JADX INFO: loaded from: classes.dex */
public final class t extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f10657s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f10658t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f10659u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p210v8.t f10660v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C f10661w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f10662x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u f10663y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10664z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, c cVar) {
        super(cVar);
        this.f10663y = uVar;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f10662x = obj;
        this.f10664z |= Integer.MIN_VALUE;
        return this.f10663y.a(null, this);
    }
}
