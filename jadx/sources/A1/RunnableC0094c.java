package A1;

import J0.C0255e;
import L8.C0289x;
import M2.C0298g;
import M2.C0312v;
import M2.C0313w;
import M2.Y;
import M2.v0;
import O3.C0343a;
import U.U;
import android.animation.ValueAnimator;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.work.Worker;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzfj;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzgm;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzgt;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zziv;
import com.google.android.gms.measurement.internal.zzmc;
import com.google.android.gms.measurement.internal.zzmw;
import com.google.android.gms.measurement.internal.zznc;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.onesignal.core.activities.PermissionsActivity;
import com.smarteist.autoimageslider.SliderView;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import org.chromium.net.UrlRequest;
import p078i.M;

/* JADX INFO: renamed from: A1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0094c implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f87s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f88t;

    public RunnableC0094c(RunnableC0094c runnableC0094c, boolean z6, boolean z10) {
        this.f87s = 28;
        this.f88t = runnableC0094c;
    }

    private final void b() {
        Set setA;
        ReentrantReadWriteLock.ReadLock lock = ((K0.i) this.f88t).a.f2562h.readLock();
        p210v8.i.e(lock, "readWriteLock.readLock()");
        lock.lock();
        try {
            try {
                if (!((K0.i) this.f88t).a()) {
                    lock.unlock();
                    ((K0.i) this.f88t).getClass();
                    return;
                }
                if (!((K0.i) this.f88t).f2533e.compareAndSet(true, false)) {
                    lock.unlock();
                    ((K0.i) this.f88t).getClass();
                    return;
                }
                if (((K0.i) this.f88t).a.g().S().i()) {
                    lock.unlock();
                    ((K0.i) this.f88t).getClass();
                    return;
                }
                P0.c cVarS = ((K0.i) this.f88t).a.g().S();
                cVarS.b();
                try {
                    setA = a();
                    cVarS.o();
                    cVarS.g();
                    lock.unlock();
                    ((K0.i) this.f88t).getClass();
                    if (setA.isEmpty()) {
                        return;
                    }
                    K0.i iVar = (K0.i) this.f88t;
                    synchronized (iVar.f2537i) {
                        Iterator it = iVar.f2537i.iterator();
                        while (true) {
                            p166r.b bVar = (p166r.b) it;
                            if (bVar.hasNext()) {
                                ((K0.h) ((Map.Entry) bVar.next()).getValue()).a(setA);
                            }
                        }
                    }
                } catch (Throwable th) {
                    cVarS.g();
                    throw th;
                }
            } catch (Throwable th2) {
                lock.unlock();
                ((K0.i) this.f88t).getClass();
                throw th2;
            }
        } catch (SQLiteException unused) {
            setA = p086i8.u.f12330s;
        } catch (IllegalStateException unused2) {
            setA = p086i8.u.f12330s;
        }
    }

    private final void c() {
        synchronized (((P2.d) this.f88t).f3851t) {
            try {
                OnCanceledListener onCanceledListener = (OnCanceledListener) ((P2.d) this.f88t).f3853v;
                if (onCanceledListener != null) {
                    onCanceledListener.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        p010aa.a aVarC;
        long jNanoTime;
        while (true) {
            p010aa.c cVar = (p010aa.c) this.f88t;
            synchronized (cVar) {
                aVarC = cVar.c();
            }
            if (aVarC == null) {
                return;
            }
            p010aa.b bVar = aVarC.f6016c;
            p210v8.i.c(bVar);
            p010aa.c cVar2 = (p010aa.c) this.f88t;
            boolean zIsLoggable = p010aa.c.f6024i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                P0.d dVar = bVar.a.a;
                jNanoTime = System.nanoTime();
                p181s3.a.a(aVarC, bVar, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                p010aa.c.a(cVar2, aVarC);
                if (zIsLoggable) {
                    P0.d dVar2 = bVar.a.a;
                    p181s3.a.a(aVarC, bVar, p210v8.i.k(p181s3.a.h(System.nanoTime() - jNanoTime), "finished run in "));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) cVar2.a.f3811t).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        P0.d dVar3 = bVar.a.a;
                        p181s3.a.a(aVarC, bVar, p210v8.i.k(p181s3.a.h(System.nanoTime() - jNanoTime), "failed a run in "));
                    }
                    throw th2;
                }
            }
        }
    }

    private final void e() {
        Object obj;
        synchronized (((androidx.lifecycle.A) this.f88t).a) {
            obj = ((androidx.lifecycle.A) this.f88t).f6710f;
            ((androidx.lifecycle.A) this.f88t).f6710f = androidx.lifecycle.A.f6705k;
        }
        ((androidx.lifecycle.A) this.f88t).e(obj);
    }

    private final void f() {
        RunnableC0094c runnableC0094c = (RunnableC0094c) this.f88t;
        synchronized (((C0343a) runnableC0094c.f88t).a) {
        }
        Iterator it = ((LinkedHashSet) ((C0343a) runnableC0094c.f88t).f3510b).iterator();
        if (it.hasNext()) {
            throw E0.a.e(it);
        }
        ((C0343a) runnableC0094c.f88t).d();
        ((C0343a) runnableC0094c.f88t).f();
    }

    public p095j8.h a() throws IOException {
        K0.i iVar = (K0.i) this.f88t;
        p095j8.h hVar = new p095j8.h();
        Cursor cursorM = iVar.a.m(new C0289x("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (cursorM.moveToNext()) {
            try {
                hVar.add(Integer.valueOf(cursorM.getInt(0)));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    com.bumptech.glide.c.c(cursorM, th);
                    throw th2;
                }
            }
        }
        cursorM.close();
        p095j8.h hVarD = p086i8.C.d(hVar);
        if (hVarD.f12539s.isEmpty()) {
            return hVarD;
        }
        if (((K0.i) this.f88t).f2535g == null) {
            throw new IllegalStateException("Required value was null.");
        }
        P0.j jVar = ((K0.i) this.f88t).f2535g;
        if (jVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        jVar.a();
        return hVarD;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Type inference failed for: r2v11, types: [u8.b, v8.k] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        View viewF;
        int width;
        switch (this.f87s) {
            case 0:
                o1.h hVar = (o1.h) this.f88t;
                hVar.getClass();
                while (true) {
                    try {
                        hVar.d((C0095d) ((ReferenceQueue) hVar.f13634u).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 1:
                ((C0.c) this.f88t).s0();
                return;
            case 2:
                RecyclerView recyclerView = ((C0.r) this.f88t).f878v0;
                recyclerView.focusableViewAvailable(recyclerView);
                return;
            case 3:
                ((C0.t) this.f88t).p();
                return;
            case 4:
                Ca.a aVar = (Ca.a) this.f88t;
                ?? r10 = aVar.f1020s.f1024m;
                Ga.c cVar = aVar.f1021t;
                if (r10 != 0) {
                }
                ((Ga.b) cVar).s(true);
                return;
            case 5:
                C0255e c0255e = (C0255e) this.f88t;
                int i10 = c0255e.f2277A;
                ValueAnimator valueAnimator = c0255e.f2302z;
                if (i10 == 1) {
                    valueAnimator.cancel();
                } else if (i10 != 2) {
                    return;
                }
                c0255e.f2277A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(PermissionsActivity.DELAY_TIME_CALLBACK_CALL);
                valueAnimator.start();
                return;
            case 6:
                ((StaggeredGridLayoutManager) this.f88t).J0();
                return;
            case 7:
                b();
                return;
            case 8:
                ((C0312v) this.f88t).a.G();
                return;
            case 9:
                zzr zzrVar = ((zziv) this.f88t).f9198H;
                zzhj zzhjVar = zzrVar.a;
                zzhc zzhcVar = zzhjVar.f9116B;
                zzhj.g(zzhcVar);
                zzhcVar.W0();
                if (zzrVar.b()) {
                    boolean zC = zzrVar.c();
                    zziv zzivVar = zzhjVar.f9122H;
                    C0313w c0313w = zzhjVar.f9147z;
                    if (zC) {
                        zzhj.e(c0313w);
                        c0313w.P.b(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        zzhj.f(zzivVar);
                        zzivVar.B1("auto", "_cmpx", bundle);
                    } else {
                        zzhj.e(c0313w);
                        String strA = c0313w.P.a();
                        if (TextUtils.isEmpty(strA)) {
                            zzfw zzfwVar = zzhjVar.f9115A;
                            zzhj.g(zzfwVar);
                            zzfwVar.f9057y.b("Cache still valid but referrer not found");
                        } else {
                            zzhj.e(c0313w);
                            long jA = ((c0313w.f3145Q.a() / 3600000) - 1) * 3600000;
                            Uri uri = Uri.parse(strA);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", jA);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            zzhj.f(zzivVar);
                            zzivVar.B1(str2, "_cmp", (Bundle) pair.second);
                        }
                        zzhj.e(c0313w);
                        c0313w.P.b(null);
                    }
                    zzhj.e(c0313w);
                    c0313w.f3145Q.b(0L);
                    return;
                }
                return;
            case 10:
                zznc zzncVar = (zznc) this.f88t;
                zzncVar.l().W0();
                zzncVar.f9282C = new zzgq(zzncVar);
                C0298g c0298g = new C0298g(zzncVar);
                c0298g.b1();
                zzncVar.f9306u = c0298g;
                zzag zzagVarS = zzncVar.S();
                zzgt zzgtVar = zzncVar.f9304s;
                Preconditions.i(zzgtVar);
                zzagVarS.f8896v = zzgtVar;
                zzmc zzmcVar = new zzmc(zzncVar);
                zzmcVar.b1();
                zzncVar.f9280A = zzmcVar;
                v0 v0Var = new v0(zzncVar);
                v0Var.b1();
                zzncVar.f9309x = v0Var;
                Y y6 = new Y(zzncVar);
                y6.b1();
                zzncVar.f9311z = y6;
                zzmw zzmwVar = new zzmw(zzncVar);
                zzmwVar.b1();
                zzncVar.f9308w = zzmwVar;
                zzncVar.f9307v = new C0312v(zzncVar);
                if (zzncVar.f9289J != zzncVar.f9290K) {
                    zzncVar.i().f9056x.c("Not all upload components initialized", Integer.valueOf(zzncVar.f9289J), Integer.valueOf(zzncVar.f9290K));
                }
                zzncVar.f9284E = true;
                zzncVar.l().W0();
                C0298g c0298g2 = zzncVar.f9306u;
                zznc.n(c0298g2);
                c0298g2.Z1();
                C0298g c0298g3 = zzncVar.f9306u;
                zznc.n(c0298g3);
                c0298g3.W0();
                c0298g3.a1();
                if (c0298g3.E1()) {
                    zzfj zzfjVar = zzbf.f8985g0;
                    if (((Long) zzfjVar.a(null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseD1 = c0298g3.d1();
                        ((zzhj) c0298g3.f577s).f9120F.getClass();
                        int iDelete = sQLiteDatabaseD1.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(zzfjVar.a(null))});
                        if (iDelete > 0) {
                            c0298g3.i().f9052F.a(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (zzncVar.f9280A.f9257y.a() == 0) {
                    zzgm zzgmVar = zzncVar.f9280A.f9257y;
                    ((DefaultClock) zzncVar.a()).getClass();
                    zzgmVar.b(System.currentTimeMillis());
                }
                zzncVar.G();
                return;
            case 11:
                N6.l lVar = (N6.l) this.f88t;
                lVar.setScrollState(0);
                lVar.o();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                SliderView sliderView = (SliderView) this.f88t;
                Handler handler = sliderView.f10322s;
                handler.removeCallbacks(sliderView);
                handler.postDelayed(sliderView, sliderView.f10326w);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((ThreadLocal) ((o1.h) this.f88t).f13635v).set(Boolean.TRUE);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                c();
                return;
            case 15:
                X2.d dVar = (X2.d) this.f88t;
                dVar.f5388c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) dVar.f5390e;
                p032d0.f fVar = bottomSheetBehavior.f9516e0;
                if (fVar != null && fVar.g()) {
                    dVar.a(dVar.f5387b);
                    return;
                } else {
                    if (bottomSheetBehavior.f9515d0 == 2) {
                        bottomSheetBehavior.J(dVar.f5387b);
                        return;
                    }
                    return;
                }
            case 16:
                p000a0.g gVar = (p000a0.g) this.f88t;
                if (gVar.f5979G) {
                    boolean z6 = gVar.f5977E;
                    p000a0.a aVar2 = gVar.f5982s;
                    if (z6) {
                        gVar.f5977E = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.f5967e = jCurrentAnimationTimeMillis;
                        aVar2.f5969g = -1L;
                        aVar2.f5968f = jCurrentAnimationTimeMillis;
                        aVar2.f5970h = 0.5f;
                    }
                    if ((aVar2.f5969g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f5969g + ((long) aVar2.f5971i)) || !gVar.e()) {
                        gVar.f5979G = false;
                        return;
                    }
                    boolean z10 = gVar.f5978F;
                    ListView listView = gVar.f5984u;
                    if (z10) {
                        gVar.f5978F = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar2.f5968f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar2.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - aVar2.f5968f;
                    aVar2.f5968f = jCurrentAnimationTimeMillis2;
                    gVar.f5981I.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar2.f5966d));
                    WeakHashMap weakHashMap = U.a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 17:
                d();
                return;
            case 18:
                e();
                return;
            case 19:
                p013b1.e eVar = (p013b1.e) this.f88t;
                eVar.f7257k = false;
                eVar.o();
                return;
            case 20:
                com.bumptech.glide.l lVar2 = (com.bumptech.glide.l) this.f88t;
                lVar2.f7634u.b(lVar2);
                return;
            case MobileAdsBridge.CODE_21 /* 21 */:
                ((com.unity3d.scar.adapter.common.f) this.f88t).f10426c.a();
                return;
            case 22:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e10) {
                    if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e10;
                    }
                    return;
                } catch (NullPointerException e11) {
                    if (!TextUtils.equals(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e11;
                    }
                    return;
                }
            case 23:
                ((p032d0.f) this.f88t).o(0);
                return;
            case 24:
                Worker worker = (Worker) this.f88t;
                try {
                    worker.f7207s.j(worker.a());
                    return;
                } catch (Throwable th) {
                    worker.f7207s.k(th);
                    return;
                }
            case 25:
                M m2 = (M) this.f88t;
                p078i.z zVar = m2.f11984c;
                Menu menuA0 = m2.a0();
                p136o.l lVar3 = menuA0 instanceof p136o.l ? (p136o.l) menuA0 : null;
                if (lVar3 != null) {
                    lVar3.y();
                }
                try {
                    menuA0.clear();
                    if (!zVar.onCreatePanelMenu(0, menuA0) || !zVar.onPreparePanel(0, null, menuA0)) {
                        menuA0.clear();
                    }
                    if (lVar3 != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (lVar3 != null) {
                        lVar3.x();
                    }
                }
                break;
            case 26:
                p088j0.e eVar2 = (p088j0.e) this.f88t;
                int i11 = eVar2.f12352b.f10526o;
                int i12 = eVar2.a;
                boolean z11 = i12 == 3;
                DrawerLayout drawerLayout = eVar2.f12354d;
                if (z11) {
                    viewF = drawerLayout.f(3);
                    width = (viewF != null ? -viewF.getWidth() : 0) + i11;
                } else {
                    viewF = drawerLayout.f(5);
                    width = drawerLayout.getWidth() - i11;
                }
                if (viewF != null) {
                    if (((!z11 || viewF.getLeft() >= width) && (z11 || viewF.getLeft() <= width)) || drawerLayout.j(viewF) != 0) {
                        return;
                    }
                    p088j0.d dVar2 = (p088j0.d) viewF.getLayoutParams();
                    eVar2.f12352b.r(viewF, width, viewF.getTop());
                    dVar2.f12350c = true;
                    drawerLayout.invalidate();
                    View viewF2 = drawerLayout.f(i12 == 3 ? 5 : 3);
                    if (viewF2 != null) {
                        drawerLayout.c(viewF2, true);
                    }
                    if (drawerLayout.f6538J) {
                        return;
                    }
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        drawerLayout.getChildAt(i13).dispatchTouchEvent(motionEventObtain2);
                    }
                    motionEventObtain2.recycle();
                    drawerLayout.f6538J = true;
                    return;
                }
                return;
            case 27:
                p097k.e eVar3 = (p097k.e) this.f88t;
                eVar3.a(true);
                eVar3.invalidateSelf();
                return;
            case 28:
                f();
                return;
            default:
                C0343a c0343a = (C0343a) this.f88t;
                synchronized (c0343a.a) {
                }
                ((Handler) c0343a.f3513e).post(new RunnableC0094c(this, ((p112l7.a) c0343a.f3514f).b(true), ((p112l7.a) c0343a.f3514f).b(false)));
                return;
        }
    }

    public /* synthetic */ RunnableC0094c(Object obj, int i10) {
        this.f87s = i10;
        this.f88t = obj;
    }

    public /* synthetic */ RunnableC0094c(Object obj, int i10, Object obj2) {
        this.f87s = i10;
        this.f88t = obj;
    }

    public RunnableC0094c(C0312v c0312v, boolean z6) {
        this.f87s = 8;
        this.f88t = c0312v;
    }
}
