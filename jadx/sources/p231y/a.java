package p231y;

import android.os.Bundle;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static int a(int i10, String str, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    public static Object b(Bundle bundle, String str, String str2, String str3, String str4) {
        i.f(bundle, str);
        i.f(str2, str3);
        return bundle.get(str4);
    }

    public static String c(String str, String str2) {
        return str + str2;
    }
}
