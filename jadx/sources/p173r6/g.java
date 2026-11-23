package p173r6;

import com.onesignal.common.modeling.i;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i {
    public g() {
        super(null, null, 3, null);
    }

    private final void setAmount(BigDecimal bigDecimal) {
        i.setBigDecimalProperty$default(this, "amount", bigDecimal, null, false, 12, null);
    }

    private final void setIso(String str) {
        i.setStringProperty$default(this, "iso", str, null, false, 12, null);
    }

    private final void setSku(String str) {
        i.setStringProperty$default(this, "sku", str, null, false, 12, null);
    }

    public final BigDecimal getAmount() {
        return i.getBigDecimalProperty$default(this, "amount", null, 2, null);
    }

    public final String getIso() {
        return i.getStringProperty$default(this, "iso", null, 2, null);
    }

    public final String getSku() {
        return i.getStringProperty$default(this, "sku", null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(String str, String str2, BigDecimal bigDecimal) {
        this();
        p210v8.i.f(str, "sku");
        p210v8.i.f(str2, "iso");
        p210v8.i.f(bigDecimal, "amount");
        setSku(str);
        setIso(str2);
        setAmount(bigDecimal);
    }
}
