package U;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: U.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0411a0 extends p144o8.a implements p200u8.c, p210v8.f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4795t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f4796u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ View f4797v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0411a0(View view, p123m8.d dVar) {
        super(dVar);
        this.f4797v = view;
        if (dVar != null && dVar.getContext() != p123m8.j.f13164s) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
        this.f4794s = 2;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        C0411a0 c0411a0 = new C0411a0(this.f4797v, dVar);
        c0411a0.f4796u = obj;
        return c0411a0;
    }

    @Override // p210v8.f
    public final int getArity() {
        return this.f4794s;
    }

    @Override // p123m8.d
    public final p123m8.i getContext() {
        return p123m8.j.f13164s;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((C0411a0) create((K9.m) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f4795t;
        View view = this.f4797v;
        if (i10 == 0) {
            J7.a.v(obj);
            K9.m mVar = (K9.m) this.f4796u;
            this.f4796u = mVar;
            this.f4795t = 1;
            mVar.f2696t = view;
            mVar.f2695s = 3;
            mVar.f2698v = this;
            return aVar;
        }
        p076h8.m mVar2 = p076h8.m.a;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return mVar2;
        }
        K9.m mVar3 = (K9.m) this.f4796u;
        J7.a.v(obj);
        if (view instanceof ViewGroup) {
            this.f4796u = null;
            this.f4795t = 2;
            mVar3.getClass();
            K9.t tVar = new K9.t(new Z((ViewGroup) view, 0));
            if (tVar.f2708t.hasNext()) {
                mVar3.f2697u = tVar;
                mVar3.f2695s = 2;
                mVar3.f2698v = this;
                obj2 = aVar;
            } else {
                obj2 = mVar2;
            }
            if (obj2 != aVar) {
                obj2 = mVar2;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        }
        return mVar2;
    }

    @Override // p144o8.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strH = p210v8.u.a.h(this);
        p210v8.i.e(strH, "renderLambdaToString(...)");
        return strH;
    }
}
