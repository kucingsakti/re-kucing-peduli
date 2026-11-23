package p031d;

import I.AbstractC0241e;
import P0.d;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.lifecycle.InterfaceC0522q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p049f.a;
import p049f.e;
import p049f.f;
import p068ga.l;
import p078i.AbstractActivityC0655l;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final HashMap a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f10438b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10439c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f10440d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient HashMap f10441e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f10442f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f10443g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0655l f10444h;

    public g(AbstractActivityC0655l abstractActivityC0655l) {
        this.f10444h = abstractActivityC0655l;
    }

    public final boolean a(int i10, int i11, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        e eVar = (e) this.f10441e.get(str);
        if (eVar != null) {
            a aVar = eVar.a;
            if (this.f10440d.contains(str)) {
                aVar.a(eVar.f11384b.l(i11, intent));
                this.f10440d.remove(str);
                return true;
            }
        }
        this.f10442f.remove(str);
        this.f10443g.putParcelable(str, new ActivityResult(i11, intent));
        return true;
    }

    public final void b(int i10, l lVar, Object obj) {
        Bundle bundleExtra;
        int i11;
        AbstractActivityC0655l abstractActivityC0655l = this.f10444h;
        d dVarJ = lVar.j(abstractActivityC0655l, obj);
        if (dVarJ != null) {
            new Handler(Looper.getMainLooper()).post(new X2.a(this, i10, dVarJ, 1));
            return;
        }
        Intent intentC = lVar.c(abstractActivityC0655l, obj);
        if (intentC.getExtras() != null && intentC.getExtras().getClassLoader() == null) {
            intentC.setExtrasClassLoader(abstractActivityC0655l.getClassLoader());
        }
        if (intentC.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentC.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentC.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentC.getAction())) {
            String[] stringArrayExtra = intentC.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC0241e.f(abstractActivityC0655l, stringArrayExtra, i10);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentC.getAction())) {
            abstractActivityC0655l.startActivityForResult(intentC, i10, bundle);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentC.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i11 = i10;
            try {
                abstractActivityC0655l.startIntentSenderForResult(intentSenderRequest.f6033s, i11, intentSenderRequest.f6034t, intentSenderRequest.f6035u, intentSenderRequest.f6036v, 0, bundle);
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                new Handler(Looper.getMainLooper()).post(new X2.a(this, i11, e, 2));
            }
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
            i11 = i10;
        }
    }

    public final p049f.d c(String str, l lVar, a aVar) {
        d(str);
        this.f10441e.put(str, new e(aVar, lVar));
        HashMap map = this.f10442f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            aVar.a(obj);
        }
        Bundle bundle = this.f10443g;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            aVar.a(lVar.l(activityResult.f6031s, activityResult.f6032t));
        }
        return new p049f.d(this, str, lVar, 1);
    }

    public final void d(String str) {
        HashMap map = this.f10438b;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        p246z8.a aVar = p246z8.d.f16317s;
        int iNextInt = p246z8.d.f16317s.d().nextInt(2147418112);
        while (true) {
            int i10 = iNextInt + 65536;
            HashMap map2 = this.a;
            if (!map2.containsKey(Integer.valueOf(i10))) {
                map2.put(Integer.valueOf(i10), str);
                map.put(str, Integer.valueOf(i10));
                return;
            } else {
                p246z8.a aVar2 = p246z8.d.f16317s;
                iNextInt = p246z8.d.f16317s.d().nextInt(2147418112);
            }
        }
    }

    public final void e(String str) {
        Integer num;
        if (!this.f10440d.contains(str) && (num = (Integer) this.f10438b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.f10441e.remove(str);
        HashMap map = this.f10442f;
        if (map.containsKey(str)) {
            StringBuilder sbM = AbstractC0487g.m("Dropping pending result for request ", str, ": ");
            sbM.append(map.get(str));
            Log.w("ActivityResultRegistry", sbM.toString());
            map.remove(str);
        }
        Bundle bundle = this.f10443g;
        if (bundle.containsKey(str)) {
            StringBuilder sbM2 = AbstractC0487g.m("Dropping pending result for request ", str, ": ");
            sbM2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", sbM2.toString());
            bundle.remove(str);
        }
        HashMap map2 = this.f10439c;
        f fVar = (f) map2.get(str);
        if (fVar != null) {
            ArrayList arrayList = fVar.f11385b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar.a.f((InterfaceC0522q) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
