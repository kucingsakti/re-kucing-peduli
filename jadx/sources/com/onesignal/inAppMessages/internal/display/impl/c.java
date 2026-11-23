package com.onesignal.inAppMessages.internal.display.impl;

import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import S9.n;
import android.app.Activity;
import android.util.Base64;
import com.rollbar.notifier.sender.SyncSender;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import p076h8.m;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p183s5.a {
    public static final a Companion = new a(null);
    private static final int IN_APP_MESSAGE_INIT_DELAY = 200;
    private final X4.f _applicationService;
    private final p161q5.b _backend;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final p075h6.a _influenceManager;
    private final p043e5.a _languageContext;
    private final p198u5.b _lifecycle;
    private final p227x5.a _promptFactory;
    private final p110l5.a _time;
    private k lastInstance;

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(p123m8.d<? super b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.displayMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.display.impl.c$c, reason: collision with other inner class name */
    public static final class C0038c extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0038c(p123m8.d<? super C0038c> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.displayPreviewMessage(null, this);
        }
    }

    public static final class d extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public d(p123m8.d<? super d> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.initInAppMessage(null, null, null, this);
        }
    }

    public static final class e extends p144o8.g implements p200u8.c {
        final /* synthetic */ String $base64Str;
        final /* synthetic */ com.onesignal.inAppMessages.internal.d $content;
        final /* synthetic */ Activity $currentActivity;
        final /* synthetic */ k $webViewManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(k kVar, Activity activity, String str, com.onesignal.inAppMessages.internal.d dVar, p123m8.d<? super e> dVar2) {
            super(2, dVar2);
            this.$webViewManager = kVar;
            this.$currentActivity = activity;
            this.$base64Str = str;
            this.$content = dVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return new e(this.$webViewManager, this.$currentActivity, this.$base64Str, this.$content, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((e) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) throws Exception {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    J7.a.v(obj);
                    k kVar = this.$webViewManager;
                    Activity activity = this.$currentActivity;
                    String str = this.$base64Str;
                    p210v8.i.e(str, "base64Str");
                    boolean zIsFullBleed = this.$content.isFullBleed();
                    this.label = 1;
                    if (kVar.setupWebView(activity, str, zIsFullBleed, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    J7.a.v(obj);
                }
            } catch (Exception e10) {
                if (e10.getMessage() != null) {
                    String message = e10.getMessage();
                    p210v8.i.c(message);
                    if (L9.f.J(message, "No WebView installed", false)) {
                        com.onesignal.debug.internal.logging.b.error("Error setting up WebView: ", e10);
                    }
                }
                throw e10;
            }
            return m.a;
        }
    }

    public static final class f extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public f(p123m8.d<? super f> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.showMessageContent(null, null, this);
        }
    }

    public c(X4.f fVar, p198u5.b bVar, p227x5.a aVar, p161q5.b bVar2, p075h6.a aVar2, com.onesignal.core.internal.config.b bVar3, p043e5.a aVar3, p110l5.a aVar4) {
        p210v8.i.f(fVar, "_applicationService");
        p210v8.i.f(bVar, "_lifecycle");
        p210v8.i.f(aVar, "_promptFactory");
        p210v8.i.f(bVar2, "_backend");
        p210v8.i.f(aVar2, "_influenceManager");
        p210v8.i.f(bVar3, "_configModelStore");
        p210v8.i.f(aVar3, "_languageContext");
        p210v8.i.f(aVar4, "_time");
        this._applicationService = fVar;
        this._lifecycle = bVar;
        this._promptFactory = aVar;
        this._backend = bVar2;
        this._influenceManager = aVar2;
        this._configModelStore = bVar3;
        this._languageContext = aVar3;
        this._time = aVar4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object initInAppMessage(Activity activity, com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.d dVar, p123m8.d<? super m> dVar2) {
        d dVar3;
        Activity activity2;
        com.onesignal.inAppMessages.internal.d dVar4;
        if (dVar2 instanceof d) {
            dVar3 = (d) dVar2;
            int i10 = dVar3.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar3.label = i10 - Integer.MIN_VALUE;
            } else {
                dVar3 = new d(dVar2);
            }
        } else {
            dVar3 = new d(dVar2);
        }
        Object obj = dVar3.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = dVar3.label;
        try {
            if (i11 == 0) {
                J7.a.v(obj);
                String contentHtml = dVar.getContentHtml();
                p210v8.i.c(contentHtml);
                Charset charsetForName = Charset.forName(SyncSender.UTF_8);
                p210v8.i.e(charsetForName, "forName(charsetName)");
                byte[] bytes = contentHtml.getBytes(charsetForName);
                p210v8.i.e(bytes, "this as java.lang.String).getBytes(charset)");
                String strEncodeToString = Base64.encodeToString(bytes, 2);
                k kVar = new k(aVar, activity, dVar, this._lifecycle, this._applicationService, this._promptFactory);
                this.lastInstance = kVar;
                if (dVar.isFullBleed()) {
                    activity2 = activity;
                    dVar4 = dVar;
                    kVar.setContentSafeAreaInsets(dVar4, activity2);
                } else {
                    activity2 = activity;
                    dVar4 = dVar;
                }
                U9.d dVar5 = I.a;
                O9.d dVar6 = n.a;
                e eVar = new e(kVar, activity2, strEncodeToString, dVar4, null);
                dVar3.label = 1;
                if (AbstractC0342z.w(dVar6, eVar, dVar3) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
        } catch (UnsupportedEncodingException e10) {
            com.onesignal.debug.internal.logging.b.error("Catch on initInAppMessage: ", e10);
        }
        return m.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object showMessageContent(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.d dVar, p123m8.d<? super m> dVar2) {
        f fVar;
        c cVar;
        c cVar2;
        com.onesignal.inAppMessages.internal.a aVar2;
        Activity activity;
        if (dVar2 instanceof f) {
            fVar = (f) dVar2;
            int i10 = fVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.label = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar2);
            }
        } else {
            fVar = new f(dVar2);
        }
        Object obj = fVar.result;
        p134n8.a aVar3 = p134n8.a.f13404s;
        int i11 = fVar.label;
        m mVar = m.a;
        if (i11 != 0) {
            if (i11 == 1) {
                activity = (Activity) fVar.L$3;
                dVar = (com.onesignal.inAppMessages.internal.d) fVar.L$2;
                aVar2 = (com.onesignal.inAppMessages.internal.a) fVar.L$1;
                cVar2 = (c) fVar.L$0;
                J7.a.v(obj);
                cVar2.lastInstance = null;
                fVar.L$0 = null;
                fVar.L$1 = null;
                fVar.L$2 = null;
                fVar.L$3 = null;
                fVar.label = 2;
                if (cVar2.initInAppMessage(activity, aVar2, dVar, fVar) != aVar3) {
                    return aVar3;
                }
            } else {
                if (i11 != 2 && i11 != 3) {
                    if (i11 == 4) {
                        dVar = (com.onesignal.inAppMessages.internal.d) fVar.L$2;
                        aVar = (com.onesignal.inAppMessages.internal.a) fVar.L$1;
                        cVar = (c) fVar.L$0;
                        J7.a.v(obj);
                        fVar.L$0 = null;
                        fVar.L$1 = null;
                        fVar.L$2 = null;
                        fVar.label = 5;
                        if (cVar.showMessageContent(aVar, dVar, fVar) != aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i11 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        J7.a.v(obj);
                    }
                    return mVar;
                }
                J7.a.v(obj);
            }
            return mVar;
        }
        J7.a.v(obj);
        Activity current = this._applicationService.getCurrent();
        com.onesignal.debug.internal.logging.b.debug$default("InAppDisplayer.showMessageContent: in app message on currentActivity: " + current, null, 2, null);
        if (current == null) {
            fVar.L$0 = this;
            fVar.L$1 = aVar;
            fVar.L$2 = dVar;
            fVar.label = 4;
            if (AbstractC0342z.e(200L, fVar) != aVar3) {
                cVar = this;
                fVar.L$0 = null;
                fVar.L$1 = null;
                fVar.L$2 = null;
                fVar.label = 5;
                if (cVar.showMessageContent(aVar, dVar, fVar) != aVar3) {
                    return mVar;
                }
            }
        } else if (this.lastInstance == null || !aVar.isPreview()) {
            fVar.label = 3;
            if (initInAppMessage(current, aVar, dVar, fVar) != aVar3) {
                return mVar;
            }
        } else {
            k kVar = this.lastInstance;
            p210v8.i.c(kVar);
            fVar.L$0 = this;
            fVar.L$1 = aVar;
            fVar.L$2 = dVar;
            fVar.L$3 = current;
            fVar.label = 1;
            if (kVar.dismissAndAwaitNextMessage(fVar) != aVar3) {
                cVar2 = this;
                aVar2 = aVar;
                activity = current;
                cVar2.lastInstance = null;
                fVar.L$0 = null;
                fVar.L$1 = null;
                fVar.L$2 = null;
                fVar.L$3 = null;
                fVar.label = 2;
                if (cVar2.initInAppMessage(activity, aVar2, dVar, fVar) != aVar3) {
                    return mVar;
                }
            }
        }
        return aVar3;
    }

    @Override // p183s5.a
    public void dismissCurrentInAppMessage() {
        com.onesignal.debug.internal.logging.b.debug$default("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + this.lastInstance, null, 2, null);
        k kVar = this.lastInstance;
        if (kVar != null) {
            p210v8.i.c(kVar);
            kVar.backgroundDismissAndAwaitNextMessage();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (r2.showMessageContent(r9, r10, r0) == r1) goto L24;
     */
    @Override // p183s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object displayMessage(com.onesignal.inAppMessages.internal.a r9, p123m8.d<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.onesignal.inAppMessages.internal.display.impl.c.b
            if (r0 == 0) goto L13
            r0 = r10
            com.onesignal.inAppMessages.internal.display.impl.c$b r0 = (com.onesignal.inAppMessages.internal.display.impl.c.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onesignal.inAppMessages.internal.display.impl.c$b r0 = new com.onesignal.inAppMessages.internal.display.impl.c$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            n8.a r1 = p134n8.a.f13404s
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            J7.a.v(r10)
            goto La5
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.lang.Object r9 = r0.L$1
            com.onesignal.inAppMessages.internal.a r9 = (com.onesignal.inAppMessages.internal.a) r9
            java.lang.Object r2 = r0.L$0
            com.onesignal.inAppMessages.internal.display.impl.c r2 = (com.onesignal.inAppMessages.internal.display.impl.c) r2
            J7.a.v(r10)
            goto L6a
        L3f:
            J7.a.v(r10)
            q5.b r10 = r8._backend
            com.onesignal.core.internal.config.b r2 = r8._configModelStore
            com.onesignal.common.modeling.i r2 = r2.getModel()
            com.onesignal.core.internal.config.a r2 = (com.onesignal.core.internal.config.a) r2
            java.lang.String r2 = r2.getAppId()
            java.lang.String r5 = r9.getMessageId()
            r5.a r6 = p172r5.a.INSTANCE
            e5.a r7 = r8._languageContext
            java.lang.String r6 = r6.variantIdForMessage(r9, r7)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r10.getIAMData(r2, r5, r6, r0)
            if (r10 != r1) goto L69
            goto La4
        L69:
            r2 = r8
        L6a:
            q5.a r10 = (p161q5.a) r10
            com.onesignal.inAppMessages.internal.d r4 = r10.getContent()
            r5 = 0
            if (r4 == 0) goto La8
            com.onesignal.inAppMessages.internal.d r4 = r10.getContent()
            p210v8.i.c(r4)
            java.lang.Double r4 = r4.getDisplayDuration()
            p210v8.i.c(r4)
            double r6 = r4.doubleValue()
            r9.setDisplayDuration(r6)
            h6.a r4 = r2._influenceManager
            java.lang.String r6 = r9.getMessageId()
            r4.onInAppMessageDisplayed(r6)
            com.onesignal.inAppMessages.internal.d r10 = r10.getContent()
            p210v8.i.c(r10)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = r2.showMessageContent(r9, r10, r0)
            if (r9 != r1) goto La5
        La4:
            return r1
        La5:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        La8:
            boolean r9 = r10.getShouldRetry()
            if (r9 == 0) goto Laf
            return r5
        Laf:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.c.displayMessage(com.onesignal.inAppMessages.internal.a, m8.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (r2.showMessageContent(r8, r9, r0) == r1) goto L25;
     */
    @Override // p183s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object displayPreviewMessage(java.lang.String r8, p123m8.d<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.onesignal.inAppMessages.internal.display.impl.c.C0038c
            if (r0 == 0) goto L13
            r0 = r9
            com.onesignal.inAppMessages.internal.display.impl.c$c r0 = (com.onesignal.inAppMessages.internal.display.impl.c.C0038c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onesignal.inAppMessages.internal.display.impl.c$c r0 = new com.onesignal.inAppMessages.internal.display.impl.c$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            n8.a r1 = p134n8.a.f13404s
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            J7.a.v(r9)
            goto L89
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            java.lang.Object r8 = r0.L$1
            com.onesignal.inAppMessages.internal.a r8 = (com.onesignal.inAppMessages.internal.a) r8
            java.lang.Object r2 = r0.L$0
            com.onesignal.inAppMessages.internal.display.impl.c r2 = (com.onesignal.inAppMessages.internal.display.impl.c) r2
            J7.a.v(r9)
            goto L67
        L3e:
            J7.a.v(r9)
            com.onesignal.inAppMessages.internal.a r9 = new com.onesignal.inAppMessages.internal.a
            l5.a r2 = r7._time
            r9.<init>(r4, r2)
            q5.b r2 = r7._backend
            com.onesignal.core.internal.config.b r5 = r7._configModelStore
            com.onesignal.common.modeling.i r5 = r5.getModel()
            com.onesignal.core.internal.config.a r5 = (com.onesignal.core.internal.config.a) r5
            java.lang.String r5 = r5.getAppId()
            r0.L$0 = r7
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r8 = r2.getIAMPreviewData(r5, r8, r0)
            if (r8 != r1) goto L63
            goto L88
        L63:
            r2 = r9
            r9 = r8
            r8 = r2
            r2 = r7
        L67:
            com.onesignal.inAppMessages.internal.d r9 = (com.onesignal.inAppMessages.internal.d) r9
            if (r9 != 0) goto L6d
            r4 = 0
            goto L89
        L6d:
            java.lang.Double r5 = r9.getDisplayDuration()
            p210v8.i.c(r5)
            double r5 = r5.doubleValue()
            r8.setDisplayDuration(r5)
            r5 = 0
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = r2.showMessageContent(r8, r9, r0)
            if (r8 != r1) goto L89
        L88:
            return r1
        L89:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.c.displayPreviewMessage(java.lang.String, m8.d):java.lang.Object");
    }
}
