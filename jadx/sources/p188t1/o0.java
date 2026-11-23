package p188t1;

import android.app.KeyguardManager;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.internal.measurement.S;
import com.kcstream.cing.MainApp;
import p086i8.C;
import p102k7.e;
import p204v1.j;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements Q {
    public final S a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f15073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f15074c;

    static {
        AbstractC0487g.r("1063A7DA09EAC1A2B9640A1C", "1063A7DA09EAC1A2B9740709954A7130");
    }

    public o0(e eVar, S s9, j jVar) {
        this.a = s9;
        this.f15073b = jVar;
        this.f15074c = eVar;
    }

    @Override // p188t1.Q
    public final void a(MainApp mainApp) {
        d();
    }

    public final void b(boolean z6) {
        this.a.j(EnumC0840c.f15018D, z6);
        if (z6) {
            j jVar = this.f15073b;
            jVar.f15406b.getClass();
            jVar.a(0, C.a(C.c("1063A7DA09EAC1A2B9740709954A7130")));
        }
    }

    @Override // p188t1.Q
    public final boolean c() {
        return false;
    }

    public final void d() {
        boolean zIsDeviceSecure = ((KeyguardManager) this.f15074c.f12743s).isDeviceSecure();
        j jVar = this.f15073b;
        p204v1.e eVar = jVar.f15406b;
        eVar.getClass();
        this.a.j(EnumC0840c.f15017C, zIsDeviceSecure);
        if (zIsDeviceSecure) {
            return;
        }
        eVar.getClass();
        jVar.a(1, C.a(C.c("1063A7DA09EAC1A2B9640A1C")));
    }
}
