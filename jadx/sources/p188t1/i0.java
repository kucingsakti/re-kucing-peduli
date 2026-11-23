package p188t1;

import android.os.Build;
import android.security.keystore.KeyInfo;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.security.keystore.KeyProtection;
import android.security.keystore.UserNotAuthenticatedException;
import com.aheaditec.talsec.security.t2;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.UnrecoverableEntryException;
import java.security.spec.InvalidKeySpecException;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;
import o1.m;
import p086i8.C;

/* JADX INFO: loaded from: classes.dex */
public class i0 implements f0 {
    public final m a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KeyStore f15042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f15043c;

    static {
        C.a(C.c("216CB0DB05ECC18C836E3C1C945F71"));
    }

    public i0(m mVar, KeyStore keyStore) {
        this.a = mVar;
        if (!C.a(C.c("216CB0DB05ECC18C836E3C1C945F71")).equals(keyStore.getProvider().getName())) {
            throw new IllegalArgumentException(C.a(C.c("3063A7DA0FE185B288641A188B426620C6CDEEEB56CF210955F0A0")));
        }
        this.f15042b = keyStore;
        this.f15043c = mVar;
    }

    public static t2 c(InvalidKeySpecException invalidKeySpecException) {
        return new t2(-7778, C.a(C.c("2570A6C618A5CAA485621D1A9E493423CBC0A2E513C4370948EBA02236EB3E1C0463A0C84AE3D7A88B37040D825E603BD1CC")), invalidKeySpecException);
    }

    public static void e(SecretKey secretKey) throws InvalidKeyException {
        Cipher.getInstance(C.a(C.c("2147878629C7E6E8A8783F099F497D3AC4"))).init(1, secretKey);
    }

    @Override // p188t1.f0
    public boolean a() {
        return g();
    }

    @Override // p188t1.f0
    public boolean b() {
        return j().isInsideSecureHardware();
    }

    public final void d() throws t2 {
        new Date();
        m mVar = this.f15043c;
        mVar.getClass();
        try {
            this.f15042b.setEntry((String) this.a.f13641s, new KeyStore.SecretKeyEntry(new SecretKeySpec(new byte[16], (String) mVar.f13642t)), new KeyProtection.Builder(1).setBlockModes((String) mVar.f13643u).setEncryptionPaddings((String) mVar.f13644v).setUserAuthenticationRequired(false).setUserAuthenticationValidityDurationSeconds(Integer.MAX_VALUE).build());
        } catch (KeyStoreException e10) {
            throw new t2(-7772, C.a(C.c("2570A6C618A5CAA485621D1A9E493423CBC0A2E513C5261248EBAB337FE138480122A0C64AEEC0BE9563001A9E")), e10);
        }
    }

    public final SecretKey f() throws t2 {
        if (!g()) {
            throw c(null);
        }
        try {
            SecretKey secretKey = ((KeyStore.SecretKeyEntry) i()).getSecretKey();
            try {
                e(secretKey);
                return secretKey;
            } catch (InvalidKeyException e10) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 > 23 && (e10 instanceof UserNotAuthenticatedException)) {
                    return secretKey;
                }
                if (i10 <= 23 || !(e10 instanceof KeyPermanentlyInvalidatedException)) {
                    throw new t2(-7772, C.a(C.c("2570A6C618A5CAA485621D1A9E493423CBC0A2E513C0331153E6A42036EB3E1C0463A0C84AE3CAB58B37040D825E603BD1CC")), e10);
                }
                throw new t2(-7779, null);
            } catch (NoSuchAlgorithmException e11) {
                e = e11;
                throw new t2(-7773, C.a(C.c("2570A6C618A5CAA485621D1A9E493423CBC0A2E513C4370948EBA02236EB3E1C0B67AD8903EBC3A8C6711D07960D7F31DADABAEF41D3")), e);
            } catch (NoSuchPaddingException e12) {
                e = e12;
                throw new t2(-7773, C.a(C.c("2570A6C618A5CAA485621D1A9E493423CBC0A2E513C4370948EBA02236EB3E1C0B67AD8903EBC3A8C6711D07960D7F31DADABAEF41D3")), e);
            }
        } catch (UnsupportedOperationException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException e13) {
            throw new t2(-7772, C.a(C.c("2570A6C618A5CAA485621D1A9E493423CBC0A2E513C4370948EBA02236EB3E1C0463A0C84AE3D7A88B37040D825E603BD1CC")), e13);
        }
    }

    public final boolean g() throws t2 {
        try {
            return h();
        } catch (KeyStoreException e10) {
            throw new t2(-7772, C.a(C.c("2570A6C618A5CAA485621D1A9E493423CBC0A2E513C4370948EBA02236EB3E1C0463A0C84AE3D7A88B37040D825E603BD1CC")), e10);
        }
    }

    public boolean h() {
        m mVar = this.a;
        String str = (String) mVar.f13641s;
        KeyStore keyStore = this.f15042b;
        return keyStore.containsAlias(str) && keyStore.entryInstanceOf((String) mVar.f13641s, KeyStore.SecretKeyEntry.class);
    }

    public final KeyStore.Entry i() throws NoSuchAlgorithmException, t2, KeyStoreException, UnrecoverableEntryException {
        KeyStore.Entry entry = this.f15042b.getEntry((String) this.a.f13641s, null);
        if (entry != null) {
            return entry;
        }
        throw c(null);
    }

    public final KeyInfo j() throws t2 {
        SecretKey secretKeyF = f();
        try {
            KeyInfo keyInfo = (KeyInfo) SecretKeyFactory.getInstance(secretKeyF.getAlgorithm(), C.a(C.c("216CB0DB05ECC18C836E3C1C945F71"))).getKeySpec(secretKeyF, KeyInfo.class);
            int purposes = keyInfo.getPurposes();
            int keySize = keyInfo.getKeySize() / 8;
            String algorithm = secretKeyF.getAlgorithm();
            m mVar = this.f15043c;
            mVar.getClass();
            if (purposes == 1 && keySize == 16 && ((String) mVar.f13642t).equals(algorithm)) {
                return keyInfo;
            }
            throw new t2(-7779, null);
        } catch (NoSuchAlgorithmException e10) {
            e = e10;
            throw new t2(-7773, C.a(C.c("2570A6C618A5CAA485621D1A9E493423CBC0A2E513C4370948EBA02236EB3E1C0B67AD8903EBC3A8C6711D07960D7F31DADABAEF41D3")), e);
        } catch (NoSuchProviderException e11) {
            e = e11;
            throw new t2(-7773, C.a(C.c("2570A6C618A5CAA485621D1A9E493423CBC0A2E513C4370948EBA02236EB3E1C0B67AD8903EBC3A8C6711D07960D7F31DADABAEF41D3")), e);
        } catch (ProviderException e12) {
            e = e12;
            throw new t2(-7773, C.a(C.c("2570A6C618A5CAA485621D1A9E493423CBC0A2E513C4370948EBA02236EB3E1C0B67AD8903EBC3A8C6711D07960D7F31DADABAEF41D3")), e);
        } catch (InvalidKeySpecException e13) {
            throw c(e13);
        }
    }
}
