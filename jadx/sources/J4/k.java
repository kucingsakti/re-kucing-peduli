package J4;

import N9.InterfaceC0341y;
import com.kcstream.cing.fragment.TabsIndexFragment;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2422s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TabsIndexFragment f2423t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TabsIndexFragment tabsIndexFragment, p123m8.d dVar) {
        super(2, dVar);
        this.f2423t = tabsIndexFragment;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new k(this.f2423t, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f2422s;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return obj;
        }
        J7.a.v(obj);
        TabsIndexFragment tabsIndexFragment = this.f2423t;
        String str = tabsIndexFragment.f10259z0;
        String str2 = tabsIndexFragment.f10258y0;
        this.f2422s = 1;
        H4.a aVar2 = tabsIndexFragment.f2596t0;
        if (aVar2 != null) {
            Object objJ = aVar2.j(str, str2, 1, this);
            return objJ == aVar ? aVar : objJ;
        }
        p210v8.i.n("service");
        throw null;
    }
}
