.class public final Lcom/onesignal/location/LocationModule$a;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/onesignal/location/LocationModule;->register(LU4/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# static fields
.field public static final INSTANCE:Lcom/onesignal/location/LocationModule$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/onesignal/location/LocationModule$a;

    invoke-direct {v0}, Lcom/onesignal/location/LocationModule$a;-><init>()V

    sput-object v0, Lcom/onesignal/location/LocationModule$a;->INSTANCE:Lcom/onesignal/location/LocationModule$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(LU4/b;)LG5/a;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    const-class v0, Lc5/c;

    invoke-interface {p1, v0}, LU4/b;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc5/c;

    .line 3
    invoke-interface {v0}, Lc5/c;->isAndroidDeviceType()Z

    move-result v1

    const-class v2, LX4/f;

    if-eqz v1, :cond_0

    sget-object v1, LF5/b;->INSTANCE:LF5/b;

    invoke-virtual {v1}, LF5/b;->hasGMSLocationLibrary()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    new-instance v0, Lcom/onesignal/location/internal/controller/impl/b;

    .line 5
    invoke-interface {p1, v2}, LU4/b;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LX4/f;

    .line 6
    const-class v2, Lcom/onesignal/location/internal/controller/impl/g;

    invoke-interface {p1, v2}, LU4/b;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/onesignal/location/internal/controller/impl/g;

    .line 7
    invoke-direct {v0, v1, p1}, Lcom/onesignal/location/internal/controller/impl/b;-><init>(LX4/f;Lcom/onesignal/location/internal/controller/impl/g;)V

    return-object v0

    .line 8
    :cond_0
    invoke-interface {v0}, Lc5/c;->isHuaweiDeviceType()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LF5/b;->INSTANCE:LF5/b;

    invoke-virtual {v0}, LF5/b;->hasHMSLocationLibrary()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9
    new-instance v0, Lcom/onesignal/location/internal/controller/impl/d;

    invoke-interface {p1, v2}, LU4/b;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LX4/f;

    invoke-direct {v0, p1}, Lcom/onesignal/location/internal/controller/impl/d;-><init>(LX4/f;)V

    return-object v0

    .line 10
    :cond_1
    new-instance p1, Lcom/onesignal/location/internal/controller/impl/h;

    invoke-direct {p1}, Lcom/onesignal/location/internal/controller/impl/h;-><init>()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LU4/b;

    invoke-virtual {p0, p1}, Lcom/onesignal/location/LocationModule$a;->invoke(LU4/b;)LG5/a;

    move-result-object p1

    return-object p1
.end method
