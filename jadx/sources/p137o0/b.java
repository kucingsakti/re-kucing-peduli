package p137o0;

import E0.a;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ByteOrder f13568w = ByteOrder.LITTLE_ENDIAN;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ByteOrder f13569x = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DataInputStream f13570s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ByteOrder f13571t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13572u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f13573v;

    public b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
    }

    public final void a(int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            DataInputStream dataInputStream = this.f13570s;
            int i12 = i10 - i11;
            int iSkip = (int) dataInputStream.skip(i12);
            if (iSkip <= 0) {
                if (this.f13573v == null) {
                    this.f13573v = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f13573v, 0, Math.min(8192, i12));
                if (iSkip == -1) {
                    throw new EOFException(a.g("Reached EOF while skipping ", i10, " bytes."));
                }
            }
            i11 += iSkip;
        }
        this.f13572u += i11;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f13570s.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f13572u++;
        return this.f13570s.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f13572u++;
        return this.f13570s.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f13572u++;
        int i10 = this.f13570s.read();
        if (i10 >= 0) {
            return (byte) i10;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f13572u += 2;
        return this.f13570s.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f13572u += i11;
        this.f13570s.readFully(bArr, i10, i11);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f13572u += 4;
        DataInputStream dataInputStream = this.f13570s;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f13571t;
        if (byteOrder == f13568w) {
            return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
        }
        if (byteOrder == f13569x) {
            return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
        }
        throw new IOException("Invalid byte order: " + this.f13571t);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j;
        long j10;
        this.f13572u += 8;
        DataInputStream dataInputStream = this.f13570s;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        int i17 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f13571t;
        if (byteOrder == f13568w) {
            j = (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8);
            j10 = i10;
        } else {
            if (byteOrder != f13569x) {
                throw new IOException("Invalid byte order: " + this.f13571t);
            }
            j = (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8);
            j10 = i17;
        }
        return j + j10;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f13572u += 2;
        DataInputStream dataInputStream = this.f13570s;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f13571t;
        if (byteOrder == f13568w) {
            return (short) ((i11 << 8) + i10);
        }
        if (byteOrder == f13569x) {
            return (short) ((i10 << 8) + i11);
        }
        throw new IOException("Invalid byte order: " + this.f13571t);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f13572u += 2;
        return this.f13570s.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f13572u++;
        return this.f13570s.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f13572u += 2;
        DataInputStream dataInputStream = this.f13570s;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f13571t;
        if (byteOrder == f13568w) {
            return (i11 << 8) + i10;
        }
        if (byteOrder == f13569x) {
            return (i10 << 8) + i11;
        }
        throw new IOException("Invalid byte order: " + this.f13571t);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i10) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public b(InputStream inputStream, int i10) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f13571t = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f13570s = dataInputStream;
        dataInputStream.mark(0);
        this.f13572u = 0;
        this.f13571t = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f13570s.read(bArr, i10, i11);
        this.f13572u += i12;
        return i12;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f13572u += bArr.length;
        this.f13570s.readFully(bArr);
    }
}
