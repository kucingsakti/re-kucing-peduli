package p188t1;

import T3.c;
import android.app.KeyguardManager;
import com.google.android.gms.internal.measurement.S;
import com.kcstream.cing.MainApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import p102k7.e;
import p140o4.r;
import p204v1.f;
import p204v1.j;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public final B a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f15053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0842e f15054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0859w f15055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0852o f15056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L f15057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0848k f15058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0 f15059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0845h f15060i;
    public final V j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0841d f15061k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0861y f15062l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final O f15063m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final M f15064n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o0 f15065o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final X f15066p;

    public j0(MainApp mainApp, S s9, f fVar, G g8, f fVar2, j jVar) {
        this.f15065o = null;
        this.f15066p = null;
        KeyguardManager keyguardManager = (KeyguardManager) mainApp.getSystemService(KeyguardManager.class);
        e eVar = keyguardManager != null ? new e(keyguardManager) : null;
        this.a = new B(fVar, s9, jVar, new E(mainApp));
        this.f15053b = new K(fVar, s9, jVar);
        this.f15054c = new C0842e(fVar, s9, jVar);
        this.f15055d = new C0859w(fVar, s9, jVar);
        this.f15056e = new C0852o(fVar, s9, jVar, (c) g8.f14981v, fVar2);
        this.f15057f = new L(fVar, s9, jVar, (c) g8.f14981v);
        C0848k c0848k = new C0848k(fVar);
        new HashSet();
        new ArrayList();
        Object obj = ((f) fVar.f15395d).f15394c;
        this.f15058g = c0848k;
        this.f15059h = new a0(fVar, jVar, mainApp, (r) g8.f14982w);
        this.f15066p = new X(mainApp, s9, jVar);
        this.f15060i = new C0845h(fVar, jVar);
        if (eVar != null) {
            this.f15065o = new o0(eVar, s9, jVar);
        }
        this.j = new V(fVar, jVar);
        this.f15061k = new C0841d(fVar, jVar);
        this.f15062l = new C0861y(fVar, jVar);
        new C0857u(mainApp);
        J.a();
        this.f15063m = new O(fVar);
        new C0857u(mainApp);
        J.a();
        this.f15064n = new M(fVar);
    }

    public final ArrayList a() {
        return new ArrayList(Arrays.asList(this.f15056e, this.f15053b, this.f15057f, this.f15054c, this.a, this.f15055d, this.f15060i, this.f15066p, this.f15065o, this.f15059h, this.f15058g, this.j, this.f15061k, this.f15062l, this.f15063m, this.f15064n));
    }
}
