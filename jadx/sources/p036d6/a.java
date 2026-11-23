package p036d6;

import p208v6.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private final String id;
    private final f status;

    public a(String str, f fVar) {
        i.f(fVar, "status");
        this.id = str;
        this.status = fVar;
    }

    public final String getId() {
        return this.id;
    }

    public final f getStatus() {
        return this.status;
    }
}
