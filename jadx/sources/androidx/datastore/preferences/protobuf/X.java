package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X f6439c = new X();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f6440b = new ConcurrentHashMap();
    public final I a = new I();

    public final InterfaceC0481b0 a(Class cls) {
        InterfaceC0481b0 interfaceC0481b0X;
        Class cls2;
        AbstractC0505z.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f6440b;
        InterfaceC0481b0 interfaceC0481b0 = (InterfaceC0481b0) concurrentHashMap.get(cls);
        if (interfaceC0481b0 != null) {
            return interfaceC0481b0;
        }
        I i10 = this.a;
        i10.getClass();
        Class cls3 = AbstractC0483c0.a;
        if (!AbstractC0502w.class.isAssignableFrom(cls) && (cls2 = AbstractC0483c0.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        Z zA = ((H) i10.a).a(cls);
        if ((zA.f6446d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC0502w.class.isAssignableFrom(cls);
            AbstractC0502w abstractC0502w = zA.a;
            if (zIsAssignableFrom) {
                interfaceC0481b0X = new S(AbstractC0483c0.f6451d, AbstractC0496p.a, abstractC0502w);
            } else {
                j0 j0Var = AbstractC0483c0.f6449b;
                C0495o c0495o = AbstractC0496p.f6503b;
                if (c0495o == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                interfaceC0481b0X = new S(j0Var, c0495o, abstractC0502w);
            }
        } else if (AbstractC0502w.class.isAssignableFrom(cls)) {
            interfaceC0481b0X = (zA.f6446d & 1) == 1 ? Q.x(zA, U.f6438b, F.f6414b, AbstractC0483c0.f6451d, AbstractC0496p.a, N.f6420b) : Q.x(zA, U.f6438b, F.f6414b, AbstractC0483c0.f6451d, null, N.f6420b);
        } else if ((zA.f6446d & 1) == 1) {
            T t7 = U.a;
            D d3 = F.a;
            j0 j0Var2 = AbstractC0483c0.f6449b;
            C0495o c0495o2 = AbstractC0496p.f6503b;
            if (c0495o2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            interfaceC0481b0X = Q.x(zA, t7, d3, j0Var2, c0495o2, N.a);
        } else {
            interfaceC0481b0X = Q.x(zA, U.a, F.a, AbstractC0483c0.f6450c, null, N.a);
        }
        InterfaceC0481b0 interfaceC0481b1 = (InterfaceC0481b0) concurrentHashMap.putIfAbsent(cls, interfaceC0481b0X);
        return interfaceC0481b1 != null ? interfaceC0481b1 : interfaceC0481b0X;
    }
}
