package A1;

import B4.C0157e;
import E1.C0180b;
import E1.C0181c;
import E1.InterfaceC0179a;
import F8.L;
import F8.X;
import F8.a0;
import F8.d0;
import F8.p0;
import J0.O;
import L8.InterfaceC0278l;
import L8.InterfaceC0285t;
import M2.C0313w;
import M2.InterfaceC0310t;
import O8.AbstractC0354j;
import O8.C0355k;
import O8.M;
import O8.U;
import android.app.ActivityManager;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.google.android.gms.measurement.internal.zzfu;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzim;
import com.google.android.gms.measurement.internal.zzin;
import com.google.android.gms.measurement.internal.zzmh;
import com.google.android.gms.measurement.internal.zznc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import org.chromium.net.UrlRequest;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class r implements V1.a, E1.s, InterfaceC0179a, p232y1.b, W1.h, InterfaceC0278l, H0.d, H1.k, p232y1.f, O, zzfu, InterfaceC0310t, M3.b, N3.a, N1.n, Continuation {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f166s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f167t;

    public /* synthetic */ r(int i10, boolean z6) {
        this.f166s = i10;
    }

    public static String J(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(MediationMetaData.KEY_NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public static r L(String str) {
        return new r((TextUtils.isEmpty(str) || str.length() > 1) ? zzim.UNINITIALIZED : zzin.b(str.charAt(0)), 21);
    }

    @Override // L8.InterfaceC0278l
    public Object A(M m2, Object obj) {
        return B(m2, obj);
    }

    @Override // L8.InterfaceC0278l
    public Object B(InterfaceC0285t interfaceC0285t, Object obj) {
        return new F8.F((F8.D) this.f167t, interfaceC0285t);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object C(Task task) {
        return ((Callable) this.f167t).call();
    }

    @Override // E1.s
    public E1.r D(E1.x xVar) {
        switch (this.f166s) {
            case 5:
                return new C0180b((AssetManager) this.f167t, 0, this);
            default:
                return new C0181c((E1.B) this.f167t, 1);
        }
    }

    @Override // M3.b
    public void E(String str, Bundle bundle) {
        O3.p pVar = (O3.p) this.f167t;
        if (pVar != null) {
            try {
                String str2 = "$A$:" + J(str, bundle);
                O3.r rVar = pVar.a;
                long jCurrentTimeMillis = System.currentTimeMillis() - rVar.f3562d;
                O3.o oVar = rVar.f3565g;
                oVar.getClass();
                oVar.f3546e.t(new O3.m(oVar, jCurrentTimeMillis, str2));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // L8.InterfaceC0278l
    public Object F(O8.K k3, Object obj) {
        p210v8.i.f(k3, "descriptor");
        int i10 = (k3.f3666L != null ? 1 : 0) + (k3.f3667M != null ? 1 : 0);
        boolean z6 = k3.f3672x;
        F8.D d3 = (F8.D) this.f167t;
        if (z6) {
            if (i10 == 0) {
                return new F8.H(d3, k3);
            }
            if (i10 == 1) {
                return new F8.J(d3, k3);
            }
            if (i10 == 2) {
                return new L(d3, k3);
            }
        } else {
            if (i10 == 0) {
                return new X(d3, k3);
            }
            if (i10 == 1) {
                return new a0(d3, k3);
            }
            if (i10 == 2) {
                return new d0(d3, k3);
            }
        }
        throw new p0("Unsupported property: " + k3, 0);
    }

    @Override // L8.InterfaceC0278l
    public Object G(O8.x xVar, Object obj) {
        return null;
    }

    public void H(L0.a... aVarArr) {
        p210v8.i.f(aVarArr, "migrations");
        for (L0.a aVar : aVarArr) {
            int i10 = aVar.a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f167t;
            Integer numValueOf = Integer.valueOf(i10);
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            int i11 = aVar.f2732b;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + aVar);
            }
            treeMap2.put(Integer.valueOf(i11), aVar);
        }
    }

    public void I() {
        WebView webView = (WebView) this.f167t;
        if (webView != null) {
            webView.resumeTimers();
        }
        if (webView != null && Looper.myLooper() == Looper.getMainLooper()) {
            webView.loadUrl("about:blank");
            webView.stopLoading();
            if (webView.getHandler() != null) {
                webView.getHandler().removeCallbacksAndMessages(null);
            }
            webView.removeAllViews();
            ViewGroup viewGroup = (ViewGroup) webView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            webView.setTag(null);
            webView.clearHistory();
            webView.destroy();
        }
    }

    public p040e1.j K(int i10) {
        C0157e c0157e = (C0157e) this.f167t;
        c0157e.getClass();
        c0157e.f666c = i10;
        p040e1.j jVar = new p040e1.j(2, false);
        jVar.f10697t = c0157e;
        return jVar;
    }

    public void M() {
        zzmh zzmhVar = (zzmh) this.f167t;
        zzmhVar.W0();
        C0313w c0313wU0 = zzmhVar.U0();
        zzhj zzhjVar = (zzhj) zzmhVar.f577s;
        zzhjVar.f9120F.getClass();
        if (c0313wU0.c1(System.currentTimeMillis())) {
            zzmhVar.U0().f3134E.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                zzmhVar.i().f9052F.b("Detected application was in foreground");
                zzhjVar.f9120F.getClass();
                P(System.currentTimeMillis());
            }
        }
    }

    public void N(long j) {
        zzmh zzmhVar = (zzmh) this.f167t;
        zzmhVar.W0();
        zzmhVar.d1();
        if (zzmhVar.U0().c1(j)) {
            zzmhVar.U0().f3134E.a(true);
            ((zzhj) zzmhVar.f577s).o().f1();
        }
        zzmhVar.U0().f3138I.b(j);
        if (zzmhVar.U0().f3134E.b()) {
            P(j);
        }
    }

    public boolean O() {
        zzhj zzhjVar = (zzhj) this.f167t;
        if (!TextUtils.isEmpty(zzhjVar.f9141t)) {
            return false;
        }
        zzfw zzfwVar = zzhjVar.f9115A;
        zzhj.g(zzfwVar);
        return zzfwVar.e1(3);
    }

    public void P(long j) {
        zzmh zzmhVar = (zzmh) this.f167t;
        zzmhVar.W0();
        zzhj zzhjVar = (zzhj) zzmhVar.f577s;
        if (zzhjVar.h()) {
            zzmhVar.U0().f3138I.b(j);
            zzhjVar.f9120F.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzfw zzfwVarI = zzmhVar.i();
            zzfwVarI.f9052F.a(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j10 = j / 1000;
            zzmhVar.X0().e1(j, Long.valueOf(j10), "auto", "_sid");
            zzmhVar.U0().f3139J.b(j10);
            zzmhVar.U0().f3134E.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j10);
            zzmhVar.X0().d1(j, bundle, "auto", "_s");
            String strA = zzmhVar.U0().f3144O.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strA);
            zzmhVar.X0().d1(j, bundle2, "auto", "_ssr");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // p232y1.b
    public boolean a(Object obj, File file, p232y1.h hVar) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        B1.g gVar = (B1.g) this.f167t;
        byte[] bArr = (byte[]) gVar.d(65536, byte[].class);
        boolean z6 = false;
        ?? r10 = 0;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i10 = inputStream.read(bArr);
                        r10 = -1;
                        if (i10 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i10);
                    } catch (IOException unused) {
                        fileOutputStream = fileOutputStream2;
                        Log.isLoggable("StreamEncoder", 3);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        gVar.h(bArr);
                        r10 = fileOutputStream;
                    } catch (Throwable th) {
                        th = th;
                        r10 = fileOutputStream2;
                        if (r10 != 0) {
                            try {
                                r10.close();
                            } catch (IOException unused3) {
                            }
                        }
                        gVar.h(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused4) {
                }
                gVar.h(bArr);
                z6 = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused5) {
        }
        return z6;
    }

    @Override // L8.InterfaceC0278l
    public Object b(O8.B b3, Object obj) {
        return null;
    }

    @Override // L8.InterfaceC0278l
    public Object c(C0355k c0355k, Object obj) {
        return B(c0355k, obj);
    }

    @Override // H0.d
    public void d(int i10, Serializable serializable) {
        if (i10 == 6 || i10 == 7 || i10 == 8) {
        }
        ((ProfileInstallReceiver) this.f167t).setResultCode(i10);
    }

    @Override // N3.a
    public void e(O3.p pVar) {
        this.f167t = pVar;
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    @Override // H1.k
    public long f(long j) throws IOException {
        if (j < 0) {
            return 0L;
        }
        long j10 = j;
        while (j10 > 0) {
            InputStream inputStream = (InputStream) this.f167t;
            long jSkip = inputStream.skip(j10);
            if (jSkip > 0) {
                j10 -= jSkip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j10--;
            }
        }
        return j - j10;
    }

    @Override // p232y1.f
    public void g(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f167t)) {
            ((ByteBuffer) this.f167t).position(0);
            messageDigest.update(((ByteBuffer) this.f167t).putInt(num.intValue()).array());
        }
    }

    @Override // L8.InterfaceC0278l
    public Object h(p238y9.q qVar, Object obj) {
        return null;
    }

    @Override // J0.O
    public int i() {
        androidx.recyclerview.widget.w wVar = (androidx.recyclerview.widget.w) this.f167t;
        return wVar.f7133o - wVar.K();
    }

    @Override // L8.InterfaceC0278l
    public Object j(O8.L l4, Object obj) {
        return B(l4, obj);
    }

    @Override // H1.k
    public short k() throws IOException {
        int i10 = ((InputStream) this.f167t).read();
        if (i10 != -1) {
            return (short) i10;
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // L8.InterfaceC0278l
    public Object l(O8.z zVar, Object obj) {
        return null;
    }

    @Override // M2.InterfaceC0310t
    public void m(String str, int i10, IOException iOException, byte[] bArr, Map map) {
        ((zznc) this.f167t).B(true, i10, iOException, bArr);
    }

    @Override // J0.O
    public int n(View view) {
        androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) view.getLayoutParams();
        ((androidx.recyclerview.widget.w) this.f167t).getClass();
        return androidx.recyclerview.widget.w.B(view) - ((ViewGroup.MarginLayoutParams) xVar).leftMargin;
    }

    @Override // V1.a
    public Object o() {
        T3.c cVar = (T3.c) this.f167t;
        return new x((D1.e) cVar.a, (D1.e) cVar.f4657b, (D1.e) cVar.f4658c, (D1.e) cVar.f4659d, (t) cVar.f4660e, (t) cVar.f4661f, (C0099h) cVar.f4662g);
    }

    @Override // E1.InterfaceC0179a
    public com.bumptech.glide.load.data.e p(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.j(assetManager, str, 0);
    }

    @Override // H1.k
    public int q() {
        return (k() << 8) | k();
    }

    @Override // L8.InterfaceC0278l
    public Object s(O8.C c10, Object obj) {
        return null;
    }

    @Override // H1.k
    public int t(int i10, byte[] bArr) throws DefaultImageHeaderParser$Reader$EndOfFileException {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10 && (i12 = ((InputStream) this.f167t).read(bArr, i11, i10 - i11)) != -1) {
            i11 += i12;
        }
        if (i11 == 0 && i12 == -1) {
            throw new DefaultImageHeaderParser$Reader$EndOfFileException();
        }
        return i11;
    }

    public String toString() {
        switch (this.f166s) {
            case 27:
                return super.toString() + "{fragment=" + ((N1.l) this.f167t) + "}";
            case 28:
                return super.toString() + "{fragment=" + ((N1.u) this.f167t) + "}";
            default:
                return super.toString();
        }
    }

    @Override // L8.InterfaceC0278l
    public Object u(AbstractC0354j abstractC0354j, Object obj) {
        return null;
    }

    @Override // J0.O
    public View v(int i10) {
        return ((androidx.recyclerview.widget.w) this.f167t).v(i10);
    }

    @Override // J0.O
    public int w() {
        return ((androidx.recyclerview.widget.w) this.f167t).J();
    }

    @Override // L8.InterfaceC0278l
    public Object x(O8.E e10, Object obj) {
        return null;
    }

    @Override // J0.O
    public int y(View view) {
        androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) view.getLayoutParams();
        ((androidx.recyclerview.widget.w) this.f167t).getClass();
        return androidx.recyclerview.widget.w.E(view) + ((ViewGroup.MarginLayoutParams) xVar).rightMargin;
    }

    @Override // L8.InterfaceC0278l
    public Object z(U u3, Object obj) {
        return null;
    }

    public /* synthetic */ r(Object obj, int i10) {
        this.f166s = i10;
        this.f167t = obj;
    }

    public r(zznc zzncVar, String str) {
        this.f166s = 24;
        this.f167t = zzncVar;
    }

    public r(F8.D d3) {
        this.f166s = 10;
        p210v8.i.f(d3, "container");
        this.f167t = d3;
    }

    public r(RelativeLayout relativeLayout, RecyclerView recyclerView) {
        this.f166s = 14;
        this.f167t = recyclerView;
    }

    public r(RelativeLayout relativeLayout, MaterialButton materialButton, MaterialButton materialButton2, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, MaterialRadioButton materialRadioButton, RadioGroup radioGroup) {
        this.f166s = 15;
        this.f167t = radioGroup;
    }

    public r(int i10) {
        this.f166s = i10;
        switch (i10) {
            case 7:
                this.f167t = new E1.o(500L);
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                this.f167t = ByteBuffer.allocate(4);
                break;
            case 18:
                this.f167t = new LinkedHashMap();
                break;
            default:
                this.f167t = new E1.B(7);
                break;
        }
    }
}
