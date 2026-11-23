package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0500u implements Cloneable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0502w f6520s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AbstractC0502w f6521t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6522u = false;

    public AbstractC0500u(AbstractC0502w abstractC0502w) {
        this.f6520s = abstractC0502w;
        this.f6521t = (AbstractC0502w) abstractC0502w.d(4);
    }

    public static void e(AbstractC0502w abstractC0502w, AbstractC0502w abstractC0502w2) {
        X x8 = X.f6439c;
        x8.getClass();
        x8.a(abstractC0502w.getClass()).h(abstractC0502w, abstractC0502w2);
    }

    public final AbstractC0502w a() {
        AbstractC0502w abstractC0502wC = c();
        if (abstractC0502wC.g()) {
            return abstractC0502wC;
        }
        throw new UninitializedMessageException();
    }

    public final AbstractC0502w c() {
        if (this.f6522u) {
            return this.f6521t;
        }
        AbstractC0502w abstractC0502w = this.f6521t;
        abstractC0502w.getClass();
        X x8 = X.f6439c;
        x8.getClass();
        x8.a(abstractC0502w.getClass()).d(abstractC0502w);
        this.f6522u = true;
        return this.f6521t;
    }

    public final Object clone() {
        AbstractC0500u abstractC0500u = (AbstractC0500u) this.f6520s.d(5);
        AbstractC0502w abstractC0502wC = c();
        abstractC0500u.d();
        e(abstractC0500u.f6521t, abstractC0502wC);
        return abstractC0500u;
    }

    public final void d() {
        if (this.f6522u) {
            AbstractC0502w abstractC0502w = (AbstractC0502w) this.f6521t.d(4);
            e(abstractC0502w, this.f6521t);
            this.f6521t = abstractC0502w;
            this.f6522u = false;
        }
    }
}
