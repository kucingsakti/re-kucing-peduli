package p086i8;

import java.util.AbstractList;
import java.util.List;
import p219w8.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends AbstractList implements List, c {
    public abstract int e();

    public abstract Object f(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return f(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return e();
    }
}
