package androidx.lifecycle;

import android.os.Looper;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0525u {
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p166r.a f6762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EnumC0519n f6763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f6764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f6768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Q9.t f6769i;

    public C0525u(InterfaceC0523s interfaceC0523s) {
        new AtomicReference(null);
        this.a = true;
        this.f6762b = new p166r.a();
        EnumC0519n enumC0519n = EnumC0519n.f6756t;
        this.f6763c = enumC0519n;
        this.f6768h = new ArrayList();
        this.f6764d = new WeakReference(interfaceC0523s);
        this.f6769i = Q9.q.a(enumC0519n);
    }

    public final void a(r rVar) {
        InterfaceC0522q c0511f;
        Object obj;
        InterfaceC0523s interfaceC0523s;
        EnumC0518m enumC0518m;
        ArrayList arrayList = this.f6768h;
        int i10 = 2;
        p210v8.i.f(rVar, "observer");
        c("addObserver");
        EnumC0519n enumC0519n = this.f6763c;
        EnumC0519n enumC0519n2 = EnumC0519n.f6755s;
        if (enumC0519n != enumC0519n2) {
            enumC0519n2 = EnumC0519n.f6756t;
        }
        C0524t c0524t = new C0524t();
        HashMap map = AbstractC0527w.a;
        boolean z6 = rVar instanceof InterfaceC0522q;
        boolean z10 = rVar instanceof p106l0.h;
        if (z6 && z10) {
            c0511f = new C0511f((p106l0.h) rVar, (InterfaceC0522q) rVar);
        } else if (z10) {
            c0511f = new C0511f((p106l0.h) rVar, (InterfaceC0522q) null);
        } else if (z6) {
            c0511f = (InterfaceC0522q) rVar;
        } else {
            Class<?> cls = rVar.getClass();
            if (AbstractC0527w.b(cls) == 2) {
                Object obj2 = AbstractC0527w.f6771b.get(cls);
                p210v8.i.c(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0527w.a((Constructor) list.get(0), rVar);
                    throw null;
                }
                int size = list.size();
                InterfaceC0513h[] interfaceC0513hArr = new InterfaceC0513h[size];
                if (size > 0) {
                    AbstractC0527w.a((Constructor) list.get(0), rVar);
                    throw null;
                }
                c0511f = new N0.b(interfaceC0513hArr, i10);
            } else {
                c0511f = new C0511f(rVar);
            }
        }
        c0524t.f6761b = c0511f;
        c0524t.a = enumC0519n2;
        p166r.a aVar = this.f6762b;
        p166r.c cVarD = aVar.d(rVar);
        if (cVarD != null) {
            obj = cVarD.f14448t;
        } else {
            HashMap map2 = aVar.f14443w;
            p166r.c cVar = new p166r.c(rVar, c0524t);
            aVar.f14457v++;
            p166r.c cVar2 = aVar.f14455t;
            if (cVar2 == null) {
                aVar.f14454s = cVar;
                aVar.f14455t = cVar;
            } else {
                cVar2.f14449u = cVar;
                cVar.f14450v = cVar2;
                aVar.f14455t = cVar;
            }
            map2.put(rVar, cVar);
            obj = null;
        }
        if (((C0524t) obj) == null && (interfaceC0523s = (InterfaceC0523s) this.f6764d.get()) != null) {
            boolean z11 = this.f6765e != 0 || this.f6766f;
            EnumC0519n enumC0519nB = b(rVar);
            this.f6765e++;
            while (c0524t.a.compareTo(enumC0519nB) < 0 && this.f6762b.f14443w.containsKey(rVar)) {
                arrayList.add(c0524t.a);
                C0516k c0516k = EnumC0518m.Companion;
                EnumC0519n enumC0519n3 = c0524t.a;
                c0516k.getClass();
                p210v8.i.f(enumC0519n3, AdOperationMetric.INIT_STATE);
                int iOrdinal = enumC0519n3.ordinal();
                if (iOrdinal == 1) {
                    enumC0518m = EnumC0518m.ON_CREATE;
                } else if (iOrdinal != 2) {
                    enumC0518m = iOrdinal != 3 ? null : EnumC0518m.ON_RESUME;
                } else {
                    enumC0518m = EnumC0518m.ON_START;
                }
                if (enumC0518m == null) {
                    throw new IllegalStateException("no event up from " + c0524t.a);
                }
                c0524t.a(interfaceC0523s, enumC0518m);
                arrayList.remove(arrayList.size() - 1);
                enumC0519nB = b(rVar);
            }
            if (!z11) {
                h();
            }
            this.f6765e--;
        }
    }

    public final EnumC0519n b(r rVar) {
        C0524t c0524t;
        HashMap map = this.f6762b.f14443w;
        p166r.c cVar = map.containsKey(rVar) ? ((p166r.c) map.get(rVar)).f14450v : null;
        EnumC0519n enumC0519n = (cVar == null || (c0524t = (C0524t) cVar.f14448t) == null) ? null : c0524t.a;
        ArrayList arrayList = this.f6768h;
        EnumC0519n enumC0519n2 = arrayList.isEmpty() ? null : (EnumC0519n) arrayList.get(arrayList.size() - 1);
        EnumC0519n enumC0519n3 = this.f6763c;
        p210v8.i.f(enumC0519n3, "state1");
        if (enumC0519n == null || enumC0519n.compareTo(enumC0519n3) >= 0) {
            enumC0519n = enumC0519n3;
        }
        return (enumC0519n2 == null || enumC0519n2.compareTo(enumC0519n) >= 0) ? enumC0519n : enumC0519n2;
    }

    public final void c(String str) {
        if (this.a) {
            p155q.a.r().f14246c.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(E0.a.i("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(EnumC0518m enumC0518m) {
        p210v8.i.f(enumC0518m, "event");
        c("handleLifecycleEvent");
        e(enumC0518m.f());
    }

    public final void e(EnumC0519n enumC0519n) {
        EnumC0519n enumC0519n2 = this.f6763c;
        if (enumC0519n2 == enumC0519n) {
            return;
        }
        EnumC0519n enumC0519n3 = EnumC0519n.f6756t;
        EnumC0519n enumC0519n4 = EnumC0519n.f6755s;
        if (enumC0519n2 == enumC0519n3 && enumC0519n == enumC0519n4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0519n + ", but was " + this.f6763c + " in component " + this.f6764d.get()).toString());
        }
        this.f6763c = enumC0519n;
        if (this.f6766f || this.f6765e != 0) {
            this.f6767g = true;
            return;
        }
        this.f6766f = true;
        h();
        this.f6766f = false;
        if (this.f6763c == enumC0519n4) {
            this.f6762b = new p166r.a();
        }
    }

    public final void f(r rVar) {
        p210v8.i.f(rVar, "observer");
        c("removeObserver");
        this.f6762b.e(rVar);
    }

    public final void g(EnumC0519n enumC0519n) {
        p210v8.i.f(enumC0519n, AdOperationMetric.INIT_STATE);
        c("setCurrentState");
        e(enumC0519n);
    }

    public final void h() {
        EnumC0518m enumC0518m;
        EnumC0518m enumC0518m2;
        InterfaceC0523s interfaceC0523s = (InterfaceC0523s) this.f6764d.get();
        if (interfaceC0523s == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            p166r.a aVar = this.f6762b;
            if (aVar.f14457v != 0) {
                p166r.c cVar = aVar.f14454s;
                p210v8.i.c(cVar);
                EnumC0519n enumC0519n = ((C0524t) cVar.f14448t).a;
                p166r.c cVar2 = this.f6762b.f14455t;
                p210v8.i.c(cVar2);
                EnumC0519n enumC0519n2 = ((C0524t) cVar2.f14448t).a;
                if (enumC0519n == enumC0519n2 && this.f6763c == enumC0519n2) {
                    break;
                }
                this.f6767g = false;
                EnumC0519n enumC0519n3 = this.f6763c;
                p166r.c cVar3 = this.f6762b.f14454s;
                p210v8.i.c(cVar3);
                if (enumC0519n3.compareTo(((C0524t) cVar3.f14448t).a) < 0) {
                    p166r.a aVar2 = this.f6762b;
                    p166r.b bVar = new p166r.b(aVar2.f14455t, aVar2.f14454s, 1);
                    aVar2.f14456u.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f6767g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        p210v8.i.e(entry, "next()");
                        r rVar = (r) entry.getKey();
                        C0524t c0524t = (C0524t) entry.getValue();
                        while (c0524t.a.compareTo(this.f6763c) > 0 && !this.f6767g && this.f6762b.f14443w.containsKey(rVar)) {
                            C0516k c0516k = EnumC0518m.Companion;
                            EnumC0519n enumC0519n4 = c0524t.a;
                            c0516k.getClass();
                            p210v8.i.f(enumC0519n4, AdOperationMetric.INIT_STATE);
                            int iOrdinal = enumC0519n4.ordinal();
                            if (iOrdinal == 2) {
                                enumC0518m2 = EnumC0518m.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                enumC0518m2 = iOrdinal != 4 ? null : EnumC0518m.ON_PAUSE;
                            } else {
                                enumC0518m2 = EnumC0518m.ON_STOP;
                            }
                            if (enumC0518m2 == null) {
                                throw new IllegalStateException("no event down from " + c0524t.a);
                            }
                            this.f6768h.add(enumC0518m2.f());
                            c0524t.a(interfaceC0523s, enumC0518m2);
                            ArrayList arrayList = this.f6768h;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                p166r.c cVar4 = this.f6762b.f14455t;
                if (!this.f6767g && cVar4 != null && this.f6763c.compareTo(((C0524t) cVar4.f14448t).a) > 0) {
                    p166r.a aVar3 = this.f6762b;
                    aVar3.getClass();
                    p166r.d dVar = new p166r.d(aVar3);
                    aVar3.f14456u.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f6767g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        r rVar2 = (r) entry2.getKey();
                        C0524t c0524t2 = (C0524t) entry2.getValue();
                        while (c0524t2.a.compareTo(this.f6763c) < 0 && !this.f6767g && this.f6762b.f14443w.containsKey(rVar2)) {
                            this.f6768h.add(c0524t2.a);
                            C0516k c0516k2 = EnumC0518m.Companion;
                            EnumC0519n enumC0519n5 = c0524t2.a;
                            c0516k2.getClass();
                            p210v8.i.f(enumC0519n5, AdOperationMetric.INIT_STATE);
                            int iOrdinal2 = enumC0519n5.ordinal();
                            if (iOrdinal2 == 1) {
                                enumC0518m = EnumC0518m.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                enumC0518m = iOrdinal2 != 3 ? null : EnumC0518m.ON_RESUME;
                            } else {
                                enumC0518m = EnumC0518m.ON_START;
                            }
                            if (enumC0518m == null) {
                                throw new IllegalStateException("no event up from " + c0524t2.a);
                            }
                            c0524t2.a(interfaceC0523s, enumC0518m);
                            ArrayList arrayList2 = this.f6768h;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f6767g = false;
        this.f6769i.g(this.f6763c);
    }
}
