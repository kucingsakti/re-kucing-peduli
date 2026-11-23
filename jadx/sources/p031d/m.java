package p031d;

import A1.C0099h;
import A1.RunnableC0094c;
import A1.s;
import B6.d;
import I.AbstractActivityC0247k;
import I.C0248l;
import I.K;
import I.L;
import I.M;
import J.i;
import J.j;
import N0.e;
import N0.f;
import N1.t;
import Q3.u0;
import U.InterfaceC0426l;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0519n;
import androidx.lifecycle.G;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0514i;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import p049f.g;
import p078i.AbstractActivityC0655l;
import p156q0.E;
import p195u1.b;
import p200u8.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends AbstractActivityC0247k implements W, InterfaceC0514i, f, y, g, i, j, K, L, InterfaceC0426l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final b f10457A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final g f10458B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final CopyOnWriteArrayList f10459C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final CopyOnWriteArrayList f10460D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final CopyOnWriteArrayList f10461E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final CopyOnWriteArrayList f10462F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final CopyOnWriteArrayList f10463G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f10464H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f10465I;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s f10466t = new s();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0099h f10467u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0525u f10468v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f10469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public V f10470x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x f10471y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final l f10472z;

    /* JADX WARN: Type inference failed for: r5v0, types: [d.d] */
    public m() {
        final AbstractActivityC0655l abstractActivityC0655l = (AbstractActivityC0655l) this;
        this.f10467u = new C0099h(new d(abstractActivityC0655l, 15));
        C0525u c0525u = new C0525u(this);
        this.f10468v = c0525u;
        t tVar = new t((f) this);
        this.f10469w = tVar;
        this.f10471y = null;
        l lVar = new l(abstractActivityC0655l);
        this.f10472z = lVar;
        this.f10457A = new b(lVar, new a() { // from class: d.d
            @Override // p200u8.a
            public final Object invoke() {
                abstractActivityC0655l.reportFullyDrawn();
                return null;
            }
        });
        new AtomicInteger();
        this.f10458B = new g(abstractActivityC0655l);
        this.f10459C = new CopyOnWriteArrayList();
        this.f10460D = new CopyOnWriteArrayList();
        this.f10461E = new CopyOnWriteArrayList();
        this.f10462F = new CopyOnWriteArrayList();
        this.f10463G = new CopyOnWriteArrayList();
        this.f10464H = false;
        this.f10465I = false;
        int i10 = Build.VERSION.SDK_INT;
        c0525u.a(new h(abstractActivityC0655l, 0));
        c0525u.a(new h(abstractActivityC0655l, 1));
        c0525u.a(new h(abstractActivityC0655l, 2));
        tVar.e();
        androidx.lifecycle.L.e(this);
        if (i10 <= 23) {
            i iVar = new i();
            iVar.f10452t = this;
            c0525u.a(iVar);
        }
        ((e) tVar.f3308d).f("android:support:activity-result", new e(abstractActivityC0655l, 0));
        i(new f(abstractActivityC0655l, 0));
    }

    @Override // N0.f
    public final e a() {
        return (e) this.f10469w.f3308d;
    }

    @Override // androidx.lifecycle.InterfaceC0514i
    public final u0.b d() {
        u0.b bVar = new u0.b(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f577s;
        if (application != null) {
            linkedHashMap.put(S.f6746z, getApplication());
        }
        linkedHashMap.put(androidx.lifecycle.L.a, this);
        linkedHashMap.put(androidx.lifecycle.L.f6733b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(androidx.lifecycle.L.f6734c, getIntent().getExtras());
        }
        return bVar;
    }

    @Override // androidx.lifecycle.W
    public final V e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f10470x == null) {
            k kVar = (k) getLastNonConfigurationInstance();
            if (kVar != null) {
                this.f10470x = kVar.a;
            }
            if (this.f10470x == null) {
                this.f10470x = new V();
            }
        }
        return this.f10470x;
    }

    @Override // androidx.lifecycle.InterfaceC0523s
    public final C0525u g() {
        return this.f10468v;
    }

    public final void h(T.a aVar) {
        this.f10459C.add(aVar);
    }

    public final void i(p038e.a aVar) {
        s sVar = this.f10466t;
        sVar.getClass();
        if (((m) sVar.f168s) != null) {
            aVar.a();
        }
        ((CopyOnWriteArraySet) sVar.f169t).add(aVar);
    }

    public final x j() {
        if (this.f10471y == null) {
            this.f10471y = new x(new RunnableC0094c(this, 22));
            this.f10468v.a(new i(this));
        }
        return this.f10471y;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f10458B.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        j().a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f10459C.iterator();
        while (it.hasNext()) {
            ((T.a) it.next()).accept(configuration);
        }
    }

    @Override // I.AbstractActivityC0247k, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f10469w.f(bundle);
        s sVar = this.f10466t;
        sVar.getClass();
        sVar.f168s = this;
        Iterator it = ((CopyOnWriteArraySet) sVar.f169t).iterator();
        while (it.hasNext()) {
            ((p038e.a) it.next()).a();
        }
        super.onCreate(bundle);
        int i10 = I.f6723t;
        G.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f10467u.f104u).iterator();
        while (it.hasNext()) {
            ((E) it.next()).a.k(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f10467u.f104u).iterator();
            while (it.hasNext()) {
                if (((E) it.next()).a.p(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z6) {
        if (this.f10464H) {
            return;
        }
        Iterator it = this.f10462F.iterator();
        while (it.hasNext()) {
            ((T.a) it.next()).accept(new C0248l(z6));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f10461E.iterator();
        while (it.hasNext()) {
            ((T.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f10467u.f104u).iterator();
        while (it.hasNext()) {
            ((E) it.next()).a.q();
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z6) {
        if (this.f10465I) {
            return;
        }
        Iterator it = this.f10463G.iterator();
        while (it.hasNext()) {
            ((T.a) it.next()).accept(new M(z6));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f10467u.f104u).iterator();
        while (it.hasNext()) {
            ((E) it.next()).a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.f10458B.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        k kVar;
        V v4 = this.f10470x;
        if (v4 == null && (kVar = (k) getLastNonConfigurationInstance()) != null) {
            v4 = kVar.a;
        }
        if (v4 == null) {
            return null;
        }
        k kVar2 = new k();
        kVar2.a = v4;
        return kVar2;
    }

    @Override // I.AbstractActivityC0247k, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C0525u c0525u = this.f10468v;
        if (c0525u instanceof C0525u) {
            c0525u.g(EnumC0519n.f6757u);
        }
        super.onSaveInstanceState(bundle);
        this.f10469w.g(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator it = this.f10460D.iterator();
        while (it.hasNext()) {
            ((T.a) it.next()).accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (u0.g()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            b bVar = this.f10457A;
            synchronized (bVar.f15290u) {
                try {
                    bVar.f15289t = true;
                    Iterator it = ((ArrayList) bVar.f15291v).iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).invoke();
                    }
                    ((ArrayList) bVar.f15291v).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        androidx.lifecycle.L.g(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        p210v8.i.f(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        xa.d.u(getWindow().getDecorView(), this);
        C8.E.z(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        p210v8.i.f(decorView2, "<this>");
        decorView2.setTag(R.id.report_drawn, this);
        View decorView3 = getWindow().getDecorView();
        l lVar = this.f10472z;
        if (!lVar.f10455u) {
            lVar.f10455u = true;
            decorView3.getViewTreeObserver().addOnDrawListener(lVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z6, Configuration configuration) {
        this.f10464H = true;
        try {
            super.onMultiWindowModeChanged(z6, configuration);
            this.f10464H = false;
            for (T.a aVar : this.f10462F) {
                p210v8.i.f(configuration, "newConfig");
                aVar.accept(new C0248l(z6));
            }
        } catch (Throwable th) {
            this.f10464H = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z6, Configuration configuration) {
        this.f10465I = true;
        try {
            super.onPictureInPictureModeChanged(z6, configuration);
            this.f10465I = false;
            for (T.a aVar : this.f10463G) {
                p210v8.i.f(configuration, "newConfig");
                aVar.accept(new M(z6));
            }
        } catch (Throwable th) {
            this.f10465I = false;
            throw th;
        }
    }
}
