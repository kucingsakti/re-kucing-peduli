package C0;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public final class k implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Preference f862s;

    public k(Preference preference) {
        this.f862s = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.f862s;
        CharSequence charSequenceK = preference.k();
        if (!preference.f6822U || TextUtils.isEmpty(charSequenceK)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceK);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.f862s;
        ClipboardManager clipboardManager = (ClipboardManager) preference.f6832s.getSystemService("clipboard");
        CharSequence charSequenceK = preference.k();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceK));
        Context context = preference.f6832s;
        Toast.makeText(context, context.getString(R.string.preference_copied, charSequenceK), 0).show();
        return true;
    }
}
