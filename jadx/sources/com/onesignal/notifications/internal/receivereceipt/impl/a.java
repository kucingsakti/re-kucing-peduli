package com.onesignal.notifications.internal.receivereceipt.impl;

import com.onesignal.common.exceptions.BackendException;
import com.onesignal.debug.internal.logging.b;
import p025c5.c;
import p076h8.m;
import p123m8.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p026c6.a {
    private final M5.a _backend;
    private final c _deviceService;

    /* JADX INFO: renamed from: com.onesignal.notifications.internal.receivereceipt.impl.a$a, reason: collision with other inner class name */
    public static final class C0072a extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public C0072a(d<? super C0072a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendReceiveReceipt(null, null, null, this);
        }
    }

    public a(c cVar, M5.a aVar) {
        i.f(cVar, "_deviceService");
        i.f(aVar, "_backend");
        this._deviceService = cVar;
        this._backend = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p026c6.a
    public Object sendReceiveReceipt(String str, String str2, String str3, d<? super m> dVar) {
        C0072a c0072a;
        if (dVar instanceof C0072a) {
            c0072a = (C0072a) dVar;
            int i10 = c0072a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0072a.label = i10 - Integer.MIN_VALUE;
            } else {
                c0072a = new C0072a(dVar);
            }
        } else {
            c0072a = new C0072a(dVar);
        }
        C0072a c0072a2 = c0072a;
        Object obj = c0072a2.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = c0072a2.label;
        try {
            if (i11 == 0) {
                J7.a.v(obj);
                p025c5.a deviceType = this._deviceService.getDeviceType();
                M5.a aVar2 = this._backend;
                c0072a2.label = 1;
                if (aVar2.updateNotificationAsReceived(str, str3, str2, deviceType, c0072a2) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
        } catch (BackendException e10) {
            b.error$default("Receive receipt failed with statusCode: " + e10.getStatusCode() + " response: " + e10.getResponse(), null, 2, null);
        }
        return m.a;
    }
}
