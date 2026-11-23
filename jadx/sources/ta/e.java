package ta;

import E4.C0187a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p188t1.Y;

/* JADX INFO: loaded from: classes.dex */
public final class e extends m {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15271b;

    public /* synthetic */ e(String str, boolean z6, int i10) {
        this.a = i10;
        this.f15271b = str;
    }

    @Override // ta.m
    public final boolean a(org.jsoup.nodes.k kVar, org.jsoup.nodes.k kVar2) {
        switch (this.a) {
            case 0:
                return kVar2.m(this.f15271b);
            case 1:
                org.jsoup.nodes.c cVarE = kVar2.e();
                cVarE.getClass();
                ArrayList arrayList = new ArrayList(cVarE.f13863s);
                for (int i10 = 0; i10 < cVarE.f13863s; i10++) {
                    if (!org.jsoup.nodes.c.u(cVarE.f13864t[i10])) {
                        arrayList.add(new org.jsoup.nodes.a(cVarE.f13864t[i10], (String) cVarE.f13865u[i10], cVarE));
                    }
                }
                Iterator it = Collections.unmodifiableList(arrayList).iterator();
                while (it.hasNext()) {
                    if (J7.j.t(((org.jsoup.nodes.a) it.next()).f13858s).startsWith(this.f15271b)) {
                        return true;
                    }
                }
                return false;
            case 2:
                org.jsoup.nodes.c cVar = kVar2.f13883y;
                if (cVar == null) {
                    return false;
                }
                String strM = cVar.m("class");
                int length = strM.length();
                String str = this.f15271b;
                int length2 = str.length();
                if (length == 0 || length < length2) {
                    return false;
                }
                if (length == length2) {
                    return str.equalsIgnoreCase(strM);
                }
                boolean z6 = false;
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (Character.isWhitespace(strM.charAt(i12))) {
                        if (!z6) {
                            continue;
                        } else {
                            if (i12 - i11 == length2 && strM.regionMatches(true, i11, str, 0, length2)) {
                                return true;
                            }
                            z6 = false;
                        }
                    } else if (!z6) {
                        i11 = i12;
                        z6 = true;
                    }
                }
                if (z6 && length - i11 == length2) {
                    return strM.regionMatches(true, i11, str, 0, length2);
                }
                return false;
            case 3:
                return J7.j.t(kVar2.G()).contains(this.f15271b);
            case 4:
                return J7.j.t(kVar2.J()).contains(this.f15271b);
            case 5:
                return J7.j.t(kVar2.P()).contains(this.f15271b);
            case 6:
                return kVar2.Q().contains(this.f15271b);
            case 7:
                kVar2.getClass();
                StringBuilder sbB = ra.a.b();
                Y.z(new C0187a(sbB, 25), kVar2);
                return ra.a.g(sbB).contains(this.f15271b);
            case 8:
                org.jsoup.nodes.c cVar2 = kVar2.f13883y;
                return this.f15271b.equals(cVar2 != null ? cVar2.m("id") : "");
            case 9:
                return kVar2.f13880v.f14812t.equals(this.f15271b);
            default:
                return kVar2.f13880v.f14812t.endsWith(this.f15271b);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return E0.a.l(new StringBuilder("["), this.f15271b, "]");
            case 1:
                return E0.a.l(new StringBuilder("[^"), this.f15271b, "]");
            case 2:
                return "." + this.f15271b;
            case 3:
                return E0.a.l(new StringBuilder(":containsData("), this.f15271b, ")");
            case 4:
                return E0.a.l(new StringBuilder(":containsOwn("), this.f15271b, ")");
            case 5:
                return E0.a.l(new StringBuilder(":contains("), this.f15271b, ")");
            case 6:
                return E0.a.l(new StringBuilder(":containsWholeOwnText("), this.f15271b, ")");
            case 7:
                return E0.a.l(new StringBuilder(":containsWholeText("), this.f15271b, ")");
            case 8:
                return "#" + this.f15271b;
            case 9:
                return this.f15271b;
            default:
                return this.f15271b;
        }
    }

    public e(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 3:
                this.f15271b = J7.j.t(str);
                break;
            case 4:
                StringBuilder sbB = ra.a.b();
                ra.a.a(str, sbB, false);
                this.f15271b = J7.j.t(ra.a.g(sbB));
                break;
            case 5:
                StringBuilder sbB2 = ra.a.b();
                ra.a.a(str, sbB2, false);
                this.f15271b = J7.j.t(ra.a.g(sbB2));
                break;
            default:
                qa.b.u(str);
                this.f15271b = J7.j.t(str);
                break;
        }
    }
}
