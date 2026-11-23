package p104k9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Iterator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Stack f12823s = new Stack();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public s f12824t;

    public v(AbstractC0675d abstractC0675d) {
        while (abstractC0675d instanceof x) {
            x xVar = (x) abstractC0675d;
            this.f12823s.push(xVar);
            abstractC0675d = xVar.f12830u;
        }
        this.f12824t = (s) abstractC0675d;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s next() {
        s sVar;
        s sVar2 = this.f12824t;
        if (sVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            Stack stack = this.f12823s;
            if (stack.isEmpty()) {
                sVar = null;
                break;
            }
            AbstractC0675d abstractC0675d = ((x) stack.pop()).f12831v;
            while (abstractC0675d instanceof x) {
                x xVar = (x) abstractC0675d;
                stack.push(xVar);
                abstractC0675d = xVar.f12830u;
            }
            sVar = (s) abstractC0675d;
        } while (sVar.f12821t.length == 0);
        this.f12824t = sVar;
        return sVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12824t != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
