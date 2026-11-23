package com.google.android.gms.net;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.ApiVersion;

/* JADX INFO: loaded from: classes.dex */
public class CronetProviderInstaller {
    public static final GoogleApiAvailabilityLight a = GoogleApiAvailabilityLight.f7833b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f9360b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static DynamiteModule f9361c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f9362d = "0";

    private CronetProviderInstaller() {
    }

    public static boolean a() {
        DynamiteModule dynamiteModule;
        synchronized (f9360b) {
            dynamiteModule = f9361c;
        }
        return dynamiteModule != null;
    }

    public static void b(Context context) {
        synchronized (f9360b) {
            try {
                if (a()) {
                    return;
                }
                Preconditions.j(context, "Context must not be null");
                ClassLoader classLoader = CronetProviderInstaller.class.getClassLoader();
                Preconditions.i(classLoader);
                try {
                    classLoader.loadClass("org.chromium.net.CronetEngine");
                    int apiLevel = ApiVersion.getApiLevel();
                    GoogleApiAvailabilityLight googleApiAvailabilityLight = a;
                    googleApiAvailabilityLight.getClass();
                    AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.a;
                    GoogleApiAvailabilityLight googleApiAvailabilityLight2 = GoogleApiAvailabilityLight.f7833b;
                    int iB = googleApiAvailabilityLight2.b(context, 11925000);
                    if (iB != 0) {
                        if (googleApiAvailabilityLight2.a(iB, context, "e") != null) {
                            throw new GooglePlayServicesRepairableException("Google Play Services not available");
                        }
                        throw new GooglePlayServicesNotAvailableException();
                    }
                    try {
                        DynamiteModule dynamiteModuleC = DynamiteModule.c(context, DynamiteModule.f8291b, "com.google.android.gms.cronet_dynamite");
                        try {
                            Class<?> clsLoadClass = dynamiteModuleC.a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                            if (clsLoadClass.getClassLoader() == CronetProviderInstaller.class.getClassLoader()) {
                                throw new GooglePlayServicesNotAvailableException();
                            }
                            Method method = clsLoadClass.getMethod("getApiLevel", new Class[0]);
                            Method method2 = clsLoadClass.getMethod("getCronetVersion", new Class[0]);
                            Integer num = (Integer) method.invoke(null, new Object[0]);
                            Preconditions.i(num);
                            int iIntValue = num.intValue();
                            String str = (String) method2.invoke(null, new Object[0]);
                            Preconditions.i(str);
                            f9362d = str;
                            if (apiLevel <= iIntValue) {
                                f9361c = dynamiteModuleC;
                                return;
                            }
                            if (googleApiAvailabilityLight.a(2, context, "cr") == null) {
                                throw new GooglePlayServicesNotAvailableException();
                            }
                            String str2 = f9362d;
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 174);
                            sb.append("Google Play Services update is required. The API Level of the client is ");
                            sb.append(apiLevel);
                            sb.append(". The API Level of the implementation is ");
                            sb.append(iIntValue);
                            sb.append(". The Cronet implementation version is ");
                            sb.append(str2);
                            throw new GooglePlayServicesRepairableException(sb.toString());
                        } catch (Exception e10) {
                            throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException().initCause(e10));
                        }
                    } catch (DynamiteModule.LoadingException e11) {
                        throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException().initCause(e11));
                    }
                } catch (ClassNotFoundException e12) {
                    throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException().initCause(e12));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
