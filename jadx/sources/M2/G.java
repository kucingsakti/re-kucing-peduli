package M2;

import com.google.android.gms.measurement.internal.zzhn;
import com.google.android.gms.measurement.internal.zznc;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class G implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2901s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f2902t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f2903u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f2904v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zzhn f2905w;

    public /* synthetic */ G(zzhn zzhnVar, String str, String str2, String str3, int i10) {
        this.f2901s = i10;
        this.f2902t = str;
        this.f2903u = str2;
        this.f2904v = str3;
        this.f2905w = zzhnVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2901s) {
            case 0:
                zzhn zzhnVar = this.f2905w;
                zzhnVar.f9150b.b0();
                C0298g c0298g = zzhnVar.f9150b.f9306u;
                zznc.n(c0298g);
                return c0298g.H1(this.f2902t, this.f2903u, this.f2904v);
            case 1:
                zzhn zzhnVar2 = this.f2905w;
                zzhnVar2.f9150b.b0();
                C0298g c0298g2 = zzhnVar2.f9150b.f9306u;
                zznc.n(c0298g2);
                return c0298g2.n1(this.f2902t, this.f2903u, this.f2904v);
            case 2:
                zzhn zzhnVar3 = this.f2905w;
                zzhnVar3.f9150b.b0();
                C0298g c0298g3 = zzhnVar3.f9150b.f9306u;
                zznc.n(c0298g3);
                return c0298g3.H1(this.f2902t, this.f2903u, this.f2904v);
            default:
                zzhn zzhnVar4 = this.f2905w;
                zzhnVar4.f9150b.b0();
                C0298g c0298g4 = zzhnVar4.f9150b.f9306u;
                zznc.n(c0298g4);
                return c0298g4.n1(this.f2902t, this.f2903u, this.f2904v);
        }
    }
}
