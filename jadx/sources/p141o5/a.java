package p141o5;

import p131n5.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p131n5.a {
    public a() {
        setLogLevel(b.WARN);
        setAlertLevel(b.NONE);
    }

    @Override // p131n5.a
    public b getAlertLevel() {
        return com.onesignal.debug.internal.logging.b.getVisualLogLevel();
    }

    @Override // p131n5.a
    public b getLogLevel() {
        return com.onesignal.debug.internal.logging.b.getLogLevel();
    }

    @Override // p131n5.a
    public void setAlertLevel(b bVar) {
        i.f(bVar, "value");
        com.onesignal.debug.internal.logging.b.setVisualLogLevel(bVar);
    }

    @Override // p131n5.a
    public void setLogLevel(b bVar) {
        i.f(bVar, "value");
        com.onesignal.debug.internal.logging.b.setLogLevel(bVar);
    }
}
