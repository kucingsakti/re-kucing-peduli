.class public interface abstract LY5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addExternalClickListener(LJ5/h;)V
.end method

.method public abstract addExternalForegroundLifecycleListener(LJ5/j;)V
.end method

.method public abstract addInternalNotificationLifecycleEventHandler(LY5/b;)V
.end method

.method public abstract canOpenNotification(Landroid/app/Activity;Lorg/json/JSONObject;Lm8/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lorg/json/JSONObject;",
            "Lm8/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract canReceiveNotification(Lorg/json/JSONObject;Lm8/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Lm8/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract externalNotificationWillShowInForeground(LJ5/m;)V
.end method

.method public abstract externalRemoteNotificationReceived(LJ5/k;)V
.end method

.method public abstract notificationOpened(Landroid/app/Activity;Lorg/json/JSONArray;Lm8/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lorg/json/JSONArray;",
            "Lm8/d<",
            "-",
            "Lh8/m;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract notificationReceived(LU5/d;Lm8/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LU5/d;",
            "Lm8/d<",
            "-",
            "Lh8/m;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract removeExternalClickListener(LJ5/h;)V
.end method

.method public abstract removeExternalForegroundLifecycleListener(LJ5/j;)V
.end method

.method public abstract removeInternalNotificationLifecycleEventHandler(LY5/b;)V
.end method

.method public abstract setInternalNotificationLifecycleCallback(LY5/a;)V
.end method
