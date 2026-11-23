package com.unity3d.services.core.webview;

import com.rollbar.notifier.sender.SyncSender;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import p239z.e;

/* JADX INFO: loaded from: classes.dex */
public class WebViewUrlBuilder {
    private final SDKMetricsSender _sdkMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
    private final String _urlWithQueryString;

    public WebViewUrlBuilder(String str, Configuration configuration) {
        StringBuilder sbC = e.c("?platform=android" + buildQueryParam("origin", configuration.getWebViewUrl()));
        sbC.append(buildQueryParam(MediationMetaData.KEY_VERSION, configuration.getWebViewVersion()));
        StringBuilder sbC2 = e.c(sbC.toString());
        sbC2.append(buildQueryParam("isNativeCollectingMetrics", String.valueOf(configuration.areMetricsEnabledForCurrentSession())));
        this._urlWithQueryString = p231y.a.c(str, sbC2.toString());
    }

    private String buildQueryParam(String str, String str2) {
        if (str2 == null) {
            return "";
        }
        try {
            return "&" + str + "=" + URLEncoder.encode(str2, SyncSender.UTF_8);
        } catch (UnsupportedEncodingException e10) {
            DeviceLog.exception("Unsupported charset when encoding " + str, e10);
            return "";
        }
    }

    public String getUrlWithQueryString() {
        return this._urlWithQueryString;
    }
}
