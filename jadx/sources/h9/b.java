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
public final class b extends n {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f11808y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0609a f11809z = new C0609a(24);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0675d f11810s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11811t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11812u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11813v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f11814w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11815x;

    static {
        b bVar = new b();
        f11808y = bVar;
        bVar.f11812u = 0;
        bVar.f11813v = 0;
    }

    public b() {
        this.f11814w = (byte) -1;
        this.f11815x = -1;
        this.f11810s = AbstractC0675d.f12795s;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f11815x;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f11811t & 1) == 1 ? C0154b.b(1, this.f11812u) : 0;
        if ((this.f11811t & 2) == 2) {
            iB += C0154b.b(2, this.f11813v);
        }
        int size = this.f11810s.size() + iB;
        this.f11815x = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return new a(0);
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        a aVar = new a(0);
        aVar.i(this);
        return aVar;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        if ((this.f11811t & 1) == 1) {
            c0154b.m(1, this.f11812u);
        }
        if ((this.f11811t & 2) == 2) {
            c0154b.m(2, this.f11813v);
        }
        c0154b.r(this.f11810s);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        if (this.f11814w == 1) {
            return true;
        }
        this.f11814w = (byte) 1;
        return true;
    }

    public b(a aVar) {
        this.f11814w = (byte) -1;
        this.f11815x = -1;
        this.f11810s = aVar.f12808s;
    }

    public b(C0676e c0676e) {
        this.f11814w = (byte) -1;
        this.f11815x = -1;
        boolean z6 = false;
        this.f11812u = 0;
        this.f11813v = 0;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f11811t |= 1;
                            this.f11812u = c0676e.k();
                        } else if (iN != 16) {
                            if (!c0676e.q(iN, c0154bJ)) {
                            }
                        } else {
                            this.f11811t |= 2;
                            this.f11813v = c0676e.k();
                        }
                    }
                    z6 = true;
                } catch (Throwable th) {
                    try {
                        c0154bJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f11810s = c0674c.c();
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
            this.f11810s = c0674c.c();
        }
    }
}
