.class public final Lcom/onesignal/user/internal/f$b;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/onesignal/user/internal/f;->onModelUpdated(Lcom/onesignal/common/modeling/j;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/onesignal/user/internal/f;


# direct methods
.method public constructor <init>(Lcom/onesignal/user/internal/f;)V
    .locals 0

    iput-object p1, p0, Lcom/onesignal/user/internal/f$b;->this$0:Lcom/onesignal/user/internal/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 1
    invoke-virtual {p0, p1}, Lcom/onesignal/user/internal/f$b;->invoke(LP4/b;)V

    sget-object p1, Lh8/m;->a:Lh8/m;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public final invoke(LP4/b;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/onesignal/user/internal/f$b;->this$0:Lcom/onesignal/user/internal/f;

    invoke-virtual {v0}, Lcom/onesignal/user/internal/f;->getExternalId()Ljava/lang/String;

    move-result-object v0

    .line 3
    const-string v1, "externalId"

    invoke-static {v0, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-interface {p1}, LP4/b;->a()V

    return-void
.end method
