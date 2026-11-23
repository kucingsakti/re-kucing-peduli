package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzix;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzji<T extends zzix> {
    public static zzix a() {
        String strC;
        ClassLoader classLoader = zzji.class.getClassLoader();
        if (zzix.class.equals(zzix.class)) {
            strC = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!zzix.class.getPackage().equals(zzji.class.getPackage())) {
                throw new IllegalArgumentException(zzix.class.getName());
            }
            strC = p231y.a.c(zzix.class.getPackage().getName(), ".BlazeGeneratedzzixLoader");
        }
        try {
            try {
                try {
                    return (zzix) zzix.class.cast(((zzji) Class.forName(strC, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).b());
                } catch (InstantiationException e10) {
                    throw new IllegalStateException(e10);
                } catch (InvocationTargetException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException(e12);
            } catch (NoSuchMethodException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzji.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzix) zzix.class.cast(((zzji) it.next()).b()));
                } catch (ServiceConfigurationError e14) {
                    Logger.getLogger(zzit.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat("zzix"), (Throwable) e14);
                }
            }
            if (arrayList.size() == 1) {
                return (zzix) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzix) zzix.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(e15);
            } catch (NoSuchMethodException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    public abstract zzix b();
}
