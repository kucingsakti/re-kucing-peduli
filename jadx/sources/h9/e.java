package h9;

import B4.C0154b;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p047e9.C0609a;
import p104k9.AbstractC0675d;
import p104k9.AbstractC0680i;
import p104k9.C0674c;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.n;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final e f11830B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0609a f11831C = new C0609a(26);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f11832A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0675d f11833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11834t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f11835u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f11836v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f11837w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c f11838x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c f11839y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public byte f11840z;

    static {
        e eVar = new e();
        f11830B = eVar;
        eVar.f11835u = b.f11808y;
        c cVar = c.f11816y;
        eVar.f11836v = cVar;
        eVar.f11837w = cVar;
        eVar.f11838x = cVar;
        eVar.f11839y = cVar;
    }

    public e() {
        this.f11840z = (byte) -1;
        this.f11832A = -1;
        this.f11833s = AbstractC0675d.f12795s;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f11832A;
        if (i10 != -1) {
            return i10;
        }
        int iD = (this.f11834t & 1) == 1 ? C0154b.d(1, this.f11835u) : 0;
        if ((this.f11834t & 2) == 2) {
            iD += C0154b.d(2, this.f11836v);
        }
        if ((this.f11834t & 4) == 4) {
            iD += C0154b.d(3, this.f11837w);
        }
        if ((this.f11834t & 8) == 8) {
            iD += C0154b.d(4, this.f11838x);
        }
        if ((this.f11834t & 16) == 16) {
            iD += C0154b.d(5, this.f11839y);
        }
        int size = this.f11833s.size() + iD;
        this.f11832A = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return d.h();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        d dVarH = d.h();
        dVarH.i(this);
        return dVarH;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        if ((this.f11834t & 1) == 1) {
            c0154b.o(1, this.f11835u);
        }
        if ((this.f11834t & 2) == 2) {
            c0154b.o(2, this.f11836v);
        }
        if ((this.f11834t & 4) == 4) {
            c0154b.o(3, this.f11837w);
        }
        if ((this.f11834t & 8) == 8) {
            c0154b.o(4, this.f11838x);
        }
        if ((this.f11834t & 16) == 16) {
            c0154b.o(5, this.f11839y);
        }
        c0154b.r(this.f11833s);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        if (this.f11840z == 1) {
            return true;
        }
        this.f11840z = (byte) 1;
        return true;
    }

    public e(d dVar) {
        this.f11840z = (byte) -1;
        this.f11832A = -1;
        this.f11833s = dVar.f12808s;
    }

    public e(C0676e c0676e, C0678g c0678g) {
        this.f11840z = (byte) -1;
        this.f11832A = -1;
        this.f11835u = b.f11808y;
        c cVar = c.f11816y;
        this.f11836v = cVar;
        this.f11837w = cVar;
        this.f11838x = cVar;
        this.f11839y = cVar;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        boolean z6 = false;
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    if (iN != 0) {
                        a aVarH = null;
                        if (iN == 10) {
                            if ((this.f11834t & 1) == 1) {
                                b bVar = this.f11835u;
                                bVar.getClass();
                                aVarH = new a(0);
                                aVarH.i(bVar);
                            }
                            b bVar2 = (b) c0676e.g(b.f11809z, c0678g);
                            this.f11835u = bVar2;
                            if (aVarH != null) {
                                aVarH.i(bVar2);
                                this.f11835u = aVarH.f();
                            }
                            this.f11834t |= 1;
                        } else if (iN == 18) {
                            if ((this.f11834t & 2) == 2) {
                                c cVar2 = this.f11836v;
                                cVar2.getClass();
                                aVarH = c.h(cVar2);
                            }
                            c cVar3 = (c) c0676e.g(c.f11817z, c0678g);
                            this.f11836v = cVar3;
                            if (aVarH != null) {
                                aVarH.j(cVar3);
                                this.f11836v = aVarH.h();
                            }
                            this.f11834t |= 2;
                        } else if (iN == 26) {
                            if ((this.f11834t & 4) == 4) {
                                c cVar4 = this.f11837w;
                                cVar4.getClass();
                                aVarH = c.h(cVar4);
                            }
                            c cVar5 = (c) c0676e.g(c.f11817z, c0678g);
                            this.f11837w = cVar5;
                            if (aVarH != null) {
                                aVarH.j(cVar5);
                                this.f11837w = aVarH.h();
                            }
                            this.f11834t |= 4;
                        } else if (iN == 34) {
                            if ((this.f11834t & 8) == 8) {
                                c cVar6 = this.f11838x;
                                cVar6.getClass();
                                aVarH = c.h(cVar6);
                            }
                            c cVar7 = (c) c0676e.g(c.f11817z, c0678g);
                            this.f11838x = cVar7;
                            if (aVarH != null) {
                                aVarH.j(cVar7);
                                this.f11838x = aVarH.h();
                            }
                            this.f11834t |= 8;
                        } else if (iN != 42) {
                            if (!c0676e.q(iN, c0154bJ)) {
                            }
                        } else {
                            if ((this.f11834t & 16) == 16) {
                                c cVar8 = this.f11839y;
                                cVar8.getClass();
                                aVarH = c.h(cVar8);
                            }
                            c cVar9 = (c) c0676e.g(c.f11817z, c0678g);
                            this.f11839y = cVar9;
                            if (aVarH != null) {
                                aVarH.j(cVar9);
                                this.f11839y = aVarH.h();
                            }
                            this.f11834t |= 16;
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
                try {
                    c0154bJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f11833s = c0674c.c();
                }
                throw th;
            }
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f11833s = c0674c.c();
        }
    }
}
