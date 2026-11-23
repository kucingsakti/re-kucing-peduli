package p246z8;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends d {
    @Override // p246z8.d
    public final int a(int i10) {
        return ((-i10) >> 31) & (d().nextInt() >>> (32 - i10));
    }

    @Override // p246z8.d
    public final int b() {
        return d().nextInt();
    }

    public abstract Random d();
}
