package p182s4;

import N9.InterfaceC0341y;
import android.content.Context;
import android.util.Log;
import java.io.IOException;
import p039e0.f;
import p076h8.m;
import p123m8.d;
import p134n8.a;
import p144o8.g;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
public final class C extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14602s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D f14603t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f14604u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d3, String str, d dVar) {
        super(2, dVar);
        this.f14603t = d3;
        this.f14604u = str;
    }

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        return new C(this.f14603t, this.f14604u, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((InterfaceC0341y) obj, (d) obj2)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f13404s;
        int i10 = this.f14602s;
        try {
            if (i10 == 0) {
                J7.a.v(obj);
                C0786x c0786x = D.f14605e;
                Context context = this.f14603t.a;
                c0786x.getClass();
                f fVar = (f) D.f14606f.a(C0786x.a[0], context);
                B b3 = new B(this.f14604u, null);
                this.f14602s = 1;
                if (fVar.a(new p070h0.g(b3, null), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
        } catch (IOException e10) {
            Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e10);
        }
        return m.a;
    }
}
