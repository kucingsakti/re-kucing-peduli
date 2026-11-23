package H6;

import A1.C0099h;
import com.rollbar.api.payload.data.Level;
import com.rollbar.notifier.sender.BufferedSender;
import com.rollbar.notifier.sender.json.JsonSerializerImpl;
import za.c;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f1925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f1926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f1927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public E6.a f1928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public I6.a f1929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f1930i;
    public BufferedSender j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final JsonSerializerImpl f1931k = new JsonSerializerImpl();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1932l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f1933m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0099h f1934n;

    public b(String str) {
        this.a = str;
        C0099h c0099h = new C0099h(8, false);
        c0099h.f103t = Level.WARNING;
        c0099h.f104u = Level.CRITICAL;
        c0099h.f105v = Level.ERROR;
        this.f1934n = c0099h;
    }
}
