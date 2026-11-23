package com.bumptech.glide;

import A1.C;
import A1.t;
import Q3.u0;
import U1.n;
import android.R;
import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p078i.AbstractActivityC0655l;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static volatile boolean f7585A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static volatile b f7586z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final B1.b f7587s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1.f f7588t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f f7589u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final B1.g f7590v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final N1.m f7591w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p170r3.e f7592x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f7593y = new ArrayList();

    public b(Context context, t tVar, C1.f fVar, B1.b bVar, B1.g gVar, N1.m mVar, p170r3.e eVar, za.c cVar, p212w.e eVar2, List list, ArrayList arrayList, J7.j jVar, P0.d dVar) {
        this.f7587s = bVar;
        this.f7590v = gVar;
        this.f7588t = fVar;
        this.f7591w = mVar;
        this.f7592x = eVar;
        this.f7589u = new f(context, gVar, new p195u1.b(this, arrayList, jVar), new p230x9.d(10), cVar, eVar2, list, tVar, dVar);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f7585A) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f7585A = true;
        p212w.e eVar = new p212w.e(0);
        C c10 = new C(2);
        za.c cVar = new za.c(18);
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                Log.isLoggable("ManifestParser", 3);
            } else {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        u0.j(str);
                        throw null;
                    }
                }
                Log.isLoggable("ManifestParser", 3);
            }
            if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
                new HashSet();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    throw E0.a.e(it);
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    throw E0.a.e(it2);
                }
            }
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                throw E0.a.e(it3);
            }
            D1.b bVar = new D1.b();
            if (D1.e.f1040u == 0) {
                D1.e.f1040u = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i10 = D1.e.f1040u;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            D1.e eVar2 = new D1.e(new ThreadPoolExecutor(i10, i10, 0L, timeUnit, new PriorityBlockingQueue(), new D1.c(bVar, "source", false)));
            D1.b bVar2 = new D1.b();
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            D1.e eVar3 = new D1.e(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new D1.c(bVar2, "disk-cache", true)));
            if (D1.e.f1040u == 0) {
                D1.e.f1040u = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i11 = D1.e.f1040u >= 4 ? 2 : 1;
            D1.b bVar3 = new D1.b();
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            D1.e eVar4 = new D1.e(new ThreadPoolExecutor(i11, i11, 0L, timeUnit, new PriorityBlockingQueue(), new D1.c(bVar3, "animation", true)));
            C1.h hVar = new C1.h(new C1.g(applicationContext));
            p170r3.e eVar5 = new p170r3.e(8);
            int i12 = hVar.a;
            B1.b iVar = i12 > 0 ? new B1.i(i12) : new p230x9.d(1);
            B1.g gVar = new B1.g(hVar.f937c);
            C1.f fVar = new C1.f(hVar.f936b);
            t tVar = new t(fVar, new p040e1.j(applicationContext), eVar3, eVar2, new D1.e(new ThreadPoolExecutor(0, Integer.MAX_VALUE, D1.e.f1039t, timeUnit, new SynchronousQueue(), new D1.c(new D1.b(), "source-unlimited", false))), eVar4);
            List list2 = Collections.EMPTY_LIST;
            P0.d dVar = new P0.d(c10);
            b bVar4 = new b(applicationContext, tVar, fVar, iVar, gVar, new N1.m(dVar), eVar5, cVar, eVar, list2, arrayList, generatedAppGlideModule, dVar);
            applicationContext.registerComponentCallbacks(bVar4);
            f7586z = bVar4;
            f7585A = false;
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e10);
        }
    }

    public static b b(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f7586z == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            }
            synchronized (b.class) {
                try {
                    if (f7586z == null) {
                        a(context, generatedAppGlideModule);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f7586z;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public static l f(View view) {
        Context context = view.getContext();
        U1.f.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        N1.m mVar = b(context).f7591w;
        mVar.getClass();
        if (n.i()) {
            return mVar.f(view.getContext().getApplicationContext());
        }
        U1.f.c(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityA = N1.m.a(view.getContext());
        if (activityA == null) {
            return mVar.f(view.getContext().getApplicationContext());
        }
        boolean z6 = activityA instanceof AbstractActivityC0655l;
        N1.f fVar = mVar.f3286B;
        Fragment fragment = null;
        androidx.fragment.app.b bVar = null;
        if (!z6) {
            p212w.e eVar = mVar.f3295z;
            eVar.clear();
            mVar.b(activityA.getFragmentManager(), eVar);
            View viewFindViewById = activityA.findViewById(R.id.content);
            while (!view.equals(viewFindViewById) && (fragment = (Fragment) eVar.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            eVar.clear();
            if (fragment == null) {
                return mVar.e(activityA);
            }
            if (fragment.getActivity() == null) {
                throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
            }
            if (n.i()) {
                return mVar.f(fragment.getActivity().getApplicationContext());
            }
            if (fragment.getActivity() != null) {
                fragment.getActivity();
                fVar.getClass();
            }
            return mVar.d(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
        AbstractActivityC0655l abstractActivityC0655l = (AbstractActivityC0655l) activityA;
        p212w.e eVar2 = mVar.f3294y;
        eVar2.clear();
        N1.m.c(abstractActivityC0655l.m().f6677c.m(), eVar2);
        View viewFindViewById2 = abstractActivityC0655l.findViewById(R.id.content);
        while (!view.equals(viewFindViewById2) && (bVar = (androidx.fragment.app.b) eVar2.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        eVar2.clear();
        if (bVar == null) {
            return mVar.g(abstractActivityC0655l);
        }
        U1.f.c(bVar.m(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (n.i()) {
            return mVar.f(bVar.m().getApplicationContext());
        }
        if (bVar.f() != null) {
            fVar.getClass();
        }
        androidx.fragment.app.e eVarL = bVar.l();
        Context contextM = bVar.m();
        return ((Map) mVar.f3293x.f3811t).containsKey(e.class) ? mVar.f3287C.V0(contextM, b(contextM.getApplicationContext()), bVar.f6643l0, eVarL, bVar.y()) : mVar.j(contextM, eVarL, bVar, bVar.y());
    }

    public final void c(l lVar) {
        synchronized (this.f7593y) {
            try {
                if (this.f7593y.contains(lVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f7593y.add(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(int i10) {
        n.a();
        synchronized (this.f7593y) {
            try {
                Iterator it = this.f7593y.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7588t.f(i10);
        this.f7587s.l(i10);
        this.f7590v.i(i10);
    }

    public final void e(l lVar) {
        synchronized (this.f7593y) {
            try {
                if (!this.f7593y.contains(lVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f7593y.remove(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        n.a();
        this.f7588t.e(0L);
        this.f7587s.o();
        this.f7590v.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        d(i10);
    }
}
