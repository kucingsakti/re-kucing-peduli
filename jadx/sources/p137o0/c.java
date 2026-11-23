package p137o0;

import E0.a;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f13576d;

    public c(byte[] bArr, int i10, int i11) {
        this(-1L, bArr, i10, i11);
    }

    public static c a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.f13585E[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new c(byteBufferWrap.array(), 4, 1);
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        e[] eVarArr = {eVar};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.f13585E[5]]);
        byteBufferWrap.order(byteOrder);
        e eVar2 = eVarArr[0];
        byteBufferWrap.putInt((int) eVar2.a);
        byteBufferWrap.putInt((int) eVar2.f13580b);
        return new c(byteBufferWrap.array(), 5, 1);
    }

    public static c c(int i10, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.f13585E[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i10}[0]);
        return new c(byteBufferWrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objG instanceof String) {
            return Double.parseDouble((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) objG;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.a / eVar.f13580b;
    }

    public final int e(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objG instanceof String) {
            return Integer.parseInt((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objG;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            return null;
        }
        if (objG instanceof String) {
            return (String) objG;
        }
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            while (i10 < jArr.length) {
                sb.append(jArr[i10]);
                i10++;
                if (i10 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            while (i10 < iArr.length) {
                sb.append(iArr[i10]);
                i10++;
                if (i10 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            while (i10 < dArr.length) {
                sb.append(dArr[i10]);
                i10++;
                if (i10 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objG instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) objG;
        while (i10 < eVarArr.length) {
            sb.append(eVarArr[i10].a);
            sb.append('/');
            sb.append(eVarArr[i10].f13580b);
            i10++;
            if (i10 != eVarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:123:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0029: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:42), block:B:14:0x0029 */
    /* JADX WARN: Type inference failed for: r13v20, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.io.Serializable, o0.e[]] */
    /* JADX WARN: Type inference failed for: r13v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v24, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.io.Serializable, o0.e[]] */
    /* JADX WARN: Type inference failed for: r13v26, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v27, types: [double[], java.io.Serializable] */
    public final Serializable g(ByteOrder byteOrder) throws Throwable {
        b bVar;
        InputStream inputStream;
        byte b3;
        int length = 0;
        byte[] bArr = this.f13576d;
        InputStream inputStream2 = null;
        try {
            try {
                try {
                    bVar = new b(bArr);
                    try {
                        bVar.f13571t = byteOrder;
                        int i10 = this.a;
                        int i11 = this.f13574b;
                        switch (i10) {
                            case 1:
                            case 6:
                                if (bArr.length != 1 || (b3 = bArr[0]) < 0 || b3 > 1) {
                                    String str = new String(bArr, g.f13594N);
                                    try {
                                        bVar.close();
                                        break;
                                    } catch (IOException unused) {
                                    }
                                    return str;
                                }
                                String str2 = new String(new char[]{(char) (b3 + 48)});
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused2) {
                                }
                                return str2;
                            case 2:
                            case 7:
                                if (i11 >= g.f13586F.length) {
                                    int i12 = 0;
                                    while (true) {
                                        byte[] bArr2 = g.f13586F;
                                        if (i12 >= bArr2.length) {
                                            length = bArr2.length;
                                        } else if (bArr[i12] == bArr2[i12]) {
                                            i12++;
                                        }
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                try {
                                    while (length < i11) {
                                        byte b7 = bArr[length];
                                        if (b7 == 0) {
                                            String string = sb.toString();
                                            bVar.close();
                                            return string;
                                        }
                                        if (b7 >= 32) {
                                            sb.append((char) b7);
                                        } else {
                                            sb.append('?');
                                        }
                                        length++;
                                    }
                                    bVar.close();
                                    break;
                                } catch (IOException unused3) {
                                }
                                String string2 = sb.toString();
                                return string2;
                            case 3:
                                ?? r13 = new int[i11];
                                while (length < i11) {
                                    r13[length] = bVar.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused4) {
                                }
                                return r13;
                            case 4:
                                ?? r14 = new long[i11];
                                while (length < i11) {
                                    r14[length] = ((long) bVar.readInt()) & 4294967295L;
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused5) {
                                }
                                return r14;
                            case 5:
                                ?? r15 = new e[i11];
                                while (length < i11) {
                                    r15[length] = new e(((long) bVar.readInt()) & 4294967295L, ((long) bVar.readInt()) & 4294967295L);
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused6) {
                                }
                                return r15;
                            case 8:
                                ?? r16 = new int[i11];
                                while (length < i11) {
                                    r16[length] = bVar.readShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused7) {
                                }
                                return r16;
                            case 9:
                                ?? r17 = new int[i11];
                                while (length < i11) {
                                    r17[length] = bVar.readInt();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused8) {
                                }
                                return r17;
                            case 10:
                                ?? r18 = new e[i11];
                                while (length < i11) {
                                    r18[length] = new e(bVar.readInt(), bVar.readInt());
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused9) {
                                }
                                return r18;
                            case 11:
                                ?? r19 = new double[i11];
                                while (length < i11) {
                                    r19[length] = bVar.readFloat();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused10) {
                                }
                                return r19;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                ?? r110 = new double[i11];
                                while (length < i11) {
                                    r110[length] = bVar.readDouble();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused11) {
                                }
                                return r110;
                            default:
                                bVar.close();
                                return null;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            bVar.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException unused12) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        } catch (IOException unused13) {
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(g.f13584D[this.a]);
        sb.append(", data length:");
        return a.j(sb, this.f13576d.length, ")");
    }

    public c(long j, byte[] bArr, int i10, int i11) {
        this.a = i10;
        this.f13574b = i11;
        this.f13575c = j;
        this.f13576d = bArr;
    }
}
