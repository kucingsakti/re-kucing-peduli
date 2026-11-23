package p014b2;

import F8.C0212f;
import c2.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p086i8.k;
import p086i8.m;
import p210v8.i;

/* JADX INFO: renamed from: b2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0542f extends AbstractC0556u {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7262b;

    public C0542f(List list, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                i.f(list, "value");
                this.f7262b = list;
                break;
            default:
                i.f(list, "value");
                this.f7262b = list;
                break;
        }
    }

    @Override // p014b2.AbstractC0556u
    public final String a() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                Iterator it = k.o0(this.f7262b, new C0212f(14)).iterator();
                while (it.hasNext()) {
                    sb.append(((c2.k) it.next()).a);
                }
                String string = sb.toString();
                i.e(string, "sb.toString()");
                return string;
            default:
                StringBuilder sb2 = new StringBuilder();
                List<h> list = this.f7262b;
                ArrayList arrayList = new ArrayList(m.H(list, 10));
                for (h hVar : list) {
                    arrayList.add(hVar.a + hVar.f7448b);
                }
                Iterator it2 = k.o0(arrayList, new C0212f(15)).iterator();
                while (it2.hasNext()) {
                    sb2.append((String) it2.next());
                }
                String string2 = sb2.toString();
                i.e(string2, "sb.toString()");
                return string2;
        }
    }
}
