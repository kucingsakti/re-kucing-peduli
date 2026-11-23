package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class w0 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:102:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:104:0x0209  */
    /* JADX WARN: Code duplicated, block: B:136:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0160  */
    /* JADX WARN: Code duplicated, block: B:60:0x0172  */
    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
    /* JADX WARN: Code duplicated, block: B:64:0x017f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0188  */
    /* JADX WARN: Code duplicated, block: B:67:0x018b  */
    /* JADX WARN: Code duplicated, block: B:68:0x018e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0192  */
    /* JADX WARN: Code duplicated, block: B:73:0x019c  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:89:0x01da  */
    public static void a(zzjk zzjkVar, StringBuilder sb, int i10) {
        int i11;
        int i12;
        Method method;
        Method method2;
        Object objR;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzjkVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method5 = declaredMethods[i13];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method4 = (Method) entry.getValue()) == null) {
                i12 = i11;
            } else {
                i12 = i11;
                if (method4.getReturnType().equals(List.class)) {
                    c(sb, i10, strSubstring.substring(0, strSubstring.length() - 4), zzjk.r(method4, zzjkVar, new Object[0]));
                }
                i11 = i12;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                c(sb, i10, strSubstring.substring(0, strSubstring.length() - 3), zzjk.r(method3, zzjkVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objR = zzjk.r(method, zzjkVar, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objR instanceof Boolean) {
                                    if (((Boolean) objR).booleanValue()) {
                                        zEquals = false;
                                    } else {
                                        zEquals = true;
                                    }
                                } else if (objR instanceof Integer) {
                                    if (((Integer) objR).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objR instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objR).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objR instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objR).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objR instanceof String) {
                                    zEquals = objR.equals("");
                                } else if (objR instanceof zzia) {
                                    zEquals = objR.equals(zzia.f8668t);
                                } else if ((objR instanceof zzkt) ? !((objR instanceof Enum) && ((Enum) objR).ordinal() == 0) : objR != ((zzkt) objR).e()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) zzjk.r(method2, zzjkVar, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                c(sb, i10, strSubstring, objR);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objR = zzjk.r(method, zzjkVar, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objR instanceof Boolean) {
                                if (((Boolean) objR).booleanValue()) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objR instanceof Integer) {
                                if (((Integer) objR).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objR instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objR).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objR instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objR).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objR instanceof String) {
                                zEquals = objR.equals("");
                            } else if (objR instanceof zzia) {
                                zEquals = objR.equals(zzia.f8668t);
                            } else if (objR instanceof zzkt) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) zzjk.r(method2, zzjkVar, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            c(sb, i10, strSubstring, objR);
                        }
                    }
                }
            }
            i11 = i12;
        }
        if (zzjkVar instanceof zzjk.zzd) {
            Iterator itJ = ((zzjk.zzd) zzjkVar).zzc.j();
            if (itJ.hasNext()) {
                if (((Map.Entry) itJ.next()).getKey() != null) {
                    throw new ClassCastException();
                }
                throw new NoSuchMethodError();
            }
        }
        zzme zzmeVar = zzjkVar.zzb;
        if (zzmeVar != null) {
            for (int i14 = 0; i14 < zzmeVar.a; i14++) {
                c(sb, i10, String.valueOf(zzmeVar.f8703b[i14] >>> 3), zzmeVar.f8704c[i14]);
            }
        }
    }

    public static void b(StringBuilder sb, int i10) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb.append(a, 0, i11);
            i10 -= i11;
        }
    }

    public static void c(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(sb, i10);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0565d0 c0565d0 = zzia.f8668t;
            sb.append(E0.b(new C0565d0(((String) obj).getBytes(zzjm.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzia) {
            sb.append(": \"");
            sb.append(E0.b((zzia) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzjk) {
            sb.append(" {");
            a((zzjk) obj, sb, i10 + 2);
            sb.append("\n");
            b(sb, i10);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i10 + 2;
        c(sb, i12, "key", entry.getKey());
        c(sb, i12, "value", entry.getValue());
        sb.append("\n");
        b(sb, i10);
        sb.append("}");
    }
}
