package Y8;

import B4.C0157e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f5795t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i10) {
        super(0);
        this.f5794s = i10;
        this.f5795t = rVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f5794s) {
            case 0:
                r rVar = this.f5795t;
                I4.a aVar = (I4.a) rVar.f5802z.f1659t;
                rVar.f3634w.b();
                ((p029c9.e) aVar.f2056l).getClass();
                return p086i8.y.z(new ArrayList());
            case 1:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) J7.j.o(this.f5795t.f5797A, r.f5796E[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    Q8.b bVar = (Q8.b) entry.getValue();
                    p176r9.b bVarD = p176r9.b.d(str);
                    C0157e c0157e = bVar.f4340b;
                    p037d9.a aVar2 = (p037d9.a) c0157e.f665b;
                    int iOrdinal = aVar2.ordinal();
                    if (iOrdinal == 2) {
                        map.put(bVarD, bVarD);
                    } else if (iOrdinal == 5) {
                        String str2 = aVar2 == p037d9.a.MULTIFILE_CLASS_PART ? (String) c0157e.f671h : null;
                        if (str2 != null) {
                            map.put(bVarD, p176r9.b.d(str2));
                        }
                    }
                }
                return map;
            default:
                this.f5795t.f5801y.getClass();
                return new ArrayList(p086i8.m.H(p086i8.s.f12328s, 10));
        }
    }
}
