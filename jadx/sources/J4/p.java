package J4;

import C8.u;
import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.kcstream.cing.fragment.TabsRecentFragment;
import com.kcstream.cing.model.Recent;
import com.kcstream.cing.model.RecentPost;
import com.smarteist.autoimageslider.SliderView;
import java.util.LinkedList;
import java.util.List;
import p086i8.C;
import p188t1.G;
import p210v8.v;
import p210v8.x;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class p extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TabsRecentFragment f2434s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2435t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f2436u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TabsRecentFragment f2437v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(TabsRecentFragment tabsRecentFragment, p123m8.d dVar) {
        super(2, dVar);
        this.f2437v = tabsRecentFragment;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        p pVar = new p(this.f2437v, dVar);
        pVar.f2436u = obj;
        return pVar;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        TabsRecentFragment tabsRecentFragment;
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f2435t;
        p076h8.m mVar = p076h8.m.a;
        p076h8.m mVar2 = null;
        TabsRecentFragment tabsRecentFragment2 = this.f2437v;
        try {
            if (i10 == 0) {
                J7.a.v(obj);
                InterfaceC0341y interfaceC0341y = (InterfaceC0341y) this.f2436u;
                U9.c cVar = I.f3415c;
                o oVar = new o(tabsRecentFragment2, null);
                this.f2436u = interfaceC0341y;
                this.f2434s = tabsRecentFragment2;
                this.f2435t = 1;
                obj = AbstractC0342z.w(cVar, oVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                tabsRecentFragment = tabsRecentFragment2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tabsRecentFragment = this.f2434s;
                J7.a.v(obj);
            }
            tabsRecentFragment.f10262w0 = (Recent) obj;
            Recent recent = tabsRecentFragment2.f10262w0;
            p081i3.b bVar = tabsRecentFragment2.f10263x0;
            if (recent != null) {
                G4.j jVar = new G4.j();
                jVar.f3402d = new LinkedList();
                u[] uVarArr = TabsRecentFragment.f10260y0;
                u uVar = uVarArr[0];
                bVar.getClass();
                p210v8.i.f(uVar, "property");
                bVar.f12212t = jVar;
                List carousel = recent.getCarousel();
                G4.j jVar2 = (G4.j) bVar.y(uVarArr[0], tabsRecentFragment2);
                p210v8.i.f(carousel, "datas");
                jVar2.f1698e = carousel;
                jVar2.i();
                SliderView sliderView = (SliderView) tabsRecentFragment2.g0().f1660u;
                sliderView.setSliderAdapter((G4.j) bVar.y(uVarArr[0], tabsRecentFragment2));
                sliderView.setIndicatorAnimation(T6.f.f4685w);
                sliderView.setSliderTransformAnimation(N6.b.f3338s);
                List posts = recent.getPosts();
                p210v8.i.g(posts, "items");
                if (!C.q(posts)) {
                    posts = p086i8.k.t0(posts);
                }
                G g8 = new G(new Ca.c(x.b(posts)));
                v vVar = p210v8.u.a;
                g8.x(vVar.b(RecentPost.class), vVar.b(G4.g.class));
                g8.r((RecyclerView) tabsRecentFragment2.g0().f1663x);
                ((SwipeRefreshLayout) tabsRecentFragment2.g0().f1662w).setVisibility(0);
                ((SwipeRefreshLayout) tabsRecentFragment2.g0().f1662w).setRefreshing(false);
                ((NestedScrollView) tabsRecentFragment2.g0().f1661v).setVisibility(0);
                mVar2 = mVar;
            }
            if (mVar2 == null) {
                ((SwipeRefreshLayout) tabsRecentFragment2.g0().f1662w).setRefreshing(false);
                return mVar;
            }
        } catch (HttpException unused) {
            ((SwipeRefreshLayout) tabsRecentFragment2.g0().f1662w).setRefreshing(false);
        }
        return mVar;
    }
}
