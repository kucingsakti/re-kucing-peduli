package p085i7;

import K0.m;
import K0.q;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class d extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(m mVar, int i10) {
        super(mVar);
        this.f12290e = i10;
    }

    @Override // K0.q
    public final String c() {
        switch (this.f12290e) {
            case 0:
                return "DELETE FROM requests";
            case 1:
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            case 2:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            case 3:
                return "DELETE from WorkProgress where work_spec_id=?";
            case 4:
                return "DELETE FROM WorkProgress";
            case 5:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            case 6:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            case 7:
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            case 8:
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            case 9:
                return "DELETE FROM workspec WHERE id=?";
            case 10:
                return "UPDATE workspec SET state=? WHERE id=?";
            case 11:
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return "UPDATE workspec SET output=? WHERE id=?";
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            case 15:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            default:
                return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }
}
