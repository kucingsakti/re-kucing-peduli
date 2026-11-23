.class public final Lcom/rollbar/api/payload/data/Request$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rollbar/api/payload/data/Request;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private body:Ljava/lang/String;

.field private get:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

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

.field private method:Ljava/lang/String;

.field private params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private post:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private queryString:Ljava/lang/String;

.field private url:Ljava/lang/String;

.field private userIp:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/rollbar/api/payload/data/Request;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Request;->access$1000(Lcom/rollbar/api/payload/data/Request;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->url:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Request;->access$1100(Lcom/rollbar/api/payload/data/Request;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->method:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Request;->access$1200(Lcom/rollbar/api/payload/data/Request;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->headers:Ljava/util/Map;

    .line 6
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Request;->access$1300(Lcom/rollbar/api/payload/data/Request;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->params:Ljava/util/Map;

    .line 7
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Request;->access$1400(Lcom/rollbar/api/payload/data/Request;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->get:Ljava/util/Map;

    .line 8
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Request;->access$1500(Lcom/rollbar/api/payload/data/Request;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->queryString:Ljava/lang/String;

    .line 9
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Request;->access$1600(Lcom/rollbar/api/payload/data/Request;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->post:Ljava/util/Map;

    .line 10
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Request;->access$1700(Lcom/rollbar/api/payload/data/Request;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->body:Ljava/lang/String;

    .line 11
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Request;->access$1800(Lcom/rollbar/api/payload/data/Request;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->userIp:Ljava/lang/String;

    .line 12
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Request;->access$1900(Lcom/rollbar/api/payload/data/Request;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/rollbar/api/payload/data/Request$Builder;->metadata:Ljava/util/Map;

    return-void
.end method

.method public static synthetic access$000(Lcom/rollbar/api/payload/data/Request$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->url:Ljava/lang/String;

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

.method public static synthetic access$100(Lcom/rollbar/api/payload/data/Request$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->method:Ljava/lang/String;

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

.method public static synthetic access$200(Lcom/rollbar/api/payload/data/Request$Builder;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->headers:Ljava/util/Map;

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

.method public static synthetic access$300(Lcom/rollbar/api/payload/data/Request$Builder;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->params:Ljava/util/Map;

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

.method public static synthetic access$400(Lcom/rollbar/api/payload/data/Request$Builder;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->get:Ljava/util/Map;

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

.method public static synthetic access$500(Lcom/rollbar/api/payload/data/Request$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->queryString:Ljava/lang/String;

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

.method public static synthetic access$600(Lcom/rollbar/api/payload/data/Request$Builder;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->post:Ljava/util/Map;

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

.method public static synthetic access$700(Lcom/rollbar/api/payload/data/Request$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->body:Ljava/lang/String;

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

.method public static synthetic access$800(Lcom/rollbar/api/payload/data/Request$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->userIp:Ljava/lang/String;

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

.method public static synthetic access$900(Lcom/rollbar/api/payload/data/Request$Builder;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Request$Builder;->metadata:Ljava/util/Map;

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
.method public body(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Request$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Request$Builder;->body:Ljava/lang/String;

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

.method public build()Lcom/rollbar/api/payload/data/Request;
    .locals 2

    .line 1
    new-instance v0, Lcom/rollbar/api/payload/data/Request;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/rollbar/api/payload/data/Request;-><init>(Lcom/rollbar/api/payload/data/Request$Builder;Lcom/rollbar/api/payload/data/Request$1;)V

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

.method public get(Ljava/util/Map;)Lcom/rollbar/api/payload/data/Request$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/rollbar/api/payload/data/Request$Builder;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Request$Builder;->get:Ljava/util/Map;

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

.method public headers(Ljava/util/Map;)Lcom/rollbar/api/payload/data/Request$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/rollbar/api/payload/data/Request$Builder;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Request$Builder;->headers:Ljava/util/Map;

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

.method public metadata(Ljava/util/Map;)Lcom/rollbar/api/payload/data/Request$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/rollbar/api/payload/data/Request$Builder;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Request$Builder;->metadata:Ljava/util/Map;

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

.method public method(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Request$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Request$Builder;->method:Ljava/lang/String;

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

.method public params(Ljava/util/Map;)Lcom/rollbar/api/payload/data/Request$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/rollbar/api/payload/data/Request$Builder;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Request$Builder;->params:Ljava/util/Map;

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

.method public post(Ljava/util/Map;)Lcom/rollbar/api/payload/data/Request$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/rollbar/api/payload/data/Request$Builder;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Request$Builder;->post:Ljava/util/Map;

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

.method public queryString(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Request$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Request$Builder;->queryString:Ljava/lang/String;

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

.method public url(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Request$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Request$Builder;->url:Ljava/lang/String;

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

.method public userIp(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Request$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Request$Builder;->userIp:Ljava/lang/String;

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
