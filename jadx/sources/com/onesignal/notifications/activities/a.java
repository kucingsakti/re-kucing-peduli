package com.onesignal.notifications.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p076h8.m;
import p123m8.d;
import p144o8.g;
import p200u8.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends Activity {

    /* JADX INFO: renamed from: com.onesignal.notifications.activities.a$a, reason: collision with other inner class name */
    public static final class C0059a extends g implements b {
        int label;

        public C0059a(d<? super C0059a> dVar) {
            super(1, dVar);
        }

        @Override // p144o8.a
        public final d<m> create(d<?> dVar) {
            return a.this.new C0059a(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                p006a6.a aVar2 = (p006a6.a) P4.d.a().getService(p006a6.a.class);
                a aVar3 = a.this;
                Intent intent = aVar3.getIntent();
                i.e(intent, "intent");
                this.label = 1;
                if (aVar2.processFromContext(aVar3, intent, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            a.this.finish();
            return m.a;
        }

        @Override // p200u8.b
        public final Object invoke(d<? super m> dVar) {
            return ((C0059a) create(dVar)).invokeSuspend(m.a);
        }
    }

    private final void processIntent() {
        Context applicationContext = getApplicationContext();
        i.e(applicationContext, "applicationContext");
        if (P4.d.b(applicationContext)) {
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new C0059a(null), 1, null);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        processIntent();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        i.f(intent, "intent");
        super.onNewIntent(intent);
        processIntent();
    }
}
