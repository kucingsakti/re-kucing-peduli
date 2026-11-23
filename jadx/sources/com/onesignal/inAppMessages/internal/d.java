package com.onesignal.inAppMessages.internal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static final a Companion = new a(null);
    public static final String DISPLAY_DURATION = "display_duration";
    public static final String HTML = "html";
    public static final String REMOVE_HEIGHT_MARGIN = "remove_height_margin";
    public static final String REMOVE_WIDTH_MARGIN = "remove_width_margin";
    public static final String STYLES = "styles";
    private String contentHtml;
    private Double displayDuration;
    private com.onesignal.inAppMessages.internal.display.impl.k.c displayLocation;
    private boolean isFullBleed;
    private int pageHeight;
    private boolean useHeightMargin;
    private boolean useWidthMargin;

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        private a() {
        }
    }

    public d(JSONObject jSONObject) {
        Boolean boolSafeBool;
        Boolean boolSafeBool2;
        p210v8.i.f(jSONObject, "jsonObject");
        this.useHeightMargin = true;
        this.useWidthMargin = true;
        this.contentHtml = com.onesignal.common.e.safeString(jSONObject, HTML);
        this.displayDuration = com.onesignal.common.e.safeDouble(jSONObject, DISPLAY_DURATION);
        JSONObject jSONObjectSafeJSONObject = com.onesignal.common.e.safeJSONObject(jSONObject, STYLES);
        boolean zBooleanValue = false;
        this.useHeightMargin = !((jSONObjectSafeJSONObject == null || (boolSafeBool2 = com.onesignal.common.e.safeBool(jSONObjectSafeJSONObject, REMOVE_HEIGHT_MARGIN)) == null) ? false : boolSafeBool2.booleanValue());
        if (jSONObjectSafeJSONObject != null && (boolSafeBool = com.onesignal.common.e.safeBool(jSONObjectSafeJSONObject, REMOVE_WIDTH_MARGIN)) != null) {
            zBooleanValue = boolSafeBool.booleanValue();
        }
        this.useWidthMargin = !zBooleanValue;
        this.isFullBleed = !this.useHeightMargin;
    }

    public final String getContentHtml() {
        return this.contentHtml;
    }

    public final Double getDisplayDuration() {
        return this.displayDuration;
    }

    public final com.onesignal.inAppMessages.internal.display.impl.k.c getDisplayLocation() {
        return this.displayLocation;
    }

    public final int getPageHeight() {
        return this.pageHeight;
    }

    public final boolean getUseHeightMargin() {
        return this.useHeightMargin;
    }

    public final boolean getUseWidthMargin() {
        return this.useWidthMargin;
    }

    public final boolean isFullBleed() {
        return this.isFullBleed;
    }

    public final void setContentHtml(String str) {
        this.contentHtml = str;
    }

    public final void setDisplayDuration(Double d3) {
        this.displayDuration = d3;
    }

    public final void setDisplayLocation(com.onesignal.inAppMessages.internal.display.impl.k.c cVar) {
        this.displayLocation = cVar;
    }

    public final void setFullBleed(boolean z6) {
        this.isFullBleed = z6;
    }

    public final void setPageHeight(int i10) {
        this.pageHeight = i10;
    }

    public final void setUseHeightMargin(boolean z6) {
        this.useHeightMargin = z6;
    }

    public final void setUseWidthMargin(boolean z6) {
        this.useWidthMargin = z6;
    }
}
