package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import kotlin.Metadata;
import p182s4.T;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "<init>", "()V", "s4/T", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionLifecycleService extends Service {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HandlerThread f10000s = new HandlerThread("FirebaseSessions_HandlerThread");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public T f10001t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Messenger f10002u;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent != null) {
            intent.getAction();
            Messenger messenger = Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
            if (messenger != null) {
                Message messageObtain = Message.obtain(null, 4, 0, 0);
                messageObtain.replyTo = messenger;
                T t7 = this.f10001t;
                if (t7 != null) {
                    t7.sendMessage(messageObtain);
                }
            }
            Messenger messenger2 = this.f10002u;
            if (messenger2 != null) {
                return messenger2.getBinder();
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.f10000s;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        i.e(looper, "handlerThread.looper");
        this.f10001t = new T(looper);
        this.f10002u = new Messenger(this.f10001t);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f10000s.quit();
    }
}
