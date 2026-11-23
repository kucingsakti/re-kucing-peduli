package p085i7;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import p102k7.e;
import p163q7.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f12301s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f12302t;

    public g(f fVar) {
        this.f12302t = fVar;
        f fVar2 = fVar.f12300z;
        this.f12301s = new Object();
    }

    public final List a(List list) {
        List listA;
        i.g(list, "ids");
        synchronized (this.f12301s) {
            listA = this.f12302t.a(list);
        }
        return listA;
    }

    public final List b(int i10) {
        List listB;
        synchronized (this.f12301s) {
            listB = this.f12302t.b(i10);
        }
        return listB;
    }

    public final e c() {
        e eVar;
        synchronized (this.f12301s) {
            eVar = this.f12302t.f12294t;
        }
        return eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f12301s) {
            this.f12302t.close();
        }
    }

    public final List g() {
        List listG;
        AbstractC0487g.v(1, "prioritySort");
        synchronized (this.f12301s) {
            listG = this.f12302t.g();
        }
        return listG;
    }

    public final void h() {
        synchronized (this.f12301s) {
            this.f12302t.i();
        }
    }

    public final void i(ArrayList arrayList) {
        synchronized (this.f12301s) {
            this.f12302t.n(arrayList);
        }
    }
}
