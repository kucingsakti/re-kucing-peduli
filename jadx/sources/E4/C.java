package E4;

import N9.InterfaceC0341y;
import android.os.Bundle;
import com.kcstream.cing.activity.RecentCategoryActivity;

/* JADX INFO: loaded from: classes.dex */
public final class C extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ RecentCategoryActivity f1353t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(RecentCategoryActivity recentCategoryActivity, p123m8.d dVar) {
        super(2, dVar);
        this.f1353t = recentCategoryActivity;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new C(this.f1353t, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1352s;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return obj;
        }
        J7.a.v(obj);
        RecentCategoryActivity recentCategoryActivity = this.f1353t;
        int i11 = recentCategoryActivity.f10206Z;
        Bundle bundle = recentCategoryActivity.f10207a0;
        String strValueOf = String.valueOf(bundle != null ? new Integer(bundle.getInt("id")) : null);
        this.f1352s = 1;
        Object objC = recentCategoryActivity.x().c(i11, strValueOf, this);
        return objC == aVar ? aVar : objC;
    }
}
