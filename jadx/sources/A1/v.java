package A1;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final Q1.f a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f180b;

    public v(Q1.f fVar, Executor executor) {
        this.a = fVar;
        this.f180b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.a.equals(((v) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
