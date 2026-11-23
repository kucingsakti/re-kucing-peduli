package p156q0;

import androidx.fragment.app.b;
import androidx.fragment.app.e;
import androidx.lifecycle.EnumC0519n;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;
import p167r0.c;

/* JADX INFO: renamed from: q0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0742a implements J {
    public final ArrayList a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f14301i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f14302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f14304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f14305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f14306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f14308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f14309r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14310s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14311t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14312u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0742a(e eVar) {
        this();
        eVar.I();
        C0763w c0763w = eVar.f6696w;
        if (c0763w != null) {
            c0763w.f14369t.getClassLoader();
        }
        this.f14311t = -1;
        this.f14312u = false;
        this.f14309r = eVar;
    }

    @Override // p156q0.J
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (e.K(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f14299g) {
            return true;
        }
        this.f14309r.f6678d.add(this);
        return true;
    }

    public final void b(P p10) {
        this.a.add(p10);
        p10.f14271d = this.f14294b;
        p10.f14272e = this.f14295c;
        p10.f14273f = this.f14296d;
        p10.f14274g = this.f14297e;
    }

    public final void c(String str) {
        if (!this.f14300h) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f14299g = true;
        this.f14301i = str;
    }

    public final void d(int i10) {
        if (this.f14299g) {
            if (e.K(2)) {
                toString();
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                P p10 = (P) arrayList.get(i11);
                b bVar = p10.f14269b;
                if (bVar != null) {
                    bVar.f6621M += i10;
                    if (e.K(2)) {
                        Objects.toString(p10.f14269b);
                        int i12 = p10.f14269b.f6621M;
                    }
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            P p10 = (P) arrayList.get(size);
            if (p10.f14270c) {
                if (p10.a == 8) {
                    p10.f14270c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i10 = p10.f14269b.f6626S;
                    p10.a = 2;
                    p10.f14270c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        P p11 = (P) arrayList.get(i11);
                        if (p11.f14270c && p11.f14269b.f6626S == i10) {
                            arrayList.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final void f() {
        g(false, true);
    }

    public final int g(boolean z6, boolean z10) {
        if (this.f14310s) {
            throw new IllegalStateException("commit already called");
        }
        if (e.K(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new S());
            k("  ", printWriter, true);
            printWriter.close();
        }
        this.f14310s = true;
        boolean z11 = this.f14299g;
        e eVar = this.f14309r;
        if (z11) {
            this.f14311t = eVar.f6684k.getAndIncrement();
        } else {
            this.f14311t = -1;
        }
        if (z10) {
            eVar.x(this, z6);
        }
        return this.f14311t;
    }

    public final void h() {
        if (this.f14299g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f14300h = false;
        this.f14309r.A(this, false);
    }

    public final void i(b bVar) {
        e eVar = bVar.f6622N;
        if (eVar == null || eVar == this.f14309r) {
            b(new P(6, bVar));
            return;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + bVar.toString() + " is already attached to a FragmentManager.");
    }

    public final void j(int i10, b bVar, String str, int i11) {
        String str2 = bVar.f6641j0;
        if (str2 != null) {
            c.c(bVar, str2);
        }
        Class<?> cls = bVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = bVar.f6627T;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + bVar + ": was " + bVar.f6627T + " now " + str);
            }
            bVar.f6627T = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + bVar + " with tag " + str + " to container view with no id");
            }
            int i12 = bVar.f6625R;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + bVar + ": was " + bVar.f6625R + " now " + i10);
            }
            bVar.f6625R = i10;
            bVar.f6626S = i10;
        }
        b(new P(i11, bVar));
        bVar.f6622N = this.f14309r;
    }

    public final void k(String str, PrintWriter printWriter, boolean z6) {
        String str2;
        if (z6) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f14301i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f14311t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f14310s);
            if (this.f14298f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f14298f));
            }
            if (this.f14294b != 0 || this.f14295c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f14294b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f14295c));
            }
            if (this.f14296d != 0 || this.f14297e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f14296d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f14297e));
            }
            if (this.j != 0 || this.f14302k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f14302k);
            }
            if (this.f14303l != 0 || this.f14304m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f14303l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f14304m);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            P p10 = (P) arrayList.get(i10);
            switch (p10.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + p10.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(p10.f14269b);
            if (z6) {
                if (p10.f14271d != 0 || p10.f14272e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p10.f14271d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p10.f14272e));
                }
                if (p10.f14273f != 0 || p10.f14274g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p10.f14273f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p10.f14274g));
                }
            }
        }
    }

    public final void l(b bVar) {
        e eVar = bVar.f6622N;
        if (eVar == null || eVar == this.f14309r) {
            b(new P(3, bVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + bVar.toString() + " is already attached to a FragmentManager.");
    }

    public final void m(int i10, b bVar, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        j(i10, bVar, str, 2);
    }

    public final void n(b bVar, EnumC0519n enumC0519n) {
        e eVar = bVar.f6622N;
        e eVar2 = this.f14309r;
        if (eVar != eVar2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + eVar2);
        }
        if (enumC0519n == EnumC0519n.f6756t && bVar.f6650s > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC0519n + " after the Fragment has been created");
        }
        if (enumC0519n == EnumC0519n.f6755s) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC0519n + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        P p10 = new P();
        p10.a = 10;
        p10.f14269b = bVar;
        p10.f14270c = false;
        p10.f14275h = bVar.f6642k0;
        p10.f14276i = enumC0519n;
        b(p10);
    }

    public final void o(b bVar) {
        e eVar = bVar.f6622N;
        if (eVar == null || eVar == this.f14309r) {
            b(new P(8, bVar));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + bVar.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f14311t >= 0) {
            sb.append(" #");
            sb.append(this.f14311t);
        }
        if (this.f14301i != null) {
            sb.append(" ");
            sb.append(this.f14301i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0742a(C0742a c0742a) {
        this();
        c0742a.f14309r.I();
        C0763w c0763w = c0742a.f14309r.f6696w;
        if (c0763w != null) {
            c0763w.f14369t.getClassLoader();
        }
        for (P p10 : c0742a.a) {
            ArrayList arrayList = this.a;
            P p11 = new P();
            p11.a = p10.a;
            p11.f14269b = p10.f14269b;
            p11.f14270c = p10.f14270c;
            p11.f14271d = p10.f14271d;
            p11.f14272e = p10.f14272e;
            p11.f14273f = p10.f14273f;
            p11.f14274g = p10.f14274g;
            p11.f14275h = p10.f14275h;
            p11.f14276i = p10.f14276i;
            arrayList.add(p11);
        }
        this.f14294b = c0742a.f14294b;
        this.f14295c = c0742a.f14295c;
        this.f14296d = c0742a.f14296d;
        this.f14297e = c0742a.f14297e;
        this.f14298f = c0742a.f14298f;
        this.f14299g = c0742a.f14299g;
        this.f14300h = c0742a.f14300h;
        this.f14301i = c0742a.f14301i;
        this.f14303l = c0742a.f14303l;
        this.f14304m = c0742a.f14304m;
        this.j = c0742a.j;
        this.f14302k = c0742a.f14302k;
        if (c0742a.f14305n != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f14305n = arrayList2;
            arrayList2.addAll(c0742a.f14305n);
        }
        if (c0742a.f14306o != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f14306o = arrayList3;
            arrayList3.addAll(c0742a.f14306o);
        }
        this.f14307p = c0742a.f14307p;
        this.f14311t = -1;
        this.f14312u = false;
        this.f14309r = c0742a.f14309r;
        this.f14310s = c0742a.f14310s;
        this.f14311t = c0742a.f14311t;
        this.f14312u = c0742a.f14312u;
    }

    public C0742a() {
        this.a = new ArrayList();
        this.f14300h = true;
        this.f14307p = false;
    }
}
