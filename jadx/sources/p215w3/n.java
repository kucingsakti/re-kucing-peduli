package p215w3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import p.X;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f15595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f15597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f15598e;

    public n(p pVar, int i10, TextView textView, int i11, TextView textView2) {
        this.f15598e = pVar;
        this.a = i10;
        this.f15595b = textView;
        this.f15596c = i11;
        this.f15597d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        X x8;
        int i10 = this.a;
        p pVar = this.f15598e;
        pVar.f15612n = i10;
        pVar.f15610l = null;
        TextView textView = this.f15595b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f15596c == 1 && (x8 = pVar.f15616r) != null) {
                x8.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f15597d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f15597d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
