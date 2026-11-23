package p114l9;

/* JADX INFO: loaded from: classes.dex */
public enum a {
    NO_ARGUMENTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(2),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS_PARENTHESIZED(true, true);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f12970s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f12971t;

    /* synthetic */ a(int i10) {
        this((i10 & 1) == 0, false);
    }

    a(boolean z6, boolean z10) {
        this.f12970s = z6;
        this.f12971t = z10;
    }
}
