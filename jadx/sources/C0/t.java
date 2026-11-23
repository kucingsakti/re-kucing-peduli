package C0;

import A1.RunnableC0094c;
import U.U;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class t extends androidx.recyclerview.widget.s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PreferenceGroup f885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f888g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RunnableC0094c f890i = new RunnableC0094c(this, 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f889h = new Handler(Looper.getMainLooper());

    public t(PreferenceGroup preferenceGroup) {
        this.f885d = preferenceGroup;
        preferenceGroup.f6826Y = this;
        this.f886e = new ArrayList();
        this.f887f = new ArrayList();
        this.f888g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            l(((PreferenceScreen) preferenceGroup).f6846l0);
        } else {
            l(true);
        }
        p();
    }

    @Override // androidx.recyclerview.widget.s
    public final int a() {
        return this.f887f.size();
    }

    @Override // androidx.recyclerview.widget.s
    public final long b(int i10) {
        if (this.f7113b) {
            return o(i10).i();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.s
    public final int c(int i10) {
        s sVar = new s(o(i10));
        ArrayList arrayList = this.f888g;
        int iIndexOf = arrayList.indexOf(sVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(sVar);
        return size;
    }

    @Override // androidx.recyclerview.widget.s
    public final void e(RecyclerView.a aVar, int i10) {
        ColorStateList colorStateList;
        y yVar = (y) aVar;
        Preference preferenceO = o(i10);
        View view = yVar.f7003s;
        Drawable background = view.getBackground();
        Drawable drawable = yVar.f909M;
        if (background != drawable) {
            WeakHashMap weakHashMap = U.a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) yVar.s(R.id.title);
        if (textView != null && (colorStateList = yVar.f910N) != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        preferenceO.q(yVar);
    }

    @Override // androidx.recyclerview.widget.s
    public final RecyclerView.a f(ViewGroup viewGroup, int i10) {
        s sVar = (s) this.f888g.get(i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, z.a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = p068ga.l.g(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(sVar.a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            WeakHashMap weakHashMap = U.a;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i11 = sVar.f883b;
            if (i11 != 0) {
                layoutInflaterFrom.inflate(i11, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new y(viewInflate);
    }

    public final ArrayList m(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Preference> arrayList2 = new ArrayList();
        int size = preferenceGroup.f6840g0.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Preference preferenceD = preferenceGroup.D(i11);
            if (preferenceD.f6817O) {
                int i12 = preferenceGroup.f6844k0;
                if (i12 == Integer.MAX_VALUE || i10 < i12) {
                    arrayList.add(preferenceD);
                } else {
                    arrayList2.add(preferenceD);
                }
                if (preferenceD instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceD;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (preferenceGroup.f6844k0 != Integer.MAX_VALUE && preferenceGroup2.f6844k0 != Integer.MAX_VALUE) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : m(preferenceGroup2)) {
                            int i13 = preferenceGroup.f6844k0;
                            if (i13 == Integer.MAX_VALUE || i10 < i13) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i10++;
                        }
                    }
                } else {
                    i10++;
                }
            }
        }
        int i14 = preferenceGroup.f6844k0;
        if (i14 == Integer.MAX_VALUE || i10 <= i14) {
            return arrayList;
        }
        long j = preferenceGroup.f6834u;
        CharSequence string = null;
        d dVar = new d(preferenceGroup.f6832s, null);
        dVar.f6824W = com.kcstream.cing.R.layout.expand_button;
        Context context = dVar.f6832s;
        Drawable drawableG = p068ga.l.g(context, com.kcstream.cing.R.drawable.ic_arrow_down_24dp);
        if (dVar.f6805C != drawableG) {
            dVar.f6805C = drawableG;
            dVar.f6804B = 0;
            dVar.m();
        }
        dVar.f6804B = com.kcstream.cing.R.drawable.ic_arrow_down_24dp;
        String string2 = context.getString(com.kcstream.cing.R.string.expand_button_title);
        if (!TextUtils.equals(string2, dVar.f6839z)) {
            dVar.f6839z = string2;
            dVar.m();
        }
        if (999 != dVar.f6838y) {
            dVar.f6838y = 999;
            t tVar = dVar.f6826Y;
            if (tVar != null) {
                Handler handler = tVar.f889h;
                RunnableC0094c runnableC0094c = tVar.f890i;
                handler.removeCallbacks(runnableC0094c);
                handler.post(runnableC0094c);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Preference preference2 : arrayList2) {
            CharSequence charSequence = preference2.f6839z;
            boolean z6 = preference2 instanceof PreferenceGroup;
            if (z6 && !TextUtils.isEmpty(charSequence)) {
                arrayList3.add((PreferenceGroup) preference2);
            }
            if (arrayList3.contains(preference2.f6828a0)) {
                if (z6) {
                    arrayList3.add((PreferenceGroup) preference2);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                string = string == null ? charSequence : context.getString(com.kcstream.cing.R.string.summary_collapsed_preference_list, string, charSequence);
            }
        }
        if (dVar.f6830d0 != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (!TextUtils.equals(dVar.f6803A, string)) {
            dVar.f6803A = string;
            dVar.m();
        }
        dVar.f0 = j + 1000000;
        dVar.f6837x = new o1.e(this, preferenceGroup);
        arrayList.add(dVar);
        return arrayList;
    }

    public final void n(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f6840g0);
        }
        int size = preferenceGroup.f6840g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            Preference preferenceD = preferenceGroup.D(i10);
            arrayList.add(preferenceD);
            s sVar = new s(preferenceD);
            if (!this.f888g.contains(sVar)) {
                this.f888g.add(sVar);
            }
            if (preferenceD instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceD;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    n(arrayList, preferenceGroup2);
                }
            }
            preferenceD.f6826Y = this;
        }
    }

    public final Preference o(int i10) {
        if (i10 < 0 || i10 >= this.f887f.size()) {
            return null;
        }
        return (Preference) this.f887f.get(i10);
    }

    public final void p() {
        Iterator it = this.f886e.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).f6826Y = null;
        }
        ArrayList arrayList = new ArrayList(this.f886e.size());
        this.f886e = arrayList;
        PreferenceGroup preferenceGroup = this.f885d;
        n(arrayList, preferenceGroup);
        this.f887f = m(preferenceGroup);
        this.a.b();
        Iterator it2 = this.f886e.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).getClass();
        }
    }
}
