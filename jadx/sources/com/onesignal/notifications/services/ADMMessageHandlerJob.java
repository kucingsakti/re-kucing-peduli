package com.onesignal.notifications.services;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import kotlin.Metadata;
import p076h8.m;
import p123m8.d;
import p144o8.g;
import p210v8.i;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0012\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/onesignal/notifications/services/ADMMessageHandlerJob;", "Lcom/amazon/device/messaging/ADMMessageHandlerJobBase;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lh8/m;", "onMessage", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "newRegistrationId", "onRegistered", "(Landroid/content/Context;Ljava/lang/String;)V", "registrationId", "onUnregistered", "error", "onRegistrationError", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {

    public static final class a extends g implements p200u8.b {
        final /* synthetic */ String $newRegistrationId;
        final /* synthetic */ t $registerer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, String str, d<? super a> dVar) {
            super(1, dVar);
            this.$registerer = tVar;
            this.$newRegistrationId = str;
        }

        @Override // p144o8.a
        public final d<m> create(d<?> dVar) {
            return new a(this.$registerer, this.$newRegistrationId, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                com.onesignal.notifications.internal.registration.impl.b bVar = (com.onesignal.notifications.internal.registration.impl.b) this.$registerer.f15466s;
                String str = this.$newRegistrationId;
                this.label = 1;
                if (bVar.fireCallback(str, this) == aVar) {
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
        public final Object invoke(d<? super m> dVar) {
            return ((a) create(dVar)).invokeSuspend(m.a);
        }
    }

    public static final class b extends g implements p200u8.b {
        final /* synthetic */ t $registerer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, d<? super b> dVar) {
            super(1, dVar);
            this.$registerer = tVar;
        }

        @Override // p144o8.a
        public final d<m> create(d<?> dVar) {
            return new b(this.$registerer, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                com.onesignal.notifications.internal.registration.impl.b bVar = (com.onesignal.notifications.internal.registration.impl.b) this.$registerer.f15466s;
                this.label = 1;
                if (bVar.fireCallback(null, this) == aVar) {
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
        public final Object invoke(d<? super m> dVar) {
            return ((b) create(dVar)).invokeSuspend(m.a);
        }
    }

    public void onMessage(Context context, Intent intent) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        i.e(applicationContext, "context.applicationContext");
        if (P4.d.b(applicationContext)) {
            Q5.b bVar = (Q5.b) P4.d.a().getService(Q5.b.class);
            Bundle extras = intent != null ? intent.getExtras() : null;
            i.c(extras);
            bVar.processBundleFromReceiver(context, extras);
        }
    }

    public void onRegistered(Context context, String newRegistrationId) {
        com.onesignal.debug.internal.logging.b.info$default("ADM registration ID: " + newRegistrationId, null, 2, null);
        t tVar = new t();
        tVar.f15466s = P4.d.a().getService(com.onesignal.notifications.internal.registration.impl.b.class);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new a(tVar, newRegistrationId, null), 1, null);
    }

    public void onRegistrationError(Context context, String error) {
        com.onesignal.debug.internal.logging.b.error$default("ADM:onRegistrationError: " + error, null, 2, null);
        if ("INVALID_SENDER".equals(error)) {
            com.onesignal.debug.internal.logging.b.error$default("Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null, 2, null);
        }
        t tVar = new t();
        tVar.f15466s = P4.d.a().getService(com.onesignal.notifications.internal.registration.impl.b.class);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new b(tVar, null), 1, null);
    }

    public void onUnregistered(Context context, String registrationId) {
        com.onesignal.debug.internal.logging.b.info$default("ADM:onUnregistered: " + registrationId, null, 2, null);
    }
}
