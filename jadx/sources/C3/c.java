package C3;

import B4.I;
import B4.t;
import J.f;
import J3.j;
import M2.C0313w;
import M2.Q;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.S;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzav;
import com.google.android.gms.measurement.internal.zzax;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzfj;
import com.google.android.gms.measurement.internal.zzfp;
import com.google.android.gms.measurement.internal.zzfq;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgl;
import com.google.android.gms.measurement.internal.zzgm;
import com.google.android.gms.measurement.internal.zzgn;
import com.google.android.gms.measurement.internal.zzgp;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzhd;
import com.google.android.gms.measurement.internal.zzhi;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzim;
import com.google.android.gms.measurement.internal.zzin;
import com.google.android.gms.measurement.internal.zzit;
import com.google.android.gms.measurement.internal.zziv;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzkx;
import com.google.android.gms.measurement.internal.zzmh;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zzq;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f940s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f941t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f942u;

    public c(t tVar, String str, String str2, String str3, String str4, long j) {
        this.f940s = 1;
        this.f942u = tVar;
        this.f941t = str;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:104:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:105:0x030b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0315  */
    /* JADX WARN: Code duplicated, block: B:111:0x0328  */
    /* JADX WARN: Code duplicated, block: B:113:0x032c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0333  */
    /* JADX WARN: Code duplicated, block: B:117:0x0367  */
    /* JADX WARN: Code duplicated, block: B:119:0x036f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0378  */
    /* JADX WARN: Code duplicated, block: B:123:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:128:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:131:0x0433  */
    /* JADX WARN: Code duplicated, block: B:162:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:165:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:169:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:170:0x04f2 A[PHI: r22
      0x04f2: PHI (r22v2 com.google.android.gms.measurement.internal.zzin$zza) = 
      (r22v1 com.google.android.gms.measurement.internal.zzin$zza)
      (r22v3 com.google.android.gms.measurement.internal.zzin$zza)
     binds: [B:168:0x04e9, B:166:0x04e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:172:0x0500 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x0522  */
    /* JADX WARN: Code duplicated, block: B:184:0x0530 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:192:0x0549 A[PHI: r4 r22 r24
      0x0549: PHI (r4v82 com.google.android.gms.internal.measurement.zzdo) = 
      (r4v40 com.google.android.gms.internal.measurement.zzdo)
      (r4v40 com.google.android.gms.internal.measurement.zzdo)
      (r4v40 com.google.android.gms.internal.measurement.zzdo)
      (r4v40 com.google.android.gms.internal.measurement.zzdo)
      (r4v40 com.google.android.gms.internal.measurement.zzdo)
      (r4v40 com.google.android.gms.internal.measurement.zzdo)
      (r4v99 com.google.android.gms.internal.measurement.zzdo)
     binds: [B:183:0x052e, B:184:0x0530, B:186:0x0534, B:188:0x053c, B:190:0x0546, B:181:0x0512, B:148:0x0487] A[DONT_GENERATE, DONT_INLINE]
      0x0549: PHI (r22v5 com.google.android.gms.measurement.internal.zzin$zza) = 
      (r22v2 com.google.android.gms.measurement.internal.zzin$zza)
      (r22v2 com.google.android.gms.measurement.internal.zzin$zza)
      (r22v2 com.google.android.gms.measurement.internal.zzin$zza)
      (r22v2 com.google.android.gms.measurement.internal.zzin$zza)
      (r22v2 com.google.android.gms.measurement.internal.zzin$zza)
      (r22v2 com.google.android.gms.measurement.internal.zzin$zza)
      (r22v8 com.google.android.gms.measurement.internal.zzin$zza)
     binds: [B:183:0x052e, B:184:0x0530, B:186:0x0534, B:188:0x053c, B:190:0x0546, B:181:0x0512, B:148:0x0487] A[DONT_GENERATE, DONT_INLINE]
      0x0549: PHI (r24v3 com.google.android.gms.measurement.internal.zzin) = 
      (r24v1 com.google.android.gms.measurement.internal.zzin)
      (r24v1 com.google.android.gms.measurement.internal.zzin)
      (r24v1 com.google.android.gms.measurement.internal.zzin)
      (r24v1 com.google.android.gms.measurement.internal.zzin)
      (r24v1 com.google.android.gms.measurement.internal.zzin)
      (r24v1 com.google.android.gms.measurement.internal.zzin)
      (r24v4 com.google.android.gms.measurement.internal.zzin)
     binds: [B:183:0x052e, B:184:0x0530, B:186:0x0534, B:188:0x053c, B:190:0x0546, B:181:0x0512, B:148:0x0487] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:194:0x054c  */
    /* JADX WARN: Code duplicated, block: B:195:0x055a  */
    /* JADX WARN: Code duplicated, block: B:198:0x0581  */
    /* JADX WARN: Code duplicated, block: B:200:0x058a  */
    /* JADX WARN: Code duplicated, block: B:202:0x059a  */
    /* JADX WARN: Code duplicated, block: B:208:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:213:0x05f1 A[PHI: r13 r20
      0x05f1: PHI (r13v16 com.google.android.gms.measurement.internal.zzfw) = 
      (r13v15 com.google.android.gms.measurement.internal.zzfw)
      (r13v15 com.google.android.gms.measurement.internal.zzfw)
      (r13v22 com.google.android.gms.measurement.internal.zzfw)
      (r13v22 com.google.android.gms.measurement.internal.zzfw)
     binds: [B:209:0x05d3, B:211:0x05db, B:204:0x05a3, B:206:0x05ab] A[DONT_GENERATE, DONT_INLINE]
      0x05f1: PHI (r20v4 java.lang.String) = (r20v3 java.lang.String), (r20v3 java.lang.String), (r2v0 java.lang.String), (r2v0 java.lang.String) binds: [B:209:0x05d3, B:211:0x05db, B:204:0x05a3, B:206:0x05ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:215:0x05ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:219:0x061b  */
    /* JADX WARN: Code duplicated, block: B:221:0x0629 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:229:0x064b  */
    /* JADX WARN: Code duplicated, block: B:234:0x066e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:244:0x0699  */
    /* JADX WARN: Code duplicated, block: B:245:0x069b  */
    /* JADX WARN: Code duplicated, block: B:247:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:249:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:253:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:261:0x0729  */
    /* JADX WARN: Code duplicated, block: B:263:0x072f  */
    /* JADX WARN: Code duplicated, block: B:265:0x073a  */
    /* JADX WARN: Code duplicated, block: B:268:0x074c  */
    /* JADX WARN: Code duplicated, block: B:275:0x076e  */
    /* JADX WARN: Code duplicated, block: B:278:0x077e  */
    /* JADX WARN: Code duplicated, block: B:282:0x0796  */
    /* JADX WARN: Code duplicated, block: B:284:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:287:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:288:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:290:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:292:0x080d  */
    /* JADX WARN: Code duplicated, block: B:293:0x081b  */
    /* JADX WARN: Code duplicated, block: B:296:0x082c  */
    /* JADX WARN: Code duplicated, block: B:301:0x0898  */
    /* JADX WARN: Code duplicated, block: B:307:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:309:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:312:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:315:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:318:0x0901  */
    /* JADX WARN: Code duplicated, block: B:319:0x0903  */
    /* JADX WARN: Code duplicated, block: B:321:0x090b  */
    /* JADX WARN: Code duplicated, block: B:326:0x091d  */
    /* JADX WARN: Code duplicated, block: B:328:0x0920  */
    /* JADX WARN: Code duplicated, block: B:329:0x0926  */
    /* JADX WARN: Code duplicated, block: B:32:0x0147 A[Catch: NameNotFoundException -> 0x0166, TryCatch #2 {NameNotFoundException -> 0x0166, blocks: (B:30:0x013c, B:32:0x0147, B:34:0x0153), top: B:354:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:331:0x092a  */
    /* JADX WARN: Code duplicated, block: B:335:0x0971  */
    /* JADX WARN: Code duplicated, block: B:337:0x097f  */
    /* JADX WARN: Code duplicated, block: B:338:0x0981  */
    /* JADX WARN: Code duplicated, block: B:340:0x0984  */
    /* JADX WARN: Code duplicated, block: B:34:0x0153 A[Catch: NameNotFoundException -> 0x0166, TRY_LEAVE, TryCatch #2 {NameNotFoundException -> 0x0166, blocks: (B:30:0x013c, B:32:0x0147, B:34:0x0153), top: B:354:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:356:0x02d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0653 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:? A[LOOP:0: B:227:0x0645->B:366:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0158  */
    /* JADX WARN: Code duplicated, block: B:93:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:97:0x02e5 A[Catch: NotFoundException -> 0x02ea, TRY_LEAVE, TryCatch #3 {NotFoundException -> 0x02ea, blocks: (B:94:0x02d0, B:97:0x02e5), top: B:356:0x02d0 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:120:0x0378, please report this as an issue */
    private final void a() {
        String string;
        PackageInfo packageInfo;
        CharSequence applicationLabel;
        String str;
        Integer numValueOf;
        String[] stringArray;
        List listAsList;
        zzfw zzfwVar;
        zzfy zzfyVar;
        String strD1;
        boolean zIsEmpty;
        zzag zzagVar;
        int i10;
        AtomicInteger atomicInteger;
        zzdo zzdoVar;
        zzin zzinVarH1;
        zzin.zza zzaVar;
        zzim zzimVar;
        zzfj zzfjVar;
        boolean zH1;
        long j;
        zziv zzivVar;
        zzin zzinVar;
        zzdo zzdoVar2;
        Boolean boolF1;
        Boolean boolF2;
        zzin.zza zzaVar2;
        zzin zzinVar2;
        Bundle bundle;
        zzfw zzfwVar2;
        Boolean boolF3;
        Bundle bundle2;
        Boolean boolC;
        Bundle bundle3;
        zzav zzavVarA;
        Iterator it;
        Boolean boolF4;
        boolean zBooleanValue;
        zzgm zzgmVar;
        zzr zzrVar;
        boolean zIsEmpty2;
        zzgn zzgnVar;
        String strE1;
        String string2;
        String str2;
        String str3;
        Boolean boolValueOf;
        boolean z6;
        boolean zH;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean z10;
        Boolean boolF5;
        boolean z11;
        zzfq zzfqVarO;
        zzgn zzgnVar2;
        zzfq zzfqVarO2;
        boolean z12;
        Context context;
        zzim zzimVarD1;
        zzim zzimVarD2;
        zzim zzimVarD3;
        zzim zzimVarD4;
        zzin zzinVarD;
        Iterator it2;
        String str4 = "admob_app_id";
        zzhj zzhjVar = (zzhj) this.f942u;
        zzhc zzhcVar = zzhjVar.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        zzax zzaxVar = new zzax(zzhjVar);
        zzaxVar.Y0();
        zzhjVar.f9128N = zzaxVar;
        zzit zzitVar = (zzit) this.f941t;
        long j10 = zzitVar.f9187f;
        zzfq zzfqVar = new zzfq(zzhjVar);
        zzfqVar.f9036G = 0L;
        zzfqVar.f9037H = null;
        zzfqVar.f9043z = j10;
        zzfqVar.b1();
        zzhjVar.f9129O = zzfqVar;
        zzfp zzfpVar = new zzfp(zzhjVar);
        zzfpVar.b1();
        zzhjVar.f9126L = zzfpVar;
        zzkx zzkxVar = new zzkx(zzhjVar);
        zzkxVar.b1();
        zzhjVar.f9127M = zzkxVar;
        zznp zznpVar = zzhjVar.f9118D;
        if (zznpVar.f2917t) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zznpVar.W0();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                zznpVar.i().f9047A.b("Utils falling back to Random for random id");
            }
        }
        zznpVar.f9322v.set(jNextLong);
        ((zzhj) zznpVar.f577s).f9138Y.incrementAndGet();
        zznpVar.f2917t = true;
        C0313w c0313w = zzhjVar.f9147z;
        if (c0313w.f2917t) {
            throw new IllegalStateException("Can't initialize twice");
        }
        SharedPreferences sharedPreferences2 = ((zzhj) c0313w.f577s).f9140s.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        c0313w.f3147u = sharedPreferences2;
        boolean z13 = sharedPreferences2.getBoolean("has_been_opened", false);
        c0313w.f3140K = z13;
        if (!z13) {
            SharedPreferences.Editor editorEdit = c0313w.f3147u.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        c0313w.f3150x = new zzgl(c0313w, Math.max(0L, ((Long) zzbf.f8979d.a(null)).longValue()));
        ((zzhj) c0313w.f577s).f9138Y.incrementAndGet();
        c0313w.f2917t = true;
        zzfq zzfqVar2 = zzhjVar.f9129O;
        if (zzfqVar2.f3054t) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzhj zzhjVar2 = (zzhj) zzfqVar2.f577s;
        Context context2 = zzhjVar2.f9140s;
        String str5 = zzhjVar2.f9125K;
        String packageName = context2.getPackageName();
        Context context3 = zzhjVar2.f9140s;
        PackageManager packageManager = context3.getPackageManager();
        String str6 = "";
        String installerPackageName = "unknown";
        String str7 = "Unknown";
        int i11 = Integer.MIN_VALUE;
        if (packageManager == null) {
            zzfqVar2.i().f9056x.a(zzfw.a1(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
        } else {
            try {
                installerPackageName = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                zzfqVar2.i().f9056x.a(zzfw.a1(packageName), "Error retrieving app installer package name. appId");
            }
            String str8 = installerPackageName;
            try {
                if (str8 == null) {
                    str8 = "manual_install";
                } else {
                    if ("com.android.vending".equals(str8)) {
                        installerPackageName = "";
                    }
                    packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                    if (packageInfo != null) {
                        applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        if (TextUtils.isEmpty(applicationLabel)) {
                            string = "Unknown";
                        } else {
                            string = applicationLabel.toString();
                        }
                        try {
                            str = packageInfo.versionName;
                            try {
                                i11 = packageInfo.versionCode;
                                str7 = str;
                            } catch (PackageManager.NameNotFoundException unused2) {
                                str7 = str;
                                zzfqVar2.i().f9056x.c("Error retrieving package info. appId, appName", zzfw.a1(packageName), string);
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                        }
                    }
                }
                packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                if (packageInfo != null) {
                    applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    if (TextUtils.isEmpty(applicationLabel)) {
                        string = applicationLabel.toString();
                    } else {
                        string = "Unknown";
                    }
                    str = packageInfo.versionName;
                    i11 = packageInfo.versionCode;
                    str7 = str;
                }
            } catch (PackageManager.NameNotFoundException unused4) {
                string = "Unknown";
            }
            installerPackageName = str8;
        }
        String str9 = installerPackageName;
        String str10 = str7;
        int i12 = i11;
        zzfqVar2.f9038u = packageName;
        zzfqVar2.f9041x = str9;
        zzfqVar2.f9039v = str10;
        zzfqVar2.f9040w = i12;
        zzfqVar2.f9042y = 0L;
        String str11 = zzhjVar2.f9141t;
        boolean z14 = !TextUtils.isEmpty(str11) && "am".equals(zzhjVar2.f9142u);
        int iK = zzhjVar2.k();
        switch (iK) {
            case 0:
                zzfqVar2.i().f9052F.b("App measurement collection enabled");
                break;
            case 1:
                zzfqVar2.i().f9050D.b("App measurement deactivated via the manifest");
                break;
            case 2:
                zzfqVar2.i().f9052F.b("App measurement deactivated via the init parameters");
                break;
            case 3:
                zzfqVar2.i().f9050D.b("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            case 4:
                zzfqVar2.i().f9050D.b("App measurement disabled via the manifest");
                break;
            case 5:
                zzfqVar2.i().f9052F.b("App measurement disabled via the init parameters");
                break;
            case 6:
                zzfqVar2.i().f9049C.b("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            case 7:
                zzfqVar2.i().f9050D.b("App measurement disabled via the global data collection setting");
                break;
            case 8:
                zzfqVar2.i().f9050D.b("App measurement disabled due to denied storage consent");
                break;
            default:
                zzfqVar2.i().f9050D.b("App measurement disabled");
                zzfqVar2.i().f9057y.b("Invalid scion state in identity");
                break;
        }
        boolean z15 = iK == 0;
        zzfqVar2.f9033D = "";
        zzfqVar2.f9034E = "";
        if (z14) {
            zzfqVar2.f9034E = str11;
        }
        try {
            String strA = new zzhd(context3, str5).a("google_app_id");
            if (!TextUtils.isEmpty(strA)) {
                str6 = strA;
            }
            zzfqVar2.f9033D = str6;
            if (!TextUtils.isEmpty(strA)) {
                zzfqVar2.f9034E = new zzhd(context3, str5).a("admob_app_id");
            }
            if (z15) {
                zzfqVar2.i().f9052F.c("App measurement enabled for app package, google app id", zzfqVar2.f9038u, TextUtils.isEmpty(zzfqVar2.f9033D) ? zzfqVar2.f9034E : zzfqVar2.f9033D);
            }
        } catch (IllegalStateException e10) {
            zzfqVar2.i().f9056x.c("Fetching Google App Id failed with exception. appId", zzfw.a1(packageName), e10);
        }
        zzfqVar2.f9030A = null;
        zzag zzagVar2 = zzhjVar2.f9146y;
        zzagVar2.getClass();
        Preconditions.e("analytics.safelisted_events");
        Bundle bundleM1 = zzagVar2.m1();
        if (bundleM1 != null) {
            if (bundleM1.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleM1.getInt("analytics.safelisted_events"));
            }
            if (numValueOf == null) {
                listAsList = null;
            } else {
                try {
                    stringArray = ((zzhj) zzagVar2.f577s).f9140s.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = null;
                    } else {
                        listAsList = Arrays.asList(stringArray);
                    }
                } catch (Resources.NotFoundException e11) {
                    zzagVar2.i().f9056x.a(e11, "Failed to load string array from metadata: resource not found");
                }
            }
            if (listAsList == null) {
                zzfqVar2.f9030A = listAsList;
            } else if (listAsList.isEmpty()) {
                zzfqVar2.i().f9049C.b("Safelisted event list is empty. Ignoring");
            } else {
                it2 = listAsList.iterator();
                do {
                    if (it2.hasNext()) {
                        zzfqVar2.f9030A = listAsList;
                    }
                } while (zzfqVar2.V0().U1("safelisted event", (String) it2.next()));
            }
            if (packageManager != null) {
                zzfqVar2.f9032C = InstantApps.a(context3) ? 1 : 0;
            } else {
                zzfqVar2.f9032C = 0;
            }
            zzhjVar2.f9138Y.incrementAndGet();
            zzfqVar2.f3054t = true;
            zzfwVar = zzhjVar.f9115A;
            zzhj.g(zzfwVar);
            zzfyVar = zzfwVar.f9050D;
            zzfyVar.a(97001L, "App measurement initialized, version");
            zzhj.g(zzfwVar);
            zzfyVar.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
            strD1 = zzfqVar.d1();
            zIsEmpty = TextUtils.isEmpty(zzhjVar.f9141t);
            zzagVar = zzhjVar.f9146y;
            if (zIsEmpty) {
                if (zznpVar.Y1(strD1, zzagVar.f8895u)) {
                    zzhj.g(zzfwVar);
                    zzfyVar.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    zzhj.g(zzfwVar);
                    zzfyVar.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + strD1);
                }
            }
            zzhj.g(zzfwVar);
            zzfwVar.f9051E.b("Debug-level message logging enabled");
            i10 = zzhjVar.f9136W;
            atomicInteger = zzhjVar.f9138Y;
            if (i10 != atomicInteger.get()) {
                zzhj.g(zzfwVar);
                zzfwVar.f9056x.c("Not all components initialized", Integer.valueOf(zzhjVar.f9136W), Integer.valueOf(atomicInteger.get()));
            }
            zzhjVar.P = true;
            zzdoVar = zzitVar.f9188g;
            zzhc zzhcVar2 = zzhjVar.f9116B;
            zzhj.g(zzhcVar2);
            zzhcVar2.W0();
            zzpg.a();
            if (zzagVar.h1(null, zzbf.f8928A0)) {
                zzhj.e(zznpVar);
                zznpVar.W0();
                if (zznpVar.d2() == 1) {
                    zznpVar.W0();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    zzhj zzhjVar3 = (zzhj) zznpVar.f577s;
                    f.e(zzhjVar3.f9140s, new zzq(zzhjVar3), intentFilter, 2);
                    zznpVar.i().f9051E.b("Registered app receiver");
                }
            }
            zzhj.e(c0313w);
            zzinVarH1 = c0313w.h1();
            zzne.a();
            zzaVar = zzin.zza.ANALYTICS_STORAGE;
            zzimVar = zzim.UNINITIALIZED;
            zzfjVar = zzbf.f8959Q0;
            zH1 = zzagVar.h1(null, zzfjVar);
            j = zzhjVar.f9139Z;
            zzivVar = zzhjVar.f9122H;
            int i13 = zzinVarH1.f9165b;
            if (zH1) {
                zzinVar = zzinVarH1;
                zzimVarD3 = zzagVar.d1("google_analytics_default_allow_ad_storage", false);
                zzimVarD4 = zzagVar.d1("google_analytics_default_allow_analytics_storage", false);
                if ((zzimVarD3 == zzimVar || zzimVarD4 != zzimVar) && c0313w.b1(-10)) {
                    EnumMap enumMap = new EnumMap(zzin.zza.class);
                    enumMap.put(zzin.zza.AD_STORAGE, zzimVarD3);
                    enumMap.put(zzaVar, zzimVarD4);
                    zzinVar2 = new zzin(enumMap, -10);
                    zzdoVar2 = zzdoVar;
                    zzaVar2 = zzaVar;
                } else if (TextUtils.isEmpty(zzhjVar.o().e1()) || !(i13 == 0 || i13 == 30 || i13 == 10 || i13 == 30 || i13 == 30 || i13 == 40)) {
                    if (!TextUtils.isEmpty(zzhjVar.o().e1()) || zzdoVar == null) {
                        zzdoVar2 = zzdoVar;
                    } else {
                        zzdoVar2 = zzdoVar;
                        Bundle bundle4 = zzdoVar2.f8563y;
                        if (bundle4 != null && c0313w.b1(30)) {
                            zzinVarD = zzin.d(30, bundle4);
                            if (!zzinVarD.q()) {
                            }
                        }
                        zzaVar2 = zzaVar;
                        zzinVar2 = zzinVarD;
                    }
                    zzinVarD = null;
                    zzaVar2 = zzaVar;
                    zzinVar2 = zzinVarD;
                } else {
                    zzhj.f(zzivVar);
                    zzivVar.j1(new zzin(null, null, -10), j, false);
                    zzdoVar2 = zzdoVar;
                    zzaVar2 = zzaVar;
                    zzinVar2 = null;
                }
            } else {
                zzinVar = zzinVarH1;
                zzdoVar2 = zzdoVar;
                boolF1 = zzagVar.f1("google_analytics_default_allow_ad_storage");
                boolF2 = zzagVar.f1("google_analytics_default_allow_analytics_storage");
                if (boolF1 == null || boolF2 != null) {
                    zzaVar2 = zzaVar;
                    if (c0313w.b1(-10)) {
                        zzinVar2 = new zzin(boolF1, boolF2, -10);
                    }
                } else {
                    zzaVar2 = zzaVar;
                }
                if (TextUtils.isEmpty(zzhjVar.o().e1()) && (i13 == 0 || i13 == 30 || i13 == 10 || i13 == 30 || i13 == 30 || i13 == 40)) {
                    zzhj.f(zzivVar);
                    zzivVar.j1(new zzin(null, null, -10), j, false);
                } else if (TextUtils.isEmpty(zzhjVar.o().e1()) && zzdoVar2 != null && (bundle = zzdoVar2.f8563y) != null && c0313w.b1(30)) {
                    zzinVar2 = zzin.d(30, bundle);
                    if (!zzinVar2.q()) {
                    }
                }
                zzinVar2 = null;
            }
            if (zzinVar2 != null) {
                zzhj.f(zzivVar);
                zzivVar.j1(zzinVar2, j, zzagVar.h1(null, zzbf.f8965T0));
            } else {
                zzinVar2 = zzinVar;
            }
            zzhj.f(zzivVar);
            zzivVar.i1(zzinVar2);
            c0313w.W0();
            int i14 = zzav.b(c0313w.f1().getString("dma_consent_settings", null)).a;
            zzne.a();
            if (zzagVar.h1(null, zzfjVar)) {
                zzimVarD1 = zzagVar.d1("google_analytics_default_allow_ad_personalization_signals", true);
                if (zzimVarD1 != zzimVar) {
                    zzhj.g(zzfwVar);
                    zzfwVar2 = zzfwVar;
                    zzfwVar2.f9052F.a(zzimVarD1, "Default ad personalization consent from Manifest");
                } else {
                    zzfwVar2 = zzfwVar;
                }
                zzimVarD2 = zzagVar.d1("google_analytics_default_allow_ad_user_data", true);
                if (zzimVarD2 == zzimVar && zzin.h(-10, i14)) {
                    zzhj.f(zzivVar);
                    EnumMap enumMap2 = new EnumMap(zzin.zza.class);
                    enumMap2.put(zzin.zza.AD_USER_DATA, zzimVarD2);
                    zzivVar.h1(new zzav(enumMap2, -10, (Boolean) null, (String) null), zzagVar.h1(null, zzbf.f8965T0));
                } else if (TextUtils.isEmpty(zzhjVar.o().e1()) && (i14 == 0 || i14 == 30)) {
                    zzhj.f(zzivVar);
                    zzivVar.h1(new zzav((Boolean) null, -10, (Boolean) null, (String) null), zzagVar.h1(null, zzbf.f8965T0));
                } else {
                    if (TextUtils.isEmpty(zzhjVar.o().e1()) && zzdoVar2 != null && (bundle3 = zzdoVar2.f8563y) != null && zzin.h(30, i14)) {
                        zzavVarA = zzav.a(30, bundle3);
                        it = zzavVarA.f8908e.values().iterator();
                        while (it.hasNext()) {
                            if (((zzim) it.next()) != zzimVar) {
                                zzhj.f(zzivVar);
                                zzivVar.h1(zzavVarA, zzagVar.h1(null, zzbf.f8965T0));
                            }
                        }
                    }
                    if (TextUtils.isEmpty(zzhjVar.o().e1()) && zzdoVar2 != null && (bundle2 = zzdoVar2.f8563y) != null && c0313w.f3135F.a() == null && (boolC = zzav.c(bundle2)) != null) {
                        zzhj.f(zzivVar);
                        zzivVar.n1(zzdoVar2.f8561w, boolC.toString(), "allow_personalized_ads", false);
                    }
                }
            } else {
                str4 = "admob_app_id";
                zzfwVar2 = zzfwVar;
                boolF3 = zzagVar.f1("google_analytics_default_allow_ad_user_data");
                if (boolF3 == null && zzin.h(-10, i14)) {
                    zzhj.f(zzivVar);
                    zzivVar.h1(new zzav(boolF3, -10, (Boolean) null, (String) null), zzagVar.h1(null, zzbf.f8965T0));
                } else if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                    if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                        zzavVarA = zzav.a(30, bundle3);
                        it = zzavVarA.f8908e.values().iterator();
                        while (it.hasNext()) {
                            if (((zzim) it.next()) != zzimVar) {
                                zzhj.f(zzivVar);
                                zzivVar.h1(zzavVarA, zzagVar.h1(null, zzbf.f8965T0));
                            }
                        }
                    }
                    if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                        zzhj.f(zzivVar);
                        zzivVar.n1(zzdoVar2.f8561w, boolC.toString(), "allow_personalized_ads", false);
                    }
                } else {
                    if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                        zzavVarA = zzav.a(30, bundle3);
                        it = zzavVarA.f8908e.values().iterator();
                        while (it.hasNext()) {
                            if (((zzim) it.next()) != zzimVar) {
                                zzhj.f(zzivVar);
                                zzivVar.h1(zzavVarA, zzagVar.h1(null, zzbf.f8965T0));
                            }
                        }
                    }
                    if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                        zzhj.f(zzivVar);
                        zzivVar.n1(zzdoVar2.f8561w, boolC.toString(), "allow_personalized_ads", false);
                    }
                }
            }
            boolF4 = zzagVar.f1("google_analytics_tcf_data_enabled");
            if (boolF4 == null) {
                zBooleanValue = true;
            } else {
                zBooleanValue = boolF4.booleanValue();
            }
            if (zBooleanValue) {
                zzhj.g(zzfwVar2);
                zzfwVar2.f9051E.b("TCF client enabled.");
                zzhj.f(zzivVar);
                zzivVar.W0();
                zzivVar.i().f9051E.b("Register tcfPrefChangeListener.");
                if (zzivVar.f9201K == null) {
                    zzivVar.f9202L = new Q(zzivVar, (zzhj) zzivVar.f577s, 1);
                    zzjd zzjdVar = new zzjd();
                    zzjdVar.a = zzivVar;
                    zzivVar.f9201K = zzjdVar;
                }
                zzivVar.U0().e1().registerOnSharedPreferenceChangeListener(zzivVar.f9201K);
                zzhj.f(zzivVar);
                zzivVar.w1();
            }
            zzgmVar = c0313w.f3151y;
            if (zzgmVar.a() == 0) {
                zzhj.g(zzfwVar2);
                zzfwVar2.f9052F.a(Long.valueOf(j), "Persisting first open");
                zzgmVar.b(j);
            }
            zzhj.f(zzivVar);
            zzrVar = zzivVar.f9198H;
            if (zzrVar.b() && zzrVar.c()) {
                C0313w c0313w2 = zzrVar.a.f9147z;
                zzhj.e(c0313w2);
                c0313w2.P.b(null);
            }
            if (!zzhjVar.j()) {
                zIsEmpty2 = TextUtils.isEmpty(zzhjVar.o().e1());
                zzgnVar = c0313w.f3152z;
                if (zIsEmpty2) {
                    zzfqVarO2 = zzhjVar.o();
                    zzfqVarO2.a1();
                    if (!TextUtils.isEmpty(zzfqVarO2.f9034E)) {
                        zzhjVar.s();
                        strE1 = zzhjVar.o().e1();
                        c0313w.W0();
                        string2 = c0313w.f1().getString("gmp_app_id", null);
                        zzfq zzfqVarO3 = zzhjVar.o();
                        zzfqVarO3.a1();
                        str2 = zzfqVarO3.f9034E;
                        c0313w.W0();
                        str3 = str4;
                        if (zznp.J1(strE1, string2, str2, c0313w.f1().getString(str3, null))) {
                            zzhj.g(zzfwVar2);
                            zzfwVar2.f9050D.b("Rechecking which service to use due to a GMP App Id change");
                            c0313w.W0();
                            c0313w.W0();
                            if (c0313w.f1().contains("measurement_enabled")) {
                                boolValueOf = Boolean.valueOf(c0313w.f1().getBoolean("measurement_enabled", true));
                            } else {
                                boolValueOf = null;
                            }
                            SharedPreferences.Editor editorEdit2 = c0313w.f1().edit();
                            editorEdit2.clear();
                            editorEdit2.apply();
                            if (boolValueOf != null) {
                                c0313w.W0();
                                SharedPreferences.Editor editorEdit3 = c0313w.f1().edit();
                                editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                editorEdit3.apply();
                            }
                            zzhjVar.p().f1();
                            zzhjVar.f9127M.j1();
                            zzhjVar.f9127M.i1();
                            zzgmVar.b(j);
                            zzgnVar.b(null);
                        }
                        String strE2 = zzhjVar.o().e1();
                        c0313w.W0();
                        SharedPreferences.Editor editorEdit4 = c0313w.f1().edit();
                        editorEdit4.putString("gmp_app_id", strE2);
                        editorEdit4.apply();
                        zzfq zzfqVarO4 = zzhjVar.o();
                        zzfqVarO4.a1();
                        String str12 = zzfqVarO4.f9034E;
                        c0313w.W0();
                        SharedPreferences.Editor editorEdit5 = c0313w.f1().edit();
                        editorEdit5.putString(str3, str12);
                        editorEdit5.apply();
                    }
                } else {
                    zzhjVar.s();
                    strE1 = zzhjVar.o().e1();
                    c0313w.W0();
                    string2 = c0313w.f1().getString("gmp_app_id", null);
                    zzfq zzfqVarO5 = zzhjVar.o();
                    zzfqVarO5.a1();
                    str2 = zzfqVarO5.f9034E;
                    c0313w.W0();
                    str3 = str4;
                    if (zznp.J1(strE1, string2, str2, c0313w.f1().getString(str3, null))) {
                        zzhj.g(zzfwVar2);
                        zzfwVar2.f9050D.b("Rechecking which service to use due to a GMP App Id change");
                        c0313w.W0();
                        c0313w.W0();
                        if (c0313w.f1().contains("measurement_enabled")) {
                            boolValueOf = Boolean.valueOf(c0313w.f1().getBoolean("measurement_enabled", true));
                        } else {
                            boolValueOf = null;
                        }
                        SharedPreferences.Editor editorEdit6 = c0313w.f1().edit();
                        editorEdit6.clear();
                        editorEdit6.apply();
                        if (boolValueOf != null) {
                            c0313w.W0();
                            SharedPreferences.Editor editorEdit7 = c0313w.f1().edit();
                            editorEdit7.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                            editorEdit7.apply();
                        }
                        zzhjVar.p().f1();
                        zzhjVar.f9127M.j1();
                        zzhjVar.f9127M.i1();
                        zzgmVar.b(j);
                        zzgnVar.b(null);
                    }
                    String strE3 = zzhjVar.o().e1();
                    c0313w.W0();
                    SharedPreferences.Editor editorEdit8 = c0313w.f1().edit();
                    editorEdit8.putString("gmp_app_id", strE3);
                    editorEdit8.apply();
                    zzfq zzfqVarO6 = zzhjVar.o();
                    zzfqVarO6.a1();
                    String str13 = zzfqVarO6.f9034E;
                    c0313w.W0();
                    SharedPreferences.Editor editorEdit9 = c0313w.f1().edit();
                    editorEdit9.putString(str3, str13);
                    editorEdit9.apply();
                }
                if (!c0313w.h1().i(zzaVar2)) {
                    zzgnVar.b(null);
                }
                zzhj.f(zzivVar);
                zzivVar.A1(zzgnVar.a());
                zzhj.e(zznpVar);
                try {
                    ((zzhj) zznpVar.f577s).f9140s.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    z6 = true;
                } catch (ClassNotFoundException unused5) {
                    z6 = false;
                }
                if (!z6) {
                    zzgnVar2 = c0313w.f3144O;
                    if (!TextUtils.isEmpty(zzgnVar2.a())) {
                        zzhj.g(zzfwVar2);
                        zzfwVar2.f9047A.b("Remote config removed with active feature rollouts");
                        zzgnVar2.b(null);
                    }
                }
                if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                    zzfqVarO = zzhjVar.o();
                    zzfqVarO.a1();
                    if (!TextUtils.isEmpty(zzfqVarO.f9034E)) {
                    }
                    zzpg.a();
                    if (zzagVar.h1(null, zzbf.f8928A0)) {
                        zzhj.e(zznpVar);
                        zznpVar.W0();
                        if (zznpVar.d2() == 1) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if (z12) {
                            zzhj.f(zzivVar);
                            zzhi zzhiVar = new zzhi();
                            zzhiVar.f9113s = zzivVar;
                            new Thread(zzhiVar).start();
                        }
                    }
                    c0313w.f3137H.a(true);
                }
                zH = zzhjVar.h();
                sharedPreferences = c0313w.f3147u;
                if (sharedPreferences == null) {
                    zContains = false;
                } else {
                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                }
                if (zContains) {
                    zzagVar = zzagVar;
                } else {
                    zzagVar = zzagVar;
                    boolF5 = zzagVar.f1("firebase_analytics_collection_deactivated");
                    if (boolF5 == null && boolF5.booleanValue()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        c0313w.d1(!zH);
                    }
                }
                if (zH) {
                    zzhj.f(zzivVar);
                    zzivVar.t1();
                }
                zzmh zzmhVar = zzhjVar.f9117C;
                zzhj.f(zzmhVar);
                zzmhVar.f9268w.M();
                zzhjVar.r().g1(new AtomicReference());
                zzkx zzkxVarR = zzhjVar.r();
                Bundle bundleA = c0313w.f3146R.a();
                zzkxVarR.W0();
                zzkxVarR.a1();
                z10 = false;
                zzkxVarR.f1(new I(zzkxVarR, zzkxVarR.p1(false), bundleA, 8));
                zzpg.a();
                if (zzagVar.h1(null, zzbf.f8928A0)) {
                    zzhj.e(zznpVar);
                    zznpVar.W0();
                    if (zznpVar.d2() == 1) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (z12) {
                        zzhj.f(zzivVar);
                        zzhi zzhiVar2 = new zzhi();
                        zzhiVar2.f9113s = zzivVar;
                        new Thread(zzhiVar2).start();
                    }
                }
                c0313w.f3137H.a(true);
            }
            if (zzhjVar.h()) {
                zzhj.e(zznpVar);
                if (!zznpVar.Z1("android.permission.INTERNET")) {
                    zzhj.g(zzfwVar2);
                    zzfwVar2.f9056x.b("App is missing INTERNET permission");
                }
                if (!zznpVar.Z1("android.permission.ACCESS_NETWORK_STATE")) {
                    zzhj.g(zzfwVar2);
                    zzfwVar2.f9056x.b("App is missing ACCESS_NETWORK_STATE permission");
                }
                context = zzhjVar.f9140s;
                if (!Wrappers.a(context).c() && !zzagVar.l1()) {
                    if (!zznp.C1(context)) {
                        zzhj.g(zzfwVar2);
                        zzfwVar2.f9056x.b("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!zznp.O1(context)) {
                        zzhj.g(zzfwVar2);
                        zzfwVar2.f9056x.b("AppMeasurementService not registered/enabled");
                    }
                }
                zzhj.g(zzfwVar2);
                zzfwVar2.f9056x.b("Uploading is not possible. App measurement disabled");
            }
            z10 = false;
            zzpg.a();
            if (zzagVar.h1(null, zzbf.f8928A0)) {
                zzhj.e(zznpVar);
                zznpVar.W0();
                if (zznpVar.d2() == 1) {
                    z12 = true;
                } else {
                    z12 = z10;
                }
                if (z12) {
                    zzhj.f(zzivVar);
                    zzhi zzhiVar3 = new zzhi();
                    zzhiVar3.f9113s = zzivVar;
                    new Thread(zzhiVar3).start();
                }
            }
            c0313w.f3137H.a(true);
        }
        zzagVar2.i().f9056x.b("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf == null) {
            listAsList = null;
        } else {
            stringArray = ((zzhj) zzagVar2.f577s).f9140s.getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = null;
            } else {
                listAsList = Arrays.asList(stringArray);
            }
        }
        if (listAsList == null) {
            zzfqVar2.f9030A = listAsList;
        } else if (listAsList.isEmpty()) {
            zzfqVar2.i().f9049C.b("Safelisted event list is empty. Ignoring");
        } else {
            it2 = listAsList.iterator();
            do {
                if (it2.hasNext()) {
                    zzfqVar2.f9030A = listAsList;
                }
            } while (zzfqVar2.V0().U1("safelisted event", (String) it2.next()));
        }
        if (packageManager != null) {
            zzfqVar2.f9032C = InstantApps.a(context3) ? 1 : 0;
        } else {
            zzfqVar2.f9032C = 0;
        }
        zzhjVar2.f9138Y.incrementAndGet();
        zzfqVar2.f3054t = true;
        zzfwVar = zzhjVar.f9115A;
        zzhj.g(zzfwVar);
        zzfyVar = zzfwVar.f9050D;
        zzfyVar.a(97001L, "App measurement initialized, version");
        zzhj.g(zzfwVar);
        zzfyVar.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        strD1 = zzfqVar.d1();
        zIsEmpty = TextUtils.isEmpty(zzhjVar.f9141t);
        zzagVar = zzhjVar.f9146y;
        if (zIsEmpty) {
            if (zznpVar.Y1(strD1, zzagVar.f8895u)) {
                zzhj.g(zzfwVar);
                zzfyVar.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzhj.g(zzfwVar);
                zzfyVar.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + strD1);
            }
        }
        zzhj.g(zzfwVar);
        zzfwVar.f9051E.b("Debug-level message logging enabled");
        i10 = zzhjVar.f9136W;
        atomicInteger = zzhjVar.f9138Y;
        if (i10 != atomicInteger.get()) {
            zzhj.g(zzfwVar);
            zzfwVar.f9056x.c("Not all components initialized", Integer.valueOf(zzhjVar.f9136W), Integer.valueOf(atomicInteger.get()));
        }
        zzhjVar.P = true;
        zzdoVar = zzitVar.f9188g;
        zzhc zzhcVar3 = zzhjVar.f9116B;
        zzhj.g(zzhcVar3);
        zzhcVar3.W0();
        zzpg.a();
        if (zzagVar.h1(null, zzbf.f8928A0)) {
            zzhj.e(zznpVar);
            zznpVar.W0();
            if (zznpVar.d2() == 1) {
                zznpVar.W0();
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                zzhj zzhjVar4 = (zzhj) zznpVar.f577s;
                f.e(zzhjVar4.f9140s, new zzq(zzhjVar4), intentFilter2, 2);
                zznpVar.i().f9051E.b("Registered app receiver");
            }
        }
        zzhj.e(c0313w);
        zzinVarH1 = c0313w.h1();
        zzne.a();
        zzaVar = zzin.zza.ANALYTICS_STORAGE;
        zzimVar = zzim.UNINITIALIZED;
        zzfjVar = zzbf.f8959Q0;
        zH1 = zzagVar.h1(null, zzfjVar);
        j = zzhjVar.f9139Z;
        zzivVar = zzhjVar.f9122H;
        int i15 = zzinVarH1.f9165b;
        if (zH1) {
            zzinVar = zzinVarH1;
            zzimVarD3 = zzagVar.d1("google_analytics_default_allow_ad_storage", false);
            zzimVarD4 = zzagVar.d1("google_analytics_default_allow_analytics_storage", false);
            if (zzimVarD3 == zzimVar) {
                EnumMap enumMap3 = new EnumMap(zzin.zza.class);
                enumMap3.put(zzin.zza.AD_STORAGE, zzimVarD3);
                enumMap3.put(zzaVar, zzimVarD4);
                zzinVar2 = new zzin(enumMap3, -10);
                zzdoVar2 = zzdoVar;
                zzaVar2 = zzaVar;
            } else {
                EnumMap enumMap4 = new EnumMap(zzin.zza.class);
                enumMap4.put(zzin.zza.AD_STORAGE, zzimVarD3);
                enumMap4.put(zzaVar, zzimVarD4);
                zzinVar2 = new zzin(enumMap4, -10);
                zzdoVar2 = zzdoVar;
                zzaVar2 = zzaVar;
            }
        } else {
            zzinVar = zzinVarH1;
            zzdoVar2 = zzdoVar;
            boolF1 = zzagVar.f1("google_analytics_default_allow_ad_storage");
            boolF2 = zzagVar.f1("google_analytics_default_allow_analytics_storage");
            if (boolF1 == null) {
                zzaVar2 = zzaVar;
                if (c0313w.b1(-10)) {
                    zzinVar2 = new zzin(boolF1, boolF2, -10);
                } else if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                    if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                        zzinVar2 = null;
                    } else {
                        zzinVar2 = null;
                    }
                } else if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                    zzinVar2 = null;
                } else {
                    zzinVar2 = null;
                }
            } else {
                zzaVar2 = zzaVar;
                if (c0313w.b1(-10)) {
                    zzinVar2 = new zzin(boolF1, boolF2, -10);
                } else if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                    if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                        zzinVar2 = null;
                    } else {
                        zzinVar2 = null;
                    }
                } else if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                    zzinVar2 = null;
                } else {
                    zzinVar2 = null;
                }
            }
        }
        if (zzinVar2 != null) {
            zzhj.f(zzivVar);
            zzivVar.j1(zzinVar2, j, zzagVar.h1(null, zzbf.f8965T0));
        } else {
            zzinVar2 = zzinVar;
        }
        zzhj.f(zzivVar);
        zzivVar.i1(zzinVar2);
        c0313w.W0();
        int i16 = zzav.b(c0313w.f1().getString("dma_consent_settings", null)).a;
        zzne.a();
        if (zzagVar.h1(null, zzfjVar)) {
            zzimVarD1 = zzagVar.d1("google_analytics_default_allow_ad_personalization_signals", true);
            if (zzimVarD1 != zzimVar) {
                zzhj.g(zzfwVar);
                zzfwVar2 = zzfwVar;
                zzfwVar2.f9052F.a(zzimVarD1, "Default ad personalization consent from Manifest");
            } else {
                zzfwVar2 = zzfwVar;
            }
            zzimVarD2 = zzagVar.d1("google_analytics_default_allow_ad_user_data", true);
            if (zzimVarD2 == zzimVar) {
                if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                    if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                        zzavVarA = zzav.a(30, bundle3);
                        it = zzavVarA.f8908e.values().iterator();
                        while (it.hasNext()) {
                            if (((zzim) it.next()) != zzimVar) {
                                zzhj.f(zzivVar);
                                zzivVar.h1(zzavVarA, zzagVar.h1(null, zzbf.f8965T0));
                            }
                        }
                    }
                    if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                        zzhj.f(zzivVar);
                        zzivVar.n1(zzdoVar2.f8561w, boolC.toString(), "allow_personalized_ads", false);
                    }
                } else {
                    if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                        zzavVarA = zzav.a(30, bundle3);
                        it = zzavVarA.f8908e.values().iterator();
                        while (it.hasNext()) {
                            if (((zzim) it.next()) != zzimVar) {
                                zzhj.f(zzivVar);
                                zzivVar.h1(zzavVarA, zzagVar.h1(null, zzbf.f8965T0));
                            }
                        }
                    }
                    if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                        zzhj.f(zzivVar);
                        zzivVar.n1(zzdoVar2.f8561w, boolC.toString(), "allow_personalized_ads", false);
                    }
                }
            } else if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                    zzavVarA = zzav.a(30, bundle3);
                    it = zzavVarA.f8908e.values().iterator();
                    while (it.hasNext()) {
                        if (((zzim) it.next()) != zzimVar) {
                            zzhj.f(zzivVar);
                            zzivVar.h1(zzavVarA, zzagVar.h1(null, zzbf.f8965T0));
                        }
                    }
                }
                if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                    zzhj.f(zzivVar);
                    zzivVar.n1(zzdoVar2.f8561w, boolC.toString(), "allow_personalized_ads", false);
                }
            } else {
                if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                    zzavVarA = zzav.a(30, bundle3);
                    it = zzavVarA.f8908e.values().iterator();
                    while (it.hasNext()) {
                        if (((zzim) it.next()) != zzimVar) {
                            zzhj.f(zzivVar);
                            zzivVar.h1(zzavVarA, zzagVar.h1(null, zzbf.f8965T0));
                        }
                    }
                }
                if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                    zzhj.f(zzivVar);
                    zzivVar.n1(zzdoVar2.f8561w, boolC.toString(), "allow_personalized_ads", false);
                }
            }
        } else {
            str4 = "admob_app_id";
            zzfwVar2 = zzfwVar;
            boolF3 = zzagVar.f1("google_analytics_default_allow_ad_user_data");
            if (boolF3 == null) {
                if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                    if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                        zzavVarA = zzav.a(30, bundle3);
                        it = zzavVarA.f8908e.values().iterator();
                        while (it.hasNext()) {
                            if (((zzim) it.next()) != zzimVar) {
                                zzhj.f(zzivVar);
                                zzivVar.h1(zzavVarA, zzagVar.h1(null, zzbf.f8965T0));
                            }
                        }
                    }
                    if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                        zzhj.f(zzivVar);
                        zzivVar.n1(zzdoVar2.f8561w, boolC.toString(), "allow_personalized_ads", false);
                    }
                } else {
                    if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                        zzavVarA = zzav.a(30, bundle3);
                        it = zzavVarA.f8908e.values().iterator();
                        while (it.hasNext()) {
                            if (((zzim) it.next()) != zzimVar) {
                                zzhj.f(zzivVar);
                                zzivVar.h1(zzavVarA, zzagVar.h1(null, zzbf.f8965T0));
                            }
                        }
                    }
                    if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                        zzhj.f(zzivVar);
                        zzivVar.n1(zzdoVar2.f8561w, boolC.toString(), "allow_personalized_ads", false);
                    }
                }
            } else if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                    zzavVarA = zzav.a(30, bundle3);
                    it = zzavVarA.f8908e.values().iterator();
                    while (it.hasNext()) {
                        if (((zzim) it.next()) != zzimVar) {
                            zzhj.f(zzivVar);
                            zzivVar.h1(zzavVarA, zzagVar.h1(null, zzbf.f8965T0));
                        }
                    }
                }
                if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                    zzhj.f(zzivVar);
                    zzivVar.n1(zzdoVar2.f8561w, boolC.toString(), "allow_personalized_ads", false);
                }
            } else {
                if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                    zzavVarA = zzav.a(30, bundle3);
                    it = zzavVarA.f8908e.values().iterator();
                    while (it.hasNext()) {
                        if (((zzim) it.next()) != zzimVar) {
                            zzhj.f(zzivVar);
                            zzivVar.h1(zzavVarA, zzagVar.h1(null, zzbf.f8965T0));
                        }
                    }
                }
                if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                    zzhj.f(zzivVar);
                    zzivVar.n1(zzdoVar2.f8561w, boolC.toString(), "allow_personalized_ads", false);
                }
            }
        }
        boolF4 = zzagVar.f1("google_analytics_tcf_data_enabled");
        if (boolF4 == null) {
            zBooleanValue = true;
        } else {
            zBooleanValue = boolF4.booleanValue();
        }
        if (zBooleanValue) {
            zzhj.g(zzfwVar2);
            zzfwVar2.f9051E.b("TCF client enabled.");
            zzhj.f(zzivVar);
            zzivVar.W0();
            zzivVar.i().f9051E.b("Register tcfPrefChangeListener.");
            if (zzivVar.f9201K == null) {
                zzivVar.f9202L = new Q(zzivVar, (zzhj) zzivVar.f577s, 1);
                zzjd zzjdVar2 = new zzjd();
                zzjdVar2.a = zzivVar;
                zzivVar.f9201K = zzjdVar2;
            }
            zzivVar.U0().e1().registerOnSharedPreferenceChangeListener(zzivVar.f9201K);
            zzhj.f(zzivVar);
            zzivVar.w1();
        }
        zzgmVar = c0313w.f3151y;
        if (zzgmVar.a() == 0) {
            zzhj.g(zzfwVar2);
            zzfwVar2.f9052F.a(Long.valueOf(j), "Persisting first open");
            zzgmVar.b(j);
        }
        zzhj.f(zzivVar);
        zzrVar = zzivVar.f9198H;
        if (zzrVar.b()) {
            C0313w c0313w3 = zzrVar.a.f9147z;
            zzhj.e(c0313w3);
            c0313w3.P.b(null);
        }
        if (!zzhjVar.j()) {
            zIsEmpty2 = TextUtils.isEmpty(zzhjVar.o().e1());
            zzgnVar = c0313w.f3152z;
            if (zIsEmpty2) {
                zzfqVarO2 = zzhjVar.o();
                zzfqVarO2.a1();
                if (!TextUtils.isEmpty(zzfqVarO2.f9034E)) {
                    zzhjVar.s();
                    strE1 = zzhjVar.o().e1();
                    c0313w.W0();
                    string2 = c0313w.f1().getString("gmp_app_id", null);
                    zzfq zzfqVarO7 = zzhjVar.o();
                    zzfqVarO7.a1();
                    str2 = zzfqVarO7.f9034E;
                    c0313w.W0();
                    str3 = str4;
                    if (zznp.J1(strE1, string2, str2, c0313w.f1().getString(str3, null))) {
                        zzhj.g(zzfwVar2);
                        zzfwVar2.f9050D.b("Rechecking which service to use due to a GMP App Id change");
                        c0313w.W0();
                        c0313w.W0();
                        if (c0313w.f1().contains("measurement_enabled")) {
                            boolValueOf = Boolean.valueOf(c0313w.f1().getBoolean("measurement_enabled", true));
                        } else {
                            boolValueOf = null;
                        }
                        SharedPreferences.Editor editorEdit10 = c0313w.f1().edit();
                        editorEdit10.clear();
                        editorEdit10.apply();
                        if (boolValueOf != null) {
                            c0313w.W0();
                            SharedPreferences.Editor editorEdit11 = c0313w.f1().edit();
                            editorEdit11.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                            editorEdit11.apply();
                        }
                        zzhjVar.p().f1();
                        zzhjVar.f9127M.j1();
                        zzhjVar.f9127M.i1();
                        zzgmVar.b(j);
                        zzgnVar.b(null);
                    }
                    String strE4 = zzhjVar.o().e1();
                    c0313w.W0();
                    SharedPreferences.Editor editorEdit12 = c0313w.f1().edit();
                    editorEdit12.putString("gmp_app_id", strE4);
                    editorEdit12.apply();
                    zzfq zzfqVarO8 = zzhjVar.o();
                    zzfqVarO8.a1();
                    String str14 = zzfqVarO8.f9034E;
                    c0313w.W0();
                    SharedPreferences.Editor editorEdit13 = c0313w.f1().edit();
                    editorEdit13.putString(str3, str14);
                    editorEdit13.apply();
                }
            } else {
                zzhjVar.s();
                strE1 = zzhjVar.o().e1();
                c0313w.W0();
                string2 = c0313w.f1().getString("gmp_app_id", null);
                zzfq zzfqVarO9 = zzhjVar.o();
                zzfqVarO9.a1();
                str2 = zzfqVarO9.f9034E;
                c0313w.W0();
                str3 = str4;
                if (zznp.J1(strE1, string2, str2, c0313w.f1().getString(str3, null))) {
                    zzhj.g(zzfwVar2);
                    zzfwVar2.f9050D.b("Rechecking which service to use due to a GMP App Id change");
                    c0313w.W0();
                    c0313w.W0();
                    if (c0313w.f1().contains("measurement_enabled")) {
                        boolValueOf = Boolean.valueOf(c0313w.f1().getBoolean("measurement_enabled", true));
                    } else {
                        boolValueOf = null;
                    }
                    SharedPreferences.Editor editorEdit14 = c0313w.f1().edit();
                    editorEdit14.clear();
                    editorEdit14.apply();
                    if (boolValueOf != null) {
                        c0313w.W0();
                        SharedPreferences.Editor editorEdit15 = c0313w.f1().edit();
                        editorEdit15.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                        editorEdit15.apply();
                    }
                    zzhjVar.p().f1();
                    zzhjVar.f9127M.j1();
                    zzhjVar.f9127M.i1();
                    zzgmVar.b(j);
                    zzgnVar.b(null);
                }
                String strE5 = zzhjVar.o().e1();
                c0313w.W0();
                SharedPreferences.Editor editorEdit16 = c0313w.f1().edit();
                editorEdit16.putString("gmp_app_id", strE5);
                editorEdit16.apply();
                zzfq zzfqVarO10 = zzhjVar.o();
                zzfqVarO10.a1();
                String str15 = zzfqVarO10.f9034E;
                c0313w.W0();
                SharedPreferences.Editor editorEdit17 = c0313w.f1().edit();
                editorEdit17.putString(str3, str15);
                editorEdit17.apply();
            }
            if (!c0313w.h1().i(zzaVar2)) {
                zzgnVar.b(null);
            }
            zzhj.f(zzivVar);
            zzivVar.A1(zzgnVar.a());
            zzhj.e(zznpVar);
            ((zzhj) zznpVar.f577s).f9140s.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            z6 = true;
            if (!z6) {
                zzgnVar2 = c0313w.f3144O;
                if (!TextUtils.isEmpty(zzgnVar2.a())) {
                    zzhj.g(zzfwVar2);
                    zzfwVar2.f9047A.b("Remote config removed with active feature rollouts");
                    zzgnVar2.b(null);
                }
            }
            if (TextUtils.isEmpty(zzhjVar.o().e1())) {
                zzfqVarO = zzhjVar.o();
                zzfqVarO.a1();
                if (!TextUtils.isEmpty(zzfqVarO.f9034E)) {
                }
                zzpg.a();
                if (zzagVar.h1(null, zzbf.f8928A0)) {
                    zzhj.e(zznpVar);
                    zznpVar.W0();
                    if (zznpVar.d2() == 1) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (z12) {
                        zzhj.f(zzivVar);
                        zzhi zzhiVar4 = new zzhi();
                        zzhiVar4.f9113s = zzivVar;
                        new Thread(zzhiVar4).start();
                    }
                }
                c0313w.f3137H.a(true);
            }
            zH = zzhjVar.h();
            sharedPreferences = c0313w.f3147u;
            if (sharedPreferences == null) {
                zContains = false;
            } else {
                zContains = sharedPreferences.contains("deferred_analytics_collection");
            }
            if (zContains) {
                zzagVar = zzagVar;
                boolF5 = zzagVar.f1("firebase_analytics_collection_deactivated");
                if (boolF5 == null) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    c0313w.d1(!zH);
                }
            } else {
                zzagVar = zzagVar;
            }
            if (zH) {
                zzhj.f(zzivVar);
                zzivVar.t1();
            }
            zzmh zzmhVar2 = zzhjVar.f9117C;
            zzhj.f(zzmhVar2);
            zzmhVar2.f9268w.M();
            zzhjVar.r().g1(new AtomicReference());
            zzkx zzkxVarR2 = zzhjVar.r();
            Bundle bundleA2 = c0313w.f3146R.a();
            zzkxVarR2.W0();
            zzkxVarR2.a1();
            z10 = false;
            zzkxVarR2.f1(new I(zzkxVarR2, zzkxVarR2.p1(false), bundleA2, 8));
            zzpg.a();
            if (zzagVar.h1(null, zzbf.f8928A0)) {
                zzhj.e(zznpVar);
                zznpVar.W0();
                if (zznpVar.d2() == 1) {
                    z12 = true;
                } else {
                    z12 = z10;
                }
                if (z12) {
                    zzhj.f(zzivVar);
                    zzhi zzhiVar5 = new zzhi();
                    zzhiVar5.f9113s = zzivVar;
                    new Thread(zzhiVar5).start();
                }
            }
            c0313w.f3137H.a(true);
        }
        if (zzhjVar.h()) {
            zzhj.e(zznpVar);
            if (!zznpVar.Z1("android.permission.INTERNET")) {
                zzhj.g(zzfwVar2);
                zzfwVar2.f9056x.b("App is missing INTERNET permission");
            }
            if (!zznpVar.Z1("android.permission.ACCESS_NETWORK_STATE")) {
                zzhj.g(zzfwVar2);
                zzfwVar2.f9056x.b("App is missing ACCESS_NETWORK_STATE permission");
            }
            context = zzhjVar.f9140s;
            if (!Wrappers.a(context).c()) {
                if (!zznp.C1(context)) {
                    zzhj.g(zzfwVar2);
                    zzfwVar2.f9056x.b("AppMeasurementReceiver not registered/enabled");
                }
                if (!zznp.O1(context)) {
                    zzhj.g(zzfwVar2);
                    zzfwVar2.f9056x.b("AppMeasurementService not registered/enabled");
                }
            }
            zzhj.g(zzfwVar2);
            zzfwVar2.f9056x.b("Uploading is not possible. App measurement disabled");
        }
        z10 = false;
        zzpg.a();
        if (zzagVar.h1(null, zzbf.f8928A0)) {
            zzhj.e(zznpVar);
            zznpVar.W0();
            if (zznpVar.d2() == 1) {
                z12 = true;
            } else {
                z12 = z10;
            }
            if (z12) {
                zzhj.f(zzivVar);
                zzhi zzhiVar6 = new zzhi();
                zzhiVar6.f9113s = zzivVar;
                new Thread(zzhiVar6).start();
            }
        }
        c0313w.f3137H.a(true);
    }

    private final void b() {
        synchronized (((P2.d) this.f942u).f3851t) {
            ((OnCompleteListener) ((P2.d) this.f942u).f3853v).d((Task) this.f941t);
        }
    }

    private final void c() {
        synchronized (((P2.d) this.f942u).f3851t) {
            try {
                OnFailureListener onFailureListener = (OnFailureListener) ((P2.d) this.f942u).f3853v;
                if (onFailureListener != null) {
                    Exception excF = ((Task) this.f941t).f();
                    Preconditions.i(excF);
                    onFailureListener.onFailure(excF);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        synchronized (((P2.d) this.f942u).f3851t) {
            try {
                OnSuccessListener onSuccessListener = (OnSuccessListener) ((P2.d) this.f942u).f3853v;
                if (onSuccessListener != null) {
                    onSuccessListener.c(((Task) this.f941t).g());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f941t).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        J3.j.f2396x.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f941t), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.f941t = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f942u     // Catch: java.lang.Throwable -> L58
            J3.j r2 = (J3.j) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f2398t     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f942u     // Catch: java.lang.Throwable -> L20
            J3.j r0 = (J3.j) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f2399u     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.f2400v     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f2400v = r6     // Catch: java.lang.Throwable -> L20
            r0.f2399u = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f942u     // Catch: java.lang.Throwable -> L20
            J3.j r4 = (J3.j) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f2398t     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f941t = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f942u     // Catch: java.lang.Throwable -> L20
            J3.j r0 = (J3.j) r0     // Catch: java.lang.Throwable -> L20
            r0.f2399u = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f941t     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f941t = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = J3.j.f2396x     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f941t     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f941t = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.c.e():void");
    }

    /* JADX WARN: Code duplicated, block: B:109:0x02be  */
    /* JADX WARN: Code duplicated, block: B:263:0x02cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v23, types: [u8.b, v8.k] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.c.run():void");
    }

    public String toString() {
        String str;
        switch (this.f940s) {
            case 0:
                wa.a aVar = new wa.a(c.class.getSimpleName());
                o1.c cVar = new o1.c(21, false);
                ((o1.c) aVar.f15700v).f13624u = cVar;
                aVar.f15700v = cVar;
                cVar.f13623t = (S) this.f942u;
                return aVar.toString();
            case 9:
                Runnable runnable = (Runnable) this.f941t;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((j) this.f942u).f2399u;
                if (i10 == 1) {
                    str = "IDLE";
                } else if (i10 == 2) {
                    str = "QUEUING";
                } else if (i10 != 3) {
                    str = i10 != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        this.f940s = i10;
        this.f941t = obj;
        this.f942u = obj2;
    }

    public /* synthetic */ c(Object obj, Object obj2, int i10, boolean z6) {
        this.f940s = i10;
        this.f942u = obj;
        this.f941t = obj2;
    }

    public c(zzgp zzgpVar, zzbz zzbzVar, zzgp zzgpVar2) {
        this.f940s = 11;
        this.f941t = zzbzVar;
        this.f942u = zzgpVar;
    }

    public c(j jVar) {
        this.f940s = 9;
        this.f942u = jVar;
    }
}
