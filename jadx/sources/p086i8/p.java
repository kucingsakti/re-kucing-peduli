package p086i8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends o {
    public static void I(List list, Comparator comparator) {
        i.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
