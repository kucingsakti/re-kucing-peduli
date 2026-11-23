package p059g;

import J.f;
import P0.d;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p068ga.l;
import p078i.AbstractActivityC0655l;
import p086i8.k;
import p086i8.t;
import p086i8.y;
import p086i8.z;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11454b;

    public /* synthetic */ a(int i10) {
        this.f11454b = i10;
    }

    @Override // p068ga.l
    public final Intent c(AbstractActivityC0655l abstractActivityC0655l, Object obj) {
        Bundle bundleExtra;
        switch (this.f11454b) {
            case 0:
                String[] strArr = (String[]) obj;
                i.f(strArr, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                i.e(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            case 1:
                String str = (String) obj;
                i.f(str, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                i.e(intentPutExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra2;
            case 2:
                Intent intent = (Intent) obj;
                i.f(intent, "input");
                return intent;
            default:
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = intentSenderRequest.f6034t;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        intentSenderRequest = new IntentSenderRequest(intentSenderRequest.f6033s, null, intentSenderRequest.f6035u, intentSenderRequest.f6036v);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
                if (e.K(2)) {
                    intent2.toString();
                }
                return intent2;
        }
    }

    @Override // p068ga.l
    public d j(AbstractActivityC0655l abstractActivityC0655l, Object obj) {
        switch (this.f11454b) {
            case 0:
                String[] strArr = (String[]) obj;
                i.f(strArr, "input");
                if (strArr.length == 0) {
                    return new d(t.f12329s, 27);
                }
                for (String str : strArr) {
                    if (f.a(abstractActivityC0655l, str) != 0) {
                        return null;
                    }
                }
                int iS = z.s(strArr.length);
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new d(linkedHashMap, 27);
            case 1:
                String str3 = (String) obj;
                i.f(str3, "input");
                if (f.a(abstractActivityC0655l, str3) == 0) {
                    return new d(Boolean.TRUE, 27);
                }
                return null;
            default:
                return super.j(abstractActivityC0655l, obj);
        }
    }

    @Override // p068ga.l
    public final Object l(int i10, Intent intent) {
        switch (this.f11454b) {
            case 0:
                t tVar = t.f12329s;
                if (i10 != -1 || intent == null) {
                    return tVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return tVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i11 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i11 == 0));
                }
                return y.z(k.z0(p086i8.i.u(stringArrayExtra), arrayList));
            case 1:
                if (intent == null || i10 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z6 = false;
                if (intArrayExtra2 != null) {
                    for (int i12 : intArrayExtra2) {
                        if (i12 == 0) {
                            z6 = true;
                        }
                    }
                }
                return Boolean.valueOf(z6);
            case 2:
                return new ActivityResult(i10, intent);
            default:
                return new ActivityResult(i10, intent);
        }
    }
}
