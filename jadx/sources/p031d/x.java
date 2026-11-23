package p031d;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.b;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Objects;
import p086i8.h;
import p156q0.C0742a;
import p156q0.C0752k;
import p156q0.D;
import p156q0.I;
import p156q0.P;
import p210v8.i;
import y0.B;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public final Runnable a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f10491b = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public D f10492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f10493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f10494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10496g;

    public x(Runnable runnable) {
        this.a = runnable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f10493d = i10 >= 34 ? t.a.a(new o(this, 0), new o(this, 1), new p(this, 0), new p(this, 1)) : r.a.a(new p(this, 2));
        }
    }

    public final void a() {
        Object objPrevious;
        D d3 = this.f10492c;
        if (d3 == null) {
            h hVar = this.f10491b;
            ListIterator listIterator = hVar.listIterator(hVar.e());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((D) objPrevious).a);
            d3 = (D) objPrevious;
        }
        this.f10492c = null;
        if (d3 == null) {
            this.a.run();
            return;
        }
        switch (d3.f14256d) {
            case 0:
                boolean zK = e.K(3);
                e eVar = (e) d3.f14257e;
                if (zK) {
                    Objects.toString(eVar);
                }
                eVar.f6683i = true;
                eVar.z(true);
                eVar.f6683i = false;
                C0742a c0742a = eVar.f6682h;
                D d8 = eVar.j;
                if (c0742a != null) {
                    ArrayList<I> arrayList = eVar.f6687n;
                    if (!arrayList.isEmpty()) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(e.G(eVar.f6682h));
                        for (I i10 : arrayList) {
                            Iterator it = linkedHashSet.iterator();
                            while (it.hasNext()) {
                                i10.a((b) it.next(), true);
                            }
                        }
                    }
                    Iterator it2 = eVar.f6682h.a.iterator();
                    while (it2.hasNext()) {
                        b bVar = ((P) it2.next()).f14269b;
                        if (bVar != null) {
                            bVar.f6614F = false;
                        }
                    }
                    for (C0752k c0752k : eVar.f(new ArrayList(Collections.singletonList(eVar.f6682h)), 0, 1)) {
                        c0752k.getClass();
                        e.K(3);
                        ArrayList arrayList2 = c0752k.f14330c;
                        c0752k.k(arrayList2);
                        c0752k.c(arrayList2);
                    }
                    Iterator it3 = eVar.f6682h.a.iterator();
                    while (it3.hasNext()) {
                        b bVar2 = ((P) it3.next()).f14269b;
                        if (bVar2 != null && bVar2.f6635b0 == null) {
                            eVar.g(bVar2).k();
                        }
                    }
                    eVar.f6682h = null;
                    eVar.h0();
                    if (e.K(3)) {
                        boolean z6 = d8.a;
                        eVar.toString();
                    }
                } else if (d8.a) {
                    e.K(3);
                    eVar.S();
                } else {
                    e.K(3);
                    eVar.f6681g.a();
                }
                break;
            default:
                B b3 = (B) d3.f14257e;
                if (!b3.f15839g.isEmpty()) {
                    y0.x xVarF = b3.f();
                    i.c(xVarF);
                    b3.n(xVarF.f16002z, true);
                    break;
                }
                break;
        }
    }

    public final void b(boolean z6) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f10494e;
        OnBackInvokedCallback onBackInvokedCallback = this.f10493d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        r rVar = r.a;
        if (z6 && !this.f10495f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f10495f = true;
        } else {
            if (z6 || !this.f10495f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f10495f = false;
        }
    }

    public final void c() {
        boolean z6 = this.f10496g;
        h hVar = this.f10491b;
        boolean z10 = false;
        if (!(hVar instanceof Collection) || !hVar.isEmpty()) {
            Iterator<E> it = hVar.iterator();
            while (it.hasNext()) {
                if (((D) it.next()).a) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f10496g = z10;
        if (z10 == z6 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        b(z10);
    }
}
