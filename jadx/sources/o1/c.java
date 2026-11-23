package o1;

import A9.K;
import B4.AbstractC0158f;
import B4.AbstractC0162j;
import C8.InterfaceC0175c;
import H1.z;
import M2.I;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.core.content.FileProvider;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.InterfaceC0578k;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.measurement.internal.zzmh;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.kcstream.cing.MainApp;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p047e9.J;
import p047e9.L;
import p086i8.C;
import p106l0.s;
import p106l0.u;
import p188t1.C0844g;
import p188t1.N;
import zlc.season.claritypotion.ClarityPotion;

/* JADX INFO: loaded from: classes.dex */
public class c implements L4.a, SuccessContinuation, J7.k, ua.a, J7.p, InterfaceC0578k, p067g9.f, k2.b, p106l0.k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13622s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f13623t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f13624u;

    public /* synthetic */ c(int i10, boolean z6) {
        this.f13622s = i10;
    }

    public static K o(List list) {
        return list.isEmpty() ? K.f339u : new K(list);
    }

    public static z p(ImageDecoder.Source source, int i10, int i11, p232y1.h hVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new G1.b(i10, i11, hVar));
        if (C0.m.x(drawableDecodeDrawable)) {
            return new z(C0.m.h(drawableDecodeDrawable), 2);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + drawableDecodeDrawable);
    }

    @Override // J7.k
    public void a() {
        ((J7.f) this.f13623t).a();
    }

    @Override // J7.k
    public void b(L7.b bVar) {
        switch (this.f13622s) {
            case 10:
                this.f13624u = bVar;
                ((J7.f) this.f13623t).c(this);
                break;
            default:
                ((J7.p) this.f13623t).b(bVar);
                break;
        }
    }

    @Override // J7.p
    public void c(Object obj) {
        try {
            Object objApply = ((V.h) this.f13624u).apply(obj);
            P7.a.a(objApply, "The mapper function returned a null value.");
            ((J7.p) this.f13623t).c(objApply);
        } catch (Throwable th) {
            p068ga.l.n(th);
            onError(th);
        }
    }

    @Override // ua.a
    public void cancel() {
        ((L7.b) this.f13624u).f();
    }

    @Override // J7.k
    public void d(Object obj) {
        ((J7.f) this.f13623t).d(obj);
    }

    @Override // L4.a
    public void e() {
        h hVar = (h) this.f13623t;
        ((ProgressBar) hVar.f13633t).setIndeterminate(false);
        ((ProgressBar) hVar.f13633t).setProgress(0);
        ((ProgressBar) hVar.f13633t).setMax(100);
    }

    @Override // L4.a
    public void g(int i10) {
        ((ProgressBar) ((h) this.f13623t).f13633t).setProgress(i10);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new p090j2.f((Context) ((V.h) this.f13623t).f5078t, (p090j2.d) ((p090j2.e) this.f13624u).get());
    }

    @Override // p106l0.k
    public Object getResult() {
        return (u) this.f13623t;
    }

    @Override // p067g9.f
    public String getString(int i10) {
        String str = (String) ((L) this.f13623t).f10832t.get(i10);
        p210v8.i.e(str, "strings.getString(index)");
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0578k
    public zzh h(zzaq zzaqVar) {
        String str = (String) this.f13624u;
        zzh zzhVar = (zzh) this.f13623t;
        zzhVar.e(str, zzaqVar);
        return zzhVar;
    }

    @Override // L4.a
    public void i(File file) {
        ((X2.h) this.f13624u).dismiss();
        String path = file.getPath();
        p210v8.i.e(path, "getPath(...)");
        Intent intent = new Intent("android.intent.action.VIEW");
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
            Context context = ClarityPotion.f16351s;
            Uri uriD = FileProvider.d(C.h(), "com.kcstream.cing.provider", new File(path));
            p210v8.i.e(uriD, "getUriForFile(...)");
            intent.setDataAndType(uriD, "application/vnd.android.package-archive");
        } else {
            intent.setDataAndType(Uri.fromFile(new File(path)), "application/vnd.android.package-archive");
        }
        intent.addFlags(268435456);
        Context context2 = ClarityPotion.f16351s;
        C.h().startActivity(intent);
        Activity activityG = C.g();
        if (activityG != null) {
            activityG.finishAndRemoveTask();
        }
    }

    @Override // p067g9.f
    public boolean j(int i10) {
        return ((Boolean) v(i10).f11801u).booleanValue();
    }

    @Override // p106l0.k
    public boolean k(CharSequence charSequence, int i10, int i11, p106l0.r rVar) {
        if ((rVar.f12884c & 4) > 0) {
            return true;
        }
        if (((u) this.f13623t) == null) {
            this.f13623t = new u(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((za.c) this.f13624u).getClass();
        ((u) this.f13623t).setSpan(new s(rVar), i10, i11, 33);
        return true;
    }

    @Override // L4.a
    public void l(String str) {
        p210v8.i.f(str, "error");
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task m(Object obj) {
        return ((O3.o) this.f13624u).f3546e.u(new I(this, 3, (Boolean) obj));
    }

    @Override // p067g9.f
    public String n(int i10) {
        p076h8.k kVarV = v(i10);
        List list = (List) kVarV.f11799s;
        String strZ = p086i8.k.Z((List) kVarV.f11800t, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strZ;
        }
        return p086i8.k.Z(list, "/", null, null, null, 62) + '/' + strZ;
    }

    @Override // J7.k
    public void onError(Throwable th) {
        switch (this.f13622s) {
            case 10:
                ((J7.f) this.f13623t).onError(th);
                break;
            default:
                ((J7.p) this.f13623t).onError(th);
                break;
        }
    }

    public ArrayList q(String str) {
        K0.o oVarC = K0.o.c(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            oVarC.v(1);
        } else {
            oVarC.m(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13623t;
        workDatabase_Impl.b();
        Cursor cursorM = workDatabase_Impl.m(oVarC);
        try {
            ArrayList arrayList = new ArrayList(cursorM.getCount());
            while (cursorM.moveToNext()) {
                arrayList.add(cursorM.isNull(0) ? null : cursorM.getString(0));
            }
            return arrayList;
        } finally {
            cursorM.close();
            oVarC.g();
        }
    }

    public int r(InterfaceC0175c interfaceC0175c) {
        int iIntValue;
        p210v8.i.f(interfaceC0175c, "kClass");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f13623t;
        String strS = interfaceC0175c.s();
        p210v8.i.c(strS);
        A0.m mVar = new A0.m(this, 7);
        p210v8.i.f(concurrentHashMap, "<this>");
        Integer num = (Integer) concurrentHashMap.get(strS);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(strS);
                if (num2 == null) {
                    Object objInvoke = mVar.invoke(strS);
                    concurrentHashMap.putIfAbsent(strS, Integer.valueOf(((Number) objInvoke).intValue()));
                    num2 = (Integer) objInvoke;
                }
                iIntValue = num2.intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public void s(String str) {
        Map eVar;
        p040e1.j jVar = (p040e1.j) this.f13624u;
        jVar.getClass();
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            str2 = str;
        } else {
            try {
                Uri uri = Uri.parse(str);
                if (!TextUtils.isEmpty(uri.getScheme()) && !TextUtils.isEmpty(uri.getAuthority())) {
                    str2 = uri.getScheme() + "://" + uri.getAuthority();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        p212w.e eVar2 = (p212w.e) jVar.f10697t;
        if (eVar2.get(str2) == null) {
            eVar = new p212w.e(0);
            eVar2.put(str2, eVar);
        } else {
            eVar = (Map) eVar2.get(str2);
        }
        t(str, eVar);
    }

    public void t(String str, Map map) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            B4.I i10 = new B4.I(this, str, map, 0);
            if (AbstractC0158f.f672b == null) {
                AbstractC0158f.f672b = new Handler(Looper.getMainLooper());
            }
            AbstractC0158f.f672b.post(i10);
            return;
        }
        Objects.toString(map);
        String str2 = AbstractC0162j.a;
        WebView webView = (WebView) this.f13623t;
        if (map == null || map.isEmpty()) {
            webView.loadUrl(str);
        } else {
            webView.loadUrl(str, map);
        }
    }

    public void u(R.f fVar) {
        int i10 = fVar.f4421b;
        Handler handler = (Handler) this.f13624u;
        A1.r rVar = (A1.r) this.f13623t;
        if (i10 != 0) {
            handler.post(new R.a(i10, 0, rVar));
        } else {
            handler.post(new P2.g(rVar, 1, fVar.a));
        }
    }

    public p076h8.k v(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z6 = false;
        while (i10 != -1) {
            J j = (J) ((p047e9.K) this.f13624u).f10826t.get(i10);
            String str = (String) ((L) this.f13623t).f10832t.get(j.f10819v);
            p047e9.I i11 = j.f10820w;
            p210v8.i.c(i11);
            int iOrdinal = i11.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else if (iOrdinal == 2) {
                linkedList2.addFirst(str);
                z6 = true;
            }
            i10 = j.f10818u;
        }
        return new p076h8.k(linkedList, linkedList2, Boolean.valueOf(z6));
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.f13622s = i10;
        this.f13623t = obj;
        this.f13624u = null;
    }

    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        this.f13622s = i10;
        this.f13623t = obj;
        this.f13624u = obj2;
    }

    public c(zzmh zzmhVar) {
        this.f13622s = 7;
        this.f13624u = zzmhVar;
    }

    public c(MainApp mainApp) {
        this.f13622s = 18;
        this.f13623t = new N(mainApp);
        this.f13624u = new C0844g(mainApp, C.a(C.c("3463B8DA0FE6FA829E630A1A954C78")), C0844g.f15035d);
    }

    public c(L l4, p047e9.K k3) {
        this.f13622s = 14;
        p210v8.i.f(l4, "strings");
        p210v8.i.f(k3, "qualifiedNames");
        this.f13623t = l4;
        this.f13624u = k3;
    }

    public c(WorkDatabase_Impl workDatabase_Impl) {
        this.f13622s = 0;
        this.f13623t = workDatabase_Impl;
        this.f13624u = new b(workDatabase_Impl, 0);
    }

    public c(J7.f fVar) {
        this.f13622s = 10;
        this.f13623t = fVar;
    }

    public c(int i10) {
        this.f13622s = i10;
        switch (i10) {
            case 19:
                this.f13623t = new HashMap();
                this.f13624u = null;
                break;
            default:
                this.f13623t = new ConcurrentHashMap();
                this.f13624u = new AtomicInteger(0);
                break;
        }
    }

    public c(Animator animator) {
        this.f13622s = 17;
        this.f13623t = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f13624u = animatorSet;
        animatorSet.play(animator);
    }

    public c(O3.o oVar, P2.f fVar) {
        this.f13622s = 8;
        this.f13624u = oVar;
        this.f13623t = fVar;
    }

    @Override // ua.a
    public void f(long j) {
    }
}
