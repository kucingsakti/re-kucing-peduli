package da;

import B4.C0157e;
import X9.y;
import java.util.concurrent.TimeUnit;
import p020ba.k;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y f10580v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f10581w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10582x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0157e f10583y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C0157e c0157e, y yVar) {
        super(c0157e);
        i.f(c0157e, "this$0");
        i.f(yVar, "url");
        this.f10583y = c0157e;
        this.f10580v = yVar;
        this.f10581w = -1L;
        this.f10582x = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10575t) {
            return;
        }
        if (this.f10582x) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!Y9.c.h(this)) {
                ((k) this.f10583y.f667d).l();
                a();
            }
        }
        this.f10575t = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        if (r8.f10582x == false) goto L32;
     */
    @Override // da.a, ma.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long u(ma.f r9, long r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: da.c.u(ma.f, long):long");
    }
}
