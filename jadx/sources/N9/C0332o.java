package N9;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: N9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0332o {
    public final Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0322e f3472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p200u8.b f3473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f3475e;

    public C0332o(Object obj, C0322e c0322e, p200u8.b bVar, Object obj2, Throwable th) {
        this.a = obj;
        this.f3472b = c0322e;
        this.f3473c = bVar;
        this.f3474d = obj2;
        this.f3475e = th;
    }

    public static C0332o a(C0332o c0332o, C0322e c0322e, CancellationException cancellationException, int i10) {
        Object obj = c0332o.a;
        if ((i10 & 2) != 0) {
            c0322e = c0332o.f3472b;
        }
        C0322e c0322e2 = c0322e;
        p200u8.b bVar = c0332o.f3473c;
        Object obj2 = c0332o.f3474d;
        Throwable th = cancellationException;
        if ((i10 & 16) != 0) {
            th = c0332o.f3475e;
        }
        c0332o.getClass();
        return new C0332o(obj, c0322e2, bVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0332o)) {
            return false;
        }
        C0332o c0332o = (C0332o) obj;
        return p210v8.i.a(this.a, c0332o.a) && p210v8.i.a(this.f3472b, c0332o.f3472b) && p210v8.i.a(this.f3473c, c0332o.f3473c) && p210v8.i.a(this.f3474d, c0332o.f3474d) && p210v8.i.a(this.f3475e, c0332o.f3475e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0322e c0322e = this.f3472b;
        int iHashCode2 = (iHashCode + (c0322e == null ? 0 : c0322e.hashCode())) * 31;
        p200u8.b bVar = this.f3473c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Object obj2 = this.f3474d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f3475e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.f3472b + ", onCancellation=" + this.f3473c + ", idempotentResume=" + this.f3474d + ", cancelCause=" + this.f3475e + ')';
    }

    public /* synthetic */ C0332o(Object obj, C0322e c0322e, p200u8.b bVar, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 2) != 0 ? null : c0322e, (i10 & 4) != 0 ? null : bVar, (Object) null, (i10 & 16) != 0 ? null : cancellationException);
    }
}
