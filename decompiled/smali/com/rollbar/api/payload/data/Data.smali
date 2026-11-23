.class public Lcom/rollbar/api/payload/data/Data;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/rollbar/api/json/JsonSerializable;
.implements Lcom/rollbar/api/truncation/StringTruncatable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rollbar/api/payload/data/Data$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/rollbar/api/json/JsonSerializable;",
        "Lcom/rollbar/api/truncation/StringTruncatable<",
        "Lcom/rollbar/api/payload/data/Data;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x45586394dec95cd5L


# instance fields
.field private final body:Lcom/rollbar/api/payload/data/body/Body;

.field private final client:Lcom/rollbar/api/payload/data/Client;

.field private final codeVersion:Ljava/lang/String;

.field private final context:Ljava/lang/String;

.field private final custom:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final environment:Ljava/lang/String;

.field private final fingerprint:Ljava/lang/String;

.field private final framework:Ljava/lang/String;

.field private final isUncaught:Z

.field private final language:Ljava/lang/String;

.field private final level:Lcom/rollbar/api/payload/data/Level;

.field private final notifier:Lcom/rollbar/api/payload/data/Notifier;

.field private final person:Lcom/rollbar/api/payload/data/Person;

.field private final platform:Ljava/lang/String;

.field private final request:Lcom/rollbar/api/payload/data/Request;

.field private final server:Lcom/rollbar/api/payload/data/Server;

.field private final timestamp:Ljava/lang/Long;

.field private final title:Ljava/lang/String;

.field private final uuid:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/rollbar/api/payload/data/Data$Builder;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$000(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data;->environment:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$100(Lcom/rollbar/api/payload/data/Data$Builder;)Lcom/rollbar/api/payload/data/body/Body;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data;->body:Lcom/rollbar/api/payload/data/body/Body;

    .line 5
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$200(Lcom/rollbar/api/payload/data/Data$Builder;)Lcom/rollbar/api/payload/data/Level;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data;->level:Lcom/rollbar/api/payload/data/Level;

    .line 6
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$300(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data;->timestamp:Ljava/lang/Long;

    .line 7
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$400(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data;->codeVersion:Ljava/lang/String;

    .line 8
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$500(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data;->platform:Ljava/lang/String;

    .line 9
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$600(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data;->language:Ljava/lang/String;

    .line 10
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$700(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data;->framework:Ljava/lang/String;

    .line 11
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$800(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data;->context:Ljava/lang/String;

    .line 12
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$900(Lcom/rollbar/api/payload/data/Data$Builder;)Lcom/rollbar/api/payload/data/Request;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data;->request:Lcom/rollbar/api/payload/data/Request;

    .line 13
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$1000(Lcom/rollbar/api/payload/data/Data$Builder;)Lcom/rollbar/api/payload/data/Person;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data;->person:Lcom/rollbar/api/payload/data/Person;

    .line 14
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$1100(Lcom/rollbar/api/payload/data/Data$Builder;)Lcom/rollbar/api/payload/data/Server;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data;->server:Lcom/rollbar/api/payload/data/Server;

    .line 15
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$1200(Lcom/rollbar/api/payload/data/Data$Builder;)Lcom/rollbar/api/payload/data/Client;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data;->client:Lcom/rollbar/api/payload/data/Client;

    .line 16
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$1300(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$1300(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data;->custom:Ljava/util/Map;

    .line 17
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$1400(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data;->fingerprint:Ljava/lang/String;

    .line 18
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$1500(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data;->title:Ljava/lang/String;

    .line 19
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$1600(Lcom/rollbar/api/payload/data/Data$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/Data;->uuid:Ljava/lang/String;

    .line 20
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$1700(Lcom/rollbar/api/payload/data/Data$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/rollbar/api/payload/data/Data;->isUncaught:Z

    .line 21
    invoke-static {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->access$1800(Lcom/rollbar/api/payload/data/Data$Builder;)Lcom/rollbar/api/payload/data/Notifier;

    move-result-object p1

    iput-object p1, p0, Lcom/rollbar/api/payload/data/Data;->notifier:Lcom/rollbar/api/payload/data/Notifier;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/rollbar/api/payload/data/Data$Builder;Lcom/rollbar/api/payload/data/Data$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/rollbar/api/payload/data/Data;-><init>(Lcom/rollbar/api/payload/data/Data$Builder;)V

    return-void
.end method

.method public static synthetic access$1900(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->environment:Ljava/lang/String;

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

.method public static synthetic access$2000(Lcom/rollbar/api/payload/data/Data;)Lcom/rollbar/api/payload/data/body/Body;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->body:Lcom/rollbar/api/payload/data/body/Body;

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

.method public static synthetic access$2100(Lcom/rollbar/api/payload/data/Data;)Lcom/rollbar/api/payload/data/Level;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->level:Lcom/rollbar/api/payload/data/Level;

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

.method public static synthetic access$2200(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/Long;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->timestamp:Ljava/lang/Long;

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

.method public static synthetic access$2300(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->codeVersion:Ljava/lang/String;

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

.method public static synthetic access$2400(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->platform:Ljava/lang/String;

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

.method public static synthetic access$2500(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->language:Ljava/lang/String;

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

.method public static synthetic access$2600(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->framework:Ljava/lang/String;

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

.method public static synthetic access$2700(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->context:Ljava/lang/String;

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

.method public static synthetic access$2800(Lcom/rollbar/api/payload/data/Data;)Lcom/rollbar/api/payload/data/Request;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->request:Lcom/rollbar/api/payload/data/Request;

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

.method public static synthetic access$2900(Lcom/rollbar/api/payload/data/Data;)Lcom/rollbar/api/payload/data/Person;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->person:Lcom/rollbar/api/payload/data/Person;

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

.method public static synthetic access$3000(Lcom/rollbar/api/payload/data/Data;)Lcom/rollbar/api/payload/data/Server;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->server:Lcom/rollbar/api/payload/data/Server;

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

.method public static synthetic access$3100(Lcom/rollbar/api/payload/data/Data;)Lcom/rollbar/api/payload/data/Client;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->client:Lcom/rollbar/api/payload/data/Client;

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

.method public static synthetic access$3200(Lcom/rollbar/api/payload/data/Data;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->custom:Ljava/util/Map;

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

.method public static synthetic access$3300(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->fingerprint:Ljava/lang/String;

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

.method public static synthetic access$3400(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->title:Ljava/lang/String;

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

.method public static synthetic access$3500(Lcom/rollbar/api/payload/data/Data;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->uuid:Ljava/lang/String;

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

.method public static synthetic access$3600(Lcom/rollbar/api/payload/data/Data;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/rollbar/api/payload/data/Data;->isUncaught:Z

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

.method public static synthetic access$3700(Lcom/rollbar/api/payload/data/Data;)Lcom/rollbar/api/payload/data/Notifier;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/Data;->notifier:Lcom/rollbar/api/payload/data/Notifier;

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
.method public bridge synthetic asJson()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/rollbar/api/payload/data/Data;->asJson()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public asJson()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->environment:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 4
    const-string v2, "environment"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->body:Lcom/rollbar/api/payload/data/body/Body;

    if-eqz v1, :cond_1

    .line 6
    const-string v2, "body"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    :cond_1
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->level:Lcom/rollbar/api/payload/data/Level;

    if-eqz v1, :cond_2

    .line 8
    const-string v2, "level"

    invoke-virtual {v1}, Lcom/rollbar/api/payload/data/Level;->asJson()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    :cond_2
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->timestamp:Ljava/lang/Long;

    if-eqz v1, :cond_3

    .line 10
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    long-to-double v1, v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    .line 11
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "timestamp"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    :cond_3
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->codeVersion:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 13
    const-string v2, "code_version"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    :cond_4
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->platform:Ljava/lang/String;

    if-eqz v1, :cond_5

    .line 15
    const-string v2, "platform"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    :cond_5
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->language:Ljava/lang/String;

    if-eqz v1, :cond_6

    .line 17
    const-string v2, "language"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    :cond_6
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->framework:Ljava/lang/String;

    if-eqz v1, :cond_7

    .line 19
    const-string v2, "framework"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    :cond_7
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->context:Ljava/lang/String;

    if-eqz v1, :cond_8

    .line 21
    const-string v2, "context"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    :cond_8
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->request:Lcom/rollbar/api/payload/data/Request;

    if-eqz v1, :cond_9

    .line 23
    const-string v2, "request"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    :cond_9
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->person:Lcom/rollbar/api/payload/data/Person;

    if-eqz v1, :cond_a

    .line 25
    const-string v2, "person"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    :cond_a
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->server:Lcom/rollbar/api/payload/data/Server;

    if-eqz v1, :cond_b

    .line 27
    const-string v2, "server"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    :cond_b
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->client:Lcom/rollbar/api/payload/data/Client;

    if-eqz v1, :cond_c

    .line 29
    const-string v2, "client"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    :cond_c
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->custom:Ljava/util/Map;

    if-eqz v1, :cond_d

    .line 31
    const-string v2, "custom"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    :cond_d
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->fingerprint:Ljava/lang/String;

    if-eqz v1, :cond_e

    .line 33
    const-string v2, "fingerprint"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    :cond_e
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->title:Ljava/lang/String;

    if-eqz v1, :cond_f

    .line 35
    const-string v2, "title"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    :cond_f
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->uuid:Ljava/lang/String;

    if-eqz v1, :cond_10

    .line 37
    const-string v2, "uuid"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    :cond_10
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->notifier:Lcom/rollbar/api/payload/data/Notifier;

    if-eqz v1, :cond_11

    .line 39
    const-string v2, "notifier"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_11
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_25

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    goto/16 :goto_10

    .line 19
    .line 20
    :cond_1
    check-cast p1, Lcom/rollbar/api/payload/data/Data;

    .line 21
    .line 22
    iget-boolean v2, p0, Lcom/rollbar/api/payload/data/Data;->isUncaught:Z

    .line 23
    .line 24
    iget-boolean v3, p1, Lcom/rollbar/api/payload/data/Data;->isUncaught:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_2

    .line 27
    .line 28
    return v1

    .line 29
    :cond_2
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->environment:Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    iget-object v3, p1, Lcom/rollbar/api/payload/data/Data;->environment:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    iget-object v2, p1, Lcom/rollbar/api/payload/data/Data;->environment:Ljava/lang/String;

    .line 43
    .line 44
    if-eqz v2, :cond_4

    .line 45
    .line 46
    :goto_0
    return v1

    .line 47
    :cond_4
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->body:Lcom/rollbar/api/payload/data/body/Body;

    .line 48
    .line 49
    if-eqz v2, :cond_5

    .line 50
    .line 51
    iget-object v3, p1, Lcom/rollbar/api/payload/data/Data;->body:Lcom/rollbar/api/payload/data/body/Body;

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Lcom/rollbar/api/payload/data/body/Body;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_6

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_5
    iget-object v2, p1, Lcom/rollbar/api/payload/data/Data;->body:Lcom/rollbar/api/payload/data/body/Body;

    .line 61
    .line 62
    if-eqz v2, :cond_6

    .line 63
    .line 64
    :goto_1
    return v1

    .line 65
    :cond_6
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->level:Lcom/rollbar/api/payload/data/Level;

    .line 66
    .line 67
    iget-object v3, p1, Lcom/rollbar/api/payload/data/Data;->level:Lcom/rollbar/api/payload/data/Level;

    .line 68
    .line 69
    if-eq v2, v3, :cond_7

    .line 70
    .line 71
    return v1

    .line 72
    :cond_7
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->timestamp:Ljava/lang/Long;

    .line 73
    .line 74
    if-eqz v2, :cond_8

    .line 75
    .line 76
    iget-object v3, p1, Lcom/rollbar/api/payload/data/Data;->timestamp:Ljava/lang/Long;

    .line 77
    .line 78
    invoke-virtual {v2, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_9

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_8
    iget-object v2, p1, Lcom/rollbar/api/payload/data/Data;->timestamp:Ljava/lang/Long;

    .line 86
    .line 87
    if-eqz v2, :cond_9

    .line 88
    .line 89
    :goto_2
    return v1

    .line 90
    :cond_9
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->codeVersion:Ljava/lang/String;

    .line 91
    .line 92
    if-eqz v2, :cond_a

    .line 93
    .line 94
    iget-object v3, p1, Lcom/rollbar/api/payload/data/Data;->codeVersion:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-nez v2, :cond_b

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_a
    iget-object v2, p1, Lcom/rollbar/api/payload/data/Data;->codeVersion:Ljava/lang/String;

    .line 104
    .line 105
    if-eqz v2, :cond_b

    .line 106
    .line 107
    :goto_3
    return v1

    .line 108
    :cond_b
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->platform:Ljava/lang/String;

    .line 109
    .line 110
    if-eqz v2, :cond_c

    .line 111
    .line 112
    iget-object v3, p1, Lcom/rollbar/api/payload/data/Data;->platform:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v2, :cond_d

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_c
    iget-object v2, p1, Lcom/rollbar/api/payload/data/Data;->platform:Ljava/lang/String;

    .line 122
    .line 123
    if-eqz v2, :cond_d

    .line 124
    .line 125
    :goto_4
    return v1

    .line 126
    :cond_d
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->language:Ljava/lang/String;

    .line 127
    .line 128
    if-eqz v2, :cond_e

    .line 129
    .line 130
    iget-object v3, p1, Lcom/rollbar/api/payload/data/Data;->language:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-nez v2, :cond_f

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_e
    iget-object v2, p1, Lcom/rollbar/api/payload/data/Data;->language:Ljava/lang/String;

    .line 140
    .line 141
    if-eqz v2, :cond_f

    .line 142
    .line 143
    :goto_5
    return v1

    .line 144
    :cond_f
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->framework:Ljava/lang/String;

    .line 145
    .line 146
    if-eqz v2, :cond_10

    .line 147
    .line 148
    iget-object v3, p1, Lcom/rollbar/api/payload/data/Data;->framework:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-nez v2, :cond_11

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_10
    iget-object v2, p1, Lcom/rollbar/api/payload/data/Data;->framework:Ljava/lang/String;

    .line 158
    .line 159
    if-eqz v2, :cond_11

    .line 160
    .line 161
    :goto_6
    return v1

    .line 162
    :cond_11
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->context:Ljava/lang/String;

    .line 163
    .line 164
    if-eqz v2, :cond_12

    .line 165
    .line 166
    iget-object v3, p1, Lcom/rollbar/api/payload/data/Data;->context:Ljava/lang/String;

    .line 167
    .line 168
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-nez v2, :cond_13

    .line 173
    .line 174
    goto :goto_7

    .line 175
    :cond_12
    iget-object v2, p1, Lcom/rollbar/api/payload/data/Data;->context:Ljava/lang/String;

    .line 176
    .line 177
    if-eqz v2, :cond_13

    .line 178
    .line 179
    :goto_7
    return v1

    .line 180
    :cond_13
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->request:Lcom/rollbar/api/payload/data/Request;

    .line 181
    .line 182
    if-eqz v2, :cond_14

    .line 183
    .line 184
    iget-object v3, p1, Lcom/rollbar/api/payload/data/Data;->request:Lcom/rollbar/api/payload/data/Request;

    .line 185
    .line 186
    invoke-virtual {v2, v3}, Lcom/rollbar/api/payload/data/Request;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-nez v2, :cond_15

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_14
    iget-object v2, p1, Lcom/rollbar/api/payload/data/Data;->request:Lcom/rollbar/api/payload/data/Request;

    .line 194
    .line 195
    if-eqz v2, :cond_15

    .line 196
    .line 197
    :goto_8
    return v1

    .line 198
    :cond_15
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->person:Lcom/rollbar/api/payload/data/Person;

    .line 199
    .line 200
    if-eqz v2, :cond_16

    .line 201
    .line 202
    iget-object v3, p1, Lcom/rollbar/api/payload/data/Data;->person:Lcom/rollbar/api/payload/data/Person;

    .line 203
    .line 204
    invoke-virtual {v2, v3}, Lcom/rollbar/api/payload/data/Person;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-nez v2, :cond_17

    .line 209
    .line 210
    goto :goto_9

    .line 211
    :cond_16
    iget-object v2, p1, Lcom/rollbar/api/payload/data/Data;->person:Lcom/rollbar/api/payload/data/Person;

    .line 212
    .line 213
    if-eqz v2, :cond_17

    .line 214
    .line 215
    :goto_9
    return v1

    .line 216
    :cond_17
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->server:Lcom/rollbar/api/payload/data/Server;

    .line 217
    .line 218
    if-eqz v2, :cond_18

    .line 219
    .line 220
    iget-object v3, p1, Lcom/rollbar/api/payload/data/Data;->server:Lcom/rollbar/api/payload/data/Server;

    .line 221
    .line 222
    invoke-virtual {v2, v3}, Lcom/rollbar/api/payload/data/Server;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-nez v2, :cond_19

    .line 227
    .line 228
    goto :goto_a

    .line 229
    :cond_18
    iget-object v2, p1, Lcom/rollbar/api/payload/data/Data;->server:Lcom/rollbar/api/payload/data/Server;

    .line 230
    .line 231
    if-eqz v2, :cond_19

    .line 232
    .line 233
    :goto_a
    return v1

    .line 234
    :cond_19
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->client:Lcom/rollbar/api/payload/data/Client;

    .line 235
    .line 236
    if-eqz v2, :cond_1a

    .line 237
    .line 238
    iget-object v3, p1, Lcom/rollbar/api/payload/data/Data;->client:Lcom/rollbar/api/payload/data/Client;

    .line 239
    .line 240
    invoke-virtual {v2, v3}, Lcom/rollbar/api/payload/data/Client;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-nez v2, :cond_1b

    .line 245
    .line 246
    goto :goto_b

    .line 247
    :cond_1a
    iget-object v2, p1, Lcom/rollbar/api/payload/data/Data;->client:Lcom/rollbar/api/payload/data/Client;

    .line 248
    .line 249
    if-eqz v2, :cond_1b

    .line 250
    .line 251
    :goto_b
    return v1

    .line 252
    :cond_1b
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->custom:Ljava/util/Map;

    .line 253
    .line 254
    if-eqz v2, :cond_1c

    .line 255
    .line 256
    iget-object v3, p1, Lcom/rollbar/api/payload/data/Data;->custom:Ljava/util/Map;

    .line 257
    .line 258
    invoke-interface {v2, v3}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    if-nez v2, :cond_1d

    .line 263
    .line 264
    goto :goto_c

    .line 265
    :cond_1c
    iget-object v2, p1, Lcom/rollbar/api/payload/data/Data;->custom:Ljava/util/Map;

    .line 266
    .line 267
    if-eqz v2, :cond_1d

    .line 268
    .line 269
    :goto_c
    return v1

    .line 270
    :cond_1d
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->fingerprint:Ljava/lang/String;

    .line 271
    .line 272
    if-eqz v2, :cond_1e

    .line 273
    .line 274
    iget-object v3, p1, Lcom/rollbar/api/payload/data/Data;->fingerprint:Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    if-nez v2, :cond_1f

    .line 281
    .line 282
    goto :goto_d

    .line 283
    :cond_1e
    iget-object v2, p1, Lcom/rollbar/api/payload/data/Data;->fingerprint:Ljava/lang/String;

    .line 284
    .line 285
    if-eqz v2, :cond_1f

    .line 286
    .line 287
    :goto_d
    return v1

    .line 288
    :cond_1f
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->title:Ljava/lang/String;

    .line 289
    .line 290
    if-eqz v2, :cond_20

    .line 291
    .line 292
    iget-object v3, p1, Lcom/rollbar/api/payload/data/Data;->title:Ljava/lang/String;

    .line 293
    .line 294
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    if-nez v2, :cond_21

    .line 299
    .line 300
    goto :goto_e

    .line 301
    :cond_20
    iget-object v2, p1, Lcom/rollbar/api/payload/data/Data;->title:Ljava/lang/String;

    .line 302
    .line 303
    if-eqz v2, :cond_21

    .line 304
    .line 305
    :goto_e
    return v1

    .line 306
    :cond_21
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->uuid:Ljava/lang/String;

    .line 307
    .line 308
    if-eqz v2, :cond_22

    .line 309
    .line 310
    iget-object v3, p1, Lcom/rollbar/api/payload/data/Data;->uuid:Ljava/lang/String;

    .line 311
    .line 312
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    if-nez v2, :cond_23

    .line 317
    .line 318
    goto :goto_f

    .line 319
    :cond_22
    iget-object v2, p1, Lcom/rollbar/api/payload/data/Data;->uuid:Ljava/lang/String;

    .line 320
    .line 321
    if-eqz v2, :cond_23

    .line 322
    .line 323
    :goto_f
    return v1

    .line 324
    :cond_23
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->notifier:Lcom/rollbar/api/payload/data/Notifier;

    .line 325
    .line 326
    iget-object p1, p1, Lcom/rollbar/api/payload/data/Data;->notifier:Lcom/rollbar/api/payload/data/Notifier;

    .line 327
    .line 328
    if-eqz v2, :cond_24

    .line 329
    .line 330
    invoke-virtual {v2, p1}, Lcom/rollbar/api/payload/data/Notifier;->equals(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result p1

    .line 334
    return p1

    .line 335
    :cond_24
    if-nez p1, :cond_25

    .line 336
    .line 337
    return v0

    .line 338
    :cond_25
    :goto_10
    return v1
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
.end method

.method public getBody()Lcom/rollbar/api/payload/data/body/Body;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->body:Lcom/rollbar/api/payload/data/body/Body;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public getClient()Lcom/rollbar/api/payload/data/Client;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->client:Lcom/rollbar/api/payload/data/Client;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public getCodeVersion()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->codeVersion:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public getContext()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->context:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public getCustom()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->custom:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public getEnvironment()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->environment:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public getFingerprint()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->fingerprint:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public getFramework()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->framework:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->language:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public getLevel()Lcom/rollbar/api/payload/data/Level;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->level:Lcom/rollbar/api/payload/data/Level;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public getNotifier()Lcom/rollbar/api/payload/data/Notifier;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->notifier:Lcom/rollbar/api/payload/data/Notifier;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public getPerson()Lcom/rollbar/api/payload/data/Person;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->person:Lcom/rollbar/api/payload/data/Person;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public getPlatform()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->platform:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public getRequest()Lcom/rollbar/api/payload/data/Request;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->request:Lcom/rollbar/api/payload/data/Request;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public getServer()Lcom/rollbar/api/payload/data/Server;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->server:Lcom/rollbar/api/payload/data/Server;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public getTimestamp()Ljava/lang/Long;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->timestamp:Ljava/lang/Long;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public getUuid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->uuid:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/Data;->environment:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->body:Lcom/rollbar/api/payload/data/body/Body;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/rollbar/api/payload/data/body/Body;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v2, v1

    .line 24
    :goto_1
    add-int/2addr v0, v2

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->level:Lcom/rollbar/api/payload/data/Level;

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move v2, v1

    .line 37
    :goto_2
    add-int/2addr v0, v2

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->timestamp:Ljava/lang/Long;

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    move v2, v1

    .line 50
    :goto_3
    add-int/2addr v0, v2

    .line 51
    mul-int/lit8 v0, v0, 0x1f

    .line 52
    .line 53
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->codeVersion:Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    goto :goto_4

    .line 62
    :cond_4
    move v2, v1

    .line 63
    :goto_4
    add-int/2addr v0, v2

    .line 64
    mul-int/lit8 v0, v0, 0x1f

    .line 65
    .line 66
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->platform:Ljava/lang/String;

    .line 67
    .line 68
    if-eqz v2, :cond_5

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    goto :goto_5

    .line 75
    :cond_5
    move v2, v1

    .line 76
    :goto_5
    add-int/2addr v0, v2

    .line 77
    mul-int/lit8 v0, v0, 0x1f

    .line 78
    .line 79
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->language:Ljava/lang/String;

    .line 80
    .line 81
    if-eqz v2, :cond_6

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    goto :goto_6

    .line 88
    :cond_6
    move v2, v1

    .line 89
    :goto_6
    add-int/2addr v0, v2

    .line 90
    mul-int/lit8 v0, v0, 0x1f

    .line 91
    .line 92
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->framework:Ljava/lang/String;

    .line 93
    .line 94
    if-eqz v2, :cond_7

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    goto :goto_7

    .line 101
    :cond_7
    move v2, v1

    .line 102
    :goto_7
    add-int/2addr v0, v2

    .line 103
    mul-int/lit8 v0, v0, 0x1f

    .line 104
    .line 105
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->context:Ljava/lang/String;

    .line 106
    .line 107
    if-eqz v2, :cond_8

    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    goto :goto_8

    .line 114
    :cond_8
    move v2, v1

    .line 115
    :goto_8
    add-int/2addr v0, v2

    .line 116
    mul-int/lit8 v0, v0, 0x1f

    .line 117
    .line 118
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->request:Lcom/rollbar/api/payload/data/Request;

    .line 119
    .line 120
    if-eqz v2, :cond_9

    .line 121
    .line 122
    invoke-virtual {v2}, Lcom/rollbar/api/payload/data/Request;->hashCode()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    goto :goto_9

    .line 127
    :cond_9
    move v2, v1

    .line 128
    :goto_9
    add-int/2addr v0, v2

    .line 129
    mul-int/lit8 v0, v0, 0x1f

    .line 130
    .line 131
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->person:Lcom/rollbar/api/payload/data/Person;

    .line 132
    .line 133
    if-eqz v2, :cond_a

    .line 134
    .line 135
    invoke-virtual {v2}, Lcom/rollbar/api/payload/data/Person;->hashCode()I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    goto :goto_a

    .line 140
    :cond_a
    move v2, v1

    .line 141
    :goto_a
    add-int/2addr v0, v2

    .line 142
    mul-int/lit8 v0, v0, 0x1f

    .line 143
    .line 144
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->server:Lcom/rollbar/api/payload/data/Server;

    .line 145
    .line 146
    if-eqz v2, :cond_b

    .line 147
    .line 148
    invoke-virtual {v2}, Lcom/rollbar/api/payload/data/Server;->hashCode()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    goto :goto_b

    .line 153
    :cond_b
    move v2, v1

    .line 154
    :goto_b
    add-int/2addr v0, v2

    .line 155
    mul-int/lit8 v0, v0, 0x1f

    .line 156
    .line 157
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->client:Lcom/rollbar/api/payload/data/Client;

    .line 158
    .line 159
    if-eqz v2, :cond_c

    .line 160
    .line 161
    invoke-virtual {v2}, Lcom/rollbar/api/payload/data/Client;->hashCode()I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    goto :goto_c

    .line 166
    :cond_c
    move v2, v1

    .line 167
    :goto_c
    add-int/2addr v0, v2

    .line 168
    mul-int/lit8 v0, v0, 0x1f

    .line 169
    .line 170
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->custom:Ljava/util/Map;

    .line 171
    .line 172
    if-eqz v2, :cond_d

    .line 173
    .line 174
    invoke-interface {v2}, Ljava/util/Map;->hashCode()I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    goto :goto_d

    .line 179
    :cond_d
    move v2, v1

    .line 180
    :goto_d
    add-int/2addr v0, v2

    .line 181
    mul-int/lit8 v0, v0, 0x1f

    .line 182
    .line 183
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->fingerprint:Ljava/lang/String;

    .line 184
    .line 185
    if-eqz v2, :cond_e

    .line 186
    .line 187
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    goto :goto_e

    .line 192
    :cond_e
    move v2, v1

    .line 193
    :goto_e
    add-int/2addr v0, v2

    .line 194
    mul-int/lit8 v0, v0, 0x1f

    .line 195
    .line 196
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->title:Ljava/lang/String;

    .line 197
    .line 198
    if-eqz v2, :cond_f

    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    goto :goto_f

    .line 205
    :cond_f
    move v2, v1

    .line 206
    :goto_f
    add-int/2addr v0, v2

    .line 207
    mul-int/lit8 v0, v0, 0x1f

    .line 208
    .line 209
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->uuid:Ljava/lang/String;

    .line 210
    .line 211
    if-eqz v2, :cond_10

    .line 212
    .line 213
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    goto :goto_10

    .line 218
    :cond_10
    move v2, v1

    .line 219
    :goto_10
    add-int/2addr v0, v2

    .line 220
    mul-int/lit8 v0, v0, 0x1f

    .line 221
    .line 222
    iget-boolean v2, p0, Lcom/rollbar/api/payload/data/Data;->isUncaught:Z

    .line 223
    .line 224
    add-int/2addr v0, v2

    .line 225
    mul-int/lit8 v0, v0, 0x1f

    .line 226
    .line 227
    iget-object v2, p0, Lcom/rollbar/api/payload/data/Data;->notifier:Lcom/rollbar/api/payload/data/Notifier;

    .line 228
    .line 229
    if-eqz v2, :cond_11

    .line 230
    .line 231
    invoke-virtual {v2}, Lcom/rollbar/api/payload/data/Notifier;->hashCode()I

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    :cond_11
    add-int/2addr v0, v1

    .line 236
    return v0
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
.end method

.method public isUncaught()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/rollbar/api/payload/data/Data;->isUncaught:Z

    .line 2
    .line 3
    return v0
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
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Data{environment=\'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->environment:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\', body="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->body:Lcom/rollbar/api/payload/data/body/Body;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", level="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->level:Lcom/rollbar/api/payload/data/Level;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", timestamp="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->timestamp:Ljava/lang/Long;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", codeVersion=\'"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->codeVersion:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, "\', platform=\'"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->platform:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, "\', language=\'"

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->language:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, "\', framework=\'"

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->framework:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, "\', context=\'"

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->context:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, "\', request="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->request:Lcom/rollbar/api/payload/data/Request;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", person="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->person:Lcom/rollbar/api/payload/data/Person;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, ", server="

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->server:Lcom/rollbar/api/payload/data/Server;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v1, ", client="

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->client:Lcom/rollbar/api/payload/data/Client;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, ", custom="

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->custom:Ljava/util/Map;

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, ", fingerprint=\'"

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->fingerprint:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v1, "\', title=\'"

    .line 154
    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->title:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v1, "\', uuid=\'"

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->uuid:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v1, "\', isUncaught=\'"

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    iget-boolean v1, p0, Lcom/rollbar/api/payload/data/Data;->isUncaught:Z

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v1, "\', notifier="

    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->notifier:Lcom/rollbar/api/payload/data/Notifier;

    .line 189
    .line 190
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const/16 v1, 0x7d

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    return-object v0
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
.end method

.method public truncateStrings(I)Lcom/rollbar/api/payload/data/Data;
    .locals 2

    .line 2
    new-instance v0, Lcom/rollbar/api/payload/data/Data$Builder;

    invoke-direct {v0, p0}, Lcom/rollbar/api/payload/data/Data$Builder;-><init>(Lcom/rollbar/api/payload/data/Data;)V

    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->environment:Ljava/lang/String;

    .line 3
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/Data$Builder;->environment(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->body:Lcom/rollbar/api/payload/data/body/Body;

    .line 4
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateStringsInObject(Lcom/rollbar/api/truncation/StringTruncatable;I)Lcom/rollbar/api/truncation/StringTruncatable;

    move-result-object v1

    check-cast v1, Lcom/rollbar/api/payload/data/body/Body;

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/Data$Builder;->body(Lcom/rollbar/api/payload/data/body/Body;)Lcom/rollbar/api/payload/data/Data$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->codeVersion:Ljava/lang/String;

    .line 5
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/Data$Builder;->codeVersion(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->platform:Ljava/lang/String;

    .line 6
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/Data$Builder;->platform(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->language:Ljava/lang/String;

    .line 7
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/Data$Builder;->language(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->framework:Ljava/lang/String;

    .line 8
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/Data$Builder;->framework(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->context:Ljava/lang/String;

    .line 9
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/Data$Builder;->context(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->request:Lcom/rollbar/api/payload/data/Request;

    .line 10
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateStringsInObject(Lcom/rollbar/api/truncation/StringTruncatable;I)Lcom/rollbar/api/truncation/StringTruncatable;

    move-result-object v1

    check-cast v1, Lcom/rollbar/api/payload/data/Request;

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/Data$Builder;->request(Lcom/rollbar/api/payload/data/Request;)Lcom/rollbar/api/payload/data/Data$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->person:Lcom/rollbar/api/payload/data/Person;

    .line 11
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateStringsInObject(Lcom/rollbar/api/truncation/StringTruncatable;I)Lcom/rollbar/api/truncation/StringTruncatable;

    move-result-object v1

    check-cast v1, Lcom/rollbar/api/payload/data/Person;

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/Data$Builder;->person(Lcom/rollbar/api/payload/data/Person;)Lcom/rollbar/api/payload/data/Data$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->server:Lcom/rollbar/api/payload/data/Server;

    .line 12
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateStringsInObject(Lcom/rollbar/api/truncation/StringTruncatable;I)Lcom/rollbar/api/truncation/StringTruncatable;

    move-result-object v1

    check-cast v1, Lcom/rollbar/api/payload/data/Server;

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/Data$Builder;->server(Lcom/rollbar/api/payload/data/Server;)Lcom/rollbar/api/payload/data/Data$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->client:Lcom/rollbar/api/payload/data/Client;

    .line 13
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateStringsInObject(Lcom/rollbar/api/truncation/StringTruncatable;I)Lcom/rollbar/api/truncation/StringTruncatable;

    move-result-object v1

    check-cast v1, Lcom/rollbar/api/payload/data/Client;

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/Data$Builder;->client(Lcom/rollbar/api/payload/data/Client;)Lcom/rollbar/api/payload/data/Data$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->custom:Ljava/util/Map;

    .line 14
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateStringsInMap(Ljava/util/Map;I)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/Data$Builder;->custom(Ljava/util/Map;)Lcom/rollbar/api/payload/data/Data$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->fingerprint:Ljava/lang/String;

    .line 15
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/Data$Builder;->fingerprint(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->title:Ljava/lang/String;

    .line 16
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/Data$Builder;->title(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->uuid:Ljava/lang/String;

    .line 17
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/Data$Builder;->uuid(Ljava/lang/String;)Lcom/rollbar/api/payload/data/Data$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/Data;->notifier:Lcom/rollbar/api/payload/data/Notifier;

    .line 18
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateStringsInObject(Lcom/rollbar/api/truncation/StringTruncatable;I)Lcom/rollbar/api/truncation/StringTruncatable;

    move-result-object p1

    check-cast p1, Lcom/rollbar/api/payload/data/Notifier;

    invoke-virtual {v0, p1}, Lcom/rollbar/api/payload/data/Data$Builder;->notifier(Lcom/rollbar/api/payload/data/Notifier;)Lcom/rollbar/api/payload/data/Data$Builder;

    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lcom/rollbar/api/payload/data/Data$Builder;->build()Lcom/rollbar/api/payload/data/Data;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic truncateStrings(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/rollbar/api/payload/data/Data;->truncateStrings(I)Lcom/rollbar/api/payload/data/Data;

    move-result-object p1

    return-object p1
.end method
