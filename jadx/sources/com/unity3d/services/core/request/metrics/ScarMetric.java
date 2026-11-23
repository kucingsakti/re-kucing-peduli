package com.unity3d.services.core.request.metrics;

import E0.a;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ScarMetric {
    private static final String ASYNC_PREFIX = "async";
    private static final String HB_SIGNALS_FETCH_FAILURE = "native_hb_signals_%s_fetch_failure";
    private static final String HB_SIGNALS_FETCH_START = "native_hb_signals_%s_fetch_start";
    private static final String HB_SIGNALS_FETCH_SUCCESS = "native_hb_signals_%s_fetch_success";
    private static final String HB_SIGNALS_UPLOAD_FAILURE = "native_hb_signals_%s_upload_failure";
    private static final String HB_SIGNALS_UPLOAD_START = "native_hb_signals_%s_upload_start";
    private static final String HB_SIGNALS_UPLOAD_SUCCESS = "native_hb_signals_%s_upload_success";
    private static final String REASON = "reason";
    private static final String SYNC_PREFIX = "sync";
    private static long _fetchStartTime;
    private static long _uploadStartTime;

    private static long getTotalFetchTime() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - _fetchStartTime);
    }

    private static long getTotalUploadTime() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - _uploadStartTime);
    }

    public static Metric hbSignalsFetchFailure(boolean z6, String str) {
        HashMap map = new HashMap();
        map.put(REASON, str);
        return new Metric(a.i("native_hb_signals_", z6 ? ASYNC_PREFIX : SYNC_PREFIX, "_fetch_failure"), Long.valueOf(getTotalFetchTime()), map);
    }

    public static Metric hbSignalsFetchStart(boolean z6) {
        _fetchStartTime = System.nanoTime();
        return new Metric(a.i("native_hb_signals_", z6 ? ASYNC_PREFIX : SYNC_PREFIX, "_fetch_start"), null);
    }

    public static Metric hbSignalsFetchSuccess(boolean z6) {
        return new Metric(a.i("native_hb_signals_", z6 ? ASYNC_PREFIX : SYNC_PREFIX, "_fetch_success"), Long.valueOf(getTotalFetchTime()));
    }

    public static Metric hbSignalsUploadFailure(boolean z6, String str) {
        HashMap map = new HashMap();
        map.put(REASON, str);
        return new Metric(a.i("native_hb_signals_", z6 ? ASYNC_PREFIX : SYNC_PREFIX, "_upload_failure"), Long.valueOf(getTotalUploadTime()), map);
    }

    public static Metric hbSignalsUploadStart(boolean z6) {
        _uploadStartTime = System.nanoTime();
        return new Metric(a.i("native_hb_signals_", z6 ? ASYNC_PREFIX : SYNC_PREFIX, "_upload_start"), null);
    }

    public static Metric hbSignalsUploadSuccess(boolean z6) {
        return new Metric(a.i("native_hb_signals_", z6 ? ASYNC_PREFIX : SYNC_PREFIX, "_upload_success"), Long.valueOf(getTotalUploadTime()));
    }
}
