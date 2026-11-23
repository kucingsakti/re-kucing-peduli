package p050f1;

import N9.InterfaceC0341y;
import androidx.work.CoroutineWorker;
import p076h8.m;
import p123m8.d;
import p134n8.a;
import p144o8.g;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11408s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f11409t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CoroutineWorker coroutineWorker, d dVar) {
        super(2, dVar);
        this.f11409t = coroutineWorker;
    }

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        return new f(this.f11409t, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC0341y) obj, (d) obj2)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f13404s;
        int i10 = this.f11408s;
        CoroutineWorker coroutineWorker = this.f11409t;
        try {
            if (i10 == 0) {
                J7.a.v(obj);
                this.f11408s = 1;
                obj = coroutineWorker.doWork(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            coroutineWorker.getFuture().j((o) obj);
        } catch (Throwable th) {
            coroutineWorker.getFuture().k(th);
        }
        return m.a;
    }
}
