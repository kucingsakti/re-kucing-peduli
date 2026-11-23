package p107l1;

import android.os.Build;
import o1.o;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12891f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(B7.a aVar, int i10) {
        super(aVar);
        this.f12891f = i10;
    }

    @Override // p107l1.b
    public final boolean a(o oVar) {
        switch (this.f12891f) {
            case 0:
                i.f(oVar, "workSpec");
                return oVar.j.f11397b;
            case 1:
                i.f(oVar, "workSpec");
                return oVar.j.f11399d;
            case 2:
                i.f(oVar, "workSpec");
                return oVar.j.a == 2;
            case 3:
                i.f(oVar, "workSpec");
                int i10 = oVar.j.a;
                return i10 == 3 || (Build.VERSION.SDK_INT >= 30 && i10 == 6);
            default:
                i.f(oVar, "workSpec");
                return oVar.j.f11400e;
        }
    }

    @Override // p107l1.b
    public final boolean b(Object obj) {
        switch (this.f12891f) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                k1.a aVar = (k1.a) obj;
                i.f(aVar, "value");
                int i10 = Build.VERSION.SDK_INT;
                boolean z6 = aVar.a;
                return i10 < 26 ? !z6 : !(z6 && aVar.f12681b);
            case 3:
                k1.a aVar2 = (k1.a) obj;
                i.f(aVar2, "value");
                return !aVar2.a || aVar2.f12682c;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }
}
