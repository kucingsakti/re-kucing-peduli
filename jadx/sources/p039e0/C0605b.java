package p039e0;

import Q3.u0;
import java.util.List;
import p076h8.m;
import p123m8.d;
import p134n8.a;
import p144o8.g;
import p200u8.c;

/* JADX INFO: renamed from: e0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0605b extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f10610t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f10611u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0605b(List list, d dVar) {
        super(2, dVar);
        this.f10611u = list;
    }

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        C0605b c0605b = new C0605b(this.f10611u, dVar);
        c0605b.f10610t = obj;
        return c0605b;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((C0605b) create((u) obj, (d) obj2)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f13404s;
        int i10 = this.f10609s;
        if (i10 == 0) {
            J7.a.v(obj);
            u uVar = (u) this.f10610t;
            this.f10609s = 1;
            if (u0.a(this.f10611u, uVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
        }
        return m.a;
    }
}
