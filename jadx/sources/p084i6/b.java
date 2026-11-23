package p084i6;

import org.json.JSONArray;
import p075h6.c;
import p075h6.d;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    void cacheState();

    c getChannelType();

    p075h6.b getCurrentSessionInfluence();

    String getDirectId();

    String getIdTag();

    JSONArray getIndirectIds();

    d getInfluenceType();

    JSONArray getLastReceivedIds();

    void resetAndInitInfluence();

    void saveLastId(String str);

    void setDirectId(String str);

    void setIndirectIds(JSONArray jSONArray);

    void setInfluenceType(d dVar);
}
