package I;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class N implements Iterable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f1958s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f1959t;

    public N(Context context) {
        this.f1959t = context;
    }

    public final void d(ComponentName componentName) {
        Context context = this.f1959t;
        ArrayList arrayList = this.f1958s;
        int size = arrayList.size();
        try {
            for (Intent intentA = AbstractC0244h.a(context, componentName); intentA != null; intentA = AbstractC0244h.a(context, intentA.getComponent())) {
                arrayList.add(size, intentA);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final void e() {
        ArrayList arrayList = this.f1958s;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f1959t.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f1958s.iterator();
    }
}
