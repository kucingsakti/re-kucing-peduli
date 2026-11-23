package p086i8;

import com.bumptech.glide.d;
import java.util.ArrayList;
import java.util.List;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends d {
    public static int B(List list) {
        i.f(list, "<this>");
        return list.size() - 1;
    }

    public static List C(Object... objArr) {
        i.f(objArr, "elements");
        return objArr.length > 0 ? i.l(objArr) : s.f12328s;
    }

    public static List D(Object obj) {
        return obj != null ? d.u(obj) : s.f12328s;
    }

    public static ArrayList E(Object... objArr) {
        i.f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new g(objArr, true));
    }

    public static final List F(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : d.u(list.get(0));
        }
        return s.f12328s;
    }

    public static void G() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
