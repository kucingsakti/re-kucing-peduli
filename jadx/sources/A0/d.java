package A0;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.C0525u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import p086i8.C;
import p156q0.DialogInterfaceOnCancelListenerC0756o;
import p156q0.F;
import y0.C0872j;
import y0.C0874l;
import y0.D;
import y0.N;
import y0.O;
import y0.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LA0/d;", "Ly0/O;", "LA0/b;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@N("dialog")
public final class d extends O {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.fragment.app.e f4d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f5e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N0.b f6f = new N0.b(this, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f7g = new LinkedHashMap();

    public d(Context context, androidx.fragment.app.e eVar) {
        this.f3c = context;
        this.f4d = eVar;
    }

    @Override // y0.O
    public final x a() {
        return new b(this);
    }

    @Override // y0.O
    public final void d(List list, D d3) {
        androidx.fragment.app.e eVar = this.f4d;
        if (eVar.P()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0872j c0872j = (C0872j) it.next();
            k(c0872j).n0(eVar, c0872j.f15932x);
            C0872j c0872j2 = (C0872j) p086i8.k.c0((List) ((Q9.t) ((Q9.m) b().f15941e.f3811t)).f());
            boolean zO = p086i8.k.O((Iterable) ((Q9.t) ((Q9.m) b().f15942f.f3811t)).f(), c0872j2);
            b().h(c0872j);
            if (c0872j2 != null && !zO) {
                b().b(c0872j2);
            }
        }
    }

    @Override // y0.O
    public final void e(C0874l c0874l) {
        C0525u c0525u;
        this.a = c0874l;
        this.f15894b = true;
        Iterator it = ((List) ((Q9.t) ((Q9.m) c0874l.f15941e.f3811t)).f()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            androidx.fragment.app.e eVar = this.f4d;
            if (!zHasNext) {
                eVar.f6689p.add(new p156q0.O() { // from class: A0.a
                    @Override // p156q0.O
                    public final void b(androidx.fragment.app.e eVar2, androidx.fragment.app.b bVar) {
                        d dVar = this.f1s;
                        p210v8.i.f(dVar, "this$0");
                        p210v8.i.f(eVar2, "<anonymous parameter 0>");
                        p210v8.i.f(bVar, "childFragment");
                        LinkedHashSet linkedHashSet = dVar.f5e;
                        if (p210v8.x.a(linkedHashSet).remove(bVar.f6627T)) {
                            bVar.f6643l0.a(dVar.f6f);
                        }
                        LinkedHashMap linkedHashMap = dVar.f7g;
                        String str = bVar.f6627T;
                        p210v8.x.c(linkedHashMap);
                        linkedHashMap.remove(str);
                    }
                });
                return;
            }
            C0872j c0872j = (C0872j) it.next();
            DialogInterfaceOnCancelListenerC0756o dialogInterfaceOnCancelListenerC0756o = (DialogInterfaceOnCancelListenerC0756o) eVar.E(c0872j.f15932x);
            if (dialogInterfaceOnCancelListenerC0756o == null || (c0525u = dialogInterfaceOnCancelListenerC0756o.f6643l0) == null) {
                this.f5e.add(c0872j.f15932x);
            } else {
                c0525u.a(this.f6f);
            }
        }
    }

    @Override // y0.O
    public final void f(C0872j c0872j) {
        androidx.fragment.app.e eVar = this.f4d;
        if (eVar.P()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        LinkedHashMap linkedHashMap = this.f7g;
        String str = c0872j.f15932x;
        DialogInterfaceOnCancelListenerC0756o dialogInterfaceOnCancelListenerC0756o = (DialogInterfaceOnCancelListenerC0756o) linkedHashMap.get(str);
        if (dialogInterfaceOnCancelListenerC0756o == null) {
            androidx.fragment.app.b bVarE = eVar.E(str);
            dialogInterfaceOnCancelListenerC0756o = bVarE instanceof DialogInterfaceOnCancelListenerC0756o ? (DialogInterfaceOnCancelListenerC0756o) bVarE : null;
        }
        if (dialogInterfaceOnCancelListenerC0756o != null) {
            dialogInterfaceOnCancelListenerC0756o.f6643l0.f(this.f6f);
            dialogInterfaceOnCancelListenerC0756o.g0();
        }
        k(c0872j).n0(eVar, str);
        C0874l c0874lB = b();
        List list = (List) ((Q9.t) ((Q9.m) c0874lB.f15941e.f3811t)).f();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            C0872j c0872j2 = (C0872j) listIterator.previous();
            if (p210v8.i.a(c0872j2.f15932x, str)) {
                Q9.t tVar = c0874lB.f15939c;
                tVar.h(null, C.v(C.v((Set) tVar.f(), c0872j2), c0872j));
                c0874lB.c(c0872j);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // y0.O
    public final void i(C0872j c0872j, boolean z6) {
        p210v8.i.f(c0872j, "popUpTo");
        androidx.fragment.app.e eVar = this.f4d;
        if (eVar.P()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) ((Q9.t) ((Q9.m) b().f15941e.f3811t)).f();
        int iIndexOf = list.indexOf(c0872j);
        Iterator it = p086i8.k.i0(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.b bVarE = eVar.E(((C0872j) it.next()).f15932x);
            if (bVarE != null) {
                ((DialogInterfaceOnCancelListenerC0756o) bVarE).g0();
            }
        }
        l(iIndexOf, c0872j, z6);
    }

    public final DialogInterfaceOnCancelListenerC0756o k(C0872j c0872j) {
        x xVar = c0872j.f15928t;
        p210v8.i.d(xVar, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        b bVar = (b) xVar;
        String str = bVar.f2C;
        if (str == null) {
            throw new IllegalStateException("DialogFragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.f3c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        F fI = this.f4d.I();
        context.getClassLoader();
        androidx.fragment.app.b bVarA = fI.a(str);
        p210v8.i.e(bVarA, "fragmentManager.fragment…t.classLoader, className)");
        if (DialogInterfaceOnCancelListenerC0756o.class.isAssignableFrom(bVarA.getClass())) {
            DialogInterfaceOnCancelListenerC0756o dialogInterfaceOnCancelListenerC0756o = (DialogInterfaceOnCancelListenerC0756o) bVarA;
            dialogInterfaceOnCancelListenerC0756o.b0(c0872j.b());
            dialogInterfaceOnCancelListenerC0756o.f6643l0.a(this.f6f);
            this.f7g.put(c0872j.f15932x, dialogInterfaceOnCancelListenerC0756o);
            return dialogInterfaceOnCancelListenerC0756o;
        }
        StringBuilder sb = new StringBuilder("Dialog destination ");
        String str2 = bVar.f2C;
        if (str2 != null) {
            throw new IllegalArgumentException(E0.a.l(sb, str2, " is not an instance of DialogFragment").toString());
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    public final void l(int i10, C0872j c0872j, boolean z6) {
        C0872j c0872j2 = (C0872j) p086i8.k.W((List) ((Q9.t) ((Q9.m) b().f15941e.f3811t)).f(), i10 - 1);
        boolean zO = p086i8.k.O((Iterable) ((Q9.t) ((Q9.m) b().f15942f.f3811t)).f(), c0872j2);
        b().f(c0872j, z6);
        if (c0872j2 == null || zO) {
            return;
        }
        b().b(c0872j2);
    }
}
