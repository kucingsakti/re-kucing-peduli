package E1;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class H implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f1298b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final r a;

    public H(r rVar) {
        this.a = rVar;
    }

    @Override // E1.r
    public final boolean a(Object obj) {
        return f1298b.contains(((Uri) obj).getScheme());
    }

    @Override // E1.r
    public final q b(Object obj, int i10, int i11, p232y1.h hVar) {
        return this.a.b(new C0185g(((Uri) obj).toString()), i10, i11, hVar);
    }
}
