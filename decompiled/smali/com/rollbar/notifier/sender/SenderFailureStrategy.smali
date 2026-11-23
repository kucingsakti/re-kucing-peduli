.class public interface abstract Lcom/rollbar/notifier/sender/SenderFailureStrategy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rollbar/notifier/sender/SenderFailureStrategy$PayloadAction;
    }
.end annotation


# virtual methods
.method public abstract getAction(Lcom/rollbar/api/payload/Payload;Lcom/rollbar/notifier/sender/result/Response;)Lcom/rollbar/notifier/sender/SenderFailureStrategy$PayloadAction;
.end method

.method public abstract getAction(Lcom/rollbar/api/payload/Payload;Ljava/lang/Exception;)Lcom/rollbar/notifier/sender/SenderFailureStrategy$PayloadAction;
.end method

.method public abstract isSendingSuspended()Z
.end method
