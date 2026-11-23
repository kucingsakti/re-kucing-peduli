package p193t6;

import com.onesignal.core.internal.config.b;
import java.util.LinkedHashMap;
import java.util.Map;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private final b _configModelStore;
    private final p110l5.a _time;
    private final Map<String, Long> records;

    public a(p110l5.a aVar, b bVar) {
        i.f(aVar, "_time");
        i.f(bVar, "_configModelStore");
        this._time = aVar;
        this._configModelStore = bVar;
        this.records = new LinkedHashMap();
    }

    public final void add(String str) {
        i.f(str, "key");
        this.records.put(str, Long.valueOf(this._time.getCurrentTimeMillis()));
    }

    public final boolean canAccess(String str) {
        i.f(str, "key");
        Long l4 = this.records.get(str);
        if (l4 != null) {
            return this._time.getCurrentTimeMillis() - l4.longValue() >= ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getOpRepoPostCreateDelay();
        }
        return true;
    }

    public final boolean isInMissingRetryWindow(String str) {
        i.f(str, "key");
        Long l4 = this.records.get(str);
        if (l4 != null) {
            if (this._time.getCurrentTimeMillis() - l4.longValue() <= ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getOpRepoPostCreateRetryUpTo()) {
                return true;
            }
        }
        return false;
    }
}
