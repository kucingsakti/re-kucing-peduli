package Q;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class l implements j {
    public final LocaleList a;

    public l(Object obj) {
        this.a = k.j(obj);
    }

    @Override // Q.j
    public final String a() {
        return this.a.toLanguageTags();
    }

    @Override // Q.j
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((j) obj).b());
    }

    @Override // Q.j
    public final Locale get(int i10) {
        return this.a.get(i10);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // Q.j
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // Q.j
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }
}
