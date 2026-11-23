package p182s4;

import D3.g;
import p081i3.b;
import p082i4.d;
import p123m8.i;
import p134n8.a;
import p144o8.c;
import p197u4.j;

/* JADX INFO: loaded from: classes.dex */
public final class K implements H {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final double f14628f = Math.random();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f14629g = 0;
    public final g a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f14630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f14631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f14632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f14633e;

    public K(g gVar, d dVar, j jVar, b bVar, i iVar) {
        this.a = gVar;
        this.f14630b = dVar;
        this.f14631c = jVar;
        this.f14632d = bVar;
        this.f14633e = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(K k3, c cVar) {
        J j;
        if (cVar instanceof J) {
            j = (J) cVar;
            int i10 = j.f14627v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                j.f14627v = i10 - Integer.MIN_VALUE;
            } else {
                j = new J(k3, cVar);
            }
        } else {
            j = new J(k3, cVar);
        }
        Object obj = j.f14625t;
        a aVar = a.f13404s;
        int i11 = j.f14627v;
        boolean zBooleanValue = true;
        if (i11 == 0) {
            J7.a.v(obj);
            j.f14624s = k3;
            j.f14627v = 1;
            if (k3.f14631c.b(j) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k3 = j.f14624s;
            J7.a.v(obj);
        }
        j jVar = k3.f14631c;
        Boolean boolE = jVar.a.e();
        if (boolE != null) {
            zBooleanValue = boolE.booleanValue();
        } else {
            Boolean boolA = jVar.f15332b.a();
            if (boolA != null) {
                zBooleanValue = boolA.booleanValue();
            }
        }
        if (zBooleanValue) {
            return f14628f <= k3.f14631c.a() ? Boolean.TRUE : Boolean.FALSE;
        }
        return Boolean.FALSE;
    }
}
