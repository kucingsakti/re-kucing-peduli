package com.google.android.gms.measurement.internal;

import A1.RunnableC0094c;
import A3.AbstractC0106d;
import C3.c;
import F0.d;
import M2.AbstractC0305n;
import M2.C0313w;
import M2.F;
import M2.O;
import M2.Q;
import M2.T;
import M2.U;
import M2.W;
import M2.X;
import M2.c0;
import M2.d0;
import M2.k0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.S;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zzpg;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import p040e1.j;

/* JADX INFO: loaded from: classes.dex */
public final class zziv extends AbstractC0305n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f9191A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f9192B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Q f9193C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public PriorityQueue f9194D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public zzin f9195E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final AtomicLong f9196F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f9197G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final zzr f9198H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f9199I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Q f9200J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public zzjd f9201K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Q f9202L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final j f9203M;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Ia.a f9204u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public zzir f9205v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArraySet f9206w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9207x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AtomicReference f9208y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f9209z;

    public zziv(zzhj zzhjVar) {
        super(zzhjVar);
        this.f9206w = new CopyOnWriteArraySet();
        this.f9209z = new Object();
        this.f9191A = false;
        this.f9192B = 1;
        this.f9199I = true;
        this.f9203M = new j(this, 19);
        this.f9208y = new AtomicReference();
        this.f9195E = zzin.f9164c;
        this.f9197G = -1L;
        this.f9196F = new AtomicLong(0L);
        this.f9198H = new zzr(zzhjVar);
    }

    public static void k1(zziv zzivVar, zzin zzinVar, long j, boolean z6, boolean z10) {
        zzivVar.W0();
        zzivVar.a1();
        zzin zzinVarH1 = zzivVar.U0().h1();
        long j10 = zzivVar.f9197G;
        int i10 = zzinVar.f9165b;
        if (j <= j10 && zzin.h(zzinVarH1.f9165b, i10)) {
            zzivVar.i().f9050D.a(zzinVar, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        C0313w c0313wU0 = zzivVar.U0();
        c0313wU0.W0();
        if (!c0313wU0.b1(i10)) {
            zzfw zzfwVarI = zzivVar.i();
            zzfwVarI.f9050D.a(Integer.valueOf(i10), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = c0313wU0.f1().edit();
        editorEdit.putString("consent_settings", zzinVar.o());
        editorEdit.putInt("consent_source", i10);
        editorEdit.apply();
        zzivVar.i().f9052F.a(zzinVar, "Setting storage consent(FE)");
        zzivVar.f9197G = j;
        zzhj zzhjVar = (zzhj) zzivVar.f577s;
        zzkx zzkxVarR = zzhjVar.r();
        zzkxVarR.W0();
        zzkxVarR.a1();
        if (zzkxVarR.m1() && zzkxVarR.V0().b2() < 241200) {
            zzhjVar.r().h1(z6);
        } else {
            zzkx zzkxVarR2 = zzhjVar.r();
            zzkxVarR2.W0();
            zzkxVarR2.a1();
            com.google.android.gms.internal.measurement.zznk.a();
            zzhj zzhjVar2 = (zzhj) zzkxVarR2.f577s;
            if (!zzhjVar2.f9146y.h1(null, zzbf.U0) && z6) {
                zzhjVar2.p().f1();
            }
            zzla zzlaVar = new zzla();
            zzlaVar.f9249s = zzkxVarR2;
            zzkxVarR2.f1(zzlaVar);
        }
        if (z10) {
            zzhjVar.r().g1(new AtomicReference());
        }
    }

    public static void l1(zziv zzivVar, zzin zzinVar, zzin zzinVar2) {
        boolean z6;
        com.google.android.gms.internal.measurement.zznk.a();
        if (((zzhj) zzivVar.f577s).f9146y.h1(null, zzbf.U0)) {
            return;
        }
        zzin.zza zzaVar = zzin.zza.ANALYTICS_STORAGE;
        zzin.zza zzaVar2 = zzin.zza.AD_STORAGE;
        zzin.zza[] zzaVarArr = {zzaVar, zzaVar2};
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                z6 = false;
                break;
            }
            zzin.zza zzaVar3 = zzaVarArr[i10];
            if (!zzinVar2.i(zzaVar3) && zzinVar.i(zzaVar3)) {
                z6 = true;
                break;
            }
            i10++;
        }
        boolean zK = zzinVar.k(zzinVar2, zzaVar, zzaVar2);
        if (z6 || zK) {
            ((zzhj) zzivVar.f577s).o().f1();
        }
    }

    public final void A1(String str) {
        this.f9208y.set(str);
    }

    public final void B1(String str, String str2, Bundle bundle) {
        W0();
        ((zzhj) this.f577s).f9120F.getClass();
        d1(System.currentTimeMillis(), bundle, str, str2);
    }

    @Override // M2.AbstractC0305n
    public final boolean c1() {
        return false;
    }

    public final void d1(long j, Bundle bundle, String str, String str2) {
        W0();
        o1(str, str2, j, bundle, true, this.f9205v == null || zznp.c2(str2), true);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    public final void e1(long j, Object obj, String str, String str2) {
        Preconditions.e(str);
        Preconditions.e(str2);
        W0();
        a1();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j10 = "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 1L : 0L;
                    obj = Long.valueOf(j10);
                    U0().f3135F.b(j10 == 1 ? "true" : "false");
                } else if (obj == null) {
                    U0().f3135F.b("unset");
                }
                str2 = "_npa";
            } else if (obj == null) {
                U0().f3135F.b("unset");
                str2 = "_npa";
            }
            i().f9052F.c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        Object obj2 = obj;
        String str4 = str2;
        zzhj zzhjVar = (zzhj) this.f577s;
        if (!zzhjVar.h()) {
            i().f9052F.b("User property not set since app measurement is disabled");
            return;
        }
        if (zzhjVar.j()) {
            zzno zznoVar = new zzno(j, obj2, str4, str);
            zzkx zzkxVarR = zzhjVar.r();
            zzkxVarR.W0();
            zzkxVarR.a1();
            zzfp zzfpVarP = ((zzhj) zzkxVarR.f577s).p();
            zzfpVarP.getClass();
            Parcel parcelObtain = Parcel.obtain();
            boolean zE1 = false;
            zznoVar.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                zzfpVarP.i().f9057y.b("User property too long for local database. Sending directly to service");
            } else {
                zE1 = zzfpVarP.e1(1, bArrMarshall);
            }
            zzkxVarR.f1(new d0(zzkxVarR, zzkxVarR.p1(true), zE1, zznoVar, 0));
        }
    }

    public final void f1(long j, boolean z6) {
        W0();
        a1();
        i().f9051E.b("Resetting analytics data (FE)");
        zzmh zzmhVarZ0 = Z0();
        zzmhVarZ0.W0();
        k0 k0Var = zzmhVarZ0.f9269x;
        k0Var.f3044c.a();
        zzmh zzmhVar = k0Var.f3045d;
        if (((zzhj) zzmhVar.f577s).f9146y.h1(null, zzbf.Y0)) {
            ((zzhj) zzmhVar.f577s).f9120F.getClass();
            k0Var.a = SystemClock.elapsedRealtime();
        } else {
            k0Var.a = 0L;
        }
        k0Var.f3043b = k0Var.a;
        zzhj zzhjVar = (zzhj) this.f577s;
        zzhjVar.o().f1();
        boolean zH = zzhjVar.h();
        C0313w c0313wU0 = U0();
        c0313wU0.f3151y.b(j);
        if (!TextUtils.isEmpty(c0313wU0.U0().f3144O.a())) {
            c0313wU0.f3144O.b(null);
        }
        c0313wU0.f3138I.b(0L);
        c0313wU0.f3139J.b(0L);
        Boolean boolF1 = ((zzhj) c0313wU0.f577s).f9146y.f1("firebase_analytics_collection_deactivated");
        if (boolF1 == null || !boolF1.booleanValue()) {
            c0313wU0.d1(!zH);
        }
        c0313wU0.P.b(null);
        c0313wU0.f3145Q.b(0L);
        c0313wU0.f3146R.b(null);
        if (z6) {
            zzkx zzkxVarR = zzhjVar.r();
            zzkxVarR.W0();
            zzkxVarR.a1();
            zzo zzoVarP1 = zzkxVarR.p1(false);
            ((zzhj) zzkxVarR.f577s).p().f1();
            zzkxVarR.f1(new c0(zzkxVarR, zzoVarP1, 0));
        }
        Z0().f9268w.M();
        this.f9199I = !zH;
    }

    public final void g1(Bundle bundle, int i10, long j) {
        Object obj;
        String string;
        a1();
        zzin zzinVar = zzin.f9164c;
        zzin.zza[] zzaVarArr = zzio.STORAGE.f9175s;
        int length = zzaVarArr.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            zzin.zza zzaVar = zzaVarArr[i11];
            if (bundle.containsKey(zzaVar.f9171s) && (string = bundle.getString(zzaVar.f9171s)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            i().f9049C.a(obj, "Ignoring invalid consent setting");
            i().f9049C.b("Valid consent values are 'granted', 'denied'");
        }
        boolean zH1 = l().h1();
        zzin zzinVarD = zzin.d(i10, bundle);
        if (zzinVarD.q()) {
            j1(zzinVarD, j, zH1);
        }
        zzav zzavVarA = zzav.a(i10, bundle);
        Iterator it = zzavVarA.f8908e.values().iterator();
        while (it.hasNext()) {
            if (((zzim) it.next()) != zzim.UNINITIALIZED) {
                h1(zzavVarA, zH1);
                break;
            }
        }
        Boolean boolC = zzav.c(bundle);
        if (boolC != null) {
            n1(i10 == -30 ? "tcf" : "app", boolC.toString(), "allow_personalized_ads", false);
        }
    }

    public final void h1(zzav zzavVar, boolean z6) {
        c cVar = new c(this, zzavVar, 16, false);
        if (!z6) {
            l().f1(cVar);
        } else {
            W0();
            cVar.run();
        }
    }

    public final void i1(zzin zzinVar) {
        W0();
        boolean z6 = (zzinVar.i(zzin.zza.ANALYTICS_STORAGE) && zzinVar.i(zzin.zza.AD_STORAGE)) || ((zzhj) this.f577s).r().l1();
        zzhj zzhjVar = (zzhj) this.f577s;
        zzhc zzhcVar = zzhjVar.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        if (z6 != zzhjVar.f9135V) {
            zzhj zzhjVar2 = (zzhj) this.f577s;
            zzhc zzhcVar2 = zzhjVar2.f9116B;
            zzhj.g(zzhcVar2);
            zzhcVar2.W0();
            zzhjVar2.f9135V = z6;
            C0313w c0313wU0 = U0();
            c0313wU0.W0();
            Boolean boolValueOf = c0313wU0.f1().contains("measurement_enabled_from_api") ? Boolean.valueOf(c0313wU0.f1().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z6 || boolValueOf == null || boolValueOf.booleanValue()) {
                m1(Boolean.valueOf(z6), false);
            }
        }
    }

    public final void j1(zzin zzinVar, long j, boolean z6) {
        zzin zzinVar2;
        boolean z10;
        zzin zzinVarJ;
        boolean zK;
        boolean z11;
        a1();
        int i10 = zzinVar.f9165b;
        zzne.a();
        if (((zzhj) this.f577s).f9146y.h1(null, zzbf.f8959Q0)) {
            if (i10 != -10) {
                zzim zzimVar = (zzim) zzinVar.a.get(zzin.zza.AD_STORAGE);
                if (zzimVar == null) {
                    zzimVar = zzim.UNINITIALIZED;
                }
                zzim zzimVar2 = zzim.UNINITIALIZED;
                if (zzimVar == zzimVar2) {
                    zzim zzimVar3 = (zzim) zzinVar.a.get(zzin.zza.ANALYTICS_STORAGE);
                    if (zzimVar3 == null) {
                        zzimVar3 = zzimVar2;
                    }
                    if (zzimVar3 == zzimVar2) {
                        i().f9049C.b("Ignoring empty consent settings");
                        return;
                    }
                }
            }
        } else if (i10 != -10 && zzinVar.l() == null && zzinVar.m() == null) {
            i().f9049C.b("Discarding empty consent settings");
            return;
        }
        synchronized (this.f9209z) {
            try {
                zzinVar2 = this.f9195E;
                z10 = false;
                if (zzin.h(i10, zzinVar2.f9165b)) {
                    zK = zzinVar.k(this.f9195E, (zzin.zza[]) zzinVar.a.keySet().toArray(new zzin.zza[0]));
                    zzin.zza zzaVar = zzin.zza.ANALYTICS_STORAGE;
                    if (zzinVar.i(zzaVar) && !this.f9195E.i(zzaVar)) {
                        z10 = true;
                    }
                    zzinVarJ = zzinVar.j(this.f9195E);
                    this.f9195E = zzinVarJ;
                    z11 = z10;
                    z10 = true;
                } else {
                    zzinVarJ = zzinVar;
                    zK = false;
                    z11 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z10) {
            i().f9050D.a(zzinVarJ, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f9196F.getAndIncrement();
        if (zK) {
            A1(null);
            X x8 = new X(this, zzinVarJ, j, andIncrement, z11, zzinVar2);
            if (!z6) {
                l().g1(x8);
                return;
            } else {
                W0();
                x8.run();
                return;
            }
        }
        W w2 = new W(this, zzinVarJ, andIncrement, z11, zzinVar2);
        if (z6) {
            W0();
            w2.run();
        } else if (i10 == 30 || i10 == -10) {
            l().g1(w2);
        } else {
            l().f1(w2);
        }
    }

    public final void m1(Boolean bool, boolean z6) {
        W0();
        a1();
        i().f9051E.a(bool, "Setting app measurement enabled (FE)");
        C0313w c0313wU0 = U0();
        c0313wU0.W0();
        SharedPreferences.Editor editorEdit = c0313wU0.f1().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z6) {
            C0313w c0313wU1 = U0();
            c0313wU1.W0();
            SharedPreferences.Editor editorEdit2 = c0313wU1.f1().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        zzhj zzhjVar = (zzhj) this.f577s;
        zzhc zzhcVar = zzhjVar.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        if (zzhjVar.f9135V || !(bool == null || bool.booleanValue())) {
            y1();
        }
    }

    public final void n1(String str, Object obj, String str2, boolean z6) {
        ((zzhj) this.f577s).f9120F.getClass();
        r1(str, str2, obj, z6, System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0365  */
    /* JADX WARN: Code duplicated, block: B:129:0x038e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0398  */
    /* JADX WARN: Code duplicated, block: B:133:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:134:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:136:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:137:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:139:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:140:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:149:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:153:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:156:0x043b  */
    /* JADX WARN: Code duplicated, block: B:158:0x044a  */
    /* JADX WARN: Code duplicated, block: B:161:0x046a  */
    /* JADX WARN: Code duplicated, block: B:164:0x0476 A[LOOP:2: B:162:0x0470->B:164:0x0476, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x03d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x03d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x048a A[SYNTHETIC] */
    public final void o1(String str, String str2, long j, Bundle bundle, boolean z6, boolean z10, boolean z11) {
        long j10;
        boolean zB;
        int i10;
        int i11;
        long j11;
        long j12;
        ArrayList arrayList;
        int size;
        int i12;
        int i13;
        Bundle bundleF1;
        String str3;
        Bundle bundle2;
        zzfp zzfpVarP;
        byte[] bArrMarshall;
        boolean zE1;
        Iterator it;
        String str4;
        Object obj;
        Bundle[] bundleArr;
        int length;
        String str5 = str;
        Preconditions.e(str5);
        Preconditions.i(bundle);
        W0();
        a1();
        zzhj zzhjVar = (zzhj) this.f577s;
        if (!zzhjVar.h()) {
            i().f9051E.b("Event not sent since app measurement is disabled");
            return;
        }
        List list = zzhjVar.o().f9030A;
        if (list != null && !list.contains(str2)) {
            i().f9051E.c("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.f9207x) {
            this.f9207x = true;
            try {
                boolean z12 = zzhjVar.f9144w;
                Context context = zzhjVar.f9140s;
                try {
                    (!z12 ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod(MobileAdsBridgeBase.initializeMethodName, Context.class).invoke(null, context);
                } catch (Exception e10) {
                    i().f9047A.a(e10, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                i().f9050D.b("Tag Manager is not found and thus will not be used");
            }
        }
        boolean zEquals = "_cmp".equals(str2);
        DefaultClock defaultClock = zzhjVar.f9120F;
        if (zEquals && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            defaultClock.getClass();
            e1(System.currentTimeMillis(), string, "auto", "_lgclid");
        }
        zziv zzivVar = this;
        if (z6 && !zznp.f9320B[0].equals(str2)) {
            zzivVar.V0().p1(bundle, zzivVar.U0().f3146R.a());
        }
        zzfr zzfrVar = zzhjVar.f9119E;
        j jVar = zzivVar.f9203M;
        if (!z11 && !"_iap".equals(str2)) {
            zznp zznpVar = zzhjVar.f9118D;
            zzhj.e(zznpVar);
            int i14 = 2;
            if (zznpVar.X1("event", str2)) {
                if (!zznpVar.L1("event", zziq.a, zziq.f9179b, str2)) {
                    i14 = 13;
                } else if (zznpVar.G1("event", 40, str2)) {
                    i14 = 0;
                }
            }
            if (i14 != 0) {
                zzivVar.i().f9058z.a(zzfrVar.c(str2), "Invalid public event name. Event will not be logged (FE)");
                zzhjVar.s();
                String strL1 = zznp.l1(str2, true, 40);
                length = str2 != null ? str2.length() : 0;
                zzhjVar.s();
                zznp.m1(jVar, null, i14, "_ev", strL1, length);
                return;
            }
        }
        zzkp zzkpVarD1 = zzivVar.Y0().d1(false);
        if (zzkpVarD1 != null && !bundle.containsKey("_sc")) {
            zzkpVarD1.f9228d = true;
        }
        zznp.y1(zzkpVarD1, bundle, z6 && !z11);
        boolean zEquals2 = "am".equals(str5);
        boolean zC2 = zznp.c2(str2);
        if (z6 && zzivVar.f9205v != null && !zC2 && !zEquals2) {
            zzivVar.i().f9051E.c("Passing event to registered event handler (FE)", zzfrVar.c(str2), zzfrVar.a(bundle));
            Preconditions.i(zzivVar.f9205v);
            zzivVar.f9205v.b(j, bundle, str5, str2);
            return;
        }
        if (zzhjVar.j()) {
            int iB1 = zzivVar.V0().b1(str2);
            if (iB1 != 0) {
                zzivVar.i().f9058z.a(zzfrVar.c(str2), "Invalid event name. Event will not be logged (FE)");
                zzivVar.V0();
                String strL2 = zznp.l1(str2, true, 40);
                length = str2 != null ? str2.length() : 0;
                zzhjVar.s();
                zznp.m1(jVar, null, iB1, "_ev", strL2, length);
                return;
            }
            String str6 = "_o";
            Bundle bundleG1 = zzivVar.V0().g1(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z11);
            Preconditions.i(bundleG1);
            if (zzivVar.Y0().d1(false) == null || !"_ae".equals(str2)) {
                j10 = 0;
            } else {
                k0 k0Var = zzivVar.Z0().f9269x;
                ((zzhj) k0Var.f3045d.f577s).f9120F.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                j10 = 0;
                long j13 = jElapsedRealtime - k0Var.f3043b;
                k0Var.f3043b = jElapsedRealtime;
                if (j13 > 0) {
                    zzivVar.V0().o1(bundleG1, j13);
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                zznp zznpVarV0 = zzivVar.V0();
                String string2 = bundleG1.getString("_ffr");
                int i15 = Strings.a;
                if (string2 == null || string2.trim().isEmpty()) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                if (Objects.equals(string2, zznpVarV0.U0().f3144O.a())) {
                    zznpVarV0.i().f9051E.b("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                zznpVarV0.U0().f3144O.b(string2);
            } else if ("_ae".equals(str2)) {
                String strA = zzivVar.V0().U0().f3144O.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleG1.putString("_ffr", strA);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bundleG1);
            Bundle[] bundleArr2 = null;
            if (zzhjVar.f9146y.h1(null, zzbf.f8940G0)) {
                zzmh zzmhVarZ0 = zzivVar.Z0();
                zzmhVarZ0.W0();
                zB = zzmhVarZ0.f9267v;
            } else {
                zB = zzivVar.U0().f3141L.b();
            }
            if (zzivVar.U0().f3138I.a() > j10) {
                i10 = 0;
                i11 = 1;
                j11 = j;
                if (zzivVar.U0().c1(j11) && zB) {
                    zzivVar.i().f9052F.b("Current session is expired, remove the session number, ID, and engagement time");
                    defaultClock.getClass();
                    bundleArr2 = null;
                    zEquals2 = zEquals2;
                    defaultClock = defaultClock;
                    j12 = j10;
                    e1(System.currentTimeMillis(), null, "auto", "_sid");
                    defaultClock.getClass();
                    e1(System.currentTimeMillis(), null, "auto", "_sno");
                    defaultClock.getClass();
                    e1(System.currentTimeMillis(), null, "auto", "_se");
                    zzivVar = this;
                    zzivVar.U0().f3139J.b(j12);
                }
                if (bundleG1.getLong("extend_session", j12) == 1) {
                    zzivVar.i().f9052F.b("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    zzmh zzmhVar = zzhjVar.f9117C;
                    zzhj.f(zzmhVar);
                    zzmhVar.f9268w.N(j11);
                }
                arrayList = new ArrayList(bundleG1.keySet());
                Collections.sort(arrayList);
                size = arrayList.size();
                i12 = i10;
                while (i12 < size) {
                    Object obj2 = arrayList.get(i12);
                    i12++;
                    str4 = (String) obj2;
                    if (str4 != null) {
                        zzivVar.V0();
                        obj = bundleG1.get(str4);
                        if (obj instanceof Bundle) {
                            Bundle[] bundleArr3 = new Bundle[i11];
                            bundleArr3[i10] = (Bundle) obj;
                            bundleArr = bundleArr3;
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = bundleArr2;
                        }
                        if (bundleArr != null) {
                            bundleG1.putParcelableArray(str4, bundleArr);
                        }
                    }
                    i11 = 1;
                }
                i13 = i10;
                while (i13 < arrayList2.size()) {
                    ArrayList arrayList4 = arrayList2;
                    bundleF1 = (Bundle) arrayList4.get(i13);
                    if (i13 != 0) {
                        str3 = "_ep";
                    } else {
                        str3 = str2;
                    }
                    bundleF1.putString(str6, str5);
                    if (z10) {
                        bundleF1 = zzivVar.V0().f1(bundleF1);
                    }
                    bundle2 = bundleF1;
                    String str7 = str6;
                    zzbd zzbdVar = new zzbd(str3, new zzbc(bundle2), str5, j11);
                    zzkx zzkxVarR = zzhjVar.r();
                    zzkxVarR.getClass();
                    zzkxVarR.W0();
                    zzkxVarR.a1();
                    zzfpVarP = ((zzhj) zzkxVarR.f577s).p();
                    zzfpVarP.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    zzbdVar.writeToParcel(parcelObtain, i10);
                    bArrMarshall = parcelObtain.marshall();
                    parcelObtain.recycle();
                    if (bArrMarshall.length > 131072) {
                        zzfpVarP.i().f9057y.b("Event is too long for local database. Sending event directly to service");
                        zE1 = false;
                    } else {
                        zE1 = zzfpVarP.e1(0, bArrMarshall);
                    }
                    zzkxVarR.f1(new d0(zzkxVarR, zzkxVarR.p1(true), zE1, zzbdVar, 1));
                    if (!zEquals2) {
                        it = zzivVar.f9206w.iterator();
                        while (it.hasNext()) {
                            ((zziu) it.next()).a(j, new Bundle(bundle2), str, str2);
                        }
                    }
                    i13++;
                    j11 = j;
                    str6 = str7;
                    arrayList2 = arrayList4;
                    i10 = 0;
                    str5 = str;
                }
                if (zzivVar.Y0().d1(false) == null && "_ae".equals(str2)) {
                    zzmh zzmhVarZ1 = zzivVar.Z0();
                    defaultClock.getClass();
                    zzmhVarZ1.f9269x.a(true, true, SystemClock.elapsedRealtime());
                    return;
                }
            }
            i10 = 0;
            i11 = 1;
            j11 = j;
            j12 = j10;
            if (bundleG1.getLong("extend_session", j12) == 1) {
                zzivVar.i().f9052F.b("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                zzmh zzmhVar2 = zzhjVar.f9117C;
                zzhj.f(zzmhVar2);
                zzmhVar2.f9268w.N(j11);
            }
            arrayList = new ArrayList(bundleG1.keySet());
            Collections.sort(arrayList);
            size = arrayList.size();
            i12 = i10;
            while (i12 < size) {
                Object obj3 = arrayList.get(i12);
                i12++;
                str4 = (String) obj3;
                if (str4 != null) {
                    zzivVar.V0();
                    obj = bundleG1.get(str4);
                    if (obj instanceof Bundle) {
                        Bundle[] bundleArr4 = new Bundle[i11];
                        bundleArr4[i10] = (Bundle) obj;
                        bundleArr = bundleArr4;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr2, parcelableArr2.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList5 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList5.toArray(new Bundle[arrayList5.size()]);
                    } else {
                        bundleArr = bundleArr2;
                    }
                    if (bundleArr != null) {
                        bundleG1.putParcelableArray(str4, bundleArr);
                    }
                }
                i11 = 1;
            }
            i13 = i10;
            while (i13 < arrayList2.size()) {
                ArrayList arrayList6 = arrayList2;
                bundleF1 = (Bundle) arrayList6.get(i13);
                if (i13 != 0) {
                    str3 = "_ep";
                } else {
                    str3 = str2;
                }
                bundleF1.putString(str6, str5);
                if (z10) {
                    bundleF1 = zzivVar.V0().f1(bundleF1);
                }
                bundle2 = bundleF1;
                String str8 = str6;
                zzbd zzbdVar2 = new zzbd(str3, new zzbc(bundle2), str5, j11);
                zzkx zzkxVarR2 = zzhjVar.r();
                zzkxVarR2.getClass();
                zzkxVarR2.W0();
                zzkxVarR2.a1();
                zzfpVarP = ((zzhj) zzkxVarR2.f577s).p();
                zzfpVarP.getClass();
                Parcel parcelObtain2 = Parcel.obtain();
                zzbdVar2.writeToParcel(parcelObtain2, i10);
                bArrMarshall = parcelObtain2.marshall();
                parcelObtain2.recycle();
                if (bArrMarshall.length > 131072) {
                    zzfpVarP.i().f9057y.b("Event is too long for local database. Sending event directly to service");
                    zE1 = false;
                } else {
                    zE1 = zzfpVarP.e1(0, bArrMarshall);
                }
                zzkxVarR2.f1(new d0(zzkxVarR2, zzkxVarR2.p1(true), zE1, zzbdVar2, 1));
                if (!zEquals2) {
                    it = zzivVar.f9206w.iterator();
                    while (it.hasNext()) {
                        ((zziu) it.next()).a(j, new Bundle(bundle2), str, str2);
                    }
                }
                i13++;
                j11 = j;
                str6 = str8;
                arrayList2 = arrayList6;
                i10 = 0;
                str5 = str;
            }
            if (zzivVar.Y0().d1(false) == null) {
            }
        }
    }

    public final void p1(String str, String str2, Bundle bundle) {
        ((zzhj) this.f577s).f9120F.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Preconditions.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(MediationMetaData.KEY_NAME, str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        l().f1(new U(this, bundle2, 1));
    }

    public final void q1(String str, String str2, Bundle bundle, boolean z6, boolean z10, long j) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z11 = !z10 || this.f9205v == null || zznp.c2(str2);
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i10 = 0; i10 < parcelableArr.length; i10++) {
                        if (parcelableArr[i10] instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelableArr[i10]);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        Object obj2 = list.get(i11);
                        if (obj2 instanceof Bundle) {
                            list.set(i11, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            l().f1(new T(this, str3, str2, j, bundle3, z10, z11, z6));
            return;
        }
        zzks zzksVarY0 = Y0();
        synchronized (zzksVarY0.f9234D) {
            try {
                if (!zzksVarY0.f9233C) {
                    zzksVarY0.i().f9049C.b("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > ((zzhj) zzksVarY0.f577s).f9146y.Y0(null, false))) {
                    zzksVarY0.i().f9049C.a(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > ((zzhj) zzksVarY0.f577s).f9146y.Y0(null, false))) {
                    zzksVarY0.i().f9049C.a(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    Activity activity = zzksVarY0.f9239y;
                    string2 = activity != null ? zzksVarY0.e1(activity.getClass()) : "Activity";
                }
                String str5 = string2;
                zzkp zzkpVar = zzksVarY0.f9235u;
                if (zzksVarY0.f9240z && zzkpVar != null) {
                    zzksVarY0.f9240z = false;
                    boolean zEquals = Objects.equals(zzkpVar.f9226b, str5);
                    boolean zEquals2 = Objects.equals(zzkpVar.a, string);
                    if (zEquals && zEquals2) {
                        zzksVarY0.i().f9049C.b("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                zzksVarY0.i().f9052F.c("Logging screen view with name, class", string == null ? "null" : string, str5 == null ? "null" : str5);
                zzkp zzkpVar2 = zzksVarY0.f9235u == null ? zzksVarY0.f9236v : zzksVarY0.f9235u;
                zzkp zzkpVar3 = new zzkp(string, str5, zzksVarY0.V0().h2(), true, j);
                zzksVarY0.f9235u = zzkpVar3;
                zzksVarY0.f9236v = zzkpVar2;
                zzksVarY0.f9231A = zzkpVar3;
                ((zzhj) zzksVarY0.f577s).f9120F.getClass();
                zzksVarY0.l().f1(new F(zzksVarY0, bundle2, zzkpVar3, zzkpVar2, SystemClock.elapsedRealtime(), 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    public final void r1(String str, String str2, Object obj, boolean z6, long j) {
        int iP1;
        int length;
        String str3 = str == null ? "app" : str;
        if (z6) {
            iP1 = V0().P1(str2);
        } else {
            zznp zznpVarV0 = V0();
            if (!zznpVarV0.X1("user property", str2)) {
                iP1 = 6;
            } else if (!zznpVarV0.L1("user property", zzis.a, null, str2)) {
                iP1 = 15;
            } else if (zznpVarV0.G1("user property", 24, str2)) {
                iP1 = 0;
            } else {
                iP1 = 6;
            }
        }
        j jVar = this.f9203M;
        zzhj zzhjVar = (zzhj) this.f577s;
        if (iP1 != 0) {
            V0();
            String strL1 = zznp.l1(str2, true, 24);
            length = str2 != null ? str2.length() : 0;
            zzhjVar.s();
            zznp.m1(jVar, null, iP1, "_ev", strL1, length);
            return;
        }
        if (obj == null) {
            l().f1(new F(this, str3, str2, null, j, 1));
            return;
        }
        int iA1 = V0().a1(obj, str2);
        if (iA1 == 0) {
            Object objV1 = V0().V1(obj, str2);
            if (objV1 != null) {
                l().f1(new F(this, str3, str2, objV1, j, 1));
                return;
            }
            return;
        }
        V0();
        String strL2 = zznp.l1(str2, true, 24);
        length = ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
        zzhjVar.s();
        zznp.m1(jVar, null, iA1, "_ev", strL2, length);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.measurement.internal.zziy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.measurement.internal.zzix] */
    public final PriorityQueue s1() {
        if (this.f9194D == null) {
            this.f9194D = AbstractC0106d.l(Comparator.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.zziy
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((zzmu) obj).f9274t);
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.zzix
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.f9194D;
    }

    public final void t1() {
        W0();
        a1();
        zzhj zzhjVar = (zzhj) this.f577s;
        if (zzhjVar.j()) {
            Boolean boolF1 = zzhjVar.f9146y.f1("google_analytics_deferred_deep_link_enabled");
            if (boolF1 != null && boolF1.booleanValue()) {
                i().f9051E.b("Deferred Deep Link feature enabled.");
                zzhc zzhcVarL = l();
                zzje zzjeVar = new zzje();
                zzjeVar.f9219s = this;
                zzhcVarL.f1(zzjeVar);
            }
            zzkx zzkxVarR = zzhjVar.r();
            zzkxVarR.W0();
            zzkxVarR.a1();
            zzo zzoVarP1 = zzkxVarR.p1(true);
            ((zzhj) zzkxVarR.f577s).p().e1(3, new byte[0]);
            zzkxVarR.f1(new c0(zzkxVarR, zzoVarP1, 1));
            this.f9199I = false;
            C0313w c0313wU0 = U0();
            c0313wU0.W0();
            String string = c0313wU0.f1().getString("previous_os_version", null);
            ((zzhj) c0313wU0.f577s).n().X0();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = c0313wU0.f1().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            zzhjVar.n().X0();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            B1("auto", "_ou", bundle);
        }
    }

    public final void u1() {
        zzhj zzhjVar = (zzhj) this.f577s;
        if (!(zzhjVar.f9140s.getApplicationContext() instanceof Application) || this.f9204u == null) {
            return;
        }
        ((Application) zzhjVar.f9140s.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f9204u);
    }

    public final void v1() {
        zzpg.a();
        if (((zzhj) this.f577s).f9146y.h1(null, zzbf.f8928A0)) {
            if (l().h1()) {
                i().f9056x.b("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (zzab.a()) {
                i().f9056x.b("Cannot get trigger URIs from main thread");
                return;
            }
            a1();
            i().f9052F.b("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            zzhc zzhcVarL = l();
            zzja zzjaVar = new zzja();
            zzjaVar.f9212s = this;
            zzjaVar.f9213t = atomicReference;
            zzhcVarL.b1(atomicReference, 5000L, "get trigger URIs", zzjaVar);
            List list = (List) atomicReference.get();
            if (list == null) {
                i().f9056x.b("Timed out waiting for get trigger URIs");
                return;
            }
            zzhc zzhcVarL2 = l();
            zziz zzizVar = new zziz();
            zzizVar.f9210s = this;
            zzizVar.f9211t = list;
            zzhcVarL2.f1(zzizVar);
        }
    }

    public final void w1() {
        String string;
        int i10;
        int i11;
        int i12;
        String string2;
        int i13;
        int i14;
        Bundle bundle;
        int i15;
        Bundle bundle2;
        W0();
        i().f9051E.b("Handle tcf update.");
        SharedPreferences sharedPreferencesE1 = U0().e1();
        HashMap map = new HashMap();
        try {
            string = sharedPreferencesE1.getString("IABTCF_VendorConsents", "\u0000");
        } catch (ClassCastException unused) {
            string = "\u0000";
        }
        if (!"\u0000".equals(string) && string.length() > 754) {
            map.put("GoogleConsent", String.valueOf(string.charAt(754)));
        }
        try {
            i10 = sharedPreferencesE1.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused2) {
            i10 = -1;
        }
        if (i10 != -1) {
            map.put("gdprApplies", String.valueOf(i10));
        }
        try {
            i11 = sharedPreferencesE1.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused3) {
            i11 = -1;
        }
        if (i11 != -1) {
            map.put("EnableAdvertiserConsentMode", String.valueOf(i11));
        }
        try {
            i12 = sharedPreferencesE1.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused4) {
            i12 = -1;
        }
        if (i12 != -1) {
            map.put("PolicyVersion", String.valueOf(i12));
        }
        try {
            string2 = sharedPreferencesE1.getString("IABTCF_PurposeConsents", "\u0000");
        } catch (ClassCastException unused5) {
            string2 = "\u0000";
        }
        if (!"\u0000".equals(string2)) {
            map.put("PurposeConsents", string2);
        }
        try {
            i13 = sharedPreferencesE1.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused6) {
            i13 = -1;
        }
        if (i13 != -1) {
            map.put("CmpSdkID", String.valueOf(i13));
        }
        zzms zzmsVar = new zzms(map);
        i().f9052F.a(zzmsVar, "Tcf preferences read");
        C0313w c0313wU0 = U0();
        c0313wU0.W0();
        String string3 = c0313wU0.f1().getString("stored_tcf_param", "");
        String strA = zzmsVar.a();
        if (strA.equals(string3)) {
            return;
        }
        SharedPreferences.Editor editorEdit = c0313wU0.f1().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        HashMap map2 = zzmsVar.a;
        if ("1".equals(map2.get("GoogleConsent")) && "1".equals(map2.get("gdprApplies")) && "1".equals(map2.get("EnableAdvertiserConsentMode"))) {
            int iB = zzmsVar.b();
            if (iB < 0) {
                bundle2 = Bundle.EMPTY;
            } else {
                String str = (String) map2.get("PurposeConsents");
                if (TextUtils.isEmpty(str)) {
                    bundle2 = Bundle.EMPTY;
                } else {
                    bundle = new Bundle();
                    String str2 = "denied";
                    if (str.length() > 0) {
                        bundle.putString("ad_storage", str.charAt(0) == '1' ? "granted" : "denied");
                    }
                    if (str.length() > 3) {
                        bundle.putString("ad_personalization", (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                    }
                    if (str.length() <= 6 || iB < 4) {
                        i14 = 0;
                    } else {
                        i14 = 0;
                        if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                            str2 = "granted";
                        }
                        bundle.putString("ad_user_data", str2);
                    }
                }
            }
            bundle = bundle2;
            i14 = 0;
        } else {
            i14 = 0;
            bundle = Bundle.EMPTY;
        }
        i().f9052F.a(bundle, "Consent generated from Tcf");
        if (bundle != Bundle.EMPTY) {
            ((zzhj) this.f577s).f9120F.getClass();
            g1(bundle, -30, System.currentTimeMillis());
        }
        Bundle bundle3 = new Bundle();
        StringBuilder sb = new StringBuilder("1");
        try {
            String str3 = (String) map2.get("CmpSdkID");
            i15 = !TextUtils.isEmpty(str3) ? Integer.parseInt(str3) : -1;
        } catch (NumberFormatException unused7) {
        }
        if (i15 < 0 || i15 > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((i15 >> 6) & 63));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i15 & 63));
        }
        int iB2 = zzmsVar.b();
        if (iB2 < 0 || iB2 > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iB2));
        }
        int i16 = "1".equals(map2.get("gdprApplies")) ? 2 : i14;
        int i17 = i16 | 4;
        if ("1".equals(map2.get("EnableAdvertiserConsentMode"))) {
            i17 = i16 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i17));
        bundle3.putString("_tcfd", sb.toString());
        B1("auto", "_tcf", bundle3);
    }

    public final void x1() {
        zzmu zzmuVar;
        d dVarI2;
        W0();
        if (s1().isEmpty() || this.f9191A || (zzmuVar = (zzmu) s1().poll()) == null || (dVarI2 = V0().i2()) == null) {
            return;
        }
        this.f9191A = true;
        zzfy zzfyVar = i().f9052F;
        String str = zzmuVar.f9273s;
        zzfyVar.a(str, "Registering trigger URI");
        C3.d dVarD = dVarI2.d(Uri.parse(str));
        if (dVarD == null) {
            this.f9191A = false;
            s1().add(zzmuVar);
            return;
        }
        if (!((zzhj) this.f577s).f9146y.h1(null, zzbf.f8938F0)) {
            SparseArray sparseArrayG1 = U0().g1();
            sparseArrayG1.put(zzmuVar.f9275u, Long.valueOf(zzmuVar.f9274t));
            U0().a1(sparseArrayG1);
        }
        dVarD.f(new c(dVarD, 0, new S(this, 7, zzmuVar)), new O(this, 0));
    }

    public final void y1() {
        zziv zzivVar;
        W0();
        String strA = U0().f3135F.a();
        zzhj zzhjVar = (zzhj) this.f577s;
        if (strA == null) {
            zzivVar = this;
        } else if ("unset".equals(strA)) {
            zzhjVar.f9120F.getClass();
            zzivVar = this;
            zzivVar.e1(System.currentTimeMillis(), null, "app", "_npa");
        } else {
            Long lValueOf = Long.valueOf("true".equals(strA) ? 1L : 0L);
            zzhjVar.f9120F.getClass();
            e1(System.currentTimeMillis(), lValueOf, "app", "_npa");
            zzivVar = this;
        }
        if (zzhjVar.h() && zzivVar.f9199I) {
            i().f9051E.b("Recording app launch after enabling measurement for the first time (FE)");
            t1();
            Z0().f9268w.M();
            l().f1(new RunnableC0094c(this, 9));
            return;
        }
        i().f9051E.b("Updating Scion state (FE)");
        zzkx zzkxVarR = zzhjVar.r();
        zzkxVarR.W0();
        zzkxVarR.a1();
        zzkxVarR.f1(new c0(zzkxVarR, zzkxVarR.p1(true), 2));
    }

    public final void z1(Bundle bundle, long j) {
        Preconditions.i(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            i().f9047A.b("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        zzik.a(bundle2, "app_id", String.class, null);
        zzik.a(bundle2, "origin", String.class, null);
        zzik.a(bundle2, MediationMetaData.KEY_NAME, String.class, null);
        zzik.a(bundle2, "value", Object.class, null);
        zzik.a(bundle2, "trigger_event_name", String.class, null);
        zzik.a(bundle2, "trigger_timeout", Long.class, 0L);
        zzik.a(bundle2, "timed_out_event_name", String.class, null);
        zzik.a(bundle2, "timed_out_event_params", Bundle.class, null);
        zzik.a(bundle2, "triggered_event_name", String.class, null);
        zzik.a(bundle2, "triggered_event_params", Bundle.class, null);
        zzik.a(bundle2, "time_to_live", Long.class, 0L);
        zzik.a(bundle2, "expired_event_name", String.class, null);
        zzik.a(bundle2, "expired_event_params", Bundle.class, null);
        Preconditions.e(bundle2.getString(MediationMetaData.KEY_NAME));
        Preconditions.e(bundle2.getString("origin"));
        Preconditions.i(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString(MediationMetaData.KEY_NAME);
        Object obj = bundle2.get("value");
        int iP1 = V0().P1(string);
        zzhj zzhjVar = (zzhj) this.f577s;
        if (iP1 != 0) {
            zzfw zzfwVarI = i();
            zzfwVarI.f9056x.a(zzhjVar.f9119E.g(string), "Invalid conditional user property name");
            return;
        }
        if (V0().a1(obj, string) != 0) {
            zzfw zzfwVarI2 = i();
            zzfwVarI2.f9056x.c("Invalid conditional user property value", zzhjVar.f9119E.g(string), obj);
            return;
        }
        Object objV1 = V0().V1(obj, string);
        if (objV1 == null) {
            zzfw zzfwVarI3 = i();
            zzfwVarI3.f9056x.c("Unable to normalize conditional user property value", zzhjVar.f9119E.g(string), obj);
            return;
        }
        zzik.b(bundle2, objV1);
        long j10 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j10 > 15552000000L || j10 < 1)) {
            zzfw zzfwVarI4 = i();
            zzfwVarI4.f9056x.c("Invalid conditional user property timeout", zzhjVar.f9119E.g(string), Long.valueOf(j10));
            return;
        }
        long j11 = bundle2.getLong("time_to_live");
        if (j11 <= 15552000000L && j11 >= 1) {
            l().f1(new U(this, bundle2, 0));
            return;
        }
        zzfw zzfwVarI5 = i();
        zzfwVarI5.f9056x.c("Invalid conditional user property time to live", zzhjVar.f9119E.g(string), Long.valueOf(j11));
    }
}
