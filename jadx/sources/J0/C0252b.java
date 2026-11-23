package J0;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: renamed from: J0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0252b {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2272c;

    public C0252b(DefaultClock defaultClock) {
        this.a = 1;
        Preconditions.i(defaultClock);
        this.f2272c = defaultClock;
    }

    public void a(int i10) {
        if (i10 < 64) {
            this.f2271b &= ~(1 << i10);
            return;
        }
        C0252b c0252b = (C0252b) this.f2272c;
        if (c0252b != null) {
            c0252b.a(i10 - 64);
        }
    }

    public int b(int i10) {
        C0252b c0252b = (C0252b) this.f2272c;
        if (c0252b == null) {
            return i10 >= 64 ? Long.bitCount(this.f2271b) : Long.bitCount(this.f2271b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.f2271b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.f2271b) + c0252b.b(i10 - 64);
    }

    public void c() {
        if (((C0252b) this.f2272c) == null) {
            this.f2272c = new C0252b();
        }
    }

    public boolean d(int i10) {
        if (i10 < 64) {
            return (this.f2271b & (1 << i10)) != 0;
        }
        c();
        return ((C0252b) this.f2272c).d(i10 - 64);
    }

    public void e(int i10, boolean z6) {
        if (i10 >= 64) {
            c();
            ((C0252b) this.f2272c).e(i10 - 64, z6);
            return;
        }
        long j = this.f2271b;
        boolean z10 = (Long.MIN_VALUE & j) != 0;
        long j10 = (1 << i10) - 1;
        this.f2271b = ((j & (~j10)) << 1) | (j & j10);
        if (z6) {
            h(i10);
        } else {
            a(i10);
        }
        if (z10 || ((C0252b) this.f2272c) != null) {
            c();
            ((C0252b) this.f2272c).e(0, z10);
        }
    }

    public boolean f(int i10) {
        if (i10 >= 64) {
            c();
            return ((C0252b) this.f2272c).f(i10 - 64);
        }
        long j = 1 << i10;
        long j10 = this.f2271b;
        boolean z6 = (j10 & j) != 0;
        long j11 = j10 & (~j);
        this.f2271b = j11;
        long j12 = j - 1;
        this.f2271b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        C0252b c0252b = (C0252b) this.f2272c;
        if (c0252b != null) {
            if (c0252b.d(0)) {
                h(63);
            }
            ((C0252b) this.f2272c).f(0);
        }
        return z6;
    }

    public void g() {
        this.f2271b = 0L;
        C0252b c0252b = (C0252b) this.f2272c;
        if (c0252b != null) {
            c0252b.g();
        }
    }

    public void h(int i10) {
        if (i10 < 64) {
            this.f2271b |= 1 << i10;
        } else {
            c();
            ((C0252b) this.f2272c).h(i10 - 64);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((C0252b) this.f2272c) == null) {
                    return Long.toBinaryString(this.f2271b);
                }
                return ((C0252b) this.f2272c).toString() + "xx" + Long.toBinaryString(this.f2271b);
            default:
                return super.toString();
        }
    }

    public C0252b(ma.r rVar) {
        this.a = 2;
        p210v8.i.f(rVar, "source");
        this.f2272c = rVar;
        this.f2271b = 262144L;
    }

    public C0252b() {
        this.a = 0;
        this.f2271b = 0L;
    }
}
