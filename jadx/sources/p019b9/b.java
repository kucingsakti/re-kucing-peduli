package p019b9;

import A9.AbstractC0151y;
import C9.i;
import L8.InterfaceC0271e;
import L8.M;
import java.util.Map;
import p096j9.c;
import p165q9.d;

/* JADX INFO: loaded from: classes.dex */
public final class b implements M8.b {
    public static final b a = new b();

    @Override // M8.b
    public final c a() {
        InterfaceC0271e interfaceC0271eD = d.d(this);
        if (interfaceC0271eD != null) {
            if (i.f(interfaceC0271eD)) {
                interfaceC0271eD = null;
            }
            if (interfaceC0271eD != null) {
                return d.c(interfaceC0271eD);
            }
        }
        return null;
    }

    @Override // M8.b
    public final Map b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // M8.b
    public final M g() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // M8.b
    public final AbstractC0151y getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
