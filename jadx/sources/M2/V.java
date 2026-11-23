package M2;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzdg;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzfj;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zziv;
import com.google.android.gms.measurement.internal.zzkx;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zzr;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class V implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2942s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f2943t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f2944u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f2945v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2946w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2947x;

    public /* synthetic */ V(Object obj, Object obj2, String str, String str2, boolean z6, int i10) {
        this.f2942s = i10;
        this.f2946w = obj2;
        this.f2943t = str;
        this.f2944u = str2;
        this.f2945v = z6;
        this.f2947x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bd A[Catch: RuntimeException -> 0x005b, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x005b, blocks: (B:5:0x001c, B:7:0x0027, B:42:0x00bd, B:44:0x00d5, B:47:0x00e2, B:49:0x00e8, B:50:0x00ff, B:52:0x010a, B:55:0x0112, B:59:0x012f, B:62:0x0143, B:61:0x0137, B:63:0x0147, B:65:0x014d, B:67:0x0153, B:69:0x0159, B:71:0x0161, B:73:0x0169, B:75:0x0171, B:77:0x0177, B:78:0x017b, B:12:0x0048, B:15:0x0050, B:21:0x0060, B:23:0x0066, B:25:0x006c, B:27:0x0072, B:29:0x007a, B:31:0x0082, B:33:0x008a, B:35:0x0092, B:37:0x009e, B:39:0x00ac), top: B:86:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d5 A[Catch: RuntimeException -> 0x005b, TryCatch #0 {RuntimeException -> 0x005b, blocks: (B:5:0x001c, B:7:0x0027, B:42:0x00bd, B:44:0x00d5, B:47:0x00e2, B:49:0x00e8, B:50:0x00ff, B:52:0x010a, B:55:0x0112, B:59:0x012f, B:62:0x0143, B:61:0x0137, B:63:0x0147, B:65:0x014d, B:67:0x0153, B:69:0x0159, B:71:0x0161, B:73:0x0169, B:75:0x0171, B:77:0x0177, B:78:0x017b, B:12:0x0048, B:15:0x0050, B:21:0x0060, B:23:0x0066, B:25:0x006c, B:27:0x0072, B:29:0x007a, B:31:0x0082, B:33:0x008a, B:35:0x0092, B:37:0x009e, B:39:0x00ac), top: B:86:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x0110  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112 A[Catch: RuntimeException -> 0x005b, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x005b, blocks: (B:5:0x001c, B:7:0x0027, B:42:0x00bd, B:44:0x00d5, B:47:0x00e2, B:49:0x00e8, B:50:0x00ff, B:52:0x010a, B:55:0x0112, B:59:0x012f, B:62:0x0143, B:61:0x0137, B:63:0x0147, B:65:0x014d, B:67:0x0153, B:69:0x0159, B:71:0x0161, B:73:0x0169, B:75:0x0171, B:77:0x0177, B:78:0x017b, B:12:0x0048, B:15:0x0050, B:21:0x0060, B:23:0x0066, B:25:0x006c, B:27:0x0072, B:29:0x007a, B:31:0x0082, B:33:0x008a, B:35:0x0092, B:37:0x009e, B:39:0x00ac), top: B:86:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:58:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x012f A[Catch: RuntimeException -> 0x005b, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x005b, blocks: (B:5:0x001c, B:7:0x0027, B:42:0x00bd, B:44:0x00d5, B:47:0x00e2, B:49:0x00e8, B:50:0x00ff, B:52:0x010a, B:55:0x0112, B:59:0x012f, B:62:0x0143, B:61:0x0137, B:63:0x0147, B:65:0x014d, B:67:0x0153, B:69:0x0159, B:71:0x0161, B:73:0x0169, B:75:0x0171, B:77:0x0177, B:78:0x017b, B:12:0x0048, B:15:0x0050, B:21:0x0060, B:23:0x0066, B:25:0x006c, B:27:0x0072, B:29:0x007a, B:31:0x0082, B:33:0x008a, B:35:0x0092, B:37:0x009e, B:39:0x00ac), top: B:86:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0137 A[Catch: RuntimeException -> 0x005b, TryCatch #0 {RuntimeException -> 0x005b, blocks: (B:5:0x001c, B:7:0x0027, B:42:0x00bd, B:44:0x00d5, B:47:0x00e2, B:49:0x00e8, B:50:0x00ff, B:52:0x010a, B:55:0x0112, B:59:0x012f, B:62:0x0143, B:61:0x0137, B:63:0x0147, B:65:0x014d, B:67:0x0153, B:69:0x0159, B:71:0x0161, B:73:0x0169, B:75:0x0171, B:77:0x0177, B:78:0x017b, B:12:0x0048, B:15:0x0050, B:21:0x0060, B:23:0x0066, B:25:0x006c, B:27:0x0072, B:29:0x007a, B:31:0x0082, B:33:0x008a, B:35:0x0092, B:37:0x009e, B:39:0x00ac), top: B:86:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0147 A[Catch: RuntimeException -> 0x005b, TryCatch #0 {RuntimeException -> 0x005b, blocks: (B:5:0x001c, B:7:0x0027, B:42:0x00bd, B:44:0x00d5, B:47:0x00e2, B:49:0x00e8, B:50:0x00ff, B:52:0x010a, B:55:0x0112, B:59:0x012f, B:62:0x0143, B:61:0x0137, B:63:0x0147, B:65:0x014d, B:67:0x0153, B:69:0x0159, B:71:0x0161, B:73:0x0169, B:75:0x0171, B:77:0x0177, B:78:0x017b, B:12:0x0048, B:15:0x0050, B:21:0x0060, B:23:0x0066, B:25:0x006c, B:27:0x0072, B:29:0x007a, B:31:0x0082, B:33:0x008a, B:35:0x0092, B:37:0x009e, B:39:0x00ac), top: B:86:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:65:0x014d A[Catch: RuntimeException -> 0x005b, TryCatch #0 {RuntimeException -> 0x005b, blocks: (B:5:0x001c, B:7:0x0027, B:42:0x00bd, B:44:0x00d5, B:47:0x00e2, B:49:0x00e8, B:50:0x00ff, B:52:0x010a, B:55:0x0112, B:59:0x012f, B:62:0x0143, B:61:0x0137, B:63:0x0147, B:65:0x014d, B:67:0x0153, B:69:0x0159, B:71:0x0161, B:73:0x0169, B:75:0x0171, B:77:0x0177, B:78:0x017b, B:12:0x0048, B:15:0x0050, B:21:0x0060, B:23:0x0066, B:25:0x006c, B:27:0x0072, B:29:0x007a, B:31:0x0082, B:33:0x008a, B:35:0x0092, B:37:0x009e, B:39:0x00ac), top: B:86:0x001c }] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Bundle bundleI1;
        String str2;
        boolean z6;
        zzr zzrVar;
        String str3;
        CharSequence charSequence;
        Bundle bundleI2;
        switch (this.f2942s) {
            case 0:
                zzkx zzkxVarR = ((zzhj) ((zziv) this.f2947x).f577s).r();
                zzkxVarR.W0();
                zzkxVarR.a1();
                zzkxVarR.f1(new a0(zzkxVarR, (AtomicReference) this.f2946w, this.f2943t, this.f2944u, zzkxVarR.p1(false), this.f2945v));
                break;
            case 1:
                zzkx zzkxVarR2 = ((AppMeasurementDynamiteService) this.f2947x).f8881b.r();
                zzkxVarR2.W0();
                zzkxVarR2.a1();
                zzkxVarR2.f1(new a0(zzkxVarR2, this.f2943t, this.f2944u, zzkxVarR2.p1(false), this.f2945v, (zzdg) this.f2946w));
                break;
            default:
                Uri uri = (Uri) this.f2946w;
                String str4 = this.f2944u;
                zziv zzivVar = (zziv) ((Ia.a) this.f2947x).f2217t;
                zzivVar.W0();
                try {
                    zznp zznpVarV0 = zzivVar.V0();
                    zzoj.a();
                    zzhj zzhjVar = (zzhj) zzivVar.f577s;
                    zzag zzagVar = zzhjVar.f9146y;
                    zzfj zzfjVar = zzbf.f8950L0;
                    boolean zH1 = zzagVar.h1(null, zzfjVar);
                    if (!TextUtils.isEmpty(str4)) {
                        if (!str4.contains("gclid")) {
                            if (zH1) {
                                str = "gclid=";
                                if (!str4.contains("gbraid")) {
                                }
                                str2 = this.f2943t;
                                z6 = this.f2945v;
                                zzrVar = zzivVar.f9198H;
                                if (z6) {
                                    zznp zznpVarV1 = zzivVar.V0();
                                    zzoj.a();
                                    str3 = "Activity created with data 'referrer' without required params";
                                    charSequence = "utm_medium";
                                    bundleI2 = zznpVarV1.i1(zzhjVar.f9146y.h1(null, zzfjVar), uri);
                                    if (bundleI2 != null) {
                                        bundleI2.putString("_cis", "intent");
                                        if (!bundleI2.containsKey("gclid") && bundleI1 != null && bundleI1.containsKey("gclid")) {
                                            bundleI2.putString("_cer", str + bundleI1.getString("gclid"));
                                        }
                                        zzivVar.B1(str2, "_cmp", bundleI2);
                                        zzrVar.a(str2, bundleI2);
                                    }
                                } else {
                                    str3 = "Activity created with data 'referrer' without required params";
                                    charSequence = "utm_medium";
                                }
                                if (TextUtils.isEmpty(str4)) {
                                    zzivVar.i().f9051E.a(str4, "Activity created with referrer");
                                    if (!zzhjVar.f9146y.h1(null, zzbf.f8994l0)) {
                                        if (bundleI1 != null) {
                                            zzivVar.B1(str2, "_cmp", bundleI1);
                                            zzrVar.a(str2, bundleI1);
                                        } else {
                                            zzivVar.i().f9051E.a(str4, "Referrer does not contain valid parameters");
                                        }
                                        zzivVar.n1("auto", null, "_ldl", true);
                                    } else if (str4.contains("gclid") || (!str4.contains("utm_campaign") && !str4.contains("utm_source") && !str4.contains(charSequence) && !str4.contains("utm_term") && !str4.contains("utm_content"))) {
                                        zzivVar.i().f9051E.b(str3);
                                    } else if (!TextUtils.isEmpty(str4)) {
                                        zzivVar.n1("auto", str4, "_ldl", true);
                                    }
                                }
                            } else {
                                str = "gclid=";
                            }
                            if (!str4.contains("utm_campaign") && !str4.contains("utm_source") && !str4.contains("utm_medium") && !str4.contains("utm_id") && !str4.contains("dclid") && !str4.contains("srsltid") && !str4.contains("sfmc_id")) {
                                zznpVarV0.i().f9051E.b("Activity created with data 'referrer' without required params");
                            }
                            str2 = this.f2943t;
                            z6 = this.f2945v;
                            zzrVar = zzivVar.f9198H;
                            if (z6) {
                                zznp zznpVarV2 = zzivVar.V0();
                                zzoj.a();
                                str3 = "Activity created with data 'referrer' without required params";
                                charSequence = "utm_medium";
                                bundleI2 = zznpVarV2.i1(zzhjVar.f9146y.h1(null, zzfjVar), uri);
                                if (bundleI2 != null) {
                                    bundleI2.putString("_cis", "intent");
                                    if (!bundleI2.containsKey("gclid")) {
                                        bundleI2.putString("_cer", str + bundleI1.getString("gclid"));
                                    }
                                    zzivVar.B1(str2, "_cmp", bundleI2);
                                    zzrVar.a(str2, bundleI2);
                                }
                            } else {
                                str3 = "Activity created with data 'referrer' without required params";
                                charSequence = "utm_medium";
                            }
                            if (TextUtils.isEmpty(str4)) {
                                zzivVar.i().f9051E.a(str4, "Activity created with referrer");
                                if (!zzhjVar.f9146y.h1(null, zzbf.f8994l0)) {
                                    if (str4.contains("gclid")) {
                                    }
                                    zzivVar.i().f9051E.b(str3);
                                } else {
                                    if (bundleI1 != null) {
                                        zzivVar.B1(str2, "_cmp", bundleI1);
                                        zzrVar.a(str2, bundleI1);
                                    } else {
                                        zzivVar.i().f9051E.a(str4, "Referrer does not contain valid parameters");
                                    }
                                    zzivVar.n1("auto", null, "_ldl", true);
                                }
                            }
                        } else {
                            str = "gclid=";
                        }
                        bundleI1 = zznpVarV0.i1(zH1, Uri.parse("https://google.com/search?".concat(str4)));
                        if (bundleI1 != null) {
                            bundleI1.putString("_cis", "referrer");
                        }
                        str2 = this.f2943t;
                        z6 = this.f2945v;
                        zzrVar = zzivVar.f9198H;
                        if (z6) {
                            zznp zznpVarV3 = zzivVar.V0();
                            zzoj.a();
                            str3 = "Activity created with data 'referrer' without required params";
                            charSequence = "utm_medium";
                            bundleI2 = zznpVarV3.i1(zzhjVar.f9146y.h1(null, zzfjVar), uri);
                            if (bundleI2 != null) {
                                bundleI2.putString("_cis", "intent");
                                if (!bundleI2.containsKey("gclid")) {
                                    bundleI2.putString("_cer", str + bundleI1.getString("gclid"));
                                }
                                zzivVar.B1(str2, "_cmp", bundleI2);
                                zzrVar.a(str2, bundleI2);
                            }
                        } else {
                            str3 = "Activity created with data 'referrer' without required params";
                            charSequence = "utm_medium";
                        }
                        if (TextUtils.isEmpty(str4)) {
                            zzivVar.i().f9051E.a(str4, "Activity created with referrer");
                            if (!zzhjVar.f9146y.h1(null, zzbf.f8994l0)) {
                                if (str4.contains("gclid")) {
                                }
                                zzivVar.i().f9051E.b(str3);
                            } else {
                                if (bundleI1 != null) {
                                    zzivVar.B1(str2, "_cmp", bundleI1);
                                    zzrVar.a(str2, bundleI1);
                                } else {
                                    zzivVar.i().f9051E.a(str4, "Referrer does not contain valid parameters");
                                }
                                zzivVar.n1("auto", null, "_ldl", true);
                            }
                        }
                    } else {
                        str = "gclid=";
                    }
                    bundleI1 = null;
                    str2 = this.f2943t;
                    z6 = this.f2945v;
                    zzrVar = zzivVar.f9198H;
                    if (z6) {
                        zznp zznpVarV4 = zzivVar.V0();
                        zzoj.a();
                        str3 = "Activity created with data 'referrer' without required params";
                        charSequence = "utm_medium";
                        bundleI2 = zznpVarV4.i1(zzhjVar.f9146y.h1(null, zzfjVar), uri);
                        if (bundleI2 != null) {
                            bundleI2.putString("_cis", "intent");
                            if (!bundleI2.containsKey("gclid")) {
                                bundleI2.putString("_cer", str + bundleI1.getString("gclid"));
                            }
                            zzivVar.B1(str2, "_cmp", bundleI2);
                            zzrVar.a(str2, bundleI2);
                        }
                    } else {
                        str3 = "Activity created with data 'referrer' without required params";
                        charSequence = "utm_medium";
                    }
                    if (TextUtils.isEmpty(str4)) {
                        zzivVar.i().f9051E.a(str4, "Activity created with referrer");
                        if (!zzhjVar.f9146y.h1(null, zzbf.f8994l0)) {
                            if (str4.contains("gclid")) {
                            }
                            zzivVar.i().f9051E.b(str3);
                        } else {
                            if (bundleI1 != null) {
                                zzivVar.B1(str2, "_cmp", bundleI1);
                                zzrVar.a(str2, bundleI1);
                            } else {
                                zzivVar.i().f9051E.a(str4, "Referrer does not contain valid parameters");
                            }
                            zzivVar.n1("auto", null, "_ldl", true);
                        }
                    }
                } catch (RuntimeException e10) {
                    zzivVar.i().f9056x.a(e10, "Throwable caught in handleReferrerForOnActivityCreated");
                }
                break;
        }
    }

    public V(Ia.a aVar, boolean z6, Uri uri, String str, String str2) {
        this.f2942s = 2;
        this.f2945v = z6;
        this.f2946w = uri;
        this.f2943t = str;
        this.f2944u = str2;
        this.f2947x = aVar;
    }
}
