package R0;

import Q3.u0;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import com.kcstream.cing.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f4430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f4431e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4433c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f4432b = new HashSet();
    public final HashMap a = new HashMap();

    public a(Context context) {
        this.f4433c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f4430d == null) {
            synchronized (f4431e) {
                try {
                    if (f4430d == null) {
                        f4430d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4430d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f4433c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f4432b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new StartupException(e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        if (u0.g()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.a;
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listDependencies = bVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = bVar.create(this.f4433c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return objCreate;
    }

    public final Object d(Class cls) {
        Object objB;
        synchronized (f4431e) {
            try {
                objB = this.a.get(cls);
                if (objB == null) {
                    objB = b(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objB;
    }
}
