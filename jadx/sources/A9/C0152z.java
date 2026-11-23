package A9;

import java.util.List;

/* JADX INFO: renamed from: A9.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0152z extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f395s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ O f396t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f397u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0152z(K k3, O o10, List list, t9.n nVar, boolean z6) {
        super(1);
        this.f396t = o10;
        this.f397u = list;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f395s) {
            case 0:
                p210v8.i.f((B9.f) obj, "refiner");
                this.f396t.w();
                break;
            default:
                p210v8.i.f((B9.f) obj, "kotlinTypeRefiner");
                this.f396t.w();
                break;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0152z(K k3, O o10, List list, boolean z6) {
        super(1);
        this.f396t = o10;
        this.f397u = list;
    }
}
