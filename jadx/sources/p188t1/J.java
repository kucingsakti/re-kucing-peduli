package p188t1;

import p086i8.C;

/* JADX INFO: loaded from: classes.dex */
public final class J {
    public static volatile J a;

    static {
        C.a(C.c("0C63A7DD35F6C6B58372011B9342600BC7C8BAE5"));
        C.a(C.c("0C63A7DD35F7C0A489650B01954A4B30C2DDAB"));
        C.a(C.c("1361A6CC0FEBD6AF8963300B94587A20C6DB"));
        C.a(C.c("1267B7C618E1CCA981480C078E436031D1"));
    }

    public static void a() {
        if (a == null) {
            synchronized (J.class) {
                try {
                    if (a == null) {
                        a = new J();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
