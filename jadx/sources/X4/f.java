package X4;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public interface f {
    void addActivityLifecycleHandler(d dVar);

    void addApplicationLifecycleHandler(e eVar);

    Context getAppContext();

    Activity getCurrent();

    b getEntryState();

    boolean isInForeground();

    void removeActivityLifecycleHandler(d dVar);

    void removeApplicationLifecycleHandler(e eVar);

    void setEntryState(b bVar);

    Object waitUntilActivityReady(p123m8.d<? super Boolean> dVar);

    Object waitUntilSystemConditionsAvailable(p123m8.d<? super Boolean> dVar);
}
