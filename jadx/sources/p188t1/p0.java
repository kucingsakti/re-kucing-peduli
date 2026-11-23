package p188t1;

import android.os.Build;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.aheaditec.talsec.security.t2;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import o1.m;
import p086i8.C;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {
    static {
        AbstractC0487g.r("5333B7CC5DB7C3F680220959CC4870379B99FCB90B876B180AE4A43666B2610F0361E4995DBD9DFE842F5D0ACA1B2C659290F7B1028E371B0EE4F7616AB06D0F", "214787");
    }

    public static m a(String str) {
        return new m(str, C.a(C.c("214787")), C.a(C.c("234097")), C.a(C.c("2E6D84C80EE1CCA981")));
    }

    public static i0 b() {
        try {
            KeyStore keyStore = KeyStore.getInstance(C.a(C.c("216CB0DB05ECC18C836E3C1C945F71")));
            keyStore.load(null);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                return new n0(a(C.a(C.c("5333B7CC5DB7C3F680220959CC4870379B99FCB90B876B180AE4A43666B2610F0361E4995DBD9DFE842F5D0ACA1B2C659290F7B1028E371B0EE4F7616AB06D0F"))), keyStore);
            }
            return i10 >= 28 ? new k0(a(C.a(C.c("5333B7CC5DB7C3F680220959CC4870379B99FCB90B876B180AE4A43666B2610F0361E4995DBD9DFE842F5D0ACA1B2C659290F7B1028E371B0EE4F7616AB06D0F"))), keyStore) : new i0(a(C.a(C.c("5333B7CC5DB7C3F680220959CC4870379B99FCB90B876B180AE4A43666B2610F0361E4995DBD9DFE842F5D0ACA1B2C659290F7B1028E371B0EE4F7616AB06D0F"))), keyStore);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e10) {
            throw new t2(-7772, C.a(C.c("2570A6C618A5D2AF8F7B0A4897427530CAC7A9A072FD01")), e10);
        }
    }
}
