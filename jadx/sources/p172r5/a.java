package p172r5;

import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.List;
import java.util.Map;
import p086i8.l;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a INSTANCE = new a();
    private static final List<String> PREFERRED_VARIANT_ORDER = l.C(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID, "app", "all");

    private a() {
    }

    public final String variantIdForMessage(com.onesignal.inAppMessages.internal.a aVar, p043e5.a aVar2) {
        i.f(aVar, "message");
        i.f(aVar2, "languageContext");
        String language = aVar2.getLanguage();
        for (String str : PREFERRED_VARIANT_ORDER) {
            if (aVar.getVariants().containsKey(str)) {
                Map<String, String> map = aVar.getVariants().get(str);
                i.c(map);
                Map<String, String> map2 = map;
                if (!map2.containsKey(language)) {
                    language = "default";
                }
                return map2.get(language);
            }
        }
        return null;
    }
}
