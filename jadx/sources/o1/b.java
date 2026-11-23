package o1;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends K0.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13621e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(K0.m mVar, int i10) {
        super(mVar);
        this.f13621e = i10;
    }

    @Override // K0.q
    public final String c() {
        switch (this.f13621e) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    @Override // K0.d
    public final void f(P0.j jVar, Object obj) throws Throwable {
        int i10;
        switch (this.f13621e) {
            case 0:
                a aVar = (a) obj;
                jVar.m(1, aVar.a);
                String str = aVar.f13620b;
                if (str == null) {
                    jVar.v(2);
                    return;
                } else {
                    jVar.m(2, str);
                    return;
                }
            case 1:
                d dVar = (d) obj;
                jVar.m(1, dVar.a);
                jVar.I(2, dVar.f13625b.longValue());
                return;
            case 2:
                g gVar = (g) obj;
                String str2 = gVar.a;
                if (str2 == null) {
                    jVar.v(1);
                } else {
                    jVar.m(1, str2);
                }
                jVar.I(2, gVar.f13629b);
                jVar.I(3, gVar.f13630c);
                return;
            case 3:
                j jVar2 = (j) obj;
                String str3 = jVar2.a;
                if (str3 == null) {
                    jVar.v(1);
                } else {
                    jVar.m(1, str3);
                }
                jVar.m(2, jVar2.f13637b);
                return;
            case 4:
                l lVar = (l) obj;
                String str4 = lVar.a;
                if (str4 == null) {
                    jVar.v(1);
                } else {
                    jVar.m(1, str4);
                }
                byte[] bArrC = p050f1.g.c(lVar.f13640b);
                if (bArrC == null) {
                    jVar.v(2);
                    return;
                } else {
                    jVar.M(2, bArrC);
                    return;
                }
            case 5:
                o oVar = (o) obj;
                int i11 = 1;
                String str5 = oVar.a;
                if (str5 == null) {
                    jVar.v(1);
                } else {
                    jVar.m(1, str5);
                }
                jVar.I(2, C3.b.O(oVar.f13646b));
                String str6 = oVar.f13647c;
                if (str6 == null) {
                    jVar.v(3);
                } else {
                    jVar.m(3, str6);
                }
                String str7 = oVar.f13648d;
                if (str7 == null) {
                    jVar.v(4);
                } else {
                    jVar.m(4, str7);
                }
                byte[] bArrC2 = p050f1.g.c(oVar.f13649e);
                if (bArrC2 == null) {
                    jVar.v(5);
                } else {
                    jVar.M(5, bArrC2);
                }
                byte[] bArrC3 = p050f1.g.c(oVar.f13650f);
                if (bArrC3 == null) {
                    jVar.v(6);
                } else {
                    jVar.M(6, bArrC3);
                }
                jVar.I(7, oVar.f13651g);
                jVar.I(8, oVar.f13652h);
                jVar.I(9, oVar.f13653i);
                jVar.I(10, oVar.f13654k);
                int i12 = oVar.f13655l;
                AbstractC0487g.p(i12, "backoffPolicy");
                int iD = p239z.e.d(i12);
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
                int iD2 = p239z.e.d(i13);
                if (iD2 == 0) {
                    i11 = 0;
                } else if (iD2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                jVar.I(17, i11);
                jVar.I(18, oVar.f13662s);
                jVar.I(19, oVar.f13663t);
                p050f1.d dVar2 = oVar.j;
                if (dVar2 != null) {
                    jVar.I(20, C3.b.K(dVar2.a));
                    jVar.I(21, dVar2.f11397b ? 1L : 0L);
                    jVar.I(22, dVar2.f11398c ? 1L : 0L);
                    jVar.I(23, dVar2.f11399d ? 1L : 0L);
                    jVar.I(24, dVar2.f11400e ? 1L : 0L);
                    jVar.I(25, dVar2.f11401f);
                    jVar.I(26, dVar2.f11402g);
                    jVar.M(27, C3.b.M(dVar2.f11403h));
                    return;
                }
                jVar.v(20);
                jVar.v(21);
                jVar.v(22);
                jVar.v(23);
                jVar.v(24);
                jVar.v(25);
                jVar.v(26);
                jVar.v(27);
                return;
            default:
                q qVar = (q) obj;
                String str8 = qVar.a;
                if (str8 == null) {
                    jVar.v(1);
                } else {
                    jVar.m(1, str8);
                }
                jVar.m(2, qVar.f13673b);
                return;
        }
    }
}
