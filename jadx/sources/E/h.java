package E;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final float a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1170e;

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.a = Float.NaN;
        this.f1167b = Float.NaN;
        this.f1168c = Float.NaN;
        this.f1169d = Float.NaN;
        this.f1170e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1170e);
                this.f1170e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f1169d = typedArrayObtainStyledAttributes.getDimension(index, this.f1169d);
            } else if (index == 2) {
                this.f1167b = typedArrayObtainStyledAttributes.getDimension(index, this.f1167b);
            } else if (index == 3) {
                this.f1168c = typedArrayObtainStyledAttributes.getDimension(index, this.f1168c);
            } else if (index == 4) {
                this.a = typedArrayObtainStyledAttributes.getDimension(index, this.a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
