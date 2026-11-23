package p075h6;

import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    IAM("iam"),
    NOTIFICATION("notification");

    public static final a Companion = new a(null);
    private final String nameValue;

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final c fromString(String str) {
            c cVar;
            if (str != null) {
                c[] cVarArrValues = c.values();
                int length = cVarArrValues.length - 1;
                if (length < 0) {
                    cVar = null;
                    break;
                }
                while (true) {
                    int i10 = length - 1;
                    cVar = cVarArrValues[length];
                    if (cVar.equalsName(str)) {
                        break;
                    }
                    if (i10 < 0) {
                        cVar = null;
                        break;
                    }
                    length = i10;
                }
                if (cVar != null) {
                    return cVar;
                }
            }
            return c.NOTIFICATION;
        }

        private a() {
        }
    }

    c(String str) {
        this.nameValue = str;
    }

    public static final c fromString(String str) {
        return Companion.fromString(str);
    }

    public final boolean equalsName(String str) {
        i.f(str, "otherName");
        return i.a(this.nameValue, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.nameValue;
    }
}
