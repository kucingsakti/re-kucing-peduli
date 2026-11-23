package L9;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Pattern f2855s;

    public e(String str) {
        Pattern patternCompile = Pattern.compile(str);
        p210v8.i.e(patternCompile, "compile(...)");
        this.f2855s = patternCompile;
    }

    public final boolean a(String str) {
        p210v8.i.f(str, "input");
        return this.f2855s.matcher(str).matches();
    }

    public final String toString() {
        String string = this.f2855s.toString();
        p210v8.i.e(string, "toString(...)");
        return string;
    }
}
