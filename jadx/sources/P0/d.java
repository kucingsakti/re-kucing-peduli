package P0;

import A1.C;
import L8.M;
import Q9.m;
import U.AbstractC0414c;
import U.B0;
import U.InterfaceC0420f;
import U.InterfaceC0432s;
import U.U;
import V.k;
import V.t;
import X9.C0471q;
import X9.P;
import X9.r;
import X9.y;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.tailoredapps.biometricauth.BiometricAuthenticationCancelledException;
import com.tailoredapps.biometricauth.BiometricAuthenticationException;
import com.unity3d.services.core.webview.WebView;
import java.io.IOException;
import java.io.StringWriter;
import java.net.CookieManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p040e1.n;
import p086i8.s;
import p086i8.z;
import p136o.l;

/* JADX INFO: loaded from: classes.dex */
public class d implements OnSuccessListener, OnFailureListener, OnCanceledListener, Q9.b, R.b, S1.d, InterfaceC0420f, t, InterfaceC0432s, r, M, n, N7.b, p136o.j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3810s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f3811t;

    public /* synthetic */ d(int i10, boolean z6) {
        this.f3810s = i10;
    }

    public static void q(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw E0.a.e(it);
        }
    }

    @Override // Q9.b
    public Object A(Q9.c cVar, p144o8.c cVar2) {
        ((Q9.t) ((m) this.f3811t)).A(cVar, cVar2);
        return p134n8.a.f13404s;
    }

    @Override // U.InterfaceC0432s
    public B0 E(View view, B0 b3) {
        X2.h hVar = (X2.h) this.f3811t;
        X2.g gVar = hVar.f5401E;
        if (gVar != null) {
            hVar.f5405x.f9525o0.remove(gVar);
        }
        X2.g gVar2 = new X2.g(hVar.f5397A, b3);
        hVar.f5401E = gVar2;
        gVar2.e(hVar.getWindow());
        BottomSheetBehavior bottomSheetBehavior = hVar.f5405x;
        X2.g gVar3 = hVar.f5401E;
        ArrayList arrayList = bottomSheetBehavior.f9525o0;
        if (!arrayList.contains(gVar3)) {
            arrayList.add(gVar3);
        }
        return b3;
    }

    @Override // U.InterfaceC0420f
    public ClipData a() {
        return ((ContentInfo) this.f3811t).getClip();
    }

    @Override // N7.b
    public void accept(Object obj) {
        L7.b bVar;
        L7.b bVar2;
        d7.e eVar = (d7.e) obj;
        boolean z6 = eVar instanceof d7.d;
        p045e7.h hVar = ((p045e7.g) this.f3811t).a;
        if (z6) {
            d7.d dVar = (d7.d) eVar;
            p027c7.a aVar = dVar.a;
            O7.b bVar3 = O7.b.f3608s;
            if (aVar != null) {
                J7.h hVarO0 = p045e7.h.o0(hVar);
                if (hVarO0 != null) {
                    U7.b bVar4 = (U7.b) hVarO0;
                    if (bVar4.get() != bVar3 && (bVar2 = (L7.b) bVar4.getAndSet(bVar3)) != bVar3) {
                        p027c7.a aVar2 = dVar.a;
                        J7.i iVar = bVar4.f4909s;
                        try {
                            if (aVar2 == null) {
                                iVar.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                            } else {
                                iVar.c(aVar2);
                            }
                            if (bVar2 != null) {
                                bVar2.f();
                            }
                        } catch (Throwable th) {
                            if (bVar2 != null) {
                                bVar2.f();
                            }
                            throw th;
                        }
                    }
                }
            } else {
                J7.h hVarO1 = p045e7.h.o0(hVar);
                if (hVarO1 != null) {
                    U7.b bVar5 = (U7.b) hVarO1;
                    if (bVar5.get() != bVar3 && (bVar = (L7.b) bVar5.getAndSet(bVar3)) != bVar3) {
                        try {
                            bVar5.f4909s.a();
                            if (bVar != null) {
                                bVar.f();
                            }
                        } catch (Throwable th2) {
                            if (bVar != null) {
                                bVar.f();
                            }
                            throw th2;
                        }
                    }
                }
            }
        } else if (eVar instanceof d7.a) {
            d7.a aVar3 = (d7.a) eVar;
            if (aVar3.a == 5) {
                J7.h hVarO2 = p045e7.h.o0(hVar);
                if (hVarO2 != null) {
                    hVar.getClass();
                    ((U7.b) hVarO2).a(new BiometricAuthenticationCancelledException());
                }
            } else {
                J7.h hVarO3 = p045e7.h.o0(hVar);
                if (hVarO3 != null) {
                    ((U7.b) hVarO3).a(new BiometricAuthenticationException(aVar3.f10549b));
                }
            }
        } else {
            J7.h hVarO4 = p045e7.h.o0(hVar);
            if (hVarO4 != null) {
                ((U7.b) hVarO4).a(new BiometricAuthenticationException(""));
            }
        }
        hVar.h0();
    }

    @Override // V.t
    public boolean b(View view) {
        switch (this.f3810s) {
            case 7:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3811t;
                if (!swipeDismissBehavior.w(view)) {
                    return false;
                }
                WeakHashMap weakHashMap = U.a;
                boolean z6 = view.getLayoutDirection() == 1;
                int i10 = swipeDismissBehavior.f9484w;
                view.offsetLeftAndRight((!(i10 == 0 && z6) && (i10 != 1 || z6)) ? view.getWidth() : -view.getWidth());
                view.setAlpha(0.0f);
                p081i3.b bVar = swipeDismissBehavior.f9481t;
                if (bVar == null) {
                    return true;
                }
                bVar.E(view);
                return true;
            default:
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = (ViewPager2) ((o1.h) this.f3811t).f13635v;
                if (viewPager2.f7193J) {
                    viewPager2.b(currentItem);
                }
                return true;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void c(Object obj) {
        ((CountDownLatch) this.f3811t).countDown();
    }

    @Override // R.b
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f3811t;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // p040e1.n
    public String[] d() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f3811t).getSupportedFeatures();
    }

    @Override // S1.d
    public S1.c e(int i10) {
        if (i10 == 5) {
            return S1.b.f4506s;
        }
        if (((S1.a) this.f3811t) == null) {
            this.f3811t = new S1.a();
        }
        return (S1.a) this.f3811t;
    }

    @Override // R.b
    public Cursor f(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f3811t;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override // U.InterfaceC0420f
    public int g() {
        return ((ContentInfo) this.f3811t).getSource();
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void h() {
        ((CountDownLatch) this.f3811t).countDown();
    }

    @Override // X9.r
    public void i(y yVar, List list) {
        p210v8.i.f(yVar, "url");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0471q c0471q = (C0471q) it.next();
            p210v8.i.f(c0471q, "cookie");
            arrayList.add(c0471q.a(true));
        }
        try {
            ((CookieManager) this.f3811t).put(yVar.i(), z.t(new p076h8.f("Set-Cookie", arrayList)));
        } catch (IOException e10) {
            p068ga.n nVar = p068ga.n.a;
            p068ga.n nVar2 = p068ga.n.a;
            StringBuilder sb = new StringBuilder("Saving cookies failed for ");
            y yVarH = yVar.h("/...");
            p210v8.i.c(yVarH);
            sb.append(yVarH);
            String string = sb.toString();
            nVar2.getClass();
            p068ga.n.i(string, 5, e10);
        }
    }

    @Override // U.InterfaceC0420f
    public int j() {
        return ((ContentInfo) this.f3811t).getFlags();
    }

    @Override // p136o.j
    public boolean k(l lVar, MenuItem menuItem) {
        return false;
    }

    @Override // U.InterfaceC0420f
    public ContentInfo l() {
        return (ContentInfo) this.f3811t;
    }

    @Override // p040e1.n
    public WebViewProviderBoundaryInterface m(WebView webView) {
        return (WebViewProviderBoundaryInterface) oa.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f3811t).createWebView(webView));
    }

    @Override // X9.r
    public List n(y yVar) {
        s sVar = s.f12328s;
        p210v8.i.f(yVar, "url");
        try {
            Map<String, List<String>> map = ((CookieManager) this.f3811t).get(yVar.i(), p086i8.t.f12329s);
            p210v8.i.e(map, "cookieHeaders");
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                    p210v8.i.e(value, "value");
                    if (value.isEmpty()) {
                        continue;
                    } else {
                        for (String str : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            p210v8.i.e(str, "header");
                            ArrayList arrayList2 = new ArrayList();
                            int length = str.length();
                            int i10 = 0;
                            while (i10 < length) {
                                int iG = Y9.c.g(str, i10, ";,", length);
                                int iF = Y9.c.f(str, '=', i10, iG);
                                String strZ = Y9.c.z(i10, str, iF);
                                if (!L9.n.I(strZ, "$", false)) {
                                    String strZ2 = iF < iG ? Y9.c.z(iF + 1, str, iG) : "";
                                    if (L9.n.I(strZ2, "\"", false) && L9.n.B(strZ2, "\"")) {
                                        strZ2 = strZ2.substring(1, strZ2.length() - 1);
                                        p210v8.i.e(strZ2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    }
                                    if (!p210v8.i.a(L9.f.j0(strZ).toString(), strZ)) {
                                        throw new IllegalArgumentException("name is not trimmed");
                                    }
                                    if (!p210v8.i.a(L9.f.j0(strZ2).toString(), strZ2)) {
                                        throw new IllegalArgumentException("value is not trimmed");
                                    }
                                    String str2 = yVar.f5658d;
                                    p210v8.i.f(str2, "domain");
                                    String strQ = C3.a.q(str2);
                                    if (strQ == null) {
                                        throw new IllegalArgumentException(p210v8.i.k(str2, "unexpected domain: "));
                                    }
                                    arrayList2.add(new C0471q(strZ, strZ2, 253402300799999L, strQ, "/", false, false, false, false));
                                }
                                i10 = iG + 1;
                            }
                            arrayList.addAll(arrayList2);
                        }
                    }
                }
            }
            if (arrayList == null) {
                return sVar;
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            p210v8.i.e(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
            return listUnmodifiableList;
        } catch (IOException e10) {
            p068ga.n nVar = p068ga.n.a;
            p068ga.n nVar2 = p068ga.n.a;
            StringBuilder sb = new StringBuilder("Loading cookies failed for ");
            y yVarH = yVar.h("/...");
            p210v8.i.c(yVarH);
            sb.append(yVarH);
            String string = sb.toString();
            nVar2.getClass();
            p068ga.n.i(string, 5, e10);
            return sVar;
        }
    }

    public synchronized void o(P p10) {
        p210v8.i.f(p10, "route");
        ((LinkedHashSet) this.f3811t).remove(p10);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.f3811t).countDown();
    }

    public V.j p(int i10) {
        return null;
    }

    @Override // p136o.j
    public void r(l lVar) {
        p078i.M m2 = (p078i.M) this.f3811t;
        boolean zP = m2.f11983b.a.p();
        p078i.z zVar = m2.f11984c;
        if (zP) {
            zVar.onPanelClosed(108, lVar);
        } else if (zVar.onPreparePanel(0, null, lVar)) {
            zVar.onMenuOpened(108, lVar);
        }
    }

    public String s(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            p024c4.d dVar = (p024c4.d) this.f3811t;
            p024c4.e eVar = new p024c4.e(stringWriter, dVar.a, dVar.f7525b, dVar.f7526c, dVar.f7527d);
            eVar.h(obj);
            eVar.j();
            eVar.f7528b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public V.j t(int i10) {
        return null;
    }

    public String toString() {
        switch (this.f3810s) {
            case 6:
                return "ContentInfoCompat{" + ((ContentInfo) this.f3811t) + "}";
            case 23:
                StringBuilder sb = new StringBuilder();
                Y8.r rVar = (Y8.r) this.f3811t;
                sb.append(rVar);
                sb.append(": ");
                sb.append(((Map) J7.j.o(rVar.f5797A, Y8.r.f5796E[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public boolean u(int i10, int i11, Bundle bundle) {
        return false;
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.f3810s = i10;
        this.f3811t = obj;
    }

    public d(C c10) {
        this.f3810s = 24;
        this.f3811t = Collections.unmodifiableMap(new HashMap(c10.a));
    }

    public d(Y8.r rVar) {
        this.f3810s = 23;
        p210v8.i.f(rVar, "packageFragment");
        this.f3811t = rVar;
    }

    public d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f3810s = 13;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f3811t = new Z.f(uri, clipDescription, uri2);
        } else {
            this.f3811t = new Y1.c(uri, clipDescription, uri2, 1);
        }
    }

    public d(Context context, Uri uri) {
        this.f3810s = 4;
        this.f3811t = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public d(Y9.b bVar) {
        this.f3810s = 14;
        this.f3811t = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), bVar);
    }

    public d(int i10) {
        this.f3810s = i10;
        switch (i10) {
            case 1:
                this.f3811t = new CountDownLatch(1);
                break;
            case 8:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f3811t = new V.l(this);
                } else {
                    this.f3811t = new k(this);
                }
                break;
            case 11:
                p210v8.i.f(TimeUnit.MINUTES, "timeUnit");
                this.f3811t = new p020ba.l(p010aa.c.f6023h);
                break;
            case 16:
                this.f3811t = new LinkedHashSet();
                break;
            default:
                this.f3811t = null;
                break;
        }
    }

    public d(ContentInfo contentInfo) {
        this.f3810s = 6;
        contentInfo.getClass();
        this.f3811t = AbstractC0414c.i(contentInfo);
    }
}
