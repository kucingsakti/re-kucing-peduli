package p188t1;

import E4.C0187a;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.kcstream.cing.MainApp;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PublicKey;
import javax.crypto.Cipher;
import p086i8.C;
import p140o4.r;
import p204v1.d;
import p204v1.f;
import p204v1.j;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends AbstractC0854q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0 f15005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f15006i;

    static {
        C.a(C.c("3463B8DA0FE6E7AE887306069C"));
        C.a(C.c("216CB0DB05ECC18C836E3C1C945F71"));
        C.a(C.c("325195862FC6E7E8B65C2C3BCA7D7530C7C0A0E7"));
    }

    public a0(f fVar, j jVar, MainApp mainApp, r rVar) {
        super(fVar, jVar);
        this.f15005h = new d0(mainApp);
        this.f15006i = rVar;
    }

    public static boolean o(PublicKey publicKey, KeyStore.PrivateKeyEntry privateKeyEntry, String str) {
        try {
            Cipher cipher = Cipher.getInstance(C.a(C.c("325195862FC6E7E8B65C2C3BCA7D7530C7C0A0E7")));
            cipher.init(1, publicKey);
            Charset charset = StandardCharsets.UTF_8;
            byte[] bArrDoFinal = cipher.doFinal(str.getBytes(charset));
            Cipher cipher2 = Cipher.getInstance(C.a(C.c("325195862FC6E7E8B65C2C3BCA7D7530C7C0A0E7")));
            cipher2.init(2, privateKeyEntry.getPrivateKey());
            return str.equals(new String(cipher2.doFinal(bArrDoFinal), charset));
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // p188t1.Q
    public final void a(MainApp mainApp) {
        F fB = d.b(new C0187a(this, mainApp));
        j jVar = this.f15076g;
        d.f(jVar.f15407c, 128);
        jVar.f15406b.getClass();
        e(C.a(C.c("0467A2C009E0E7AE887306069C")), fB);
        if (fB.b()) {
            h(null, C.a(C.c("0467A2C009E0E7AE887306069C")));
        }
        if (fB.a()) {
            jVar.b(C.a(C.c("0467A2C009E0E7AE887306069C")));
        }
    }

    @Override // p188t1.Q
    public final boolean c() {
        return false;
    }

    public final void n(KeyStore keyStore) {
        try {
            if (keyStore.containsAlias(C.a(C.c("3463B8DA0FE6E7AE887306069C")))) {
                keyStore.deleteEntry(C.a(C.c("3463B8DA0FE6E7AE887306069C")));
            }
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(C.a(C.c("325195")), C.a(C.c("216CB0DB05ECC18C836E3C1C945F71")));
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(C.a(C.c("3463B8DA0FE6E7AE887306069C")), 3).setKeySize(2048).setEncryptionPaddings(C.a(C.c("304997FA5BD5C4A3827E010F"))).setUserAuthenticationRequired(false).build());
            PublicKey publicKey = keyPairGenerator.generateKeyPair().getPublic();
            if (keyStore.containsAlias(C.a(C.c("3463B8DA0FE6E7AE887306069C")))) {
                d0 d0Var = this.f15005h;
                d0Var.getClass();
                d0Var.a.f(C.a(C.c("026BBACD03EBC29896620D04924E4B3FC6D0")), Base64.encodeToString(publicKey.getEncoded(), 2));
            }
        } catch (Exception unused) {
        }
    }
}
