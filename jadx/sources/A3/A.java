package A3;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends AbstractC0105c implements Serializable {
    final transient AbstractC0121t map;
    final transient int size;

    public A(AbstractC0121t abstractC0121t, int i10) {
        this.map = abstractC0121t;
        this.size = i10;
    }

    @Override // A3.AbstractC0105c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC0121t a() {
        return this.map;
    }
}
