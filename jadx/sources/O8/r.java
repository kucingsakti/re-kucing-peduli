package O8;

import L8.C0282p;
import L8.InterfaceC0269c;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p124m9.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractCollection f3733c;

    public /* synthetic */ r(AbstractCollection abstractCollection, int i10) {
        this.f3732b = i10;
        this.f3733c = abstractCollection;
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "fromSuper";
        } else if (i10 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p124m9.m
    public final void b(InterfaceC0269c interfaceC0269c) {
        switch (this.f3732b) {
            case 0:
                if (interfaceC0269c == null) {
                    a(0);
                    throw null;
                }
                p124m9.l.r(interfaceC0269c, null);
                ((LinkedHashSet) this.f3733c).add(interfaceC0269c);
                return;
            default:
                p210v8.i.f(interfaceC0269c, "fakeOverride");
                p124m9.l.r(interfaceC0269c, null);
                ((ArrayList) this.f3733c).add(interfaceC0269c);
                return;
        }
    }

    @Override // p124m9.m
    public final void d(InterfaceC0269c interfaceC0269c, InterfaceC0269c interfaceC0269c2) {
        switch (this.f3732b) {
            case 0:
                if (interfaceC0269c2 != null) {
                    return;
                }
                a(2);
                throw null;
            default:
                p210v8.i.f(interfaceC0269c2, "fromCurrent");
                if (interfaceC0269c2 instanceof w) {
                    ((w) interfaceC0269c2).g1(C0282p.a, interfaceC0269c);
                    return;
                }
                return;
        }
    }
}
