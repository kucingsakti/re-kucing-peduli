package com.onesignal.notifications.internal.lifecycle.impl;

import J5.l;
import android.app.Activity;
import android.content.Context;
import com.onesignal.common.AndroidUtils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p076h8.m;
import p210v8.q;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Y5.c {
    private final p110l5.a _time;
    private final com.onesignal.common.events.b extOpenedCallback;
    private final com.onesignal.common.events.a extRemoteReceivedCallback;
    private final com.onesignal.common.events.b extWillShowInForegroundCallback;
    private final com.onesignal.common.events.a intLifecycleCallback;
    private final com.onesignal.common.events.b intLifecycleHandler;
    private final p086i8.h unprocessedOpenedNotifs;

    /* JADX INFO: renamed from: com.onesignal.notifications.internal.lifecycle.impl.a$a, reason: collision with other inner class name */
    public static final class C0067a extends p210v8.k implements p200u8.b {
        final /* synthetic */ com.onesignal.notifications.internal.d $openedResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0067a(com.onesignal.notifications.internal.d dVar) {
            super(1);
            this.$openedResult = dVar;
        }

        @Override // p200u8.b
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((J5.h) null);
            return m.a;
        }

        public final void invoke(J5.h hVar) {
            p210v8.i.f(hVar, "it");
            hVar.a();
        }
    }

    public static final class b extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(p123m8.d<? super b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canOpenNotification(null, null, this);
        }
    }

    public static final class c extends p144o8.g implements p200u8.c {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ q $canOpen;
        final /* synthetic */ JSONObject $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q qVar, Activity activity, JSONObject jSONObject, p123m8.d<? super c> dVar) {
            super(2, dVar);
            this.$canOpen = qVar;
            this.$activity = activity;
            this.$data = jSONObject;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            c cVar = new c(this.$canOpen, this.$activity, this.$data, dVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // p200u8.c
        public final Object invoke(Y5.a aVar, p123m8.d<? super m> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            q qVar;
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                Y5.a aVar2 = (Y5.a) this.L$0;
                q qVar2 = this.$canOpen;
                Activity activity = this.$activity;
                JSONObject jSONObject = this.$data;
                this.L$0 = qVar2;
                this.label = 1;
                obj = aVar2.canOpenNotification(activity, jSONObject, this);
                if (obj == aVar) {
                    return aVar;
                }
                qVar = qVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (q) this.L$0;
                J7.a.v(obj);
            }
            qVar.f15463s = ((Boolean) obj).booleanValue();
            return m.a;
        }
    }

    public static final class d extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(p123m8.d<? super d> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canReceiveNotification(null, this);
        }
    }

    public static final class e extends p144o8.g implements p200u8.c {
        final /* synthetic */ q $canReceive;
        final /* synthetic */ JSONObject $jsonPayload;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q qVar, JSONObject jSONObject, p123m8.d<? super e> dVar) {
            super(2, dVar);
            this.$canReceive = qVar;
            this.$jsonPayload = jSONObject;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            e eVar = new e(this.$canReceive, this.$jsonPayload, dVar);
            eVar.L$0 = obj;
            return eVar;
        }

        @Override // p200u8.c
        public final Object invoke(Y5.a aVar, p123m8.d<? super m> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            q qVar;
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                Y5.a aVar2 = (Y5.a) this.L$0;
                q qVar2 = this.$canReceive;
                JSONObject jSONObject = this.$jsonPayload;
                this.L$0 = qVar2;
                this.label = 1;
                obj = aVar2.canReceiveNotification(jSONObject, this);
                if (obj == aVar) {
                    return aVar;
                }
                qVar = qVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (q) this.L$0;
                J7.a.v(obj);
            }
            qVar.f15463s = ((Boolean) obj).booleanValue();
            return m.a;
        }
    }

    public static final class f extends p210v8.k implements p200u8.b {
        final /* synthetic */ J5.m $willDisplayEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(J5.m mVar) {
            super(1);
            this.$willDisplayEvent = mVar;
        }

        @Override // p200u8.b
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((J5.j) null);
            return m.a;
        }

        public final void invoke(J5.j jVar) {
            p210v8.i.f(jVar, "it");
            jVar.a();
        }
    }

    public static final class g extends p210v8.k implements p200u8.b {
        final /* synthetic */ J5.k $notificationReceivedEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(J5.k kVar) {
            super(1);
            this.$notificationReceivedEvent = kVar;
        }

        @Override // p200u8.b
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((l) null);
            return m.a;
        }

        public final void invoke(l lVar) {
            p210v8.i.f(lVar, "it");
            lVar.a();
        }
    }

    public static final class h extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public h(p123m8.d<? super h> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.notificationOpened(null, null, this);
        }
    }

    public static final class i extends p144o8.g implements p200u8.c {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ JSONArray $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Activity activity, JSONArray jSONArray, p123m8.d<? super i> dVar) {
            super(2, dVar);
            this.$activity = activity;
            this.$data = jSONArray;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            i iVar = new i(this.$activity, this.$data, dVar);
            iVar.L$0 = obj;
            return iVar;
        }

        @Override // p200u8.c
        public final Object invoke(Y5.b bVar, p123m8.d<? super m> dVar) {
            return ((i) create(bVar, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                Y5.b bVar = (Y5.b) this.L$0;
                Activity activity = this.$activity;
                JSONArray jSONArray = this.$data;
                this.label = 1;
                if (bVar.onNotificationOpened(activity, jSONArray, this) == aVar) {
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
    }

    public static final class j extends p210v8.k implements p200u8.b {
        final /* synthetic */ com.onesignal.notifications.internal.d $openResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.onesignal.notifications.internal.d dVar) {
            super(1);
            this.$openResult = dVar;
        }

        @Override // p200u8.b
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((J5.h) null);
            return m.a;
        }

        public final void invoke(J5.h hVar) {
            p210v8.i.f(hVar, "it");
            hVar.a();
        }
    }

    public static final class k extends p144o8.g implements p200u8.c {
        final /* synthetic */ U5.d $notificationJob;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(U5.d dVar, p123m8.d<? super k> dVar2) {
            super(2, dVar2);
            this.$notificationJob = dVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            k kVar = new k(this.$notificationJob, dVar);
            kVar.L$0 = obj;
            return kVar;
        }

        @Override // p200u8.c
        public final Object invoke(Y5.b bVar, p123m8.d<? super m> dVar) {
            return ((k) create(bVar, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                Y5.b bVar = (Y5.b) this.L$0;
                U5.d dVar = this.$notificationJob;
                this.label = 1;
                if (bVar.onNotificationReceived(dVar, this) == aVar) {
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
    }

    public a(X4.f fVar, p110l5.a aVar) {
        p210v8.i.f(fVar, "applicationService");
        p210v8.i.f(aVar, "_time");
        this._time = aVar;
        this.intLifecycleHandler = new com.onesignal.common.events.b();
        this.intLifecycleCallback = new com.onesignal.common.events.a();
        this.extRemoteReceivedCallback = new com.onesignal.common.events.a();
        this.extWillShowInForegroundCallback = new com.onesignal.common.events.b();
        this.extOpenedCallback = new com.onesignal.common.events.b();
        this.unprocessedOpenedNotifs = new p086i8.h();
        setupNotificationServiceExtension(fVar.getAppContext());
    }

    @Override // Y5.c
    public void addExternalClickListener(J5.h hVar) {
        p210v8.i.f(hVar, "callback");
        this.extOpenedCallback.subscribe(hVar);
        if (this.extOpenedCallback.getHasSubscribers()) {
            p086i8.h hVar2 = this.unprocessedOpenedNotifs;
            p210v8.i.f(hVar2, "<this>");
            if (hVar2.isEmpty()) {
                return;
            }
            Iterator<E> it = this.unprocessedOpenedNotifs.iterator();
            while (it.hasNext()) {
                this.extOpenedCallback.fireOnMain(new C0067a(U5.e.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications((JSONArray) it.next(), this._time)));
            }
        }
    }

    @Override // Y5.c
    public void addExternalForegroundLifecycleListener(J5.j jVar) {
        p210v8.i.f(jVar, "listener");
        this.extWillShowInForegroundCallback.subscribe(jVar);
    }

    @Override // Y5.c
    public void addInternalNotificationLifecycleEventHandler(Y5.b bVar) {
        p210v8.i.f(bVar, "handler");
        this.intLifecycleHandler.subscribe(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // Y5.c
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, p123m8.d<? super Boolean> dVar) {
        b bVar;
        q qVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = bVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            q qVar2 = new q();
            qVar2.f15463s = this.extOpenedCallback.getHasSubscribers();
            com.onesignal.common.events.a aVar2 = this.intLifecycleCallback;
            c cVar = new c(qVar2, activity, jSONObject, null);
            bVar.L$0 = qVar2;
            bVar.label = 1;
            if (aVar2.suspendingFire(cVar, bVar) == aVar) {
                return aVar;
            }
            qVar = qVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) bVar.L$0;
            J7.a.v(obj);
        }
        return Boolean.valueOf(qVar.f15463s);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // Y5.c
    public Object canReceiveNotification(JSONObject jSONObject, p123m8.d<? super Boolean> dVar) {
        d dVar2;
        q qVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = dVar2.label;
        if (i11 == 0) {
            J7.a.v(obj);
            q qVar2 = new q();
            qVar2.f15463s = true;
            com.onesignal.common.events.a aVar2 = this.intLifecycleCallback;
            e eVar = new e(qVar2, jSONObject, null);
            dVar2.L$0 = qVar2;
            dVar2.label = 1;
            if (aVar2.suspendingFire(eVar, dVar2) == aVar) {
                return aVar;
            }
            qVar = qVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) dVar2.L$0;
            J7.a.v(obj);
        }
        return Boolean.valueOf(qVar.f15463s);
    }

    @Override // Y5.c
    public void externalNotificationWillShowInForeground(J5.m mVar) {
        p210v8.i.f(mVar, "willDisplayEvent");
        this.extWillShowInForegroundCallback.fire(new f(mVar));
    }

    @Override // Y5.c
    public void externalRemoteNotificationReceived(J5.k kVar) {
        p210v8.i.f(kVar, "notificationReceivedEvent");
        this.extRemoteReceivedCallback.fire(new g(kVar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // Y5.c
    public Object notificationOpened(Activity activity, JSONArray jSONArray, p123m8.d<? super m> dVar) {
        h hVar;
        a aVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.label = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object obj = hVar.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = hVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            com.onesignal.common.events.b bVar = this.intLifecycleHandler;
            i iVar = new i(activity, jSONArray, null);
            hVar.L$0 = this;
            hVar.L$1 = jSONArray;
            hVar.label = 1;
            if (bVar.suspendingFire(iVar, hVar) == aVar2) {
                return aVar2;
            }
            aVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jSONArray = (JSONArray) hVar.L$1;
            aVar = (a) hVar.L$0;
            J7.a.v(obj);
        }
        if (aVar.extOpenedCallback.getHasSubscribers()) {
            aVar.extOpenedCallback.fireOnMain(new j(U5.e.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray, aVar._time)));
        } else {
            aVar.unprocessedOpenedNotifs.k(jSONArray);
        }
        return m.a;
    }

    @Override // Y5.c
    public Object notificationReceived(U5.d dVar, p123m8.d<? super m> dVar2) {
        Object objSuspendingFire = this.intLifecycleHandler.suspendingFire(new k(dVar, null), dVar2);
        return objSuspendingFire == p134n8.a.f13404s ? objSuspendingFire : m.a;
    }

    @Override // Y5.c
    public void removeExternalClickListener(J5.h hVar) {
        p210v8.i.f(hVar, "listener");
        this.extOpenedCallback.unsubscribe(hVar);
    }

    @Override // Y5.c
    public void removeExternalForegroundLifecycleListener(J5.j jVar) {
        p210v8.i.f(jVar, "listener");
        this.extWillShowInForegroundCallback.unsubscribe(jVar);
    }

    @Override // Y5.c
    public void removeInternalNotificationLifecycleEventHandler(Y5.b bVar) {
        p210v8.i.f(bVar, "handler");
        this.intLifecycleHandler.unsubscribe(bVar);
    }

    @Override // Y5.c
    public void setInternalNotificationLifecycleCallback(Y5.a aVar) {
        this.intLifecycleCallback.set(aVar);
    }

    public final void setupNotificationServiceExtension(Context context) {
        p210v8.i.f(context, "context");
        String manifestMeta = AndroidUtils.INSTANCE.getManifestMeta(context, "com.onesignal.NotificationServiceExtension");
        if (manifestMeta == null) {
            com.onesignal.debug.internal.logging.b.verbose$default("No class found, not setting up OSRemoteNotificationReceivedHandler", null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.verbose$default(E0.a.i("Found class: ", manifestMeta, ", attempting to call constructor"), null, 2, null);
        try {
            Class.forName(manifestMeta).newInstance();
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
        } catch (InstantiationException e12) {
            e12.printStackTrace();
        }
    }
}
