package p117m1;

import Y1.c;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import p050f1.q;

/* JADX INFO: loaded from: classes.dex */
public final class i extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f13069g;

    public i(Context context, c cVar) {
        super(context, cVar);
        Object systemService = this.a.getSystemService("connectivity");
        p210v8.i.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f13069g = (ConnectivityManager) systemService;
    }

    @Override // B7.a
    public final Object b() {
        return h.a(this.f13069g);
    }

    @Override // p117m1.d
    public final IntentFilter i() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // p117m1.d
    public final void j(Intent intent) {
        if (p210v8.i.a(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            q qVarA = q.a();
            int i10 = h.a;
            qVarA.getClass();
            f(h.a(this.f13069g));
        }
    }
}
