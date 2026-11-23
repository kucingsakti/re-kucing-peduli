package p084i6;

import com.onesignal.debug.internal.logging.b;
import org.json.JSONArray;
import org.json.JSONException;
import p075h6.c;
import p110l5.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, a aVar) {
        super(fVar, aVar);
        i.f(fVar, "dataRepository");
        i.f(aVar, "timeProvider");
    }

    @Override // p084i6.a, p084i6.b
    public void cacheState() {
        p075h6.d influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = p075h6.d.UNATTRIBUTED;
        }
        f dataRepository = getDataRepository();
        if (influenceType == p075h6.d.DIRECT) {
            influenceType = p075h6.d.INDIRECT;
        }
        dataRepository.cacheIAMInfluenceType(influenceType);
    }

    @Override // p084i6.a
    public int getChannelLimit() {
        return getDataRepository().getIamLimit();
    }

    @Override // p084i6.a, p084i6.b
    public c getChannelType() {
        return c.IAM;
    }

    @Override // p084i6.a, p084i6.b
    public String getIdTag() {
        return e.IAM_ID_TAG;
    }

    @Override // p084i6.a
    public int getIndirectAttributionWindow() {
        return getDataRepository().getIamIndirectAttributionWindow();
    }

    @Override // p084i6.a
    public JSONArray getLastChannelObjects() throws JSONException {
        return getDataRepository().getLastIAMsReceivedData();
    }

    @Override // p084i6.a
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            try {
                JSONArray jSONArray = new JSONArray();
                int length = lastChannelObjects.length();
                for (int i10 = 0; i10 < length; i10++) {
                    if (!i.a(str, lastChannelObjects.getJSONObject(i10).getString(getIdTag()))) {
                        jSONArray.put(lastChannelObjects.getJSONObject(i10));
                    }
                }
                return jSONArray;
            } catch (JSONException e10) {
                b.error("Generating tracker lastChannelObjectReceived get JSONObject ", e10);
                return lastChannelObjects;
            }
        } catch (JSONException e11) {
            b.error("Generating IAM tracker getLastChannelObjects JSONObject ", e11);
            return new JSONArray();
        }
    }

    @Override // p084i6.a
    public void initInfluencedTypeFromCache() {
        p075h6.d iamCachedInfluenceType = getDataRepository().getIamCachedInfluenceType();
        if (iamCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        }
        setInfluenceType(iamCachedInfluenceType);
        b.debug$default("InAppMessageTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // p084i6.a
    public void saveChannelObjects(JSONArray jSONArray) {
        i.f(jSONArray, "channelObjects");
        getDataRepository().saveIAMs(jSONArray);
    }
}
