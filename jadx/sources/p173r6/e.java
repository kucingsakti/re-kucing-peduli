package p173r6;

import com.onesignal.common.modeling.i;
import p064g5.c;
import p064g5.g;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g {
    private final boolean canStartExecute;
    private final c groupComparisonType;

    public e() {
        super(com.onesignal.user.internal.operations.impl.executors.c.LOGIN_USER_FROM_SUBSCRIPTION_USER);
        this.groupComparisonType = c.NONE;
        this.canStartExecute = true;
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
        return this.canStartExecute;
    }

    @Override // p064g5.g
    public String getCreateComparisonKey() {
        return getAppId() + ".Subscription." + getSubscriptionId() + ".Login";
    }

    @Override // p064g5.g
    public c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // p064g5.g
    public String getModifyComparisonKey() {
        return getAppId() + ".Subscription." + getSubscriptionId() + ".Login";
    }

    public final String getOnesignalId() {
        return i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final String getSubscriptionId() {
        return i.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2, String str3) {
        this();
        p210v8.i.f(str, "appId");
        p210v8.i.f(str2, "onesignalId");
        p210v8.i.f(str3, "subscriptionId");
        setAppId(str);
        setOnesignalId(str2);
        setSubscriptionId(str3);
    }
}
