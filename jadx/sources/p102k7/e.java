package p102k7;

import A0.g;
import A0.s;
import C8.InterfaceC0175c;
import E4.B;
import J7.k;
import U.B0;
import U.InterfaceC0432s;
import V.h;
import X9.O;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.A;
import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.api.internal.zabz;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import io.reactivex.exceptions.CompositeException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.locks.ReentrantLock;
import k2.b;
import org.chromium.net.c;
import p.InterfaceC0715m;
import p.U;
import p068ga.d;
import p078i.AbstractActivityC0655l;
import p136o.D;
import p136o.l;
import p136o.w;
import p156q0.C0742a;
import p156q0.K;
import p156q0.M;
import p156q0.P;
import p163q7.j;
import p190t3.f;
import p210v8.i;
import p210v8.q;
import p210v8.t;
import sa.C;
import sa.C0789b;
import ya.InterfaceC0890k;
import ya.L;

/* JADX INFO: loaded from: classes.dex */
public class e implements j, p136o.j, c, w, U, InterfaceC0715m, b, InterfaceC0432s, T, zabz, InterfaceC0890k, k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f12743s;

    public /* synthetic */ e(Object obj) {
        this.f12743s = obj;
    }

    @Override // U.InterfaceC0432s
    public B0 E(View view, B0 b3) {
        int iA = b3.a();
        f fVar = (f) this.f12743s;
        fVar.f15199m = iA;
        fVar.f15200n = b3.b();
        fVar.f15201o = b3.c();
        fVar.e();
        return b3;
    }

    @Override // J7.k
    public void a() {
        ((k) this.f12743s).a();
    }

    @Override // J7.k
    public void b(L7.b bVar) {
        ((k) this.f12743s).b(bVar);
    }

    @Override // p136o.w
    public void c(l lVar, boolean z6) {
        if (lVar instanceof D) {
            ((D) lVar).f13431R.k().c(false);
        }
        w wVar = ((androidx.appcompat.widget.b) this.f12743s).f6273w;
        if (wVar != null) {
            wVar.c(lVar, z6);
        }
    }

    @Override // J7.k
    public void d(Object obj) {
        if (((L) obj) == null) {
            throw new NullPointerException("response == null");
        }
        ((k) this.f12743s).d(new za.c(0));
    }

    @Override // androidx.lifecycle.T
    public Q e(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public void f(Bundle bundle) {
        a aVar = (a) this.f12743s;
        ReentrantLock reentrantLock = aVar.f7931m;
        ReentrantLock reentrantLock2 = aVar.f7931m;
        reentrantLock.lock();
        try {
            Bundle bundle2 = aVar.f7928i;
            if (bundle2 == null) {
                aVar.f7928i = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            aVar.j = ConnectionResult.f7820w;
            a.i(aVar);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // androidx.lifecycle.T
    public Q g(InterfaceC0175c interfaceC0175c, u0.b bVar) {
        return i(d.o(interfaceC0175c), bVar);
    }

    @Override // javax.inject.Provider
    public Object get() {
        String packageName = ((Context) ((h) this.f12743s).f5078t).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // androidx.lifecycle.T
    public Q i(Class cls, u0.b bVar) {
        u0.c cVar;
        InterfaceC0175c interfaceC0175cR = d.r(cls);
        u0.c[] cVarArr = (u0.c[]) this.f12743s;
        u0.c[] cVarArr2 = (u0.c[]) Arrays.copyOf(cVarArr, cVarArr.length);
        i.f(cVarArr2, "initializers");
        int length = cVarArr2.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArr2[i10];
            if (cVar.a.equals(interfaceC0175cR)) {
                break;
            }
            i10++;
        }
        g.a aVar = cVar != null ? new g.a() : null;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + interfaceC0175cR.s()).toString());
    }

    @Override // ya.InterfaceC0890k
    public Object j(Object obj) {
        return Optional.ofNullable(((InterfaceC0890k) this.f12743s).j((O) obj));
    }

    @Override // p136o.j
    public boolean k(l lVar, MenuItem menuItem) {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) this.f12743s;
        if (bottomNavigationView.f9779x != null && menuItem.getItemId() == bottomNavigationView.getSelectedItemId()) {
            B b3 = (B) bottomNavigationView.f9779x;
            androidx.fragment.app.b bVarE = ((M) b3.f1351u).E((String) ((SparseArray) b3.f1350t).get(menuItem.getItemId()));
            i.d(bVarE, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
            y0.B bG0 = ((s) bVarE).g0();
            bG0.n(bG0.h().f16008D, false);
            return true;
        }
        p118m3.i iVar = bottomNavigationView.f9778w;
        if (iVar == null) {
            return false;
        }
        N4.c cVar = (N4.c) iVar;
        M m2 = cVar.a;
        SparseArray sparseArray = cVar.f3320b;
        t tVar = cVar.f3321c;
        q qVar = cVar.f3323e;
        A a = cVar.f3324f;
        i.f(menuItem, "item");
        if (!m2.P()) {
            String str = (String) sparseArray.get(menuItem.getItemId());
            if (!i.a(tVar.f15466s, str)) {
                String str2 = cVar.f3322d;
                m2.x(new K(m2, str2, -1), false);
                androidx.fragment.app.b bVarE2 = m2.E(str);
                i.d(bVarE2, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                s sVar = (s) bVarE2;
                if (!i.a(str2, str)) {
                    C0742a c0742a = new C0742a(m2);
                    c0742a.b(new P(7, sVar));
                    c0742a.o(sVar);
                    int size = sparseArray.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        sparseArray.keyAt(i10);
                        if (!i.a((String) sparseArray.valueAt(i10), str)) {
                            androidx.fragment.app.b bVarE3 = m2.E(str2);
                            i.c(bVarE3);
                            c0742a.i(bVarE3);
                        }
                    }
                    c0742a.c(str2);
                    c0742a.f14307p = true;
                    c0742a.f();
                }
                tVar.f15466s = str;
                qVar.f15463s = i.a(str, str2);
                a.e(sVar.g0());
                return false;
            }
        }
        return true;
    }

    @Override // p136o.w
    public boolean l(l lVar) {
        androidx.appcompat.widget.b bVar = (androidx.appcompat.widget.b) this.f12743s;
        if (lVar == bVar.f6271u) {
            return false;
        }
        bVar.f6268Q = ((D) lVar).f13432S.f13538s;
        w wVar = bVar.f6273w;
        if (wVar != null) {
            return wVar.l(lVar);
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public void o(ConnectionResult connectionResult) {
        a aVar = (a) this.f12743s;
        ReentrantLock reentrantLock = aVar.f7931m;
        ReentrantLock reentrantLock2 = aVar.f7931m;
        reentrantLock.lock();
        try {
            aVar.j = connectionResult;
            a.i(aVar);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // J7.k
    public void onError(Throwable th) {
        int i10 = 0;
        k kVar = (k) this.f12743s;
        try {
            kVar.d(new za.c(i10));
            kVar.a();
        } catch (Throwable th2) {
            try {
                kVar.onError(th2);
            } catch (Throwable th3) {
                p068ga.l.n(th3);
                J7.j.y(new CompositeException(th2, th3));
            }
        }
    }

    @Override // p163q7.j
    public boolean p() {
        return ((f) this.f12743s).f12754s;
    }

    @Override // org.chromium.net.c
    public FileChannel q() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f12743s;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        throw new IllegalArgumentException("Not a file: " + parcelFileDescriptor);
    }

    public B6.i s(String... strArr) {
        List<String> listC = p086i8.l.C(Arrays.copyOf(strArr, strArr.length));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        int i10 = Build.VERSION.SDK_INT;
        AbstractActivityC0655l abstractActivityC0655l = (AbstractActivityC0655l) this.f12743s;
        int i11 = abstractActivityC0655l.getApplicationInfo().targetSdkVersion;
        for (String str : listC) {
            if (A6.a.a.contains(str)) {
                linkedHashSet2.add(str);
            } else {
                linkedHashSet.add(str);
            }
        }
        if (linkedHashSet2.contains("android.permission.ACCESS_BACKGROUND_LOCATION") && (i10 == 29 || (i10 == 30 && i11 < 30))) {
            linkedHashSet2.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
            linkedHashSet.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        if (linkedHashSet2.contains("android.permission.POST_NOTIFICATIONS") && i10 >= 33 && i11 >= 33) {
            linkedHashSet2.remove("android.permission.POST_NOTIFICATIONS");
            linkedHashSet.add("android.permission.POST_NOTIFICATIONS");
        }
        B6.i iVar = new B6.i();
        iVar.f749b = -1;
        iVar.f752e = new LinkedHashSet();
        iVar.f753f = new LinkedHashSet();
        iVar.f754g = new LinkedHashSet();
        iVar.f755h = new LinkedHashSet();
        new LinkedHashSet();
        iVar.f756i = new LinkedHashSet();
        iVar.a = abstractActivityC0655l;
        iVar.f750c = linkedHashSet;
        iVar.f751d = linkedHashSet2;
        return iVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public void t(int i10) {
        ConnectionResult connectionResult;
        a aVar = (a) this.f12743s;
        ReentrantLock reentrantLock = aVar.f7931m;
        ReentrantLock reentrantLock2 = aVar.f7931m;
        reentrantLock.lock();
        try {
            if (aVar.f7930l || (connectionResult = aVar.f7929k) == null || !connectionResult.T()) {
                aVar.f7930l = false;
                a.h(aVar, i10);
            } else {
                aVar.f7930l = true;
                aVar.f7924e.onConnectionSuspended(i10);
            }
        } finally {
            reentrantLock2.unlock();
        }
    }

    public e(C0789b c0789b) {
        this.f12743s = new C(0, 0);
    }

    public e(WorkDatabase workDatabase) {
        i.f(workDatabase, "workDatabase");
        this.f12743s = workDatabase;
    }

    @Override // p.U
    public void h(int i10) {
    }

    @Override // p.U
    public void m(int i10) {
    }

    @Override // p136o.j
    public void r(l lVar) {
    }

    @Override // p.U
    public void n(int i10, float f10) {
    }
}
