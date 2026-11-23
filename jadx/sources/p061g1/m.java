package p061g1;

import A1.J;
import K0.n;
import M0.b;
import M0.d;
import M0.e;
import P0.c;
import androidx.work.impl.WorkDatabase_Impl;
import com.tonyodev.fetch2.database.DownloadDatabase_Impl;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p181s3.a;

/* JADX INFO: loaded from: classes.dex */
public final class m extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11493b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K0.m f11494c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(DownloadDatabase_Impl downloadDatabase_Impl) {
        super(7);
        this.f11494c = downloadDatabase_Impl;
    }

    @Override // K0.n
    public final void a(c cVar) {
        switch (this.f11493b) {
            case 0:
                cVar.h("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                cVar.h("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                cVar.h("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                cVar.h("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                cVar.h("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                cVar.h("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                cVar.h("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                cVar.h("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                cVar.h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                break;
            default:
                cVar.h("CREATE TABLE IF NOT EXISTS `requests` (`_id` INTEGER NOT NULL, `_namespace` TEXT NOT NULL, `_url` TEXT NOT NULL, `_file` TEXT NOT NULL, `_group` INTEGER NOT NULL, `_priority` INTEGER NOT NULL, `_headers` TEXT NOT NULL, `_written_bytes` INTEGER NOT NULL, `_total_bytes` INTEGER NOT NULL, `_status` INTEGER NOT NULL, `_error` INTEGER NOT NULL, `_network_type` INTEGER NOT NULL, `_created` INTEGER NOT NULL, `_tag` TEXT, `_enqueue_action` INTEGER NOT NULL, `_identifier` INTEGER NOT NULL, `_download_on_enqueue` INTEGER NOT NULL, `_extras` TEXT NOT NULL, `_auto_retry_max_attempts` INTEGER NOT NULL, `_auto_retry_attempts` INTEGER NOT NULL, PRIMARY KEY(`_id`))");
                cVar.h("CREATE UNIQUE INDEX IF NOT EXISTS `index_requests__file` ON `requests` (`_file`)");
                cVar.h("CREATE INDEX IF NOT EXISTS `index_requests__group__status` ON `requests` (`_group`, `_status`)");
                cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '460643a974555d792b8f5a6e1a5d323c')");
                break;
        }
    }

    @Override // K0.n
    public final void b(c cVar) {
        switch (this.f11493b) {
            case 0:
                cVar.h("DROP TABLE IF EXISTS `Dependency`");
                cVar.h("DROP TABLE IF EXISTS `WorkSpec`");
                cVar.h("DROP TABLE IF EXISTS `WorkTag`");
                cVar.h("DROP TABLE IF EXISTS `SystemIdInfo`");
                cVar.h("DROP TABLE IF EXISTS `WorkName`");
                cVar.h("DROP TABLE IF EXISTS `WorkProgress`");
                cVar.h("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f11494c;
                ArrayList arrayList = workDatabase_Impl.f2560f;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((b) workDatabase_Impl.f2560f.get(i10)).getClass();
                    }
                }
                break;
            default:
                cVar.h("DROP TABLE IF EXISTS `requests`");
                DownloadDatabase_Impl downloadDatabase_Impl = (DownloadDatabase_Impl) this.f11494c;
                ArrayList arrayList2 = downloadDatabase_Impl.f2560f;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((b) downloadDatabase_Impl.f2560f.get(i11)).getClass();
                    }
                }
                break;
        }
    }

    @Override // K0.n
    public final void m(c cVar) {
        switch (this.f11493b) {
            case 0:
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f11494c;
                ArrayList arrayList = workDatabase_Impl.f2560f;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((b) workDatabase_Impl.f2560f.get(i10)).getClass();
                    }
                }
                break;
            default:
                DownloadDatabase_Impl downloadDatabase_Impl = (DownloadDatabase_Impl) this.f11494c;
                ArrayList arrayList2 = downloadDatabase_Impl.f2560f;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((b) downloadDatabase_Impl.f2560f.get(i11)).getClass();
                    }
                }
                break;
        }
    }

    @Override // K0.n
    public final void n(c cVar) {
        switch (this.f11493b) {
            case 0:
                ((WorkDatabase_Impl) this.f11494c).a = cVar;
                cVar.h("PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) this.f11494c).k(cVar);
                ArrayList arrayList = ((WorkDatabase_Impl) this.f11494c).f2560f;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((b) ((WorkDatabase_Impl) this.f11494c).f2560f.get(i10)).a(cVar);
                    }
                }
                break;
            default:
                ((DownloadDatabase_Impl) this.f11494c).a = cVar;
                ((DownloadDatabase_Impl) this.f11494c).k(cVar);
                ArrayList arrayList2 = ((DownloadDatabase_Impl) this.f11494c).f2560f;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((b) ((DownloadDatabase_Impl) this.f11494c).f2560f.get(i11)).a(cVar);
                    }
                }
                break;
        }
    }

    @Override // K0.n
    public final void o(c cVar) throws IOException {
        switch (this.f11493b) {
            case 0:
                a.f(cVar);
                break;
            default:
                a.f(cVar);
                break;
        }
    }

    @Override // K0.n
    public final J p(c cVar) throws IOException {
        switch (this.f11493b) {
            case 0:
                HashMap map = new HashMap(2);
                map.put("work_spec_id", new M0.a("work_spec_id", "TEXT", true, 1, null, 1));
                map.put("prerequisite_id", new M0.a("prerequisite_id", "TEXT", true, 2, null, 1));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                hashSet.add(new b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                hashSet2.add(new d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
                e eVar = new e("Dependency", map, hashSet, hashSet2);
                e eVarA = e.a(cVar, "Dependency");
                if (!eVar.equals(eVarA)) {
                    return new J(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + eVarA);
                }
                HashMap map2 = new HashMap(27);
                map2.put("id", new M0.a("id", "TEXT", true, 1, null, 1));
                map2.put(AdOperationMetric.INIT_STATE, new M0.a(AdOperationMetric.INIT_STATE, "INTEGER", true, 0, null, 1));
                map2.put("worker_class_name", new M0.a("worker_class_name", "TEXT", true, 0, null, 1));
                map2.put("input_merger_class_name", new M0.a("input_merger_class_name", "TEXT", false, 0, null, 1));
                map2.put("input", new M0.a("input", "BLOB", true, 0, null, 1));
                map2.put("output", new M0.a("output", "BLOB", true, 0, null, 1));
                map2.put("initial_delay", new M0.a("initial_delay", "INTEGER", true, 0, null, 1));
                map2.put("interval_duration", new M0.a("interval_duration", "INTEGER", true, 0, null, 1));
                map2.put("flex_duration", new M0.a("flex_duration", "INTEGER", true, 0, null, 1));
                map2.put("run_attempt_count", new M0.a("run_attempt_count", "INTEGER", true, 0, null, 1));
                map2.put("backoff_policy", new M0.a("backoff_policy", "INTEGER", true, 0, null, 1));
                map2.put("backoff_delay_duration", new M0.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
                map2.put("last_enqueue_time", new M0.a("last_enqueue_time", "INTEGER", true, 0, null, 1));
                map2.put("minimum_retention_duration", new M0.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
                map2.put("schedule_requested_at", new M0.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
                map2.put("run_in_foreground", new M0.a("run_in_foreground", "INTEGER", true, 0, null, 1));
                map2.put("out_of_quota_policy", new M0.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
                map2.put("period_count", new M0.a("period_count", "INTEGER", true, 0, "0", 1));
                map2.put("generation", new M0.a("generation", "INTEGER", true, 0, "0", 1));
                map2.put("required_network_type", new M0.a("required_network_type", "INTEGER", true, 0, null, 1));
                map2.put("requires_charging", new M0.a("requires_charging", "INTEGER", true, 0, null, 1));
                map2.put("requires_device_idle", new M0.a("requires_device_idle", "INTEGER", true, 0, null, 1));
                map2.put("requires_battery_not_low", new M0.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
                map2.put("requires_storage_not_low", new M0.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
                map2.put("trigger_content_update_delay", new M0.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
                map2.put("trigger_max_content_delay", new M0.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
                map2.put("content_uri_triggers", new M0.a("content_uri_triggers", "BLOB", true, 0, null, 1));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(2);
                hashSet4.add(new d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
                hashSet4.add(new d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
                e eVar2 = new e("WorkSpec", map2, hashSet3, hashSet4);
                e eVarA2 = e.a(cVar, "WorkSpec");
                if (!eVar2.equals(eVarA2)) {
                    return new J(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + eVarA2);
                }
                HashMap map3 = new HashMap(2);
                map3.put("tag", new M0.a("tag", "TEXT", true, 1, null, 1));
                map3.put("work_spec_id", new M0.a("work_spec_id", "TEXT", true, 2, null, 1));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                e eVar3 = new e("WorkTag", map3, hashSet5, hashSet6);
                e eVarA3 = e.a(cVar, "WorkTag");
                if (!eVar3.equals(eVarA3)) {
                    return new J(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + eVarA3);
                }
                HashMap map4 = new HashMap(3);
                map4.put("work_spec_id", new M0.a("work_spec_id", "TEXT", true, 1, null, 1));
                map4.put("generation", new M0.a("generation", "INTEGER", true, 2, "0", 1));
                map4.put("system_id", new M0.a("system_id", "INTEGER", true, 0, null, 1));
                HashSet hashSet7 = new HashSet(1);
                hashSet7.add(new b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                e eVar4 = new e("SystemIdInfo", map4, hashSet7, new HashSet(0));
                e eVarA4 = e.a(cVar, "SystemIdInfo");
                if (!eVar4.equals(eVarA4)) {
                    return new J(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + eVarA4);
                }
                HashMap map5 = new HashMap(2);
                map5.put(MediationMetaData.KEY_NAME, new M0.a(MediationMetaData.KEY_NAME, "TEXT", true, 1, null, 1));
                map5.put("work_spec_id", new M0.a("work_spec_id", "TEXT", true, 2, null, 1));
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet9 = new HashSet(1);
                hashSet9.add(new d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                e eVar5 = new e("WorkName", map5, hashSet8, hashSet9);
                e eVarA5 = e.a(cVar, "WorkName");
                if (!eVar5.equals(eVarA5)) {
                    return new J(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + eVarA5);
                }
                HashMap map6 = new HashMap(2);
                map6.put("work_spec_id", new M0.a("work_spec_id", "TEXT", true, 1, null, 1));
                map6.put("progress", new M0.a("progress", "BLOB", true, 0, null, 1));
                HashSet hashSet10 = new HashSet(1);
                hashSet10.add(new b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                e eVar6 = new e("WorkProgress", map6, hashSet10, new HashSet(0));
                e eVarA6 = e.a(cVar, "WorkProgress");
                if (!eVar6.equals(eVarA6)) {
                    return new J(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + eVarA6);
                }
                HashMap map7 = new HashMap(2);
                map7.put("key", new M0.a("key", "TEXT", true, 1, null, 1));
                map7.put("long_value", new M0.a("long_value", "INTEGER", false, 0, null, 1));
                e eVar7 = new e("Preference", map7, new HashSet(0), new HashSet(0));
                e eVarA7 = e.a(cVar, "Preference");
                if (eVar7.equals(eVarA7)) {
                    return new J(true, (String) null);
                }
                return new J(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + eVarA7);
            default:
                HashMap map8 = new HashMap(20);
                map8.put("_id", new M0.a("_id", "INTEGER", true, 1, null, 1));
                map8.put("_namespace", new M0.a("_namespace", "TEXT", true, 0, null, 1));
                map8.put("_url", new M0.a("_url", "TEXT", true, 0, null, 1));
                map8.put("_file", new M0.a("_file", "TEXT", true, 0, null, 1));
                map8.put("_group", new M0.a("_group", "INTEGER", true, 0, null, 1));
                map8.put("_priority", new M0.a("_priority", "INTEGER", true, 0, null, 1));
                map8.put("_headers", new M0.a("_headers", "TEXT", true, 0, null, 1));
                map8.put("_written_bytes", new M0.a("_written_bytes", "INTEGER", true, 0, null, 1));
                map8.put("_total_bytes", new M0.a("_total_bytes", "INTEGER", true, 0, null, 1));
                map8.put("_status", new M0.a("_status", "INTEGER", true, 0, null, 1));
                map8.put("_error", new M0.a("_error", "INTEGER", true, 0, null, 1));
                map8.put("_network_type", new M0.a("_network_type", "INTEGER", true, 0, null, 1));
                map8.put("_created", new M0.a("_created", "INTEGER", true, 0, null, 1));
                map8.put("_tag", new M0.a("_tag", "TEXT", false, 0, null, 1));
                map8.put("_enqueue_action", new M0.a("_enqueue_action", "INTEGER", true, 0, null, 1));
                map8.put("_identifier", new M0.a("_identifier", "INTEGER", true, 0, null, 1));
                map8.put("_download_on_enqueue", new M0.a("_download_on_enqueue", "INTEGER", true, 0, null, 1));
                map8.put("_extras", new M0.a("_extras", "TEXT", true, 0, null, 1));
                map8.put("_auto_retry_max_attempts", new M0.a("_auto_retry_max_attempts", "INTEGER", true, 0, null, 1));
                map8.put("_auto_retry_attempts", new M0.a("_auto_retry_attempts", "INTEGER", true, 0, null, 1));
                HashSet hashSet11 = new HashSet(0);
                HashSet hashSet12 = new HashSet(2);
                hashSet12.add(new d("index_requests__file", true, Arrays.asList("_file")));
                hashSet12.add(new d("index_requests__group__status", false, Arrays.asList("_group", "_status")));
                e eVar8 = new e("requests", map8, hashSet11, hashSet12);
                e eVarA8 = e.a(cVar, "requests");
                if (eVar8.equals(eVarA8)) {
                    return new J(true, (String) null);
                }
                return new J(false, "requests(com.tonyodev.fetch2.database.DownloadInfo).\n Expected:\n" + eVar8 + "\n Found:\n" + eVarA8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(WorkDatabase_Impl workDatabase_Impl) {
        super(16);
        this.f11494c = workDatabase_Impl;
    }
}
