package p;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: p.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0692a0 extends Z {
    @Override // p.Z, p.AbstractC0694b0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p.AbstractC0694b0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
