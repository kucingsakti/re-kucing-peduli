package androidx.constraintlayout.widget;

import E.e;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6305s;

    public Guideline(Context context) {
        super(context);
        this.f6305s = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z6) {
        this.f6305s = z6;
    }

    public void setGuidelineBegin(int i10) {
        e eVar = (e) getLayoutParams();
        if (this.f6305s && eVar.a == i10) {
            return;
        }
        eVar.a = i10;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i10) {
        e eVar = (e) getLayoutParams();
        if (this.f6305s && eVar.f1120b == i10) {
            return;
        }
        eVar.f1120b = i10;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f10) {
        e eVar = (e) getLayoutParams();
        if (this.f6305s && eVar.f1122c == f10) {
            return;
        }
        eVar.f1122c = f10;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6305s = true;
        super.setVisibility(8);
    }
}
