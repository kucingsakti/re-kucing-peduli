package xa;

import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class b implements va.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f15797s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile va.a f15798t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Boolean f15799u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Method f15800v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public wa.a f15801w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinkedBlockingQueue f15802x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f15803y;

    public b(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z6) {
        this.f15797s = str;
        this.f15802x = linkedBlockingQueue;
        this.f15803y = z6;
    }

    @Override // va.a
    public final void a(String str) {
        f().a(str);
    }

    @Override // va.a
    public final void b(String str, Throwable th) {
        f().b(str, th);
    }

    @Override // va.a
    public final void c(String str) {
        f().c(str);
    }

    @Override // va.a
    public final void d(Object obj, String str) {
        f().d(obj, str);
    }

    @Override // va.a
    public final void e(String str) {
        f().e(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && b.class == obj.getClass() && this.f15797s.equals(((b) obj).f15797s);
    }

    public final va.a f() {
        if (this.f15798t != null) {
            return this.f15798t;
        }
        if (this.f15803y) {
            return a.f15796s;
        }
        if (this.f15801w == null) {
            wa.a aVar = new wa.a(0);
            aVar.f15699u = this;
            aVar.f15698t = this.f15797s;
            aVar.f15700v = this.f15802x;
            this.f15801w = aVar;
        }
        return this.f15801w;
    }

    public final boolean g() {
        Boolean bool = this.f15799u;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f15800v = this.f15798t.getClass().getMethod("log", wa.b.class);
            this.f15799u = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f15799u = Boolean.FALSE;
        }
        return this.f15799u.booleanValue();
    }

    @Override // va.a
    public final String getName() {
        return this.f15797s;
    }

    public final int hashCode() {
        return this.f15797s.hashCode();
    }
}
