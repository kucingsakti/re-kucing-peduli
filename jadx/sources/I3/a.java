package I3;

import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public String a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f2012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f2013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f2016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f2017g;

    public a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f2012b = hashSet;
        this.f2013c = new HashSet();
        this.f2014d = 0;
        this.f2015e = 0;
        this.f2017g = new HashSet();
        hashSet.add(p.a(cls));
        for (Class cls2 : clsArr) {
            p181s3.a.b(cls2, "Null interface");
            this.f2012b.add(p.a(cls2));
        }
    }

    public final void a(j jVar) {
        if (this.f2012b.contains(jVar.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.f2013c.add(jVar);
    }

    public final b b() {
        if (this.f2016f != null) {
            return new b(this.a, new HashSet(this.f2012b), new HashSet(this.f2013c), this.f2014d, this.f2015e, this.f2016f, this.f2017g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void c(int i10) {
        if (!(this.f2014d == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f2014d = i10;
    }

    public a(p pVar, p[] pVarArr) {
        HashSet hashSet = new HashSet();
        this.f2012b = hashSet;
        this.f2013c = new HashSet();
        this.f2014d = 0;
        this.f2015e = 0;
        this.f2017g = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            p181s3.a.b(pVar2, "Null interface");
        }
        Collections.addAll(this.f2012b, pVarArr);
    }
}
