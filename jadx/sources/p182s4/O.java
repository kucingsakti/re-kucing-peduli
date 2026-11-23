package p182s4;

import N9.InterfaceC0341y;
import O3.j;
import O3.k;
import android.util.Log;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import p076h8.m;
import p123m8.d;
import p134n8.a;
import p144o8.g;
import p191t4.e;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
public final class O extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14645s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f14646t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(String str, d dVar) {
        super(2, dVar);
        this.f14646t = str;
    }

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        return new O(this.f14646t, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((InterfaceC0341y) obj, (d) obj2)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f13404s;
        int i10 = this.f14645s;
        if (i10 == 0) {
            J7.a.v(obj);
            p191t4.c cVar = p191t4.c.a;
            this.f14645s = 1;
            obj = cVar.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
        }
        Collection<k> collectionValues = ((Map) obj).values();
        String str = this.f14646t;
        for (k kVar : collectionValues) {
            e eVar = new e(str);
            kVar.getClass();
            Objects.toString(eVar);
            Log.isLoggable("FirebaseCrashlytics", 3);
            j jVar = kVar.f3531b;
            synchronized (jVar) {
                if (!Objects.equals(jVar.f3530c, str)) {
                    j.a(jVar.a, jVar.f3529b, str);
                    jVar.f3530c = str;
                }
            }
            p191t4.d.f15222s.toString();
        }
        return m.a;
    }
}
