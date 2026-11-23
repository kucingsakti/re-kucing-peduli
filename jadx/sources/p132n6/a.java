package p132n6;

import java.util.List;
import java.util.Map;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private final Map<String, String> identities;
    private final f properties;
    private final List<h> subscriptions;

    public a(Map<String, String> map, f fVar, List<h> list) {
        i.f(map, "identities");
        i.f(fVar, "properties");
        i.f(list, "subscriptions");
        this.identities = map;
        this.properties = fVar;
        this.subscriptions = list;
    }

    public final Map<String, String> getIdentities() {
        return this.identities;
    }

    public final f getProperties() {
        return this.properties;
    }

    public final List<h> getSubscriptions() {
        return this.subscriptions;
    }
}
