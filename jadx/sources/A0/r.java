package A0;

import A1.C0099h;
import A9.AbstractC0130c;
import A9.AbstractC0135h;
import A9.AbstractC0151y;
import A9.C0134g;
import A9.I;
import E1.E;
import E4.C0187a;
import F8.D;
import F8.G;
import F8.H;
import F8.J;
import F8.K;
import F8.L;
import F8.m0;
import F8.n0;
import F8.q0;
import O8.T;
import U.Z;
import Y8.C0475d;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.InterfaceC0523s;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import androidx.navigation.NavBackStackEntryState;
import com.google.android.material.chip.Chip;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.Browser2Activity;
import com.kcstream.cing.activity.MainActivity;
import com.kcstream.cing.fragment.TabsBookmarkFragment;
import com.kcstream.cing.fragment.TabsDownloadsFragment;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.io.File;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;
import p086i8.C;
import p086i8.z;
import p136o.v;
import p210v8.x;
import y0.B;
import y0.P;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f38s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f39t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, int i10) {
        super(0);
        this.f38s = i10;
        this.f39t = obj;
    }

    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Object, u8.b] */
    /* JADX WARN: Type inference failed for: r3v55, types: [java.lang.Object, java.util.Map] */
    @Override // p200u8.a
    public final Object invoke() {
        C0525u c0525uG;
        int iHashCode;
        P0.g gVar;
        M8.m mVar;
        p145o9.b bVarA;
        p086i8.t tVar = p086i8.t.f12329s;
        p076h8.m mVar2 = p076h8.m.a;
        int i10 = 1;
        Object objT = null;
        int iHashCode2 = 0;
        Object obj = this.f39t;
        switch (this.f38s) {
            case 0:
                s sVar = (s) obj;
                Context contextM = sVar.m();
                if (contextM == null) {
                    throw new IllegalStateException("NavController cannot be created before the fragment is attached");
                }
                B b3 = new B(contextM);
                if (!sVar.equals(b3.f15845n)) {
                    InterfaceC0523s interfaceC0523s = b3.f15845n;
                    e eVar = b3.f15849r;
                    if (interfaceC0523s != null && (c0525uG = interfaceC0523s.g()) != null) {
                        c0525uG.f(eVar);
                    }
                    b3.f15845n = sVar;
                    sVar.f6643l0.a(eVar);
                }
                V vE = sVar.e();
                if (!p210v8.i.a(b3.f15846o, C.j(vE))) {
                    if (!b3.f15839g.isEmpty()) {
                        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                    }
                    b3.f15846o = C.j(vE);
                }
                Context contextX = sVar.X();
                androidx.fragment.app.e eVarL = sVar.l();
                p210v8.i.e(eVarL, "childFragmentManager");
                d dVar = new d(contextX, eVarL);
                P p10 = b3.f15852u;
                p10.a(dVar);
                Context contextX2 = sVar.X();
                androidx.fragment.app.e eVarL2 = sVar.l();
                p210v8.i.e(eVarL2, "childFragmentManager");
                int i11 = sVar.f6625R;
                if (i11 == 0 || i11 == -1) {
                    i11 = R.id.nav_host_fragment_container;
                }
                p10.a(new g(contextX2, eVarL2, i11));
                Bundle bundleC = ((N0.e) sVar.f6646o0.f3308d).c("android-support-nav:fragment:navControllerState");
                if (bundleC != null) {
                    bundleC.setClassLoader(contextM.getClassLoader());
                    b3.f15836d = bundleC.getBundle("android-support-nav:controller:navigatorState");
                    b3.f15837e = bundleC.getParcelableArray("android-support-nav:controller:backStack");
                    LinkedHashMap linkedHashMap = b3.f15844m;
                    linkedHashMap.clear();
                    int[] intArray = bundleC.getIntArray("android-support-nav:controller:backStackDestIds");
                    ArrayList<String> stringArrayList = bundleC.getStringArrayList("android-support-nav:controller:backStackIds");
                    if (intArray != null && stringArrayList != null) {
                        int length = intArray.length;
                        int i12 = 0;
                        int i13 = 0;
                        while (i12 < length) {
                            b3.f15843l.put(Integer.valueOf(intArray[i12]), stringArrayList.get(i13));
                            i12++;
                            i13++;
                        }
                    }
                    ArrayList<String> stringArrayList2 = bundleC.getStringArrayList("android-support-nav:controller:backStackStates");
                    if (stringArrayList2 != null) {
                        for (String str : stringArrayList2) {
                            Parcelable[] parcelableArray = bundleC.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                            if (parcelableArray != null) {
                                p210v8.i.e(str, "id");
                                p086i8.h hVar = new p086i8.h(parcelableArray.length);
                                Z zG = x.g(parcelableArray);
                                while (zG.hasNext()) {
                                    Parcelable parcelable = (Parcelable) zG.next();
                                    p210v8.i.d(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                    hVar.k((NavBackStackEntryState) parcelable);
                                }
                                linkedHashMap.put(str, hVar);
                            }
                        }
                    }
                    b3.f15838f = bundleC.getBoolean("android-support-nav:controller:deepLinkHandled");
                }
                ((N0.e) sVar.f6646o0.f3308d).f("android-support-nav:fragment:navControllerState", new q(b3, iHashCode2));
                Bundle bundleC2 = ((N0.e) sVar.f6646o0.f3308d).c("android-support-nav:fragment:graphId");
                if (bundleC2 != null) {
                    sVar.f42v0 = bundleC2.getInt("android-support-nav:fragment:graphId");
                }
                ((N0.e) sVar.f6646o0.f3308d).f("android-support-nav:fragment:graphId", new q(sVar, i10));
                int i14 = sVar.f42v0;
                p076h8.j jVar = b3.f15832B;
                if (i14 != 0) {
                    b3.t(((y0.C) jVar.getValue()).b(i14), null);
                } else {
                    Bundle bundle = sVar.f6656y;
                    iHashCode2 = bundle != null ? bundle.getInt("android-support-nav:fragment:graphId") : 0;
                    Bundle bundle2 = bundle != null ? bundle.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                    if (iHashCode2 != 0) {
                        b3.t(((y0.C) jVar.getValue()).b(iHashCode2), bundle2);
                    }
                }
                return b3;
            case 1:
                return new C0134g(((AbstractC0135h) obj).b());
            case 2:
                return AbstractC0130c.s(((I) obj).a);
            case 3:
                return C9.i.c(C9.h.CANNOT_COMPUTE_ERASED_BOUND, ((o1.e) obj).toString());
            case 4:
                p200u8.a aVar = ((B9.j) obj).f788b;
                if (aVar != null) {
                    return (List) aVar.invoke();
                }
                return null;
            case 5:
                Browser2Activity browser2Activity = (Browser2Activity) obj;
                if (!L9.n.I(browser2Activity.f10168T, "http://", false)) {
                    L9.n.I(browser2Activity.f10168T, "https://", false);
                }
                browser2Activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(browser2Activity.f10168T)));
                return mVar2;
            case 6:
                return new N4.b((MainActivity) obj, p086i8.l.C(Integer.valueOf(R.navigation.bottom_navigation_recent), Integer.valueOf(R.navigation.bottom_navigation_index), Integer.valueOf(R.navigation.bottom_navigation_bookmark), Integer.valueOf(R.navigation.bottom_navigation_downloads)));
            case 7:
                return q0.a(((D) obj).a());
            case 8:
                return new G((H) obj);
            case 9:
                return new F8.I((J) obj);
            case 10:
                return new K((L) obj);
            case 11:
                List upperBounds = ((n0) obj).f1614s.getUpperBounds();
                p210v8.i.e(upperBounds, "descriptor.upperBounds");
                List list = upperBounds;
                ArrayList arrayList = new ArrayList(p086i8.m.H(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new m0((AbstractC0151y) it.next(), null));
                }
                return arrayList;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str2.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode2);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                TabsBookmarkFragment tabsBookmarkFragment = (TabsBookmarkFragment) obj;
                Context contextX3 = tabsBookmarkFragment.X();
                Y1.c cVar = new Y1.c(contextX3, (Chip) tabsBookmarkFragment.g0().f1660u);
                new p125n.g(contextX3).inflate(R.menu.menu_fragment_bookmark_type, (p136o.l) cVar.f5670t);
                cVar.f5672v = new C0187a(tabsBookmarkFragment, 7);
                v vVar = (v) cVar.f5671u;
                if (!vVar.b()) {
                    if (vVar.f13560e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    vVar.d(0, 0, false, false);
                }
                return mVar2;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                TabsDownloadsFragment tabsDownloadsFragment = (TabsDownloadsFragment) obj;
                Context contextX4 = tabsDownloadsFragment.X();
                C0099h c0099h = tabsDownloadsFragment.f10249t0;
                if (c0099h == null) {
                    p210v8.i.n("binding");
                    throw null;
                }
                Y1.c cVar2 = new Y1.c(contextX4, (Chip) c0099h.f104u);
                new p125n.g(contextX4).inflate(R.menu.menu_fragment_download_option, (p136o.l) cVar2.f5670t);
                cVar2.f5672v = new C0187a(tabsDownloadsFragment, 8);
                v vVar2 = (v) cVar2.f5671u;
                if (!vVar2.b()) {
                    if (vVar2.f13560e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    vVar2.d(0, 0, false, false);
                }
                return mVar2;
            case 15:
                return ((K0.q) obj).b();
            case 16:
                K8.i iVar = (K8.i) obj;
                I8.l lVar = iVar.f2648f;
                if (lVar == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                K8.h hVar2 = (K8.h) lVar.invoke();
                iVar.f2648f = null;
                return hVar2;
            case 17:
                return obj;
            case 18:
                return (t9.n) ((L8.L) obj).f2798b.invoke(B9.f.a);
            case 19:
                M8.j jVar2 = (M8.j) obj;
                return jVar2.a.i(jVar2.f3202b).p();
            case 20:
                return (List) ((T) obj).f3687D.getValue();
            case MobileAdsBridge.CODE_21 /* 21 */:
                P0.h hVar3 = (P0.h) obj;
                if (hVar3.f3824t == null || !hVar3.f3826v) {
                    gVar = new P0.g(hVar3.f3823s, hVar3.f3824t, new P0.d(0), hVar3.f3825u, hVar3.f3827w);
                } else {
                    Context context = hVar3.f3823s;
                    p210v8.i.f(context, "context");
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    p210v8.i.e(noBackupFilesDir, "context.noBackupFilesDir");
                    gVar = new P0.g(hVar3.f3823s, new File(noBackupFilesDir, hVar3.f3824t).getAbsolutePath(), new P0.d(0), hVar3.f3825u, hVar3.f3827w);
                }
                gVar.setWriteAheadLoggingEnabled(hVar3.f3829y);
                return gVar;
            case 22:
                p095j8.b bVar = new p095j8.b();
                U8.v vVar3 = (U8.v) obj;
                bVar.add(vVar3.a.f4929s);
                U8.B b7 = vVar3.f4990b;
                if (b7 != null) {
                    bVar.add("under-migration:".concat(b7.f4929s));
                }
                for (Map.Entry entry2 : vVar3.f4991c.entrySet()) {
                    bVar.add("@" + entry2.getKey() + ':' + ((U8.B) entry2.getValue()).f4929s);
                }
                return (String[]) com.bumptech.glide.d.a(bVar).toArray(new String[0]);
            case 23:
                Object obj2 = V8.e.a;
                p009a9.a aVar2 = ((V8.i) obj).f5206d;
                R8.s sVar2 = aVar2 instanceof R8.s ? (R8.s) aVar2 : null;
                p145o9.i iVar2 = (sVar2 == null || (mVar = (M8.m) V8.e.f5211b.get(p096j9.f.j(sVar2.f4476b.name()).g())) == null) ? null : new p145o9.i(p096j9.b.j(I8.n.f2184v), p096j9.f.j(mVar.name()));
                objT = iVar2 != null ? z.t(new p076h8.f(V8.c.f5208c, iVar2)) : null;
                return objT == null ? tVar : objT;
            case 24:
                p009a9.a aVar3 = ((V8.j) obj).f5206d;
                if (aVar3 instanceof R8.g) {
                    Object obj3 = V8.e.a;
                    bVarA = V8.e.a(((R8.g) aVar3).a());
                } else if (aVar3 instanceof R8.s) {
                    Object obj4 = V8.e.a;
                    bVarA = V8.e.a(com.bumptech.glide.d.u(aVar3));
                } else {
                    bVarA = null;
                }
                objT = bVarA != null ? z.t(new p076h8.f(V8.c.f5207b, bVarA)) : null;
                return objT == null ? tVar : objT;
            case 25:
                C0475d c0475d = (C0475d) obj;
                Collection collectionValues = ((Map) J7.j.o(c0475d.f5739c.f5797A, Y8.r.f5796E[0])).values();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    p238y9.n nVarA = ((p029c9.d) ((I4.a) c0475d.f5738b.f1659t).f2049d).a(c0475d.f5739c, (Q8.b) it2.next());
                    if (nVarA != null) {
                        arrayList2.add(nVarA);
                    }
                }
                return (t9.n[]) com.bumptech.glide.e.i(arrayList2).toArray(new t9.n[0]);
            case 26:
                String string = Settings.Secure.getString(((E1.D) obj).f1295t, "android_id");
                p210v8.i.e(string, "getString(\n             ….ANDROID_ID\n            )");
                return string;
            case 27:
                E e10 = (E) obj;
                e10.getClass();
                try {
                    Cursor cursorQuery = e10.f1296s.query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
                    if (cursorQuery != null) {
                        if (!cursorQuery.moveToFirst() || cursorQuery.getColumnCount() < 2) {
                            cursorQuery.close();
                        } else {
                            try {
                                String string2 = cursorQuery.getString(1);
                                p210v8.i.e(string2, "cursor.getString(1)");
                                String hexString = Long.toHexString(Long.parseLong(string2));
                                cursorQuery.close();
                                objT = hexString;
                            } catch (NumberFormatException unused) {
                                cursorQuery.close();
                            }
                        }
                    }
                    break;
                } catch (Exception unused2) {
                }
                return objT;
            case 28:
                return androidx.lifecycle.L.f((W) obj);
            default:
                X9.v vVar4 = ((p020ba.k) obj).f7398e;
                p210v8.i.c(vVar4);
                List listA = vVar4.a();
                ArrayList arrayList3 = new ArrayList(p086i8.m.H(listA, 10));
                Iterator it3 = listA.iterator();
                while (it3.hasNext()) {
                    arrayList3.add((X509Certificate) ((Certificate) it3.next()));
                }
                return arrayList3;
        }
    }
}
