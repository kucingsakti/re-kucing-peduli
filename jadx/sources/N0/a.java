package N0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p078i.AbstractActivityC0655l;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {
    public final /* synthetic */ int a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3261b;

    public a(e eVar) {
        i.f(eVar, "registry");
        this.f3261b = new LinkedHashSet();
        eVar.f("androidx.savedstate.Restarter", this);
    }

    @Override // N0.d
    public final Bundle a() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f3261b));
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                ((AbstractActivityC0655l) this.f3261b).k().getClass();
                return bundle2;
        }
    }

    public a(AbstractActivityC0655l abstractActivityC0655l) {
        this.f3261b = abstractActivityC0655l;
    }
}
