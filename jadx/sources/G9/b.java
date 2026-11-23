package G9;

import p086i8.AbstractC0662a;
import p086i8.D;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0662a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1748u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f1749v;

    public b(c cVar) {
        this.f1749v = cVar;
    }

    @Override // p086i8.AbstractC0662a
    public final void a() {
        int i10;
        Object[] objArr;
        do {
            i10 = this.f1748u + 1;
            this.f1748u = i10;
            objArr = this.f1749v.f1750s;
            if (i10 >= objArr.length) {
                break;
            }
        } while (objArr[i10] == null);
        if (i10 >= objArr.length) {
            this.f12313s = D.f12310u;
            return;
        }
        Object obj = objArr[i10];
        p210v8.i.d(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
        this.f12314t = obj;
        this.f12313s = D.f12308s;
    }
}
