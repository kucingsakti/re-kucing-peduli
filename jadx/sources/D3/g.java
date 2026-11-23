package D3;

import I3.l;
import J3.k;
import Q.n;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import com.unity3d.ads.metadata.MediationMetaData;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f1047k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p212w.e f1048l = new p212w.e(0);
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f1050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I3.g f1051d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f1054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p073h4.b f1055h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f1052e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f1053f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f1056i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    public g(j jVar, Context context, String str) {
        ?? arrayList;
        ?? r10 = 1;
        ?? r11 = 1;
        int i10 = 0;
        this.a = context;
        Preconditions.e(str);
        this.f1049b = str;
        this.f1050c = jVar;
        a aVar = FirebaseInitProvider.f9998s;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new I3.d((String) it.next(), i10));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        k kVar = k.f2402s;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new I3.d(new FirebaseCommonRegistrar(), r11 == true ? 1 : 0));
        arrayList3.add(new I3.d(new ExecutorsRegistrar(), r10 == true ? 1 : 0));
        arrayList4.add(I3.b.c(context, Context.class, new Class[0]));
        arrayList4.add(I3.b.c(this, g.class, new Class[0]));
        arrayList4.add(I3.b.c(jVar, j.class, new Class[0]));
        p170r3.e eVar = new p170r3.e(27);
        if ((Build.VERSION.SDK_INT >= 24 ? n.a(context) : true) && FirebaseInitProvider.f9999t.get()) {
            arrayList4.add(I3.b.c(aVar, a.class, new Class[0]));
        }
        I3.g gVar = new I3.g(arrayList3, arrayList4, eVar);
        this.f1051d = gVar;
        Trace.endSection();
        this.f1054g = new l(new c(this, i10, context));
        this.f1055h = gVar.d(p053f4.d.class);
        d dVar = new d(this);
        a();
        if (this.f1052e.get()) {
            BackgroundDetector.f7888w.f7889s.get();
        }
        this.f1056i.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (f1047k) {
            try {
                gVar = (g) f1048l.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((p053f4.d) gVar.f1055h.get()).c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(j jVar, Context context, String str) {
        g gVar;
        AtomicReference atomicReference = e.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                do {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        BackgroundDetector.b(application);
                        BackgroundDetector.f7888w.a(eVar);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f1047k) {
            p212w.e eVar2 = f1048l;
            Preconditions.k("FirebaseApp name " + strTrim + " already exists!", !eVar2.containsKey(strTrim));
            Preconditions.j(context, "Application context cannot be null.");
            gVar = new g(jVar, context, strTrim);
            eVar2.put(strTrim, gVar);
        }
        gVar.e();
        return gVar;
    }

    public static g g(Context context) {
        synchronized (f1047k) {
            try {
                if (f1048l.containsKey("[DEFAULT]")) {
                    return c();
                }
                j jVarA = j.a(context);
                if (jVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(jVarA, context, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        Preconditions.k("FirebaseApp was deleted", !this.f1053f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f1051d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f1049b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.f1050c.f1063b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void e() {
        HashMap map;
        if (!(Build.VERSION.SDK_INT >= 24 ? n.a(this.a) : true)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f1049b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.a;
            AtomicReference atomicReference = f.f1046b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f1049b);
        Log.i("FirebaseApp", sb2.toString());
        I3.g gVar = this.f1051d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f1049b);
        AtomicReference atomicReference2 = gVar.f2031x;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((p053f4.d) this.f1055h.get()).c();
            }
        }
        synchronized (gVar) {
            map = new HashMap(gVar.f2026s);
        }
        gVar.g(map, zEquals);
        ((p053f4.d) this.f1055h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f1049b.equals(gVar.f1049b);
    }

    public final boolean h() {
        boolean z6;
        a();
        p119m4.a aVar = (p119m4.a) this.f1054g.get();
        synchronized (aVar) {
            z6 = aVar.a;
        }
        return z6;
    }

    public final int hashCode() {
        return this.f1049b.hashCode();
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.f1049b, MediationMetaData.KEY_NAME);
        toStringHelper.a(this.f1050c, "options");
        return toStringHelper.toString();
    }
}
