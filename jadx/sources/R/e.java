package R;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e implements T.a {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4420b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.f4420b = obj;
    }

    @Override // T.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                f fVar = (f) obj;
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((o1.c) this.f4420b).u(fVar);
                return;
            default:
                f fVar2 = (f) obj;
                synchronized (g.f4423c) {
                    try {
                        p212w.i iVar = g.f4424d;
                        ArrayList arrayList = (ArrayList) iVar.get((String) this.f4420b);
                        if (arrayList == null) {
                            return;
                        }
                        iVar.remove((String) this.f4420b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((T.a) arrayList.get(i10)).accept(fVar2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
