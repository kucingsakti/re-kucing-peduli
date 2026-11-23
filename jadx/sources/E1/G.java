package E1;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class G implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f1297b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));
    public final Object a;

    public G(F f10) {
        this.a = f10;
    }

    @Override // E1.r
    public final boolean a(Object obj) {
        return f1297b.contains(((Uri) obj).getScheme());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [E1.F, java.lang.Object] */
    @Override // E1.r
    public final q b(Object obj, int i10, int i11, p232y1.h hVar) {
        Uri uri = (Uri) obj;
        return new q(new T1.b(uri), this.a.a(uri));
    }
}
