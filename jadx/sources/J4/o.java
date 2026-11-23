package J4;

import C8.u;
import N9.InterfaceC0341y;
import com.kcstream.cing.fragment.TabsRecentFragment;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2432s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TabsRecentFragment f2433t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(TabsRecentFragment tabsRecentFragment, p123m8.d dVar) {
        super(2, dVar);
        this.f2433t = tabsRecentFragment;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new o(this.f2433t, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f2432s;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return obj;
        }
        J7.a.v(obj);
        this.f2432s = 1;
        u[] uVarArr = TabsRecentFragment.f10260y0;
        H4.a aVar2 = this.f2433t.f2596t0;
        if (aVar2 != null) {
            Object objI = aVar2.i(this);
            return objI == aVar ? aVar : objI;
        }
        p210v8.i.n("service");
        throw null;
    }
}
