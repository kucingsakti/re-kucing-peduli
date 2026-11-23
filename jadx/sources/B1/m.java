package B1;

import U1.n;
import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import o1.r;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f601h;
    public final f a = new f(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f602b = new r(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f603c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f597d = configArr;
        f598e = configArr;
        f599f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f600g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f601h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(n.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap b(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = n.d(config) * i10 * i11;
        f fVar = this.a;
        j jVarX0 = (j) ((ArrayDeque) fVar.f577s).poll();
        if (jVarX0 == null) {
            jVarX0 = fVar.X0();
        }
        l lVar = (l) jVarX0;
        lVar.f595b = iD;
        lVar.f596c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i12 = k.a[config.ordinal()];
            if (i12 == 1) {
                configArr = f597d;
            } else if (i12 == 2) {
                configArr = f599f;
            } else if (i12 != 3) {
                configArr = i12 != 4 ? new Bitmap.Config[]{config} : f601h;
            } else {
                configArr = f600g;
            }
        } else {
            configArr = f598e;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(iD));
            if (num != null && num.intValue() <= iD * 8) {
                if (num.intValue() == iD && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                fVar.R0(lVar);
                int iIntValue = num.intValue();
                j jVarX1 = (j) ((ArrayDeque) fVar.f577s).poll();
                if (jVarX1 == null) {
                    jVarX1 = fVar.X0();
                }
                lVar = (l) jVarX1;
                lVar.f595b = iIntValue;
                lVar.f596c = config2;
                break;
            }
        }
        Bitmap bitmap = (Bitmap) this.f602b.n(lVar);
        if (bitmap != null) {
            a(Integer.valueOf(lVar.f595b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap map = this.f603c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iC = n.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        f fVar = this.a;
        j jVarX0 = (j) ((ArrayDeque) fVar.f577s).poll();
        if (jVarX0 == null) {
            jVarX0 = fVar.X0();
        }
        l lVar = (l) jVarX0;
        lVar.f595b = iC;
        lVar.f596c = config;
        this.f602b.s(lVar, bitmap);
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(lVar.f595b));
        navigableMapD.put(Integer.valueOf(lVar.f595b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbC = p239z.e.c("SizeConfigStrategy{groupedMap=");
        sbC.append(this.f602b);
        sbC.append(", sortedSizes=(");
        HashMap map = this.f603c;
        for (Map.Entry entry : map.entrySet()) {
            sbC.append(entry.getKey());
            sbC.append('[');
            sbC.append(entry.getValue());
            sbC.append("], ");
        }
        if (!map.isEmpty()) {
            sbC.replace(sbC.length() - 2, sbC.length(), "");
        }
        sbC.append(")}");
        return sbC.toString();
    }
}
