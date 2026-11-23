package P3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final ArrayList a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3893b;

    public n() {
        this.a = new ArrayList();
        this.f3893b = 128;
    }

    public synchronized List a() {
        return Collections.unmodifiableList(new ArrayList(this.a));
    }

    public boolean b() {
        return this.f3893b < this.a.size();
    }

    public n(ArrayList arrayList) {
        this.a = arrayList;
    }
}
