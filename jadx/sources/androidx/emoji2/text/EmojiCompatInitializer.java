package androidx.emoji2.text;

import E1.l;
import R0.a;
import R0.b;
import android.content.Context;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.InterfaceC0523s;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import p106l0.g;
import p106l0.h;
import p106l0.n;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // R0.b
    public final Object create(Context context) {
        n nVar = new n(new l(context));
        nVar.a = 1;
        if (g.f12850k == null) {
            synchronized (g.j) {
                try {
                    if (g.f12850k == null) {
                        g.f12850k = new g(nVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0525u c0525uG = ((InterfaceC0523s) a.c(context).d(ProcessLifecycleInitializer.class)).g();
        c0525uG.a(new h(this, c0525uG));
        return Boolean.TRUE;
    }

    @Override // R0.b
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
