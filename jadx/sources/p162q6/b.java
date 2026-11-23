package p162q6;

import com.onesignal.common.modeling.l;
import com.onesignal.common.modeling.m;
import p076h8.f;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public class b extends m {

    public static final class a extends k implements p200u8.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // p200u8.a
        public final p162q6.a invoke() {
            return new p162q6.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p093j5.b bVar) {
        super(new l(a.INSTANCE, "identity", bVar));
        i.f(bVar, "prefs");
    }

    public final f getIdentityAlias() {
        if (((p162q6.a) getModel()).getJwtToken() == null) {
            return new f("onesignal_id", ((p162q6.a) getModel()).getOnesignalId());
        }
        String externalId = ((p162q6.a) getModel()).getExternalId();
        i.c(externalId);
        return new f("external_id", externalId);
    }

    public final void invalidateJwt() {
        ((p162q6.a) getModel()).setJwtToken(null);
    }
}
