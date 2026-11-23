package p039e0;

import java.io.Serializable;
import java.util.Iterator;
import p144o8.c;

/* JADX INFO: loaded from: classes.dex */
public final class s extends c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10648A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C f10649s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f10650t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Serializable f10651u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f10652v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public u f10653w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f10654x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f10655y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C f10656z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C c10, c cVar) {
        super(cVar);
        this.f10656z = c10;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f10655y = obj;
        this.f10648A |= Integer.MIN_VALUE;
        return this.f10656z.d(this);
    }
}
