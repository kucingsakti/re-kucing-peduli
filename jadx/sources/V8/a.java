package V8;

import L8.InterfaceC0269c;
import java.util.Collection;
import java.util.LinkedHashSet;
import p124m9.l;
import p124m9.m;

/* JADX INFO: loaded from: classes.dex */
public final class a extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p220w9.j f5200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f5201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5202d;

    public a(p220w9.j jVar, LinkedHashSet linkedHashSet, boolean z6) {
        this.f5200b = jVar;
        this.f5201c = linkedHashSet;
        this.f5202d = z6;
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "fromSuper";
        } else if (i10 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i10 == 3) {
            objArr[0] = "member";
        } else if (i10 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "conflict";
        } else if (i10 == 3 || i10 == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p124m9.m
    public final void b(InterfaceC0269c interfaceC0269c) {
        if (interfaceC0269c == null) {
            a(0);
            throw null;
        }
        l.r(interfaceC0269c, new I8.g(this, 2));
        this.f5201c.add(interfaceC0269c);
    }

    @Override // p124m9.m
    public final void d(InterfaceC0269c interfaceC0269c, InterfaceC0269c interfaceC0269c2) {
        if (interfaceC0269c2 != null) {
            return;
        }
        a(2);
        throw null;
    }

    @Override // p124m9.m
    public final void p(InterfaceC0269c interfaceC0269c, Collection collection) {
        if (interfaceC0269c == null) {
            a(3);
            throw null;
        }
        if (!this.f5202d || interfaceC0269c.V() == 2) {
            interfaceC0269c.p0(collection);
        }
    }
}
