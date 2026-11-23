package com.onesignal.notifications.internal.registration.impl;

import com.onesignal.common.AndroidUtils;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import p076h8.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements p036d6.b, com.onesignal.notifications.internal.registration.impl.b {
    public static final a Companion = new a(null);
    private static final int REGISTRATION_RETRY_BACKOFF_MS = 10000;
    private static final int REGISTRATION_RETRY_COUNT = 5;
    private com.onesignal.core.internal.config.b _configModelStore;
    private final p025c5.c _deviceService;
    private final com.onesignal.notifications.internal.registration.impl.a _upgradePrompt;

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends p144o8.c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(p123m8.d<? super b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.attemptRegistration(null, 0, this);
        }
    }

    public static final class c extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(p123m8.d<? super c> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.internalRegisterForPush(null, this);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.notifications.internal.registration.impl.d$d, reason: collision with other inner class name */
    public static final class C0074d extends p144o8.c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0074d(p123m8.d<? super C0074d> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.registerInBackground(null, this);
        }
    }

    public d(p025c5.c cVar, com.onesignal.core.internal.config.b bVar, com.onesignal.notifications.internal.registration.impl.a aVar) {
        i.f(cVar, "_deviceService");
        i.f(bVar, "_configModelStore");
        i.f(aVar, "_upgradePrompt");
        this._deviceService = cVar;
        this._configModelStore = bVar;
        this._upgradePrompt = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00d5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00f0, please report this as an issue */
    public final Object attemptRegistration(String str, int i10, p123m8.d<? super p036d6.a> dVar) {
        b bVar;
        d dVar2;
        p208v6.f fVarPushStatusFromThrowable;
        String rootCauseMessage;
        Exception exc;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.label = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object token = bVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i12 = bVar.label;
        if (i12 == 0) {
            J7.a.v(token);
            try {
                bVar.L$0 = this;
                bVar.I$0 = i10;
                bVar.label = 1;
                token = getToken(str, bVar);
                if (token == aVar) {
                    return aVar;
                }
                dVar2 = this;
            } catch (IOException e10) {
                e = e10;
                dVar2 = this;
                fVarPushStatusFromThrowable = dVar2.pushStatusFromThrowable(e);
                rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage)) {
                }
                exc = new Exception(e);
                if (i10 >= 4) {
                    com.onesignal.debug.internal.logging.b.error("Retry count of 5 exceed! Could not get a " + dVar2.getProviderName() + " Token.", exc);
                } else {
                    com.onesignal.debug.internal.logging.b.info("'Google Play services' returned " + rootCauseMessage + " error. Current retry count: " + i10, exc);
                    if (i10 == 2) {
                        return new p036d6.a(null, fVarPushStatusFromThrowable);
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                dVar2 = this;
                com.onesignal.debug.internal.logging.b.error("Unknown error getting " + dVar2.getProviderName() + " Token", th);
                return new p036d6.a(null, p208v6.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = bVar.I$0;
            dVar2 = (d) bVar.L$0;
            try {
                J7.a.v(token);
            } catch (IOException e11) {
                e = e11;
                fVarPushStatusFromThrowable = dVar2.pushStatusFromThrowable(e);
                rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage) && !"AUTHENTICATION_FAILED".equals(rootCauseMessage)) {
                    com.onesignal.debug.internal.logging.b.error("Error Getting " + dVar2.getProviderName() + " Token", new Exception(e));
                    return new p036d6.a(null, fVarPushStatusFromThrowable);
                }
                exc = new Exception(e);
                if (i10 >= 4) {
                    com.onesignal.debug.internal.logging.b.error("Retry count of 5 exceed! Could not get a " + dVar2.getProviderName() + " Token.", exc);
                } else {
                    com.onesignal.debug.internal.logging.b.info("'Google Play services' returned " + rootCauseMessage + " error. Current retry count: " + i10, exc);
                    if (i10 == 2) {
                        return new p036d6.a(null, fVarPushStatusFromThrowable);
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                com.onesignal.debug.internal.logging.b.error("Unknown error getting " + dVar2.getProviderName() + " Token", th);
                return new p036d6.a(null, p208v6.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
            }
        }
        String str2 = (String) token;
        com.onesignal.debug.internal.logging.b.info$default("Device registered, push token = " + str2, null, 2, null);
        return new p036d6.a(str2, p208v6.f.SUBSCRIBED);
    }

    public static /* synthetic */ Object fireCallback$suspendImpl(d dVar, String str, p123m8.d dVar2) throws Exception {
        throw new Exception("Google has no callback mechanism for push registration!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.onesignal.notifications.internal.registration.impl.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.onesignal.notifications.internal.registration.impl.d] */
    /* JADX WARN: Type inference failed for: r7v6 */
    public final Object internalRegisterForPush(String str, p123m8.d<? super p036d6.a> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.label = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objRegisterInBackground = cVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = cVar.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    J7.a.v(objRegisterInBackground);
                    return (p036d6.a) objRegisterInBackground;
                }
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(objRegisterInBackground);
                com.onesignal.debug.internal.logging.b.error$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                return new p036d6.a(null, p208v6.f.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
            }
            J7.a.v(objRegisterInBackground);
            try {
                if (this._deviceService.isGMSInstalledAndEnabled()) {
                    cVar.L$0 = this;
                    cVar.label = 1;
                    objRegisterInBackground = registerInBackground(str, cVar);
                    if (objRegisterInBackground != aVar) {
                        return (p036d6.a) objRegisterInBackground;
                    }
                } else {
                    com.onesignal.notifications.internal.registration.impl.a aVar2 = this._upgradePrompt;
                    cVar.L$0 = this;
                    cVar.label = 2;
                    if (aVar2.showUpdateGPSDialog(cVar) != aVar) {
                        com.onesignal.debug.internal.logging.b.error$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                        return new p036d6.a(null, p208v6.f.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
                    }
                }
                return aVar;
            } catch (Throwable th) {
                th = th;
                str = this;
                com.onesignal.debug.internal.logging.b.error("Could not register with " + str.getProviderName() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
                return new p036d6.a(null, p208v6.f.FIREBASE_FCM_INIT_ERROR);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final boolean isValidProjectNumber(String str) {
        try {
            i.c(str);
            Float.parseFloat(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private final p208v6.f pushStatusFromThrowable(Throwable th) {
        String rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(th);
        if (!(th instanceof IOException)) {
            return p208v6.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION;
        }
        if (i.a(rootCauseMessage, "SERVICE_NOT_AVAILABLE")) {
            return p208v6.f.FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE;
        }
        return i.a(rootCauseMessage, "AUTHENTICATION_FAILED") ? p208v6.f.FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED : p208v6.f.FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER;
    }

    public static /* synthetic */ Object registerForPush$suspendImpl(d dVar, p123m8.d dVar2) {
        if (!((com.onesignal.core.internal.config.a) dVar._configModelStore.getModel()).isInitializedWithRemote()) {
            return new p036d6.a(null, p208v6.f.FIREBASE_FCM_INIT_ERROR);
        }
        if (!dVar._deviceService.getHasFCMLibrary()) {
            com.onesignal.debug.internal.logging.b.fatal$default("The Firebase FCM library is missing! Please make sure to include it in your project.", null, 2, null);
            return new p036d6.a(null, p208v6.f.MISSING_FIREBASE_FCM_LIBRARY);
        }
        if (!dVar.isValidProjectNumber(((com.onesignal.core.internal.config.a) dVar._configModelStore.getModel()).getGoogleProjectNumber())) {
            com.onesignal.debug.internal.logging.b.error$default("Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.", null, 2, null);
            return new p036d6.a(null, p208v6.f.INVALID_FCM_SENDER_ID);
        }
        String googleProjectNumber = ((com.onesignal.core.internal.config.a) dVar._configModelStore.getModel()).getGoogleProjectNumber();
        i.c(googleProjectNumber);
        return dVar.internalRegisterForPush(googleProjectNumber, dVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (N9.AbstractC0342z.e(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007c -> B:29:0x007f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object registerInBackground(java.lang.String r10, p123m8.d<? super p036d6.a> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.onesignal.notifications.internal.registration.impl.d.C0074d
            if (r0 == 0) goto L13
            r0 = r11
            com.onesignal.notifications.internal.registration.impl.d$d r0 = (com.onesignal.notifications.internal.registration.impl.d.C0074d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onesignal.notifications.internal.registration.impl.d$d r0 = new com.onesignal.notifications.internal.registration.impl.d$d
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            n8.a r1 = p134n8.a.f13404s
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r0.L$0
            com.onesignal.notifications.internal.registration.impl.d r5 = (com.onesignal.notifications.internal.registration.impl.d) r5
            J7.a.v(r11)
            goto L7f
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r0.L$0
            com.onesignal.notifications.internal.registration.impl.d r5 = (com.onesignal.notifications.internal.registration.impl.d) r5
            J7.a.v(r11)
            goto L66
        L4a:
            J7.a.v(r11)
            r11 = 0
            r2 = r9
        L4f:
            r5 = 5
            if (r11 >= r5) goto L84
            r0.L$0 = r2
            r0.L$1 = r10
            r0.I$0 = r11
            r0.label = r4
            java.lang.Object r5 = r2.attemptRegistration(r10, r11, r0)
            if (r5 != r1) goto L61
            goto L7e
        L61:
            r8 = r2
            r2 = r10
            r10 = r11
            r11 = r5
            r5 = r8
        L66:
            d6.a r11 = (p036d6.a) r11
            if (r11 == 0) goto L6b
            return r11
        L6b:
            int r11 = r10 + 1
            int r11 = r11 * 10000
            long r6 = (long) r11
            r0.L$0 = r5
            r0.L$1 = r2
            r0.I$0 = r10
            r0.label = r3
            java.lang.Object r11 = N9.AbstractC0342z.e(r6, r0)
            if (r11 != r1) goto L7f
        L7e:
            return r1
        L7f:
            int r11 = r10 + 1
            r10 = r2
            r2 = r5
            goto L4f
        L84:
            d6.a r10 = new d6.a
            r11 = 0
            v6.f r0 = p208v6.f.FIREBASE_FCM_INIT_ERROR
            r10.<init>(r11, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.registration.impl.d.registerInBackground(java.lang.String, m8.d):java.lang.Object");
    }

    @Override // com.onesignal.notifications.internal.registration.impl.b
    public Object fireCallback(String str, p123m8.d<? super m> dVar) {
        return fireCallback$suspendImpl(this, str, dVar);
    }

    public abstract String getProviderName();

    public abstract Object getToken(String str, p123m8.d<? super String> dVar) throws ExecutionException, InterruptedException, IOException;

    @Override // p036d6.b
    public Object registerForPush(p123m8.d<? super p036d6.a> dVar) {
        return registerForPush$suspendImpl(this, dVar);
    }
}
