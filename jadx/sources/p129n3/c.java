package p129n3;

import M.a;
import W0.b;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f13330c;

    public /* synthetic */ c(View view, int i10) {
        this.f13329b = i10;
        this.f13330c = view;
    }

    public final void a(Drawable drawable) {
        switch (this.f13329b) {
            case 0:
                d dVar = (d) this.f13330c;
                dVar.setIndeterminate(false);
                dVar.a(dVar.f13335t);
                break;
            case 1:
                d dVar2 = (d) this.f13330c;
                if (!dVar2.f13339x) {
                    dVar2.setVisibility(dVar2.f13340y);
                }
                break;
            default:
                ColorStateList colorStateList = ((com.google.android.material.checkbox.b) this.f13330c).f9596G;
                if (colorStateList != null) {
                    a.h(drawable, colorStateList);
                }
                break;
        }
    }

    public void b(Drawable drawable) {
        switch (this.f13329b) {
            case 2:
                com.google.android.material.checkbox.b bVar = (com.google.android.material.checkbox.b) this.f13330c;
                ColorStateList colorStateList = bVar.f9596G;
                if (colorStateList != null) {
                    a.g(drawable, colorStateList.getColorForState(bVar.f9600K, colorStateList.getDefaultColor()));
                }
                break;
        }
    }

    public final void c(Drawable drawable) {
    }
}
