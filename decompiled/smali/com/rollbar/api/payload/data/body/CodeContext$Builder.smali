.class public final Lcom/rollbar/api/payload/data/body/CodeContext$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rollbar/api/payload/data/body/CodeContext;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private post:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private pre:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
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

.method public constructor <init>(Lcom/rollbar/api/payload/data/body/CodeContext;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/rollbar/api/payload/data/body/CodeContext;->access$200(Lcom/rollbar/api/payload/data/body/CodeContext;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/body/CodeContext$Builder;->pre:Ljava/util/List;

    .line 4
    invoke-static {p1}, Lcom/rollbar/api/payload/data/body/CodeContext;->access$300(Lcom/rollbar/api/payload/data/body/CodeContext;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/rollbar/api/payload/data/body/CodeContext$Builder;->post:Ljava/util/List;

    return-void
.end method

.method public static synthetic access$000(Lcom/rollbar/api/payload/data/body/CodeContext$Builder;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/body/CodeContext$Builder;->pre:Ljava/util/List;

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

.method public static synthetic access$100(Lcom/rollbar/api/payload/data/body/CodeContext$Builder;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/body/CodeContext$Builder;->post:Ljava/util/List;

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
.method public build()Lcom/rollbar/api/payload/data/body/CodeContext;
    .locals 2

    .line 1
    new-instance v0, Lcom/rollbar/api/payload/data/body/CodeContext;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/rollbar/api/payload/data/body/CodeContext;-><init>(Lcom/rollbar/api/payload/data/body/CodeContext$Builder;Lcom/rollbar/api/payload/data/body/CodeContext$1;)V

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

.method public post(Ljava/util/List;)Lcom/rollbar/api/payload/data/body/CodeContext$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/rollbar/api/payload/data/body/CodeContext$Builder;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/body/CodeContext$Builder;->post:Ljava/util/List;

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

.method public pre(Ljava/util/List;)Lcom/rollbar/api/payload/data/body/CodeContext$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/rollbar/api/payload/data/body/CodeContext$Builder;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/body/CodeContext$Builder;->pre:Ljava/util/List;

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
