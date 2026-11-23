package p061g1;

import P0.c;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b a = new b();

    public final void a(c cVar) {
        cVar.a();
        try {
            cVar.h("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - k.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            cVar.o();
        } finally {
            cVar.g();
        }
    }
}
