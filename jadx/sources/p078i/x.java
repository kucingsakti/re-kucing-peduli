package p078i;

import Q.h;
import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static h b(Configuration configuration) {
        return h.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(h hVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(hVar.a.a()));
    }

    public static void d(Configuration configuration, h hVar) {
        configuration.setLocales(LocaleList.forLanguageTags(hVar.a.a()));
    }
}
