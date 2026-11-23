package E4;

import N9.InterfaceC0341y;
import com.kcstream.cing.activity.ItemActivity;

/* JADX INFO: renamed from: E4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0202p extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ItemActivity f1430t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1431u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0202p(ItemActivity itemActivity, int i10, p123m8.d dVar) {
        super(2, dVar);
        this.f1430t = itemActivity;
        this.f1431u = i10;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new C0202p(this.f1430t, this.f1431u, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((C0202p) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1429s;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return obj;
        }
        J7.a.v(obj);
        this.f1429s = 1;
        int i11 = ItemActivity.f10182n0;
        Object objK = this.f1430t.x().k(this.f1431u, this);
        return objK == aVar ? aVar : objK;
    }
}
