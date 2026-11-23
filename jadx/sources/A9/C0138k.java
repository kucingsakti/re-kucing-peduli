package A9;

import L8.InterfaceC0271e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: A9.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0138k extends AbstractC0129b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O8.B f375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Collection f377e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0138k(O8.B b3, List list, Collection collection, p247z9.l lVar) {
        super((p247z9.o) lVar);
        if (list == null) {
            h(1);
            throw null;
        }
        if (collection == null) {
            h(2);
            throw null;
        }
        if (lVar == null) {
            h(3);
            throw null;
        }
        this.f375c = b3;
        this.f376d = Collections.unmodifiableList(new ArrayList(list));
        this.f377e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void h(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // A9.AbstractC0135h
    public final Collection b() {
        Collection collection = this.f377e;
        if (collection != null) {
            return collection;
        }
        h(6);
        throw null;
    }

    @Override // A9.AbstractC0135h
    public final L8.N d() {
        return L8.N.f2801u;
    }

    @Override // A9.AbstractC0129b
    /* JADX INFO: renamed from: i */
    public final InterfaceC0271e w() {
        O8.B b3 = this.f375c;
        if (b3 != null) {
            return b3;
        }
        h(5);
        throw null;
    }

    public final String toString() {
        String str = p124m9.e.g(this.f375c).a;
        if (str != null) {
            return str;
        }
        p096j9.e.a(4);
        throw null;
    }

    @Override // A9.O
    public final List u() {
        List list = this.f376d;
        if (list != null) {
            return list;
        }
        h(4);
        throw null;
    }

    @Override // A9.O
    public final boolean v() {
        return true;
    }
}
