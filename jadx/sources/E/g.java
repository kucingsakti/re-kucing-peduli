package E;

import U.B0;
import U.InterfaceC0432s;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g implements InterfaceC0432s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1164s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1165t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f1166u;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f1166u = new ArrayList();
        this.f1165t = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f1283h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f1164s = typedArrayObtainStyledAttributes.getResourceId(index, this.f1164s);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1165t);
                this.f1165t = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static double b(g gVar) {
        double d3;
        int i10 = gVar.f1165t;
        int i11 = gVar.f1164s;
        int i12 = i10 - i11;
        int i13 = i12 + 1;
        int i14 = 1;
        if (i13 < 1) {
            gVar.getClass();
            throw new IllegalArgumentException("inclusionCount cannot be less than 1.");
        }
        if (i13 > (i10 - i11) + 1) {
            throw new IllegalArgumentException("inclusionCount cannot be greater than the inserted value count.");
        }
        double d8 = 0.0d;
        if (1 <= i13) {
            d3 = 0.0d;
            while (true) {
                d3 += (double) i14;
                if (i14 == i13) {
                    break;
                }
                i14++;
            }
        } else {
            d3 = 0.0d;
        }
        int i15 = gVar.f1165t;
        int i16 = i15 - i12;
        if (i15 >= i16) {
            while (true) {
                d8 += (((double) i13) / d3) * ((double[]) gVar.f1166u)[i15];
                i13--;
                if (i15 == i16) {
                    break;
                }
                i15--;
            }
        }
        return d8;
    }

    @Override // U.InterfaceC0432s
    public B0 E(View view, B0 b3) {
        int i10 = b3.a.f(7).f2712b;
        View view2 = (View) this.f1166u;
        int i11 = this.f1164s;
        if (i11 >= 0) {
            view2.getLayoutParams().height = i11 + i10;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f1165t + i10, view2.getPaddingRight(), view2.getPaddingBottom());
        return b3;
    }

    public void a(double d3) {
        int i10 = this.f1165t;
        int i11 = this.f1164s;
        if ((i10 - i11) + 1 == 5) {
            this.f1164s = i11 + 1;
        }
        double[] dArr = (double[]) this.f1166u;
        if (i10 == dArr.length - 1) {
            double[] dArr2 = new double[dArr.length * 2];
            int i12 = this.f1164s;
            int i13 = i10 - i12;
            System.arraycopy(dArr, i12, dArr2, 0, i13 + 1);
            this.f1166u = dArr2;
            this.f1164s = 0;
            this.f1165t = i13;
        }
        int i14 = this.f1165t + 1;
        this.f1165t = i14;
        if (i14 == 0) {
            this.f1164s = i14;
        }
        ((double[]) this.f1166u)[i14] = d3;
    }

    public g(int i10) {
        switch (i10) {
            case 5:
                this.f1166u = new double[16];
                this.f1164s = -1;
                this.f1165t = -1;
                break;
            default:
                this.f1166u = new g[256];
                this.f1164s = 0;
                this.f1165t = 0;
                break;
        }
    }
}
