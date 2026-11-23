package A1;

import B4.C0157e;
import B4.C0159g;
import E4.C0204s;
import E4.C0205t;
import H1.C0235d;
import L8.InterfaceC0274h;
import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.MainActivity;
import com.onesignal.core.activities.PermissionsActivity;
import com.rollbar.notifier.sender.SyncSender;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import p188t1.Y;

/* JADX INFO: renamed from: A1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0099h implements M1.a, M3.b, M3.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f102s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f103t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f104u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f105v;

    public /* synthetic */ C0099h(int i10, boolean z6) {
        this.f102s = i10;
    }

    public static String c(String str, HashMap map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), SyncSender.UTF_8) : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), SyncSender.UTF_8) : "");
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                string = "&".concat(string);
            }
            return p231y.a.c(str, string);
        }
        return str + "?" + string;
    }

    public static C0099h i(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_chat, (ViewGroup) null, false);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
        int i10 = R.id.toolbar;
        MaterialToolbar materialToolbar = (MaterialToolbar) oa.b.c(viewInflate, R.id.toolbar);
        if (materialToolbar != null) {
            i10 = R.id.webLayout;
            RelativeLayout relativeLayout = (RelativeLayout) oa.b.c(viewInflate, R.id.webLayout);
            if (relativeLayout != null) {
                return new C0099h(coordinatorLayout, materialToolbar, relativeLayout, 11);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    public static C0099h j(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_activity_posts_download, (ViewGroup) null, false);
        int i10 = R.id.cg_download_link;
        ChipGroup chipGroup = (ChipGroup) oa.b.c(viewInflate, R.id.cg_download_link);
        if (chipGroup != null) {
            i10 = R.id.tv_download_size;
            MaterialTextView materialTextView = (MaterialTextView) oa.b.c(viewInflate, R.id.tv_download_size);
            if (materialTextView != null) {
                return new C0099h((ScrollView) viewInflate, chipGroup, materialTextView, 12);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    public static C0099h k(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_activity_searchbygenre, (ViewGroup) null, false);
        int i10 = R.id.bt_search;
        MaterialButton materialButton = (MaterialButton) oa.b.c(viewInflate, R.id.bt_search);
        if (materialButton != null) {
            i10 = R.id.cg_genre;
            ChipGroup chipGroup = (ChipGroup) oa.b.c(viewInflate, R.id.cg_genre);
            if (chipGroup != null) {
                i10 = R.id.tv_genre;
                if (((MaterialTextView) oa.b.c(viewInflate, R.id.tv_genre)) != null) {
                    return new C0099h((ScrollView) viewInflate, materialButton, chipGroup, 13);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // M3.b
    public void E(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f105v;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // M1.a
    public F a(F f10, p232y1.h hVar) {
        Drawable drawable = (Drawable) f10.get();
        if (drawable instanceof BitmapDrawable) {
            return ((l) this.f104u).a(C0235d.d((B1.b) this.f103t, ((BitmapDrawable) drawable).getBitmap()), hVar);
        }
        if (drawable instanceof L1.c) {
            return ((M1.d) this.f105v).a(f10, hVar);
        }
        return null;
    }

    public Object b() {
        Object objA = ((T.d) this.f105v).a();
        if (objA == null) {
            objA = ((V1.a) this.f103t).o();
            if (Log.isLoggable("FactoryPools", 2)) {
                objA.getClass().toString();
            }
        }
        if (objA instanceof V1.b) {
            ((V1.b) objA).g().a = false;
        }
        return objA;
    }

    public Bitmap d(BitmapFactory.Options options) {
        switch (this.f102s) {
            case 5:
                return BitmapFactory.decodeStream(new U1.a(U1.b.c((ByteBuffer) this.f103t)), null, options);
            case 6:
                H1.w wVar = (H1.w) ((com.bumptech.glide.load.data.h) this.f103t).f7652t;
                wVar.reset();
                return BitmapFactory.decodeStream(wVar, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.h) this.f105v).e().getFileDescriptor(), null, options);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    public S3.a e() throws Throwable {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            try {
                String strC = c((String) this.f103t, (HashMap) this.f104u);
                try {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    httpsURLConnection = (HttpsURLConnection) new URL(strC).openConnection();
                    try {
                        httpsURLConnection.setReadTimeout(10000);
                        httpsURLConnection.setConnectTimeout(10000);
                        httpsURLConnection.setRequestMethod("GET");
                        for (Map.Entry entry : ((HashMap) this.f105v).entrySet()) {
                            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        httpsURLConnection.connect();
                        int responseCode = httpsURLConnection.getResponseCode();
                        InputStream inputStream2 = httpsURLConnection.getInputStream();
                        if (inputStream2 != null) {
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, SyncSender.UTF_8));
                                char[] cArr = new char[8192];
                                StringBuilder sb = new StringBuilder();
                                while (true) {
                                    int i10 = bufferedReader.read(cArr);
                                    if (i10 == -1) {
                                        break;
                                    }
                                    sb.append(cArr, 0, i10);
                                }
                                string = sb.toString();
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = inputStream2;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                throw th;
                            }
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        httpsURLConnection.disconnect();
                        return new S3.a(responseCode, string);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    httpsURLConnection = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                httpsURLConnection = null;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public ImageHeaderParser$ImageType f() throws Throwable {
        switch (this.f102s) {
            case 5:
                return Y.o((ArrayList) this.f104u, U1.b.c((ByteBuffer) this.f103t));
            case 6:
                H1.w wVar = (H1.w) ((com.bumptech.glide.load.data.h) this.f103t).f7652t;
                wVar.reset();
                return Y.n((ArrayList) this.f105v, wVar, (B1.g) this.f104u);
            default:
                com.bumptech.glide.load.data.h hVar = (com.bumptech.glide.load.data.h) this.f105v;
                B1.g gVar = (B1.g) this.f103t;
                ArrayList arrayList = (ArrayList) this.f104u;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    p232y1.d dVar = (p232y1.d) arrayList.get(i10);
                    H1.w wVar2 = null;
                    try {
                        H1.w wVar3 = new H1.w(new FileInputStream(hVar.e().getFileDescriptor()), gVar);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeD = dVar.d(wVar3);
                            wVar3.b();
                            hVar.e();
                            if (imageHeaderParser$ImageTypeD != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeD;
                            }
                        } catch (Throwable th) {
                            th = th;
                            wVar2 = wVar3;
                            if (wVar2 != null) {
                                wVar2.b();
                            }
                            hVar.e();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public void g(String str, String str2) {
        ((HashMap) this.f105v).put(str, str2);
    }

    public W6.a h() {
        if (((W6.a) this.f103t) == null) {
            this.f103t = new W6.a();
        }
        return (W6.a) this.f103t;
    }

    public void l(Activity activity, RelativeLayout relativeLayout, String str) {
        p210v8.i.f(str, "url");
        try {
            p040e1.j jVarK = C0159g.a(activity).m(relativeLayout, new LinearLayout.LayoutParams(-1, -1)).K(D3.b.m(activity, R.attr.colorSurface));
            C0157e c0157e = (C0157e) jVarK.f10697t;
            c0157e.f670g = new K4.e(this, activity);
            c0157e.f669f = new E4.r(1);
            c0157e.f671h = new C0205t(1);
            J jH = jVarK.H();
            jH.j();
            C0159g c0159gH = jH.h(str);
            this.f103t = c0159gH;
            c0159gH.f674b.f627f.setBackgroundColor(D3.b.m(activity, R.attr.colorSurface));
            C0159g c0159g = (C0159g) this.f103t;
            if (c0159g == null) {
                p210v8.i.n("browser");
                throw null;
            }
            WebSettings webSettings = (WebSettings) c0159g.f675c.f577s;
            webSettings.setSupportMultipleWindows(true);
            webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
            webSettings.setJavaScriptEnabled(true);
            webSettings.setLoadWithOverviewMode(true);
            webSettings.setUseWideViewPort(true);
            webSettings.setDomStorageEnabled(true);
            webSettings.setAllowContentAccess(false);
            webSettings.setAllowFileAccess(false);
            webSettings.setDatabaseEnabled(false);
            webSettings.setNeedInitialFocus(true);
            webSettings.setAllowUniversalAccessFromFileURLs(false);
            webSettings.setAllowFileAccessFromFileURLs(false);
            String userAgentString = webSettings.getUserAgentString();
            p210v8.i.c(userAgentString);
            webSettings.setUserAgentString(L9.n.G(L9.n.G(L9.n.G(L9.n.G(userAgentString, "; wv", ""), " UCBrowser/11.6.4.950 ", ""), " MQQBrowser/8.0 ", ""), " AgentWeb/5.0.8 ", ""));
        } catch (Exception unused) {
        }
    }

    public void m(Activity activity, RelativeLayout relativeLayout, String str) {
        p210v8.i.f(str, "url");
        try {
            p040e1.j jVarK = C0159g.a(activity).m(relativeLayout, new LinearLayout.LayoutParams(-1, -1)).K(D3.b.m(activity, R.attr.colorSurface));
            C0157e c0157e = (C0157e) jVarK.f10697t;
            c0157e.f670g = new K4.e(this, activity);
            c0157e.f669f = new E4.r(1);
            c0157e.f671h = new C0205t(1);
            J jH = jVarK.H();
            jH.j();
            C0159g c0159gH = jH.h(str);
            this.f104u = c0159gH;
            c0159gH.f674b.f627f.setBackgroundColor(D3.b.m(activity, R.attr.colorSurface));
            C0159g c0159g = (C0159g) this.f104u;
            if (c0159g == null) {
                p210v8.i.n("browser2");
                throw null;
            }
            WebSettings webSettings = (WebSettings) c0159g.f675c.f577s;
            webSettings.setSupportMultipleWindows(true);
            webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
            webSettings.setJavaScriptEnabled(true);
            webSettings.setLoadWithOverviewMode(true);
            webSettings.setDomStorageEnabled(true);
            webSettings.setAllowContentAccess(false);
            webSettings.setAllowFileAccess(false);
            webSettings.setDatabaseEnabled(false);
            webSettings.setNeedInitialFocus(true);
            String userAgentString = webSettings.getUserAgentString();
            p210v8.i.c(userAgentString);
            webSettings.setUserAgentString(L9.n.G(L9.n.G(L9.n.G(L9.n.G(userAgentString, "; wv", ""), " UCBrowser/11.6.4.950 ", ""), " MQQBrowser/8.0 ", ""), " AgentWeb/5.0.8 ", ""));
        } catch (Exception unused) {
        }
    }

    public void n(Activity activity, String str) {
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.dialog_full_screen, (ViewGroup) null, false);
        int i10 = R.id.button_close;
        Button button = (Button) oa.b.c(viewInflate, R.id.button_close);
        if (button != null) {
            i10 = R.id.button_open_browser;
            Button button2 = (Button) oa.b.c(viewInflate, R.id.button_open_browser);
            if (button2 != null) {
                i10 = R.id.countdown_timer;
                MaterialTextView materialTextView = (MaterialTextView) oa.b.c(viewInflate, R.id.countdown_timer);
                if (materialTextView != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                    int i11 = R.id.layout_button;
                    LinearLayout linearLayout = (LinearLayout) oa.b.c(viewInflate, R.id.layout_button);
                    if (linearLayout != null) {
                        i11 = R.id.webview;
                        RelativeLayout relativeLayout = (RelativeLayout) oa.b.c(viewInflate, R.id.webview);
                        if (relativeLayout != null) {
                            o1.m mVar = new o1.m();
                            mVar.f13641s = button;
                            mVar.f13642t = button2;
                            mVar.f13643u = materialTextView;
                            mVar.f13644v = linearLayout;
                            Dialog dialog = new Dialog(activity, R.style.AppTheme);
                            dialog.setContentView(coordinatorLayout);
                            dialog.setCancelable(false);
                            dialog.show();
                            Window window = dialog.getWindow();
                            if (window != null) {
                                window.setLayout(-1, -1);
                            }
                            p040e1.j jVarK = C0159g.a(activity).m(relativeLayout, new LinearLayout.LayoutParams(-1, -1)).K(D3.b.m(activity, R.attr.colorPrimaryDark));
                            ((C0157e) jVarK.f10697t).f670g = new C0204s(this, 1);
                            J jH = jVarK.H();
                            jH.j();
                            C0159g c0159gH = jH.h(str);
                            WebSettings webSettings = (WebSettings) c0159gH.f675c.f577s;
                            webSettings.setAllowContentAccess(true);
                            webSettings.setSupportMultipleWindows(true);
                            webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                            webSettings.setJavaScriptEnabled(true);
                            webSettings.setLoadWithOverviewMode(true);
                            webSettings.setUseWideViewPort(true);
                            webSettings.setDomStorageEnabled(true);
                            webSettings.setUseWideViewPort(true);
                            webSettings.setDatabaseEnabled(true);
                            webSettings.setLoadsImagesAutomatically(true);
                            webSettings.setNeedInitialFocus(true);
                            webSettings.setUseWideViewPort(true);
                            String userAgentString = webSettings.getUserAgentString();
                            p210v8.i.c(userAgentString);
                            webSettings.setUserAgentString(L9.n.G(L9.n.G(L9.n.G(L9.n.G(userAgentString, "; wv", ""), " UCBrowser/11.6.4.950 ", ""), " MQQBrowser/8.0 ", ""), " AgentWeb/5.0.8 ", ""));
                            new K4.c(mVar, c0159gH, dialog, this, activity).start();
                            return;
                        }
                    }
                    i10 = i11;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    public boolean o(int i10, B.d dVar, E.f fVar) {
        int[] iArr = dVar.f481p0;
        int i11 = iArr[0];
        C.b bVar = (C.b) this.f104u;
        bVar.a = i11;
        bVar.f803b = iArr[1];
        bVar.f804c = dVar.q();
        bVar.f805d = dVar.k();
        bVar.f810i = false;
        bVar.j = i10;
        boolean z6 = bVar.a == 3;
        boolean z10 = bVar.f803b == 3;
        boolean z11 = z6 && dVar.f450W > 0.0f;
        boolean z12 = z10 && dVar.f450W > 0.0f;
        int[] iArr2 = dVar.f485t;
        if (z11 && iArr2[0] == 4) {
            bVar.a = 1;
        }
        if (z12 && iArr2[1] == 4) {
            bVar.f803b = 1;
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f806e);
        dVar.L(bVar.f807f);
        dVar.f433E = bVar.f809h;
        dVar.I(bVar.f808g);
        bVar.j = 0;
        return bVar.f810i;
    }

    public void p(R6.a aVar) {
        ((C0099h) ((C0099h) this.f103t).f104u).f103t = aVar;
        ((O6.b) this.f105v).invalidate();
    }

    public boolean q(Object obj) {
        if (obj instanceof V1.b) {
            ((V1.b) obj).g().a = true;
        }
        ((V1.c) this.f104u).b(obj);
        return ((T.d) this.f105v).c(obj);
    }

    public void r(B.e eVar, int i10, int i11, int i12) {
        eVar.getClass();
        int i13 = eVar.f456b0;
        int i14 = eVar.c0;
        eVar.f456b0 = 0;
        eVar.c0 = 0;
        eVar.O(i11);
        eVar.L(i12);
        if (i13 < 0) {
            eVar.f456b0 = 0;
        } else {
            eVar.f456b0 = i13;
        }
        if (i14 < 0) {
            eVar.c0 = 0;
        } else {
            eVar.c0 = i14;
        }
        B.e eVar2 = (B.e) this.f105v;
        eVar2.f507t0 = i10;
        eVar2.U();
    }

    public void u(B.e eVar) {
        ArrayList arrayList = (ArrayList) this.f103t;
        arrayList.clear();
        int size = eVar.f504q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            B.d dVar = (B.d) eVar.f504q0.get(i10);
            int[] iArr = dVar.f481p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f506s0.f813b = true;
    }

    @Override // M3.a
    public void z(Bundle bundle) {
        synchronized (this.f104u) {
            Objects.toString(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            this.f105v = new CountDownLatch(1);
            ((p040e1.j) this.f103t).z(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                if (((CountDownLatch) this.f105v).await(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, TimeUnit.MILLISECONDS)) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                } else {
                    Log.w("FirebaseCrashlytics", "Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                }
            } catch (InterruptedException unused) {
            }
            this.f105v = null;
        }
    }

    public /* synthetic */ C0099h(Object obj, Object obj2, Object obj3, int i10) {
        this.f102s = i10;
        this.f103t = obj;
        this.f104u = obj2;
        this.f105v = obj3;
    }

    public C0099h(MainActivity mainActivity) {
        this.f102s = 17;
        this.f103t = mainActivity;
        this.f104u = p086i8.l.C("#f48fb1", "#E57373", "#BA68C8", "#7986CB", "#4DB6AC", "#4DD0E1", "#DCE775", "#FFD54F", "#A1887F", "#000000");
        SharedPreferences sharedPreferences = mainActivity.getSharedPreferences("theme", 0);
        this.f105v = sharedPreferences;
        if (sharedPreferences.contains("setTheme")) {
            sharedPreferences.getInt("setTheme", R.style.AppTheme);
        }
    }

    public C0099h(p029c9.d dVar, p040e1.j jVar) {
        this.f102s = 23;
        this.f103t = dVar;
        this.f104u = jVar;
        this.f105v = new ConcurrentHashMap();
    }

    public C0099h(int i10) {
        this.f102s = i10;
        switch (i10) {
            case 29:
                String string = UUID.randomUUID().toString();
                p210v8.i.e(string, "randomUUID().toString()");
                ma.i iVar = ma.i.f13191v;
                this.f103t = p230x9.d.r(string);
                this.f104u = X9.C.f5436e;
                this.f105v = new ArrayList();
                break;
            default:
                this.f105v = "";
                break;
        }
    }

    public C0099h(String str, HashMap map) {
        this.f102s = 24;
        this.f103t = str;
        this.f104u = map;
        this.f105v = new HashMap();
    }

    public C0099h(B8.c cVar, Method[] methodArr, Method method) {
        this.f102s = 4;
        p210v8.i.f(cVar, "argumentRange");
        this.f103t = cVar;
        this.f104u = methodArr;
        this.f105v = method;
    }

    public C0099h(CoordinatorLayout coordinatorLayout, ImageView imageView, Toolbar toolbar, MaterialTextView materialTextView) {
        this.f102s = 9;
        this.f103t = imageView;
        this.f104u = toolbar;
        this.f105v = materialTextView;
    }

    public C0099h(p040e1.j jVar) {
        this.f102s = 21;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f104u = new Object();
        this.f103t = jVar;
    }

    private final void s() {
    }

    private final void t() {
    }

    public C0099h(InterfaceC0274h interfaceC0274h, List list, C0099h c0099h) {
        this.f102s = 18;
        p210v8.i.f(interfaceC0274h, "classifierDescriptor");
        p210v8.i.f(list, "arguments");
        this.f103t = interfaceC0274h;
        this.f104u = list;
        this.f105v = c0099h;
    }

    public C0099h(Runnable runnable) {
        this.f102s = 25;
        this.f104u = new CopyOnWriteArrayList();
        this.f105v = new HashMap();
        this.f103t = runnable;
    }

    public C0099h(B.e eVar) {
        this.f102s = 3;
        this.f103t = new ArrayList();
        this.f104u = new C.b();
        this.f105v = eVar;
    }

    public C0099h(T.d dVar, V1.a aVar, V1.c cVar) {
        this.f102s = 27;
        this.f105v = dVar;
        this.f103t = aVar;
        this.f104u = cVar;
    }

    public C0099h(U1.k kVar, ArrayList arrayList, B1.g gVar) {
        this.f102s = 6;
        U1.f.c(gVar, "Argument must not be null");
        this.f104u = gVar;
        U1.f.c(arrayList, "Argument must not be null");
        this.f105v = arrayList;
        this.f103t = new com.bumptech.glide.load.data.h(kVar, gVar);
    }

    public C0099h(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, B1.g gVar) {
        this.f102s = 7;
        U1.f.c(gVar, "Argument must not be null");
        this.f103t = gVar;
        U1.f.c(arrayList, "Argument must not be null");
        this.f104u = arrayList;
        this.f105v = new com.bumptech.glide.load.data.h(parcelFileDescriptor);
    }

    public C0099h(t tVar, Q1.f fVar, x xVar) {
        this.f102s = 2;
        this.f105v = tVar;
        this.f104u = fVar;
        this.f103t = xVar;
    }
}
