package p031d;

import N0.d;
import android.os.Bundle;
import androidx.lifecycle.EnumC0518m;
import java.util.ArrayList;
import java.util.HashMap;
import p078i.AbstractActivityC0655l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements d {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0655l f10436b;

    public /* synthetic */ e(AbstractActivityC0655l abstractActivityC0655l, int i10) {
        this.a = i10;
        this.f10436b = abstractActivityC0655l;
    }

    @Override // N0.d
    public final Bundle a() {
        switch (this.a) {
            case 0:
                AbstractActivityC0655l abstractActivityC0655l = this.f10436b;
                Bundle bundle = new Bundle();
                g gVar = abstractActivityC0655l.f10458B;
                gVar.getClass();
                HashMap map = gVar.f10438b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(gVar.f10440d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) gVar.f10443g.clone());
                return bundle;
            default:
                AbstractActivityC0655l abstractActivityC0655l2 = this.f10436b;
                while (AbstractActivityC0655l.o(abstractActivityC0655l2.m())) {
                }
                abstractActivityC0655l2.f12096K.d(EnumC0518m.ON_STOP);
                return new Bundle();
        }
    }
}
