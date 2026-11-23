package p078i;

import C4.a;
import C8.E;
import J7.j;
import U.InterfaceC0425k;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.L;
import com.kcstream.cing.R;
import p031d.n;
import xa.d;

/* JADX INFO: loaded from: classes.dex */
public class F extends n implements InterfaceC0656m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public D f11969v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final E f11970w;

    /* JADX WARN: Type inference failed for: r2v2, types: [i.E] */
    public F(Context context, int i10) {
        int i11;
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = i10;
        }
        super(context, i11);
        this.f11970w = new InterfaceC0425k() { // from class: i.E
            @Override // U.InterfaceC0425k
            public final boolean b(KeyEvent keyEvent) {
                return this.f11968s.f(keyEvent);
            }
        };
        AbstractC0660q abstractC0660qD = d();
        if (i10 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i10 = typedValue2.resourceId;
        }
        ((D) abstractC0660qD).f11954l0 = i10;
        abstractC0660qD.d();
    }

    @Override // p031d.n, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        D d3 = (D) d();
        d3.w();
        ((ViewGroup) d3.f11937S.findViewById(android.R.id.content)).addView(view, layoutParams);
        d3.f11924E.a(d3.f11923D.getCallback());
    }

    public final AbstractC0660q d() {
        if (this.f11969v == null) {
            ExecutorC0659p executorC0659p = AbstractC0660q.f12107s;
            this.f11969v = new D(getContext(), getWindow(), this, this);
        }
        return this.f11969v;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a.p(this.f11970w, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e() {
        L.g(getWindow().getDecorView(), this);
        d.u(getWindow().getDecorView(), this);
        E.z(getWindow().getDecorView(), this);
    }

    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i10) {
        D d3 = (D) d();
        d3.w();
        return d3.f11923D.findViewById(i10);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().b();
    }

    @Override // p031d.n, android.app.Dialog
    public void onCreate(Bundle bundle) {
        d().a();
        super.onCreate(bundle);
        d().d();
    }

    @Override // p031d.n, android.app.Dialog
    public final void onStop() {
        super.onStop();
        D d3 = (D) d();
        d3.C();
        j jVar = d3.f11926G;
        if (jVar != null) {
            jVar.P(false);
        }
    }

    @Override // p031d.n, android.app.Dialog
    public void setContentView(int i10) {
        e();
        d().h(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().l(charSequence);
    }

    @Override // p031d.n, android.app.Dialog
    public void setContentView(View view) {
        e();
        d().i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        d().l(getContext().getString(i10));
    }

    @Override // p031d.n, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        d().j(view, layoutParams);
    }
}
