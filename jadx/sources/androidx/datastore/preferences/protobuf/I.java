package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0499t f6415b = new C0499t(1);
    public final Object a;

    public I(C0491k c0491k) {
        AbstractC0505z.a(c0491k, "output");
        this.a = c0491k;
        c0491k.f6489c = this;
    }

    public void a(int i10, C0488h c0488h) {
        ((C0491k) this.a).G(i10, c0488h);
    }

    public void b(int i10, Object obj, InterfaceC0481b0 interfaceC0481b0) {
        C0491k c0491k = (C0491k) this.a;
        c0491k.R(i10, 3);
        interfaceC0481b0.b((AbstractC0478a) obj, c0491k.f6489c);
        c0491k.R(i10, 4);
    }

    public I() {
        O o10;
        try {
            o10 = (O) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            o10 = f6415b;
        }
        O[] oArr = {C0499t.f6512b, o10};
        H h10 = new H();
        h10.a = oArr;
        Charset charset = AbstractC0505z.a;
        this.a = h10;
    }
}
