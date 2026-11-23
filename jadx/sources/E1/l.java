package E1;

import N9.t0;
import android.content.Context;
import android.content.ContextWrapper;
import android.hardware.fingerprint.FingerprintManager;
import android.net.ConnectivityManager;
import com.google.android.gms.internal.measurement.S;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import p.b1;

/* JADX INFO: loaded from: classes.dex */
public final class l implements s, U1.g, p106l0.f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1317s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Context f1318t;

    @Override // E1.s
    public r D(x xVar) {
        switch (this.f1317s) {
            case 0:
                return new n(this.f1318t, 0);
            default:
                return new n(this.f1318t, 2);
        }
    }

    @Override // p106l0.f
    public void a(C8.E e10) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new t0("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new O3.z(this, e10, threadPoolExecutor, 7));
    }

    public i2.j b() {
        Context context = this.f1318t;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        i2.j jVar = new i2.j();
        jVar.f12183s = k2.a.a(i2.m.a);
        V.h hVar = new V.h(context, 29);
        jVar.f12184t = hVar;
        jVar.f12185u = k2.a.a(new o1.c(hVar, 15, new p090j2.e(hVar, 0)));
        V.h hVar2 = jVar.f12184t;
        jVar.f12186v = new p090j2.e(hVar2, 1);
        Provider providerA = k2.a.a(new p102k7.e(hVar2));
        jVar.f12187w = providerA;
        Provider providerA2 = k2.a.a(new S(jVar.f12186v, providerA, 17, false));
        jVar.f12188x = providerA2;
        p053f4.e eVar = new p053f4.e(25);
        V.h hVar3 = jVar.f12184t;
        Y1.c cVar = new Y1.c(hVar3, providerA2, eVar, 18);
        Provider provider = jVar.f12183s;
        Provider provider2 = jVar.f12185u;
        jVar.f12189y = k2.a.a(new Y1.c(new Fa.e(provider, provider2, cVar, providerA2, providerA2, 14), new b1(hVar3, provider2, providerA2, cVar, provider, providerA2, providerA2, 3), new o1.m(provider, providerA2, cVar, providerA2), 12));
        return jVar;
    }

    public boolean c() {
        FingerprintManager fingerprintManagerC = N.b.c(this.f1318t);
        return fingerprintManagerC != null && N.b.d(fingerprintManagerC);
    }

    public boolean d() {
        FingerprintManager fingerprintManagerC = N.b.c(this.f1318t);
        return fingerprintManagerC != null && N.b.e(fingerprintManagerC);
    }

    @Override // U1.g
    public Object get() {
        return (ConnectivityManager) this.f1318t.getSystemService("connectivity");
    }

    public /* synthetic */ l(Context context, int i10) {
        this.f1317s = i10;
        this.f1318t = context;
    }

    public l(Context context) {
        this.f1317s = 5;
        this.f1318t = context.getApplicationContext();
    }

    public l(ContextWrapper contextWrapper) {
        this.f1317s = 6;
        this.f1318t = contextWrapper.getApplicationContext();
    }
}
