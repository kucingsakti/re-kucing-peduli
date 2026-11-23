package p039e0;

import p076h8.m;
import p123m8.d;
import p134n8.a;
import p144o8.g;
import p200u8.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class n extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10631s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f10632t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C f10633u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C c10, d dVar) {
        super(2, dVar);
        this.f10633u = c10;
    }

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        n nVar = new n(this.f10633u, dVar);
        nVar.f10632t = obj;
        return nVar;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((l) obj, (d) obj2)).invokeSuspend(m.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078 A[RETURN] */
    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        Object objF;
        a aVar = a.f13404s;
        int i10 = this.f10631s;
        m mVar = m.a;
        if (i10 != 0) {
            if (i10 == 1) {
                J7.a.v(obj);
                return mVar;
            }
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return mVar;
        }
        J7.a.v(obj);
        l lVar = (l) this.f10632t;
        boolean z6 = lVar instanceof j;
        C c10 = this.f10633u;
        if (!z6) {
            if (lVar instanceof k) {
                this.f10631s = 2;
                if (C.b(c10, (k) lVar, this) == aVar) {
                    return aVar;
                }
            }
            return mVar;
        }
        j jVar = (j) lVar;
        this.f10631s = 1;
        D d3 = (D) c10.f10605f.f();
        if (d3 instanceof C0604a) {
            objF = mVar;
        } else if (!(d3 instanceof h)) {
            if (i.a(d3, E.a)) {
                objF = c10.f(this);
                if (objF != aVar) {
                }
            } else if (d3 instanceof g) {
                throw new IllegalStateException("Can't read in final state.");
            }
            objF = mVar;
        } else if (d3 != jVar.a || (objF = c10.f(this)) != aVar) {
            objF = mVar;
        }
        if (objF == aVar) {
            return aVar;
        }
        return mVar;
    }
}
