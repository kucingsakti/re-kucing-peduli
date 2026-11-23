package P0;

import A0.r;
import I.D;
import android.content.Context;
import p076h8.l;

/* JADX INFO: loaded from: classes.dex */
public final class h implements O0.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f3823s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f3824t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final D f3825u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f3826v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f3827w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p076h8.j f3828x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f3829y;

    public h(Context context, String str, D d3, boolean z6, boolean z10) {
        p210v8.i.f(context, "context");
        p210v8.i.f(d3, "callback");
        this.f3823s = context;
        this.f3824t = str;
        this.f3825u = d3;
        this.f3826v = z6;
        this.f3827w = z10;
        this.f3828x = D3.b.s(new r(this, 21));
    }

    @Override // O0.c
    public final c S() {
        return ((g) this.f3828x.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3828x.f11797t != l.a) {
            ((g) this.f3828x.getValue()).close();
        }
    }

    @Override // O0.c
    public final void setWriteAheadLoggingEnabled(boolean z6) {
        if (this.f3828x.f11797t != l.a) {
            g gVar = (g) this.f3828x.getValue();
            p210v8.i.f(gVar, "sQLiteOpenHelper");
            gVar.setWriteAheadLoggingEnabled(z6);
        }
        this.f3829y = z6;
    }
}
