package p188t1;

import com.google.android.gms.internal.measurement.S;
import com.kcstream.cing.MainApp;
import o1.e;
import p086i8.C;
import p204v1.j;

/* JADX INFO: loaded from: classes.dex */
public final class X implements Q {
    public final S a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f14991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f14992c;

    static {
        C.a(C.c("28558BCB0BE6CEA28248040D825E603BD1CC"));
    }

    public X(MainApp mainApp, S s9, j jVar) {
        this.a = s9;
        this.f14991b = jVar;
        this.f14992c = new e(mainApp);
    }

    @Override // p188t1.Q
    public final void a(MainApp mainApp) {
        b();
    }

    public final void b() {
        boolean z6;
        b0 b0VarC0 = this.f14992c.C0();
        int i10 = W.a[b0VarC0.ordinal()];
        if (i10 == 1 || i10 == 2) {
            z6 = true;
        } else {
            z6 = false;
            if (i10 != 3 && i10 != 4) {
                C.a(C.c("2B67ADDA1EEAD7A2B66500189E5F603DC6DA"));
                C.a(C.c("356CB1D11AE0C6B383734F1E9A4161319989"));
                b0VarC0.toString();
            }
        }
        j jVar = this.f14991b;
        jVar.f15406b.getClass();
        this.a.j(EnumC0840c.f15016B, z6);
        if (z6) {
            return;
        }
        jVar.a(1, C.a(C.c("28558BCB0BE6CEA28248040D825E603BD1CC")));
    }

    @Override // p188t1.Q
    public final boolean c() {
        return false;
    }
}
