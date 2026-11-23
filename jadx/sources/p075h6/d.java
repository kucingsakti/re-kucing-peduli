package p075h6;

import L9.n;
import p210v8.e;

/* JADX INFO: loaded from: classes.dex */
public enum d {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;

    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final d fromString(String str) {
            d dVar;
            if (str != null) {
                d[] dVarArrValues = d.values();
                int length = dVarArrValues.length - 1;
                if (length < 0) {
                    dVar = null;
                    break;
                }
                while (true) {
                    int i10 = length - 1;
                    dVar = dVarArrValues[length];
                    if (n.C(dVar.name(), str, true)) {
                        break;
                    }
                    if (i10 < 0) {
                        dVar = null;
                        break;
                    }
                    length = i10;
                }
                if (dVar != null) {
                    return dVar;
                }
            }
            return d.UNATTRIBUTED;
        }

        private a() {
        }
    }

    public static final d fromString(String str) {
        return Companion.fromString(str);
    }

    public final boolean isAttributed() {
        return isDirect() || isIndirect();
    }

    public final boolean isDirect() {
        return this == DIRECT;
    }

    public final boolean isDisabled() {
        return this == DISABLED;
    }

    public final boolean isIndirect() {
        return this == INDIRECT;
    }

    public final boolean isUnattributed() {
        return this == UNATTRIBUTED;
    }
}
