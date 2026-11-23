package p188t1;

import android.util.Base64;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.kcstream.cing.MainApp;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import p086i8.C;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public final C0857u a;

    static {
        AbstractC0487g.r("026BBACD03EBC29887790B1A9444700BCACD", "026BBACD03EBC29896620D04924E4B3FC6D0");
    }

    public d0(MainApp mainApp) {
        this.a = new C0857u(mainApp);
    }

    public final PublicKey a() {
        C0857u c0857u = this.a;
        if (!c0857u.g(C.a(C.c("026BBACD03EBC29896620D04924E4B3FC6D0")))) {
            return null;
        }
        try {
            return KeyFactory.getInstance(C.a(C.c("325195"))).generatePublic(new X509EncodedKeySpec(Base64.decode(c0857u.e(C.a(C.c("026BBACD03EBC29896620D04924E4B3FC6D0"))), 2)));
        } catch (Exception unused) {
            return null;
        }
    }
}
