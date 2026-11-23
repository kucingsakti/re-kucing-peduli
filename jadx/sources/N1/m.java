package N1;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p078i.AbstractActivityC0655l;
import p086i8.C;
import p156q0.C0742a;
import p156q0.M;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Handler.Callback {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final p053f4.e f3284D = new p053f4.e(9);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final f f3286B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final o1.e f3287C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile com.bumptech.glide.l f3288s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f3291v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p053f4.e f3292w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final P0.d f3293x;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f3289t = new HashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashMap f3290u = new HashMap();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p212w.e f3294y = new p212w.e(0);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p212w.e f3295z = new p212w.e(0);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Bundle f3285A = new Bundle();

    public m(P0.d dVar) {
        p053f4.e eVar = f3284D;
        this.f3292w = eVar;
        this.f3293x = dVar;
        this.f3291v = new Handler(Looper.getMainLooper(), this);
        this.f3287C = new o1.e(eVar);
        this.f3286B = (H1.u.f1895h && H1.u.f1894g) ? ((Map) dVar.f3811t).containsKey(C.class) ? new e() : new za.c(8) : new p204v1.g(8);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void c(List list, p212w.e eVar) {
        View view;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.b bVar = (androidx.fragment.app.b) it.next();
            if (bVar != null && (view = bVar.c0) != null) {
                eVar.put(view, bVar);
                c(bVar.l().f6677c.m(), eVar);
            }
        }
    }

    public final void b(FragmentManager fragmentManager, p212w.e eVar) {
        Fragment fragment;
        if (Build.VERSION.SDK_INT >= 26) {
            for (Fragment fragment2 : fragmentManager.getFragments()) {
                if (fragment2.getView() != null) {
                    eVar.put(fragment2.getView(), fragment2);
                    b(fragment2.getChildFragmentManager(), eVar);
                }
            }
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            Bundle bundle = this.f3285A;
            bundle.putInt("key", i10);
            try {
                fragment = fragmentManager.getFragment(bundle, "key");
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                eVar.put(fragment.getView(), fragment);
                b(fragment.getChildFragmentManager(), eVar);
            }
            i10 = i11;
        }
    }

    public final com.bumptech.glide.l d(Activity activity, FragmentManager fragmentManager, Fragment fragment, boolean z6) {
        l lVarH = h(fragmentManager, fragment);
        com.bumptech.glide.l lVar = lVarH.f3281v;
        if (lVar != null) {
            return lVar;
        }
        com.bumptech.glide.b bVarB = com.bumptech.glide.b.b(activity);
        this.f3292w.getClass();
        com.bumptech.glide.l lVar2 = new com.bumptech.glide.l(bVarB, lVarH.f3278s, lVarH.f3279t, activity);
        if (z6) {
            lVar2.e();
        }
        lVarH.f3281v = lVar2;
        return lVar2;
    }

    public final com.bumptech.glide.l e(Activity activity) {
        if (U1.n.i()) {
            return f(activity.getApplicationContext());
        }
        if (activity instanceof AbstractActivityC0655l) {
            return g((AbstractActivityC0655l) activity);
        }
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f3286B.getClass();
        FragmentManager fragmentManager = activity.getFragmentManager();
        Activity activityA = a(activity);
        return d(activity, fragmentManager, null, activityA == null || !activityA.isFinishing());
    }

    public final com.bumptech.glide.l f(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = U1.n.a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC0655l) {
                return g((AbstractActivityC0655l) context);
            }
            if (context instanceof Activity) {
                return e((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return f(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f3288s == null) {
            synchronized (this) {
                try {
                    if (this.f3288s == null) {
                        com.bumptech.glide.b bVarB = com.bumptech.glide.b.b(context.getApplicationContext());
                        p053f4.e eVar = this.f3292w;
                        p053f4.e eVar2 = new p053f4.e(8);
                        p230x9.d dVar = new p230x9.d(8);
                        Context applicationContext = context.getApplicationContext();
                        eVar.getClass();
                        this.f3288s = new com.bumptech.glide.l(bVarB, eVar2, dVar, applicationContext);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f3288s;
    }

    public final com.bumptech.glide.l g(AbstractActivityC0655l abstractActivityC0655l) {
        if (U1.n.i()) {
            return f(abstractActivityC0655l.getApplicationContext());
        }
        if (abstractActivityC0655l.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f3286B.getClass();
        M m2 = abstractActivityC0655l.m();
        Activity activityA = a(abstractActivityC0655l);
        boolean z6 = activityA == null || !activityA.isFinishing();
        if (!((Map) this.f3293x.f3811t).containsKey(com.bumptech.glide.e.class)) {
            return j(abstractActivityC0655l, m2, null, z6);
        }
        Context applicationContext = abstractActivityC0655l.getApplicationContext();
        return this.f3287C.V0(applicationContext, com.bumptech.glide.b.b(applicationContext), abstractActivityC0655l.f10468v, abstractActivityC0655l.m(), z6);
    }

    public final l h(FragmentManager fragmentManager, Fragment fragment) {
        HashMap map = this.f3289t;
        l lVar = (l) map.get(fragmentManager);
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = (l) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (lVar2 == null) {
            lVar2 = new l();
            lVar2.f3283x = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                lVar2.a(fragment.getActivity());
            }
            map.put(fragmentManager, lVar2);
            fragmentManager.beginTransaction().add(lVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f3291v.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return lVar2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object objRemove;
        Object obj;
        int i10;
        Object obj2;
        boolean z6 = true;
        boolean z10 = false;
        boolean z11 = message.arg1 == 1;
        int i11 = message.what;
        Handler handler = this.f3291v;
        if (i11 != 1) {
            if (i11 != 2) {
                z6 = false;
            } else {
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) message.obj;
                HashMap map = this.f3290u;
                u uVar = (u) map.get(eVar);
                u uVar2 = (u) eVar.E("com.bumptech.glide.manager");
                if (uVar2 != uVar) {
                    if (uVar2 != null && uVar2.f3313x0 != null) {
                        throw new IllegalStateException("We've added two fragments with requests! Old: " + uVar2 + " New: " + uVar);
                    }
                    if (z11 || eVar.f6670J) {
                        if (!eVar.f6670J) {
                            Log.isLoggable("RMRetriever", 6);
                        } else if (Log.isLoggable("RMRetriever", 5)) {
                            Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                        }
                        uVar.f3309t0.a();
                    } else {
                        C0742a c0742a = new C0742a(eVar);
                        c0742a.j(0, uVar, "com.bumptech.glide.manager", 1);
                        if (uVar2 != null) {
                            c0742a.l(uVar2);
                        }
                        if (c0742a.f14299g) {
                            throw new IllegalStateException("This transaction is already being added to the back stack");
                        }
                        c0742a.f14300h = false;
                        c0742a.f14309r.A(c0742a, true);
                        handler.obtainMessage(2, 1, 0, eVar).sendToTarget();
                        Log.isLoggable("RMRetriever", 3);
                        z10 = true;
                        z6 = false;
                    }
                }
                objRemove = map.remove(eVar);
                obj = eVar;
                z10 = true;
                i10 = 5;
                obj2 = obj;
            }
            obj2 = null;
            i10 = 5;
            objRemove = null;
        } else {
            FragmentManager fragmentManager = (FragmentManager) message.obj;
            HashMap map2 = this.f3289t;
            l lVar = (l) map2.get(fragmentManager);
            l lVar2 = (l) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (lVar2 != lVar) {
                if (lVar2 != null && lVar2.f3281v != null) {
                    throw new IllegalStateException("We've added two fragments with requests! Old: " + lVar2 + " New: " + lVar);
                }
                if (z11 || fragmentManager.isDestroyed()) {
                    if (Log.isLoggable("RMRetriever", 5)) {
                        if (fragmentManager.isDestroyed()) {
                            Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added");
                        } else {
                            Log.w("RMRetriever", "Tried adding Fragment twice and failed twice, giving up!");
                        }
                    }
                    lVar.f3278s.a();
                } else {
                    FragmentTransaction fragmentTransactionAdd = fragmentManager.beginTransaction().add(lVar, "com.bumptech.glide.manager");
                    if (lVar2 != null) {
                        fragmentTransactionAdd.remove(lVar2);
                    }
                    fragmentTransactionAdd.commitAllowingStateLoss();
                    handler.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
                    Log.isLoggable("RMRetriever", 3);
                    z10 = true;
                    z6 = false;
                    obj2 = null;
                    i10 = 5;
                    objRemove = null;
                }
            }
            objRemove = map2.remove(fragmentManager);
            obj = fragmentManager;
            z10 = true;
            i10 = 5;
            obj2 = obj;
        }
        if (Log.isLoggable("RMRetriever", i10) && z6 && objRemove == null) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z10;
    }

    public final u i(androidx.fragment.app.e eVar, androidx.fragment.app.b bVar) {
        HashMap map = this.f3290u;
        u uVar = (u) map.get(eVar);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = (u) eVar.E("com.bumptech.glide.manager");
        if (uVar2 == null) {
            uVar2 = new u();
            uVar2.f3314y0 = bVar;
            if (bVar != null && bVar.m() != null) {
                androidx.fragment.app.b bVar2 = bVar;
                while (true) {
                    androidx.fragment.app.b bVar3 = bVar2.f6624Q;
                    if (bVar3 == null) {
                        break;
                    }
                    bVar2 = bVar3;
                }
                androidx.fragment.app.e eVar2 = bVar2.f6622N;
                if (eVar2 != null) {
                    Context contextM = bVar.m();
                    u uVar3 = uVar2.f3312w0;
                    if (uVar3 != null) {
                        uVar3.f3311v0.remove(uVar2);
                        uVar2.f3312w0 = null;
                    }
                    u uVarI = com.bumptech.glide.b.b(contextM).f7591w.i(eVar2, null);
                    uVar2.f3312w0 = uVarI;
                    if (!uVar2.equals(uVarI)) {
                        uVar2.f3312w0.f3311v0.add(uVar2);
                    }
                }
            }
            map.put(eVar, uVar2);
            C0742a c0742a = new C0742a(eVar);
            c0742a.j(0, uVar2, "com.bumptech.glide.manager", 1);
            c0742a.g(true, true);
            this.f3291v.obtainMessage(2, eVar).sendToTarget();
        }
        return uVar2;
    }

    public final com.bumptech.glide.l j(Context context, androidx.fragment.app.e eVar, androidx.fragment.app.b bVar, boolean z6) {
        u uVarI = i(eVar, bVar);
        com.bumptech.glide.l lVar = uVarI.f3313x0;
        if (lVar != null) {
            return lVar;
        }
        com.bumptech.glide.b bVarB = com.bumptech.glide.b.b(context);
        this.f3292w.getClass();
        com.bumptech.glide.l lVar2 = new com.bumptech.glide.l(bVarB, uVarI.f3309t0, uVarI.f3310u0, context);
        if (z6) {
            lVar2.e();
        }
        uVarI.f3313x0 = lVar2;
        return lVar2;
    }
}
