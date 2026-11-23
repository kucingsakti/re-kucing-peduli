package p188t1;

import A9.AbstractC0151y;
import B4.I;
import C8.InterfaceC0175c;
import C8.InterfaceC0178f;
import E1.D;
import E1.E;
import E4.C0187a;
import F8.U;
import K0.q;
import L8.AbstractC0287v;
import L8.InterfaceC0290y;
import L8.M;
import O3.C0343a;
import O3.C0344b;
import O3.s;
import O3.w;
import O3.x;
import P3.d;
import P3.m;
import P3.n;
import Q3.A;
import Q3.B;
import Q3.C0373d0;
import Q3.C0375e0;
import Q3.C0379g0;
import Q3.C0381h0;
import Q3.F;
import Q3.K0;
import Q3.O;
import Q3.P;
import Q3.Q;
import R8.AbstractC0408c;
import X9.InterfaceC0463i;
import X9.y;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.cloudmessaging.zzw;
import com.google.android.gms.cloudmessaging.zzy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.kcstream.cing.MainApp;
import com.kcstream.cing.R;
import com.unity3d.ads.metadata.MediationMetaData;
import i2.p;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import o1.k;
import p.I0;
import p.N0;
import p.b1;
import p.r;
import p047e9.C0615g;
import p047e9.C0620l;
import p047e9.C0627t;
import p047e9.C0632y;
import p047e9.EnumC0617i;
import p047e9.W;
import p047e9.Z;
import p068ga.l;
import p086i8.C;
import p096j9.f;
import p104k9.AbstractC0682k;
import p104k9.C0678g;
import p145o9.g;
import p145o9.h;
import p145o9.j;
import p195u1.b;
import p204v1.e;
import p210v8.i;
import p210v8.u;
import p210v8.v;
import p220w9.a;
import p220w9.c;
import smartadapter.internal.exception.ConstructorNotFoundException;
import ya.AbstractC0883d;
import ya.AbstractC0889j;
import ya.InterfaceC0884e;
import ya.InterfaceC0890k;

/* JADX INFO: loaded from: classes.dex */
public final class G implements a, c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static volatile G f14977y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f14978s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f14979t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f14980u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f14981v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f14982w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f14983x;

    public /* synthetic */ G(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f14978s = obj;
        this.f14979t = obj2;
        this.f14980u = obj3;
        this.f14981v = obj4;
        this.f14982w = obj5;
        this.f14983x = obj6;
    }

    public static void C(Drawable drawable, int i10, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = r.f14113b;
        }
        drawableMutate.setColorFilter(r.c(i10, mode));
    }

    public static G a(o1.c cVar, b bVar, MainApp mainApp, e eVar) {
        String installerPackageName;
        String str;
        String string;
        if (f14977y == null) {
            synchronized (G.class) {
                try {
                    if (f14977y == null) {
                        String strB = Y.b();
                        p140o4.r rVarC = p140o4.r.f13779y.c(mainApp);
                        String packageName = mainApp.getPackageName();
                        try {
                            installerPackageName = Build.VERSION.SDK_INT < 30 ? mainApp.getPackageManager().getInstallerPackageName(packageName) : mainApp.getPackageManager().getInstallSourceInfo(packageName).getInitiatingPackageName();
                        } catch (PackageManager.NameNotFoundException | IllegalArgumentException unused) {
                            installerPackageName = null;
                        }
                        try {
                            str = mainApp.getPackageManager().getPackageInfo(mainApp.getPackageName(), 0).versionName;
                        } catch (PackageManager.NameNotFoundException | IllegalArgumentException unused2) {
                            str = null;
                        }
                        T3.c cVar2 = new T3.c(mainApp.getPackageName(), eVar, installerPackageName, str);
                        N n10 = (N) cVar.f13623t;
                        n10.getClass();
                        String str2 = n10.f14987e;
                        C0844g c0844g = (C0844g) cVar.f13624u;
                        c0844g.getClass();
                        if (c0844g.a.contains(C.a(C.c("057AA0CC18EBC4ABB97E0B")))) {
                            string = c0844g.a.getString(C.a(C.c("057AA0CC18EBC4ABB97E0B")), null);
                        } else {
                            string = null;
                        }
                        f14977y = new G(str2, string, strB, cVar2, rVarC);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14977y;
    }

    public static final g b(G g8, f fVar, Object obj) {
        g gVarB = h.a.b((O8.C) g8.f14980u, obj);
        if (gVarB != null) {
            return gVarB;
        }
        String str = "Unsupported annotation argument: " + fVar;
        i.f(str, "message");
        return new j(str);
    }

    public static P c(P p10, P3.e eVar, T3.c cVar) {
        O oA = p10.a();
        String strH = ((P3.c) eVar.f3876t).h();
        if (strH != null) {
            oA.f4120e = new C0373d0(strH);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 2);
        }
        List listO = o(((d) ((AtomicMarkableReference) ((K0.g) cVar.f4659d).f2526c).getReference()).a());
        List listO2 = o(((d) ((AtomicMarkableReference) ((K0.g) cVar.f4660e).f2526c).getReference()).a());
        if (!listO.isEmpty() || !listO2.isEmpty()) {
            Q q10 = p10.f4124c;
            oA.f4118c = new Q(q10.a, listO, listO2, q10.f4130d, q10.f4131e, q10.f4132f, q10.f4133g);
        }
        return oA.a();
    }

    public static K0 d(P p10, T3.c cVar) {
        List listA = ((n) cVar.f4661f).a();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listA.size(); i10++) {
            m mVar = (m) listA.get(i10);
            mVar.getClass();
            C0375e0 c0375e0 = new C0375e0();
            P3.b bVar = (P3.b) mVar;
            String str = bVar.f3870e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.f3867b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            c0375e0.a = new C0379g0(str2, str);
            String str3 = bVar.f3868c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            c0375e0.f4202b = str3;
            String str4 = bVar.f3869d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            c0375e0.f4203c = str4;
            c0375e0.f4204d = bVar.f3871f;
            c0375e0.f4205e = (byte) (c0375e0.f4205e | 1);
            arrayList.add(c0375e0.a());
        }
        if (arrayList.isEmpty()) {
            return p10;
        }
        O oA = p10.a();
        oA.f4121f = new C0381h0(arrayList);
        return oA.a();
    }

    public static boolean e(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static G h(Context context, x xVar, T3.c cVar, C0343a c0343a, P3.e eVar, T3.c cVar2, o1.r rVar, V3.b bVar, k kVar, O3.k kVar2) {
        s sVar = new s(context, xVar, c0343a, rVar, bVar);
        T3.a aVar = new T3.a(cVar, bVar, kVar2);
        R3.a aVar2 = U3.a.f4889b;
        p.b(context);
        return new G(sVar, aVar, new U3.a(new U3.c(p.a().c(new g2.a(U3.a.f4890c, U3.a.f4891d)).a("FIREBASE_CRASHLYTICS_REPORT", new p051f2.c("json"), U3.a.f4892e), bVar.g(), kVar)), eVar, cVar2, xVar);
    }

    public static ColorStateList i(Context context, int i10) {
        int iC = N0.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{N0.f13973b, N0.f13975d, N0.f13974c, N0.f13977f}, new int[]{N0.b(context, R.attr.colorButtonNormal), L.a.b(iC, i10), L.a.b(iC, i10), i10});
    }

    public static /* synthetic */ List l(G g8, q qVar, p029c9.n nVar, Boolean bool, boolean z6, int i10) {
        boolean z10 = (i10 & 4) == 0;
        if ((i10 & 16) != 0) {
            bool = null;
        }
        return g8.k(qVar, nVar, z10, false, bool, (i10 & 32) != 0 ? false : z6);
    }

    public static p029c9.n m(AbstractC0682k abstractC0682k, p067g9.f fVar, p067g9.g gVar, int i10, boolean z6) {
        i.f(abstractC0682k, "proto");
        i.f(fVar, "nameResolver");
        AbstractC0487g.p(i10, "kind");
        if (abstractC0682k instanceof C0620l) {
            C0678g c0678g = i9.h.a;
            i9.e eVarA = i9.h.a((C0620l) abstractC0682k, fVar, gVar);
            if (eVarA != null) {
                return o1.f.h(eVarA);
            }
        } else if (abstractC0682k instanceof C0632y) {
            C0678g c0678g2 = i9.h.a;
            i9.e eVarC = i9.h.c((C0632y) abstractC0682k, fVar, gVar);
            if (eVarC != null) {
                return o1.f.h(eVarC);
            }
        } else if (abstractC0682k instanceof p047e9.G) {
            p104k9.m mVar = h9.k.f11880d;
            i.e(mVar, "propertySignature");
            h9.e eVar = (h9.e) xa.d.m(abstractC0682k, mVar);
            if (eVar != null) {
                int iD = p239z.e.d(i10);
                if (iD == 1) {
                    return C.n((p047e9.G) abstractC0682k, fVar, gVar, true, true, z6);
                }
                if (iD == 2) {
                    if ((eVar.f11834t & 4) != 4) {
                        return null;
                    }
                    h9.c cVar = eVar.f11837w;
                    i.e(cVar, "signature.getter");
                    return new p029c9.n(fVar.getString(cVar.f11820u).concat(fVar.getString(cVar.f11821v)));
                }
                if (iD != 3 || (eVar.f11834t & 8) != 8) {
                    return null;
                }
                h9.c cVar2 = eVar.f11838x;
                i.e(cVar2, "signature.setter");
                return new p029c9.n(fVar.getString(cVar2.f11820u).concat(fVar.getString(cVar2.f11821v)));
            }
        }
        return null;
    }

    public static LayerDrawable n(I0 i10, Context context, int i11) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i11);
        Drawable drawableF = i10.f(context, R.drawable.abc_star_black_48dp);
        Drawable drawableF2 = i10.f(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static List o(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new F(str, str2));
        }
        Collections.sort(arrayList, new O3.i(1));
        return Collections.unmodifiableList(arrayList);
    }

    public P2.f A(String str, ExecutorService executorService) {
        TaskCompletionSource taskCompletionSource;
        ArrayList<File> arrayListB = ((T3.a) this.f14979t).b();
        ArrayList<C0344b> arrayList = new ArrayList();
        for (File file : arrayListB) {
            try {
                R3.a aVar = T3.a.f4651g;
                String strE = T3.a.e(file);
                aVar.getClass();
                arrayList.add(new C0344b(R3.a.i(strE), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C0344b c0344b : arrayList) {
            if (str == null || str.equals(c0344b.f3517b)) {
                U3.a aVar2 = (U3.a) this.f14980u;
                B b3 = c0344b.a;
                boolean z6 = true;
                if (b3.f4047f == null || b3.f4048g == null) {
                    w wVarB = ((x) this.f14983x).b(true);
                    A a = c0344b.a.a();
                    a.f4035e = wVarB.a;
                    A a10 = a.a().a();
                    a10.f4036f = wVarB.f3588b;
                    c0344b = new C0344b(a10.a(), c0344b.f3517b, c0344b.f3518c);
                }
                boolean z10 = str != null;
                U3.c cVar = aVar2.a;
                synchronized (cVar.f4901f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) cVar.f4904i.f13638s).getAndIncrement();
                            if (cVar.f4901f.size() >= cVar.f4900e) {
                                z6 = false;
                            }
                            if (z6) {
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                cVar.f4901f.size();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                cVar.f4902g.execute(new I(cVar, c0344b, taskCompletionSource, 12));
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                taskCompletionSource.d(c0344b);
                            } else {
                                cVar.a();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                ((AtomicInteger) cVar.f4904i.f13639t).getAndIncrement();
                                taskCompletionSource.d(c0344b);
                            }
                        } else {
                            cVar.b(c0344b, taskCompletionSource);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                arrayList2.add(taskCompletionSource.a.d(executorService, new C0187a(this, 12)));
            }
        }
        return Tasks.f(arrayList2);
    }

    public void B(String str, String str2, Bundle bundle) {
        int i10;
        String strEncodeToString;
        int iA;
        PackageInfo packageInfoD;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        D3.g gVar = (D3.g) this.f14978s;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f1050c.f1063b);
        X2.j jVar = (X2.j) this.f14979t;
        synchronized (jVar) {
            try {
                if (jVar.a == 0 && (packageInfoD = jVar.d("com.google.android.gms")) != null) {
                    jVar.a = packageInfoD.versionCode;
                }
                i10 = jVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((X2.j) this.f14979t).a());
        bundle.putString("app_ver_name", ((X2.j) this.f14979t).b());
        D3.g gVar2 = (D3.g) this.f14978s;
        gVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.f1049b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str3 = ((p082i4.a) Tasks.a(((p082i4.c) ((p082i4.d) this.f14983x)).e())).a;
            if (TextUtils.isEmpty(str3)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str3);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) Tasks.a(((p082i4.c) ((p082i4.d) this.f14983x)).d()));
        bundle.putString("cliv", "fcm-24.0.0");
        p053f4.g gVar3 = (p053f4.g) ((p073h4.b) this.f14982w).get();
        p160q4.b bVar = (p160q4.b) ((p073h4.b) this.f14981v).get();
        if (gVar3 == null || bVar == null || (iA = ((p053f4.d) gVar3).a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(p239z.e.d(iA)));
        bundle.putString("Firebase-Client", bVar.a());
    }

    public Task D(String str, String str2, final Bundle bundle) {
        int i10;
        try {
            B(str, str2, bundle);
            final Rpc rpc = (Rpc) this.f14980u;
            zzw zzwVar = rpc.f7778c;
            int iA = zzwVar.a();
            zzy zzyVar = Rpc.j;
            if (iA < 12000000) {
                return zzwVar.b() != 0 ? rpc.a(bundle).e(zzyVar, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzz
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object C(Task task) {
                        Bundle bundle2;
                        Rpc rpc2 = rpc;
                        rpc2.getClass();
                        return (task.k() && (bundle2 = (Bundle) task.g()) != null && bundle2.containsKey("google.messenger")) ? rpc2.a(bundle).l(Rpc.j, new SuccessContinuation() { // from class: com.google.android.gms.cloudmessaging.zzx
                            @Override // com.google.android.gms.tasks.SuccessContinuation
                            public final Task m(Object obj) {
                                Bundle bundle3 = (Bundle) obj;
                                int i11 = Rpc.f7774h;
                                return (bundle3 == null || !bundle3.containsKey("google.messenger")) ? Tasks.e(bundle3) : Tasks.e(null);
                            }
                        }) : task;
                    }
                }) : Tasks.d(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            zzv zzvVarA = zzv.a(rpc.f7777b);
            synchronized (zzvVarA) {
                i10 = zzvVarA.f7811d;
                zzvVarA.f7811d = i10 + 1;
            }
            return zzvVarA.b(new p196u2.c(i10, 1, bundle, 1)).d(zzyVar, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzaa
                @Override // com.google.android.gms.tasks.Continuation
                public final Object C(Task task) throws IOException {
                    if (task.k()) {
                        return (Bundle) task.g();
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        "Error making request: ".concat(String.valueOf(task.f()));
                    }
                    throw new IOException("SERVICE_NOT_AVAILABLE", task.f());
                }
            });
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.d(e10);
        }
    }

    public void E(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.f14981v;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC0889j) list.get(i10)).getClass();
        }
    }

    @Override // p220w9.c
    public List F(q qVar, AbstractC0682k abstractC0682k, int i10) {
        i.f(abstractC0682k, "proto");
        AbstractC0487g.p(i10, "kind");
        if (i10 == 2) {
            return w(qVar, (p047e9.G) abstractC0682k, 1);
        }
        p029c9.n nVarM = m(abstractC0682k, (p067g9.f) qVar.f2573b, (p067g9.g) qVar.f2574c, i10, false);
        return nVarM == null ? p086i8.s.f12328s : l(this, qVar, nVarM, null, false, 60);
    }

    @Override // p220w9.c
    public ArrayList N(p220w9.r rVar) throws InvocationTargetException {
        i.f(rVar, "container");
        M m2 = (M) rVar.f2575d;
        p029c9.m mVar = m2 instanceof p029c9.m ? (p029c9.m) m2 : null;
        Q8.b bVar = mVar != null ? mVar.f7562s : null;
        if (bVar == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + rVar.f15687g.b()).toString());
        }
        ArrayList arrayList = new ArrayList(1);
        Class cls = bVar.a;
        i.f(cls, "klass");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        i.e(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            i.e(annotation, "annotation");
            Class clsO = p068ga.d.o(p068ga.d.l(annotation));
            b1 b1VarU = u(AbstractC0408c.a(clsO), new Q8.a(annotation), arrayList);
            if (b1VarU != null) {
                com.bumptech.glide.e.m(b1VarU, annotation, clsO);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    @Override // p220w9.c
    public List X(q qVar, AbstractC0682k abstractC0682k, int i10, int i11, Z z6) {
        i.f(abstractC0682k, "callableProto");
        AbstractC0487g.p(i10, "kind");
        int i12 = 0;
        p029c9.n nVarM = m(abstractC0682k, (p067g9.f) qVar.f2573b, (p067g9.g) qVar.f2574c, i10, false);
        if (nVarM == null) {
            return p086i8.s.f12328s;
        }
        if (abstractC0682k instanceof C0632y) {
            int i13 = ((C0632y) abstractC0682k).f11244u;
            if ((i13 & 32) == 32 || (i13 & 64) == 64) {
                i12 = 1;
            }
        } else if (abstractC0682k instanceof p047e9.G) {
            int i14 = ((p047e9.G) abstractC0682k).f10799u;
            if ((i14 & 32) == 32 || (i14 & 64) == 64) {
                i12 = 1;
            }
        } else {
            if (!(abstractC0682k instanceof C0620l)) {
                throw new UnsupportedOperationException("Unsupported message: " + abstractC0682k.getClass());
            }
            p220w9.r rVar = (p220w9.r) qVar;
            if (rVar.f15688h == EnumC0617i.ENUM_CLASS) {
                i12 = 2;
            } else if (rVar.f15689i) {
                i12 = 1;
            }
        }
        return l(this, qVar, new p029c9.n(nVarM.a + '@' + (i11 + i12)), null, false, 60);
    }

    @Override // p220w9.c
    public List Z(q qVar, p047e9.G g8) {
        i.f(g8, "proto");
        return w(qVar, g8, 3);
    }

    public InterfaceC0884e f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f14982w;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC0884e interfaceC0884eA = ((AbstractC0883d) list.get(i10)).a(type, annotationArr);
            if (interfaceC0884eA != null) {
                return interfaceC0884eA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0883d) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public Object g() {
        if (!H4.a.class.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(H4.a.class);
        while (!arrayDeque.isEmpty()) {
            Class cls = (Class) arrayDeque.removeFirst();
            if (cls.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls.getName());
                if (cls != H4.a.class) {
                    sb.append(" which is an interface of ");
                    sb.append(H4.a.class.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls.getInterfaces());
        }
        return Proxy.newProxyInstance(H4.a.class.getClassLoader(), new Class[]{H4.a.class}, new ya.M(this));
    }

    public Task j(Task task) {
        return task.d(new G0.b(0), new C0187a(this, 21));
    }

    @Override // p220w9.c
    public ArrayList j0(W w2, p067g9.f fVar) {
        i.f(w2, "proto");
        i.f(fVar, "nameResolver");
        Object objJ = w2.j(h9.k.f11884h);
        i.e(objJ, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<C0615g> iterable = (Iterable) objJ;
        ArrayList arrayList = new ArrayList(p086i8.m.H(iterable, 10));
        for (C0615g c0615g : iterable) {
            i.e(c0615g, "it");
            arrayList.add(((k) this.f14982w).h(c0615g, fVar));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    public List k(q qVar, p029c9.n nVar, boolean z6, boolean z10, Boolean bool, boolean z11) {
        List list;
        Q8.b bVarP = p(qVar, z6, z10, bool, z11);
        if (bVarP == null) {
            if (qVar instanceof p220w9.r) {
                M m2 = (M) ((p220w9.r) qVar).f2575d;
                p029c9.m mVar = m2 instanceof p029c9.m ? (p029c9.m) m2 : null;
                if (mVar != null) {
                    bVarP = mVar.f7562s;
                } else {
                    bVarP = null;
                }
            } else {
                bVarP = null;
            }
        }
        return (bVarP == null || (list = (List) ((p029c9.a) ((p247z9.e) this.f14979t).invoke(bVarP)).a.get(nVar)) == null) ? p086i8.s.f12328s : list;
    }

    @Override // p220w9.c
    public ArrayList k0(p047e9.Q q10, p067g9.f fVar) {
        i.f(q10, "proto");
        i.f(fVar, "nameResolver");
        Object objJ = q10.j(h9.k.f11882f);
        i.e(objJ, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<C0615g> iterable = (Iterable) objJ;
        ArrayList arrayList = new ArrayList(p086i8.m.H(iterable, 10));
        for (C0615g c0615g : iterable) {
            i.e(c0615g, "it");
            arrayList.add(((k) this.f14982w).h(c0615g, fVar));
        }
        return arrayList;
    }

    @Override // p220w9.c
    public List l0(q qVar, p047e9.G g8) {
        i.f(g8, "proto");
        return w(qVar, g8, 2);
    }

    @Override // p220w9.a
    public Object o0(q qVar, p047e9.G g8, AbstractC0151y abstractC0151y) {
        i.f(g8, "proto");
        return v(qVar, g8, 2, abstractC0151y, p029c9.b.f7539u);
    }

    public Q8.b p(q qVar, boolean z6, boolean z10, Boolean bool, boolean z11) {
        p220w9.r rVar;
        i.f(qVar, "container");
        EnumC0617i enumC0617i = EnumC0617i.INTERFACE;
        p040e1.j jVar = (p040e1.j) this.f14978s;
        M m2 = (M) qVar.f2575d;
        if (z6) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + qVar + ')').toString());
            }
            if (qVar instanceof p220w9.r) {
                p220w9.r rVar2 = (p220w9.r) qVar;
                if (rVar2.f15688h == enumC0617i) {
                    return l.d(jVar, rVar2.f15687g.d(f.j("DefaultImpls")), (i9.f) this.f14983x);
                }
            }
            if (bool.booleanValue() && (qVar instanceof p220w9.s)) {
                p029c9.f fVar = m2 instanceof p029c9.f ? (p029c9.f) m2 : null;
                p176r9.b bVar = fVar != null ? fVar.f7550t : null;
                if (bVar != null) {
                    String strE = bVar.e();
                    i.e(strE, "facadeClassName.internalName");
                    return l.d(jVar, p096j9.b.j(new p096j9.c(L9.n.F(strE, '/', '.'))), (i9.f) this.f14983x);
                }
            }
        }
        if (z10 && (qVar instanceof p220w9.r)) {
            p220w9.r rVar3 = (p220w9.r) qVar;
            if (rVar3.f15688h == EnumC0617i.COMPANION_OBJECT && (rVar = rVar3.f15686f) != null) {
                EnumC0617i enumC0617i2 = EnumC0617i.CLASS;
                EnumC0617i enumC0617i3 = rVar.f15688h;
                if (enumC0617i3 == enumC0617i2 || enumC0617i3 == EnumC0617i.ENUM_CLASS || (z11 && (enumC0617i3 == enumC0617i || enumC0617i3 == EnumC0617i.ANNOTATION_CLASS))) {
                    M m10 = (M) rVar.f2575d;
                    p029c9.m mVar = m10 instanceof p029c9.m ? (p029c9.m) m10 : null;
                    if (mVar != null) {
                        return mVar.f7562s;
                    }
                    return null;
                }
            }
        }
        if (!(qVar instanceof p220w9.s) || !(m2 instanceof p029c9.f)) {
            return null;
        }
        i.d(m2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        p029c9.f fVar2 = (p029c9.f) m2;
        Q8.b bVar2 = fVar2.f7551u;
        return bVar2 == null ? l.d(jVar, fVar2.a(), (i9.f) this.f14983x) : bVar2;
    }

    public ColorStateList q(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return J.f.c(context, R.color.abc_tint_edittext);
        }
        if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
            return J.f.c(context, R.color.abc_tint_switch_track);
        }
        if (i10 != R.drawable.abc_switch_thumb_material) {
            if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return i(context, N0.c(context, R.attr.colorButtonNormal));
            }
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return i(context, 0);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return i(context, N0.c(context, R.attr.colorAccent));
            }
            if (i10 == R.drawable.abc_spinner_mtrl_am_alpha || i10 == R.drawable.abc_spinner_textfield_background_material) {
                return J.f.c(context, R.color.abc_tint_spinner);
            }
            if (e((int[]) this.f14979t, i10)) {
                return N0.d(context, R.attr.colorControlNormal);
            }
            if (e((int[]) this.f14982w, i10)) {
                return J.f.c(context, R.color.abc_tint_default);
            }
            if (e((int[]) this.f14983x, i10)) {
                return J.f.c(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return J.f.c(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = N0.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = N0.f13973b;
            iArr2[0] = N0.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = N0.f13976e;
            iArr2[1] = N0.c(context, R.attr.colorControlActivated);
            iArr[2] = N0.f13977f;
            iArr2[2] = N0.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = N0.f13973b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = N0.f13976e;
            iArr2[1] = N0.c(context, R.attr.colorControlActivated);
            iArr[2] = N0.f13977f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public Ca.c r(RecyclerView recyclerView) {
        int i10;
        char c10 = 0;
        int i11 = 2;
        int i12 = 1;
        i.g(recyclerView, "recyclerView");
        HashMap map = (HashMap) this.f14979t;
        Ca.c cVar = (Ca.c) this.f14983x;
        i.g(map, "dataTypeViewHolderMapper");
        Fa.e eVar = cVar.f1027e;
        eVar.getClass();
        eVar.f1662w = map;
        Collection<InterfaceC0175c> collectionValues = map.values();
        i.b(collectionValues, "dataTypeViewHolderMapper.values");
        Fa.d dVar = (Fa.d) eVar.f1661v;
        dVar.getClass();
        for (InterfaceC0175c interfaceC0175c : collectionValues) {
            dVar.getClass();
            i.g(interfaceC0175c, "smartViewHolderClass");
            HashMap map2 = dVar.a;
            if (map2.containsKey(interfaceC0175c)) {
                i10 = i12;
            } else {
                v vVar = u.a;
                InterfaceC0175c interfaceC0175cB = vVar.b(View.class);
                InterfaceC0175c interfaceC0175cB2 = vVar.b(ViewGroup.class);
                InterfaceC0175c[] interfaceC0175cArr = new InterfaceC0175c[i11];
                interfaceC0175cArr[c10] = interfaceC0175cB;
                interfaceC0175cArr[i12] = interfaceC0175cB2;
                Iterator it = interfaceC0175c.n().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        throw new ConstructorNotFoundException("Constructor for '" + interfaceC0175c.getClass() + "' with only one valid parameter '" + View.class.getName() + "' or '" + ViewGroup.class.getName() + "' not found");
                    }
                    InterfaceC0178f interfaceC0178f = (InterfaceC0178f) it.next();
                    boolean zR = interfaceC0175c.r();
                    i10 = i12;
                    if (interfaceC0178f.u().size() == (zR ? 1 : 0) + 1) {
                        C8.l lVar = (C8.l) interfaceC0178f.u().get(zR ? 1 : 0);
                        int i13 = 0;
                        while (i13 < i11) {
                            if (i.a(interfaceC0175cArr[i13], o1.f.j(((U) lVar).c()))) {
                                map2.put(interfaceC0175c, interfaceC0178f);
                                break;
                            }
                            i13++;
                            i11 = 2;
                        }
                    }
                    i12 = i10;
                    i11 = 2;
                }
            }
            i12 = i10;
            c10 = 0;
            i11 = 2;
        }
        int i14 = i12;
        HashMap map3 = (HashMap) this.f14980u;
        i.g(map3, "smartRecyclerAdapterMapper");
        Fa.e eVar2 = cVar.f1027e;
        eVar2.getClass();
        eVar2.f1663x = map3;
        k kVar = (k) this.f14981v;
        i.g(kVar, "<set-?>");
        cVar.f1028f = kVar;
        recyclerView.setAdapter(cVar);
        i.b(recyclerView.getContext(), "recyclerView.context");
        if (((LinearLayoutManager) this.f14978s) == null) {
            this.f14978s = new LinearLayoutManager(i14);
        }
        androidx.recyclerview.widget.w wVar = (LinearLayoutManager) this.f14978s;
        if (wVar == null) {
            i.l();
            throw null;
        }
        recyclerView.setLayoutManager(wVar);
        Ea.a aVar = (Ea.a) this.f14982w;
        aVar.getClass();
        Iterator it2 = aVar.a.iterator();
        if (it2.hasNext()) {
            throw E0.a.e(it2);
        }
        return cVar;
    }

    public boolean s(p096j9.b bVar) {
        if (bVar.f() != null && i.a(bVar.i().g(), "Container")) {
            Q8.b bVarD = l.d((p040e1.j) this.f14978s, bVar, (i9.f) this.f14983x);
            if (bVarD != null) {
                LinkedHashSet linkedHashSet = H8.a.a;
                Class cls = bVarD.a;
                i.f(cls, "klass");
                Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
                i.e(declaredAnnotations, "klass.declaredAnnotations");
                boolean z6 = false;
                for (Annotation annotation : declaredAnnotations) {
                    i.e(annotation, "annotation");
                    if (AbstractC0408c.a(p068ga.d.o(p068ga.d.l(annotation))).equals(U8.w.f4993b)) {
                        z6 = true;
                    }
                }
                if (z6) {
                    return true;
                }
            }
        }
        return false;
    }

    public b1 t(p096j9.b bVar, M m2, List list) {
        i.f(list, "result");
        return new b1(this, AbstractC0287v.f((O8.C) this.f14980u, bVar, (p140o4.r) this.f14981v), bVar, list, m2);
    }

    @Override // p220w9.c
    public List t0(q qVar, AbstractC0682k abstractC0682k, int i10) {
        i.f(abstractC0682k, "proto");
        AbstractC0487g.p(i10, "kind");
        p029c9.n nVarM = m(abstractC0682k, (p067g9.f) qVar.f2573b, (p067g9.g) qVar.f2574c, i10, false);
        return nVarM != null ? l(this, qVar, new p029c9.n(E0.a.l(new StringBuilder(), nVarM.a, "@0")), null, false, 60) : p086i8.s.f12328s;
    }

    public b1 u(p096j9.b bVar, Q8.a aVar, List list) {
        i.f(list, "result");
        if (H8.a.a.contains(bVar)) {
            return null;
        }
        return t(bVar, aVar, list);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    public Object v(q qVar, p047e9.G g8, int i10, AbstractC0151y abstractC0151y, p200u8.c cVar) {
        Object objInvoke;
        Q8.b bVarP = p(qVar, true, true, p067g9.e.f11549A.c(g8.f10800v), i9.h.d(g8));
        if (bVarP == null) {
            if (qVar instanceof p220w9.r) {
                M m2 = (M) ((p220w9.r) qVar).f2575d;
                p029c9.m mVar = m2 instanceof p029c9.m ? (p029c9.m) m2 : null;
                if (mVar != null) {
                    bVarP = mVar.f7562s;
                } else {
                    bVarP = null;
                }
            } else {
                bVarP = null;
            }
        }
        if (bVarP != null) {
            i9.f fVar = (i9.f) bVarP.f4340b.f667d;
            i9.f fVar2 = p029c9.d.f7545e;
            i.f(fVar2, MediationMetaData.KEY_VERSION);
            p029c9.n nVarM = m(g8, (p067g9.f) qVar.f2573b, (p067g9.g) qVar.f2574c, i10, fVar.a(fVar2.f11543b, fVar2.f11544c, fVar2.f11545d));
            if (nVarM != null && (objInvoke = cVar.invoke(((p247z9.e) this.f14979t).invoke(bVarP), nVarM)) != null) {
                if (I8.s.a(abstractC0151y)) {
                    objInvoke = (g) objInvoke;
                    if (objInvoke instanceof p145o9.d) {
                        return new p145o9.x(((Number) ((p145o9.d) objInvoke).a).byteValue());
                    }
                    if (objInvoke instanceof p145o9.u) {
                        return new p145o9.x(((Number) ((p145o9.u) objInvoke).a).shortValue());
                    }
                    if (objInvoke instanceof p145o9.k) {
                        return new p145o9.x(((Number) ((p145o9.k) objInvoke).a).intValue());
                    }
                    if (objInvoke instanceof p145o9.s) {
                        return new p145o9.x(((Number) ((p145o9.s) objInvoke).a).longValue());
                    }
                }
                return objInvoke;
            }
        }
        return null;
    }

    public List w(q qVar, p047e9.G g8, int i10) {
        Boolean boolC = p067g9.e.f11549A.c(g8.f10800v);
        boolean zD = i9.h.d(g8);
        p086i8.s sVar = p086i8.s.f12328s;
        p067g9.g gVar = (p067g9.g) qVar.f2574c;
        p067g9.f fVar = (p067g9.f) qVar.f2573b;
        if (i10 == 1) {
            p029c9.n nVarN = C.n(g8, fVar, gVar, (40 & 8) == 0, (40 & 16) == 0, true);
            if (nVarN != null) {
                return l(this, qVar, nVarN, boolC, zD, 8);
            }
        } else {
            p029c9.n nVarN2 = C.n(g8, fVar, gVar, (40 & 8) == 0, (40 & 16) == 0, true);
            if (nVarN2 != null) {
                if (L9.f.J(nVarN2.a, "$delegate", false) == (i10 == 3)) {
                    return k(qVar, nVarN2, true, true, boolC, zD);
                }
            }
        }
        return sVar;
    }

    public void x(InterfaceC0175c interfaceC0175c, InterfaceC0175c interfaceC0175c2) {
        i.g(interfaceC0175c, "itemType");
        i.g(interfaceC0175c2, "viewHolderType");
        ((HashMap) this.f14979t).put(com.bumptech.glide.e.h(interfaceC0175c), interfaceC0175c2);
    }

    @Override // p220w9.c
    public List x0(q qVar, C0627t c0627t) {
        i.f(qVar, "container");
        String string = ((p067g9.f) qVar.f2573b).getString(c0627t.f11185v);
        String strB = i9.b.b(((p220w9.r) qVar).f15687g.c());
        i.f(strB, "desc");
        return l(this, qVar, new p029c9.n(string + '#' + strB), null, false, 60);
    }

    public InterfaceC0890k y(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.f14981v;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC0890k interfaceC0890kA = ((AbstractC0889j) list.get(i10)).a(type);
            if (interfaceC0890kA != null) {
                return interfaceC0890kA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0889j) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // p220w9.a
    public Object y0(q qVar, p047e9.G g8, AbstractC0151y abstractC0151y) {
        i.f(g8, "proto");
        return v(qVar, g8, 3, abstractC0151y, p029c9.b.f7538t);
    }

    public InterfaceC0890k z(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f14981v;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC0890k interfaceC0890kB = ((AbstractC0889j) list.get(i10)).b(type, annotationArr, this);
            if (interfaceC0890kB != null) {
                return interfaceC0890kB;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0889j) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public G(String str, String str2, String str3, T3.c cVar, p140o4.r rVar) {
        this.f14978s = str;
        this.f14979t = str2;
        this.f14980u = str3;
        this.f14981v = cVar;
        this.f14982w = rVar;
        this.f14983x = new Fa.d(2);
    }

    public G(E e10, D d3, p053f4.e eVar) {
        this.f14978s = e10;
        this.f14979t = d3;
        this.f14980u = eVar;
        this.f14981v = D3.b.s(new p002a2.b(this, 1));
        this.f14982w = D3.b.s(new p002a2.b(this, 0));
        this.f14983x = D3.b.s(new p002a2.b(this, 2));
    }

    public G(Ca.c cVar) {
        this.f14983x = cVar;
        this.f14979t = new HashMap();
        this.f14980u = new HashMap();
        this.f14981v = new k(3);
        this.f14982w = new Ea.a(0, false);
    }

    public G(O8.C c10, p140o4.r rVar, p247z9.l lVar, p040e1.j jVar) {
        this.f14978s = jVar;
        this.f14979t = lVar.b(new A0.m(this, 28));
        this.f14980u = c10;
        this.f14981v = rVar;
        this.f14982w = new k((InterfaceC0290y) c10, rVar);
        this.f14983x = i9.f.f12337g;
    }

    public G() {
        this.f14978s = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f14979t = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f14980u = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f14981v = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f14982w = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f14983x = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public G(InterfaceC0463i interfaceC0463i, y yVar, List list, List list2, Executor executor) {
        this.f14978s = new ConcurrentHashMap();
        this.f14979t = interfaceC0463i;
        this.f14980u = yVar;
        this.f14981v = list;
        this.f14982w = list2;
        this.f14983x = executor;
    }

    public G(D3.g gVar, X2.j jVar, p073h4.b bVar, p073h4.b bVar2, p082i4.d dVar) {
        gVar.a();
        Rpc rpc = new Rpc(gVar.a);
        this.f14978s = gVar;
        this.f14979t = jVar;
        this.f14980u = rpc;
        this.f14981v = bVar;
        this.f14982w = bVar2;
        this.f14983x = dVar;
    }

    public G(p010aa.c cVar) {
        i.f(cVar, "taskRunner");
        this.f14979t = cVar;
        this.f14983x = p048ea.h.a;
    }
}
