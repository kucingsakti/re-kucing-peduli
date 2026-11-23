package p094j7;

import P0.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends L0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11, int i12) {
        super(i10, i11);
        this.f12506c = i12;
    }

    @Override // L0.a
    public final void a(c cVar) {
        switch (this.f12506c) {
            case 0:
                cVar.h("ALTER TABLE 'requests' ADD COLUMN '_extras' TEXT NOT NULL DEFAULT '{}'");
                break;
            case 1:
                cVar.h("ALTER TABLE 'requests' ADD COLUMN '_download_on_enqueue' INTEGER NOT NULL DEFAULT 1");
                break;
            case 2:
                cVar.h("ALTER TABLE 'requests' ADD COLUMN '_tag' TEXT NULL DEFAULT NULL");
                break;
            case 3:
                cVar.h("ALTER TABLE 'requests' ADD COLUMN '_auto_retry_max_attempts' INTEGER NOT NULL DEFAULT '0'");
                cVar.h("ALTER TABLE 'requests' ADD COLUMN '_auto_retry_attempts' INTEGER NOT NULL DEFAULT '0'");
                break;
            case 4:
                cVar.h("ALTER TABLE 'requests' ADD COLUMN '_identifier' INTEGER NOT NULL DEFAULT 0");
                break;
            default:
                cVar.h("ALTER TABLE 'requests' ADD COLUMN '_enqueue_action' INTEGER NOT NULL DEFAULT 0");
                break;
        }
    }
}
