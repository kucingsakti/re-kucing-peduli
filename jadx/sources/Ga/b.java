package Ga;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatButton;
import com.kcstream.cing.R;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final AppCompatButton f1809M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final ProgressBar f1810N;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(ViewGroup viewGroup, int i10, boolean z6) {
        i.g(viewGroup, "parentView");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup, false);
        i.b(viewInflate, "LayoutInflater.from(pare…          false\n        )");
        super(viewInflate);
        this.f1809M = (AppCompatButton) this.f7003s.findViewById(R.id.loadMoreButton);
        this.f1810N = (ProgressBar) this.f7003s.findViewById(R.id.progressBar);
        s(z6);
    }

    @Override // Ga.a
    public final void a(Object obj) {
        i.g(obj, "item");
    }

    public final void s(boolean z6) {
        AppCompatButton appCompatButton = this.f1809M;
        ProgressBar progressBar = this.f1810N;
        if (z6) {
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            if (appCompatButton != null) {
                appCompatButton.setVisibility(8);
                return;
            }
            return;
        }
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        if (appCompatButton != null) {
            appCompatButton.setVisibility(0);
        }
    }
}
