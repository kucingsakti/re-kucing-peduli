package androidx.datastore.preferences.protobuf;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements InterfaceC0481b0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f6422o = new int[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Unsafe f6423p = t0.i();
    public final int[] a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f6424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0502w f6427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f6430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6431i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final T f6432k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final F f6433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j0 f6434m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final M f6435n;

    public Q(int[] iArr, Object[] objArr, int i10, int i11, AbstractC0502w abstractC0502w, boolean z6, int[] iArr2, int i12, int i13, T t7, F f10, j0 j0Var, C0495o c0495o, M m2) {
        this.a = iArr;
        this.f6424b = objArr;
        this.f6425c = i10;
        this.f6426d = i11;
        this.f6428f = abstractC0502w instanceof AbstractC0502w;
        this.f6429g = z6;
        this.f6430h = iArr2;
        this.f6431i = i12;
        this.j = i13;
        this.f6432k = t7;
        this.f6433l = f10;
        this.f6434m = j0Var;
        this.f6427e = abstractC0502w;
        this.f6435n = m2;
    }

    public static int A(long j, Object obj) {
        return ((Integer) t0.f6515d.i(j, obj)).intValue();
    }

    public static long B(long j, Object obj) {
        return ((Long) t0.f6515d.i(j, obj)).longValue();
    }

    public static Field H(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbM = AbstractC0487g.m("Field ", str, " for ");
            sbM.append(cls.getName());
            sbM.append(" not found. Known fields are ");
            sbM.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbM.toString());
        }
    }

    public static int K(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void O(int i10, Object obj, I i11) throws CodedOutputStream$OutOfSpaceException {
        if (!(obj instanceof String)) {
            i11.a(i10, (C0488h) obj);
        } else {
            ((C0491k) i11.a).P(i10, (String) obj);
        }
    }

    public static List s(AbstractC0478a abstractC0478a, long j) {
        return (List) t0.f6515d.i(j, abstractC0478a);
    }

    public static Q x(Z z6, T t7, F f10, j0 j0Var, C0495o c0495o, M m2) {
        if (z6 instanceof Z) {
            return y(z6, t7, f10, j0Var, c0495o, m2);
        }
        z6.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:136:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:137:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:188:0x03c8  */
    public static Q y(Z z6, T t7, F f10, j0 j0Var, C0495o c0495o, M m2) {
        int i10;
        int iCharAt;
        int iCharAt2;
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
        int i29;
        int iObjectFieldOffset;
        int i30;
        int i31;
        int iObjectFieldOffset2;
        Field fieldH;
        char cCharAt9;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field fieldH2;
        int i35;
        Object obj2;
        Field fieldH3;
        int i36;
        char cCharAt10;
        int i37;
        int i38;
        char cCharAt11;
        int i39;
        int i40;
        char cCharAt12;
        int i41;
        char cCharAt13;
        char cCharAt14;
        int i42 = 0;
        boolean z10 = ((z6.f6446d & 1) == 1 ? (char) 1 : (char) 2) == 2;
        String str = z6.f6444b;
        int length = str.length();
        int iCharAt3 = str.charAt(0);
        if (iCharAt3 >= 55296) {
            int i43 = iCharAt3 & 8191;
            int i44 = 1;
            int i45 = 13;
            while (true) {
                i10 = i44 + 1;
                cCharAt14 = str.charAt(i44);
                if (cCharAt14 < 55296) {
                    break;
                }
                i43 |= (cCharAt14 & 8191) << i45;
                i45 += 13;
                i44 = i10;
            }
            iCharAt3 = i43 | (cCharAt14 << i45);
        } else {
            i10 = 1;
        }
        int i46 = i10 + 1;
        int iCharAt4 = str.charAt(i10);
        if (iCharAt4 >= 55296) {
            int i47 = iCharAt4 & 8191;
            int i48 = 13;
            while (true) {
                i41 = i46 + 1;
                cCharAt13 = str.charAt(i46);
                if (cCharAt13 < 55296) {
                    break;
                }
                i47 |= (cCharAt13 & 8191) << i48;
                i48 += 13;
                i46 = i41;
            }
            iCharAt4 = i47 | (cCharAt13 << i48);
            i46 = i41;
        }
        if (iCharAt4 == 0) {
            i14 = 0;
            i13 = 0;
            i16 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            iArr = f6422o;
            i15 = 0;
        } else {
            int i49 = i46 + 1;
            int iCharAt5 = str.charAt(i46);
            if (iCharAt5 >= 55296) {
                int i50 = iCharAt5 & 8191;
                int i51 = 13;
                while (true) {
                    i24 = i49 + 1;
                    cCharAt8 = str.charAt(i49);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt8 & 8191) << i51;
                    i51 += 13;
                    i49 = i24;
                }
                iCharAt5 = i50 | (cCharAt8 << i51);
                i49 = i24;
            }
            int i52 = i49 + 1;
            int iCharAt6 = str.charAt(i49);
            if (iCharAt6 >= 55296) {
                int i53 = iCharAt6 & 8191;
                int i54 = 13;
                while (true) {
                    i23 = i52 + 1;
                    cCharAt7 = str.charAt(i52);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt7 & 8191) << i54;
                    i54 += 13;
                    i52 = i23;
                }
                iCharAt6 = i53 | (cCharAt7 << i54);
                i52 = i23;
            }
            int i55 = i52 + 1;
            int iCharAt7 = str.charAt(i52);
            if (iCharAt7 >= 55296) {
                int i56 = iCharAt7 & 8191;
                int i57 = 13;
                while (true) {
                    i22 = i55 + 1;
                    cCharAt6 = str.charAt(i55);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt6 & 8191) << i57;
                    i57 += 13;
                    i55 = i22;
                }
                iCharAt7 = i56 | (cCharAt6 << i57);
                i55 = i22;
            }
            int i58 = i55 + 1;
            int iCharAt8 = str.charAt(i55);
            if (iCharAt8 >= 55296) {
                int i59 = iCharAt8 & 8191;
                int i60 = 13;
                while (true) {
                    i21 = i58 + 1;
                    cCharAt5 = str.charAt(i58);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt5 & 8191) << i60;
                    i60 += 13;
                    i58 = i21;
                }
                iCharAt8 = i59 | (cCharAt5 << i60);
                i58 = i21;
            }
            int i61 = i58 + 1;
            iCharAt = str.charAt(i58);
            if (iCharAt >= 55296) {
                int i62 = iCharAt & 8191;
                int i63 = 13;
                while (true) {
                    i20 = i61 + 1;
                    cCharAt4 = str.charAt(i61);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt4 & 8191) << i63;
                    i63 += 13;
                    i61 = i20;
                }
                iCharAt = i62 | (cCharAt4 << i63);
                i61 = i20;
            }
            int i64 = i61 + 1;
            iCharAt2 = str.charAt(i61);
            if (iCharAt2 >= 55296) {
                int i65 = iCharAt2 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i19 = i66 + 1;
                    cCharAt3 = str.charAt(i66);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i65 |= (cCharAt3 & 8191) << i67;
                    i67 += 13;
                    i66 = i19;
                }
                iCharAt2 = i65 | (cCharAt3 << i67);
                i11 = i19;
            } else {
                i11 = i64;
            }
            int i68 = i11 + 1;
            int iCharAt9 = str.charAt(i11);
            if (iCharAt9 >= 55296) {
                int i69 = iCharAt9 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i18 = i70 + 1;
                    cCharAt2 = str.charAt(i70);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt2 & 8191) << i71;
                    i71 += 13;
                    i70 = i18;
                }
                iCharAt9 = i69 | (cCharAt2 << i71);
                i12 = i18;
            } else {
                i12 = i68;
            }
            int i72 = i12 + 1;
            int iCharAt10 = str.charAt(i12);
            if (iCharAt10 >= 55296) {
                int i73 = iCharAt10 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i17 = i74 + 1;
                    cCharAt = str.charAt(i74);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i73 |= (cCharAt & 8191) << i75;
                    i75 += 13;
                    i74 = i17;
                }
                iCharAt10 = i73 | (cCharAt << i75);
                i72 = i17;
            }
            i13 = (iCharAt5 * 2) + iCharAt6;
            int i76 = iCharAt7;
            iArr = new int[iCharAt10 + iCharAt2 + iCharAt9];
            i14 = i76;
            i15 = iCharAt8;
            i16 = iCharAt10;
            i42 = iCharAt5;
            i46 = i72;
        }
        Unsafe unsafe = f6423p;
        Class<?> cls = z6.a.getClass();
        int i77 = i14;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i78 = iCharAt2 + i16;
        int i79 = i16;
        int i80 = i78;
        int i81 = 0;
        int i82 = 0;
        while (i46 < length) {
            int i83 = i46 + 1;
            int iCharAt11 = str.charAt(i46);
            int[] iArr3 = iArr2;
            if (iCharAt11 >= 55296) {
                int i84 = iCharAt11 & 8191;
                int i85 = i83;
                int i86 = 13;
                while (true) {
                    i40 = i85 + 1;
                    cCharAt12 = str.charAt(i85);
                    i25 = i42;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i84 |= (cCharAt12 & 8191) << i86;
                    i86 += 13;
                    i85 = i40;
                    i42 = i25;
                }
                iCharAt11 = i84 | (cCharAt12 << i86);
                i26 = i40;
            } else {
                i25 = i42;
                i26 = i83;
            }
            int i87 = i26 + 1;
            int iCharAt12 = str.charAt(i26);
            if (iCharAt12 >= 55296) {
                int i88 = iCharAt12 & 8191;
                int i89 = i87;
                int i90 = 13;
                while (true) {
                    i38 = i89 + 1;
                    cCharAt11 = str.charAt(i89);
                    i39 = i88;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i88 = i39 | ((cCharAt11 & 8191) << i90);
                    i90 += 13;
                    i89 = i38;
                }
                iCharAt12 = i39 | (cCharAt11 << i90);
                i27 = i38;
            } else {
                i27 = i87;
            }
            int i91 = length;
            int i92 = iCharAt12 & 255;
            int i93 = iCharAt3;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i81] = i82;
                i81++;
            }
            Object[] objArr2 = z6.f6445c;
            if (i92 >= 51) {
                int i94 = i27 + 1;
                int iCharAt13 = str.charAt(i27);
                if (iCharAt13 >= 55296) {
                    int i95 = iCharAt13 & 8191;
                    int i96 = i94;
                    int i97 = 13;
                    while (true) {
                        i36 = i96 + 1;
                        cCharAt10 = str.charAt(i96);
                        i37 = i95;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i95 = i37 | ((cCharAt10 & 8191) << i97);
                        i97 += 13;
                        i96 = i36;
                    }
                    iCharAt13 = i37 | (cCharAt10 << i97);
                    i32 = i36;
                } else {
                    i32 = i94;
                }
                int i98 = iCharAt13;
                int i99 = i92 - 51;
                int i100 = i32;
                if (i99 == 9 || i99 == 17) {
                    i33 = i13 + 1;
                    objArr[((i82 / 3) * 2) + 1] = objArr2[i13];
                } else {
                    if (i99 == 12 && (i93 & 1) == 1) {
                        i33 = i13 + 1;
                        objArr[((i82 / 3) * 2) + 1] = objArr2[i13];
                    }
                    i34 = i98 * 2;
                    obj = objArr2[i34];
                    if (obj instanceof Field) {
                        fieldH2 = (Field) obj;
                    } else {
                        fieldH2 = H((String) obj, cls);
                        objArr2[i34] = fieldH2;
                    }
                    int i101 = i13;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldH2);
                    i35 = i34 + 1;
                    obj2 = objArr2[i35];
                    if (obj2 instanceof Field) {
                        fieldH3 = (Field) obj2;
                    } else {
                        fieldH3 = H((String) obj2, cls);
                        objArr2[i35] = fieldH3;
                    }
                    iCharAt11 = iCharAt11;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldH3);
                    i13 = i101;
                    i30 = i100;
                    i31 = 0;
                }
                i13 = i33;
                i34 = i98 * 2;
                obj = objArr2[i34];
                if (obj instanceof Field) {
                    fieldH2 = (Field) obj;
                } else {
                    fieldH2 = H((String) obj, cls);
                    objArr2[i34] = fieldH2;
                }
                int i102 = i13;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldH2);
                i35 = i34 + 1;
                obj2 = objArr2[i35];
                if (obj2 instanceof Field) {
                    fieldH3 = (Field) obj2;
                } else {
                    fieldH3 = H((String) obj2, cls);
                    objArr2[i35] = fieldH3;
                }
                iCharAt11 = iCharAt11;
                iObjectFieldOffset = iObjectFieldOffset4;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldH3);
                i13 = i102;
                i30 = i100;
                i31 = 0;
            } else {
                int i103 = i13 + 1;
                Field fieldH4 = H((String) objArr2[i13], cls);
                int i104 = i13;
                if (i92 == 9 || i92 == 17) {
                    iCharAt11 = iCharAt11;
                    i28 = 1;
                    objArr[((i82 / 3) * 2) + 1] = fieldH4.getType();
                } else {
                    if (i92 == 27 || i92 == 49) {
                        iCharAt11 = iCharAt11;
                        i28 = 1;
                        i29 = i104 + 2;
                        objArr[((i82 / 3) * 2) + 1] = objArr2[i103];
                    } else if (i92 == 12 || i92 == 30 || i92 == 44) {
                        iCharAt11 = iCharAt11;
                        i28 = 1;
                        if ((i93 & 1) == 1) {
                            i29 = i104 + 2;
                            objArr[((i82 / 3) * 2) + 1] = objArr2[i103];
                        }
                    } else if (i92 == 50) {
                        int i105 = i79 + 1;
                        iArr[i79] = i82;
                        int i106 = (i82 / 3) * 2;
                        int i107 = i104 + 2;
                        objArr[i106] = objArr2[i103];
                        i79 = i105;
                        if ((iCharAt12 & 2048) != 0) {
                            objArr[i106 + 1] = objArr2[i107];
                            i29 = i104 + 3;
                        } else {
                            i29 = i107;
                        }
                        i28 = 1;
                    } else {
                        iCharAt11 = iCharAt11;
                        i28 = 1;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH4);
                    if ((i93 & 1) == i28 || i92 > 17) {
                        i30 = i27;
                        i31 = 0;
                        iObjectFieldOffset2 = 0;
                    } else {
                        int i108 = i27 + 1;
                        int iCharAt14 = str.charAt(i27);
                        if (iCharAt14 >= 55296) {
                            int i109 = iCharAt14 & 8191;
                            int i110 = 13;
                            while (true) {
                                i30 = i108 + 1;
                                cCharAt9 = str.charAt(i108);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i109 |= (cCharAt9 & 8191) << i110;
                                i110 += 13;
                                i108 = i30;
                            }
                            iCharAt14 = i109 | (cCharAt9 << i110);
                        } else {
                            i30 = i108;
                        }
                        int i111 = (iCharAt14 / 32) + (i25 * 2);
                        Object obj3 = objArr2[i111];
                        if (obj3 instanceof Field) {
                            fieldH = (Field) obj3;
                        } else {
                            fieldH = H((String) obj3, cls);
                            objArr2[i111] = fieldH;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldH);
                        i31 = iCharAt14 % 32;
                    }
                    if (i92 >= 18 && i92 <= 49) {
                        iArr[i80] = iObjectFieldOffset;
                        i80++;
                    }
                    i13 = i29;
                }
                i29 = i103;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH4);
                if ((i93 & 1) == i28) {
                    i30 = i27;
                    i31 = 0;
                    iObjectFieldOffset2 = 0;
                } else {
                    i30 = i27;
                    i31 = 0;
                    iObjectFieldOffset2 = 0;
                }
                if (i92 >= 18) {
                    iArr[i80] = iObjectFieldOffset;
                    i80++;
                }
                i13 = i29;
            }
            int i112 = i82 + 1;
            iArr3[i82] = iCharAt11;
            int i113 = i82 + 2;
            String str2 = str;
            iArr3[i112] = ((iCharAt12 & 512) != 0 ? 536870912 : 0) | ((iCharAt12 & 256) != 0 ? 268435456 : 0) | (i92 << 20) | iObjectFieldOffset;
            i82 += 3;
            iArr3[i113] = (i31 << 20) | iObjectFieldOffset2;
            length = i91;
            iArr2 = iArr3;
            iCharAt3 = i93;
            i42 = i25;
            str = str2;
            i46 = i30;
        }
        return new Q(iArr2, objArr, i77, i15, z6.a, z10, iArr, i16, i78, t7, f10, j0Var, c0495o, m2);
    }

    public static long z(int i10) {
        return i10 & 1048575;
    }

    public final int C(int i10) {
        if (i10 >= this.f6425c && i10 <= this.f6426d) {
            int[] iArr = this.a;
            int length = (iArr.length / 3) - 1;
            int i11 = 0;
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
        }
        return -1;
    }

    public final void D(Object obj, long j, InterfaceC0479a0 interfaceC0479a0, InterfaceC0481b0 interfaceC0481b0, C0494n c0494n) {
        interfaceC0479a0.A(this.f6433l.c(j, obj), interfaceC0481b0, c0494n);
    }

    public final void E(Object obj, int i10, InterfaceC0479a0 interfaceC0479a0, InterfaceC0481b0 interfaceC0481b0, C0494n c0494n) {
        interfaceC0479a0.E(this.f6433l.c(i10 & 1048575, obj), interfaceC0481b0, c0494n);
    }

    public final void F(Object obj, int i10, InterfaceC0479a0 interfaceC0479a0) {
        if ((536870912 & i10) != 0) {
            t0.o(i10 & 1048575, obj, interfaceC0479a0.I());
        } else if (this.f6428f) {
            t0.o(i10 & 1048575, obj, interfaceC0479a0.o());
        } else {
            t0.o(i10 & 1048575, obj, interfaceC0479a0.w());
        }
    }

    public final void G(Object obj, int i10, InterfaceC0479a0 interfaceC0479a0) {
        boolean z6 = (536870912 & i10) != 0;
        F f10 = this.f6433l;
        if (z6) {
            interfaceC0479a0.v(f10.c(i10 & 1048575, obj));
        } else {
            interfaceC0479a0.s(f10.c(i10 & 1048575, obj));
        }
    }

    public final void I(int i10, Object obj) {
        if (this.f6429g) {
            return;
        }
        int i11 = this.a[i10 + 2];
        long j = i11 & 1048575;
        t0.m(obj, j, t0.f6515d.g(j, obj) | (1 << (i11 >>> 20)));
    }

    public final void J(int i10, int i11, Object obj) {
        t0.m(obj, this.a[i11 + 2] & 1048575, i10);
    }

    public final int L(int i10) {
        return this.a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, I i10) throws CodedOutputStream$OutOfSpaceException {
        int i11;
        int i12;
        boolean z6;
        int[] iArr = this.a;
        int length = iArr.length;
        Unsafe unsafe = f6423p;
        int i13 = -1;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 += 3) {
            int iL = L(i15);
            int i16 = iArr[i15];
            int iK = K(iL);
            if (this.f6429g || iK > 17) {
                i11 = 1048575;
                i12 = 0;
            } else {
                int i17 = iArr[i15 + 2];
                i11 = 1048575;
                int i18 = i17 & 1048575;
                if (i18 != i13) {
                    i14 = unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i12 = 1 << (i17 >>> 20);
            }
            long j = iL & i11;
            switch (iK) {
                case 0:
                    if ((i12 & i14) != 0) {
                        double dE = t0.f6515d.e(j, obj);
                        C0491k c0491k = (C0491k) i10.a;
                        c0491k.getClass();
                        c0491k.K(i16, Double.doubleToRawLongBits(dE));
                    }
                    break;
                case 1:
                    if ((i12 & i14) != 0) {
                        float f10 = t0.f6515d.f(j, obj);
                        C0491k c0491k2 = (C0491k) i10.a;
                        c0491k2.getClass();
                        c0491k2.I(i16, Float.floatToRawIntBits(f10));
                    }
                    break;
                case 2:
                    if ((i12 & i14) != 0) {
                        ((C0491k) i10.a).U(i16, unsafe.getLong(obj, j));
                    }
                    break;
                case 3:
                    if ((i12 & i14) != 0) {
                        ((C0491k) i10.a).U(i16, unsafe.getLong(obj, j));
                    }
                    break;
                case 4:
                    if ((i12 & i14) != 0) {
                        ((C0491k) i10.a).M(i16, unsafe.getInt(obj, j));
                    }
                    break;
                case 5:
                    if ((i12 & i14) != 0) {
                        ((C0491k) i10.a).K(i16, unsafe.getLong(obj, j));
                    }
                    break;
                case 6:
                    if ((i12 & i14) != 0) {
                        ((C0491k) i10.a).I(i16, unsafe.getInt(obj, j));
                    }
                    break;
                case 7:
                    if ((i12 & i14) != 0) {
                        ((C0491k) i10.a).F(i16, t0.f6515d.c(j, obj));
                    }
                    break;
                case 8:
                    if ((i12 & i14) != 0) {
                        O(i16, unsafe.getObject(obj, j), i10);
                    }
                    break;
                case 9:
                    if ((i12 & i14) != 0) {
                        ((C0491k) i10.a).O(i16, (AbstractC0478a) unsafe.getObject(obj, j), n(i15));
                    }
                    break;
                case 10:
                    if ((i12 & i14) != 0) {
                        i10.a(i16, (C0488h) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    if ((i12 & i14) != 0) {
                        ((C0491k) i10.a).S(i16, unsafe.getInt(obj, j));
                    }
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if ((i12 & i14) != 0) {
                        ((C0491k) i10.a).M(i16, unsafe.getInt(obj, j));
                    }
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if ((i12 & i14) != 0) {
                        ((C0491k) i10.a).I(i16, unsafe.getInt(obj, j));
                    }
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if ((i12 & i14) != 0) {
                        ((C0491k) i10.a).K(i16, unsafe.getLong(obj, j));
                    }
                    break;
                case 15:
                    if ((i12 & i14) != 0) {
                        int i19 = unsafe.getInt(obj, j);
                        ((C0491k) i10.a).S(i16, (i19 >> 31) ^ (i19 << 1));
                    }
                    break;
                case 16:
                    if ((i12 & i14) != 0) {
                        long j10 = unsafe.getLong(obj, j);
                        ((C0491k) i10.a).U(i16, (j10 << 1) ^ (j10 >> 63));
                    }
                    break;
                case 17:
                    if ((i12 & i14) != 0) {
                        i10.b(i16, unsafe.getObject(obj, j), n(i15));
                    }
                    break;
                case 18:
                    AbstractC0483c0.B(iArr[i15], (List) unsafe.getObject(obj, j), i10, false);
                    break;
                case 19:
                    AbstractC0483c0.F(iArr[i15], (List) unsafe.getObject(obj, j), i10, false);
                    break;
                case 20:
                    AbstractC0483c0.I(iArr[i15], (List) unsafe.getObject(obj, j), i10, false);
                    break;
                case MobileAdsBridge.CODE_21 /* 21 */:
                    AbstractC0483c0.Q(iArr[i15], (List) unsafe.getObject(obj, j), i10, false);
                    break;
                case 22:
                    AbstractC0483c0.H(iArr[i15], (List) unsafe.getObject(obj, j), i10, false);
                    break;
                case 23:
                    AbstractC0483c0.E(iArr[i15], (List) unsafe.getObject(obj, j), i10, false);
                    break;
                case 24:
                    AbstractC0483c0.D(iArr[i15], (List) unsafe.getObject(obj, j), i10, false);
                    break;
                case 25:
                    AbstractC0483c0.z(iArr[i15], (List) unsafe.getObject(obj, j), i10, false);
                    break;
                case 26:
                    AbstractC0483c0.O(iArr[i15], (List) unsafe.getObject(obj, j), i10);
                    break;
                case 27:
                    AbstractC0483c0.J(iArr[i15], (List) unsafe.getObject(obj, j), i10, n(i15));
                    break;
                case 28:
                    AbstractC0483c0.A(iArr[i15], (List) unsafe.getObject(obj, j), i10);
                    break;
                case 29:
                    z6 = false;
                    AbstractC0483c0.P(iArr[i15], (List) unsafe.getObject(obj, j), i10, false);
                    break;
                case 30:
                    z6 = false;
                    AbstractC0483c0.C(iArr[i15], (List) unsafe.getObject(obj, j), i10, false);
                    break;
                case 31:
                    z6 = false;
                    AbstractC0483c0.K(iArr[i15], (List) unsafe.getObject(obj, j), i10, false);
                    break;
                case 32:
                    z6 = false;
                    AbstractC0483c0.L(iArr[i15], (List) unsafe.getObject(obj, j), i10, false);
                    break;
                case 33:
                    z6 = false;
                    AbstractC0483c0.M(iArr[i15], (List) unsafe.getObject(obj, j), i10, false);
                    break;
                case 34:
                    z6 = false;
                    AbstractC0483c0.N(iArr[i15], (List) unsafe.getObject(obj, j), i10, false);
                    break;
                case 35:
                    AbstractC0483c0.B(iArr[i15], (List) unsafe.getObject(obj, j), i10, true);
                    break;
                case 36:
                    AbstractC0483c0.F(iArr[i15], (List) unsafe.getObject(obj, j), i10, true);
                    break;
                case 37:
                    AbstractC0483c0.I(iArr[i15], (List) unsafe.getObject(obj, j), i10, true);
                    break;
                case 38:
                    AbstractC0483c0.Q(iArr[i15], (List) unsafe.getObject(obj, j), i10, true);
                    break;
                case 39:
                    AbstractC0483c0.H(iArr[i15], (List) unsafe.getObject(obj, j), i10, true);
                    break;
                case 40:
                    AbstractC0483c0.E(iArr[i15], (List) unsafe.getObject(obj, j), i10, true);
                    break;
                case 41:
                    AbstractC0483c0.D(iArr[i15], (List) unsafe.getObject(obj, j), i10, true);
                    break;
                case 42:
                    AbstractC0483c0.z(iArr[i15], (List) unsafe.getObject(obj, j), i10, true);
                    break;
                case 43:
                    AbstractC0483c0.P(iArr[i15], (List) unsafe.getObject(obj, j), i10, true);
                    break;
                case 44:
                    AbstractC0483c0.C(iArr[i15], (List) unsafe.getObject(obj, j), i10, true);
                    break;
                case 45:
                    AbstractC0483c0.K(iArr[i15], (List) unsafe.getObject(obj, j), i10, true);
                    break;
                case 46:
                    AbstractC0483c0.L(iArr[i15], (List) unsafe.getObject(obj, j), i10, true);
                    break;
                case 47:
                    AbstractC0483c0.M(iArr[i15], (List) unsafe.getObject(obj, j), i10, true);
                    break;
                case 48:
                    AbstractC0483c0.N(iArr[i15], (List) unsafe.getObject(obj, j), i10, true);
                    break;
                case 49:
                    AbstractC0483c0.G(iArr[i15], (List) unsafe.getObject(obj, j), i10, n(i15));
                    break;
                case 50:
                    N(i10, i16, unsafe.getObject(obj, j), i15);
                    break;
                case 51:
                    if (r(i16, i15, obj)) {
                        double dDoubleValue = ((Double) t0.f6515d.i(j, obj)).doubleValue();
                        C0491k c0491k3 = (C0491k) i10.a;
                        c0491k3.getClass();
                        c0491k3.K(i16, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (r(i16, i15, obj)) {
                        float fFloatValue = ((Float) t0.f6515d.i(j, obj)).floatValue();
                        C0491k c0491k4 = (C0491k) i10.a;
                        c0491k4.getClass();
                        c0491k4.I(i16, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (r(i16, i15, obj)) {
                        ((C0491k) i10.a).U(i16, B(j, obj));
                    }
                    break;
                case 54:
                    if (r(i16, i15, obj)) {
                        ((C0491k) i10.a).U(i16, B(j, obj));
                    }
                    break;
                case 55:
                    if (r(i16, i15, obj)) {
                        ((C0491k) i10.a).M(i16, A(j, obj));
                    }
                    break;
                case 56:
                    if (r(i16, i15, obj)) {
                        ((C0491k) i10.a).K(i16, B(j, obj));
                    }
                    break;
                case 57:
                    if (r(i16, i15, obj)) {
                        ((C0491k) i10.a).I(i16, A(j, obj));
                    }
                    break;
                case 58:
                    if (r(i16, i15, obj)) {
                        ((C0491k) i10.a).F(i16, ((Boolean) t0.f6515d.i(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (r(i16, i15, obj)) {
                        O(i16, unsafe.getObject(obj, j), i10);
                    }
                    break;
                case 60:
                    if (r(i16, i15, obj)) {
                        ((C0491k) i10.a).O(i16, (AbstractC0478a) unsafe.getObject(obj, j), n(i15));
                    }
                    break;
                case 61:
                    if (r(i16, i15, obj)) {
                        i10.a(i16, (C0488h) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (r(i16, i15, obj)) {
                        ((C0491k) i10.a).S(i16, A(j, obj));
                    }
                    break;
                case 63:
                    if (r(i16, i15, obj)) {
                        ((C0491k) i10.a).M(i16, A(j, obj));
                    }
                    break;
                case 64:
                    if (r(i16, i15, obj)) {
                        ((C0491k) i10.a).I(i16, A(j, obj));
                    }
                    break;
                case 65:
                    if (r(i16, i15, obj)) {
                        ((C0491k) i10.a).K(i16, B(j, obj));
                    }
                    break;
                case 66:
                    if (r(i16, i15, obj)) {
                        int iA = A(j, obj);
                        ((C0491k) i10.a).S(i16, (iA >> 31) ^ (iA << 1));
                    }
                    break;
                case 67:
                    if (r(i16, i15, obj)) {
                        long jB = B(j, obj);
                        ((C0491k) i10.a).U(i16, (jB << 1) ^ (jB >> 63));
                    }
                    break;
                case 68:
                    if (r(i16, i15, obj)) {
                        i10.b(i16, unsafe.getObject(obj, j), n(i15));
                    }
                    break;
                default:
                    break;
            }
        }
        ((l0) this.f6434m).getClass();
        ((AbstractC0502w) obj).unknownFields.d(i10);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0137  */
    /* JADX WARN: Code duplicated, block: B:48:0x0145  */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:50:0x0168  */
    /* JADX WARN: Code duplicated, block: B:51:0x016f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0178  */
    /* JADX WARN: Code duplicated, block: B:54:0x0184  */
    /* JADX WARN: Code duplicated, block: B:55:0x0190  */
    /* JADX WARN: Code duplicated, block: B:57:0x0194  */
    /* JADX WARN: Code duplicated, block: B:58:0x019c  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01de  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:73:0x0206  */
    /* JADX WARN: Code duplicated, block: B:78:0x013f A[SYNTHETIC] */
    public final void N(I i10, int i11, Object obj, int i12) throws CodedOutputStream$OutOfSpaceException {
        int iA;
        int iA2;
        int iZ;
        int i13;
        int iY;
        z0 z0Var;
        int iA3;
        int iZ2;
        if (obj != null) {
            Object objM = m(i12);
            this.f6435n.getClass();
            J j = ((K) objM).a;
            C0491k c0491k = (C0491k) i10.a;
            c0491k.getClass();
            for (Map.Entry entry : ((L) obj).entrySet()) {
                c0491k.R(i11, 2);
                Object key = entry.getKey();
                Object value = entry.getValue();
                int i14 = C0497q.f6504c;
                int iY2 = C0491k.y(1);
                y0 y0Var = B0.f6397v;
                x0 x0Var = j.a;
                if (x0Var == y0Var) {
                    iY2 *= 2;
                }
                int iA4 = 8;
                switch (x0Var.ordinal()) {
                    case 0:
                        ((Double) key).getClass();
                        iA = 8;
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key2 = entry.getKey();
                                Object value2 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key2);
                                C0497q.b(c0491k, z0Var, 2, value2);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key3 = entry.getKey();
                                Object value3 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key3);
                                C0497q.b(c0491k, z0Var, 2, value3);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key4 = entry.getKey();
                                Object value4 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key4);
                                C0497q.b(c0491k, z0Var, 2, value4);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key5 = entry.getKey();
                                Object value5 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key5);
                                C0497q.b(c0491k, z0Var, 2, value5);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key6 = entry.getKey();
                                Object value6 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key6);
                                C0497q.b(c0491k, z0Var, 2, value6);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key7 = entry.getKey();
                                Object value7 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key7);
                                C0497q.b(c0491k, z0Var, 2, value7);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key8 = entry.getKey();
                                Object value8 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key8);
                                C0497q.b(c0491k, z0Var, 2, value8);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key9 = entry.getKey();
                                Object value9 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key9);
                                C0497q.b(c0491k, z0Var, 2, value9);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key10 = entry.getKey();
                                Object value10 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key10);
                                C0497q.b(c0491k, z0Var, 2, value10);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key11 = entry.getKey();
                                Object value11 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11);
                                C0497q.b(c0491k, z0Var, 2, value11);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key12 = entry.getKey();
                                Object value12 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key12);
                                C0497q.b(c0491k, z0Var, 2, value12);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key13 = entry.getKey();
                                Object value13 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key13);
                                C0497q.b(c0491k, z0Var, 2, value13);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key14 = entry.getKey();
                                Object value14 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key14);
                                C0497q.b(c0491k, z0Var, 2, value14);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key15 = entry.getKey();
                                Object value15 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key15);
                                C0497q.b(c0491k, z0Var, 2, value15);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key16 = entry.getKey();
                                Object value16 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key16);
                                C0497q.b(c0491k, z0Var, 2, value16);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key17 = entry.getKey();
                                Object value17 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key17);
                                C0497q.b(c0491k, z0Var, 2, value17);
                                break;
                            case 16:
                                int iIntValue = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue >> 31) ^ (iIntValue << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key18 = entry.getKey();
                                Object value18 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key18);
                                C0497q.b(c0491k, z0Var, 2, value18);
                                break;
                            case 17:
                                long jLongValue = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue << 1) ^ (jLongValue >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key19 = entry.getKey();
                                Object value19 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key19);
                                C0497q.b(c0491k, z0Var, 2, value19);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 1:
                        ((Float) key).getClass();
                        iA = 4;
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key110 = entry.getKey();
                                Object value110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key110);
                                C0497q.b(c0491k, z0Var, 2, value110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111 = entry.getKey();
                                Object value111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111);
                                C0497q.b(c0491k, z0Var, 2, value111);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key112 = entry.getKey();
                                Object value112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key112);
                                C0497q.b(c0491k, z0Var, 2, value112);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key113 = entry.getKey();
                                Object value113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key113);
                                C0497q.b(c0491k, z0Var, 2, value113);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key114 = entry.getKey();
                                Object value114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key114);
                                C0497q.b(c0491k, z0Var, 2, value114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key115 = entry.getKey();
                                Object value115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key115);
                                C0497q.b(c0491k, z0Var, 2, value115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key116 = entry.getKey();
                                Object value116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key116);
                                C0497q.b(c0491k, z0Var, 2, value116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key117 = entry.getKey();
                                Object value117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key117);
                                C0497q.b(c0491k, z0Var, 2, value117);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key118 = entry.getKey();
                                Object value118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key118);
                                C0497q.b(c0491k, z0Var, 2, value118);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key119 = entry.getKey();
                                Object value119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key119);
                                C0497q.b(c0491k, z0Var, 2, value119);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key1110 = entry.getKey();
                                Object value1110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1110);
                                C0497q.b(c0491k, z0Var, 2, value1110);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key1111 = entry.getKey();
                                Object value1111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111);
                                C0497q.b(c0491k, z0Var, 2, value1111);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1112 = entry.getKey();
                                Object value1112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1112);
                                C0497q.b(c0491k, z0Var, 2, value1112);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1113 = entry.getKey();
                                Object value1113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1113);
                                C0497q.b(c0491k, z0Var, 2, value1113);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key1114 = entry.getKey();
                                Object value1114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1114);
                                C0497q.b(c0491k, z0Var, 2, value1114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key1115 = entry.getKey();
                                Object value1115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1115);
                                C0497q.b(c0491k, z0Var, 2, value1115);
                                break;
                            case 16:
                                int iIntValue2 = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key1116 = entry.getKey();
                                Object value1116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1116);
                                C0497q.b(c0491k, z0Var, 2, value1116);
                                break;
                            case 17:
                                long jLongValue2 = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue2 << 1) ^ (jLongValue2 >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key1117 = entry.getKey();
                                Object value1117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1117);
                                C0497q.b(c0491k, z0Var, 2, value1117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 2:
                        iA = C0491k.A(((Long) key).longValue());
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key1118 = entry.getKey();
                                Object value1118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1118);
                                C0497q.b(c0491k, z0Var, 2, value1118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key1119 = entry.getKey();
                                Object value1119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1119);
                                C0497q.b(c0491k, z0Var, 2, value1119);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11110 = entry.getKey();
                                Object value11110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11110);
                                C0497q.b(c0491k, z0Var, 2, value11110);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111 = entry.getKey();
                                Object value11111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111);
                                C0497q.b(c0491k, z0Var, 2, value11111);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11112 = entry.getKey();
                                Object value11112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11112);
                                C0497q.b(c0491k, z0Var, 2, value11112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key11113 = entry.getKey();
                                Object value11113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11113);
                                C0497q.b(c0491k, z0Var, 2, value11113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key11114 = entry.getKey();
                                Object value11114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11114);
                                C0497q.b(c0491k, z0Var, 2, value11114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key11115 = entry.getKey();
                                Object value11115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11115);
                                C0497q.b(c0491k, z0Var, 2, value11115);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key11116 = entry.getKey();
                                Object value11116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11116);
                                C0497q.b(c0491k, z0Var, 2, value11116);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key11117 = entry.getKey();
                                Object value11117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11117);
                                C0497q.b(c0491k, z0Var, 2, value11117);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key11118 = entry.getKey();
                                Object value11118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11118);
                                C0497q.b(c0491k, z0Var, 2, value11118);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key11119 = entry.getKey();
                                Object value11119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11119);
                                C0497q.b(c0491k, z0Var, 2, value11119);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111110 = entry.getKey();
                                Object value111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111110);
                                C0497q.b(c0491k, z0Var, 2, value111110);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111 = entry.getKey();
                                Object value111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111);
                                C0497q.b(c0491k, z0Var, 2, value111111);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111112 = entry.getKey();
                                Object value111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111112);
                                C0497q.b(c0491k, z0Var, 2, value111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key111113 = entry.getKey();
                                Object value111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111113);
                                C0497q.b(c0491k, z0Var, 2, value111113);
                                break;
                            case 16:
                                int iIntValue3 = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key111114 = entry.getKey();
                                Object value111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111114);
                                C0497q.b(c0491k, z0Var, 2, value111114);
                                break;
                            case 17:
                                long jLongValue3 = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue3 << 1) ^ (jLongValue3 >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key111115 = entry.getKey();
                                Object value111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111115);
                                C0497q.b(c0491k, z0Var, 2, value111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 3:
                        iA = C0491k.A(((Long) key).longValue());
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key111116 = entry.getKey();
                                Object value111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111116);
                                C0497q.b(c0491k, z0Var, 2, value111116);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111117 = entry.getKey();
                                Object value111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111117);
                                C0497q.b(c0491k, z0Var, 2, value111117);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111118 = entry.getKey();
                                Object value111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111118);
                                C0497q.b(c0491k, z0Var, 2, value111118);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111119 = entry.getKey();
                                Object value111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111119);
                                C0497q.b(c0491k, z0Var, 2, value111119);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111110 = entry.getKey();
                                Object value1111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111110);
                                C0497q.b(c0491k, z0Var, 2, value1111110);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111 = entry.getKey();
                                Object value1111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111);
                                C0497q.b(c0491k, z0Var, 2, value1111111);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111112 = entry.getKey();
                                Object value1111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111112);
                                C0497q.b(c0491k, z0Var, 2, value1111112);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111113 = entry.getKey();
                                Object value1111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111113);
                                C0497q.b(c0491k, z0Var, 2, value1111113);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key1111114 = entry.getKey();
                                Object value1111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111114);
                                C0497q.b(c0491k, z0Var, 2, value1111114);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111115 = entry.getKey();
                                Object value1111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111115);
                                C0497q.b(c0491k, z0Var, 2, value1111115);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111116 = entry.getKey();
                                Object value1111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111116);
                                C0497q.b(c0491k, z0Var, 2, value1111116);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key1111117 = entry.getKey();
                                Object value1111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111117);
                                C0497q.b(c0491k, z0Var, 2, value1111117);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111118 = entry.getKey();
                                Object value1111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111118);
                                C0497q.b(c0491k, z0Var, 2, value1111118);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111119 = entry.getKey();
                                Object value1111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111119);
                                C0497q.b(c0491k, z0Var, 2, value1111119);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111110 = entry.getKey();
                                Object value11111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111110);
                                C0497q.b(c0491k, z0Var, 2, value11111110);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111 = entry.getKey();
                                Object value11111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111);
                                C0497q.b(c0491k, z0Var, 2, value11111111);
                                break;
                            case 16:
                                int iIntValue4 = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key11111112 = entry.getKey();
                                Object value11111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111112);
                                C0497q.b(c0491k, z0Var, 2, value11111112);
                                break;
                            case 17:
                                long jLongValue4 = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue4 << 1) ^ (jLongValue4 >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key11111113 = entry.getKey();
                                Object value11111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111113);
                                C0497q.b(c0491k, z0Var, 2, value11111113);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 4:
                        iA = C0491k.w(((Integer) key).intValue());
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111114 = entry.getKey();
                                Object value11111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111114);
                                C0497q.b(c0491k, z0Var, 2, value11111114);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111115 = entry.getKey();
                                Object value11111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111115);
                                C0497q.b(c0491k, z0Var, 2, value11111115);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111116 = entry.getKey();
                                Object value11111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111116);
                                C0497q.b(c0491k, z0Var, 2, value11111116);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111117 = entry.getKey();
                                Object value11111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111117);
                                C0497q.b(c0491k, z0Var, 2, value11111117);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111118 = entry.getKey();
                                Object value11111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111118);
                                C0497q.b(c0491k, z0Var, 2, value11111118);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111119 = entry.getKey();
                                Object value11111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111119);
                                C0497q.b(c0491k, z0Var, 2, value11111119);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111110 = entry.getKey();
                                Object value111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111110);
                                C0497q.b(c0491k, z0Var, 2, value111111110);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111 = entry.getKey();
                                Object value111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111);
                                C0497q.b(c0491k, z0Var, 2, value111111111);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key111111112 = entry.getKey();
                                Object value111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111112);
                                C0497q.b(c0491k, z0Var, 2, value111111112);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111113 = entry.getKey();
                                Object value111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111113);
                                C0497q.b(c0491k, z0Var, 2, value111111113);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111114 = entry.getKey();
                                Object value111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111114);
                                C0497q.b(c0491k, z0Var, 2, value111111114);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key111111115 = entry.getKey();
                                Object value111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111115);
                                C0497q.b(c0491k, z0Var, 2, value111111115);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111116 = entry.getKey();
                                Object value111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111116);
                                C0497q.b(c0491k, z0Var, 2, value111111116);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111117 = entry.getKey();
                                Object value111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111117);
                                C0497q.b(c0491k, z0Var, 2, value111111117);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111118 = entry.getKey();
                                Object value111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111118);
                                C0497q.b(c0491k, z0Var, 2, value111111118);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111119 = entry.getKey();
                                Object value111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111119);
                                C0497q.b(c0491k, z0Var, 2, value111111119);
                                break;
                            case 16:
                                int iIntValue5 = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111110 = entry.getKey();
                                Object value1111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111110);
                                C0497q.b(c0491k, z0Var, 2, value1111111110);
                                break;
                            case 17:
                                long jLongValue5 = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue5 << 1) ^ (jLongValue5 >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111 = entry.getKey();
                                Object value1111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111);
                                C0497q.b(c0491k, z0Var, 2, value1111111111);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 5:
                        ((Long) key).getClass();
                        iA = 8;
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111112 = entry.getKey();
                                Object value1111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111112);
                                C0497q.b(c0491k, z0Var, 2, value1111111112);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111113 = entry.getKey();
                                Object value1111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111113);
                                C0497q.b(c0491k, z0Var, 2, value1111111113);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111114 = entry.getKey();
                                Object value1111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111114);
                                C0497q.b(c0491k, z0Var, 2, value1111111114);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111115 = entry.getKey();
                                Object value1111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111115);
                                C0497q.b(c0491k, z0Var, 2, value1111111115);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111116 = entry.getKey();
                                Object value1111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111116);
                                C0497q.b(c0491k, z0Var, 2, value1111111116);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111117 = entry.getKey();
                                Object value1111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111117);
                                C0497q.b(c0491k, z0Var, 2, value1111111117);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111118 = entry.getKey();
                                Object value1111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111118);
                                C0497q.b(c0491k, z0Var, 2, value1111111118);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111119 = entry.getKey();
                                Object value1111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111119);
                                C0497q.b(c0491k, z0Var, 2, value1111111119);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111110 = entry.getKey();
                                Object value11111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111110);
                                C0497q.b(c0491k, z0Var, 2, value11111111110);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111 = entry.getKey();
                                Object value11111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111);
                                C0497q.b(c0491k, z0Var, 2, value11111111111);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111112 = entry.getKey();
                                Object value11111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111112);
                                C0497q.b(c0491k, z0Var, 2, value11111111112);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111113 = entry.getKey();
                                Object value11111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111113);
                                C0497q.b(c0491k, z0Var, 2, value11111111113);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111114 = entry.getKey();
                                Object value11111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111114);
                                C0497q.b(c0491k, z0Var, 2, value11111111114);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111115 = entry.getKey();
                                Object value11111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111115);
                                C0497q.b(c0491k, z0Var, 2, value11111111115);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111116 = entry.getKey();
                                Object value11111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111116);
                                C0497q.b(c0491k, z0Var, 2, value11111111116);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111117 = entry.getKey();
                                Object value11111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111117);
                                C0497q.b(c0491k, z0Var, 2, value11111111117);
                                break;
                            case 16:
                                int iIntValue6 = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111118 = entry.getKey();
                                Object value11111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111118);
                                C0497q.b(c0491k, z0Var, 2, value11111111118);
                                break;
                            case 17:
                                long jLongValue6 = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue6 << 1) ^ (jLongValue6 >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111119 = entry.getKey();
                                Object value11111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111119);
                                C0497q.b(c0491k, z0Var, 2, value11111111119);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 6:
                        ((Integer) key).getClass();
                        iA = 4;
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111110 = entry.getKey();
                                Object value111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111110);
                                C0497q.b(c0491k, z0Var, 2, value111111111110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111 = entry.getKey();
                                Object value111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111);
                                C0497q.b(c0491k, z0Var, 2, value111111111111);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111112 = entry.getKey();
                                Object value111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111112);
                                C0497q.b(c0491k, z0Var, 2, value111111111112);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111113 = entry.getKey();
                                Object value111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111113);
                                C0497q.b(c0491k, z0Var, 2, value111111111113);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111114 = entry.getKey();
                                Object value111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111114);
                                C0497q.b(c0491k, z0Var, 2, value111111111114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111115 = entry.getKey();
                                Object value111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111115);
                                C0497q.b(c0491k, z0Var, 2, value111111111115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111116 = entry.getKey();
                                Object value111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111116);
                                C0497q.b(c0491k, z0Var, 2, value111111111116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111117 = entry.getKey();
                                Object value111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111117);
                                C0497q.b(c0491k, z0Var, 2, value111111111117);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111118 = entry.getKey();
                                Object value111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111118);
                                C0497q.b(c0491k, z0Var, 2, value111111111118);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111119 = entry.getKey();
                                Object value111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111119);
                                C0497q.b(c0491k, z0Var, 2, value111111111119);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111110 = entry.getKey();
                                Object value1111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111110);
                                C0497q.b(c0491k, z0Var, 2, value1111111111110);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111 = entry.getKey();
                                Object value1111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111112 = entry.getKey();
                                Object value1111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111112);
                                C0497q.b(c0491k, z0Var, 2, value1111111111112);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111113 = entry.getKey();
                                Object value1111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111113);
                                C0497q.b(c0491k, z0Var, 2, value1111111111113);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111114 = entry.getKey();
                                Object value1111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111114);
                                C0497q.b(c0491k, z0Var, 2, value1111111111114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111115 = entry.getKey();
                                Object value1111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111115);
                                C0497q.b(c0491k, z0Var, 2, value1111111111115);
                                break;
                            case 16:
                                int iIntValue7 = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111116 = entry.getKey();
                                Object value1111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111116);
                                C0497q.b(c0491k, z0Var, 2, value1111111111116);
                                break;
                            case 17:
                                long jLongValue7 = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue7 << 1) ^ (jLongValue7 >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111117 = entry.getKey();
                                Object value1111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111117);
                                C0497q.b(c0491k, z0Var, 2, value1111111111117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 7:
                        ((Boolean) key).getClass();
                        iA = 1;
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111118 = entry.getKey();
                                Object value1111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111118);
                                C0497q.b(c0491k, z0Var, 2, value1111111111118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111119 = entry.getKey();
                                Object value1111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111119);
                                C0497q.b(c0491k, z0Var, 2, value1111111111119);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111110 = entry.getKey();
                                Object value11111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111110);
                                C0497q.b(c0491k, z0Var, 2, value11111111111110);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111 = entry.getKey();
                                Object value11111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111112 = entry.getKey();
                                Object value11111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111112);
                                C0497q.b(c0491k, z0Var, 2, value11111111111112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111113 = entry.getKey();
                                Object value11111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111113);
                                C0497q.b(c0491k, z0Var, 2, value11111111111113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111114 = entry.getKey();
                                Object value11111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111114);
                                C0497q.b(c0491k, z0Var, 2, value11111111111114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111115 = entry.getKey();
                                Object value11111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111115);
                                C0497q.b(c0491k, z0Var, 2, value11111111111115);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111116 = entry.getKey();
                                Object value11111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111116);
                                C0497q.b(c0491k, z0Var, 2, value11111111111116);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111117 = entry.getKey();
                                Object value11111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111117);
                                C0497q.b(c0491k, z0Var, 2, value11111111111117);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111118 = entry.getKey();
                                Object value11111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111118);
                                C0497q.b(c0491k, z0Var, 2, value11111111111118);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111119 = entry.getKey();
                                Object value11111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111119);
                                C0497q.b(c0491k, z0Var, 2, value11111111111119);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111110 = entry.getKey();
                                Object value111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value111111111111110);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111 = entry.getKey();
                                Object value111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111112 = entry.getKey();
                                Object value111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value111111111111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111113 = entry.getKey();
                                Object value111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value111111111111113);
                                break;
                            case 16:
                                int iIntValue8 = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111114 = entry.getKey();
                                Object value111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value111111111111114);
                                break;
                            case 17:
                                long jLongValue8 = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue8 << 1) ^ (jLongValue8 >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111115 = entry.getKey();
                                Object value111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value111111111111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 8:
                        iA = key instanceof C0488h ? C0491k.s((C0488h) key) : C0491k.x((String) key);
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111116 = entry.getKey();
                                Object value111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value111111111111116);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111117 = entry.getKey();
                                Object value111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value111111111111117);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111118 = entry.getKey();
                                Object value111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value111111111111118);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111119 = entry.getKey();
                                Object value111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value111111111111119);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111110 = entry.getKey();
                                Object value1111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111110);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111 = entry.getKey();
                                Object value1111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111112 = entry.getKey();
                                Object value1111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111112);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111113 = entry.getKey();
                                Object value1111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111113);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111114 = entry.getKey();
                                Object value1111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111114);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111115 = entry.getKey();
                                Object value1111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111115);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111116 = entry.getKey();
                                Object value1111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111116);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111117 = entry.getKey();
                                Object value1111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111117);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111118 = entry.getKey();
                                Object value1111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111118);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111119 = entry.getKey();
                                Object value1111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111119);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111110 = entry.getKey();
                                Object value11111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111110);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111 = entry.getKey();
                                Object value11111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111);
                                break;
                            case 16:
                                int iIntValue9 = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111112 = entry.getKey();
                                Object value11111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111112);
                                break;
                            case 17:
                                long jLongValue9 = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue9 << 1) ^ (jLongValue9 >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111113 = entry.getKey();
                                Object value11111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111113);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 9:
                        iA = ((AbstractC0478a) key).a();
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111114 = entry.getKey();
                                Object value11111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111114);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111115 = entry.getKey();
                                Object value11111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111115);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111116 = entry.getKey();
                                Object value11111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111116);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111117 = entry.getKey();
                                Object value11111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111117);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111118 = entry.getKey();
                                Object value11111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111118);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111119 = entry.getKey();
                                Object value11111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111119);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111110 = entry.getKey();
                                Object value111111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111110);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111 = entry.getKey();
                                Object value111111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111112 = entry.getKey();
                                Object value111111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111112);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111113 = entry.getKey();
                                Object value111111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111113);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111114 = entry.getKey();
                                Object value111111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111114);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111115 = entry.getKey();
                                Object value111111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111115);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111116 = entry.getKey();
                                Object value111111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111116);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111117 = entry.getKey();
                                Object value111111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111117);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111118 = entry.getKey();
                                Object value111111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111118);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111119 = entry.getKey();
                                Object value111111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111119);
                                break;
                            case 16:
                                int iIntValue10 = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111110 = entry.getKey();
                                Object value1111111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111110);
                                break;
                            case 17:
                                long jLongValue10 = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue10 << 1) ^ (jLongValue10 >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111 = entry.getKey();
                                Object value1111111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 10:
                        iA2 = ((AbstractC0478a) key).a();
                        iZ = C0491k.z(iA2);
                        iA = iA2 + iZ;
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111112 = entry.getKey();
                                Object value1111111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111112);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111113 = entry.getKey();
                                Object value1111111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111113);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111114 = entry.getKey();
                                Object value1111111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111114);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111115 = entry.getKey();
                                Object value1111111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111115);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111116 = entry.getKey();
                                Object value1111111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111116);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111117 = entry.getKey();
                                Object value1111111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111117);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111118 = entry.getKey();
                                Object value1111111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111118);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111119 = entry.getKey();
                                Object value1111111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111119);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111110 = entry.getKey();
                                Object value11111111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111110);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111 = entry.getKey();
                                Object value11111111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111112 = entry.getKey();
                                Object value11111111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111112);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111113 = entry.getKey();
                                Object value11111111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111113);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111114 = entry.getKey();
                                Object value11111111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111114);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111115 = entry.getKey();
                                Object value11111111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111115);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111116 = entry.getKey();
                                Object value11111111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111116);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111117 = entry.getKey();
                                Object value11111111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111117);
                                break;
                            case 16:
                                int iIntValue11 = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111118 = entry.getKey();
                                Object value11111111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111118);
                                break;
                            case 17:
                                long jLongValue11 = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue11 << 1) ^ (jLongValue11 >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111119 = entry.getKey();
                                Object value11111111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111119);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 11:
                        if (key instanceof C0488h) {
                            iA = C0491k.s((C0488h) key);
                        } else {
                            iA2 = ((byte[]) key).length;
                            iZ = C0491k.z(iA2);
                            iA = iA2 + iZ;
                        }
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111110 = entry.getKey();
                                Object value111111111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111 = entry.getKey();
                                Object value111111111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111112 = entry.getKey();
                                Object value111111111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111112);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111113 = entry.getKey();
                                Object value111111111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111113);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111114 = entry.getKey();
                                Object value111111111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111115 = entry.getKey();
                                Object value111111111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111116 = entry.getKey();
                                Object value111111111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111117 = entry.getKey();
                                Object value111111111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111117);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111118 = entry.getKey();
                                Object value111111111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111118);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111119 = entry.getKey();
                                Object value111111111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111119);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111110 = entry.getKey();
                                Object value1111111111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111110);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111112 = entry.getKey();
                                Object value1111111111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111112);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111113 = entry.getKey();
                                Object value1111111111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111113);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111114 = entry.getKey();
                                Object value1111111111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111115 = entry.getKey();
                                Object value1111111111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111115);
                                break;
                            case 16:
                                int iIntValue12 = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111116 = entry.getKey();
                                Object value1111111111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111116);
                                break;
                            case 17:
                                long jLongValue12 = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue12 << 1) ^ (jLongValue12 >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111117 = entry.getKey();
                                Object value1111111111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        iA = C0491k.z(((Integer) key).intValue());
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111118 = entry.getKey();
                                Object value1111111111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111119 = entry.getKey();
                                Object value1111111111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111119);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111110 = entry.getKey();
                                Object value11111111111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111110);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111112 = entry.getKey();
                                Object value11111111111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111113 = entry.getKey();
                                Object value11111111111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111114 = entry.getKey();
                                Object value11111111111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111115 = entry.getKey();
                                Object value11111111111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111115);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111116 = entry.getKey();
                                Object value11111111111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111116);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111117 = entry.getKey();
                                Object value11111111111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111117);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111118 = entry.getKey();
                                Object value11111111111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111118);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111119 = entry.getKey();
                                Object value11111111111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111119);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111110);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111113);
                                break;
                            case 16:
                                int iIntValue13 = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111114);
                                break;
                            case 17:
                                long jLongValue13 = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue13 << 1) ^ (jLongValue13 >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        iA = C0491k.w(((Integer) key).intValue());
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111116);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111117);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111118);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111119);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111110);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111112);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111113);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111114);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111115);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111116);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111117);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111118);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111119);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111110);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111);
                                break;
                            case 16:
                                int iIntValue14 = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111112);
                                break;
                            case 17:
                                long jLongValue14 = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue14 << 1) ^ (jLongValue14 >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111113);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        ((Integer) key).getClass();
                        iA = 4;
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111114);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111115);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111116);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111117);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111118);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111119);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111110);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111111);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111112);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111113);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111114);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111115);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111116);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111117);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111118);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111119);
                                break;
                            case 16:
                                int iIntValue15 = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111110);
                                break;
                            case 17:
                                long jLongValue15 = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue15 << 1) ^ (jLongValue15 >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111111);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 15:
                        ((Long) key).getClass();
                        iA = 8;
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111112);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111113);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111114);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111115);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111116);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111117);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111118);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111119);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111110);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111111);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111112);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111113);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111114);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111115);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111116);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111117);
                                break;
                            case 16:
                                int iIntValue16 = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111118);
                                break;
                            case 17:
                                long jLongValue16 = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue16 << 1) ^ (jLongValue16 >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111119);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 16:
                        int iIntValue17 = ((Integer) key).intValue();
                        iA = C0491k.z((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111111110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111111111);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111111112);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111111113);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111111114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111111115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111111116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111111117);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111111118);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111111119);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111111110);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111111111);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111111112);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111111113);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111111114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111111115);
                                break;
                            case 16:
                                int iIntValue18 = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111111116);
                                break;
                            case 17:
                                long jLongValue17 = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue17 << 1) ^ (jLongValue17 >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111111117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 17:
                        long jLongValue18 = ((Long) key).longValue();
                        iA = C0491k.A((jLongValue18 << 1) ^ (jLongValue18 >> 63));
                        i13 = iA + iY2;
                        iY = C0491k.y(2);
                        z0Var = j.f6416b;
                        if (z0Var == y0Var) {
                            iY *= 2;
                        }
                        switch (z0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111111118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key1111111111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key1111111111111111111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value1111111111111111111111111111119);
                                break;
                            case 2:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111111110);
                                break;
                            case 3:
                                iA4 = C0491k.A(((Long) value).longValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111111111);
                                break;
                            case 4:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111111112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111111113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111111114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA4 = 1;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111111115);
                                break;
                            case 8:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA4 = C0491k.x((String) value);
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111111111116 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111111116);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111111116);
                                break;
                            case 9:
                                iA4 = ((AbstractC0478a) value).a();
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111111111117 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111111117);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111111117);
                                break;
                            case 10:
                                iA3 = ((AbstractC0478a) value).a();
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111111111118 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111111118);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111111118);
                                break;
                            case 11:
                                if (value instanceof C0488h) {
                                    iA4 = C0491k.s((C0488h) value);
                                } else {
                                    iA3 = ((byte[]) value).length;
                                    iZ2 = C0491k.z(iA3);
                                    iA4 = iZ2 + iA3;
                                }
                                c0491k.T(iA4 + iY + i13);
                                Object key11111111111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111111111119 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key11111111111111111111111111111119);
                                C0497q.b(c0491k, z0Var, 2, value11111111111111111111111111111119);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                iA4 = C0491k.z(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111111111110 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111111111110);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111111111110);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                iA4 = C0491k.w(((Integer) value).intValue());
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111111111 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111111111111);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111111111111);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                ((Integer) value).getClass();
                                iA4 = 4;
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111111111112 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111111111112);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111111111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111111111113 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111111111113);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111111111113);
                                break;
                            case 16:
                                int iIntValue19 = ((Integer) value).intValue();
                                iA4 = C0491k.z((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111111111114 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111111111114);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111111111114);
                                break;
                            case 17:
                                long jLongValue19 = ((Long) value).longValue();
                                iA4 = C0491k.A((jLongValue19 << 1) ^ (jLongValue19 >> 63));
                                c0491k.T(iA4 + iY + i13);
                                Object key111111111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111111111115 = entry.getValue();
                                C0497q.b(c0491k, x0Var, 1, key111111111111111111111111111111115);
                                C0497q.b(c0491k, z0Var, 2, value111111111111111111111111111111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final void a(Object obj, InterfaceC0479a0 interfaceC0479a0, C0494n c0494n) throws Throwable {
        c0494n.getClass();
        t(this.f6434m, obj, interfaceC0479a0, c0494n);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final void b(Object obj, I i10) throws CodedOutputStream$OutOfSpaceException {
        i10.getClass();
        if (!this.f6429g) {
            M(obj, i10);
            return;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int iL = L(i11);
            int i12 = iArr[i11];
            int iK = K(iL);
            C0491k c0491k = (C0491k) i10.a;
            switch (iK) {
                case 0:
                    if (q(i11, obj)) {
                        double dE = t0.f6515d.e(iL & 1048575, obj);
                        c0491k.getClass();
                        c0491k.K(i12, Double.doubleToRawLongBits(dE));
                    }
                    break;
                case 1:
                    if (q(i11, obj)) {
                        float f10 = t0.f6515d.f(iL & 1048575, obj);
                        c0491k.getClass();
                        c0491k.I(i12, Float.floatToRawIntBits(f10));
                    }
                    break;
                case 2:
                    if (q(i11, obj)) {
                        c0491k.U(i12, t0.f6515d.h(iL & 1048575, obj));
                    }
                    break;
                case 3:
                    if (q(i11, obj)) {
                        c0491k.U(i12, t0.f6515d.h(iL & 1048575, obj));
                    }
                    break;
                case 4:
                    if (q(i11, obj)) {
                        c0491k.M(i12, t0.f6515d.g(iL & 1048575, obj));
                    }
                    break;
                case 5:
                    if (q(i11, obj)) {
                        c0491k.K(i12, t0.f6515d.h(iL & 1048575, obj));
                    }
                    break;
                case 6:
                    if (q(i11, obj)) {
                        c0491k.I(i12, t0.f6515d.g(iL & 1048575, obj));
                    }
                    break;
                case 7:
                    if (q(i11, obj)) {
                        c0491k.F(i12, t0.f6515d.c(iL & 1048575, obj));
                    }
                    break;
                case 8:
                    if (q(i11, obj)) {
                        O(i12, t0.f6515d.i(iL & 1048575, obj), i10);
                    }
                    break;
                case 9:
                    if (q(i11, obj)) {
                        c0491k.O(i12, (AbstractC0478a) t0.f6515d.i(iL & 1048575, obj), n(i11));
                    }
                    break;
                case 10:
                    if (q(i11, obj)) {
                        i10.a(i12, (C0488h) t0.f6515d.i(iL & 1048575, obj));
                    }
                    break;
                case 11:
                    if (q(i11, obj)) {
                        c0491k.S(i12, t0.f6515d.g(iL & 1048575, obj));
                    }
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if (q(i11, obj)) {
                        c0491k.M(i12, t0.f6515d.g(iL & 1048575, obj));
                    }
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if (q(i11, obj)) {
                        c0491k.I(i12, t0.f6515d.g(iL & 1048575, obj));
                    }
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (q(i11, obj)) {
                        c0491k.K(i12, t0.f6515d.h(iL & 1048575, obj));
                    }
                    break;
                case 15:
                    if (q(i11, obj)) {
                        int iG = t0.f6515d.g(iL & 1048575, obj);
                        c0491k.S(i12, (iG >> 31) ^ (iG << 1));
                    }
                    break;
                case 16:
                    if (q(i11, obj)) {
                        long jH = t0.f6515d.h(iL & 1048575, obj);
                        c0491k.U(i12, (jH >> 63) ^ (jH << 1));
                    }
                    break;
                case 17:
                    if (q(i11, obj)) {
                        i10.b(i12, t0.f6515d.i(iL & 1048575, obj), n(i11));
                    }
                    break;
                case 18:
                    AbstractC0483c0.B(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, false);
                    break;
                case 19:
                    AbstractC0483c0.F(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, false);
                    break;
                case 20:
                    AbstractC0483c0.I(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, false);
                    break;
                case MobileAdsBridge.CODE_21 /* 21 */:
                    AbstractC0483c0.Q(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, false);
                    break;
                case 22:
                    AbstractC0483c0.H(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, false);
                    break;
                case 23:
                    AbstractC0483c0.E(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, false);
                    break;
                case 24:
                    AbstractC0483c0.D(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, false);
                    break;
                case 25:
                    AbstractC0483c0.z(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, false);
                    break;
                case 26:
                    AbstractC0483c0.O(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10);
                    break;
                case 27:
                    AbstractC0483c0.J(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, n(i11));
                    break;
                case 28:
                    AbstractC0483c0.A(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10);
                    break;
                case 29:
                    AbstractC0483c0.P(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, false);
                    break;
                case 30:
                    AbstractC0483c0.C(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, false);
                    break;
                case 31:
                    AbstractC0483c0.K(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, false);
                    break;
                case 32:
                    AbstractC0483c0.L(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, false);
                    break;
                case 33:
                    AbstractC0483c0.M(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, false);
                    break;
                case 34:
                    AbstractC0483c0.N(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, false);
                    break;
                case 35:
                    AbstractC0483c0.B(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, true);
                    break;
                case 36:
                    AbstractC0483c0.F(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, true);
                    break;
                case 37:
                    AbstractC0483c0.I(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, true);
                    break;
                case 38:
                    AbstractC0483c0.Q(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, true);
                    break;
                case 39:
                    AbstractC0483c0.H(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, true);
                    break;
                case 40:
                    AbstractC0483c0.E(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, true);
                    break;
                case 41:
                    AbstractC0483c0.D(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, true);
                    break;
                case 42:
                    AbstractC0483c0.z(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, true);
                    break;
                case 43:
                    AbstractC0483c0.P(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, true);
                    break;
                case 44:
                    AbstractC0483c0.C(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, true);
                    break;
                case 45:
                    AbstractC0483c0.K(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, true);
                    break;
                case 46:
                    AbstractC0483c0.L(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, true);
                    break;
                case 47:
                    AbstractC0483c0.M(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, true);
                    break;
                case 48:
                    AbstractC0483c0.N(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, true);
                    break;
                case 49:
                    AbstractC0483c0.G(iArr[i11], (List) t0.f6515d.i(iL & 1048575, obj), i10, n(i11));
                    break;
                case 50:
                    N(i10, i12, t0.f6515d.i(iL & 1048575, obj), i11);
                    break;
                case 51:
                    if (r(i12, i11, obj)) {
                        double dDoubleValue = ((Double) t0.f6515d.i(iL & 1048575, obj)).doubleValue();
                        c0491k.getClass();
                        c0491k.K(i12, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (r(i12, i11, obj)) {
                        float fFloatValue = ((Float) t0.f6515d.i(iL & 1048575, obj)).floatValue();
                        c0491k.getClass();
                        c0491k.I(i12, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (r(i12, i11, obj)) {
                        c0491k.U(i12, B(iL & 1048575, obj));
                    }
                    break;
                case 54:
                    if (r(i12, i11, obj)) {
                        c0491k.U(i12, B(iL & 1048575, obj));
                    }
                    break;
                case 55:
                    if (r(i12, i11, obj)) {
                        c0491k.M(i12, A(iL & 1048575, obj));
                    }
                    break;
                case 56:
                    if (r(i12, i11, obj)) {
                        c0491k.K(i12, B(iL & 1048575, obj));
                    }
                    break;
                case 57:
                    if (r(i12, i11, obj)) {
                        c0491k.I(i12, A(iL & 1048575, obj));
                    }
                    break;
                case 58:
                    if (r(i12, i11, obj)) {
                        c0491k.F(i12, ((Boolean) t0.f6515d.i(iL & 1048575, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (r(i12, i11, obj)) {
                        O(i12, t0.f6515d.i(iL & 1048575, obj), i10);
                    }
                    break;
                case 60:
                    if (r(i12, i11, obj)) {
                        c0491k.O(i12, (AbstractC0478a) t0.f6515d.i(iL & 1048575, obj), n(i11));
                    }
                    break;
                case 61:
                    if (r(i12, i11, obj)) {
                        i10.a(i12, (C0488h) t0.f6515d.i(iL & 1048575, obj));
                    }
                    break;
                case 62:
                    if (r(i12, i11, obj)) {
                        c0491k.S(i12, A(iL & 1048575, obj));
                    }
                    break;
                case 63:
                    if (r(i12, i11, obj)) {
                        c0491k.M(i12, A(iL & 1048575, obj));
                    }
                    break;
                case 64:
                    if (r(i12, i11, obj)) {
                        c0491k.I(i12, A(iL & 1048575, obj));
                    }
                    break;
                case 65:
                    if (r(i12, i11, obj)) {
                        c0491k.K(i12, B(iL & 1048575, obj));
                    }
                    break;
                case 66:
                    if (r(i12, i11, obj)) {
                        int iA = A(iL & 1048575, obj);
                        c0491k.S(i12, (iA >> 31) ^ (iA << 1));
                    }
                    break;
                case 67:
                    if (r(i12, i11, obj)) {
                        long jB = B(iL & 1048575, obj);
                        c0491k.U(i12, (jB >> 63) ^ (jB << 1));
                    }
                    break;
                case 68:
                    if (r(i12, i11, obj)) {
                        i10.b(i12, t0.f6515d.i(iL & 1048575, obj), n(i11));
                    }
                    break;
            }
        }
        ((l0) this.f6434m).getClass();
        ((AbstractC0502w) obj).unknownFields.d(i10);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final int c(AbstractC0502w abstractC0502w) {
        int i10;
        int iB;
        int i11;
        int[] iArr = this.a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iL = L(i13);
            int i14 = iArr[i13];
            long j = 1048575 & iL;
            int i15 = 1237;
            int iHashCode = 37;
            switch (K(iL)) {
                case 0:
                    i10 = i12 * 53;
                    iB = AbstractC0505z.b(Double.doubleToLongBits(t0.f6515d.e(j, abstractC0502w)));
                    i12 = iB + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iB = Float.floatToIntBits(t0.f6515d.f(j, abstractC0502w));
                    i12 = iB + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iB = AbstractC0505z.b(t0.f6515d.h(j, abstractC0502w));
                    i12 = iB + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iB = AbstractC0505z.b(t0.f6515d.h(j, abstractC0502w));
                    i12 = iB + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iB = t0.f6515d.g(j, abstractC0502w);
                    i12 = iB + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iB = AbstractC0505z.b(t0.f6515d.h(j, abstractC0502w));
                    i12 = iB + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iB = t0.f6515d.g(j, abstractC0502w);
                    i12 = iB + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zC = t0.f6515d.c(j, abstractC0502w);
                    Charset charset = AbstractC0505z.a;
                    if (zC) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iB = ((String) t0.f6515d.i(j, abstractC0502w)).hashCode();
                    i12 = iB + i10;
                    break;
                case 9:
                    Object objI = t0.f6515d.i(j, abstractC0502w);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iB = t0.f6515d.i(j, abstractC0502w).hashCode();
                    i12 = iB + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iB = t0.f6515d.g(j, abstractC0502w);
                    i12 = iB + i10;
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    i10 = i12 * 53;
                    iB = t0.f6515d.g(j, abstractC0502w);
                    i12 = iB + i10;
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    i10 = i12 * 53;
                    iB = t0.f6515d.g(j, abstractC0502w);
                    i12 = iB + i10;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    i10 = i12 * 53;
                    iB = AbstractC0505z.b(t0.f6515d.h(j, abstractC0502w));
                    i12 = iB + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iB = t0.f6515d.g(j, abstractC0502w);
                    i12 = iB + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iB = AbstractC0505z.b(t0.f6515d.h(j, abstractC0502w));
                    i12 = iB + i10;
                    break;
                case 17:
                    Object objI2 = t0.f6515d.i(j, abstractC0502w);
                    if (objI2 != null) {
                        iHashCode = objI2.hashCode();
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
                    iB = t0.f6515d.i(j, abstractC0502w).hashCode();
                    i12 = iB + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iB = t0.f6515d.i(j, abstractC0502w).hashCode();
                    i12 = iB + i10;
                    break;
                case 51:
                    if (r(i14, i13, abstractC0502w)) {
                        i10 = i12 * 53;
                        iB = AbstractC0505z.b(Double.doubleToLongBits(((Double) t0.f6515d.i(j, abstractC0502w)).doubleValue()));
                        i12 = iB + i10;
                    }
                    break;
                case 52:
                    if (r(i14, i13, abstractC0502w)) {
                        i10 = i12 * 53;
                        iB = Float.floatToIntBits(((Float) t0.f6515d.i(j, abstractC0502w)).floatValue());
                        i12 = iB + i10;
                    }
                    break;
                case 53:
                    if (r(i14, i13, abstractC0502w)) {
                        i10 = i12 * 53;
                        iB = AbstractC0505z.b(B(j, abstractC0502w));
                        i12 = iB + i10;
                    }
                    break;
                case 54:
                    if (r(i14, i13, abstractC0502w)) {
                        i10 = i12 * 53;
                        iB = AbstractC0505z.b(B(j, abstractC0502w));
                        i12 = iB + i10;
                    }
                    break;
                case 55:
                    if (r(i14, i13, abstractC0502w)) {
                        i10 = i12 * 53;
                        iB = A(j, abstractC0502w);
                        i12 = iB + i10;
                    }
                    break;
                case 56:
                    if (r(i14, i13, abstractC0502w)) {
                        i10 = i12 * 53;
                        iB = AbstractC0505z.b(B(j, abstractC0502w));
                        i12 = iB + i10;
                    }
                    break;
                case 57:
                    if (r(i14, i13, abstractC0502w)) {
                        i10 = i12 * 53;
                        iB = A(j, abstractC0502w);
                        i12 = iB + i10;
                    }
                    break;
                case 58:
                    if (r(i14, i13, abstractC0502w)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) t0.f6515d.i(j, abstractC0502w)).booleanValue();
                        Charset charset2 = AbstractC0505z.a;
                        if (zBooleanValue) {
                            i15 = 1231;
                        }
                        i12 = i15 + i11;
                    }
                    break;
                case 59:
                    if (r(i14, i13, abstractC0502w)) {
                        i10 = i12 * 53;
                        iB = ((String) t0.f6515d.i(j, abstractC0502w)).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 60:
                    if (r(i14, i13, abstractC0502w)) {
                        i10 = i12 * 53;
                        iB = t0.f6515d.i(j, abstractC0502w).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 61:
                    if (r(i14, i13, abstractC0502w)) {
                        i10 = i12 * 53;
                        iB = t0.f6515d.i(j, abstractC0502w).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 62:
                    if (r(i14, i13, abstractC0502w)) {
                        i10 = i12 * 53;
                        iB = A(j, abstractC0502w);
                        i12 = iB + i10;
                    }
                    break;
                case 63:
                    if (r(i14, i13, abstractC0502w)) {
                        i10 = i12 * 53;
                        iB = A(j, abstractC0502w);
                        i12 = iB + i10;
                    }
                    break;
                case 64:
                    if (r(i14, i13, abstractC0502w)) {
                        i10 = i12 * 53;
                        iB = A(j, abstractC0502w);
                        i12 = iB + i10;
                    }
                    break;
                case 65:
                    if (r(i14, i13, abstractC0502w)) {
                        i10 = i12 * 53;
                        iB = AbstractC0505z.b(B(j, abstractC0502w));
                        i12 = iB + i10;
                    }
                    break;
                case 66:
                    if (r(i14, i13, abstractC0502w)) {
                        i10 = i12 * 53;
                        iB = A(j, abstractC0502w);
                        i12 = iB + i10;
                    }
                    break;
                case 67:
                    if (r(i14, i13, abstractC0502w)) {
                        i10 = i12 * 53;
                        iB = AbstractC0505z.b(B(j, abstractC0502w));
                        i12 = iB + i10;
                    }
                    break;
                case 68:
                    if (r(i14, i13, abstractC0502w)) {
                        i10 = i12 * 53;
                        iB = t0.f6515d.i(j, abstractC0502w).hashCode();
                        i12 = iB + i10;
                    }
                    break;
            }
        }
        ((l0) this.f6434m).getClass();
        return abstractC0502w.unknownFields.hashCode() + (i12 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final void d(Object obj) {
        int[] iArr;
        int i10;
        int i11 = this.f6431i;
        while (true) {
            iArr = this.f6430h;
            i10 = this.j;
            if (i11 >= i10) {
                break;
            }
            long jL = L(iArr[i11]) & 1048575;
            Object objI = t0.f6515d.i(jL, obj);
            if (objI != null) {
                this.f6435n.getClass();
                ((L) objI).f6419s = false;
                t0.o(jL, obj, objI);
            }
            i11++;
        }
        int length = iArr.length;
        while (i10 < length) {
            this.f6433l.a(iArr[i10], obj);
            i10++;
        }
        ((l0) this.f6434m).getClass();
        ((AbstractC0502w) obj).unknownFields.f6498e = false;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final int e(AbstractC0478a abstractC0478a) {
        return this.f6429g ? p(abstractC0478a) : o(abstractC0478a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:71:0x010c  */
    /* JADX WARN: Code duplicated, block: B:73:0x010f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0123 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final boolean f(Object obj) {
        int i10;
        int iK;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean zQ = true;
            if (i12 >= this.f6431i) {
                return true;
            }
            int i14 = this.f6430h[i12];
            int[] iArr = this.a;
            int i15 = iArr[i14];
            int iL = L(i14);
            boolean z6 = this.f6429g;
            if (z6) {
                i10 = 0;
            } else {
                int i16 = iArr[i14 + 2];
                int i17 = i16 & 1048575;
                i10 = 1 << (i16 >>> 20);
                if (i17 != i11) {
                    i13 = f6423p.getInt(obj, i17);
                    i11 = i17;
                }
            }
            if ((268435456 & iL) == 0) {
                iK = K(iL);
                if (iK != 9 || iK == 17) {
                    if (z6) {
                        zQ = q(i14, obj);
                    } else if ((i10 & i13) == 0) {
                        zQ = false;
                    }
                    if (zQ) {
                        continue;
                    } else if (!n(i14).f(t0.f6515d.i(iL & 1048575, obj))) {
                    }
                    i12++;
                } else {
                    if (iK != 27) {
                        if (iK == 60 || iK == 68) {
                            if (!r(i15, i14, obj)) {
                                continue;
                            } else if (!n(i14).f(t0.f6515d.i(iL & 1048575, obj))) {
                            }
                            i12++;
                        } else if (iK != 49) {
                            if (iK != 50) {
                                continue;
                            } else {
                                Object objI = t0.f6515d.i(iL & 1048575, obj);
                                this.f6435n.getClass();
                                L l4 = (L) objI;
                                if (!l4.isEmpty() && ((K) m(i14)).a.f6416b.f6400s == C0.MESSAGE) {
                                    InterfaceC0481b0 interfaceC0481b0A = null;
                                    for (Object obj2 : l4.values()) {
                                        if (interfaceC0481b0A == null) {
                                            interfaceC0481b0A = X.f6439c.a(obj2.getClass());
                                        }
                                        if (!interfaceC0481b0A.f(obj2)) {
                                        }
                                    }
                                }
                            }
                            i12++;
                        }
                    }
                    List list = (List) t0.f6515d.i(iL & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC0481b0 interfaceC0481b0N = n(i14);
                        for (int i18 = 0; i18 < list.size(); i18++) {
                            if (interfaceC0481b0N.f(list.get(i18))) {
                            }
                        }
                    }
                    i12++;
                }
            } else {
                if (z6 ? q(i14, obj) : (i13 & i10) != 0) {
                    iK = K(iL);
                    if (iK != 9) {
                    }
                    if (z6) {
                        zQ = q(i14, obj);
                    } else if ((i10 & i13) == 0) {
                        zQ = false;
                    }
                    if (zQ) {
                        continue;
                    } else if (!n(i14).f(t0.f6515d.i(iL & 1048575, obj))) {
                    }
                    i12++;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final boolean g(AbstractC0502w abstractC0502w, AbstractC0502w abstractC0502w2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean zY = true;
            if (i10 < length) {
                int iL = L(i10);
                long j = iL & 1048575;
                switch (K(iL)) {
                    case 0:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var = t0.f6515d;
                            if (Double.doubleToLongBits(s0Var.e(j, abstractC0502w)) != Double.doubleToLongBits(s0Var.e(j, abstractC0502w2))) {
                                zY = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var2 = t0.f6515d;
                            if (Float.floatToIntBits(s0Var2.f(j, abstractC0502w)) != Float.floatToIntBits(s0Var2.f(j, abstractC0502w2))) {
                                zY = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var3 = t0.f6515d;
                            if (s0Var3.h(j, abstractC0502w) != s0Var3.h(j, abstractC0502w2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 3:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var4 = t0.f6515d;
                            if (s0Var4.h(j, abstractC0502w) != s0Var4.h(j, abstractC0502w2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 4:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var5 = t0.f6515d;
                            if (s0Var5.g(j, abstractC0502w) != s0Var5.g(j, abstractC0502w2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 5:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var6 = t0.f6515d;
                            if (s0Var6.h(j, abstractC0502w) != s0Var6.h(j, abstractC0502w2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 6:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var7 = t0.f6515d;
                            if (s0Var7.g(j, abstractC0502w) != s0Var7.g(j, abstractC0502w2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 7:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var8 = t0.f6515d;
                            if (s0Var8.c(j, abstractC0502w) != s0Var8.c(j, abstractC0502w2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var9 = t0.f6515d;
                            if (!AbstractC0483c0.y(s0Var9.i(j, abstractC0502w), s0Var9.i(j, abstractC0502w2))) {
                                zY = false;
                            }
                        }
                        break;
                    case 9:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var10 = t0.f6515d;
                            if (!AbstractC0483c0.y(s0Var10.i(j, abstractC0502w), s0Var10.i(j, abstractC0502w2))) {
                                zY = false;
                            }
                        }
                        break;
                    case 10:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var11 = t0.f6515d;
                            if (!AbstractC0483c0.y(s0Var11.i(j, abstractC0502w), s0Var11.i(j, abstractC0502w2))) {
                                zY = false;
                            }
                        }
                        break;
                    case 11:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var12 = t0.f6515d;
                            if (s0Var12.g(j, abstractC0502w) != s0Var12.g(j, abstractC0502w2)) {
                                zY = false;
                            }
                        }
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var13 = t0.f6515d;
                            if (s0Var13.g(j, abstractC0502w) != s0Var13.g(j, abstractC0502w2)) {
                                zY = false;
                            }
                        }
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var14 = t0.f6515d;
                            if (s0Var14.g(j, abstractC0502w) != s0Var14.g(j, abstractC0502w2)) {
                                zY = false;
                            }
                        }
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var15 = t0.f6515d;
                            if (s0Var15.h(j, abstractC0502w) != s0Var15.h(j, abstractC0502w2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 15:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var16 = t0.f6515d;
                            if (s0Var16.g(j, abstractC0502w) != s0Var16.g(j, abstractC0502w2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 16:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var17 = t0.f6515d;
                            if (s0Var17.h(j, abstractC0502w) != s0Var17.h(j, abstractC0502w2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 17:
                        if (!j(abstractC0502w, abstractC0502w2, i10)) {
                            zY = false;
                        } else {
                            s0 s0Var18 = t0.f6515d;
                            if (!AbstractC0483c0.y(s0Var18.i(j, abstractC0502w), s0Var18.i(j, abstractC0502w2))) {
                                zY = false;
                            }
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
                        s0 s0Var19 = t0.f6515d;
                        zY = AbstractC0483c0.y(s0Var19.i(j, abstractC0502w), s0Var19.i(j, abstractC0502w2));
                        break;
                    case 50:
                        s0 s0Var20 = t0.f6515d;
                        zY = AbstractC0483c0.y(s0Var20.i(j, abstractC0502w), s0Var20.i(j, abstractC0502w2));
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
                        s0 s0Var21 = t0.f6515d;
                        if (s0Var21.g(j10, abstractC0502w) != s0Var21.g(j10, abstractC0502w2) || !AbstractC0483c0.y(s0Var21.i(j, abstractC0502w), s0Var21.i(j, abstractC0502w2))) {
                            zY = false;
                        }
                        break;
                }
                if (zY) {
                    i10 += 3;
                }
            } else {
                l0 l0Var = (l0) this.f6434m;
                l0Var.getClass();
                k0 k0Var = abstractC0502w.unknownFields;
                l0Var.getClass();
                if (k0Var.equals(abstractC0502w2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final void h(AbstractC0502w abstractC0502w, AbstractC0502w abstractC0502w2) {
        AbstractC0502w abstractC0502w3;
        abstractC0502w2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 >= iArr.length) {
                AbstractC0502w abstractC0502w4 = abstractC0502w;
                if (this.f6429g) {
                    return;
                }
                AbstractC0483c0.x(this.f6434m, abstractC0502w4, abstractC0502w2);
                return;
            }
            int iL = L(i10);
            long j = 1048575 & iL;
            int i11 = iArr[i10];
            switch (K(iL)) {
                case 0:
                    if (!q(i10, abstractC0502w2)) {
                        abstractC0502w3 = abstractC0502w;
                    } else {
                        s0 s0Var = t0.f6515d;
                        abstractC0502w3 = abstractC0502w;
                        s0Var.m(abstractC0502w3, j, s0Var.e(j, abstractC0502w2));
                        I(i10, abstractC0502w3);
                    }
                    break;
                case 1:
                    if (q(i10, abstractC0502w2)) {
                        s0 s0Var2 = t0.f6515d;
                        s0Var2.n(abstractC0502w, j, s0Var2.f(j, abstractC0502w2));
                        I(i10, abstractC0502w);
                    }
                    abstractC0502w3 = abstractC0502w;
                    break;
                case 2:
                    if (q(i10, abstractC0502w2)) {
                        t0.n(abstractC0502w, j, t0.f6515d.h(j, abstractC0502w2));
                        I(i10, abstractC0502w);
                    }
                    abstractC0502w3 = abstractC0502w;
                    break;
                case 3:
                    if (q(i10, abstractC0502w2)) {
                        t0.n(abstractC0502w, j, t0.f6515d.h(j, abstractC0502w2));
                        I(i10, abstractC0502w);
                    }
                    abstractC0502w3 = abstractC0502w;
                    break;
                case 4:
                    if (q(i10, abstractC0502w2)) {
                        t0.m(abstractC0502w, j, t0.f6515d.g(j, abstractC0502w2));
                        I(i10, abstractC0502w);
                    }
                    abstractC0502w3 = abstractC0502w;
                    break;
                case 5:
                    if (q(i10, abstractC0502w2)) {
                        t0.n(abstractC0502w, j, t0.f6515d.h(j, abstractC0502w2));
                        I(i10, abstractC0502w);
                    }
                    abstractC0502w3 = abstractC0502w;
                    break;
                case 6:
                    if (q(i10, abstractC0502w2)) {
                        t0.m(abstractC0502w, j, t0.f6515d.g(j, abstractC0502w2));
                        I(i10, abstractC0502w);
                    }
                    abstractC0502w3 = abstractC0502w;
                    break;
                case 7:
                    if (q(i10, abstractC0502w2)) {
                        s0 s0Var3 = t0.f6515d;
                        s0Var3.k(abstractC0502w, j, s0Var3.c(j, abstractC0502w2));
                        I(i10, abstractC0502w);
                    }
                    abstractC0502w3 = abstractC0502w;
                    break;
                case 8:
                    if (q(i10, abstractC0502w2)) {
                        t0.o(j, abstractC0502w, t0.f6515d.i(j, abstractC0502w2));
                        I(i10, abstractC0502w);
                    }
                    abstractC0502w3 = abstractC0502w;
                    break;
                case 9:
                    v(abstractC0502w, abstractC0502w2, i10);
                    abstractC0502w3 = abstractC0502w;
                    break;
                case 10:
                    if (q(i10, abstractC0502w2)) {
                        t0.o(j, abstractC0502w, t0.f6515d.i(j, abstractC0502w2));
                        I(i10, abstractC0502w);
                    }
                    abstractC0502w3 = abstractC0502w;
                    break;
                case 11:
                    if (q(i10, abstractC0502w2)) {
                        t0.m(abstractC0502w, j, t0.f6515d.g(j, abstractC0502w2));
                        I(i10, abstractC0502w);
                    }
                    abstractC0502w3 = abstractC0502w;
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if (q(i10, abstractC0502w2)) {
                        t0.m(abstractC0502w, j, t0.f6515d.g(j, abstractC0502w2));
                        I(i10, abstractC0502w);
                    }
                    abstractC0502w3 = abstractC0502w;
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if (q(i10, abstractC0502w2)) {
                        t0.m(abstractC0502w, j, t0.f6515d.g(j, abstractC0502w2));
                        I(i10, abstractC0502w);
                    }
                    abstractC0502w3 = abstractC0502w;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (q(i10, abstractC0502w2)) {
                        t0.n(abstractC0502w, j, t0.f6515d.h(j, abstractC0502w2));
                        I(i10, abstractC0502w);
                    }
                    abstractC0502w3 = abstractC0502w;
                    break;
                case 15:
                    if (q(i10, abstractC0502w2)) {
                        t0.m(abstractC0502w, j, t0.f6515d.g(j, abstractC0502w2));
                        I(i10, abstractC0502w);
                    }
                    abstractC0502w3 = abstractC0502w;
                    break;
                case 16:
                    if (q(i10, abstractC0502w2)) {
                        t0.n(abstractC0502w, j, t0.f6515d.h(j, abstractC0502w2));
                        I(i10, abstractC0502w);
                    }
                    abstractC0502w3 = abstractC0502w;
                    break;
                case 17:
                    v(abstractC0502w, abstractC0502w2, i10);
                    abstractC0502w3 = abstractC0502w;
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
                    this.f6433l.b(abstractC0502w, abstractC0502w2, j);
                    abstractC0502w3 = abstractC0502w;
                    break;
                case 50:
                    Class cls = AbstractC0483c0.a;
                    s0 s0Var4 = t0.f6515d;
                    Object objI = s0Var4.i(j, abstractC0502w);
                    Object objI2 = s0Var4.i(j, abstractC0502w2);
                    this.f6435n.getClass();
                    t0.o(j, abstractC0502w, M.b(objI, objI2));
                    abstractC0502w3 = abstractC0502w;
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
                    if (r(i11, i10, abstractC0502w2)) {
                        t0.o(j, abstractC0502w, t0.f6515d.i(j, abstractC0502w2));
                        J(i11, i10, abstractC0502w);
                    }
                    abstractC0502w3 = abstractC0502w;
                    break;
                case 60:
                    w(abstractC0502w, abstractC0502w2, i10);
                    abstractC0502w3 = abstractC0502w;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (r(i11, i10, abstractC0502w2)) {
                        t0.o(j, abstractC0502w, t0.f6515d.i(j, abstractC0502w2));
                        J(i11, i10, abstractC0502w);
                    }
                    abstractC0502w3 = abstractC0502w;
                    break;
                case 68:
                    w(abstractC0502w, abstractC0502w2, i10);
                    abstractC0502w3 = abstractC0502w;
                    break;
                default:
                    abstractC0502w3 = abstractC0502w;
                    break;
            }
            i10 += 3;
            abstractC0502w = abstractC0502w3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0481b0
    public final Object i() {
        this.f6432k.getClass();
        return this.f6427e.d(4);
    }

    public final boolean j(AbstractC0502w abstractC0502w, AbstractC0502w abstractC0502w2, int i10) {
        return q(i10, abstractC0502w) == q(i10, abstractC0502w2);
    }

    public final void k(Object obj, int i10, Object obj2) {
        int i11 = this.a[i10];
        if (t0.f6515d.i(L(i10) & 1048575, obj) == null) {
            return;
        }
        l(i10);
    }

    public final void l(int i10) {
        if (this.f6424b[((i10 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object m(int i10) {
        return this.f6424b[(i10 / 3) * 2];
    }

    public final InterfaceC0481b0 n(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f6424b;
        InterfaceC0481b0 interfaceC0481b0 = (InterfaceC0481b0) objArr[i11];
        if (interfaceC0481b0 != null) {
            return interfaceC0481b0;
        }
        InterfaceC0481b0 interfaceC0481b0A = X.f6439c.a((Class) objArr[i11 + 1]);
        objArr[i11] = interfaceC0481b0A;
        return interfaceC0481b0A;
    }

    public final int o(AbstractC0478a abstractC0478a) {
        int i10;
        int iY;
        int iA;
        int iY2;
        int iW;
        int iU;
        int iY3;
        int iX;
        int iR;
        int iY4;
        int iV;
        Unsafe unsafe = f6423p;
        int i11 = -1;
        int i12 = 0;
        int iE = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i12 >= iArr.length) {
                ((l0) this.f6434m).getClass();
                return ((AbstractC0502w) abstractC0478a).unknownFields.a() + iE;
            }
            int iL = L(i12);
            int i14 = iArr[i12];
            int iK = K(iL);
            if (iK <= 17) {
                int i15 = iArr[i12 + 2];
                int i16 = i15 & 1048575;
                i10 = 1 << (i15 >>> 20);
                if (i16 != i11) {
                    i13 = unsafe.getInt(abstractC0478a, i16);
                    i11 = i16;
                }
            } else {
                i10 = 0;
            }
            long j = iL & 1048575;
            switch (iK) {
                case 0:
                    if ((i10 & i13) != 0) {
                        iE = AbstractC0487g.e(i14, 8, iE);
                    }
                    break;
                case 1:
                    if ((i13 & i10) != 0) {
                        iE = AbstractC0487g.e(i14, 4, iE);
                    }
                    break;
                case 2:
                    if ((i13 & i10) != 0) {
                        long j10 = unsafe.getLong(abstractC0478a, j);
                        iY = C0491k.y(i14);
                        iA = C0491k.A(j10);
                        iY4 = iA + iY;
                        iE += iY4;
                    }
                    break;
                case 3:
                    if ((i13 & i10) != 0) {
                        long j11 = unsafe.getLong(abstractC0478a, j);
                        iY = C0491k.y(i14);
                        iA = C0491k.A(j11);
                        iY4 = iA + iY;
                        iE += iY4;
                    }
                    break;
                case 4:
                    if ((i13 & i10) != 0) {
                        int i17 = unsafe.getInt(abstractC0478a, j);
                        iY2 = C0491k.y(i14);
                        iW = C0491k.w(i17);
                        iU = iW + iY2;
                        iE += iU;
                    }
                    break;
                case 5:
                    if ((i13 & i10) != 0) {
                        iU = C0491k.u(i14);
                        iE += iU;
                    }
                    break;
                case 6:
                    if ((i13 & i10) != 0) {
                        iU = C0491k.t(i14);
                        iE += iU;
                    }
                    break;
                case 7:
                    if ((i13 & i10) != 0) {
                        iE = AbstractC0487g.e(i14, 1, iE);
                    }
                    break;
                case 8:
                    if ((i13 & i10) != 0) {
                        Object object = unsafe.getObject(abstractC0478a, j);
                        if (object instanceof C0488h) {
                            iR = C0491k.r(i14, (C0488h) object);
                        } else {
                            iY3 = C0491k.y(i14);
                            iX = C0491k.x((String) object);
                            iR = iX + iY3;
                        }
                        iE = iR + iE;
                    }
                    break;
                case 9:
                    if ((i13 & i10) != 0) {
                        Object object2 = unsafe.getObject(abstractC0478a, j);
                        InterfaceC0481b0 interfaceC0481b0N = n(i12);
                        Class cls = AbstractC0483c0.a;
                        int iY5 = C0491k.y(i14);
                        int iB = ((AbstractC0478a) object2).b(interfaceC0481b0N);
                        iE = AbstractC0487g.f(iB, iB, iY5, iE);
                    }
                    break;
                case 10:
                    if ((i13 & i10) != 0) {
                        iU = C0491k.r(i14, (C0488h) unsafe.getObject(abstractC0478a, j));
                        iE += iU;
                    }
                    break;
                case 11:
                    if ((i13 & i10) != 0) {
                        int i18 = unsafe.getInt(abstractC0478a, j);
                        iY2 = C0491k.y(i14);
                        iW = C0491k.z(i18);
                        iU = iW + iY2;
                        iE += iU;
                    }
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if ((i13 & i10) != 0) {
                        int i19 = unsafe.getInt(abstractC0478a, j);
                        iY2 = C0491k.y(i14);
                        iW = C0491k.w(i19);
                        iU = iW + iY2;
                        iE += iU;
                    }
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if ((i13 & i10) != 0) {
                        iE = AbstractC0487g.e(i14, 4, iE);
                    }
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if ((i10 & i13) != 0) {
                        iE = AbstractC0487g.e(i14, 8, iE);
                    }
                    break;
                case 15:
                    if ((i13 & i10) != 0) {
                        int i20 = unsafe.getInt(abstractC0478a, j);
                        iY2 = C0491k.y(i14);
                        iW = C0491k.z((i20 >> 31) ^ (i20 << 1));
                        iU = iW + iY2;
                        iE += iU;
                    }
                    break;
                case 16:
                    if ((i13 & i10) != 0) {
                        long j12 = unsafe.getLong(abstractC0478a, j);
                        iY = C0491k.y(i14);
                        iA = C0491k.A((j12 >> 63) ^ (j12 << 1));
                        iY4 = iA + iY;
                        iE += iY4;
                    }
                    break;
                case 17:
                    if ((i13 & i10) != 0) {
                        iU = C0491k.v(i14, (AbstractC0478a) unsafe.getObject(abstractC0478a, j), n(i12));
                        iE += iU;
                    }
                    break;
                case 18:
                    iU = AbstractC0483c0.f((List) unsafe.getObject(abstractC0478a, j), i14);
                    iE += iU;
                    break;
                case 19:
                    iU = AbstractC0483c0.d((List) unsafe.getObject(abstractC0478a, j), i14);
                    iE += iU;
                    break;
                case 20:
                    iU = AbstractC0483c0.j((List) unsafe.getObject(abstractC0478a, j), i14);
                    iE += iU;
                    break;
                case MobileAdsBridge.CODE_21 /* 21 */:
                    iU = AbstractC0483c0.t((List) unsafe.getObject(abstractC0478a, j), i14);
                    iE += iU;
                    break;
                case 22:
                    iU = AbstractC0483c0.h((List) unsafe.getObject(abstractC0478a, j), i14);
                    iE += iU;
                    break;
                case 23:
                    iU = AbstractC0483c0.f((List) unsafe.getObject(abstractC0478a, j), i14);
                    iE += iU;
                    break;
                case 24:
                    iU = AbstractC0483c0.d((List) unsafe.getObject(abstractC0478a, j), i14);
                    iE += iU;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(abstractC0478a, j);
                    Class cls2 = AbstractC0483c0.a;
                    int size = list.size();
                    iY4 = size == 0 ? 0 : (C0491k.y(i14) + 1) * size;
                    iE += iY4;
                    break;
                case 26:
                    iU = AbstractC0483c0.q((List) unsafe.getObject(abstractC0478a, j), i14);
                    iE += iU;
                    break;
                case 27:
                    iU = AbstractC0483c0.l(i14, (List) unsafe.getObject(abstractC0478a, j), n(i12));
                    iE += iU;
                    break;
                case 28:
                    iU = AbstractC0483c0.a((List) unsafe.getObject(abstractC0478a, j), i14);
                    iE += iU;
                    break;
                case 29:
                    iU = AbstractC0483c0.r((List) unsafe.getObject(abstractC0478a, j), i14);
                    iE += iU;
                    break;
                case 30:
                    iU = AbstractC0483c0.b((List) unsafe.getObject(abstractC0478a, j), i14);
                    iE += iU;
                    break;
                case 31:
                    iU = AbstractC0483c0.d((List) unsafe.getObject(abstractC0478a, j), i14);
                    iE += iU;
                    break;
                case 32:
                    iU = AbstractC0483c0.f((List) unsafe.getObject(abstractC0478a, j), i14);
                    iE += iU;
                    break;
                case 33:
                    iU = AbstractC0483c0.m((List) unsafe.getObject(abstractC0478a, j), i14);
                    iE += iU;
                    break;
                case 34:
                    iU = AbstractC0483c0.o((List) unsafe.getObject(abstractC0478a, j), i14);
                    iE += iU;
                    break;
                case 35:
                    int iG = AbstractC0483c0.g((List) unsafe.getObject(abstractC0478a, j));
                    if (iG > 0) {
                        iE = AbstractC0487g.f(iG, C0491k.y(i14), iG, iE);
                    }
                    break;
                case 36:
                    int iE2 = AbstractC0483c0.e((List) unsafe.getObject(abstractC0478a, j));
                    if (iE2 > 0) {
                        iE = AbstractC0487g.f(iE2, C0491k.y(i14), iE2, iE);
                    }
                    break;
                case 37:
                    int iK2 = AbstractC0483c0.k((List) unsafe.getObject(abstractC0478a, j));
                    if (iK2 > 0) {
                        iE = AbstractC0487g.f(iK2, C0491k.y(i14), iK2, iE);
                    }
                    break;
                case 38:
                    int iU2 = AbstractC0483c0.u((List) unsafe.getObject(abstractC0478a, j));
                    if (iU2 > 0) {
                        iE = AbstractC0487g.f(iU2, C0491k.y(i14), iU2, iE);
                    }
                    break;
                case 39:
                    int i21 = AbstractC0483c0.i((List) unsafe.getObject(abstractC0478a, j));
                    if (i21 > 0) {
                        iE = AbstractC0487g.f(i21, C0491k.y(i14), i21, iE);
                    }
                    break;
                case 40:
                    int iG2 = AbstractC0483c0.g((List) unsafe.getObject(abstractC0478a, j));
                    if (iG2 > 0) {
                        iE = AbstractC0487g.f(iG2, C0491k.y(i14), iG2, iE);
                    }
                    break;
                case 41:
                    int iE3 = AbstractC0483c0.e((List) unsafe.getObject(abstractC0478a, j));
                    if (iE3 > 0) {
                        iE = AbstractC0487g.f(iE3, C0491k.y(i14), iE3, iE);
                    }
                    break;
                case 42:
                    List list2 = (List) unsafe.getObject(abstractC0478a, j);
                    Class cls3 = AbstractC0483c0.a;
                    int size2 = list2.size();
                    if (size2 > 0) {
                        iE = AbstractC0487g.f(size2, C0491k.y(i14), size2, iE);
                    }
                    break;
                case 43:
                    int iS = AbstractC0483c0.s((List) unsafe.getObject(abstractC0478a, j));
                    if (iS > 0) {
                        iE = AbstractC0487g.f(iS, C0491k.y(i14), iS, iE);
                    }
                    break;
                case 44:
                    int iC = AbstractC0483c0.c((List) unsafe.getObject(abstractC0478a, j));
                    if (iC > 0) {
                        iE = AbstractC0487g.f(iC, C0491k.y(i14), iC, iE);
                    }
                    break;
                case 45:
                    int iE4 = AbstractC0483c0.e((List) unsafe.getObject(abstractC0478a, j));
                    if (iE4 > 0) {
                        iE = AbstractC0487g.f(iE4, C0491k.y(i14), iE4, iE);
                    }
                    break;
                case 46:
                    int iG3 = AbstractC0483c0.g((List) unsafe.getObject(abstractC0478a, j));
                    if (iG3 > 0) {
                        iE = AbstractC0487g.f(iG3, C0491k.y(i14), iG3, iE);
                    }
                    break;
                case 47:
                    int iN = AbstractC0483c0.n((List) unsafe.getObject(abstractC0478a, j));
                    if (iN > 0) {
                        iE = AbstractC0487g.f(iN, C0491k.y(i14), iN, iE);
                    }
                    break;
                case 48:
                    int iP = AbstractC0483c0.p((List) unsafe.getObject(abstractC0478a, j));
                    if (iP > 0) {
                        iE = AbstractC0487g.f(iP, C0491k.y(i14), iP, iE);
                    }
                    break;
                case 49:
                    List list3 = (List) unsafe.getObject(abstractC0478a, j);
                    InterfaceC0481b0 interfaceC0481b0N2 = n(i12);
                    Class cls4 = AbstractC0483c0.a;
                    int size3 = list3.size();
                    if (size3 == 0) {
                        iV = 0;
                    } else {
                        iV = 0;
                        for (int i22 = 0; i22 < size3; i22++) {
                            iV += C0491k.v(i14, (AbstractC0478a) list3.get(i22), interfaceC0481b0N2);
                        }
                    }
                    iE += iV;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC0478a, j);
                    Object objM = m(i12);
                    this.f6435n.getClass();
                    iU = M.a(object3, i14, objM);
                    iE += iU;
                    break;
                case 51:
                    if (r(i14, i12, abstractC0478a)) {
                        iE = AbstractC0487g.e(i14, 8, iE);
                    }
                    break;
                case 52:
                    if (r(i14, i12, abstractC0478a)) {
                        iE = AbstractC0487g.e(i14, 4, iE);
                    }
                    break;
                case 53:
                    if (r(i14, i12, abstractC0478a)) {
                        long jB = B(j, abstractC0478a);
                        iY = C0491k.y(i14);
                        iA = C0491k.A(jB);
                        iY4 = iA + iY;
                        iE += iY4;
                    }
                    break;
                case 54:
                    if (r(i14, i12, abstractC0478a)) {
                        long jB2 = B(j, abstractC0478a);
                        iY = C0491k.y(i14);
                        iA = C0491k.A(jB2);
                        iY4 = iA + iY;
                        iE += iY4;
                    }
                    break;
                case 55:
                    if (r(i14, i12, abstractC0478a)) {
                        int iA2 = A(j, abstractC0478a);
                        iY2 = C0491k.y(i14);
                        iW = C0491k.w(iA2);
                        iU = iW + iY2;
                        iE += iU;
                    }
                    break;
                case 56:
                    if (r(i14, i12, abstractC0478a)) {
                        iU = C0491k.u(i14);
                        iE += iU;
                    }
                    break;
                case 57:
                    if (r(i14, i12, abstractC0478a)) {
                        iU = C0491k.t(i14);
                        iE += iU;
                    }
                    break;
                case 58:
                    if (r(i14, i12, abstractC0478a)) {
                        iE = AbstractC0487g.e(i14, 1, iE);
                    }
                    break;
                case 59:
                    if (r(i14, i12, abstractC0478a)) {
                        Object object4 = unsafe.getObject(abstractC0478a, j);
                        if (object4 instanceof C0488h) {
                            iR = C0491k.r(i14, (C0488h) object4);
                        } else {
                            iY3 = C0491k.y(i14);
                            iX = C0491k.x((String) object4);
                            iR = iX + iY3;
                        }
                        iE = iR + iE;
                    }
                    break;
                case 60:
                    if (r(i14, i12, abstractC0478a)) {
                        Object object5 = unsafe.getObject(abstractC0478a, j);
                        InterfaceC0481b0 interfaceC0481b0N3 = n(i12);
                        Class cls5 = AbstractC0483c0.a;
                        int iY6 = C0491k.y(i14);
                        int iB2 = ((AbstractC0478a) object5).b(interfaceC0481b0N3);
                        iE = AbstractC0487g.f(iB2, iB2, iY6, iE);
                    }
                    break;
                case 61:
                    if (r(i14, i12, abstractC0478a)) {
                        iU = C0491k.r(i14, (C0488h) unsafe.getObject(abstractC0478a, j));
                        iE += iU;
                    }
                    break;
                case 62:
                    if (r(i14, i12, abstractC0478a)) {
                        int iA3 = A(j, abstractC0478a);
                        iY2 = C0491k.y(i14);
                        iW = C0491k.z(iA3);
                        iU = iW + iY2;
                        iE += iU;
                    }
                    break;
                case 63:
                    if (r(i14, i12, abstractC0478a)) {
                        int iA4 = A(j, abstractC0478a);
                        iY2 = C0491k.y(i14);
                        iW = C0491k.w(iA4);
                        iU = iW + iY2;
                        iE += iU;
                    }
                    break;
                case 64:
                    if (r(i14, i12, abstractC0478a)) {
                        iE = AbstractC0487g.e(i14, 4, iE);
                    }
                    break;
                case 65:
                    if (r(i14, i12, abstractC0478a)) {
                        iE = AbstractC0487g.e(i14, 8, iE);
                    }
                    break;
                case 66:
                    if (r(i14, i12, abstractC0478a)) {
                        int iA5 = A(j, abstractC0478a);
                        iY2 = C0491k.y(i14);
                        iW = C0491k.z((iA5 >> 31) ^ (iA5 << 1));
                        iU = iW + iY2;
                        iE += iU;
                    }
                    break;
                case 67:
                    if (r(i14, i12, abstractC0478a)) {
                        long jB3 = B(j, abstractC0478a);
                        iY = C0491k.y(i14);
                        iA = C0491k.A((jB3 >> 63) ^ (jB3 << 1));
                        iY4 = iA + iY;
                        iE += iY4;
                    }
                    break;
                case 68:
                    if (r(i14, i12, abstractC0478a)) {
                        iU = C0491k.v(i14, (AbstractC0478a) unsafe.getObject(abstractC0478a, j), n(i12));
                        iE += iU;
                    }
                    break;
            }
            i12 += 3;
        }
    }

    public final int p(AbstractC0478a abstractC0478a) {
        int iY;
        int iA;
        int iY2;
        int iW;
        int iU;
        int iY3;
        int iX;
        int iR;
        int iY4;
        int iA2;
        int iV;
        Unsafe unsafe = f6423p;
        int i10 = 0;
        int iE = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 >= iArr.length) {
                ((l0) this.f6434m).getClass();
                return ((AbstractC0502w) abstractC0478a).unknownFields.a() + iE;
            }
            int iL = L(i10);
            int iK = K(iL);
            int i11 = iArr[i10];
            long j = iL & 1048575;
            if (iK >= r.f6507t.f6511s && iK <= r.f6508u.f6511s) {
                int i12 = iArr[i10 + 2];
            }
            switch (iK) {
                case 0:
                    if (q(i10, abstractC0478a)) {
                        iE = AbstractC0487g.e(i11, 8, iE);
                    }
                    break;
                case 1:
                    if (q(i10, abstractC0478a)) {
                        iE = AbstractC0487g.e(i11, 4, iE);
                    }
                    break;
                case 2:
                    if (q(i10, abstractC0478a)) {
                        long jH = t0.f6515d.h(j, abstractC0478a);
                        iY = C0491k.y(i11);
                        iA = C0491k.A(jH);
                        iU = iA + iY;
                        iE += iU;
                    }
                    break;
                case 3:
                    if (q(i10, abstractC0478a)) {
                        long jH2 = t0.f6515d.h(j, abstractC0478a);
                        iY = C0491k.y(i11);
                        iA = C0491k.A(jH2);
                        iU = iA + iY;
                        iE += iU;
                    }
                    break;
                case 4:
                    if (q(i10, abstractC0478a)) {
                        int iG = t0.f6515d.g(j, abstractC0478a);
                        iY2 = C0491k.y(i11);
                        iW = C0491k.w(iG);
                        iU = iW + iY2;
                        iE += iU;
                    }
                    break;
                case 5:
                    if (q(i10, abstractC0478a)) {
                        iU = C0491k.u(i11);
                        iE += iU;
                    }
                    break;
                case 6:
                    if (q(i10, abstractC0478a)) {
                        iU = C0491k.t(i11);
                        iE += iU;
                    }
                    break;
                case 7:
                    if (q(i10, abstractC0478a)) {
                        iE = AbstractC0487g.e(i11, 1, iE);
                    }
                    break;
                case 8:
                    if (q(i10, abstractC0478a)) {
                        Object objI = t0.f6515d.i(j, abstractC0478a);
                        if (objI instanceof C0488h) {
                            iR = C0491k.r(i11, (C0488h) objI);
                        } else {
                            iY3 = C0491k.y(i11);
                            iX = C0491k.x((String) objI);
                            iR = iX + iY3;
                        }
                        iE = iR + iE;
                    }
                    break;
                case 9:
                    if (q(i10, abstractC0478a)) {
                        Object objI2 = t0.f6515d.i(j, abstractC0478a);
                        InterfaceC0481b0 interfaceC0481b0N = n(i10);
                        Class cls = AbstractC0483c0.a;
                        int iY5 = C0491k.y(i11);
                        int iB = ((AbstractC0478a) objI2).b(interfaceC0481b0N);
                        iE = AbstractC0487g.f(iB, iB, iY5, iE);
                    }
                    break;
                case 10:
                    if (q(i10, abstractC0478a)) {
                        iU = C0491k.r(i11, (C0488h) t0.f6515d.i(j, abstractC0478a));
                        iE += iU;
                    }
                    break;
                case 11:
                    if (q(i10, abstractC0478a)) {
                        int iG2 = t0.f6515d.g(j, abstractC0478a);
                        iY2 = C0491k.y(i11);
                        iW = C0491k.z(iG2);
                        iU = iW + iY2;
                        iE += iU;
                    }
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if (q(i10, abstractC0478a)) {
                        int iG3 = t0.f6515d.g(j, abstractC0478a);
                        iY2 = C0491k.y(i11);
                        iW = C0491k.w(iG3);
                        iU = iW + iY2;
                        iE += iU;
                    }
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if (q(i10, abstractC0478a)) {
                        iE = AbstractC0487g.e(i11, 4, iE);
                    }
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (q(i10, abstractC0478a)) {
                        iE = AbstractC0487g.e(i11, 8, iE);
                    }
                    break;
                case 15:
                    if (q(i10, abstractC0478a)) {
                        int iG4 = t0.f6515d.g(j, abstractC0478a);
                        iY2 = C0491k.y(i11);
                        iW = C0491k.z((iG4 >> 31) ^ (iG4 << 1));
                        iU = iW + iY2;
                        iE += iU;
                    }
                    break;
                case 16:
                    if (q(i10, abstractC0478a)) {
                        long jH3 = t0.f6515d.h(j, abstractC0478a);
                        iY4 = C0491k.y(i11);
                        iA2 = C0491k.A((jH3 >> 63) ^ (jH3 << 1));
                        iU = iA2 + iY4;
                        iE += iU;
                    }
                    break;
                case 17:
                    if (q(i10, abstractC0478a)) {
                        iU = C0491k.v(i11, (AbstractC0478a) t0.f6515d.i(j, abstractC0478a), n(i10));
                        iE += iU;
                    }
                    break;
                case 18:
                    iU = AbstractC0483c0.f(s(abstractC0478a, j), i11);
                    iE += iU;
                    break;
                case 19:
                    iU = AbstractC0483c0.d(s(abstractC0478a, j), i11);
                    iE += iU;
                    break;
                case 20:
                    iU = AbstractC0483c0.j(s(abstractC0478a, j), i11);
                    iE += iU;
                    break;
                case MobileAdsBridge.CODE_21 /* 21 */:
                    iU = AbstractC0483c0.t(s(abstractC0478a, j), i11);
                    iE += iU;
                    break;
                case 22:
                    iU = AbstractC0483c0.h(s(abstractC0478a, j), i11);
                    iE += iU;
                    break;
                case 23:
                    iU = AbstractC0483c0.f(s(abstractC0478a, j), i11);
                    iE += iU;
                    break;
                case 24:
                    iU = AbstractC0483c0.d(s(abstractC0478a, j), i11);
                    iE += iU;
                    break;
                case 25:
                    List listS = s(abstractC0478a, j);
                    Class cls2 = AbstractC0483c0.a;
                    int size = listS.size();
                    iE += size == 0 ? 0 : (C0491k.y(i11) + 1) * size;
                    break;
                case 26:
                    iU = AbstractC0483c0.q(s(abstractC0478a, j), i11);
                    iE += iU;
                    break;
                case 27:
                    iU = AbstractC0483c0.l(i11, s(abstractC0478a, j), n(i10));
                    iE += iU;
                    break;
                case 28:
                    iU = AbstractC0483c0.a(s(abstractC0478a, j), i11);
                    iE += iU;
                    break;
                case 29:
                    iU = AbstractC0483c0.r(s(abstractC0478a, j), i11);
                    iE += iU;
                    break;
                case 30:
                    iU = AbstractC0483c0.b(s(abstractC0478a, j), i11);
                    iE += iU;
                    break;
                case 31:
                    iU = AbstractC0483c0.d(s(abstractC0478a, j), i11);
                    iE += iU;
                    break;
                case 32:
                    iU = AbstractC0483c0.f(s(abstractC0478a, j), i11);
                    iE += iU;
                    break;
                case 33:
                    iU = AbstractC0483c0.m(s(abstractC0478a, j), i11);
                    iE += iU;
                    break;
                case 34:
                    iU = AbstractC0483c0.o(s(abstractC0478a, j), i11);
                    iE += iU;
                    break;
                case 35:
                    int iG5 = AbstractC0483c0.g((List) unsafe.getObject(abstractC0478a, j));
                    if (iG5 > 0) {
                        iE = AbstractC0487g.f(iG5, C0491k.y(i11), iG5, iE);
                    }
                    break;
                case 36:
                    int iE2 = AbstractC0483c0.e((List) unsafe.getObject(abstractC0478a, j));
                    if (iE2 > 0) {
                        iE = AbstractC0487g.f(iE2, C0491k.y(i11), iE2, iE);
                    }
                    break;
                case 37:
                    int iK2 = AbstractC0483c0.k((List) unsafe.getObject(abstractC0478a, j));
                    if (iK2 > 0) {
                        iE = AbstractC0487g.f(iK2, C0491k.y(i11), iK2, iE);
                    }
                    break;
                case 38:
                    int iU2 = AbstractC0483c0.u((List) unsafe.getObject(abstractC0478a, j));
                    if (iU2 > 0) {
                        iE = AbstractC0487g.f(iU2, C0491k.y(i11), iU2, iE);
                    }
                    break;
                case 39:
                    int i13 = AbstractC0483c0.i((List) unsafe.getObject(abstractC0478a, j));
                    if (i13 > 0) {
                        iE = AbstractC0487g.f(i13, C0491k.y(i11), i13, iE);
                    }
                    break;
                case 40:
                    int iG6 = AbstractC0483c0.g((List) unsafe.getObject(abstractC0478a, j));
                    if (iG6 > 0) {
                        iE = AbstractC0487g.f(iG6, C0491k.y(i11), iG6, iE);
                    }
                    break;
                case 41:
                    int iE3 = AbstractC0483c0.e((List) unsafe.getObject(abstractC0478a, j));
                    if (iE3 > 0) {
                        iE = AbstractC0487g.f(iE3, C0491k.y(i11), iE3, iE);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(abstractC0478a, j);
                    Class cls3 = AbstractC0483c0.a;
                    int size2 = list.size();
                    if (size2 > 0) {
                        iE = AbstractC0487g.f(size2, C0491k.y(i11), size2, iE);
                    }
                    break;
                case 43:
                    int iS = AbstractC0483c0.s((List) unsafe.getObject(abstractC0478a, j));
                    if (iS > 0) {
                        iE = AbstractC0487g.f(iS, C0491k.y(i11), iS, iE);
                    }
                    break;
                case 44:
                    int iC = AbstractC0483c0.c((List) unsafe.getObject(abstractC0478a, j));
                    if (iC > 0) {
                        iE = AbstractC0487g.f(iC, C0491k.y(i11), iC, iE);
                    }
                    break;
                case 45:
                    int iE4 = AbstractC0483c0.e((List) unsafe.getObject(abstractC0478a, j));
                    if (iE4 > 0) {
                        iE = AbstractC0487g.f(iE4, C0491k.y(i11), iE4, iE);
                    }
                    break;
                case 46:
                    int iG7 = AbstractC0483c0.g((List) unsafe.getObject(abstractC0478a, j));
                    if (iG7 > 0) {
                        iE = AbstractC0487g.f(iG7, C0491k.y(i11), iG7, iE);
                    }
                    break;
                case 47:
                    int iN = AbstractC0483c0.n((List) unsafe.getObject(abstractC0478a, j));
                    if (iN > 0) {
                        iE = AbstractC0487g.f(iN, C0491k.y(i11), iN, iE);
                    }
                    break;
                case 48:
                    int iP = AbstractC0483c0.p((List) unsafe.getObject(abstractC0478a, j));
                    if (iP > 0) {
                        iE = AbstractC0487g.f(iP, C0491k.y(i11), iP, iE);
                    }
                    break;
                case 49:
                    List listS2 = s(abstractC0478a, j);
                    InterfaceC0481b0 interfaceC0481b0N2 = n(i10);
                    Class cls4 = AbstractC0483c0.a;
                    int size3 = listS2.size();
                    if (size3 == 0) {
                        iV = 0;
                    } else {
                        iV = 0;
                        for (int i14 = 0; i14 < size3; i14++) {
                            iV += C0491k.v(i11, (AbstractC0478a) listS2.get(i14), interfaceC0481b0N2);
                        }
                    }
                    iE += iV;
                    break;
                case 50:
                    Object objI3 = t0.f6515d.i(j, abstractC0478a);
                    Object objM = m(i10);
                    this.f6435n.getClass();
                    iU = M.a(objI3, i11, objM);
                    iE += iU;
                    break;
                case 51:
                    if (r(i11, i10, abstractC0478a)) {
                        iE = AbstractC0487g.e(i11, 8, iE);
                    }
                    break;
                case 52:
                    if (r(i11, i10, abstractC0478a)) {
                        iE = AbstractC0487g.e(i11, 4, iE);
                    }
                    break;
                case 53:
                    if (r(i11, i10, abstractC0478a)) {
                        long jB = B(j, abstractC0478a);
                        iY = C0491k.y(i11);
                        iA = C0491k.A(jB);
                        iU = iA + iY;
                        iE += iU;
                    }
                    break;
                case 54:
                    if (r(i11, i10, abstractC0478a)) {
                        long jB2 = B(j, abstractC0478a);
                        iY = C0491k.y(i11);
                        iA = C0491k.A(jB2);
                        iU = iA + iY;
                        iE += iU;
                    }
                    break;
                case 55:
                    if (r(i11, i10, abstractC0478a)) {
                        int iA3 = A(j, abstractC0478a);
                        iY2 = C0491k.y(i11);
                        iW = C0491k.w(iA3);
                        iU = iW + iY2;
                        iE += iU;
                    }
                    break;
                case 56:
                    if (r(i11, i10, abstractC0478a)) {
                        iU = C0491k.u(i11);
                        iE += iU;
                    }
                    break;
                case 57:
                    if (r(i11, i10, abstractC0478a)) {
                        iU = C0491k.t(i11);
                        iE += iU;
                    }
                    break;
                case 58:
                    if (r(i11, i10, abstractC0478a)) {
                        iE = AbstractC0487g.e(i11, 1, iE);
                    }
                    break;
                case 59:
                    if (r(i11, i10, abstractC0478a)) {
                        Object objI4 = t0.f6515d.i(j, abstractC0478a);
                        if (objI4 instanceof C0488h) {
                            iR = C0491k.r(i11, (C0488h) objI4);
                        } else {
                            iY3 = C0491k.y(i11);
                            iX = C0491k.x((String) objI4);
                            iR = iX + iY3;
                        }
                        iE = iR + iE;
                    }
                    break;
                case 60:
                    if (r(i11, i10, abstractC0478a)) {
                        Object objI5 = t0.f6515d.i(j, abstractC0478a);
                        InterfaceC0481b0 interfaceC0481b0N3 = n(i10);
                        Class cls5 = AbstractC0483c0.a;
                        int iY6 = C0491k.y(i11);
                        int iB2 = ((AbstractC0478a) objI5).b(interfaceC0481b0N3);
                        iE = AbstractC0487g.f(iB2, iB2, iY6, iE);
                    }
                    break;
                case 61:
                    if (r(i11, i10, abstractC0478a)) {
                        iU = C0491k.r(i11, (C0488h) t0.f6515d.i(j, abstractC0478a));
                        iE += iU;
                    }
                    break;
                case 62:
                    if (r(i11, i10, abstractC0478a)) {
                        int iA4 = A(j, abstractC0478a);
                        iY2 = C0491k.y(i11);
                        iW = C0491k.z(iA4);
                        iU = iW + iY2;
                        iE += iU;
                    }
                    break;
                case 63:
                    if (r(i11, i10, abstractC0478a)) {
                        int iA5 = A(j, abstractC0478a);
                        iY2 = C0491k.y(i11);
                        iW = C0491k.w(iA5);
                        iU = iW + iY2;
                        iE += iU;
                    }
                    break;
                case 64:
                    if (r(i11, i10, abstractC0478a)) {
                        iE = AbstractC0487g.e(i11, 4, iE);
                    }
                    break;
                case 65:
                    if (r(i11, i10, abstractC0478a)) {
                        iE = AbstractC0487g.e(i11, 8, iE);
                    }
                    break;
                case 66:
                    if (r(i11, i10, abstractC0478a)) {
                        int iA6 = A(j, abstractC0478a);
                        iY2 = C0491k.y(i11);
                        iW = C0491k.z((iA6 >> 31) ^ (iA6 << 1));
                        iU = iW + iY2;
                        iE += iU;
                    }
                    break;
                case 67:
                    if (r(i11, i10, abstractC0478a)) {
                        long jB3 = B(j, abstractC0478a);
                        iY4 = C0491k.y(i11);
                        iA2 = C0491k.A((jB3 >> 63) ^ (jB3 << 1));
                        iU = iA2 + iY4;
                        iE += iU;
                    }
                    break;
                case 68:
                    if (r(i11, i10, abstractC0478a)) {
                        iU = C0491k.v(i11, (AbstractC0478a) t0.f6515d.i(j, abstractC0478a), n(i10));
                        iE += iU;
                    }
                    break;
            }
            i10 += 3;
        }
    }

    public final boolean q(int i10, Object obj) {
        if (this.f6429g) {
            int iL = L(i10);
            long j = iL & 1048575;
            switch (K(iL)) {
                case 0:
                    if (t0.f6515d.e(j, obj) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (t0.f6515d.f(j, obj) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (t0.f6515d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (t0.f6515d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (t0.f6515d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (t0.f6515d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (t0.f6515d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return t0.f6515d.c(j, obj);
                case 8:
                    Object objI = t0.f6515d.i(j, obj);
                    if (objI instanceof String) {
                        return !((String) objI).isEmpty();
                    }
                    if (objI instanceof C0488h) {
                        return !C0488h.f6466u.equals(objI);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (t0.f6515d.i(j, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C0488h.f6466u.equals(t0.f6515d.i(j, obj));
                case 11:
                    if (t0.f6515d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if (t0.f6515d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if (t0.f6515d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (t0.f6515d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (t0.f6515d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (t0.f6515d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (t0.f6515d.i(j, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int i11 = this.a[i10 + 2];
            if ((t0.f6515d.g(i11 & 1048575, obj) & (1 << (i11 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean r(int i10, int i11, Object obj) {
        return t0.f6515d.g((long) (this.a[i11 + 2] & 1048575), obj) == i10;
    }

    /* JADX WARN: Code duplicated, block: B:172:0x064d A[Catch: all -> 0x067b, TryCatch #17 {all -> 0x067b, blocks: (B:170:0x0648, B:172:0x064d, B:174:0x0654, B:176:0x065b), top: B:209:0x0648 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0654 A[Catch: all -> 0x067b, TryCatch #17 {all -> 0x067b, blocks: (B:170:0x0648, B:172:0x064d, B:174:0x0654, B:176:0x065b), top: B:209:0x0648 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x0664 A[LOOP:2: B:179:0x0662->B:180:0x0664, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:182:0x066e  */
    /* JADX WARN: Code duplicated, block: B:188:0x067f A[LOOP:3: B:187:0x067d->B:188:0x067f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:190:0x0689  */
    /* JADX WARN: Code duplicated, block: B:228:0x0661 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:? A[RETURN, SYNTHETIC] */
    public final void t(j0 j0Var, Object obj, InterfaceC0479a0 interfaceC0479a0, C0494n c0494n) throws Throwable {
        Q q10;
        int i10;
        int i11;
        InterfaceC0479a0 interfaceC0479a1;
        int i12;
        AbstractC0502w abstractC0502w;
        k0 k0VarB;
        k0 k0Var;
        Q q11 = this;
        Object obj2 = obj;
        InterfaceC0479a0 interfaceC0479a2 = interfaceC0479a0;
        C0494n c0494n2 = c0494n;
        int[] iArr = q11.f6430h;
        int i13 = q11.j;
        int i14 = q11.f6431i;
        k0 k0VarB2 = null;
        while (true) {
            try {
                int iR = interfaceC0479a2.r();
                int iC = q11.C(iR);
                k0 k0Var2 = k0.f6494f;
                if (iC < 0) {
                    if (iR == Integer.MAX_VALUE) {
                        while (i14 < i13) {
                            q11.k(obj2, iArr[i14], k0VarB2);
                            i14++;
                        }
                        if (k0VarB2 != null) {
                            ((l0) j0Var).getClass();
                        }
                    } else {
                        try {
                            j0Var.getClass();
                            if (k0VarB2 == null) {
                                AbstractC0502w abstractC0502w2 = (AbstractC0502w) obj2;
                                k0 k0VarB3 = abstractC0502w2.unknownFields;
                                if (k0VarB3 == k0Var2) {
                                    k0VarB3 = k0.b();
                                    abstractC0502w2.unknownFields = k0VarB3;
                                }
                                k0VarB2 = k0VarB3;
                            }
                            if (!j0Var.a(k0VarB2, interfaceC0479a2)) {
                                while (i14 < i13) {
                                    q11.k(obj2, iArr[i14], k0VarB2);
                                    i14++;
                                }
                                if (k0VarB2 != null) {
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            q10 = q11;
                            i10 = i14;
                            for (i11 = i10; i11 < i13; i11++) {
                                q10.k(obj2, iArr[i11], k0VarB2);
                            }
                            if (k0VarB2 != null) {
                                ((l0) j0Var).getClass();
                                ((AbstractC0502w) obj2).unknownFields = k0VarB2;
                            }
                            throw th;
                        }
                    }
                }
                int iL = q11.L(iC);
                try {
                    int iK = K(iL);
                    F f10 = q11.f6433l;
                    switch (iK) {
                        case 0:
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            q10 = q11;
                            try {
                                try {
                                    t0.f6515d.m(obj, z(iL), interfaceC0479a1.readDouble());
                                    obj2 = obj;
                                    q10.I(iC, obj2);
                                    k0VarB2 = k0Var;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                    obj2 = obj;
                                    k0VarB2 = k0Var;
                                    try {
                                        j0Var.getClass();
                                        if (k0VarB2 == null) {
                                            abstractC0502w = (AbstractC0502w) obj2;
                                            k0VarB = abstractC0502w.unknownFields;
                                            if (k0VarB == k0Var2) {
                                                k0VarB = k0.b();
                                                abstractC0502w.unknownFields = k0VarB;
                                            }
                                            k0VarB2 = k0VarB;
                                        }
                                        if (!j0Var.a(k0VarB2, interfaceC0479a1)) {
                                            for (i12 = i10; i12 < i13; i12++) {
                                                q10.k(obj2, iArr[i12], k0VarB2);
                                            }
                                            if (k0VarB2 != null) {
                                                ((AbstractC0502w) obj2).unknownFields = k0VarB2;
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj;
                                    k0VarB2 = k0Var;
                                    while (i11 < i13) {
                                        q10.k(obj2, iArr[i11], k0VarB2);
                                    }
                                    if (k0VarB2 != null) {
                                        ((l0) j0Var).getClass();
                                        ((AbstractC0502w) obj2).unknownFields = k0VarB2;
                                    }
                                    throw th;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                obj2 = obj;
                            } catch (Throwable th4) {
                                th = th4;
                                obj2 = obj;
                            }
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 1:
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            q10 = q11;
                            t0.f6515d.n(obj2, z(iL), interfaceC0479a1.readFloat());
                            q10.I(iC, obj2);
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 2:
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            q10 = q11;
                            t0.n(obj2, z(iL), interfaceC0479a1.H());
                            q10.I(iC, obj2);
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 3:
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            q10 = q11;
                            t0.n(obj2, z(iL), interfaceC0479a1.e());
                            q10.I(iC, obj2);
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 4:
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            q10 = q11;
                            t0.m(obj2, z(iL), interfaceC0479a1.z());
                            q10.I(iC, obj2);
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 5:
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            q10 = q11;
                            t0.n(obj2, z(iL), interfaceC0479a1.g());
                            q10.I(iC, obj2);
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 6:
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            q10 = q11;
                            t0.m(obj2, z(iL), interfaceC0479a1.p());
                            q10.I(iC, obj2);
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 7:
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            q10 = q11;
                            t0.f6515d.k(obj2, z(iL), interfaceC0479a1.q());
                            q10.I(iC, obj2);
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 8:
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            q10 = q11;
                            q10.F(obj2, iL, interfaceC0479a1);
                            q10.I(iC, obj2);
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 9:
                            interfaceC0479a1 = interfaceC0479a2;
                            C0494n c0494n3 = c0494n2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            q10 = q11;
                            if (q10.q(iC, obj2)) {
                                t0.o(z(iL), obj2, AbstractC0505z.c(t0.f6515d.i(z(iL), obj2), interfaceC0479a1.a(q10.n(iC), c0494n3)));
                            } else {
                                t0.o(z(iL), obj2, interfaceC0479a1.a(q10.n(iC), c0494n3));
                                q10.I(iC, obj2);
                            }
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 10:
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            q10 = q11;
                            t0.o(z(iL), obj2, interfaceC0479a1.w());
                            q10.I(iC, obj2);
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 11:
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            q10 = q11;
                            t0.m(obj2, z(iL), interfaceC0479a1.y());
                            q10.I(iC, obj2);
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            q10 = q11;
                            int iC2 = interfaceC0479a1.c();
                            q10.l(iC);
                            t0.m(obj2, z(iL), iC2);
                            q10.I(iC, obj2);
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            q10 = q11;
                            t0.m(obj2, z(iL), interfaceC0479a1.B());
                            q10.I(iC, obj2);
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            q10 = q11;
                            t0.n(obj2, z(iL), interfaceC0479a1.t());
                            q10.I(iC, obj2);
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 15:
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            q10 = q11;
                            t0.m(obj2, z(iL), interfaceC0479a1.i());
                            q10.I(iC, obj2);
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 16:
                            interfaceC0479a1 = interfaceC0479a2;
                            q10 = q11;
                            try {
                                i10 = i14;
                                k0Var = k0VarB2;
                                try {
                                    t0.n(obj2, z(iL), interfaceC0479a1.l());
                                    q10.I(iC, obj2);
                                    k0VarB2 = k0Var;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                    k0VarB2 = k0Var;
                                    j0Var.getClass();
                                    if (k0VarB2 == null) {
                                        abstractC0502w = (AbstractC0502w) obj2;
                                        k0VarB = abstractC0502w.unknownFields;
                                        if (k0VarB == k0Var2) {
                                            k0VarB = k0.b();
                                            abstractC0502w.unknownFields = k0VarB;
                                        }
                                        k0VarB2 = k0VarB;
                                    }
                                    if (!j0Var.a(k0VarB2, interfaceC0479a1)) {
                                        while (i12 < i13) {
                                            q10.k(obj2, iArr[i12], k0VarB2);
                                        }
                                        if (k0VarB2 != null) {
                                            ((AbstractC0502w) obj2).unknownFields = k0VarB2;
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    k0VarB2 = k0Var;
                                    while (i11 < i13) {
                                        q10.k(obj2, iArr[i11], k0VarB2);
                                    }
                                    if (k0VarB2 != null) {
                                        ((l0) j0Var).getClass();
                                        ((AbstractC0502w) obj2).unknownFields = k0VarB2;
                                    }
                                    throw th;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                i10 = i14;
                                j0Var.getClass();
                                if (k0VarB2 == null) {
                                    abstractC0502w = (AbstractC0502w) obj2;
                                    k0VarB = abstractC0502w.unknownFields;
                                    if (k0VarB == k0Var2) {
                                        k0VarB = k0.b();
                                        abstractC0502w.unknownFields = k0VarB;
                                    }
                                    k0VarB2 = k0VarB;
                                }
                                if (!j0Var.a(k0VarB2, interfaceC0479a1)) {
                                    while (i12 < i13) {
                                        q10.k(obj2, iArr[i12], k0VarB2);
                                    }
                                    if (k0VarB2 != null) {
                                        ((AbstractC0502w) obj2).unknownFields = k0VarB2;
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                i10 = i14;
                                while (i11 < i13) {
                                    q10.k(obj2, iArr[i11], k0VarB2);
                                }
                                if (k0VarB2 != null) {
                                    ((l0) j0Var).getClass();
                                    ((AbstractC0502w) obj2).unknownFields = k0VarB2;
                                }
                                throw th;
                            }
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 17:
                            interfaceC0479a1 = interfaceC0479a2;
                            C0494n c0494n4 = c0494n2;
                            q10 = q11;
                            if (q10.q(iC, obj2)) {
                                t0.o(z(iL), obj2, AbstractC0505z.c(t0.f6515d.i(z(iL), obj2), interfaceC0479a1.M(q10.n(iC), c0494n4)));
                            } else {
                                t0.o(z(iL), obj2, interfaceC0479a1.M(q10.n(iC), c0494n4));
                                q10.I(iC, obj2);
                            }
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 18:
                            interfaceC0479a1 = interfaceC0479a2;
                            q10 = q11;
                            interfaceC0479a1.D(f10.c(z(iL), obj2));
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 19:
                            interfaceC0479a1 = interfaceC0479a2;
                            q10 = q11;
                            interfaceC0479a1.x(f10.c(z(iL), obj2));
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 20:
                            interfaceC0479a1 = interfaceC0479a2;
                            q10 = q11;
                            interfaceC0479a1.F(f10.c(z(iL), obj2));
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case MobileAdsBridge.CODE_21 /* 21 */:
                            interfaceC0479a1 = interfaceC0479a2;
                            q10 = q11;
                            interfaceC0479a1.u(f10.c(z(iL), obj2));
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 22:
                            interfaceC0479a1 = interfaceC0479a2;
                            q10 = q11;
                            interfaceC0479a1.K(f10.c(z(iL), obj2));
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 23:
                            interfaceC0479a1 = interfaceC0479a2;
                            q10 = q11;
                            interfaceC0479a1.J(f10.c(z(iL), obj2));
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 24:
                            interfaceC0479a1 = interfaceC0479a2;
                            q10 = q11;
                            interfaceC0479a1.f(f10.c(z(iL), obj2));
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 25:
                            interfaceC0479a1 = interfaceC0479a2;
                            q10 = q11;
                            interfaceC0479a1.n(f10.c(z(iL), obj2));
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 26:
                            interfaceC0479a1 = interfaceC0479a2;
                            q10 = q11;
                            try {
                                q10.G(obj2, iL, interfaceC0479a1);
                                i10 = i14;
                                k0Var = k0VarB2;
                                k0VarB2 = k0Var;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                i10 = i14;
                                j0Var.getClass();
                                if (k0VarB2 == null) {
                                    abstractC0502w = (AbstractC0502w) obj2;
                                    k0VarB = abstractC0502w.unknownFields;
                                    if (k0VarB == k0Var2) {
                                        k0VarB = k0.b();
                                        abstractC0502w.unknownFields = k0VarB;
                                    }
                                    k0VarB2 = k0VarB;
                                }
                                if (!j0Var.a(k0VarB2, interfaceC0479a1)) {
                                    while (i12 < i13) {
                                        q10.k(obj2, iArr[i12], k0VarB2);
                                    }
                                    if (k0VarB2 != null) {
                                        ((AbstractC0502w) obj2).unknownFields = k0VarB2;
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                i10 = i14;
                                while (i11 < i13) {
                                    q10.k(obj2, iArr[i11], k0VarB2);
                                }
                                if (k0VarB2 != null) {
                                    ((l0) j0Var).getClass();
                                    ((AbstractC0502w) obj2).unknownFields = k0VarB2;
                                }
                                throw th;
                            }
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 27:
                            try {
                                try {
                                    q11.E(obj2, iL, interfaceC0479a2, q11.n(iC), c0494n);
                                    interfaceC0479a1 = interfaceC0479a2;
                                    q10 = q11;
                                    i10 = i14;
                                    k0Var = k0VarB2;
                                    k0VarB2 = k0Var;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                    interfaceC0479a1 = interfaceC0479a2;
                                    q10 = q11;
                                    i10 = i14;
                                    j0Var.getClass();
                                    if (k0VarB2 == null) {
                                        abstractC0502w = (AbstractC0502w) obj2;
                                        k0VarB = abstractC0502w.unknownFields;
                                        if (k0VarB == k0Var2) {
                                            k0VarB = k0.b();
                                            abstractC0502w.unknownFields = k0VarB;
                                        }
                                        k0VarB2 = k0VarB;
                                    }
                                    if (!j0Var.a(k0VarB2, interfaceC0479a1)) {
                                        while (i12 < i13) {
                                            q10.k(obj2, iArr[i12], k0VarB2);
                                        }
                                        if (k0VarB2 != null) {
                                            ((AbstractC0502w) obj2).unknownFields = k0VarB2;
                                            return;
                                        }
                                        return;
                                    }
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                q10 = q11;
                                interfaceC0479a1 = interfaceC0479a2;
                                i10 = i14;
                                j0Var.getClass();
                                if (k0VarB2 == null) {
                                    abstractC0502w = (AbstractC0502w) obj2;
                                    k0VarB = abstractC0502w.unknownFields;
                                    if (k0VarB == k0Var2) {
                                        k0VarB = k0.b();
                                        abstractC0502w.unknownFields = k0VarB;
                                    }
                                    k0VarB2 = k0VarB;
                                }
                                if (!j0Var.a(k0VarB2, interfaceC0479a1)) {
                                    while (i12 < i13) {
                                        q10.k(obj2, iArr[i12], k0VarB2);
                                    }
                                    if (k0VarB2 != null) {
                                        ((AbstractC0502w) obj2).unknownFields = k0VarB2;
                                        return;
                                    }
                                    return;
                                }
                            }
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 28:
                            interfaceC0479a2.C(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 29:
                            interfaceC0479a2.m(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 30:
                            List listC = f10.c(z(iL), obj2);
                            interfaceC0479a2.L(listC);
                            q11.l(iC);
                            AbstractC0483c0.v(iR, listC, k0VarB2, j0Var);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 31:
                            interfaceC0479a2.h(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 32:
                            interfaceC0479a2.G(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 33:
                            interfaceC0479a2.b(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 34:
                            interfaceC0479a2.j(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 35:
                            interfaceC0479a2.D(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 36:
                            interfaceC0479a2.x(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 37:
                            interfaceC0479a2.F(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 38:
                            interfaceC0479a2.u(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 39:
                            interfaceC0479a2.K(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 40:
                            interfaceC0479a2.J(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 41:
                            interfaceC0479a2.f(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 42:
                            interfaceC0479a2.n(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 43:
                            interfaceC0479a2.m(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 44:
                            List listC2 = f10.c(z(iL), obj2);
                            interfaceC0479a2.L(listC2);
                            q11.l(iC);
                            AbstractC0483c0.v(iR, listC2, k0VarB2, j0Var);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 45:
                            interfaceC0479a2.h(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 46:
                            interfaceC0479a2.G(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 47:
                            interfaceC0479a2.b(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 48:
                            interfaceC0479a2.j(f10.c(z(iL), obj2));
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 49:
                            obj2 = obj;
                            try {
                                q11.D(obj2, z(iL), interfaceC0479a0, q11.n(iC), c0494n);
                                interfaceC0479a2 = interfaceC0479a0;
                                q10 = q11;
                                interfaceC0479a1 = interfaceC0479a2;
                                i10 = i14;
                                k0Var = k0VarB2;
                                k0VarB2 = k0Var;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                                q10 = q11;
                                interfaceC0479a1 = interfaceC0479a0;
                                i10 = i14;
                                j0Var.getClass();
                                if (k0VarB2 == null) {
                                    abstractC0502w = (AbstractC0502w) obj2;
                                    k0VarB = abstractC0502w.unknownFields;
                                    if (k0VarB == k0Var2) {
                                        k0VarB = k0.b();
                                        abstractC0502w.unknownFields = k0VarB;
                                    }
                                    k0VarB2 = k0VarB;
                                }
                                if (!j0Var.a(k0VarB2, interfaceC0479a1)) {
                                    while (i12 < i13) {
                                        q10.k(obj2, iArr[i12], k0VarB2);
                                    }
                                    if (k0VarB2 != null) {
                                        ((AbstractC0502w) obj2).unknownFields = k0VarB2;
                                        return;
                                    }
                                    return;
                                }
                            }
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 50:
                            try {
                                q11.u(obj2, iC, q11.m(iC), c0494n2, interfaceC0479a0);
                                obj2 = obj;
                                interfaceC0479a1 = interfaceC0479a0;
                                q10 = q11;
                                i10 = i14;
                                k0Var = k0VarB2;
                                k0VarB2 = k0Var;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused9) {
                                obj2 = obj;
                                interfaceC0479a1 = interfaceC0479a0;
                                q10 = q11;
                                i10 = i14;
                                j0Var.getClass();
                                if (k0VarB2 == null) {
                                    abstractC0502w = (AbstractC0502w) obj2;
                                    k0VarB = abstractC0502w.unknownFields;
                                    if (k0VarB == k0Var2) {
                                        k0VarB = k0.b();
                                        abstractC0502w.unknownFields = k0VarB;
                                    }
                                    k0VarB2 = k0VarB;
                                }
                                if (!j0Var.a(k0VarB2, interfaceC0479a1)) {
                                    while (i12 < i13) {
                                        q10.k(obj2, iArr[i12], k0VarB2);
                                    }
                                    if (k0VarB2 != null) {
                                        ((AbstractC0502w) obj2).unknownFields = k0VarB2;
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                obj2 = obj;
                                q10 = q11;
                                i10 = i14;
                                while (i11 < i13) {
                                    q10.k(obj2, iArr[i11], k0VarB2);
                                }
                                if (k0VarB2 != null) {
                                    ((l0) j0Var).getClass();
                                    ((AbstractC0502w) obj2).unknownFields = k0VarB2;
                                }
                                throw th;
                            }
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 51:
                            t0.o(z(iL), obj2, Double.valueOf(interfaceC0479a2.readDouble()));
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 52:
                            t0.o(z(iL), obj2, Float.valueOf(interfaceC0479a2.readFloat()));
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 53:
                            t0.o(z(iL), obj2, Long.valueOf(interfaceC0479a2.H()));
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 54:
                            t0.o(z(iL), obj2, Long.valueOf(interfaceC0479a2.e()));
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 55:
                            t0.o(z(iL), obj2, Integer.valueOf(interfaceC0479a2.z()));
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 56:
                            t0.o(z(iL), obj2, Long.valueOf(interfaceC0479a2.g()));
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 57:
                            t0.o(z(iL), obj2, Integer.valueOf(interfaceC0479a2.p()));
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 58:
                            t0.o(z(iL), obj2, Boolean.valueOf(interfaceC0479a2.q()));
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 59:
                            q11.F(obj2, iL, interfaceC0479a2);
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 60:
                            if (q11.r(iR, iC, obj2)) {
                                t0.o(z(iL), obj2, AbstractC0505z.c(t0.f6515d.i(z(iL), obj2), interfaceC0479a2.a(q11.n(iC), c0494n2)));
                            } else {
                                t0.o(z(iL), obj2, interfaceC0479a2.a(q11.n(iC), c0494n2));
                                q11.I(iC, obj2);
                            }
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 61:
                            t0.o(z(iL), obj2, interfaceC0479a2.w());
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 62:
                            t0.o(z(iL), obj2, Integer.valueOf(interfaceC0479a2.y()));
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 63:
                            int iC3 = interfaceC0479a2.c();
                            q11.l(iC);
                            t0.o(z(iL), obj2, Integer.valueOf(iC3));
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 64:
                            t0.o(z(iL), obj2, Integer.valueOf(interfaceC0479a2.B()));
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 65:
                            t0.o(z(iL), obj2, Long.valueOf(interfaceC0479a2.t()));
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 66:
                            t0.o(z(iL), obj2, Integer.valueOf(interfaceC0479a2.i()));
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 67:
                            t0.o(z(iL), obj2, Long.valueOf(interfaceC0479a2.l()));
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        case 68:
                            t0.o(z(iL), obj2, interfaceC0479a2.M(q11.n(iC), c0494n2));
                            q11.J(iR, iC, obj2);
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            k0Var = k0VarB2;
                            k0VarB2 = k0Var;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                        default:
                            if (k0VarB2 == null) {
                                try {
                                    k0VarB2 = j0Var.b();
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused10) {
                                    q10 = q11;
                                    interfaceC0479a1 = interfaceC0479a2;
                                    i10 = i14;
                                    j0Var.getClass();
                                    if (k0VarB2 == null) {
                                        abstractC0502w = (AbstractC0502w) obj2;
                                        k0VarB = abstractC0502w.unknownFields;
                                        if (k0VarB == k0Var2) {
                                            k0VarB = k0.b();
                                            abstractC0502w.unknownFields = k0VarB;
                                        }
                                        k0VarB2 = k0VarB;
                                    }
                                    if (!j0Var.a(k0VarB2, interfaceC0479a1)) {
                                        while (i12 < i13) {
                                            q10.k(obj2, iArr[i12], k0VarB2);
                                        }
                                        if (k0VarB2 != null) {
                                            ((AbstractC0502w) obj2).unknownFields = k0VarB2;
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            if (!j0Var.a(k0VarB2, interfaceC0479a2)) {
                                while (i14 < i13) {
                                    q11.k(obj2, iArr[i14], k0VarB2);
                                    i14++;
                                }
                            }
                            q10 = q11;
                            interfaceC0479a1 = interfaceC0479a2;
                            i10 = i14;
                            c0494n2 = c0494n;
                            q11 = q10;
                            i14 = i10;
                            interfaceC0479a2 = interfaceC0479a1;
                            break;
                    }
                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused11) {
                    q10 = q11;
                    interfaceC0479a1 = interfaceC0479a2;
                }
            } catch (Throwable th9) {
                th = th9;
                q10 = q11;
            }
            while (i11 < i13) {
                q10.k(obj2, iArr[i11], k0VarB2);
            }
            if (k0VarB2 != null) {
                ((l0) j0Var).getClass();
                ((AbstractC0502w) obj2).unknownFields = k0VarB2;
            }
            throw th;
        }
        ((AbstractC0502w) obj2).unknownFields = k0VarB2;
    }

    public final void u(Object obj, int i10, Object obj2, C0494n c0494n, InterfaceC0479a0 interfaceC0479a0) {
        long jL = L(i10) & 1048575;
        Object objI = t0.f6515d.i(jL, obj);
        M m2 = this.f6435n;
        if (objI == null) {
            m2.getClass();
            objI = L.f6418t.c();
            t0.o(jL, obj, objI);
        } else {
            m2.getClass();
            if (!((L) objI).f6419s) {
                L lC = L.f6418t.c();
                M.b(lC, objI);
                t0.o(jL, obj, lC);
                objI = lC;
            }
        }
        m2.getClass();
        interfaceC0479a0.k((L) objI, ((K) obj2).a, c0494n);
    }

    public final void v(AbstractC0502w abstractC0502w, AbstractC0502w abstractC0502w2, int i10) {
        long jL = L(i10) & 1048575;
        if (q(i10, abstractC0502w2)) {
            s0 s0Var = t0.f6515d;
            Object objI = s0Var.i(jL, abstractC0502w);
            Object objI2 = s0Var.i(jL, abstractC0502w2);
            if (objI != null && objI2 != null) {
                t0.o(jL, abstractC0502w, AbstractC0505z.c(objI, objI2));
                I(i10, abstractC0502w);
            } else if (objI2 != null) {
                t0.o(jL, abstractC0502w, objI2);
                I(i10, abstractC0502w);
            }
        }
    }

    public final void w(AbstractC0502w abstractC0502w, AbstractC0502w abstractC0502w2, int i10) {
        int iL = L(i10);
        int i11 = this.a[i10];
        long j = iL & 1048575;
        if (r(i11, i10, abstractC0502w2)) {
            s0 s0Var = t0.f6515d;
            Object objI = s0Var.i(j, abstractC0502w);
            Object objI2 = s0Var.i(j, abstractC0502w2);
            if (objI != null && objI2 != null) {
                t0.o(j, abstractC0502w, AbstractC0505z.c(objI, objI2));
                J(i11, i10, abstractC0502w);
            } else if (objI2 != null) {
                t0.o(j, abstractC0502w, objI2);
                J(i11, i10, abstractC0502w);
            }
        }
    }
}
