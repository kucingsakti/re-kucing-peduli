package L5;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements K5.a {
    @Override // K5.a
    public void trackOpenedEvent(String str, String str2) {
        i.f(str, "notificationId");
        i.f(str2, "campaign");
    }

    @Override // K5.a
    public void trackReceivedEvent(String str, String str2) {
        i.f(str, "notificationId");
        i.f(str2, "campaign");
    }

    @Override // K5.a
    public void trackInfluenceOpenEvent() {
    }
}
