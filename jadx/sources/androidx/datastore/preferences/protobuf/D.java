package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D extends F {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f6413c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(Object obj, long j, int i10) {
        List listT;
        List list = (List) t0.f6515d.i(j, obj);
        if (list.isEmpty()) {
            if (list instanceof C) {
                listT = new B(i10);
            } else {
                listT = ((list instanceof W) && (list instanceof InterfaceC0504y)) ? ((InterfaceC0504y) list).t(i10) : new ArrayList(i10);
            }
            t0.o(j, obj, listT);
            return listT;
        }
        if (f6413c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            t0.o(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof o0) {
            B b3 = new B(list.size() + i10);
            b3.addAll((o0) list);
            t0.o(j, obj, b3);
            return b3;
        }
        if ((list instanceof W) && (list instanceof InterfaceC0504y)) {
            InterfaceC0504y interfaceC0504y = (InterfaceC0504y) list;
            if (!((AbstractC0480b) interfaceC0504y).f6447s) {
                InterfaceC0504y interfaceC0504yT = interfaceC0504y.t(list.size() + i10);
                t0.o(j, obj, interfaceC0504yT);
                return interfaceC0504yT;
            }
        }
        return list;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) t0.f6515d.i(j, obj);
        if (list instanceof C) {
            objUnmodifiableList = ((C) list).i();
        } else {
            if (f6413c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof W) && (list instanceof InterfaceC0504y)) {
                AbstractC0480b abstractC0480b = (AbstractC0480b) ((InterfaceC0504y) list);
                if (abstractC0480b.f6447s) {
                    abstractC0480b.f6447s = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        t0.o(j, obj, objUnmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final void b(AbstractC0502w abstractC0502w, AbstractC0502w abstractC0502w2, long j) {
        List list = (List) t0.f6515d.i(j, abstractC0502w2);
        List listD = d(abstractC0502w, j, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        t0.o(j, abstractC0502w, list);
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final List c(long j, Object obj) {
        return d(obj, j, 10);
    }
}
