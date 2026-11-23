package p173r6;

import com.onesignal.common.d;
import com.onesignal.common.modeling.i;
import com.onesignal.inAppMessages.internal.display.impl.k;
import com.onesignal.user.internal.operations.impl.executors.j;
import java.util.Map;
import p064g5.c;
import p064g5.g;
import p208v6.f;
import p210v8.e;

/* JADX INFO: loaded from: classes.dex */
public final class p extends g {
    private final c groupComparisonType;

    public p() {
        super(j.UPDATE_SUBSCRIPTION);
        this.groupComparisonType = c.ALTER;
    }

    private final void setAddress(String str) {
        i.setStringProperty$default(this, "address", str, null, false, 12, null);
    }

    private final void setAppId(String str) {
        i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setEnabled(boolean z6) {
        i.setBooleanProperty$default(this, "enabled", z6, null, false, 12, null);
    }

    private final void setJwt(String str) {
        if (str != null) {
            i.setStringProperty$default(this, "jwt", str, null, false, 12, null);
        }
    }

    private final void setOnesignalId(String str) {
        i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setStatus(f fVar) {
        setOptAnyProperty("status", fVar != null ? fVar.toString() : null, "NORMAL", false);
    }

    private final void setSubscriptionId(String str) {
        i.setStringProperty$default(this, "subscriptionId", str, null, false, 12, null);
    }

    private final void setType(p208v6.g gVar) {
        setOptAnyProperty(k.EVENT_TYPE_KEY, gVar != null ? gVar.toString() : null, "NORMAL", false);
    }

    public final String getAddress() {
        return i.getStringProperty$default(this, "address", null, 2, null);
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
        return (dVar.isLocalId(getOnesignalId()) || dVar.isLocalId(getOnesignalId())) ? false : true;
    }

    @Override // p064g5.g
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final boolean getEnabled() {
        return i.getBooleanProperty$default(this, "enabled", null, 2, null);
    }

    @Override // p064g5.g
    public c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    public final String getJwt() {
        return i.getStringProperty$default(this, "jwt", null, 2, null);
    }

    @Override // p064g5.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Subscription." + getSubscriptionId();
    }

    public final String getOnesignalId() {
        return i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final f getStatus() {
        Enum enumValueOf = null;
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, "status", null, 2, null);
        if (optAnyProperty$default != null) {
            if (optAnyProperty$default instanceof f) {
                enumValueOf = (Enum) optAnyProperty$default;
            } else {
                enumValueOf = optAnyProperty$default instanceof String ? f.valueOf((String) optAnyProperty$default) : (f) optAnyProperty$default;
            }
        }
        if (enumValueOf != null) {
            return (f) enumValueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
    }

    public final String getSubscriptionId() {
        return i.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    public final p208v6.g getType() {
        Enum enumValueOf = null;
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, k.EVENT_TYPE_KEY, null, 2, null);
        if (optAnyProperty$default != null) {
            if (optAnyProperty$default instanceof p208v6.g) {
                enumValueOf = (Enum) optAnyProperty$default;
            } else {
                enumValueOf = optAnyProperty$default instanceof String ? p208v6.g.valueOf((String) optAnyProperty$default) : (p208v6.g) optAnyProperty$default;
            }
        }
        if (enumValueOf != null) {
            return (p208v6.g) enumValueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
    }

    @Override // p064g5.g
    public void translateIds(Map<String, String> map) {
        p210v8.i.f(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            p210v8.i.c(str);
            setOnesignalId(str);
        }
        if (map.containsKey(getSubscriptionId())) {
            String str2 = map.get(getSubscriptionId());
            p210v8.i.c(str2);
            setSubscriptionId(str2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(String str, String str2, String str3, p208v6.g gVar, boolean z6, String str4, f fVar, String str5) {
        this();
        p210v8.i.f(str, "appId");
        p210v8.i.f(str2, "onesignalId");
        p210v8.i.f(str3, "subscriptionId");
        p210v8.i.f(gVar, k.EVENT_TYPE_KEY);
        p210v8.i.f(str4, "address");
        p210v8.i.f(fVar, "status");
        setAppId(str);
        setOnesignalId(str2);
        setSubscriptionId(str3);
        setType(gVar);
        setEnabled(z6);
        setAddress(str4);
        setStatus(fVar);
        setJwt(str5);
    }

    public /* synthetic */ p(String str, String str2, String str3, p208v6.g gVar, boolean z6, String str4, f fVar, String str5, int i10, e eVar) {
        this(str, str2, str3, gVar, z6, str4, fVar, (i10 & 128) != 0 ? null : str5);
    }
}
