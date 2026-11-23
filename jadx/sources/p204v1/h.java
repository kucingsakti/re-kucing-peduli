package p204v1;

import com.google.android.gms.internal.measurement.S;
import com.kcstream.cing.MainApp;
import p086i8.C;
import p188t1.C0839b;
import p188t1.C0857u;
import p188t1.G;
import p188t1.I;
import p188t1.Q;
import p195u1.b;
import p230x9.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15402s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f15403t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ MainApp f15404u;

    public /* synthetic */ h(i iVar, MainApp mainApp) {
        this.f15403t = iVar;
        this.f15404u = mainApp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15402s) {
            case 0:
                i iVar = this.f15403t;
                MainApp mainApp = this.f15404u;
                iVar.getClass();
                synchronized (d.f15793t) {
                    C.a(C.c("036DBADD0FFDD1"));
                    if (!d.f15794u) {
                        new C0857u(mainApp, C.a(C.c("3A43A0E609CFDFACA35C")), new String[]{C.a(C.c("1272A098")), C.a(C.c("3272A098")), C.a(C.c("1252A098")), C.a(C.c("3252A098")), C.a(C.c("12728098")), C.a(C.c("32728098")), C.a(C.c("12528098")), C.a(C.c("32528098")), C.a(C.c("1272A09B")), C.a(C.c("3272A09B")), C.a(C.c("1252A09B")), C.a(C.c("3252A09B")), C.a(C.c("1272809B")), C.a(C.c("3272809B")), C.a(C.c("1252809B")), C.a(C.c("3252809B")), C.a(C.c("1272A09A")), C.a(C.c("3272A09A")), C.a(C.c("1252A09A")), C.a(C.c("3252A09A")), C.a(C.c("1272809A")), C.a(C.c("3272809A")), C.a(C.c("1252809A")), C.a(C.c("3252809A")), C.a(C.c("1272A09D")), C.a(C.c("3272A09D")), C.a(C.c("1252A09D")), C.a(C.c("3252A09D")), C.a(C.c("1272809D")), C.a(C.c("3272809D")), C.a(C.c("1252809D")), C.a(C.c("3252809D"))});
                        new C0857u(mainApp, C.a(C.c("3A4580F320D4C9A18855")), new String[]{C.a(C.c("176EA098")), C.a(C.c("376EA098")), C.a(C.c("174EA098")), C.a(C.c("374EA098")), C.a(C.c("176E8098")), C.a(C.c("376E8098")), C.a(C.c("174E8098")), C.a(C.c("374E8098")), C.a(C.c("176EA09B")), C.a(C.c("376EA09B")), C.a(C.c("174EA09B")), C.a(C.c("374EA09B")), C.a(C.c("176E809B")), C.a(C.c("376E809B")), C.a(C.c("174E809B")), C.a(C.c("374E809B")), C.a(C.c("176EA09A")), C.a(C.c("376EA09A")), C.a(C.c("174EA09A")), C.a(C.c("374EA09A")), C.a(C.c("176E809A")), C.a(C.c("376E809A")), C.a(C.c("174E809A")), C.a(C.c("374E809A")), C.a(C.c("176EA09D")), C.a(C.c("376EA09D")), C.a(C.c("174EA09D")), C.a(C.c("374EA09D")), C.a(C.c("176E809D")), C.a(C.c("376E809D")), C.a(C.c("174E809D")), C.a(C.c("374E809D"))});
                        new C0857u(mainApp, C.a(C.c("3149A1C132EBC3928275")), new String[]{C.a(C.c("0674A698")), C.a(C.c("2674A698")), C.a(C.c("0654A698")), C.a(C.c("2654A098")), C.a(C.c("06748698")), C.a(C.c("26708298")), C.a(C.c("06548698")), C.a(C.c("26548698")), C.a(C.c("0674A69B")), C.a(C.c("2674A69B")), C.a(C.c("0654A69B")), C.a(C.c("2654A09B")), C.a(C.c("0674869B")), C.a(C.c("2670829B")), C.a(C.c("0654869B")), C.a(C.c("2654869B")), C.a(C.c("0674A69A")), C.a(C.c("2674A69A")), C.a(C.c("0654A69A")), C.a(C.c("2654A09A")), C.a(C.c("0674869A")), C.a(C.c("2670829A")), C.a(C.c("0654869A")), C.a(C.c("2654869A")), C.a(C.c("0674A69D")), C.a(C.c("2674A69D")), C.a(C.c("0654A69D")), C.a(C.c("2654A09D")), C.a(C.c("0674869D")), C.a(C.c("2670829D")), C.a(C.c("0654869D")), C.a(C.c("2654869D"))});
                        d.f15794u = true;
                    }
                    break;
                }
                C.a(C.c("1463B8DA0FE6E6A88871060F"));
                iVar.a.getClass();
                return;
            default:
                i iVar2 = this.f15403t;
                for (Q q10 : iVar2.a.a()) {
                    if (q10 != null && !q10.c()) {
                        q10.a(this.f15404u);
                    }
                }
                f fVar = iVar2.f15405b;
                Object obj = ((f) fVar.f15395d).f15394c;
                G g8 = (G) fVar.f15393b;
                Fa.d dVar = (Fa.d) g8.f14983x;
                ((f) fVar.f15395d).getClass();
                ((C0839b) fVar.f15396e).f15009c.add(new I(g8, (S) fVar.f15394c, dVar, fVar.a));
                return;
        }
    }

    public /* synthetic */ h(i iVar, MainApp mainApp, b bVar) {
        this.f15403t = iVar;
        this.f15404u = mainApp;
    }
}
