package p182s4;

/* JADX INFO: loaded from: classes.dex */
public final class F {
    public final N a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0765b f14613b;

    public F(N n10, C0765b c0765b) {
        this.a = n10;
        this.f14613b = c0765b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        f10.getClass();
        return this.a.equals(f10.a) && this.f14613b.equals(f10.f14613b);
    }

    public final int hashCode() {
        return this.f14613b.hashCode() + ((this.a.hashCode() + (EnumC0774k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EnumC0774k.SESSION_START + ", sessionData=" + this.a + ", applicationInfo=" + this.f14613b + ')';
    }
}
