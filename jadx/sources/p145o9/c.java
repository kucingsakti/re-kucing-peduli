package p145o9;

import A9.AbstractC0151y;
import I8.k;
import L8.InterfaceC0290y;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13829b = 1;

    public /* synthetic */ c(Object obj) {
        super(obj);
    }

    @Override // p145o9.g
    public final AbstractC0151y a(InterfaceC0290y interfaceC0290y) {
        switch (this.f13829b) {
            case 0:
                i.f(interfaceC0290y, "module");
                I8.i iVarS = interfaceC0290y.s();
                iVarS.getClass();
                return iVarS.s(k.BOOLEAN);
            case 1:
                i.f(interfaceC0290y, "module");
                I8.i iVarS2 = interfaceC0290y.s();
                iVarS2.getClass();
                return iVarS2.s(k.DOUBLE);
            default:
                i.f(interfaceC0290y, "module");
                I8.i iVarS3 = interfaceC0290y.s();
                iVarS3.getClass();
                return iVarS3.s(k.FLOAT);
        }
    }

    @Override // p145o9.g
    public String toString() {
        switch (this.f13829b) {
            case 1:
                return ((Number) this.a).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) this.a).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public c(double d3) {
        super(Double.valueOf(d3));
    }

    public c(float f10) {
        super(Float.valueOf(f10));
    }
}
