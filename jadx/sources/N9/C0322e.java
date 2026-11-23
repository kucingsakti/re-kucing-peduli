package N9;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: N9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0322e implements n0, p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3444s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f3445t;

    public /* synthetic */ C0322e(Object obj, int i10) {
        this.f3444s = i10;
        this.f3445t = obj;
    }

    public final void a(Throwable th) {
        switch (this.f3444s) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.f3445t).cancel(false);
                }
                break;
            case 1:
                ((K) this.f3445t).f();
                break;
            default:
                ((p200u8.b) this.f3445t).invoke(th);
                break;
        }
    }

    @Override // p200u8.b
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f3444s) {
            case 0:
                a((Throwable) obj);
                break;
            case 1:
                a((Throwable) obj);
                break;
            default:
                a((Throwable) obj);
                break;
        }
        return p076h8.m.a;
    }

    public final String toString() {
        switch (this.f3444s) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f3445t) + ']';
            case 1:
                return "DisposeOnCancel[" + ((K) this.f3445t) + ']';
            default:
                return "InvokeOnCancel[" + ((p200u8.b) this.f3445t).getClass().getSimpleName() + '@' + AbstractC0342z.j(this) + ']';
        }
    }
}
