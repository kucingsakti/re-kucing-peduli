package J0;

import android.database.Observable;
import androidx.preference.Preference;

/* JADX INFO: loaded from: classes.dex */
public final class t extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((u) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i10, int i11, Preference preference) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((u) ((Observable) this).mObservers.get(size)).b(i10, i11, preference);
        }
    }

    public final void d(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((u) ((Observable) this).mObservers.get(size)).c(i10, i11);
        }
    }

    public final void e(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((u) ((Observable) this).mObservers.get(size)).d(i10, i11);
        }
    }
}
