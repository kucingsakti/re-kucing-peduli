package com.google.android.gms.internal.measurement;

import A1.C0098g;
import B4.C0154b;
import B4.C0161i;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.UserManager;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.webkit.WebView;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.common.api.internal.zaad;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zziv;
import com.google.android.gms.measurement.internal.zzmu;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import org.chromium.net.UrlRequest;
import org.xmlpull.v1.XmlPullParserException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0682k;
import p104k9.C0679h;
import p188t1.EnumC0840c;

/* JADX INFO: loaded from: classes.dex */
public final class S implements Q, com.bumptech.glide.load.data.d, H1.n, SuccessContinuation, J7.i, InterfaceC0578k, k2.b, OnCompleteListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static S f8357v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f8358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f8359t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f8360u;

    public /* synthetic */ S(int i10, boolean z6) {
        this.f8358s = i10;
    }

    public static synchronized void z() {
        Context context;
        try {
            S s9 = f8357v;
            if (s9 != null && (context = (Context) s9.f8359t) != null && ((T) s9.f8360u) != null) {
                context.getContentResolver().unregisterContentObserver((T) f8357v.f8360u);
            }
            f8357v = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // J7.i
    public void a() {
        ((J7.i) this.f8360u).a();
    }

    @Override // J7.i
    public void b(L7.b bVar) {
        O7.b.i((R7.a) this.f8359t, bVar);
    }

    @Override // J7.i
    public void c(Object obj) {
        ((J7.i) this.f8360u).c(obj);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void d(Task task) {
        ((zaad) this.f8360u).f7935b.remove((TaskCompletionSource) this.f8359t);
    }

    @Override // H1.n
    public void e(B1.b bVar, Bitmap bitmap) throws IOException {
        IOException iOException = ((U1.e) this.f8360u).f4872t;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            bVar.h(bitmap);
            throw iOException;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void f(Exception exc) {
        A1.K k3 = (A1.K) this.f8360u;
        E1.q qVar = (E1.q) this.f8359t;
        E1.q qVar2 = k3.f82x;
        if (qVar2 == null || qVar2 != qVar) {
            return;
        }
        A1.K k10 = (A1.K) this.f8360u;
        E1.q qVar3 = (E1.q) this.f8359t;
        A1.n nVar = k10.f78t;
        C0098g c0098g = k10.f83y;
        com.bumptech.glide.load.data.e eVar = qVar3.f1326c;
        nVar.k(c0098g, exc, eVar, eVar.c());
    }

    @Override // com.bumptech.glide.load.data.d
    public void g(Object obj) {
        A1.K k3 = (A1.K) this.f8360u;
        E1.q qVar = (E1.q) this.f8359t;
        E1.q qVar2 = k3.f82x;
        if (qVar2 == null || qVar2 != qVar) {
            return;
        }
        A1.K k10 = (A1.K) this.f8360u;
        E1.q qVar3 = (E1.q) this.f8359t;
        A1.p pVar = k10.f77s.f119p;
        if (obj != null && pVar.a(qVar3.f1326c.c())) {
            k10.f81w = obj;
            k10.f78t.x(2);
        } else {
            A1.n nVar = k10.f78t;
            p232y1.e eVar = qVar3.a;
            com.bumptech.glide.load.data.e eVar2 = qVar3.f1326c;
            nVar.f(eVar, obj, eVar2, eVar2.c(), k10.f83y);
        }
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new p148p2.g(new p053f4.e(26), new K3.d(26), p148p2.a.f14201f, (p148p2.i) ((p090j2.e) this.f8359t).get(), (Provider) this.f8360u);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0578k
    public zzh h(zzaq zzaqVar) {
        zzh zzhVarD = ((zzh) this.f8359t).d();
        zzhVarD.e((String) this.f8360u, zzaqVar);
        return zzhVarD;
    }

    @Override // H1.n
    public void i() {
        H1.w wVar = (H1.w) this.f8359t;
        synchronized (wVar) {
            wVar.f1905u = wVar.f1903s.length;
        }
    }

    public void j(EnumC0840c enumC0840c, boolean z6) {
        int i10 = enumC0840c.f15026s;
        int i11 = enumC0840c.f15027t;
        byte[] bArr = (byte[]) this.f8359t;
        if (z6) {
            bArr[i10] = (byte) ((1 << i11) | bArr[i10]);
        } else {
            bArr[i10] = (byte) ((~(1 << i11)) & bArr[i10]);
        }
        p188t1.N n10 = (p188t1.N) this.f8360u;
        n10.getClass();
        n10.f(p086i8.C.a(p086i8.C.c("066EB5CE19")), Base64.encodeToString(bArr, 2));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0057 A[Catch: all -> 0x001b, TryCatch #2 {all -> 0x001b, blocks: (B:11:0x0015, B:13:0x0019, B:20:0x0023, B:22:0x0027, B:23:0x0031, B:26:0x0036, B:28:0x003c, B:35:0x0057, B:37:0x005b, B:38:0x005d, B:32:0x0048), top: B:60:0x0015, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x005b A[Catch: all -> 0x001b, TryCatch #2 {all -> 0x001b, blocks: (B:11:0x0015, B:13:0x0019, B:20:0x0023, B:22:0x0027, B:23:0x0031, B:26:0x0036, B:28:0x003c, B:35:0x0057, B:37:0x005b, B:38:0x005d, B:32:0x0048), top: B:60:0x0015, inners: #4 }] */
    @Override // com.google.android.gms.internal.measurement.Q
    public Object k(String str) {
        Object objA;
        Context context = (Context) this.f8359t;
        if (context == null) {
            return null;
        }
        if (zzgi.a()) {
            boolean z6 = true;
            if (!zzgi.f8639b) {
                synchronized (zzgi.class) {
                    try {
                        if (!zzgi.f8639b) {
                            int i10 = 1;
                            while (true) {
                                if (i10 <= 2) {
                                    if (zzgi.a == null) {
                                        zzgi.a = (UserManager) context.getSystemService(UserManager.class);
                                    }
                                    UserManager userManager = zzgi.a;
                                    if (userManager != null) {
                                        try {
                                            if (!userManager.isUserUnlocked() && userManager.isUserRunning(Process.myUserHandle())) {
                                            }
                                            if (z6) {
                                                zzgi.a = null;
                                            }
                                        } catch (NullPointerException e10) {
                                            Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                                            zzgi.a = null;
                                            i10++;
                                        }
                                    }
                                    if (z6) {
                                        zzgi.f8639b = z6;
                                    }
                                }
                                z6 = false;
                                if (z6) {
                                    zzgi.a = null;
                                }
                                if (z6) {
                                    zzgi.f8639b = z6;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (!z6) {
                return null;
            }
        }
        try {
            zzgr zzgrVar = new zzgr();
            zzgrVar.a = this;
            zzgrVar.f8649b = str;
            try {
                objA = zzgrVar.a();
            } catch (SecurityException unused) {
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    objA = zzgrVar.a();
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
            return (String) objA;
        } catch (IllegalStateException | NullPointerException | SecurityException unused2) {
            return null;
        }
    }

    public void l(String str) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            ((Handler) this.f8360u).post(new C3.c(this, str, 2, false));
        } else {
            ((WebView) this.f8359t).evaluateJavascript(str, new C0161i(1));
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task m(Object obj) {
        if (((V3.a) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.e(null);
        }
        o1.c cVar = (o1.c) ((M2.I) this.f8360u).f2910t;
        O3.o.b((O3.o) cVar.f13624u);
        ((O3.o) cVar.f13624u).f3553m.A(null, (ExecutorService) this.f8359t);
        ((O3.o) cVar.f13624u).f3557q.d(null);
        return Tasks.e(null);
    }

    public boolean n(o1.i iVar) {
        boolean zContainsKey;
        synchronized (this.f8359t) {
            zContainsKey = ((LinkedHashMap) this.f8360u).containsKey(iVar);
        }
        return zContainsKey;
    }

    public View o(int i10, int i11, int i12, int i13) {
        J0.O o10 = (J0.O) this.f8359t;
        int iW = o10.w();
        int i14 = o10.i();
        int i15 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewV = o10.v(i10);
            int iN = o10.n(viewV);
            int iY = o10.y(viewV);
            J0.N n10 = (J0.N) this.f8360u;
            n10.f2261b = iW;
            n10.f2262c = i14;
            n10.f2263d = iN;
            n10.f2264e = iY;
            if (i12 != 0) {
                n10.a = i12;
                if (n10.a()) {
                    return viewV;
                }
            }
            if (i13 != 0) {
                n10.a = i13;
                if (n10.a()) {
                    view = viewV;
                }
            }
            i10 += i15;
        }
        return view;
    }

    @Override // J7.i
    public void onError(Throwable th) {
        ((J7.i) this.f8360u).onError(th);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    public CctBackendFactory p(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.f8360u) == null) {
            Context context = (Context) this.f8359t;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.f8360u = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r7.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.f8360u = map;
        }
        String str4 = (String) ((Map) this.f8360u).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e10) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e10);
            return null;
        } catch (IllegalAccessException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
            return null;
        } catch (InstantiationException e12) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e12);
            return null;
        } catch (NoSuchMethodException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        } catch (InvocationTargetException e14) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e14);
            return null;
        }
    }

    public synchronized List q(String str) {
        List arrayList;
        if (!((ArrayList) this.f8359t).contains(str)) {
            ((ArrayList) this.f8359t).add(str);
        }
        arrayList = (List) ((HashMap) this.f8360u).get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((HashMap) this.f8360u).put(str, arrayList);
        }
        return arrayList;
    }

    public synchronized ArrayList r(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f8359t).iterator();
        while (it.hasNext()) {
            List<P1.c> list = (List) ((HashMap) this.f8360u).get((String) it.next());
            if (list != null) {
                for (P1.c cVar : list) {
                    if ((cVar.a.isAssignableFrom(cls) && cls2.isAssignableFrom(cVar.f3835b)) && !arrayList.contains(cVar.f3835b)) {
                        arrayList.add(cVar.f3835b);
                    }
                }
            }
        }
        return arrayList;
    }

    public boolean s(View view) {
        J0.O o10 = (J0.O) this.f8359t;
        int iW = o10.w();
        int i10 = o10.i();
        int iN = o10.n(view);
        int iY = o10.y(view);
        J0.N n10 = (J0.N) this.f8360u;
        n10.f2261b = iW;
        n10.f2262c = i10;
        n10.f2263d = iN;
        n10.f2264e = iY;
        n10.a = 24579;
        return n10.a();
    }

    public void t(Throwable th) {
        zziv zzivVar = (zziv) this.f8360u;
        zzivVar.W0();
        zzivVar.f9191A = false;
        com.google.android.gms.measurement.internal.zzhj zzhjVar = (com.google.android.gms.measurement.internal.zzhj) zzivVar.f577s;
        if (!zzhjVar.f9146y.h1(null, zzbf.f8938F0)) {
            zzivVar.x1();
            zzivVar.i().f9056x.a(th, "registerTriggerAsync failed with throwable");
            return;
        }
        zzivVar.s1().add((zzmu) this.f8359t);
        if (zzivVar.f9192B > 64) {
            zzivVar.f9192B = 1;
            zzivVar.i().f9047A.c("registerTriggerAsync failed. May try later. App ID, throwable", zzfw.a1(zzhjVar.o().d1()), zzfw.a1(th.toString()));
            return;
        }
        zzivVar.i().f9047A.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", zzfw.a1(zzhjVar.o().d1()), zzfw.a1(String.valueOf(zzivVar.f9192B)), zzfw.a1(th.toString()));
        int i10 = zzivVar.f9192B;
        if (zzivVar.f9193C == null) {
            zzivVar.f9193C = new M2.Q(zzivVar, zzhjVar, 0);
        }
        zzivVar.f9193C.b(i10 * 1000);
        zzivVar.f9192B <<= 1;
    }

    public String toString() {
        switch (this.f8358s) {
            case MobileAdsBridge.CODE_21 /* 21 */:
                String string = "[ ";
                if (((p239z.f) this.f8359t) != null) {
                    for (int i10 = 0; i10 < 9; i10++) {
                        StringBuilder sbC = p239z.e.c(string);
                        sbC.append(((p239z.f) this.f8359t).f16293z[i10]);
                        sbC.append(" ");
                        string = sbC.toString();
                    }
                }
                return string + "] " + ((p239z.f) this.f8359t);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x012e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void u(Context context, XmlResourceParser xmlResourceParser) {
        byte b3;
        E.o oVar = new E.o();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlResourceParser.getAttributeName(i10);
            String attributeValue = xmlResourceParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    E.j jVarD = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            switch (xmlResourceParser.getName()) {
                                case "Constraint":
                                    jVarD = E.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case "ConstraintOverride":
                                    jVarD = E.o.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case "Guideline":
                                    jVarD = E.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    jVarD.f1183d.a = true;
                                    break;
                                case "Barrier":
                                    jVarD = E.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    jVarD.f1183d.f1224h0 = 1;
                                    break;
                                case "PropertySet":
                                    if (jVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVarD.f1181b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "Transform":
                                    if (jVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVarD.f1184e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "Layout":
                                    if (jVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVarD.f1183d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "Motion":
                                    if (jVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVarD.f1182c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "CustomAttribute":
                                case "CustomMethod":
                                    if (jVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    E.b.a(context, xmlResourceParser, jVarD.f1185f);
                                    break;
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        b3 = 3;
                                    } else {
                                        b3 = -1;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        b3 = 1;
                                    } else {
                                        b3 = -1;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        b3 = 2;
                                    } else {
                                        b3 = -1;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        b3 = 0;
                                    } else {
                                        b3 = -1;
                                    }
                                    break;
                                default:
                                    b3 = -1;
                                    break;
                            }
                            if (b3 == 0) {
                                ((SparseArray) this.f8360u).put(identifier, oVar);
                                return;
                            } else if (b3 == 1 || b3 == 2 || b3 == 3) {
                                oVar.f1276c.put(Integer.valueOf(jVarD.a), jVarD);
                                jVarD = null;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException | XmlPullParserException unused) {
                }
                ((SparseArray) this.f8360u).put(identifier, oVar);
                return;
            }
        }
    }

    public p061g1.i v(o1.i iVar) {
        p061g1.i iVar2;
        synchronized (this.f8359t) {
            iVar2 = (p061g1.i) ((LinkedHashMap) this.f8360u).remove(iVar);
        }
        return iVar2;
    }

    public List w(String str) {
        List listS0;
        p210v8.i.f(str, "workSpecId");
        synchronized (this.f8359t) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f8360u;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (p210v8.i.a(((o1.i) entry.getKey()).a, str)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f8360u).remove((o1.i) it.next());
                }
                listS0 = p086i8.k.s0(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listS0;
    }

    public p061g1.i x(o1.i iVar) {
        p061g1.i iVar2;
        synchronized (this.f8359t) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f8360u;
                Object iVar3 = linkedHashMap.get(iVar);
                if (iVar3 == null) {
                    iVar3 = new p061g1.i(iVar);
                    linkedHashMap.put(iVar, iVar3);
                }
                iVar2 = (p061g1.i) iVar3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar2;
    }

    public void y(int i10, C0154b c0154b) throws IOException {
        while (true) {
            Map.Entry entry = (Map.Entry) this.f8360u;
            if (entry == null || ((p104k9.l) entry.getKey()).f12812s >= i10) {
                return;
            }
            p104k9.l lVar = (p104k9.l) ((Map.Entry) this.f8360u).getKey();
            Object value = ((Map.Entry) this.f8360u).getValue();
            C0679h c0679h = C0679h.f12806c;
            p104k9.J j = lVar.f12813t;
            boolean z6 = lVar.f12814u;
            int i11 = lVar.f12812s;
            if (z6) {
                for (Object obj : (List) value) {
                    if (j == p104k9.J.f12772w) {
                        c0154b.x(i11, 3);
                        ((AbstractC0672a) obj).e(c0154b);
                        c0154b.x(i11, 4);
                    } else {
                        c0154b.x(i11, j.f12777t);
                        C0679h.k(c0154b, j, obj);
                    }
                }
            } else if (j == p104k9.J.f12772w) {
                c0154b.x(i11, 3);
                ((AbstractC0672a) value).e(c0154b);
                c0154b.x(i11, 4);
            } else {
                c0154b.x(i11, j.f12777t);
                C0679h.k(c0154b, j, value);
            }
            Iterator it = (Iterator) this.f8359t;
            if (it.hasNext()) {
                this.f8360u = (Map.Entry) it.next();
            } else {
                this.f8360u = null;
            }
        }
    }

    public /* synthetic */ S(Object obj, int i10, Object obj2) {
        this.f8358s = i10;
        this.f8360u = obj;
        this.f8359t = obj2;
    }

    public /* synthetic */ S(Object obj, Object obj2, int i10, boolean z6) {
        this.f8358s = i10;
        this.f8359t = obj;
        this.f8360u = obj2;
    }

    public S(p188t1.N n10) {
        byte[] bArrDecode;
        this.f8358s = 18;
        this.f8360u = n10;
        n10.getClass();
        if (!n10.g(p086i8.C.a(p086i8.C.c("066EB5CE19")))) {
            bArrDecode = new byte[2];
        } else {
            bArrDecode = Base64.decode(n10.e(p086i8.C.a(p086i8.C.c("066EB5CE19"))), 2);
        }
        this.f8359t = bArrDecode;
    }

    public S(int i10) {
        this.f8358s = i10;
        switch (i10) {
            case 9:
                this.f8359t = new ArrayList();
                this.f8360u = new HashMap();
                break;
            case 10:
                this.f8359t = new Rect();
                this.f8360u = new Rect();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                this.f8359t = new Object();
                this.f8360u = new LinkedHashMap();
                break;
            default:
                this.f8359t = null;
                this.f8360u = null;
                break;
        }
    }

    public S(Context context, int i10) {
        this.f8358s = i10;
        switch (i10) {
            case 15:
                this.f8360u = null;
                this.f8359t = context;
                break;
            default:
                this.f8359t = context;
                T t7 = new T(null);
                this.f8360u = t7;
                context.getContentResolver().registerContentObserver(zzfy.a, true, t7);
                break;
        }
    }

    public S(p239z.d dVar) {
        this.f8358s = 21;
        this.f8360u = dVar;
    }

    public S(o1.c cVar) {
        this.f8358s = 6;
        int iE = O3.g.e((Context) cVar.f13623t, "com.google.firebase.crashlytics.unity_version", "string");
        Context context = (Context) cVar.f13623t;
        if (iE != 0) {
            this.f8359t = "Unity";
            this.f8360u = context.getResources().getString(iE);
            Log.isLoggable("FirebaseCrashlytics", 2);
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f8359t = "Flutter";
                this.f8360u = null;
                Log.isLoggable("FirebaseCrashlytics", 2);
                return;
            } catch (IOException unused) {
            }
        }
        this.f8359t = null;
        this.f8360u = null;
    }

    public S(J0.O o10) {
        this.f8358s = 5;
        this.f8359t = o10;
        J0.N n10 = new J0.N();
        n10.a = 0;
        this.f8360u = n10;
    }

    public S(AbstractC0682k abstractC0682k) {
        this.f8358s = 16;
        C0679h c0679h = abstractC0682k.f12811s;
        c0679h.getClass();
        Iterator it = ((androidx.datastore.preferences.protobuf.i0) c0679h.a.entrySet()).iterator();
        this.f8359t = it;
        if (it.hasNext()) {
            this.f8360u = (Map.Entry) it.next();
        }
    }
}
