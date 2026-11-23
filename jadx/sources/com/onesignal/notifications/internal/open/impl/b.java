package com.onesignal.notifications.internal.open.impl;

import I.J;
import U5.e;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p076h8.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p006a6.a {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final V5.d _dataController;
    private final Y5.c _lifecycleService;
    private final p055f6.a _summaryManager;

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
            return b.this.addChildNotifications(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.notifications.internal.open.impl.b$b, reason: collision with other inner class name */
    public static final class C0070b extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C0070b(p123m8.d<? super C0070b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.markNotificationsConsumed(null, null, false, this);
        }
    }

    public static final class c extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public c(p123m8.d<? super c> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processIntent(null, null, this);
        }
    }

    public static final class d extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public d(p123m8.d<? super d> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processToOpenIntent(null, null, null, this);
        }
    }

    public b(p055f6.a aVar, V5.d dVar, com.onesignal.core.internal.config.b bVar, Y5.c cVar) {
        i.f(aVar, "_summaryManager");
        i.f(dVar, "_dataController");
        i.f(bVar, "_configModelStore");
        i.f(cVar, "_lifecycleService");
        this._summaryManager = aVar;
        this._dataController = dVar;
        this._configModelStore = bVar;
        this._lifecycleService = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object addChildNotifications(JSONArray jSONArray, String str, p123m8.d<? super m> dVar) {
        a aVar;
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
        Object objListNotificationsForGroup = aVar.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = aVar.label;
        if (i11 == 0) {
            J7.a.v(objListNotificationsForGroup);
            V5.d dVar2 = this._dataController;
            aVar.L$0 = jSONArray;
            aVar.label = 1;
            objListNotificationsForGroup = dVar2.listNotificationsForGroup(str, aVar);
            if (objListNotificationsForGroup == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jSONArray = (JSONArray) aVar.L$0;
            J7.a.v(objListNotificationsForGroup);
        }
        Iterator it = ((List) objListNotificationsForGroup).iterator();
        while (it.hasNext()) {
            jSONArray.put(new JSONObject(((V5.c) it.next()).getFullData()));
        }
        return m.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clearStatusBarNotifications(Context context, String str, p123m8.d<? super m> dVar) {
        m mVar = m.a;
        if (str != null) {
            Object objClearNotificationOnSummaryClick = this._summaryManager.clearNotificationOnSummaryClick(str, dVar);
            return objClearNotificationOnSummaryClick == p134n8.a.f13404s ? objClearNotificationOnSummaryClick : mVar;
        }
        e eVar = e.INSTANCE;
        if (eVar.getGrouplessNotifsCount(context) < 1) {
            eVar.getNotificationManager(context).cancel(e.GROUPLESS_SUMMARY_ID);
        }
        return mVar;
    }

    @SuppressLint({"MissingPermission"})
    private final void handleDismissFromActionButtonPress(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            i.c(context);
            J j = new J(context);
            j.f1957b.cancel(null, intent.getIntExtra("androidNotificationId", 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    private final boolean isOneSignalIntent(Intent intent) {
        return intent.hasExtra("onesignalData") || intent.hasExtra("summary") || intent.hasExtra("androidNotificationId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r8.markAsConsumed(r9, r3, r4, r5, r6) == r0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object markNotificationsConsumed(android.content.Context r8, android.content.Intent r9, boolean r10, p123m8.d<? super p076h8.m> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.onesignal.notifications.internal.open.impl.b.C0070b
            if (r0 == 0) goto L14
            r0 = r11
            com.onesignal.notifications.internal.open.impl.b$b r0 = (com.onesignal.notifications.internal.open.impl.b.C0070b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.onesignal.notifications.internal.open.impl.b$b r0 = new com.onesignal.notifications.internal.open.impl.b$b
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.result
            n8.a r0 = p134n8.a.f13404s
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L48
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            J7.a.v(r11)
            goto L8c
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            boolean r10 = r6.Z$0
            java.lang.Object r8 = r6.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r6.L$1
            android.content.Intent r9 = (android.content.Intent) r9
            java.lang.Object r1 = r6.L$0
            com.onesignal.notifications.internal.open.impl.b r1 = (com.onesignal.notifications.internal.open.impl.b) r1
            J7.a.v(r11)
            r4 = r8
        L46:
            r3 = r10
            goto L65
        L48:
            J7.a.v(r11)
            java.lang.String r11 = "summary"
            java.lang.String r11 = r9.getStringExtra(r11)
            r6.L$0 = r7
            r6.L$1 = r9
            r6.L$2 = r11
            r6.Z$0 = r10
            r6.label = r3
            java.lang.Object r8 = r7.clearStatusBarNotifications(r8, r11, r6)
            if (r8 != r0) goto L62
            goto L8b
        L62:
            r1 = r7
            r4 = r11
            goto L46
        L65:
            V5.d r8 = r1._dataController
            java.lang.String r10 = "androidNotificationId"
            r11 = 0
            int r9 = r9.getIntExtra(r10, r11)
            com.onesignal.core.internal.config.b r10 = r1._configModelStore
            com.onesignal.common.modeling.i r10 = r10.getModel()
            com.onesignal.core.internal.config.a r10 = (com.onesignal.core.internal.config.a) r10
            boolean r5 = r10.getClearGroupOnSummaryClick()
            r10 = 0
            r6.L$0 = r10
            r6.L$1 = r10
            r6.L$2 = r10
            r6.label = r2
            r1 = r8
            r2 = r9
            java.lang.Object r8 = r1.markAsConsumed(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L8c
        L8b:
            return r0
        L8c:
            h8.m r8 = p076h8.m.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.open.impl.b.markNotificationsConsumed(android.content.Context, android.content.Intent, boolean, m8.d):java.lang.Object");
    }

    private final ContentValues newContentValuesWithConsumed(Intent intent) {
        ContentValues contentValues = new ContentValues();
        if (intent.getBooleanExtra("dismissed", false)) {
            contentValues.put("dismissed", (Integer) 1);
            return contentValues;
        }
        contentValues.put("opened", (Integer) 1);
        return contentValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x011c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0133  */
    /* JADX WARN: Code duplicated, block: B:48:0x0137  */
    /* JADX WARN: Code duplicated, block: B:49:0x0149  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x011c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0137, please report this as an issue */
    public final Object processIntent(Context context, Intent intent, p123m8.d<? super m> dVar) {
        c cVar;
        String stringExtra;
        boolean booleanExtra;
        b bVar;
        com.onesignal.notifications.internal.open.impl.a aVar;
        Object objProcessToOpenIntent;
        Intent intent2;
        com.onesignal.notifications.internal.open.impl.a aVar2;
        b bVar2;
        Context context2;
        boolean z6;
        String str;
        String stringExtra2;
        Intent intent3;
        Context context3;
        b bVar3;
        JSONArray dataArray;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.label = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.result;
        p134n8.a aVar3 = p134n8.a.f13404s;
        int i11 = cVar.label;
        m mVar = m.a;
        if (i11 == 0) {
            J7.a.v(obj);
            stringExtra = intent.getStringExtra("summary");
            booleanExtra = intent.getBooleanExtra("dismissed", false);
            if (booleanExtra) {
                bVar = this;
                aVar = null;
                cVar.L$0 = bVar;
                cVar.L$1 = context;
                cVar.L$2 = intent;
                cVar.L$3 = stringExtra;
                cVar.L$4 = aVar;
                cVar.Z$0 = booleanExtra;
                cVar.label = 2;
                if (bVar.markNotificationsConsumed(context, intent, booleanExtra, cVar) != aVar3) {
                    com.onesignal.notifications.internal.open.impl.a aVar4 = aVar;
                    intent2 = intent;
                    aVar2 = aVar4;
                    bVar2 = bVar;
                    context2 = context;
                    z6 = booleanExtra;
                    str = stringExtra;
                    if (str == null) {
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                    if (intent2.getExtras() != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                    }
                    if (!z6) {
                        if (context2 instanceof Activity) {
                            i.c(aVar2);
                            dataArray = aVar2.getDataArray();
                            cVar.L$0 = null;
                            cVar.L$1 = null;
                            cVar.L$2 = null;
                            cVar.L$3 = null;
                            cVar.L$4 = null;
                            cVar.label = 4;
                            if (bVar2._lifecycleService.notificationOpened((Activity) context2, dataArray, cVar) == aVar3) {
                            }
                        } else {
                            com.onesignal.debug.internal.logging.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                        }
                    }
                    return mVar;
                }
            } else {
                cVar.L$0 = this;
                cVar.L$1 = context;
                cVar.L$2 = intent;
                cVar.L$3 = stringExtra;
                cVar.Z$0 = booleanExtra;
                cVar.label = 1;
                objProcessToOpenIntent = processToOpenIntent(context, intent, stringExtra, cVar);
                if (objProcessToOpenIntent != aVar3) {
                    bVar = this;
                }
            }
            return aVar3;
        }
        if (i11 == 1) {
            boolean z10 = cVar.Z$0;
            String str2 = (String) cVar.L$3;
            Intent intent4 = (Intent) cVar.L$2;
            Context context4 = (Context) cVar.L$1;
            bVar = (b) cVar.L$0;
            J7.a.v(obj);
            booleanExtra = z10;
            context = context4;
            objProcessToOpenIntent = obj;
            stringExtra = str2;
            intent = intent4;
        } else {
            if (i11 == 2) {
                z6 = cVar.Z$0;
                aVar2 = (com.onesignal.notifications.internal.open.impl.a) cVar.L$4;
                str = (String) cVar.L$3;
                intent2 = (Intent) cVar.L$2;
                context2 = (Context) cVar.L$1;
                bVar2 = (b) cVar.L$0;
                J7.a.v(obj);
                if (str == null || (stringExtra2 = intent2.getStringExtra("grp")) == null) {
                    com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                    if (intent2.getExtras() != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                    }
                    if (!z6) {
                        if (context2 instanceof Activity) {
                            com.onesignal.debug.internal.logging.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                        } else {
                            i.c(aVar2);
                            dataArray = aVar2.getDataArray();
                            cVar.L$0 = null;
                            cVar.L$1 = null;
                            cVar.L$2 = null;
                            cVar.L$3 = null;
                            cVar.L$4 = null;
                            cVar.label = 4;
                            if (bVar2._lifecycleService.notificationOpened((Activity) context2, dataArray, cVar) == aVar3) {
                            }
                        }
                    }
                } else {
                    p055f6.a aVar5 = bVar2._summaryManager;
                    cVar.L$0 = bVar2;
                    cVar.L$1 = context2;
                    cVar.L$2 = intent2;
                    cVar.L$3 = aVar2;
                    cVar.L$4 = null;
                    cVar.Z$0 = z6;
                    cVar.label = 3;
                    if (aVar5.updateSummaryNotificationAfterChildRemoved(stringExtra2, z6, cVar) != aVar3) {
                        intent3 = intent2;
                        context3 = context2;
                        bVar3 = bVar2;
                        context2 = context3;
                        bVar2 = bVar3;
                        intent2 = intent3;
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                        if (intent2.getExtras() != null) {
                            com.onesignal.debug.internal.logging.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                        }
                        if (!z6) {
                            if (context2 instanceof Activity) {
                                com.onesignal.debug.internal.logging.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                            } else {
                                i.c(aVar2);
                                dataArray = aVar2.getDataArray();
                                cVar.L$0 = null;
                                cVar.L$1 = null;
                                cVar.L$2 = null;
                                cVar.L$3 = null;
                                cVar.L$4 = null;
                                cVar.label = 4;
                                if (bVar2._lifecycleService.notificationOpened((Activity) context2, dataArray, cVar) == aVar3) {
                                }
                            }
                        }
                    }
                }
                return aVar3;
            }
            if (i11 == 3) {
                z6 = cVar.Z$0;
                aVar2 = (com.onesignal.notifications.internal.open.impl.a) cVar.L$3;
                intent3 = (Intent) cVar.L$2;
                context3 = (Context) cVar.L$1;
                bVar3 = (b) cVar.L$0;
                J7.a.v(obj);
                context2 = context3;
                bVar2 = bVar3;
                intent2 = intent3;
                com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                if (intent2.getExtras() != null) {
                    com.onesignal.debug.internal.logging.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                }
                if (!z6) {
                    if (context2 instanceof Activity) {
                        com.onesignal.debug.internal.logging.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                    } else {
                        i.c(aVar2);
                        dataArray = aVar2.getDataArray();
                        cVar.L$0 = null;
                        cVar.L$1 = null;
                        cVar.L$2 = null;
                        cVar.L$3 = null;
                        cVar.L$4 = null;
                        cVar.label = 4;
                        if (bVar2._lifecycleService.notificationOpened((Activity) context2, dataArray, cVar) == aVar3) {
                            return aVar3;
                        }
                    }
                }
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
        }
        return mVar;
        aVar = (com.onesignal.notifications.internal.open.impl.a) objProcessToOpenIntent;
        if (aVar == null) {
            return mVar;
        }
        cVar.L$0 = bVar;
        cVar.L$1 = context;
        cVar.L$2 = intent;
        cVar.L$3 = stringExtra;
        cVar.L$4 = aVar;
        cVar.Z$0 = booleanExtra;
        cVar.label = 2;
        if (bVar.markNotificationsConsumed(context, intent, booleanExtra, cVar) != aVar3) {
            com.onesignal.notifications.internal.open.impl.a aVar6 = aVar;
            intent2 = intent;
            aVar2 = aVar6;
            bVar2 = bVar;
            context2 = context;
            z6 = booleanExtra;
            str = stringExtra;
            if (str == null) {
            }
            com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
            if (intent2.getExtras() != null) {
                com.onesignal.debug.internal.logging.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
            }
            if (!z6) {
                if (context2 instanceof Activity) {
                    com.onesignal.debug.internal.logging.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                } else {
                    i.c(aVar2);
                    dataArray = aVar2.getDataArray();
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.L$3 = null;
                    cVar.L$4 = null;
                    cVar.label = 4;
                    if (bVar2._lifecycleService.notificationOpened((Activity) context2, dataArray, cVar) == aVar3) {
                    }
                }
            }
            return mVar;
        }
        return aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        if (r1.addChildNotifications(r11, r12, r2) == r3) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processToOpenIntent(android.content.Context r10, android.content.Intent r11, java.lang.String r12, p123m8.d<? super com.onesignal.notifications.internal.open.impl.a> r13) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.open.impl.b.processToOpenIntent(android.content.Context, android.content.Intent, java.lang.String, m8.d):java.lang.Object");
    }

    @Override // p006a6.a
    public Object processFromContext(Context context, Intent intent, p123m8.d<? super m> dVar) {
        boolean zIsOneSignalIntent = isOneSignalIntent(intent);
        m mVar = m.a;
        if (!zIsOneSignalIntent) {
            return mVar;
        }
        handleDismissFromActionButtonPress(context, intent);
        Object objProcessIntent = processIntent(context, intent, dVar);
        return objProcessIntent == p134n8.a.f13404s ? objProcessIntent : mVar;
    }
}
