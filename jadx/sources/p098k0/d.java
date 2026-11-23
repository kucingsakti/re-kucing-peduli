package p098k0;

import V0.m;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
import p129n3.e;
import p129n3.f;
import p188t1.Y;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f12654p = new c(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c f12655q = new c(2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f12656r = new c(3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f12657s = new c(4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f12658t = new c(5);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f12659u = new c(0);
    public float a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f12662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Y f12663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f12665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f12666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f12667i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f12668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f12669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f12670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f12671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12672o;

    public d(f fVar) {
        e eVar = f.f13342I;
        this.a = 0.0f;
        this.f12660b = Float.MAX_VALUE;
        this.f12661c = false;
        this.f12664f = false;
        this.f12665g = Float.MAX_VALUE;
        this.f12666h = -3.4028235E38f;
        this.f12667i = 0L;
        this.f12668k = new ArrayList();
        this.f12669l = new ArrayList();
        this.f12662d = fVar;
        this.f12663e = eVar;
        if (eVar == f12656r || eVar == f12657s || eVar == f12658t) {
            this.j = 0.1f;
        } else if (eVar == f12659u || eVar == f12654p || eVar == f12655q) {
            this.j = 0.00390625f;
        } else {
            this.j = 1.0f;
        }
        this.f12670m = null;
        this.f12671n = Float.MAX_VALUE;
        this.f12672o = false;
    }

    public final void a(float f10) {
        this.f12663e.y(this.f12662d, f10);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f12669l;
            if (i10 >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i10) != null) {
                ((m) arrayList.get(i10)).getClass();
                throw null;
            }
            i10++;
        }
    }

    public final void b() {
        if (this.f12670m.f12673b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f12664f) {
            this.f12672o = true;
        }
    }
}
