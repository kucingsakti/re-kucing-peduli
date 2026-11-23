package Y7;

import Q7.d;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AtomicReferenceArray implements d {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Integer f5696x = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f5697s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicLong f5698t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f5699u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicLong f5700v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f5701w;

    public a(int i10) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i10 - 1)));
        this.f5697s = length() - 1;
        this.f5698t = new AtomicLong();
        this.f5700v = new AtomicLong();
        this.f5701w = Math.min(i10 / 4, f5696x.intValue());
    }

    @Override // Q7.d
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // Q7.d
    public final boolean isEmpty() {
        return this.f5698t.get() == this.f5700v.get();
    }

    @Override // Q7.d
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f5698t;
        long j = atomicLong.get();
        int i10 = this.f5697s;
        int i11 = ((int) j) & i10;
        if (j >= this.f5699u) {
            long j10 = ((long) this.f5701w) + j;
            if (get(i10 & ((int) j10)) == null) {
                this.f5699u = j10;
            } else if (get(i11) != null) {
                return false;
            }
        }
        lazySet(i11, obj);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // Q7.d
    public final Object poll() {
        AtomicLong atomicLong = this.f5700v;
        long j = atomicLong.get();
        int i10 = ((int) j) & this.f5697s;
        Object obj = get(i10);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i10, null);
        return obj;
    }
}
