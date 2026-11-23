package Q9;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p039e0.C0604a;
import p039e0.D;
import p039e0.E;
import p182s4.C0777n;

/* JADX INFO: loaded from: classes.dex */
public final class k implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4375s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4376t;

    public /* synthetic */ k(Object obj, int i10) {
        this.f4375s = i10;
        this.f4376t = obj;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // Q9.c
    public final Object a(Object obj, p123m8.d dVar) throws Throwable {
        p039e0.p pVar;
        switch (this.f4375s) {
            case 0:
                ((p210v8.t) this.f4376t).f15466s = obj;
                throw new AbortFlowException(this);
            case 1:
                if (dVar instanceof p039e0.p) {
                    pVar = (p039e0.p) dVar;
                    int i10 = pVar.f10637t;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        pVar.f10637t = i10 - Integer.MIN_VALUE;
                    } else {
                        pVar = new p039e0.p(this, dVar);
                    }
                } else {
                    pVar = new p039e0.p(this, dVar);
                }
                Object obj2 = pVar.f10636s;
                p134n8.a aVar = p134n8.a.f13404s;
                int i11 = pVar.f10637t;
                if (i11 == 0) {
                    J7.a.v(obj2);
                    D d3 = (D) obj;
                    if (d3 instanceof p039e0.h) {
                        throw ((p039e0.h) d3).a;
                    }
                    if (d3 instanceof p039e0.g) {
                        throw ((p039e0.g) d3).a;
                    }
                    if (!(d3 instanceof C0604a)) {
                        if (d3 instanceof E) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj3 = ((C0604a) d3).a;
                    pVar.f10637t = 1;
                    if (((c) this.f4376t).a(obj3, pVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    J7.a.v(obj2);
                }
                return p076h8.m.a;
            default:
                ((p182s4.D) this.f4376t).f14608c.set((C0777n) obj);
                return p076h8.m.a;
        }
    }
}
