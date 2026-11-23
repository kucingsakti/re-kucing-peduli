package p151p5;

import L9.n;
import p210v8.e;

/* JADX INFO: loaded from: classes.dex */
public enum k {
    IN_APP_WEBVIEW("webview"),
    BROWSER("browser"),
    REPLACE_CONTENT("replacement");

    public static final a Companion = new a(null);
    private final String text;

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final k fromString(String str) {
            for (k kVar : k.values()) {
                if (n.C(kVar.text, str, true)) {
                    return kVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    k(String str) {
        this.text = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
