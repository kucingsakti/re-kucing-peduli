package A0;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.lifecycle.EnumC0519n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import p086i8.C;
import p156q0.I;
import y0.C0872j;
import y0.C0874l;

/* JADX INFO: loaded from: classes.dex */
public final class n implements I {
    public final /* synthetic */ C0874l a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f34b;

    public n(C0874l c0874l, g gVar) {
        this.a = c0874l;
        this.f34b = gVar;
    }

    @Override // p156q0.I
    public final void a(androidx.fragment.app.b bVar, boolean z6) {
        Object obj;
        Object objPrevious;
        p210v8.i.f(bVar, "fragment");
        C0874l c0874l = this.a;
        ArrayList arrayListG0 = p086i8.k.g0((Collection) ((Q9.t) ((Q9.m) c0874l.f15941e.f3811t)).f(), (Iterable) ((Q9.t) ((Q9.m) c0874l.f15942f.f3811t)).f());
        ListIterator listIterator = arrayListG0.listIterator(arrayListG0.size());
        do {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!p210v8.i.a(((C0872j) objPrevious).f15932x, bVar.f6627T));
        C0872j c0872j = (C0872j) objPrevious;
        g gVar = this.f34b;
        boolean z10 = z6 && gVar.f16g.isEmpty() && bVar.f6613E;
        for (Object obj2 : gVar.f16g) {
            if (p210v8.i.a(((p076h8.f) obj2).f11789s, bVar.f6627T)) {
                obj = obj2;
                break;
            }
        }
        p076h8.f fVar = (p076h8.f) obj;
        if (fVar != null) {
            gVar.f16g.remove(fVar);
        }
        if (!z10 && g.n()) {
            bVar.toString();
            Objects.toString(c0872j);
        }
        boolean z11 = fVar != null && ((Boolean) fVar.f11790t).booleanValue();
        if (!z6 && !z11 && c0872j == null) {
            throw new IllegalArgumentException(AbstractC0487g.i("The fragment ", bVar, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
        }
        if (c0872j != null) {
            gVar.l(bVar, c0872j, c0874l);
            if (z10) {
                if (g.n()) {
                    bVar.toString();
                    c0872j.toString();
                }
                c0874l.f(c0872j, false);
            }
        }
    }

    @Override // p156q0.I
    public final void c(androidx.fragment.app.b bVar, boolean z6) {
        Object objPrevious;
        p210v8.i.f(bVar, "fragment");
        if (z6) {
            C0874l c0874l = this.a;
            List list = (List) ((Q9.t) ((Q9.m) c0874l.f15941e.f3811t)).f();
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!p210v8.i.a(((C0872j) objPrevious).f15932x, bVar.f6627T));
            C0872j c0872j = (C0872j) objPrevious;
            this.f34b.getClass();
            if (g.n()) {
                bVar.toString();
                Objects.toString(c0872j);
            }
            if (c0872j != null) {
                Q9.t tVar = c0874l.f15939c;
                tVar.h(null, C.v((Set) tVar.f(), c0872j));
                if (!c0874l.f15944h.f15839g.contains(c0872j)) {
                    throw new IllegalStateException("Cannot transition entry that is not in the back stack");
                }
                c0872j.c(EnumC0519n.f6758v);
            }
        }
    }

    @Override // p156q0.I
    public final void b() {
    }
}
