package p140o4;

import E0.a;
import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f13793d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13795c;

    public u(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f13793d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(a.i("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.a = strSubstring;
        this.f13794b = str;
        this.f13795c = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a.equals(uVar.a) && this.f13794b.equals(uVar.f13794b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13794b, this.a});
    }
}
