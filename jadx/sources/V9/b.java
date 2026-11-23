package V9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p076h8.m;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5221s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f5222t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f5223u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i10) {
        super(1);
        this.f5221s = i10;
        this.f5222t = dVar;
        this.f5223u = cVar;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f5221s) {
            case 0:
                this.f5223u.getClass();
                this.f5222t.e(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f5226g;
                this.f5223u.getClass();
                d dVar = this.f5222t;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                break;
        }
        return m.a;
    }
}
