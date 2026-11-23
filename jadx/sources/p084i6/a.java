package p084i6;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p075h6.b;
import p075h6.c;
import p075h6.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements b {
    private f dataRepository;
    private String directId;
    private JSONArray indirectIds;
    private d influenceType;
    private p110l5.a timeProvider;

    public a(f fVar, p110l5.a aVar) {
        i.f(fVar, "dataRepository");
        i.f(aVar, "timeProvider");
        this.dataRepository = fVar;
        this.timeProvider = aVar;
    }

    private final boolean isDirectSessionEnabled() {
        return this.dataRepository.isDirectInfluenceEnabled();
    }

    private final boolean isIndirectSessionEnabled() {
        return this.dataRepository.isIndirectInfluenceEnabled();
    }

    private final boolean isUnattributedSessionEnabled() {
        return this.dataRepository.isUnattributedInfluenceEnabled();
    }

    @Override // p084i6.b
    public abstract /* synthetic */ void cacheState();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            a aVar = (a) obj;
            if (getInfluenceType() == aVar.getInfluenceType() && i.a(aVar.getIdTag(), getIdTag())) {
                return true;
            }
        }
        return false;
    }

    public abstract int getChannelLimit();

    @Override // p084i6.b
    public abstract /* synthetic */ c getChannelType();

    @Override // p084i6.b
    public b getCurrentSessionInfluence() {
        c channelType = getChannelType();
        d dVar = d.DISABLED;
        b bVar = new b(channelType, dVar, null);
        if (getInfluenceType() == null) {
            initInfluencedTypeFromCache();
        }
        d influenceType = getInfluenceType();
        if (influenceType != null) {
            dVar = influenceType;
        }
        if (dVar.isDirect()) {
            if (isDirectSessionEnabled()) {
                bVar.setIds(new JSONArray().put(getDirectId()));
                bVar.setInfluenceType(d.DIRECT);
                return bVar;
            }
        } else if (dVar.isIndirect()) {
            if (isIndirectSessionEnabled()) {
                bVar.setIds(getIndirectIds());
                bVar.setInfluenceType(d.INDIRECT);
                return bVar;
            }
        } else if (isUnattributedSessionEnabled()) {
            bVar.setInfluenceType(d.UNATTRIBUTED);
        }
        return bVar;
    }

    public final f getDataRepository() {
        return this.dataRepository;
    }

    @Override // p084i6.b
    public String getDirectId() {
        return this.directId;
    }

    @Override // p084i6.b
    public abstract /* synthetic */ String getIdTag();

    public abstract int getIndirectAttributionWindow();

    @Override // p084i6.b
    public JSONArray getIndirectIds() {
        return this.indirectIds;
    }

    @Override // p084i6.b
    public d getInfluenceType() {
        return this.influenceType;
    }

    public abstract JSONArray getLastChannelObjects() throws JSONException;

    public abstract JSONArray getLastChannelObjectsReceivedByNewId(String str);

    @Override // p084i6.b
    public JSONArray getLastReceivedIds() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.getLastReceivedIds: lastChannelObjectReceived: " + lastChannelObjects, null, 2, null);
            long indirectAttributionWindow = ((long) (getIndirectAttributionWindow() * 60)) * 1000;
            long currentTimeMillis = this.timeProvider.getCurrentTimeMillis();
            int length = lastChannelObjects.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = lastChannelObjects.getJSONObject(i10);
                if (currentTimeMillis - jSONObject.getLong(e.TIME) <= indirectAttributionWindow) {
                    jSONArray.put(jSONObject.getString(getIdTag()));
                }
            }
        } catch (JSONException e10) {
            com.onesignal.debug.internal.logging.b.error("ChannelTracker.getLastReceivedIds: Generating tracker getLastReceivedIds JSONObject ", e10);
        }
        return jSONArray;
    }

    public int hashCode() {
        d influenceType = getInfluenceType();
        return getIdTag().hashCode() + ((influenceType != null ? influenceType.hashCode() : 0) * 31);
    }

    public abstract void initInfluencedTypeFromCache();

    @Override // p084i6.b
    public void resetAndInitInfluence() {
        setDirectId(null);
        setIndirectIds(getLastReceivedIds());
        JSONArray indirectIds = getIndirectIds();
        setInfluenceType((indirectIds != null ? indirectIds.length() : 0) > 0 ? d.INDIRECT : d.UNATTRIBUTED);
        cacheState();
        com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.resetAndInitInfluence: " + getIdTag() + " finish with influenceType: " + getInfluenceType(), null, 2, null);
    }

    public abstract void saveChannelObjects(JSONArray jSONArray);

    @Override // p084i6.b
    public void saveLastId(String str) {
        StringBuilder sbM = AbstractC0487g.m("ChannelTracker.saveLastId(id: ", str, "): idTag=");
        sbM.append(getIdTag());
        com.onesignal.debug.internal.logging.b.debug$default(sbM.toString(), null, 2, null);
        if (str == null || str.length() == 0) {
            return;
        }
        JSONArray lastChannelObjectsReceivedByNewId = getLastChannelObjectsReceivedByNewId(str);
        com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.saveLastId: for " + getIdTag() + " saveLastId with lastChannelObjectsReceived: " + lastChannelObjectsReceivedByNewId, null, 2, null);
        try {
            lastChannelObjectsReceivedByNewId.put(new JSONObject().put(getIdTag(), str).put(e.TIME, this.timeProvider.getCurrentTimeMillis()));
            if (lastChannelObjectsReceivedByNewId.length() > getChannelLimit()) {
                JSONArray jSONArray = new JSONArray();
                int length = lastChannelObjectsReceivedByNewId.length();
                for (int length2 = lastChannelObjectsReceivedByNewId.length() - getChannelLimit(); length2 < length; length2++) {
                    try {
                        jSONArray.put(lastChannelObjectsReceivedByNewId.get(length2));
                    } catch (JSONException e10) {
                        com.onesignal.debug.internal.logging.b.error("ChannelTracker.saveLastId: Generating tracker lastChannelObjectsReceived get JSONObject ", e10);
                    }
                }
                lastChannelObjectsReceivedByNewId = jSONArray;
            }
            com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.saveLastId: for " + getIdTag() + " with channelObjectToSave: " + lastChannelObjectsReceivedByNewId, null, 2, null);
            saveChannelObjects(lastChannelObjectsReceivedByNewId);
        } catch (JSONException e11) {
            com.onesignal.debug.internal.logging.b.error("ChannelTracker.saveLastId: Generating tracker newInfluenceId JSONObject ", e11);
        }
    }

    public final void setDataRepository(f fVar) {
        i.f(fVar, "<set-?>");
        this.dataRepository = fVar;
    }

    @Override // p084i6.b
    public void setDirectId(String str) {
        this.directId = str;
    }

    @Override // p084i6.b
    public void setIndirectIds(JSONArray jSONArray) {
        this.indirectIds = jSONArray;
    }

    @Override // p084i6.b
    public void setInfluenceType(d dVar) {
        this.influenceType = dVar;
    }

    public String toString() {
        return "ChannelTracker{tag=" + getIdTag() + ", influenceType=" + getInfluenceType() + ", indirectIds=" + getIndirectIds() + ", directId=" + getDirectId() + '}';
    }
}
