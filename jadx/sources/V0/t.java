package V0;

import android.view.ViewGroup;
import com.kcstream.cing.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static final C0446a a = new C0446a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f5160b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f5161c = new ArrayList();

    public static void a(ViewGroup viewGroup, p pVar) {
        ArrayList arrayList = f5161c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (pVar == null) {
            pVar = a;
        }
        p pVarClone = pVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((p) it.next()).A(viewGroup);
            }
        }
        pVarClone.i(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        s sVar = new s();
        sVar.f5158s = pVarClone;
        sVar.f5159t = viewGroup;
        viewGroup.addOnAttachStateChangeListener(sVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(sVar);
    }

    public static p212w.e b() {
        p212w.e eVar;
        ThreadLocal threadLocal = f5160b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (p212w.e) weakReference.get()) != null) {
            return eVar;
        }
        p212w.e eVar2 = new p212w.e(0);
        threadLocal.set(new WeakReference(eVar2));
        return eVar2;
    }
}
