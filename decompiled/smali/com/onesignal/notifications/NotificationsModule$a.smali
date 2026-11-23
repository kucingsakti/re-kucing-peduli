.class public final Lcom/onesignal/notifications/NotificationsModule$a;
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
.field public static final INSTANCE:Lcom/onesignal/notifications/NotificationsModule$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/onesignal/notifications/NotificationsModule$a;

    invoke-direct {v0}, Lcom/onesignal/notifications/NotificationsModule$a;-><init>()V

    sput-object v0, Lcom/onesignal/notifications/NotificationsModule$a;->INSTANCE:Lcom/onesignal/notifications/NotificationsModule$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(LU4/b;)LK5/a;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, LL5/a;->Companion:LL5/a$a;

    invoke-virtual {v0}, LL5/a$a;->canTrack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, LL5/a;

    .line 4
    const-class v1, LX4/f;

    invoke-interface {p1, v1}, LU4/b;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LX4/f;

    .line 5
    const-class v2, Lcom/onesignal/core/internal/config/b;

    invoke-interface {p1, v2}, LU4/b;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/onesignal/core/internal/config/b;

    .line 6
    const-class v3, Ll5/a;

    invoke-interface {p1, v3}, LU4/b;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll5/a;

    .line 7
    invoke-direct {v0, v1, v2, p1}, LL5/a;-><init>(LX4/f;Lcom/onesignal/core/internal/config/b;Ll5/a;)V

    return-object v0

    .line 8
    :cond_0
    new-instance p1, LL5/b;

    invoke-direct {p1}, LL5/b;-><init>()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LU4/b;

    invoke-virtual {p0, p1}, Lcom/onesignal/notifications/NotificationsModule$a;->invoke(LU4/b;)LK5/a;

    move-result-object p1

    return-object p1
.end method
