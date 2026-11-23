package p047e9;

import B4.C0154b;
import com.google.android.gms.internal.measurement.S;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0675d;
import p104k9.AbstractC0680i;
import p104k9.AbstractC0682k;
import p104k9.C0674c;
import p104k9.C0676e;
import p104k9.C0678g;

/* JADX INFO: renamed from: e9.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0620l extends AbstractC0682k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0620l f11136A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0609a f11137B = new C0609a(4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC0675d f11138t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11139u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11140v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f11141w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f11142x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public byte f11143y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f11144z;

    static {
        C0620l c0620l = new C0620l();
        f11136A = c0620l;
        c0620l.f11140v = 6;
        List list = Collections.EMPTY_LIST;
        c0620l.f11141w = list;
        c0620l.f11142x = list;
    }

    public C0620l(C0619k c0619k) {
        super(c0619k);
        this.f11143y = (byte) -1;
        this.f11144z = -1;
        this.f11138t = c0619k.f12808s;
    }

    @Override // p104k9.t
    public final AbstractC0672a a() {
        return f11136A;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f11144z;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f11139u & 1) == 1 ? C0154b.b(1, this.f11140v) : 0;
        for (int i11 = 0; i11 < this.f11141w.size(); i11++) {
            iB += C0154b.d(2, (AbstractC0672a) this.f11141w.get(i11));
        }
        int iC = 0;
        for (int i12 = 0; i12 < this.f11142x.size(); i12++) {
            iC += C0154b.c(((Integer) this.f11142x.get(i12)).intValue());
        }
        int size = this.f11138t.size() + i() + (this.f11142x.size() * 2) + iB + iC;
        this.f11144z = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return C0619k.i();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        C0619k c0619kI = C0619k.i();
        c0619kI.j(this);
        return c0619kI;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        S s9 = new S(this);
        if ((this.f11139u & 1) == 1) {
            c0154b.m(1, this.f11140v);
        }
        for (int i10 = 0; i10 < this.f11141w.size(); i10++) {
            c0154b.o(2, (AbstractC0672a) this.f11141w.get(i10));
        }
        for (int i11 = 0; i11 < this.f11142x.size(); i11++) {
            c0154b.m(31, ((Integer) this.f11142x.get(i11)).intValue());
        }
        s9.y(19000, c0154b);
        c0154b.r(this.f11138t);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f11143y;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f11141w.size(); i10++) {
            if (!((Z) this.f11141w.get(i10)).isInitialized()) {
                this.f11143y = (byte) 0;
                return false;
            }
        }
        if (h()) {
            this.f11143y = (byte) 1;
            return true;
        }
        this.f11143y = (byte) 0;
        return false;
    }

    public C0620l() {
        this.f11143y = (byte) -1;
        this.f11144z = -1;
        this.f11138t = AbstractC0675d.f12795s;
    }

    public C0620l(C0676e c0676e, C0678g c0678g) {
        this.f11143y = (byte) -1;
        this.f11144z = -1;
        this.f11140v = 6;
        List list = Collections.EMPTY_LIST;
        this.f11141w = list;
        this.f11142x = list;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        boolean z6 = false;
        int i10 = 0;
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f11139u |= 1;
                            this.f11140v = c0676e.k();
                        } else if (iN == 18) {
                            if ((i10 & 2) != 2) {
                                this.f11141w = new ArrayList();
                                i10 |= 2;
                            }
                            this.f11141w.add(c0676e.g(Z.f10955E, c0678g));
                        } else if (iN == 248) {
                            if ((i10 & 4) != 4) {
                                this.f11142x = new ArrayList();
                                i10 |= 4;
                            }
                            this.f11142x.add(Integer.valueOf(c0676e.k()));
                        } else if (iN != 250) {
                            if (!m(c0676e, c0154bJ, c0678g, iN)) {
                            }
                        } else {
                            int iD = c0676e.d(c0676e.k());
                            if ((i10 & 4) != 4 && c0676e.b() > 0) {
                                this.f11142x = new ArrayList();
                                i10 |= 4;
                            }
                            while (c0676e.b() > 0) {
                                this.f11142x.add(Integer.valueOf(c0676e.k()));
                            }
                            c0676e.c(iD);
                        }
                    }
                    z6 = true;
                } catch (Throwable th) {
                    if ((i10 & 2) == 2) {
                        this.f11141w = Collections.unmodifiableList(this.f11141w);
                    }
                    if ((i10 & 4) == 4) {
                        this.f11142x = Collections.unmodifiableList(this.f11142x);
                    }
                    try {
                        c0154bJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f11138t = c0674c.c();
                    }
                    l();
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
        if ((i10 & 2) == 2) {
            this.f11141w = Collections.unmodifiableList(this.f11141w);
        }
        if ((i10 & 4) == 4) {
            this.f11142x = Collections.unmodifiableList(this.f11142x);
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f11138t = c0674c.c();
        }
        l();
    }
}
