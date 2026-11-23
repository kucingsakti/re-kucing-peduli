package p132n6;

import java.math.BigDecimal;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    private final BigDecimal amount;
    private final String iso;
    private final String sku;

    public g(String str, String str2, BigDecimal bigDecimal) {
        i.f(str, "sku");
        i.f(str2, "iso");
        i.f(bigDecimal, "amount");
        this.sku = str;
        this.iso = str2;
        this.amount = bigDecimal;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getIso() {
        return this.iso;
    }

    public final String getSku() {
        return this.sku;
    }
}
