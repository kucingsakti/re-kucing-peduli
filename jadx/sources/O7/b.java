package O7;

import J7.j;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b implements L7.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f3608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ b[] f3609t;

    static {
        b bVar = new b("DISPOSED", 0);
        f3608s = bVar;
        f3609t = new b[]{bVar};
    }

    public static void g(AtomicReference atomicReference) {
        L7.b bVar;
        L7.b bVar2 = (L7.b) atomicReference.get();
        b bVar3 = f3608s;
        if (bVar2 == bVar3 || (bVar = (L7.b) atomicReference.getAndSet(bVar3)) == bVar3 || bVar == null) {
            return;
        }
        bVar.f();
    }

    public static boolean h(L7.b bVar) {
        return bVar == f3608s;
    }

    public static void i(AtomicReference atomicReference, L7.b bVar) {
        while (true) {
            L7.b bVar2 = (L7.b) atomicReference.get();
            if (bVar2 != f3608s) {
                while (!atomicReference.compareAndSet(bVar2, bVar)) {
                    if (atomicReference.get() != bVar2) {
                    }
                }
                return;
            } else {
                if (bVar != null) {
                    bVar.f();
                    return;
                }
                return;
            }
        }
    }

    public static boolean j(AtomicReference atomicReference, L7.b bVar) {
        P7.a.a(bVar, "d is null");
        while (!atomicReference.compareAndSet(null, bVar)) {
            if (atomicReference.get() != null) {
                bVar.f();
                if (atomicReference.get() == f3608s) {
                    return false;
                }
                j.y(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean k(L7.b bVar, L7.b bVar2) {
        if (bVar == null) {
            return true;
        }
        bVar2.f();
        j.y(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3609t.clone();
    }

    @Override // L7.b
    public final void f() {
    }
}
