package p138o2;

import E4.C0187a;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import i2.i;
import java.util.Objects;
import p148p2.d;
import p148p2.g;
import p158q2.a;
import p158q2.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f13686s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f13687t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13688u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Runnable f13689v;

    public /* synthetic */ e(h hVar, i iVar, int i10, Runnable runnable) {
        this.f13686s = hVar;
        this.f13687t = iVar;
        this.f13688u = i10;
        this.f13689v = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final i iVar = this.f13687t;
        final int i10 = this.f13688u;
        Runnable runnable = this.f13689v;
        final h hVar = this.f13686s;
        b bVar = hVar.f13700f;
        try {
            d dVar = hVar.f13697c;
            Objects.requireNonNull(dVar);
            ((g) bVar).i(new C0187a(dVar, 18));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) hVar.a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                ((g) bVar).i(new a() { // from class: o2.f
                    @Override // p158q2.a
                    public final Object b() {
                        hVar.f13698d.a(iVar, i10 + 1, false);
                        return null;
                    }
                });
            } else {
                hVar.a(iVar, i10);
            }
        } catch (SynchronizationException unused) {
            hVar.f13698d.a(iVar, i10 + 1, false);
        } finally {
            runnable.run();
        }
    }
}
