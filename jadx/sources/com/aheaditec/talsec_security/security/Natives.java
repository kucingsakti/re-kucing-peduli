package com.aheaditec.talsec_security.security;

import R5.a;
import android.content.Context;
import android.util.Pair;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.kcstream.cing.MainApp;
import java.security.cert.X509Certificate;
import kotlin.Metadata;
import p086i8.C;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJJ\u0010\u0013\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0015\u0010\u0004J(\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082 ¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082 ¢\u0006\u0004\b\u001c\u0010\u001aJ4\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082 ¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"H\u0082 ¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b%\u0010\u0004J\u0018\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/aheaditec/talsec_security/security/Natives;", "", "", a.PUSH_ADDITIONAL_DATA_KEY, "()Z", "", "", "b", "()[Ljava/lang/String;", "apks", "c", "([Ljava/lang/String;)Z", "endpointUrl", "authorizationHeader", "appiCryptHeader", "request", "sslCaBundlePath", "sdkIdentifierHeader", "", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B", "f", "Landroid/content/Context;", "context", "allowedPkgNames", "h", "(Landroid/content/Context;[Ljava/lang/String;)Ljava/lang/String;", "allowedStores", "i", "appHashes", "Landroid/util/Pair;", "Ljava/security/cert/X509Certificate;", "j", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/util/Pair;", "", "l", "()[I", "m", "packageResourcePath", "", a.PUSH_MINIFIED_BUTTON_TEXT, "(Ljava/lang/String;)I", "TalsecSecurity_v14.0.1_basicRelease"}, k = 1, mv = {1, 7, 1})
public final class Natives {
    public static final Natives a = new Natives();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final native boolean j();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final native String[] h();

    private final native boolean c(String[] apks);

    private final native byte[] d(String endpointUrl, String authorizationHeader, String appiCryptHeader, String request, String sslCaBundlePath, String sdkIdentifierHeader);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final native boolean k();

    private final native String h(Context context, String[] allowedPkgNames);

    private final native String i(Context context, String[] allowedStores);

    private final native Pair<String, X509Certificate> j(Context context, String[] appHashes);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final native int[] i();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final native boolean o();

    private final native int n(String packageResourcePath);

    public final int a(String str) {
        C.a(C.c("1063B7C20BE2C0958364001D894E7104C2DDA6"));
        return n(str);
    }

    public final Pair b(MainApp mainApp, String[] strArr) {
        C.a(C.c("036DBADD0FFDD1"));
        i.f(strArr, C.a(C.c("0172A4E10BF6CDA295")));
        return j(mainApp, strArr);
    }

    public final boolean d(String[] strArr) {
        C.a(C.c("0172BFDA"));
        return c(strArr);
    }

    public final byte[] e(String str, String str2, String str3, String str4) {
        C.a(C.c("0463A0C8"));
        return d(str2, null, null, str, str3, str4);
    }

    public final String f(MainApp mainApp, String[] strArr) {
        AbstractC0487g.r("036DBADD0FFDD1", "016EB8C61DE0C1978D702109964867");
        return h(mainApp, strArr);
    }

    public final String g(MainApp mainApp, String[] strArr) {
        C.a(C.c("036DBADD0FFDD1"));
        i.f(strArr, C.a(C.c("016EB8C61DE0C19492781D0D88")));
        return i(mainApp, strArr);
    }
}
