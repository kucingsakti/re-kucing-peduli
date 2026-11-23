package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class S implements InterfaceC0481b0 {
    public final AbstractC0502w a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f6436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0495o f6437c;

    public S(j0 j0Var, C0495o c0495o, AbstractC0502w abstractC0502w) {
        this.f6436b = j0Var;
        c0495o.getClass();
        this.f6437c = c0495o;
        this.a = abstractC0502w;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final void a(Object obj, InterfaceC0479a0 interfaceC0479a0, C0494n c0494n) {
        ((l0) this.f6436b).getClass();
        AbstractC0502w abstractC0502w = (AbstractC0502w) obj;
        if (abstractC0502w.unknownFields == k0.f6494f) {
            abstractC0502w.unknownFields = k0.b();
        }
        this.f6437c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final void b(Object obj, I i10) {
        this.f6437c.getClass();
        AbstractC0487g.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final int c(AbstractC0502w abstractC0502w) {
        ((l0) this.f6436b).getClass();
        return abstractC0502w.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final void d(Object obj) {
        ((l0) this.f6436b).getClass();
        ((AbstractC0502w) obj).unknownFields.f6498e = false;
        this.f6437c.getClass();
        AbstractC0487g.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final int e(AbstractC0478a abstractC0478a) {
        ((l0) this.f6436b).getClass();
        k0 k0Var = ((AbstractC0502w) abstractC0478a).unknownFields;
        int i10 = k0Var.f6497d;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < k0Var.a; i11++) {
            int i12 = k0Var.f6495b[i11] >>> 3;
            iR += C0491k.r(3, (C0488h) k0Var.f6496c[i11]) + C0491k.z(i12) + C0491k.y(2) + (C0491k.y(1) * 2);
        }
        k0Var.f6497d = iR;
        return iR;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final boolean f(Object obj) {
        this.f6437c.getClass();
        AbstractC0487g.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final boolean g(AbstractC0502w abstractC0502w, AbstractC0502w abstractC0502w2) {
        l0 l0Var = (l0) this.f6436b;
        l0Var.getClass();
        k0 k0Var = abstractC0502w.unknownFields;
        l0Var.getClass();
        return k0Var.equals(abstractC0502w2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final void h(AbstractC0502w abstractC0502w, AbstractC0502w abstractC0502w2) {
        AbstractC0483c0.x(this.f6436b, abstractC0502w, abstractC0502w2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final Object i() {
        return ((AbstractC0500u) this.a.d(5)).c();
    }
}
