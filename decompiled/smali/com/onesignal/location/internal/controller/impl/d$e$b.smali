.class public final Lcom/onesignal/location/internal/controller/impl/d$e$b;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/onesignal/location/internal/controller/impl/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/onesignal/location/internal/controller/impl/d;


# direct methods
.method public constructor <init>(Lcom/onesignal/location/internal/controller/impl/d;)V
    .locals 0

    iput-object p1, p0, Lcom/onesignal/location/internal/controller/impl/d$e$b;->this$0:Lcom/onesignal/location/internal/controller/impl/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LG5/b;

    invoke-virtual {p0, p1}, Lcom/onesignal/location/internal/controller/impl/d$e$b;->invoke(LG5/b;)V

    sget-object p1, Lh8/m;->a:Lh8/m;

    return-object p1
.end method

.method public final invoke(LG5/b;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/onesignal/location/internal/controller/impl/d$e$b;->this$0:Lcom/onesignal/location/internal/controller/impl/d;

    invoke-static {v0}, Lcom/onesignal/location/internal/controller/impl/d;->access$getLastLocation$p(Lcom/onesignal/location/internal/controller/impl/d;)Landroid/location/Location;

    move-result-object v0

    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, LG5/b;->onLocationChanged(Landroid/location/Location;)V

    return-void
.end method
