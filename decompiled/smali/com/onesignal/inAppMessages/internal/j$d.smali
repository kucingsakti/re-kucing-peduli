.class public final Lcom/onesignal/inAppMessages/internal/j$d;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/onesignal/inAppMessages/internal/j;->fetchMessages(LQ4/b;Lm8/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/onesignal/inAppMessages/internal/j;


# direct methods
.method public constructor <init>(Lcom/onesignal/inAppMessages/internal/j;)V
    .locals 0

    iput-object p1, p0, Lcom/onesignal/inAppMessages/internal/j$d;->this$0:Lcom/onesignal/inAppMessages/internal/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Long;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/onesignal/inAppMessages/internal/j$d;->this$0:Lcom/onesignal/inAppMessages/internal/j;

    invoke-static {v0}, Lcom/onesignal/inAppMessages/internal/j;->access$get_time$p(Lcom/onesignal/inAppMessages/internal/j;)Ll5/a;

    move-result-object v0

    invoke-interface {v0}, Ll5/a;->getCurrentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/onesignal/inAppMessages/internal/j$d;->this$0:Lcom/onesignal/inAppMessages/internal/j;

    invoke-static {v2}, Lcom/onesignal/inAppMessages/internal/j;->access$get_sessionService$p(Lcom/onesignal/inAppMessages/internal/j;)Ll6/b;

    move-result-object v2

    invoke-interface {v2}, Ll6/b;->getStartTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/onesignal/inAppMessages/internal/j$d;->invoke()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
