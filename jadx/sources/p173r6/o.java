package p173r6;

import com.onesignal.common.d;
import com.onesignal.common.modeling.i;
import com.onesignal.user.internal.operations.impl.executors.j;
import java.util.Map;
import p064g5.c;
import p064g5.g;

/* JADX INFO: loaded from: classes.dex */
public final class o extends g {
    private final c groupComparisonType;

    public o() {
        super(j.TRANSFER_SUBSCRIPTION);
        this.groupComparisonType = c.NONE;
    }

    private final void setAppId(String str) {
        i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setSubscriptionId(String str) {
        i.setStringProperty$default(this, "subscriptionId", str, null, false, 12, null);
    }

    public final String getAppId() {
        return i.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // p064g5.g
    public String getApplyToRecordId() {
        return getSubscriptionId();
    }

    @Override // p064g5.g
    public boolean getCanStartExecute() {
        d dVar = d.INSTANCE;
        return (dVar.isLocalId(getOnesignalId()) || dVar.isLocalId(getSubscriptionId())) ? false : true;
    }

    @Override // p064g5.g
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    @Override // p064g5.g
    public c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // p064g5.g
    public String getModifyComparisonKey() {
        return getAppId() + ".Subscription." + getSubscriptionId() + ".Transfer";
    }

    public final String getOnesignalId() {
        return i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final String getSubscriptionId() {
        return i.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    @Override // p064g5.g
    public void translateIds(Map<String, String> map) {
        p210v8.i.f(map, "map");
        if (map.containsKey(getSubscriptionId())) {
            String str = map.get(getSubscriptionId());
            p210v8.i.c(str);
            setSubscriptionId(str);
        }
        if (map.containsKey(getOnesignalId())) {
            String str2 = map.get(getOnesignalId());
            p210v8.i.c(str2);
            setOnesignalId(str2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(String str, String str2, String str3) {
        this();
        p210v8.i.f(str, "appId");
        p210v8.i.f(str2, "subscriptionId");
        p210v8.i.f(str3, "onesignalId");
        setAppId(str);
        setSubscriptionId(str2);
        setOnesignalId(str3);
    }
}
