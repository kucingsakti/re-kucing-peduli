package p050f1;

import N9.InterfaceC0341y;
import androidx.work.CoroutineWorker;
import p076h8.m;
import p123m8.d;
import p134n8.a;
import p144o8.g;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f11404s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11405t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f11406u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f11407v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, CoroutineWorker coroutineWorker, d dVar) {
        super(2, dVar);
        this.f11406u = kVar;
        this.f11407v = coroutineWorker;
    }

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        return new e(this.f11406u, this.f11407v, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC0341y) obj, (d) obj2)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        k kVar;
        a aVar = a.f13404s;
        int i10 = this.f11405t;
        if (i10 == 0) {
            J7.a.v(obj);
            k kVar2 = this.f11406u;
            this.f11404s = kVar2;
            this.f11405t = 1;
            Object foregroundInfo = this.f11407v.getForegroundInfo(this);
            if (foregroundInfo == aVar) {
                return aVar;
            }
            kVar = kVar2;
            obj = foregroundInfo;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = this.f11404s;
            J7.a.v(obj);
        }
        kVar.f11415s.j(obj);
        return m.a;
    }
}
