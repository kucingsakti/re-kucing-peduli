.class public final Lcom/onesignal/notifications/NotificationsModule$b;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/onesignal/notifications/NotificationsModule;->register(LU4/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# static fields
.field public static final INSTANCE:Lcom/onesignal/notifications/NotificationsModule$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/onesignal/notifications/NotificationsModule$b;

    invoke-direct {v0}, Lcom/onesignal/notifications/NotificationsModule$b;-><init>()V

    sput-object v0, Lcom/onesignal/notifications/NotificationsModule$b;->INSTANCE:Lcom/onesignal/notifications/NotificationsModule$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(LU4/b;)Ljava/lang/Object;
    .locals 5

    const-string v0, "it"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    const-class v0, Lc5/c;

    invoke-interface {p1, v0}, LU4/b;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc5/c;

    .line 3
    invoke-interface {v0}, Lc5/c;->isFireOSDeviceType()Z

    move-result v1

    const-class v2, LX4/f;

    if-eqz v1, :cond_0

    .line 4
    new-instance v0, Lcom/onesignal/notifications/internal/registration/impl/c;

    invoke-interface {p1, v2}, LU4/b;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LX4/f;

    invoke-direct {v0, p1}, Lcom/onesignal/notifications/internal/registration/impl/c;-><init>(LX4/f;)V

    return-object v0

    .line 5
    :cond_0
    invoke-interface {v0}, Lc5/c;->isAndroidDeviceType()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 6
    invoke-interface {v0}, Lc5/c;->getHasFCMLibrary()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    new-instance v1, Lcom/onesignal/notifications/internal/registration/impl/e;

    .line 8
    const-class v3, Lcom/onesignal/core/internal/config/b;

    invoke-interface {p1, v3}, LU4/b;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/onesignal/core/internal/config/b;

    .line 9
    invoke-interface {p1, v2}, LU4/b;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LX4/f;

    .line 10
    const-class v4, Lcom/onesignal/notifications/internal/registration/impl/a;

    invoke-interface {p1, v4}, LU4/b;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/onesignal/notifications/internal/registration/impl/a;

    .line 11
    invoke-direct {v1, v3, v2, p1, v0}, Lcom/onesignal/notifications/internal/registration/impl/e;-><init>(Lcom/onesignal/core/internal/config/b;LX4/f;Lcom/onesignal/notifications/internal/registration/impl/a;Lc5/c;)V

    return-object v1

    .line 12
    :cond_1
    new-instance p1, Lcom/onesignal/notifications/internal/registration/impl/g;

    invoke-direct {p1}, Lcom/onesignal/notifications/internal/registration/impl/g;-><init>()V

    return-object p1

    .line 13
    :cond_2
    new-instance v1, Lcom/onesignal/notifications/internal/registration/impl/f;

    invoke-interface {p1, v2}, LU4/b;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LX4/f;

    invoke-direct {v1, v0, p1}, Lcom/onesignal/notifications/internal/registration/impl/f;-><init>(Lc5/c;LX4/f;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LU4/b;

    invoke-virtual {p0, p1}, Lcom/onesignal/notifications/NotificationsModule$b;->invoke(LU4/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
