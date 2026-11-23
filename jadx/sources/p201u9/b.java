package p201u9;

import A9.AbstractC0151y;
import B1.a;
import L8.InterfaceC0268b;
import O8.AbstractC0360p;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC0360p f15360t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(InterfaceC0268b interfaceC0268b, AbstractC0151y abstractC0151y) {
        super(abstractC0151y);
        if (abstractC0151y == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.f15360t = (AbstractC0360p) interfaceC0268b;
    }

    public final String toString() {
        return getType() + ": Ext {" + this.f15360t + "}";
    }
}
