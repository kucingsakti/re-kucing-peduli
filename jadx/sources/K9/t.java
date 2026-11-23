package K9;

import U.Z;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Iterator, p219w8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2707s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Iterator f2708t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f2709u;

    public t(Z z6) {
        this.f2707s = 1;
        this.f2709u = new ArrayList();
        this.f2708t = z6;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2707s) {
            case 0:
                break;
        }
        return this.f2708t.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2707s) {
            case 0:
                return ((u) this.f2709u).f2710b.invoke(this.f2708t.next());
            default:
                Object next = this.f2708t.next();
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                Z z6 = viewGroup != null ? new Z(viewGroup, 0) : null;
                ArrayList arrayList = (ArrayList) this.f2709u;
                if (z6 == null || !z6.hasNext()) {
                    while (!this.f2708t.hasNext() && !arrayList.isEmpty()) {
                        this.f2708t = (Iterator) p086i8.k.b0(arrayList);
                        p086i8.q.K(arrayList);
                    }
                } else {
                    arrayList.add(this.f2708t);
                    this.f2708t = z6;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2707s) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t(u uVar) {
        this.f2707s = 0;
        this.f2709u = uVar;
        this.f2708t = uVar.a.iterator();
    }
}
