package I3;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p073h4.b {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2024b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.f2024b = obj;
    }

    @Override // p073h4.b
    public final Object get() {
        switch (this.a) {
            case 0:
                String str = (String) this.f2024b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new InvalidRegistrarException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new InvalidRegistrarException(E0.a.i("Could not instantiate ", str, "."), e10);
                } catch (InstantiationException e11) {
                    throw new InvalidRegistrarException(E0.a.i("Could not instantiate ", str, "."), e11);
                } catch (NoSuchMethodException e12) {
                    throw new InvalidRegistrarException(E0.a.h("Could not instantiate ", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new InvalidRegistrarException(E0.a.h("Could not instantiate ", str), e13);
                }
            case 1:
                return (ComponentRegistrar) this.f2024b;
            default:
                return new p092j4.b((D3.g) this.f2024b);
        }
    }
}
