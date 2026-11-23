package p060g0;

import androidx.datastore.preferences.protobuf.AbstractC0480b;
import androidx.datastore.preferences.protobuf.AbstractC0500u;
import androidx.datastore.preferences.protobuf.AbstractC0502w;
import androidx.datastore.preferences.protobuf.AbstractC0505z;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C0488h;
import androidx.datastore.preferences.protobuf.C0501v;
import androidx.datastore.preferences.protobuf.InterfaceC0504y;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.Z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p239z.e;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0502w {
    private static final g DEFAULT_INSTANCE;
    private static volatile V PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0504y strings_ = Y.f6441v;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0502w.h(g.class, gVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void i(g gVar, Set set) {
        InterfaceC0504y interfaceC0504y = gVar.strings_;
        if (!((AbstractC0480b) interfaceC0504y).f6447s) {
            int size = interfaceC0504y.size();
            gVar.strings_ = interfaceC0504y.t(size == 0 ? 10 : size * 2);
        }
        List list = gVar.strings_;
        Charset charset = AbstractC0505z.a;
        set.getClass();
        if (!(set instanceof C)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(set.size() + list.size());
            }
            int size2 = list.size();
            for (Object obj : set) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size2) + " is null.";
                    for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                        list.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
            return;
        }
        List listL = ((C) set).l();
        C c10 = (C) list;
        int size4 = list.size();
        for (Object obj2 : listL) {
            if (obj2 == null) {
                String str2 = "Element at index " + (c10.size() - size4) + " is null.";
                for (int size5 = c10.size() - 1; size5 >= size4; size5--) {
                    c10.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            if (obj2 instanceof C0488h) {
                c10.B((C0488h) obj2);
            } else {
                c10.add((String) obj2);
            }
        }
    }

    public static g j() {
        return DEFAULT_INSTANCE;
    }

    public static f l() {
        return (f) ((AbstractC0500u) DEFAULT_INSTANCE.d(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0502w
    public final Object d(int i10) {
        V c0501v;
        switch (e.d(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new Z(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new g();
            case 4:
                return new f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                V v4 = PARSER;
                if (v4 != null) {
                    return v4;
                }
                synchronized (g.class) {
                    try {
                        c0501v = PARSER;
                        if (c0501v == null) {
                            c0501v = new C0501v();
                            PARSER = c0501v;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c0501v;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final InterfaceC0504y k() {
        return this.strings_;
    }
}
