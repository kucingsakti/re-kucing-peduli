package M2;

import android.text.InputFilter;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zziv;
import com.mukesh.OtpView;

/* JADX INFO: loaded from: classes.dex */
public final class P implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2923s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2924t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2925u;

    public /* synthetic */ P(Object obj, boolean z6, int i10) {
        this.f2923s = i10;
        this.f2924t = z6;
        this.f2925u = obj;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z6 = false;
        switch (this.f2923s) {
            case 0:
                zziv zzivVar = (zziv) this.f2925u;
                boolean zH = ((zzhj) zzivVar.f577s).h();
                zzhj zzhjVar = (zzhj) zzivVar.f577s;
                boolean z10 = zzhjVar.f9132S != null && zzhjVar.f9132S.booleanValue();
                zzhj zzhjVar2 = (zzhj) zzivVar.f577s;
                boolean z11 = this.f2924t;
                zzhjVar2.f9132S = Boolean.valueOf(z11);
                if (z10 == z11) {
                    zzfw zzfwVar = ((zzhj) zzivVar.f577s).f9115A;
                    zzhj.g(zzfwVar);
                    zzfwVar.f9052F.a(Boolean.valueOf(z11), "Default data collection state already set to");
                }
                if (((zzhj) zzivVar.f577s).h() != zH) {
                    boolean zH2 = ((zzhj) zzivVar.f577s).h();
                    zzhj zzhjVar3 = (zzhj) zzivVar.f577s;
                    if (zzhjVar3.f9132S != null && zzhjVar3.f9132S.booleanValue()) {
                        z6 = true;
                    }
                    if (zH2 != z6) {
                        zzfw zzfwVar2 = ((zzhj) zzivVar.f577s).f9115A;
                        zzhj.g(zzfwVar2);
                        zzfwVar2.f9049C.c("Default data collection is different than actual status", Boolean.valueOf(z11), Boolean.valueOf(zH));
                    }
                } else {
                    zzfw zzfwVar3 = ((zzhj) zzivVar.f577s).f9115A;
                    zzhj.g(zzfwVar3);
                    zzfwVar3.f9049C.c("Default data collection is different than actual status", Boolean.valueOf(z11), Boolean.valueOf(zH));
                }
                zzivVar.y1();
                break;
            case 1:
                N1.q qVar = (N1.q) this.f2925u;
                qVar.getClass();
                U1.n.a();
                K0.g gVar = (K0.g) qVar.f3296b;
                boolean z12 = gVar.f2525b;
                boolean z13 = this.f2924t;
                gVar.f2525b = z13;
                if (z12 != z13) {
                    ((N1.o) gVar.f2526c).a(z13);
                }
                break;
            case 2:
                ((N1.s) this.f2925u).f3300b.a(this.f2924t);
                break;
            default:
                if (!this.f2924t) {
                    OtpView otpView = (OtpView) this.f2925u;
                    otpView.removeCallbacks(this);
                    InputFilter[] inputFilterArr = OtpView.f0;
                    if (otpView.f10300R && otpView.isFocused()) {
                        z6 = true;
                    }
                    if (z6) {
                        otpView.g(!otpView.f10301S);
                        otpView.postDelayed(this, 500L);
                    }
                    break;
                }
                break;
        }
    }

    public P(OtpView otpView) {
        this.f2923s = 3;
        this.f2925u = otpView;
    }
}
