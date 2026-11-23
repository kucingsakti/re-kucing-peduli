package p188t1;

import E4.B;
import T3.c;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.util.Base64;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.aheaditec.talsec.security.l0;
import com.google.android.gms.internal.measurement.S;
import com.kcstream.cing.MainApp;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import p086i8.C;
import p195u1.a;
import p204v1.d;
import p204v1.e;
import p204v1.f;
import p204v1.j;

/* JADX INFO: renamed from: t1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0852o extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S f15070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f15071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f15072i;
    public final f j;

    static {
        AbstractC0487g.r("1463B9D90FF7", "0172A4E004F1C0A0947E1B11");
    }

    public C0852o(f fVar, S s9, j jVar, c cVar, f fVar2) {
        super(fVar);
        this.f15070g = s9;
        this.f15071h = jVar;
        this.f15072i = cVar;
        this.j = fVar2;
    }

    public static String n(Signature signature) {
        byte[] bArrQ = q(signature.toByteArray());
        String strEncodeToString = Base64.encodeToString(bArrQ, 2);
        if (bArrQ != null) {
            a.a.nextBytes(bArrQ);
            return strEncodeToString;
        }
        Random random = a.a;
        return strEncodeToString;
    }

    public static byte[] q(byte[] bArr) throws l0 {
        try {
            return MessageDigest.getInstance(C.a(C.c("334A958458B093"))).digest(bArr);
        } catch (NoSuchAlgorithmException e10) {
            throw new l0(-8884, C.a(C.c("2570A6C618A5D2AF8F7B0A48934C673CCAC7A9A057D7261C14")), e10);
        }
    }

    public static ArrayList r(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(n(signature));
        }
        return arrayList;
    }

    @Override // p188t1.Q
    public final void a(MainApp mainApp) {
        F fB = d.b(new B(this, 14, mainApp));
        j jVar = this.f15071h;
        d.f(jVar.f15407c, 16);
        e eVar = jVar.f15406b;
        eVar.c();
        e(C.a(C.c("0172A4E004F1C0A0947E1B11")), fB);
        if (fB.b()) {
            h(eVar.c(), C.a(C.c("0172A4E004F1C0A0947E1B11")));
        }
        if (fB.a()) {
            jVar.a(eVar.c(), C.a(C.c("1463B9D90FF7")));
        }
    }

    @Override // p188t1.Q
    public final boolean c() {
        return d.g(this.f15071h.f15406b.c());
    }

    public final void o(String str, Signature[] signatureArr, ArrayList arrayList) {
        try {
            m(C.a(C.c("096CA2C806ECC1948F7001098F586631E7C0A9E540C21E1449F6")).concat(str), arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList2.add((X509Certificate) CertificateFactory.getInstance(C.a(C.c("3837E490"))).generateCertificate(new ByteArrayInputStream(signature.toByteArray())));
            }
            k(C.a(C.c("096CA2C806ECC18483651B019D447735D7CC87EE55D91E1449F6")) + str, arrayList2);
        } catch (Exception e10) {
            j(C.a(C.c("0172A4E004F1C0A0947E1B11B8457137C8ECBCF25CC4")), e10.getMessage());
        }
    }

    public final boolean p(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            for (String str2 : (String[]) this.f15072i.f4657b) {
                if (!str.equals(str2)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean s(MainApp mainApp) {
        SigningInfo signingInfo = mainApp.getPackageManager().getPackageInfo(mainApp.getPackageName(), 134217728).signingInfo;
        if (signingInfo.hasMultipleSigners()) {
            Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
            if (apkContentsSigners == null || apkContentsSigners.length == 0) {
                j(C.a(C.c("0172A4E004F1C0A0947E1B11B8457137C8ECBCF25CC4")), C.a(C.c("356CB5CB06E085B389371D0D8F5F7D31D5CCEEED46DA26144AEEA0742CEC3E520570A787")));
                return false;
            }
            try {
                ArrayList arrayListR = r(apkContentsSigners);
                if (p(arrayListR)) {
                    return true;
                }
                o(C.a(C.c("51")), apkContentsSigners, arrayListR);
                return false;
            } catch (l0 e10) {
                j(C.a(C.c("0172A4E004F1C0A0947E1B11B8457137C8ECBCF25CC4")), e10.getMessage());
                return false;
            }
        }
        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
        if (signingCertificateHistory == null || signingCertificateHistory.length == 0) {
            j(C.a(C.c("0172A4E004F1C0A0947E1B11B8457137C8ECBCF25CC4")), C.a(C.c("356CB5CB06E085B389371D0D8F5F7D31D5CCEEE356C426145CEBA6352BE079540971A0C618FC8B")));
            return false;
        }
        try {
            ArrayList<String> arrayListR2 = r(signingCertificateHistory);
            for (String str : arrayListR2) {
                for (String str2 : (String[]) this.f15072i.f4657b) {
                    if (str.equals(str2)) {
                        return true;
                    }
                }
            }
            o(C.a(C.c("52")), signingCertificateHistory, arrayListR2);
            return false;
        } catch (l0 e11) {
            j(C.a(C.c("0172A4E004F1C0A0947E1B11B8457137C8ECBCF25CC4")), e11.getMessage());
            return false;
        }
    }

    public final boolean t(MainApp mainApp) {
        Signature[] signatureArr = mainApp.getPackageManager().getPackageInfo(mainApp.getPackageName(), 64).signatures;
        if (signatureArr == null || signatureArr.length == 0) {
            j(C.a(C.c("0172A4E004F1C0A0947E1B11B8457137C8ECBCF25CC4")), C.a(C.c("356CB5CB06E085B389371D0D8F5F7D31D5CCEEF35AD13C1C4EF7B73171")));
            return false;
        }
        try {
            ArrayList arrayListR = r(signatureArr);
            if (p(arrayListR)) {
                return true;
            }
            o(C.a(C.c("")), signatureArr, arrayListR);
            return false;
        } catch (l0 e10) {
            j(C.a(C.c("0172A4E004F1C0A0947E1B11B8457137C8ECBCF25CC4")), e10.getMessage());
            return false;
        }
    }
}
