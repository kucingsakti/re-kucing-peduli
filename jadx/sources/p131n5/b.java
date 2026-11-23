package p131n5;

import p210v8.e;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    NONE,
    FATAL,
    ERROR,
    WARN,
    INFO,
    DEBUG,
    VERBOSE;

    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final b fromInt(int i10) {
            return b.values()[i10];
        }

        private a() {
        }
    }

    public static final b fromInt(int i10) {
        return Companion.fromInt(i10);
    }
}
