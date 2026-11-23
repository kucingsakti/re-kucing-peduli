package p160q4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile c f14418b;
    public final HashSet a;

    public c() {
        this.a = new HashSet();
    }

    public Set a() {
        Set setUnmodifiableSet;
        synchronized (this.a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.a);
        }
        return setUnmodifiableSet;
    }

    public c(HashSet hashSet) {
        this.a = hashSet;
    }
}
