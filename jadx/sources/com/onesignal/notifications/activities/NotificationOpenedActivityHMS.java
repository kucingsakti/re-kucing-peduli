package com.onesignal.notifications.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import p076h8.m;
import p123m8.d;
import p144o8.g;
import p200u8.b;
import p210v8.i;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/onesignal/notifications/activities/NotificationOpenedActivityHMS;", "Landroid/app/Activity;", "<init>", "()V", "Lh8/m;", "processIntent", "Landroid/content/Intent;", "intent", "processOpen", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onNewIntent", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NotificationOpenedActivityHMS extends Activity {

    public static final class a extends g implements b {
        final /* synthetic */ Intent $intent;
        final /* synthetic */ t $notificationPayloadProcessorHMS;
        final /* synthetic */ NotificationOpenedActivityHMS $self;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, NotificationOpenedActivityHMS notificationOpenedActivityHMS, Intent intent, d<? super a> dVar) {
            super(1, dVar);
            this.$notificationPayloadProcessorHMS = tVar;
            this.$self = notificationOpenedActivityHMS;
            this.$intent = intent;
        }

        @Override // p144o8.a
        public final d<m> create(d<?> dVar) {
            return new a(this.$notificationPayloadProcessorHMS, this.$self, this.$intent, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                p006a6.b bVar = (p006a6.b) this.$notificationPayloadProcessorHMS.f15466s;
                NotificationOpenedActivityHMS notificationOpenedActivityHMS = this.$self;
                Intent intent = this.$intent;
                this.label = 1;
                if (bVar.handleHMSNotificationOpenIntent(notificationOpenedActivityHMS, intent, this) == aVar) {
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

    private final void processIntent() throws Throwable {
        processOpen(getIntent());
        finish();
    }

    private final void processOpen(Intent intent) throws Throwable {
        Context applicationContext = getApplicationContext();
        i.e(applicationContext, "applicationContext");
        if (P4.d.b(applicationContext)) {
            t tVar = new t();
            tVar.f15466s = P4.d.a().getService(p006a6.b.class);
            com.onesignal.common.threading.a.suspendifyBlocking(new a(tVar, this, intent, null));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        processIntent();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) throws Throwable {
        i.f(intent, "intent");
        super.onNewIntent(intent);
        processIntent();
    }
}
