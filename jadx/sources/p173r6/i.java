package p173r6;

import com.onesignal.common.d;
import com.onesignal.user.internal.operations.impl.executors.a;
import java.util.Map;
import p064g5.c;
import p064g5.g;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g {
    private final c groupComparisonType;

    public i() {
        super(a.SET_ALIAS);
        this.groupComparisonType = c.ALTER;
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setLabel(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "label", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setValue(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "value", str, null, false, 12, null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "appId", null, 2, null);
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

    public final String getLabel() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "label", null, 2, null);
    }

    @Override // p064g5.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Identity." + getLabel();
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final String getValue() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "value", null, 2, null);
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
    public i(String str, String str2, String str3, String str4) {
        this();
        p210v8.i.f(str, "appId");
        p210v8.i.f(str2, "onesignalId");
        p210v8.i.f(str3, "label");
        p210v8.i.f(str4, "value");
        setAppId(str);
        setOnesignalId(str2);
        setLabel(str3);
        setValue(str4);
    }
}
