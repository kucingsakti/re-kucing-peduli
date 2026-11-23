package p039e0;

import Q9.k;
import p123m8.d;
import p144o8.c;

/* JADX INFO: loaded from: classes.dex */
public final class p extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f10636s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10637t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f10638u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, d dVar) {
        super(dVar);
        this.f10638u = kVar;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f10636s = obj;
        this.f10637t |= Integer.MIN_VALUE;
        return this.f10638u.a(null, this);
    }
}
