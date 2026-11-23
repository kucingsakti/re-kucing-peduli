package E4;

import N9.InterfaceC0341y;
import com.kcstream.cing.activity.CommentsActivity;

/* JADX INFO: renamed from: E4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0198l extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1417s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CommentsActivity f1418t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f1419u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0198l(CommentsActivity commentsActivity, String str, p123m8.d dVar) {
        super(2, dVar);
        this.f1418t = commentsActivity;
        this.f1419u = str;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new C0198l(this.f1418t, this.f1419u, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((C0198l) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1417s;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return obj;
        }
        J7.a.v(obj);
        this.f1417s = 1;
        int i11 = CommentsActivity.f10179X;
        Object objE = this.f1418t.x().e(this.f1419u, null, this);
        return objE == aVar ? aVar : objE;
    }
}
