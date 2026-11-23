package M1;

import L9.f;
import X9.w;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import p068ga.l;
import p086i8.C;
import p210v8.i;
import p232y1.k;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final ArrayList a;

    public c(int i10) {
        switch (i10) {
            case 1:
                this.a = new ArrayList();
                break;
            case 2:
                this.a = new ArrayList();
                break;
            case 3:
                this.a = new ArrayList(20);
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public void a(String str, String str2) {
        i.f(str, MediationMetaData.KEY_NAME);
        i.f(str2, "value");
        C.e(str);
        C.f(str2, str);
        c(str, str2);
    }

    public void b(String str) {
        int iO = f.O(str, ':', 1, 4);
        if (iO != -1) {
            String strSubstring = str.substring(0, iO);
            i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strSubstring2 = str.substring(iO + 1);
            i.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            c(strSubstring, strSubstring2);
            return;
        }
        if (str.charAt(0) != ':') {
            c("", str);
            return;
        }
        String strSubstring3 = str.substring(1);
        i.e(strSubstring3, "this as java.lang.String).substring(startIndex)");
        c("", strSubstring3);
    }

    public void c(String str, String str2) {
        i.f(str, MediationMetaData.KEY_NAME);
        i.f(str2, "value");
        ArrayList arrayList = this.a;
        arrayList.add(str);
        arrayList.add(f.j0(str2).toString());
    }

    public w d() {
        Object[] array = this.a.toArray(new String[0]);
        if (array != null) {
            return new w((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public synchronized a e(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return d.f2880t;
        }
        for (b bVar : this.a) {
            if (bVar.a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f2878b)) {
                return bVar.f2879c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public String f(String str) {
        i.f(str, MediationMetaData.KEY_NAME);
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 2;
        int i10 = l.i(size, 0, -2);
        if (i10 > size) {
            return null;
        }
        while (true) {
            int i11 = size - 2;
            if (str.equalsIgnoreCase((String) arrayList.get(size))) {
                return (String) arrayList.get(size + 1);
            }
            if (size == i10) {
                return null;
            }
            size = i11;
        }
    }

    public synchronized k g(Class cls) {
        int size = this.a.size();
        for (int i10 = 0; i10 < size; i10++) {
            P1.d dVar = (P1.d) this.a.get(i10);
            if (dVar.a.isAssignableFrom(cls)) {
                return dVar.f3837b;
            }
        }
        return null;
    }

    public synchronized ArrayList h(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (b bVar : this.a) {
            if ((bVar.a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f2878b)) && !arrayList.contains(bVar.f2878b)) {
                arrayList.add(bVar.f2878b);
            }
        }
        return arrayList;
    }

    public void i(String str) {
        i.f(str, MediationMetaData.KEY_NAME);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i10))) {
                arrayList.remove(i10);
                arrayList.remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
    }
}
