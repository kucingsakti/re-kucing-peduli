package N1;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f3272s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.bumptech.glide.k f3273t;

    public d(Context context, com.bumptech.glide.k kVar) {
        this.f3272s = context.getApplicationContext();
        this.f3273t = kVar;
    }

    @Override // N1.i
    public final void c() {
        t tVarC = t.c(this.f3272s);
        com.bumptech.glide.k kVar = this.f3273t;
        synchronized (tVarC) {
            ((HashSet) tVarC.f3308d).remove(kVar);
            if (tVarC.f3306b && ((HashSet) tVarC.f3308d).isEmpty()) {
                ((p) tVarC.f3307c).a();
                tVarC.f3306b = false;
            }
        }
    }

    @Override // N1.i
    public final void e() {
        t tVarC = t.c(this.f3272s);
        com.bumptech.glide.k kVar = this.f3273t;
        synchronized (tVarC) {
            ((HashSet) tVarC.f3308d).add(kVar);
            if (!tVarC.f3306b && !((HashSet) tVarC.f3308d).isEmpty()) {
                tVarC.f3306b = ((p) tVarC.f3307c).b();
            }
        }
    }

    @Override // N1.i
    public final void k() {
    }
}
