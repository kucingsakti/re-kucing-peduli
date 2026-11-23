package M8;

import A9.AbstractC0151y;
import A9.D;
import L8.InterfaceC0271e;
import L8.M;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {
    public final D a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f3184c;

    public c(D d3, Map map, M m2) {
        if (d3 == null) {
            c(0);
            throw null;
        }
        if (map == null) {
            c(1);
            throw null;
        }
        this.a = d3;
        this.f3183b = map;
        this.f3184c = m2;
    }

    public static /* synthetic */ void c(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // M8.b
    public final p096j9.c a() {
        InterfaceC0271e interfaceC0271eD = p165q9.d.d(this);
        if (interfaceC0271eD != null) {
            if (C9.i.f(interfaceC0271eD)) {
                interfaceC0271eD = null;
            }
            if (interfaceC0271eD != null) {
                return p165q9.d.c(interfaceC0271eD);
            }
        }
        return null;
    }

    @Override // M8.b
    public final Map b() {
        Map map = this.f3183b;
        if (map != null) {
            return map;
        }
        c(4);
        throw null;
    }

    @Override // M8.b
    public final M g() {
        M m2 = this.f3184c;
        if (m2 != null) {
            return m2;
        }
        c(5);
        throw null;
    }

    @Override // M8.b
    public final AbstractC0151y getType() {
        D d3 = this.a;
        if (d3 != null) {
            return d3;
        }
        c(3);
        throw null;
    }

    public final String toString() {
        return p114l9.g.f12982c.x(this, null);
    }
}
