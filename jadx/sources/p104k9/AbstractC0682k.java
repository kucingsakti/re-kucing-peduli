package p104k9;

import B4.C0154b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: renamed from: k9.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0682k extends n {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0679h f12811s;

    public AbstractC0682k() {
        this.f12811s = new C0679h();
    }

    public final boolean h() {
        int i10 = 0;
        while (true) {
            y yVar = this.f12811s.a;
            if (i10 >= yVar.f12837t.size()) {
                Iterator it = yVar.c().iterator();
                while (it.hasNext()) {
                    if (!C0679h.e((Map.Entry) it.next())) {
                        break;
                    }
                }
                return true;
            }
            if (!C0679h.e((Map.Entry) yVar.f12837t.get(i10))) {
                break;
            }
            i10++;
        }
        return false;
    }

    public final int i() {
        y yVar;
        int i10 = 0;
        int iD = 0;
        while (true) {
            yVar = this.f12811s.a;
            if (i10 >= yVar.f12837t.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) yVar.f12837t.get(i10);
            iD += C0679h.d((l) entry.getKey(), entry.getValue());
            i10++;
        }
        for (Map.Entry entry2 : yVar.c()) {
            iD += C0679h.d((l) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final Object j(m mVar) {
        n(mVar);
        y yVar = this.f12811s.a;
        l lVar = mVar.f12817d;
        Object obj = yVar.get(lVar);
        if (obj == null) {
            return mVar.f12815b;
        }
        if (!lVar.f12814u) {
            return mVar.a(obj);
        }
        if (lVar.f12813t.f12776s != K.f12778A) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(mVar.a(it.next()));
        }
        return arrayList;
    }

    public final boolean k(m mVar) {
        n(mVar);
        C0679h c0679h = this.f12811s;
        c0679h.getClass();
        l lVar = mVar.f12817d;
        if (lVar.f12814u) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return c0679h.a.get(lVar) != null;
    }

    public final void l() {
        this.f12811s.f();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x001d  */
    public final boolean m(C0676e c0676e, C0154b c0154b, C0678g c0678g, int i10) throws InvalidProtocolBufferException {
        boolean z6;
        boolean z10;
        Object objC;
        AbstractC0672a abstractC0672a;
        AbstractC0672a abstractC0672aA = a();
        int i11 = i10 & 7;
        c0678g.getClass();
        m mVar = (m) c0678g.a.get(new C0677f(i10 >>> 3, abstractC0672aA));
        if (mVar == null) {
            z10 = false;
            z6 = true;
        } else {
            l lVar = mVar.f12817d;
            J j = lVar.f12813t;
            C0679h c0679h = C0679h.f12806c;
            if (i11 == j.f12777t) {
                z6 = false;
                z10 = false;
            } else if (lVar.f12814u && j.f() && i11 == 2) {
                z6 = false;
                z10 = true;
            } else {
                z10 = false;
                z6 = true;
            }
        }
        if (z6) {
            return c0676e.q(i10, c0154b);
        }
        AbstractC0680i abstractC0680iC = null;
        C0679h c0679h2 = this.f12811s;
        if (z10) {
            int iD = c0676e.d(c0676e.k());
            l lVar2 = mVar.f12817d;
            if (lVar2.f12813t != J.f12774y) {
                while (c0676e.b() > 0) {
                    c0679h2.a(lVar2, C0679h.h(c0676e, lVar2.f12813t));
                }
            } else if (c0676e.b() > 0) {
                c0676e.k();
                throw null;
            }
            c0676e.c(iD);
            return true;
        }
        int iOrdinal = mVar.f12817d.f12813t.f12776s.ordinal();
        l lVar3 = mVar.f12817d;
        if (iOrdinal == 7) {
            c0676e.k();
            lVar3.getClass();
            throw null;
        }
        if (iOrdinal != 8) {
            objC = C0679h.h(c0676e, lVar3.f12813t);
        } else {
            if (!lVar3.f12814u && (abstractC0672a = (AbstractC0672a) c0679h2.a.get(lVar3)) != null) {
                abstractC0680iC = abstractC0672a.d();
            }
            if (abstractC0680iC == null) {
                abstractC0680iC = mVar.f12816c.c();
            }
            if (lVar3.f12813t == J.f12772w) {
                int i12 = c0676e.f12803i;
                if (i12 >= 64) {
                    throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                }
                c0676e.f12803i = i12 + 1;
                abstractC0680iC.d(c0676e, c0678g);
                c0676e.a((lVar3.f12812s << 3) | 4);
                c0676e.f12803i--;
            } else {
                int iK = c0676e.k();
                if (c0676e.f12803i >= 64) {
                    throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                }
                int iD2 = c0676e.d(iK);
                c0676e.f12803i++;
                abstractC0680iC.d(c0676e, c0678g);
                c0676e.a(0);
                c0676e.f12803i--;
                c0676e.c(iD2);
            }
            objC = abstractC0680iC.c();
        }
        if (lVar3.f12814u) {
            c0679h2.a(lVar3, mVar.b(objC));
            return true;
        }
        c0679h2.i(lVar3, mVar.b(objC));
        return true;
    }

    public final void n(m mVar) {
        if (mVar.a != a()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public AbstractC0682k(AbstractC0681j abstractC0681j) {
        abstractC0681j.f12809t.f();
        abstractC0681j.f12810u = false;
        this.f12811s = abstractC0681j.f12809t;
    }
}
