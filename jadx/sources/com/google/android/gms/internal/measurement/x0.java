package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements D0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f8434k = new int[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Unsafe f8435l = J0.f();
    public final int[] a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f8436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzkt f8439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f8441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8443i;
    public final C0577j0 j;

    public x0(int[] iArr, Object[] objArr, int i10, int i11, zzkt zzktVar, int[] iArr2, int i12, int i13, C0577j0 c0577j0) {
        this.a = iArr;
        this.f8436b = objArr;
        this.f8437c = i10;
        this.f8438d = i11;
        boolean z6 = zzktVar instanceof zzjk;
        this.f8440f = c0577j0 != null && (zzktVar instanceof zzjk.zzd);
        this.f8441g = iArr2;
        this.f8442h = i12;
        this.f8443i = i13;
        this.j = c0577j0;
        this.f8439e = zzktVar;
    }

    public static long B(long j, Object obj) {
        return ((Long) J0.k(j, obj)).longValue();
    }

    public static zzme E(Object obj) {
        zzjk zzjkVar = (zzjk) obj;
        zzme zzmeVar = zzjkVar.zzb;
        if (zzmeVar != zzme.f8702f) {
            return zzmeVar;
        }
        zzme zzmeVarE = zzme.e();
        zzjkVar.zzb = zzmeVarE;
        return zzmeVarE;
    }

    public static void G(Object obj) {
        if (!H(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static boolean H(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzjk) {
            return ((zzjk) obj).y();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x026d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0270  */
    /* JADX WARN: Code duplicated, block: B:128:0x0287  */
    /* JADX WARN: Code duplicated, block: B:130:0x028b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0382  */
    public static x0 l(C0 c0, C0577j0 c0577j0) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i20;
        char cCharAt4;
        int i21;
        char cCharAt5;
        int i22;
        char cCharAt6;
        int i23;
        char cCharAt7;
        int i24;
        char cCharAt8;
        int i25;
        int i26;
        int i27;
        int i28;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i29;
        int i30;
        Field fieldO;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field fieldO2;
        int i34;
        Object obj2;
        Field fieldO3;
        int i35;
        char cCharAt10;
        int i36;
        int i37;
        char cCharAt11;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        if (!(c0 instanceof C0)) {
            if (c0 == null) {
                throw new NoSuchMethodError();
            }
            throw new ClassCastException();
        }
        String str = c0.f8335b;
        int length = str.length();
        char c10 = 55296;
        if (str.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i10 = i40 + 1;
                if (str.charAt(i40) < 55296) {
                    break;
                }
                i40 = i10;
            }
        } else {
            i10 = 1;
        }
        int i41 = i10 + 1;
        int iCharAt2 = str.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i42 = iCharAt2 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                cCharAt13 = str.charAt(i41);
                if (cCharAt13 < 55296) {
                    break;
                }
                i42 |= (cCharAt13 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            iCharAt2 = i42 | (cCharAt13 << i43);
            i41 = i39;
        }
        if (iCharAt2 == 0) {
            i12 = 0;
            i15 = 0;
            iCharAt = 0;
            i11 = 0;
            i14 = 0;
            i16 = 0;
            iArr = f8434k;
            i13 = 0;
        } else {
            int i44 = i41 + 1;
            int iCharAt3 = str.charAt(i41);
            if (iCharAt3 >= 55296) {
                int i45 = iCharAt3 & 8191;
                int i46 = 13;
                while (true) {
                    i24 = i44 + 1;
                    cCharAt8 = str.charAt(i44);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i24;
                }
                iCharAt3 = i45 | (cCharAt8 << i46);
                i44 = i24;
            }
            int i47 = i44 + 1;
            int iCharAt4 = str.charAt(i44);
            if (iCharAt4 >= 55296) {
                int i48 = iCharAt4 & 8191;
                int i49 = 13;
                while (true) {
                    i23 = i47 + 1;
                    cCharAt7 = str.charAt(i47);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i23;
                }
                iCharAt4 = i48 | (cCharAt7 << i49);
                i47 = i23;
            }
            int i50 = i47 + 1;
            int iCharAt5 = str.charAt(i47);
            if (iCharAt5 >= 55296) {
                int i51 = iCharAt5 & 8191;
                int i52 = 13;
                while (true) {
                    i22 = i50 + 1;
                    cCharAt6 = str.charAt(i50);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i22;
                }
                iCharAt5 = i51 | (cCharAt6 << i52);
                i50 = i22;
            }
            int i53 = i50 + 1;
            int iCharAt6 = str.charAt(i50);
            if (iCharAt6 >= 55296) {
                int i54 = iCharAt6 & 8191;
                int i55 = 13;
                while (true) {
                    i21 = i53 + 1;
                    cCharAt5 = str.charAt(i53);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i21;
                }
                iCharAt6 = i54 | (cCharAt5 << i55);
                i53 = i21;
            }
            int i56 = i53 + 1;
            iCharAt = str.charAt(i53);
            if (iCharAt >= 55296) {
                int i57 = iCharAt & 8191;
                int i58 = 13;
                while (true) {
                    i20 = i56 + 1;
                    cCharAt4 = str.charAt(i56);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i20;
                }
                iCharAt = i57 | (cCharAt4 << i58);
                i56 = i20;
            }
            int i59 = i56 + 1;
            int iCharAt7 = str.charAt(i56);
            if (iCharAt7 >= 55296) {
                int i60 = iCharAt7 & 8191;
                int i61 = 13;
                while (true) {
                    i19 = i59 + 1;
                    cCharAt3 = str.charAt(i59);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i19;
                }
                iCharAt7 = i60 | (cCharAt3 << i61);
                i59 = i19;
            }
            int i62 = i59 + 1;
            int iCharAt8 = str.charAt(i59);
            if (iCharAt8 >= 55296) {
                int i63 = iCharAt8 & 8191;
                int i64 = 13;
                while (true) {
                    i18 = i62 + 1;
                    cCharAt2 = str.charAt(i62);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i18;
                }
                iCharAt8 = i63 | (cCharAt2 << i64);
                i62 = i18;
            }
            int i65 = i62 + 1;
            int iCharAt9 = str.charAt(i62);
            if (iCharAt9 >= 55296) {
                int i66 = iCharAt9 & 8191;
                int i67 = 13;
                while (true) {
                    i17 = i65 + 1;
                    cCharAt = str.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i66 |= (cCharAt & 8191) << i67;
                    i67 += 13;
                    i65 = i17;
                }
                iCharAt9 = i66 | (cCharAt << i67);
                i65 = i17;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i68 = (iCharAt3 << 1) + iCharAt4;
            int i69 = iCharAt7;
            i11 = iCharAt5;
            i12 = i69;
            i13 = iCharAt3;
            i41 = i65;
            iArr = iArr2;
            i14 = iCharAt6;
            i15 = i68;
            i16 = iCharAt9;
        }
        Unsafe unsafe = f8435l;
        Class<?> cls = c0.a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt << 1];
        int i70 = i16 + i12;
        int i71 = i70;
        int i72 = i16;
        int i73 = 0;
        int i74 = 0;
        while (i41 < length) {
            int i75 = i41 + 1;
            int iCharAt10 = str.charAt(i41);
            if (iCharAt10 >= c10) {
                int i76 = iCharAt10 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i38 = i77 + 1;
                    cCharAt12 = str.charAt(i77);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i76 |= (cCharAt12 & 8191) << i78;
                    i78 += 13;
                    i77 = i38;
                }
                iCharAt10 = i76 | (cCharAt12 << i78);
                i25 = i38;
            } else {
                i25 = i75;
            }
            int i79 = i25 + 1;
            int iCharAt11 = str.charAt(i25);
            if (iCharAt11 >= c10) {
                int i80 = iCharAt11 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i37 = i81 + 1;
                    cCharAt11 = str.charAt(i81);
                    i26 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i80 |= (cCharAt11 & 8191) << i82;
                    i82 += 13;
                    i81 = i37;
                    length = i26;
                }
                iCharAt11 = i80 | (cCharAt11 << i82);
                i27 = i37;
            } else {
                i26 = length;
                i27 = i79;
            }
            int i83 = iCharAt11 & 255;
            int i84 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i74] = i73;
                i74++;
            }
            zzle zzleVar = zzle.f8698s;
            int[] iArr4 = iArr3;
            Object[] objArr2 = c0.f8336c;
            if (i83 >= 51) {
                int i85 = i27 + 1;
                int iCharAt12 = str.charAt(i27);
                if (iCharAt12 >= 55296) {
                    int i86 = iCharAt12 & 8191;
                    int i87 = i85;
                    int i88 = 13;
                    while (true) {
                        i35 = i87 + 1;
                        cCharAt10 = str.charAt(i87);
                        i36 = i86;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i86 = i36 | ((cCharAt10 & 8191) << i88);
                        i88 += 13;
                        i87 = i35;
                    }
                    iCharAt12 = i36 | (cCharAt10 << i88);
                    i31 = i35;
                } else {
                    i31 = i85;
                }
                int i89 = iCharAt12;
                int i90 = i83 - 51;
                int i91 = i31;
                if (i90 == 9 || i90 == 17) {
                    i32 = i15 + 1;
                    objArr[((i73 / 3) << 1) + 1] = objArr2[i15];
                } else {
                    if (i90 == 12 && (c0.a().equals(zzleVar) || (iCharAt11 & 2048) != 0)) {
                        i32 = i15 + 1;
                        objArr[((i73 / 3) << 1) + 1] = objArr2[i15];
                    }
                    i33 = i89 << 1;
                    obj = objArr2[i33];
                    if (obj instanceof Field) {
                        fieldO2 = (Field) obj;
                    } else {
                        fieldO2 = o((String) obj, cls);
                        objArr2[i33] = fieldO2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldO2);
                    i34 = i33 + 1;
                    obj2 = objArr2[i34];
                    if (obj2 instanceof Field) {
                        fieldO3 = (Field) obj2;
                    } else {
                        fieldO3 = o((String) obj2, cls);
                        objArr2[i34] = fieldO3;
                    }
                    i28 = i13;
                    i29 = i91;
                    str = str;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i30 = 0;
                }
                i15 = i32;
                i33 = i89 << 1;
                obj = objArr2[i33];
                if (obj instanceof Field) {
                    fieldO2 = (Field) obj;
                } else {
                    fieldO2 = o((String) obj, cls);
                    objArr2[i33] = fieldO2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldO2);
                i34 = i33 + 1;
                obj2 = objArr2[i34];
                if (obj2 instanceof Field) {
                    fieldO3 = (Field) obj2;
                } else {
                    fieldO3 = o((String) obj2, cls);
                    objArr2[i34] = fieldO3;
                }
                i28 = i13;
                i29 = i91;
                str = str;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO3);
                iObjectFieldOffset = iObjectFieldOffset4;
                i30 = 0;
            } else {
                int i92 = i15 + 1;
                Field fieldO4 = o((String) objArr2[i15], cls);
                i28 = i13;
                if (i83 == 9 || i83 == 17) {
                    objArr[((i73 / 3) << 1) + 1] = fieldO4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i15 += 2;
                        objArr[((i73 / 3) << 1) + 1] = objArr2[i92];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        if (c0.a() == zzleVar || (iCharAt11 & 2048) != 0) {
                            i15 += 2;
                            objArr[((i73 / 3) << 1) + 1] = objArr2[i92];
                        }
                    } else if (i83 == 50) {
                        int i93 = i72 + 1;
                        iArr[i72] = i73;
                        int i94 = (i73 / 3) << 1;
                        int i95 = i15 + 2;
                        objArr[i94] = objArr2[i92];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr[i94 + 1] = objArr2[i95];
                            i15 += 3;
                        } else {
                            i15 = i95;
                        }
                        i72 = i93;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                    if ((iCharAt11 & 4096) != 0 || i83 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i29 = i27;
                        i30 = 0;
                    } else {
                        int i96 = i27 + 1;
                        int iCharAt13 = str.charAt(i27);
                        if (iCharAt13 >= 55296) {
                            int i97 = iCharAt13 & 8191;
                            int i98 = 13;
                            while (true) {
                                i29 = i96 + 1;
                                cCharAt9 = str.charAt(i96);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i97 |= (cCharAt9 & 8191) << i98;
                                i98 += 13;
                                i96 = i29;
                            }
                            iCharAt13 = i97 | (cCharAt9 << i98);
                        } else {
                            i29 = i96;
                        }
                        int i99 = (iCharAt13 / 32) + (i28 << 1);
                        Object obj3 = objArr2[i99];
                        if (obj3 instanceof Field) {
                            fieldO = (Field) obj3;
                        } else {
                            fieldO = o((String) obj3, cls);
                            objArr2[i99] = fieldO;
                        }
                        int i100 = iCharAt13;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO);
                        i30 = i100 % 32;
                    }
                    if (i83 >= 18 && i83 <= 49) {
                        iArr[i71] = iObjectFieldOffset;
                        i71++;
                    }
                }
                i15 = i92;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i27;
                    i30 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i27;
                    i30 = 0;
                }
                if (i83 >= 18) {
                    iArr[i71] = iObjectFieldOffset;
                    i71++;
                }
            }
            int i101 = i73 + 1;
            iArr4[i73] = i84;
            int i102 = i73 + 2;
            int i103 = iObjectFieldOffset2;
            iArr4[i101] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20) | iObjectFieldOffset;
            i73 += 3;
            iArr4[i102] = (i30 << 20) | i103;
            str = str;
            iArr3 = iArr4;
            length = i26;
            i13 = i28;
            i41 = i29;
            c10 = 55296;
        }
        return new x0(iArr3, objArr, i11, i14, c0.a, iArr, i16, i70, c0577j0);
    }

    public static Field o(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int x(long j, Object obj) {
        return ((Integer) J0.k(j, obj)).intValue();
    }

    public final boolean A(zzjk zzjkVar, zzjk zzjkVar2, int i10) {
        return z(i10, zzjkVar) == z(i10, zzjkVar2);
    }

    public final zzjo C(int i10) {
        return (zzjo) this.f8436b[((i10 / 3) << 1) + 1];
    }

    public final D0 D(int i10) {
        int i11 = (i10 / 3) << 1;
        Object[] objArr = this.f8436b;
        D0 d3 = (D0) objArr[i11];
        if (d3 != null) {
            return d3;
        }
        D0 d0A = B0.f8333c.a((Class) objArr[i11 + 1]);
        objArr[i11] = d0A;
        return d0A;
    }

    public final Object F(int i10) {
        return this.f8436b[(i10 / 3) << 1];
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    @Override // com.google.android.gms.internal.measurement.D0
    public final boolean a(zzjk zzjkVar, zzjk zzjkVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean zG = true;
            if (i10 < length) {
                int iW = w(i10);
                long j = iW & 1048575;
                switch ((iW & 267386880) >>> 20) {
                    case 0:
                        if (!A(zzjkVar, zzjkVar2, i10)) {
                            zG = false;
                        } else {
                            I0 i11 = J0.f8349c;
                            if (Double.doubleToLongBits(i11.a(j, zzjkVar)) != Double.doubleToLongBits(i11.a(j, zzjkVar2))) {
                                zG = false;
                            }
                        }
                        break;
                    case 1:
                        if (!A(zzjkVar, zzjkVar2, i10)) {
                            zG = false;
                        } else {
                            I0 i12 = J0.f8349c;
                            if (Float.floatToIntBits(i12.h(j, zzjkVar)) != Float.floatToIntBits(i12.h(j, zzjkVar2))) {
                                zG = false;
                            }
                        }
                        break;
                    case 2:
                        if (!A(zzjkVar, zzjkVar2, i10)) {
                            zG = false;
                        } else {
                            I0 i13 = J0.f8349c;
                            if (i13.k(j, zzjkVar) != i13.k(j, zzjkVar2)) {
                                zG = false;
                            }
                        }
                        break;
                    case 3:
                        if (!A(zzjkVar, zzjkVar2, i10)) {
                            zG = false;
                        } else {
                            I0 i14 = J0.f8349c;
                            if (i14.k(j, zzjkVar) != i14.k(j, zzjkVar2)) {
                                zG = false;
                            }
                        }
                        break;
                    case 4:
                        if (!A(zzjkVar, zzjkVar2, i10)) {
                            zG = false;
                        } else {
                            I0 i15 = J0.f8349c;
                            if (i15.j(j, zzjkVar) != i15.j(j, zzjkVar2)) {
                                zG = false;
                            }
                        }
                        break;
                    case 5:
                        if (!A(zzjkVar, zzjkVar2, i10)) {
                            zG = false;
                        } else {
                            I0 i16 = J0.f8349c;
                            if (i16.k(j, zzjkVar) != i16.k(j, zzjkVar2)) {
                                zG = false;
                            }
                        }
                        break;
                    case 6:
                        if (!A(zzjkVar, zzjkVar2, i10)) {
                            zG = false;
                        } else {
                            I0 i17 = J0.f8349c;
                            if (i17.j(j, zzjkVar) != i17.j(j, zzjkVar2)) {
                                zG = false;
                            }
                        }
                        break;
                    case 7:
                        if (!A(zzjkVar, zzjkVar2, i10)) {
                            zG = false;
                        } else {
                            I0 i18 = J0.f8349c;
                            if (i18.i(j, zzjkVar) != i18.i(j, zzjkVar2)) {
                                zG = false;
                            }
                        }
                        break;
                    case 8:
                        if (!A(zzjkVar, zzjkVar2, i10) || !E0.g(J0.k(j, zzjkVar), J0.k(j, zzjkVar2))) {
                            zG = false;
                        }
                        break;
                    case 9:
                        if (!A(zzjkVar, zzjkVar2, i10) || !E0.g(J0.k(j, zzjkVar), J0.k(j, zzjkVar2))) {
                            zG = false;
                        }
                        break;
                    case 10:
                        if (!A(zzjkVar, zzjkVar2, i10) || !E0.g(J0.k(j, zzjkVar), J0.k(j, zzjkVar2))) {
                            zG = false;
                        }
                        break;
                    case 11:
                        if (!A(zzjkVar, zzjkVar2, i10)) {
                            zG = false;
                        } else {
                            I0 i19 = J0.f8349c;
                            if (i19.j(j, zzjkVar) != i19.j(j, zzjkVar2)) {
                                zG = false;
                            }
                        }
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        if (!A(zzjkVar, zzjkVar2, i10)) {
                            zG = false;
                        } else {
                            I0 i20 = J0.f8349c;
                            if (i20.j(j, zzjkVar) != i20.j(j, zzjkVar2)) {
                                zG = false;
                            }
                        }
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        if (!A(zzjkVar, zzjkVar2, i10)) {
                            zG = false;
                        } else {
                            I0 i21 = J0.f8349c;
                            if (i21.j(j, zzjkVar) != i21.j(j, zzjkVar2)) {
                                zG = false;
                            }
                        }
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        if (!A(zzjkVar, zzjkVar2, i10)) {
                            zG = false;
                        } else {
                            I0 i22 = J0.f8349c;
                            if (i22.k(j, zzjkVar) != i22.k(j, zzjkVar2)) {
                                zG = false;
                            }
                        }
                        break;
                    case 15:
                        if (!A(zzjkVar, zzjkVar2, i10)) {
                            zG = false;
                        } else {
                            I0 i23 = J0.f8349c;
                            if (i23.j(j, zzjkVar) != i23.j(j, zzjkVar2)) {
                                zG = false;
                            }
                        }
                        break;
                    case 16:
                        if (!A(zzjkVar, zzjkVar2, i10)) {
                            zG = false;
                        } else {
                            I0 i24 = J0.f8349c;
                            if (i24.k(j, zzjkVar) != i24.k(j, zzjkVar2)) {
                                zG = false;
                            }
                        }
                        break;
                    case 17:
                        if (!A(zzjkVar, zzjkVar2, i10) || !E0.g(J0.k(j, zzjkVar), J0.k(j, zzjkVar2))) {
                            zG = false;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case MobileAdsBridge.CODE_21 /* 21 */:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zG = E0.g(J0.k(j, zzjkVar), J0.k(j, zzjkVar2));
                        break;
                    case 50:
                        zG = E0.g(J0.k(j, zzjkVar), J0.k(j, zzjkVar2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j10 = iArr[i10 + 2] & 1048575;
                        I0 i25 = J0.f8349c;
                        if (i25.j(j10, zzjkVar) != i25.j(j10, zzjkVar2) || !E0.g(J0.k(j, zzjkVar), J0.k(j, zzjkVar2))) {
                            zG = false;
                        }
                        break;
                }
                if (zG) {
                    i10 += 3;
                }
            } else if (zzjkVar.zzb.equals(zzjkVar2.zzb)) {
                if (!this.f8440f) {
                    return true;
                }
                C0577j0 c0577j0 = this.j;
                c0577j0.getClass();
                C0581l0 c0581l0 = ((zzjk.zzd) zzjkVar).zzc;
                c0577j0.getClass();
                return c0581l0.equals(((zzjk.zzd) zzjkVar2).zzc);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.D0
    public final Object b() {
        return (zzjk) ((zzjk) this.f8439e).q(4);
    }

    @Override // com.google.android.gms.internal.measurement.D0
    public final void c(Object obj, byte[] bArr, int i10, int i11, X x8) throws zzjs {
        k(obj, bArr, i10, i11, 0, x8);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d8 A[PHI: r3
      0x00d8: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01fd, B:41:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.D0
    public final int d(zzjk zzjkVar) {
        int i10;
        int iA;
        int i11;
        int[] iArr = this.a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iW = w(i13);
            int i14 = iArr[i13];
            long j = 1048575 & iW;
            int i15 = 1237;
            int iHashCode = 37;
            switch ((iW & 267386880) >>> 20) {
                case 0:
                    i10 = i12 * 53;
                    iA = zzjm.a(Double.doubleToLongBits(J0.f8349c.a(j, zzjkVar)));
                    i12 = iA + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iA = Float.floatToIntBits(J0.f8349c.h(j, zzjkVar));
                    i12 = iA + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iA = zzjm.a(J0.f8349c.k(j, zzjkVar));
                    i12 = iA + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iA = zzjm.a(J0.f8349c.k(j, zzjkVar));
                    i12 = iA + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iA = J0.f8349c.j(j, zzjkVar);
                    i12 = iA + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iA = zzjm.a(J0.f8349c.k(j, zzjkVar));
                    i12 = iA + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iA = J0.f8349c.j(j, zzjkVar);
                    i12 = iA + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zI = J0.f8349c.i(j, zzjkVar);
                    Charset charset = zzjm.a;
                    if (zI) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iA = ((String) J0.k(j, zzjkVar)).hashCode();
                    i12 = iA + i10;
                    break;
                case 9:
                    Object objK = J0.k(j, zzjkVar);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iA = J0.k(j, zzjkVar).hashCode();
                    i12 = iA + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iA = J0.f8349c.j(j, zzjkVar);
                    i12 = iA + i10;
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    i10 = i12 * 53;
                    iA = J0.f8349c.j(j, zzjkVar);
                    i12 = iA + i10;
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    i10 = i12 * 53;
                    iA = J0.f8349c.j(j, zzjkVar);
                    i12 = iA + i10;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    i10 = i12 * 53;
                    iA = zzjm.a(J0.f8349c.k(j, zzjkVar));
                    i12 = iA + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iA = J0.f8349c.j(j, zzjkVar);
                    i12 = iA + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iA = zzjm.a(J0.f8349c.k(j, zzjkVar));
                    i12 = iA + i10;
                    break;
                case 17:
                    Object objK2 = J0.k(j, zzjkVar);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case MobileAdsBridge.CODE_21 /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i12 * 53;
                    iA = J0.k(j, zzjkVar).hashCode();
                    i12 = iA + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iA = J0.k(j, zzjkVar).hashCode();
                    i12 = iA + i10;
                    break;
                case 51:
                    if (y(i14, i13, zzjkVar)) {
                        i10 = i12 * 53;
                        iA = zzjm.a(Double.doubleToLongBits(((Double) J0.k(j, zzjkVar)).doubleValue()));
                        i12 = iA + i10;
                    }
                    break;
                case 52:
                    if (y(i14, i13, zzjkVar)) {
                        i10 = i12 * 53;
                        iA = Float.floatToIntBits(((Float) J0.k(j, zzjkVar)).floatValue());
                        i12 = iA + i10;
                    }
                    break;
                case 53:
                    if (y(i14, i13, zzjkVar)) {
                        i10 = i12 * 53;
                        iA = zzjm.a(B(j, zzjkVar));
                        i12 = iA + i10;
                    }
                    break;
                case 54:
                    if (y(i14, i13, zzjkVar)) {
                        i10 = i12 * 53;
                        iA = zzjm.a(B(j, zzjkVar));
                        i12 = iA + i10;
                    }
                    break;
                case 55:
                    if (y(i14, i13, zzjkVar)) {
                        i10 = i12 * 53;
                        iA = x(j, zzjkVar);
                        i12 = iA + i10;
                    }
                    break;
                case 56:
                    if (y(i14, i13, zzjkVar)) {
                        i10 = i12 * 53;
                        iA = zzjm.a(B(j, zzjkVar));
                        i12 = iA + i10;
                    }
                    break;
                case 57:
                    if (y(i14, i13, zzjkVar)) {
                        i10 = i12 * 53;
                        iA = x(j, zzjkVar);
                        i12 = iA + i10;
                    }
                    break;
                case 58:
                    if (y(i14, i13, zzjkVar)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) J0.k(j, zzjkVar)).booleanValue();
                        Charset charset2 = zzjm.a;
                        if (zBooleanValue) {
                            i15 = 1231;
                        }
                        i12 = i15 + i11;
                    }
                    break;
                case 59:
                    if (y(i14, i13, zzjkVar)) {
                        i10 = i12 * 53;
                        iA = ((String) J0.k(j, zzjkVar)).hashCode();
                        i12 = iA + i10;
                    }
                    break;
                case 60:
                    if (y(i14, i13, zzjkVar)) {
                        i10 = i12 * 53;
                        iA = J0.k(j, zzjkVar).hashCode();
                        i12 = iA + i10;
                    }
                    break;
                case 61:
                    if (y(i14, i13, zzjkVar)) {
                        i10 = i12 * 53;
                        iA = J0.k(j, zzjkVar).hashCode();
                        i12 = iA + i10;
                    }
                    break;
                case 62:
                    if (y(i14, i13, zzjkVar)) {
                        i10 = i12 * 53;
                        iA = x(j, zzjkVar);
                        i12 = iA + i10;
                    }
                    break;
                case 63:
                    if (y(i14, i13, zzjkVar)) {
                        i10 = i12 * 53;
                        iA = x(j, zzjkVar);
                        i12 = iA + i10;
                    }
                    break;
                case 64:
                    if (y(i14, i13, zzjkVar)) {
                        i10 = i12 * 53;
                        iA = x(j, zzjkVar);
                        i12 = iA + i10;
                    }
                    break;
                case 65:
                    if (y(i14, i13, zzjkVar)) {
                        i10 = i12 * 53;
                        iA = zzjm.a(B(j, zzjkVar));
                        i12 = iA + i10;
                    }
                    break;
                case 66:
                    if (y(i14, i13, zzjkVar)) {
                        i10 = i12 * 53;
                        iA = x(j, zzjkVar);
                        i12 = iA + i10;
                    }
                    break;
                case 67:
                    if (y(i14, i13, zzjkVar)) {
                        i10 = i12 * 53;
                        iA = zzjm.a(B(j, zzjkVar));
                        i12 = iA + i10;
                    }
                    break;
                case 68:
                    if (y(i14, i13, zzjkVar)) {
                        i10 = i12 * 53;
                        iA = J0.k(j, zzjkVar).hashCode();
                        i12 = iA + i10;
                    }
                    break;
            }
        }
        int iHashCode2 = zzjkVar.zzb.hashCode() + (i12 * 53);
        if (!this.f8440f) {
            return iHashCode2;
        }
        this.j.getClass();
        return ((zzjk.zzd) zzjkVar).zzc.a.hashCode() + (iHashCode2 * 53);
    }

    @Override // com.google.android.gms.internal.measurement.D0
    public final boolean e(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f8442h) {
            int i15 = this.f8441g[i14];
            int[] iArr = this.a;
            int i16 = iArr[i15];
            int iW = w(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f8435l.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                int i20 = i13;
                i10 = i12;
                i11 = i20;
            }
            if ((268435456 & iW) == 0 || r(obj, i15, i10, i11, i19)) {
                int i21 = (267386880 & iW) >>> 20;
                if (i21 != 9 && i21 != 17) {
                    if (i21 != 27) {
                        if (i21 == 60 || i21 == 68) {
                            if (!y(i16, i15, obj) || D(i15).e(J0.k(iW & 1048575, obj))) {
                            }
                        } else if (i21 != 49) {
                            if (i21 == 50 && !((zzkn) J0.k(iW & 1048575, obj)).isEmpty()) {
                                throw new NoSuchMethodError();
                            }
                        }
                        i14++;
                        i12 = i10;
                        i13 = i11;
                    }
                    List list = (List) J0.k(iW & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        D0 d0D = D(i15);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (d0D.e(list.get(i22))) {
                            }
                        }
                    }
                    i14++;
                    i12 = i10;
                    i13 = i11;
                } else if (!r(obj, i15, i10, i11, i19) || D(i15).e(J0.k(iW & 1048575, obj))) {
                    i14++;
                    i12 = i10;
                    i13 = i11;
                }
            }
            return false;
        }
        if (this.f8440f) {
            this.j.getClass();
            if (!((zzjk.zzd) obj).zzc.l()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // com.google.android.gms.internal.measurement.D0
    public final void f(Object obj, Object obj2) {
        Object obj3;
        G(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 >= iArr.length) {
                Object obj4 = obj;
                E0.e(obj4, obj2);
                if (this.f8440f) {
                    E0.d(this.j, obj4, obj2);
                    return;
                }
                return;
            }
            int iW = w(i10);
            long j = 1048575 & iW;
            int i11 = iArr[i10];
            switch ((iW & 267386880) >>> 20) {
                case 0:
                    if (!z(i10, obj2)) {
                        obj3 = obj;
                    } else {
                        I0 i12 = J0.f8349c;
                        obj3 = obj;
                        i12.c(obj3, j, i12.a(j, obj2));
                        u(i10, obj3);
                    }
                    break;
                case 1:
                    if (z(i10, obj2)) {
                        I0 i13 = J0.f8349c;
                        i13.d(obj, j, i13.h(j, obj2));
                        u(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (z(i10, obj2)) {
                        J0.d(obj, j, J0.f8349c.k(j, obj2));
                        u(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (z(i10, obj2)) {
                        J0.d(obj, j, J0.f8349c.k(j, obj2));
                        u(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (z(i10, obj2)) {
                        J0.c(obj, j, J0.f8349c.j(j, obj2));
                        u(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (z(i10, obj2)) {
                        J0.d(obj, j, J0.f8349c.k(j, obj2));
                        u(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (z(i10, obj2)) {
                        J0.c(obj, j, J0.f8349c.j(j, obj2));
                        u(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (z(i10, obj2)) {
                        I0 i14 = J0.f8349c;
                        i14.g(obj, j, i14.i(j, obj2));
                        u(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (z(i10, obj2)) {
                        J0.b(j, obj, J0.k(j, obj2));
                        u(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    p(obj, i10, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (z(i10, obj2)) {
                        J0.b(j, obj, J0.k(j, obj2));
                        u(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (z(i10, obj2)) {
                        J0.c(obj, j, J0.f8349c.j(j, obj2));
                        u(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if (z(i10, obj2)) {
                        J0.c(obj, j, J0.f8349c.j(j, obj2));
                        u(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if (z(i10, obj2)) {
                        J0.c(obj, j, J0.f8349c.j(j, obj2));
                        u(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (z(i10, obj2)) {
                        J0.d(obj, j, J0.f8349c.k(j, obj2));
                        u(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (z(i10, obj2)) {
                        J0.c(obj, j, J0.f8349c.j(j, obj2));
                        u(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (z(i10, obj2)) {
                        J0.d(obj, j, J0.f8349c.k(j, obj2));
                        u(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    p(obj, i10, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case MobileAdsBridge.CODE_21 /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzjt zzjtVarH = (zzjt) J0.k(j, obj);
                    zzjt zzjtVar = (zzjt) J0.k(j, obj2);
                    int size = zzjtVarH.size();
                    int size2 = zzjtVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzjtVarH.c()) {
                            zzjtVarH = zzjtVarH.h(size2 + size);
                        }
                        zzjtVarH.addAll(zzjtVar);
                    }
                    if (size > 0) {
                        zzjtVar = zzjtVarH;
                    }
                    J0.b(j, obj, zzjtVar);
                    obj3 = obj;
                    break;
                case 50:
                    J0.b(j, obj, E0.a(J0.k(j, obj), J0.k(j, obj2)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (y(i11, i10, obj2)) {
                        J0.b(j, obj, J0.k(j, obj2));
                        t(i11, i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    v(obj, i10, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (y(i11, i10, obj2)) {
                        J0.b(j, obj, J0.k(j, obj2));
                        t(i11, i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    v(obj, i10, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i10 += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.D0
    public final void g(Object obj) {
        if (H(obj)) {
            if (obj instanceof zzjk) {
                zzjk zzjkVar = (zzjk) obj;
                zzjkVar.m(Integer.MAX_VALUE);
                zzjkVar.zza = 0;
                zzjkVar.x();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iW = w(i10);
                long j = 1048575 & iW;
                int i11 = (iW & 267386880) >>> 20;
                if (i11 != 9) {
                    if (i11 != 60 && i11 != 68) {
                        switch (i11) {
                            case 17:
                                if (z(i10, obj)) {
                                    D(i10).g(f8435l.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case MobileAdsBridge.CODE_21 /* 21 */:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzjt) J0.k(j, obj)).a();
                                break;
                            case 50:
                                Unsafe unsafe = f8435l;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzkn) object).f8697s = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (y(iArr[i10], i10, obj)) {
                        D(i10).g(f8435l.getObject(obj, j));
                    }
                } else if (z(i10, obj)) {
                    D(i10).g(f8435l.getObject(obj, j));
                }
            }
            zzme zzmeVar = ((zzjk) obj).zzb;
            if (zzmeVar.f8706e) {
                zzmeVar.f8706e = false;
            }
            if (this.f8440f) {
                this.j.getClass();
                ((zzjk.zzd) obj).zzc.k();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.D0
    public final void h(Object obj, t0 t0Var) throws zzit.zzb {
        Map.Entry entry;
        char c10;
        int i10;
        boolean z6;
        x0 x0Var = this;
        t0Var.getClass();
        boolean z10 = x0Var.f8440f;
        C0577j0 c0577j0 = x0Var.j;
        if (z10) {
            c0577j0.getClass();
            C0581l0 c0581l0 = ((zzjk.zzd) obj).zzc;
            if (c0581l0.a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) c0581l0.j().next();
            }
        } else {
            entry = null;
        }
        Map.Entry entry2 = entry;
        int[] iArr = x0Var.a;
        int length = iArr.length;
        Unsafe unsafe = f8435l;
        int i11 = 0;
        int i12 = 1048575;
        int i13 = 0;
        while (i11 < length) {
            int iW = x0Var.w(i11);
            int i14 = iArr[i11];
            int i15 = (267386880 & iW) >>> 20;
            if (i15 <= 17) {
                int i16 = iArr[i11 + 2];
                c10 = 1;
                int i17 = i16 & 1048575;
                if (i17 != i12) {
                    i13 = i17 == 1048575 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                c10 = 1;
                i10 = 0;
            }
            if (entry2 != null) {
                c0577j0.getClass();
                if (entry2.getKey() != null) {
                    throw new ClassCastException();
                }
                throw new NoSuchMethodError();
            }
            long j = iW & 1048575;
            C0577j0 c0577j1 = c0577j0;
            C0569f0 c0569f0 = (C0569f0) t0Var.a;
            switch (i15) {
                case 0:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        double dA = J0.f8349c.a(j, obj);
                        c0569f0.getClass();
                        c0569f0.m(i14, Double.doubleToRawLongBits(dA));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 1:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        float fH = J0.f8349c.h(j, obj);
                        c0569f0.getClass();
                        c0569f0.l(i14, Float.floatToRawIntBits(fH));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 2:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        c0569f0.u(i14, unsafe.getLong(obj, j));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 3:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        c0569f0.u(i14, unsafe.getLong(obj, j));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 4:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        c0569f0.t(i14, unsafe.getInt(obj, j));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 5:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        c0569f0.m(i14, unsafe.getLong(obj, j));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 6:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        c0569f0.l(i14, unsafe.getInt(obj, j));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 7:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        c0569f0.p(i14, J0.f8349c.i(j, obj));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 8:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            c0569f0.o(i14, (String) object);
                        } else {
                            c0569f0.n(i14, (zzia) object);
                        }
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 9:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        Object object2 = unsafe.getObject(obj, j);
                        D0 d0D = x0Var.D(i11);
                        zzkt zzktVar = (zzkt) object2;
                        c0569f0.x(i14, 2);
                        c0569f0.w(((zzhq) zzktVar).g(d0D));
                        d0D.h(zzktVar, c0569f0.a);
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 10:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        c0569f0.n(i14, (zzia) unsafe.getObject(obj, j));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 11:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        c0569f0.y(i14, unsafe.getInt(obj, j));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        c0569f0.t(i14, unsafe.getInt(obj, j));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        c0569f0.l(i14, unsafe.getInt(obj, j));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        c0569f0.m(i14, unsafe.getLong(obj, j));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 15:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        int i18 = unsafe.getInt(obj, j);
                        c0569f0.y(i14, (i18 >> 31) ^ (i18 << 1));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 16:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        long j10 = unsafe.getLong(obj, j);
                        c0569f0.u(i14, (j10 << 1) ^ (j10 >> 63));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 17:
                    if (x0Var.r(obj, i11, i12, i13, i10)) {
                        t0Var.d(i14, unsafe.getObject(obj, j), x0Var.D(i11));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 18:
                    E0.i(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, false);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 19:
                    E0.o(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, false);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 20:
                    E0.s(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, false);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case MobileAdsBridge.CODE_21 /* 21 */:
                    E0.A(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, false);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 22:
                    E0.q(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, false);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 23:
                    E0.m(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, false);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 24:
                    E0.k(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, false);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 25:
                    E0.c(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, false);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 26:
                    int i19 = iArr[i11];
                    List list = (List) unsafe.getObject(obj, j);
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof zzka) {
                            zzka zzkaVar = (zzka) list;
                            for (int i20 = 0; i20 < list.size(); i20++) {
                                Object objB = zzkaVar.b();
                                if (objB instanceof String) {
                                    c0569f0.o(i19, (String) objB);
                                } else {
                                    c0569f0.n(i19, (zzia) objB);
                                }
                            }
                        } else {
                            for (int i21 = 0; i21 < list.size(); i21++) {
                                c0569f0.o(i19, (String) list.get(i21));
                            }
                        }
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 27:
                    int i22 = iArr[i11];
                    List list2 = (List) unsafe.getObject(obj, j);
                    D0 d0D2 = x0Var.D(i11);
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i23 = 0; i23 < list2.size(); i23++) {
                            zzkt zzktVar2 = (zzkt) list2.get(i23);
                            c0569f0.x(i22, 2);
                            c0569f0.w(((zzhq) zzktVar2).g(d0D2));
                            d0D2.h(zzktVar2, c0569f0.a);
                        }
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 28:
                    int i24 = iArr[i11];
                    List list3 = (List) unsafe.getObject(obj, j);
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i25 = 0; i25 < list3.size(); i25++) {
                            c0569f0.n(i24, (zzia) list3.get(i25));
                        }
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 29:
                    z6 = false;
                    E0.z(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, false);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 30:
                    z6 = false;
                    E0.j(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, false);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 31:
                    z6 = false;
                    E0.u(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, false);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 32:
                    z6 = false;
                    E0.w(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, false);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 33:
                    z6 = false;
                    E0.x(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, false);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 34:
                    z6 = false;
                    E0.y(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, false);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 35:
                    E0.i(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, c10);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 36:
                    E0.o(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, c10);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 37:
                    E0.s(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, c10);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 38:
                    E0.A(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, c10);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 39:
                    E0.q(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, c10);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 40:
                    E0.m(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, c10);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 41:
                    E0.k(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, c10);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 42:
                    E0.c(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, c10);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 43:
                    E0.z(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, c10);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 44:
                    E0.j(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, c10);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 45:
                    E0.u(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, c10);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 46:
                    E0.w(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, c10);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 47:
                    E0.x(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, c10);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 48:
                    E0.y(iArr[i11], (List) unsafe.getObject(obj, j), t0Var, c10);
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 49:
                    int i26 = iArr[i11];
                    List list4 = (List) unsafe.getObject(obj, j);
                    D0 d0D3 = x0Var.D(i11);
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i27 = 0; i27 < list4.size(); i27++) {
                            t0Var.d(i26, list4.get(i27), d0D3);
                        }
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw new NoSuchMethodError();
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 51:
                    if (x0Var.y(i14, i11, obj)) {
                        double dDoubleValue = ((Double) J0.k(j, obj)).doubleValue();
                        c0569f0.getClass();
                        c0569f0.m(i14, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 52:
                    if (x0Var.y(i14, i11, obj)) {
                        float fFloatValue = ((Float) J0.k(j, obj)).floatValue();
                        c0569f0.getClass();
                        c0569f0.l(i14, Float.floatToRawIntBits(fFloatValue));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 53:
                    if (x0Var.y(i14, i11, obj)) {
                        c0569f0.u(i14, B(j, obj));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 54:
                    if (x0Var.y(i14, i11, obj)) {
                        c0569f0.u(i14, B(j, obj));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 55:
                    if (x0Var.y(i14, i11, obj)) {
                        c0569f0.t(i14, x(j, obj));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 56:
                    if (x0Var.y(i14, i11, obj)) {
                        c0569f0.m(i14, B(j, obj));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 57:
                    if (x0Var.y(i14, i11, obj)) {
                        c0569f0.l(i14, x(j, obj));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 58:
                    if (x0Var.y(i14, i11, obj)) {
                        c0569f0.p(i14, ((Boolean) J0.k(j, obj)).booleanValue());
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 59:
                    if (x0Var.y(i14, i11, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            c0569f0.o(i14, (String) object3);
                        } else {
                            c0569f0.n(i14, (zzia) object3);
                        }
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 60:
                    if (x0Var.y(i14, i11, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        D0 d0D4 = x0Var.D(i11);
                        zzkt zzktVar3 = (zzkt) object4;
                        c0569f0.x(i14, 2);
                        c0569f0.w(((zzhq) zzktVar3).g(d0D4));
                        d0D4.h(zzktVar3, c0569f0.a);
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 61:
                    if (x0Var.y(i14, i11, obj)) {
                        c0569f0.n(i14, (zzia) unsafe.getObject(obj, j));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 62:
                    if (x0Var.y(i14, i11, obj)) {
                        c0569f0.y(i14, x(j, obj));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 63:
                    if (x0Var.y(i14, i11, obj)) {
                        c0569f0.t(i14, x(j, obj));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 64:
                    if (x0Var.y(i14, i11, obj)) {
                        c0569f0.l(i14, x(j, obj));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 65:
                    if (x0Var.y(i14, i11, obj)) {
                        c0569f0.m(i14, B(j, obj));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 66:
                    if (x0Var.y(i14, i11, obj)) {
                        int iX = x(j, obj);
                        c0569f0.y(i14, (iX >> 31) ^ (iX << 1));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 67:
                    if (x0Var.y(i14, i11, obj)) {
                        long jB = B(j, obj);
                        c0569f0.u(i14, (jB << c10) ^ (jB >> 63));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                case 68:
                    if (x0Var.y(i14, i11, obj)) {
                        t0Var.d(i14, unsafe.getObject(obj, j), x0Var.D(i11));
                    }
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
                default:
                    i11 += 3;
                    x0Var = this;
                    c0577j0 = c0577j1;
                    break;
            }
        }
        C0577j0 c0577j2 = c0577j0;
        if (entry2 == null) {
            ((zzjk) obj).zzb.d(t0Var);
            return;
        }
        c0577j2.getClass();
        if (entry2.getKey() != null) {
            throw new ClassCastException();
        }
        throw new NoSuchMethodError();
    }

    /* JADX WARN: Code duplicated, block: B:145:0x037e  */
    /* JADX WARN: Code duplicated, block: B:155:0x03af  */
    /* JADX WARN: Code duplicated, block: B:160:0x03c8  */
    @Override // com.google.android.gms.internal.measurement.D0
    public final int i(zzhq zzhqVar) {
        int i10;
        int iG;
        int iE;
        int iG2;
        int iE2;
        int iD;
        int iT;
        int size;
        int iG3;
        int size2;
        int iG4;
        int iF;
        int size3;
        int iV;
        int iF2;
        int iF3;
        int i11;
        int i12;
        int size4;
        int iF4;
        int iG5;
        int iB;
        int iG6;
        int iE3;
        int iG7;
        int iE4;
        x0 x0Var = this;
        Unsafe unsafe = f8435l;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int iT2 = 0;
        while (true) {
            int[] iArr = x0Var.a;
            if (i15 < iArr.length) {
                int iW = x0Var.w(i15);
                int i17 = (267386880 & iW) >>> 20;
                int i18 = iArr[i15];
                int i19 = iArr[i15 + 2];
                int i20 = i19 & i13;
                if (i17 <= 17) {
                    if (i20 != i14) {
                        i16 = i20 == i13 ? 0 : unsafe.getInt(zzhqVar, i20);
                        i14 = i20;
                    }
                    i10 = 1 << (i19 >>> 20);
                } else {
                    i10 = 0;
                }
                long j = iW & i13;
                if (i17 >= zzje.f8675t.f8679s) {
                    int i21 = zzje.f8676u.f8679s;
                }
                switch (i17) {
                    case 0:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            iT2 = AbstractC0487g.t(i18 << 3, 8, iT2);
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 1:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            iT2 = AbstractC0487g.t(i18 << 3, 4, iT2);
                        }
                        x0Var = this;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 2:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            long j10 = unsafe.getLong(zzhqVar, j);
                            iG = zzit.g(i18 << 3);
                            iE = zzit.e(j10);
                            iT2 += iE + iG;
                        }
                        x0Var = this;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 3:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            long j11 = unsafe.getLong(zzhqVar, j);
                            iG = zzit.g(i18 << 3);
                            iE = zzit.e(j11);
                            iT2 += iE + iG;
                        }
                        x0Var = this;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 4:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            int i22 = unsafe.getInt(zzhqVar, j);
                            iG2 = zzit.g(i18 << 3);
                            iE2 = zzit.e(i22);
                            iD = iE2 + iG2;
                            iT2 += iD;
                        }
                        x0Var = this;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 5:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            iT2 = AbstractC0487g.t(i18 << 3, 8, iT2);
                        }
                        x0Var = this;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 6:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            iT2 = AbstractC0487g.t(i18 << 3, 4, iT2);
                        }
                        x0Var = this;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 7:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            iT2 = AbstractC0487g.t(i18 << 3, 1, iT2);
                        }
                        x0Var = this;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 8:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            Object object = unsafe.getObject(zzhqVar, j);
                            if (object instanceof zzia) {
                                iD = zzit.d(i18, (zzia) object);
                            } else {
                                iG2 = zzit.g(i18 << 3);
                                iE2 = zzit.c((String) object);
                                iD = iE2 + iG2;
                            }
                            iT2 += iD;
                        }
                        x0Var = this;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 9:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            Object object2 = unsafe.getObject(zzhqVar, j);
                            D0 d0D = x0Var.D(i15);
                            if (object2 instanceof zzkb) {
                                int iG8 = zzit.g(i18 << 3);
                                int iA = ((zzkb) object2).a();
                                iT = AbstractC0487g.t(iA, iA, iG8);
                            } else {
                                int iG9 = zzit.g(i18 << 3);
                                int iG10 = ((zzhq) ((zzkt) object2)).g(d0D);
                                iT = AbstractC0487g.t(iG10, iG10, iG9);
                            }
                            iT2 += iT;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 10:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            iD = zzit.d(i18, (zzia) unsafe.getObject(zzhqVar, j));
                            iT2 += iD;
                        }
                        x0Var = this;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 11:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            iD = zzit.h(i18, unsafe.getInt(zzhqVar, j));
                            iT2 += iD;
                        }
                        x0Var = this;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            int i23 = unsafe.getInt(zzhqVar, j);
                            iG2 = zzit.g(i18 << 3);
                            iE2 = zzit.e(i23);
                            iD = iE2 + iG2;
                            iT2 += iD;
                        }
                        x0Var = this;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            iT2 = AbstractC0487g.t(i18 << 3, 4, iT2);
                        }
                        x0Var = this;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            iT2 = AbstractC0487g.t(i18 << 3, 8, iT2);
                        }
                        x0Var = this;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 15:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            int i24 = unsafe.getInt(zzhqVar, j);
                            iT2 = AbstractC0487g.t((i24 >> 31) ^ (i24 << 1), zzit.g(i18 << 3), iT2);
                        }
                        x0Var = this;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 16:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            long j12 = unsafe.getLong(zzhqVar, j);
                            iG = zzit.g(i18 << 3);
                            iE = zzit.e((j12 >> 63) ^ (j12 << 1));
                            iT2 += iE + iG;
                        }
                        x0Var = this;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 17:
                        if (x0Var.r(zzhqVar, i15, i14, i16, i10)) {
                            iT = zzit.b(i18, (zzkt) unsafe.getObject(zzhqVar, j), x0Var.D(i15));
                            iT2 += iT;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 18:
                        size = ((List) unsafe.getObject(zzhqVar, j)).size();
                        if (size == 0) {
                            i12 = 0;
                        } else {
                            iG3 = zzit.g(i18 << 3) + 8;
                            i12 = iG3 * size;
                        }
                        iT2 += i12;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 19:
                        size2 = ((List) unsafe.getObject(zzhqVar, j)).size();
                        if (size2 == 0) {
                            i11 = 0;
                        } else {
                            iG4 = zzit.g(i18 << 3) + 4;
                            i11 = iG4 * size2;
                        }
                        iT2 += i11;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(zzhqVar, j);
                        if (list.size() == 0) {
                            iF = 0;
                        } else {
                            iF = (zzit.f(i18) * list.size()) + E0.n(list);
                        }
                        iT2 += iF;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case MobileAdsBridge.CODE_21 /* 21 */:
                        List list2 = (List) unsafe.getObject(zzhqVar, j);
                        size3 = list2.size();
                        if (size3 == 0) {
                            iF = 0;
                        } else {
                            iV = E0.v(list2);
                            iF2 = zzit.f(i18);
                            iF = (iF2 * size3) + iV;
                        }
                        iT2 += iF;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 22:
                        List list3 = (List) unsafe.getObject(zzhqVar, j);
                        size3 = list3.size();
                        if (size3 == 0) {
                            iF = 0;
                        } else {
                            iV = E0.l(list3);
                            iF2 = zzit.f(i18);
                            iF = (iF2 * size3) + iV;
                        }
                        iT2 += iF;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 23:
                        size = ((List) unsafe.getObject(zzhqVar, j)).size();
                        if (size == 0) {
                            i12 = 0;
                        } else {
                            iG3 = zzit.g(i18 << 3) + 8;
                            i12 = iG3 * size;
                        }
                        iT2 += i12;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 24:
                        size2 = ((List) unsafe.getObject(zzhqVar, j)).size();
                        if (size2 == 0) {
                            i11 = 0;
                        } else {
                            iG4 = zzit.g(i18 << 3) + 4;
                            i11 = iG4 * size2;
                        }
                        iT2 += i11;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 25:
                        int size5 = ((List) unsafe.getObject(zzhqVar, j)).size();
                        iT2 += size5 == 0 ? 0 : (zzit.g(i18 << 3) + 1) * size5;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 26:
                        List list4 = (List) unsafe.getObject(zzhqVar, j);
                        int size6 = list4.size();
                        if (size6 == 0) {
                            iF = 0;
                        } else {
                            iF = zzit.f(i18) * size6;
                            if (list4 instanceof zzka) {
                                zzka zzkaVar = (zzka) list4;
                                for (int i25 = 0; i25 < size6; i25++) {
                                    Object objB = zzkaVar.b();
                                    if (objB instanceof zzia) {
                                        int iN = ((zzia) objB).n();
                                        iF = AbstractC0487g.t(iN, iN, iF);
                                    } else {
                                        iF = zzit.c((String) objB) + iF;
                                    }
                                }
                            } else {
                                for (int i26 = 0; i26 < size6; i26++) {
                                    Object obj = list4.get(i26);
                                    if (obj instanceof zzia) {
                                        int iN2 = ((zzia) obj).n();
                                        iF = AbstractC0487g.t(iN2, iN2, iF);
                                    } else {
                                        iF = zzit.c((String) obj) + iF;
                                    }
                                }
                            }
                        }
                        iT2 += iF;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 27:
                        List list5 = (List) unsafe.getObject(zzhqVar, j);
                        D0 d0D2 = x0Var.D(i15);
                        int size7 = list5.size();
                        if (size7 == 0) {
                            iF3 = 0;
                        } else {
                            iF3 = zzit.f(i18) * size7;
                            for (int i27 = 0; i27 < size7; i27++) {
                                Object obj2 = list5.get(i27);
                                if (obj2 instanceof zzkb) {
                                    iF3 = zzit.a((zzkb) obj2) + iF3;
                                } else {
                                    int iG11 = ((zzhq) ((zzkt) obj2)).g(d0D2);
                                    iF3 = AbstractC0487g.t(iG11, iG11, iF3);
                                }
                            }
                        }
                        iT2 += iF3;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 28:
                        List list6 = (List) unsafe.getObject(zzhqVar, j);
                        int size8 = list6.size();
                        if (size8 == 0) {
                            iF = 0;
                        } else {
                            iF = zzit.f(i18) * size8;
                            for (int i28 = 0; i28 < list6.size(); i28++) {
                                int iN3 = ((zzia) list6.get(i28)).n();
                                iF = AbstractC0487g.t(iN3, iN3, iF);
                            }
                        }
                        iT2 += iF;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 29:
                        List list7 = (List) unsafe.getObject(zzhqVar, j);
                        size3 = list7.size();
                        if (size3 == 0) {
                            iF = 0;
                        } else {
                            iV = E0.t(list7);
                            iF2 = zzit.f(i18);
                            iF = (iF2 * size3) + iV;
                        }
                        iT2 += iF;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 30:
                        List list8 = (List) unsafe.getObject(zzhqVar, j);
                        size3 = list8.size();
                        if (size3 == 0) {
                            iF = 0;
                        } else {
                            iV = E0.h(list8);
                            iF2 = zzit.f(i18);
                            iF = (iF2 * size3) + iV;
                        }
                        iT2 += iF;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 31:
                        size2 = ((List) unsafe.getObject(zzhqVar, j)).size();
                        if (size2 == 0) {
                            i11 = 0;
                        } else {
                            iG4 = zzit.g(i18 << 3) + 4;
                            i11 = iG4 * size2;
                        }
                        iT2 += i11;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 32:
                        size = ((List) unsafe.getObject(zzhqVar, j)).size();
                        if (size == 0) {
                            i12 = 0;
                        } else {
                            iG3 = zzit.g(i18 << 3) + 8;
                            i12 = iG3 * size;
                        }
                        iT2 += i12;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 33:
                        List list9 = (List) unsafe.getObject(zzhqVar, j);
                        size3 = list9.size();
                        if (size3 == 0) {
                            iF = 0;
                        } else {
                            iV = E0.p(list9);
                            iF2 = zzit.f(i18);
                            iF = (iF2 * size3) + iV;
                        }
                        iT2 += iF;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 34:
                        List list10 = (List) unsafe.getObject(zzhqVar, j);
                        size3 = list10.size();
                        if (size3 == 0) {
                            iF = 0;
                        } else {
                            iV = E0.r(list10);
                            iF2 = zzit.f(i18);
                            iF = (iF2 * size3) + iV;
                        }
                        iT2 += iF;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 35:
                        size4 = ((List) unsafe.getObject(zzhqVar, j)).size() << 3;
                        if (size4 > 0) {
                            iF4 = zzit.f(i18);
                            iG5 = zzit.g(size4);
                            i11 = iG5 + iF4 + size4;
                            iT2 += i11;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 36:
                        size4 = ((List) unsafe.getObject(zzhqVar, j)).size() << 2;
                        if (size4 > 0) {
                            iF4 = zzit.f(i18);
                            iG5 = zzit.g(size4);
                            i11 = iG5 + iF4 + size4;
                            iT2 += i11;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 37:
                        size4 = E0.n((List) unsafe.getObject(zzhqVar, j));
                        if (size4 > 0) {
                            iF4 = zzit.f(i18);
                            iG5 = zzit.g(size4);
                            i11 = iG5 + iF4 + size4;
                            iT2 += i11;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 38:
                        size4 = E0.v((List) unsafe.getObject(zzhqVar, j));
                        if (size4 > 0) {
                            iF4 = zzit.f(i18);
                            iG5 = zzit.g(size4);
                            i11 = iG5 + iF4 + size4;
                            iT2 += i11;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 39:
                        size4 = E0.l((List) unsafe.getObject(zzhqVar, j));
                        if (size4 > 0) {
                            iF4 = zzit.f(i18);
                            iG5 = zzit.g(size4);
                            i11 = iG5 + iF4 + size4;
                            iT2 += i11;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 40:
                        size4 = ((List) unsafe.getObject(zzhqVar, j)).size() << 3;
                        if (size4 > 0) {
                            iF4 = zzit.f(i18);
                            iG5 = zzit.g(size4);
                            i11 = iG5 + iF4 + size4;
                            iT2 += i11;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 41:
                        size4 = ((List) unsafe.getObject(zzhqVar, j)).size() << 2;
                        if (size4 > 0) {
                            iF4 = zzit.f(i18);
                            iG5 = zzit.g(size4);
                            i11 = iG5 + iF4 + size4;
                            iT2 += i11;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 42:
                        size4 = ((List) unsafe.getObject(zzhqVar, j)).size();
                        if (size4 > 0) {
                            iF4 = zzit.f(i18);
                            iG5 = zzit.g(size4);
                            i11 = iG5 + iF4 + size4;
                            iT2 += i11;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 43:
                        size4 = E0.t((List) unsafe.getObject(zzhqVar, j));
                        if (size4 > 0) {
                            iF4 = zzit.f(i18);
                            iG5 = zzit.g(size4);
                            i11 = iG5 + iF4 + size4;
                            iT2 += i11;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 44:
                        size4 = E0.h((List) unsafe.getObject(zzhqVar, j));
                        if (size4 > 0) {
                            iF4 = zzit.f(i18);
                            iG5 = zzit.g(size4);
                            i11 = iG5 + iF4 + size4;
                            iT2 += i11;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 45:
                        size4 = ((List) unsafe.getObject(zzhqVar, j)).size() << 2;
                        if (size4 > 0) {
                            iF4 = zzit.f(i18);
                            iG5 = zzit.g(size4);
                            i11 = iG5 + iF4 + size4;
                            iT2 += i11;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 46:
                        size4 = ((List) unsafe.getObject(zzhqVar, j)).size() << 3;
                        if (size4 > 0) {
                            iF4 = zzit.f(i18);
                            iG5 = zzit.g(size4);
                            i11 = iG5 + iF4 + size4;
                            iT2 += i11;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 47:
                        size4 = E0.p((List) unsafe.getObject(zzhqVar, j));
                        if (size4 > 0) {
                            iF4 = zzit.f(i18);
                            iG5 = zzit.g(size4);
                            i11 = iG5 + iF4 + size4;
                            iT2 += i11;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 48:
                        size4 = E0.r((List) unsafe.getObject(zzhqVar, j));
                        if (size4 > 0) {
                            iF4 = zzit.f(i18);
                            iG5 = zzit.g(size4);
                            i11 = iG5 + iF4 + size4;
                            iT2 += i11;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 49:
                        List list11 = (List) unsafe.getObject(zzhqVar, j);
                        D0 d0D3 = x0Var.D(i15);
                        int size9 = list11.size();
                        if (size9 == 0) {
                            iB = 0;
                        } else {
                            iB = 0;
                            for (int i29 = 0; i29 < size9; i29++) {
                                iB += zzit.b(i18, (zzkt) list11.get(i29), d0D3);
                            }
                        }
                        iT2 += iB;
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 50:
                        zzkn zzknVar = (zzkn) unsafe.getObject(zzhqVar, j);
                        if (zzknVar.isEmpty()) {
                            continue;
                        } else {
                            Iterator it = zzknVar.entrySet().iterator();
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                entry.getKey();
                                entry.getValue();
                                throw new NoSuchMethodError();
                            }
                        }
                        i15 += 3;
                        i13 = 1048575;
                    case 51:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            iT2 = AbstractC0487g.t(i18 << 3, 8, iT2);
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 52:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            iT2 = AbstractC0487g.t(i18 << 3, 4, iT2);
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 53:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            long jB = B(j, zzhqVar);
                            iG6 = zzit.g(i18 << 3);
                            iE3 = zzit.e(jB);
                            i12 = iE3 + iG6;
                            iT2 += i12;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 54:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            long jB2 = B(j, zzhqVar);
                            iG6 = zzit.g(i18 << 3);
                            iE3 = zzit.e(jB2);
                            i12 = iE3 + iG6;
                            iT2 += i12;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 55:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            int iX = x(j, zzhqVar);
                            iG7 = zzit.g(i18 << 3);
                            iE4 = zzit.e(iX);
                            iT = iE4 + iG7;
                            iT2 += iT;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 56:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            iT2 = AbstractC0487g.t(i18 << 3, 8, iT2);
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 57:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            iT2 = AbstractC0487g.t(i18 << 3, 4, iT2);
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 58:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            iT2 = AbstractC0487g.t(i18 << 3, 1, iT2);
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 59:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            Object object3 = unsafe.getObject(zzhqVar, j);
                            if (object3 instanceof zzia) {
                                iT = zzit.d(i18, (zzia) object3);
                            } else {
                                iG7 = zzit.g(i18 << 3);
                                iE4 = zzit.c((String) object3);
                                iT = iE4 + iG7;
                            }
                            iT2 += iT;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 60:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            Object object4 = unsafe.getObject(zzhqVar, j);
                            D0 d0D4 = x0Var.D(i15);
                            if (object4 instanceof zzkb) {
                                int iG12 = zzit.g(i18 << 3);
                                int iA2 = ((zzkb) object4).a();
                                iT = AbstractC0487g.t(iA2, iA2, iG12);
                            } else {
                                int iG13 = zzit.g(i18 << 3);
                                int iG14 = ((zzhq) ((zzkt) object4)).g(d0D4);
                                iT = AbstractC0487g.t(iG14, iG14, iG13);
                            }
                            iT2 += iT;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 61:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            iT = zzit.d(i18, (zzia) unsafe.getObject(zzhqVar, j));
                            iT2 += iT;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 62:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            iT = zzit.h(i18, x(j, zzhqVar));
                            iT2 += iT;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 63:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            int iX2 = x(j, zzhqVar);
                            iG7 = zzit.g(i18 << 3);
                            iE4 = zzit.e(iX2);
                            iT = iE4 + iG7;
                            iT2 += iT;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 64:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            iT2 = AbstractC0487g.t(i18 << 3, 4, iT2);
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 65:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            iT2 = AbstractC0487g.t(i18 << 3, 8, iT2);
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 66:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            int iX3 = x(j, zzhqVar);
                            iT2 = AbstractC0487g.t((iX3 >> 31) ^ (iX3 << 1), zzit.g(i18 << 3), iT2);
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 67:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            long jB3 = B(j, zzhqVar);
                            iG6 = zzit.g(i18 << 3);
                            iE3 = zzit.e((jB3 >> 63) ^ (jB3 << 1));
                            i12 = iE3 + iG6;
                            iT2 += i12;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    case 68:
                        if (x0Var.y(i18, i15, zzhqVar)) {
                            iT = zzit.b(i18, (zzkt) unsafe.getObject(zzhqVar, j), x0Var.D(i15));
                            iT2 += iT;
                        }
                        i15 += 3;
                        i13 = 1048575;
                        break;
                    default:
                        i15 += 3;
                        i13 = 1048575;
                        break;
                }
            } else {
                int iA3 = ((zzjk) zzhqVar).zzb.a() + iT2;
                if (!x0Var.f8440f) {
                    return iA3;
                }
                x0Var.j.getClass();
                C0581l0 c0581l0 = ((zzjk.zzd) zzhqVar).zzc;
                int i30 = 0;
                int iA4 = 0;
                while (true) {
                    int size10 = c0581l0.a.f8339s.size();
                    F0 f0 = c0581l0.a;
                    if (i30 >= size10) {
                        for (Map.Entry entry2 : f0.f()) {
                            iA4 = C0581l0.a((zzjf) entry2.getKey(), entry2.getValue()) + iA4;
                        }
                        return iA3 + iA4;
                    }
                    Map.Entry entryC = f0.c(i30);
                    iA4 = C0581l0.a((zzjf) entryC.getKey(), entryC.getValue()) + iA4;
                    i30++;
                }
            }
        }
    }

    public final int j(int i10, int i11) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 34701. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int k(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.measurement.X r36) throws com.google.android.gms.internal.measurement.zzjs {
        /*
            Method dump skipped, instruction units count: 3470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.x0.k(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.X):int");
    }

    public final Object m(int i10, int i11, Object obj) {
        D0 d0D = D(i11);
        if (!y(i10, i11, obj)) {
            return d0D.b();
        }
        Object object = f8435l.getObject(obj, w(i11) & 1048575);
        if (H(object)) {
            return object;
        }
        Object objB = d0D.b();
        if (object != null) {
            d0D.f(objB, object);
        }
        return objB;
    }

    public final Object n(int i10, Object obj) {
        D0 d0D = D(i10);
        long jW = w(i10) & 1048575;
        if (!z(i10, obj)) {
            return d0D.b();
        }
        Object object = f8435l.getObject(obj, jW);
        if (H(object)) {
            return object;
        }
        Object objB = d0D.b();
        if (object != null) {
            d0D.f(objB, object);
        }
        return objB;
    }

    public final void p(Object obj, int i10, Object obj2) {
        if (z(i10, obj2)) {
            long jW = w(i10) & 1048575;
            Unsafe unsafe = f8435l;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i10] + " is present but null: " + String.valueOf(obj2));
            }
            D0 d0D = D(i10);
            if (!z(i10, obj)) {
                if (H(object)) {
                    Object objB = d0D.b();
                    d0D.f(objB, object);
                    unsafe.putObject(obj, jW, objB);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                u(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!H(object2)) {
                Object objB2 = d0D.b();
                d0D.f(objB2, object2);
                unsafe.putObject(obj, jW, objB2);
                object2 = objB2;
            }
            d0D.f(object2, object);
        }
    }

    public final void q(Object obj, int i10, Object obj2, int i11) {
        f8435l.putObject(obj, w(i11) & 1048575, obj2);
        t(i10, i11, obj);
    }

    public final boolean r(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return z(i10, obj);
        }
        return (i12 & i13) != 0;
    }

    public final void s(Object obj, int i10, Object obj2) {
        f8435l.putObject(obj, w(i10) & 1048575, obj2);
        u(i10, obj);
    }

    public final void t(int i10, int i11, Object obj) {
        J0.c(obj, this.a[i11 + 2] & 1048575, i10);
    }

    public final void u(int i10, Object obj) {
        int i11 = this.a[i10 + 2];
        long j = 1048575 & i11;
        if (j == 1048575) {
            return;
        }
        J0.c(obj, j, (1 << (i11 >>> 20)) | J0.f8349c.j(j, obj));
    }

    public final void v(Object obj, int i10, Object obj2) {
        int[] iArr = this.a;
        int i11 = iArr[i10];
        if (y(i11, i10, obj2)) {
            long jW = w(i10) & 1048575;
            Unsafe unsafe = f8435l;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + String.valueOf(obj2));
            }
            D0 d0D = D(i10);
            if (!y(i11, i10, obj)) {
                if (H(object)) {
                    Object objB = d0D.b();
                    d0D.f(objB, object);
                    unsafe.putObject(obj, jW, objB);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                t(i11, i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!H(object2)) {
                Object objB2 = d0D.b();
                d0D.f(objB2, object2);
                unsafe.putObject(obj, jW, objB2);
                object2 = objB2;
            }
            d0D.f(object2, object);
        }
    }

    public final int w(int i10) {
        return this.a[i10 + 1];
    }

    public final boolean y(int i10, int i11, Object obj) {
        return J0.f8349c.j((long) (this.a[i11 + 2] & 1048575), obj) == i10;
    }

    public final boolean z(int i10, Object obj) {
        int i11 = this.a[i10 + 2];
        long j = i11 & 1048575;
        if (j == 1048575) {
            int iW = w(i10);
            long j10 = iW & 1048575;
            switch ((iW & 267386880) >>> 20) {
                case 0:
                    if (Double.doubleToRawLongBits(J0.f8349c.a(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(J0.f8349c.h(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (J0.f8349c.k(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (J0.f8349c.k(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (J0.f8349c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (J0.f8349c.k(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (J0.f8349c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return J0.f8349c.i(j10, obj);
                case 8:
                    Object objK = J0.k(j10, obj);
                    if (objK instanceof String) {
                        if (((String) objK).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objK instanceof zzia)) {
                            throw new IllegalArgumentException();
                        }
                        if (zzia.f8668t.equals(objK)) {
                            return false;
                        }
                    }
                case 9:
                    if (J0.k(j10, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (zzia.f8668t.equals(J0.k(j10, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (J0.f8349c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if (J0.f8349c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if (J0.f8349c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (J0.f8349c.k(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (J0.f8349c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (J0.f8349c.k(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (J0.k(j10, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & J0.f8349c.j(j, obj)) == 0) {
            return false;
        }
        return true;
    }
}
