package com.onesignal.notifications.internal.badges.impl;

import U5.e;
import X4.f;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.ShortcutBadgeException;
import p005a5.d;
import p076h8.m;
import p200u8.b;
import p210v8.i;
import p210v8.k;
import p210v8.r;

/* JADX INFO: loaded from: classes.dex */
public final class a implements N5.a {
    private final f _applicationService;
    private final d _databaseProvider;
    private final V5.a _queryHelper;
    private int badgesEnabled;

    /* JADX INFO: renamed from: com.onesignal.notifications.internal.badges.impl.a$a, reason: collision with other inner class name */
    public static final class C0062a extends k implements b {
        final /* synthetic */ r $notificationCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0062a(r rVar) {
            super(1);
            this.$notificationCount = rVar;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p005a5.a) obj);
            return m.a;
        }

        public final void invoke(p005a5.a aVar) {
            i.f(aVar, "it");
            this.$notificationCount.f15464s = aVar.getCount();
        }
    }

    public a(f fVar, V5.a aVar, d dVar) {
        i.f(fVar, "_applicationService");
        i.f(aVar, "_queryHelper");
        i.f(dVar, "_databaseProvider");
        this._applicationService = fVar;
        this._queryHelper = aVar;
        this._databaseProvider = dVar;
        this.badgesEnabled = -1;
    }

    private final boolean areBadgeSettingsEnabled() {
        int i10 = this.badgesEnabled;
        if (i10 != -1) {
            return i10 == 1;
        }
        try {
            ApplicationInfo applicationInfo = this._applicationService.getAppContext().getPackageManager().getApplicationInfo(this._applicationService.getAppContext().getPackageName(), 128);
            i.e(applicationInfo, "_applicationService.appC…A_DATA,\n                )");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.badgesEnabled = !"DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 1 : 0;
            } else {
                this.badgesEnabled = 1;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            this.badgesEnabled = 0;
            com.onesignal.debug.internal.logging.b.error("Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e10);
        }
        return this.badgesEnabled == 1;
    }

    private final boolean areBadgesEnabled() {
        return areBadgeSettingsEnabled() && e.areNotificationsEnabled$default(e.INSTANCE, this._applicationService.getAppContext(), null, 2, null);
    }

    private final void updateFallback() {
        r rVar = new r();
        p005a5.b.query$default(this._databaseProvider.getOs(), "notification", null, this._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, null, String.valueOf(Z5.a.INSTANCE.getMaxNumberOfNotifications()), new C0062a(rVar), 122, null);
        updateCount(rVar.f15464s);
    }

    private final void updateStandard() {
        int i10 = 0;
        for (StatusBarNotification statusBarNotification : e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext())) {
            if (!e.INSTANCE.isGroupSummary(statusBarNotification)) {
                i10++;
            }
        }
        updateCount(i10);
    }

    @Override // N5.a
    public void update() {
        if (areBadgesEnabled()) {
            updateStandard();
        }
    }

    @Override // N5.a
    public void updateCount(int i10) {
        if (areBadgeSettingsEnabled()) {
            try {
                O5.b.applyCountOrThrow(this._applicationService.getAppContext(), i10);
            } catch (ShortcutBadgeException unused) {
            }
        }
    }
}
