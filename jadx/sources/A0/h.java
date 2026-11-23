package A0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import y0.x;

/* JADX INFO: loaded from: classes.dex */
public final class h extends x {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f20C;

    @Override // y0.x
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof h) && super.equals(obj) && p210v8.i.a(this.f20C, ((h) obj).f20C);
    }

    @Override // y0.x
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f20C;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // y0.x
    public final void m(Context context, AttributeSet attributeSet) {
        super.m(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, t.f44b);
        p210v8.i.e(typedArrayObtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.f20C = string;
        }
        typedArrayObtainAttributes.recycle();
    }

    @Override // y0.x
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.f20C;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        String string = sb.toString();
        p210v8.i.e(string, "sb.toString()");
        return string;
    }
}
