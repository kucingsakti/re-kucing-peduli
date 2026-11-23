package M2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzgj;
import com.google.android.gms.measurement.internal.zzgk;
import com.google.android.gms.measurement.internal.zzgl;
import com.google.android.gms.measurement.internal.zzgm;
import com.google.android.gms.measurement.internal.zzgn;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzin;

/* JADX INFO: renamed from: M2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0313w extends L {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Pair f3129S = new Pair("", 0L);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f3130A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f3131B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f3132C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final zzgm f3133D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final zzgk f3134E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final zzgn f3135F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final zzgj f3136G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final zzgk f3137H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final zzgm f3138I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final zzgm f3139J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f3140K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final zzgk f3141L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final zzgk f3142M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final zzgm f3143N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final zzgn f3144O;
    public final zzgn P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final zzgm f3145Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final zzgj f3146R;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SharedPreferences f3147u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f3148v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SharedPreferences f3149w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public zzgl f3150x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final zzgm f3151y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final zzgn f3152z;

    public C0313w(zzhj zzhjVar) {
        super(zzhjVar);
        this.f3148v = new Object();
        this.f3133D = new zzgm(this, "session_timeout", 1800000L);
        this.f3134E = new zzgk(this, "start_new_session", true);
        this.f3138I = new zzgm(this, "last_pause_time", 0L);
        this.f3139J = new zzgm(this, "session_id", 0L);
        this.f3135F = new zzgn(this, "non_personalized_ads");
        this.f3136G = new zzgj(this, "last_received_uri_timestamps_by_source");
        this.f3137H = new zzgk(this, "allow_remote_dynamite", false);
        this.f3151y = new zzgm(this, "first_open_time", 0L);
        new zzgm(this, "app_install_time", 0L);
        this.f3152z = new zzgn(this, "app_instance_id");
        this.f3141L = new zzgk(this, "app_backgrounded", false);
        this.f3142M = new zzgk(this, "deep_link_retrieval_complete", false);
        this.f3143N = new zzgm(this, "deep_link_retrieval_attempts", 0L);
        this.f3144O = new zzgn(this, "firebase_feature_rollouts");
        this.P = new zzgn(this, "deferred_attribution_cache");
        this.f3145Q = new zzgm(this, "deferred_attribution_cache_timestamp", 0L);
        this.f3146R = new zzgj(this, "default_event_parameters");
    }

    @Override // M2.L
    public final boolean Z0() {
        return true;
    }

    public final void a1(SparseArray sparseArray) {
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            iArr[i10] = sparseArray.keyAt(i10);
            jArr[i10] = ((Long) sparseArray.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.f3136G.b(bundle);
    }

    public final boolean b1(int i10) {
        return zzin.h(i10, f1().getInt("consent_source", 100));
    }

    public final boolean c1(long j) {
        return j - this.f3133D.a() > this.f3138I.a();
    }

    public final void d1(boolean z6) {
        W0();
        zzfw zzfwVarI = i();
        zzfwVarI.f9052F.a(Boolean.valueOf(z6), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = f1().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z6);
        editorEdit.apply();
    }

    public final SharedPreferences e1() {
        W0();
        X0();
        if (this.f3149w == null) {
            synchronized (this.f3148v) {
                try {
                    if (this.f3149w == null) {
                        String str = ((zzhj) this.f577s).f9140s.getPackageName() + "_preferences";
                        i().f9052F.a(str, "Default prefs file");
                        this.f3149w = ((zzhj) this.f577s).f9140s.getSharedPreferences(str, 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f3149w;
    }

    public final SharedPreferences f1() {
        W0();
        X0();
        Preconditions.i(this.f3147u);
        return this.f3147u;
    }

    public final SparseArray g1() {
        Bundle bundleA = this.f3136G.a();
        if (bundleA == null) {
            return new SparseArray();
        }
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            i().f9056x.b("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    public final zzin h1() {
        W0();
        return zzin.e(f1().getInt("consent_source", 100), f1().getString("consent_settings", "G1"));
    }
}
