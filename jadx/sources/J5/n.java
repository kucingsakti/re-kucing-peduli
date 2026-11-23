package J5;

/* JADX INFO: loaded from: classes.dex */
public interface n {
    /* JADX INFO: renamed from: addClickListener */
    void mo29addClickListener(h hVar);

    /* JADX INFO: renamed from: addForegroundLifecycleListener */
    void mo30addForegroundLifecycleListener(j jVar);

    /* JADX INFO: renamed from: addPermissionObserver */
    void mo31addPermissionObserver(o oVar);

    /* JADX INFO: renamed from: clearAllNotifications */
    void mo32clearAllNotifications();

    /* JADX INFO: renamed from: getCanRequestPermission */
    boolean mo33getCanRequestPermission();

    /* JADX INFO: renamed from: getPermission */
    boolean mo34getPermission();

    /* JADX INFO: renamed from: removeClickListener */
    void mo35removeClickListener(h hVar);

    /* JADX INFO: renamed from: removeForegroundLifecycleListener */
    void mo36removeForegroundLifecycleListener(j jVar);

    /* JADX INFO: renamed from: removeGroupedNotifications */
    void mo37removeGroupedNotifications(String str);

    /* JADX INFO: renamed from: removeNotification */
    void mo38removeNotification(int i10);

    /* JADX INFO: renamed from: removePermissionObserver */
    void mo39removePermissionObserver(o oVar);

    Object requestPermission(boolean z6, p123m8.d<? super Boolean> dVar);
}
