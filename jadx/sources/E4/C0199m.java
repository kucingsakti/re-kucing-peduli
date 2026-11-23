package E4;

import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kcstream.cing.activity.CommentsActivity;
import com.kcstream.cing.model.DisqusComments;
import com.kcstream.cing.model.DisqusCommentsResult;
import java.util.List;

/* JADX INFO: renamed from: E4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0199m extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CommentsActivity f1420s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1421t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f1422u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ CommentsActivity f1423v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f1424w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0199m(CommentsActivity commentsActivity, String str, p123m8.d dVar) {
        super(2, dVar);
        this.f1423v = commentsActivity;
        this.f1424w = str;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        C0199m c0199m = new C0199m(this.f1423v, this.f1424w, dVar);
        c0199m.f1422u = obj;
        return c0199m;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((C0199m) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        CommentsActivity commentsActivity;
        p076h8.m mVar;
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1421t;
        p076h8.m mVar2 = p076h8.m.a;
        CommentsActivity commentsActivity2 = this.f1423v;
        try {
            if (i10 == 0) {
                J7.a.v(obj);
                InterfaceC0341y interfaceC0341y = (InterfaceC0341y) this.f1422u;
                U9.c cVar = N9.I.f3415c;
                C0198l c0198l = new C0198l(commentsActivity2, this.f1424w, null);
                this.f1422u = interfaceC0341y;
                this.f1420s = commentsActivity2;
                this.f1421t = 1;
                obj = AbstractC0342z.w(cVar, c0198l, this);
                if (obj == aVar) {
                    return aVar;
                }
                commentsActivity = commentsActivity2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                commentsActivity = this.f1420s;
                J7.a.v(obj);
            }
            commentsActivity.f10181W = (DisqusComments) obj;
            DisqusComments disqusComments = commentsActivity2.f10181W;
            if (disqusComments != null) {
                List result = disqusComments.getResult();
                p210v8.i.g(result, "items");
                if (!p086i8.C.q(result)) {
                    result = p086i8.k.t0(result);
                }
                p188t1.G g8 = new p188t1.G(new Ca.c(p210v8.x.b(result)));
                p210v8.v vVar = p210v8.u.a;
                g8.x(vVar.b(DisqusCommentsResult.class), vVar.b(G4.d.class));
                Fa.e eVar = commentsActivity2.f10180V;
                if (eVar == null) {
                    p210v8.i.n("binding");
                    throw null;
                }
                g8.r((RecyclerView) eVar.f1662w);
                Fa.e eVar2 = commentsActivity2.f10180V;
                if (eVar2 == null) {
                    p210v8.i.n("binding");
                    throw null;
                }
                ((ProgressBar) eVar2.f1660u).setVisibility(8);
                Fa.e eVar3 = commentsActivity2.f10180V;
                if (eVar3 == null) {
                    p210v8.i.n("binding");
                    throw null;
                }
                ((RelativeLayout) eVar3.f1661v).setVisibility(8);
                mVar = mVar2;
            } else {
                mVar = null;
            }
            if (mVar == null) {
                Fa.e eVar4 = commentsActivity2.f10180V;
                if (eVar4 != null) {
                    ((RelativeLayout) eVar4.f1661v).setVisibility(0);
                    return mVar2;
                }
                p210v8.i.n("binding");
                throw null;
            }
        } catch (Exception unused) {
        }
        return mVar2;
    }
}
