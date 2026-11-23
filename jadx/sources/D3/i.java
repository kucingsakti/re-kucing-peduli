package D3;

import I3.l;
import J3.k;
import Q3.O0;
import V0.n;
import V0.o;
import V0.p;
import androidx.preference.Preference;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.kcstream.cing.MainApp;
import com.rollbar.notifier.sender.SyncSender;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements N7.b, C0.i, p073h4.a, I3.e, p051f2.e, o {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1062s;

    public /* synthetic */ i(int i10) {
        this.f1062s = i10;
    }

    private final void d(p073h4.b bVar) {
    }

    @Override // C0.i
    public void a(Preference preference, Serializable serializable) {
        p210v8.i.f(preference, "<anonymous parameter 0>");
    }

    @Override // N7.b
    public void accept(Object obj) {
        switch (this.f1062s) {
            case 4:
                int i10 = MainApp.f10163s;
                D4.c.f1074s.invoke(obj);
                break;
            default:
                break;
        }
    }

    @Override // p051f2.e
    public Object apply(Object obj) {
        U3.a.f4889b.getClass();
        return R3.a.a.s((O0) obj).getBytes(Charset.forName(SyncSender.UTF_8));
    }

    @Override // V0.o
    public void b(n nVar, p pVar, boolean z6) {
        switch (this.f1062s) {
            case 22:
                nVar.g(pVar);
                break;
            case 23:
                nVar.f(pVar);
                break;
            case 24:
                nVar.a(pVar);
                break;
            case 25:
                nVar.b();
                break;
            default:
                nVar.c();
                break;
        }
    }

    @Override // p073h4.a
    public void c(p073h4.b bVar) {
        switch (this.f1062s) {
            case 6:
                return;
            default:
                bVar.get().getClass();
                throw new ClassCastException();
        }
    }

    @Override // I3.e
    public Object h(Fa.e eVar) {
        switch (this.f1062s) {
            case 7:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.f9982c.get();
            case 9:
                return (ScheduledExecutorService) ExecutorsRegistrar.f9981b.get();
            case 10:
                l lVar = ExecutorsRegistrar.a;
                return k.f2402s;
            case 27:
                return TransportRegistrar.lambda$getComponents$0(eVar);
            case 28:
                return TransportRegistrar.lambda$getComponents$1(eVar);
            default:
                return TransportRegistrar.lambda$getComponents$2(eVar);
        }
    }
}
