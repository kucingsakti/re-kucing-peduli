package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Map;
import p140o4.r;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p049f.a {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f6658b;

    public /* synthetic */ c(e eVar, int i10) {
        this.a = i10;
        this.f6658b = eVar;
    }

    @Override // p049f.a
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
                }
                e eVar = this.f6658b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) eVar.f6666F.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = fragmentManager$LaunchedFragmentInfo.f6583s;
                    b bVarI = eVar.f6677c.i(str);
                    if (bVarI == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    } else {
                        bVarI.M(fragmentManager$LaunchedFragmentInfo.f6584t, strArr, iArr);
                    }
                }
                break;
            case 1:
                ActivityResult activityResult = (ActivityResult) obj;
                e eVar2 = this.f6658b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) eVar2.f6666F.pollLast();
                if (fragmentManager$LaunchedFragmentInfo2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    r rVar = eVar2.f6677c;
                    String str2 = fragmentManager$LaunchedFragmentInfo2.f6583s;
                    b bVarI2 = rVar.i(str2);
                    if (bVarI2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        bVarI2.A(fragmentManager$LaunchedFragmentInfo2.f6584t, activityResult.f6031s, activityResult.f6032t);
                    }
                }
                break;
            default:
                ActivityResult activityResult2 = (ActivityResult) obj;
                e eVar3 = this.f6658b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) eVar3.f6666F.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    r rVar2 = eVar3.f6677c;
                    String str3 = fragmentManager$LaunchedFragmentInfo3.f6583s;
                    b bVarI3 = rVar2.i(str3);
                    if (bVarI3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        bVarI3.A(fragmentManager$LaunchedFragmentInfo3.f6584t, activityResult2.f6031s, activityResult2.f6032t);
                    }
                }
                break;
        }
    }
}
