package N1;

import A9.O;
import L8.C0289x;
import L8.InterfaceC0268b;
import L8.InterfaceC0273g;
import L8.P;
import O3.y;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0519n;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* JADX INFO: loaded from: classes.dex */
public final class t implements B9.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile t f3305e;
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3308d;

    public t() {
        this.a = 2;
        this.f3307c = new Object();
    }

    public static String b(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    public static t c(Context context) {
        if (f3305e == null) {
            synchronized (t.class) {
                try {
                    if (f3305e == null) {
                        f3305e = new t(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3305e;
    }

    @Override // B9.c
    public boolean a(O o10, O o11) {
        InterfaceC0268b interfaceC0268b = (InterfaceC0268b) this.f3307c;
        p210v8.i.f(interfaceC0268b, "$a");
        InterfaceC0268b interfaceC0268b2 = (InterfaceC0268b) this.f3308d;
        p210v8.i.f(interfaceC0268b2, "$b");
        p210v8.i.f(o10, "c1");
        p210v8.i.f(o11, "c2");
        if (o10.equals(o11)) {
            return true;
        }
        InterfaceC0273g interfaceC0273gW = o10.w();
        InterfaceC0273g interfaceC0273gW2 = o11.w();
        if (!(interfaceC0273gW instanceof P) || !(interfaceC0273gW2 instanceof P)) {
            return false;
        }
        return p124m9.c.a.d((P) interfaceC0273gW, (P) interfaceC0273gW2, this.f3306b, new p124m9.a(interfaceC0268b, interfaceC0268b2));
    }

    public com.google.gson.internal.l d(p243z4.a aVar) {
        com.google.gson.internal.l hVar;
        String str;
        com.google.gson.internal.l yVar;
        int i10 = 0;
        int i11 = 20;
        int i12 = 19;
        Type type = aVar.f16313b;
        Map map = (Map) this.f3307c;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        Class cls = aVar.a;
        if (map.get(cls) != null) {
            throw new ClassCastException();
        }
        com.google.gson.internal.l gVar = null;
        if (EnumSet.class.isAssignableFrom(cls)) {
            hVar = new com.google.gson.internal.e(i10, type);
        } else {
            hVar = cls == EnumMap.class ? new V.h(type, 15) : null;
        }
        if (hVar != null) {
            return hVar;
        }
        com.google.gson.internal.d.e((List) this.f3308d);
        if (Modifier.isAbstract(cls.getModifiers())) {
            yVar = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                xa.d dVar = p235y4.c.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e10) {
                    str = "Failed making constructor '" + p235y4.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage();
                }
                yVar = str != null ? new y(str, 4) : new V.h(declaredConstructor, 16);
            } catch (NoSuchMethodException unused) {
                yVar = null;
            }
        }
        if (yVar != null) {
            return yVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                gVar = new p053f4.e(i12);
            } else if (Set.class.isAssignableFrom(cls)) {
                gVar = new p170r3.e(i12);
            } else {
                gVar = Queue.class.isAssignableFrom(cls) ? new p204v1.g(i12) : new p230x9.d(i12);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                gVar = new za.c(i12);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                gVar = new K3.d(i11);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                gVar = new p053f4.e(i11);
            } else {
                gVar = (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new p243z4.a(((ParameterizedType) type).getActualTypeArguments()[0]).a)) ? new p204v1.g(i11) : new p170r3.e(i11);
            }
        }
        if (gVar != null) {
            return gVar;
        }
        String strB = b(cls);
        if (strB != null) {
            return new C0289x(strB, 2);
        }
        if (this.f3306b) {
            return new V.h(cls, 14);
        }
        return new y("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.", 3);
    }

    public void e() {
        N0.f fVar = (N0.f) this.f3307c;
        C0525u c0525uG = fVar.g();
        if (c0525uG.f6763c != EnumC0519n.f6756t) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        c0525uG.a(new N0.b(fVar, 0));
        N0.e eVar = (N0.e) this.f3308d;
        eVar.getClass();
        if (eVar.a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        c0525uG.a(new A0.e(eVar, 1));
        eVar.a = true;
        this.f3306b = true;
    }

    public void f(Bundle bundle) {
        if (!this.f3306b) {
            e();
        }
        C0525u c0525uG = ((N0.f) this.f3307c).g();
        if (c0525uG.f6763c.compareTo(EnumC0519n.f6758v) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0525uG.f6763c).toString());
        }
        N0.e eVar = (N0.e) this.f3308d;
        if (!eVar.a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (eVar.f3264b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        eVar.f3267e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        eVar.f3264b = true;
    }

    public void g(Bundle bundle) {
        N0.e eVar = (N0.e) this.f3308d;
        eVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) eVar.f3267e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        p166r.f fVar = (p166r.f) eVar.f3266d;
        fVar.getClass();
        p166r.d dVar = new p166r.d(fVar);
        fVar.f14456u.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((N0.d) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void h(P2.e eVar) {
        synchronized (this.f3307c) {
            try {
                if (((ArrayDeque) this.f3308d) == null) {
                    this.f3308d = new ArrayDeque();
                }
                ((ArrayDeque) this.f3308d).add(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(Task task) {
        P2.e eVar;
        synchronized (this.f3307c) {
            if (((ArrayDeque) this.f3308d) != null && !this.f3306b) {
                this.f3306b = true;
                while (true) {
                    synchronized (this.f3307c) {
                        try {
                            eVar = (P2.e) ((ArrayDeque) this.f3308d).poll();
                            if (eVar == null) {
                                this.f3306b = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    eVar.a(task);
                }
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return ((Map) this.f3307c).toString();
            default:
                return super.toString();
        }
    }

    public t(InterfaceC0268b interfaceC0268b, InterfaceC0268b interfaceC0268b2, boolean z6) {
        this.a = 4;
        this.f3306b = z6;
        this.f3307c = interfaceC0268b;
        this.f3308d = interfaceC0268b2;
    }

    public t(N0.f fVar) {
        this.a = 1;
        this.f3307c = fVar;
        this.f3308d = new N0.e();
    }

    public t(Map map, boolean z6, List list) {
        this.a = 3;
        this.f3307c = map;
        this.f3306b = z6;
        this.f3308d = list;
    }

    public t(Context context) {
        Object sVar;
        this.a = 0;
        this.f3308d = new HashSet();
        A1.s sVar2 = new A1.s(new E1.l(context, 3));
        o oVar = new o(this);
        if (Build.VERSION.SDK_INT >= 24) {
            sVar = new K0.g(sVar2, oVar);
        } else {
            sVar = new s(context, sVar2, oVar);
        }
        this.f3307c = sVar;
    }
}
