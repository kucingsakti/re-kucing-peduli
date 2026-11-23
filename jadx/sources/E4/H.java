package E4;

import N9.InterfaceC0341y;
import com.kcstream.cing.activity.SearchByGenreActivity;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1367s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SearchByGenreActivity f1368t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(SearchByGenreActivity searchByGenreActivity, p123m8.d dVar) {
        super(2, dVar);
        this.f1368t = searchByGenreActivity;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new H(this.f1368t, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1367s;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return obj;
        }
        J7.a.v(obj);
        SearchByGenreActivity searchByGenreActivity = this.f1368t;
        List<Integer> list = searchByGenreActivity.f10220X;
        if (list == null) {
            p210v8.i.n("term");
            throw null;
        }
        this.f1367s = 1;
        Object objF = searchByGenreActivity.x().f(list, this);
        return objF == aVar ? aVar : objF;
    }
}
