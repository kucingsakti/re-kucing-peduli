package E1;

import A1.C0099h;
import com.bumptech.glide.Registry$NoModelLoaderAvailableException;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B f1337e = new B(10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C f1338f = new C(2);
    public final ArrayList a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f1339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f1340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0099h f1341d;

    public x(C0099h c0099h) {
        B b3 = f1337e;
        this.a = new ArrayList();
        this.f1340c = new HashSet();
        this.f1341d = c0099h;
        this.f1339b = b3;
    }

    public final synchronized void a(Class cls, Class cls2, s sVar) {
        w wVar = new w(cls, cls2, sVar);
        ArrayList arrayList = this.a;
        arrayList.add(arrayList.size(), wVar);
    }

    public final synchronized r b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z6 = false;
            for (w wVar : this.a) {
                if (this.f1340c.contains(wVar)) {
                    z6 = true;
                } else if (wVar.a.isAssignableFrom(cls) && wVar.f1335b.isAssignableFrom(cls2)) {
                    this.f1340c.add(wVar);
                    arrayList.add(wVar.f1336c.D(this));
                    this.f1340c.remove(wVar);
                }
            }
            if (arrayList.size() > 1) {
                B b3 = this.f1339b;
                C0099h c0099h = this.f1341d;
                b3.getClass();
                return new C0180b(arrayList, 1, c0099h);
            }
            if (arrayList.size() == 1) {
                return (r) arrayList.get(0);
            }
            if (z6) {
                return f1338f;
            }
            throw new Registry$NoModelLoaderAvailableException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f1340c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (w wVar : this.a) {
                if (!this.f1340c.contains(wVar) && wVar.a.isAssignableFrom(cls)) {
                    this.f1340c.add(wVar);
                    arrayList.add(wVar.f1336c.D(this));
                    this.f1340c.remove(wVar);
                }
            }
        } catch (Throwable th) {
            this.f1340c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (w wVar : this.a) {
            if (!arrayList.contains(wVar.f1335b) && wVar.a.isAssignableFrom(cls)) {
                arrayList.add(wVar.f1335b);
            }
        }
        return arrayList;
    }
}
