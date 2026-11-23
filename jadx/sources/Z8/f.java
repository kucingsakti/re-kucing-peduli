package Z8;

import A9.AbstractC0151y;
import A9.D;
import A9.K;
import A9.S;
import A9.d0;
import A9.r;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p086i8.k;
import p086i8.m;
import p114l9.g;
import p210v8.i;
import t9.n;

/* JADX INFO: loaded from: classes.dex */
public final class f extends r {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(D d3, D d8) {
        super(d3, d8);
        i.f(d3, "lowerBound");
        i.f(d8, "upperBound");
        B9.d.a.b(d3, d8);
    }

    public static final ArrayList Q0(g gVar, AbstractC0151y abstractC0151y) {
        List<S> listL = abstractC0151y.l();
        ArrayList arrayList = new ArrayList(m.H(listL, 10));
        for (S s9 : listL) {
            gVar.getClass();
            i.f(s9, "typeProjection");
            StringBuilder sb = new StringBuilder();
            k.Y(com.bumptech.glide.d.u(s9), sb, ", ", null, null, new p114l9.e(gVar, 0), 60);
            String string = sb.toString();
            i.e(string, "StringBuilder().apply(builderAction).toString()");
            arrayList.add(string);
        }
        return arrayList;
    }

    public static final String R0(String str, String str2) {
        String strSubstring;
        if (!L9.f.K(str, '<')) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        i.f(str, "<this>");
        i.f(str, "missingDelimiterValue");
        int iO = L9.f.O(str, '<', 0, 6);
        if (iO == -1) {
            strSubstring = str;
        } else {
            strSubstring = str.substring(0, iO);
            i.e(strSubstring, "substring(...)");
        }
        sb.append(strSubstring);
        sb.append('<');
        sb.append(str2);
        sb.append('>');
        sb.append(L9.f.f0(str, '>', str));
        return sb.toString();
    }

    @Override // A9.r, A9.AbstractC0151y
    public final n E0() {
        InterfaceC0273g interfaceC0273gW = D().w();
        InterfaceC0271e interfaceC0271e = interfaceC0273gW instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gW : null;
        if (interfaceC0271e != null) {
            n nVarE = interfaceC0271e.E(new d());
            i.e(nVarE, "classDescriptor.getMemberScope(RawSubstitution())");
            return nVarE;
        }
        throw new IllegalStateException(("Incorrect classifier: " + D().w()).toString());
    }

    @Override // A9.d0
    public final d0 G0(boolean z6) {
        return new f(this.f383t.G0(z6), this.f384u.G0(z6));
    }

    @Override // A9.d0
    public final d0 K0(B9.f fVar) {
        i.f(fVar, "kotlinTypeRefiner");
        D d3 = this.f383t;
        i.f(d3, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        D d8 = this.f384u;
        i.f(d8, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        return new f(d3, d8);
    }

    @Override // A9.d0
    public final d0 N0(K k3) {
        i.f(k3, "newAttributes");
        return new f(this.f383t.N0(k3), this.f384u.N0(k3));
    }

    @Override // A9.r
    public final D O0() {
        return this.f383t;
    }

    @Override // A9.r
    public final String P0(g gVar, g gVar2) {
        i.f(gVar, "renderer");
        D d3 = this.f383t;
        String strY = gVar.Y(d3);
        D d8 = this.f384u;
        String strY2 = gVar.Y(d8);
        if (gVar2.a.n()) {
            return "raw (" + strY + ".." + strY2 + ')';
        }
        if (d8.l().isEmpty()) {
            return gVar.F(strY, strY2, qa.b.l(this));
        }
        ArrayList arrayListQ0 = Q0(gVar, d3);
        ArrayList arrayListQ1 = Q0(gVar, d8);
        String strZ = k.Z(arrayListQ0, ", ", null, null, e.f5918s, 30);
        ArrayList arrayListZ0 = k.z0(arrayListQ0, arrayListQ1);
        if (!arrayListZ0.isEmpty()) {
            Iterator it = arrayListZ0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strY2 = R0(strY2, strZ);
                    break;
                }
                p076h8.f fVar = (p076h8.f) it.next();
                String str = (String) fVar.f11789s;
                String str2 = (String) fVar.f11790t;
                if (!i.a(str, L9.f.W(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
        } else {
            strY2 = R0(strY2, strZ);
            break;
        }
        String strR0 = R0(strY, strZ);
        return i.a(strR0, strY2) ? strR0 : gVar.F(strR0, strY2, qa.b.l(this));
    }

    @Override // A9.AbstractC0151y
    public final AbstractC0151y l0(B9.f fVar) {
        i.f(fVar, "kotlinTypeRefiner");
        D d3 = this.f383t;
        i.f(d3, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        D d8 = this.f384u;
        i.f(d8, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        return new f(d3, d8);
    }
}
