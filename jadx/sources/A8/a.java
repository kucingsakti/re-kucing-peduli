package A8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p246z8.a {
    @Override // p246z8.d
    public final int c(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // p246z8.a
    public final Random d() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        i.e(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
