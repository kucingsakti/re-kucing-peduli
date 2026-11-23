package p;

import X9.C0469o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: p.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0732v extends ImageView {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0719o f14148s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final A1.q f14149t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14150u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0732v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        O0.a(context);
        this.f14150u = false;
        N0.a(this, getContext());
        C0719o c0719o = new C0719o(this);
        this.f14148s = c0719o;
        c0719o.d(attributeSet, i10);
        A1.q qVar = new A1.q(this);
        this.f14149t = qVar;
        qVar.e(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0719o c0719o = this.f14148s;
        if (c0719o != null) {
            c0719o.a();
        }
        A1.q qVar = this.f14149t;
        if (qVar != null) {
            qVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0719o c0719o = this.f14148s;
        if (c0719o != null) {
            return c0719o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0719o c0719o = this.f14148s;
        if (c0719o != null) {
            return c0719o.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0469o c0469o;
        A1.q qVar = this.f14149t;
        if (qVar == null || (c0469o = (C0469o) qVar.f165d) == null) {
            return null;
        }
        return (ColorStateList) c0469o.f5619c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0469o c0469o;
        A1.q qVar = this.f14149t;
        if (qVar == null || (c0469o = (C0469o) qVar.f165d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0469o.f5620d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f14149t.f164c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0719o c0719o = this.f14148s;
        if (c0719o != null) {
            c0719o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0719o c0719o = this.f14148s;
        if (c0719o != null) {
            c0719o.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        A1.q qVar = this.f14149t;
        if (qVar != null) {
            qVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        A1.q qVar = this.f14149t;
        if (qVar != null && drawable != null && !this.f14150u) {
            qVar.f163b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (qVar != null) {
            qVar.a();
            if (this.f14150u) {
                return;
            }
            ImageView imageView = (ImageView) qVar.f164c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(qVar.f163b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f14150u = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        A1.q qVar = this.f14149t;
        if (qVar != null) {
            qVar.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        A1.q qVar = this.f14149t;
        if (qVar != null) {
            qVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0719o c0719o = this.f14148s;
        if (c0719o != null) {
            c0719o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0719o c0719o = this.f14148s;
        if (c0719o != null) {
            c0719o.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        A1.q qVar = this.f14149t;
        if (qVar != null) {
            if (((C0469o) qVar.f165d) == null) {
                qVar.f165d = new C0469o();
            }
            C0469o c0469o = (C0469o) qVar.f165d;
            c0469o.f5619c = colorStateList;
            c0469o.f5618b = true;
            qVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        A1.q qVar = this.f14149t;
        if (qVar != null) {
            if (((C0469o) qVar.f165d) == null) {
                qVar.f165d = new C0469o();
            }
            C0469o c0469o = (C0469o) qVar.f165d;
            c0469o.f5620d = mode;
            c0469o.a = true;
            qVar.a();
        }
    }
}
