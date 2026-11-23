.class public final Lcom/onesignal/location/internal/permissions/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li5/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/onesignal/location/internal/permissions/b;->showFallbackAlertDialog()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $activity:Landroid/app/Activity;

.field final synthetic this$0:Lcom/onesignal/location/internal/permissions/b;


# direct methods
.method public constructor <init>(Lcom/onesignal/location/internal/permissions/b;Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/onesignal/location/internal/permissions/b$d;->this$0:Lcom/onesignal/location/internal/permissions/b;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/onesignal/location/internal/permissions/b$d;->$activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
.end method


# virtual methods
.method public onAccept()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/onesignal/location/internal/permissions/b$d;->this$0:Lcom/onesignal/location/internal/permissions/b;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/onesignal/location/internal/permissions/b;->access$get_applicationService$p(Lcom/onesignal/location/internal/permissions/b;)LX4/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/onesignal/location/internal/permissions/b$d$a;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/onesignal/location/internal/permissions/b$d;->this$0:Lcom/onesignal/location/internal/permissions/b;

    .line 10
    .line 11
    invoke-direct {v1, v2}, Lcom/onesignal/location/internal/permissions/b$d$a;-><init>(Lcom/onesignal/location/internal/permissions/b;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, LX4/f;->addApplicationLifecycleHandler(LX4/e;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lcom/onesignal/location/internal/permissions/c;->INSTANCE:Lcom/onesignal/location/internal/permissions/c;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/onesignal/location/internal/permissions/b$d;->$activity:Landroid/app/Activity;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/onesignal/location/internal/permissions/c;->show(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    return-void
    .line 25
    .line 26
.end method

.method public onDecline()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/onesignal/location/internal/permissions/b$d;->this$0:Lcom/onesignal/location/internal/permissions/b;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/onesignal/location/internal/permissions/b;->access$getWaiter$p(Lcom/onesignal/location/internal/permissions/b;)Lcom/onesignal/common/threading/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/onesignal/common/threading/c;->wake(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/onesignal/location/internal/permissions/b$d;->this$0:Lcom/onesignal/location/internal/permissions/b;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/onesignal/location/internal/permissions/b;->access$getEvents$p(Lcom/onesignal/location/internal/permissions/b;)Lcom/onesignal/common/events/b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Lcom/onesignal/location/internal/permissions/b$d$b;->INSTANCE:Lcom/onesignal/location/internal/permissions/b$d$b;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/onesignal/common/events/b;->fire(Lu8/b;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
.end method
