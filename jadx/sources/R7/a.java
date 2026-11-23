package R7;

import J7.b;
import J7.g;
import J7.i;
import J7.j;
import J7.k;
import J7.o;
import J7.p;
import N7.c;
import com.google.android.gms.internal.measurement.S;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;
import o1.e;
import p068ga.l;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AtomicReference implements b, L7.b, N7.b, k, p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4450s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f4451t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f4452u;

    public /* synthetic */ a(Object obj, int i10, Object obj2) {
        this.f4450s = i10;
        this.f4451t = obj;
        this.f4452u = obj2;
    }

    @Override // J7.b, J7.k
    public void a() {
        switch (this.f4450s) {
            case 0:
                try {
                    ((N7.a) this.f4452u).mo0run();
                } catch (Throwable th) {
                    l.n(th);
                    j.y(th);
                }
                lazySet(O7.b.f3608s);
                break;
            default:
                ((k) this.f4451t).a();
                break;
        }
    }

    @Override // N7.b
    public void accept(Object obj) {
        Throwable nullPointerException = (Throwable) obj;
        String str = "The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + nullPointerException;
        if (nullPointerException == null) {
            nullPointerException = new NullPointerException();
        }
        j.y(new OnErrorNotImplementedException(str, nullPointerException));
    }

    @Override // J7.b, J7.k
    public final void b(L7.b bVar) {
        switch (this.f4450s) {
            case 0:
                O7.b.j(this, bVar);
                break;
            case 1:
                O7.b.j((AtomicReference) this.f4452u, bVar);
                break;
            case 2:
                if (O7.b.j(this, bVar)) {
                    ((i) this.f4451t).b(this);
                }
                break;
            default:
                if (O7.b.j(this, bVar)) {
                    ((p) this.f4451t).b(this);
                }
                break;
        }
    }

    @Override // J7.p
    public void c(Object obj) {
        switch (this.f4450s) {
            case 2:
                try {
                    Object objApply = ((c) this.f4452u).apply(obj);
                    P7.a.a(objApply, "The mapper returned a null MaybeSource");
                    g gVar = (g) objApply;
                    if (!e()) {
                        gVar.a(new S(this, (i) this.f4451t, 11, false));
                    }
                } catch (Throwable th) {
                    l.n(th);
                    onError(th);
                    return;
                }
                break;
            default:
                ((p) this.f4451t).c(obj);
                break;
        }
    }

    @Override // J7.k
    public void d(Object obj) {
        ((k) this.f4451t).d(obj);
    }

    public boolean e() {
        switch (this.f4450s) {
            case 0:
                return get() == O7.b.f3608s;
            default:
                return O7.b.h((L7.b) get());
        }
    }

    @Override // L7.b
    public final void f() {
        switch (this.f4450s) {
            case 0:
                O7.b.g(this);
                break;
            case 1:
                O7.b.g((AtomicReference) this.f4452u);
                O7.b.g(this);
                break;
            case 2:
                O7.b.g(this);
                break;
            default:
                O7.b.g(this);
                break;
        }
    }

    @Override // J7.b, J7.k
    public final void onError(Throwable th) {
        Object obj = this.f4451t;
        switch (this.f4450s) {
            case 0:
                try {
                    ((N7.b) obj).accept(th);
                } catch (Throwable th2) {
                    l.n(th2);
                    j.y(th2);
                }
                lazySet(O7.b.f3608s);
                break;
            case 1:
                ((k) obj).onError(th);
                break;
            case 2:
                ((i) obj).onError(th);
                break;
            default:
                p pVar = (p) obj;
                try {
                    Object objApply = ((c) this.f4452u).apply(th);
                    P7.a.a(objApply, "The nextFunction returned a null SingleSource.");
                    ((o) objApply).b(new e(this, 9, pVar));
                } catch (Throwable th3) {
                    l.n(th3);
                    pVar.onError(new CompositeException(th, th3));
                }
                break;
        }
    }

    public a(k kVar) {
        this.f4450s = 1;
        this.f4451t = kVar;
        this.f4452u = new AtomicReference();
    }
}
