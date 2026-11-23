package M2;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzav;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzfl;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzhl;
import com.google.android.gms.measurement.internal.zzin;
import com.google.android.gms.measurement.internal.zziv;
import com.google.android.gms.measurement.internal.zzkj;
import com.google.android.gms.measurement.internal.zzkx;
import com.google.android.gms.measurement.internal.zznp;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends AbstractC0300i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zziv f2927f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(zziv zzivVar, M m2, int i10) {
        super(m2);
        this.f2926e = i10;
        this.f2927f = zzivVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0298  */
    /* JADX WARN: Code duplicated, block: B:60:0x0172  */
    /* JADX WARN: Code duplicated, block: B:61:0x0175  */
    /* JADX WARN: Code duplicated, block: B:63:0x0178  */
    /* JADX WARN: Code duplicated, block: B:65:0x0182  */
    /* JADX WARN: Code duplicated, block: B:68:0x0188  */
    /* JADX WARN: Code duplicated, block: B:69:0x018b  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x025d A[Catch: IllegalArgumentException -> 0x0264, MalformedURLException -> 0x0266, TryCatch #5 {IllegalArgumentException -> 0x0264, MalformedURLException -> 0x0266, blocks: (B:84:0x0211, B:86:0x025d, B:91:0x0268, B:93:0x026e, B:95:0x0276, B:96:0x027c, B:97:0x0280), top: B:118:0x0211 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x026e A[Catch: IllegalArgumentException -> 0x0264, MalformedURLException -> 0x0266, TryCatch #5 {IllegalArgumentException -> 0x0264, MalformedURLException -> 0x0266, blocks: (B:84:0x0211, B:86:0x025d, B:91:0x0268, B:93:0x026e, B:95:0x0276, B:96:0x027c, B:97:0x0280), top: B:118:0x0211 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0276 A[Catch: IllegalArgumentException -> 0x0264, MalformedURLException -> 0x0266, TryCatch #5 {IllegalArgumentException -> 0x0264, MalformedURLException -> 0x0266, blocks: (B:84:0x0211, B:86:0x025d, B:91:0x0268, B:93:0x026e, B:95:0x0276, B:96:0x027c, B:97:0x0280), top: B:118:0x0211 }] */
    @Override // M2.AbstractC0300i
    public final void c() throws Throwable {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        zzaj zzajVarG;
        Bundle bundle;
        zzav zzavVarA;
        int i10;
        String str;
        int i11;
        String str2;
        zznp zznpVar;
        String string;
        String strConcat;
        switch (this.f2926e) {
            case 0:
                this.f2927f.x1();
                break;
            case 1:
                this.f2927f.w1();
                break;
            default:
                zziv zzivVar = this.f2927f;
                zzhj zzhjVar = (zzhj) zzivVar.f577s;
                zzhc zzhcVar = zzhjVar.f9116B;
                zzhj.g(zzhcVar);
                zzhcVar.W0();
                zzkj zzkjVar = zzhjVar.f9124J;
                zzhj.g(zzkjVar);
                zzhj.g(zzkjVar);
                String strD1 = zzhjVar.o().d1();
                C0313w c0313w = zzhjVar.f9147z;
                zzhj.e(c0313w);
                c0313w.W0();
                boolean z6 = false;
                if (c0313w.h1().i(zzin.zza.AD_STORAGE)) {
                    zzhj zzhjVar2 = (zzhj) c0313w.f577s;
                    zzhjVar2.f9120F.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (c0313w.f3130A == null || jElapsedRealtime >= c0313w.f3132C) {
                        zzag zzagVar = zzhjVar2.f9146y;
                        zzagVar.getClass();
                        c0313w.f3132C = zzagVar.c1(strD1, zzbf.f8976b) + jElapsedRealtime;
                        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
                        try {
                            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzhjVar2.f9140s);
                            c0313w.f3130A = "";
                            String id = advertisingIdInfo.getId();
                            if (id != null) {
                                c0313w.f3130A = id;
                            }
                            c0313w.f3131B = advertisingIdInfo.isLimitAdTrackingEnabled();
                        } catch (Exception e10) {
                            c0313w.i().f9051E.a(e10, "Unable to get advertising id");
                            c0313w.f3130A = "";
                        }
                        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                        pair = new Pair(c0313w.f3130A, Boolean.valueOf(c0313w.f3131B));
                    } else {
                        pair = new Pair(c0313w.f3130A, Boolean.valueOf(c0313w.f3131B));
                    }
                } else {
                    pair = new Pair("", Boolean.FALSE);
                }
                Pair pair2 = pair;
                Boolean boolF1 = zzhjVar.f9146y.f1("google_analytics_adid_collection_enabled");
                boolean z10 = boolF1 == null || boolF1.booleanValue();
                zzfw zzfwVar = zzhjVar.f9115A;
                if (!z10 || ((Boolean) pair2.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair2.first)) {
                    zzhj.g(zzfwVar);
                    zzfwVar.f9051E.b("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                } else {
                    zzhj.g(zzkjVar);
                    zzkjVar.X0();
                    ConnectivityManager connectivityManager = (ConnectivityManager) ((zzhj) zzkjVar.f577s).f9140s.getSystemService("connectivity");
                    URL url = null;
                    if (connectivityManager != null) {
                        try {
                            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        } catch (SecurityException unused) {
                            activeNetworkInfo = null;
                        }
                    } else {
                        activeNetworkInfo = null;
                    }
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        zzhj.g(zzfwVar);
                        zzfwVar.f9047A.b("Network is not available for Deferred Deep Link request. Skipping");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        zzkx zzkxVarR = zzhjVar.r();
                        zzkxVarR.W0();
                        zzkxVarR.a1();
                        if (zzkxVarR.m1() && zzkxVarR.V0().b2() < 234200) {
                            zznpVar = zzhjVar.f9118D;
                            zzhj.e(zznpVar);
                            zzhjVar.o();
                            String str3 = (String) pair2.first;
                            long jA = c0313w.f3143N.a() - 1;
                            string = sb.toString();
                            try {
                                Preconditions.e(str3);
                                Preconditions.e(strD1);
                                strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v97001." + zznpVar.b2()) + "&rdid=" + str3 + "&bundleid=" + strD1 + "&retry=" + jA;
                                if (strD1.equals(((zzhj) zznpVar.f577s).f9146y.Z0("debug.deferred.deeplink"))) {
                                    strConcat = strConcat.concat("&ddl_test=1");
                                }
                                if (!string.isEmpty()) {
                                    if (string.charAt(0) != '&') {
                                        strConcat = strConcat.concat("&");
                                    }
                                    strConcat = strConcat.concat(string);
                                }
                                url = new URL(strConcat);
                            } catch (IllegalArgumentException e11) {
                                e = e11;
                                zznpVar.i().f9056x.a(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                            } catch (MalformedURLException e12) {
                                e = e12;
                                zznpVar.i().f9056x.a(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                            }
                            if (url != null) {
                                zzhj.g(zzkjVar);
                                zzhl zzhlVar = new zzhl();
                                zzhlVar.a = zzhjVar;
                                zzkjVar.W0();
                                zzkjVar.X0();
                                zzkjVar.l().d1(new B4.I(zzkjVar, strD1, url, zzhlVar));
                            }
                        } else {
                            zziv zzivVar2 = zzhjVar.f9122H;
                            zzhj.f(zzivVar2);
                            zzivVar2.W0();
                            zzkx zzkxVarR2 = ((zzhj) zzivVar2.f577s).r();
                            zzkxVarR2.W0();
                            zzkxVarR2.a1();
                            zzfl zzflVar = zzkxVarR2.f9243v;
                            if (zzflVar == null) {
                                zzkxVarR2.i1();
                                zzkxVarR2.i().f9051E.b("Failed to get consents; not connected to service yet.");
                            } else {
                                try {
                                    zzajVarG = zzflVar.G(zzkxVarR2.p1(false));
                                    zzkxVarR2.o1();
                                } catch (RemoteException e13) {
                                    zzkxVarR2.i().f9056x.a(e13, "Failed to get consents; remote exception");
                                    zzajVarG = null;
                                }
                                if (zzajVarG != null) {
                                    bundle = zzajVarG.f8898s;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    int i12 = zzhjVar.f9137X;
                                    zzhjVar.f9137X = i12 + 1;
                                    z6 = i12 < 10;
                                    zzhj.g(zzfwVar);
                                    if (z6) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    zzfwVar.f9051E.a(Integer.valueOf(zzhjVar.f9137X), E0.a.i("Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                } else {
                                    zzin zzinVarD = zzin.d(100, bundle);
                                    sb.append("&gcs=");
                                    sb.append(zzinVarD.n());
                                    zzavVarA = zzav.a(100, bundle);
                                    sb.append("&dma=");
                                    if (zzavVarA.f8906c == Boolean.FALSE) {
                                        i10 = 0;
                                    } else {
                                        i10 = 1;
                                    }
                                    sb.append(i10);
                                    str = zzavVarA.f8907d;
                                    if (!TextUtils.isEmpty(str)) {
                                        sb.append("&dma_cps=");
                                        sb.append(str);
                                    }
                                    if (zzav.c(bundle) == Boolean.TRUE) {
                                        i11 = 0;
                                    } else {
                                        i11 = 1;
                                    }
                                    sb.append("&npa=");
                                    sb.append(i11);
                                    zzhj.g(zzfwVar);
                                    zzfwVar.f9052F.a(sb, "Consent query parameters to Bow");
                                    zznpVar = zzhjVar.f9118D;
                                    zzhj.e(zznpVar);
                                    zzhjVar.o();
                                    String str4 = (String) pair2.first;
                                    long jA2 = c0313w.f3143N.a() - 1;
                                    string = sb.toString();
                                    Preconditions.e(str4);
                                    Preconditions.e(strD1);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v97001." + zznpVar.b2()) + "&rdid=" + str4 + "&bundleid=" + strD1 + "&retry=" + jA2;
                                    if (strD1.equals(((zzhj) zznpVar.f577s).f9146y.Z0("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        zzhj.g(zzkjVar);
                                        zzhl zzhlVar2 = new zzhl();
                                        zzhlVar2.a = zzhjVar;
                                        zzkjVar.W0();
                                        zzkjVar.X0();
                                        zzkjVar.l().d1(new B4.I(zzkjVar, strD1, url, zzhlVar2));
                                    }
                                }
                            }
                            zzajVarG = null;
                            if (zzajVarG != null) {
                                bundle = zzajVarG.f8898s;
                            } else {
                                bundle = null;
                            }
                            if (bundle == null) {
                                int i13 = zzhjVar.f9137X;
                                zzhjVar.f9137X = i13 + 1;
                                if (i13 < 10) {
                                }
                                zzhj.g(zzfwVar);
                                if (z6) {
                                    str2 = "Retrying.";
                                } else {
                                    str2 = "Skipping.";
                                }
                                zzfwVar.f9051E.a(Integer.valueOf(zzhjVar.f9137X), E0.a.i("Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                            } else {
                                zzin zzinVarD2 = zzin.d(100, bundle);
                                sb.append("&gcs=");
                                sb.append(zzinVarD2.n());
                                zzavVarA = zzav.a(100, bundle);
                                sb.append("&dma=");
                                if (zzavVarA.f8906c == Boolean.FALSE) {
                                    i10 = 0;
                                } else {
                                    i10 = 1;
                                }
                                sb.append(i10);
                                str = zzavVarA.f8907d;
                                if (!TextUtils.isEmpty(str)) {
                                    sb.append("&dma_cps=");
                                    sb.append(str);
                                }
                                if (zzav.c(bundle) == Boolean.TRUE) {
                                    i11 = 0;
                                } else {
                                    i11 = 1;
                                }
                                sb.append("&npa=");
                                sb.append(i11);
                                zzhj.g(zzfwVar);
                                zzfwVar.f9052F.a(sb, "Consent query parameters to Bow");
                                zznpVar = zzhjVar.f9118D;
                                zzhj.e(zznpVar);
                                zzhjVar.o();
                                String str5 = (String) pair2.first;
                                long jA3 = c0313w.f3143N.a() - 1;
                                string = sb.toString();
                                Preconditions.e(str5);
                                Preconditions.e(strD1);
                                strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v97001." + zznpVar.b2()) + "&rdid=" + str5 + "&bundleid=" + strD1 + "&retry=" + jA3;
                                if (strD1.equals(((zzhj) zznpVar.f577s).f9146y.Z0("debug.deferred.deeplink"))) {
                                    strConcat = strConcat.concat("&ddl_test=1");
                                }
                                if (!string.isEmpty()) {
                                    if (string.charAt(0) != '&') {
                                        strConcat = strConcat.concat("&");
                                    }
                                    strConcat = strConcat.concat(string);
                                }
                                url = new URL(strConcat);
                                if (url != null) {
                                    zzhj.g(zzkjVar);
                                    zzhl zzhlVar3 = new zzhl();
                                    zzhlVar3.a = zzhjVar;
                                    zzkjVar.W0();
                                    zzkjVar.X0();
                                    zzkjVar.l().d1(new B4.I(zzkjVar, strD1, url, zzhlVar3));
                                }
                            }
                        }
                    }
                }
                if (z6) {
                    zzivVar.f9200J.b(2000L);
                }
                break;
        }
    }
}
