package p246z8;

import F2.c;
import java.util.Random;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f16316t = new c(5);

    @Override // p246z8.a
    public final Random d() {
        Object obj = this.f16316t.get();
        i.e(obj, "get(...)");
        return (Random) obj;
    }
}
