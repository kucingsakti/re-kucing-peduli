.class public final Lcom/rollbar/api/payload/data/Data$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rollbar/api/payload/data/Data;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private body:Lcom/rollbar/api/payload/data/body/Body;

.field private client:Lcom/rollbar/api/payload/data/Client;

.field private codeVersion:Ljava/lang/String;

.field private context:Ljava/lang/String;

.field private custom:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private environment:Ljava/lang/String;

.field private fingerprint:Ljava/lang/String;

.field private framework:Ljava/lang/String;

.field private isUncaught:Z

.field private language:Ljava/lang/String;

.field private level:Lcom/rollbar/api/payload/data/Level;

.field private notifier:Lcom/rollbar/api/payload/data/Notifier;

.field private person:Lcom/rollbar/api/payload/data/Person;

.field private platform:Ljava/lang/String;

.field private request:Lcom/rollbar/api/payload/data/Request;

.field private server:Lcom/rollbar/api/payload/data/Server;

.field private timestamp:Ljava/lang/Long;

.field private title:Ljava/lang/String;

.field private uuid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/rollbar/api/payload/data/Data;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$1900(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->environment:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$2000(Lcom/rollbar/api/payload/data/Data;)Lcom/rollbar/api/payload/data/body/Body;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->body:Lcom/rollbar/api/payload/data/body/Body;

    .line 5
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$2100(Lcom/rollbar/api/payload/data/Data;)Lcom/rollbar/api/payload/data/Level;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->level:Lcom/rollbar/api/payload/data/Level;

    .line 6
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$2200(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->timestamp:Ljava/lang/Long;

    .line 7
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$2300(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->codeVersion:Ljava/lang/String;

    .line 8
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$2400(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->platform:Ljava/lang/String;

    .line 9
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$2500(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->language:Ljava/lang/String;

    .line 10
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$2600(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->framework:Ljava/lang/String;

    .line 11
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$2700(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->context:Ljava/lang/String;

    .line 12
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$2800(Lcom/rollbar/api/payload/data/Data;)Lcom/rollbar/api/payload/data/Request;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->request:Lcom/rollbar/api/payload/data/Request;

    .line 13
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$2900(Lcom/rollbar/api/payload/data/Data;)Lcom/rollbar/api/payload/data/Person;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->person:Lcom/rollbar/api/payload/data/Person;

    .line 14
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$3000(Lcom/rollbar/api/payload/data/Data;)Lcom/rollbar/api/payload/data/Server;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->server:Lcom/rollbar/api/payload/data/Server;

    .line 15
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$3100(Lcom/rollbar/api/payload/data/Data;)Lcom/rollbar/api/payload/data/Client;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->client:Lcom/rollbar/api/payload/data/Client;

    .line 16
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$3200(Lcom/rollbar/api/payload/data/Data;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->custom:Ljava/util/Map;

    .line 17
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$3300(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->fingerprint:Ljava/lang/String;

    .line 18
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$3400(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->title:Ljava/lang/String;

    .line 19
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$3500(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->uuid:Ljava/lang/String;

    .line 20
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$3600(Lcom/rollbar/api/payload/data/Data;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->isUncaught:Z

    .line 21
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data;->access$3700(Lcom/rollbar/api/payload/data/Data;)Lcom/rollbar/api/payload/data/Notifier;

    move-result-object p1

    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->notifier:Lcom/rollbar/api/payload/data/Notifier;

    return-void
.end method

.method public static synthetic access$000(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->environment:Ljava/lang/String;

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

.method public static synthetic access$100(Lcom/rollbar/api/payload/data/Data$Builder;)Lcom/rollbar/api/payload/data/body/Body;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->body:Lcom/rollbar/api/payload/data/body/Body;

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

.method public static synthetic access$1000(Lcom/rollbar/api/payload/data/Data$Builder;)Lcom/rollbar/api/payload/data/Person;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->person:Lcom/rollbar/api/payload/data/Person;

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

.method public static synthetic access$1100(Lcom/rollbar/api/payload/data/Data$Builder;)Lcom/rollbar/api/payload/data/Server;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->server:Lcom/rollbar/api/payload/data/Server;

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

.method public static synthetic access$1200(Lcom/rollbar/api/payload/data/Data$Builder;)Lcom/rollbar/api/payload/data/Client;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->client:Lcom/rollbar/api/payload/data/Client;

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

.method public static synthetic access$1300(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->custom:Ljava/util/Map;

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

.method public static synthetic access$1400(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->fingerprint:Ljava/lang/String;

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

.method public static synthetic access$1500(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->title:Ljava/lang/String;

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

.method public static synthetic access$1600(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->uuid:Ljava/lang/String;

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

.method public static synthetic access$1700(Lcom/rollbar/api/payload/data/Data$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->isUncaught:Z

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

.method public static synthetic access$1800(Lcom/rollbar/api/payload/data/Data$Builder;)Lcom/rollbar/api/payload/data/Notifier;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->notifier:Lcom/rollbar/api/payload/data/Notifier;

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

.method public static synthetic access$200(Lcom/rollbar/api/payload/data/Data$Builder;)Lcom/rollbar/api/payload/data/Level;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->level:Lcom/rollbar/api/payload/data/Level;

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

.method public static synthetic access$300(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/Long;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->timestamp:Ljava/lang/Long;

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

.method public static synthetic access$400(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->codeVersion:Ljava/lang/String;

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

.method public static synthetic access$500(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->platform:Ljava/lang/String;

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

.method public static synthetic access$600(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->language:Ljava/lang/String;

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

.method public static synthetic access$700(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->framework:Ljava/lang/String;

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

.method public static synthetic access$800(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->context:Ljava/lang/String;

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

.method public static synthetic access$900(Lcom/rollbar/api/payload/data/Data$Builder;)Lcom/rollbar/api/payload/data/Request;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data$Builder;->request:Lcom/rollbar/api/payload/data/Request;

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
.method public body(Lcom/rollbar/api/payload/data/body/Body;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->body:Lcom/rollbar/api/payload/data/body/Body;

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

.method public build()Lcom/rollbar/api/payload/data/Data;
    .locals 2

    .line 1
    new-instance v0, Lcom/rollbar/api/payload/data/Data;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/rollbar/api/payload/data/Data;-><init>(Lcom/rollbar/api/payload/data/Data$Builder;Lcom/rollbar/api/payload/data/Data$1;)V

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

.method public client(Lcom/rollbar/api/payload/data/Client;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->client:Lcom/rollbar/api/payload/data/Client;

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

.method public codeVersion(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->codeVersion:Ljava/lang/String;

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

.method public context(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->context:Ljava/lang/String;

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

.method public custom(Ljava/util/Map;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/rollbar/api/payload/data/Data$Builder;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->custom:Ljava/util/Map;

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

.method public environment(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->environment:Ljava/lang/String;

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

.method public fingerprint(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->fingerprint:Ljava/lang/String;

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

.method public framework(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->framework:Ljava/lang/String;

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

.method public isUncaught(Z)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->isUncaught:Z

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

.method public language(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->language:Ljava/lang/String;

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

.method public level(Lcom/rollbar/api/payload/data/Level;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->level:Lcom/rollbar/api/payload/data/Level;

    return-object p0
.end method

.method public level(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Level;->valueOf(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Level;

    move-result-object p1

    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->level:Lcom/rollbar/api/payload/data/Level;

    return-object p0
.end method

.method public notifier(Lcom/rollbar/api/payload/data/Notifier;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->notifier:Lcom/rollbar/api/payload/data/Notifier;

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

.method public person(Lcom/rollbar/api/payload/data/Person;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->person:Lcom/rollbar/api/payload/data/Person;

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

.method public platform(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->platform:Ljava/lang/String;

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

.method public request(Lcom/rollbar/api/payload/data/Request;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->request:Lcom/rollbar/api/payload/data/Request;

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

.method public server(Lcom/rollbar/api/payload/data/Server;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->server:Lcom/rollbar/api/payload/data/Server;

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

.method public timestamp(Ljava/lang/Long;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->timestamp:Ljava/lang/Long;

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

.method public title(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->title:Ljava/lang/String;

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

.method public uuid(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data$Builder;->uuid:Ljava/lang/String;

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
