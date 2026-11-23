package p070h0;

import java.util.Collections;
import java.util.Map;
import p076h8.m;
import p086i8.y;
import p123m8.d;
import p134n8.a;
import p200u8.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p144o8.g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11639s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f11640t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p144o8.g f11641u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(c cVar, d dVar) {
        super(2, dVar);
        this.f11641u = (p144o8.g) cVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o8.g, u8.c] */
    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        g gVar = new g(this.f11641u, dVar);
        gVar.f11640t = obj;
        return gVar;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((b) obj, (d) obj2)).invokeSuspend(m.a);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [o8.g, u8.c] */
    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f13404s;
        int i10 = this.f11639s;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f11640t;
            J7.a.v(obj);
            return bVar;
        }
        J7.a.v(obj);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(((b) this.f11640t).a);
        i.e(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        b bVar2 = new b(y.C(mapUnmodifiableMap), false);
        this.f11640t = bVar2;
        this.f11639s = 1;
        return this.f11641u.invoke(bVar2, this) == aVar ? aVar : bVar2;
    }
}
