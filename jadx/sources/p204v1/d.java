package p204v1;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.internal.measurement.S;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Objects;
import p086i8.C;
import p188t1.A;
import p188t1.C0839b;
import p188t1.C0853p;
import p188t1.C0855s;
import p188t1.C0858v;
import p188t1.D;
import p188t1.F;
import p188t1.G;
import p188t1.Q;
import p188t1.e0;
import p188t1.r;
import p188t1.r0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f15389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Fa.d f15390e;
    public final ArrayList a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f15387b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f15388c = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f15391f = new g(26);

    static {
        C.a(C.c("296CB7C00EE0CBB3AA7808"));
    }

    public d(f fVar) {
        this.f15389d = fVar;
        this.f15390e = (Fa.d) ((G) fVar.f15393b).f14983x;
    }

    public static F b(c cVar) {
        long jNanoTime = System.nanoTime() / 1000000;
        F fRun = cVar.run();
        fRun.f14976d = Long.valueOf((System.nanoTime() / 1000000) - jNanoTime);
        return fRun;
    }

    public static void f(r0 r0Var, int i10) {
        if (r0Var != null) {
            int i11 = r0Var.f15080b;
            if ((i11 & i10) == i10) {
                return;
            }
            r0Var.f15080b = i11 + i10;
            String.format(C.a(C.c("2663BDC50FE185B389370E0497427735D7CCEEE246D0341848A2E8746FFD7C0C5134AC")), Integer.valueOf(r0Var.f15080b));
            C.a(C.c("236EB5C70D"));
            r0Var.a(C.a(C.c("255A91EA4AA885")) + r0Var.f15080b);
        }
    }

    public static boolean g(Integer num) {
        return num != null && num.intValue() > 2;
    }

    public final void c(Integer num, String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f15387b;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        ArrayList arrayList4 = this.f15388c;
        if (arrayList4 == null) {
            this.f15388c = arrayList3;
            h(num, str);
        } else if (arrayList4.size() == arrayList3.size() && this.f15388c.containsAll(arrayList3)) {
            arrayList.clear();
            arrayList2.clear();
        } else {
            this.f15388c = arrayList3;
            h(num, str);
        }
    }

    public final void d(String str, X509Certificate x509Certificate) {
        if (AbstractC0487g.s("0467B6DC0D", C.a(C.c("1267B8CC0BF6C0")))) {
            C.a(C.c("296CB7C00EE0CBB3AA7808"));
            C.a(C.c("236AB1CA01CBC4AA832D4F"));
            C.a(C.c("4C22BDC70CEA9FE7"));
            x509Certificate.toString();
        }
        this.a.add(new C0853p(str, x509Certificate));
    }

    public final void e(String str, F f10) {
        r rVar = !f10.b() ? r.f15077s : r.f15078t;
        Long l4 = f10.f14976d;
        Fa.d dVar = this.f15390e;
        synchronized (dVar) {
            C0855s c0855s = (C0855s) dVar.a.get(str);
            if (c0855s != null) {
                if (l4 != null) {
                    c0855s.a = rVar;
                    c0855s.f15083b = l4;
                } else {
                    c0855s.a = rVar;
                }
                return;
            }
            C0855s c0855s2 = new C0855s();
            c0855s2.a = rVar;
            c0855s2.f15083b = l4;
            dVar.a.put(str, c0855s2);
        }
    }

    public final void h(Integer num, String str) {
        if (AbstractC0487g.s("0263A7C009", C.a(C.c("0263A7C009")))) {
            i(str);
            return;
        }
        if (num == null) {
            num = 3;
        }
        this.f15391f.getClass();
        if (num.intValue() == 3) {
            i(str);
            return;
        }
        ArrayList arrayList = this.a;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f15387b;
        if (zIsEmpty && arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        arrayList3.addAll(arrayList);
        ArrayList arrayList4 = new ArrayList(arrayList2.size());
        arrayList4.addAll(arrayList2);
        f fVar = this.f15389d;
        fVar.getClass();
        G g8 = (G) fVar.f15393b;
        Fa.d dVar = (Fa.d) g8.f14983x;
        ((f) fVar.f15395d).getClass();
        ((C0839b) fVar.f15396e).f15009c.add(new C0858v(g8, (S) fVar.f15394c, str, arrayList3, arrayList4, dVar, fVar.a));
        arrayList.clear();
        arrayList2.clear();
    }

    public final void i(String str) {
        ArrayList arrayList = this.a;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f15387b;
        if (zIsEmpty && arrayList2.isEmpty()) {
            return;
        }
        f fVar = this.f15389d;
        fVar.getClass();
        G g8 = (G) fVar.f15393b;
        Fa.d dVar = (Fa.d) g8.f14983x;
        ((f) fVar.f15395d).getClass();
        C0858v c0858v = new C0858v(g8, (S) fVar.f15394c, str, arrayList, arrayList2, dVar, fVar.a);
        int i10 = C0839b.f15007d;
        ((C0839b) fVar.f15396e).a(c0858v);
        arrayList.clear();
        arrayList2.clear();
    }

    public final void j(String str, String str2) {
        if (AbstractC0487g.s("0467B6DC0D", C.a(C.c("1267B8CC0BF6C0")))) {
            C.a(C.c("296CB7C00EE0CBB3AA7808"));
            C.a(C.c("2667B5DD1FF7C0E792721C1C92437374C0C1ABE358F833105FB8E5"));
            C.a(C.c("4C22BDC70CEA9FE7"));
        }
        this.f15387b.add(new e0(str, str2));
    }

    public final void k(String str, ArrayList arrayList) {
        if (AbstractC0487g.s("0467B6DC0D", C.a(C.c("1267B8CC0BF6C0")))) {
            C.a(C.c("296CB7C00EE0CBB3AA7808"));
            C.a(C.c("2667B5DD1FF7C0E792721C1C92437374C0C1ABE358F833105FB8E5"));
            C.a(C.c("4C22BDC70CEA9FE7"));
            Objects.toString(arrayList);
        }
        this.f15387b.add(new A(str, arrayList));
    }

    public final void l(String str, String str2) {
        if (AbstractC0487g.s("0467B6DC0D", C.a(C.c("1267B8CC0BF6C0")))) {
            C.a(C.c("296CB7C00EE0CBB3AA7808"));
            C.a(C.c("236AB1CA01CBC4AA832D4F"));
            C.a(C.c("4C22BDC70CEA9FE7"));
        }
        this.a.add(new e0(str, str2));
    }

    public final void m(String str, ArrayList arrayList) {
        if (AbstractC0487g.s("0467B6DC0D", C.a(C.c("1267B8CC0BF6C0")))) {
            C.a(C.c("296CB7C00EE0CBB3AA7808"));
            C.a(C.c("2667B5DD1FF7C0E792721C1C92437374C0C1ABE358F833105FB8E5"));
            C.a(C.c("4C22BDC70CEA9FE7"));
            Objects.toString(arrayList);
        }
        this.f15387b.add(new D(str, arrayList));
    }
}
