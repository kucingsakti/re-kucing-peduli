.class public abstract LK4/g;
.super Landroidx/fragment/app/b;
.source "SourceFile"

# interfaces
.implements LN9/y;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "LK4/g;",
        "Landroidx/fragment/app/b;",
        "LN9/y;",
        "<init>",
        "()V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public t0:LH4/a;

.field public u0:LN9/e0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/b;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
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
.end method


# virtual methods
.method public C(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/b;->C(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/b;->k()Li/l;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance v0, Lcom/kcstream/cing/api/Service;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Lcom/kcstream/cing/api/Service;-><init>(Li/l;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kcstream/cing/api/Service;->c()LH4/a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, LK4/g;->t0:LH4/a;

    .line 20
    .line 21
    :cond_0
    new-instance p1, LN9/e0;

    .line 22
    .line 23
    invoke-direct {p1}, LN9/e0;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, LK4/g;->u0:LN9/e0;

    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final c()Lm8/i;
    .locals 2

    .line 1
    iget-object v0, p0, LK4/g;->u0:LN9/e0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, LN9/I;->a:LU9/d;

    .line 6
    .line 7
    sget-object v1, LS9/n;->a:LO9/d;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/bumptech/glide/e;->l(Lm8/g;Lm8/i;)Lm8/i;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const-string v0, "job"

    .line 15
    .line 16
    invoke-static {v0}, Lv8/i;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    throw v0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method
