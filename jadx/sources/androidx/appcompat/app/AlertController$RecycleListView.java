package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p069h.a;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f6037s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f6038t;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f11628u);
        this.f6038t = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f6037s = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
