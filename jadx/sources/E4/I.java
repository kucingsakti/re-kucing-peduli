package E4;

import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kcstream.cing.activity.SearchByGenreActivity;
import com.kcstream.cing.model.SearchByGenre;
import com.kcstream.cing.model.SearchByGenreResult;
import java.util.ArrayList;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class I extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SearchByGenreActivity f1369s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1370t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f1371u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ SearchByGenreActivity f1372v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(SearchByGenreActivity searchByGenreActivity, p123m8.d dVar) {
        super(2, dVar);
        this.f1372v = searchByGenreActivity;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        I i10 = new I(this.f1372v, dVar);
        i10.f1371u = obj;
        return i10;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        SearchByGenreActivity searchByGenreActivity;
        ArrayList result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1370t;
        p076h8.m mVar = p076h8.m.a;
        SearchByGenreActivity searchByGenreActivity2 = this.f1372v;
        p076h8.m mVar2 = null;
        try {
            if (i10 == 0) {
                J7.a.v(obj);
                InterfaceC0341y interfaceC0341y = (InterfaceC0341y) this.f1371u;
                U9.c cVar = N9.I.f3415c;
                H h10 = new H(searchByGenreActivity2, null);
                this.f1371u = interfaceC0341y;
                this.f1369s = searchByGenreActivity2;
                this.f1370t = 1;
                obj = AbstractC0342z.w(cVar, h10, this);
                if (obj == aVar) {
                    return aVar;
                }
                searchByGenreActivity = searchByGenreActivity2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                searchByGenreActivity = this.f1369s;
                J7.a.v(obj);
            }
            searchByGenreActivity.f10219W = (SearchByGenre) obj;
            SearchByGenre searchByGenre = searchByGenreActivity2.f10219W;
            if (searchByGenre != null && (result = searchByGenre.getResult()) != null) {
                if (!p086i8.C.q(result)) {
                    result = p086i8.k.t0(result);
                }
                p188t1.G g8 = new p188t1.G(new Ca.c(p210v8.x.b(result)));
                p210v8.v vVar = p210v8.u.a;
                g8.x(vVar.b(SearchByGenreResult.class), vVar.b(G4.n.class));
                g8.f14978s = C3.b.B((RecyclerView) searchByGenreActivity2.z().f14982w, searchByGenreActivity2);
                g8.r((RecyclerView) searchByGenreActivity2.z().f14982w);
                ((ProgressBar) searchByGenreActivity2.z().f14980u).setVisibility(8);
                ((RecyclerView) searchByGenreActivity2.z().f14982w).setVisibility(0);
                ((RelativeLayout) searchByGenreActivity2.z().f14981v).setVisibility(8);
                mVar2 = mVar;
            }
            if (mVar2 == null) {
                ((RelativeLayout) searchByGenreActivity2.z().f14981v).setVisibility(0);
                ((ProgressBar) searchByGenreActivity2.z().f14980u).setVisibility(8);
                return mVar;
            }
        } catch (HttpException unused) {
            ((ProgressBar) searchByGenreActivity2.z().f14980u).setVisibility(8);
        }
        return mVar;
    }
}
