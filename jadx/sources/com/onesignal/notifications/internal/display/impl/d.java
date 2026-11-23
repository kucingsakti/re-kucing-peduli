package com.onesignal.notifications.internal.display.impl;

import I.J;
import I.q;
import I.s;
import L9.n;
import U5.e;
import X4.f;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p076h8.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d implements W5.c {
    private final f _applicationService;
    private final V5.d _dataController;
    private final W5.a _notificationDisplayBuilder;

    public static final class a extends p144o8.c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public a(p123m8.d<? super a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.createGrouplessSummaryNotification(null, null, 0, 0, this);
        }
    }

    public static final class b extends p144o8.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(p123m8.d<? super b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.createSummaryNotification(null, null, 0, this);
        }
    }

    public d(f fVar, V5.d dVar, W5.a aVar) {
        i.f(fVar, "_applicationService");
        i.f(dVar, "_dataController");
        i.f(aVar, "_notificationDisplayBuilder");
        this._applicationService = fVar;
        this._dataController = dVar;
        this._notificationDisplayBuilder = aVar;
    }

    private final Intent createBaseSummaryIntent(int i10, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, String str) {
        Intent intentPutExtra = aVar.getNewBaseIntent(i10).putExtra("onesignalData", jSONObject.toString()).putExtra("summary", str);
        i.e(intentPutExtra, "intentGenerator.getNewBa…utExtra(\"summary\", group)");
        return intentPutExtra;
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    @Override // W5.c
    public void createGenericPendingIntentsForGroup(s sVar, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, String str, int i10) {
        i.f(aVar, "intentGenerator");
        i.f(jSONObject, "gcmBundle");
        i.f(str, "group");
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt();
        Intent intentPutExtra = aVar.getNewBaseIntent(i10).putExtra("onesignalData", jSONObject.toString()).putExtra("grp", str);
        i.e(intentPutExtra, "intentGenerator.getNewBa…)).putExtra(\"grp\", group)");
        PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(iNextInt, intentPutExtra);
        i.c(sVar);
        sVar.f1990g = newActionPendingIntent;
        W5.a aVar2 = this._notificationDisplayBuilder;
        int iNextInt2 = secureRandom.nextInt();
        Intent intentPutExtra2 = this._notificationDisplayBuilder.getNewBaseDismissIntent(i10).putExtra("grp", str);
        i.e(intentPutExtra2, "_notificationDisplayBuil…d).putExtra(\"grp\", group)");
        sVar.f2008z.deleteIntent = aVar2.getNewDismissActionPendingIntent(iNextInt2, intentPutExtra2);
        sVar.f1998p = str;
        try {
            sVar.f2006x = this._notificationDisplayBuilder.getGroupAlertBehavior();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // W5.c
    public Object createGrouplessSummaryNotification(U5.d dVar, com.onesignal.notifications.internal.display.impl.a aVar, int i10, int i11, p123m8.d<? super m> dVar2) {
        a aVar2;
        JSONObject jsonPayload;
        SecureRandom secureRandom;
        String str;
        d dVar3;
        String str2;
        U5.d dVar4;
        int i12;
        if (dVar2 instanceof a) {
            aVar2 = (a) dVar2;
            int i13 = aVar2.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i13 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(dVar2);
            }
        } else {
            aVar2 = new a(dVar2);
        }
        Object obj = aVar2.result;
        p134n8.a aVar3 = p134n8.a.f13404s;
        int i14 = aVar2.label;
        if (i14 == 0) {
            J7.a.v(obj);
            jsonPayload = dVar.getJsonPayload();
            i.c(jsonPayload);
            secureRandom = new SecureRandom();
            str = i10 + " new messages";
            V5.d dVar5 = this._dataController;
            aVar2.L$0 = this;
            aVar2.L$1 = dVar;
            aVar2.L$2 = aVar;
            aVar2.L$3 = jsonPayload;
            aVar2.L$4 = secureRandom;
            aVar2.L$5 = e.GROUPLESS_SUMMARY_KEY;
            aVar2.L$6 = str;
            aVar2.I$0 = i10;
            aVar2.I$1 = i11;
            aVar2.I$2 = e.GROUPLESS_SUMMARY_ID;
            aVar2.label = 1;
            if (dVar5.createSummaryNotification(e.GROUPLESS_SUMMARY_ID, e.GROUPLESS_SUMMARY_KEY, aVar2) == aVar3) {
                return aVar3;
            }
            dVar3 = this;
            str2 = e.GROUPLESS_SUMMARY_KEY;
            dVar4 = dVar;
            i12 = -718463522;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = aVar2.I$2;
            i11 = aVar2.I$1;
            i10 = aVar2.I$0;
            String str3 = (String) aVar2.L$6;
            str2 = (String) aVar2.L$5;
            secureRandom = (SecureRandom) aVar2.L$4;
            jsonPayload = (JSONObject) aVar2.L$3;
            com.onesignal.notifications.internal.display.impl.a aVar4 = (com.onesignal.notifications.internal.display.impl.a) aVar2.L$2;
            dVar4 = (U5.d) aVar2.L$1;
            dVar3 = (d) aVar2.L$0;
            J7.a.v(obj);
            str = str3;
            aVar = aVar4;
        }
        PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(secureRandom.nextInt(), dVar3.createBaseSummaryIntent(i12, aVar, jsonPayload, str2));
        W5.a aVar5 = dVar3._notificationDisplayBuilder;
        int iNextInt = secureRandom.nextInt();
        Intent intentPutExtra = dVar3._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
        i.e(intentPutExtra, "_notificationDisplayBuil…utExtra(\"summary\", group)");
        PendingIntent newDismissActionPendingIntent = aVar5.getNewDismissActionPendingIntent(iNextInt, intentPutExtra);
        s compatBuilder = dVar3._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar4).getCompatBuilder();
        if (dVar4.getOverriddenSound() != null) {
            i.c(compatBuilder);
            compatBuilder.h(dVar4.getOverriddenSound());
        }
        if (dVar4.getOverriddenFlags() != null) {
            i.c(compatBuilder);
            Integer overriddenFlags = dVar4.getOverriddenFlags();
            i.c(overriddenFlags);
            compatBuilder.d(overriddenFlags.intValue());
        }
        i.c(compatBuilder);
        compatBuilder.f1990g = newActionPendingIntent;
        compatBuilder.f2008z.deleteIntent = newDismissActionPendingIntent;
        Context currentContext = dVar3.getCurrentContext();
        i.c(currentContext);
        PackageManager packageManager = currentContext.getPackageManager();
        Context currentContext2 = dVar3.getCurrentContext();
        i.c(currentContext2);
        compatBuilder.f1988e = s.c(packageManager.getApplicationLabel(currentContext2.getApplicationInfo()));
        compatBuilder.f1989f = s.c(str);
        compatBuilder.f1992i = i10;
        compatBuilder.f2008z.icon = dVar3._notificationDisplayBuilder.getDefaultSmallIconId();
        compatBuilder.f(dVar3._notificationDisplayBuilder.getDefaultLargeIcon());
        compatBuilder.e(8, true);
        compatBuilder.e(16, false);
        compatBuilder.f1998p = str2;
        compatBuilder.f1999q = true;
        try {
            compatBuilder.f2006x = i11;
        } catch (Throwable unused) {
        }
        q qVar = new q(1);
        qVar.f2009b = s.c(str);
        compatBuilder.i(qVar);
        Notification notificationB = compatBuilder.b();
        i.e(notificationB, "summaryBuilder.build()");
        Context currentContext3 = dVar3.getCurrentContext();
        i.c(currentContext3);
        new J(currentContext3).b(i12, notificationB);
        return m.a;
    }

    @Override // W5.c
    public Notification createSingleNotificationBeforeSummaryBuilder(U5.d dVar, s sVar) {
        i.f(dVar, "notificationJob");
        boolean z6 = Build.VERSION.SDK_INT < 24 && !dVar.isRestoring();
        if (z6 && dVar.getOverriddenSound() != null) {
            Uri overriddenSound = dVar.getOverriddenSound();
            i.c(overriddenSound);
            if (!overriddenSound.equals(dVar.getOrgSound())) {
                i.c(sVar);
                sVar.h(null);
            }
        }
        i.c(sVar);
        Notification notificationB = sVar.b();
        i.e(notificationB, "notifBuilder!!.build()");
        if (z6) {
            sVar.h(dVar.getOverriddenSound());
        }
        return notificationB;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0237 A[EDGE_INSN: B:115:0x0237->B:54:0x0237 BREAK  A[LOOP:0: B:35:0x01c8->B:119:0x01c8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x01ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:49:0x0214  */
    /* JADX WARN: Code duplicated, block: B:56:0x0251  */
    /* JADX WARN: Code duplicated, block: B:58:0x0258 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // W5.c
    public Object createSummaryNotification(U5.d dVar, com.onesignal.notifications.internal.display.impl.b.a aVar, int i10, p123m8.d<? super m> dVar2) {
        b bVar;
        com.onesignal.notifications.internal.display.impl.a aVar2;
        String strOptString;
        PendingIntent newDismissActionPendingIntent;
        U5.d dVar3;
        com.onesignal.notifications.internal.display.impl.b.a aVar3;
        int i11;
        JSONObject jSONObject;
        boolean z6;
        SecureRandom secureRandom;
        d dVar4;
        com.onesignal.notifications.internal.display.impl.a aVar4;
        U5.d dVar5;
        PendingIntent pendingIntent;
        SecureRandom secureRandom2;
        com.onesignal.notifications.internal.display.impl.b.a aVar5;
        String str;
        JSONObject jSONObject2;
        Integer num;
        Integer num2;
        com.onesignal.notifications.internal.display.impl.a aVar6;
        int i12;
        JSONObject jSONObject3;
        U5.d dVar6;
        String str2;
        com.onesignal.notifications.internal.display.impl.b.a aVar7;
        boolean z10;
        d dVar7;
        int i13;
        com.onesignal.notifications.internal.display.impl.b.a aVar8;
        ArrayList<SpannableString> arrayList;
        Iterator it;
        String fullData;
        String strConcat;
        PendingIntent newActionPendingIntent;
        Notification notificationB;
        String string;
        V5.c cVar;
        SpannableString spannableString;
        if (dVar2 instanceof b) {
            bVar = (b) dVar2;
            int i14 = bVar.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.label = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar2);
            }
        } else {
            bVar = new b(dVar2);
        }
        Object objListNotificationsForGroup = bVar.result;
        p134n8.a aVar9 = p134n8.a.f13404s;
        int i15 = bVar.label;
        if (i15 == 0) {
            J7.a.v(objListNotificationsForGroup);
            boolean zIsRestoring = dVar.isRestoring();
            JSONObject jsonPayload = dVar.getJsonPayload();
            i.c(jsonPayload);
            Context currentContext = getCurrentContext();
            i.c(currentContext);
            aVar2 = new com.onesignal.notifications.internal.display.impl.a(currentContext);
            strOptString = jsonPayload.optString("grp", null);
            SecureRandom secureRandom3 = new SecureRandom();
            W5.a aVar10 = this._notificationDisplayBuilder;
            int iNextInt = secureRandom3.nextInt();
            Intent intentPutExtra = this._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", strOptString);
            i.e(intentPutExtra, "_notificationDisplayBuil…utExtra(\"summary\", group)");
            newDismissActionPendingIntent = aVar10.getNewDismissActionPendingIntent(iNextInt, intentPutExtra);
            V5.d dVar8 = this._dataController;
            i.e(strOptString, "group");
            bVar.L$0 = this;
            dVar3 = dVar;
            bVar.L$1 = dVar3;
            aVar3 = aVar;
            bVar.L$2 = aVar3;
            bVar.L$3 = jsonPayload;
            bVar.L$4 = aVar2;
            bVar.L$5 = strOptString;
            bVar.L$6 = secureRandom3;
            bVar.L$7 = newDismissActionPendingIntent;
            i11 = i10;
            bVar.I$0 = i11;
            bVar.Z$0 = zIsRestoring;
            bVar.label = 1;
            Object androidIdForGroup = dVar8.getAndroidIdForGroup(strOptString, true, bVar);
            if (androidIdForGroup != aVar9) {
                jSONObject = jsonPayload;
                z6 = zIsRestoring;
                objListNotificationsForGroup = androidIdForGroup;
                secureRandom = secureRandom3;
                dVar4 = this;
            }
            return aVar9;
        }
        if (i15 == 1) {
            z6 = bVar.Z$0;
            int i16 = bVar.I$0;
            PendingIntent pendingIntent2 = (PendingIntent) bVar.L$7;
            SecureRandom secureRandom4 = (SecureRandom) bVar.L$6;
            String str3 = (String) bVar.L$5;
            com.onesignal.notifications.internal.display.impl.a aVar11 = (com.onesignal.notifications.internal.display.impl.a) bVar.L$4;
            JSONObject jSONObject4 = (JSONObject) bVar.L$3;
            com.onesignal.notifications.internal.display.impl.b.a aVar12 = (com.onesignal.notifications.internal.display.impl.b.a) bVar.L$2;
            U5.d dVar9 = (U5.d) bVar.L$1;
            d dVar10 = (d) bVar.L$0;
            J7.a.v(objListNotificationsForGroup);
            i11 = i16;
            aVar2 = aVar11;
            newDismissActionPendingIntent = pendingIntent2;
            strOptString = str3;
            dVar4 = dVar10;
            secureRandom = secureRandom4;
            jSONObject = jSONObject4;
            aVar3 = aVar12;
            dVar3 = dVar9;
        } else {
            if (i15 == 2) {
                z6 = bVar.Z$0;
                i12 = bVar.I$0;
                num2 = (Integer) bVar.L$8;
                newDismissActionPendingIntent = (PendingIntent) bVar.L$7;
                secureRandom = (SecureRandom) bVar.L$6;
                str2 = (String) bVar.L$5;
                aVar6 = (com.onesignal.notifications.internal.display.impl.a) bVar.L$4;
                jSONObject3 = (JSONObject) bVar.L$3;
                aVar7 = (com.onesignal.notifications.internal.display.impl.b.a) bVar.L$2;
                dVar6 = (U5.d) bVar.L$1;
                dVar4 = (d) bVar.L$0;
                J7.a.v(objListNotificationsForGroup);
                aVar5 = aVar7;
                num = num2;
                pendingIntent = newDismissActionPendingIntent;
                secureRandom2 = secureRandom;
                str = str2;
                aVar4 = aVar6;
                jSONObject2 = jSONObject3;
                i11 = i12;
                dVar5 = dVar6;
                V5.d dVar11 = dVar4._dataController;
                i.e(str, "group");
                bVar.L$0 = dVar4;
                bVar.L$1 = dVar5;
                bVar.L$2 = aVar5;
                bVar.L$3 = jSONObject2;
                bVar.L$4 = aVar4;
                bVar.L$5 = str;
                bVar.L$6 = secureRandom2;
                bVar.L$7 = pendingIntent;
                bVar.L$8 = num;
                bVar.I$0 = i11;
                bVar.Z$0 = z6;
                bVar.label = 3;
                objListNotificationsForGroup = dVar11.listNotificationsForGroup(str, bVar);
                if (objListNotificationsForGroup != aVar9) {
                    z10 = z6;
                    dVar7 = dVar4;
                    i13 = i11;
                    aVar8 = aVar5;
                }
                return aVar9;
            }
            if (i15 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z11 = bVar.Z$0;
            i13 = bVar.I$0;
            num = (Integer) bVar.L$8;
            pendingIntent = (PendingIntent) bVar.L$7;
            secureRandom2 = (SecureRandom) bVar.L$6;
            str = (String) bVar.L$5;
            aVar4 = (com.onesignal.notifications.internal.display.impl.a) bVar.L$4;
            jSONObject2 = (JSONObject) bVar.L$3;
            aVar8 = (com.onesignal.notifications.internal.display.impl.b.a) bVar.L$2;
            dVar5 = (U5.d) bVar.L$1;
            dVar7 = (d) bVar.L$0;
            J7.a.v(objListNotificationsForGroup);
            z10 = z11;
        }
        arrayList = new ArrayList();
        it = ((List) objListNotificationsForGroup).iterator();
        fullData = null;
        while (true) {
            it = it;
            num = num;
            strConcat = "";
            if (!it.hasNext()) {
                break;
            }
            cVar = (V5.c) it.next();
            String str4 = fullData;
            if (z10 == 0 || cVar.getAndroidId() != dVar5.getAndroidId()) {
                String title = cVar.getTitle();
                strConcat = title != null ? title.concat(" ") : "";
                StringBuilder sbC = p239z.e.c(strConcat);
                sbC.append(cVar.getMessage());
                spannableString = new SpannableString(sbC.toString());
                if (strConcat.length() > 0) {
                    spannableString.setSpan(new StyleSpan(1), 0, strConcat.length(), 0);
                }
                arrayList.add(spannableString);
                if (str4 == null) {
                }
            }
        }
        int iNextInt2 = secureRandom2.nextInt();
        i.c(num);
        int iIntValue = num.intValue();
        i.e(str, "group");
        newActionPendingIntent = aVar4.getNewActionPendingIntent(iNextInt2, dVar7.createBaseSummaryIntent(iIntValue, aVar4, jSONObject2, str));
        if ((z10 != 0 || arrayList.size() <= 1) && (z10 != 0 || arrayList.size() <= 0)) {
            i.c(aVar8);
            s compatBuilder = aVar8.getCompatBuilder();
            i.c(compatBuilder);
            compatBuilder.f1985b.clear();
            dVar7._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar4, compatBuilder, num.intValue(), str);
            compatBuilder.f1990g = newActionPendingIntent;
            compatBuilder.f2008z.deleteIntent = pendingIntent;
            compatBuilder.e(8, z10);
            compatBuilder.e(16, false);
            compatBuilder.f1998p = str;
            compatBuilder.f1999q = true;
            try {
                compatBuilder.f2006x = i13;
            } catch (Throwable unused) {
            }
            notificationB = compatBuilder.b();
            i.e(notificationB, "summaryBuilder.build()");
            dVar7._notificationDisplayBuilder.addXiaomiSettings(aVar8, notificationB);
        } else {
            int size = arrayList.size() + (!z10);
            String strSafeString = com.onesignal.common.e.safeString(jSONObject2, "grp_msg");
            String strG = strSafeString != null ? n.G(strSafeString, "$[notif_count]", "" + size) : size + " new messages";
            s compatBuilder2 = dVar7._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar5).getCompatBuilder();
            if (z10 != 0) {
                dVar7._notificationDisplayBuilder.removeNotifyOptions(compatBuilder2);
            } else {
                if (dVar5.getOverriddenSound() != null) {
                    i.c(compatBuilder2);
                    compatBuilder2.h(dVar5.getOverriddenSound());
                }
                if (dVar5.getOverriddenFlags() != null) {
                    i.c(compatBuilder2);
                    Integer overriddenFlags = dVar5.getOverriddenFlags();
                    i.c(overriddenFlags);
                    compatBuilder2.d(overriddenFlags.intValue());
                }
            }
            i.c(compatBuilder2);
            compatBuilder2.f1990g = newActionPendingIntent;
            compatBuilder2.f2008z.deleteIntent = pendingIntent;
            Context currentContext2 = dVar7.getCurrentContext();
            i.c(currentContext2);
            PackageManager packageManager = currentContext2.getPackageManager();
            Context currentContext3 = dVar7.getCurrentContext();
            i.c(currentContext3);
            compatBuilder2.f1988e = s.c(packageManager.getApplicationLabel(currentContext3.getApplicationInfo()));
            compatBuilder2.f1989f = s.c(strG);
            compatBuilder2.f1992i = size;
            compatBuilder2.f2008z.icon = dVar7._notificationDisplayBuilder.getDefaultSmallIconId();
            compatBuilder2.f(dVar7._notificationDisplayBuilder.getDefaultLargeIcon());
            compatBuilder2.e(8, z10);
            compatBuilder2.e(16, false);
            compatBuilder2.f1998p = str;
            compatBuilder2.f1999q = true;
            try {
                compatBuilder2.f2006x = i13;
            } catch (Throwable unused2) {
            }
            if (z10 == 0) {
                compatBuilder2.f2008z.tickerText = s.c(strG);
            }
            q qVar = new q(1);
            if (z10 == 0) {
                String strValueOf = dVar5.getTitle() != null ? String.valueOf(dVar5.getTitle()) : null;
                String strConcat2 = strValueOf == null ? "" : strValueOf.concat(" ");
                CharSequence body = dVar5.getBody();
                if (body != null && (string = body.toString()) != null) {
                    strConcat = string;
                }
                SpannableString spannableString2 = new SpannableString(p231y.a.c(strConcat2, strConcat));
                if (strConcat2.length() > 0) {
                    spannableString2.setSpan(new StyleSpan(1), 0, strConcat2.length(), 0);
                }
                ((ArrayList) qVar.f1983f).add(s.c(spannableString2));
            }
            for (SpannableString spannableString3 : arrayList) {
                if (spannableString3 != null) {
                    ((ArrayList) qVar.f1983f).add(s.c(spannableString3));
                }
            }
            qVar.f2009b = s.c(strG);
            compatBuilder2.i(qVar);
            notificationB = compatBuilder2.b();
            i.e(notificationB, "summaryBuilder.build()");
        }
        Context currentContext4 = dVar7.getCurrentContext();
        i.c(currentContext4);
        new J(currentContext4).b(num.intValue(), notificationB);
        return m.a;
        Integer num3 = (Integer) objListNotificationsForGroup;
        if (num3 == null) {
            num2 = new Integer(secureRandom.nextInt());
            V5.d dVar12 = dVar4._dataController;
            int iIntValue2 = num2.intValue();
            i.e(strOptString, "group");
            bVar.L$0 = dVar4;
            bVar.L$1 = dVar3;
            bVar.L$2 = aVar3;
            bVar.L$3 = jSONObject;
            bVar.L$4 = aVar2;
            bVar.L$5 = strOptString;
            bVar.L$6 = secureRandom;
            bVar.L$7 = newDismissActionPendingIntent;
            bVar.L$8 = num2;
            bVar.I$0 = i11;
            bVar.Z$0 = z6;
            boolean z12 = z6;
            bVar.label = 2;
            if (dVar12.createSummaryNotification(iIntValue2, strOptString, bVar) != aVar9) {
                com.onesignal.notifications.internal.display.impl.b.a aVar13 = aVar3;
                aVar6 = aVar2;
                i12 = i11;
                jSONObject3 = jSONObject;
                dVar6 = dVar3;
                str2 = strOptString;
                aVar7 = aVar13;
                z6 = z12;
                aVar5 = aVar7;
                num = num2;
                pendingIntent = newDismissActionPendingIntent;
                secureRandom2 = secureRandom;
                str = str2;
                aVar4 = aVar6;
                jSONObject2 = jSONObject3;
                i11 = i12;
                dVar5 = dVar6;
                V5.d dVar13 = dVar4._dataController;
                i.e(str, "group");
                bVar.L$0 = dVar4;
                bVar.L$1 = dVar5;
                bVar.L$2 = aVar5;
                bVar.L$3 = jSONObject2;
                bVar.L$4 = aVar4;
                bVar.L$5 = str;
                bVar.L$6 = secureRandom2;
                bVar.L$7 = pendingIntent;
                bVar.L$8 = num;
                bVar.I$0 = i11;
                bVar.Z$0 = z6;
                bVar.label = 3;
                objListNotificationsForGroup = dVar13.listNotificationsForGroup(str, bVar);
                if (objListNotificationsForGroup != aVar9) {
                    z10 = z6;
                    dVar7 = dVar4;
                    i13 = i11;
                    aVar8 = aVar5;
                    arrayList = new ArrayList();
                    it = ((List) objListNotificationsForGroup).iterator();
                    fullData = null;
                    while (true) {
                        it = it;
                        num = num;
                        strConcat = "";
                        if (!it.hasNext()) {
                            break;
                            break;
                        }
                        cVar = (V5.c) it.next();
                        String str5 = fullData;
                        if (z10 == 0) {
                        }
                        String title2 = cVar.getTitle();
                        if (title2 != null) {
                        }
                        StringBuilder sbC2 = p239z.e.c(strConcat);
                        sbC2.append(cVar.getMessage());
                        spannableString = new SpannableString(sbC2.toString());
                        if (strConcat.length() > 0) {
                            spannableString.setSpan(new StyleSpan(1), 0, strConcat.length(), 0);
                        }
                        arrayList.add(spannableString);
                        fullData = str5 == null ? cVar.getFullData() : str5;
                    }
                    int iNextInt3 = secureRandom2.nextInt();
                    i.c(num);
                    int iIntValue3 = num.intValue();
                    i.e(str, "group");
                    newActionPendingIntent = aVar4.getNewActionPendingIntent(iNextInt3, dVar7.createBaseSummaryIntent(iIntValue3, aVar4, jSONObject2, str));
                    if (z10 != 0) {
                        i.c(aVar8);
                        s compatBuilder3 = aVar8.getCompatBuilder();
                        i.c(compatBuilder3);
                        compatBuilder3.f1985b.clear();
                        dVar7._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar4, compatBuilder3, num.intValue(), str);
                        compatBuilder3.f1990g = newActionPendingIntent;
                        compatBuilder3.f2008z.deleteIntent = pendingIntent;
                        compatBuilder3.e(8, z10);
                        compatBuilder3.e(16, false);
                        compatBuilder3.f1998p = str;
                        compatBuilder3.f1999q = true;
                        compatBuilder3.f2006x = i13;
                        notificationB = compatBuilder3.b();
                        i.e(notificationB, "summaryBuilder.build()");
                        dVar7._notificationDisplayBuilder.addXiaomiSettings(aVar8, notificationB);
                    } else {
                        i.c(aVar8);
                        s compatBuilder4 = aVar8.getCompatBuilder();
                        i.c(compatBuilder4);
                        compatBuilder4.f1985b.clear();
                        dVar7._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar4, compatBuilder4, num.intValue(), str);
                        compatBuilder4.f1990g = newActionPendingIntent;
                        compatBuilder4.f2008z.deleteIntent = pendingIntent;
                        compatBuilder4.e(8, z10);
                        compatBuilder4.e(16, false);
                        compatBuilder4.f1998p = str;
                        compatBuilder4.f1999q = true;
                        compatBuilder4.f2006x = i13;
                        notificationB = compatBuilder4.b();
                        i.e(notificationB, "summaryBuilder.build()");
                        dVar7._notificationDisplayBuilder.addXiaomiSettings(aVar8, notificationB);
                    }
                    Context currentContext5 = dVar7.getCurrentContext();
                    i.c(currentContext5);
                    new J(currentContext5).b(num.intValue(), notificationB);
                    return m.a;
                }
            }
        } else {
            U5.d dVar14 = dVar3;
            aVar4 = aVar2;
            dVar5 = dVar14;
            pendingIntent = newDismissActionPendingIntent;
            secureRandom2 = secureRandom;
            aVar5 = aVar3;
            str = strOptString;
            jSONObject2 = jSONObject;
            num = num3;
            V5.d dVar15 = dVar4._dataController;
            i.e(str, "group");
            bVar.L$0 = dVar4;
            bVar.L$1 = dVar5;
            bVar.L$2 = aVar5;
            bVar.L$3 = jSONObject2;
            bVar.L$4 = aVar4;
            bVar.L$5 = str;
            bVar.L$6 = secureRandom2;
            bVar.L$7 = pendingIntent;
            bVar.L$8 = num;
            bVar.I$0 = i11;
            bVar.Z$0 = z6;
            bVar.label = 3;
            objListNotificationsForGroup = dVar15.listNotificationsForGroup(str, bVar);
            if (objListNotificationsForGroup != aVar9) {
                z10 = z6;
                dVar7 = dVar4;
                i13 = i11;
                aVar8 = aVar5;
                arrayList = new ArrayList();
                it = ((List) objListNotificationsForGroup).iterator();
                fullData = null;
                while (true) {
                    it = it;
                    num = num;
                    strConcat = "";
                    if (!it.hasNext()) {
                        break;
                        break;
                    }
                    cVar = (V5.c) it.next();
                    String str6 = fullData;
                    if (z10 == 0) {
                    }
                    String title3 = cVar.getTitle();
                    if (title3 != null) {
                    }
                    StringBuilder sbC3 = p239z.e.c(strConcat);
                    sbC3.append(cVar.getMessage());
                    spannableString = new SpannableString(sbC3.toString());
                    if (strConcat.length() > 0) {
                        spannableString.setSpan(new StyleSpan(1), 0, strConcat.length(), 0);
                    }
                    arrayList.add(spannableString);
                    if (str6 == null) {
                    }
                }
                int iNextInt4 = secureRandom2.nextInt();
                i.c(num);
                int iIntValue4 = num.intValue();
                i.e(str, "group");
                newActionPendingIntent = aVar4.getNewActionPendingIntent(iNextInt4, dVar7.createBaseSummaryIntent(iIntValue4, aVar4, jSONObject2, str));
                if (z10 != 0) {
                    i.c(aVar8);
                    s compatBuilder5 = aVar8.getCompatBuilder();
                    i.c(compatBuilder5);
                    compatBuilder5.f1985b.clear();
                    dVar7._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar4, compatBuilder5, num.intValue(), str);
                    compatBuilder5.f1990g = newActionPendingIntent;
                    compatBuilder5.f2008z.deleteIntent = pendingIntent;
                    compatBuilder5.e(8, z10);
                    compatBuilder5.e(16, false);
                    compatBuilder5.f1998p = str;
                    compatBuilder5.f1999q = true;
                    compatBuilder5.f2006x = i13;
                    notificationB = compatBuilder5.b();
                    i.e(notificationB, "summaryBuilder.build()");
                    dVar7._notificationDisplayBuilder.addXiaomiSettings(aVar8, notificationB);
                } else {
                    i.c(aVar8);
                    s compatBuilder6 = aVar8.getCompatBuilder();
                    i.c(compatBuilder6);
                    compatBuilder6.f1985b.clear();
                    dVar7._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar4, compatBuilder6, num.intValue(), str);
                    compatBuilder6.f1990g = newActionPendingIntent;
                    compatBuilder6.f2008z.deleteIntent = pendingIntent;
                    compatBuilder6.e(8, z10);
                    compatBuilder6.e(16, false);
                    compatBuilder6.f1998p = str;
                    compatBuilder6.f1999q = true;
                    compatBuilder6.f2006x = i13;
                    notificationB = compatBuilder6.b();
                    i.e(notificationB, "summaryBuilder.build()");
                    dVar7._notificationDisplayBuilder.addXiaomiSettings(aVar8, notificationB);
                }
                Context currentContext6 = dVar7.getCurrentContext();
                i.c(currentContext6);
                new J(currentContext6).b(num.intValue(), notificationB);
                return m.a;
            }
        }
        return aVar9;
    }

    @Override // W5.c
    public Object updateSummaryNotification(U5.d dVar, p123m8.d<? super m> dVar2) {
        Object objCreateSummaryNotification = createSummaryNotification(dVar, null, this._notificationDisplayBuilder.getGroupAlertBehavior(), dVar2);
        return objCreateSummaryNotification == p134n8.a.f13404s ? objCreateSummaryNotification : m.a;
    }
}
