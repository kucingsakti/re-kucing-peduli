package p037d9;

import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import p029c9.k;
import p029c9.l;
import p096j9.b;
import p096j9.f;

/* JADX INFO: loaded from: classes.dex */
public final class c implements k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f10563t;

    public /* synthetic */ c(e eVar, int i10) {
        this.f10562s = i10;
        this.f10563t = eVar;
    }

    @Override // p029c9.k
    public final void o() {
        int i10 = this.f10562s;
    }

    @Override // p029c9.k
    public final void p(f fVar, Object obj) {
        switch (this.f10562s) {
            case 0:
                String strG = fVar.g();
                boolean zEquals = "k".equals(strG);
                e eVar = this.f10563t;
                if (zEquals) {
                    if (obj instanceof Integer) {
                        a aVar = (a) a.f10552t.get((Integer) obj);
                        if (aVar == null) {
                            aVar = a.UNKNOWN;
                        }
                        eVar.f10572g = aVar;
                    }
                    break;
                } else if ("mv".equals(strG)) {
                    if (obj instanceof int[]) {
                        eVar.a = (int[]) obj;
                    }
                    break;
                } else if ("xs".equals(strG)) {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!str.isEmpty()) {
                            eVar.f10567b = str;
                        }
                    }
                    break;
                } else if ("xi".equals(strG)) {
                    if (obj instanceof Integer) {
                        eVar.f10568c = ((Integer) obj).intValue();
                    }
                    break;
                } else if ("pn".equals(strG) && (obj instanceof String) && !((String) obj).isEmpty()) {
                    eVar.getClass();
                    break;
                }
                break;
            default:
                String strG2 = fVar.g();
                boolean zEquals2 = MediationMetaData.KEY_VERSION.equals(strG2);
                e eVar2 = this.f10563t;
                if (!zEquals2) {
                    if ("multifileClassName".equals(strG2)) {
                        eVar2.f10567b = obj instanceof String ? (String) obj : null;
                    }
                } else if (obj instanceof int[]) {
                    eVar2.a = (int[]) obj;
                }
                break;
        }
    }

    @Override // p029c9.k
    public final l q(f fVar) {
        switch (this.f10562s) {
            case 0:
                String strG = fVar.g();
                if ("d1".equals(strG)) {
                    return new b(this, 0);
                }
                if ("d2".equals(strG)) {
                    return new b(this, 1);
                }
                return null;
            default:
                String strG2 = fVar.g();
                if (JsonStorageKeyNames.DATA_KEY.equals(strG2) || "filePartClassNames".equals(strG2)) {
                    return new d(this, 0);
                }
                if ("strings".equals(strG2)) {
                    return new d(this, 1);
                }
                return null;
        }
    }

    @Override // p029c9.k
    public final void r(f fVar, p145o9.f fVar2) {
        int i10 = this.f10562s;
    }

    @Override // p029c9.k
    public final void s(f fVar, b bVar, f fVar2) {
        int i10 = this.f10562s;
    }

    @Override // p029c9.k
    public final k t(b bVar, f fVar) {
        switch (this.f10562s) {
        }
        return null;
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void a(f fVar, p145o9.f fVar2) {
    }

    private final void b(f fVar, p145o9.f fVar2) {
    }

    private final void e(f fVar, b bVar, f fVar2) {
    }

    private final void f(f fVar, b bVar, f fVar2) {
    }
}
