package com.google.android.gms.internal.measurement;

import A3.AbstractC0113k;
import A3.AbstractC0119q;
import A3.AbstractC0121t;
import A3.C0111i;
import A3.C0115m;
import A3.C0122u;
import A3.C0123v;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class zzhm {
    public static final /* synthetic */ int a = 0;

    static {
        D3.b.v(new z3.d() { // from class: com.google.android.gms.internal.measurement.zzho
            /* JADX WARN: Code duplicated, block: B:36:0x00be  */
            /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
            /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
            /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
            /* JADX WARN: Code duplicated, block: B:47:0x00f3  */
            /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
            /* JADX WARN: Code duplicated, block: B:50:0x00fa A[FALL_THROUGH, PHI: r11
              0x00fa: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:42:0x00e0, B:49:0x00f8, B:46:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:76:0x0178  */
            /* JADX WARN: Code duplicated, block: B:91:0x012f A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:92:0x00e3 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:93:0x0127 A[SYNTHETIC] */
            @Override // java.util.function.Supplier
            public final Object get() {
                AbstractC0121t w2;
                C0123v c0123v;
                AbstractC0113k y6;
                Object[] array;
                int length;
                RoundingMode roundingMode;
                int iSqrt;
                int i10;
                int i11 = zzhm.a;
                int i12 = A3.O.a;
                Set<Map.Entry> setEntrySet = new LinkedHashMap().entrySet();
                if (setEntrySet.isEmpty()) {
                    return C0111i.f268s;
                }
                Map.Entry[] entryArr = new Map.Entry[setEntrySet.size()];
                int i13 = 0;
                int size = 0;
                int i14 = 0;
                for (Map.Entry entry : setEntrySet) {
                    Object key = entry.getKey();
                    Collection collection = (Collection) entry.getValue();
                    int i15 = A3.F.f227t;
                    if ((collection instanceof A3.F) && !(collection instanceof SortedSet)) {
                        y6 = (A3.F) collection;
                        if (y6.m()) {
                            array = collection.toArray();
                            if (collection instanceof Set) {
                                y6 = A3.F.q(array.length, array.length, array);
                            } else {
                                length = array.length;
                                roundingMode = RoundingMode.CEILING;
                                if (length >= 0) {
                                    throw new IllegalArgumentException(E0.a.g("x (", length, ") must be >= 0"));
                                }
                                iSqrt = (int) Math.sqrt(length);
                                switch (B3.a.a[roundingMode.ordinal()]) {
                                    case 1:
                                        if (iSqrt * iSqrt != length) {
                                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                        }
                                    case 2:
                                    case 3:
                                        y6 = A3.F.q(length, Math.max(4, iSqrt), array);
                                        break;
                                    case 4:
                                    case 5:
                                        i10 = iSqrt * iSqrt;
                                        iSqrt += (~(~(i10 - length))) >>> 31;
                                        y6 = A3.F.q(length, Math.max(4, iSqrt), array);
                                        break;
                                    case 6:
                                    case 7:
                                    case 8:
                                        i10 = (iSqrt * iSqrt) + iSqrt;
                                        iSqrt += (~(~(i10 - length))) >>> 31;
                                        y6 = A3.F.q(length, Math.max(4, iSqrt), array);
                                        break;
                                    default:
                                        throw new AssertionError();
                                }
                            }
                        }
                    } else if (collection instanceof EnumSet) {
                        EnumSet enumSetCopyOf = EnumSet.copyOf((EnumSet) collection);
                        int size2 = enumSetCopyOf.size();
                        if (size2 == 0) {
                            y6 = A3.V.f246A;
                        } else if (size2 != 1) {
                            y6 = new C0115m(enumSetCopyOf);
                        } else {
                            Iterator it = enumSetCopyOf.iterator();
                            Object next = it.next();
                            if (it.hasNext()) {
                                StringBuilder sb = new StringBuilder("expected one element but was: <");
                                sb.append(next);
                                while (i13 < 4 && it.hasNext()) {
                                    sb.append(", ");
                                    sb.append(it.next());
                                    i13++;
                                }
                                if (it.hasNext()) {
                                    sb.append(", ...");
                                }
                                sb.append('>');
                                throw new IllegalArgumentException(sb.toString());
                            }
                            y6 = new A3.Y((Enum) next);
                        }
                    } else {
                        array = collection.toArray();
                        if (collection instanceof Set) {
                            y6 = A3.F.q(array.length, array.length, array);
                        } else {
                            length = array.length;
                            roundingMode = RoundingMode.CEILING;
                            if (length >= 0) {
                                throw new IllegalArgumentException(E0.a.g("x (", length, ") must be >= 0"));
                            }
                            iSqrt = (int) Math.sqrt(length);
                            switch (B3.a.a[roundingMode.ordinal()]) {
                                case 1:
                                    if (iSqrt * iSqrt != length) {
                                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                    }
                                case 2:
                                case 3:
                                    y6 = A3.F.q(length, Math.max(4, iSqrt), array);
                                    break;
                                case 4:
                                case 5:
                                    i10 = iSqrt * iSqrt;
                                    iSqrt += (~(~(i10 - length))) >>> 31;
                                    y6 = A3.F.q(length, Math.max(4, iSqrt), array);
                                    break;
                                case 6:
                                case 7:
                                case 8:
                                    i10 = (iSqrt * iSqrt) + iSqrt;
                                    iSqrt += (~(~(i10 - length))) >>> 31;
                                    y6 = A3.F.q(length, Math.max(4, iSqrt), array);
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                        }
                    }
                    if (!y6.isEmpty()) {
                        int i16 = i14 + 1;
                        if (i16 > entryArr.length) {
                            entryArr = (Map.Entry[]) Arrays.copyOf(entryArr, C8.E.k(entryArr.length, i16));
                        }
                        entryArr[i14] = new C0123v(key, y6);
                        size += y6.size();
                        i14 = i16;
                    }
                }
                if (i14 == 0) {
                    w2 = A3.U.f242z;
                } else if (i14 != 1) {
                    A3.U u3 = A3.U.f242z;
                    C4.a.d(i14, entryArr.length);
                    if (i14 == 0) {
                        w2 = A3.U.f242z;
                    } else {
                        try {
                            w2 = A3.U.h(i14, entryArr);
                        } catch (A3.S unused) {
                            HashMap map = new HashMap(J7.a.b(i14));
                            while (i13 < i14) {
                                Map.Entry entry2 = entryArr[i13];
                                Objects.requireNonNull(entry2);
                                Object key2 = entry2.getKey();
                                Object value = entry2.getValue();
                                if (entry2 instanceof C0123v) {
                                    c0123v = (C0123v) entry2;
                                    if (c0123v instanceof C0122u) {
                                        c0123v = new C0123v(key2, value);
                                    }
                                } else {
                                    c0123v = new C0123v(key2, value);
                                }
                                entryArr[i13] = c0123v;
                                Object objPut = map.put(c0123v.f270s, c0123v.getValue());
                                if (objPut != null) {
                                    throw AbstractC0121t.a(entryArr[i13], entryArr[i13].getKey() + "=" + objPut);
                                }
                                i13++;
                            }
                            w2 = new A3.M(map, AbstractC0119q.o(i14, entryArr));
                        }
                    }
                } else {
                    Map.Entry entry3 = entryArr[0];
                    Objects.requireNonNull(entry3);
                    w2 = new A3.W(entry3.getKey(), entry3.getValue());
                }
                return new A3.G(w2, size);
            }
        });
    }
}
