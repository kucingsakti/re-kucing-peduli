.class public final LC6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static t:LC6/a;


# instance fields
.field public s:LG6/a;


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, LC6/a;->s:LG6/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object v0, v0, LG6/b;->b:LH6/a;

    .line 6
    .line 7
    iget-object v0, v0, LH6/a;->i:Lcom/rollbar/notifier/sender/BufferedSender;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-interface {v0, v1}, Lcom/rollbar/notifier/sender/Sender;->close(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, LC6/a;->s:LG6/a;

    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception v0

    .line 18
    new-instance v1, Ljava/io/IOException;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    throw v1

    .line 24
    :cond_0
    return-void
    .line 25
    .line 26
.end method
