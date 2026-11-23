package p018b8;

import J7.j;
import io.reactivex.exceptions.ProtocolViolationException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ua.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f7319s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a[] f7320t;

    static {
        a aVar = new a("CANCELLED", 0);
        f7319s = aVar;
        f7320t = new a[]{aVar};
    }

    public static boolean g(long j) {
        if (j > 0) {
            return true;
        }
        j.y(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    public static boolean h(ua.a aVar, ua.a aVar2) {
        if (aVar2 == null) {
            j.y(new NullPointerException("next is null"));
            return false;
        }
        if (aVar == null) {
            return true;
        }
        aVar2.cancel();
        j.y(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f7320t.clone();
    }

    @Override // ua.a
    public final void cancel() {
    }

    @Override // ua.a
    public final void f(long j) {
    }
}
