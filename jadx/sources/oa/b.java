package oa;

import C8.InterfaceC0178f;
import C8.u;
import F8.AbstractC0224s;
import F8.k0;
import F8.y0;
import G8.e;
import K8.d;
import L8.InterfaceC0271e;
import M8.h;
import V0.y;
import android.content.Context;
import android.os.Build;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import o1.m;
import p050f1.q;
import p061g1.l;
import p086i8.z;
import p096j9.c;
import p210v8.i;
import t9.f;
import t9.k;
import t9.n;
import t9.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static m a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f13838b = true;

    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final h b(h hVar, h hVar2) {
        i.f(hVar, "first");
        i.f(hVar2, "second");
        if (hVar.isEmpty()) {
            return hVar2;
        }
        return hVar2.isEmpty() ? hVar : new M8.i(new h[]{hVar, hVar2});
    }

    public static View c(View view, int i10) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View viewFindViewById = viewGroup.getChildAt(i11).findViewById(i10);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static /* synthetic */ Collection d(p pVar, f fVar, int i10) {
        if ((i10 & 1) != 0) {
            fVar = f.f15238m;
        }
        n.a.getClass();
        return pVar.f(fVar, k.f15254t);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [h8.d, java.lang.Object] */
    public static final Field f(u uVar) {
        i.f(uVar, "<this>");
        k0 k0VarC = y0.c(uVar);
        if (k0VarC != null) {
            return (Field) k0VarC.f1596x.getValue();
        }
        return null;
    }

    public static final Method g(InterfaceC0178f interfaceC0178f) {
        e eVarC;
        i.f(interfaceC0178f, "<this>");
        AbstractC0224s abstractC0224sA = y0.a(interfaceC0178f);
        Member memberY = (abstractC0224sA == null || (eVarC = abstractC0224sA.c()) == null) ? null : eVarC.y();
        if (memberY instanceof Method) {
            return (Method) memberY;
        }
        return null;
    }

    public static String h(String str, String str2) {
        i.f(str, "tableName");
        i.f(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }

    public static m i() {
        m mVar;
        m mVar2 = a;
        if (mVar2 != null) {
            return mVar2;
        }
        try {
            mVar = new m(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
        } catch (NoSuchMethodException unused) {
            Object obj = null;
            mVar = new m(obj, obj, obj, obj);
        }
        a = mVar;
        return mVar;
    }

    public static final void k(Context context) {
        Map mapT;
        i.f(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        i.e(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            q qVarA = q.a();
            String str = l.a;
            qVarA.getClass();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            i.e(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(p061g1.a.a.a(context), "androidx.work.workdb");
            String[] strArr = l.f11492b;
            int iS = z.s(strArr.length);
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (String str2 : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str2), new File(file.getPath() + str2));
            }
            p076h8.f fVar = new p076h8.f(databasePath2, file);
            if (linkedHashMap.isEmpty()) {
                mapT = z.t(fVar);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, file);
                mapT = linkedHashMap2;
            }
            for (Map.Entry entry : mapT.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        q.a().d(l.a, "Over-writing contents of " + file3);
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    q qVarA2 = q.a();
                    String str3 = l.a;
                    qVarA2.getClass();
                }
            }
        }
    }

    public static final String n(InterfaceC0271e interfaceC0271e, String str) {
        String strE;
        i.f(interfaceC0271e, "classDescriptor");
        String str2 = d.a;
        p096j9.e eVarI = p165q9.d.g(interfaceC0271e).i();
        i.e(eVarI, "fqNameSafe.toUnsafe()");
        p096j9.b bVarF = d.f(eVarI);
        if (bVarF != null) {
            strE = p176r9.b.b(bVarF).e();
            i.e(strE, "byClassId(it).internalName");
        } else {
            strE = p068ga.d.e(interfaceC0271e, p029c9.e.f7548d);
        }
        i.f(strE, "internalName");
        return strE + '.' + str;
    }

    public static void o(ViewGroup viewGroup, boolean z6) {
        if (Build.VERSION.SDK_INT >= 29) {
            y.b(viewGroup, z6);
        } else if (f13838b) {
            try {
                y.b(viewGroup, z6);
            } catch (NoSuchMethodError unused) {
                f13838b = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    public static final c p(c cVar, c cVar2) {
        i.f(cVar, "<this>");
        i.f(cVar2, "prefix");
        if (!cVar.equals(cVar2) && !cVar2.d()) {
            String strB = cVar.b();
            String strB2 = cVar2.b();
            if (L9.n.I(strB, strB2, false) && strB.charAt(strB2.length()) == '.') {
                if (!cVar2.d()) {
                    if (cVar.equals(cVar2)) {
                        c cVar3 = c.f12543c;
                        i.e(cVar3, "ROOT");
                        return cVar3;
                    }
                    String strSubstring = cVar.b().substring(cVar2.b().length() + 1);
                    i.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                    return new c(strSubstring);
                }
            }
        } else if (!cVar2.d()) {
            if (cVar.equals(cVar2)) {
                c cVar4 = c.f12543c;
                i.e(cVar4, "ROOT");
                return cVar4;
            }
            String strSubstring2 = cVar.b().substring(cVar2.b().length() + 1);
            i.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            return new c(strSubstring2);
        }
        return cVar;
    }

    public abstract InputFilter[] e(InputFilter[] inputFilterArr);

    public abstract boolean j();

    public abstract void l(boolean z6);

    public abstract void m(boolean z6);

    public abstract TransformationMethod q(TransformationMethod transformationMethod);
}
