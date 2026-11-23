package M8;

import A0.r;
import A9.AbstractC0151y;
import L8.M;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j implements b {
    public final I8.i a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p096j9.c f3202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f3203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3204d;

    public j(I8.i iVar, p096j9.c cVar, Map map) {
        p210v8.i.f(cVar, "fqName");
        this.a = iVar;
        this.f3202b = cVar;
        this.f3203c = map;
        this.f3204d = D3.b.r(p076h8.e.f11786s, new r(this, 19));
    }

    @Override // M8.b
    public final p096j9.c a() {
        return this.f3202b;
    }

    @Override // M8.b
    public final Map b() {
        return this.f3203c;
    }

    @Override // M8.b
    public final M g() {
        return M.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // M8.b
    public final AbstractC0151y getType() {
        Object value = this.f3204d.getValue();
        p210v8.i.e(value, "<get-type>(...)");
        return (AbstractC0151y) value;
    }
}
