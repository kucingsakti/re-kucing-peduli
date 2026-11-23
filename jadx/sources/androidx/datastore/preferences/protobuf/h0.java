package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.F0;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Iterator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f6470s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6471t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6472u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Iterator f6473v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f6474w;

    public /* synthetic */ h0(int i10, AbstractMap abstractMap) {
        this.f6470s = i10;
        this.f6474w = abstractMap;
    }

    public Iterator a() {
        switch (this.f6470s) {
            case 0:
                if (this.f6473v == null) {
                    this.f6473v = ((d0) this.f6474w).f6455u.entrySet().iterator();
                }
                break;
            default:
                if (this.f6473v == null) {
                    this.f6473v = ((p104k9.y) this.f6474w).f12838u.entrySet().iterator();
                }
                break;
        }
        return this.f6473v;
    }

    public Iterator b() {
        if (this.f6473v == null) {
            this.f6473v = ((F0) this.f6474w).f8340t.entrySet().iterator();
        }
        return this.f6473v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6470s) {
            case 0:
                int i10 = this.f6471t + 1;
                d0 d0Var = (d0) this.f6474w;
                if (i10 >= d0Var.f6454t.size()) {
                    return !d0Var.f6455u.isEmpty() && a().hasNext();
                }
                return true;
            case 1:
                int i11 = this.f6471t + 1;
                F0 f0 = (F0) this.f6474w;
                if (i11 >= f0.f8339s.size()) {
                    return !f0.f8340t.isEmpty() && b().hasNext();
                }
                return true;
            default:
                return this.f6471t + 1 < ((p104k9.y) this.f6474w).f12837t.size() || a().hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6470s) {
            case 0:
                this.f6472u = true;
                int i10 = this.f6471t + 1;
                this.f6471t = i10;
                d0 d0Var = (d0) this.f6474w;
                return i10 < d0Var.f6454t.size() ? (Map.Entry) d0Var.f6454t.get(this.f6471t) : (Map.Entry) a().next();
            case 1:
                this.f6472u = true;
                int i11 = this.f6471t + 1;
                this.f6471t = i11;
                F0 f0 = (F0) this.f6474w;
                return i11 < f0.f8339s.size() ? (Map.Entry) f0.f8339s.get(this.f6471t) : (Map.Entry) b().next();
            default:
                this.f6472u = true;
                int i12 = this.f6471t + 1;
                this.f6471t = i12;
                p104k9.y yVar = (p104k9.y) this.f6474w;
                return i12 < yVar.f12837t.size() ? (Map.Entry) yVar.f12837t.get(this.f6471t) : (Map.Entry) a().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.f6474w;
        switch (this.f6470s) {
            case 0:
                if (!this.f6472u) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f6472u = false;
                int i10 = d0.f6452y;
                d0 d0Var = (d0) abstractMap;
                d0Var.b();
                if (this.f6471t >= d0Var.f6454t.size()) {
                    a().remove();
                    return;
                }
                int i11 = this.f6471t;
                this.f6471t = i11 - 1;
                d0Var.h(i11);
                return;
            case 1:
                if (!this.f6472u) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f6472u = false;
                int i12 = F0.f8338x;
                F0 f0 = (F0) abstractMap;
                f0.h();
                if (this.f6471t >= f0.f8339s.size()) {
                    b().remove();
                    return;
                }
                int i13 = this.f6471t;
                this.f6471t = i13 - 1;
                f0.e(i13);
                return;
            default:
                if (!this.f6472u) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f6472u = false;
                int i14 = p104k9.y.f12835x;
                p104k9.y yVar = (p104k9.y) abstractMap;
                yVar.b();
                if (this.f6471t >= yVar.f12837t.size()) {
                    a().remove();
                    return;
                }
                int i15 = this.f6471t;
                this.f6471t = i15 - 1;
                yVar.g(i15);
                return;
        }
    }
}
