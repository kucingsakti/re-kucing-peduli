package A9;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import y0.C0872j;

/* JADX INFO: renamed from: A9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0132e extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f367s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Serializable f368t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f369u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f370v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f371w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0132e(Serializable serializable, Object obj, Object obj2, Object obj3, int i10) {
        super(1);
        this.f367s = i10;
        this.f368t = serializable;
        this.f369u = obj;
        this.f370v = obj2;
        this.f371w = obj3;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f367s) {
            case 0:
                L l4 = (L) obj;
                p210v8.i.f(l4, "$this$runForkingPoint");
                Iterator it = ((ArrayList) this.f368t).iterator();
                while (it.hasNext()) {
                    C0131d c0131d = new C0131d((N) this.f369u, (B9.b) this.f370v, (D9.d) it.next(), (D9.d) this.f371w, 0);
                    if (!l4.a) {
                        l4.a = ((Boolean) c0131d.invoke()).booleanValue();
                    }
                }
                break;
            default:
                C0872j c0872j = (C0872j) obj;
                p210v8.i.f(c0872j, "it");
                ((p210v8.q) this.f368t).f15463s = true;
                p086i8.s sVar = p086i8.s.f12328s;
                ((y0.B) this.f369u).a((y0.x) this.f370v, (Bundle) this.f371w, c0872j, sVar);
                break;
        }
        return p076h8.m.a;
    }
}
