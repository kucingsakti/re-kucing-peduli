package F0;

import N9.InterfaceC0341y;
import android.net.Uri;
import android.view.InputEvent;
import p076h8.m;
import p144o8.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1462s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f1463t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uri f1464u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InputEvent f1465v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Uri uri, InputEvent inputEvent, p123m8.d dVar2) {
        super(2, dVar2);
        this.f1463t = dVar;
        this.f1464u = uri;
        this.f1465v = inputEvent;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new b(this.f1463t, this.f1464u, this.f1465v, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1462s;
        if (i10 == 0) {
            J7.a.v(obj);
            G0.c cVar = this.f1463t.a;
            this.f1462s = 1;
            if (cVar.c(this.f1464u, this.f1465v, this) == aVar) {
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
