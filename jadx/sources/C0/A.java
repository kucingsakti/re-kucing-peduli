package C0;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

/* JADX INFO: loaded from: classes.dex */
public final class A implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ SeekBarPreference a;

    public A(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z6) {
        SeekBarPreference seekBarPreference = this.a;
        if (z6 && (seekBarPreference.f6855o0 || !seekBarPreference.f6850j0)) {
            seekBarPreference.D(seekBar);
            return;
        }
        int i11 = i10 + seekBarPreference.f6847g0;
        TextView textView = seekBarPreference.f6852l0;
        if (textView != null) {
            textView.setText(String.valueOf(i11));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a.f6850j0 = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        SeekBarPreference seekBarPreference = this.a;
        seekBarPreference.f6850j0 = false;
        if (seekBar.getProgress() + seekBarPreference.f6847g0 != seekBarPreference.f0) {
            seekBarPreference.D(seekBar);
        }
    }
}
