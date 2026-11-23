package p086i8;

import java.util.Collection;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends l {
    public static int H(Iterable iterable, int i10) {
        i.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }
}
