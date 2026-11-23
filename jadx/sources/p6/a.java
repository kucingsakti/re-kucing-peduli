package p6;

import com.onesignal.core.internal.config.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p064g5.g;
import p173r6.f;
import p173r6.h;
import p208v6.d;
import p208v6.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p142o6.a {
    private final b _configModelStore;
    private final p162q6.b _identityModelStore;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final e _subscriptionsModelStore;

    public a(p162q6.b bVar, com.onesignal.user.internal.properties.b bVar2, e eVar, b bVar3) {
        i.f(bVar, "_identityModelStore");
        i.f(bVar2, "_propertiesModelStore");
        i.f(eVar, "_subscriptionsModelStore");
        i.f(bVar3, "_configModelStore");
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
        this._subscriptionsModelStore = eVar;
        this._configModelStore = bVar3;
    }

    @Override // p142o6.a
    public List<g> getRebuildOperationsIfCurrentUser(String str, String str2) {
        i.f(str, "appId");
        i.f(str2, "onesignalId");
        p162q6.a aVar = new p162q6.a();
        Object obj = null;
        aVar.initializeFromModel(null, this._identityModelStore.getModel());
        new com.onesignal.user.internal.properties.a().initializeFromModel(null, this._propertiesModelStore.getModel());
        ArrayList arrayList = new ArrayList();
        Iterator<com.onesignal.common.modeling.i> it = this._subscriptionsModelStore.list().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            d dVar2 = new d();
            dVar2.initializeFromModel(null, dVar);
            arrayList.add(dVar2);
        }
        if (!i.a(aVar.getOnesignalId(), str2)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new f(str, str2, aVar.getExternalId(), null, 8, null));
        for (Object obj2 : arrayList) {
            if (i.a(((d) obj2).getId(), ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getPushSubscriptionId())) {
                obj = obj2;
                break;
            }
        }
        d dVar3 = (d) obj;
        if (dVar3 != null) {
            arrayList2.add(new p173r6.a(str, str2, dVar3.getId(), dVar3.getType(), dVar3.getOptedIn(), dVar3.getAddress(), dVar3.getStatus()));
        }
        arrayList2.add(new h(str, str2));
        return arrayList2;
    }
}
