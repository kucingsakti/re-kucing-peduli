package E4;

import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kcstream.cing.activity.SearchActivity;
import com.kcstream.cing.model.Search;
import java.util.ArrayList;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class F extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SearchActivity f1360s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1361t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f1362u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ SearchActivity f1363v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f1364w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(SearchActivity searchActivity, String str, p123m8.d dVar) {
        super(2, dVar);
        this.f1363v = searchActivity;
        this.f1364w = str;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        F f10 = new F(this.f1363v, this.f1364w, dVar);
        f10.f1362u = obj;
        return f10;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        SearchActivity searchActivity;
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1361t;
        p076h8.m mVar = p076h8.m.a;
        SearchActivity searchActivity2 = this.f1363v;
        p076h8.m mVar2 = null;
        try {
            if (i10 == 0) {
                J7.a.v(obj);
                InterfaceC0341y interfaceC0341y = (InterfaceC0341y) this.f1362u;
                U9.c cVar = N9.I.f3415c;
                E e10 = new E(searchActivity2, this.f1364w, null);
                this.f1362u = interfaceC0341y;
                this.f1360s = searchActivity2;
                this.f1361t = 1;
                obj = AbstractC0342z.w(cVar, e10, this);
                if (obj == aVar) {
                    return aVar;
                }
                searchActivity = searchActivity2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                searchActivity = this.f1360s;
                J7.a.v(obj);
            }
            searchActivity.f10209W = (Search) obj;
            Search search = searchActivity2.f10209W;
            if (search != null) {
                ArrayList result = search.getResult();
                if (result == null || result.isEmpty()) {
                    ((RecyclerView) searchActivity2.A().j).setVisibility(8);
                    ((RelativeLayout) searchActivity2.A().f2070c).setVisibility(0);
                } else {
                    Integer totalPages = search.getTotalPages();
                    p210v8.i.c(totalPages);
                    C8.u uVar = SearchActivity.f0[1];
                    p081i3.b bVar = searchActivity2.f10212Z;
                    bVar.getClass();
                    p210v8.i.f(uVar, "property");
                    bVar.f12212t = totalPages;
                    Ca.b bVar2 = searchActivity2.f10216e0;
                    if (bVar2 == null) {
                        p210v8.i.n("getSearch");
                        throw null;
                    }
                    bVar2.m(search.getResult());
                    ((RecyclerView) searchActivity2.A().j).setVisibility(0);
                }
                ((ProgressBar) searchActivity2.A().f2075h).setVisibility(8);
                mVar2 = mVar;
            }
            if (mVar2 == null) {
                ((RecyclerView) searchActivity2.A().j).setVisibility(8);
                ((RelativeLayout) searchActivity2.A().f2070c).setVisibility(8);
                ((ProgressBar) searchActivity2.A().f2075h).setVisibility(8);
            }
        } catch (HttpException unused) {
        }
        return mVar;
    }
}
