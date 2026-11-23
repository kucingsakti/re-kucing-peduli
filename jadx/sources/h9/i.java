package h9;

import B4.C0154b;
import com.rollbar.notifier.sender.SyncSender;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p047e9.C0609a;
import p104k9.AbstractC0675d;
import p104k9.AbstractC0680i;
import p104k9.C0674c;
import p104k9.C0676e;
import p104k9.n;
import p104k9.s;

/* JADX INFO: loaded from: classes.dex */
public final class i extends n {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final i f11856E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final C0609a f11857F = new C0609a(28);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public List f11858A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f11859B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public byte f11860C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f11861D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0675d f11862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11864u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11865v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f11866w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f11867x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f11868y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f11869z;

    static {
        i iVar = new i();
        f11856E = iVar;
        iVar.f11864u = 1;
        iVar.f11865v = 0;
        iVar.f11866w = "";
        iVar.f11867x = h.NONE;
        List list = Collections.EMPTY_LIST;
        iVar.f11868y = list;
        iVar.f11858A = list;
    }

    public i() {
        this.f11869z = -1;
        this.f11859B = -1;
        this.f11860C = (byte) -1;
        this.f11861D = -1;
        this.f11862s = AbstractC0675d.f12795s;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        AbstractC0675d sVar;
        int i10 = this.f11861D;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f11863t & 1) == 1 ? C0154b.b(1, this.f11864u) : 0;
        if ((this.f11863t & 2) == 2) {
            iB += C0154b.b(2, this.f11865v);
        }
        if ((this.f11863t & 8) == 8) {
            iB += C0154b.a(3, this.f11867x.f11855s);
        }
        int iC = 0;
        for (int i11 = 0; i11 < this.f11868y.size(); i11++) {
            iC += C0154b.c(((Integer) this.f11868y.get(i11)).intValue());
        }
        int iC2 = iB + iC;
        if (!this.f11868y.isEmpty()) {
            iC2 = iC2 + 1 + C0154b.c(iC);
        }
        this.f11869z = iC;
        int iC3 = 0;
        for (int i12 = 0; i12 < this.f11858A.size(); i12++) {
            iC3 += C0154b.c(((Integer) this.f11858A.get(i12)).intValue());
        }
        int size = iC2 + iC3;
        if (!this.f11858A.isEmpty()) {
            size = size + 1 + C0154b.c(iC3);
        }
        this.f11859B = iC3;
        if ((this.f11863t & 4) == 4) {
            Object obj = this.f11866w;
            if (obj instanceof String) {
                try {
                    sVar = new s(((String) obj).getBytes(SyncSender.UTF_8));
                    this.f11866w = sVar;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported?", e10);
                }
            } else {
                sVar = (AbstractC0675d) obj;
            }
            size += sVar.size() + C0154b.f(sVar.size()) + C0154b.h(6);
        }
        int size2 = this.f11862s.size() + size;
        this.f11861D = size2;
        return size2;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return g.h();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        g gVarH = g.h();
        gVarH.i(this);
        return gVarH;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        AbstractC0675d sVar;
        b();
        if ((this.f11863t & 1) == 1) {
            c0154b.m(1, this.f11864u);
        }
        if ((this.f11863t & 2) == 2) {
            c0154b.m(2, this.f11865v);
        }
        if ((this.f11863t & 8) == 8) {
            c0154b.l(3, this.f11867x.f11855s);
        }
        if (this.f11868y.size() > 0) {
            c0154b.v(34);
            c0154b.v(this.f11869z);
        }
        for (int i10 = 0; i10 < this.f11868y.size(); i10++) {
            c0154b.n(((Integer) this.f11868y.get(i10)).intValue());
        }
        if (this.f11858A.size() > 0) {
            c0154b.v(42);
            c0154b.v(this.f11859B);
        }
        for (int i11 = 0; i11 < this.f11858A.size(); i11++) {
            c0154b.n(((Integer) this.f11858A.get(i11)).intValue());
        }
        if ((this.f11863t & 4) == 4) {
            Object obj = this.f11866w;
            if (obj instanceof String) {
                try {
                    sVar = new s(((String) obj).getBytes(SyncSender.UTF_8));
                    this.f11866w = sVar;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported?", e10);
                }
            } else {
                sVar = (AbstractC0675d) obj;
            }
            c0154b.x(6, 2);
            c0154b.v(sVar.size());
            c0154b.r(sVar);
        }
        c0154b.r(this.f11862s);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        if (this.f11860C == 1) {
            return true;
        }
        this.f11860C = (byte) 1;
        return true;
    }

    public i(g gVar) {
        this.f11869z = -1;
        this.f11859B = -1;
        this.f11860C = (byte) -1;
        this.f11861D = -1;
        this.f11862s = gVar.f12808s;
    }

    public i(C0676e c0676e) {
        h hVar;
        this.f11869z = -1;
        this.f11859B = -1;
        this.f11860C = (byte) -1;
        this.f11861D = -1;
        this.f11864u = 1;
        boolean z6 = false;
        this.f11865v = 0;
        this.f11866w = "";
        h hVar2 = h.NONE;
        this.f11867x = hVar2;
        List list = Collections.EMPTY_LIST;
        this.f11868y = list;
        this.f11858A = list;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        int i10 = 0;
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c0676e.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f11863t |= 1;
                                this.f11864u = c0676e.k();
                            } else if (iN == 16) {
                                this.f11863t |= 2;
                                this.f11865v = c0676e.k();
                            } else if (iN == 24) {
                                int iK = c0676e.k();
                                if (iK == 0) {
                                    hVar = hVar2;
                                } else if (iK != 1) {
                                    hVar = iK != 2 ? null : h.DESC_TO_CLASS_ID;
                                } else {
                                    hVar = h.INTERNAL_TO_CLASS_ID;
                                }
                                if (hVar == null) {
                                    c0154bJ.v(iN);
                                    c0154bJ.v(iK);
                                } else {
                                    this.f11863t |= 8;
                                    this.f11867x = hVar;
                                }
                            } else if (iN == 32) {
                                if ((i10 & 16) != 16) {
                                    this.f11868y = new ArrayList();
                                    i10 |= 16;
                                }
                                this.f11868y.add(Integer.valueOf(c0676e.k()));
                            } else if (iN == 34) {
                                int iD = c0676e.d(c0676e.k());
                                if ((i10 & 16) != 16 && c0676e.b() > 0) {
                                    this.f11868y = new ArrayList();
                                    i10 |= 16;
                                }
                                while (c0676e.b() > 0) {
                                    this.f11868y.add(Integer.valueOf(c0676e.k()));
                                }
                                c0676e.c(iD);
                            } else if (iN == 40) {
                                if ((i10 & 32) != 32) {
                                    this.f11858A = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f11858A.add(Integer.valueOf(c0676e.k()));
                            } else if (iN == 42) {
                                int iD2 = c0676e.d(c0676e.k());
                                if ((i10 & 32) != 32 && c0676e.b() > 0) {
                                    this.f11858A = new ArrayList();
                                    i10 |= 32;
                                }
                                while (c0676e.b() > 0) {
                                    this.f11858A.add(Integer.valueOf(c0676e.k()));
                                }
                                c0676e.c(iD2);
                            } else if (iN != 50) {
                                if (!c0676e.q(iN, c0154bJ)) {
                                }
                            } else {
                                s sVarE = c0676e.e();
                                this.f11863t |= 4;
                                this.f11866w = sVarE;
                            }
                        }
                        z6 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        e10.f12841s = this;
                        throw e10;
                    }
                } catch (IOException e11) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                    invalidProtocolBufferException.f12841s = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if ((i10 & 16) == 16) {
                    this.f11868y = Collections.unmodifiableList(this.f11868y);
                }
                if ((i10 & 32) == 32) {
                    this.f11858A = Collections.unmodifiableList(this.f11858A);
                }
                try {
                    c0154bJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f11862s = c0674c.c();
                }
                throw th;
            }
        }
        if ((i10 & 16) == 16) {
            this.f11868y = Collections.unmodifiableList(this.f11868y);
        }
        if ((i10 & 32) == 32) {
            this.f11858A = Collections.unmodifiableList(this.f11858A);
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f11862s = c0674c.c();
        }
    }
}
