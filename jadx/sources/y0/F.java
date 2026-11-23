package y0;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class F extends M {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15872r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(int i10, boolean z6) {
        super(z6);
        this.f15872r = i10;
    }

    public static float[] g(String str) {
        p210v8.i.f(str, "value");
        return new float[]{((Number) M.f15886i.d(str)).floatValue()};
    }

    public static int[] h(String str) {
        p210v8.i.f(str, "value");
        return new int[]{((Number) M.f15879b.d(str)).intValue()};
    }

    public static long[] i(String str) {
        p210v8.i.f(str, "value");
        return new long[]{((Number) M.f15883f.d(str)).longValue()};
    }

    public static boolean[] j(String str) {
        p210v8.i.f(str, "value");
        return new boolean[]{((Boolean) M.f15888l.d(str)).booleanValue()};
    }

    @Override // y0.M
    public final Object a(String str, Bundle bundle) {
        switch (this.f15872r) {
            case 0:
                return (boolean[]) p231y.a.b(bundle, "bundle", str, "key", str);
            case 1:
                boolean[] zArr = (boolean[]) p231y.a.b(bundle, "bundle", str, "key", str);
                if (zArr != null) {
                    return p086i8.i.I(zArr);
                }
                return null;
            case 2:
                return (float[]) p231y.a.b(bundle, "bundle", str, "key", str);
            case 3:
                float[] fArr = (float[]) p231y.a.b(bundle, "bundle", str, "key", str);
                if (fArr != null) {
                    return p086i8.i.E(fArr);
                }
                return null;
            case 4:
                return (int[]) p231y.a.b(bundle, "bundle", str, "key", str);
            case 5:
                int[] iArr = (int[]) p231y.a.b(bundle, "bundle", str, "key", str);
                if (iArr != null) {
                    return p086i8.i.F(iArr);
                }
                return null;
            case 6:
                return (long[]) p231y.a.b(bundle, "bundle", str, "key", str);
            case 7:
                long[] jArr = (long[]) p231y.a.b(bundle, "bundle", str, "key", str);
                if (jArr != null) {
                    return p086i8.i.G(jArr);
                }
                return null;
            case 8:
                return (String[]) p231y.a.b(bundle, "bundle", str, "key", str);
            default:
                String[] strArr = (String[]) p231y.a.b(bundle, "bundle", str, "key", str);
                if (strArr != null) {
                    return p086i8.i.H(strArr);
                }
                return null;
        }
    }

    @Override // y0.M
    public final String b() {
        switch (this.f15872r) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // y0.M
    public final Object c(Object obj, String str) {
        switch (this.f15872r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return j(str);
                }
                boolean[] zArrJ = j(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrJ, 0, zArrCopyOf, length, 1);
                p210v8.i.c(zArrCopyOf);
                return zArrCopyOf;
            case 1:
                List list = (List) obj;
                G g8 = M.f15888l;
                return list != null ? p086i8.k.g0(list, com.bumptech.glide.d.u(g8.d(str))) : com.bumptech.glide.d.u(g8.d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return g(str);
                }
                float[] fArrG = g(str);
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArrG, 0, fArrCopyOf, length2, 1);
                p210v8.i.c(fArrCopyOf);
                return fArrCopyOf;
            case 3:
                List list2 = (List) obj;
                G g10 = M.f15886i;
                return list2 != null ? p086i8.k.g0(list2, com.bumptech.glide.d.u(g10.d(str))) : com.bumptech.glide.d.u(g10.d(str));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return h(str);
                }
                int[] iArrH = h(str);
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(iArrH, 0, iArrCopyOf, length3, 1);
                p210v8.i.c(iArrCopyOf);
                return iArrCopyOf;
            case 5:
                List list3 = (List) obj;
                G g11 = M.f15879b;
                return list3 != null ? p086i8.k.g0(list3, com.bumptech.glide.d.u(g11.d(str))) : com.bumptech.glide.d.u(g11.d(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return i(str);
                }
                long[] jArrI = i(str);
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(jArrI, 0, jArrCopyOf, length4, 1);
                p210v8.i.c(jArrCopyOf);
                return jArrCopyOf;
            case 7:
                List list4 = (List) obj;
                G g12 = M.f15883f;
                return list4 != null ? p086i8.k.g0(list4, com.bumptech.glide.d.u(g12.d(str))) : com.bumptech.glide.d.u(g12.d(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                int length5 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(new String[]{str}, 0, objArrCopyOf, length5, 1);
                p210v8.i.c(objArrCopyOf);
                return (String[]) objArrCopyOf;
            default:
                List list5 = (List) obj;
                return list5 != null ? p086i8.k.g0(list5, com.bumptech.glide.d.u(str)) : com.bumptech.glide.d.u(str);
        }
    }

    @Override // y0.M
    public final Object d(String str) {
        switch (this.f15872r) {
            case 0:
                return j(str);
            case 1:
                p210v8.i.f(str, "value");
                return com.bumptech.glide.d.u(M.f15888l.d(str));
            case 2:
                return g(str);
            case 3:
                p210v8.i.f(str, "value");
                return com.bumptech.glide.d.u(M.f15886i.d(str));
            case 4:
                return h(str);
            case 5:
                p210v8.i.f(str, "value");
                return com.bumptech.glide.d.u(M.f15879b.d(str));
            case 6:
                return i(str);
            case 7:
                p210v8.i.f(str, "value");
                return com.bumptech.glide.d.u(M.f15883f.d(str));
            case 8:
                p210v8.i.f(str, "value");
                return new String[]{str};
            default:
                p210v8.i.f(str, "value");
                return com.bumptech.glide.d.u(str);
        }
    }

    @Override // y0.M
    public final void e(Bundle bundle, String str, Object obj) {
        boolean[] zArr;
        float[] fArr;
        long[] jArr;
        switch (this.f15872r) {
            case 0:
                p210v8.i.f(str, "key");
                bundle.putBooleanArray(str, (boolean[]) obj);
                break;
            case 1:
                List list = (List) obj;
                p210v8.i.f(str, "key");
                if (list != null) {
                    List list2 = list;
                    p210v8.i.f(list2, "<this>");
                    zArr = new boolean[list2.size()];
                    Iterator it = list2.iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        zArr[i10] = ((Boolean) it.next()).booleanValue();
                        i10++;
                    }
                } else {
                    zArr = null;
                }
                bundle.putBooleanArray(str, zArr);
                break;
            case 2:
                p210v8.i.f(str, "key");
                bundle.putFloatArray(str, (float[]) obj);
                break;
            case 3:
                List list3 = (List) obj;
                p210v8.i.f(str, "key");
                if (list3 != null) {
                    List list4 = list3;
                    fArr = new float[list4.size()];
                    Iterator it2 = list4.iterator();
                    int i11 = 0;
                    while (it2.hasNext()) {
                        fArr[i11] = ((Number) it2.next()).floatValue();
                        i11++;
                    }
                } else {
                    fArr = null;
                }
                bundle.putFloatArray(str, fArr);
                break;
            case 4:
                p210v8.i.f(str, "key");
                bundle.putIntArray(str, (int[]) obj);
                break;
            case 5:
                List list5 = (List) obj;
                p210v8.i.f(str, "key");
                bundle.putIntArray(str, list5 != null ? p086i8.k.r0(list5) : null);
                break;
            case 6:
                p210v8.i.f(str, "key");
                bundle.putLongArray(str, (long[]) obj);
                break;
            case 7:
                List list6 = (List) obj;
                p210v8.i.f(str, "key");
                if (list6 != null) {
                    List list7 = list6;
                    jArr = new long[list7.size()];
                    Iterator it3 = list7.iterator();
                    int i12 = 0;
                    while (it3.hasNext()) {
                        jArr[i12] = ((Number) it3.next()).longValue();
                        i12++;
                    }
                } else {
                    jArr = null;
                }
                bundle.putLongArray(str, jArr);
                break;
            case 8:
                p210v8.i.f(str, "key");
                bundle.putStringArray(str, (String[]) obj);
                break;
            default:
                List list8 = (List) obj;
                p210v8.i.f(str, "key");
                bundle.putStringArray(str, list8 != null ? (String[]) list8.toArray(new String[0]) : null);
                break;
        }
    }
}
