package N0;

import U.U;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.C0515j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import p.AbstractC0710j0;
import p.C0723q;
import p068ga.l;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Parcelable f3267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3268f;

    public /* synthetic */ e(TextView textView) {
        this.f3267e = null;
        this.f3268f = null;
        this.a = false;
        this.f3264b = false;
        this.f3266d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f3266d;
        Drawable drawableA = p000a0.c.a(compoundButton);
        if (drawableA != null) {
            if (this.a || this.f3264b) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.a) {
                    M.a.h(drawableMutate, (ColorStateList) this.f3267e);
                }
                if (this.f3264b) {
                    M.a.i(drawableMutate, (PorterDuff.Mode) this.f3268f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        C0723q c0723q = (C0723q) this.f3266d;
        Drawable checkMarkDrawable = c0723q.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.a || this.f3264b) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.a) {
                    M.a.h(drawableMutate, (ColorStateList) this.f3267e);
                }
                if (this.f3264b) {
                    M.a.i(drawableMutate, (PorterDuff.Mode) this.f3268f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c0723q.getDrawableState());
                }
                c0723q.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f3264b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f3267e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f3267e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f3267e;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f3267e = null;
        return bundle2;
    }

    public d d() {
        String str;
        d dVar;
        Iterator it = ((p166r.f) this.f3266d).iterator();
        do {
            p166r.b bVar = (p166r.b) it;
            if (!bVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            i.e(entry, "components");
            str = (String) entry.getKey();
            dVar = (d) entry.getValue();
        } while (!i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public void e(AttributeSet attributeSet, int i10) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f3266d;
        Context context = compoundButton.getContext();
        int[] iArr = p069h.a.f11620m;
        Y1.c cVarE = Y1.c.E(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) cVarE.f5671u;
        U.m(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) cVarE.f5671u, i10);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(l.g(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(l.g(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(l.g(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                p000a0.b.c(compoundButton, cVarE.u(2));
            }
            if (typedArray.hasValue(3)) {
                p000a0.b.d(compoundButton, AbstractC0710j0.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            cVarE.J();
        }
    }

    public void f(String str, d dVar) {
        Object obj;
        i.f(dVar, "provider");
        p166r.f fVar = (p166r.f) this.f3266d;
        p166r.c cVarD = fVar.d(str);
        if (cVarD != null) {
            obj = cVarD.f14448t;
        } else {
            p166r.c cVar = new p166r.c(str, dVar);
            fVar.f14457v++;
            p166r.c cVar2 = fVar.f14455t;
            if (cVar2 == null) {
                fVar.f14454s = cVar;
                fVar.f14455t = cVar;
            } else {
                cVar2.f14449u = cVar;
                cVar.f14450v = cVar2;
                fVar.f14455t = cVar;
            }
            obj = null;
        }
        if (((d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void g() {
        if (!this.f3265c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = (a) this.f3268f;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f3268f = aVar;
        try {
            C0515j.class.getDeclaredConstructor(new Class[0]);
            a aVar2 = (a) this.f3268f;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f3261b).add(C0515j.class.getName());
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + C0515j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public e() {
        this.f3266d = new p166r.f();
        this.f3265c = true;
    }
}
