package g2;

import com.rollbar.notifier.sender.SyncSender;
import i2.k;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f11525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f11526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f11528f;
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11529b;

    static {
        String strT = qa.b.t("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f11525c = strT;
        String strT2 = qa.b.t("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strT3 = qa.b.t("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f11526d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new p051f2.c("proto"), new p051f2.c("json"))));
        f11527e = new a(strT, null);
        f11528f = new a(strT2, strT3);
    }

    public a(String str, String str2) {
        this.a = str;
        this.f11529b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName(SyncSender.UTF_8));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
