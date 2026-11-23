package p114l9;

import java.util.ArrayList;
import java.util.Set;
import p086i8.i;
import p086i8.k;

/* JADX INFO: loaded from: classes.dex */
public enum h {
    VISIBILITY(0),
    MODALITY(1),
    OVERRIDE(2),
    ANNOTATIONS(3),
    INNER(4),
    MEMBER_KIND(5),
    DATA(6),
    INLINE(7),
    EXPECT(8),
    ACTUAL(9),
    CONST(10),
    LATEINIT(11),
    FUN(12),
    VALUE(13);


    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Set f12996t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Set f12997u;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f13003s;

    static {
        h[] hVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (h hVar : hVarArrValues) {
            if (hVar.f13003s) {
                arrayList.add(hVar);
            }
        }
        f12996t = k.w0(arrayList);
        f12997u = i.K(values());
    }

    h(int i10) {
        this.f13003s = z;
    }
}
