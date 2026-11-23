package Fa;

import D3.g;
import I3.j;
import I3.p;
import I3.q;
import L9.n;
import X9.E;
import X9.G;
import X9.J;
import X9.w;
import X9.x;
import X9.y;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.components.DependencyException;
import com.kcstream.cing.R;
import com.tonyodev.fetch2core.Extras;
import com.unity3d.ads.metadata.MediationMetaData;
import g2.c;
import i2.h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.logging.Logger;
import javax.inject.Provider;
import p.b1;
import p029c9.k;
import p029c9.l;
import p086i8.C;
import p086i8.t;
import p090j2.f;
import p210v8.i;
import ya.C0881b;
import ya.C0888i;
import ya.C0892m;
import ya.H;
import ya.u;

/* JADX INFO: loaded from: classes.dex */
public final class e implements I3.c, k, k2.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1658s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f1659t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f1660u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f1661v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f1662w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f1663x;

    public /* synthetic */ e(ViewGroup viewGroup, ImageView imageView, View view, View view2, ViewGroup viewGroup2, ViewGroup viewGroup3, int i10) {
        this.f1658s = i10;
        this.f1659t = imageView;
        this.f1660u = view;
        this.f1661v = view2;
        this.f1662w = viewGroup2;
        this.f1663x = viewGroup3;
    }

    public static e i(View view) {
        int i10 = R.id.itemDate;
        MaterialTextView materialTextView = (MaterialTextView) oa.b.c(view, R.id.itemDate);
        if (materialTextView != null) {
            i10 = R.id.itemImage;
            ImageView imageView = (ImageView) oa.b.c(view, R.id.itemImage);
            if (imageView != null) {
                i10 = R.id.itemPath;
                MaterialTextView materialTextView2 = (MaterialTextView) oa.b.c(view, R.id.itemPath);
                if (materialTextView2 != null) {
                    i10 = R.id.itemSize;
                    MaterialTextView materialTextView3 = (MaterialTextView) oa.b.c(view, R.id.itemSize);
                    if (materialTextView3 != null) {
                        i10 = R.id.itemTitle;
                        MaterialTextView materialTextView4 = (MaterialTextView) oa.b.c(view, R.id.itemTitle);
                        if (materialTextView4 != null) {
                            return new e(materialTextView, imageView, materialTextView2, materialTextView3, materialTextView4, 7);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static e l(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        e eVar = new e(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) eVar.f1662w)) {
            try {
                ((ArrayDeque) eVar.f1662w).clear();
                String string = ((SharedPreferences) eVar.f1659t).getString((String) eVar.f1660u, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) eVar.f1661v)) {
                    String[] strArrSplit = string.split((String) eVar.f1661v, -1);
                    int length = strArrSplit.length;
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) eVar.f1662w).add(str);
                        }
                    }
                    return eVar;
                }
                return eVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void A(Class cls, Object obj) {
        i.f(cls, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        if (obj == null) {
            ((LinkedHashMap) this.f1663x).remove(cls);
            return;
        }
        if (((LinkedHashMap) this.f1663x).isEmpty()) {
            this.f1663x = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1663x;
        Object objCast = cls.cast(obj);
        i.c(objCast);
        linkedHashMap.put(cls, objCast);
    }

    public void B(String str) {
        i.f(str, "url");
        if (n.I(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            i.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            str = i.k(strSubstring, "http:");
        } else if (n.I(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            i.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            str = i.k(strSubstring2, "https:");
        }
        i.f(str, "<this>");
        x xVar = new x();
        xVar.c(null, str);
        this.f1659t = xVar.a();
    }

    @Override // I3.c
    public Object a(Class cls) {
        if (!((Set) this.f1659t).contains(p.a(cls))) {
            throw new DependencyException("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objA = ((I3.c) this.f1663x).a(cls);
        if (!cls.equals(p042e4.b.class)) {
            return objA;
        }
        return new q();
    }

    @Override // I3.c
    public Object b(p pVar) {
        if (((Set) this.f1659t).contains(pVar)) {
            return ((I3.c) this.f1663x).b(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + pVar + ".");
    }

    @Override // I3.c
    public Set c(p pVar) {
        if (((Set) this.f1662w).contains(pVar)) {
            return ((I3.c) this.f1663x).c(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Set<" + pVar + ">.");
    }

    @Override // I3.c
    public p073h4.b d(Class cls) {
        return f(p.a(cls));
    }

    @Override // I3.c
    public I3.n e(p pVar) {
        if (((Set) this.f1661v).contains(pVar)) {
            return ((I3.c) this.f1663x).e(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Deferred<" + pVar + ">.");
    }

    @Override // I3.c
    public p073h4.b f(p pVar) {
        if (((Set) this.f1660u).contains(pVar)) {
            return ((I3.c) this.f1663x).f(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<" + pVar + ">.");
    }

    public void g(String str, String str2) {
        i.f(str, MediationMetaData.KEY_NAME);
        i.f(str2, "value");
        ((M1.c) this.f1661v).a(str, str2);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new p128n2.c((Executor) ((Provider) this.f1659t).get(), (f) ((Provider) this.f1660u).get(), (p138o2.c) ((Y1.c) this.f1661v).get(), (p148p2.d) ((Provider) this.f1662w).get(), (p158q2.b) ((Provider) this.f1663x).get());
    }

    public void h(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        x xVar = new x();
        xVar.c(null, str);
        y yVarA = xVar.a();
        ArrayList arrayList = yVarA.f5660f;
        if ("".equals(arrayList.get(arrayList.size() - 1))) {
            this.f1661v = yVarA;
        } else {
            throw new IllegalArgumentException("baseUrl must end in /: " + yVarA);
        }
    }

    public G j() {
        Map mapUnmodifiableMap;
        y yVar = (y) this.f1659t;
        if (yVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f1660u;
        w wVarD = ((M1.c) this.f1661v).d();
        J j = (J) this.f1662w;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1663x;
        byte[] bArr = Y9.c.a;
        i.f(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = t.f12329s;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            i.e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new G(yVar, str, wVarD, j, mapUnmodifiableMap);
    }

    public p188t1.G k() {
        int i10 = 0;
        if (((y) this.f1661v) == null) {
            throw new IllegalStateException("Base URL required.");
        }
        E e10 = (E) this.f1660u;
        if (e10 == null) {
            e10 = new E();
        }
        E e11 = e10;
        H h10 = (H) this.f1659t;
        Executor executorA = h10.a();
        ArrayList arrayList = new ArrayList((ArrayList) this.f1663x);
        C0892m c0892m = new C0892m(executorA, i10);
        boolean z6 = h10.a;
        arrayList.addAll(z6 ? Arrays.asList(C0888i.a, c0892m) : Collections.singletonList(c0892m));
        ArrayList arrayList2 = (ArrayList) this.f1662w;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + (z6 ? 1 : 0));
        C0881b c0881b = new C0881b();
        c0881b.a = true;
        arrayList3.add(c0881b);
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(z6 ? Collections.singletonList(u.a) : Collections.EMPTY_LIST);
        return new p188t1.G(e11, (y) this.f1661v, Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList), executorA);
    }

    public I3.n m(Class cls) {
        return e(p.a(cls));
    }

    public void n(String str, String str2) {
        i.f(str2, "value");
        M1.c cVar = (M1.c) this.f1661v;
        cVar.getClass();
        C.e(str);
        C.f(str2, str);
        cVar.i(str);
        cVar.c(str, str2);
    }

    @Override // p029c9.k
    public void o() {
        ((b1) this.f1660u).o();
        p145o9.a aVar = new p145o9.a((M8.b) p086i8.k.k0((ArrayList) this.f1663x));
        ((HashMap) ((b1) this.f1661v).f14038u).put((p096j9.f) this.f1662w, aVar);
    }

    @Override // p029c9.k
    public void p(p096j9.f fVar, Object obj) {
        ((b1) this.f1659t).p(fVar, obj);
    }

    @Override // p029c9.k
    public l q(p096j9.f fVar) {
        return ((b1) this.f1659t).q(fVar);
    }

    @Override // p029c9.k
    public void r(p096j9.f fVar, p145o9.f fVar2) {
        ((b1) this.f1659t).r(fVar, fVar2);
    }

    @Override // p029c9.k
    public void s(p096j9.f fVar, p096j9.b bVar, p096j9.f fVar2) {
        ((b1) this.f1659t).s(fVar, bVar, fVar2);
    }

    @Override // p029c9.k
    public k t(p096j9.b bVar, p096j9.f fVar) {
        return ((b1) this.f1659t).t(bVar, fVar);
    }

    public String toString() {
        switch (this.f1658s) {
            case 9:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f1659t) + ", mProviderPackage: " + ((String) this.f1660u) + ", mQuery: " + ((String) this.f1661v) + ", mCertificates:");
                int i10 = 0;
                while (true) {
                    List list = (List) this.f1662w;
                    if (i10 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i10);
                    for (int i11 = 0; i11 < list2.size(); i11++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i11), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i10++;
                }
                break;
            default:
                return super.toString();
        }
    }

    public synchronized boolean u() {
        boolean zH;
        Boolean bool = (Boolean) this.f1662w;
        if (bool != null) {
            zH = bool.booleanValue();
        } else {
            try {
                zH = ((g) this.f1659t).h();
            } catch (IllegalStateException unused) {
                zH = false;
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        return zH;
    }

    public void v(String str, J j) {
        i.f(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (j == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(E0.a.i("method ", str, " must have a request body.").toString());
            }
        } else if (!xa.d.s(str)) {
            throw new IllegalArgumentException(E0.a.i("method ", str, " must not have a request body.").toString());
        }
        this.f1660u = str;
        this.f1662w = j;
    }

    public String w() {
        String str;
        synchronized (((ArrayDeque) this.f1662w)) {
            str = (String) ((ArrayDeque) this.f1662w).peek();
        }
        return str;
    }

    public boolean x(Object obj) {
        boolean zRemove;
        synchronized (((ArrayDeque) this.f1662w)) {
            zRemove = ((ArrayDeque) this.f1662w).remove(obj);
            if (zRemove) {
                ((ScheduledThreadPoolExecutor) this.f1663x).execute(new B6.d(this, 25));
            }
        }
        return zRemove;
    }

    public void y(p051f2.a aVar, final p051f2.g gVar) {
        i2.i iVar = (i2.i) this.f1659t;
        String str = (String) this.f1660u;
        p051f2.e eVar = (p051f2.e) this.f1662w;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        p051f2.c cVar = (p051f2.c) this.f1661v;
        i2.p pVar = (i2.p) this.f1663x;
        final i2.i iVarB = iVar.b(aVar.f11422b);
        Q6.b bVar = new Q6.b();
        bVar.f4335f = new HashMap();
        bVar.f4333d = Long.valueOf(pVar.a.k());
        bVar.f4334e = Long.valueOf(pVar.f12194b.k());
        bVar.a = str;
        bVar.f4332c = new i2.l(cVar, (byte[]) eVar.apply(aVar.a));
        bVar.f4331b = null;
        p051f2.b bVar2 = aVar.f11423c;
        if (bVar2 != null) {
            bVar.f4336g = bVar2.a;
        }
        final h hVarB = bVar.b();
        final p128n2.c cVar2 = (p128n2.c) pVar.f12195c;
        cVar2.getClass();
        cVar2.f13323b.execute(new Runnable() { // from class: n2.a
            @Override // java.lang.Runnable
            public final void run() {
                i2.i iVar2 = iVarB;
                String str2 = iVar2.a;
                p051f2.g gVar2 = gVar;
                h hVar = hVarB;
                c cVar3 = cVar2;
                cVar3.getClass();
                Logger logger = c.f13322f;
                try {
                    p090j2.g gVarA = cVar3.f13324c.a(str2);
                    if (gVarA != null) {
                        ((p148p2.g) cVar3.f13326e).i(new b(cVar3, iVar2, ((c) gVarA).a(hVar), 0));
                        gVar2.a(null);
                        return;
                    }
                    String str3 = "Transport backend '" + str2 + "' is not registered";
                    logger.warning(str3);
                    gVar2.a(new IllegalArgumentException(str3));
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    gVar2.a(e10);
                }
            }
        });
    }

    public Set z(Class cls) {
        return c(p.a(cls));
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f1658s = i10;
        this.f1659t = obj;
        this.f1660u = obj2;
        this.f1661v = obj3;
        this.f1662w = obj4;
        this.f1663x = obj5;
    }

    public /* synthetic */ e(boolean z6) {
        this.f1658s = 11;
    }

    public e(int i10) {
        this.f1658s = i10;
        switch (i10) {
            case 11:
                this.f1663x = new LinkedHashMap();
                this.f1660u = "GET";
                this.f1661v = new M1.c(3);
                break;
            case 17:
                H h10 = H.f16147c;
                this.f1662w = new ArrayList();
                this.f1663x = new ArrayList();
                this.f1659t = h10;
                break;
            default:
                this.f1660u = new SparseArray();
                this.f1661v = new d(0);
                this.f1662w = new HashMap();
                this.f1663x = new HashMap();
                break;
        }
    }

    public e(I3.b bVar, I3.c cVar) {
        this.f1658s = 1;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (j jVar : bVar.f2019c) {
            int i10 = jVar.f2037c;
            boolean z6 = i10 == 0;
            int i11 = jVar.f2036b;
            p pVar = jVar.a;
            if (z6) {
                if (i11 == 2) {
                    hashSet4.add(pVar);
                } else {
                    hashSet.add(pVar);
                }
            } else if (i10 == 2) {
                hashSet3.add(pVar);
            } else if (i11 == 2) {
                hashSet5.add(pVar);
            } else {
                hashSet2.add(pVar);
            }
        }
        if (!bVar.f2023g.isEmpty()) {
            hashSet.add(p.a(p042e4.b.class));
        }
        this.f1659t = Collections.unmodifiableSet(hashSet);
        this.f1660u = Collections.unmodifiableSet(hashSet2);
        this.f1661v = Collections.unmodifiableSet(hashSet3);
        this.f1662w = Collections.unmodifiableSet(hashSet4);
        Collections.unmodifiableSet(hashSet5);
        this.f1663x = cVar;
    }

    public e(g gVar) {
        Boolean boolValueOf;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f1658s = 8;
        this.f1660u = new Object();
        this.f1661v = new TaskCompletionSource();
        this.f1663x = new TaskCompletionSource();
        gVar.a();
        Context context = gVar.a;
        this.f1659t = gVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        Boolean boolValueOf2 = sharedPreferences.contains("firebase_crashlytics_collection_enabled") ? Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true)) : null;
        if (boolValueOf2 == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
            }
            boolValueOf2 = boolValueOf == null ? null : Boolean.valueOf(Boolean.TRUE.equals(boolValueOf));
        }
        this.f1662w = boolValueOf2;
        synchronized (this.f1660u) {
            try {
                if (u()) {
                    ((TaskCompletionSource) this.f1661v).d(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public e(String str, String str2, String str3, List list) {
        this.f1658s = 9;
        str.getClass();
        this.f1659t = str;
        str2.getClass();
        this.f1660u = str2;
        this.f1661v = str3;
        list.getClass();
        this.f1662w = list;
        this.f1663x = str + "-" + str2 + "-" + str3;
    }

    public e(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f1658s = 15;
        this.f1662w = new ArrayDeque();
        this.f1659t = sharedPreferences;
        this.f1660u = "topic_operation_queue";
        this.f1661v = ",";
        this.f1663x = scheduledThreadPoolExecutor;
    }

    public e(I4.a aVar, X8.d dVar, p076h8.d dVar2) {
        this.f1658s = 10;
        i.f(dVar, "typeParameterResolver");
        this.f1659t = aVar;
        this.f1660u = dVar;
        this.f1661v = dVar2;
        this.f1662w = dVar2;
        this.f1663x = new Y1.c(this, dVar);
    }

    public e(int i10, String str, LinkedHashMap linkedHashMap, String str2, Uri uri, String str3, long j, String str4, Extras extras, String str5, int i11) {
        this.f1658s = 16;
        i.g(str, "url");
        i.g(str2, "file");
        i.g(extras, "extras");
        this.f1659t = str;
        this.f1660u = linkedHashMap;
        this.f1661v = str2;
        this.f1662w = str4;
        this.f1663x = extras;
    }

    public e(b1 b1Var, b1 b1Var2, p096j9.f fVar, ArrayList arrayList) {
        this.f1658s = 12;
        this.f1660u = b1Var;
        this.f1661v = b1Var2;
        this.f1662w = fVar;
        this.f1663x = arrayList;
        this.f1659t = b1Var;
    }
}
