package h9;

import B4.C0154b;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p047e9.C0609a;
import p104k9.AbstractC0675d;
import p104k9.AbstractC0680i;
import p104k9.C0674c;
import p104k9.C0676e;
import p104k9.n;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f11816y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0609a f11817z = new C0609a(25);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0675d f11818s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11819t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11820u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11821v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f11822w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11823x;

    static {
        c cVar = new c();
        f11816y = cVar;
        cVar.f11820u = 0;
        cVar.f11821v = 0;
    }

    public c() {
        this.f11822w = (byte) -1;
        this.f11823x = -1;
        this.f11818s = AbstractC0675d.f12795s;
    }

    public static a h(c cVar) {
        a aVar = new a(1);
        aVar.j(cVar);
        return aVar;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f11823x;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f11819t & 1) == 1 ? C0154b.b(1, this.f11820u) : 0;
        if ((this.f11819t & 2) == 2) {
            iB += C0154b.b(2, this.f11821v);
        }
        int size = this.f11818s.size() + iB;
        this.f11823x = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return new a(1);
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        return h(this);
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        if ((this.f11819t & 1) == 1) {
            c0154b.m(1, this.f11820u);
        }
        if ((this.f11819t & 2) == 2) {
            c0154b.m(2, this.f11821v);
        }
        c0154b.r(this.f11818s);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        if (this.f11822w == 1) {
            return true;
        }
        this.f11822w = (byte) 1;
        return true;
    }

    public c(a aVar) {
        this.f11822w = (byte) -1;
        this.f11823x = -1;
        this.f11818s = aVar.f12808s;
    }

    public c(C0676e c0676e) {
        this.f11822w = (byte) -1;
        this.f11823x = -1;
        boolean z6 = false;
        this.f11820u = 0;
        this.f11821v = 0;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f11819t |= 1;
                            this.f11820u = c0676e.k();
                        } else if (iN != 16) {
                            if (!c0676e.q(iN, c0154bJ)) {
                            }
                        } else {
                            this.f11819t |= 2;
                            this.f11821v = c0676e.k();
                        }
                    }
                    z6 = true;
                } catch (Throwable th) {
                    try {
                        c0154bJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f11818s = c0674c.c();
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                e10.f12841s = this;
                throw e10;
            } catch (IOException e11) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                invalidProtocolBufferException.f12841s = this;
                throw invalidProtocolBufferException;
            }
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f11818s = c0674c.c();
        }
    }
}
