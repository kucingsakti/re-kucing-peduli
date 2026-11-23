package p050f1;

import java.util.Set;
import java.util.UUID;
import o1.o;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public final UUID a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f11418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f11419c;

    public r(UUID uuid, o oVar, Set set) {
        i.f(uuid, "id");
        i.f(oVar, "workSpec");
        i.f(set, "tags");
        this.a = uuid;
        this.f11418b = oVar;
        this.f11419c = set;
    }
}
