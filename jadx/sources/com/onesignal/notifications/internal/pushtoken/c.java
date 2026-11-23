package com.onesignal.notifications.internal.pushtoken;

import p208v6.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements com.onesignal.notifications.internal.pushtoken.a {
    private final p025c5.c _deviceService;
    private final p036d6.b _pushRegistrator;
    private String pushToken;
    private f pushTokenStatus;

    public static final class a extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(p123m8.d<? super a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.retrievePushToken(this);
        }
    }

    public c(p036d6.b bVar, p025c5.c cVar) {
        i.f(bVar, "_pushRegistrator");
        i.f(cVar, "_deviceService");
        this._pushRegistrator = bVar;
        this._deviceService = cVar;
        this.pushTokenStatus = f.NO_PERMISSION;
    }

    private final boolean pushStatusRuntimeError(f fVar) {
        return fVar.getValue() < -6;
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public final f getPushTokenStatus() {
        return this.pushTokenStatus;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.pushtoken.a
    public Object retrievePushToken(p123m8.d<? super d> dVar) {
        a aVar;
        c cVar;
        f fVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.label = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objRegisterForPush = aVar.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = aVar.label;
        if (i11 == 0) {
            J7.a.v(objRegisterForPush);
            int i12 = b.$EnumSwitchMapping$0[this._deviceService.getJetpackLibraryStatus().ordinal()];
            if (i12 == 1) {
                com.onesignal.debug.internal.logging.b.fatal$default("Could not find the Jetpack/AndroidX. Please make sure it has been correctly added to your project.", null, 2, null);
                this.pushTokenStatus = f.MISSING_JETPACK_LIBRARY;
            } else if (i12 != 2) {
                p036d6.b bVar = this._pushRegistrator;
                aVar.L$0 = this;
                aVar.label = 1;
                objRegisterForPush = bVar.registerForPush(aVar);
                if (objRegisterForPush == aVar2) {
                    return aVar2;
                }
                cVar = this;
            } else {
                com.onesignal.debug.internal.logging.b.fatal$default("The included Jetpack/AndroidX Library is too old or incomplete.", null, 2, null);
                this.pushTokenStatus = f.OUTDATED_JETPACK_LIBRARY;
            }
            cVar = this;
            return new d(cVar.pushToken, cVar.pushTokenStatus);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cVar = (c) aVar.L$0;
        J7.a.v(objRegisterForPush);
        p036d6.a aVar3 = (p036d6.a) objRegisterForPush;
        int value = aVar3.getStatus().getValue();
        f fVar2 = f.SUBSCRIBED;
        if (value == fVar2.getValue()) {
            cVar.pushTokenStatus = aVar3.getStatus();
        } else if (aVar3.getStatus().getValue() < fVar2.getValue()) {
            if (cVar.pushToken == null && ((fVar = cVar.pushTokenStatus) == f.NO_PERMISSION || cVar.pushStatusRuntimeError(fVar))) {
                cVar.pushTokenStatus = aVar3.getStatus();
            }
        } else if (cVar.pushStatusRuntimeError(cVar.pushTokenStatus)) {
            cVar.pushTokenStatus = aVar3.getStatus();
        }
        cVar.pushToken = aVar3.getId();
        return new d(cVar.pushToken, cVar.pushTokenStatus);
    }

    public final void setPushToken(String str) {
        this.pushToken = str;
    }

    public final void setPushTokenStatus(f fVar) {
        i.f(fVar, "<set-?>");
        this.pushTokenStatus = fVar;
    }
}
