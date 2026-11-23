package R;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f4416t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f4417u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Fa.e f4418v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f4419w;

    public /* synthetic */ d(String str, Context context, Fa.e eVar, int i10, int i11) {
        this.f4415s = i11;
        this.f4416t = str;
        this.f4417u = context;
        this.f4418v = eVar;
        this.f4419w = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4415s) {
            case 0:
                return g.a(this.f4416t, this.f4417u, this.f4418v, this.f4419w);
            default:
                try {
                    return g.a(this.f4416t, this.f4417u, this.f4418v, this.f4419w);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
