package p040e1;

import A1.C0099h;
import A1.J;
import A9.AbstractC0151y;
import B4.AbstractC0153a;
import B4.AbstractC0158f;
import B4.C0157e;
import B4.C0159g;
import B4.C0164l;
import B4.C0166n;
import B4.C0168p;
import B4.E;
import B4.InterfaceC0155c;
import B4.P;
import B4.Q;
import E1.C0180b;
import E1.InterfaceC0179a;
import E1.r;
import E1.s;
import E1.x;
import G.e;
import J0.O;
import J9.b;
import K3.d;
import L8.C0280n;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0284s;
import L8.InterfaceC0285t;
import L9.n;
import M2.AbstractC0316z;
import M2.t0;
import O3.B;
import O3.l;
import O3.o;
import Q9.c;
import R9.g;
import U.AbstractC0414c;
import U.B0;
import U.C0421g;
import U.InterfaceC0416d;
import U.InterfaceC0432s;
import U.U;
import U.y0;
import V.h;
import V1.a;
import W1.i;
import android.app.Activity;
import android.content.ClipData;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.recyclerview.widget.w;
import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgt;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zziv;
import com.google.android.material.appbar.AppBarLayout;
import com.kcstream.cing.R;
import com.onesignal.inAppMessages.internal.display.impl.k;
import com.unity3d.ads.metadata.MediationMetaData;
import i9.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.TimeoutException;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import p039e0.q;
import p076h8.m;
import p086i8.C;

/* JADX INFO: loaded from: classes.dex */
public final class j implements WebMessageListenerBoundaryInterface, a, InterfaceC0155c, InterfaceC0284s, s, InterfaceC0179a, i, InterfaceC0432s, O, b, zzv, t0, M3.a, Q9.b, R.b, InterfaceC0416d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10696s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f10697t;

    public /* synthetic */ j(int i10, View view, ViewGroup viewGroup) {
        this.f10696s = i10;
        this.f10697t = view;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // Q9.b
    public Object A(c cVar, p144o8.c cVar2) throws Throwable {
        Q9.a aVar;
        Throwable th;
        g gVar;
        if (cVar2 instanceof Q9.a) {
            aVar = (Q9.a) cVar2;
            int i10 = aVar.f4348v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f4348v = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new Q9.a(this, cVar2);
            }
        } else {
            aVar = new Q9.a(this, cVar2);
        }
        Object obj = aVar.f4346t;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = aVar.f4348v;
        m mVar = m.a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = aVar.f4345s;
            try {
                J7.a.v(obj);
                gVar.releaseIntercepted();
                return mVar;
            } catch (Throwable th2) {
                th = th2;
                gVar.releaseIntercepted();
                throw th;
            }
        }
        J7.a.v(obj);
        g gVar2 = new g(cVar, aVar.getContext());
        try {
            aVar.f4345s = gVar2;
            aVar.f4348v = 1;
            Object objInvoke = ((q) this.f10697t).invoke(gVar2, aVar);
            if (objInvoke != aVar2) {
                objInvoke = mVar;
            }
            if (objInvoke == aVar2) {
                return aVar2;
            }
            gVar = gVar2;
            gVar.releaseIntercepted();
            return mVar;
        } catch (Throwable th3) {
            th = th3;
            gVar = gVar2;
            gVar.releaseIntercepted();
            throw th;
        }
    }

    @Override // E1.s
    public r D(x xVar) {
        switch (this.f10696s) {
            case 7:
                return new C0180b((AssetManager) this.f10697t, 0, this);
            default:
                return new F1.a((A1.r) this.f10697t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // U.InterfaceC0432s
    public B0 E(View view, B0 b3) {
        int i10 = 0;
        switch (this.f10696s) {
            case 11:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f10697t;
                if (!Objects.equals(coordinatorLayout.f6315F, b3)) {
                    coordinatorLayout.f6315F = b3;
                    boolean z6 = b3.d() > 0;
                    coordinatorLayout.f6316G = z6;
                    coordinatorLayout.setWillNotDraw(!z6 && coordinatorLayout.getBackground() == null);
                    y0 y0Var = b3.a;
                    if (!y0Var.m()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (i10 < childCount) {
                            View childAt = coordinatorLayout.getChildAt(i10);
                            WeakHashMap weakHashMap = U.a;
                            if (!childAt.getFitsSystemWindows() || ((e) childAt.getLayoutParams()).a == null || !y0Var.m()) {
                                i10++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                break;
            default:
                AppBarLayout appBarLayout = (AppBarLayout) this.f10697t;
                WeakHashMap weakHashMap2 = U.a;
                B0 b7 = appBarLayout.getFitsSystemWindows() ? b3 : null;
                if (!Objects.equals(appBarLayout.f9420y, b7)) {
                    appBarLayout.f9420y = b7;
                    if (appBarLayout.f9411M != null && appBarLayout.getTopInset() > 0) {
                        i10 = 1;
                    }
                    appBarLayout.setWillNotDraw(i10 ^ 1);
                    appBarLayout.requestLayout();
                }
                break;
        }
        return b3;
    }

    @Override // U.InterfaceC0416d
    public void G(int i10) {
        ((ContentInfo.Builder) this.f10697t).setFlags(i10);
    }

    public J H() {
        C0157e c0157e = (C0157e) this.f10697t;
        c0157e.getClass();
        C0159g c0159g = new C0159g();
        p212w.e eVar = new p212w.e(0);
        c0159g.f679g = eVar;
        c0159g.f681i = null;
        c0159g.j = null;
        c0159g.f682k = null;
        c0159g.f684m = null;
        c0159g.f685n = true;
        c0159g.f686o = true;
        c0159g.f687p = -1;
        c0159g.f688q = null;
        Activity activity = (Activity) c0157e.f665b;
        c0159g.a = activity;
        ViewGroup viewGroup = (ViewGroup) c0157e.f667d;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) c0157e.f668e;
        int i10 = c0157e.f666c;
        E e10 = new E();
        e10.f628g = null;
        e10.f629h = 1;
        e10.a = activity;
        e10.f623b = true;
        e10.f624c = i10;
        e10.f625d = -1;
        e10.f627f = null;
        c0159g.f674b = e10;
        c0159g.f676d = null;
        c0159g.f677e = (B4.J) c0157e.f670g;
        c0159g.f678f = (Q) c0157e.f669f;
        c0159g.f675c = (B1.a) c0157e.f671h;
        c0159g.f689r = 1;
        if (viewGroup == null) {
            P pA = e10.a();
            e10.f628g = pA;
            e10.a.setContentView(pA);
        } else {
            P pA2 = e10.a();
            e10.f628g = pA2;
            viewGroup.addView(pA2, layoutParams);
        }
        WebView webView = e10.f627f;
        o1.c cVar = new o1.c(2, false);
        cVar.f13623t = webView;
        cVar.f13624u = null;
        cVar.f13624u = new j(4);
        new Handler(Looper.getMainLooper());
        c0159g.f682k = cVar;
        FrameLayout frameLayout = e10.f628g;
        if (frameLayout instanceof P) {
            P p10 = (P) frameLayout;
            C0166n c0166n = new C0166n();
            p10.f652s = c0166n;
            Activity activity2 = (Activity) p10.getContext();
            synchronized (c0166n) {
                if (!c0166n.a) {
                    c0166n.a = true;
                    c0166n.a(p10, activity2);
                }
            }
            p10.f654u = -1;
            p10.f653t = R.layout.agentweb_error_page;
            p10.setErrorView(null);
        }
        WebView webView2 = e10.f627f;
        A1.r rVar = new A1.r(2, false);
        rVar.f167t = webView2;
        c0159g.f683l = rVar;
        c0159g.f685n = true;
        c0159g.f686o = true;
        C0164l c0164l = new C0164l();
        c0164l.a = null;
        c0164l.f694b = null;
        c0164l.a = new WeakReference(c0159g);
        c0164l.f694b = new WeakReference(activity);
        eVar.put("agentWeb", c0164l);
        if (c0159g.f681i == null) {
            c0159g.f681i = new d(2);
        }
        J j = new J(1);
        j.f75t = false;
        j.f76u = c0159g;
        return j;
    }

    public h I(p096j9.b bVar, f fVar) {
        Q8.b bVarI;
        p210v8.i.f(bVar, "classId");
        p210v8.i.f(fVar, "jvmMetadataVersion");
        String strF = n.F(bVar.h().b(), '.', '$');
        if (!bVar.g().d()) {
            strF = bVar.g() + '.' + strF;
        }
        Class clsA = C.A((ClassLoader) this.f10697t, strF);
        if (clsA == null || (bVarI = p068ga.d.i(clsA)) == null) {
            return null;
        }
        return new h(bVarI, 13);
    }

    public void J(V3.b bVar, Thread thread, Throwable th) {
        o oVar = (o) this.f10697t;
        synchronized (oVar) {
            Objects.toString(th);
            thread.getName();
            Log.isLoggable("FirebaseCrashlytics", 3);
            try {
                B.a(oVar.f3546e.u(new l(oVar, System.currentTimeMillis(), th, thread, bVar)));
            } catch (TimeoutException | Exception unused) {
            }
        }
    }

    public void K(zzs zzsVar, String str, List list, boolean z6, boolean z10) {
        zzfy zzfyVar;
        int i10 = AbstractC0316z.a[zzsVar.ordinal()];
        zzgt zzgtVar = (zzgt) this.f10697t;
        if (i10 == 1) {
            zzfyVar = zzgtVar.i().f9051E;
        } else if (i10 != 2) {
            if (i10 != 3) {
                zzfyVar = i10 != 4 ? zzgtVar.i().f9050D : zzgtVar.i().f9052F;
            } else if (z6) {
                zzfyVar = zzgtVar.i().f9048B;
            } else {
                zzfyVar = !z10 ? zzgtVar.i().f9049C : zzgtVar.i().f9047A;
            }
        } else if (z6) {
            zzfyVar = zzgtVar.i().f9057y;
        } else {
            zzfyVar = !z10 ? zzgtVar.i().f9058z : zzgtVar.i().f9056x;
        }
        int size = list.size();
        if (size == 1) {
            zzfyVar.a(list.get(0), str);
            return;
        }
        if (size == 2) {
            zzfyVar.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzfyVar.b(str);
        } else {
            zzfyVar.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    @Override // M2.t0
    public void a(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        zziv zzivVar = (zziv) this.f10697t;
        if (!zIsEmpty) {
            ((zzhj) zzivVar.f577s).getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        ((zzhj) zzivVar.f577s).f9120F.getClass();
        zzivVar.q1("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    @Override // L8.InterfaceC0284s
    public InterfaceC0285t build() {
        return (C9.b) this.f10697t;
    }

    @Override // R.b
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f10697t;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // L8.InterfaceC0284s
    public InterfaceC0284s d(AbstractC0151y abstractC0151y) {
        p210v8.i.f(abstractC0151y, k.EVENT_TYPE_KEY);
        return this;
    }

    @Override // L8.InterfaceC0284s
    public InterfaceC0284s e(M8.h hVar) {
        p210v8.i.f(hVar, "additionalAnnotations");
        return this;
    }

    @Override // R.b
    public Cursor f(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f10697t;
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

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER"};
    }

    @Override // J9.b
    public Iterable h(Object obj) {
        K8.n nVar = (K8.n) this.f10697t;
        p210v8.i.f(nVar, "this$0");
        Collection collectionT = ((InterfaceC0271e) obj).I().t();
        p210v8.i.e(collectionT, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionT.iterator();
        while (it.hasNext()) {
            InterfaceC0273g interfaceC0273gW = ((AbstractC0151y) it.next()).D().w();
            InterfaceC0273g interfaceC0273gC = interfaceC0273gW != null ? interfaceC0273gW.c() : null;
            InterfaceC0271e interfaceC0271e = interfaceC0273gC instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gC : null;
            Y8.j jVarF = interfaceC0271e != null ? nVar.f(interfaceC0271e) : null;
            if (jVarF != null) {
                arrayList.add(jVarF);
            }
        }
        return arrayList;
    }

    @Override // J0.O
    public int i() {
        w wVar = (w) this.f10697t;
        return wVar.f7134p - wVar.I();
    }

    @Override // L8.InterfaceC0284s
    public InterfaceC0284s l(int i10) {
        AbstractC0487g.p(i10, "kind");
        return this;
    }

    @Override // L8.InterfaceC0284s
    public InterfaceC0284s m(InterfaceC0271e interfaceC0271e) {
        p210v8.i.f(interfaceC0271e, "owner");
        return this;
    }

    @Override // J0.O
    public int n(View view) {
        androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) view.getLayoutParams();
        ((w) this.f10697t).getClass();
        return w.F(view) - ((ViewGroup.MarginLayoutParams) xVar).topMargin;
    }

    @Override // V1.a
    public Object o() {
        A1.q qVar = (A1.q) this.f10697t;
        return new A1.n((A1.s) qVar.f164c, (C0099h) qVar.f165d);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006c  */
    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0093  */
    /* JADX WARN: Code duplicated, block: B:24:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z6, InvocationHandler invocationHandler2) {
        p033d1.c cVar;
        p033d1.c cVar2;
        h hVar;
        com.unity3d.services.core.webview.a aVar;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) oa.b.a(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        h[] hVarArr = new h[ports.length];
        for (int i10 = 0; i10 < ports.length; i10++) {
            InvocationHandler invocationHandler3 = ports[i10];
            h hVar2 = new h(18);
            hVar2.f5078t = (WebMessagePortBoundaryInterface) oa.b.a(WebMessagePortBoundaryInterface.class, invocationHandler3);
            hVarArr[i10] = hVar2;
        }
        if (l.a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) oa.b.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                if (type != 1) {
                    cVar2 = null;
                } else {
                    cVar = new p033d1.c(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
                }
                if (cVar2 != null) {
                    JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) oa.b.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                    hVar = (h) jsReplyProxyBoundaryInterface.getOrCreatePeer(new M2.J(jsReplyProxyBoundaryInterface, 2));
                    aVar = (com.unity3d.services.core.webview.a) this.f10697t;
                    switch (aVar.a) {
                        case 0:
                            aVar.f10431b.onHandleInvocation(webView, cVar2, uri, z6, hVar);
                            break;
                        default:
                            aVar.f10431b.onHandleCallback(webView, cVar2, uri, z6, hVar);
                            break;
                    }
                }
            }
            cVar = new p033d1.c(webMessagePayloadBoundaryInterface.getAsString());
        } else {
            cVar = new p033d1.c(webMessageBoundaryInterface.getData());
        }
        cVar2 = cVar;
        if (cVar2 != null) {
            JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface2 = (JsReplyProxyBoundaryInterface) oa.b.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            hVar = (h) jsReplyProxyBoundaryInterface2.getOrCreatePeer(new M2.J(jsReplyProxyBoundaryInterface2, 2));
            aVar = (com.unity3d.services.core.webview.a) this.f10697t;
            switch (aVar.a) {
                case 0:
                    aVar.f10431b.onHandleInvocation(webView, cVar2, uri, z6, hVar);
                    break;
                default:
                    aVar.f10431b.onHandleCallback(webView, cVar2, uri, z6, hVar);
                    break;
            }
        }
    }

    @Override // E1.InterfaceC0179a
    public com.bumptech.glide.load.data.e p(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.j(assetManager, str, 1);
    }

    @Override // L8.InterfaceC0284s
    public InterfaceC0284s q(p096j9.f fVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        return this;
    }

    @Override // L8.InterfaceC0284s
    public InterfaceC0284s s(C0280n c0280n) {
        p210v8.i.f(c0280n, "visibility");
        return this;
    }

    @Override // U.InterfaceC0416d
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f10697t).setExtras(bundle);
    }

    @Override // U.InterfaceC0416d
    public void t(Uri uri) {
        ((ContentInfo.Builder) this.f10697t).setLinkUri(uri);
    }

    public String toString() {
        switch (this.f10696s) {
            case 4:
                return "HttpHeaders{mHeaders=" + ((p212w.e) this.f10697t) + '}';
            default:
                return super.toString();
        }
    }

    @Override // B4.InterfaceC0155c
    public void u(String[] strArr, Bundle bundle) {
        if (bundle.getInt("KEY_FROM_INTENTION") == 96) {
            C0168p c0168p = (C0168p) this.f10697t;
            boolean zE = AbstractC0158f.e((Context) c0168p.f696b.get(), strArr);
            GeolocationPermissions.Callback callback = c0168p.f701g;
            if (callback != null) {
                if (zE) {
                    callback.invoke(c0168p.f700f, true, false);
                } else {
                    callback.invoke(c0168p.f700f, false, false);
                }
                c0168p.f701g = null;
                c0168p.f700f = null;
            }
            if (zE || c0168p.f702h.get() == null) {
                return;
            }
            ((AbstractC0153a) c0168p.f702h.get()).j(AbstractC0158f.a);
        }
    }

    @Override // J0.O
    public View v(int i10) {
        return ((w) this.f10697t).v(i10);
    }

    @Override // J0.O
    public int w() {
        return ((w) this.f10697t).L();
    }

    @Override // L8.InterfaceC0284s
    public InterfaceC0284s x(int i10) {
        AbstractC0487g.p(i10, "modality");
        return this;
    }

    @Override // J0.O
    public int y(View view) {
        androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) view.getLayoutParams();
        ((w) this.f10697t).getClass();
        return w.z(view) + ((ViewGroup.MarginLayoutParams) xVar).bottomMargin;
    }

    @Override // M3.a
    public void z(Bundle bundle) {
        ((F3.b) ((F3.a) this.f10697t)).a("clx", "_ae", bundle);
    }

    public /* synthetic */ j(int i10, boolean z6) {
        this.f10696s = i10;
    }

    @Override // U.InterfaceC0416d
    /* JADX INFO: renamed from: build, reason: collision with other method in class */
    public C0421g mo66build() {
        return new C0421g(new P0.d(((ContentInfo.Builder) this.f10697t).build()));
    }

    public /* synthetic */ j(Object obj, int i10) {
        this.f10696s = i10;
        this.f10697t = obj;
    }

    public j(Context context) {
        this.f10696s = 5;
        this.f10697t = new C1.e(context);
    }

    public j(int i10) {
        this.f10696s = i10;
        switch (i10) {
            case 9:
                this.f10697t = new A1.r(7);
                break;
            case 10:
                SparseArray sparseArray = new SparseArray();
                this.f10697t = sparseArray;
                sparseArray.append(R.id.event_on_click, new Fa.b(0));
                sparseArray.append(R.id.event_on_long_click, new Fa.b(2));
                sparseArray.append(R.id.event_on_item_selected, new Fa.b(1));
                break;
            case 16:
                this.f10697t = new HashSet();
                break;
            default:
                this.f10697t = new p212w.e(0);
                break;
        }
    }

    public j(Context context, Uri uri) {
        this.f10696s = 26;
        this.f10697t = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // L8.InterfaceC0284s
    public InterfaceC0284s B() {
        return this;
    }

    @Override // L8.InterfaceC0284s
    public InterfaceC0284s C() {
        return this;
    }

    @Override // L8.InterfaceC0284s
    public InterfaceC0284s F() {
        return this;
    }

    @Override // L8.InterfaceC0284s
    public InterfaceC0284s c() {
        return this;
    }

    @Override // L8.InterfaceC0284s
    public InterfaceC0284s j() {
        return this;
    }

    @Override // L8.InterfaceC0284s
    public InterfaceC0284s k() {
        return this;
    }

    @Override // L8.InterfaceC0284s
    public InterfaceC0284s r() {
        return this;
    }

    public j(ClipData clipData, int i10) {
        this.f10696s = 28;
        this.f10697t = AbstractC0414c.g(clipData, i10);
    }

    @Override // L8.InterfaceC0284s
    public InterfaceC0284s b(O8.x xVar) {
        return this;
    }

    @Override // L8.InterfaceC0284s
    public InterfaceC0284s g(List list) {
        return this;
    }
}
