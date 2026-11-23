package E4;

import N9.InterfaceC0341y;
import android.os.Bundle;
import com.kcstream.cing.activity.SeriesActivity;

/* JADX INFO: loaded from: classes.dex */
public final class M extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1381s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SeriesActivity f1382t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(SeriesActivity seriesActivity, p123m8.d dVar) {
        super(2, dVar);
        this.f1382t = seriesActivity;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new M(this.f1382t, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1381s;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return obj;
        }
        J7.a.v(obj);
        SeriesActivity seriesActivity = this.f1382t;
        Bundle bundle = seriesActivity.f10226X;
        if (bundle == null) {
            p210v8.i.n("pushed");
            throw null;
        }
        int i11 = bundle.getInt("id");
        this.f1381s = 1;
        Object objG = seriesActivity.x().g(i11, this);
        return objG == aVar ? aVar : objG;
    }
}
