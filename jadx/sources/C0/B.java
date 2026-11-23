package C0;

import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* JADX INFO: loaded from: classes.dex */
public final class B implements View.OnKeyListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SeekBarPreference f848s;

    public B(SeekBarPreference seekBarPreference) {
        this.f848s = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        SeekBar seekBar;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = this.f848s;
        if ((!seekBarPreference.f6853m0 && (i10 == 21 || i10 == 22)) || i10 == 23 || i10 == 66 || (seekBar = seekBarPreference.f6851k0) == null) {
            return false;
        }
        return seekBar.onKeyDown(i10, keyEvent);
    }
}
