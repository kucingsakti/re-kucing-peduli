package H1;

import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class j implements k, p232y1.f, com.bumptech.glide.load.data.g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ByteBuffer f1872s;

    public j() {
        this.f1872s = ByteBuffer.allocate(8);
    }

    @Override // com.bumptech.glide.load.data.g
    public Object a() {
        ByteBuffer byteBuffer = this.f1872s;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // H1.k
    public long f(long j) {
        ByteBuffer byteBuffer = this.f1872s;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // p232y1.f
    public void g(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l4 = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.f1872s) {
            this.f1872s.position(0);
            messageDigest.update(this.f1872s.putLong(l4.longValue()).array());
        }
    }

    @Override // H1.k
    public short k() throws DefaultImageHeaderParser$Reader$EndOfFileException {
        ByteBuffer byteBuffer = this.f1872s;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // H1.k
    public int q() {
        return (k() << 8) | k();
    }

    @Override // H1.k
    public int t(int i10, byte[] bArr) {
        ByteBuffer byteBuffer = this.f1872s;
        int iMin = Math.min(i10, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    public j(ByteBuffer byteBuffer, int i10) {
        switch (i10) {
            case 2:
                this.f1872s = byteBuffer;
                break;
            default:
                this.f1872s = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.g
    public void b() {
    }
}
