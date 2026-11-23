package p039e0;

import Q3.u0;
import java.io.Serializable;
import java.util.Iterator;
import p144o8.c;

/* JADX INFO: renamed from: e0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0606c extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Serializable f10612s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Iterator f10613t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f10614u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10615v;

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f10614u = obj;
        this.f10615v |= Integer.MIN_VALUE;
        return u0.a(null, null, this);
    }
}
