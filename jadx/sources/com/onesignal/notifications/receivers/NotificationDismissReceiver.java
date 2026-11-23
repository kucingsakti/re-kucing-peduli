package com.onesignal.notifications.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import p076h8.m;
import p123m8.d;
import p144o8.g;
import p200u8.b;
import p210v8.i;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/onesignal/notifications/receivers/NotificationDismissReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lh8/m;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NotificationDismissReceiver extends BroadcastReceiver {

    public static final class a extends g implements b {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ t $notificationOpenedProcessor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, Context context, Intent intent, d<? super a> dVar) {
            super(1, dVar);
            this.$notificationOpenedProcessor = tVar;
            this.$context = context;
            this.$intent = intent;
        }

        @Override // p144o8.a
        public final d<m> create(d<?> dVar) {
            return new a(this.$notificationOpenedProcessor, this.$context, this.$intent, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                p006a6.a aVar2 = (p006a6.a) this.$notificationOpenedProcessor.f15466s;
                Context context = this.$context;
                Intent intent = this.$intent;
                this.label = 1;
                if (aVar2.processFromContext(context, intent, this) == aVar) {
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

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        i.f(context, "context");
        i.f(intent, "intent");
        Context applicationContext = context.getApplicationContext();
        i.e(applicationContext, "context.applicationContext");
        if (P4.d.b(applicationContext)) {
            t tVar = new t();
            tVar.f15466s = P4.d.a().getService(p006a6.a.class);
            com.onesignal.common.threading.a.suspendifyBlocking(new a(tVar, context, intent, null));
        }
    }
}
