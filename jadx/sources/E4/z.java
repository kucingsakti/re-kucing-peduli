package E4;

import N9.InterfaceC0341y;
import com.kcstream.cing.activity.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class z extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1449s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1450t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(MainActivity mainActivity, p123m8.d dVar) {
        super(2, dVar);
        this.f1450t = mainActivity;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new z(this.f1450t, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1449s;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return obj;
        }
        J7.a.v(obj);
        this.f1449s = 1;
        int i11 = MainActivity.c0;
        Object objH = this.f1450t.x().h(this);
        return objH == aVar ? aVar : objH;
    }
}
