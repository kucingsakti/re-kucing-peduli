package p;

import E4.C0187a;
import U.C0418e;
import U.C0421g;
import U.InterfaceC0416d;
import U.InterfaceC0434u;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: renamed from: p.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0728t extends EditText implements InterfaceC0434u, p000a0.s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0719o f14126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final T f14127t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0738y f14128u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p000a0.q f14129v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0738y f14130w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0726s f14131x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0728t(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        O0.a(context);
        N0.a(this, getContext());
        C0719o c0719o = new C0719o(this);
        this.f14126s = c0719o;
        c0719o.d(attributeSet, i10);
        T t7 = new T(this);
        this.f14127t = t7;
        t7.f(attributeSet, i10);
        t7.b();
        C0738y c0738y = new C0738y();
        c0738y.f14158b = this;
        this.f14128u = c0738y;
        this.f14129v = new p000a0.q();
        C0738y c0738y2 = new C0738y(this);
        this.f14130w = c0738y2;
        c0738y2.b(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = c0738y2.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C0726s getSuperCaller() {
        if (this.f14131x == null) {
            this.f14131x = new C0726s(this);
        }
        return this.f14131x;
    }

    @Override // U.InterfaceC0434u
    public final C0421g a(C0421g c0421g) {
        return this.f14129v.a(this, c0421g);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0719o c0719o = this.f14126s;
        if (c0719o != null) {
            c0719o.a();
        }
        T t7 = this.f14127t;
        if (t7 != null) {
            t7.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return J7.j.Y(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0719o c0719o = this.f14126s;
        if (c0719o != null) {
            return c0719o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0719o c0719o = this.f14126s;
        if (c0719o != null) {
            return c0719o.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14127t.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14127t.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0738y c0738y;
        if (Build.VERSION.SDK_INT >= 28 || (c0738y = this.f14128u) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0738y.f14159c;
        return textClassifier == null ? M.a((TextView) c0738y.f14158b) : textClassifier;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[PHI: r1
      0x0058: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x006b, B:22:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i10;
        String[] strArrG;
        String[] stringArray;
        InputConnection eVar;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f14127t.getClass();
        T.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        com.bumptech.glide.d.w(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && (i10 = Build.VERSION.SDK_INT) <= 30 && (strArrG = U.U.g(this)) != null) {
            if (i10 >= 25) {
                editorInfo.contentMimeTypes = strArrG;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrG);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrG);
            }
            C0187a c0187a = new C0187a(this, 14);
            if (i10 >= 25) {
                eVar = new Z.d(inputConnectionOnCreateInputConnection, c0187a);
            } else {
                String[] strArr = Z.c.a;
                if (i10 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                            strArr = stringArray;
                        }
                    }
                }
                if (strArr.length != 0) {
                    eVar = new Z.e(inputConnectionOnCreateInputConnection, c0187a);
                }
            }
            inputConnectionOnCreateInputConnection = eVar;
        }
        return this.f14130w.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        boolean zA = false;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && U.U.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = B.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        C0418e c0418e;
        InterfaceC0416d interfaceC0416d;
        int i11;
        p040e1.j jVar;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 || U.U.g(this) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return super.onTextContextMenuItem(i10);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i12 >= 31) {
                jVar = new p040e1.j(primaryClip, 1);
            } else {
                c0418e = new C0418e();
                c0418e.f4802t = primaryClip;
                c0418e.f4803u = 1;
            }
            if (i10 == 16908322) {
                interfaceC0416d = c0418e;
                interfaceC0416d = jVar;
                i11 = 0;
            } else {
                interfaceC0416d = c0418e;
                interfaceC0416d = jVar;
                i11 = 1;
            }
            interfaceC0416d.G(i11);
            U.U.j(this, interfaceC0416d.mo66build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0719o c0719o = this.f14126s;
        if (c0719o != null) {
            c0719o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0719o c0719o = this.f14126s;
        if (c0719o != null) {
            c0719o.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        T t7 = this.f14127t;
        if (t7 != null) {
            t7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        T t7 = this.f14127t;
        if (t7 != null) {
            t7.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(J7.j.Z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f14130w.d(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f14130w.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0719o c0719o = this.f14126s;
        if (c0719o != null) {
            c0719o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0719o c0719o = this.f14126s;
        if (c0719o != null) {
            c0719o.i(mode);
        }
    }

    @Override // p000a0.s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t7 = this.f14127t;
        t7.l(colorStateList);
        t7.b();
    }

    @Override // p000a0.s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t7 = this.f14127t;
        t7.m(mode);
        t7.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        T t7 = this.f14127t;
        if (t7 != null) {
            t7.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0738y c0738y;
        if (Build.VERSION.SDK_INT >= 28 || (c0738y = this.f14128u) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0738y.f14159c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
