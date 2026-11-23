package com.unity3d.services.core.device.reader;

import android.app.Activity;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.unity3d.services.core.configuration.ExperimentsReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class HdrInfoReader implements IHdrInfoReader {
    private static final AtomicBoolean _hdrMetricsCaptured = new AtomicBoolean(false);
    private static volatile HdrInfoReader _instance;
    private final SDKMetricsSender _sdkMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);

    private HdrInfoReader() {
    }

    public static HdrInfoReader getInstance() {
        if (_instance == null) {
            synchronized (HdrInfoReader.class) {
                try {
                    if (_instance == null) {
                        _instance = new HdrInfoReader();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return _instance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    @Override // com.unity3d.services.core.device.reader.IHdrInfoReader
    public void captureHDRCapabilityMetrics(Activity activity, ExperimentsReader experimentsReader) {
        ?? IsScreenHdr;
        int i10;
        int i11;
        int i12;
        if (activity != null && experimentsReader.getCurrentlyActiveExperiments().isCaptureHDRCapabilitiesEnabled()) {
            int i13 = 0;
            if (_hdrMetricsCaptured.compareAndSet(false, true)) {
                ArrayList arrayList = new ArrayList(5);
                if (Build.VERSION.SDK_INT >= 24) {
                    Display.HdrCapabilities hdrCapabilities = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getHdrCapabilities();
                    int[] supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
                    int length = supportedHdrTypes.length;
                    int i14 = 0;
                    boolean z6 = false;
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                    while (i14 < length) {
                        int i15 = supportedHdrTypes[i14];
                        if (i15 == 1) {
                            z6 = true;
                        } else if (i15 == 2) {
                            i10 = 1;
                        } else if (i15 == 3) {
                            i12 = 1;
                        } else if (i15 == 4) {
                            i11 = 1;
                        }
                        i14++;
                        z6 = z6;
                    }
                    long jRound = Math.round(hdrCapabilities.getDesiredMaxAverageLuminance());
                    long jRound2 = Math.round(hdrCapabilities.getDesiredMaxLuminance());
                    long jRound3 = Math.round(hdrCapabilities.getDesiredMinLuminance());
                    arrayList.add(new Metric("native_device_hdr_lum_max_average", Long.valueOf(jRound)));
                    arrayList.add(new Metric("native_device_hdr_lum_max", Long.valueOf(jRound2)));
                    arrayList.add(new Metric("native_device_hdr_lum_min", Long.valueOf(jRound3)));
                    IsScreenHdr = Build.VERSION.SDK_INT >= 26 ? activity.getResources().getConfiguration().isScreenHdr() : false;
                    i13 = z6 ? 1 : 0;
                } else {
                    IsScreenHdr = 0;
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                }
                arrayList.add(new Metric("native_device_hdr_dolby_vision", Integer.valueOf(i13)));
                arrayList.add(new Metric("native_device_hdr_hdr10", Integer.valueOf(i10)));
                arrayList.add(new Metric("native_device_hdr_hdr10_plus", Integer.valueOf(i11)));
                arrayList.add(new Metric("native_device_hdr_hlg", Integer.valueOf(i12)));
                arrayList.add(new Metric("native_device_hdr_screen_hdr", Integer.valueOf((int) IsScreenHdr)));
                this._sdkMetricsSender.sendMetrics(arrayList);
            }
        }
    }
}
