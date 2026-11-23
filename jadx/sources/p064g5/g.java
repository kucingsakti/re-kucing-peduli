package p064g5;

import com.onesignal.common.modeling.i;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(String str) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        setName(str);
    }

    private final void setName(String str) {
        i.setStringProperty$default(this, MediationMetaData.KEY_NAME, str, null, false, 12, null);
    }

    public abstract String getApplyToRecordId();

    public abstract boolean getCanStartExecute();

    public abstract String getCreateComparisonKey();

    public abstract c getGroupComparisonType();

    public abstract String getModifyComparisonKey();

    public final String getName() {
        return i.getStringProperty$default(this, MediationMetaData.KEY_NAME, null, 2, null);
    }

    public String toString() {
        String string = toJSON().toString();
        p210v8.i.e(string, "toJSON().toString()");
        return string;
    }

    public void translateIds(Map<String, String> map) {
        p210v8.i.f(map, "map");
    }
}
