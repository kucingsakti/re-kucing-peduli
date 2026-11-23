package Z9;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import ma.w;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Closeable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f5934s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f5935t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f5936u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f5937v;

    public e(g gVar, String str, long j, ArrayList arrayList, long[] jArr) {
        i.f(gVar, "this$0");
        i.f(str, "key");
        i.f(jArr, "lengths");
        this.f5937v = gVar;
        this.f5934s = str;
        this.f5935t = j;
        this.f5936u = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f5936u.iterator();
        while (it.hasNext()) {
            Y9.c.d((w) it.next());
        }
    }
}
