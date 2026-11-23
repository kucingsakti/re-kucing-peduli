package A9;

import L8.InterfaceC0273g;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class J extends P {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f337d;

    public /* synthetic */ J(Object obj, int i10) {
        this.f336c = i10;
        this.f337d = obj;
    }

    @Override // A9.W
    public boolean a() {
        switch (this.f336c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override // A9.W
    public boolean e() {
        switch (this.f336c) {
            case 1:
                return ((Map) this.f337d).isEmpty();
            default:
                return super.e();
        }
    }

    @Override // A9.P
    public final S g(O o10) {
        switch (this.f336c) {
            case 0:
                p210v8.i.f(o10, "key");
                if (!((ArrayList) this.f337d).contains(o10)) {
                    return null;
                }
                InterfaceC0273g interfaceC0273gW = o10.w();
                p210v8.i.d(interfaceC0273gW, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                return b0.j((L8.P) interfaceC0273gW);
            default:
                p210v8.i.f(o10, "key");
                return (S) ((Map) this.f337d).get(o10);
        }
    }
}
