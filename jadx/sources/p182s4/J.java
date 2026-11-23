package p182s4;

import p144o8.c;

/* JADX INFO: loaded from: classes.dex */
public final class J extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public K f14624s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f14625t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ K f14626u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14627v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k3, c cVar) {
        super(cVar);
        this.f14626u = k3;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f14625t = obj;
        this.f14627v |= Integer.MIN_VALUE;
        return K.a(this.f14626u, this);
    }
}
