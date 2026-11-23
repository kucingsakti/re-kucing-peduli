package K0;

import A1.r;
import android.content.Context;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O0.b f2513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f2514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f2515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f2518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f2519i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f2521l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f2522m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f2523n;

    public b(Context context, String str, O0.b bVar, r rVar, ArrayList arrayList, boolean z6, int i10, Executor executor, Executor executor2, boolean z10, boolean z11, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        p210v8.i.f(context, "context");
        p210v8.i.f(rVar, "migrationContainer");
        AbstractC0487g.p(i10, "journalMode");
        p210v8.i.f(executor, "queryExecutor");
        p210v8.i.f(executor2, "transactionExecutor");
        p210v8.i.f(arrayList2, "typeConverters");
        p210v8.i.f(arrayList3, "autoMigrationSpecs");
        this.a = context;
        this.f2512b = str;
        this.f2513c = bVar;
        this.f2514d = rVar;
        this.f2515e = arrayList;
        this.f2516f = z6;
        this.f2517g = i10;
        this.f2518h = executor;
        this.f2519i = executor2;
        this.j = z10;
        this.f2520k = z11;
        this.f2521l = linkedHashSet;
        this.f2522m = arrayList2;
        this.f2523n = arrayList3;
    }
}
