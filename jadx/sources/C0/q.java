package C0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class q extends J0.x {
    public Drawable a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f873c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f874d;

    public q(r rVar) {
        this.f874d = rVar;
    }

    @Override // J0.x
    public final void a(Rect rect, View view, RecyclerView recyclerView) {
        if (d(view, recyclerView)) {
            rect.bottom = this.f872b;
        }
    }

    @Override // J0.x
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (d(childAt, recyclerView)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.a.setBounds(0, height, width, this.f872b + height);
                this.a.draw(canvas);
            }
        }
    }

    public final boolean d(View view, RecyclerView recyclerView) {
        RecyclerView.a aVarL = recyclerView.L(view);
        if (!(aVarL instanceof y) || !((y) aVarL).f912Q) {
            return false;
        }
        boolean z6 = this.f873c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z6;
        }
        RecyclerView.a aVarL2 = recyclerView.L(recyclerView.getChildAt(iIndexOfChild + 1));
        return (aVarL2 instanceof y) && ((y) aVarL2).P;
    }
}
