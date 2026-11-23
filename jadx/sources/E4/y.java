package E4;

import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import android.content.SharedPreferences;
import com.kcstream.cing.activity.MainActivity;
import com.kcstream.cing.model.SearchListGenres;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class y extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MainActivity f1446s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1447t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1448u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(MainActivity mainActivity, p123m8.d dVar) {
        super(2, dVar);
        this.f1448u = mainActivity;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new y(this.f1448u, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        MainActivity mainActivity;
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1447t;
        MainActivity mainActivity2 = this.f1448u;
        try {
            if (i10 == 0) {
                J7.a.v(obj);
                U9.c cVar = N9.I.f3415c;
                x xVar = new x(mainActivity2, null);
                this.f1446s = mainActivity2;
                this.f1447t = 1;
                obj = AbstractC0342z.w(cVar, xVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                mainActivity = mainActivity2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mainActivity = this.f1446s;
                J7.a.v(obj);
            }
            mainActivity.f10194W = (SearchListGenres) obj;
            SearchListGenres searchListGenres = mainActivity2.f10194W;
            if (searchListGenres == null) {
                p210v8.i.n("dataGenre");
                throw null;
            }
            SharedPreferences.Editor editorEdit = mainActivity2.y().edit();
            editorEdit.putString("genreData", new com.google.gson.i().f(searchListGenres.getData()));
            editorEdit.apply();
            return p076h8.m.a;
        } catch (HttpException unused) {
            Ha.a.a.getClass();
            za.c.h(new Object[0]);
        }
    }
}
