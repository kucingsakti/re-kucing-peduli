package p106l0;

import java.nio.ByteBuffer;
import o1.h;
import p116m0.a;
import p116m0.b;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f12882d = new ThreadLocal();
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f12883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f12884c = 0;

    public r(h hVar, int i10) {
        this.f12883b = hVar;
        this.a = i10;
    }

    public final int a(int i10) {
        a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f4778v;
        int i11 = iA + aVarB.f4775s;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public final a b() {
        ThreadLocal threadLocal = f12882d;
        a aVar = (a) threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        b bVar = (b) this.f12883b.f13632s;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i10 = iA + bVar.f4775s;
            int i11 = (this.a * 4) + ((ByteBuffer) bVar.f4778v).getInt(i10) + i10 + 4;
            int i12 = ((ByteBuffer) bVar.f4778v).getInt(i11) + i11;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f4778v;
            aVar.f4778v = byteBuffer;
            if (byteBuffer != null) {
                aVar.f4775s = i12;
                int i13 = i12 - byteBuffer.getInt(i12);
                aVar.f4776t = i13;
                aVar.f4777u = ((ByteBuffer) aVar.f4778v).getShort(i13);
                return aVar;
            }
            aVar.f4775s = 0;
            aVar.f4776t = 0;
            aVar.f4777u = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        a aVarB = b();
        int iA = aVarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f4778v).getInt(iA + aVarB.f4775s) : 0));
        sb.append(", codepoints:");
        a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i11 = iA2 + aVarB2.f4775s;
            i10 = ((ByteBuffer) aVarB2.f4778v).getInt(((ByteBuffer) aVarB2.f4778v).getInt(i11) + i11);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            sb.append(Integer.toHexString(a(i12)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
