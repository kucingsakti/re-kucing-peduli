package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {
    public static final e0 a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f6421b = new f0();

    public static void a(byte b3, byte b7, byte b10, byte b11, char[] cArr, int i10) throws InvalidProtocolBufferException {
        if (!h(b7)) {
            if ((((b7 + 112) + (b3 << 28)) >> 30) == 0 && !h(b10) && !h(b11)) {
                int i11 = ((b3 & 7) << 18) | ((b7 & 63) << 12) | ((b10 & 63) << 6) | (b11 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.a();
    }

    public static void b(byte b3, byte b7, char[] cArr, int i10) throws InvalidProtocolBufferException {
        if (b3 < -62 || h(b7)) {
            throw InvalidProtocolBufferException.a();
        }
        cArr[i10] = (char) (((b3 & 31) << 6) | (b7 & 63));
    }

    public static void c(byte b3, byte b7, byte b10, char[] cArr, int i10) throws InvalidProtocolBufferException {
        if (h(b7) || ((b3 == -32 && b7 < -96) || ((b3 == -19 && b7 >= -96) || h(b10)))) {
            throw InvalidProtocolBufferException.a();
        }
        cArr[i10] = (char) (((b3 & 15) << 12) | ((b7 & 63) << 6) | (b10 & 63));
    }

    public static final String d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static String g(C0488h c0488h) {
        StringBuilder sb = new StringBuilder(c0488h.size());
        for (int i10 = 0; i10 < c0488h.size(); i10++) {
            byte b3 = c0488h.f6469t[i10];
            if (b3 == 34) {
                sb.append("\\\"");
            } else if (b3 == 39) {
                sb.append("\\'");
            } else if (b3 != 92) {
                switch (b3) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        sb.append("\\f");
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        sb.append("\\r");
                        break;
                    default:
                        if (b3 < 32 || b3 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b3 >>> 6) & 3) + 48));
                            sb.append((char) (((b3 >>> 3) & 7) + 48));
                            sb.append((char) ((b3 & 7) + 48));
                        } else {
                            sb.append((char) b3);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static boolean h(byte b3) {
        return b3 > -65;
    }

    public static final void j(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                j(sb, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(sb, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0488h c0488h = C0488h.f6466u;
            sb.append(g(new C0488h(((String) obj).getBytes(AbstractC0505z.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0488h) {
            sb.append(": \"");
            sb.append(g((C0488h) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0502w) {
            sb.append(" {");
            k((AbstractC0502w) obj, sb, i10 + 2);
            sb.append("\n");
            while (i11 < i10) {
                sb.append(' ');
                i11++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i13 = i10 + 2;
        j(sb, i13, "key", entry.getKey());
        j(sb, i13, "value", entry.getValue());
        sb.append("\n");
        while (i11 < i10) {
            sb.append(' ');
            i11++;
        }
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01af  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b1  */
    public static void k(AbstractC0502w abstractC0502w, StringBuilder sb, int i10) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : abstractC0502w.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strReplaceFirst = str.replaceFirst("get", "");
            boolean zBooleanValue = true;
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals("List")) {
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    j(sb, i10, d(str2), AbstractC0502w.f(method2, abstractC0502w, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
                String str3 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    j(sb, i10, d(str3), AbstractC0502w.f(method3, abstractC0502w, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strReplaceFirst))) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    if (map.containsKey("get" + strReplaceFirst.substring(0, strReplaceFirst.length() - 5))) {
                    }
                }
                String str4 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                Method method4 = (Method) map.get("get".concat(strReplaceFirst));
                Method method5 = (Method) map.get("has".concat(strReplaceFirst));
                if (method4 != null) {
                    Object objF = AbstractC0502w.f(method4, abstractC0502w, new Object[0]);
                    if (method5 == null) {
                        if (objF instanceof Boolean) {
                            zEquals = !((Boolean) objF).booleanValue();
                        } else if (objF instanceof Integer) {
                            if (((Integer) objF).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objF instanceof Float) {
                            if (((Float) objF).floatValue() == 0.0f) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objF instanceof Double) {
                            if (((Double) objF).doubleValue() == 0.0d) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objF instanceof String) {
                            zEquals = objF.equals("");
                        } else if (objF instanceof C0488h) {
                            zEquals = objF.equals(C0488h.f6466u);
                        } else if (!(objF instanceof AbstractC0478a) ? !((objF instanceof Enum) && ((Enum) objF).ordinal() == 0) : objF != ((AbstractC0502w) ((AbstractC0502w) ((AbstractC0478a) objF)).d(6))) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) AbstractC0502w.f(method5, abstractC0502w, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        j(sb, i10, d(str4), objF);
                    }
                }
            }
        }
        k0 k0Var = abstractC0502w.unknownFields;
        if (k0Var != null) {
            for (int i11 = 0; i11 < k0Var.a; i11++) {
                j(sb, i10, String.valueOf(k0Var.f6495b[i11] >>> 3), k0Var.f6496c[i11]);
            }
        }
    }

    public abstract String e(byte[] bArr, int i10, int i11);

    public abstract int f(String str, byte[] bArr, int i10, int i11);

    public abstract int i(byte[] bArr, int i10, int i11);

    public abstract void l(byte[] bArr, int i10, int i11);
}
