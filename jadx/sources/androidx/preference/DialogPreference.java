package androidx.preference;

import C0.r;
import C0.z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import com.kcstream.cing.R;
import p156q0.DialogInterfaceOnCancelListenerC0756o;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public final CharSequence f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final String f6783g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Drawable f6784h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final String f6785i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final String f6786j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final int f6787k0;

    public DialogPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.f914c, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.f0 = string;
        if (string == null) {
            this.f0 = this.f6839z;
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.f6783g0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.f6784h0 = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.f6785i0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.f6786j0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.f6787k0 = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void r() {
        DialogInterfaceOnCancelListenerC0756o gVar;
        r rVar = this.f6833t.f903i;
        if (rVar != null) {
            for (androidx.fragment.app.b bVar = rVar; bVar != null; bVar = bVar.f6624Q) {
            }
            if (rVar.p().E("androidx.preference.PreferenceFragment.DIALOG") != null) {
                return;
            }
            if (this instanceof EditTextPreference) {
                gVar = new C0.c();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", this.f6806D);
                gVar.b0(bundle);
            } else if (this instanceof ListPreference) {
                gVar = new C0.e();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", this.f6806D);
                gVar.b0(bundle2);
            } else {
                if (!(this instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                gVar = new C0.g();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", this.f6806D);
                gVar.b0(bundle3);
            }
            gVar.e0(rVar);
            gVar.n0(rVar.p(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, K.b.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
