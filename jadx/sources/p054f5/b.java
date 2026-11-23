package p054f5;

import java.util.Locale;
import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final String CHINESE = "zh";
    public static final a Companion = new a(null);
    private static final String HEBREW_CORRECTED = "he";
    private static final String HEBREW_INCORRECT = "iw";
    private static final String INDONESIAN_CORRECTED = "id";
    private static final String INDONESIAN_INCORRECT = "in";
    private static final String YIDDISH_CORRECTED = "yi";
    private static final String YIDDISH_INCORRECT = "ji";

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public final String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        if (language != null) {
            int iHashCode = language.hashCode();
            if (iHashCode != 3365) {
                if (iHashCode != 3374) {
                    if (iHashCode != 3391) {
                        if (iHashCode == 3886 && language.equals(CHINESE)) {
                            return language + '-' + Locale.getDefault().getCountry();
                        }
                    } else if (language.equals(YIDDISH_INCORRECT)) {
                        return YIDDISH_CORRECTED;
                    }
                } else if (language.equals(HEBREW_INCORRECT)) {
                    return HEBREW_CORRECTED;
                }
            } else if (language.equals("in")) {
                return INDONESIAN_CORRECTED;
            }
        }
        i.e(language, "language");
        return language;
    }
}
