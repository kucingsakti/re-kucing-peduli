package V8;

import M8.m;
import M8.n;
import R8.s;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import p086i8.q;
import p086i8.u;
import p086i8.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final Object a = y.w(new p076h8.f("PACKAGE", EnumSet.noneOf(n.class)), new p076h8.f("TYPE", EnumSet.of(n.CLASS, n.FILE)), new p076h8.f("ANNOTATION_TYPE", EnumSet.of(n.ANNOTATION_CLASS)), new p076h8.f("TYPE_PARAMETER", EnumSet.of(n.TYPE_PARAMETER)), new p076h8.f("FIELD", EnumSet.of(n.FIELD)), new p076h8.f("LOCAL_VARIABLE", EnumSet.of(n.LOCAL_VARIABLE)), new p076h8.f("PARAMETER", EnumSet.of(n.VALUE_PARAMETER)), new p076h8.f("CONSTRUCTOR", EnumSet.of(n.CONSTRUCTOR)), new p076h8.f("METHOD", EnumSet.of(n.FUNCTION, n.PROPERTY_GETTER, n.PROPERTY_SETTER)), new p076h8.f("TYPE_USE", EnumSet.of(n.TYPE)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f5211b = y.w(new p076h8.f("RUNTIME", m.f3208s), new p076h8.f("CLASS", m.f3209t), new p076h8.f("SOURCE", m.f3210u));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static p145o9.b a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof s) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) a.get(p096j9.f.j(((s) it.next()).f4476b.name()).g());
            if (iterable == null) {
                iterable = u.f12330s;
            }
            q.J(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(p086i8.m.H(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new p145o9.i(p096j9.b.j(I8.n.f2183u), p096j9.f.j(((n) it2.next()).name())));
        }
        return new p145o9.b(arrayList3, d.f5210s);
    }
}
