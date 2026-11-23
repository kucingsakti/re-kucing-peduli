package p086i8;

import java.util.AbstractSet;
import java.util.Set;
import p219w8.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends AbstractSet implements Set, e {
    public abstract int e();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return e();
    }
}
