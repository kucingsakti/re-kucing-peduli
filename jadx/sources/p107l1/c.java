package p107l1;

import android.os.Build;
import k1.a;
import o1.o;
import p050f1.q;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {
    static {
        i.e(q.c("NetworkMeteredCtrlr"), "tagWithPrefix(\"NetworkMeteredCtrlr\")");
    }

    @Override // p107l1.b
    public final boolean a(o oVar) {
        i.f(oVar, "workSpec");
        return oVar.j.a == 5;
    }

    @Override // p107l1.b
    public final boolean b(Object obj) {
        a aVar = (a) obj;
        i.f(aVar, "value");
        int i10 = Build.VERSION.SDK_INT;
        boolean z6 = aVar.a;
        if (i10 >= 26) {
            return (z6 && aVar.f12682c) ? false : true;
        }
        q.a().getClass();
        return !z6;
    }
}
