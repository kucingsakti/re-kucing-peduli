package F4;

import L9.n;
import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.kcstream.cing.activity.drawer.NewReleaseActivity;
import com.kcstream.cing.model.NewRelease;
import com.kcstream.cing.model.NewReleaseItem;
import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.nodes.k;
import p076h8.m;
import p188t1.G;
import p210v8.i;
import p210v8.u;
import p210v8.v;
import p210v8.x;
import sa.C;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public NewReleaseActivity f1503s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1504t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ NewReleaseActivity f1505u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(NewReleaseActivity newReleaseActivity, p123m8.d dVar) {
        super(2, dVar);
        this.f1505u = newReleaseActivity;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new h(this.f1505u, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        NewReleaseActivity newReleaseActivity;
        String result;
        String strD;
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1504t;
        NewReleaseActivity newReleaseActivity2 = this.f1505u;
        try {
            if (i10 == 0) {
                J7.a.v(obj);
                U9.c cVar = I.f3415c;
                g gVar = new g(newReleaseActivity2, null);
                this.f1503s = newReleaseActivity2;
                this.f1504t = 1;
                obj = AbstractC0342z.w(cVar, gVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                newReleaseActivity = newReleaseActivity2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                newReleaseActivity = this.f1503s;
                J7.a.v(obj);
            }
            newReleaseActivity.f10241W = (NewRelease) obj;
            NewRelease newRelease = newReleaseActivity2.f10241W;
            if (newRelease != null && (result = newRelease.getResult()) != null) {
                C<k> cN = o1.f.l(result).N("div[class='coming_soon']");
                ArrayList arrayList = new ArrayList(p086i8.m.H(cN, 10));
                for (k kVar : cN) {
                    String strE = kVar.N("a[class='title']").e();
                    Iterator<E> it = kVar.N("img").iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            strD = "";
                            break;
                        }
                        k kVar2 = (k) it.next();
                        if (kVar2.m("src")) {
                            strD = kVar2.d("src");
                            break;
                        }
                    }
                    String strE2 = kVar.N("span[class='release_date']").e();
                    String strE3 = kVar.N("span[class='episode']").e();
                    i.e(strE3, "text(...)");
                    arrayList.add(new NewReleaseItem(strE, strD, strE2, n.G(n.G(strE3, "(", ""), ")", "")));
                }
                if (!p086i8.C.q(arrayList)) {
                    arrayList = p086i8.k.t0(arrayList);
                }
                G g8 = new G(new Ca.c(x.b(arrayList)));
                v vVar = u.a;
                g8.x(vVar.b(NewReleaseItem.class), vVar.b(G4.c.class));
                g8.f14978s = C3.b.B((RecyclerView) newReleaseActivity2.z().f13784v, newReleaseActivity2);
                g8.r((RecyclerView) newReleaseActivity2.z().f13784v);
                ((ProgressBar) newReleaseActivity2.z().f13783u).setVisibility(8);
                ((RecyclerView) newReleaseActivity2.z().f13784v).setVisibility(0);
            }
        } catch (Exception unused) {
            ((ProgressBar) newReleaseActivity2.z().f13783u).setVisibility(8);
        }
        return m.a;
    }
}
