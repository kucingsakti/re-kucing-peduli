package p163q7;

import android.os.Handler;
import c2.a;
import kotlin.TypeCastException;
import p122m7.d;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14433c;
    public final Object a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f14434d = (Handler) new a(this, 16).invoke();

    public final void a() {
        synchronized (this.a) {
            if (!this.f14432b) {
                this.f14432b = true;
                try {
                    this.f14434d.removeCallbacksAndMessages(null);
                    this.f14434d.getLooper().quit();
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            if (!this.f14432b) {
                int i10 = this.f14433c;
                if (i10 == 0) {
                } else {
                    this.f14433c = i10 - 1;
                }
            }
        }
    }

    public final void c() {
        synchronized (this.a) {
            if (!this.f14432b) {
                this.f14433c++;
            }
        }
    }

    public final void d(p200u8.a aVar) {
        synchronized (this.a) {
            if (!this.f14432b) {
                this.f14434d.post(new d(aVar));
            }
        }
    }

    public final int e() {
        int i10;
        synchronized (this.a) {
            i10 = !this.f14432b ? this.f14433c : 0;
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2core.HandlerWrapper");
        }
        return true;
    }

    public final int hashCode() {
        return -1521653773;
    }
}
