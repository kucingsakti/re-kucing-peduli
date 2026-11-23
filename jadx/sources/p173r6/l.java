package p173r6;

import com.onesignal.common.d;
import com.onesignal.common.modeling.i;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p064g5.c;
import p064g5.g;

/* JADX INFO: loaded from: classes.dex */
public final class l extends g {
    private final c groupComparisonType;

    public l() {
        super(com.onesignal.user.internal.operations.impl.executors.l.TRACK_PURCHASE);
        this.groupComparisonType = c.ALTER;
    }

    private final void setAmountSpent(BigDecimal bigDecimal) {
        i.setBigDecimalProperty$default(this, "amountSpent", bigDecimal, null, false, 12, null);
    }

    private final void setAppId(String str) {
        i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setPurchases(List<g> list) {
        i.setListProperty$default(this, "purchases", list, null, false, 12, null);
    }

    private final void setTreatNewAsExisting(boolean z6) {
        i.setBooleanProperty$default(this, "treatNewAsExisting", z6, null, false, 12, null);
    }

    @Override // com.onesignal.common.modeling.i
    public List<?> createListForProperty(String str, JSONArray jSONArray) throws JSONException {
        p210v8.i.f(str, "property");
        p210v8.i.f(jSONArray, "jsonArray");
        if (!str.equals("purchases")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            g gVar = new g();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            p210v8.i.e(jSONObject, "jsonArray.getJSONObject(item)");
            gVar.initializeFromJson(jSONObject);
            arrayList.add(gVar);
        }
        return arrayList;
    }

    public final BigDecimal getAmountSpent() {
        return i.getBigDecimalProperty$default(this, "amountSpent", null, 2, null);
    }

    public final String getAppId() {
        return i.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // p064g5.g
    public String getApplyToRecordId() {
        return getOnesignalId();
    }

    @Override // p064g5.g
    public boolean getCanStartExecute() {
        return !d.INSTANCE.isLocalId(getOnesignalId());
    }

    @Override // p064g5.g
    public String getCreateComparisonKey() {
        return "";
    }

    @Override // p064g5.g
    public c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // p064g5.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getOnesignalId() {
        return i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final List<g> getPurchases() {
        return i.getListProperty$default(this, "purchases", null, 2, null);
    }

    public final boolean getTreatNewAsExisting() {
        return i.getBooleanProperty$default(this, "treatNewAsExisting", null, 2, null);
    }

    @Override // p064g5.g
    public void translateIds(Map<String, String> map) {
        p210v8.i.f(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            p210v8.i.c(str);
            setOnesignalId(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(String str, String str2, boolean z6, BigDecimal bigDecimal, List<g> list) {
        this();
        p210v8.i.f(str, "appId");
        p210v8.i.f(str2, "onesignalId");
        p210v8.i.f(bigDecimal, "amountSpent");
        p210v8.i.f(list, "purchases");
        setAppId(str);
        setOnesignalId(str2);
        setTreatNewAsExisting(z6);
        setAmountSpent(bigDecimal);
        setPurchases(list);
    }
}
