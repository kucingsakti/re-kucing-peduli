package p047e9;

import B4.C0154b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0675d;
import p104k9.AbstractC0680i;
import p104k9.C0674c;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.n;

/* JADX INFO: loaded from: classes.dex */
public final class K extends n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final K f10823w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0609a f10824x = new C0609a(13);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0675d f10825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f10826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f10827u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10828v;

    static {
        K k3 = new K();
        f10823w = k3;
        k3.f10826t = Collections.EMPTY_LIST;
    }

    public K() {
        this.f10827u = (byte) -1;
        this.f10828v = -1;
        this.f10825s = AbstractC0675d.f12795s;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f10828v;
        if (i10 != -1) {
            return i10;
        }
        int iD = 0;
        for (int i11 = 0; i11 < this.f10826t.size(); i11++) {
            iD += C0154b.d(1, (AbstractC0672a) this.f10826t.get(i11));
        }
        int size = this.f10825s.size() + iD;
        this.f10828v = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        C0621m c0621m = new C0621m(1);
        c0621m.f11147v = Collections.EMPTY_LIST;
        return c0621m;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        C0621m c0621m = new C0621m(1);
        c0621m.f11147v = Collections.EMPTY_LIST;
        c0621m.l(this);
        return c0621m;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        for (int i10 = 0; i10 < this.f10826t.size(); i10++) {
            c0154b.o(1, (AbstractC0672a) this.f10826t.get(i10));
        }
        c0154b.r(this.f10825s);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f10827u;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f10826t.size(); i10++) {
            if (!((J) this.f10826t.get(i10)).isInitialized()) {
                this.f10827u = (byte) 0;
                return false;
            }
        }
        this.f10827u = (byte) 1;
        return true;
    }

    public K(C0621m c0621m) {
        this.f10827u = (byte) -1;
        this.f10828v = -1;
        this.f10825s = c0621m.f12808s;
    }

    public K(C0676e c0676e, C0678g c0678g) {
        this.f10827u = (byte) -1;
        this.f10828v = -1;
        this.f10826t = Collections.EMPTY_LIST;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        boolean z6 = false;
        boolean z10 = false;
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    if (iN != 0) {
                        if (iN != 10) {
                            if (!c0676e.q(iN, c0154bJ)) {
                            }
                        } else {
                            if (!z10) {
                                this.f10826t = new ArrayList();
                                z10 = true;
                            }
                            this.f10826t.add(c0676e.g(J.f10814A, c0678g));
                        }
                    }
                    z6 = true;
                } catch (InvalidProtocolBufferException e10) {
                    e10.f12841s = this;
                    throw e10;
                } catch (IOException e11) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                    invalidProtocolBufferException.f12841s = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if (z10) {
                    this.f10826t = Collections.unmodifiableList(this.f10826t);
                }
                try {
                    c0154bJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f10825s = c0674c.c();
                }
                throw th;
            }
        }
        if (z10) {
            this.f10826t = Collections.unmodifiableList(this.f10826t);
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f10825s = c0674c.c();
        }
    }
}
