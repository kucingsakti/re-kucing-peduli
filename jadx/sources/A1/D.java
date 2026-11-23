package A1;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D {
    public final C0099h a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f48b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49c;

    public D(Class cls, Class cls2, Class cls3, List list, C0099h c0099h) {
        this.a = c0099h;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f48b = list;
        this.f49c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final F a(int i10, int i11, l lVar, com.bumptech.glide.load.data.g gVar, p232y1.h hVar) {
        C0099h c0099h = this.a;
        List list = (List) c0099h.b();
        try {
            List list2 = this.f48b;
            int size = list2.size();
            F fA = null;
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    fA = ((o) list2.get(i12)).a(i10, i11, lVar, gVar, hVar);
                } catch (GlideException e10) {
                    list.add(e10);
                }
                if (fA != null) {
                    break;
                }
            }
            if (fA != null) {
                c0099h.q(list);
                return fA;
            }
            throw new GlideException(this.f49c, new ArrayList(list));
        } catch (Throwable th) {
            c0099h.q(list);
            throw th;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f48b.toArray()) + '}';
    }
}
