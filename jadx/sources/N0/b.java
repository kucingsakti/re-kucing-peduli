package N0;

import Q9.m;
import Q9.t;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.EnumC0518m;
import androidx.lifecycle.InterfaceC0513h;
import androidx.lifecycle.InterfaceC0522q;
import androidx.lifecycle.InterfaceC0523s;
import androidx.lifecycle.L;
import androidx.lifecycle.M;
import androidx.lifecycle.Q;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import p086i8.k;
import p156q0.DialogInterfaceOnCancelListenerC0756o;
import p210v8.i;
import y0.C0872j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0522q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3262s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f3263t;

    public /* synthetic */ b(Object obj, int i10) {
        this.f3262s = i10;
        this.f3263t = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0522q
    public final void onStateChanged(InterfaceC0523s interfaceC0523s, EnumC0518m enumC0518m) {
        int iNextIndex;
        View view;
        switch (this.f3262s) {
            case 0:
                if (enumC0518m != EnumC0518m.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0523s.g().f(this);
                f fVar = (f) this.f3263t;
                Bundle bundleC = fVar.a().c("androidx.savedstate.Restarter");
                if (bundleC == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleC.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        i.e(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                                i.e(objNewInstance, "{\n                constr…wInstance()\n            }");
                                if (!(fVar instanceof W)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                V vE = ((W) fVar).e();
                                e eVarA = fVar.a();
                                vE.getClass();
                                LinkedHashMap linkedHashMap = vE.a;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    i.f(str2, "key");
                                    Q q10 = (Q) linkedHashMap.get(str2);
                                    i.c(q10);
                                    L.a(q10, eVarA, fVar.g());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    eVarA.g();
                                }
                            } catch (Exception e10) {
                                throw new RuntimeException(E0.a.h("Failed to instantiate ", str), e10);
                            }
                        } catch (NoSuchMethodException e11) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                        }
                    } catch (ClassNotFoundException e12) {
                        throw new RuntimeException(E0.a.i("Class ", str, " wasn't found"), e12);
                    }
                }
                return;
            case 1:
                int i10 = A0.c.a[enumC0518m.ordinal()];
                A0.d dVar = (A0.d) this.f3263t;
                if (i10 == 1) {
                    DialogInterfaceOnCancelListenerC0756o dialogInterfaceOnCancelListenerC0756o = (DialogInterfaceOnCancelListenerC0756o) interfaceC0523s;
                    Iterable iterable = (Iterable) ((t) ((m) dVar.b().f15941e.f3811t)).f();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (i.a(((C0872j) it.next()).f15932x, dialogInterfaceOnCancelListenerC0756o.f6627T)) {
                                return;
                            }
                        }
                    }
                    dialogInterfaceOnCancelListenerC0756o.g0();
                    return;
                }
                Object obj = null;
                if (i10 == 2) {
                    DialogInterfaceOnCancelListenerC0756o dialogInterfaceOnCancelListenerC0756o2 = (DialogInterfaceOnCancelListenerC0756o) interfaceC0523s;
                    for (Object obj2 : (Iterable) ((t) ((m) dVar.b().f15942f.f3811t)).f()) {
                        if (i.a(((C0872j) obj2).f15932x, dialogInterfaceOnCancelListenerC0756o2.f6627T)) {
                            obj = obj2;
                        }
                    }
                    C0872j c0872j = (C0872j) obj;
                    if (c0872j != null) {
                        dVar.b().b(c0872j);
                        return;
                    }
                    return;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                    DialogInterfaceOnCancelListenerC0756o dialogInterfaceOnCancelListenerC0756o3 = (DialogInterfaceOnCancelListenerC0756o) interfaceC0523s;
                    for (Object obj3 : (Iterable) ((t) ((m) dVar.b().f15942f.f3811t)).f()) {
                        if (i.a(((C0872j) obj3).f15932x, dialogInterfaceOnCancelListenerC0756o3.f6627T)) {
                            obj = obj3;
                        }
                    }
                    C0872j c0872j2 = (C0872j) obj;
                    if (c0872j2 != null) {
                        dVar.b().b(c0872j2);
                    }
                    dialogInterfaceOnCancelListenerC0756o3.f6643l0.f(this);
                    return;
                }
                DialogInterfaceOnCancelListenerC0756o dialogInterfaceOnCancelListenerC0756o4 = (DialogInterfaceOnCancelListenerC0756o) interfaceC0523s;
                if (dialogInterfaceOnCancelListenerC0756o4.l0().isShowing()) {
                    return;
                }
                List list = (List) ((t) ((m) dVar.b().f15941e.f3811t)).f();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (i.a(((C0872j) listIterator.previous()).f15932x, dialogInterfaceOnCancelListenerC0756o4.f6627T)) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                C0872j c0872j3 = (C0872j) k.W(list, iNextIndex);
                if (!i.a(k.c0(list), c0872j3)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + dialogInterfaceOnCancelListenerC0756o4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                if (c0872j3 != null) {
                    dVar.l(iNextIndex, c0872j3, false);
                    return;
                }
                return;
            case 2:
                new HashMap();
                InterfaceC0513h[] interfaceC0513hArr = (InterfaceC0513h[]) this.f3263t;
                if (interfaceC0513hArr.length > 0) {
                    InterfaceC0513h interfaceC0513h = interfaceC0513hArr[0];
                    throw null;
                }
                if (interfaceC0513hArr.length <= 0) {
                    return;
                }
                InterfaceC0513h interfaceC0513h2 = interfaceC0513hArr[0];
                throw null;
            case 3:
                if (enumC0518m != EnumC0518m.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0518m).toString());
                }
                interfaceC0523s.g().f(this);
                ((M) this.f3263t).b();
                return;
            case 4:
                ((p013b1.d) this.f3263t).b(false);
                return;
            default:
                if (enumC0518m != EnumC0518m.ON_STOP || (view = ((androidx.fragment.app.b) this.f3263t).c0) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
        }
    }
}
