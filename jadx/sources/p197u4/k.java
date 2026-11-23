package p197u4;

import N9.InterfaceC0341y;
import Q9.b;
import Q9.q;
import java.util.Collections;
import java.util.Map;
import p076h8.m;
import p086i8.y;
import p123m8.d;
import p134n8.a;
import p144o8.g;
import p200u8.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class k extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n f15333s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15334t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n f15335u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, d dVar) {
        super(2, dVar);
        this.f15335u = nVar;
    }

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        return new k(this.f15335u, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((InterfaceC0341y) obj, (d) obj2)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        n nVar;
        a aVar = a.f13404s;
        int i10 = this.f15334t;
        if (i10 == 0) {
            J7.a.v(obj);
            n nVar2 = this.f15335u;
            b data = nVar2.a.getData();
            this.f15333s = nVar2;
            this.f15334t = 1;
            Object objD = q.d(data, this);
            if (objD == aVar) {
                return aVar;
            }
            nVar = nVar2;
            obj = objD;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = this.f15333s;
            J7.a.v(obj);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(((p070h0.b) obj).a);
        i.e(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        n.a(nVar, new p070h0.b(y.C(mapUnmodifiableMap), true));
        return m.a;
    }
}
