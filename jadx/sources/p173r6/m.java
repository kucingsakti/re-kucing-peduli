package p173r6;

import com.onesignal.common.d;
import com.onesignal.common.modeling.i;
import com.onesignal.user.internal.operations.impl.executors.l;
import java.util.Map;
import p064g5.c;
import p064g5.g;

/* JADX INFO: loaded from: classes.dex */
public final class m extends g {
    private final c groupComparisonType;

    public m() {
        super(l.TRACK_SESSION_END);
        this.groupComparisonType = c.ALTER;
    }

    private final void setAppId(String str) {
        i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setSessionTime(long j) {
        i.setLongProperty$default(this, "sessionTime", j, null, false, 12, null);
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

    public final long getSessionTime() {
        return i.getLongProperty$default(this, "sessionTime", null, 2, null);
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
    public m(String str, String str2, long j) {
        this();
        p210v8.i.f(str, "appId");
        p210v8.i.f(str2, "onesignalId");
        setAppId(str);
        setOnesignalId(str2);
        setSessionTime(j);
    }
}
