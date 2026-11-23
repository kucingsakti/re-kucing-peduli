package p085i7;

import K0.d;
import K0.m;
import P0.j;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.tonyodev.fetch2.database.DownloadInfo;
import kotlin.NoWhenBranchMatchedException;
import o1.o;
import p050f1.g;
import p239z.e;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12288e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(m mVar, int i10) {
        super(mVar);
        this.f12288e = i10;
    }

    @Override // K0.q
    public final String c() {
        switch (this.f12288e) {
            case 0:
                return "DELETE FROM `requests` WHERE `_id` = ?";
            default:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    @Override // K0.d
    public final void f(j jVar, Object obj) throws Throwable {
        int i10;
        switch (this.f12288e) {
            case 0:
                jVar.I(1, ((DownloadInfo) obj).f10360s);
                return;
            default:
                o oVar = (o) obj;
                String str = oVar.a;
                int i11 = 1;
                if (str == null) {
                    jVar.v(1);
                } else {
                    jVar.m(1, str);
                }
                jVar.I(2, C3.b.O(oVar.f13646b));
                String str2 = oVar.f13647c;
                if (str2 == null) {
                    jVar.v(3);
                } else {
                    jVar.m(3, str2);
                }
                String str3 = oVar.f13648d;
                if (str3 == null) {
                    jVar.v(4);
                } else {
                    jVar.m(4, str3);
                }
                byte[] bArrC = g.c(oVar.f13649e);
                if (bArrC == null) {
                    jVar.v(5);
                } else {
                    jVar.M(5, bArrC);
                }
                byte[] bArrC2 = g.c(oVar.f13650f);
                if (bArrC2 == null) {
                    jVar.v(6);
                } else {
                    jVar.M(6, bArrC2);
                }
                jVar.I(7, oVar.f13651g);
                jVar.I(8, oVar.f13652h);
                jVar.I(9, oVar.f13653i);
                jVar.I(10, oVar.f13654k);
                int i12 = oVar.f13655l;
                AbstractC0487g.p(i12, "backoffPolicy");
                int iD = e.d(i12);
                if (iD == 0) {
                    i10 = 0;
                } else {
                    if (iD != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i10 = 1;
                }
                jVar.I(11, i10);
                jVar.I(12, oVar.f13656m);
                jVar.I(13, oVar.f13657n);
                jVar.I(14, oVar.f13658o);
                jVar.I(15, oVar.f13659p);
                jVar.I(16, oVar.f13660q ? 1L : 0L);
                int i13 = oVar.f13661r;
                AbstractC0487g.p(i13, "policy");
                int iD2 = e.d(i13);
                if (iD2 == 0) {
                    i11 = 0;
                } else if (iD2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                jVar.I(17, i11);
                jVar.I(18, oVar.f13662s);
                jVar.I(19, oVar.f13663t);
                p050f1.d dVar = oVar.j;
                if (dVar != null) {
                    jVar.I(20, C3.b.K(dVar.a));
                    jVar.I(21, dVar.f11397b ? 1L : 0L);
                    jVar.I(22, dVar.f11398c ? 1L : 0L);
                    jVar.I(23, dVar.f11399d ? 1L : 0L);
                    jVar.I(24, dVar.f11400e ? 1L : 0L);
                    jVar.I(25, dVar.f11401f);
                    jVar.I(26, dVar.f11402g);
                    jVar.M(27, C3.b.M(dVar.f11403h));
                } else {
                    jVar.v(20);
                    jVar.v(21);
                    jVar.v(22);
                    jVar.v(23);
                    jVar.v(24);
                    jVar.v(25);
                    jVar.v(26);
                    jVar.v(27);
                }
                String str4 = oVar.a;
                if (str4 == null) {
                    jVar.v(28);
                    return;
                } else {
                    jVar.m(28, str4);
                    return;
                }
        }
    }
}
