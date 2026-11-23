package p215w3;

import E4.L;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public final class s extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f15636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final L f15637g;

    public s(l lVar, int i10) {
        super(lVar);
        this.f15635e = R.drawable.design_password_eye;
        this.f15637g = new L(this, 6);
        if (i10 != 0) {
            this.f15635e = i10;
        }
    }

    @Override // p215w3.m
    public final void b() {
        q();
    }

    @Override // p215w3.m
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // p215w3.m
    public final int d() {
        return this.f15635e;
    }

    @Override // p215w3.m
    public final View.OnClickListener f() {
        return this.f15637g;
    }

    @Override // p215w3.m
    public final boolean k() {
        return true;
    }

    @Override // p215w3.m
    public final boolean l() {
        EditText editText = this.f15636f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p215w3.m
    public final void m(EditText editText) {
        this.f15636f = editText;
        q();
    }

    @Override // p215w3.m
    public final void r() {
        EditText editText = this.f15636f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f15636f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p215w3.m
    public final void s() {
        EditText editText = this.f15636f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
