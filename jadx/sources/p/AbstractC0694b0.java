package p;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: p.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0694b0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C0696c0.e("getHorizontallyScrolling", textView, Boolean.FALSE)).booleanValue();
    }
}
