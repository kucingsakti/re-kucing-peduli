package p156q0;

import android.util.Log;
import androidx.fragment.app.b;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class L implements J {
    public final /* synthetic */ e a;

    public L(e eVar) {
        this.a = eVar;
    }

    @Override // p156q0.J
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean zU;
        e eVar = this.a;
        eVar.getClass();
        if (e.K(2)) {
            Objects.toString(eVar.a);
        }
        if (eVar.f6678d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            arrayList3 = arrayList;
            zU = false;
            arrayList4 = arrayList2;
        } else {
            ArrayList arrayList5 = eVar.f6678d;
            C0742a c0742a = (C0742a) arrayList5.get(arrayList5.size() - 1);
            eVar.f6682h = c0742a;
            Iterator it = c0742a.a.iterator();
            while (it.hasNext()) {
                b bVar = ((P) it.next()).f14269b;
                if (bVar != null) {
                    bVar.f6614F = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zU = eVar.U(arrayList3, arrayList4, null, -1, 0);
        }
        if (!eVar.f6687n.isEmpty() && arrayList3.size() > 0) {
            boolean zBooleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(e.G((C0742a) it2.next()));
            }
            for (I i10 : eVar.f6687n) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    i10.c((b) it3.next(), zBooleanValue);
                }
            }
        }
        return zU;
    }
}
