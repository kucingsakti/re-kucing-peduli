package p132n6;

import L9.n;
import com.onesignal.inAppMessages.internal.display.impl.k;
import kotlin.NoWhenBranchMatchedException;
import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public enum j {
    IOS_PUSH("iOSPush"),
    ANDROID_PUSH("AndroidPush"),
    FIREOS_PUSH("FireOSPush"),
    CHROME_EXTENSION("ChromeExtensionPush"),
    CHROME_PUSH("ChromePush"),
    WINDOWS_PUSH("WindowsPush"),
    SAFARI_PUSH("SafariPush"),
    SAFARI_PUSH_LEGACY("SafariLegacyPush"),
    FIREFOX_PUSH("FirefoxPush"),
    MACOS_PUSH("macOSPush"),
    EMAIL("Email"),
    HUAWEI_PUSH("HuaweiPush"),
    SMS("SMS");

    public static final a Companion = new a(null);
    private final String value;

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final j fromDeviceType(p025c5.a aVar) {
            i.f(aVar, k.EVENT_TYPE_KEY);
            int i10 = i.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i10 == 1) {
                return j.ANDROID_PUSH;
            }
            if (i10 == 2) {
                return j.FIREOS_PUSH;
            }
            if (i10 == 3) {
                return j.HUAWEI_PUSH;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final j fromString(String str) {
            i.f(str, k.EVENT_TYPE_KEY);
            for (j jVar : j.values()) {
                if (n.C(jVar.getValue(), str, true)) {
                    return jVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    j(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
