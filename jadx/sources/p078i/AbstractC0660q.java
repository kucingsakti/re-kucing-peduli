package p078i;

import F3.c;
import Q.h;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import p212w.a;
import p212w.f;

/* JADX INFO: renamed from: i.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0660q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ExecutorC0659p f12107s = new ExecutorC0659p(new c(4));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f12108t = -100;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static h f12109u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static h f12110v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static Boolean f12111w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static boolean f12112x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final f f12113y = new f(0);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Object f12114z = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Object f12106A = new Object();

    public static boolean c(Context context) {
        if (f12111w == null) {
            try {
                int i10 = K.f11982s;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) K.class), Build.VERSION.SDK_INT >= 24 ? J.a() | 128 : 640).metaData;
                if (bundle != null) {
                    f12111w = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f12111w = Boolean.FALSE;
            }
        }
        return f12111w.booleanValue();
    }

    public static void f(D d3) {
        synchronized (f12114z) {
            try {
                f fVar = f12113y;
                fVar.getClass();
                a aVar = new a(fVar);
                while (aVar.hasNext()) {
                    AbstractC0660q abstractC0660q = (AbstractC0660q) ((WeakReference) aVar.next()).get();
                    if (abstractC0660q == d3 || abstractC0660q == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int i10);

    public abstract void h(int i10);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
