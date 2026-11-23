package C0;

import android.view.View;
import androidx.preference.Preference;

/* JADX INFO: loaded from: classes.dex */
public final class h implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Preference f861s;

    public h(Preference preference) {
        this.f861s = preference;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f861s.x(view);
    }
}
