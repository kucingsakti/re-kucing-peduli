package U;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends WindowInsetsAnimation$Callback {
    public final X2.j a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f4824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f4825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f4826d;

    public k0(X2.j jVar) {
        super(0);
        this.f4826d = new HashMap();
        this.a = jVar;
    }

    public final n0 a(WindowInsetsAnimation windowInsetsAnimation) {
        n0 n0Var = (n0) this.f4826d.get(windowInsetsAnimation);
        if (n0Var == null) {
            n0Var = new n0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                n0Var.a = new l0(windowInsetsAnimation);
            }
            this.f4826d.put(windowInsetsAnimation, n0Var);
        }
        return n0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        X2.j jVar = this.a;
        a(windowInsetsAnimation);
        ((View) jVar.f5410d).setTranslationY(0.0f);
        this.f4826d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        X2.j jVar = this.a;
        a(windowInsetsAnimation);
        View view = (View) jVar.f5410d;
        int[] iArr = (int[]) jVar.f5411e;
        view.getLocationOnScreen(iArr);
        jVar.a = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f4825c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f4825c = arrayList2;
            this.f4824b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationL = B6.a.l(list.get(size));
            n0 n0VarA = a(windowInsetsAnimationL);
            n0VarA.a.d(windowInsetsAnimationL.getFraction());
            this.f4825c.add(n0VarA);
        }
        X2.j jVar = this.a;
        B0 b0H = B0.h(null, windowInsets);
        jVar.f(b0H, this.f4824b);
        return b0H.g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        X2.j jVar = this.a;
        a(windowInsetsAnimation);
        L.c cVarC = L.c.c(bounds.getLowerBound());
        L.c cVarC2 = L.c.c(bounds.getUpperBound());
        View view = (View) jVar.f5410d;
        int[] iArr = (int[]) jVar.f5411e;
        view.getLocationOnScreen(iArr);
        int i10 = jVar.a - iArr[1];
        jVar.f5408b = i10;
        view.setTranslationY(i10);
        B6.a.o();
        return B6.a.j(cVarC.d(), cVarC2.d());
    }
}
