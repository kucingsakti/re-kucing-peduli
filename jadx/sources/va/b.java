package va;

import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;
import p170r3.e;
import xa.c;
import xa.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static volatile int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p195u1.b f15477b = new p195u1.b(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f15478c = new e(28);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f15479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f15480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f15481f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f15479d = property == null ? false : property.equalsIgnoreCase("true");
        f15480e = new String[]{"1.6", "1.7"};
        f15481f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    public static final void a() {
        LinkedHashSet linkedHashSetB;
        try {
            if (g()) {
                linkedHashSetB = null;
            } else {
                linkedHashSetB = b();
                j(linkedHashSetB);
            }
            StaticLoggerBinder.getSingleton();
            a = 3;
            i(linkedHashSetB);
            c();
            h();
            p195u1.b bVar = f15477b;
            ((HashMap) bVar.f15290u).clear();
            ((LinkedBlockingQueue) bVar.f15291v).clear();
        } catch (Exception e10) {
            a = 2;
            System.err.println("Failed to instantiate SLF4J LoggerFactory");
            System.err.println("Reported exception:");
            e10.printStackTrace();
            throw new IllegalStateException("Unexpected initialization failure", e10);
        } catch (NoClassDefFoundError e11) {
            String message = e11.getMessage();
            if (message == null || !(message.contains("org/slf4j/impl/StaticLoggerBinder") || message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                a = 2;
                System.err.println("Failed to instantiate SLF4J LoggerFactory");
                System.err.println("Reported exception:");
                e11.printStackTrace();
                throw e11;
            }
            a = 4;
            d.t("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            d.t("Defaulting to no-operation (NOP) logger implementation");
            d.t("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e12) {
            String message2 = e12.getMessage();
            if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                a = 2;
                d.t("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                d.t("Your binding is version 1.5.5 or earlier.");
                d.t("Upgrade your binding to version 1.6.x.");
            }
            throw e12;
        }
    }

    public static LinkedHashSet b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = b.class.getClassLoader();
            String str = f15481f;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e10) {
            System.err.println("Error getting resources from path");
            System.err.println("Reported exception:");
            e10.printStackTrace();
        }
        return linkedHashSet;
    }

    public static void c() {
        p195u1.b bVar = f15477b;
        synchronized (bVar) {
            try {
                bVar.f15289t = true;
                for (xa.b bVar2 : new ArrayList(((HashMap) bVar.f15290u).values())) {
                    bVar2.f15798t = f(bVar2.f15797s);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ILoggerFactory d() {
        if (a == 0) {
            synchronized (b.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        a();
                        if (a == 3) {
                            k();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i10 = a;
        if (i10 == 1) {
            return f15477b;
        }
        if (i10 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i10 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i10 == 4) {
            return f15478c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static a e(Class cls) {
        int i10;
        a aVarF = f(cls.getName());
        if (f15479d) {
            c cVar = d.a;
            Class cls2 = null;
            if (cVar == null) {
                if (d.f15804b) {
                    cVar = null;
                } else {
                    try {
                        cVar = new c();
                    } catch (SecurityException unused) {
                        cVar = null;
                    }
                    d.a = cVar;
                    d.f15804b = true;
                }
            }
            if (cVar != null) {
                Class[] classContext = cVar.getClassContext();
                String name = d.class.getName();
                int i11 = 0;
                while (i11 < classContext.length && !name.equals(classContext[i11].getName())) {
                    i11++;
                }
                if (i11 >= classContext.length || (i10 = i11 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i10];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                d.t("Detected logger name mismatch. Given name: \"" + aVarF.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                d.t("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return aVarF;
    }

    public static a f(String str) {
        return d().a(str);
    }

    public static boolean g() {
        String property;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
    }

    public static void h() {
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) f15477b.f15291v;
        int size = linkedBlockingQueue.size();
        ArrayList<wa.b> arrayList = new ArrayList(128);
        int i10 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (wa.b bVar : arrayList) {
                if (bVar != null) {
                    xa.b bVar2 = bVar.a;
                    String str = bVar2.f15797s;
                    if (bVar2.f15798t == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(bVar2.f15798t instanceof xa.a)) {
                        if (!bVar2.g()) {
                            d.t(str);
                        } else if (bVar2.g()) {
                            try {
                                bVar2.f15800v.invoke(bVar2.f15798t, bVar);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i11 = i10 + 1;
                if (i10 == 0) {
                    if (bVar.a.g()) {
                        d.t("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        d.t("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        d.t("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!(bVar.a.f15798t instanceof xa.a)) {
                        d.t("The following set of substitute loggers may have been accessed");
                        d.t("during the initialization phase. Logging calls during this");
                        d.t("phase were not honored. However, subsequent logging calls to these");
                        d.t("loggers will work as normally expected.");
                        d.t("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i10 = i11;
            }
            arrayList.clear();
        }
    }

    public static void i(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        d.t("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    public static void j(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            d.t("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                d.t("Found binding in [" + ((URL) it.next()) + "]");
            }
            d.t("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static final void k() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z6 = false;
            for (String str2 : f15480e) {
                if (str.startsWith(str2)) {
                    z6 = true;
                }
            }
            if (z6) {
                return;
            }
            d.t("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f15480e).toString());
            d.t("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            System.err.println("Unexpected problem occured during version sanity check");
            System.err.println("Reported exception:");
            th.printStackTrace();
        }
    }
}
