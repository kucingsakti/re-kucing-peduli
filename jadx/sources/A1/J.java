package A1;

import B4.AbstractC0158f;
import B4.AbstractC0162j;
import B4.C0157e;
import B4.C0159g;
import B4.C0165m;
import B4.C0168p;
import B4.Q;
import U.B0;
import U.y0;
import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.datastore.preferences.protobuf.i0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.just.agentweb.JsInterfaceObjectException;
import io.reactivex.exceptions.CompositeException;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import org.chromium.net.UrlRequest;
import p.C0703g;
import p078i.M;
import retrofit2.adapter.rxjava2.HttpException;
import ya.L;

/* JADX INFO: loaded from: classes.dex */
public final class J implements P3.j, p091j3.E, p136o.w, J7.k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f74s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f75t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f76u;

    public /* synthetic */ J(int i10) {
        this.f74s = i10;
    }

    @Override // J7.k
    public void a() {
        if (this.f75t) {
            return;
        }
        ((J7.k) this.f76u).a();
    }

    @Override // J7.k
    public void b(L7.b bVar) {
        ((J7.k) this.f76u).b(bVar);
    }

    @Override // p136o.w
    public void c(p136o.l lVar, boolean z6) {
        androidx.appcompat.widget.b bVar;
        if (this.f75t) {
            return;
        }
        this.f75t = true;
        M m2 = (M) this.f76u;
        ActionMenuView actionMenuView = m2.f11983b.a.f6239s;
        if (actionMenuView != null && (bVar = actionMenuView.f6133L) != null) {
            bVar.b();
            C0703g c0703g = bVar.f6265M;
            if (c0703g != null && c0703g.b()) {
                c0703g.f13564i.dismiss();
            }
        }
        m2.f11984c.onPanelClosed(108, lVar);
        this.f75t = false;
    }

    @Override // J7.k
    public void d(Object obj) {
        L l4 = (L) obj;
        boolean zC = l4.a.c();
        J7.k kVar = (J7.k) this.f76u;
        if (zC) {
            kVar.d(l4.f16192b);
            return;
        }
        this.f75t = true;
        HttpException httpException = new HttpException(l4);
        try {
            kVar.onError(httpException);
        } catch (Throwable th) {
            p068ga.l.n(th);
            J7.j.y(new CompositeException(httpException, th));
        }
    }

    @Override // P3.j
    public void e(P3.i iVar, int i10) {
        boolean z6 = this.f75t;
        StringBuilder sb = (StringBuilder) this.f76u;
        if (z6) {
            this.f75t = false;
        } else {
            sb.append(", ");
        }
        sb.append(i10);
    }

    public void f() {
        synchronized (this) {
            try {
                if (this.f75t) {
                    return;
                }
                this.f75t = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f76u;
                if (cancellationSignal != null) {
                    try {
                        cancellationSignal.cancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean g() {
        return this.f75t;
    }

    public C0159g h(String str) {
        r rVar;
        B4.M m2;
        if (!this.f75t) {
            j();
        }
        C0159g c0159g = (C0159g) this.f76u;
        c0159g.f682k.s(str);
        if (!TextUtils.isEmpty(str) && (rVar = c0159g.f676d) != null && (m2 = (B4.M) rVar.f167t) != null && m2.getVisibility() == 8) {
            m2.setVisibility(0);
            m2.f636A = 0.0f;
            m2.a(false);
        }
        return c0159g;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    public boolean i(int i10, CharSequence charSequence) {
        if (charSequence == null || i10 < 0 || charSequence.length() - i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (((S.j) this.f76u) == null) {
            return g();
        }
        char c10 = 0;
        c10 = 2;
        for (int i11 = 0; i11 < i10 && c10 == 2; i11++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i11));
            J j = S.k.a;
            if (directionality == 0) {
                c10 = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    case 15:
                        c10 = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        c10 = 2;
                        continue;
                }
            }
        }
        if (c10 == 0) {
            return true;
        }
        if (c10 != 1) {
            return g();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        Q q10;
        int i10;
        int i11;
        NetworkInfo activeNetworkInfo;
        boolean z6 = false;
        int i12 = 1;
        if (this.f75t) {
            return;
        }
        C0159g c0159g = (C0159g) this.f76u;
        c0159g.a.getApplicationContext();
        String str = AbstractC0162j.a;
        synchronized (AbstractC0162j.class) {
            if (!AbstractC0162j.f691b) {
                AbstractC0162j.f691b = true;
            }
        }
        B1.a c0165m = c0159g.f675c;
        if (c0165m == null) {
            c0165m = new C0165m();
            c0159g.f675c = c0165m;
        }
        c0165m.P0(c0159g);
        if (c0159g.f680h == null) {
            c0159g.f680h = c0165m;
        }
        WebView webView = c0159g.f674b.f627f;
        WebSettings settings = webView.getSettings();
        c0165m.f577s = settings;
        settings.setJavaScriptEnabled(true);
        ((WebSettings) c0165m.f577s).setSupportZoom(true);
        ((WebSettings) c0165m.f577s).setBuiltInZoomControls(false);
        ((WebSettings) c0165m.f577s).setSavePassword(false);
        ConnectivityManager connectivityManager = (ConnectivityManager) webView.getContext().getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            ((WebSettings) c0165m.f577s).setCacheMode(1);
        } else {
            ((WebSettings) c0165m.f577s).setCacheMode(-1);
        }
        ((WebSettings) c0165m.f577s).setMixedContentMode(0);
        int i13 = 2;
        webView.setLayerType(2, null);
        ((WebSettings) c0165m.f577s).setTextZoom(100);
        ((WebSettings) c0165m.f577s).setDatabaseEnabled(true);
        ((WebSettings) c0165m.f577s).setLoadsImagesAutomatically(true);
        ((WebSettings) c0165m.f577s).setSupportMultipleWindows(false);
        ((WebSettings) c0165m.f577s).setBlockNetworkImage(false);
        ((WebSettings) c0165m.f577s).setAllowFileAccess(true);
        ((WebSettings) c0165m.f577s).setAllowFileAccessFromFileURLs(false);
        ((WebSettings) c0165m.f577s).setAllowUniversalAccessFromFileURLs(false);
        ((WebSettings) c0165m.f577s).setJavaScriptCanOpenWindowsAutomatically(true);
        ((WebSettings) c0165m.f577s).setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        ((WebSettings) c0165m.f577s).setLoadWithOverviewMode(false);
        ((WebSettings) c0165m.f577s).setUseWideViewPort(false);
        ((WebSettings) c0165m.f577s).setDomStorageEnabled(true);
        ((WebSettings) c0165m.f577s).setNeedInitialFocus(true);
        ((WebSettings) c0165m.f577s).setDefaultTextEncodingName("utf-8");
        ((WebSettings) c0165m.f577s).setDefaultFontSize(16);
        ((WebSettings) c0165m.f577s).setMinimumFontSize(12);
        ((WebSettings) c0165m.f577s).setGeolocationEnabled(true);
        String strA = AbstractC0162j.a(webView.getContext());
        AbstractC0162j.a(webView.getContext());
        ((WebSettings) c0165m.f577s).setGeolocationDatabasePath(strA);
        ((WebSettings) c0165m.f577s).setDatabasePath(strA);
        WebSettings webSettings = (WebSettings) c0165m.f577s;
        webSettings.setUserAgentString(webSettings.getUserAgentString().concat(" AgentWeb/5.0.8 ").concat(" UCBrowser/11.6.4.950 "));
        ((WebSettings) c0165m.f577s).getUserAgentString();
        if (c0159g.f688q == null) {
            B4.E e10 = c0159g.f674b;
            int i14 = c0159g.f689r;
            q qVar = new q(i12);
            qVar.f163b = i14;
            qVar.f164c = e10;
            qVar.f165d = e10.f627f;
            c0159g.f688q = qVar;
        }
        p212w.e eVar = c0159g.f679g;
        int i15 = eVar.f15506u;
        if (!eVar.isEmpty()) {
            q qVar2 = c0159g.f688q;
            p212w.e eVar2 = c0159g.f679g;
            int i16 = qVar2.f163b;
            B4.E e11 = (B4.E) qVar2.f164c;
            if (i16 == 2) {
                int i17 = e11.f629h;
            }
            Iterator it = ((i0) eVar2.entrySet()).iterator();
            while (true) {
                p212w.c cVar = (p212w.c) it;
                if (!cVar.hasNext()) {
                    break;
                }
                cVar.next();
                Object value = cVar.getValue();
                if (e11.f629h != i13) {
                    Method[] methods = value.getClass().getMethods();
                    int length = methods.length;
                    int i18 = 0;
                    i10 = 0;
                    while (true) {
                        if (i18 >= length) {
                            i11 = i12;
                            break;
                        }
                        i11 = i12;
                        for (Annotation annotation : methods[i18].getAnnotations()) {
                            if (annotation instanceof JavascriptInterface) {
                                i10 = i11;
                                break;
                            }
                        }
                        if (i10 != 0) {
                            break;
                        }
                        i18++;
                        i12 = i11;
                    }
                } else {
                    i10 = i12;
                    i11 = i10;
                }
                if (i10 == 0) {
                    throw new JsInterfaceObjectException("This object has not offer method javascript to call ,please check addJavascriptInterface annotation was be added");
                }
                String str2 = (String) cVar.getKey();
                Objects.toString(value);
                String str3 = AbstractC0162j.a;
                ((WebView) qVar2.f165d).addJavascriptInterface(value, str2);
                i12 = i11;
                i13 = 2;
            }
        }
        int i19 = i12;
        B1.a aVar = c0159g.f680h;
        if (aVar != null) {
            aVar.S0(c0159g.f674b.f627f);
            B1.a aVar2 = c0159g.f680h;
            B4.E e12 = c0159g.f674b;
            WebView webView2 = e12.f627f;
            r rVar = c0159g.f676d;
            if (rVar == null) {
                rVar = new r(3, z6);
                rVar.f167t = e12.f626e;
            }
            c0159g.f676d = rVar;
            C0157e c0157e = c0159g.f684m;
            Activity activity = c0159g.a;
            if (c0157e == null) {
                WebView webView3 = e12.f627f;
                c0157e = new C0157e(i19);
                c0157e.f668e = null;
                c0157e.f669f = null;
                c0157e.f670g = null;
                c0157e.f665b = activity;
                c0157e.f667d = webView3;
                c0157e.f668e = new HashSet();
            }
            c0159g.f684m = c0157e;
            WebView webView4 = e12.f627f;
            C0168p c0168p = new C0168p(0);
            c0168p.f696b = null;
            c0168p.f700f = null;
            c0168p.f701g = null;
            c0168p.f702h = null;
            c0168p.j = new p040e1.j(c0168p, 3);
            c0168p.f703i = rVar;
            c0168p.f697c = false;
            c0168p.f696b = new WeakReference(activity);
            c0168p.f698d = c0157e;
            c0168p.f699e = webView4;
            c0168p.f702h = new WeakReference(AbstractC0158f.c(webView4));
            B4.J j = c0159g.f677e;
            Objects.toString(j);
            String str4 = AbstractC0162j.a;
            if (j != null) {
                j.a = null;
            } else {
                j = null;
            }
            if (j != null) {
                j.a = c0168p;
                c0168p = j;
            }
            aVar2.getClass();
            webView2.setWebChromeClient(c0168p);
            B1.a aVar3 = c0159g.f680h;
            WebView webView5 = c0159g.f674b.f627f;
            B4.D d3 = new B4.D();
            d3.f614b = null;
            d3.f615c = true;
            d3.f616d = 250;
            d3.f617e = true;
            d3.f618f = null;
            d3.f620h = null;
            d3.j = new HashSet();
            d3.f622k = new HashSet();
            d3.f619g = webView5;
            d3.f614b = new WeakReference(c0159g.a);
            d3.f615c = c0159g.f685n;
            d3.f618f = new WeakReference(AbstractC0158f.c(webView5));
            d3.f617e = c0159g.f686o;
            int i20 = c0159g.f687p;
            if (i20 <= 0) {
                d3.f616d = 250;
            } else {
                d3.f616d = i20;
            }
            Q q11 = c0159g.f678f;
            if (q11 != null) {
                q11.a = null;
                q10 = q11;
            } else {
                q10 = null;
            }
            if (q10 != null) {
                q10.a = d3;
                d3 = q10;
            }
            aVar3.getClass();
            webView5.setWebViewClient(d3);
        }
        this.f75t = true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    @Override // p091j3.E
    public B0 k(View view, B0 b3, T6.k kVar) {
        boolean z6;
        y0 y0Var = b3.a;
        L.c cVarF = y0Var.f(7);
        L.c cVarF2 = y0Var.f(32);
        int i10 = cVarF.f2712b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f76u;
        bottomSheetBehavior.f9502O = i10;
        boolean zH = p091j3.C.h(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (bottomSheetBehavior.f9494G) {
            int iA = b3.a();
            bottomSheetBehavior.f9501N = iA;
            paddingBottom = iA + kVar.f4696d;
        }
        boolean z10 = bottomSheetBehavior.f9495H;
        int i11 = cVarF.a;
        if (z10) {
            paddingLeft = (zH ? kVar.f4695c : kVar.a) + i11;
        }
        boolean z11 = bottomSheetBehavior.f9496I;
        int i12 = cVarF.f2713c;
        if (z11) {
            paddingRight = (zH ? kVar.a : kVar.f4695c) + i12;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z12 = true;
        if (!bottomSheetBehavior.f9498K || marginLayoutParams.leftMargin == i11) {
            z6 = false;
        } else {
            marginLayoutParams.leftMargin = i11;
            z6 = true;
        }
        if (bottomSheetBehavior.f9499L && marginLayoutParams.rightMargin != i12) {
            marginLayoutParams.rightMargin = i12;
            z6 = true;
        }
        if (bottomSheetBehavior.f9500M) {
            int i13 = marginLayoutParams.topMargin;
            int i14 = cVarF.f2712b;
            if (i13 != i14) {
                marginLayoutParams.topMargin = i14;
            } else {
                z12 = z6;
            }
        } else {
            z12 = z6;
        }
        if (z12) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z13 = this.f75t;
        if (z13) {
            bottomSheetBehavior.f9492E = cVarF2.f2714d;
        }
        if (!bottomSheetBehavior.f9494G && !z13) {
            return b3;
        }
        bottomSheetBehavior.P();
        return b3;
    }

    @Override // p136o.w
    public boolean l(p136o.l lVar) {
        ((M) this.f76u).f11984c.onMenuOpened(108, lVar);
        return true;
    }

    public synchronized void m(F f10, boolean z6) {
        try {
            if (this.f75t || z6) {
                ((Handler) this.f76u).obtainMessage(1, f10).sendToTarget();
            } else {
                this.f75t = true;
                f10.c();
                this.f75t = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // J7.k
    public void onError(Throwable th) {
        if (!this.f75t) {
            ((J7.k) this.f76u).onError(th);
            return;
        }
        AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
        assertionError.initCause(th);
        J7.j.y(assertionError);
    }

    public String toString() {
        switch (this.f74s) {
            case 9:
                return this.f75t ? "FALL_THROUGH" : String.valueOf(this.f76u);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ J(Object obj, int i10) {
        this.f74s = i10;
        this.f76u = obj;
    }

    public /* synthetic */ J(Object obj, boolean z6, int i10) {
        this.f74s = i10;
        this.f76u = obj;
        this.f75t = z6;
    }

    public J() {
        this.f74s = 0;
        this.f76u = new Handler(Looper.getMainLooper(), new I(0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public J(S.j jVar, boolean z6) {
        this(jVar, 5);
        this.f74s = 5;
        this.f75t = z6;
    }

    public J(boolean z6, String str) {
        this.f74s = 2;
        this.f75t = z6;
        this.f76u = str;
    }

    public J(StringBuilder sb) {
        this.f74s = 3;
        this.f76u = sb;
        this.f75t = true;
    }
}
