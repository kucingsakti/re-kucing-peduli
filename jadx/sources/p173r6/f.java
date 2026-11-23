package p173r6;

import com.onesignal.common.d;
import com.onesignal.common.modeling.i;
import com.onesignal.user.internal.operations.impl.executors.e;
import java.util.Map;
import p064g5.c;
import p064g5.g;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {
    private final c groupComparisonType;
    private final String modifyComparisonKey;

    public f() {
        super(e.LOGIN_USER);
        this.modifyComparisonKey = "";
        this.groupComparisonType = c.CREATE;
    }

    private final void setAppId(String str) {
        i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setExistingOnesignalId(String str) {
        i.setOptStringProperty$default(this, "existingOnesignalId", str, null, false, 12, null);
    }

    private final void setExternalId(String str) {
        i.setOptStringProperty$default(this, "externalId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    public final String getAppId() {
        return i.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // p064g5.g
    public String getApplyToRecordId() {
        String existingOnesignalId = getExistingOnesignalId();
        return existingOnesignalId == null ? getOnesignalId() : existingOnesignalId;
    }

    @Override // p064g5.g
    public boolean getCanStartExecute() {
        if (getExistingOnesignalId() == null) {
            return true;
        }
        d dVar = d.INSTANCE;
        String existingOnesignalId = getExistingOnesignalId();
        p210v8.i.c(existingOnesignalId);
        return !dVar.isLocalId(existingOnesignalId);
    }

    @Override // p064g5.g
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getExistingOnesignalId() {
        return i.getOptStringProperty$default(this, "existingOnesignalId", null, 2, null);
    }

    public final String getExternalId() {
        return i.getOptStringProperty$default(this, "externalId", null, 2, null);
    }

    @Override // p064g5.g
    public c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // p064g5.g
    public String getModifyComparisonKey() {
        return this.modifyComparisonKey;
    }

    public final String getOnesignalId() {
        return i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    @Override // p064g5.g
    public void translateIds(Map<String, String> map) {
        p210v8.i.f(map, "map");
        if (map.containsKey(getExistingOnesignalId())) {
            String str = map.get(getExistingOnesignalId());
            p210v8.i.c(str);
            setExistingOnesignalId(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(String str, String str2, String str3, String str4) {
        this();
        p210v8.i.f(str, "appId");
        p210v8.i.f(str2, "onesignalId");
        setAppId(str);
        setOnesignalId(str2);
        setExternalId(str3);
        setExistingOnesignalId(str4);
    }

    public /* synthetic */ f(String str, String str2, String str3, String str4, int i10, p210v8.e eVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : str4);
    }
}
