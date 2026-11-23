package y0;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f15895b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(O o10) {
        String strM = qa.b.m(o10.getClass());
        if (strM.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.a;
        O o11 = (O) linkedHashMap.get(strM);
        if (p210v8.i.a(o11, o10)) {
            return;
        }
        boolean z6 = false;
        if (o11 != null && o11.f15894b) {
            z6 = true;
        }
        if (z6) {
            throw new IllegalStateException(("Navigator " + o10 + " is replacing an already attached " + o11).toString());
        }
        if (!o10.f15894b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + o10 + " is already attached to another NavController").toString());
    }

    public final O b(String str) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        O o10 = (O) this.a.get(str);
        if (o10 != null) {
            return o10;
        }
        throw new IllegalStateException(E0.a.i("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
