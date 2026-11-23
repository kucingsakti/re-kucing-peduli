package qa;

import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.C0133f;
import A9.I;
import A9.O;
import A9.S;
import A9.T;
import A9.b0;
import A9.d0;
import A9.r;
import E1.D;
import E1.E;
import E1.l;
import I8.n;
import J9.d;
import L8.InterfaceC0268b;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0274h;
import L8.InterfaceC0275i;
import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import L8.P;
import M9.c;
import O8.AbstractC0359o;
import O8.L;
import O8.N;
import O8.U;
import O8.x;
import R8.AbstractC0408c;
import R8.C0409d;
import V.h;
import V0.A;
import android.R;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.hardware.SensorManager;
import android.hardware.input.InputManager;
import android.media.MediaCodecList;
import android.media.RingtoneManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.kcstream.cing.MainApp;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.jsoup.helper.ValidationException;
import p029c9.j;
import p029c9.p;
import p086i8.k;
import p086i8.m;
import p086i8.v;
import p096j9.f;
import p124m9.e;
import p188t1.G;
import p188t1.Y;
import p204v1.g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static boolean a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f14441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f14442c;

    public static int E(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a A[PHI: r4
      0x007a: PHI (r4v3 long) = (r4v1 long), (r4v2 long) binds: [B:29:0x0078, B:32:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    public static final long F(int i10, c cVar) {
        i.f(cVar, "unit");
        if (cVar.compareTo(c.SECONDS) <= 0) {
            long jI = Y.i(i10, cVar, c.NANOSECONDS) << 1;
            int i11 = M9.a.f3249v;
            int i12 = M9.b.a;
            return jI;
        }
        long j = i10;
        c cVar2 = c.NANOSECONDS;
        long jI2 = Y.i(4611686018426999999L, cVar2, cVar);
        long j10 = -jI2;
        if (j10 < jI2) {
            long j11 = jI2 % 1;
            if (j11 < 0) {
                j11++;
            }
            long j12 = j10 % 1;
            if (j12 < 0) {
                j12++;
            }
            long j13 = (j11 - j12) % 1;
            if (j13 < 0) {
                j13++;
            }
            jI2 -= j13;
        }
        if (j10 <= j && j <= jI2) {
            long jI3 = Y.i(j, cVar, cVar2) << 1;
            int i13 = M9.a.f3249v;
            int i14 = M9.b.a;
            return jI3;
        }
        c cVar3 = c.MILLISECONDS;
        i.f(cVar3, "targetUnit");
        long jConvert = cVar3.f3258s.convert(j, cVar.f3258s);
        long j14 = -4611686018427387903L;
        if (jConvert < -4611686018427387903L) {
            jConvert = j14;
        } else {
            j14 = 4611686018427387903L;
            if (jConvert > 4611686018427387903L) {
                jConvert = j14;
            }
        }
        long j15 = (jConvert << 1) + 1;
        int i15 = M9.a.f3249v;
        int i16 = M9.b.a;
        return j15;
    }

    public static final T a(AbstractC0151y abstractC0151y) {
        i.f(abstractC0151y, "<this>");
        return new T(1, abstractC0151y);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    public static String c(InterfaceC0285t interfaceC0285t, int i10) {
        String strG;
        boolean z6 = (i10 & 1) != 0;
        boolean z10 = (i10 & 2) != 0;
        i.f(interfaceC0285t, "<this>");
        StringBuilder sb = new StringBuilder();
        if (z10) {
            if (interfaceC0285t instanceof InterfaceC0275i) {
                strG = "<init>";
            } else {
                strG = ((AbstractC0359o) interfaceC0285t).getName().g();
                i.e(strG, "name.asString()");
            }
            sb.append(strG);
        }
        sb.append("(");
        x xVarR = interfaceC0285t.R();
        d dVar = d.f2465s;
        if (xVarR != null) {
            AbstractC0151y type = xVarR.getType();
            i.e(type, "it.type");
            sb.append((j) p068ga.d.w(type, p.f7564k, dVar));
        }
        Iterator it = interfaceC0285t.H0().iterator();
        while (it.hasNext()) {
            AbstractC0151y type2 = ((U) it.next()).getType();
            i.e(type2, "parameter.type");
            sb.append((j) p068ga.d.w(type2, p.f7564k, dVar));
        }
        sb.append(")");
        if (z6) {
            if (interfaceC0285t instanceof InterfaceC0275i) {
                sb.append("V");
            } else {
                AbstractC0151y abstractC0151yW = interfaceC0285t.w();
                i.c(abstractC0151yW);
                f fVar = I8.i.f2112e;
                if (I8.i.D(abstractC0151yW, n.f2167d)) {
                    AbstractC0151y abstractC0151yW2 = interfaceC0285t.w();
                    i.c(abstractC0151yW2);
                    if (!b0.e(abstractC0151yW2) && !(interfaceC0285t instanceof L)) {
                        sb.append("V");
                    }
                }
                AbstractC0151y abstractC0151yW3 = interfaceC0285t.w();
                i.c(abstractC0151yW3);
                sb.append((j) p068ga.d.w(abstractC0151yW3, p.f7564k, dVar));
            }
        }
        String string = sb.toString();
        i.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String d(InterfaceC0268b interfaceC0268b) {
        i.f(interfaceC0268b, "<this>");
        if (!e.o(interfaceC0268b)) {
            InterfaceC0276j interfaceC0276jV = interfaceC0268b.v();
            InterfaceC0271e interfaceC0271e = interfaceC0276jV instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0276jV : null;
            if (interfaceC0271e != null && !interfaceC0271e.getName().f12552t) {
                InterfaceC0268b interfaceC0268bC = interfaceC0268b.c();
                N n10 = interfaceC0268bC instanceof N ? (N) interfaceC0268bC : null;
                if (n10 != null) {
                    return oa.b.n(interfaceC0271e, c(n10, 3));
                }
            }
        }
        return null;
    }

    public static final boolean e(AbstractC0151y abstractC0151y, O o10, Set set) {
        boolean zE;
        if (i.a(abstractC0151y.D(), o10)) {
            return true;
        }
        InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
        InterfaceC0274h interfaceC0274h = interfaceC0273gW instanceof InterfaceC0274h ? (InterfaceC0274h) interfaceC0273gW : null;
        List listY = interfaceC0274h != null ? interfaceC0274h.y() : null;
        Iterable iterableY0 = k.y0(abstractC0151y.l());
        if (!(iterableY0 instanceof Collection) || !((Collection) iterableY0).isEmpty()) {
            Iterator it = iterableY0.iterator();
            do {
                K9.b bVar = (K9.b) it;
                if (bVar.f2675t.hasNext()) {
                    v vVar = (v) bVar.next();
                    int i10 = vVar.a;
                    S s9 = (S) vVar.f12331b;
                    P p10 = listY != null ? (P) k.W(listY, i10) : null;
                    if ((p10 == null || set == null || !set.contains(p10)) && !s9.c()) {
                        AbstractC0151y abstractC0151yB = s9.b();
                        i.e(abstractC0151yB, "argument.type");
                        zE = e(abstractC0151yB, o10, set);
                    } else {
                        zE = false;
                    }
                }
            } while (!zE);
            return true;
        }
        return false;
    }

    public static final Y1.c f(MainApp mainApp) {
        g gVar = new g(18);
        Object systemService = mainApp.getSystemService("activity");
        i.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) systemService;
        StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
        File externalFilesDir = mainApp.getExternalFilesDir(null);
        String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
        if (absolutePath != null && externalFilesDir.canRead()) {
            new StatFs(absolutePath);
        }
        o1.c cVar = new o1.c(activityManager, 12, statFs);
        Object systemService2 = mainApp.getSystemService("sensor");
        i.d(systemService2, "null cannot be cast to non-null type android.hardware.SensorManager");
        P0.d dVar = new P0.d((SensorManager) systemService2, 20);
        Object systemService3 = mainApp.getSystemService("input");
        i.d(systemService3, "null cannot be cast to non-null type android.hardware.input.InputManager");
        P0.d dVar2 = new P0.d((InputManager) systemService3, 19);
        P0.d dVar3 = new P0.d(mainApp, 18);
        p170r3.e eVar = new p170r3.e(18);
        Object systemService4 = mainApp.getSystemService("activity");
        i.d(systemService4, "null cannot be cast to non-null type android.app.ActivityManager");
        h hVar = new h((ActivityManager) systemService4, 10);
        p230x9.d dVar4 = new p230x9.d(18);
        h hVar2 = new h(new MediaCodecList(1), 9);
        Object systemService5 = mainApp.getSystemService("device_policy");
        DevicePolicyManager devicePolicyManager = systemService5 instanceof DevicePolicyManager ? (DevicePolicyManager) systemService5 : null;
        Object systemService6 = mainApp.getSystemService("keyguard");
        com.google.android.gms.internal.measurement.S s9 = new com.google.android.gms.internal.measurement.S(devicePolicyManager, systemService6 instanceof KeyguardManager ? (KeyguardManager) systemService6 : null, 12, false);
        PackageManager packageManager = mainApp.getPackageManager();
        i.e(packageManager, "context.packageManager");
        h hVar3 = new h(packageManager, 11);
        ContentResolver contentResolver = mainApp.getContentResolver();
        i.e(contentResolver, "context.contentResolver");
        D d3 = new D(contentResolver, 3);
        RingtoneManager ringtoneManager = new RingtoneManager(mainApp);
        AssetManager assets = mainApp.getAssets();
        i.e(assets, "context.assets");
        Configuration configuration = mainApp.getResources().getConfiguration();
        i.e(configuration, "context.resources.configuration");
        p014b2.x xVar = new p014b2.x(gVar, cVar, dVar, dVar2, dVar3, eVar, hVar, dVar4, hVar2, s9, hVar3, d3, new Y1.c(ringtoneManager, assets, configuration, 4), new c2.f(new l(mainApp, 2)));
        ContentResolver contentResolver2 = mainApp.getContentResolver();
        i.c(contentResolver2);
        E e10 = new E(contentResolver2);
        ContentResolver contentResolver3 = mainApp.getContentResolver();
        i.c(contentResolver3);
        return new Y1.c(xVar, new G(e10, new D(contentResolver3, 2), new p053f4.e(13)));
    }

    public static t9.n g(String str, Collection collection) {
        t9.n aVar;
        i.f(str, "message");
        i.f(collection, "types");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(m.H(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC0151y) it.next()).E0());
        }
        J9.g gVarI = com.bumptech.glide.e.i(arrayList);
        int i10 = gVarI.f2470s;
        if (i10 != 0) {
            aVar = i10 != 1 ? new t9.a(str, (t9.n[]) gVarI.toArray(new t9.n[0])) : (t9.n) gVarI.get(0);
        } else {
            aVar = t9.m.f15259b;
        }
        return gVarI.f2470s <= 1 ? aVar : new t9.j(aVar);
    }

    public static final T h(AbstractC0151y abstractC0151y, int i10, P p10) {
        i.f(abstractC0151y, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        AbstractC0487g.p(i10, "projectionKind");
        if ((p10 != null ? p10.j0() : 0) == i10) {
            i10 = 1;
        }
        return new T(i10, abstractC0151y);
    }

    public static final void i(AbstractC0151y abstractC0151y, A9.D d3, LinkedHashSet linkedHashSet, Set set) {
        InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
        if (interfaceC0273gW instanceof P) {
            if (!i.a(abstractC0151y.D(), d3.D())) {
                linkedHashSet.add(interfaceC0273gW);
                return;
            }
            for (AbstractC0151y abstractC0151y2 : ((P) interfaceC0273gW).getUpperBounds()) {
                i.e(abstractC0151y2, "upperBound");
                i(abstractC0151y2, d3, linkedHashSet, set);
            }
            return;
        }
        InterfaceC0273g interfaceC0273gW2 = abstractC0151y.D().w();
        InterfaceC0274h interfaceC0274h = interfaceC0273gW2 instanceof InterfaceC0274h ? (InterfaceC0274h) interfaceC0273gW2 : null;
        List listY = interfaceC0274h != null ? interfaceC0274h.y() : null;
        int i10 = 0;
        for (S s9 : abstractC0151y.l()) {
            int i11 = i10 + 1;
            P p10 = listY != null ? (P) k.W(listY, i10) : null;
            if ((p10 == null || set == null || !set.contains(p10)) && !s9.c() && !k.O(linkedHashSet, s9.b().D().w()) && !i.a(s9.b().D(), d3.D())) {
                AbstractC0151y abstractC0151yB = s9.b();
                i.e(abstractC0151yB, "argument.type");
                i(abstractC0151yB, d3, linkedHashSet, set);
            }
            i10 = i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[RETURN] */
    public static final C0409d j(Annotation[] annotationArr, p096j9.c cVar) {
        i.f(annotationArr, "<this>");
        i.f(cVar, "fqName");
        for (Annotation annotation : annotationArr) {
            if (AbstractC0408c.a(p068ga.d.o(p068ga.d.l(annotation))).b().equals(cVar)) {
                if (annotation != null) {
                    return new C0409d(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new C0409d(annotation);
        }
        return null;
    }

    public static final ArrayList k(Annotation[] annotationArr) {
        i.f(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C0409d(annotation));
        }
        return arrayList;
    }

    public static final I8.i l(AbstractC0151y abstractC0151y) {
        i.f(abstractC0151y, "<this>");
        I8.i iVarS = abstractC0151y.D().s();
        i.e(iVarS, "constructor.builtIns");
        return iVarS;
    }

    public static String m(Class cls) {
        LinkedHashMap linkedHashMap = y0.P.f15895b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            y0.N n10 = (y0.N) cls.getAnnotation(y0.N.class);
            strValue = n10 != null ? n10.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, strValue);
        }
        i.c(strValue);
        return strValue;
    }

    public static final AbstractC0151y n(P p10) {
        Object obj;
        List upperBounds = p10.getUpperBounds();
        i.e(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List upperBounds2 = p10.getUpperBounds();
        i.e(upperBounds2, "upperBounds");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC0273g interfaceC0273gW = ((AbstractC0151y) next).D().w();
            InterfaceC0271e interfaceC0271e = interfaceC0273gW instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gW : null;
            if (interfaceC0271e != null && interfaceC0271e.M() != 2 && interfaceC0271e.M() != 5) {
                obj = next;
                break;
            }
        }
        AbstractC0151y abstractC0151y = (AbstractC0151y) obj;
        if (abstractC0151y != null) {
            return abstractC0151y;
        }
        List upperBounds3 = p10.getUpperBounds();
        i.e(upperBounds3, "upperBounds");
        Object objT = k.T(upperBounds3);
        i.e(objT, "upperBounds.first()");
        return (AbstractC0151y) objT;
    }

    public static final boolean p(P p10, O o10, Set set) {
        i.f(p10, "typeParameter");
        List upperBounds = p10.getUpperBounds();
        i.e(upperBounds, "typeParameter.upperBounds");
        List<AbstractC0151y> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (AbstractC0151y abstractC0151y : list) {
            i.e(abstractC0151y, "upperBound");
            if (e(abstractC0151y, p10.p().D(), set) && (o10 == null || i.a(abstractC0151y.D(), o10))) {
                return true;
            }
        }
        return false;
    }

    public static p123m8.d q(p123m8.d dVar) {
        p123m8.d<Object> dVarIntercepted;
        i.f(dVar, "<this>");
        p144o8.c cVar = dVar instanceof p144o8.c ? (p144o8.c) dVar : null;
        return (cVar == null || (dVarIntercepted = cVar.intercepted()) == null) ? dVar : dVarIntercepted;
    }

    public static void r(boolean z6) {
        if (!z6) {
            throw new ValidationException("Must be true");
        }
    }

    public static final d0 s(AbstractC0151y abstractC0151y) {
        i.f(abstractC0151y, "<this>");
        d0 d0VarG = b0.g(abstractC0151y, true);
        i.e(d0VarG, "makeNullable(this)");
        return d0VarG;
    }

    public static String t(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb.append(str2.charAt(i10));
            }
        }
        return sb.toString();
    }

    public static void u(String str) {
        if (str == null || str.length() == 0) {
            throw new ValidationException("String must not be empty");
        }
    }

    public static void v(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new ValidationException(str2);
        }
    }

    public static void w(Object obj) {
        if (obj == null) {
            throw new ValidationException("Object must not be null");
        }
    }

    public static final AbstractC0151y x(AbstractC0151y abstractC0151y, M8.h hVar) {
        return (abstractC0151y.q().isEmpty() && hVar.isEmpty()) ? abstractC0151y : abstractC0151y.D0().N0(AbstractC0130c.r(abstractC0151y.o(), hVar));
    }

    public static final d0 y(AbstractC0151y abstractC0151y) {
        A9.D d3;
        d0 d0VarQ;
        i.f(abstractC0151y, "<this>");
        d0 d0VarD0 = abstractC0151y.D0();
        if (d0VarD0 instanceof r) {
            r rVar = (r) d0VarD0;
            A9.D dQ = rVar.f383t;
            if (!dQ.D().u().isEmpty() && dQ.D().w() != null) {
                List listU = dQ.D().u();
                i.e(listU, "constructor.parameters");
                List list = listU;
                ArrayList arrayList = new ArrayList(m.H(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new I((P) it.next()));
                }
                dQ = AbstractC0130c.q(dQ, arrayList, null, 2);
            }
            A9.D dQ2 = rVar.f384u;
            if (!dQ2.D().u().isEmpty() && dQ2.D().w() != null) {
                List listU2 = dQ2.D().u();
                i.e(listU2, "constructor.parameters");
                List list2 = listU2;
                ArrayList arrayList2 = new ArrayList(m.H(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new I((P) it2.next()));
                }
                dQ2 = AbstractC0130c.q(dQ2, arrayList2, null, 2);
            }
            d0VarQ = C0133f.j(dQ, dQ2);
        } else {
            if (!(d0VarD0 instanceof A9.D)) {
                throw new NoWhenBranchMatchedException();
            }
            d3 = (A9.D) d0VarD0;
            if (!d3.D().u().isEmpty() && d3.D().w() != null) {
                d0VarQ = d3;
                d0VarQ = d3;
                List listU3 = d3.D().u();
                i.e(listU3, "constructor.parameters");
                List list3 = listU3;
                ArrayList arrayList3 = new ArrayList(m.H(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new I((P) it3.next()));
                }
                d0VarQ = AbstractC0130c.q(d3, arrayList3, null, 2);
            }
        }
        d0VarQ = d3;
        d0VarQ = d3;
        d0VarQ = d3;
        return AbstractC0130c.h(d0VarQ, d0VarD0);
    }

    public void A(View view, float f10) {
        if (a) {
            try {
                A.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        view.setAlpha(f10);
    }

    public void B(View view, int i10) {
        if (!f14442c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f14441b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f14442c = true;
        }
        Field field = f14441b;
        if (field != null) {
            try {
                f14441b.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void C();

    public abstract void D();

    public boolean b() {
        return false;
    }

    public float o(View view) {
        if (a) {
            try {
                return A.a(view);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        return view.getAlpha();
    }

    public void z() {
    }
}
