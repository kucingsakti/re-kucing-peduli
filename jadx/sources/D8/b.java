package D8;

import J9.l;
import java.util.LinkedList;
import p210v8.i;
import p210v8.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedList f1077b;

    public b(LinkedList linkedList) {
        this.f1077b = linkedList;
    }

    @Override // J9.l
    public final boolean d(Object obj) {
        j jVar = (j) obj;
        i.f(jVar, "current");
        this.f1077b.add(jVar);
        return true;
    }

    @Override // J9.l
    public final Object k() {
        return this.f1077b;
    }
}
