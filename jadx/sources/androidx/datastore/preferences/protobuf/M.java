package androidx.datastore.preferences.protobuf;

import java.util.Map;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class M {
    /* JADX WARN: Code duplicated, block: B:44:0x0128  */
    /* JADX WARN: Code duplicated, block: B:49:0x0136  */
    /* JADX WARN: Code duplicated, block: B:50:0x0146  */
    /* JADX WARN: Code duplicated, block: B:51:0x0157  */
    /* JADX WARN: Code duplicated, block: B:52:0x015e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0166  */
    /* JADX WARN: Code duplicated, block: B:55:0x0172  */
    /* JADX WARN: Code duplicated, block: B:56:0x017e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0182  */
    /* JADX WARN: Code duplicated, block: B:59:0x018a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0194  */
    /* JADX WARN: Code duplicated, block: B:62:0x019f  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130 A[SYNTHETIC] */
    public static int a(Object obj, int i10, Object obj2) {
        int iA;
        int iA2;
        int iZ;
        int i11;
        int iY;
        z0 z0Var;
        int iA3;
        int iZ2;
        L l4 = (L) obj;
        K k3 = (K) obj2;
        int iF = 0;
        if (l4.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : l4.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            k3.getClass();
            int iY2 = C0491k.y(i10);
            J j = k3.a;
            int i12 = C0497q.f6504c;
            int iY3 = C0491k.y(1);
            y0 y0Var = B0.f6397v;
            x0 x0Var = j.a;
            if (x0Var == y0Var) {
                iY3 *= 2;
            }
            int iA4 = 8;
            switch (x0Var.ordinal()) {
                case 0:
                    ((Double) key).getClass();
                    iA = 8;
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i13 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i13, i13, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i14 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i14, i14, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i15 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i15, i15, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i16 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i16, i16, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i17 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i17, i17, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i18 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i18, i18, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i19 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i19, i19, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i110, i110, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111, i111, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i112, i112, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i113, i113, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i114, i114, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i115, i115, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i116, i116, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i117, i117, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i118, i118, iY2, iF);
                            break;
                        case 16:
                            int iIntValue = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue >> 31) ^ (iIntValue << 1));
                            int i119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i119, i119, iY2, iF);
                            break;
                        case 17:
                            long jLongValue = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue >> 63) ^ (jLongValue << 1));
                            int i1110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1110, i1110, iY2, iF);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 1:
                    ((Float) key).getClass();
                    iA = 4;
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i1111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111, i1111, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i1112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1112, i1112, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i1113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1113, i1113, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i1114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1114, i1114, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i1115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1115, i1115, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i1116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1116, i1116, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i1117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1117, i1117, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i1118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1118, i1118, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i1119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1119, i1119, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i11110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11110, i11110, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i11111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111, i11111, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i11112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11112, i11112, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i11113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11113, i11113, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i11114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11114, i11114, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i11115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11115, i11115, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i11116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11116, i11116, iY2, iF);
                            break;
                        case 16:
                            int iIntValue2 = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                            int i11117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11117, i11117, iY2, iF);
                            break;
                        case 17:
                            long jLongValue2 = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                            int i11118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11118, i11118, iY2, iF);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 2:
                    iA = C0491k.A(((Long) key).longValue());
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i11119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11119, i11119, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111110, i111110, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111, i111111, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111112, i111112, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111113, i111113, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111114, i111114, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111115, i111115, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111116, i111116, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111117, i111117, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111118, i111118, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111119, i111119, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i1111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111110, i1111110, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i1111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111, i1111111, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i1111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111112, i1111112, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i1111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111113, i1111113, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i1111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111114, i1111114, iY2, iF);
                            break;
                        case 16:
                            int iIntValue3 = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                            int i1111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111115, i1111115, iY2, iF);
                            break;
                        case 17:
                            long jLongValue3 = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                            int i1111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111116, i1111116, iY2, iF);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 3:
                    iA = C0491k.A(((Long) key).longValue());
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i1111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111117, i1111117, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i1111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111118, i1111118, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i1111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111119, i1111119, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i11111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111110, i11111110, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i11111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111, i11111111, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i11111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111112, i11111112, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i11111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111113, i11111113, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i11111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111114, i11111114, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i11111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111115, i11111115, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i11111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111116, i11111116, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i11111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111117, i11111117, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i11111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111118, i11111118, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i11111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111119, i11111119, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111110, i111111110, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111, i111111111, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111112, i111111112, iY2, iF);
                            break;
                        case 16:
                            int iIntValue4 = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                            int i111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111113, i111111113, iY2, iF);
                            break;
                        case 17:
                            long jLongValue4 = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                            int i111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111114, i111111114, iY2, iF);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 4:
                    iA = C0491k.w(((Integer) key).intValue());
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111115, i111111115, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111116, i111111116, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111117, i111111117, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111118, i111111118, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111119, i111111119, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i1111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111110, i1111111110, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i1111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111, i1111111111, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i1111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111112, i1111111112, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i1111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111113, i1111111113, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i1111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111114, i1111111114, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i1111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111115, i1111111115, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i1111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111116, i1111111116, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i1111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111117, i1111111117, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i1111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111118, i1111111118, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i1111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111119, i1111111119, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i11111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111110, i11111111110, iY2, iF);
                            break;
                        case 16:
                            int iIntValue5 = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                            int i11111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111, i11111111111, iY2, iF);
                            break;
                        case 17:
                            long jLongValue5 = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                            int i11111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111112, i11111111112, iY2, iF);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 5:
                    ((Long) key).getClass();
                    iA = 8;
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i11111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111113, i11111111113, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i11111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111114, i11111111114, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i11111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111115, i11111111115, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i11111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111116, i11111111116, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i11111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111117, i11111111117, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i11111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111118, i11111111118, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i11111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111119, i11111111119, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111110, i111111111110, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111, i111111111111, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111112, i111111111112, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111113, i111111111113, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111114, i111111111114, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111115, i111111111115, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111116, i111111111116, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111117, i111111111117, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111118, i111111111118, iY2, iF);
                            break;
                        case 16:
                            int iIntValue6 = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                            int i111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111119, i111111111119, iY2, iF);
                            break;
                        case 17:
                            long jLongValue6 = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                            int i1111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111110, i1111111111110, iY2, iF);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 6:
                    ((Integer) key).getClass();
                    iA = 4;
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i1111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111, i1111111111111, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i1111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111112, i1111111111112, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i1111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111113, i1111111111113, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i1111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111114, i1111111111114, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i1111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111115, i1111111111115, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i1111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111116, i1111111111116, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i1111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111117, i1111111111117, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i1111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111118, i1111111111118, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i1111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111119, i1111111111119, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i11111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111110, i11111111111110, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i11111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111, i11111111111111, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i11111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111112, i11111111111112, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i11111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111113, i11111111111113, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i11111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111114, i11111111111114, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i11111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111115, i11111111111115, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i11111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111116, i11111111111116, iY2, iF);
                            break;
                        case 16:
                            int iIntValue7 = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                            int i11111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111117, i11111111111117, iY2, iF);
                            break;
                        case 17:
                            long jLongValue7 = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                            int i11111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111118, i11111111111118, iY2, iF);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 7:
                    ((Boolean) key).getClass();
                    iA = 1;
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i11111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111119, i11111111111119, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111110, i111111111111110, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111, i111111111111111, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111112, i111111111111112, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111113, i111111111111113, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111114, i111111111111114, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111115, i111111111111115, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111116, i111111111111116, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111117, i111111111111117, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111118, i111111111111118, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111119, i111111111111119, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i1111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111110, i1111111111111110, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i1111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111, i1111111111111111, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i1111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111112, i1111111111111112, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i1111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111113, i1111111111111113, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i1111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111114, i1111111111111114, iY2, iF);
                            break;
                        case 16:
                            int iIntValue8 = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                            int i1111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111115, i1111111111111115, iY2, iF);
                            break;
                        case 17:
                            long jLongValue8 = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                            int i1111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111116, i1111111111111116, iY2, iF);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 8:
                    iA = key instanceof C0488h ? C0491k.s((C0488h) key) : C0491k.x((String) key);
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i1111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111117, i1111111111111117, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i1111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111118, i1111111111111118, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i1111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111119, i1111111111111119, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i11111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111110, i11111111111111110, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i11111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111, i11111111111111111, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i11111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111112, i11111111111111112, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i11111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111113, i11111111111111113, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i11111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111114, i11111111111111114, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i11111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111115, i11111111111111115, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i11111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111116, i11111111111111116, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i11111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111117, i11111111111111117, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i11111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111118, i11111111111111118, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i11111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111119, i11111111111111119, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i111111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111110, i111111111111111110, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i111111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111, i111111111111111111, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i111111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111112, i111111111111111112, iY2, iF);
                            break;
                        case 16:
                            int iIntValue9 = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                            int i111111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111113, i111111111111111113, iY2, iF);
                            break;
                        case 17:
                            long jLongValue9 = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                            int i111111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111114, i111111111111111114, iY2, iF);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 9:
                    iA = ((AbstractC0478a) key).a();
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i111111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111115, i111111111111111115, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i111111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111116, i111111111111111116, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i111111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111117, i111111111111111117, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i111111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111118, i111111111111111118, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i111111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111119, i111111111111111119, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i1111111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111110, i1111111111111111110, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i1111111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111, i1111111111111111111, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i1111111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111112, i1111111111111111112, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i1111111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111113, i1111111111111111113, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i1111111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111114, i1111111111111111114, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i1111111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111115, i1111111111111111115, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i1111111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111116, i1111111111111111116, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i1111111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111117, i1111111111111111117, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i1111111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111118, i1111111111111111118, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i1111111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111119, i1111111111111111119, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i11111111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111110, i11111111111111111110, iY2, iF);
                            break;
                        case 16:
                            int iIntValue10 = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                            int i11111111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111, i11111111111111111111, iY2, iF);
                            break;
                        case 17:
                            long jLongValue10 = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                            int i11111111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111112, i11111111111111111112, iY2, iF);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 10:
                    iA2 = ((AbstractC0478a) key).a();
                    iZ = C0491k.z(iA2);
                    iA = iA2 + iZ;
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i11111111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111113, i11111111111111111113, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i11111111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111114, i11111111111111111114, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i11111111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111115, i11111111111111111115, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i11111111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111116, i11111111111111111116, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i11111111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111117, i11111111111111111117, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i11111111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111118, i11111111111111111118, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i11111111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111119, i11111111111111111119, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i111111111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111110, i111111111111111111110, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i111111111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111, i111111111111111111111, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i111111111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111112, i111111111111111111112, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i111111111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111113, i111111111111111111113, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i111111111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111114, i111111111111111111114, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i111111111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111115, i111111111111111111115, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i111111111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111116, i111111111111111111116, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i111111111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111117, i111111111111111111117, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i111111111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111118, i111111111111111111118, iY2, iF);
                            break;
                        case 16:
                            int iIntValue11 = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                            int i111111111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111119, i111111111111111111119, iY2, iF);
                            break;
                        case 17:
                            long jLongValue11 = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                            int i1111111111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111110, i1111111111111111111110, iY2, iF);
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
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i1111111111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111, i1111111111111111111111, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i1111111111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111112, i1111111111111111111112, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i1111111111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111113, i1111111111111111111113, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i1111111111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111114, i1111111111111111111114, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i1111111111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111115, i1111111111111111111115, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i1111111111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111116, i1111111111111111111116, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i1111111111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111117, i1111111111111111111117, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i1111111111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111118, i1111111111111111111118, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i1111111111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111119, i1111111111111111111119, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i11111111111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111110, i11111111111111111111110, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i11111111111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111, i11111111111111111111111, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i11111111111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111112, i11111111111111111111112, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i11111111111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111113, i11111111111111111111113, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i11111111111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111114, i11111111111111111111114, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i11111111111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111115, i11111111111111111111115, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i11111111111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111116, i11111111111111111111116, iY2, iF);
                            break;
                        case 16:
                            int iIntValue12 = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                            int i11111111111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111117, i11111111111111111111117, iY2, iF);
                            break;
                        case 17:
                            long jLongValue12 = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                            int i11111111111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111118, i11111111111111111111118, iY2, iF);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    iA = C0491k.z(((Integer) key).intValue());
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i11111111111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111119, i11111111111111111111119, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i111111111111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111110, i111111111111111111111110, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i111111111111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111, i111111111111111111111111, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i111111111111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111112, i111111111111111111111112, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i111111111111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111113, i111111111111111111111113, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i111111111111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111114, i111111111111111111111114, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i111111111111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111115, i111111111111111111111115, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i111111111111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111116, i111111111111111111111116, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i111111111111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111117, i111111111111111111111117, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i111111111111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111118, i111111111111111111111118, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i111111111111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111119, i111111111111111111111119, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i1111111111111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111110, i1111111111111111111111110, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i1111111111111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111, i1111111111111111111111111, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i1111111111111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111112, i1111111111111111111111112, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i1111111111111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111113, i1111111111111111111111113, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i1111111111111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111114, i1111111111111111111111114, iY2, iF);
                            break;
                        case 16:
                            int iIntValue13 = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                            int i1111111111111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111115, i1111111111111111111111115, iY2, iF);
                            break;
                        case 17:
                            long jLongValue13 = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                            int i1111111111111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111116, i1111111111111111111111116, iY2, iF);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    iA = C0491k.w(((Integer) key).intValue());
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i1111111111111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111117, i1111111111111111111111117, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i1111111111111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111118, i1111111111111111111111118, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i1111111111111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111119, i1111111111111111111111119, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i11111111111111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111110, i11111111111111111111111110, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i11111111111111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111, i11111111111111111111111111, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i11111111111111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111112, i11111111111111111111111112, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i11111111111111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111113, i11111111111111111111111113, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i11111111111111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111114, i11111111111111111111111114, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i11111111111111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111115, i11111111111111111111111115, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i11111111111111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111116, i11111111111111111111111116, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i11111111111111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111117, i11111111111111111111111117, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i11111111111111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111118, i11111111111111111111111118, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i11111111111111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111119, i11111111111111111111111119, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i111111111111111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111110, i111111111111111111111111110, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i111111111111111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111, i111111111111111111111111111, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i111111111111111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111112, i111111111111111111111111112, iY2, iF);
                            break;
                        case 16:
                            int iIntValue14 = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                            int i111111111111111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111113, i111111111111111111111111113, iY2, iF);
                            break;
                        case 17:
                            long jLongValue14 = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                            int i111111111111111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111114, i111111111111111111111111114, iY2, iF);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    ((Integer) key).getClass();
                    iA = 4;
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i111111111111111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111115, i111111111111111111111111115, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i111111111111111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111116, i111111111111111111111111116, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i111111111111111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111117, i111111111111111111111111117, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i111111111111111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111118, i111111111111111111111111118, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i111111111111111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111119, i111111111111111111111111119, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i1111111111111111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111110, i1111111111111111111111111110, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i1111111111111111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111, i1111111111111111111111111111, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i1111111111111111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111112, i1111111111111111111111111112, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i1111111111111111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111113, i1111111111111111111111111113, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i1111111111111111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111114, i1111111111111111111111111114, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i1111111111111111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111115, i1111111111111111111111111115, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i1111111111111111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111116, i1111111111111111111111111116, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i1111111111111111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111117, i1111111111111111111111111117, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i1111111111111111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111118, i1111111111111111111111111118, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i1111111111111111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111119, i1111111111111111111111111119, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i11111111111111111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111110, i11111111111111111111111111110, iY2, iF);
                            break;
                        case 16:
                            int iIntValue15 = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                            int i11111111111111111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111111, i11111111111111111111111111111, iY2, iF);
                            break;
                        case 17:
                            long jLongValue15 = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                            int i11111111111111111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111112, i11111111111111111111111111112, iY2, iF);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 15:
                    ((Long) key).getClass();
                    iA = 8;
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i11111111111111111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111113, i11111111111111111111111111113, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i11111111111111111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111114, i11111111111111111111111111114, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i11111111111111111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111115, i11111111111111111111111111115, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i11111111111111111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111116, i11111111111111111111111111116, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i11111111111111111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111117, i11111111111111111111111111117, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i11111111111111111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111118, i11111111111111111111111111118, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i11111111111111111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111119, i11111111111111111111111111119, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i111111111111111111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111110, i111111111111111111111111111110, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i111111111111111111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111111, i111111111111111111111111111111, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i111111111111111111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111112, i111111111111111111111111111112, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i111111111111111111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111113, i111111111111111111111111111113, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i111111111111111111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111114, i111111111111111111111111111114, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i111111111111111111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111115, i111111111111111111111111111115, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i111111111111111111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111116, i111111111111111111111111111116, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i111111111111111111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111117, i111111111111111111111111111117, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i111111111111111111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111118, i111111111111111111111111111118, iY2, iF);
                            break;
                        case 16:
                            int iIntValue16 = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                            int i111111111111111111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111119, i111111111111111111111111111119, iY2, iF);
                            break;
                        case 17:
                            long jLongValue16 = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                            int i1111111111111111111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111110, i1111111111111111111111111111110, iY2, iF);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 16:
                    int iIntValue17 = ((Integer) key).intValue();
                    iA = C0491k.z((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i1111111111111111111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111111, i1111111111111111111111111111111, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i1111111111111111111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111112, i1111111111111111111111111111112, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i1111111111111111111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111113, i1111111111111111111111111111113, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i1111111111111111111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111114, i1111111111111111111111111111114, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i1111111111111111111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111115, i1111111111111111111111111111115, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i1111111111111111111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111116, i1111111111111111111111111111116, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i1111111111111111111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111117, i1111111111111111111111111111117, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i1111111111111111111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111118, i1111111111111111111111111111118, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i1111111111111111111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111119, i1111111111111111111111111111119, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i11111111111111111111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111111110, i11111111111111111111111111111110, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i11111111111111111111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111111111, i11111111111111111111111111111111, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i11111111111111111111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111111112, i11111111111111111111111111111112, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i11111111111111111111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111111113, i11111111111111111111111111111113, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i11111111111111111111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111111114, i11111111111111111111111111111114, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i11111111111111111111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111111115, i11111111111111111111111111111115, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i11111111111111111111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111111116, i11111111111111111111111111111116, iY2, iF);
                            break;
                        case 16:
                            int iIntValue18 = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                            int i11111111111111111111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111111117, i11111111111111111111111111111117, iY2, iF);
                            break;
                        case 17:
                            long jLongValue17 = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                            int i11111111111111111111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111111118, i11111111111111111111111111111118, iY2, iF);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 17:
                    long jLongValue18 = ((Long) key).longValue();
                    iA = C0491k.A((jLongValue18 << 1) ^ (jLongValue18 >> 63));
                    i11 = iA + iY3;
                    iY = C0491k.y(2);
                    z0Var = j.f6416b;
                    if (z0Var == y0Var) {
                        iY *= 2;
                    }
                    switch (z0Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            int i11111111111111111111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i11111111111111111111111111111119, i11111111111111111111111111111119, iY2, iF);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA4 = 4;
                            int i111111111111111111111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111111110, i111111111111111111111111111111110, iY2, iF);
                            break;
                        case 2:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i111111111111111111111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111111111, i111111111111111111111111111111111, iY2, iF);
                            break;
                        case 3:
                            iA4 = C0491k.A(((Long) value).longValue());
                            int i111111111111111111111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111111112, i111111111111111111111111111111112, iY2, iF);
                            break;
                        case 4:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i111111111111111111111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111111113, i111111111111111111111111111111113, iY2, iF);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            int i111111111111111111111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111111114, i111111111111111111111111111111114, iY2, iF);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i111111111111111111111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111111115, i111111111111111111111111111111115, iY2, iF);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iA4 = 1;
                            int i111111111111111111111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111111116, i111111111111111111111111111111116, iY2, iF);
                            break;
                        case 8:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA4 = C0491k.x((String) value);
                            }
                            int i111111111111111111111111111111117 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111111117, i111111111111111111111111111111117, iY2, iF);
                            break;
                        case 9:
                            iA4 = ((AbstractC0478a) value).a();
                            int i111111111111111111111111111111118 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111111118, i111111111111111111111111111111118, iY2, iF);
                            break;
                        case 10:
                            iA3 = ((AbstractC0478a) value).a();
                            iZ2 = C0491k.z(iA3);
                            iA4 = iZ2 + iA3;
                            int i111111111111111111111111111111119 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i111111111111111111111111111111119, i111111111111111111111111111111119, iY2, iF);
                            break;
                        case 11:
                            if (value instanceof C0488h) {
                                iA4 = C0491k.s((C0488h) value);
                            } else {
                                iA3 = ((byte[]) value).length;
                                iZ2 = C0491k.z(iA3);
                                iA4 = iZ2 + iA3;
                            }
                            int i1111111111111111111111111111111110 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111111110, i1111111111111111111111111111111110, iY2, iF);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            iA4 = C0491k.z(((Integer) value).intValue());
                            int i1111111111111111111111111111111111 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111111111, i1111111111111111111111111111111111, iY2, iF);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            iA4 = C0491k.w(((Integer) value).intValue());
                            int i1111111111111111111111111111111112 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111111112, i1111111111111111111111111111111112, iY2, iF);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ((Integer) value).getClass();
                            iA4 = 4;
                            int i1111111111111111111111111111111113 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111111113, i1111111111111111111111111111111113, iY2, iF);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            int i1111111111111111111111111111111114 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111111114, i1111111111111111111111111111111114, iY2, iF);
                            break;
                        case 16:
                            int iIntValue19 = ((Integer) value).intValue();
                            iA4 = C0491k.z((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                            int i1111111111111111111111111111111115 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111111115, i1111111111111111111111111111111115, iY2, iF);
                            break;
                        case 17:
                            long jLongValue19 = ((Long) value).longValue();
                            iA4 = C0491k.A((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                            int i1111111111111111111111111111111116 = iA4 + iY + i11;
                            iF = AbstractC0487g.f(i1111111111111111111111111111111116, i1111111111111111111111111111111116, iY2, iF);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                default:
                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
        return iF;
    }

    public static L b(Object obj, Object obj2) {
        L lC = (L) obj;
        L l4 = (L) obj2;
        if (!l4.isEmpty()) {
            if (!lC.f6419s) {
                lC = lC.c();
            }
            lC.a();
            if (!l4.isEmpty()) {
                lC.putAll(l4);
            }
        }
        return lC;
    }
}
