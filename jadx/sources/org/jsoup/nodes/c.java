package org.jsoup.nodes;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import org.jsoup.SerializationException;
import org.jsoup.helper.ValidationException;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterable, Cloneable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13863s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String[] f13864t = new String[3];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object[] f13865u = new Object[3];

    public static boolean u(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    public final void d(String str, String str2) {
        e(this.f13863s + 1);
        String[] strArr = this.f13864t;
        int i10 = this.f13863s;
        strArr[i10] = str;
        this.f13865u[i10] = str2;
        this.f13863s = i10 + 1;
    }

    public final void e(int i10) {
        qa.b.r(i10 >= this.f13863s);
        String[] strArr = this.f13864t;
        int length = strArr.length;
        if (length >= i10) {
            return;
        }
        int i11 = length >= 3 ? this.f13863s * 2 : 3;
        if (i10 <= i11) {
            i10 = i11;
        }
        this.f13864t = (String[]) Arrays.copyOf(strArr, i10);
        this.f13865u = Arrays.copyOf(this.f13865u, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f13863s != cVar.f13863s) {
            return false;
        }
        for (int i10 = 0; i10 < this.f13863s; i10++) {
            int iR = cVar.r(this.f13864t[i10]);
            if (iR == -1) {
                return false;
            }
            Object obj2 = this.f13865u[i10];
            Object obj3 = cVar.f13865u[iR];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final c clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f13863s = this.f13863s;
            cVar.f13864t = (String[]) Arrays.copyOf(this.f13864t, this.f13863s);
            cVar.f13865u = Arrays.copyOf(this.f13865u, this.f13863s);
            return cVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13865u) + (((this.f13863s * 31) + Arrays.hashCode(this.f13864t)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this);
    }

    public final String k(String str) {
        Object obj;
        int iR = r(str);
        return (iR == -1 || (obj = this.f13865u[iR]) == null) ? "" : (String) obj;
    }

    public final String m(String str) {
        Object obj;
        int iS = s(str);
        return (iS == -1 || (obj = this.f13865u[iS]) == null) ? "" : (String) obj;
    }

    public final void q(StringBuilder sb, g gVar) {
        int i10 = this.f13863s;
        for (int i11 = 0; i11 < i10; i11++) {
            if (!u(this.f13864t[i11])) {
                String strA = a.a(gVar.f13873z, this.f13864t[i11]);
                if (strA != null) {
                    a.c(strA, (String) this.f13865u[i11], sb.append(' '), gVar);
                }
            }
        }
    }

    public final int r(String str) {
        qa.b.w(str);
        for (int i10 = 0; i10 < this.f13863s; i10++) {
            if (str.equals(this.f13864t[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final int s(String str) {
        qa.b.w(str);
        for (int i10 = 0; i10 < this.f13863s; i10++) {
            if (str.equalsIgnoreCase(this.f13864t[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sbB = ra.a.b();
        try {
            q(sbB, new h("").f13874B);
            return ra.a.g(sbB);
        } catch (IOException e10) {
            throw new SerializationException(e10);
        }
    }

    public final void v(String str, String str2) {
        qa.b.w(str);
        int iR = r(str);
        if (iR != -1) {
            this.f13865u[iR] = str2;
        } else {
            d(str, str2);
        }
    }

    public final void w(a aVar) {
        String str = aVar.f13859t;
        if (str == null) {
            str = "";
        }
        v(aVar.f13858s, str);
        aVar.f13860u = this;
    }

    public final void x(int i10) {
        int i11 = this.f13863s;
        if (i10 >= i11) {
            throw new ValidationException("Must be false");
        }
        int i12 = (i11 - i10) - 1;
        if (i12 > 0) {
            String[] strArr = this.f13864t;
            int i13 = i10 + 1;
            System.arraycopy(strArr, i13, strArr, i10, i12);
            Object[] objArr = this.f13865u;
            System.arraycopy(objArr, i13, objArr, i10, i12);
        }
        int i14 = this.f13863s - 1;
        this.f13863s = i14;
        this.f13864t[i14] = null;
        this.f13865u[i14] = null;
    }
}
