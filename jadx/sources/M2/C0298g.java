package M2;

import J0.C0252b;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzaq;
import com.google.android.gms.measurement.internal.zzba;
import com.google.android.gms.measurement.internal.zzbd;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzfj;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzin;
import com.google.android.gms.measurement.internal.zzmu;
import com.google.android.gms.measurement.internal.zznc;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zznp;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: M2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0298g extends m0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0299h f3017v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0252b f3018w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String[] f3014x = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String[] f3015y = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String[] f3016z = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;"};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String[] f3007A = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String[] f3008B = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String[] f3009C = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String[] f3010D = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String[] f3011E = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String[] f3012F = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String[] f3013G = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public C0298g(zznc zzncVar) {
        super(zzncVar);
        this.f3018w = new C0252b(((zzhj) this.f577s).f9120F);
        this.f3017v = new C0299h(this, ((zzhj) this.f577s).f9140s);
    }

    public static void r1(ContentValues contentValues, Object obj) {
        Preconditions.e("value");
        Preconditions.i(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final boolean A1(zzae zzaeVar) {
        W0();
        a1();
        String str = zzaeVar.f8886s;
        Preconditions.i(str);
        if (P1(str, zzaeVar.f8888u.f9313t) == null && G1("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzaeVar.f8887t);
        contentValues.put(MediationMetaData.KEY_NAME, zzaeVar.f8888u.f9313t);
        Object objB = zzaeVar.f8888u.b();
        Preconditions.i(objB);
        r1(contentValues, objB);
        contentValues.put("active", Boolean.valueOf(zzaeVar.f8890w));
        contentValues.put("trigger_event_name", zzaeVar.f8891x);
        contentValues.put("trigger_timeout", Long.valueOf(zzaeVar.f8893z));
        V0();
        contentValues.put("timed_out_event", zznp.M1(zzaeVar.f8892y));
        contentValues.put("creation_timestamp", Long.valueOf(zzaeVar.f8889v));
        V0();
        contentValues.put("triggered_event", zznp.M1(zzaeVar.f8883A));
        contentValues.put("triggered_timestamp", Long.valueOf(zzaeVar.f8888u.f9314u));
        contentValues.put("time_to_live", Long.valueOf(zzaeVar.f8884B));
        V0();
        contentValues.put("expired_event", zznp.M1(zzaeVar.f8885C));
        try {
            if (d1().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            i().f9056x.a(zzfw.a1(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e10) {
            zzfw zzfwVarI = i();
            zzfwVarI.f9056x.c("Error storing conditional user property", zzfw.a1(str), e10);
            return true;
        }
    }

    public final boolean B1(zzba zzbaVar, long j, boolean z6) {
        W0();
        a1();
        String str = zzbaVar.a;
        Preconditions.e(str);
        byte[] bArrL = X0().i1(zzbaVar).l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(MediationMetaData.KEY_NAME, zzbaVar.f8917b);
        contentValues.put("timestamp", Long.valueOf(zzbaVar.f8919d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put(JsonStorageKeyNames.DATA_KEY, bArrL);
        contentValues.put("realtime", Integer.valueOf(z6 ? 1 : 0));
        try {
            if (d1().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            i().f9056x.a(zzfw.a1(str), "Failed to insert raw event (got -1). appId");
            return false;
        } catch (SQLiteException e10) {
            zzfw zzfwVarI = i();
            zzfwVarI.f9056x.c("Error storing raw event. appId", zzfw.a1(str), e10);
            return false;
        }
    }

    public final boolean C1(String str, int i10, zzff.zzb zzbVar) {
        a1();
        W0();
        Preconditions.e(str);
        Preconditions.i(zzbVar);
        if (zzbVar.H().isEmpty()) {
            i().f9047A.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzfw.a1(str), Integer.valueOf(i10), String.valueOf(zzbVar.N() ? Integer.valueOf(zzbVar.D()) : null));
            return false;
        }
        byte[] bArrL = zzbVar.l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", zzbVar.N() ? Integer.valueOf(zzbVar.D()) : null);
        contentValues.put("event_name", zzbVar.H());
        contentValues.put("session_scoped", zzbVar.O() ? Boolean.valueOf(zzbVar.L()) : null);
        contentValues.put(JsonStorageKeyNames.DATA_KEY, bArrL);
        try {
            if (d1().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            i().f9056x.a(zzfw.a1(str), "Failed to insert event filter (got -1). appId");
            return true;
        } catch (SQLiteException e10) {
            i().f9056x.c("Error storing event filter. appId", zzfw.a1(str), e10);
            return false;
        }
    }

    public final boolean D1(String str, int i10, zzff.zze zzeVar) {
        a1();
        W0();
        Preconditions.e(str);
        Preconditions.i(zzeVar);
        if (zzeVar.E().isEmpty()) {
            i().f9047A.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzfw.a1(str), Integer.valueOf(i10), String.valueOf(zzeVar.I() ? Integer.valueOf(zzeVar.z()) : null));
            return false;
        }
        byte[] bArrL = zzeVar.l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", zzeVar.I() ? Integer.valueOf(zzeVar.z()) : null);
        contentValues.put("property_name", zzeVar.E());
        contentValues.put("session_scoped", zzeVar.J() ? Boolean.valueOf(zzeVar.H()) : null);
        contentValues.put(JsonStorageKeyNames.DATA_KEY, bArrL);
        try {
            if (d1().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            i().f9056x.a(zzfw.a1(str), "Failed to insert property filter (got -1). appId");
            return false;
        } catch (SQLiteException e10) {
            i().f9056x.c("Error storing property filter. appId", zzfw.a1(str), e10);
            return false;
        }
    }

    public final boolean E1() {
        return ((zzhj) this.f577s).f9140s.getDatabasePath("google_app_measurement.db").exists();
    }

    public final long F1(String str) {
        Preconditions.e(str);
        Preconditions.e("first_open_count");
        W0();
        a1();
        SQLiteDatabase sQLiteDatabaseD1 = d1();
        sQLiteDatabaseD1.beginTransaction();
        long j = 0;
        try {
            try {
                long jH1 = h1("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (jH1 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseD1.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        i().f9056x.c("Failed to insert column (got -1). appId", zzfw.a1(str), "first_open_count");
                        return -1L;
                    }
                    jH1 = 0;
                    i().f9056x.d("Error inserting column. appId", zzfw.a1(str), "first_open_count", e);
                    return j;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + jH1));
                    if (sQLiteDatabaseD1.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        i().f9056x.c("Failed to update column (got 0). appId", zzfw.a1(str), "first_open_count");
                        return -1L;
                    }
                    sQLiteDatabaseD1.setTransactionSuccessful();
                    return jH1;
                } catch (SQLiteException e10) {
                    long j10 = jH1;
                    e = e10;
                    j = j10;
                }
            } finally {
                sQLiteDatabaseD1.endTransaction();
            }
        } catch (SQLiteException e11) {
            e = e11;
        }
    }

    public final long G1(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = d1().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e10) {
                i().f9056x.c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0108  */
    /* JADX WARN: Code duplicated, block: B:44:0x010e  */
    public final List H1(String str, String str2, String str3) throws Throwable {
        C0298g c0298g;
        String string;
        Preconditions.e(str);
        W0();
        a1();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                String str4 = str;
                arrayList2.add(str4);
                StringBuilder sb = new StringBuilder("app_id=?");
                if (TextUtils.isEmpty(str2)) {
                    string = str2;
                } else {
                    string = str2;
                    try {
                        arrayList2.add(string);
                        sb.append(" and origin=?");
                    } catch (SQLiteException e10) {
                        e = e10;
                        c0298g = this;
                        c0298g.i().f9056x.d("(2)Error querying user properties", zzfw.a1(str), string, e);
                        List list = Collections.EMPTY_LIST;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return list;
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    arrayList2.add(str3 + "*");
                    sb.append(" and name glob ?");
                }
                cursorQuery = d1().query("user_attributes", new String[]{MediationMetaData.KEY_NAME, "set_timestamp", "value", "origin"}, sb.toString(), (String[]) arrayList2.toArray(new String[arrayList2.size()]), null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (arrayList.size() < 1000) {
                    String string2 = cursorQuery.getString(0);
                    long j = cursorQuery.getLong(1);
                    c0298g = this;
                    try {
                        try {
                            Object objJ1 = c0298g.j1(cursorQuery, 2);
                            string = cursorQuery.getString(3);
                            if (objJ1 == null) {
                                c0298g.i().f9056x.d("(2)Read invalid user property value, ignoring it", zzfw.a1(str4), string, str3);
                            } else {
                                arrayList.add(new s0(str4, string, string2, j, objJ1));
                            }
                            if (!cursorQuery.moveToNext()) {
                                cursorQuery.close();
                                return arrayList;
                            }
                            str4 = str;
                        } catch (SQLiteException e11) {
                            e = e11;
                            c0298g.i().f9056x.d("(2)Error querying user properties", zzfw.a1(str), string, e);
                            List list2 = Collections.EMPTY_LIST;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return list2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        throw th;
                    }
                }
                i().f9056x.a(1000, "Read more than the max allowed user properties, ignoring excess");
                cursorQuery.close();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
            c0298g = this;
            string = str2;
        }
    }

    public final void I1(String str, zzin zzinVar) {
        Preconditions.i(str);
        Preconditions.i(zzinVar);
        W0();
        a1();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzinVar.o());
        contentValues.put("consent_source", Integer.valueOf(zzinVar.f9165b));
        q1(contentValues);
    }

    public final void J1(String str, ArrayList arrayList) {
        Preconditions.e(str);
        a1();
        W0();
        SQLiteDatabase sQLiteDatabaseD1 = d1();
        try {
            long jG1 = G1("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, ((zzhj) this.f577s).f9146y.b1(str, zzbf.f8939G)));
            if (jG1 <= iMax) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                if (num == null) {
                    return;
                }
                arrayList2.add(Integer.toString(num.intValue()));
            }
            sQLiteDatabaseD1.delete("audience_filter_values", E0.a.i("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", E0.a.i("(", TextUtils.join(",", arrayList2), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(iMax)});
        } catch (SQLiteException e10) {
            i().f9056x.c("Database error querying filters. appId", zzfw.a1(str), e10);
        }
    }

    public final long K1(String str) {
        Preconditions.e(str);
        W0();
        a1();
        return h1("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    public final long L1(String str) {
        Preconditions.e(str);
        return h1("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final C0302k M1(String str, String str2, String str3) {
        Boolean boolValueOf;
        Preconditions.e(str2);
        Preconditions.e(str3);
        W0();
        a1();
        ?? r10 = "current_bundle_count";
        ?? r11 = 0;
        try {
            try {
                Cursor cursorQuery = d1().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j = cursorQuery.getLong(0);
                    long j10 = cursorQuery.getLong(1);
                    long j11 = cursorQuery.getLong(2);
                    long j12 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                    Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                    Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                    Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                    if (cursorQuery.isNull(7)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                    }
                    C0302k c0302k = new C0302k(str2, str3, j, j10, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j11, j12, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursorQuery.moveToNext()) {
                        i().f9056x.a(zzfw.a1(str2), "Got multiple records for event aggregates, expected one. appId");
                    }
                    cursorQuery.close();
                    return c0302k;
                } catch (SQLiteException e10) {
                    e = e10;
                    r10 = cursorQuery;
                    try {
                        try {
                            i().f9056x.d("Error querying events. appId", zzfw.a1(str2), ((zzhj) this.f577s).f9119E.c(str3), e);
                            if (r10 != 0) {
                                r10.close();
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            r11 = r10;
                            if (r11 != 0) {
                                r11.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = r10;
                        if (r11 != 0) {
                            r11.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r11 = r10;
                if (r11 != 0) {
                    r11.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            r10 = 0;
        } catch (Throwable th4) {
            th = th4;
            if (r11 != 0) {
                r11.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x011b  */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0059: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:90), block:B:14:0x0059 */
    public final zzae N1(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        zzhj zzhjVar = (zzhj) this.f577s;
        Preconditions.e(str);
        Preconditions.e(str2);
        W0();
        a1();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = d1().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objJ1 = j1(cursorQuery, 1);
                    boolean z6 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    zznl zznlVarX0 = X0();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzbd> creator = zzbd.CREATOR;
                    str3 = str2;
                    try {
                        zzae zzaeVar = new zzae(str, str4, new zzno(cursorQuery.getLong(8), objJ1, str3, str4), cursorQuery.getLong(6), z6, string2, (zzbd) zznlVarX0.h1(blob, creator), j, (zzbd) X0().h1(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzbd) X0().h1(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            i().f9056x.c("Got multiple records for conditional property, expected one", zzfw.a1(str), zzhjVar.f9119E.g(str3));
                        }
                        cursorQuery.close();
                        return zzaeVar;
                    } catch (SQLiteException e10) {
                        e = e10;
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        i().f9056x.d("Error querying conditional property", zzfw.a1(str), zzhjVar.f9119E.g(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x043d  */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00b2: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:179), block:B:16:0x00b2 */
    public final C0309s O1(String str) {
        Cursor cursorQuery;
        Cursor cursor;
        Boolean boolValueOf;
        zzhj zzhjVar = (zzhj) this.f577s;
        zznc zzncVar = this.f3055t;
        Preconditions.e(str);
        W0();
        a1();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = d1().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    C0309s c0309s = new C0309s(zzncVar.f9283D, str);
                    zzhj zzhjVar2 = c0309s.a;
                    zznk.a();
                    zzin.zza zzaVar = zzin.zza.ANALYTICS_STORAGE;
                    zzag zzagVar = zzhjVar.f9146y;
                    zzfj zzfjVar = zzbf.f8968V0;
                    if (!zzagVar.h1(null, zzfjVar) || zzncVar.I(str).i(zzaVar)) {
                        c0309s.s(cursorQuery.getString(0));
                    }
                    boolean z6 = true;
                    c0309s.D(cursorQuery.getString(1));
                    zznk.a();
                    if (!zzhjVar.f9146y.h1(null, zzfjVar) || zzncVar.I(str).i(zzin.zza.AD_STORAGE)) {
                        c0309s.H(cursorQuery.getString(2));
                    }
                    c0309s.R(cursorQuery.getLong(3));
                    c0309s.S(cursorQuery.getLong(4));
                    c0309s.Q(cursorQuery.getLong(5));
                    c0309s.y(cursorQuery.getString(6));
                    c0309s.w(cursorQuery.getString(7));
                    c0309s.N(cursorQuery.getLong(8));
                    c0309s.K(cursorQuery.getLong(9));
                    c0309s.t(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    c0309s.J(cursorQuery.getLong(11));
                    c0309s.G(cursorQuery.getLong(12));
                    c0309s.E(cursorQuery.getLong(13));
                    c0309s.A(cursorQuery.getLong(14));
                    c0309s.x(cursorQuery.getLong(15));
                    c0309s.M(cursorQuery.getLong(16));
                    c0309s.r(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    c0309s.B(cursorQuery.getString(18));
                    c0309s.C(cursorQuery.getLong(19));
                    c0309s.I(cursorQuery.getLong(20));
                    c0309s.F(cursorQuery.getString(21));
                    boolean z10 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                    zzhc zzhcVar = zzhjVar2.f9116B;
                    zzhj.g(zzhcVar);
                    zzhcVar.W0();
                    c0309s.f3084Q |= c0309s.f3100p != z10;
                    c0309s.f3100p = z10;
                    c0309s.b(cursorQuery.getString(24));
                    c0309s.L(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        c0309s.c(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
                    zznk.a();
                    if (!zzhjVar.f9146y.h1(null, zzfjVar) || zzncVar.I(str).i(zzaVar)) {
                        String string = cursorQuery.getString(28);
                        zzhc zzhcVar2 = zzhjVar2.f9116B;
                        zzhj.g(zzhcVar2);
                        zzhcVar2.W0();
                        c0309s.f3084Q |= !Objects.equals(c0309s.f3105u, string);
                        c0309s.f3105u = string;
                    }
                    zzpn.a();
                    if (zzhjVar.f9146y.h1(null, zzbf.f9008s0)) {
                        V0();
                        if (zznp.a2(str)) {
                            boolean z11 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                            zzhc zzhcVar3 = zzhjVar2.f9116B;
                            zzhj.g(zzhcVar3);
                            zzhcVar3.W0();
                            c0309s.f3084Q |= c0309s.f3106v != z11;
                            c0309s.f3106v = z11;
                            c0309s.P(cursorQuery.getLong(39));
                            if (zzhjVar.f9146y.h1(null, zzbf.f9010t0)) {
                                String string2 = cursorQuery.getString(36);
                                zzhc zzhcVar4 = zzhjVar2.f9116B;
                                zzhj.g(zzhcVar4);
                                zzhcVar4.W0();
                                c0309s.f3084Q |= c0309s.f3072D != string2;
                                c0309s.f3072D = string2;
                            }
                        }
                    }
                    c0309s.U(cursorQuery.getLong(30));
                    c0309s.T(cursorQuery.getLong(31));
                    zzpg.a();
                    if (zzhjVar.f9146y.h1(str, zzbf.f9022z0)) {
                        int i10 = cursorQuery.getInt(32);
                        zzhc zzhcVar5 = zzhjVar2.f9116B;
                        zzhj.g(zzhcVar5);
                        zzhcVar5.W0();
                        c0309s.f3084Q |= c0309s.f3109y != i10;
                        c0309s.f3109y = i10;
                        c0309s.v(cursorQuery.getLong(35));
                    }
                    com.google.android.gms.internal.measurement.zznl.a();
                    if (zzhjVar.f9146y.h1(str, zzbf.f8948K0)) {
                        boolean z12 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        zzhc zzhcVar6 = zzhjVar2.f9116B;
                        zzhj.g(zzhcVar6);
                        zzhcVar6.W0();
                        c0309s.f3084Q |= c0309s.f3110z != z12;
                        c0309s.f3110z = z12;
                    }
                    if (cursorQuery.isNull(34)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                    }
                    zzhc zzhcVar7 = zzhjVar2.f9116B;
                    zzhj.g(zzhcVar7);
                    zzhcVar7.W0();
                    c0309s.f3084Q |= !Objects.equals(c0309s.f3102r, boolValueOf);
                    c0309s.f3102r = boolValueOf;
                    c0309s.u(cursorQuery.getInt(37));
                    c0309s.q(cursorQuery.getInt(38));
                    zzne.a();
                    if (zzhjVar.f9146y.h1(str, zzbf.f8957P0)) {
                        String string3 = cursorQuery.getString(40);
                        if (string3 == null) {
                            string3 = "";
                        }
                        zzhc zzhcVar8 = zzhjVar2.f9116B;
                        zzhj.g(zzhcVar8);
                        zzhcVar8.W0();
                        c0309s.f3084Q |= c0309s.f3076H != string3;
                        c0309s.f3076H = string3;
                    }
                    if (zzhjVar.f9146y.h1(null, zzbf.f8963S0)) {
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            zzhc zzhcVar9 = zzhjVar2.f9116B;
                            zzhj.g(zzhcVar9);
                            zzhcVar9.W0();
                            c0309s.f3084Q |= !Objects.equals(c0309s.f3069A, lValueOf);
                            c0309s.f3069A = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            zzhc zzhcVar10 = zzhjVar2.f9116B;
                            zzhj.g(zzhcVar10);
                            zzhcVar10.W0();
                            c0309s.f3084Q |= !Objects.equals(c0309s.f3070B, lValueOf2);
                            c0309s.f3070B = lValueOf2;
                        }
                    }
                    zzoj.a();
                    if (zzhjVar.f9146y.h1(str, zzbf.f8952M0)) {
                        byte[] blob = cursorQuery.getBlob(43);
                        zzhc zzhcVar11 = zzhjVar2.f9116B;
                        zzhj.g(zzhcVar11);
                        zzhcVar11.W0();
                        boolean z13 = c0309s.f3084Q;
                        if (c0309s.f3077I == blob) {
                            z6 = false;
                        }
                        c0309s.f3084Q = z13 | z6;
                        c0309s.f3077I = blob;
                    }
                    zzhc zzhcVar12 = zzhjVar2.f9116B;
                    zzhj.g(zzhcVar12);
                    zzhcVar12.W0();
                    c0309s.f3084Q = false;
                    if (cursorQuery.moveToNext()) {
                        i().f9056x.a(zzfw.a1(str), "Got multiple records for app, expected one. appId");
                    }
                    cursorQuery.close();
                    return c0309s;
                } catch (SQLiteException e10) {
                    e = e10;
                    i().f9056x.c("Error querying app. appId", zzfw.a1(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:? A[SYNTHETIC] */
    public final s0 P1(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        Preconditions.e(str);
        Preconditions.e(str2);
        W0();
        a1();
        Cursor cursor = null;
        try {
            cursorQuery = d1().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j = cursorQuery.getLong(0);
                    Object objJ1 = j1(cursorQuery, 1);
                    if (objJ1 == null) {
                        cursorQuery.close();
                        return null;
                    }
                    str3 = str;
                    str4 = str2;
                    try {
                        s0 s0Var = new s0(str3, cursorQuery.getString(2), str4, j, objJ1);
                        if (cursorQuery.moveToNext()) {
                            i().f9056x.a(zzfw.a1(str3), "Got multiple records for user property, expected one. appId");
                        }
                        cursorQuery.close();
                        return s0Var;
                    } catch (SQLiteException e10) {
                        e = e10;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            } catch (SQLiteException e11) {
                e = e11;
                str3 = str;
                str4 = str2;
            }
            sQLiteException = e;
        } catch (SQLiteException e12) {
            str3 = str;
            str4 = str2;
            sQLiteException = e12;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        i().f9056x.d("Error querying user property. appId", zzfw.a1(str3), ((zzhj) this.f577s).f9119E.g(str4), sQLiteException);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final zzin Q1(String str) {
        Preconditions.i(str);
        W0();
        a1();
        return zzin.e(100, l1("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final void R1(String str, String str2) {
        Preconditions.e(str);
        Preconditions.e(str2);
        W0();
        a1();
        try {
            d1().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzfw zzfwVarI = i();
            zzfwVarI.f9056x.d("Error deleting user property. appId", zzfw.a1(str), ((zzhj) this.f577s).f9119E.g(str2), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    public final zzin S1(String str) {
        Preconditions.i(str);
        W0();
        a1();
        ?? RawQuery = {str};
        new Object() { // from class: com.google.android.gms.measurement.internal.zzao
        };
        ?? r10 = 0;
        zzinVarE = null;
        zzinVarE = null;
        zzin zzinVarE = null;
        try {
            try {
                RawQuery = d1().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", RawQuery);
                try {
                    if (RawQuery.moveToFirst()) {
                        zzinVarE = zzin.e(RawQuery.getInt(1), RawQuery.getString(0));
                        RawQuery.close();
                    } else {
                        i().f9052F.b("No data found");
                        RawQuery.close();
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    i().f9056x.a(e, "Error querying database.");
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                }
            } catch (Throwable th) {
                th = th;
                r10 = RawQuery;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            RawQuery = 0;
        } catch (Throwable th2) {
            th = th2;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
        return zzinVarE == null ? zzin.f9164c : zzinVarE;
    }

    public final void T1(String str, String str2) {
        Preconditions.e(str2);
        W0();
        a1();
        try {
            d1().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            zzfw zzfwVarI = i();
            zzfwVarI.f9056x.c("Error deleting snapshot. appId", zzfw.a1(str2), e10);
        }
    }

    public final List U1(String str) {
        String str2;
        Preconditions.e(str);
        W0();
        a1();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = d1().query("user_attributes", new String[]{MediationMetaData.KEY_NAME, "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (true) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str3 = string2;
                    long j = cursorQuery.getLong(2);
                    Object objJ1 = j1(cursorQuery, 3);
                    if (objJ1 == null) {
                        i().f9056x.a(zzfw.a1(str), "Read invalid user property value, ignoring it. appId");
                        str2 = str;
                    } else {
                        str2 = str;
                        arrayList.add(new s0(str2, str3, string, j, objJ1));
                    }
                    try {
                        if (!cursorQuery.moveToNext()) {
                            cursorQuery.close();
                            return arrayList;
                        }
                        str = str2;
                    } catch (SQLiteException e10) {
                        e = e10;
                    }
                }
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                cursorQuery.close();
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            str2 = str;
        }
        i().f9056x.c("Error querying user properties. appId", zzfw.a1(str2), e);
        List list = Collections.EMPTY_LIST;
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:? A[SYNTHETIC] */
    public final void V1(String str) {
        C0302k c0302kM1;
        T1("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = d1().query("events", (String[]) Collections.singletonList(MediationMetaData.KEY_NAME).toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string != null && (c0302kM1 = M1("events", str, string)) != null) {
                        t1("events_snapshot", c0302kM1);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return;
            } catch (SQLiteException e10) {
                i().f9056x.c("Error creating snapshot. appId", zzfw.a1(str), e10);
                if (cursorQuery != null) {
                    cursorQuery.close();
                    return;
                }
                return;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
        if (cursorQuery != null) {
            throw th;
        }
        cursorQuery.close();
        throw th;
    }

    public final void W1() {
        a1();
        d1().beginTransaction();
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0104  */
    /* JADX WARN: Code duplicated, block: B:75:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0112 A[ADDED_TO_REGION] */
    public final void X1(String str) throws Throwable {
        boolean z6;
        C0302k c0302kM1;
        ArrayList arrayList = new ArrayList(Arrays.asList(MediationMetaData.KEY_NAME, "lifetime_count"));
        C0302k c0302kM2 = M1("events", str, "_f");
        C0302k c0302kM3 = M1("events", str, "_v");
        T1("events", str);
        Cursor cursor = null;
        boolean z10 = false;
        try {
            Cursor cursorQuery = d1().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    if (c0302kM2 != null) {
                        t1("events", c0302kM2);
                    } else if (c0302kM3 != null) {
                        t1("events", c0302kM3);
                    }
                    T1("events_snapshot", str);
                    return;
                }
                boolean z11 = false;
                z6 = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (((zzhj) this.f577s).f9146y.h1(null, zzbf.f8972X0)) {
                            if (cursorQuery.getLong(1) >= 1) {
                                if ("_f".equals(string)) {
                                    z11 = true;
                                } else if ("_v".equals(string)) {
                                    z6 = true;
                                }
                            }
                        } else if ("_f".equals(string)) {
                            z11 = true;
                        } else if ("_v".equals(string)) {
                            z6 = true;
                        }
                        if (string != null && (c0302kM1 = M1("events_snapshot", str, string)) != null) {
                            t1("events", c0302kM1);
                        }
                    } catch (SQLiteException e10) {
                        e = e10;
                        cursor = cursorQuery;
                        z10 = z11;
                        try {
                            i().f9056x.c("Error querying snapshot. appId", zzfw.a1(str), e);
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (!z10 && c0302kM2 != null) {
                                t1("events", c0302kM2);
                            } else if (!z6 && c0302kM3 != null) {
                                t1("events", c0302kM3);
                            }
                            T1("events_snapshot", str);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (z10 && c0302kM2 != null) {
                                t1("events", c0302kM2);
                            } else if (!z6 && c0302kM3 != null) {
                                t1("events", c0302kM3);
                            }
                            T1("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        z10 = z11;
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (z10) {
                            if (!z6) {
                                t1("events", c0302kM3);
                            }
                        } else if (!z6) {
                            t1("events", c0302kM3);
                        }
                        T1("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                if (!z11 && c0302kM2 != null) {
                    t1("events", c0302kM2);
                } else if (!z6 && c0302kM3 != null) {
                    t1("events", c0302kM3);
                }
                T1("events_snapshot", str);
            } catch (SQLiteException e11) {
                e = e11;
                z6 = false;
                cursor = cursorQuery;
            } catch (Throwable th3) {
                th = th3;
                z6 = false;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e12) {
            e = e12;
            z6 = false;
        } catch (Throwable th4) {
            th = th4;
            z6 = false;
        }
    }

    public final void Y1() {
        a1();
        d1().endTransaction();
    }

    public final void Z1() {
        W0();
        a1();
        if (E1()) {
            zznc zzncVar = this.f3055t;
            long jA = zzncVar.f9280A.f9255w.a();
            zzhj zzhjVar = (zzhj) this.f577s;
            zzhjVar.f9120F.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) zzbf.f9021z.a(null)).longValue()) {
                zzncVar.f9280A.f9255w.b(jElapsedRealtime);
                W0();
                a1();
                if (E1()) {
                    SQLiteDatabase sQLiteDatabaseD1 = d1();
                    zzhjVar.f9120F.getClass();
                    int iDelete = sQLiteDatabaseD1.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(zzag.j1())});
                    if (iDelete > 0) {
                        zzfw zzfwVarI = i();
                        zzfwVarI.f9052F.a(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void a2() {
        a1();
        d1().setTransactionSuccessful();
    }

    @Override // M2.m0
    public final boolean c1() {
        return false;
    }

    public final SQLiteDatabase d1() {
        W0();
        try {
            return this.f3017v.getWritableDatabase();
        } catch (SQLiteException e10) {
            i().f9047A.a(e10, "Error opening database");
            throw e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    public final String e1() throws Throwable {
        Throwable th;
        Cursor cursorRawQuery;
        ?? D2 = d1();
        try {
            try {
                cursorRawQuery = D2.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return null;
                    }
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                } catch (SQLiteException e10) {
                    e = e10;
                    i().f9056x.a(e, "Database error getting next bundle app id");
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (D2 != 0) {
                    D2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            D2 = 0;
            if (D2 != 0) {
                D2.close();
            }
            throw th;
        }
    }

    public final long f1(zzfn.zzk zzkVar) {
        W0();
        a1();
        Preconditions.e(zzkVar.m2());
        byte[] bArrL = zzkVar.l();
        long jE1 = X0().e1(bArrL);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzkVar.m2());
        contentValues.put("metadata_fingerprint", Long.valueOf(jE1));
        contentValues.put("metadata", bArrL);
        try {
            d1().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jE1;
        } catch (SQLiteException e10) {
            zzfw zzfwVarI = i();
            zzfwVarI.f9056x.c("Error storing raw event metadata. appId", zzfw.a1(zzkVar.m2()), e10);
            throw e10;
        }
    }

    public final long g1(String str) {
        Preconditions.e(str);
        W0();
        a1();
        try {
            return d1().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, ((zzhj) this.f577s).f9146y.b1(str, zzbf.f9003q))))});
        } catch (SQLiteException e10) {
            i().f9056x.c("Error deleting over the limit events. appId", zzfw.a1(str), e10);
            return 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    public final long h1(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = d1().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j;
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                i().f9056x.c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    public final zzaq i1(long j, String str, long j10, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        Preconditions.e(str);
        W0();
        a1();
        String[] strArr = {str};
        zzaq zzaqVar = new zzaq();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseD1 = d1();
                Cursor cursorQuery = sQLiteDatabaseD1.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    i().f9047A.a(zzfw.a1(str), "Not updating daily counts, app is not known. appId");
                    cursorQuery.close();
                    return zzaqVar;
                }
                if (cursorQuery.getLong(0) == j) {
                    zzaqVar.f8899b = cursorQuery.getLong(1);
                    zzaqVar.a = cursorQuery.getLong(2);
                    zzaqVar.f8900c = cursorQuery.getLong(3);
                    zzaqVar.f8901d = cursorQuery.getLong(4);
                    zzaqVar.f8902e = cursorQuery.getLong(5);
                    zzaqVar.f8903f = cursorQuery.getLong(6);
                }
                if (z6) {
                    zzaqVar.f8899b += j10;
                }
                if (z10) {
                    zzaqVar.a += j10;
                }
                if (z11) {
                    zzaqVar.f8900c += j10;
                }
                if (z12) {
                    zzaqVar.f8901d += j10;
                }
                if (z13) {
                    zzaqVar.f8902e += j10;
                }
                if (z14) {
                    zzaqVar.f8903f += j10;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(zzaqVar.a));
                contentValues.put("daily_events_count", Long.valueOf(zzaqVar.f8899b));
                contentValues.put("daily_conversions_count", Long.valueOf(zzaqVar.f8900c));
                contentValues.put("daily_error_events_count", Long.valueOf(zzaqVar.f8901d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzaqVar.f8902e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(zzaqVar.f8903f));
                sQLiteDatabaseD1.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return zzaqVar;
            } catch (SQLiteException e10) {
                i().f9056x.c("Error updating daily counts. appId", zzfw.a1(str), e10);
                if (0 != 0) {
                    cursor.close();
                }
                return zzaqVar;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    public final Object j1(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            i().f9056x.b("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type == 4) {
            i().f9056x.b("Loaded invalid blob type value, ignoring it");
            return null;
        }
        zzfw zzfwVarI = i();
        zzfwVarI.f9056x.a(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [long] */
    public final String k1(long j) throws Throwable {
        Cursor cursorRawQuery;
        W0();
        a1();
        ?? r10 = 0;
        try {
            try {
                cursorRawQuery = d1().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf((long) j)});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                    i().f9052F.b("No expired configs for apps with pending events");
                    cursorRawQuery.close();
                    return null;
                } catch (SQLiteException e10) {
                    e = e10;
                    i().f9056x.a(e, "Error selecting expired configs");
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r10 = j;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    public final String l1(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = d1().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e10) {
                i().f9056x.c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    public final List m1(int i10, String str, int i11) {
        long jI;
        long jI2;
        W0();
        a1();
        int i12 = 1;
        Preconditions.b(i10 > 0);
        Preconditions.b(i11 > 0);
        Preconditions.e(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = d1().query("queue", new String[]{"rowid", JsonStorageKeyNames.DATA_KEY, "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i10));
                if (!cursorQuery.moveToFirst()) {
                    List list = Collections.EMPTY_LIST;
                    cursorQuery.close();
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (true) {
                    long j = cursorQuery.getLong(0);
                    try {
                        byte[] bArrK1 = X0().K1(cursorQuery.getBlob(i12));
                        if (!arrayList.isEmpty() && bArrK1.length + length > i11) {
                            break;
                        }
                        try {
                            zzfn.zzk.zza zzaVar = (zzfn.zzk.zza) zznl.k1(zzfn.zzk.j2(), bArrK1);
                            if (!arrayList.isEmpty()) {
                                zzfn.zzk zzkVar = (zzfn.zzk) ((Pair) arrayList.get(0)).first;
                                zzfn.zzk zzkVar2 = (zzfn.zzk) zzaVar.o();
                                if (!zzkVar.Q().equals(zzkVar2.Q()) || !zzkVar.P().equals(zzkVar2.P()) || zzkVar.g0() != zzkVar2.g0() || !zzkVar.R().equals(zzkVar2.R())) {
                                    break;
                                }
                                Iterator<E> it = zzkVar.e0().iterator();
                                while (true) {
                                    jI = -1;
                                    if (!it.hasNext()) {
                                        jI2 = -1;
                                        break;
                                    }
                                    zzfn.zzo zzoVar = (zzfn.zzo) it.next();
                                    if ("_npa".equals(zzoVar.N())) {
                                        jI2 = zzoVar.I();
                                        break;
                                    }
                                }
                                for (zzfn.zzo zzoVar2 : zzkVar2.e0()) {
                                    if ("_npa".equals(zzoVar2.N())) {
                                        jI = zzoVar2.I();
                                        break;
                                    }
                                }
                                if (jI2 != jI) {
                                    break;
                                }
                            }
                            if (!cursorQuery.isNull(2)) {
                                int i13 = cursorQuery.getInt(2);
                                zzaVar.m();
                                zzfn.zzk.B((zzfn.zzk) zzaVar.f8681t, i13);
                            }
                            length += bArrK1.length;
                            arrayList.add(Pair.create((zzfn.zzk) zzaVar.o(), Long.valueOf(j)));
                        } catch (IOException e10) {
                            i().f9056x.c("Failed to merge queued bundle. appId", zzfw.a1(str), e10);
                        }
                        if (!cursorQuery.moveToNext() || length > i11) {
                            break;
                        }
                        i12 = 1;
                    } catch (IOException e11) {
                        i().f9056x.c("Failed to unzip queued bundle. appId", zzfw.a1(str), e11);
                    }
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e12) {
                i().f9056x.c("Error querying bundles. appId", zzfw.a1(str), e12);
                List list2 = Collections.EMPTY_LIST;
                if (0 != 0) {
                    cursor.close();
                }
                return list2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List n1(String str, String str2, String str3) {
        Preconditions.e(str);
        W0();
        a1();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return o1(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List o1(String str, String[] strArr) {
        W0();
        a1();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = d1().query("conditional_properties", new String[]{"app_id", "origin", MediationMetaData.KEY_NAME, "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (arrayList.size() < 1000) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objJ1 = j1(cursorQuery, 3);
                    boolean z6 = cursorQuery.getInt(4) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j = cursorQuery.getLong(6);
                    zznl zznlVarX0 = X0();
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<zzbd> creator = zzbd.CREATOR;
                    zzbd zzbdVar = (zzbd) zznlVarX0.h1(blob, creator);
                    arrayList.add(new zzae(string, string2, new zzno(cursorQuery.getLong(10), objJ1, string3, string2), cursorQuery.getLong(8), z6, string4, zzbdVar, j, (zzbd) X0().h1(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (zzbd) X0().h1(cursorQuery.getBlob(12), creator)));
                    if (!cursorQuery.moveToNext()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                }
                i().f9056x.a(1000, "Read more than the max allowed conditional properties, ignoring extra");
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e10) {
                i().f9056x.a(e10, "Error querying conditional user property value");
                List list = Collections.EMPTY_LIST;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return list;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0045  */
    public final void p1(C0309s c0309s, boolean z6) {
        W0();
        a1();
        String strF = c0309s.f();
        Preconditions.i(strF);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strF);
        zznk.a();
        zzin.zza zzaVar = zzin.zza.ANALYTICS_STORAGE;
        zzhj zzhjVar = (zzhj) this.f577s;
        zzag zzagVar = zzhjVar.f9146y;
        zzfj zzfjVar = zzbf.f8968V0;
        boolean zH1 = zzagVar.h1(null, zzfjVar);
        zznc zzncVar = this.f3055t;
        if (!zH1) {
            contentValues.put("app_instance_id", c0309s.g());
        } else if (z6) {
            contentValues.put("app_instance_id", (String) null);
        } else if (zzncVar.I(strF).i(zzaVar)) {
            contentValues.put("app_instance_id", c0309s.g());
        }
        contentValues.put("gmp_app_id", c0309s.j());
        zznk.a();
        boolean zH2 = zzhjVar.f9146y.h1(null, zzfjVar);
        zzhj zzhjVar2 = c0309s.a;
        if (!zH2 || zzncVar.I(strF).i(zzin.zza.AD_STORAGE)) {
            zzhc zzhcVar = zzhjVar2.f9116B;
            zzhj.g(zzhcVar);
            zzhcVar.W0();
            contentValues.put("resettable_device_id_hash", c0309s.f3090e);
        }
        zzhc zzhcVar2 = zzhjVar2.f9116B;
        zzhj.g(zzhcVar2);
        zzhcVar2.W0();
        contentValues.put("last_bundle_index", Long.valueOf(c0309s.f3092g));
        zzhc zzhcVar3 = zzhjVar2.f9116B;
        zzhj.g(zzhcVar3);
        zzhcVar3.W0();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c0309s.f3093h));
        zzhc zzhcVar4 = zzhjVar2.f9116B;
        zzhj.g(zzhcVar4);
        zzhcVar4.W0();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c0309s.f3094i));
        contentValues.put("app_version", c0309s.h());
        zzhc zzhcVar5 = zzhjVar2.f9116B;
        zzhj.g(zzhcVar5);
        zzhcVar5.W0();
        contentValues.put("app_store", c0309s.f3096l);
        zzhc zzhcVar6 = zzhjVar2.f9116B;
        zzhj.g(zzhcVar6);
        zzhcVar6.W0();
        contentValues.put("gmp_version", Long.valueOf(c0309s.f3097m));
        zzhc zzhcVar7 = zzhjVar2.f9116B;
        zzhj.g(zzhcVar7);
        zzhcVar7.W0();
        contentValues.put("dev_cert_hash", Long.valueOf(c0309s.f3098n));
        zzhc zzhcVar8 = zzhjVar2.f9116B;
        zzhj.g(zzhcVar8);
        zzhcVar8.W0();
        contentValues.put("measurement_enabled", Boolean.valueOf(c0309s.f3099o));
        zzhc zzhcVar9 = zzhjVar2.f9116B;
        zzhj.g(zzhcVar9);
        zzhcVar9.W0();
        contentValues.put("day", Long.valueOf(c0309s.f3078J));
        zzhc zzhcVar10 = zzhjVar2.f9116B;
        zzhj.g(zzhcVar10);
        zzhcVar10.W0();
        contentValues.put("daily_public_events_count", Long.valueOf(c0309s.f3079K));
        zzhj.g(zzhcVar10);
        zzhcVar10.W0();
        contentValues.put("daily_events_count", Long.valueOf(c0309s.f3080L));
        zzhj.g(zzhcVar10);
        zzhcVar10.W0();
        contentValues.put("daily_conversions_count", Long.valueOf(c0309s.f3081M));
        zzhc zzhcVar11 = zzhjVar2.f9116B;
        zzhj.g(zzhcVar11);
        zzhcVar11.W0();
        contentValues.put("config_fetched_time", Long.valueOf(c0309s.f3085R));
        zzhc zzhcVar12 = zzhjVar2.f9116B;
        zzhj.g(zzhcVar12);
        zzhcVar12.W0();
        contentValues.put("failed_config_fetch_time", Long.valueOf(c0309s.f3086S));
        contentValues.put("app_version_int", Long.valueOf(c0309s.z()));
        contentValues.put("firebase_instance_id", c0309s.i());
        zzhj.g(zzhcVar10);
        zzhcVar10.W0();
        contentValues.put("daily_error_events_count", Long.valueOf(c0309s.f3082N));
        zzhj.g(zzhcVar10);
        zzhcVar10.W0();
        contentValues.put("daily_realtime_events_count", Long.valueOf(c0309s.f3083O));
        zzhj.g(zzhcVar10);
        zzhcVar10.W0();
        contentValues.put("health_monitor_sample", c0309s.P);
        zzhc zzhcVar13 = zzhjVar2.f9116B;
        zzhj.g(zzhcVar13);
        zzhcVar13.W0();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c0309s.n()));
        contentValues.put("admob_app_id", c0309s.d());
        contentValues.put("dynamite_version", Long.valueOf(c0309s.O()));
        zznk.a();
        if (!zzhjVar.f9146y.h1(null, zzfjVar) || zzncVar.I(strF).i(zzaVar)) {
            zzhc zzhcVar14 = zzhjVar2.f9116B;
            zzhj.g(zzhcVar14);
            zzhcVar14.W0();
            contentValues.put("session_stitching_token", c0309s.f3105u);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c0309s.p()));
        zzhc zzhcVar15 = zzhjVar2.f9116B;
        zzhj.g(zzhcVar15);
        zzhcVar15.W0();
        contentValues.put("target_os_version", Long.valueOf(c0309s.f3107w));
        zzhc zzhcVar16 = zzhjVar2.f9116B;
        zzhj.g(zzhcVar16);
        zzhcVar16.W0();
        contentValues.put("session_stitching_token_hash", Long.valueOf(c0309s.f3108x));
        zzpg.a();
        if (zzhjVar.f9146y.h1(strF, zzbf.f9022z0)) {
            zzhc zzhcVar17 = zzhjVar2.f9116B;
            zzhj.g(zzhcVar17);
            zzhcVar17.W0();
            contentValues.put("ad_services_version", Integer.valueOf(c0309s.f3109y));
            zzhc zzhcVar18 = zzhjVar2.f9116B;
            zzhj.g(zzhcVar18);
            zzhcVar18.W0();
            contentValues.put("attribution_eligibility_status", Long.valueOf(c0309s.f3071C));
        }
        com.google.android.gms.internal.measurement.zznl.a();
        if (zzhjVar.f9146y.h1(strF, zzbf.f8948K0)) {
            zzhc zzhcVar19 = zzhjVar2.f9116B;
            zzhj.g(zzhcVar19);
            zzhcVar19.W0();
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c0309s.f3110z));
        }
        contentValues.put("npa_metadata_value", c0309s.V());
        zzpn.a();
        if (zzhjVar.f9146y.h1(strF, zzbf.f9008s0)) {
            V0();
            if (zznp.a2(strF)) {
                zzhc zzhcVar20 = zzhjVar2.f9116B;
                zzhj.g(zzhcVar20);
                zzhcVar20.W0();
                contentValues.put("bundle_delivery_index", Long.valueOf(c0309s.f3075G));
            }
        }
        zzpn.a();
        if (zzhjVar.f9146y.h1(strF, zzbf.f9010t0)) {
            contentValues.put("sgtm_preview_key", c0309s.l());
        }
        zzhj.g(zzhcVar10);
        zzhcVar10.W0();
        contentValues.put("dma_consent_state", Integer.valueOf(c0309s.f3073E));
        zzhj.g(zzhcVar10);
        zzhcVar10.W0();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c0309s.f3074F));
        zzne.a();
        if (zzhjVar.f9146y.h1(strF, zzbf.f8957P0)) {
            contentValues.put("serialized_npa_metadata", c0309s.k());
        }
        zzhc zzhcVar21 = zzhjVar2.f9116B;
        zzhj.g(zzhcVar21);
        zzhcVar21.W0();
        ArrayList arrayList = c0309s.f3104t;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                i().f9047A.a(strF, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        zznw.f8806t.get();
        if (zzhjVar.f9146y.h1(null, zzbf.f9002p0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (zzhjVar.f9146y.h1(null, zzbf.f8963S0)) {
            zzhc zzhcVar22 = zzhjVar2.f9116B;
            zzhj.g(zzhcVar22);
            zzhcVar22.W0();
            contentValues.put("unmatched_pfo", c0309s.f3069A);
            zzhc zzhcVar23 = zzhjVar2.f9116B;
            zzhj.g(zzhcVar23);
            zzhcVar23.W0();
            contentValues.put("unmatched_uwa", c0309s.f3070B);
        }
        zzoj.a();
        if (zzhjVar.f9146y.h1(strF, zzbf.f8952M0)) {
            zzhc zzhcVar24 = zzhjVar2.f9116B;
            zzhj.g(zzhcVar24);
            zzhcVar24.W0();
            contentValues.put("ad_campaign_info", c0309s.f3077I);
        }
        try {
            SQLiteDatabase sQLiteDatabaseD1 = d1();
            if (sQLiteDatabaseD1.update("apps", contentValues, "app_id = ?", new String[]{strF}) == 0 && sQLiteDatabaseD1.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                i().f9056x.a(zzfw.a1(strF), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e10) {
            i().f9056x.c("Error storing app. appId", zzfw.a1(strF), e10);
        }
    }

    public final void q1(ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseD1 = d1();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                i().f9058z.a(zzfw.a1("app_id"), "Value of the primary key is not set.");
            } else if (sQLiteDatabaseD1.update("consent_settings", contentValues, "app_id = ?", new String[]{asString}) == 0 && sQLiteDatabaseD1.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                i().f9056x.c("Failed to insert/update table (got -1). key", zzfw.a1("consent_settings"), zzfw.a1("app_id"));
            }
        } catch (SQLiteException e10) {
            i().f9056x.d("Error storing into table. key", zzfw.a1("consent_settings"), zzfw.a1("app_id"), e10);
        }
    }

    public final void s1(zzfn.zzk zzkVar, boolean z6) {
        W0();
        a1();
        Preconditions.e(zzkVar.m2());
        Preconditions.l(zzkVar.C0());
        Z1();
        ((zzhj) this.f577s).f9120F.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zzkVar.S1() < jCurrentTimeMillis - zzag.j1() || zzkVar.S1() > zzag.j1() + jCurrentTimeMillis) {
            zzfw zzfwVarI = i();
            zzfwVarI.f9047A.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzfw.a1(zzkVar.m2()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzkVar.S1()));
        }
        try {
            byte[] bArrI1 = X0().I1(zzkVar.l());
            zzfw zzfwVarI2 = i();
            zzfwVarI2.f9052F.a(Integer.valueOf(bArrI1.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzkVar.m2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzkVar.S1()));
            contentValues.put(JsonStorageKeyNames.DATA_KEY, bArrI1);
            contentValues.put("has_realtime", Integer.valueOf(z6 ? 1 : 0));
            if (zzkVar.J0()) {
                contentValues.put("retry_count", Integer.valueOf(zzkVar.r1()));
            }
            try {
                if (d1().insert("queue", null, contentValues) == -1) {
                    i().f9056x.a(zzfw.a1(zzkVar.m2()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e10) {
                zzfw zzfwVarI3 = i();
                zzfwVarI3.f9056x.c("Error storing bundle. appId", zzfw.a1(zzkVar.m2()), e10);
            }
        } catch (IOException e11) {
            zzfw zzfwVarI4 = i();
            zzfwVarI4.f9056x.c("Data loss. Failed to serialize bundle. appId", zzfw.a1(zzkVar.m2()), e11);
        }
    }

    public final void t1(String str, C0302k c0302k) {
        Preconditions.i(c0302k);
        W0();
        a1();
        ContentValues contentValues = new ContentValues();
        String str2 = c0302k.a;
        contentValues.put("app_id", str2);
        contentValues.put(MediationMetaData.KEY_NAME, c0302k.f3034b);
        contentValues.put("lifetime_count", Long.valueOf(c0302k.f3035c));
        contentValues.put("current_bundle_count", Long.valueOf(c0302k.f3036d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c0302k.f3038f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c0302k.f3039g));
        contentValues.put("last_bundled_day", c0302k.f3040h);
        contentValues.put("last_sampled_complex_event_id", c0302k.f3041i);
        contentValues.put("last_sampling_rate", c0302k.j);
        contentValues.put("current_session_count", Long.valueOf(c0302k.f3037e));
        Boolean bool = c0302k.f3042k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (d1().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                i().f9056x.a(zzfw.a1(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e10) {
            i().f9056x.c("Error storing event aggregates. appId", zzfw.a1(str2), e10);
        }
    }

    public final void u1(String str, zzin zzinVar) {
        Preconditions.i(str);
        W0();
        a1();
        I1(str, S1(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzinVar.o());
        q1(contentValues);
    }

    public final void v1(String str, zzmu zzmuVar) {
        W0();
        a1();
        Preconditions.e(str);
        ((zzhj) this.f577s).f9120F.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jJ1 = jCurrentTimeMillis - zzag.j1();
        long j = zzmuVar.f9274t;
        if (j < jJ1 || j > zzag.j1() + jCurrentTimeMillis) {
            zzfw zzfwVarI = i();
            zzfwVarI.f9047A.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzfw.a1(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        i().f9052F.b("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzmuVar.f9273s);
        contentValues.put("source", Integer.valueOf(zzmuVar.f9275u));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (d1().insert("trigger_uris", null, contentValues) == -1) {
                i().f9056x.a(zzfw.a1(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e10) {
            zzfw zzfwVarI2 = i();
            zzfwVarI2.f9056x.c("Error storing trigger URI. appId", zzfw.a1(str), e10);
        }
    }

    public final void w1(String str, Long l4, long j, zzfn.zzf zzfVar) {
        W0();
        a1();
        Preconditions.i(zzfVar);
        Preconditions.e(str);
        byte[] bArrL = zzfVar.l();
        zzfw zzfwVarI = i();
        zzfwVarI.f9052F.c("Saving complex main event, appId, data size", ((zzhj) this.f577s).f9119E.c(str), Integer.valueOf(bArrL.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l4);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrL);
        try {
            if (d1().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                i().f9056x.a(zzfw.a1(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e10) {
            zzfw zzfwVarI2 = i();
            zzfwVarI2.f9056x.c("Error storing complex main event. appId", zzfw.a1(str), e10);
        }
    }

    public final void x1(String str, String str2) {
        Preconditions.e(str);
        Preconditions.e(str2);
        W0();
        a1();
        try {
            d1().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzfw zzfwVarI = i();
            zzfwVarI.f9056x.d("Error deleting conditional property", zzfw.a1(str), ((zzhj) this.f577s).f9119E.g(str2), e10);
        }
    }

    public final void y1(List list) {
        W0();
        a1();
        Preconditions.i(list);
        if (((ArrayList) list).size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (E1()) {
            String strI = E0.a.i("(", TextUtils.join(",", list), ")");
            if (G1("SELECT COUNT(1) FROM queue WHERE rowid IN " + strI + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                i().f9047A.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                d1().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + strI + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                i().f9056x.a(e10, "Error incrementing retry count. error");
            }
        }
    }

    public final boolean z1(s0 s0Var) {
        W0();
        a1();
        String str = s0Var.a;
        String str2 = s0Var.f3112c;
        s0 s0VarP1 = P1(str, str2);
        String str3 = s0Var.f3111b;
        if (s0VarP1 == null) {
            if (zznp.e2(str2)) {
                if (G1("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(((zzhj) this.f577s).f9146y.b1(str, zzbf.f8941H), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2) && G1("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put(MediationMetaData.KEY_NAME, str2);
        contentValues.put("set_timestamp", Long.valueOf(s0Var.f3113d));
        r1(contentValues, s0Var.f3114e);
        try {
            if (d1().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            i().f9056x.a(zzfw.a1(str), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e10) {
            i().f9056x.c("Error storing user property. appId", zzfw.a1(str), e10);
            return true;
        }
    }
}
