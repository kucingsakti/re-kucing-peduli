package M1;

import A1.F;
import E.g;
import H1.z;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p232y1.h;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f2880t = new d(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2881s;

    public /* synthetic */ d(int i10) {
        this.f2881s = i10;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    @Override // M1.a
    public final F a(F f10, h hVar) {
        g gVar;
        byte[] bArrArray;
        switch (this.f2881s) {
            case 0:
                return f10;
            default:
                ByteBuffer byteBufferAsReadOnlyBuffer = ((L1.g) ((L1.c) f10.get()).f2742s.f2739b).a.f15734d.asReadOnlyBuffer();
                AtomicReference atomicReference = U1.b.a;
                if (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) {
                    gVar = null;
                } else {
                    byte[] bArrArray2 = byteBufferAsReadOnlyBuffer.array();
                    int iArrayOffset = byteBufferAsReadOnlyBuffer.arrayOffset();
                    int iLimit = byteBufferAsReadOnlyBuffer.limit();
                    gVar = new g();
                    gVar.f1166u = bArrArray2;
                    gVar.f1164s = iArrayOffset;
                    gVar.f1165t = iLimit;
                }
                if (gVar == null || gVar.f1164s != 0) {
                    ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                    byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
                    byteBufferAsReadOnlyBuffer2.get(bArr);
                    bArrArray = bArr;
                } else {
                    if (gVar.f1165t == ((byte[]) gVar.f1166u).length) {
                        bArrArray = byteBufferAsReadOnlyBuffer.array();
                    } else {
                        ByteBuffer byteBufferAsReadOnlyBuffer3 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                        byte[] bArr2 = new byte[byteBufferAsReadOnlyBuffer3.limit()];
                        byteBufferAsReadOnlyBuffer3.get(bArr2);
                        bArrArray = bArr2;
                    }
                }
                return new z(bArrArray);
        }
    }
}
