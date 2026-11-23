package V5;

import java.util.List;
import p076h8.m;

/* JADX INFO: loaded from: classes.dex */
public interface d {
    Object clearOldestOverLimitFallback(int i10, int i11, p123m8.d<? super m> dVar);

    Object createNotification(String str, String str2, String str3, boolean z6, boolean z10, int i10, String str4, String str5, long j, String str6, p123m8.d<? super m> dVar);

    Object createSummaryNotification(int i10, String str, p123m8.d<? super m> dVar);

    Object deleteExpiredNotifications(p123m8.d<? super m> dVar);

    Object doesNotificationExist(String str, p123m8.d<? super Boolean> dVar);

    Object getAndroidIdForGroup(String str, boolean z6, p123m8.d<? super Integer> dVar);

    Object getAndroidIdFromCollapseKey(String str, p123m8.d<? super Integer> dVar);

    Object getGroupId(int i10, p123m8.d<? super String> dVar);

    Object listNotificationsForGroup(String str, p123m8.d<? super List<c>> dVar);

    Object listNotificationsForOutstanding(List<Integer> list, p123m8.d<? super List<c>> dVar);

    Object markAsConsumed(int i10, boolean z6, String str, boolean z10, p123m8.d<? super m> dVar);

    Object markAsDismissed(int i10, p123m8.d<? super Boolean> dVar);

    Object markAsDismissedForGroup(String str, p123m8.d<? super m> dVar);

    Object markAsDismissedForOutstanding(p123m8.d<? super m> dVar);
}
