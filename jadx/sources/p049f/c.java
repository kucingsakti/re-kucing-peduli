package p049f;

import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.EnumC0518m;
import androidx.lifecycle.InterfaceC0522q;
import androidx.lifecycle.InterfaceC0523s;
import java.util.HashMap;
import p031d.g;
import p068ga.l;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0522q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f11377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f11378t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f11379u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f11380v;

    public c(g gVar, String str, a aVar, l lVar) {
        this.f11380v = gVar;
        this.f11377s = str;
        this.f11378t = aVar;
        this.f11379u = lVar;
    }

    @Override // androidx.lifecycle.InterfaceC0522q
    public final void onStateChanged(InterfaceC0523s interfaceC0523s, EnumC0518m enumC0518m) {
        boolean zEquals = EnumC0518m.ON_START.equals(enumC0518m);
        g gVar = this.f11380v;
        String str = this.f11377s;
        HashMap map = gVar.f10441e;
        if (!zEquals) {
            if (EnumC0518m.ON_STOP.equals(enumC0518m)) {
                map.remove(str);
                return;
            } else {
                if (EnumC0518m.ON_DESTROY.equals(enumC0518m)) {
                    gVar.e(str);
                    return;
                }
                return;
            }
        }
        a aVar = this.f11378t;
        l lVar = this.f11379u;
        map.put(str, new e(aVar, lVar));
        HashMap map2 = gVar.f10442f;
        if (map2.containsKey(str)) {
            Object obj = map2.get(str);
            map2.remove(str);
            aVar.a(obj);
        }
        Bundle bundle = gVar.f10443g;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            aVar.a(lVar.l(activityResult.f6031s, activityResult.f6032t));
        }
    }
}
