package I3;

import E4.C0187a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f2018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f2019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f2022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f2023g;

    public b(String str, Set set, Set set2, int i10, int i11, e eVar, Set set3) {
        this.a = str;
        this.f2018b = Collections.unmodifiableSet(set);
        this.f2019c = Collections.unmodifiableSet(set2);
        this.f2020d = i10;
        this.f2021e = i11;
        this.f2022f = eVar;
        this.f2023g = Collections.unmodifiableSet(set3);
    }

    public static a a(p pVar) {
        return new a(pVar, new p[0]);
    }

    public static a b(Class cls) {
        return new a(cls, new Class[0]);
    }

    public static b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(p.a(cls));
        for (Class cls2 : clsArr) {
            p181s3.a.b(cls2, "Null interface");
            hashSet.add(p.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C0187a(obj, 5), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f2018b.toArray()) + ">{" + this.f2020d + ", type=" + this.f2021e + ", deps=" + Arrays.toString(this.f2019c.toArray()) + "}";
    }
}
