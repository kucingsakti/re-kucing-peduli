package V;

import A1.C0099h;
import B4.v;
import O3.y;
import U.B0;
import U.InterfaceC0432s;
import U.U;
import U.y0;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import com.google.gson.JsonIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.SecureRandom;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;
import org.json.JSONObject;
import p078i.AbstractActivityC0655l;
import p091j3.InterfaceC0670e;

/* JADX INFO: loaded from: classes.dex */
public final class h implements SuccessContinuation, Y2.a, t, p023c3.i, com.google.gson.internal.l, p029c9.k, N7.a, N7.c, N7.b, J7.e, InterfaceC0670e, InterfaceC0432s, k2.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5077s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f5078t;

    public /* synthetic */ h(int i10) {
        this.f5077s = i10;
    }

    public static h a(int i10, int i11, int i12) {
        return new h(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, false, i12), 0);
    }

    @Override // U.InterfaceC0432s
    public B0 E(View view, B0 b3) {
        NavigationView navigationView = (NavigationView) this.f5078t;
        if (navigationView.f12477t == null) {
            navigationView.f12477t = new Rect();
        }
        navigationView.f12477t.set(b3.b(), b3.d(), b3.c(), b3.a());
        p091j3.t tVar = navigationView.f9754A;
        tVar.getClass();
        int iD = b3.d();
        if (tVar.f12464R != iD) {
            tVar.f12464R = iD;
            int i10 = (tVar.f12469t.getChildCount() <= 0 && tVar.P) ? tVar.f12464R : 0;
            NavigationMenuView navigationMenuView = tVar.f12468s;
            navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = tVar.f12468s;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, b3.a());
        U.b(tVar.f12469t, b3);
        y0 y0Var = b3.a;
        navigationView.setWillNotDraw(y0Var.j().equals(L.c.f2711e) || navigationView.f12476s == null);
        navigationView.postInvalidateOnAnimation();
        return y0Var.c();
    }

    @Override // N7.b
    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        J7.h hVarO0 = p045e7.h.o0(((p045e7.g) this.f5078t).a);
        if (hVarO0 != null) {
            ((U7.b) hVarO0).a(th);
        }
    }

    @Override // N7.c
    public Object apply(Object obj) {
        p210v8.i.f((Long) obj, "it");
        return (d7.a) ((d7.e) this.f5078t);
    }

    @Override // V.t
    public boolean b(View view) {
        switch (this.f5077s) {
            case 8:
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = (ViewPager2) ((o1.h) this.f5078t).f13635v;
                if (viewPager2.f7193J) {
                    viewPager2.b(currentItem);
                }
                return true;
            default:
                DrawerLayout drawerLayout = (DrawerLayout) this.f5078t;
                if (!DrawerLayout.o(view) || drawerLayout.j(view) == 2) {
                    return false;
                }
                drawerLayout.c(view, true);
                return true;
        }
    }

    @Override // J7.e
    public void c(T7.b bVar) {
        CancellationSignal cancellationSignal = new CancellationSignal();
        bVar.h(new p045e7.a(cancellationSignal, 1));
        S.g.z();
        BiometricPrompt.Builder builderB = S.g.b((AbstractActivityC0655l) ((o1.k) this.f5078t).f13639t);
        builderB.setTitle("Autentikasi");
        builderB.setSubtitle("Untuk masuk silahkan konfirmasi dengan jari Anda");
        builderB.setDescription("");
        builderB.setNegativeButton("Batal", f7.c.f11438s, new v(cancellationSignal, bVar));
        builderB.build().authenticate(cancellationSignal, f7.c.f11438s, new f7.a(bVar));
    }

    public JSONObject d() throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        JSONObject jSONObject;
        Log.isLoggable("FirebaseCrashlytics", 3);
        FileInputStream fileInputStream2 = null;
        try {
            File file = (File) this.f5078t;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(O3.g.j(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception unused) {
                    O3.g.c(fileInputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    O3.g.c(fileInputStream);
                    throw th;
                }
            } else {
                Log.isLoggable("FirebaseCrashlytics", 2);
                jSONObject = null;
            }
            O3.g.c(fileInputStream2);
            return jSONObject;
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f5078t;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task m(Object obj) throws Throwable {
        JSONObject jSONObjectC;
        FileWriter fileWriter;
        V3.b bVar = (V3.b) this.f5078t;
        V3.d dVar = (V3.d) bVar.f5172b;
        y yVar = (y) bVar.f5176f;
        yVar.getClass();
        FileWriter fileWriter2 = null;
        try {
            HashMap mapB = y.b(dVar);
            C0099h c0099h = new C0099h(yVar.f3597t, mapB);
            c0099h.g("User-Agent", "Crashlytics Android SDK/19.0.3");
            c0099h.g("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            y.a(c0099h, dVar);
            Log.isLoggable("FirebaseCrashlytics", 3);
            mapB.toString();
            Log.isLoggable("FirebaseCrashlytics", 2);
            jSONObjectC = yVar.c(c0099h.e());
        } catch (IOException unused) {
            jSONObjectC = null;
        }
        if (jSONObjectC != null) {
            P0.d dVar2 = (P0.d) bVar.f5173c;
            dVar2.getClass();
            V3.a aVarF = (jSONObjectC.getInt("settings_version") != 3 ? new p053f4.e(12) : new p170r3.e(12)).f((za.c) dVar2.f3811t, jSONObjectC);
            long j = aVarF.f5168c;
            h hVar = (h) bVar.f5175e;
            hVar.getClass();
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                jSONObjectC.put("expires_at", j);
                fileWriter = new FileWriter((File) hVar.f5078t);
                try {
                    fileWriter.write(jSONObjectC.toString());
                    fileWriter.flush();
                } catch (Exception unused2) {
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    O3.g.c(fileWriter2);
                    throw th;
                }
            } catch (Exception unused3) {
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
            }
            O3.g.c(fileWriter);
            jSONObjectC.toString();
            Log.isLoggable("FirebaseCrashlytics", 3);
            String str = dVar.f5184f;
            SharedPreferences.Editor editorEdit = ((Context) bVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str);
            editorEdit.apply();
            ((AtomicReference) bVar.f5178h).set(aVarF);
            ((TaskCompletionSource) ((AtomicReference) bVar.f5179i).get()).d(aVarF);
        }
        return Tasks.e(null);
    }

    @Override // com.google.gson.internal.l
    public Object n() {
        switch (this.f5077s) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Class cls = (Class) this.f5078t;
                try {
                    return com.google.gson.internal.q.a.a(cls);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
                }
            case 15:
                Type type = (Type) this.f5078t;
                if (!(type instanceof ParameterizedType)) {
                    throw new JsonIOException("Invalid EnumMap type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return new EnumMap((Class) type2);
                }
                throw new JsonIOException("Invalid EnumMap type: " + type.toString());
            default:
                Constructor constructor = (Constructor) this.f5078t;
                try {
                    return constructor.newInstance(new Object[0]);
                } catch (IllegalAccessException e11) {
                    xa.d dVar = p235y4.c.a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e11);
                } catch (InstantiationException e12) {
                    throw new RuntimeException("Failed to invoke constructor '" + p235y4.c.b(constructor) + "' with no args", e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException("Failed to invoke constructor '" + p235y4.c.b(constructor) + "' with no args", e13.getCause());
                }
        }
    }

    @Override // p029c9.k
    public p029c9.l q(p096j9.f fVar) {
        if ("b".equals(fVar.g())) {
            return new p037d9.b(this, 2);
        }
        return null;
    }

    @Override // N7.a
    /* JADX INFO: renamed from: run */
    public void mo0run() {
        SecureRandom secureRandom = p045e7.b.f10710u;
        p045e7.b.f10711v.remove(Integer.valueOf(((p210v8.r) this.f5078t).f15464s));
    }

    @Override // p029c9.k
    public p029c9.k t(p096j9.b bVar, p096j9.f fVar) {
        return null;
    }

    public /* synthetic */ h(Object obj, int i10) {
        this.f5077s = i10;
        this.f5078t = obj;
    }

    public h(T3.c cVar) {
        this.f5077s = 1;
        this.f5078t = new File((File) cVar.f4658c, "com.crashlytics.settings.json");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(p200u8.b bVar) {
        this.f5077s = 23;
        this.f5078t = (p210v8.k) bVar;
    }

    public h() {
        Handler handler;
        this.f5077s = 25;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handler = Q.e.a(mainLooper);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (IllegalAccessException e10) {
                e = e10;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
            } catch (InstantiationException e11) {
                e = e11;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
            } catch (NoSuchMethodException e12) {
                e = e12;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
            } catch (InvocationTargetException e13) {
                Throwable cause = e13.getCause();
                if (!(cause instanceof RuntimeException)) {
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(cause);
                }
                throw ((RuntimeException) cause);
            }
        }
        this.f5078t = handler;
    }

    @Override // p029c9.k
    public void o() {
    }

    @Override // p029c9.k
    public void p(p096j9.f fVar, Object obj) {
    }

    @Override // p029c9.k
    public void r(p096j9.f fVar, p145o9.f fVar2) {
    }

    @Override // p029c9.k
    public void s(p096j9.f fVar, p096j9.b bVar, p096j9.f fVar2) {
    }
}
