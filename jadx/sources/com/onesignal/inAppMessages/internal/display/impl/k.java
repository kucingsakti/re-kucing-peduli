package com.onesignal.inAppMessages.internal.display.impl;

import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import S9.n;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.onesignal.common.AndroidUtils;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p076h8.m;

/* JADX INFO: loaded from: classes.dex */
public final class k implements X4.d {
    public static final String EVENT_TYPE_ACTION_TAKEN = "action_taken";
    public static final String EVENT_TYPE_KEY = "type";
    public static final String EVENT_TYPE_PAGE_CHANGE = "page_change";
    public static final String EVENT_TYPE_RENDERING_COMPLETE = "rendering_complete";
    public static final String EVENT_TYPE_RESIZE = "resize";
    public static final String GET_PAGE_META_DATA_JS_FUNCTION = "getPageMetaData()";
    public static final String IAM_DISPLAY_LOCATION_KEY = "displayLocation";
    public static final String IAM_DRAG_TO_DISMISS_DISABLED_KEY = "dragToDismissDisabled";
    public static final String IAM_PAGE_META_DATA_KEY = "pageMetaData";
    public static final String JS_OBJ_NAME = "OSAndroid";
    public static final String SAFE_AREA_JS_OBJECT = "{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}";
    public static final String SET_SAFE_AREA_INSETS_JS_FUNCTION = "setSafeAreaInsets(%s)";
    public static final String SET_SAFE_AREA_INSETS_SCRIPT = "\n\n<script>\n    setSafeAreaInsets(%s);\n</script>";
    private final X4.f _applicationService;
    private final p198u5.b _lifecycle;
    private final p227x5.a _promptFactory;
    private Activity activity;
    private boolean closing;
    private String currentActivityName;
    private boolean dismissFired;
    private Integer lastPageHeight;
    private final com.onesignal.inAppMessages.internal.a message;
    private final com.onesignal.inAppMessages.internal.d messageContent;
    private com.onesignal.inAppMessages.internal.display.impl.d messageView;
    private final V9.a messageViewMutex;
    private com.onesignal.inAppMessages.internal.display.impl.g webView;
    public static final a Companion = new a(null);
    private static final int MARGIN_PX_SIZE = com.onesignal.common.l.INSTANCE.dpToPx(24);

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        private a() {
        }
    }

    public final class b {
        public b() {
        }

        private final c getDisplayLocation(JSONObject jSONObject) {
            c cVar = c.FULL_SCREEN;
            try {
                if (jSONObject.has(k.IAM_DISPLAY_LOCATION_KEY) && !p210v8.i.a(jSONObject.get(k.IAM_DISPLAY_LOCATION_KEY), "")) {
                    String strOptString = jSONObject.optString(k.IAM_DISPLAY_LOCATION_KEY, "FULL_SCREEN");
                    p210v8.i.e(strOptString, "jsonObject.optString(\n  …                        )");
                    Locale locale = Locale.getDefault();
                    p210v8.i.e(locale, "getDefault()");
                    String upperCase = strOptString.toUpperCase(locale);
                    p210v8.i.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    return c.valueOf(upperCase);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            return cVar;
        }

        private final boolean getDragToDismissDisabled(JSONObject jSONObject) {
            try {
                return jSONObject.getBoolean(k.IAM_DRAG_TO_DISMISS_DISABLED_KEY);
            } catch (JSONException unused) {
                return false;
            }
        }

        private final int getPageHeightData(JSONObject jSONObject) {
            try {
                k kVar = k.this;
                Activity activity = kVar.activity;
                JSONObject jSONObject2 = jSONObject.getJSONObject(k.IAM_PAGE_META_DATA_KEY);
                p210v8.i.e(jSONObject2, "jsonObject.getJSONObject(IAM_PAGE_META_DATA_KEY)");
                return kVar.pageRectToViewHeight(activity, jSONObject2);
            } catch (JSONException unused) {
                return -1;
            }
        }

        private final void handleActionTaken(JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            p210v8.i.e(jSONObject2, "body");
            String strSafeString = com.onesignal.common.e.safeString(jSONObject2, "id");
            k.this.closing = jSONObject2.getBoolean("close");
            if (k.this.message.isPreview()) {
                k.this._lifecycle.messageActionOccurredOnPreview(k.this.message, new com.onesignal.inAppMessages.internal.c(jSONObject2, k.this._promptFactory));
            } else if (strSafeString != null) {
                k.this._lifecycle.messageActionOccurredOnMessage(k.this.message, new com.onesignal.inAppMessages.internal.c(jSONObject2, k.this._promptFactory));
            }
            if (k.this.closing) {
                k.this.backgroundDismissAndAwaitNextMessage();
            }
        }

        private final void handlePageChange(JSONObject jSONObject) throws JSONException {
            k.this._lifecycle.messagePageChanged(k.this.message, new com.onesignal.inAppMessages.internal.g(jSONObject));
        }

        private final void handleRenderComplete(JSONObject jSONObject) {
            c displayLocation = getDisplayLocation(jSONObject);
            int pageHeightData = displayLocation == c.FULL_SCREEN ? -1 : getPageHeightData(jSONObject);
            boolean dragToDismissDisabled = getDragToDismissDisabled(jSONObject);
            k.this.messageContent.setDisplayLocation(displayLocation);
            k.this.messageContent.setPageHeight(pageHeightData);
            k.this.createNewInAppMessageView(dragToDismissDisabled);
        }

        @JavascriptInterface
        public final void postMessage(String str) {
            com.onesignal.inAppMessages.internal.display.impl.d dVar;
            p210v8.i.f(str, "message");
            try {
                com.onesignal.debug.internal.logging.b.debug$default("OSJavaScriptInterface:postMessage: ".concat(str), null, 2, null);
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString(k.EVENT_TYPE_KEY);
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1484226720:
                            if (string.equals(k.EVENT_TYPE_PAGE_CHANGE)) {
                                handlePageChange(jSONObject);
                            }
                            break;
                        case -934437708:
                            string.equals(k.EVENT_TYPE_RESIZE);
                            break;
                        case 42998156:
                            if (string.equals(k.EVENT_TYPE_RENDERING_COMPLETE)) {
                                handleRenderComplete(jSONObject);
                            }
                            break;
                        case 1851145598:
                            if (string.equals(k.EVENT_TYPE_ACTION_TAKEN) && (dVar = k.this.messageView) != null && !dVar.isDragging()) {
                                handleActionTaken(jSONObject);
                            }
                            break;
                        default:
                            break;
                    }
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    public enum c {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN;

        public final boolean isBanner() {
            int i10 = com.onesignal.inAppMessages.internal.display.impl.l.$EnumSwitchMapping$0[ordinal()];
            return i10 == 1 || i10 == 2;
        }
    }

    public static final class d extends p144o8.g implements p200u8.b {
        int label;

        public d(p123m8.d<? super d> dVar) {
            super(1, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(p123m8.d<?> dVar) {
            return k.this.new d(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                k kVar = k.this;
                this.label = 1;
                if (kVar.dismissAndAwaitNextMessage(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return m.a;
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super m> dVar) {
            return ((d) create(dVar)).invokeSuspend(m.a);
        }
    }

    public static final class e extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(p123m8.d<? super e> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.calculateHeightAndShowWebViewAfterNewActivity(this);
        }
    }

    public static final class f extends p144o8.g implements p200u8.b {
        final /* synthetic */ int $pagePxHeight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i10, p123m8.d<? super f> dVar) {
            super(1, dVar);
            this.$pagePxHeight = i10;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(p123m8.d<?> dVar) {
            return k.this.new f(this.$pagePxHeight, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                k kVar = k.this;
                Integer num = new Integer(this.$pagePxHeight);
                this.label = 1;
                if (kVar.showMessageView(num, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return m.a;
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super m> dVar) {
            return ((f) create(dVar)).invokeSuspend(m.a);
        }
    }

    public static final class g implements com.onesignal.inAppMessages.internal.display.impl.e {
        final /* synthetic */ k $self;

        public g(k kVar) {
            this.$self = kVar;
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.e
        public void onMessageWasDismissed() {
            k.this._lifecycle.messageWasDismissed(k.this.message);
            k.this._applicationService.removeActivityLifecycleHandler(this.$self);
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.e
        public void onMessageWasDisplayed() {
            k.this._lifecycle.messageWasDisplayed(k.this.message);
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.e
        public void onMessageWillDismiss() {
            k.this._lifecycle.messageWillDismiss(k.this.message);
        }
    }

    public static final class h extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(p123m8.d<? super h> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.dismissAndAwaitNextMessage(this);
        }
    }

    public static final class i extends p144o8.g implements p200u8.b {
        final /* synthetic */ String $lastActivityName;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, k kVar, p123m8.d<? super i> dVar) {
            super(1, dVar);
            this.$lastActivityName = str;
            this.this$0 = kVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(p123m8.d<?> dVar) {
            return new i(this.$lastActivityName, this.this$0, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        
            if (r6.showMessageView(null, r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        
            if (r6.showMessageView(r1, r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        
            if (r6.calculateHeightAndShowWebViewAfterNewActivity(r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        
            return r0;
         */
        @Override // p144o8.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                n8.a r0 = p134n8.a.f13404s
                int r1 = r5.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1c
                if (r1 == r4) goto L18
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                goto L18
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                J7.a.v(r6)
                goto L71
            L1c:
                J7.a.v(r6)
                java.lang.String r6 = r5.$lastActivityName
                if (r6 != 0) goto L2f
                com.onesignal.inAppMessages.internal.display.impl.k r6 = r5.this$0
                r5.label = r4
                r1 = 0
                java.lang.Object r6 = com.onesignal.inAppMessages.internal.display.impl.k.access$showMessageView(r6, r1, r5)
                if (r6 != r0) goto L71
                goto L70
            L2f:
                com.onesignal.inAppMessages.internal.display.impl.k r1 = r5.this$0
                java.lang.String r1 = com.onesignal.inAppMessages.internal.display.impl.k.access$getCurrentActivityName$p(r1)
                boolean r6 = p210v8.i.a(r6, r1)
                if (r6 != 0) goto L66
                com.onesignal.inAppMessages.internal.display.impl.k r6 = r5.this$0
                boolean r6 = com.onesignal.inAppMessages.internal.display.impl.k.access$getClosing$p(r6)
                if (r6 != 0) goto L71
                com.onesignal.inAppMessages.internal.display.impl.k r6 = r5.this$0
                com.onesignal.inAppMessages.internal.display.impl.d r6 = com.onesignal.inAppMessages.internal.display.impl.k.access$getMessageView$p(r6)
                if (r6 == 0) goto L57
                com.onesignal.inAppMessages.internal.display.impl.k r6 = r5.this$0
                com.onesignal.inAppMessages.internal.display.impl.d r6 = com.onesignal.inAppMessages.internal.display.impl.k.access$getMessageView$p(r6)
                p210v8.i.c(r6)
                r6.removeAllViews()
            L57:
                com.onesignal.inAppMessages.internal.display.impl.k r6 = r5.this$0
                java.lang.Integer r1 = com.onesignal.inAppMessages.internal.display.impl.k.access$getLastPageHeight$p(r6)
                r5.label = r3
                java.lang.Object r6 = com.onesignal.inAppMessages.internal.display.impl.k.access$showMessageView(r6, r1, r5)
                if (r6 != r0) goto L71
                goto L70
            L66:
                com.onesignal.inAppMessages.internal.display.impl.k r6 = r5.this$0
                r5.label = r2
                java.lang.Object r6 = com.onesignal.inAppMessages.internal.display.impl.k.access$calculateHeightAndShowWebViewAfterNewActivity(r6, r5)
                if (r6 != r0) goto L71
            L70:
                return r0
            L71:
                h8.m r6 = p076h8.m.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.k.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super m> dVar) {
            return ((i) create(dVar)).invokeSuspend(m.a);
        }
    }

    public static final class j extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public j(p123m8.d<? super j> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.setupWebView(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.display.impl.k$k, reason: collision with other inner class name */
    public static final class C0040k extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0040k(p123m8.d<? super C0040k> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.showMessageView(null, this);
        }
    }

    public static final class l extends p144o8.g implements p200u8.c {
        int label;

        public l(p123m8.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return k.this.new l(dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((l) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            int[] cutoutAndStatusBarInsets = com.onesignal.common.l.INSTANCE.getCutoutAndStatusBarInsets(k.this.activity);
            String str = String.format(k.SET_SAFE_AREA_INSETS_JS_FUNCTION, Arrays.copyOf(new Object[]{String.format(k.SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{new Integer(cutoutAndStatusBarInsets[0]), new Integer(cutoutAndStatusBarInsets[1]), new Integer(cutoutAndStatusBarInsets[2]), new Integer(cutoutAndStatusBarInsets[3])}, 4))}, 1));
            com.onesignal.inAppMessages.internal.display.impl.g gVar = k.this.webView;
            p210v8.i.c(gVar);
            gVar.evaluateJavascript(str, null);
            return m.a;
        }
    }

    public k(com.onesignal.inAppMessages.internal.a aVar, Activity activity, com.onesignal.inAppMessages.internal.d dVar, p198u5.b bVar, X4.f fVar, p227x5.a aVar2) {
        p210v8.i.f(aVar, "message");
        p210v8.i.f(activity, "activity");
        p210v8.i.f(dVar, "messageContent");
        p210v8.i.f(bVar, "_lifecycle");
        p210v8.i.f(fVar, "_applicationService");
        p210v8.i.f(aVar2, "_promptFactory");
        this.message = aVar;
        this.activity = activity;
        this.messageContent = dVar;
        this._lifecycle = bVar;
        this._applicationService = fVar;
        this._promptFactory = aVar2;
        this.messageViewMutex = V9.e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object calculateHeightAndShowWebViewAfterNewActivity(p123m8.d<? super m> dVar) {
        e eVar;
        final k kVar;
        k kVar2;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.label = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = eVar.label;
        m mVar = m.a;
        if (i11 != 0) {
            if (i11 == 1) {
                J7.a.v(obj);
                return mVar;
            }
            if (i11 == 2) {
                kVar = (k) eVar.L$0;
                J7.a.v(obj);
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar2 = (k) eVar.L$0;
                J7.a.v(obj);
            }
            kVar = kVar2;
            com.onesignal.inAppMessages.internal.display.impl.g gVar = kVar.webView;
            p210v8.i.c(gVar);
            gVar.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.j
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj2) {
                    k.m14calculateHeightAndShowWebViewAfterNewActivity$lambda0(this.a, (String) obj2);
                }
            });
            return mVar;
        }
        J7.a.v(obj);
        com.onesignal.inAppMessages.internal.display.impl.d dVar2 = this.messageView;
        if (dVar2 != null) {
            if (dVar2.getDisplayPosition() != c.FULL_SCREEN || this.messageContent.isFullBleed()) {
                com.onesignal.debug.internal.logging.b.debug$default("In app message new activity, calculate height and show ", null, 2, null);
                X4.f fVar = this._applicationService;
                eVar.L$0 = this;
                eVar.label = 2;
                if (fVar.waitUntilActivityReady(eVar) != aVar) {
                    kVar = this;
                }
            } else {
                eVar.label = 1;
                if (showMessageView(null, eVar) == aVar) {
                }
            }
            return aVar;
        }
        return mVar;
        kVar.setWebViewToMaxSize(kVar.activity);
        if (kVar.messageContent.isFullBleed()) {
            eVar.L$0 = kVar;
            eVar.label = 3;
            if (kVar.updateSafeAreaInsets(eVar) != aVar) {
                kVar2 = kVar;
                kVar = kVar2;
            }
            return aVar;
        }
        com.onesignal.inAppMessages.internal.display.impl.g gVar2 = kVar.webView;
        p210v8.i.c(gVar2);
        gVar2.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.j
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj2) {
                k.m14calculateHeightAndShowWebViewAfterNewActivity$lambda0(this.a, (String) obj2);
            }
        });
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculateHeightAndShowWebViewAfterNewActivity$lambda-0, reason: not valid java name */
    public static final void m14calculateHeightAndShowWebViewAfterNewActivity$lambda0(k kVar, String str) {
        p210v8.i.f(kVar, "this$0");
        try {
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, kVar.new f(kVar.pageRectToViewHeight(kVar.activity, new JSONObject(str)), null), 1, null);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private final void enableWebViewRemoteDebugging() {
        if (com.onesignal.debug.internal.logging.b.atLogLevel(p131n5.b.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    private final int getWebViewMaxSizeX(Activity activity) {
        if (this.messageContent.isFullBleed()) {
            return com.onesignal.common.l.INSTANCE.getFullbleedWindowWidth(activity);
        }
        return com.onesignal.common.l.INSTANCE.getWindowWidth(activity) - (MARGIN_PX_SIZE * 2);
    }

    private final int getWebViewMaxSizeY(Activity activity) {
        return com.onesignal.common.l.INSTANCE.getWindowHeight(activity) - (this.messageContent.isFullBleed() ? 0 : MARGIN_PX_SIZE * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int pageRectToViewHeight(Activity activity, JSONObject jSONObject) {
        try {
            int iDpToPx = com.onesignal.common.l.INSTANCE.dpToPx(jSONObject.getJSONObject("rect").getInt("height"));
            com.onesignal.debug.internal.logging.b.debug$default("getPageHeightData:pxHeight: " + iDpToPx, null, 2, null);
            int webViewMaxSizeY = getWebViewMaxSizeY(activity);
            if (iDpToPx <= webViewMaxSizeY) {
                return iDpToPx;
            }
            com.onesignal.debug.internal.logging.b.debug$default("getPageHeightData:pxHeight is over screen max: " + webViewMaxSizeY, null, 2, null);
            return webViewMaxSizeY;
        } catch (JSONException e10) {
            com.onesignal.debug.internal.logging.b.error("pageRectToViewHeight could not get page height", e10);
            return -1;
        }
    }

    private final void setMessageView(com.onesignal.inAppMessages.internal.display.impl.d dVar) {
        this.messageView = dVar;
    }

    private final void setWebViewToMaxSize(Activity activity) {
        com.onesignal.inAppMessages.internal.display.impl.g gVar = this.webView;
        p210v8.i.c(gVar);
        gVar.layout(0, 0, getWebViewMaxSizeX(activity), getWebViewMaxSizeY(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:15:0x0035, B:22:0x004c, B:52:0x00e3, B:54:0x00e7, B:25:0x0059, B:47:0x00ce, B:49:0x00d2, B:32:0x0088, B:34:0x008c, B:37:0x0097, B:39:0x00aa, B:41:0x00b4, B:43:0x00ba), top: B:60:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:15:0x0035, B:22:0x004c, B:52:0x00e3, B:54:0x00e7, B:25:0x0059, B:47:0x00ce, B:49:0x00d2, B:32:0x0088, B:34:0x008c, B:37:0x0097, B:39:0x00aa, B:41:0x00b4, B:43:0x00ba), top: B:60:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f3, code lost:
    
        if (r12.checkIfShouldDismiss(r1) == r2) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showMessageView(java.lang.Integer r11, p123m8.d<? super p076h8.m> r12) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.k.showMessageView(java.lang.Integer, m8.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateSafeAreaInsets(p123m8.d<? super m> dVar) throws Throwable {
        U9.d dVar2 = I.a;
        Object objW = AbstractC0342z.w(n.a, new l(null), dVar);
        return objW == p134n8.a.f13404s ? objW : m.a;
    }

    public final void backgroundDismissAndAwaitNextMessage() {
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new d(null), 1, null);
    }

    public final void createNewInAppMessageView(boolean z6) {
        this.lastPageHeight = Integer.valueOf(this.messageContent.getPageHeight());
        boolean manifestMetaBoolean = AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), "com.onesignal.inAppMessageHideGrayOverlay");
        com.onesignal.inAppMessages.internal.display.impl.g gVar = this.webView;
        p210v8.i.c(gVar);
        setMessageView(new com.onesignal.inAppMessages.internal.display.impl.d(gVar, this.messageContent, z6, manifestMetaBoolean));
        com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
        p210v8.i.c(dVar);
        dVar.setMessageController(new g(this));
        this._applicationService.addActivityLifecycleHandler(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object dismissAndAwaitNextMessage(p123m8.d<? super m> dVar) {
        h hVar;
        k kVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.label = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object obj = hVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = hVar.label;
        m mVar = m.a;
        if (i11 == 0) {
            J7.a.v(obj);
            com.onesignal.inAppMessages.internal.display.impl.d dVar2 = this.messageView;
            if (dVar2 != null && !this.dismissFired) {
                this.dismissFired = true;
                this._lifecycle.messageWillDismiss(this.message);
                hVar.L$0 = this;
                hVar.label = 1;
                if (dVar2.dismissAndAwaitNextMessage(hVar) == aVar) {
                    return aVar;
                }
                kVar = this;
            }
            return mVar;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kVar = (k) hVar.L$0;
        J7.a.v(obj);
        kVar.dismissFired = false;
        kVar.setMessageView(null);
        return mVar;
    }

    @Override // X4.d
    public void onActivityAvailable(Activity activity) {
        p210v8.i.f(activity, "activity");
        String str = this.currentActivityName;
        this.activity = activity;
        this.currentActivityName = activity.getLocalClassName();
        com.onesignal.debug.internal.logging.b.debug$default("In app message activity available currentActivityName: " + this.currentActivityName + " lastActivityName: " + str, null, 2, null);
        com.onesignal.common.threading.a.suspendifyOnMain(new i(str, this, null));
    }

    @Override // X4.d
    public void onActivityStopped(Activity activity) {
        p210v8.i.f(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default(L9.g.x("\n            In app message activity stopped, cleaning views, currentActivityName: " + this.currentActivityName + "\n            activity: " + this.activity + "\n            messageView: " + this.messageView + "\n            "), null, 2, null);
        if (this.messageView == null || !p210v8.i.a(activity.getLocalClassName(), this.currentActivityName)) {
            return;
        }
        com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
        p210v8.i.c(dVar);
        dVar.removeAllViews();
    }

    public final void setContentSafeAreaInsets(com.onesignal.inAppMessages.internal.d dVar, Activity activity) {
        p210v8.i.f(dVar, "content");
        p210v8.i.f(activity, "activity");
        String contentHtml = dVar.getContentHtml();
        int[] cutoutAndStatusBarInsets = com.onesignal.common.l.INSTANCE.getCutoutAndStatusBarInsets(activity);
        dVar.setContentHtml(contentHtml + String.format(SET_SAFE_AREA_INSETS_SCRIPT, Arrays.copyOf(new Object[]{String.format(SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{Integer.valueOf(cutoutAndStatusBarInsets[0]), Integer.valueOf(cutoutAndStatusBarInsets[1]), Integer.valueOf(cutoutAndStatusBarInsets[2]), Integer.valueOf(cutoutAndStatusBarInsets[3])}, 4))}, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    public final Object setupWebView(Activity activity, String str, boolean z6, p123m8.d<? super m> dVar) {
        j jVar;
        k kVar;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.label = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object obj = jVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = jVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            enableWebViewRemoteDebugging();
            com.onesignal.inAppMessages.internal.display.impl.g gVar = new com.onesignal.inAppMessages.internal.display.impl.g(activity);
            this.webView = gVar;
            gVar.setOverScrollMode(2);
            com.onesignal.inAppMessages.internal.display.impl.g gVar2 = this.webView;
            p210v8.i.c(gVar2);
            gVar2.setVerticalScrollBarEnabled(false);
            com.onesignal.inAppMessages.internal.display.impl.g gVar3 = this.webView;
            p210v8.i.c(gVar3);
            gVar3.setHorizontalScrollBarEnabled(false);
            com.onesignal.inAppMessages.internal.display.impl.g gVar4 = this.webView;
            p210v8.i.c(gVar4);
            gVar4.getSettings().setJavaScriptEnabled(true);
            com.onesignal.inAppMessages.internal.display.impl.g gVar5 = this.webView;
            p210v8.i.c(gVar5);
            gVar5.addJavascriptInterface(new b(), JS_OBJ_NAME);
            if (z6) {
                com.onesignal.inAppMessages.internal.display.impl.g gVar6 = this.webView;
                p210v8.i.c(gVar6);
                gVar6.setSystemUiVisibility(3074);
                if (Build.VERSION.SDK_INT >= 30) {
                    com.onesignal.inAppMessages.internal.display.impl.g gVar7 = this.webView;
                    p210v8.i.c(gVar7);
                    gVar7.setFitsSystemWindows(false);
                }
            }
            this._lifecycle.messageWillDisplay(this.message);
            X4.f fVar = this._applicationService;
            jVar.L$0 = this;
            jVar.L$1 = activity;
            jVar.L$2 = str;
            jVar.label = 1;
            if (fVar.waitUntilActivityReady(jVar) == aVar) {
                return aVar;
            }
            kVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) jVar.L$2;
            activity = (Activity) jVar.L$1;
            kVar = (k) jVar.L$0;
            J7.a.v(obj);
        }
        kVar.setWebViewToMaxSize(activity);
        com.onesignal.inAppMessages.internal.display.impl.g gVar8 = kVar.webView;
        p210v8.i.c(gVar8);
        gVar8.loadData(str, "text/html; charset=utf-8", "base64");
        return m.a;
    }
}
