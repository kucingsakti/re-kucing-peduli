.class public abstract Lcom/rollbar/notifier/sender/AbstractSender;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/rollbar/notifier/sender/Sender;


# instance fields
.field private final listeners:Lcom/rollbar/notifier/sender/listener/SenderListenerCollection;

.field private thisLogger:Lva/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lva/b;->e(Ljava/lang/Class;)Lva/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/rollbar/notifier/sender/AbstractSender;->thisLogger:Lva/a;

    .line 13
    .line 14
    new-instance v0, Lcom/rollbar/notifier/sender/listener/SenderListenerCollection;

    .line 15
    .line 16
    invoke-direct {v0}, Lcom/rollbar/notifier/sender/listener/SenderListenerCollection;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/rollbar/notifier/sender/AbstractSender;->listeners:Lcom/rollbar/notifier/sender/listener/SenderListenerCollection;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method private notifyError(Lcom/rollbar/api/payload/Payload;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/rollbar/notifier/sender/AbstractSender;->thisLogger:Lva/a;

    .line 2
    .line 3
    const-string v1, "Error sending the payload."

    .line 4
    .line 5
    invoke-interface {v0, v1, p2}, Lva/a;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/rollbar/notifier/sender/AbstractSender;->listeners:Lcom/rollbar/notifier/sender/listener/SenderListenerCollection;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Lcom/rollbar/notifier/sender/listener/SenderListenerCollection;->onError(Lcom/rollbar/api/payload/Payload;Ljava/lang/Exception;)V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
.end method

.method private notifyResult(Lcom/rollbar/api/payload/Payload;Lcom/rollbar/notifier/sender/result/Response;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/rollbar/notifier/sender/AbstractSender;->thisLogger:Lva/a;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/rollbar/notifier/sender/result/Response;->getResult()Lcom/rollbar/notifier/sender/result/Result;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/rollbar/notifier/sender/result/Result;->getContent()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "Payload sent uuid: {}"

    .line 12
    .line 13
    invoke-interface {v0, v1, v2}, Lva/a;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/rollbar/notifier/sender/AbstractSender;->listeners:Lcom/rollbar/notifier/sender/listener/SenderListenerCollection;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Lcom/rollbar/notifier/sender/listener/SenderListenerCollection;->onResponse(Lcom/rollbar/api/payload/Payload;Lcom/rollbar/notifier/sender/result/Response;)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
.end method


# virtual methods
.method public final addListener(Lcom/rollbar/notifier/sender/listener/SenderListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/notifier/sender/AbstractSender;->listeners:Lcom/rollbar/notifier/sender/listener/SenderListenerCollection;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/rollbar/notifier/sender/listener/SenderListenerCollection;->addListener(Lcom/rollbar/notifier/sender/listener/SenderListener;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public close()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    return-void
.end method

.method public close(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Lcom/rollbar/notifier/sender/AbstractSender;->close()V

    return-void
.end method

.method public abstract doSend(Lcom/rollbar/api/payload/Payload;)Lcom/rollbar/notifier/sender/result/Response;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public final getListeners()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/rollbar/notifier/sender/listener/SenderListener;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/rollbar/notifier/sender/AbstractSender;->listeners:Lcom/rollbar/notifier/sender/listener/SenderListenerCollection;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/rollbar/notifier/sender/listener/SenderListenerCollection;->getListeners()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final send(Lcom/rollbar/api/payload/Payload;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/rollbar/notifier/sender/AbstractSender;->doSend(Lcom/rollbar/api/payload/Payload;)Lcom/rollbar/notifier/sender/result/Response;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/rollbar/notifier/sender/result/Response;->getResult()Lcom/rollbar/notifier/sender/result/Result;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/rollbar/notifier/sender/result/Result;->isError()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Lcom/rollbar/notifier/sender/exception/SenderException;

    .line 16
    .line 17
    new-instance v2, Lcom/rollbar/notifier/sender/exception/ApiException;

    .line 18
    .line 19
    invoke-direct {v2, v0}, Lcom/rollbar/notifier/sender/exception/ApiException;-><init>(Lcom/rollbar/notifier/sender/result/Response;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v2}, Lcom/rollbar/notifier/sender/exception/SenderException;-><init>(Ljava/lang/Exception;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, p1, v1}, Lcom/rollbar/notifier/sender/AbstractSender;->notifyError(Lcom/rollbar/api/payload/Payload;Ljava/lang/Exception;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-direct {p0, p1, v0}, Lcom/rollbar/notifier/sender/AbstractSender;->notifyResult(Lcom/rollbar/api/payload/Payload;Lcom/rollbar/notifier/sender/result/Response;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :goto_0
    new-instance v1, Lcom/rollbar/notifier/sender/exception/SenderException;

    .line 36
    .line 37
    invoke-direct {v1, v0}, Lcom/rollbar/notifier/sender/exception/SenderException;-><init>(Ljava/lang/Exception;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, p1, v1}, Lcom/rollbar/notifier/sender/AbstractSender;->notifyError(Lcom/rollbar/api/payload/Payload;Ljava/lang/Exception;)V

    .line 41
    .line 42
    .line 43
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method
