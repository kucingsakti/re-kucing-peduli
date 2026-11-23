.class public final Lcom/onesignal/inAppMessages/internal/j$p;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/onesignal/inAppMessages/internal/j;->onMessageWasDisplayed(Lcom/onesignal/inAppMessages/internal/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $message:Lcom/onesignal/inAppMessages/internal/a;


# direct methods
.method public constructor <init>(Lcom/onesignal/inAppMessages/internal/a;)V
    .locals 0

    iput-object p1, p0, Lcom/onesignal/inAppMessages/internal/j$p;->$message:Lcom/onesignal/inAppMessages/internal/a;

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
    invoke-virtual {p0, p1}, Lcom/onesignal/inAppMessages/internal/j$p;->invoke(Lp5/g;)V

    sget-object p1, Lh8/m;->a:Lh8/m;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public final invoke(Lp5/g;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/onesignal/inAppMessages/internal/e;

    iget-object v1, p0, Lcom/onesignal/inAppMessages/internal/j$p;->$message:Lcom/onesignal/inAppMessages/internal/a;

    invoke-direct {v0, v1}, Lcom/onesignal/inAppMessages/internal/e;-><init>(Lp5/a;)V

    invoke-interface {p1}, Lp5/g;->d()V

    return-void
.end method
