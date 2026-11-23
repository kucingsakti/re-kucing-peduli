package o1;

import A1.C0095d;
import A1.F;
import A1.RunnableC0094c;
import A1.ThreadFactoryC0093b;
import A1.t;
import A1.y;
import A1.z;
import A9.AbstractC0151y;
import B4.C0163k;
import L8.InterfaceC0271e;
import L8.M;
import L8.e0;
import N9.AbstractC0342z;
import O8.U;
import Q3.u0;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.viewpager2.widget.ViewPager2;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import p.b1;
import p047e9.C0627t;
import p136o.A;
import p136o.s;
import p145o9.w;
import p182s4.Q;
import p182s4.S;
import p188t1.G;
import p188t1.Y;

/* JADX INFO: loaded from: classes.dex */
public final class h implements p029c9.l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static h f13631w;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f13632s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f13633t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f13634u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f13635v;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f13632s = obj;
        this.f13633t = obj2;
        this.f13634u = obj3;
        this.f13635v = obj4;
    }

    public static final Message a(h hVar, ArrayList arrayList, int i10) {
        Object obj;
        hVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Message) obj2).what == i10) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public static h g() {
        if (f13631w == null) {
            f13631w = new h(11);
        }
        return f13631w;
    }

    public static h i(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_bottom_appupdate, (ViewGroup) null, false);
        int i10 = R.id.downloadProgress;
        ProgressBar progressBar = (ProgressBar) oa.b.c(viewInflate, R.id.downloadProgress);
        if (progressBar != null) {
            i10 = R.id.tx_update;
            if (((MaterialTextView) oa.b.c(viewInflate, R.id.tx_update)) != null) {
                i10 = R.id.tx_update_notes;
                MaterialTextView materialTextView = (MaterialTextView) oa.b.c(viewInflate, R.id.tx_update_notes);
                if (materialTextView != null) {
                    i10 = R.id.tx_update_ver;
                    MaterialTextView materialTextView2 = (MaterialTextView) oa.b.c(viewInflate, R.id.tx_update_ver);
                    if (materialTextView2 != null) {
                        return new h((RelativeLayout) viewInflate, progressBar, materialTextView, materialTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // p029c9.l
    public p029c9.k D0(p096j9.b bVar) {
        ArrayList arrayList = new ArrayList();
        return new p140o4.r(((G) this.f13633t).t(bVar, M.a, arrayList), this, arrayList);
    }

    @Override // p029c9.l
    public void G0(Object obj) {
        ((ArrayList) this.f13632s).add(G.b((G) this.f13633t, (p096j9.f) this.f13634u, obj));
    }

    @Override // p029c9.l
    public void K0(p145o9.f fVar) {
        ((ArrayList) this.f13632s).add(new p145o9.r(new p145o9.p(fVar)));
    }

    public synchronized void b(y yVar, z zVar) {
        C0095d c0095d = (C0095d) ((HashMap) this.f13633t).put(yVar, new C0095d(yVar, zVar, (ReferenceQueue) this.f13634u));
        if (c0095d != null) {
            c0095d.f90c = null;
            c0095d.clear();
        }
    }

    public boolean c(p190t3.h hVar, int i10) {
        p190t3.d dVar = (p190t3.d) hVar.a.get();
        if (dVar == null) {
            return false;
        }
        ((Handler) this.f13633t).removeCallbacksAndMessages(hVar);
        Handler handler = p190t3.f.f15186x;
        handler.sendMessage(handler.obtainMessage(1, i10, 0, dVar.a));
        return true;
    }

    public void d(C0095d c0095d) {
        F f10;
        synchronized (this) {
            ((HashMap) this.f13633t).remove(c0095d.a);
            if (c0095d.f89b && (f10 = c0095d.f90c) != null) {
                ((t) this.f13635v).e(c0095d.a, new z(f10, true, false, c0095d.a, (t) this.f13635v));
            }
        }
    }

    public void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((p212w.i) this.f13633t).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public p125n.d f(e0 e0Var) {
        ArrayList arrayList = (ArrayList) this.f13634u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            p125n.d dVar = (p125n.d) arrayList.get(i10);
            if (dVar != null && dVar.f13239b == e0Var) {
                return dVar;
            }
        }
        p125n.d dVar2 = new p125n.d((Context) this.f13633t, e0Var);
        arrayList.add(dVar2);
        return dVar2;
    }

    public g h(i iVar) {
        K0.o oVarC = K0.o.c(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        String str = iVar.a;
        if (str == null) {
            oVarC.v(1);
        } else {
            oVarC.m(1, str);
        }
        oVarC.I(2, iVar.f13636b);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13632s;
        workDatabase_Impl.b();
        Cursor cursorM = workDatabase_Impl.m(oVarC);
        try {
            int iE = u0.e(cursorM, "work_spec_id");
            int iE2 = u0.e(cursorM, "generation");
            int iE3 = u0.e(cursorM, "system_id");
            g gVar = null;
            String string = null;
            if (cursorM.moveToFirst()) {
                if (!cursorM.isNull(iE)) {
                    string = cursorM.getString(iE);
                }
                gVar = new g(string, cursorM.getInt(iE2), cursorM.getInt(iE3));
            }
            return gVar;
        } finally {
            cursorM.close();
            oVarC.g();
        }
    }

    public void j(g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13632s;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f13633t).h(gVar);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.j();
        }
    }

    public boolean k(p190t3.d dVar) {
        p190t3.h hVar = (p190t3.h) this.f13634u;
        return (hVar == null || dVar == null || hVar.a.get() != dVar) ? false : true;
    }

    public boolean l(e0 e0Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f13632s).onActionItemClicked(f(e0Var), new s((Context) this.f13633t, (O.a) menuItem));
    }

    @Override // p029c9.l
    public void l0(p096j9.b bVar, p096j9.f fVar) {
        ((ArrayList) this.f13632s).add(new p145o9.i(bVar, fVar));
    }

    public boolean m(e0 e0Var, p136o.l lVar) {
        p125n.d dVarF = f(e0Var);
        p212w.i iVar = (p212w.i) this.f13635v;
        Menu a = (Menu) iVar.get(lVar);
        if (a == null) {
            a = new A((Context) this.f13633t, lVar);
            iVar.put(lVar, a);
        }
        return ((ActionMode.Callback) this.f13632s).onCreateActionMode(dVarF, a);
    }

    public void n(p190t3.d dVar) {
        synchronized (this.f13632s) {
            try {
                if (k(dVar)) {
                    p190t3.h hVar = (p190t3.h) this.f13634u;
                    if (!hVar.f15210c) {
                        hVar.f15210c = true;
                        ((Handler) this.f13633t).removeCallbacksAndMessages(hVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p029c9.l
    public void o() {
        ArrayList arrayList = (ArrayList) this.f13632s;
        b1 b1Var = (b1) this.f13635v;
        b1Var.getClass();
        p210v8.i.f(arrayList, "elements");
        p096j9.f fVar = (p096j9.f) this.f13634u;
        if (fVar == null) {
            return;
        }
        U uL = Y.l(fVar, (InterfaceC0271e) b1Var.f14040w);
        if (uL != null) {
            HashMap map = (HashMap) b1Var.f14038u;
            List listE = J9.l.e(arrayList);
            AbstractC0151y type = uL.getType();
            p210v8.i.e(type, "parameter.type");
            map.put(fVar, new w(listE, type));
            return;
        }
        if (((G) b1Var.f14039v).s((p096j9.b) b1Var.f14041x) && p210v8.i.a(fVar.g(), "value")) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof p145o9.a) {
                    arrayList2.add(obj);
                }
            }
            List list = (List) b1Var.f14042y;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                list.add((M8.b) ((p145o9.a) it.next()).a);
            }
        }
    }

    public void p(p190t3.d dVar) {
        synchronized (this.f13632s) {
            try {
                if (k(dVar)) {
                    p190t3.h hVar = (p190t3.h) this.f13634u;
                    if (hVar.f15210c) {
                        hVar.f15210c = false;
                        q(hVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(p190t3.h hVar) {
        int i10 = hVar.f15209b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        Handler handler = (Handler) this.f13633t;
        handler.removeCallbacksAndMessages(hVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, hVar), i10);
    }

    public void r(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.f13634u).drainTo(arrayList);
        Message messageObtain = Message.obtain(null, i10, 0, 0);
        p210v8.i.e(messageObtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(messageObtain);
        AbstractC0342z.n(AbstractC0342z.b((p123m8.i) this.f13632s), null, new Q(this, arrayList, null), 3);
    }

    public void s() {
        p190t3.h hVar = (p190t3.h) this.f13635v;
        if (hVar != null) {
            this.f13634u = hVar;
            this.f13635v = null;
            p190t3.d dVar = (p190t3.d) hVar.a.get();
            if (dVar == null) {
                this.f13634u = null;
            } else {
                Handler handler = p190t3.f.f15186x;
                handler.sendMessage(handler.obtainMessage(0, dVar.a));
            }
        }
    }

    public Task t(Callable callable) {
        Task taskD;
        synchronized (this.f13634u) {
            taskD = ((Task) this.f13633t).d((ExecutorService) this.f13632s, new A1.r(callable, 29));
            this.f13633t = taskD.d((ExecutorService) this.f13632s, new p204v1.g(9));
        }
        return taskD;
    }

    public Task u(Callable callable) {
        Task taskE;
        synchronized (this.f13634u) {
            taskE = ((Task) this.f13633t).e((ExecutorService) this.f13632s, new A1.r(callable, 29));
            this.f13633t = taskE.d((ExecutorService) this.f13632s, new p204v1.g(9));
        }
        return taskE;
    }

    public void v() {
        int iA;
        ViewPager2 viewPager2 = (ViewPager2) this.f13635v;
        int i10 = android.R.id.accessibilityActionPageLeft;
        U.U.k(viewPager2, android.R.id.accessibilityActionPageLeft);
        U.U.h(viewPager2, 0);
        U.U.k(viewPager2, android.R.id.accessibilityActionPageRight);
        U.U.h(viewPager2, 0);
        U.U.k(viewPager2, android.R.id.accessibilityActionPageUp);
        U.U.h(viewPager2, 0);
        U.U.k(viewPager2, android.R.id.accessibilityActionPageDown);
        U.U.h(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (iA = viewPager2.getAdapter().a()) == 0 || !viewPager2.f7193J) {
            return;
        }
        int orientation = viewPager2.getOrientation();
        V.h hVar = (V.h) this.f13633t;
        P0.d dVar = (P0.d) this.f13632s;
        if (orientation != 0) {
            if (viewPager2.f7199v < iA - 1) {
                U.U.l(viewPager2, new V.d(android.R.id.accessibilityActionPageDown), dVar);
            }
            if (viewPager2.f7199v > 0) {
                U.U.l(viewPager2, new V.d(android.R.id.accessibilityActionPageUp), hVar);
                return;
            }
            return;
        }
        boolean z6 = viewPager2.f7202y.H() == 1;
        int i11 = z6 ? 16908360 : 16908361;
        if (z6) {
            i10 = 16908361;
        }
        if (viewPager2.f7199v < iA - 1) {
            U.U.l(viewPager2, new V.d(i11), dVar);
        }
        if (viewPager2.f7199v > 0) {
            U.U.l(viewPager2, new V.d(i10), hVar);
        }
    }

    public h(WorkDatabase_Impl workDatabase_Impl) {
        this.f13632s = workDatabase_Impl;
        this.f13633t = new b(workDatabase_Impl, 2);
        this.f13634u = new p085i7.d(workDatabase_Impl, 1);
        this.f13635v = new p085i7.d(workDatabase_Impl, 2);
    }

    public h(int i10) {
        switch (i10) {
            case 2:
                this.f13632s = new T.c(10);
                this.f13633t = new p212w.i(0);
                this.f13634u = new ArrayList();
                this.f13635v = new HashSet();
                break;
            case 11:
                this.f13632s = new Object();
                this.f13633t = new Handler(Looper.getMainLooper(), new C0163k(this, 2));
                break;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0093b(0));
                this.f13633t = new HashMap();
                this.f13634u = new ReferenceQueue();
                this.f13632s = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new RunnableC0094c(this, 0));
                break;
        }
    }

    public h(p123m8.i iVar) {
        this.f13632s = iVar;
        this.f13634u = new LinkedBlockingDeque(20);
        this.f13635v = new S(this);
    }

    public h(ExecutorService executorService) {
        this.f13633t = Tasks.e(null);
        this.f13634u = new Object();
        this.f13635v = new ThreadLocal();
        this.f13632s = executorService;
        executorService.execute(new RunnableC0094c(this, 13));
    }

    public h(Typeface typeface, p116m0.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f13635v = typeface;
        this.f13632s = bVar;
        this.f13634u = new p106l0.o(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i14 = iA + bVar.f4775s;
            i10 = ((ByteBuffer) bVar.f4778v).getInt(((ByteBuffer) bVar.f4778v).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.f13633t = new char[i10 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i15 = iA2 + bVar.f4775s;
            i11 = ((ByteBuffer) bVar.f4778v).getInt(((ByteBuffer) bVar.f4778v).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        for (int i16 = 0; i16 < i11; i16++) {
            p106l0.r rVar = new p106l0.r(this, i16);
            p116m0.a aVarB = rVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f4778v).getInt(iA3 + aVarB.f4775s) : 0, (char[]) this.f13633t, i16 * 2);
            p116m0.a aVarB2 = rVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i17 = iA4 + aVarB2.f4775s;
                i12 = ((ByteBuffer) aVarB2.f4778v).getInt(((ByteBuffer) aVarB2.f4778v).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            xa.d.b("invalid metadata codepoint length", i12 > 0);
            p116m0.a aVarB3 = rVar.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i18 = iA5 + aVarB3.f4775s;
                i13 = ((ByteBuffer) aVarB3.f4778v).getInt(((ByteBuffer) aVarB3.f4778v).getInt(i18) + i18);
            } else {
                i13 = 0;
            }
            ((p106l0.o) this.f13634u).a(rVar, 0, i13 - 1);
        }
    }

    public h(Context context, ActionMode.Callback callback) {
        this.f13633t = context;
        this.f13632s = callback;
        this.f13634u = new ArrayList();
        this.f13635v = new p212w.i(0);
    }

    public h(G g8, p096j9.f fVar, b1 b1Var) {
        this.f13633t = g8;
        this.f13634u = fVar;
        this.f13635v = b1Var;
        this.f13632s = new ArrayList();
    }

    public h(p238y9.g gVar) {
        this.f13635v = gVar;
        List list = gVar.f16079w.f11110L;
        p210v8.i.e(list, "classProto.enumEntryList");
        List list2 = list;
        int iS = p086i8.z.s(p086i8.m.H(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (Object obj : list2) {
            linkedHashMap.put(J7.a.i((p067g9.f) gVar.f16067D.f5172b, ((C0627t) obj).f11185v), obj);
        }
        this.f13632s = linkedHashMap;
        p238y9.g gVar2 = (p238y9.g) this.f13635v;
        this.f13633t = ((p247z9.l) ((I4.c) gVar2.f16067D.a).a).c(new E0.b(this, 12, gVar2));
        p247z9.l lVar = (p247z9.l) ((I4.c) ((p238y9.g) this.f13635v).f16067D.a).a;
        c2.a aVar = new c2.a(this, 25);
        lVar.getClass();
        this.f13634u = new p247z9.i(lVar, aVar);
    }

    public h(ViewPager2 viewPager2) {
        this.f13635v = viewPager2;
        this.f13632s = new P0.d(this, 17);
        this.f13633t = new V.h(this, 8);
    }
}
