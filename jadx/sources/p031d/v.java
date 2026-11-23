package p031d;

import p086i8.h;
import p156q0.D;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class v implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final D f10488s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x f10489t;

    public v(x xVar, D d3) {
        i.f(d3, "onBackPressedCallback");
        this.f10489t = xVar;
        this.f10488s = d3;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [u8.a, v8.h] */
    @Override // p031d.c
    public final void cancel() {
        x xVar = this.f10489t;
        h hVar = xVar.f10491b;
        D d3 = this.f10488s;
        hVar.remove(d3);
        if (i.a(xVar.f10492c, d3)) {
            d3.a();
            xVar.f10492c = null;
        }
        d3.f14254b.remove(this);
        ?? r10 = d3.f14255c;
        if (r10 != 0) {
            r10.invoke();
        }
        d3.f14255c = null;
    }
}
