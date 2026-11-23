.class public final Lcom/onesignal/core/internal/config/a$f;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/onesignal/core/internal/config/a;->getFcmParams()Lcom/onesignal/core/internal/config/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/onesignal/core/internal/config/a;


# direct methods
.method public constructor <init>(Lcom/onesignal/core/internal/config/a;)V
    .locals 0

    iput-object p1, p0, Lcom/onesignal/core/internal/config/a$f;->this$0:Lcom/onesignal/core/internal/config/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lcom/onesignal/core/internal/config/c;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/onesignal/core/internal/config/a$f;->this$0:Lcom/onesignal/core/internal/config/a;

    .line 4
    .line 5
    const-string v2, "fcmParams"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lcom/onesignal/core/internal/config/c;-><init>(Lcom/onesignal/common/modeling/i;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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
