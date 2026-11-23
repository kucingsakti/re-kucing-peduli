package p223x1;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f15729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f15730c;
    public final byte[] a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15731d = 0;

    public final boolean a() {
        return this.f15730c.f15720b != 0;
    }

    public final b b() {
        byte[] bArr;
        if (this.f15729b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f15730c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb.append((char) c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f15730c.f15724f = this.f15729b.getShort();
            this.f15730c.f15725g = this.f15729b.getShort();
            int iC = c();
            b bVar = this.f15730c;
            bVar.f15726h = (iC & 128) != 0;
            bVar.f15727i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.f15730c.j = c();
            b bVar2 = this.f15730c;
            c();
            bVar2.getClass();
            if (this.f15730c.f15726h && !a()) {
                b bVar3 = this.f15730c;
                bVar3.a = e(bVar3.f15727i);
                b bVar4 = this.f15730c;
                bVar4.f15728k = bVar4.a[bVar4.j];
            }
        } else {
            this.f15730c.f15720b = 1;
        }
        if (!a()) {
            boolean z6 = false;
            while (!z6 && !a() && this.f15730c.f15721c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.f15730c.f15722d = new a();
                        c();
                        int iC4 = c();
                        a aVar = this.f15730c.f15722d;
                        int i11 = (iC4 & 28) >> 2;
                        aVar.f15716g = i11;
                        if (i11 == 0) {
                            aVar.f15716g = 1;
                        }
                        aVar.f15715f = (iC4 & 1) != 0;
                        short s9 = this.f15729b.getShort();
                        if (s9 < 2) {
                            s9 = 10;
                        }
                        a aVar2 = this.f15730c.f15722d;
                        aVar2.f15718i = s9 * 10;
                        aVar2.f15717h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i12 = 0;
                        while (true) {
                            bArr = this.a;
                            if (i12 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i12]);
                            i12++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b3 = bArr[1];
                                    byte b7 = bArr[2];
                                    this.f15730c.getClass();
                                }
                                if (this.f15731d <= 0) {
                                    break;
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    b bVar5 = this.f15730c;
                    if (bVar5.f15722d == null) {
                        bVar5.f15722d = new a();
                    }
                    bVar5.f15722d.a = this.f15729b.getShort();
                    this.f15730c.f15722d.f15711b = this.f15729b.getShort();
                    this.f15730c.f15722d.f15712c = this.f15729b.getShort();
                    this.f15730c.f15722d.f15713d = this.f15729b.getShort();
                    int iC5 = c();
                    boolean z10 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    a aVar3 = this.f15730c.f15722d;
                    aVar3.f15714e = (iC5 & 64) != 0;
                    if (z10) {
                        aVar3.f15719k = e(iPow);
                    } else {
                        aVar3.f15719k = null;
                    }
                    this.f15730c.f15722d.j = this.f15729b.position();
                    c();
                    f();
                    if (!a()) {
                        b bVar6 = this.f15730c;
                        bVar6.f15721c++;
                        bVar6.f15723e.add(bVar6.f15722d);
                    }
                } else if (iC2 != 59) {
                    this.f15730c.f15720b = 1;
                } else {
                    z6 = true;
                }
            }
            b bVar7 = this.f15730c;
            if (bVar7.f15721c < 0) {
                bVar7.f15720b = 1;
            }
        }
        return this.f15730c;
    }

    public final int c() {
        try {
            return this.f15729b.get() & 255;
        } catch (Exception unused) {
            this.f15730c.f15720b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.f15731d = iC;
        if (iC <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                int i11 = this.f15731d;
                if (i10 >= i11) {
                    return;
                }
                int i12 = i11 - i10;
                this.f15729b.get(this.a, i10, i12);
                i10 += i12;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.f15730c.f15720b = 1;
                return;
            }
        }
    }

    public final int[] e(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f15729b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & 255);
                i11 = i16;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f15730c.f15720b = 1;
            return iArr;
        }
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.f15729b.position(Math.min(this.f15729b.position() + iC, this.f15729b.limit()));
        } while (iC > 0);
    }
}
