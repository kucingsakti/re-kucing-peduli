package p070h0;

import java.util.Map;
import p200u8.b;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k implements b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f11634s = new a(1);

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        i.f(entry, "entry");
        return "  " + ((e) entry.getKey()).a + " = " + entry.getValue();
    }
}
