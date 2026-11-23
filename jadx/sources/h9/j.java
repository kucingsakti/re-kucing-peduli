package h9;

import B4.C0154b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p047e9.C0609a;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0675d;
import p104k9.AbstractC0680i;
import p104k9.C0674c;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.n;

/* JADX INFO: loaded from: classes.dex */
public final class j extends n {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final j f11870y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0609a f11871z = new C0609a(27);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0675d f11872s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f11873t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f11874u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11875v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f11876w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11877x;

    static {
        j jVar = new j();
        f11870y = jVar;
        List list = Collections.EMPTY_LIST;
        jVar.f11873t = list;
        jVar.f11874u = list;
    }

    public j() {
        this.f11875v = -1;
        this.f11876w = (byte) -1;
        this.f11877x = -1;
        this.f11872s = AbstractC0675d.f12795s;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f11877x;
        if (i10 != -1) {
            return i10;
        }
        int iD = 0;
        for (int i11 = 0; i11 < this.f11873t.size(); i11++) {
            iD += C0154b.d(1, (AbstractC0672a) this.f11873t.get(i11));
        }
        int iC = 0;
        for (int i12 = 0; i12 < this.f11874u.size(); i12++) {
            iC += C0154b.c(((Integer) this.f11874u.get(i12)).intValue());
        }
        int iC2 = iD + iC;
        if (!this.f11874u.isEmpty()) {
            iC2 = iC2 + 1 + C0154b.c(iC);
        }
        this.f11875v = iC;
        int size = this.f11872s.size() + iC2;
        this.f11877x = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.f11842u = list;
        fVar.f11843v = list;
        return fVar;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.f11842u = list;
        fVar.f11843v = list;
        fVar.h(this);
        return fVar;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        for (int i10 = 0; i10 < this.f11873t.size(); i10++) {
            c0154b.o(1, (AbstractC0672a) this.f11873t.get(i10));
        }
        if (this.f11874u.size() > 0) {
            c0154b.v(42);
            c0154b.v(this.f11875v);
        }
        for (int i11 = 0; i11 < this.f11874u.size(); i11++) {
            c0154b.n(((Integer) this.f11874u.get(i11)).intValue());
        }
        c0154b.r(this.f11872s);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        if (this.f11876w == 1) {
            return true;
        }
        this.f11876w = (byte) 1;
        return true;
    }

    public j(f fVar) {
        this.f11875v = -1;
        this.f11876w = (byte) -1;
        this.f11877x = -1;
        this.f11872s = fVar.f12808s;
    }

    public j(C0676e c0676e, C0678g c0678g) {
        this.f11875v = -1;
        this.f11876w = (byte) -1;
        this.f11877x = -1;
        List list = Collections.EMPTY_LIST;
        this.f11873t = list;
        this.f11874u = list;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        boolean z6 = false;
        int i10 = 0;
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if ((i10 & 1) != 1) {
                                this.f11873t = new ArrayList();
                                i10 |= 1;
                            }
                            this.f11873t.add(c0676e.g(i.f11857F, c0678g));
                        } else if (iN == 40) {
                            if ((i10 & 2) != 2) {
                                this.f11874u = new ArrayList();
                                i10 |= 2;
                            }
                            this.f11874u.add(Integer.valueOf(c0676e.k()));
                        } else if (iN != 42) {
                            if (!c0676e.q(iN, c0154bJ)) {
                            }
                        } else {
                            int iD = c0676e.d(c0676e.k());
                            if ((i10 & 2) != 2 && c0676e.b() > 0) {
                                this.f11874u = new ArrayList();
                                i10 |= 2;
                            }
                            while (c0676e.b() > 0) {
                                this.f11874u.add(Integer.valueOf(c0676e.k()));
                            }
                            c0676e.c(iD);
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
                if ((i10 & 1) == 1) {
                    this.f11873t = Collections.unmodifiableList(this.f11873t);
                }
                if ((i10 & 2) == 2) {
                    this.f11874u = Collections.unmodifiableList(this.f11874u);
                }
                try {
                    c0154bJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f11872s = c0674c.c();
                }
                throw th;
            }
        }
        if ((i10 & 1) == 1) {
            this.f11873t = Collections.unmodifiableList(this.f11873t);
        }
        if ((i10 & 2) == 2) {
            this.f11874u = Collections.unmodifiableList(this.f11874u);
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f11872s = c0674c.c();
        }
    }
}
