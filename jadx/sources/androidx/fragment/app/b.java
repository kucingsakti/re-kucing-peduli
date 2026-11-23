package androidx.fragment.app;

import B6.h;
import C0.r;
import C8.InterfaceC0175c;
import N1.t;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.lifecycle.A;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0519n;
import androidx.lifecycle.InterfaceC0514i;
import androidx.lifecycle.InterfaceC0523s;
import androidx.lifecycle.L;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import com.kcstream.cing.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p068ga.l;
import p078i.AbstractActivityC0655l;
import p156q0.C0757p;
import p156q0.C0758q;
import p156q0.C0759s;
import p156q0.C0760t;
import p156q0.C0763w;
import p156q0.M;
import p156q0.Q;
import p156q0.y;
import p204v1.g;
import p210v8.i;
import p212w.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0523s, W, InterfaceC0514i, N0.f {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Object f6608s0 = new Object();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f6610B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f6612D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f6613E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f6614F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f6615G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f6616H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f6617I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f6618J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f6619K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f6620L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f6621M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public e f6622N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public C0763w f6623O;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public b f6624Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f6625R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f6626S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public String f6627T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f6628U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f6629V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f6630W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f6631X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f6632Y;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f6634a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ViewGroup f6635b0;
    public View c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f6636d0;
    public C0760t f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f6638g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public LayoutInflater f6639h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f6640i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f6641j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public EnumC0519n f6642k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public C0525u f6643l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public Q f6644m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final A f6645n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public t f6646o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicInteger f6647p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ArrayList f6648q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final C0758q f6649r0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bundle f6651t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SparseArray f6652u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Bundle f6653v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f6654w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Bundle f6656y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b f6657z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6650s = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f6655x = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f6609A = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Boolean f6611C = null;
    public M P = new M();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f6633Z = true;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f6637e0 = true;

    public b() {
        new p122m7.d(this, 5);
        this.f6642k0 = EnumC0519n.f6759w;
        this.f6645n0 = new A();
        this.f6647p0 = new AtomicInteger();
        this.f6648q0 = new ArrayList();
        this.f6649r0 = new C0758q(this);
        t();
    }

    public void A(int i10, int i11, Intent intent) {
        if (e.K(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void B(AbstractActivityC0655l abstractActivityC0655l) {
        this.f6634a0 = true;
        C0763w c0763w = this.f6623O;
        if ((c0763w == null ? null : c0763w.f14368s) != null) {
            this.f6634a0 = true;
        }
    }

    public void C(Bundle bundle) {
        this.f6634a0 = true;
        Z();
        M m2 = this.P;
        if (m2.f6695v >= 1) {
            return;
        }
        m2.f6668H = false;
        m2.f6669I = false;
        m2.f6675O.f14268g = false;
        m2.u(1);
    }

    public void D(Menu menu, MenuInflater menuInflater) {
    }

    public View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void F() {
        this.f6634a0 = true;
    }

    public void G() {
        this.f6634a0 = true;
    }

    public void H() {
        this.f6634a0 = true;
    }

    public LayoutInflater I(Bundle bundle) {
        C0763w c0763w = this.f6623O;
        if (c0763w == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0655l abstractActivityC0655l = c0763w.f14372w;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC0655l.getLayoutInflater().cloneInContext(abstractActivityC0655l);
        layoutInflaterCloneInContext.setFactory2(this.P.f6680f);
        return layoutInflaterCloneInContext;
    }

    public void J(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f6634a0 = true;
        C0763w c0763w = this.f6623O;
        if ((c0763w == null ? null : c0763w.f14368s) != null) {
            this.f6634a0 = true;
        }
    }

    public boolean K(MenuItem menuItem) {
        return false;
    }

    public void L() {
        this.f6634a0 = true;
    }

    public void M(int i10, String[] strArr, int[] iArr) {
    }

    public void N() {
        this.f6634a0 = true;
    }

    public void O(Bundle bundle) {
    }

    public void P() {
        this.f6634a0 = true;
    }

    public void Q() {
        this.f6634a0 = true;
    }

    public void R(View view, Bundle bundle) {
    }

    public void S(Bundle bundle) {
        this.f6634a0 = true;
    }

    public void T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.P.R();
        this.f6620L = true;
        this.f6644m0 = new Q(this, e(), new B6.d(this, 27));
        View viewE = E(layoutInflater, viewGroup, bundle);
        this.c0 = viewE;
        if (viewE == null) {
            if (this.f6644m0.f14280v != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f6644m0 = null;
            return;
        }
        this.f6644m0.c();
        if (e.K(3)) {
            Objects.toString(this.c0);
            toString();
        }
        L.g(this.c0, this.f6644m0);
        View view = this.c0;
        Q q10 = this.f6644m0;
        i.f(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q10);
        xa.d.u(this.c0, this.f6644m0);
        this.f6645n0.e(this.f6644m0);
    }

    public final C0757p U(p049f.a aVar, l lVar) {
        h hVar = (h) this;
        p102k7.e eVar = new p102k7.e(hVar);
        if (this.f6650s > 1) {
            throw new IllegalStateException(AbstractC0487g.i("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        C0759s c0759s = new C0759s(hVar, eVar, atomicReference, lVar, aVar);
        if (this.f6650s >= 0) {
            c0759s.a();
        } else {
            this.f6648q0.add(c0759s);
        }
        return new C0757p(atomicReference);
    }

    public final void V(String[] strArr) {
        if (this.f6623O == null) {
            throw new IllegalStateException(AbstractC0487g.i("Fragment ", this, " not attached to Activity"));
        }
        e eVarP = p();
        if (eVarP.f6665E == null) {
            eVarP.f6696w.getClass();
            i.f(strArr, "permissions");
        } else {
            eVarP.f6666F.addLast(new FragmentManager$LaunchedFragmentInfo(this.f6655x, 1));
            eVarP.f6665E.a(strArr);
        }
    }

    public final AbstractActivityC0655l W() {
        AbstractActivityC0655l abstractActivityC0655lF = f();
        if (abstractActivityC0655lF != null) {
            return abstractActivityC0655lF;
        }
        throw new IllegalStateException(AbstractC0487g.i("Fragment ", this, " not attached to an activity."));
    }

    public final Context X() {
        Context contextM = m();
        if (contextM != null) {
            return contextM;
        }
        throw new IllegalStateException(AbstractC0487g.i("Fragment ", this, " not attached to a context."));
    }

    public final View Y() {
        View view = this.c0;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(AbstractC0487g.i("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void Z() {
        Bundle bundle;
        Bundle bundle2 = this.f6651t;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.P.X(bundle);
        M m2 = this.P;
        m2.f6668H = false;
        m2.f6669I = false;
        m2.f6675O.f14268g = false;
        m2.u(1);
    }

    @Override // N0.f
    public final N0.e a() {
        return (N0.e) this.f6646o0.f3308d;
    }

    public final void a0(int i10, int i11, int i12, int i13) {
        if (this.f0 == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        j().f14358b = i10;
        j().f14359c = i11;
        j().f14360d = i12;
        j().f14361e = i13;
    }

    public final void b(int i10, Intent intent) {
        if (this.f6623O == null) {
            throw new IllegalStateException(AbstractC0487g.i("Fragment ", this, " not attached to Activity"));
        }
        e eVarP = p();
        if (eVarP.f6663C != null) {
            eVarP.f6666F.addLast(new FragmentManager$LaunchedFragmentInfo(this.f6655x, i10));
            eVarP.f6663C.a(intent);
        } else {
            C0763w c0763w = eVarP.f6696w;
            c0763w.getClass();
            i.f(intent, "intent");
            if (i10 != -1) {
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
            c0763w.f14369t.startActivity(intent, null);
        }
    }

    public final void b0(Bundle bundle) {
        e eVar = this.f6622N;
        if (eVar != null) {
            if (eVar == null ? false : eVar.P()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f6656y = bundle;
    }

    public final void c0(boolean z6) {
        if (this.f6632Y != z6) {
            this.f6632Y = z6;
            if (!v() || w()) {
                return;
            }
            this.f6623O.f14372w.invalidateOptionsMenu();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0514i
    public final u0.b d() {
        Application application;
        Context applicationContext = X().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && e.K(3)) {
            Objects.toString(X().getApplicationContext());
        }
        u0.b bVar = new u0.b(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f577s;
        if (application != null) {
            linkedHashMap.put(S.f6746z, application);
        }
        linkedHashMap.put(L.a, this);
        linkedHashMap.put(L.f6733b, this);
        Bundle bundle = this.f6656y;
        if (bundle != null) {
            linkedHashMap.put(L.f6734c, bundle);
        }
        return bVar;
    }

    public final void d0(boolean z6) {
        if (this.f6633Z != z6) {
            this.f6633Z = z6;
            if (this.f6632Y && v() && !w()) {
                this.f6623O.f14372w.invalidateOptionsMenu();
            }
        }
    }

    @Override // androidx.lifecycle.W
    public final V e() {
        if (this.f6622N == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (o() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f6622N.f6675O.f14265d;
        V v4 = (V) map.get(this.f6655x);
        if (v4 != null) {
            return v4;
        }
        V v10 = new V();
        map.put(this.f6655x, v10);
        return v10;
    }

    public final void e0(r rVar) {
        if (rVar != null) {
            p167r0.b bVar = p167r0.c.a;
            p167r0.c.b(new SetTargetFragmentUsageViolation(this, "Attempting to set target fragment " + rVar + " with request code 0 for fragment " + this));
            p167r0.c.a(this).getClass();
        }
        e eVar = this.f6622N;
        e eVar2 = rVar != null ? rVar.f6622N : null;
        if (eVar != null && eVar2 != null && eVar != eVar2) {
            throw new IllegalArgumentException("Fragment " + rVar + " must share the same FragmentManager to be set as a target fragment");
        }
        for (b bVarS = rVar; bVarS != null; bVarS = bVarS.s(false)) {
            if (super.equals(this)) {
                throw new IllegalArgumentException("Setting " + rVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (rVar == null) {
            this.f6609A = null;
            this.f6657z = null;
        } else if (this.f6622N == null || rVar.f6622N == null) {
            this.f6609A = null;
            this.f6657z = rVar;
        } else {
            this.f6609A = rVar.f6655x;
            this.f6657z = null;
        }
        this.f6610B = 0;
    }

    public final void f0(Intent intent) {
        C0763w c0763w = this.f6623O;
        if (c0763w == null) {
            throw new IllegalStateException(AbstractC0487g.i("Fragment ", this, " not attached to Activity"));
        }
        i.f(intent, "intent");
        c0763w.f14369t.startActivity(intent, null);
    }

    @Override // androidx.lifecycle.InterfaceC0523s
    public final C0525u g() {
        return this.f6643l0;
    }

    public y h() {
        return new p156q0.r(this);
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f6625R));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f6626S));
        printWriter.print(" mTag=");
        printWriter.println(this.f6627T);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f6650s);
        printWriter.print(" mWho=");
        printWriter.print(this.f6655x);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f6621M);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f6612D);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f6613E);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f6616H);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f6617I);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f6628U);
        printWriter.print(" mDetached=");
        printWriter.print(this.f6629V);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f6633Z);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f6632Y);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f6630W);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f6637e0);
        if (this.f6622N != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f6622N);
        }
        if (this.f6623O != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f6623O);
        }
        if (this.f6624Q != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f6624Q);
        }
        if (this.f6656y != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f6656y);
        }
        if (this.f6651t != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f6651t);
        }
        if (this.f6652u != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f6652u);
        }
        if (this.f6653v != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f6653v);
        }
        b bVarS = s(false);
        if (bVarS != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(bVarS);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f6610B);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        C0760t c0760t = this.f0;
        printWriter.println(c0760t == null ? false : c0760t.a);
        C0760t c0760t2 = this.f0;
        if ((c0760t2 == null ? 0 : c0760t2.f14358b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            C0760t c0760t3 = this.f0;
            printWriter.println(c0760t3 == null ? 0 : c0760t3.f14358b);
        }
        C0760t c0760t4 = this.f0;
        if ((c0760t4 == null ? 0 : c0760t4.f14359c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            C0760t c0760t5 = this.f0;
            printWriter.println(c0760t5 == null ? 0 : c0760t5.f14359c);
        }
        C0760t c0760t6 = this.f0;
        if ((c0760t6 == null ? 0 : c0760t6.f14360d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            C0760t c0760t7 = this.f0;
            printWriter.println(c0760t7 == null ? 0 : c0760t7.f14360d);
        }
        C0760t c0760t8 = this.f0;
        if ((c0760t8 == null ? 0 : c0760t8.f14361e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            C0760t c0760t9 = this.f0;
            printWriter.println(c0760t9 == null ? 0 : c0760t9.f14361e);
        }
        if (this.f6635b0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f6635b0);
        }
        if (this.c0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.c0);
        }
        if (m() != null) {
            V vE = e();
            g gVar = p213w0.a.f15513c;
            i.f(vE, "store");
            u0.a aVar = u0.a.f15287t;
            i.f(aVar, "defaultCreationExtras");
            Y1.c cVar = new Y1.c(vE, gVar, aVar);
            InterfaceC0175c interfaceC0175cR = p068ga.d.r(p213w0.a.class);
            String strS = interfaceC0175cR.s();
            if (strS == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            j jVar = ((p213w0.a) cVar.A("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strS), interfaceC0175cR)).f15514b;
            if (jVar.h() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                if (jVar.h() > 0) {
                    if (jVar.i(0) != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(jVar.e(0));
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("Child " + this.P + ":");
        this.P.v(p231y.a.c(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final C0760t j() {
        if (this.f0 == null) {
            C0760t c0760t = new C0760t();
            Object obj = f6608s0;
            c0760t.f14363g = obj;
            c0760t.f14364h = obj;
            c0760t.f14365i = obj;
            c0760t.j = 1.0f;
            c0760t.f14366k = null;
            this.f0 = c0760t;
        }
        return this.f0;
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final AbstractActivityC0655l f() {
        C0763w c0763w = this.f6623O;
        if (c0763w == null) {
            return null;
        }
        return c0763w.f14368s;
    }

    public final e l() {
        if (this.f6623O != null) {
            return this.P;
        }
        throw new IllegalStateException(AbstractC0487g.i("Fragment ", this, " has not been attached yet."));
    }

    public final Context m() {
        C0763w c0763w = this.f6623O;
        if (c0763w == null) {
            return null;
        }
        return c0763w.f14369t;
    }

    public final LayoutInflater n() {
        LayoutInflater layoutInflater = this.f6639h0;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterI = I(null);
        this.f6639h0 = layoutInflaterI;
        return layoutInflaterI;
    }

    public final int o() {
        EnumC0519n enumC0519n = this.f6642k0;
        return (enumC0519n == EnumC0519n.f6756t || this.f6624Q == null) ? enumC0519n.ordinal() : Math.min(enumC0519n.ordinal(), this.f6624Q.o());
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f6634a0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        W().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f6634a0 = true;
    }

    public final e p() {
        e eVar = this.f6622N;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException(AbstractC0487g.i("Fragment ", this, " not associated with a fragment manager."));
    }

    public final Resources q() {
        return X().getResources();
    }

    public final String r(int i10) {
        return q().getString(i10);
    }

    public final b s(boolean z6) {
        String str;
        if (z6) {
            p167r0.b bVar = p167r0.c.a;
            p167r0.c.b(new GetTargetFragmentUsageViolation(this, "Attempting to get target fragment from fragment " + this));
            p167r0.c.a(this).getClass();
        }
        b bVar2 = this.f6657z;
        if (bVar2 != null) {
            return bVar2;
        }
        e eVar = this.f6622N;
        if (eVar == null || (str = this.f6609A) == null) {
            return null;
        }
        return eVar.f6677c.g(str);
    }

    public final void t() {
        this.f6643l0 = new C0525u(this);
        this.f6646o0 = new t(this);
        ArrayList arrayList = this.f6648q0;
        C0758q c0758q = this.f6649r0;
        if (arrayList.contains(c0758q)) {
            return;
        }
        if (this.f6650s >= 0) {
            c0758q.a();
        } else {
            arrayList.add(c0758q);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f6655x);
        if (this.f6625R != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f6625R));
        }
        if (this.f6627T != null) {
            sb.append(" tag=");
            sb.append(this.f6627T);
        }
        sb.append(")");
        return sb.toString();
    }

    public final void u() {
        t();
        this.f6641j0 = this.f6655x;
        this.f6655x = UUID.randomUUID().toString();
        this.f6612D = false;
        this.f6613E = false;
        this.f6616H = false;
        this.f6617I = false;
        this.f6619K = false;
        this.f6621M = 0;
        this.f6622N = null;
        this.P = new M();
        this.f6623O = null;
        this.f6625R = 0;
        this.f6626S = 0;
        this.f6627T = null;
        this.f6628U = false;
        this.f6629V = false;
    }

    public final boolean v() {
        return this.f6623O != null && this.f6612D;
    }

    public final boolean w() {
        if (this.f6628U) {
            return true;
        }
        e eVar = this.f6622N;
        if (eVar != null) {
            b bVar = this.f6624Q;
            eVar.getClass();
            if (bVar == null ? false : bVar.w()) {
                return true;
            }
        }
        return false;
    }

    public final boolean x() {
        return this.f6621M > 0;
    }

    public final boolean y() {
        View view;
        return (!v() || w() || (view = this.c0) == null || view.getWindowToken() == null || this.c0.getVisibility() != 0) ? false : true;
    }

    public void z() {
        this.f6634a0 = true;
    }
}
