package A5;

import com.onesignal.common.modeling.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    public static final class a extends k implements p200u8.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // p200u8.a
        public final String invoke() {
            return "";
        }
    }

    public static final class b extends k implements p200u8.a {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // p200u8.a
        public final Object invoke() {
            return "";
        }
    }

    public c() {
        super(null, null, 3, null);
    }

    public final String getKey() {
        return getStringProperty("key", a.INSTANCE);
    }

    public final Object getValue() {
        return getAnyProperty("value", b.INSTANCE);
    }

    public final void setKey(String str) {
        p210v8.i.f(str, "value");
        i.setStringProperty$default(this, "key", str, null, false, 12, null);
    }

    public final void setValue(Object obj) {
        p210v8.i.f(obj, "value");
        i.setAnyProperty$default(this, "value", obj, null, true, 4, null);
    }
}
