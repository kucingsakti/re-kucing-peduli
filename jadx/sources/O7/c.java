package O7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Q7.b, L7.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f3610s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ c[] f3611t;

    static {
        c cVar = new c("INSTANCE", 0);
        f3610s = cVar;
        f3611t = new c[]{cVar, new c("NEVER", 1)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f3611t.clone();
    }

    @Override // Q7.d
    public final boolean isEmpty() {
        return true;
    }

    @Override // Q7.d
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Q7.d
    public final Object poll() {
        return null;
    }

    @Override // Q7.d
    public final void clear() {
    }

    @Override // L7.b
    public final void f() {
    }
}
