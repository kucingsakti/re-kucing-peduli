package p101k6;

import p005a5.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a INSTANCE = new a();

    private a() {
    }

    public final void run(d dVar) {
        i.f(dVar, "databaseProvider");
        dVar.getOs().delete("outcome", "name = \"os__session_duration\" AND session_time = 0", null);
    }
}
