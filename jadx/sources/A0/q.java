package A0;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.J;
import androidx.navigation.NavBackStackEntryState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p086i8.y;
import y0.B;
import y0.C0872j;
import y0.O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements N0.d {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37b;

    public /* synthetic */ q(Object obj, int i10) {
        this.a = i10;
        this.f37b = obj;
    }

    @Override // N0.d
    public final Bundle a() {
        Bundle bundle;
        Object obj = this.f37b;
        switch (this.a) {
            case 0:
                B b3 = (B) obj;
                ArrayList<String> arrayList = new ArrayList<>();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : y.A(b3.f15852u.a).entrySet()) {
                    String str = (String) entry.getKey();
                    Bundle bundleH = ((O) entry.getValue()).h();
                    if (bundleH != null) {
                        arrayList.add(str);
                        bundle2.putBundle(str, bundleH);
                    }
                }
                if (arrayList.isEmpty()) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
                }
                p086i8.h hVar = b3.f15839g;
                if (!hVar.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    Parcelable[] parcelableArr = new Parcelable[hVar.f12325u];
                    Iterator<E> it = hVar.iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        parcelableArr[i10] = new NavBackStackEntryState((C0872j) it.next());
                        i10++;
                    }
                    bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
                }
                LinkedHashMap linkedHashMap = b3.f15843l;
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    int[] iArr = new int[linkedHashMap.size()];
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    int i11 = 0;
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        int iIntValue = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        iArr[i11] = iIntValue;
                        arrayList2.add(str2);
                        i11++;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
                }
                LinkedHashMap linkedHashMap2 = b3.f15844m;
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        p086i8.h hVar2 = (p086i8.h) entry3.getValue();
                        arrayList3.add(str3);
                        Parcelable[] parcelableArr2 = new Parcelable[hVar2.f12325u];
                        int i12 = 0;
                        for (Object obj2 : hVar2) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                p086i8.l.G();
                                throw null;
                            }
                            parcelableArr2[i12] = (NavBackStackEntryState) obj2;
                            i12 = i13;
                        }
                        bundle.putParcelableArray(E0.a.h("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
                    }
                    bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
                }
                if (b3.f15838f) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", b3.f15838f);
                }
                if (bundle != null) {
                    return bundle;
                }
                Bundle bundle3 = Bundle.EMPTY;
                p210v8.i.e(bundle3, "EMPTY");
                return bundle3;
            case 1:
                s sVar = (s) obj;
                p210v8.i.f(sVar, "this$0");
                int i14 = sVar.f42v0;
                if (i14 != 0) {
                    return com.bumptech.glide.d.b(new p076h8.f("android-support-nav:fragment:graphId", Integer.valueOf(i14)));
                }
                Bundle bundle4 = Bundle.EMPTY;
                p210v8.i.e(bundle4, "{\n                    Bu…e.EMPTY\n                }");
                return bundle4;
            case 2:
                return J.a((J) obj);
            default:
                return ((androidx.fragment.app.e) obj).Y();
        }
    }
}
