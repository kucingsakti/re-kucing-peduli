package O5;

import android.content.ComponentName;
import android.content.Context;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.ShortcutBadgeException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    void executeBadge(Context context, ComponentName componentName, int i10) throws ShortcutBadgeException;

    List<String> getSupportLaunchers();
}
