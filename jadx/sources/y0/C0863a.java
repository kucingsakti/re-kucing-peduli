package y0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* JADX INFO: renamed from: y0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0863a extends x {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Intent f15898C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f15899D;

    public static String n(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        p210v8.i.e(packageName, "context.packageName");
        return L9.n.G(str, "${applicationId}", packageName);
    }

    @Override // y0.x
    public final boolean equals(Object obj) {
        boolean zFilterEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0863a) && super.equals(obj)) {
            Intent intent = this.f15898C;
            if (intent != null) {
                zFilterEquals = intent.filterEquals(((C0863a) obj).f15898C);
            } else {
                zFilterEquals = ((C0863a) obj).f15898C == null;
            }
            if (zFilterEquals && p210v8.i.a(this.f15899D, ((C0863a) obj).f15899D)) {
                return true;
            }
        }
        return false;
    }

    @Override // y0.x
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Intent intent = this.f15898C;
        int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.f15899D;
        return iFilterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // y0.x
    public final void m(Context context, AttributeSet attributeSet) {
        super.m(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, Q.a);
        p210v8.i.e(typedArrayObtainAttributes, "context.resources.obtain…leable.ActivityNavigator)");
        String strN = n(context, typedArrayObtainAttributes.getString(4));
        if (this.f15898C == null) {
            this.f15898C = new Intent();
        }
        Intent intent = this.f15898C;
        p210v8.i.c(intent);
        intent.setPackage(strN);
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.f15898C == null) {
                this.f15898C = new Intent();
            }
            Intent intent2 = this.f15898C;
            p210v8.i.c(intent2);
            intent2.setComponent(componentName);
        }
        String string2 = typedArrayObtainAttributes.getString(1);
        if (this.f15898C == null) {
            this.f15898C = new Intent();
        }
        Intent intent3 = this.f15898C;
        p210v8.i.c(intent3);
        intent3.setAction(string2);
        String strN2 = n(context, typedArrayObtainAttributes.getString(2));
        if (strN2 != null) {
            Uri uri = Uri.parse(strN2);
            if (this.f15898C == null) {
                this.f15898C = new Intent();
            }
            Intent intent4 = this.f15898C;
            p210v8.i.c(intent4);
            intent4.setData(uri);
        }
        this.f15899D = n(context, typedArrayObtainAttributes.getString(3));
        typedArrayObtainAttributes.recycle();
    }

    @Override // y0.x
    public final String toString() {
        Intent intent = this.f15898C;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.f15898C;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        String string = sb.toString();
        p210v8.i.e(string, "sb.toString()");
        return string;
    }
}
