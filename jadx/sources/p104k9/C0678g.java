package p104k9;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: k9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0678g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f12805b = 0;
    public final Map a;

    static {
        new C0678g(0);
    }

    public C0678g() {
        this.a = new HashMap();
    }

    public final void a(m mVar) {
        this.a.put(new C0677f(mVar.f12817d.f12812s, mVar.a), mVar);
    }

    public C0678g(int i10) {
        this.a = Collections.EMPTY_MAP;
    }
}
