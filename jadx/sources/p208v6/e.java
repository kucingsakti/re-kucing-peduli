package p208v6;

import com.onesignal.common.modeling.l;
import java.util.List;
import p093j5.b;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public class e extends l {

    public static final class a extends k implements p200u8.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // p200u8.a
        public final d invoke() {
            return new d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar) {
        super(a.INSTANCE, "subscriptions", bVar);
        i.f(bVar, "prefs");
    }

    @Override // com.onesignal.common.modeling.k, com.onesignal.common.modeling.c
    public void replaceAll(List<d> list, String str) {
        i.f(list, "models");
        i.f(str, "tag");
        if (!str.equals("HYDRATE")) {
            super.replaceAll(list, str);
            return;
        }
        synchronized (list) {
            try {
                for (d dVar : list) {
                    if (dVar.getType() == g.PUSH) {
                        d dVar2 = (d) get(dVar.getId());
                        if (dVar2 == null) {
                            break;
                        }
                        dVar.setSdk(dVar2.getSdk());
                        dVar.setDeviceOS(dVar2.getDeviceOS());
                        dVar.setCarrier(dVar2.getCarrier());
                        dVar.setAppVersion(dVar2.getAppVersion());
                        dVar.setStatus(dVar2.getStatus());
                        break;
                    }
                }
                super.replaceAll(list, str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
