package p067g9;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p047e9.P;
import p047e9.Q;
import p047e9.X;
import p086i8.l;
import p086i8.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public List a;

    public g(X x8) {
        i.f(x8, "typeTable");
        List list = x8.f10943u;
        if ((x8.f10942t & 1) == 1) {
            int i10 = x8.f10944v;
            i.e(list, "typeTable.typeList");
            List list2 = list;
            ArrayList arrayList = new ArrayList(m.H(list2, 10));
            int i11 = 0;
            for (Object obj : list2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    l.G();
                    throw null;
                }
                Q qH = (Q) obj;
                if (i11 >= i10) {
                    qH.getClass();
                    P pQ = Q.q(qH);
                    pQ.f10864v |= 2;
                    pQ.f10866x = true;
                    qH = pQ.h();
                    if (!qH.isInitialized()) {
                        throw new UninitializedMessageException();
                    }
                }
                arrayList.add(qH);
                i11 = i12;
            }
            list = arrayList;
        }
        i.e(list, "run {\n        val origin… else originalTypes\n    }");
        this.a = list;
    }

    public Q a(int i10) {
        return (Q) this.a.get(i10);
    }
}
