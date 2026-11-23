package org.jsoup.nodes;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import org.jsoup.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Map.Entry, Cloneable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String[] f13853v = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f13854w = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f13855x = Pattern.compile("[^-a-zA-Z0-9_:.]");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f13856y = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f13857z = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f13858s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f13859t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f13860u;

    public a(String str, String str2, c cVar) {
        qa.b.w(str);
        String strTrim = str.trim();
        qa.b.u(strTrim);
        this.f13858s = strTrim;
        this.f13859t = str2;
        this.f13860u = cVar;
    }

    public static String a(int i10, String str) {
        if (i10 == 2) {
            Pattern pattern = f13854w;
            if (!pattern.matcher(str).matches()) {
                String strReplaceAll = f13855x.matcher(str).replaceAll("");
                if (pattern.matcher(strReplaceAll).matches()) {
                    return strReplaceAll;
                }
                return null;
            }
        }
        if (i10 == 1) {
            Pattern pattern2 = f13856y;
            if (!pattern2.matcher(str).matches()) {
                String strReplaceAll2 = f13857z.matcher(str).replaceAll("");
                if (pattern2.matcher(strReplaceAll2).matches()) {
                    return strReplaceAll2;
                }
                return null;
            }
        }
        return str;
    }

    public static void c(String str, String str2, Appendable appendable, g gVar) throws IOException {
        appendable.append(str);
        if (gVar.f13873z == 1) {
            if (str2 == null) {
                return;
            }
            if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(f13853v, J7.j.t(str)) >= 0) {
                return;
            }
        }
        appendable.append("=\"");
        if (str2 == null) {
            str2 = "";
        }
        m.b(appendable, str2, gVar, true, false, false, false);
        appendable.append('\"');
    }

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            String str = aVar.f13858s;
            String str2 = this.f13858s;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f13859t;
            String str4 = aVar.f13859t;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f13858s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        String str = this.f13859t;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f13858s;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f13859t;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        String str;
        int iR;
        String str2 = (String) obj;
        String strK = this.f13859t;
        c cVar = this.f13860u;
        if (cVar != null && (iR = cVar.r((str = this.f13858s))) != -1) {
            strK = this.f13860u.k(str);
            this.f13860u.f13865u[iR] = str2;
        }
        this.f13859t = str2;
        return strK == null ? "" : strK;
    }

    public final String toString() {
        StringBuilder sbB = ra.a.b();
        try {
            g gVar = new h("").f13874B;
            String str = this.f13859t;
            String strA = a(gVar.f13873z, this.f13858s);
            if (strA != null) {
                c(strA, str, sbB, gVar);
            }
            return ra.a.g(sbB);
        } catch (IOException e10) {
            throw new SerializationException(e10);
        }
    }
}
