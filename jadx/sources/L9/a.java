package L9;

import com.rollbar.notifier.sender.SyncSender;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Charset a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f2842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Charset f2843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Charset f2844d;

    static {
        Charset charsetForName = Charset.forName(SyncSender.UTF_8);
        p210v8.i.e(charsetForName, "forName(...)");
        a = charsetForName;
        p210v8.i.e(Charset.forName("UTF-16"), "forName(...)");
        p210v8.i.e(Charset.forName("UTF-16BE"), "forName(...)");
        p210v8.i.e(Charset.forName("UTF-16LE"), "forName(...)");
        Charset charsetForName2 = Charset.forName("US-ASCII");
        p210v8.i.e(charsetForName2, "forName(...)");
        f2842b = charsetForName2;
        p210v8.i.e(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
