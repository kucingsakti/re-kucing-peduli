package p188t1;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import o1.m;
import p086i8.C;

/* JADX INFO: loaded from: classes.dex */
public class k0 extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f15067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final KeyStore f15068e;

    public k0(m mVar, KeyStore keyStore) {
        super(mVar, keyStore);
        this.f15067d = mVar;
        this.f15068e = keyStore;
    }

    @Override // p188t1.i0
    public final boolean h() throws KeyStoreException {
        KeyStore keyStore;
        m mVar = this.f15067d;
        if (mVar == null || (keyStore = this.f15068e) == null) {
            throw new KeyStoreException(C.a(C.c("2B67ADDA1EEAD7A2C6781D4890486D74D3C8BCE15EC5721449A2AB2133E977")));
        }
        if (!keyStore.containsAlias((String) mVar.f13641s)) {
            return false;
        }
        try {
            return keyStore.getEntry((String) mVar.f13641s, null).getClass() == KeyStore.SecretKeyEntry.class;
        } catch (NullPointerException e10) {
            throw new KeyStoreException(C.a(C.c("296CA0CC18EBC4ABC67E1C1B8E48343DCD89BAE85696391843F1B13B2DE0795E096CB0CC18A5C1A292720C1C9E493A")), e10);
        } catch (UnsupportedOperationException | NoSuchAlgorithmException | UnrecoverableEntryException unused) {
            throw new KeyStoreException(C.a(C.c("2570A6C618A5CAA485621D1A9E493423CBC0A2E513D53A1859E9AC3A38A5305A4069B1D019F1CAB583370C079559753DCDDAEEE55DC2200414")));
        }
    }
}
