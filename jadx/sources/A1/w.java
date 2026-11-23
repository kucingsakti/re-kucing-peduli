package A1;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Iterable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f181s;

    public w(ArrayList arrayList) {
        this.f181s = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f181s.iterator();
    }
}
