package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f6725f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final LinkedHashMap a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f6727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f6728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N0.d f6729e;

    public J(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.f6726b = new LinkedHashMap();
        this.f6727c = new LinkedHashMap();
        this.f6728d = new LinkedHashMap();
        this.f6729e = new A0.q(this, 2);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(J j) {
        p210v8.i.f(j, "this$0");
        Iterator it = p086i8.y.A(j.f6726b).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = j.a;
            if (!zHasNext) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                return com.bumptech.glide.d.b(new p076h8.f("keys", arrayList), new p076h8.f("values", arrayList2));
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            Bundle bundleA = ((N0.d) entry.getValue()).a();
            p210v8.i.f(str2, "key");
            if (bundleA != null) {
                Class[] clsArr = f6725f;
                int i10 = 0;
                while (true) {
                    if (i10 >= 29) {
                        throw new IllegalArgumentException("Can't put value with type " + bundleA.getClass() + " into saved state");
                    }
                    Class cls = clsArr[i10];
                    p210v8.i.c(cls);
                    if (cls.isInstance(bundleA)) {
                        break;
                    }
                    i10++;
                }
            }
            Object obj = j.f6727c.get(str2);
            A a = obj instanceof A ? (A) obj : null;
            if (a != null) {
                a.e(bundleA);
            } else {
                linkedHashMap.put(str2, bundleA);
            }
            Q9.m mVar = (Q9.m) j.f6728d.get(str2);
            if (mVar != null) {
                ((Q9.t) mVar).g(bundleA);
            }
        }
    }

    public J() {
        this.a = new LinkedHashMap();
        this.f6726b = new LinkedHashMap();
        this.f6727c = new LinkedHashMap();
        this.f6728d = new LinkedHashMap();
        this.f6729e = new A0.q(this, 2);
    }
}
