package p029c9;

import p200u8.b;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class o extends k implements b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o f7563s = new o(1);

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        String str = (String) obj;
        i.f(str, "it");
        if (str.length() <= 1) {
            return str;
        }
        return "L" + str + ';';
    }
}
