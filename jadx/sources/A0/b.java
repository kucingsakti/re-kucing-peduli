package A0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import y0.InterfaceC0866d;
import y0.x;

/* JADX INFO: loaded from: classes.dex */
public final class b extends x implements InterfaceC0866d {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f2C;

    @Override // y0.x
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof b) && super.equals(obj) && p210v8.i.a(this.f2C, ((b) obj).f2C);
    }

    @Override // y0.x
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f2C;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // y0.x
    public final void m(Context context, AttributeSet attributeSet) {
        super.m(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, t.a);
        p210v8.i.e(typedArrayObtainAttributes, "context.resources.obtain….DialogFragmentNavigator)");
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.f2C = string;
        }
        typedArrayObtainAttributes.recycle();
    }
}
