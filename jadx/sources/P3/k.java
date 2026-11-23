package P3;

import A1.J;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Closeable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Logger f3883y = Logger.getLogger(k.class.getName());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RandomAccessFile f3884s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3885t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3886u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h f3887v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h f3888w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final byte[] f3889x;

    public k(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f3889x = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    B(bArr2, i10, iArr[i11]);
                    i10 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f3884s = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iJ = j(0, bArr);
        this.f3885t = iJ;
        if (iJ > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f3885t + ", Actual length: " + randomAccessFile2.length());
        }
        this.f3886u = j(4, bArr);
        int iJ2 = j(8, bArr);
        int iJ3 = j(12, bArr);
        this.f3887v = i(iJ2);
        this.f3888w = i(iJ3);
    }

    public static void B(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public static int j(int i10, byte[] bArr) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public final void A(int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr = {i10, i11, i12, i13};
        byte[] bArr = this.f3889x;
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            B(bArr, i14, iArr[i15]);
            i14 += 4;
        }
        RandomAccessFile randomAccessFile = this.f3884s;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }

    public final void a(byte[] bArr) {
        int iT;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    c(length);
                    boolean zH = h();
                    if (zH) {
                        iT = 16;
                    } else {
                        h hVar = this.f3888w;
                        iT = t(hVar.a + 4 + hVar.f3879b);
                    }
                    h hVar2 = new h(iT, length);
                    B(this.f3889x, 0, length);
                    o(this.f3889x, iT, 4);
                    o(bArr, iT + 4, length);
                    A(this.f3885t, this.f3886u + 1, zH ? iT : this.f3887v.a, iT);
                    this.f3888w = hVar2;
                    this.f3886u++;
                    if (zH) {
                        this.f3887v = hVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final synchronized void b() {
        A(4096, 0, 0, 0);
        this.f3886u = 0;
        h hVar = h.f3878c;
        this.f3887v = hVar;
        this.f3888w = hVar;
        if (this.f3885t > 4096) {
            RandomAccessFile randomAccessFile = this.f3884s;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.f3885t = 4096;
    }

    public final void c(int i10) throws IOException {
        int i11 = i10 + 4;
        int iP = this.f3885t - p();
        if (iP >= i11) {
            return;
        }
        int i12 = this.f3885t;
        do {
            iP += i12;
            i12 <<= 1;
        } while (iP < i11);
        RandomAccessFile randomAccessFile = this.f3884s;
        randomAccessFile.setLength(i12);
        randomAccessFile.getChannel().force(true);
        h hVar = this.f3888w;
        int iT = t(hVar.a + 4 + hVar.f3879b);
        if (iT < this.f3887v.a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f3885t);
            long j = iT - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f3888w.a;
        int i14 = this.f3887v.a;
        if (i13 < i14) {
            int i15 = (this.f3885t + i13) - 16;
            A(i12, this.f3886u, i14, i15);
            this.f3888w = new h(i15, this.f3888w.f3879b);
        } else {
            A(i12, this.f3886u, i14, i13);
        }
        this.f3885t = i12;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f3884s.close();
    }

    public final synchronized void g(j jVar) {
        int iT = this.f3887v.a;
        for (int i10 = 0; i10 < this.f3886u; i10++) {
            h hVarI = i(iT);
            jVar.e(new i(this, hVarI), hVarI.f3879b);
            iT = t(hVarI.a + 4 + hVarI.f3879b);
        }
    }

    public final synchronized boolean h() {
        return this.f3886u == 0;
    }

    public final h i(int i10) throws IOException {
        if (i10 == 0) {
            return h.f3878c;
        }
        RandomAccessFile randomAccessFile = this.f3884s;
        randomAccessFile.seek(i10);
        return new h(i10, randomAccessFile.readInt());
    }

    public final synchronized void l() {
        try {
            if (h()) {
                throw new NoSuchElementException();
            }
            if (this.f3886u == 1) {
                b();
            } else {
                h hVar = this.f3887v;
                int iT = t(hVar.a + 4 + hVar.f3879b);
                n(iT, 0, 4, this.f3889x);
                int iJ = j(0, this.f3889x);
                A(this.f3885t, this.f3886u - 1, iT, this.f3888w.a);
                this.f3886u--;
                this.f3887v = new h(iT, iJ);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void n(int i10, int i11, int i12, byte[] bArr) throws IOException {
        int iT = t(i10);
        int i13 = iT + i12;
        int i14 = this.f3885t;
        RandomAccessFile randomAccessFile = this.f3884s;
        if (i13 <= i14) {
            randomAccessFile.seek(iT);
            randomAccessFile.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iT;
        randomAccessFile.seek(iT);
        randomAccessFile.readFully(bArr, i11, i15);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i11 + i15, i12 - i15);
    }

    public final void o(byte[] bArr, int i10, int i11) throws IOException {
        int iT = t(i10);
        int i12 = iT + i11;
        int i13 = this.f3885t;
        RandomAccessFile randomAccessFile = this.f3884s;
        if (i12 <= i13) {
            randomAccessFile.seek(iT);
            randomAccessFile.write(bArr, 0, i11);
            return;
        }
        int i14 = i13 - iT;
        randomAccessFile.seek(iT);
        randomAccessFile.write(bArr, 0, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i14, i11 - i14);
    }

    public final int p() {
        if (this.f3886u == 0) {
            return 16;
        }
        h hVar = this.f3888w;
        int i10 = hVar.a;
        int i11 = this.f3887v.a;
        return i10 >= i11 ? (i10 - i11) + 4 + hVar.f3879b + 16 : (((i10 + 4) + hVar.f3879b) + this.f3885t) - i11;
    }

    public final int t(int i10) {
        int i11 = this.f3885t;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(k.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f3885t);
        sb.append(", size=");
        sb.append(this.f3886u);
        sb.append(", first=");
        sb.append(this.f3887v);
        sb.append(", last=");
        sb.append(this.f3888w);
        sb.append(", element lengths=[");
        try {
            g(new J(sb));
        } catch (IOException e10) {
            f3883y.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb.append("]]");
        return sb.toString();
    }
}
