package p039e0;

import N9.C0330m;
import p144o8.c;

/* JADX INFO: loaded from: classes.dex */
public final class r extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f10642s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C f10643t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0330m f10644u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f10645v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C f10646w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10647x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C c10, c cVar) {
        super(cVar);
        this.f10646w = c10;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f10645v = obj;
        this.f10647x |= Integer.MIN_VALUE;
        return C.b(this.f10646w, null, this);
    }
}
