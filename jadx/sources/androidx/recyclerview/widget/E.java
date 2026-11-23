package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class E extends u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6881g;

    @Override // androidx.recyclerview.widget.u
    public final boolean a(RecyclerView.a aVar, RecyclerView.a aVar2, t tVar, t tVar2) {
        int i10;
        int i11;
        int i12 = tVar.a;
        int i13 = tVar.f7115b;
        if (aVar2.q()) {
            int i14 = tVar.a;
            i11 = tVar.f7115b;
            i10 = i14;
        } else {
            i10 = tVar2.a;
            i11 = tVar2.f7115b;
        }
        l lVar = (l) this;
        if (aVar == aVar2) {
            return lVar.g(aVar, i12, i13, i10, i11);
        }
        View view = aVar.f7003s;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        lVar.l(aVar);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        lVar.l(aVar2);
        float f10 = -((int) ((i10 - i12) - translationX));
        View view2 = aVar2.f7003s;
        view2.setTranslationX(f10);
        view2.setTranslationY(-((int) ((i11 - i13) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = lVar.f7089k;
        j jVar = new j();
        jVar.a = aVar;
        jVar.f7077b = aVar2;
        jVar.f7078c = i12;
        jVar.f7079d = i13;
        jVar.f7080e = i10;
        jVar.f7081f = i11;
        arrayList.add(jVar);
        return true;
    }

    public abstract boolean g(RecyclerView.a aVar, int i10, int i11, int i12, int i13);
}
