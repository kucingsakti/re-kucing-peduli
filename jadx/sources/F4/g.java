package F4;

import N9.InterfaceC0341y;
import com.kcstream.cing.activity.drawer.NewReleaseActivity;
import p076h8.m;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ NewReleaseActivity f1502t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(NewReleaseActivity newReleaseActivity, p123m8.d dVar) {
        super(2, dVar);
        this.f1502t = newReleaseActivity;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new g(this.f1502t, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1501s;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return obj;
        }
        J7.a.v(obj);
        this.f1501s = 1;
        int i11 = NewReleaseActivity.f10239X;
        Object objD = this.f1502t.x().d(this);
        return objD == aVar ? aVar : objD;
    }
}
