.class public final Lcom/rollbar/notifier/sender/BufferedSender$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rollbar/notifier/sender/BufferedSender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private batchSize:I

.field private flushFreq:J

.field private initialFlushDelay:J

.field private queue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/rollbar/api/payload/Payload;",
            ">;"
        }
    .end annotation
.end field

.field private sender:Lcom/rollbar/notifier/sender/Sender;

.field private senderFailureStrategy:Lcom/rollbar/notifier/sender/SenderFailureStrategy;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x7fffffff

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->batchSize:I

    .line 8
    .line 9
    invoke-static {}, Lcom/rollbar/notifier/sender/BufferedSender;->access$600()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->initialFlushDelay:J

    .line 14
    .line 15
    invoke-static {}, Lcom/rollbar/notifier/sender/BufferedSender;->access$700()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iput-wide v0, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->flushFreq:J

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->sender:Lcom/rollbar/notifier/sender/Sender;

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
.end method

.method public static synthetic access$000(Lcom/rollbar/notifier/sender/BufferedSender$Builder;)Lcom/rollbar/notifier/sender/Sender;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->sender:Lcom/rollbar/notifier/sender/Sender;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
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

.method public static synthetic access$100(Lcom/rollbar/notifier/sender/BufferedSender$Builder;)Ljava/util/Queue;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->queue:Ljava/util/Queue;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
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

.method public static synthetic access$200(Lcom/rollbar/notifier/sender/BufferedSender$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->batchSize:I

    .line 2
    .line 3
    return p0
    .line 4
    .line 5
    .line 6
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

.method public static synthetic access$300(Lcom/rollbar/notifier/sender/BufferedSender$Builder;)Lcom/rollbar/notifier/sender/SenderFailureStrategy;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->senderFailureStrategy:Lcom/rollbar/notifier/sender/SenderFailureStrategy;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
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

.method public static synthetic access$400(Lcom/rollbar/notifier/sender/BufferedSender$Builder;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->initialFlushDelay:J

    .line 2
    .line 3
    return-wide v0
    .line 4
    .line 5
    .line 6
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

.method public static synthetic access$500(Lcom/rollbar/notifier/sender/BufferedSender$Builder;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->flushFreq:J

    .line 2
    .line 3
    return-wide v0
    .line 4
    .line 5
    .line 6
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


# virtual methods
.method public batchSize(I)Lcom/rollbar/notifier/sender/BufferedSender$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->batchSize:I

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
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

.method public build()Lcom/rollbar/notifier/sender/BufferedSender;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->queue:Ljava/util/Queue;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->queue:Ljava/util/Queue;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->sender:Lcom/rollbar/notifier/sender/Sender;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    new-instance v0, Lcom/rollbar/notifier/sender/SyncSender$Builder;

    .line 17
    .line 18
    invoke-direct {v0}, Lcom/rollbar/notifier/sender/SyncSender$Builder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/rollbar/notifier/sender/SyncSender$Builder;->build()Lcom/rollbar/notifier/sender/SyncSender;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->sender:Lcom/rollbar/notifier/sender/Sender;

    .line 26
    .line 27
    :cond_1
    new-instance v0, Lcom/rollbar/notifier/sender/BufferedSender;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Lcom/rollbar/notifier/sender/BufferedSender;-><init>(Lcom/rollbar/notifier/sender/BufferedSender$Builder;)V

    .line 30
    .line 31
    .line 32
    return-object v0
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
.end method

.method public flushFreq(J)Lcom/rollbar/notifier/sender/BufferedSender$Builder;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->flushFreq:J

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
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

.method public initialFlushDelay(J)Lcom/rollbar/notifier/sender/BufferedSender$Builder;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->initialFlushDelay:J

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
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

.method public queue(Ljava/util/Queue;)Lcom/rollbar/notifier/sender/BufferedSender$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Queue<",
            "Lcom/rollbar/api/payload/Payload;",
            ">;)",
            "Lcom/rollbar/notifier/sender/BufferedSender$Builder;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->queue:Ljava/util/Queue;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
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

.method public sender(Lcom/rollbar/notifier/sender/Sender;)Lcom/rollbar/notifier/sender/BufferedSender$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->sender:Lcom/rollbar/notifier/sender/Sender;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
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

.method public senderFailureStrategy(Lcom/rollbar/notifier/sender/SenderFailureStrategy;)Lcom/rollbar/notifier/sender/BufferedSender$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->senderFailureStrategy:Lcom/rollbar/notifier/sender/SenderFailureStrategy;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
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
