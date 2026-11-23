package p096j9;

import com.unity3d.ads.metadata.MediationMetaData;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f12543c = new c("");
    public final e a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c f12544b;

    public c(String str) {
        if (str != null) {
            this.a = new e(str, this);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i11 = 2;
                break;
            case 8:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[0] = "segment";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[2] = "startsWith";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static c j(f fVar) {
        if (fVar == null) {
            a(13);
            throw null;
        }
        if (fVar != null) {
            return new c(new e(fVar.g(), f12543c.i(), fVar));
        }
        e.a(16);
        throw null;
    }

    public final String b() {
        String str = this.a.a;
        if (str != null) {
            return str;
        }
        e.a(4);
        throw null;
    }

    public final c c(f fVar) {
        if (fVar != null) {
            return new c(this.a.b(fVar), this);
        }
        a(8);
        throw null;
    }

    public final boolean d() {
        return this.a.a.isEmpty();
    }

    public final c e() {
        c cVar = this.f12544b;
        if (cVar != null) {
            if (cVar != null) {
                return cVar;
            }
            a(6);
            throw null;
        }
        if (d()) {
            throw new IllegalStateException("root");
        }
        e eVar = this.a;
        e eVar2 = eVar.f12549c;
        if (eVar2 == null) {
            if (eVar.a.isEmpty()) {
                throw new IllegalStateException("root");
            }
            eVar.c();
            eVar2 = eVar.f12549c;
            if (eVar2 == null) {
                e.a(8);
                throw null;
            }
        }
        c cVar2 = new c(eVar2);
        this.f12544b = cVar2;
        return cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a.equals(((c) obj).a);
    }

    public final f f() {
        f fVarF = this.a.f();
        if (fVarF != null) {
            return fVarF;
        }
        a(9);
        throw null;
    }

    public final f g() {
        e eVar = this.a;
        if (eVar.a.isEmpty()) {
            f fVar = e.f12545e;
            if (fVar != null) {
                return fVar;
            }
            e.a(12);
            throw null;
        }
        f fVarF = eVar.f();
        if (fVarF != null) {
            return fVarF;
        }
        e.a(13);
        throw null;
    }

    public final boolean h(f fVar) {
        if (fVar == null) {
            a(12);
            throw null;
        }
        String str = this.a.a;
        if (str.isEmpty()) {
            return false;
        }
        int iIndexOf = str.indexOf(46);
        String strG = fVar.g();
        if (iIndexOf == -1) {
            iIndexOf = Math.max(str.length(), strG.length());
        }
        return str.regionMatches(0, strG, 0, iIndexOf);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final e i() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.a.toString();
    }

    public c(e eVar) {
        if (eVar != null) {
            this.a = eVar;
        } else {
            a(2);
            throw null;
        }
    }

    public c(e eVar, c cVar) {
        this.a = eVar;
        this.f12544b = cVar;
    }
}
