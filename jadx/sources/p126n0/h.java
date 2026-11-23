package p126n0;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;
import p106l0.e;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e {
    public final /* synthetic */ int a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f13296b;

    public h(EditText editText) {
        this.f13296b = new WeakReference(editText);
    }

    @Override // p106l0.e
    public void a() {
        switch (this.a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f13296b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    @Override // p106l0.e
    public final void b() {
        switch (this.a) {
            case 0:
                i.a((EditText) this.f13296b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f13296b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    public h(SwitchCompat switchCompat) {
        this.f13296b = new WeakReference(switchCompat);
    }
}
