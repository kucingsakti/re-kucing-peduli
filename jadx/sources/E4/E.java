package E4;

import N9.InterfaceC0341y;
import com.kcstream.cing.activity.SearchActivity;

/* JADX INFO: loaded from: classes.dex */
public final class E extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1357s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SearchActivity f1358t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f1359u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(SearchActivity searchActivity, String str, p123m8.d dVar) {
        super(2, dVar);
        this.f1358t = searchActivity;
        this.f1359u = str;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new E(this.f1358t, this.f1359u, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1357s;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return obj;
        }
        J7.a.v(obj);
        SearchActivity searchActivity = this.f1358t;
        int iZ = SearchActivity.z(searchActivity);
        this.f1357s = 1;
        Object objB = searchActivity.x().b(this.f1359u, iZ, this);
        return objB == aVar ? aVar : objB;
    }
}
