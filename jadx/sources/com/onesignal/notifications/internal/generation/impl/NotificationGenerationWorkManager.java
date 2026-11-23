package com.onesignal.notifications.internal.generation.impl;

import U5.h;
import X5.b;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.onesignal.common.AndroidUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import p050f1.g;
import p050f1.l;
import p050f1.o;
import p050f1.r;
import p050f1.w;
import p061g1.j;
import p123m8.d;
import p144o8.c;
import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationGenerationWorkManager implements b {
    private static final String ANDROID_NOTIF_ID_WORKER_DATA_PARAM = "android_notif_id";
    private static final String IS_RESTORING_WORKER_DATA_PARAM = "is_restoring";
    private static final String JSON_PAYLOAD_WORKER_DATA_PARAM = "json_payload";
    private static final String OS_ID_DATA_PARAM = "os_notif_id";
    private static final String TIMESTAMP_WORKER_DATA_PARAM = "timestamp";
    public static final a Companion = new a(null);
    private static final ConcurrentHashMap<String, Boolean> notificationIds = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/onesignal/notifications/internal/generation/impl/NotificationGenerationWorkManager$NotificationGenerationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lf1/o;", "doWork", "(Lm8/d;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class NotificationGenerationWorker extends CoroutineWorker {

        public static final class a extends c {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public a(d<? super a> dVar) {
                super(dVar);
            }

            @Override // p144o8.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return NotificationGenerationWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationGenerationWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            i.f(context, "context");
            i.f(workerParameters, "workerParams");
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        @Override // androidx.work.CoroutineWorker
        public Object doWork(d<? super o> dVar) throws Throwable {
            a aVar;
            NotificationGenerationWorker notificationGenerationWorker;
            String str;
            String str2 = "NotificationWorker running doWork with data: ";
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i10 - Integer.MIN_VALUE;
                    notificationGenerationWorker = this;
                } else {
                    notificationGenerationWorker = this;
                    aVar = notificationGenerationWorker.new a(dVar);
                }
            } else {
                notificationGenerationWorker = this;
                aVar = notificationGenerationWorker.new a(dVar);
            }
            a aVar2 = aVar;
            Object obj = aVar2.result;
            p134n8.a aVar3 = p134n8.a.f13404s;
            int i11 = aVar2.label;
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) aVar2.L$0;
                    try {
                        J7.a.v(obj);
                        a aVar4 = NotificationGenerationWorkManager.Companion;
                        i.c(str);
                        aVar4.removeNotificationIdProcessed(str);
                        return o.a();
                    } catch (JSONException e10) {
                        e = e10;
                        com.onesignal.debug.internal.logging.b.error("Error occurred doing work for job with id: " + str, e);
                        l lVar = new l();
                        a aVar5 = NotificationGenerationWorkManager.Companion;
                        i.c(str);
                        aVar5.removeNotificationIdProcessed(str);
                        return lVar;
                    }
                }
                J7.a.v(obj);
                Context applicationContext = notificationGenerationWorker.getApplicationContext();
                i.e(applicationContext, "applicationContext");
                if (!P4.d.b(applicationContext)) {
                    return o.a();
                }
                X5.a aVar6 = (X5.a) P4.d.a().getService(X5.a.class);
                g inputData = notificationGenerationWorker.getInputData();
                i.e(inputData, "inputData");
                String strB = inputData.b(NotificationGenerationWorkManager.OS_ID_DATA_PARAM);
                if (strB == null) {
                    return new l();
                }
                try {
                    com.onesignal.debug.internal.logging.b.debug$default("NotificationWorker running doWork with data: " + inputData, null, 2, null);
                    HashMap map = inputData.a;
                    Object obj2 = map.get(NotificationGenerationWorkManager.ANDROID_NOTIF_ID_WORKER_DATA_PARAM);
                    int iIntValue = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0;
                    JSONObject jSONObject = new JSONObject(inputData.b(NotificationGenerationWorkManager.JSON_PAYLOAD_WORKER_DATA_PARAM));
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    Object obj3 = map.get(NotificationGenerationWorkManager.TIMESTAMP_WORKER_DATA_PARAM);
                    if (obj3 instanceof Long) {
                        jCurrentTimeMillis = ((Long) obj3).longValue();
                    }
                    Object obj4 = map.get(NotificationGenerationWorkManager.IS_RESTORING_WORKER_DATA_PARAM);
                    boolean zBooleanValue = obj4 instanceof Boolean ? ((Boolean) obj4).booleanValue() : false;
                    Context applicationContext2 = notificationGenerationWorker.getApplicationContext();
                    i.e(applicationContext2, "applicationContext");
                    aVar2.L$0 = strB;
                    aVar2.label = 1;
                    if (aVar6.processNotificationData(applicationContext2, iIntValue, jSONObject, zBooleanValue, jCurrentTimeMillis, aVar2) == aVar3) {
                        return aVar3;
                    }
                    str = strB;
                    a aVar7 = NotificationGenerationWorkManager.Companion;
                    i.c(str);
                    aVar7.removeNotificationIdProcessed(str);
                    return o.a();
                } catch (JSONException e11) {
                    e = e11;
                    str = strB;
                    com.onesignal.debug.internal.logging.b.error("Error occurred doing work for job with id: " + str, e);
                    l lVar2 = new l();
                    a aVar8 = NotificationGenerationWorkManager.Companion;
                    i.c(str);
                    aVar8.removeNotificationIdProcessed(str);
                    return lVar2;
                } catch (Throwable th) {
                    th = th;
                    str2 = strB;
                    a aVar9 = NotificationGenerationWorkManager.Companion;
                    i.c(str2);
                    aVar9.removeNotificationIdProcessed(str2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final boolean addNotificationIdProcessed(String str) {
            i.f(str, "osNotificationId");
            if (!AndroidUtils.INSTANCE.isStringNotEmpty(str)) {
                return true;
            }
            if (NotificationGenerationWorkManager.notificationIds.contains(str)) {
                com.onesignal.debug.internal.logging.b.debug$default(E0.a.i("OSNotificationWorkManager notification with notificationId: ", str, " already queued"), null, 2, null);
                return false;
            }
            NotificationGenerationWorkManager.notificationIds.put(str, Boolean.TRUE);
            return true;
        }

        public final void removeNotificationIdProcessed(String str) {
            i.f(str, "osNotificationId");
            if (AndroidUtils.INSTANCE.isStringNotEmpty(str)) {
                NotificationGenerationWorkManager.notificationIds.remove(str);
            }
        }

        private a() {
        }
    }

    @Override // X5.b
    public boolean beginEnqueueingWork(Context context, String str, int i10, JSONObject jSONObject, long j, boolean z6, boolean z10) throws Throwable {
        i.f(context, "context");
        i.f(str, "osNotificationId");
        String oSNotificationIdFromJson = U5.c.INSTANCE.getOSNotificationIdFromJson(jSONObject);
        if (oSNotificationIdFromJson == null) {
            com.onesignal.debug.internal.logging.b.debug$default("Notification beginEnqueueingWork with id null", null, 2, null);
            return false;
        }
        if (!Companion.addNotificationIdProcessed(oSNotificationIdFromJson)) {
            com.onesignal.debug.internal.logging.b.debug$default("Notification beginEnqueueingWork with id duplicated", null, 2, null);
            return true;
        }
        HashMap map = new HashMap();
        map.put(OS_ID_DATA_PARAM, oSNotificationIdFromJson);
        map.put(ANDROID_NOTIF_ID_WORKER_DATA_PARAM, Integer.valueOf(i10));
        map.put(JSON_PAYLOAD_WORKER_DATA_PARAM, String.valueOf(jSONObject));
        map.put(TIMESTAMP_WORKER_DATA_PARAM, Long.valueOf(j));
        map.put(IS_RESTORING_WORKER_DATA_PARAM, Boolean.valueOf(z6));
        g gVar = new g(map);
        g.c(gVar);
        Y1.c cVar = new Y1.c(NotificationGenerationWorker.class);
        ((o1.o) cVar.f5671u).f13649e = gVar;
        r rVarK = cVar.k();
        com.onesignal.debug.internal.logging.b.debug$default("NotificationWorkManager enqueueing notification work with notificationId: " + str + " and jsonPayload: " + jSONObject, null, 2, null);
        w hVar = h.INSTANCE.getInstance(context);
        hVar.getClass();
        new j((p061g1.o) hVar, str, Collections.singletonList(rVarK)).s();
        return true;
    }
}
