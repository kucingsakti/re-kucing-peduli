package G9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Iterable, p219w8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f1752s;

    public final boolean isEmpty() {
        return this.f1752s.e() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f1752s.iterator();
    }
}
