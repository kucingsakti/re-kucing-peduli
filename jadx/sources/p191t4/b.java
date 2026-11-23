package p191t4;

import V9.a;
import java.util.Iterator;
import java.util.Map;
import p144o8.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f15212A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map f15213s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Iterator f15214t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d f15215u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f15216v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Map f15217w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f15218x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f15219y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c f15220z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, c cVar2) {
        super(cVar2);
        this.f15220z = cVar;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f15219y = obj;
        this.f15212A |= Integer.MIN_VALUE;
        return this.f15220z.b(this);
    }
}
