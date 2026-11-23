package com.onesignal.internal;

import J5.n;
import U4.d;
import android.content.Context;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.h;
import com.onesignal.core.CoreModule;
import com.onesignal.session.SessionModule;
import com.onesignal.user.UserModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p064g5.e;
import p064g5.f;
import p076h8.m;
import p086i8.l;
import p111l6.c;
import p144o8.g;
import p151p5.j;
import p173r6.o;
import p210v8.i;
import p210v8.k;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
public final class a implements P4.a, U4.b {
    private Boolean _consentGiven;
    private Boolean _consentRequired;
    private Boolean _disableGMSMissingPrompt;
    private com.onesignal.core.internal.config.a configModel;
    private boolean isInitialized;
    private final List<String> listOfModules;
    private f operationRepo;
    private final d services;
    private c sessionModel;
    private final String sdkVersion = h.SDK_VERSION;
    private final p131n5.a debug = new p141o5.a();
    private final Object initLock = new Object();
    private final Object loginLock = new Object();

    /* JADX INFO: renamed from: com.onesignal.internal.a$a, reason: collision with other inner class name */
    public static final class C0051a extends k implements p200u8.c {
        final /* synthetic */ String $externalId;
        final /* synthetic */ String $jwtBearerToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0051a(String str, String str2) {
            super(2);
            this.$externalId = str;
            this.$jwtBearerToken = str2;
        }

        @Override // p200u8.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((p162q6.a) obj, (com.onesignal.user.internal.properties.a) obj2);
            return m.a;
        }

        public final void invoke(p162q6.a aVar, com.onesignal.user.internal.properties.a aVar2) {
            i.f(aVar, "identityModel");
            i.f(aVar2, "<anonymous parameter 1>");
            aVar.setExternalId(this.$externalId);
            aVar.setJwtToken(this.$jwtBearerToken);
        }
    }

    public static final class b extends g implements p200u8.b {
        final /* synthetic */ t $currentIdentityExternalId;
        final /* synthetic */ t $currentIdentityOneSignalId;
        final /* synthetic */ String $externalId;
        final /* synthetic */ t $newIdentityOneSignalId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, String str, t tVar2, t tVar3, p123m8.d<? super b> dVar) {
            super(1, dVar);
            this.$newIdentityOneSignalId = tVar;
            this.$externalId = str;
            this.$currentIdentityExternalId = tVar2;
            this.$currentIdentityOneSignalId = tVar3;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(p123m8.d<?> dVar) {
            return a.this.new b(this.$newIdentityOneSignalId, this.$externalId, this.$currentIdentityExternalId, this.$currentIdentityOneSignalId, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            String onesignalId;
            String externalId;
            p162q6.a aVar;
            p162q6.a aVar2;
            p134n8.a aVar3 = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                com.onesignal.core.internal.config.a aVar4 = a.this.configModel;
                i.c(aVar4);
                String appId = aVar4.getAppId();
                p162q6.b identityModelStore = a.this.getIdentityModelStore();
                if (identityModelStore == null || (aVar2 = (p162q6.a) identityModelStore.getModel()) == null || (onesignalId = aVar2.getOnesignalId()) == null) {
                    onesignalId = (String) this.$newIdentityOneSignalId.f15466s;
                }
                p162q6.b identityModelStore2 = a.this.getIdentityModelStore();
                if (identityModelStore2 == null || (aVar = (p162q6.a) identityModelStore2.getModel()) == null || (externalId = aVar.getExternalId()) == null) {
                    externalId = this.$externalId;
                }
                p173r6.f fVar = new p173r6.f(appId, onesignalId, externalId, (a.this.getUseIdentityVerification() || this.$currentIdentityExternalId.f15466s != null) ? null : (String) this.$currentIdentityOneSignalId.f15466s);
                f fVar2 = a.this.operationRepo;
                i.c(fVar2);
                this.label = 1;
                obj = e.enqueueAndWait$default(fVar2, fVar, false, this, 2, null);
                if (obj == aVar3) {
                    return aVar3;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                com.onesignal.debug.internal.logging.b.log(p131n5.b.ERROR, "Could not login user");
            }
            return m.a;
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super m> dVar) {
            return ((b) create(dVar)).invokeSuspend(m.a);
        }
    }

    public a() throws IllegalAccessException, InstantiationException {
        List<String> listC = l.C("com.onesignal.notifications.NotificationsModule", "com.onesignal.inAppMessages.InAppMessagesModule", "com.onesignal.location.LocationModule");
        this.listOfModules = listC;
        U4.c cVar = new U4.c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoreModule());
        arrayList.add(new SessionModule());
        arrayList.add(new UserModule());
        Iterator<String> it = listC.iterator();
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName(it.next()).newInstance();
                i.d(objNewInstance, "null cannot be cast to non-null type com.onesignal.common.modules.IModule");
                arrayList.add((T4.a) objNewInstance);
            } catch (ClassNotFoundException e10) {
                e10.printStackTrace();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((T4.a) it2.next()).register(cVar);
        }
        this.services = cVar.build();
    }

    private final void createAndSwitchToNewUser(boolean z6, p200u8.c cVar) {
        com.onesignal.debug.internal.logging.b.debug$default("createAndSwitchToNewUser()", null, 2, null);
        String strCreateLocalId = com.onesignal.common.d.INSTANCE.createLocalId();
        p162q6.a aVar = new p162q6.a();
        aVar.setOnesignalId(strCreateLocalId);
        com.onesignal.user.internal.properties.a aVar2 = new com.onesignal.user.internal.properties.a();
        aVar2.setOnesignalId(strCreateLocalId);
        if (cVar != null) {
            cVar.invoke(aVar, aVar2);
        }
        if (aVar.getJwtToken() != null) {
            setupNewSubscription(aVar, aVar2, z6, strCreateLocalId);
        }
        p162q6.b identityModelStore = getIdentityModelStore();
        i.c(identityModelStore);
        com.onesignal.common.modeling.e.replace$default(identityModelStore, aVar, null, 2, null);
        com.onesignal.user.internal.properties.b propertiesModelStore = getPropertiesModelStore();
        i.c(propertiesModelStore);
        com.onesignal.common.modeling.e.replace$default(propertiesModelStore, aVar2, null, 2, null);
    }

    public static /* synthetic */ void createAndSwitchToNewUser$default(a aVar, boolean z6, p200u8.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = false;
        }
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        aVar.createAndSwitchToNewUser(z6, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p162q6.b getIdentityModelStore() {
        return (p162q6.b) this.services.getService(p162q6.b.class);
    }

    private final p093j5.b getPreferencesService() {
        return (p093j5.b) this.services.getService(p093j5.b.class);
    }

    private final com.onesignal.user.internal.properties.b getPropertiesModelStore() {
        return (com.onesignal.user.internal.properties.b) this.services.getService(com.onesignal.user.internal.properties.b.class);
    }

    private final p208v6.e getSubscriptionModelStore() {
        return (p208v6.e) this.services.getService(p208v6.e.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getUseIdentityVerification() {
        com.onesignal.core.internal.config.a aVar = this.configModel;
        if (aVar != null) {
            return aVar.getUseIdentityVerification();
        }
        return true;
    }

    private final void setupNewSubscription(p162q6.a aVar, com.onesignal.user.internal.properties.a aVar2, boolean z6, String str) {
        Object next;
        String strCreateLocalId;
        String address;
        p208v6.f status;
        ArrayList arrayList = new ArrayList();
        p208v6.e subscriptionModelStore = getSubscriptionModelStore();
        i.c(subscriptionModelStore);
        Iterator<T> it = subscriptionModelStore.list().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((p208v6.d) next).getType() != p208v6.g.PUSH);
        p208v6.d dVar = (p208v6.d) next;
        p208v6.d dVar2 = new p208v6.d();
        if (dVar == null || (strCreateLocalId = dVar.getId()) == null) {
            strCreateLocalId = com.onesignal.common.d.INSTANCE.createLocalId();
        }
        dVar2.setId(strCreateLocalId);
        dVar2.setType(p208v6.g.PUSH);
        dVar2.setOptedIn(dVar != null ? dVar.getOptedIn() : true);
        if (dVar == null || (address = dVar.getAddress()) == null) {
            address = "";
        }
        dVar2.setAddress(address);
        if (dVar == null || (status = dVar.getStatus()) == null) {
            status = p208v6.f.NO_PERMISSION;
        }
        dVar2.setStatus(status);
        dVar2.setSdk(h.SDK_VERSION);
        String str2 = Build.VERSION.RELEASE;
        i.e(str2, "RELEASE");
        dVar2.setDeviceOS(str2);
        String carrierName = com.onesignal.common.c.INSTANCE.getCarrierName(((X4.f) this.services.getService(X4.f.class)).getAppContext());
        if (carrierName == null) {
            carrierName = "";
        }
        dVar2.setCarrier(carrierName);
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(((X4.f) this.services.getService(X4.f.class)).getAppContext());
        dVar2.setAppVersion(appVersion != null ? appVersion : "");
        com.onesignal.core.internal.config.a aVar3 = this.configModel;
        i.c(aVar3);
        aVar3.setPushSubscriptionId(dVar2.getId());
        arrayList.add(dVar2);
        p208v6.e subscriptionModelStore2 = getSubscriptionModelStore();
        i.c(subscriptionModelStore2);
        subscriptionModelStore2.clear("NO_PROPOGATE");
        p162q6.b identityModelStore = getIdentityModelStore();
        i.c(identityModelStore);
        com.onesignal.common.modeling.e.replace$default(identityModelStore, aVar, null, 2, null);
        com.onesignal.user.internal.properties.b propertiesModelStore = getPropertiesModelStore();
        i.c(propertiesModelStore);
        com.onesignal.common.modeling.e.replace$default(propertiesModelStore, aVar2, null, 2, null);
        if (z6) {
            p208v6.e subscriptionModelStore3 = getSubscriptionModelStore();
            i.c(subscriptionModelStore3);
            subscriptionModelStore3.replaceAll(arrayList, "NO_PROPOGATE");
            return;
        }
        if (dVar == null || (getUseIdentityVerification() && com.onesignal.common.d.INSTANCE.isLocalId(dVar.getId()))) {
            p208v6.e subscriptionModelStore4 = getSubscriptionModelStore();
            i.c(subscriptionModelStore4);
            com.onesignal.common.modeling.b.replaceAll$default(subscriptionModelStore4, arrayList, null, 2, null);
            return;
        }
        f fVar = this.operationRepo;
        i.c(fVar);
        com.onesignal.core.internal.config.a aVar4 = this.configModel;
        i.c(aVar4);
        e.enqueue$default(fVar, new o(aVar4.getAppId(), dVar.getId(), str), false, 2, null);
        p208v6.e subscriptionModelStore5 = getSubscriptionModelStore();
        i.c(subscriptionModelStore5);
        subscriptionModelStore5.replaceAll(arrayList, "NO_PROPOGATE");
    }

    public void addUserJwtInvalidatedListener(P4.b bVar) {
        i.f(bVar, "listener");
        getUser().addUserJwtInvalidatedListener(bVar);
    }

    @Override // U4.b
    public <T> List<T> getAllServices(Class<T> cls) {
        i.f(cls, "c");
        return this.services.getAllServices(cls);
    }

    public boolean getConsentGiven() {
        Boolean consentGiven;
        com.onesignal.core.internal.config.a aVar = this.configModel;
        return (aVar == null || (consentGiven = aVar.getConsentGiven()) == null) ? i.a(this._consentGiven, Boolean.TRUE) : consentGiven.booleanValue();
    }

    public boolean getConsentRequired() {
        Boolean consentRequired;
        com.onesignal.core.internal.config.a aVar = this.configModel;
        return (aVar == null || (consentRequired = aVar.getConsentRequired()) == null) ? i.a(this._consentRequired, Boolean.TRUE) : consentRequired.booleanValue();
    }

    @Override // P4.a
    public p131n5.a getDebug() {
        return this.debug;
    }

    public boolean getDisableGMSMissingPrompt() {
        com.onesignal.core.internal.config.a aVar = this.configModel;
        return aVar != null ? aVar.getDisableGMSMissingPrompt() : i.a(this._disableGMSMissingPrompt, Boolean.TRUE);
    }

    public j getInAppMessages() throws Exception {
        if (isInitialized()) {
            return (j) this.services.getService(j.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    public B5.a getLocation() throws Exception {
        if (isInitialized()) {
            return (B5.a) this.services.getService(B5.a.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    public n getNotifications() throws Exception {
        if (isInitialized()) {
            return (n) this.services.getService(n.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // U4.b
    public <T> T getService(Class<T> cls) {
        i.f(cls, "c");
        return (T) this.services.getService(cls);
    }

    @Override // U4.b
    public <T> T getServiceOrNull(Class<T> cls) {
        i.f(cls, "c");
        return (T) this.services.getServiceOrNull(cls);
    }

    public p065g6.a getSession() throws Exception {
        if (isInitialized()) {
            return (p065g6.a) this.services.getService(p065g6.a.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    public p121m6.a getUser() throws Exception {
        if (isInitialized()) {
            return (p121m6.a) this.services.getService(p121m6.a.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    @Override // U4.b
    public <T> boolean hasService(Class<T> cls) {
        i.f(cls, "c");
        return this.services.hasService(cls);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0166 A[Catch: all -> 0x003a, TryCatch #0 {, blocks: (B:4:0x002c, B:6:0x0033, B:11:0x003e, B:13:0x0097, B:15:0x00a4, B:19:0x00ad, B:21:0x00ba, B:26:0x00cd, B:28:0x00d7, B:30:0x00db, B:31:0x00e8, B:33:0x00ec, B:34:0x00f9, B:36:0x00fd, B:37:0x010e, B:39:0x011a, B:42:0x0130, B:79:0x027e, B:43:0x0152, B:45:0x0166, B:46:0x0170, B:48:0x018b, B:53:0x01b2, B:60:0x01c4, B:63:0x01d1, B:65:0x01d6, B:69:0x01e4, B:71:0x01ed, B:74:0x0214, B:77:0x022f, B:70:0x01e8, B:56:0x01bb, B:51:0x01ac, B:78:0x0246), top: B:84:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0170 A[Catch: all -> 0x003a, TryCatch #0 {, blocks: (B:4:0x002c, B:6:0x0033, B:11:0x003e, B:13:0x0097, B:15:0x00a4, B:19:0x00ad, B:21:0x00ba, B:26:0x00cd, B:28:0x00d7, B:30:0x00db, B:31:0x00e8, B:33:0x00ec, B:34:0x00f9, B:36:0x00fd, B:37:0x010e, B:39:0x011a, B:42:0x0130, B:79:0x027e, B:43:0x0152, B:45:0x0166, B:46:0x0170, B:48:0x018b, B:53:0x01b2, B:60:0x01c4, B:63:0x01d1, B:65:0x01d6, B:69:0x01e4, B:71:0x01ed, B:74:0x0214, B:77:0x022f, B:70:0x01e8, B:56:0x01bb, B:51:0x01ac, B:78:0x0246), top: B:84:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:48:0x018b A[Catch: all -> 0x003a, TryCatch #0 {, blocks: (B:4:0x002c, B:6:0x0033, B:11:0x003e, B:13:0x0097, B:15:0x00a4, B:19:0x00ad, B:21:0x00ba, B:26:0x00cd, B:28:0x00d7, B:30:0x00db, B:31:0x00e8, B:33:0x00ec, B:34:0x00f9, B:36:0x00fd, B:37:0x010e, B:39:0x011a, B:42:0x0130, B:79:0x027e, B:43:0x0152, B:45:0x0166, B:46:0x0170, B:48:0x018b, B:53:0x01b2, B:60:0x01c4, B:63:0x01d1, B:65:0x01d6, B:69:0x01e4, B:71:0x01ed, B:74:0x0214, B:77:0x022f, B:70:0x01e8, B:56:0x01bb, B:51:0x01ac, B:78:0x0246), top: B:84:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d6 A[Catch: all -> 0x003a, TryCatch #0 {, blocks: (B:4:0x002c, B:6:0x0033, B:11:0x003e, B:13:0x0097, B:15:0x00a4, B:19:0x00ad, B:21:0x00ba, B:26:0x00cd, B:28:0x00d7, B:30:0x00db, B:31:0x00e8, B:33:0x00ec, B:34:0x00f9, B:36:0x00fd, B:37:0x010e, B:39:0x011a, B:42:0x0130, B:79:0x027e, B:43:0x0152, B:45:0x0166, B:46:0x0170, B:48:0x018b, B:53:0x01b2, B:60:0x01c4, B:63:0x01d1, B:65:0x01d6, B:69:0x01e4, B:71:0x01ed, B:74:0x0214, B:77:0x022f, B:70:0x01e8, B:56:0x01bb, B:51:0x01ac, B:78:0x0246), top: B:84:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e8 A[Catch: all -> 0x003a, TryCatch #0 {, blocks: (B:4:0x002c, B:6:0x0033, B:11:0x003e, B:13:0x0097, B:15:0x00a4, B:19:0x00ad, B:21:0x00ba, B:26:0x00cd, B:28:0x00d7, B:30:0x00db, B:31:0x00e8, B:33:0x00ec, B:34:0x00f9, B:36:0x00fd, B:37:0x010e, B:39:0x011a, B:42:0x0130, B:79:0x027e, B:43:0x0152, B:45:0x0166, B:46:0x0170, B:48:0x018b, B:53:0x01b2, B:60:0x01c4, B:63:0x01d1, B:65:0x01d6, B:69:0x01e4, B:71:0x01ed, B:74:0x0214, B:77:0x022f, B:70:0x01e8, B:56:0x01bb, B:51:0x01ac, B:78:0x0246), top: B:84:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0212  */
    /* JADX WARN: Code duplicated, block: B:76:0x022d  */
    @Override // P4.a
    public boolean initWithContext(Context context, String str) {
        boolean z6;
        String string$default;
        String string$default2;
        Integer numSafeInt;
        p208v6.d dVar;
        p208v6.f fVar;
        boolean z10;
        String strSafeString;
        String carrierName;
        String appVersion;
        p208v6.f fVarFromInt;
        i.f(context, "context");
        p131n5.b bVar = p131n5.b.DEBUG;
        com.onesignal.debug.internal.logging.b.log(bVar, "initWithContext(context: " + context + ", appId: " + str + ')');
        synchronized (this.initLock) {
            if (isInitialized()) {
                com.onesignal.debug.internal.logging.b.log(bVar, "initWithContext: SDK already initialized");
                return true;
            }
            com.onesignal.debug.internal.logging.b.log(bVar, "initWithContext: SDK initializing");
            p093j5.c.INSTANCE.ensureNoObfuscatedPrefStore(context);
            X4.f fVar2 = (X4.f) this.services.getService(X4.f.class);
            i.d(fVar2, "null cannot be cast to non-null type com.onesignal.core.internal.application.impl.ApplicationService");
            ((com.onesignal.core.internal.application.impl.a) fVar2).start(context);
            com.onesignal.debug.internal.logging.b.INSTANCE.setApplicationService(fVar2);
            this.configModel = (com.onesignal.core.internal.config.a) ((com.onesignal.core.internal.config.b) this.services.getService(com.onesignal.core.internal.config.b.class)).getModel();
            this.sessionModel = (c) ((p111l6.d) this.services.getService(p111l6.d.class)).getModel();
            this.operationRepo = (f) this.services.getService(f.class);
            if (str == null) {
                com.onesignal.core.internal.config.a aVar = this.configModel;
                i.c(aVar);
                if (!aVar.hasProperty("appId")) {
                    com.onesignal.debug.internal.logging.b.warn$default("initWithContext called without providing appId, and no appId has been established!", null, 2, null);
                    return false;
                }
            }
            if (str != null) {
                com.onesignal.core.internal.config.a aVar2 = this.configModel;
                i.c(aVar2);
                if (aVar2.hasProperty("appId")) {
                    com.onesignal.core.internal.config.a aVar3 = this.configModel;
                    i.c(aVar3);
                    z6 = !i.a(aVar3.getAppId(), str);
                }
                com.onesignal.core.internal.config.a aVar4 = this.configModel;
                i.c(aVar4);
                aVar4.setAppId(str);
            } else {
                z6 = false;
            }
            if (this._consentRequired != null) {
                com.onesignal.core.internal.config.a aVar5 = this.configModel;
                i.c(aVar5);
                Boolean bool = this._consentRequired;
                i.c(bool);
                aVar5.setConsentRequired(bool);
            }
            if (this._consentGiven != null) {
                com.onesignal.core.internal.config.a aVar6 = this.configModel;
                i.c(aVar6);
                Boolean bool2 = this._consentGiven;
                i.c(bool2);
                aVar6.setConsentGiven(bool2);
            }
            if (this._disableGMSMissingPrompt != null) {
                com.onesignal.core.internal.config.a aVar7 = this.configModel;
                i.c(aVar7);
                Boolean bool3 = this._disableGMSMissingPrompt;
                i.c(bool3);
                aVar7.setDisableGMSMissingPrompt(bool3.booleanValue());
            }
            p100k5.c cVar = new p100k5.c(this.services);
            cVar.bootstrap();
            if (z6) {
                p093j5.b preferencesService = getPreferencesService();
                i.c(preferencesService);
                string$default = p093j5.a.getString$default(preferencesService, "OneSignal", "GT_PLAYER_ID", null, 4, null);
                if (string$default == null) {
                    com.onesignal.debug.internal.logging.b.debug$default("initWithContext: creating new device-scoped user", null, 2, null);
                    createAndSwitchToNewUser$default(this, true, null, 2, null);
                } else {
                    com.onesignal.debug.internal.logging.b.debug$default("initWithContext: creating user linked to subscription ".concat(string$default), null, 2, null);
                    p093j5.b preferencesService2 = getPreferencesService();
                    i.c(preferencesService2);
                    string$default2 = p093j5.a.getString$default(preferencesService2, "OneSignal", "ONESIGNAL_USERSTATE_SYNCVALYES_CURRENT_STATE", null, 4, null);
                    if (string$default2 != null) {
                        JSONObject jSONObject = new JSONObject(string$default2);
                        numSafeInt = com.onesignal.common.e.safeInt(jSONObject, "notification_types");
                        dVar = new p208v6.d();
                        dVar.setId(string$default);
                        dVar.setType(p208v6.g.PUSH);
                        fVar = p208v6.f.NO_PERMISSION;
                        int value = fVar.getValue();
                        if (numSafeInt != null) {
                            z10 = false;
                            dVar.setOptedIn(z10);
                            strSafeString = com.onesignal.common.e.safeString(jSONObject, "identifier");
                            if (strSafeString == null) {
                                strSafeString = "";
                            }
                            dVar.setAddress(strSafeString);
                            if (numSafeInt != null) {
                                fVarFromInt = p208v6.f.Companion.fromInt(numSafeInt.intValue());
                                if (fVarFromInt == null) {
                                    fVar = fVarFromInt;
                                }
                                dVar.setStatus(fVar);
                            } else {
                                dVar.setStatus(p208v6.f.SUBSCRIBED);
                            }
                            dVar.setSdk(h.SDK_VERSION);
                            String str2 = Build.VERSION.RELEASE;
                            i.e(str2, "RELEASE");
                            dVar.setDeviceOS(str2);
                            carrierName = com.onesignal.common.c.INSTANCE.getCarrierName(((X4.f) this.services.getService(X4.f.class)).getAppContext());
                            if (carrierName == null) {
                                carrierName = "";
                            }
                            dVar.setCarrier(carrierName);
                            appVersion = AndroidUtils.INSTANCE.getAppVersion(((X4.f) this.services.getService(X4.f.class)).getAppContext());
                            if (appVersion == null) {
                                appVersion = "";
                            }
                            dVar.setAppVersion(appVersion);
                            com.onesignal.core.internal.config.a aVar8 = this.configModel;
                            i.c(aVar8);
                            aVar8.setPushSubscriptionId(string$default);
                            p208v6.e subscriptionModelStore = getSubscriptionModelStore();
                            i.c(subscriptionModelStore);
                            subscriptionModelStore.add(dVar, "NO_PROPOGATE");
                        }
                        int value2 = p208v6.f.UNSUBSCRIBE.getValue();
                        if (numSafeInt != null) {
                            z10 = false;
                            dVar.setOptedIn(z10);
                            strSafeString = com.onesignal.common.e.safeString(jSONObject, "identifier");
                            if (strSafeString == null) {
                                strSafeString = "";
                            }
                            dVar.setAddress(strSafeString);
                            if (numSafeInt != null) {
                                fVarFromInt = p208v6.f.Companion.fromInt(numSafeInt.intValue());
                                if (fVarFromInt == null) {
                                    fVar = fVarFromInt;
                                }
                                dVar.setStatus(fVar);
                            } else {
                                dVar.setStatus(p208v6.f.SUBSCRIBED);
                            }
                            dVar.setSdk(h.SDK_VERSION);
                            String str3 = Build.VERSION.RELEASE;
                            i.e(str3, "RELEASE");
                            dVar.setDeviceOS(str3);
                            carrierName = com.onesignal.common.c.INSTANCE.getCarrierName(((X4.f) this.services.getService(X4.f.class)).getAppContext());
                            if (carrierName == null) {
                                carrierName = "";
                            }
                            dVar.setCarrier(carrierName);
                            appVersion = AndroidUtils.INSTANCE.getAppVersion(((X4.f) this.services.getService(X4.f.class)).getAppContext());
                            if (appVersion == null) {
                                appVersion = "";
                            }
                            dVar.setAppVersion(appVersion);
                            com.onesignal.core.internal.config.a aVar9 = this.configModel;
                            i.c(aVar9);
                            aVar9.setPushSubscriptionId(string$default);
                            p208v6.e subscriptionModelStore2 = getSubscriptionModelStore();
                            i.c(subscriptionModelStore2);
                            subscriptionModelStore2.add(dVar, "NO_PROPOGATE");
                        }
                        z10 = true;
                        dVar.setOptedIn(z10);
                        strSafeString = com.onesignal.common.e.safeString(jSONObject, "identifier");
                        if (strSafeString == null) {
                            strSafeString = "";
                        }
                        dVar.setAddress(strSafeString);
                        if (numSafeInt != null) {
                            fVarFromInt = p208v6.f.Companion.fromInt(numSafeInt.intValue());
                            if (fVarFromInt == null) {
                                fVar = fVarFromInt;
                            }
                            dVar.setStatus(fVar);
                        } else {
                            dVar.setStatus(p208v6.f.SUBSCRIBED);
                        }
                        dVar.setSdk(h.SDK_VERSION);
                        String str4 = Build.VERSION.RELEASE;
                        i.e(str4, "RELEASE");
                        dVar.setDeviceOS(str4);
                        carrierName = com.onesignal.common.c.INSTANCE.getCarrierName(((X4.f) this.services.getService(X4.f.class)).getAppContext());
                        if (carrierName == null) {
                            carrierName = "";
                        }
                        dVar.setCarrier(carrierName);
                        appVersion = AndroidUtils.INSTANCE.getAppVersion(((X4.f) this.services.getService(X4.f.class)).getAppContext());
                        if (appVersion == null) {
                            appVersion = "";
                        }
                        dVar.setAppVersion(appVersion);
                        com.onesignal.core.internal.config.a aVar10 = this.configModel;
                        i.c(aVar10);
                        aVar10.setPushSubscriptionId(string$default);
                        p208v6.e subscriptionModelStore3 = getSubscriptionModelStore();
                        i.c(subscriptionModelStore3);
                        subscriptionModelStore3.add(dVar, "NO_PROPOGATE");
                    }
                    createAndSwitchToNewUser$default(this, true, null, 2, null);
                    f fVar3 = this.operationRepo;
                    i.c(fVar3);
                    com.onesignal.core.internal.config.a aVar11 = this.configModel;
                    i.c(aVar11);
                    String appId = aVar11.getAppId();
                    p162q6.b identityModelStore = getIdentityModelStore();
                    i.c(identityModelStore);
                    e.enqueue$default(fVar3, new p173r6.e(appId, ((p162q6.a) identityModelStore.getModel()).getOnesignalId(), string$default), false, 2, null);
                    p093j5.b preferencesService3 = getPreferencesService();
                    i.c(preferencesService3);
                    preferencesService3.saveString("OneSignal", "GT_PLAYER_ID", null);
                }
            } else {
                p162q6.b identityModelStore2 = getIdentityModelStore();
                i.c(identityModelStore2);
                if (((p162q6.a) identityModelStore2.getModel()).hasProperty("onesignal_id")) {
                    StringBuilder sb = new StringBuilder("initWithContext: using cached user ");
                    p162q6.b identityModelStore3 = getIdentityModelStore();
                    i.c(identityModelStore3);
                    sb.append(((p162q6.a) identityModelStore3.getModel()).getOnesignalId());
                    com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
                } else {
                    p093j5.b preferencesService4 = getPreferencesService();
                    i.c(preferencesService4);
                    string$default = p093j5.a.getString$default(preferencesService4, "OneSignal", "GT_PLAYER_ID", null, 4, null);
                    if (string$default == null) {
                        com.onesignal.debug.internal.logging.b.debug$default("initWithContext: creating new device-scoped user", null, 2, null);
                        createAndSwitchToNewUser$default(this, true, null, 2, null);
                    } else {
                        com.onesignal.debug.internal.logging.b.debug$default("initWithContext: creating user linked to subscription ".concat(string$default), null, 2, null);
                        p093j5.b preferencesService5 = getPreferencesService();
                        i.c(preferencesService5);
                        string$default2 = p093j5.a.getString$default(preferencesService5, "OneSignal", "ONESIGNAL_USERSTATE_SYNCVALYES_CURRENT_STATE", null, 4, null);
                        if (string$default2 != null) {
                            JSONObject jSONObject2 = new JSONObject(string$default2);
                            numSafeInt = com.onesignal.common.e.safeInt(jSONObject2, "notification_types");
                            dVar = new p208v6.d();
                            dVar.setId(string$default);
                            dVar.setType(p208v6.g.PUSH);
                            fVar = p208v6.f.NO_PERMISSION;
                            int value3 = fVar.getValue();
                            if (numSafeInt != null && numSafeInt.intValue() == value3) {
                                z10 = false;
                            } else {
                                int value4 = p208v6.f.UNSUBSCRIBE.getValue();
                                if (numSafeInt != null && numSafeInt.intValue() == value4) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                            }
                            dVar.setOptedIn(z10);
                            strSafeString = com.onesignal.common.e.safeString(jSONObject2, "identifier");
                            if (strSafeString == null) {
                                strSafeString = "";
                            }
                            dVar.setAddress(strSafeString);
                            if (numSafeInt != null) {
                                fVarFromInt = p208v6.f.Companion.fromInt(numSafeInt.intValue());
                                if (fVarFromInt == null) {
                                    fVar = fVarFromInt;
                                }
                                dVar.setStatus(fVar);
                            } else {
                                dVar.setStatus(p208v6.f.SUBSCRIBED);
                            }
                            dVar.setSdk(h.SDK_VERSION);
                            String str5 = Build.VERSION.RELEASE;
                            i.e(str5, "RELEASE");
                            dVar.setDeviceOS(str5);
                            carrierName = com.onesignal.common.c.INSTANCE.getCarrierName(((X4.f) this.services.getService(X4.f.class)).getAppContext());
                            if (carrierName == null) {
                                carrierName = "";
                            }
                            dVar.setCarrier(carrierName);
                            appVersion = AndroidUtils.INSTANCE.getAppVersion(((X4.f) this.services.getService(X4.f.class)).getAppContext());
                            if (appVersion == null) {
                                appVersion = "";
                            }
                            dVar.setAppVersion(appVersion);
                            com.onesignal.core.internal.config.a aVar12 = this.configModel;
                            i.c(aVar12);
                            aVar12.setPushSubscriptionId(string$default);
                            p208v6.e subscriptionModelStore4 = getSubscriptionModelStore();
                            i.c(subscriptionModelStore4);
                            subscriptionModelStore4.add(dVar, "NO_PROPOGATE");
                        }
                        createAndSwitchToNewUser$default(this, true, null, 2, null);
                        f fVar4 = this.operationRepo;
                        i.c(fVar4);
                        com.onesignal.core.internal.config.a aVar13 = this.configModel;
                        i.c(aVar13);
                        String appId2 = aVar13.getAppId();
                        p162q6.b identityModelStore4 = getIdentityModelStore();
                        i.c(identityModelStore4);
                        e.enqueue$default(fVar4, new p173r6.e(appId2, ((p162q6.a) identityModelStore4.getModel()).getOnesignalId(), string$default), false, 2, null);
                        p093j5.b preferencesService6 = getPreferencesService();
                        i.c(preferencesService6);
                        preferencesService6.saveString("OneSignal", "GT_PLAYER_ID", null);
                    }
                }
            }
            cVar.scheduleStart();
            setInitialized(true);
            return true;
        }
    }

    public boolean isInitialized() {
        return this.isInitialized;
    }

    public void login(String str) {
        i.f(str, "externalId");
        login(str, null);
    }

    public void logout() throws Exception {
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "logout()");
        if (!isInitialized()) {
            throw new Exception("Must call 'initWithContext' before 'logout'");
        }
        synchronized (this.loginLock) {
            try {
                p162q6.b identityModelStore = getIdentityModelStore();
                i.c(identityModelStore);
                if (((p162q6.a) identityModelStore.getModel()).getExternalId() == null) {
                    return;
                }
                createAndSwitchToNewUser$default(this, false, null, 3, null);
                if (getUseIdentityVerification()) {
                    getUser().getPushSubscription().optOut();
                } else {
                    f fVar = this.operationRepo;
                    i.c(fVar);
                    com.onesignal.core.internal.config.a aVar = this.configModel;
                    i.c(aVar);
                    String appId = aVar.getAppId();
                    p162q6.b identityModelStore2 = getIdentityModelStore();
                    i.c(identityModelStore2);
                    String onesignalId = ((p162q6.a) identityModelStore2.getModel()).getOnesignalId();
                    p162q6.b identityModelStore3 = getIdentityModelStore();
                    i.c(identityModelStore3);
                    e.enqueue$default(fVar, new p173r6.f(appId, onesignalId, ((p162q6.a) identityModelStore3.getModel()).getExternalId(), null, 8, null), false, 2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeUserJwtInvalidatedListener(P4.b bVar) {
        i.f(bVar, "listener");
        getUser().removeUserJwtInvalidatedListener(bVar);
    }

    public void setConsentGiven(boolean z6) {
        f fVar;
        Boolean bool = this._consentGiven;
        this._consentGiven = Boolean.valueOf(z6);
        com.onesignal.core.internal.config.a aVar = this.configModel;
        if (aVar != null) {
            aVar.setConsentGiven(Boolean.valueOf(z6));
        }
        if (i.a(bool, Boolean.valueOf(z6)) || !z6 || (fVar = this.operationRepo) == null) {
            return;
        }
        fVar.forceExecuteOperations();
    }

    public void setConsentRequired(boolean z6) {
        this._consentRequired = Boolean.valueOf(z6);
        com.onesignal.core.internal.config.a aVar = this.configModel;
        if (aVar == null) {
            return;
        }
        aVar.setConsentRequired(Boolean.valueOf(z6));
    }

    public void setDisableGMSMissingPrompt(boolean z6) {
        this._disableGMSMissingPrompt = Boolean.valueOf(z6);
        com.onesignal.core.internal.config.a aVar = this.configModel;
        if (aVar == null) {
            return;
        }
        aVar.setDisableGMSMissingPrompt(z6);
    }

    public void setInitialized(boolean z6) {
        this.isInitialized = z6;
    }

    public void updateUserJwt(String str, String str2) {
        i.f(str, "externalId");
        i.f(str2, "token");
        p162q6.b identityModelStore = getIdentityModelStore();
        i.c(identityModelStore);
        Iterator<com.onesignal.common.modeling.i> it = identityModelStore.getStore().list().iterator();
        while (it.hasNext()) {
            if (str.equals(((p162q6.a) it.next()).getExternalId())) {
                p162q6.b identityModelStore2 = getIdentityModelStore();
                i.c(identityModelStore2);
                ((p162q6.a) identityModelStore2.getModel()).setJwtToken(str2);
                f fVar = this.operationRepo;
                i.c(fVar);
                fVar.forceExecuteOperations();
                com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "JWT " + str2 + " is updated for externalId " + str);
                return;
            }
        }
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "No identity found for externalId ".concat(str));
    }

    @Override // P4.a
    public void login(String str, String str2) throws Exception {
        i.f(str, "externalId");
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "login(externalId: " + str + ", jwtBearerToken: " + str2 + ')');
        if (isInitialized()) {
            t tVar = new t();
            t tVar2 = new t();
            t tVar3 = new t();
            tVar3.f15466s = "";
            synchronized (this.loginLock) {
                p162q6.b identityModelStore = getIdentityModelStore();
                i.c(identityModelStore);
                tVar.f15466s = ((p162q6.a) identityModelStore.getModel()).getExternalId();
                p162q6.b identityModelStore2 = getIdentityModelStore();
                i.c(identityModelStore2);
                tVar2.f15466s = ((p162q6.a) identityModelStore2.getModel()).getOnesignalId();
                if (i.a(tVar.f15466s, str)) {
                    p162q6.b identityModelStore3 = getIdentityModelStore();
                    i.c(identityModelStore3);
                    ((p162q6.a) identityModelStore3.getModel()).setJwtToken(str2);
                    return;
                } else {
                    createAndSwitchToNewUser(false, new C0051a(str, str2));
                    p162q6.b identityModelStore4 = getIdentityModelStore();
                    i.c(identityModelStore4);
                    tVar3.f15466s = ((p162q6.a) identityModelStore4.getModel()).getOnesignalId();
                    com.onesignal.common.threading.a.suspendifyOnThread$default(0, new b(tVar3, str, tVar, tVar2, null), 1, null);
                    return;
                }
            }
        }
        throw new Exception("Must call 'initWithContext' before 'login'");
    }
}
