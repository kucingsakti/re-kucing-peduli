package I8;

import L8.G;
import O8.C;
import O8.C0358n;
import O8.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C f2133t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(C c10, int i10) {
        super(0);
        this.f2132s = i10;
        this.f2133t = c10;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f2132s) {
            case 0:
                return ((z) this.f2133t.K(o.f2195h)).f3799y;
            case 1:
                return new K8.h(this.f2133t);
            default:
                C c10 = this.f2133t;
                p040e1.j jVar = c10.f3625y;
                if (jVar == null) {
                    StringBuilder sb = new StringBuilder("Dependencies of module ");
                    String str = c10.getName().f12551s;
                    p210v8.i.e(str, "name.toString()");
                    sb.append(str);
                    sb.append(" were not set before querying module content");
                    throw new AssertionError(sb.toString());
                }
                c10.Y0();
                List list = (List) jVar.f10697t;
                list.contains(c10);
                List list2 = list;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((C) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(p086i8.m.H(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    G g8 = ((C) it2.next()).f3626z;
                    p210v8.i.c(g8);
                    arrayList.add(g8);
                }
                return new C0358n(arrayList, "CompositeProvider@ModuleDescriptor for " + c10.getName());
        }
    }
}
