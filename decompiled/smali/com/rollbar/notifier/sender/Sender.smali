.class public interface abstract Lcom/rollbar/notifier/sender/Sender;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# virtual methods
.method public abstract addListener(Lcom/rollbar/notifier/sender/listener/SenderListener;)V
.end method

.method public abstract close(Z)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public abstract getListeners()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/rollbar/notifier/sender/listener/SenderListener;",
            ">;"
        }
    .end annotation
.end method

.method public abstract send(Lcom/rollbar/api/payload/Payload;)V
.end method
