package U4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p086i8.k;
import p086i8.l;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b {
    public static final a Companion = new a(null);
    private static String indent = "";
    private final Map<Class<?>, List<e>> serviceMap;

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        public final String getIndent() {
            return d.indent;
        }

        public final void setIndent(String str) {
            i.f(str, "<set-?>");
            d.indent = str;
        }

        private a() {
        }
    }

    public d(List<? extends e> list) {
        i.f(list, "registrations");
        this.serviceMap = new LinkedHashMap();
        for (e eVar : list) {
            for (Class<?> cls : eVar.getServices()) {
                if (this.serviceMap.containsKey(cls)) {
                    List<e> list2 = this.serviceMap.get(cls);
                    i.c(list2);
                    list2.add(eVar);
                } else {
                    this.serviceMap.put(cls, l.E(eVar));
                }
            }
        }
    }

    @Override // U4.b
    public <T> List<T> getAllServices(Class<T> cls) {
        ArrayList arrayList;
        i.f(cls, "c");
        synchronized (this.serviceMap) {
            try {
                arrayList = new ArrayList();
                if (this.serviceMap.containsKey(cls)) {
                    Map<Class<?>, List<e>> map = this.serviceMap;
                    i.c(map);
                    List<e> list = map.get(cls);
                    i.c(list);
                    for (e eVar : list) {
                        Object objResolve = eVar.resolve(this);
                        if (objResolve == null) {
                            throw new Exception("Could not instantiate service: " + eVar);
                        }
                        arrayList.add(objResolve);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final <T> List<T> getAllServices$com_onesignal_core() {
        i.m();
        throw null;
    }

    @Override // U4.b
    public <T> T getService(Class<T> cls) throws Exception {
        i.f(cls, "c");
        T t7 = (T) getServiceOrNull(cls);
        if (t7 != null) {
            return t7;
        }
        com.onesignal.debug.internal.logging.b.warn$default("Service not found: " + cls, null, 2, null);
        throw new Exception("Service " + cls + " could not be instantiated");
    }

    public final <T> T getService$com_onesignal_core() {
        i.m();
        throw null;
    }

    @Override // U4.b
    public <T> T getServiceOrNull(Class<T> cls) {
        T t7;
        e eVar;
        i.f(cls, "c");
        synchronized (this.serviceMap) {
            t7 = null;
            com.onesignal.debug.internal.logging.b.debug$default(indent + "Retrieving service " + cls, null, 2, null);
            List<e> list = this.serviceMap.get(cls);
            if (list != null && (eVar = (e) k.b0(list)) != null) {
                t7 = (T) eVar.resolve(this);
            }
        }
        return t7;
    }

    public final <T> T getServiceOrNull$com_onesignal_core() {
        i.m();
        throw null;
    }

    @Override // U4.b
    public <T> boolean hasService(Class<T> cls) {
        boolean zContainsKey;
        i.f(cls, "c");
        synchronized (this.serviceMap) {
            zContainsKey = this.serviceMap.containsKey(cls);
        }
        return zContainsKey;
    }

    public final <T> boolean hasService$com_onesignal_core() {
        i.m();
        throw null;
    }
}
