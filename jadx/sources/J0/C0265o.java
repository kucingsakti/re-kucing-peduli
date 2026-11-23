package J0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: J0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0265o extends AbstractC0266p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0265o(androidx.recyclerview.widget.w wVar, int i10) {
        super(wVar);
        this.f2346d = i10;
    }

    @Override // J0.AbstractC0266p
    public final int b(View view) {
        switch (this.f2346d) {
            case 0:
                androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) view.getLayoutParams();
                ((androidx.recyclerview.widget.w) this.f2347b).getClass();
                return androidx.recyclerview.widget.w.E(view) + ((ViewGroup.MarginLayoutParams) xVar).rightMargin;
            default:
                androidx.recyclerview.widget.x xVar2 = (androidx.recyclerview.widget.x) view.getLayoutParams();
                ((androidx.recyclerview.widget.w) this.f2347b).getClass();
                return androidx.recyclerview.widget.w.z(view) + ((ViewGroup.MarginLayoutParams) xVar2).bottomMargin;
        }
    }

    @Override // J0.AbstractC0266p
    public final int c(View view) {
        switch (this.f2346d) {
            case 0:
                androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) view.getLayoutParams();
                ((androidx.recyclerview.widget.w) this.f2347b).getClass();
                return androidx.recyclerview.widget.w.D(view) + ((ViewGroup.MarginLayoutParams) xVar).leftMargin + ((ViewGroup.MarginLayoutParams) xVar).rightMargin;
            default:
                androidx.recyclerview.widget.x xVar2 = (androidx.recyclerview.widget.x) view.getLayoutParams();
                ((androidx.recyclerview.widget.w) this.f2347b).getClass();
                return androidx.recyclerview.widget.w.C(view) + ((ViewGroup.MarginLayoutParams) xVar2).topMargin + ((ViewGroup.MarginLayoutParams) xVar2).bottomMargin;
        }
    }

    @Override // J0.AbstractC0266p
    public final int d(View view) {
        switch (this.f2346d) {
            case 0:
                androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) view.getLayoutParams();
                ((androidx.recyclerview.widget.w) this.f2347b).getClass();
                return androidx.recyclerview.widget.w.C(view) + ((ViewGroup.MarginLayoutParams) xVar).topMargin + ((ViewGroup.MarginLayoutParams) xVar).bottomMargin;
            default:
                androidx.recyclerview.widget.x xVar2 = (androidx.recyclerview.widget.x) view.getLayoutParams();
                ((androidx.recyclerview.widget.w) this.f2347b).getClass();
                return androidx.recyclerview.widget.w.D(view) + ((ViewGroup.MarginLayoutParams) xVar2).leftMargin + ((ViewGroup.MarginLayoutParams) xVar2).rightMargin;
        }
    }

    @Override // J0.AbstractC0266p
    public final int e(View view) {
        switch (this.f2346d) {
            case 0:
                androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) view.getLayoutParams();
                ((androidx.recyclerview.widget.w) this.f2347b).getClass();
                return androidx.recyclerview.widget.w.B(view) - ((ViewGroup.MarginLayoutParams) xVar).leftMargin;
            default:
                androidx.recyclerview.widget.x xVar2 = (androidx.recyclerview.widget.x) view.getLayoutParams();
                ((androidx.recyclerview.widget.w) this.f2347b).getClass();
                return androidx.recyclerview.widget.w.F(view) - ((ViewGroup.MarginLayoutParams) xVar2).topMargin;
        }
    }

    @Override // J0.AbstractC0266p
    public final int f() {
        switch (this.f2346d) {
            case 0:
                return ((androidx.recyclerview.widget.w) this.f2347b).f7133o;
            default:
                return ((androidx.recyclerview.widget.w) this.f2347b).f7134p;
        }
    }

    @Override // J0.AbstractC0266p
    public final int g() {
        switch (this.f2346d) {
            case 0:
                androidx.recyclerview.widget.w wVar = (androidx.recyclerview.widget.w) this.f2347b;
                return wVar.f7133o - wVar.K();
            default:
                androidx.recyclerview.widget.w wVar2 = (androidx.recyclerview.widget.w) this.f2347b;
                return wVar2.f7134p - wVar2.I();
        }
    }

    @Override // J0.AbstractC0266p
    public final int h() {
        switch (this.f2346d) {
            case 0:
                return ((androidx.recyclerview.widget.w) this.f2347b).K();
            default:
                return ((androidx.recyclerview.widget.w) this.f2347b).I();
        }
    }

    @Override // J0.AbstractC0266p
    public final int i() {
        switch (this.f2346d) {
            case 0:
                return ((androidx.recyclerview.widget.w) this.f2347b).f7131m;
            default:
                return ((androidx.recyclerview.widget.w) this.f2347b).f7132n;
        }
    }

    @Override // J0.AbstractC0266p
    public final int j() {
        switch (this.f2346d) {
            case 0:
                return ((androidx.recyclerview.widget.w) this.f2347b).f7132n;
            default:
                return ((androidx.recyclerview.widget.w) this.f2347b).f7131m;
        }
    }

    @Override // J0.AbstractC0266p
    public final int k() {
        switch (this.f2346d) {
            case 0:
                return ((androidx.recyclerview.widget.w) this.f2347b).J();
            default:
                return ((androidx.recyclerview.widget.w) this.f2347b).L();
        }
    }

    @Override // J0.AbstractC0266p
    public final int l() {
        switch (this.f2346d) {
            case 0:
                androidx.recyclerview.widget.w wVar = (androidx.recyclerview.widget.w) this.f2347b;
                return (wVar.f7133o - wVar.J()) - wVar.K();
            default:
                androidx.recyclerview.widget.w wVar2 = (androidx.recyclerview.widget.w) this.f2347b;
                return (wVar2.f7134p - wVar2.L()) - wVar2.I();
        }
    }

    @Override // J0.AbstractC0266p
    public final int n(View view) {
        switch (this.f2346d) {
            case 0:
                androidx.recyclerview.widget.w wVar = (androidx.recyclerview.widget.w) this.f2347b;
                Rect rect = (Rect) this.f2348c;
                wVar.P(rect, view);
                return rect.right;
            default:
                androidx.recyclerview.widget.w wVar2 = (androidx.recyclerview.widget.w) this.f2347b;
                Rect rect2 = (Rect) this.f2348c;
                wVar2.P(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // J0.AbstractC0266p
    public final int o(View view) {
        switch (this.f2346d) {
            case 0:
                androidx.recyclerview.widget.w wVar = (androidx.recyclerview.widget.w) this.f2347b;
                Rect rect = (Rect) this.f2348c;
                wVar.P(rect, view);
                return rect.left;
            default:
                androidx.recyclerview.widget.w wVar2 = (androidx.recyclerview.widget.w) this.f2347b;
                Rect rect2 = (Rect) this.f2348c;
                wVar2.P(rect2, view);
                return rect2.top;
        }
    }

    @Override // J0.AbstractC0266p
    public final void p(int i10) {
        switch (this.f2346d) {
            case 0:
                ((androidx.recyclerview.widget.w) this.f2347b).T(i10);
                break;
            default:
                ((androidx.recyclerview.widget.w) this.f2347b).U(i10);
                break;
        }
    }
}
