package S9;

import N9.r0;

/* JADX INFO: loaded from: classes.dex */
public final class v extends p210v8.k implements p200u8.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final v f4578t = new v(2, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final v f4579u = new v(2, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final v f4580v = new v(2, 2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4581s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i10, int i11) {
        super(i10);
        this.f4581s = i11;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4581s) {
            case 0:
                p123m8.g gVar = (p123m8.g) obj2;
                if (!(gVar instanceof r0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? gVar : Integer.valueOf(iIntValue + 1);
            case 1:
                r0 r0Var = (r0) obj;
                p123m8.g gVar2 = (p123m8.g) obj2;
                if (r0Var != null) {
                    return r0Var;
                }
                if (gVar2 instanceof r0) {
                    return (r0) gVar2;
                }
                return null;
            default:
                return (x) obj;
        }
    }
}
