package X9;

import java.io.EOFException;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class C extends J {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final A f5436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final A f5437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f5438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f5439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f5440i;
    public final ma.i a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f5442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5443d;

    static {
        Pattern pattern = A.f5431d;
        f5436e = p068ga.d.k("multipart/mixed");
        p068ga.d.k("multipart/alternative");
        p068ga.d.k("multipart/digest");
        p068ga.d.k("multipart/parallel");
        f5437f = p068ga.d.k("multipart/form-data");
        f5438g = new byte[]{58, 32};
        f5439h = new byte[]{13, 10};
        f5440i = new byte[]{45, 45};
    }

    public C(ma.i iVar, A a, List list) {
        p210v8.i.f(iVar, "boundaryByteString");
        p210v8.i.f(a, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        this.a = iVar;
        this.f5441b = list;
        Pattern pattern = A.f5431d;
        this.f5442c = p068ga.d.k(a + "; boundary=" + iVar.o());
        this.f5443d = -1L;
    }

    @Override // X9.J
    public final long a() throws EOFException {
        long j = this.f5443d;
        if (j != -1) {
            return j;
        }
        long jE = e(null, true);
        this.f5443d = jE;
        return jE;
    }

    @Override // X9.J
    public final A b() {
        return this.f5442c;
    }

    @Override // X9.J
    public final void d(ma.g gVar) throws EOFException {
        e(gVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(ma.g gVar, boolean z6) throws EOFException {
        ma.f fVar;
        ma.g fVar2;
        if (z6) {
            fVar2 = new ma.f();
            fVar = fVar2;
        } else {
            fVar = 0;
            fVar2 = gVar;
        }
        List list = this.f5441b;
        int size = list.size();
        long j = 0;
        int i10 = 0;
        while (true) {
            ma.i iVar = this.a;
            byte[] bArr = f5440i;
            byte[] bArr2 = f5439h;
            if (i10 >= size) {
                p210v8.i.c(fVar2);
                fVar2.F(bArr);
                fVar2.O(iVar);
                fVar2.F(bArr);
                fVar2.F(bArr2);
                if (!z6) {
                    return j;
                }
                p210v8.i.c(fVar);
                long j10 = j + fVar.f13190t;
                fVar.a();
                return j10;
            }
            int i11 = i10 + 1;
            B b3 = (B) list.get(i10);
            w wVar = b3.a;
            p210v8.i.c(fVar2);
            fVar2.F(bArr);
            fVar2.O(iVar);
            fVar2.F(bArr2);
            int size2 = wVar.size();
            for (int i12 = 0; i12 < size2; i12++) {
                fVar2.Q(wVar.f(i12)).F(f5438g).Q(wVar.m(i12)).F(bArr2);
            }
            J j11 = b3.f5435b;
            A aB = j11.b();
            if (aB != null) {
                fVar2.Q("Content-Type: ").Q(aB.a).F(bArr2);
            }
            long jA = j11.a();
            if (jA != -1) {
                fVar2.Q("Content-Length: ").R(jA).F(bArr2);
            } else if (z6) {
                p210v8.i.c(fVar);
                fVar.a();
                return -1L;
            }
            fVar2.F(bArr2);
            if (z6) {
                j += jA;
            } else {
                j11.d(fVar2);
            }
            fVar2.F(bArr2);
            i10 = i11;
        }
    }
}
