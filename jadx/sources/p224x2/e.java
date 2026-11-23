package p224x2;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.zab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p147p1.c;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f15758u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ zaaw f15759v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(zaaw zaawVar, ArrayList arrayList) {
        super(zaawVar);
        this.f15759v = zaawVar;
        this.f15758u = arrayList;
    }

    @Override // p147p1.c
    public final void c() {
        Set set;
        zaaw zaawVar = this.f15759v;
        zabe zabeVar = zaawVar.a.f7989n;
        zabi zabiVar = zaawVar.a;
        ClientSettings clientSettings = zaawVar.f7952r;
        if (clientSettings == null) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet(clientSettings.f8076b);
            Map map = clientSettings.f8078d;
            for (Api api : map.keySet()) {
                if (!zabiVar.f7984h.containsKey(api.f7847b)) {
                    ((zab) map.get(api)).getClass();
                    hashSet.addAll(null);
                }
            }
            set = hashSet;
        }
        zabeVar.f7963H = set;
        ArrayList arrayList = this.f15758u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Api.Client) arrayList.get(i10)).d(zaawVar.f7949o, zabiVar.f7989n.f7963H);
        }
    }
}
