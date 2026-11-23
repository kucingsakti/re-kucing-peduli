package E4;

import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import com.kcstream.cing.activity.RecentCategoryActivity;
import com.kcstream.cing.model.All;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RecentCategoryActivity f1354s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1355t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ RecentCategoryActivity f1356u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(RecentCategoryActivity recentCategoryActivity, p123m8.d dVar) {
        super(2, dVar);
        this.f1356u = recentCategoryActivity;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new D(this.f1356u, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        RecentCategoryActivity recentCategoryActivity;
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1355t;
        RecentCategoryActivity recentCategoryActivity2 = this.f1356u;
        try {
            if (i10 == 0) {
                J7.a.v(obj);
                U9.c cVar = N9.I.f3415c;
                C c10 = new C(recentCategoryActivity2, null);
                this.f1354s = recentCategoryActivity2;
                this.f1355t = 1;
                obj = AbstractC0342z.w(cVar, c10, this);
                if (obj == aVar) {
                    return aVar;
                }
                recentCategoryActivity = recentCategoryActivity2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                recentCategoryActivity = this.f1354s;
                J7.a.v(obj);
            }
            recentCategoryActivity.f10203W = (All) obj;
            All all = recentCategoryActivity2.f10203W;
            if (all != null) {
                int i11 = recentCategoryActivity2.f10206Z;
                Integer totalPages = all.getTotalPages();
                p210v8.i.c(totalPages);
                if (i11 < totalPages.intValue()) {
                    Ca.b bVar = recentCategoryActivity2.f10204X;
                    if (bVar == null) {
                        p210v8.i.n("adapter");
                        throw null;
                    }
                    bVar.m(all.getResult());
                } else {
                    Ca.b bVar2 = recentCategoryActivity2.f10204X;
                    if (bVar2 == null) {
                        p210v8.i.n("adapter");
                        throw null;
                    }
                    bVar2.f1022k = false;
                    int iA = bVar2.a();
                    bVar2.f1026d = bVar2.f1031i.size();
                    bVar2.a.c(iA, 1, null);
                }
            }
        } catch (HttpException | Exception unused) {
        }
        return p076h8.m.a;
    }
}
