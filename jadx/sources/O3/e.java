package O3;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final AtomicLong a = new AtomicLong(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f3523b;

    public e(x xVar) {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b3 = bArrArray[0];
        byte b7 = bArrArray[1];
        byte b10 = bArrArray[2];
        byte b11 = bArrArray[3];
        byte[] bArrA = a(time % 1000);
        byte b12 = bArrA[0];
        byte b13 = bArrA[1];
        byte[] bArrA2 = a(a.incrementAndGet());
        byte b14 = bArrA2[0];
        byte b15 = bArrA2[1];
        byte[] bArrA3 = a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {b3, b7, b10, b11, b12, b13, b14, b15, bArrA3[0], bArrA3[1]};
        String strI = g.i(xVar.c().a);
        String strF = g.f(bArr);
        Locale locale = Locale.US;
        f3523b = String.format(locale, "%s%s%s%s", strF.substring(0, 12), strF.substring(12, 16), strF.subSequence(16, 20), strI.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return f3523b;
    }
}
