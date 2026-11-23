package i9;

import K9.r;
import L9.n;
import h9.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import p086i8.k;
import p086i8.l;
import p086i8.m;
import p086i8.u;
import p086i8.v;
import p086i8.z;
import p104k9.AbstractC0675d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g implements p067g9.f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final List f12340v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String[] f12341s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Set f12342t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f12343u;

    static {
        String strZ = k.Z(l.C('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listC = l.C(strZ.concat("/Any"), strZ.concat("/Nothing"), strZ.concat("/Unit"), strZ.concat("/Throwable"), strZ.concat("/Number"), strZ.concat("/Byte"), strZ.concat("/Double"), strZ.concat("/Float"), strZ.concat("/Int"), strZ.concat("/Long"), strZ.concat("/Short"), strZ.concat("/Boolean"), strZ.concat("/Char"), strZ.concat("/CharSequence"), strZ.concat("/String"), strZ.concat("/Comparable"), strZ.concat("/Enum"), strZ.concat("/Array"), strZ.concat("/ByteArray"), strZ.concat("/DoubleArray"), strZ.concat("/FloatArray"), strZ.concat("/IntArray"), strZ.concat("/LongArray"), strZ.concat("/ShortArray"), strZ.concat("/BooleanArray"), strZ.concat("/CharArray"), strZ.concat("/Cloneable"), strZ.concat("/Annotation"), strZ.concat("/collections/Iterable"), strZ.concat("/collections/MutableIterable"), strZ.concat("/collections/Collection"), strZ.concat("/collections/MutableCollection"), strZ.concat("/collections/List"), strZ.concat("/collections/MutableList"), strZ.concat("/collections/Set"), strZ.concat("/collections/MutableSet"), strZ.concat("/collections/Map"), strZ.concat("/collections/MutableMap"), strZ.concat("/collections/Map.Entry"), strZ.concat("/collections/MutableMap.MutableEntry"), strZ.concat("/collections/Iterator"), strZ.concat("/collections/MutableIterator"), strZ.concat("/collections/ListIterator"), strZ.concat("/collections/MutableListIterator"));
        f12340v = listC;
        r rVarY0 = k.y0(listC);
        int iS = z.s(m.H(rVarY0, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        Iterator it = rVarY0.iterator();
        while (true) {
            K9.b bVar = (K9.b) it;
            if (!bVar.f2675t.hasNext()) {
                return;
            }
            v vVar = (v) bVar.next();
            linkedHashMap.put((String) vVar.f12331b, Integer.valueOf(vVar.a));
        }
    }

    public g(j jVar, String[] strArr) {
        i.f(strArr, "strings");
        List list = jVar.f11874u;
        Set setW0 = list.isEmpty() ? u.f12330s : k.w0(list);
        List<h9.i> list2 = jVar.f11873t;
        i.e(list2, "types.recordList");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (h9.i iVar : list2) {
            int i10 = iVar.f11864u;
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(iVar);
            }
        }
        arrayList.trimToSize();
        this.f12341s = strArr;
        this.f12342t = setW0;
        this.f12343u = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // p067g9.f
    public final String getString(int i10) {
        String strF;
        h9.i iVar = (h9.i) this.f12343u.get(i10);
        int i11 = iVar.f11863t;
        if ((i11 & 4) == 4) {
            Object obj = iVar.f11866w;
            if (obj instanceof String) {
                strF = (String) obj;
            } else {
                AbstractC0675d abstractC0675d = (AbstractC0675d) obj;
                String strV = abstractC0675d.v();
                if (abstractC0675d.n()) {
                    iVar.f11866w = strV;
                }
                strF = strV;
            }
        } else if ((i11 & 2) == 2) {
            List list = f12340v;
            int size = list.size();
            int i12 = iVar.f11865v;
            if (i12 < 0 || i12 >= size) {
                strF = this.f12341s[i10];
            } else {
                strF = (String) list.get(i12);
            }
        } else {
            strF = this.f12341s[i10];
        }
        if (iVar.f11868y.size() >= 2) {
            List list2 = iVar.f11868y;
            i.e(list2, "substringIndexList");
            Integer num = (Integer) list2.get(0);
            Integer num2 = (Integer) list2.get(1);
            i.e(num, "begin");
            if (num.intValue() >= 0) {
                int iIntValue = num.intValue();
                i.e(num2, "end");
                if (iIntValue <= num2.intValue() && num2.intValue() <= strF.length()) {
                    strF = strF.substring(num.intValue(), num2.intValue());
                    i.e(strF, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        if (iVar.f11858A.size() >= 2) {
            List list3 = iVar.f11858A;
            i.e(list3, "replaceCharList");
            Integer num3 = (Integer) list3.get(0);
            Integer num4 = (Integer) list3.get(1);
            i.e(strF, "string");
            strF = n.F(strF, (char) num3.intValue(), (char) num4.intValue());
        }
        h9.h hVar = iVar.f11867x;
        if (hVar == null) {
            hVar = h9.h.NONE;
        }
        int iOrdinal = hVar.ordinal();
        if (iOrdinal == 1) {
            i.e(strF, "string");
            strF = n.F(strF, '$', '.');
        } else if (iOrdinal == 2) {
            if (strF.length() >= 2) {
                strF = strF.substring(1, strF.length() - 1);
                i.e(strF, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            strF = n.F(strF, '$', '.');
        }
        i.e(strF, "string");
        return strF;
    }

    @Override // p067g9.f
    public final boolean j(int i10) {
        return this.f12342t.contains(Integer.valueOf(i10));
    }

    @Override // p067g9.f
    public final String n(int i10) {
        return getString(i10);
    }
}
