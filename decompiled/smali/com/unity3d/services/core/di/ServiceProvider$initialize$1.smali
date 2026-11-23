.class final Lcom/unity3d/services/core/di/ServiceProvider$initialize$1;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/services/core/di/ServiceProvider;->initialize()Lcom/unity3d/services/core/di/IServicesRegistry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv8/k;",
        "Lu8/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lcom/unity3d/services/core/di/ServicesRegistry;",
        "Lh8/m;",
        "invoke",
        "(Lcom/unity3d/services/core/di/ServicesRegistry;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/unity3d/services/core/di/ServiceProvider$initialize$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1;

    invoke-direct {v0}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1;-><init>()V

    sput-object v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1;->INSTANCE:Lcom/unity3d/services/core/di/ServiceProvider$initialize$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/unity3d/services/core/di/ServicesRegistry;

    invoke-virtual {p0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1;->invoke(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    sget-object p1, Lh8/m;->a:Lh8/m;

    return-object p1
.end method

.method public final invoke(Lcom/unity3d/services/core/di/ServicesRegistry;)V
    .locals 6

    const-string v0, "$this$registry"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$1;->INSTANCE:Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$1;

    .line 3
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 4
    sget-object v2, Lv8/u;->a:Lv8/v;

    const-class v3, Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 5
    const-string v4, ""

    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 6
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 7
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 8
    sget-object v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$2;->INSTANCE:Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$2;

    .line 9
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 10
    const-class v3, Lcom/unity3d/services/core/domain/ISDKDispatchers;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 11
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 12
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 13
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 14
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$3;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$3;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 15
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 16
    const-class v3, LN9/w;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 17
    const-string v5, "sdk"

    invoke-direct {v1, v5, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 18
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 19
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 20
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$4;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$4;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 21
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 22
    const-class v3, LN9/y;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 23
    invoke-direct {v1, v5, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 24
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 25
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 26
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$5;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$5;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 27
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 28
    const-class v3, Lcom/unity3d/services/core/network/core/HttpClient;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 29
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 30
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 31
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 32
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$6;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$6;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 33
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 34
    const-class v3, Lcom/unity3d/services/core/domain/task/InitializeStateNetworkError;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 35
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 36
    invoke-static {v0}, Lcom/unity3d/services/core/di/ServiceFactoryKt;->factoryOf(Lu8/a;)Lh8/d;

    move-result-object v0

    .line 37
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 38
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$7;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$7;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 39
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 40
    const-class v3, Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 41
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 42
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 43
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 44
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$8;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$8;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 45
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 46
    const-class v3, Lcom/unity3d/services/core/domain/task/InitializeStateReset;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 47
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 48
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 49
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 50
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$9;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$9;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 51
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 52
    const-class v3, Lcom/unity3d/services/core/domain/task/InitializeStateError;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 53
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 54
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 55
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 56
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$10;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$10;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 57
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 58
    const-class v3, Lcom/unity3d/services/core/domain/task/InitializeStateConfigWithLoader;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 59
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 60
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 61
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 62
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$11;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$11;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 63
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 64
    const-class v3, Lcom/unity3d/services/core/domain/task/InitializeStateConfig;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 65
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 66
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 67
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 68
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$12;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$12;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 69
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 70
    const-class v3, Lcom/unity3d/services/core/domain/task/InitializeStateCreate;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 71
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 72
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 73
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 74
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$13;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$13;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 75
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 76
    const-class v3, Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 77
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 78
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 79
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 80
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$14;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$14;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 81
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 82
    const-class v3, Lcom/unity3d/services/core/domain/task/InitializeStateCreateWithRemote;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 83
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 84
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 85
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 86
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$15;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$15;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 87
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 88
    const-class v3, Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 89
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 90
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 91
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 92
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$16;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$16;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 93
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 94
    const-class v3, Lcom/unity3d/services/core/domain/task/InitializeStateComplete;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 95
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 96
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 97
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 98
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$17;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$17;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 99
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 100
    const-class v3, Lcom/unity3d/services/core/domain/task/InitializeSDK;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 101
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 102
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 103
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 104
    sget-object v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$18;->INSTANCE:Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$18;

    .line 105
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 106
    const-class v3, Lcom/unity3d/services/ads/token/TokenStorage;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 107
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 108
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 109
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 110
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$19;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$19;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 111
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 112
    const-class v3, Lcom/unity3d/services/ads/token/AsyncTokenStorage;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 113
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 114
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 115
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 116
    sget-object v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$20;->INSTANCE:Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$20;

    .line 117
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 118
    const-class v3, Lcom/unity3d/services/core/device/VolumeChange;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 119
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 120
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 121
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 122
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$21;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$21;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 123
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 124
    const-class v3, Lcom/unity3d/services/core/device/VolumeChangeMonitor;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 125
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 126
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 127
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 128
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$22;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$22;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 129
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 130
    const-class v3, Lcom/unity3d/services/ads/measurements/MeasurementsService;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v3

    .line 131
    invoke-direct {v1, v4, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 132
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 133
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    .line 134
    new-instance v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$23;

    invoke-direct {v0, p1}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$23;-><init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V

    .line 135
    new-instance v1, Lcom/unity3d/services/core/di/ServiceKey;

    .line 136
    const-class v3, Lcom/unity3d/services/ads/topics/TopicsService;

    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v2

    .line 137
    invoke-direct {v1, v4, v2}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;LC8/c;)V

    .line 138
    invoke-static {v0}, LD3/b;->s(Lu8/a;)Lh8/j;

    move-result-object v0

    .line 139
    invoke-virtual {p1, v1, v0}, Lcom/unity3d/services/core/di/ServicesRegistry;->updateService(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V

    return-void
.end method
