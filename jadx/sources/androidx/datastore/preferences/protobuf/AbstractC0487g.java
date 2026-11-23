package androidx.datastore.preferences.protobuf;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.measurement.zzit;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0487g {
    public static final void a(int i10, View view, ViewGroup viewGroup) {
        p210v8.i.f(view, "view");
        p210v8.i.f(viewGroup, "container");
        int iD = p239z.e.d(i10);
        if (iD == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (androidx.fragment.app.e.K(2)) {
                    view.toString();
                    viewGroup2.toString();
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iD == 1) {
            if (androidx.fragment.app.e.K(2)) {
                view.toString();
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (androidx.fragment.app.e.K(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iD == 2) {
            if (androidx.fragment.app.e.K(2)) {
                view.toString();
            }
            view.setVisibility(8);
        } else {
            if (iD != 3) {
                return;
            }
            if (androidx.fragment.app.e.K(2)) {
                view.toString();
            }
            view.setVisibility(4);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 3 || i10 == 4 || i10 == 6;
    }

    public static /* synthetic */ int c(int i10) {
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 0;
        }
        if (i10 == 3) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        throw null;
    }

    public static /* synthetic */ int d(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 0;
        }
        if (i10 == 3) {
            return -1;
        }
        throw null;
    }

    public static int e(int i10, int i11, int i12) {
        return C0491k.y(i10) + i11 + i12;
    }

    public static int f(int i10, int i11, int i12, int i13) {
        return C0491k.z(i10) + i11 + i12 + i13;
    }

    public static String g(int i10, String str) {
        return str + i10;
    }

    public static String h(String str, int i10, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    public static String i(String str, androidx.fragment.app.b bVar, String str2) {
        return str + bVar + str2;
    }

    public static String j(StringBuilder sb, String str, char c10) {
        sb.append(str);
        sb.append(c10);
        return sb.toString();
    }

    public static String k(p210v8.v vVar, Class cls, StringBuilder sb) {
        sb.append(vVar.b(cls));
        return sb.toString();
    }

    public static StringBuilder l(String str, int i10, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i10);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder m(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static HashMap n(Class cls, p034d4.a aVar) {
        HashMap map = new HashMap();
        map.put(cls, aVar);
        return map;
    }

    public static Map o(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static /* synthetic */ void p(int i10, String str) {
        if (i10 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(p210v8.i.i(str));
        p210v8.i.j(nullPointerException, p210v8.i.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ void q(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void r(String str, String str2) {
        p086i8.C.a(p086i8.C.c(str));
        p086i8.C.a(p086i8.C.c(str2));
    }

    public static boolean s(String str, String str2) {
        return str2.equals(p086i8.C.a(p086i8.C.c(str)));
    }

    public static int t(int i10, int i11, int i12) {
        return zzit.g(i10) + i11 + i12;
    }

    public static /* synthetic */ void u(int i10, String str) {
        if (i10 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(p231y.a.c(str, " must not be null"));
        p210v8.i.j(nullPointerException, p210v8.i.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ void v(int i10, String str) {
        if (i10 != 0) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p210v8.i.i(str));
        p210v8.i.j(illegalArgumentException, p210v8.i.class.getName());
        throw illegalArgumentException;
    }
}
