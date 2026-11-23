package p014b2;

import c2.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p076h8.f;
import p086i8.C;
import p086i8.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class G extends AbstractC0556u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f7260b = C.w("processor");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f7261c = C.x("bogomips", "cpu mhz");
    public final c a;

    public G(c cVar) {
        i.f(cVar, "value");
        Iterable iterable = (Iterable) cVar.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            String lowerCase = ((String) ((f) obj).f11789s).toLowerCase(Locale.ROOT);
            i.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (!f7260b.contains(lowerCase)) {
                arrayList.add(obj);
            }
        }
        Iterable<List> iterable2 = (Iterable) cVar.f7437b;
        ArrayList arrayList2 = new ArrayList(m.H(iterable2, 10));
        for (List list : iterable2) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                String lowerCase2 = ((String) ((f) obj2).f11789s).toLowerCase(Locale.ROOT);
                i.e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!f7261c.contains(lowerCase2)) {
                    arrayList3.add(obj2);
                }
            }
            arrayList2.add(arrayList3);
        }
        this.a = new c(arrayList, arrayList2);
    }

    @Override // p014b2.AbstractC0556u
    public final String a() {
        StringBuilder sb = new StringBuilder();
        c cVar = this.a;
        sb.append(cVar.a);
        sb.append(cVar.f7437b);
        return sb.toString();
    }
}
