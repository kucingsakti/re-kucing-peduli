package Z4;

import p076h8.m;
import p123m8.d;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    boolean cancelRunBackgroundServices();

    boolean getNeedsJobReschedule();

    Object runBackgroundServices(d<? super m> dVar);

    void setNeedsJobReschedule(boolean z6);
}
