package t9;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f15229c = new l();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f15231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f15232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f15233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f15234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f15235i;
    public static final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f15236k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f15237l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f15238m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f15239n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f15240o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f15241p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f f15242q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ArrayList f15243r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ArrayList f15244s;
    public final List a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15245b;

    static {
        e eVar;
        int i10 = f15230d;
        int i11 = i10 << 1;
        f15231e = i10;
        int i12 = i10 << 2;
        f15232f = i11;
        int i13 = i10 << 3;
        f15233g = i12;
        int i14 = i10 << 4;
        f15234h = i13;
        int i15 = i10 << 5;
        f15235i = i14;
        j = i15;
        f15230d = i10 << 7;
        int i16 = (i10 << 6) - 1;
        f15236k = i16;
        int i17 = i10 | i11 | i12;
        f15237l = i17;
        f15238m = new f(i16);
        f15239n = new f(i14 | i15);
        new f(i10);
        new f(i11);
        new f(i12);
        f15240o = new f(i17);
        new f(i13);
        f15241p = new f(i14);
        f15242q = new f(i15);
        new f(i11 | i14 | i15);
        Field[] fields = f.class.getFields();
        p210v8.i.e(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            e eVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            f fVar = obj instanceof f ? (f) obj : null;
            if (fVar != null) {
                String name = field2.getName();
                p210v8.i.e(name, "field.name");
                eVar2 = new e(fVar.f15245b, name);
            }
            if (eVar2 != null) {
                arrayList2.add(eVar2);
            }
        }
        f15243r = arrayList2;
        Field[] fields2 = f.class.getFields();
        p210v8.i.e(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (p210v8.i.a(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            p210v8.i.d(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                p210v8.i.e(name2, "field.name");
                eVar = new e(iIntValue, name2);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                arrayList5.add(eVar);
            }
        }
        f15244s = arrayList5;
    }

    public f(List list, int i10) {
        p210v8.i.f(list, "excludes");
        this.a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i10 &= ~((d) it.next()).a();
        }
        this.f15245b = i10;
    }

    public final boolean a(int i10) {
        return (i10 & this.f15245b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        p210v8.i.d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        f fVar = (f) obj;
        return p210v8.i.a(this.a, fVar.a) && this.f15245b == fVar.f15245b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.f15245b;
    }

    public final String toString() {
        Object next;
        Iterator it = f15243r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((e) next).a != this.f15245b);
        e eVar = (e) next;
        String strZ = eVar != null ? eVar.f15228b : null;
        if (strZ == null) {
            ArrayList<e> arrayList = f15244s;
            ArrayList arrayList2 = new ArrayList();
            for (e eVar2 : arrayList) {
                String str = a(eVar2.a) ? eVar2.f15228b : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            strZ = p086i8.k.Z(arrayList2, " | ", null, null, null, 62);
        }
        StringBuilder sbM = AbstractC0487g.m("DescriptorKindFilter(", strZ, ", ");
        sbM.append(this.a);
        sbM.append(')');
        return sbM.toString();
    }

    public /* synthetic */ f(int i10) {
        this(p086i8.s.f12328s, i10);
    }
}
