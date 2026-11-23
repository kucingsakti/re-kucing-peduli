.class public final Lcom/rollbar/notifier/sender/SyncSender$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rollbar/notifier/sender/SyncSender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private accessToken:Ljava/lang/String;

.field private jsonSerializer:Lcom/rollbar/notifier/sender/json/JsonSerializer;

.field private proxy:Ljava/net/Proxy;

.field private url:Ljava/net/URL;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "https://api.rollbar.com/api/1/item/"

    invoke-direct {p0, v0}, Lcom/rollbar/notifier/sender/SyncSender$Builder;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/rollbar/notifier/sender/SyncSender$Builder;->parseUrl(Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    iput-object p1, p0, Lcom/rollbar/notifier/sender/SyncSender$Builder;->url:Ljava/net/URL;

    .line 4
    new-instance p1, Lcom/rollbar/notifier/sender/json/JsonSerializerImpl;

    invoke-direct {p1}, Lcom/rollbar/notifier/sender/json/JsonSerializerImpl;-><init>()V

    iput-object p1, p0, Lcom/rollbar/notifier/sender/SyncSender$Builder;->jsonSerializer:Lcom/rollbar/notifier/sender/json/JsonSerializer;

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lcom/rollbar/notifier/sender/SyncSender$Builder;->proxy:Ljava/net/Proxy;

    return-void
.end method

.method public static synthetic access$000(Lcom/rollbar/notifier/sender/SyncSender$Builder;)Ljava/net/URL;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/notifier/sender/SyncSender$Builder;->url:Ljava/net/URL;

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

.method public static synthetic access$100(Lcom/rollbar/notifier/sender/SyncSender$Builder;)Lcom/rollbar/notifier/sender/json/JsonSerializer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/notifier/sender/SyncSender$Builder;->jsonSerializer:Lcom/rollbar/notifier/sender/json/JsonSerializer;

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

.method public static synthetic access$200(Lcom/rollbar/notifier/sender/SyncSender$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/notifier/sender/SyncSender$Builder;->accessToken:Ljava/lang/String;

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

.method public static synthetic access$300(Lcom/rollbar/notifier/sender/SyncSender$Builder;)Ljava/net/Proxy;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/notifier/sender/SyncSender$Builder;->proxy:Ljava/net/Proxy;

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

.method private static parseUrl(Ljava/lang/String;)Ljava/net/URL;
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-object v0

    .line 7
    :catch_0
    move-exception v0

    .line 8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string v2, "The url provided is not valid: "

    .line 11
    .line 12
    invoke-static {v2, p0}, LE0/a;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-direct {v1, p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    throw v1
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
.method public accessToken(Ljava/lang/String;)Lcom/rollbar/notifier/sender/SyncSender$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/notifier/sender/SyncSender$Builder;->accessToken:Ljava/lang/String;

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

.method public build()Lcom/rollbar/notifier/sender/SyncSender;
    .locals 1

    .line 1
    new-instance v0, Lcom/rollbar/notifier/sender/SyncSender;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/rollbar/notifier/sender/SyncSender;-><init>(Lcom/rollbar/notifier/sender/SyncSender$Builder;)V

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

.method public jsonSerializer(Lcom/rollbar/notifier/sender/json/JsonSerializer;)Lcom/rollbar/notifier/sender/SyncSender$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/notifier/sender/SyncSender$Builder;->jsonSerializer:Lcom/rollbar/notifier/sender/json/JsonSerializer;

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

.method public proxy(Ljava/net/Proxy;)Lcom/rollbar/notifier/sender/SyncSender$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/rollbar/notifier/sender/SyncSender$Builder;->proxy:Ljava/net/Proxy;

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

.method public url(Ljava/lang/String;)Lcom/rollbar/notifier/sender/SyncSender$Builder;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/rollbar/notifier/sender/SyncSender$Builder;->parseUrl(Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    iput-object p1, p0, Lcom/rollbar/notifier/sender/SyncSender$Builder;->url:Ljava/net/URL;

    return-object p0
.end method

.method public url(Ljava/net/URL;)Lcom/rollbar/notifier/sender/SyncSender$Builder;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/rollbar/notifier/sender/SyncSender$Builder;->url:Ljava/net/URL;

    return-object p0
.end method
