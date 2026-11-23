.class public final Lcom/rollbar/api/payload/data/body/TraceChain$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rollbar/api/payload/data/body/TraceChain;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private traces:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/rollbar/api/payload/data/body/Trace;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/rollbar/api/payload/data/body/TraceChain;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/rollbar/api/payload/data/body/TraceChain;->access$100(Lcom/rollbar/api/payload/data/body/TraceChain;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/rollbar/api/payload/data/body/TraceChain$Builder;->traces:Ljava/util/List;

    return-void
.end method

.method public static synthetic access$000(Lcom/rollbar/api/payload/data/body/TraceChain$Builder;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/body/TraceChain$Builder;->traces:Ljava/util/List;

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


# virtual methods
.method public build()Lcom/rollbar/api/payload/data/body/TraceChain;
    .locals 1

    .line 1
    new-instance v0, Lcom/rollbar/api/payload/data/body/TraceChain;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/rollbar/api/payload/data/body/TraceChain;-><init>(Lcom/rollbar/api/payload/data/body/TraceChain$Builder;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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
.end method

.method public traces(Ljava/util/List;)Lcom/rollbar/api/payload/data/body/TraceChain$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/rollbar/api/payload/data/body/Trace;",
            ">;)",
            "Lcom/rollbar/api/payload/data/body/TraceChain$Builder;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/body/TraceChain$Builder;->traces:Ljava/util/List;

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
