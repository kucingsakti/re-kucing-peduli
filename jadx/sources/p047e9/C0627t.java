package p047e9;

import B4.C0154b;
import com.google.android.gms.internal.measurement.S;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0675d;
import p104k9.AbstractC0680i;
import p104k9.AbstractC0682k;
import p104k9.C0674c;
import p104k9.C0676e;
import p104k9.C0678g;

/* JADX INFO: renamed from: e9.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0627t extends AbstractC0682k {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0627t f11181y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0609a f11182z = new C0609a(7);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC0675d f11183t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11184u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11185v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f11186w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11187x;

    static {
        C0627t c0627t = new C0627t();
        f11181y = c0627t;
        c0627t.f11185v = 0;
    }

    public C0627t(C0626s c0626s) {
        super(c0626s);
        this.f11186w = (byte) -1;
        this.f11187x = -1;
        this.f11183t = c0626s.f12808s;
    }

    @Override // p104k9.t
    public final AbstractC0672a a() {
        return f11181y;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f11187x;
        if (i10 != -1) {
            return i10;
        }
        int size = this.f11183t.size() + i() + ((this.f11184u & 1) == 1 ? C0154b.b(1, this.f11185v) : 0);
        this.f11187x = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return new C0626s();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        C0626s c0626s = new C0626s();
        c0626s.h(this);
        return c0626s;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        S s9 = new S(this);
        if ((this.f11184u & 1) == 1) {
            c0154b.m(1, this.f11185v);
        }
        s9.y(200, c0154b);
        c0154b.r(this.f11183t);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f11186w;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        if (h()) {
            this.f11186w = (byte) 1;
            return true;
        }
        this.f11186w = (byte) 0;
        return false;
    }

    public C0627t() {
        this.f11186w = (byte) -1;
        this.f11187x = -1;
        this.f11183t = AbstractC0675d.f12795s;
    }

    public C0627t(C0676e c0676e, C0678g c0678g) {
        this.f11186w = (byte) -1;
        this.f11187x = -1;
        boolean z6 = false;
        this.f11185v = 0;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c0676e.n();
                        if (iN != 0) {
                            if (iN != 8) {
                                if (!m(c0676e, c0154bJ, c0678g, iN)) {
                                }
                            } else {
                                this.f11184u |= 1;
                                this.f11185v = c0676e.k();
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
                try {
                    c0154bJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f11183t = c0674c.c();
                }
                l();
                throw th;
            }
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f11183t = c0674c.c();
        }
        l();
    }
}
