.class public final Lcom/rollbar/api/payload/data/Server$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rollbar/api/payload/data/Server;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private branch:Ljava/lang/String;

.field private codeVersion:Ljava/lang/String;

.field private host:Ljava/lang/String;

.field private metadata:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private root:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/rollbar/api/payload/data/Server;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Server;->access$500(Lcom/rollbar/api/payload/data/Server;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Server$Builder;->host:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Server;->access$600(Lcom/rollbar/api/payload/data/Server;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Server$Builder;->root:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Server;->access$700(Lcom/rollbar/api/payload/data/Server;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Server$Builder;->branch:Ljava/lang/String;

    .line 6
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Server;->access$800(Lcom/rollbar/api/payload/data/Server;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Server$Builder;->codeVersion:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Server;->access$900(Lcom/rollbar/api/payload/data/Server;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/rollbar/api/payload/data/Server$Builder;->metadata:Ljava/util/Map;

    return-void
.end method

.method public static synthetic access$000(Lcom/rollbar/api/payload/data/Server$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Server$Builder;->host:Ljava/lang/String;

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

.method public static synthetic access$100(Lcom/rollbar/api/payload/data/Server$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Server$Builder;->root:Ljava/lang/String;

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

.method public static synthetic access$200(Lcom/rollbar/api/payload/data/Server$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Server$Builder;->branch:Ljava/lang/String;

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

.method public static synthetic access$300(Lcom/rollbar/api/payload/data/Server$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Server$Builder;->codeVersion:Ljava/lang/String;

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

.method public static synthetic access$400(Lcom/rollbar/api/payload/data/Server$Builder;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Server$Builder;->metadata:Ljava/util/Map;

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
.method public branch(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Server$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Server$Builder;->branch:Ljava/lang/String;

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

.method public build()Lcom/rollbar/api/payload/data/Server;
    .locals 2

    .line 1
    new-instance v0, Lcom/rollbar/api/payload/data/Server;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/rollbar/api/payload/data/Server;-><init>(Lcom/rollbar/api/payload/data/Server$Builder;Lcom/rollbar/api/payload/data/Server$1;)V

    .line 5
    .line 6
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

.method public codeVersion(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Server$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Server$Builder;->codeVersion:Ljava/lang/String;

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

.method public host(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Server$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Server$Builder;->host:Ljava/lang/String;

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

.method public metadata(Ljava/util/Map;)Lcom/rollbar/api/payload/data/Server$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/rollbar/api/payload/data/Server$Builder;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Server$Builder;->metadata:Ljava/util/Map;

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

.method public root(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Server$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Server$Builder;->root:Ljava/lang/String;

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
