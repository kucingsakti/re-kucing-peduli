package p049f;

import java.util.HashMap;
import p031d.g;
import p068ga.l;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f11382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f11383d;

    public /* synthetic */ d(g gVar, String str, l lVar, int i10) {
        this.a = i10;
        this.f11383d = gVar;
        this.f11381b = str;
        this.f11382c = lVar;
    }

    @Override // p049f.b
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                g gVar = this.f11383d;
                HashMap map = gVar.f10438b;
                String str = this.f11381b;
                Integer num = (Integer) map.get(str);
                l lVar = this.f11382c;
                if (num != null) {
                    gVar.f10440d.add(str);
                    try {
                        gVar.b(num.intValue(), lVar, obj);
                        return;
                    } catch (Exception e10) {
                        gVar.f10440d.remove(str);
                        throw e10;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + lVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                g gVar2 = this.f11383d;
                HashMap map2 = gVar2.f10438b;
                String str2 = this.f11381b;
                Integer num2 = (Integer) map2.get(str2);
                l lVar2 = this.f11382c;
                if (num2 != null) {
                    gVar2.f10440d.add(str2);
                    try {
                        gVar2.b(num2.intValue(), lVar2, obj);
                        return;
                    } catch (Exception e11) {
                        gVar2.f10440d.remove(str2);
                        throw e11;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + lVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    public void b() {
        this.f11383d.e(this.f11381b);
    }
}
