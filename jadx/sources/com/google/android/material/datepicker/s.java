package com.google.android.material.datepicker;

import U.C;
import U.U;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.kcstream.cing.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s extends RecyclerView.a {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final TextView f9707M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final MaterialCalendarGridView f9708N;

    public s(LinearLayout linearLayout, boolean z6) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f9707M = textView;
        WeakHashMap weakHashMap = U.a;
        new C(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).g(textView, Boolean.TRUE);
        this.f9708N = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z6) {
            return;
        }
        textView.setVisibility(8);
    }
}
