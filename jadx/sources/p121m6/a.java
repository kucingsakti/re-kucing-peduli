package p121m6;

import P4.b;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    void addAlias(String str, String str2);

    void addAliases(Map<String, String> map);

    void addEmail(String str);

    void addObserver(p217w6.a aVar);

    void addSms(String str);

    void addTag(String str, String str2);

    void addTags(Map<String, String> map);

    void addUserJwtInvalidatedListener(b bVar);

    String getExternalId();

    String getOnesignalId();

    p228x6.b getPushSubscription();

    Map<String, String> getTags();

    void removeAlias(String str);

    void removeAliases(Collection<String> collection);

    void removeEmail(String str);

    void removeObserver(p217w6.a aVar);

    void removeSms(String str);

    void removeTag(String str);

    void removeTags(Collection<String> collection);

    void removeUserJwtInvalidatedListener(b bVar);

    void setLanguage(String str);
}
