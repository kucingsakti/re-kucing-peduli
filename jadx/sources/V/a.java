package V;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f5063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5064c;

    public a(int i10, j jVar, int i11) {
        this.a = i10;
        this.f5063b = jVar;
        this.f5064c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.f5063b.a.performAction(this.f5064c, bundle);
    }
}
