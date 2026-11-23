package p156q0;

import E0.a;
import androidx.fragment.app.Fragment$InstantiationException;
import androidx.fragment.app.b;
import androidx.fragment.app.e;
import java.lang.reflect.InvocationTargetException;
import p212w.i;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f14258b = new i(0);
    public final /* synthetic */ e a;

    public F(e eVar) {
        this.a = eVar;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        i iVar = f14258b;
        i iVar2 = (i) iVar.get(classLoader);
        if (iVar2 == null) {
            iVar2 = new i(0);
            iVar.put(classLoader, iVar2);
        }
        Class cls = (Class) iVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        iVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment$InstantiationException(a.i("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment$InstantiationException(a.i("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public final b a(String str) {
        try {
            return (b) c(this.a.f6696w.f14369t.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            throw new Fragment$InstantiationException(a.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (InstantiationException e11) {
            throw new Fragment$InstantiationException(a.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new Fragment$InstantiationException(a.i("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new Fragment$InstantiationException(a.i("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }
}
