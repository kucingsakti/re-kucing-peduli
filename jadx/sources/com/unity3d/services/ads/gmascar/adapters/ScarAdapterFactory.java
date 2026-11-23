package com.unity3d.services.ads.gmascar.adapters;

import E0.a;
import O3.y;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.concurrent.ConcurrentHashMap;
import p102k7.e;

/* JADX INFO: loaded from: classes.dex */
public class ScarAdapterFactory {

    /* JADX INFO: renamed from: com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion;

        static {
            int[] iArr = new int[ScarAdapterVersion.values().length];
            $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion = iArr;
            try {
                iArr[ScarAdapterVersion.V20.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[ScarAdapterVersion.V21.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[ScarAdapterVersion.NA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void reportAdapterFailure(ScarAdapterVersion scarAdapterVersion, c cVar) {
        String strI = a.i("SCAR version ", scarAdapterVersion.name(), " is not supported.");
        cVar.handleError(new com.unity3d.scar.adapter.common.a(b.f10423y, strI, new Object[0]));
        DeviceLog.debug(strI);
    }

    public d createScarAdapter(ScarAdapterVersion scarAdapterVersion, c cVar) {
        int i10 = AnonymousClass1.$SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[scarAdapterVersion.ordinal()];
        if (i10 == 1) {
            p218w7.a aVar = new p218w7.a(cVar);
            e eVar = new e();
            eVar.f12743s = new ConcurrentHashMap();
            aVar.f15652e = eVar;
            aVar.a = new p237y7.b();
            return aVar;
        }
        if (i10 != 2) {
            reportAdapterFailure(scarAdapterVersion, cVar);
            return null;
        }
        String versionName = SdkProperties.getVersionName();
        p245z7.a aVar2 = new p245z7.a(cVar);
        y yVar = new y(6);
        yVar.f3597t = a.h("UnityScar", versionName);
        A7.a aVar3 = new A7.a();
        aVar3.a = yVar;
        aVar2.f16315e = aVar3;
        C7.b bVar = new C7.b();
        bVar.f948e = aVar3;
        aVar2.a = bVar;
        return aVar2;
    }
}
