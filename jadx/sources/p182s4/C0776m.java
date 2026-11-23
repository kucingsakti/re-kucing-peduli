package p182s4;

import D3.g;
import N9.AbstractC0342z;
import android.app.Application;
import android.content.Context;
import p123m8.i;
import p197u4.j;

/* JADX INFO: renamed from: s4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0776m {
    public final g a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f14704b;

    public C0776m(g gVar, j jVar, i iVar, U u3) {
        this.a = gVar;
        this.f14704b = jVar;
        gVar.a();
        Context applicationContext = gVar.a.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            applicationContext.getClass().toString();
        } else {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(W.f14653s);
            AbstractC0342z.n(AbstractC0342z.b(iVar), null, new C0775l(this, iVar, u3, null), 3);
        }
    }
}
