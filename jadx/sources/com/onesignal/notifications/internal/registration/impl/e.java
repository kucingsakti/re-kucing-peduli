package com.onesignal.notifications.internal.registration.impl;

import D3.j;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.ExecutionException;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d {
    public static final a Companion = new a(null);
    private static final String FCM_APP_NAME = "ONESIGNAL_SDK_FCM_APP_NAME";
    private static final String FCM_DEFAULT_API_KEY_BASE64 = "QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV";
    private static final String FCM_DEFAULT_APP_ID = "1:754795614042:android:c682b8144a8dd52bc1ad63";
    private static final String FCM_DEFAULT_PROJECT_ID = "onesignal-shared-public";
    private final X4.f _applicationService;
    private com.onesignal.core.internal.config.b _configModelStore;
    private final String apiKey;
    private final String appId;
    private D3.g firebaseApp;
    private final String projectId;

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.onesignal.core.internal.config.b bVar, X4.f fVar, com.onesignal.notifications.internal.registration.impl.a aVar, p025c5.c cVar) {
        super(cVar, bVar, aVar);
        i.f(bVar, "_configModelStore");
        i.f(fVar, "_applicationService");
        i.f(aVar, "upgradePrompt");
        i.f(cVar, "deviceService");
        this._configModelStore = bVar;
        this._applicationService = fVar;
        com.onesignal.core.internal.config.c fcmParams = ((com.onesignal.core.internal.config.a) bVar.getModel()).getFcmParams();
        String projectId = fcmParams.getProjectId();
        this.projectId = projectId == null ? FCM_DEFAULT_PROJECT_ID : projectId;
        String appId = fcmParams.getAppId();
        this.appId = appId == null ? FCM_DEFAULT_APP_ID : appId;
        byte[] bArrDecode = Base64.decode(FCM_DEFAULT_API_KEY_BASE64, 0);
        i.e(bArrDecode, "decode(FCM_DEFAULT_API_KEY_BASE64, Base64.DEFAULT)");
        String str = new String(bArrDecode, L9.a.a);
        String apiKey = fcmParams.getApiKey();
        this.apiKey = apiKey != null ? apiKey : str;
    }

    private final String getTokenWithClassFirebaseMessaging() throws Exception {
        D3.g gVar = this.firebaseApp;
        i.c(gVar);
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
        firebaseMessaging.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        firebaseMessaging.f9991f.execute(new D4.a(firebaseMessaging, 19, taskCompletionSource));
        P2.f fVar = taskCompletionSource.a;
        i.e(fVar, "fcmInstance.token");
        try {
            Object objA = Tasks.a(fVar);
            i.e(objA, "await(tokenTask)");
            return (String) objA;
        } catch (ExecutionException e10) {
            Exception excF = fVar.f();
            if (excF == null) {
                throw e10;
            }
            throw excF;
        }
    }

    private final void initFirebaseApp(String str) {
        if (this.firebaseApp != null) {
            return;
        }
        String str2 = this.appId;
        Preconditions.f(str2, "ApplicationId must be set.");
        String str3 = this.apiKey;
        Preconditions.f(str3, "ApiKey must be set.");
        this.firebaseApp = D3.g.f(new j(str2, str3, null, null, str, null, this.projectId), this._applicationService.getAppContext(), FCM_APP_NAME);
    }

    @Override // com.onesignal.notifications.internal.registration.impl.d
    public String getProviderName() {
        return "FCM";
    }

    @Override // com.onesignal.notifications.internal.registration.impl.d
    public Object getToken(String str, p123m8.d<? super String> dVar) throws ExecutionException, InterruptedException {
        initFirebaseApp(str);
        return getTokenWithClassFirebaseMessaging();
    }

    public final X4.f get_applicationService() {
        return this._applicationService;
    }

    public final com.onesignal.core.internal.config.b get_configModelStore() {
        return this._configModelStore;
    }

    public final void set_configModelStore(com.onesignal.core.internal.config.b bVar) {
        i.f(bVar, "<set-?>");
        this._configModelStore = bVar;
    }
}
