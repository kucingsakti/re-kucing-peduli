package O8;

import A9.AbstractC0135h;
import A9.AbstractC0151y;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: O8.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0362s extends t9.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p247z9.e f3734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p247z9.e f3735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p247z9.i f3736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0363t f3737e;

    public C0362s(C0363t c0363t, p247z9.l lVar) {
        if (lVar == null) {
            h(0);
            throw null;
        }
        this.f3737e = c0363t;
        this.f3734b = lVar.b(new C0361q(this, 0));
        int i10 = 1;
        this.f3735c = lVar.b(new C0361q(this, i10));
        this.f3736d = new p247z9.i(lVar, new C0351g(this, i10));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public static /* synthetic */ void h(int i10) {
        String str;
        int i11;
        if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 4:
            case 5:
            case 8:
            case 10:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 2:
            case 6:
                objArr[0] = "location";
                break;
            case 3:
            case 7:
            case 9:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                break;
            case 11:
                objArr[0] = "fromSupertypes";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[0] = "kindFilter";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[0] = "nameFilter";
                break;
            case 20:
                objArr[0] = R5.a.PUSH_MINIFIED_BUTTON_ICON;
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "getContributedVariables";
        } else if (i10 == 7) {
            objArr[1] = "getContributedFunctions";
        } else if (i10 == 9) {
            objArr[1] = "getSupertypeScope";
        } else if (i10 != 12) {
            switch (i10) {
                case 15:
                    objArr[1] = "getContributedDescriptors";
                    break;
                case 16:
                    objArr[1] = "computeAllDeclarations";
                    break;
                case 17:
                    objArr[1] = "getFunctionNames";
                    break;
                case 18:
                    objArr[1] = "getClassifierNames";
                    break;
                case 19:
                    objArr[1] = "getVariableNames";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
            }
        } else {
            objArr[1] = "resolveFakeOverrides";
        }
        switch (i10) {
            case 1:
            case 2:
                objArr[2] = "getContributedVariables";
                break;
            case 3:
            case 7:
            case 9:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 4:
                objArr[2] = "computeProperties";
                break;
            case 5:
            case 6:
                objArr[2] = "getContributedFunctions";
                break;
            case 8:
                objArr[2] = "computeFunctions";
                break;
            case 10:
            case 11:
                objArr[2] = "resolveFakeOverrides";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[2] = "getContributedDescriptors";
                break;
            case 20:
                objArr[2] = "printScopeStructure";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // t9.o, t9.n
    public final Collection b(p096j9.f fVar, T8.b bVar) {
        if (fVar != null) {
            return (Collection) this.f3735c.invoke(fVar);
        }
        h(1);
        throw null;
    }

    @Override // t9.o, t9.n
    public final Collection c(p096j9.f fVar, T8.b bVar) {
        if (fVar != null) {
            return (Collection) this.f3734b.invoke(fVar);
        }
        h(5);
        throw null;
    }

    @Override // t9.o, t9.n
    public final Set d() {
        Set set = (Set) this.f3737e.f3738A.invoke();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // t9.o, t9.n
    public final Set e() {
        Set set = (Set) this.f3737e.f3738A.invoke();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    @Override // t9.o, t9.p
    public final Collection f(t9.f fVar, p200u8.b bVar) {
        if (fVar == null) {
            h(13);
            throw null;
        }
        Collection collection = (Collection) this.f3736d.invoke();
        if (collection != null) {
            return collection;
        }
        h(15);
        throw null;
    }

    @Override // t9.o, t9.n
    public final Set g() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        h(18);
        throw null;
    }

    public final t9.n i() {
        t9.n nVarE0 = ((AbstractC0151y) ((AbstractC0135h) this.f3737e.I()).t().iterator().next()).E0();
        if (nVarE0 != null) {
            return nVarE0;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(p096j9.f fVar, Collection collection) {
        if (fVar == null) {
            h(10);
            throw null;
        }
        if (collection == null) {
            h(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        p124m9.l.f13174c.h(fVar, collection, Collections.EMPTY_SET, this.f3737e, new r(linkedHashSet, 0));
        return linkedHashSet;
    }
}
