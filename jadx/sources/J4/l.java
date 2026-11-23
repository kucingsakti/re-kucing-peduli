package J4;

import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kcstream.cing.fragment.TabsIndexFragment;
import com.kcstream.cing.model.GetList;
import com.kcstream.cing.model.GetListResult;
import java.util.List;
import p086i8.C;
import p188t1.G;
import p210v8.u;
import p210v8.v;
import p210v8.x;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TabsIndexFragment f2424s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2425t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f2426u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TabsIndexFragment f2427v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TabsIndexFragment tabsIndexFragment, p123m8.d dVar) {
        super(2, dVar);
        this.f2427v = tabsIndexFragment;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        l lVar = new l(this.f2427v, dVar);
        lVar.f2426u = obj;
        return lVar;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        TabsIndexFragment tabsIndexFragment;
        List result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f2425t;
        p076h8.m mVar = p076h8.m.a;
        p076h8.m mVar2 = null;
        TabsIndexFragment tabsIndexFragment2 = this.f2427v;
        try {
            if (i10 == 0) {
                J7.a.v(obj);
                InterfaceC0341y interfaceC0341y = (InterfaceC0341y) this.f2426u;
                U9.c cVar = I.f3415c;
                k kVar = new k(tabsIndexFragment2, null);
                this.f2426u = interfaceC0341y;
                this.f2424s = tabsIndexFragment2;
                this.f2425t = 1;
                obj = AbstractC0342z.w(cVar, kVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                tabsIndexFragment = tabsIndexFragment2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tabsIndexFragment = this.f2424s;
                J7.a.v(obj);
            }
            tabsIndexFragment.f10256w0 = (GetList) obj;
            GetList getList = tabsIndexFragment2.f10256w0;
            if (getList != null && (result = getList.getResult()) != null) {
                Fa.e eVar = tabsIndexFragment2.f10255v0;
                p210v8.i.c(eVar);
                RecyclerView recyclerView = (RecyclerView) eVar.f1661v;
                if (!C.q(result)) {
                    result = p086i8.k.t0(result);
                }
                G g8 = new G(new Ca.c(x.b(result)));
                v vVar = u.a;
                g8.x(vVar.b(GetListResult.class), vVar.b(G4.k.class));
                g8.f14978s = C3.b.B(recyclerView, tabsIndexFragment2.X());
                g8.r(recyclerView);
                recyclerView.setVisibility(0);
                Fa.e eVar2 = tabsIndexFragment2.f10255v0;
                p210v8.i.c(eVar2);
                ((ProgressBar) eVar2.f1660u).setVisibility(8);
                Fa.e eVar3 = tabsIndexFragment2.f10255v0;
                p210v8.i.c(eVar3);
                ((RelativeLayout) eVar3.f1662w).setVisibility(8);
                mVar2 = mVar;
            }
            if (mVar2 == null) {
                Fa.e eVar4 = tabsIndexFragment2.f10255v0;
                p210v8.i.c(eVar4);
                ((RecyclerView) eVar4.f1661v).setVisibility(8);
                Fa.e eVar5 = tabsIndexFragment2.f10255v0;
                p210v8.i.c(eVar5);
                ((ProgressBar) eVar5.f1660u).setVisibility(8);
                Fa.e eVar6 = tabsIndexFragment2.f10255v0;
                p210v8.i.c(eVar6);
                ((RelativeLayout) eVar6.f1662w).setVisibility(0);
            }
        } catch (HttpException unused) {
        }
        return mVar;
    }
}
