package androidx.preference;

import C0.h;
import C0.i;
import C0.j;
import C0.k;
import C0.l;
import C0.r;
import C0.t;
import C0.v;
import C0.y;
import C0.z;
import U.U;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.kcstream.cing.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p156q0.C0742a;
import p156q0.F;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f6803A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f6804B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Drawable f6805C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final String f6806D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Intent f6807E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final String f6808F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Bundle f6809G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f6810H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f6811I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f6812J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final String f6813K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Object f6814L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f6815M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f6816N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f6817O;
    public final boolean P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final boolean f6818Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final boolean f6819R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final boolean f6820S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final boolean f6821T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final boolean f6822U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final boolean f6823V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f6824W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final int f6825X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public t f6826Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ArrayList f6827Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public PreferenceGroup f6828a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f6829b0;
    public k c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public l f6830d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final h f6831e0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f6832s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public v f6833t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f6834u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6835v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i f6836w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j f6837x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6838y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f6839z;

    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new d();

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }
    }

    public Preference(Context context, AttributeSet attributeSet, int i10) {
        this.f6838y = Integer.MAX_VALUE;
        this.f6810H = true;
        this.f6811I = true;
        this.f6812J = true;
        this.f6815M = true;
        this.f6816N = true;
        this.f6817O = true;
        this.P = true;
        this.f6818Q = true;
        this.f6820S = true;
        this.f6823V = true;
        this.f6824W = R.layout.preference;
        this.f6831e0 = new h(this);
        this.f6832s = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.f918g, i10, 0);
        this.f6804B = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.f6806D = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.f6839z = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.f6803A = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f6838y = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.f6808F = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.f6824W = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.f6825X = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f6810H = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.f6811I = z6;
        this.f6812J = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.f6813K = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.P = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z6));
        this.f6818Q = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z6));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f6814L = t(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f6814L = t(typedArrayObtainStyledAttributes, 11);
        }
        this.f6823V = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.f6819R = zHasValue;
        if (zHasValue) {
            this.f6820S = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.f6821T = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.f6817O = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.f6822U = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void z(View view, boolean z6) {
        view.setEnabled(z6);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                z(viewGroup.getChildAt(childCount), z6);
            }
        }
    }

    public boolean A() {
        return !l();
    }

    public final boolean B() {
        return (this.f6833t == null || !this.f6812J || TextUtils.isEmpty(this.f6806D)) ? false : true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i10 = this.f6838y;
        int i11 = preference2.f6838y;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f6839z;
        CharSequence charSequence2 = preference2.f6839z;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.f6839z.toString());
    }

    public final boolean f(Serializable serializable) {
        i iVar = this.f6836w;
        if (iVar == null) {
            return true;
        }
        iVar.a(this, serializable);
        return true;
    }

    public void g(Bundle bundle) {
        Parcelable parcelable;
        if (TextUtils.isEmpty(this.f6806D) || (parcelable = bundle.getParcelable(this.f6806D)) == null) {
            return;
        }
        this.f6829b0 = false;
        u(parcelable);
        if (!this.f6829b0) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void h(Bundle bundle) {
        if (TextUtils.isEmpty(this.f6806D)) {
            return;
        }
        this.f6829b0 = false;
        Parcelable parcelableV = v();
        if (!this.f6829b0) {
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
        if (parcelableV != null) {
            bundle.putParcelable(this.f6806D, parcelableV);
        }
    }

    public long i() {
        return this.f6834u;
    }

    public final String j(String str) {
        return !B() ? str : this.f6833t.d().getString(this.f6806D, str);
    }

    public CharSequence k() {
        l lVar = this.f6830d0;
        return lVar != null ? lVar.b(this) : this.f6803A;
    }

    public boolean l() {
        return this.f6810H && this.f6815M && this.f6816N;
    }

    public void m() {
        int iIndexOf;
        t tVar = this.f6826Y;
        if (tVar == null || (iIndexOf = tVar.f887f.indexOf(this)) == -1) {
            return;
        }
        tVar.a.c(iIndexOf, 1, this);
    }

    public void n(boolean z6) {
        ArrayList arrayList = this.f6827Z;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Preference preference = (Preference) arrayList.get(i10);
            if (preference.f6815M == z6) {
                preference.f6815M = !z6;
                preference.n(preference.A());
                preference.m();
            }
        }
    }

    public void o() {
        PreferenceScreen preferenceScreen;
        String str = this.f6813K;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        v vVar = this.f6833t;
        Preference preferenceC = null;
        if (vVar != null && (preferenceScreen = vVar.f901g) != null) {
            preferenceC = preferenceScreen.C(str);
        }
        if (preferenceC == null) {
            StringBuilder sbM = AbstractC0487g.m("Dependency \"", str, "\" not found for preference \"");
            sbM.append(this.f6806D);
            sbM.append("\" (title: \"");
            sbM.append((Object) this.f6839z);
            sbM.append("\"");
            throw new IllegalStateException(sbM.toString());
        }
        if (preferenceC.f6827Z == null) {
            preferenceC.f6827Z = new ArrayList();
        }
        preferenceC.f6827Z.add(this);
        boolean zA = preferenceC.A();
        if (this.f6815M == zA) {
            this.f6815M = !zA;
            n(A());
            m();
        }
    }

    public final void p(v vVar) {
        this.f6833t = vVar;
        if (!this.f6835v) {
            this.f6834u = vVar.c();
        }
        if (B()) {
            v vVar2 = this.f6833t;
            if ((vVar2 != null ? vVar2.d() : null).contains(this.f6806D)) {
                w(null);
                return;
            }
        }
        Object obj = this.f6814L;
        if (obj != null) {
            w(obj);
        }
    }

    public void q(y yVar) {
        Integer numValueOf;
        View view = yVar.f7003s;
        view.setOnClickListener(this.f6831e0);
        view.setId(0);
        TextView textView = (TextView) yVar.s(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceK = k();
            if (TextUtils.isEmpty(charSequenceK)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceK);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) yVar.s(android.R.id.title);
        boolean z6 = this.f6811I;
        if (textView2 != null) {
            CharSequence charSequence = this.f6839z;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.f6819R) {
                    textView2.setSingleLine(this.f6820S);
                }
                if (!z6 && l() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) yVar.s(android.R.id.icon);
        boolean z10 = this.f6821T;
        if (imageView != null) {
            int i10 = this.f6804B;
            if (i10 != 0 || this.f6805C != null) {
                if (this.f6805C == null) {
                    this.f6805C = p068ga.l.g(this.f6832s, i10);
                }
                Drawable drawable = this.f6805C;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f6805C != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z10 ? 4 : 8);
            }
        }
        View viewS = yVar.s(R.id.icon_frame);
        if (viewS == null) {
            viewS = yVar.s(android.R.id.icon_frame);
        }
        if (viewS != null) {
            if (this.f6805C != null) {
                viewS.setVisibility(0);
            } else {
                viewS.setVisibility(z10 ? 4 : 8);
            }
        }
        if (this.f6823V) {
            z(view, l());
        } else {
            z(view, true);
        }
        view.setFocusable(z6);
        view.setClickable(z6);
        yVar.P = this.P;
        yVar.f912Q = this.f6818Q;
        boolean z11 = this.f6822U;
        if (z11 && this.c0 == null) {
            this.c0 = new k(this);
        }
        view.setOnCreateContextMenuListener(z11 ? this.c0 : null);
        view.setLongClickable(z11);
        if (!z11 || z6) {
            return;
        }
        WeakHashMap weakHashMap = U.a;
        view.setBackground(null);
    }

    public void r() {
    }

    public void s() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.f6813K;
        if (str != null) {
            v vVar = this.f6833t;
            Preference preferenceC = null;
            if (vVar != null && (preferenceScreen = vVar.f901g) != null) {
                preferenceC = preferenceScreen.C(str);
            }
            if (preferenceC == null || (arrayList = preferenceC.f6827Z) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public Object t(TypedArray typedArray, int i10) {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f6839z;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceK = k();
        if (!TextUtils.isEmpty(charSequenceK)) {
            sb.append(charSequenceK);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public void u(Parcelable parcelable) {
        this.f6829b0 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable v() {
        this.f6829b0 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void w(Object obj) {
    }

    public void x(View view) {
        r rVar;
        String str;
        if (l() && this.f6811I) {
            r();
            j jVar = this.f6837x;
            if (jVar != null) {
                jVar.x(this);
                return;
            }
            v vVar = this.f6833t;
            if (vVar == null || (rVar = vVar.f902h) == null || (str = this.f6808F) == null) {
                Intent intent = this.f6807E;
                if (intent != null) {
                    this.f6832s.startActivity(intent);
                    return;
                }
                return;
            }
            for (androidx.fragment.app.b bVar = rVar; bVar != null; bVar = bVar.f6624Q) {
            }
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            androidx.fragment.app.e eVarP = rVar.p();
            if (this.f6809G == null) {
                this.f6809G = new Bundle();
            }
            Bundle bundle = this.f6809G;
            F fI = eVarP.I();
            rVar.W().getClassLoader();
            androidx.fragment.app.b bVarA = fI.a(str);
            bVarA.b0(bundle);
            bVarA.e0(rVar);
            C0742a c0742a = new C0742a(eVarP);
            c0742a.m(((View) rVar.Y().getParent()).getId(), bVarA, null);
            c0742a.c(null);
            c0742a.f();
        }
    }

    public final void y(String str) {
        if (B() && !TextUtils.equals(str, j(null))) {
            SharedPreferences.Editor editorB = this.f6833t.b();
            editorB.putString(this.f6806D, str);
            if (this.f6833t.f899e) {
                return;
            }
            editorB.apply();
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, K.b.b(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
