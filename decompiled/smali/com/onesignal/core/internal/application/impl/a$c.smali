.class public final Lcom/onesignal/core/internal/application/impl/a$c;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/onesignal/core/internal/application/impl/a;->handleFocus()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# static fields
.field public static final INSTANCE:Lcom/onesignal/core/internal/application/impl/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/onesignal/core/internal/application/impl/a$c;

    invoke-direct {v0}, Lcom/onesignal/core/internal/application/impl/a$c;-><init>()V

    sput-object v0, Lcom/onesignal/core/internal/application/impl/a$c;->INSTANCE:Lcom/onesignal/core/internal/application/impl/a$c;

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
    check-cast p1, LX4/e;

    invoke-virtual {p0, p1}, Lcom/onesignal/core/internal/application/impl/a$c;->invoke(LX4/e;)V

    sget-object p1, Lh8/m;->a:Lh8/m;

    return-object p1
.end method

.method public final invoke(LX4/e;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, LX4/e;->onFocus(Z)V

    return-void
.end method
