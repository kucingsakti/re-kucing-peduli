package p117m1;

import B7.a;
import J4.j;
import Y1.c;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p050f1.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f13066f;

    public d(Context context, c cVar) {
        super(context, cVar);
        this.f13066f = new j(this, 4);
    }

    @Override // B7.a
    public final void g() {
        q qVarA = q.a();
        int i10 = e.a;
        qVarA.getClass();
        this.a.registerReceiver(this.f13066f, i());
    }

    @Override // B7.a
    public final void h() {
        q qVarA = q.a();
        int i10 = e.a;
        qVarA.getClass();
        this.a.unregisterReceiver(this.f13066f);
    }

    public abstract IntentFilter i();

    public abstract void j(Intent intent);
}
