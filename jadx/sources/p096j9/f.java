package p096j9;

import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f12551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f12552t;

    public f(String str, boolean z6) {
        if (str == null) {
            f(0);
            throw null;
        }
        this.f12551s = str;
        this.f12552t = z6;
    }

    public static /* synthetic */ void f(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = MediationMetaData.KEY_NAME;
        }
        if (i10 == 1) {
            objArr[1] = "asString";
        } else if (i10 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static f i(String str) {
        if (str != null) {
            return str.startsWith("<") ? l(str) : j(str);
        }
        f(8);
        throw null;
    }

    public static f j(String str) {
        if (str != null) {
            return new f(str, false);
        }
        f(5);
        throw null;
    }

    public static boolean k(String str) {
        if (str == null) {
            f(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static f l(String str) {
        if (str == null) {
            f(7);
            throw null;
        }
        if (str.startsWith("<")) {
            return new f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12551s.compareTo(((f) obj).f12551s);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f12552t == fVar.f12552t && this.f12551s.equals(fVar.f12551s);
    }

    public final String g() {
        String str = this.f12551s;
        if (str != null) {
            return str;
        }
        f(1);
        throw null;
    }

    public final String h() {
        if (this.f12552t) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strG = g();
        if (strG != null) {
            return strG;
        }
        f(2);
        throw null;
    }

    public final int hashCode() {
        return (this.f12551s.hashCode() * 31) + (this.f12552t ? 1 : 0);
    }

    public final String toString() {
        return this.f12551s;
    }
}
