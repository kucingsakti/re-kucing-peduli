package p075h6;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    List<b> getInfluences();

    void onDirectInfluenceFromIAM(String str);

    void onDirectInfluenceFromNotification(String str);

    void onInAppMessageDismissed();

    void onInAppMessageDisplayed(String str);

    void onNotificationReceived(String str);
}
