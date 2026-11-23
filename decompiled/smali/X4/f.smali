.class public interface abstract LX4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addActivityLifecycleHandler(LX4/d;)V
.end method

.method public abstract addApplicationLifecycleHandler(LX4/e;)V
.end method

.method public abstract getAppContext()Landroid/content/Context;
.end method

.method public abstract getCurrent()Landroid/app/Activity;
.end method

.method public abstract getEntryState()LX4/b;
.end method

.method public abstract isInForeground()Z
.end method

.method public abstract removeActivityLifecycleHandler(LX4/d;)V
.end method

.method public abstract removeApplicationLifecycleHandler(LX4/e;)V
.end method

.method public abstract setEntryState(LX4/b;)V
.end method

.method public abstract waitUntilActivityReady(Lm8/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm8/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract waitUntilSystemConditionsAvailable(Lm8/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm8/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
