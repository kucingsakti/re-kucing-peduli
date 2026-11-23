package p031d;

import N0.e;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import p038e.a;
import p078i.AbstractActivityC0655l;
import p156q0.C0763w;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements a {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0655l f10437b;

    public /* synthetic */ f(AbstractActivityC0655l abstractActivityC0655l, int i10) {
        this.a = i10;
        this.f10437b = abstractActivityC0655l;
    }

    @Override // p038e.a
    public final void a() {
        switch (this.a) {
            case 0:
                AbstractActivityC0655l abstractActivityC0655l = this.f10437b;
                Bundle bundleC = ((e) abstractActivityC0655l.f10469w.f3308d).c("android:support:activity-result");
                if (bundleC != null) {
                    g gVar = abstractActivityC0655l.f10458B;
                    gVar.getClass();
                    ArrayList<Integer> integerArrayList = bundleC.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        gVar.f10440d = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        Bundle bundle = bundleC.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = gVar.f10443g;
                        bundle2.putAll(bundle);
                        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                            String str = stringArrayList.get(i10);
                            HashMap map = gVar.f10438b;
                            boolean zContainsKey = map.containsKey(str);
                            HashMap map2 = gVar.a;
                            if (zContainsKey) {
                                Integer num = (Integer) map.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    map2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i10);
                            num2.intValue();
                            String str2 = stringArrayList.get(i10);
                            map2.put(num2, str2);
                            map.put(str2, num2);
                        }
                        break;
                    }
                }
                break;
            default:
                C0763w c0763w = (C0763w) this.f10437b.f12095J.f12212t;
                c0763w.f14371v.b(c0763w, c0763w, null);
                break;
        }
    }
}
