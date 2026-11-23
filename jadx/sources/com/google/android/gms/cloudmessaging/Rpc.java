package com.google.android.gms.cloudmessaging;

import P2.f;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p196u2.a;
import p212w.i;

/* JADX INFO: loaded from: classes.dex */
public class Rpc {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f7774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static PendingIntent f7775i;
    public static final zzy j = zzy.f7815s;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f7776k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzw f7778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f7779d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Messenger f7781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzd f7782g;
    public final i a = new i(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Messenger f7780e = new Messenger(new a(this, Looper.getMainLooper()));

    public Rpc(Context context) {
        this.f7777b = context;
        this.f7778c = new zzw(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f7779d = scheduledThreadPoolExecutor;
    }

    public static synchronized String b() {
        int i10;
        i10 = f7774h;
        f7774h = i10 + 1;
        return Integer.toString(i10);
    }

    public static synchronized void c(Context context, Intent intent) {
        try {
            if (f7775i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f7775i = PendingIntent.getBroadcast(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.zza.a);
            }
            intent.putExtra("app", f7775i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    public final f a(Bundle bundle) {
        final String strB = b();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.a) {
            this.a.put(strB, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f7778c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        c(this.f7777b, intent);
        intent.putExtra("kid", "|ID|" + strB + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.f7780e);
        if (this.f7781f != null || this.f7782g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f7781f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f7782g.f7789s;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
                if (this.f7778c.b() == 2) {
                    this.f7777b.sendBroadcast(intent);
                } else {
                    this.f7777b.startService(intent);
                }
            }
        } else if (this.f7778c.b() == 2) {
            this.f7777b.sendBroadcast(intent);
        } else {
            this.f7777b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f7779d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzac
            @Override // java.lang.Runnable
            public final void run() {
                if (taskCompletionSource.c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.a.m(j, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzad
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void d(Task task) {
                Rpc rpc = this.f7786s;
                String str = strB;
                ScheduledFuture scheduledFuture = scheduledFutureSchedule;
                synchronized (rpc.a) {
                    rpc.a.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        });
        return taskCompletionSource.a;
    }

    public final void d(String str, Bundle bundle) {
        synchronized (this.a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.a.remove(str);
                if (taskCompletionSource != null) {
                    taskCompletionSource.b(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
