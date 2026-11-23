package N8;

import L8.InterfaceC0271e;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collection;
import p086i8.s;
import p096j9.f;
import p210v8.i;
import p238y9.p;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3403b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3404c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f3405d = new a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f3406e = new a(3);
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // N8.d
    public boolean a(InterfaceC0271e interfaceC0271e, p pVar) {
        switch (this.a) {
            case 1:
                i.f(interfaceC0271e, "classDescriptor");
                return true;
            default:
                i.f(interfaceC0271e, "classDescriptor");
                return !pVar.q().E(e.a);
        }
    }

    @Override // N8.b
    public Collection b(InterfaceC0271e interfaceC0271e) {
        i.f(interfaceC0271e, "classDescriptor");
        return s.f12328s;
    }

    @Override // N8.b
    public Collection c(InterfaceC0271e interfaceC0271e) {
        i.f(interfaceC0271e, "classDescriptor");
        return s.f12328s;
    }

    @Override // N8.b
    public Collection d(f fVar, InterfaceC0271e interfaceC0271e) {
        i.f(fVar, MediationMetaData.KEY_NAME);
        i.f(interfaceC0271e, "classDescriptor");
        return s.f12328s;
    }

    @Override // N8.b
    public Collection e(InterfaceC0271e interfaceC0271e) {
        i.f(interfaceC0271e, "classDescriptor");
        return s.f12328s;
    }
}
