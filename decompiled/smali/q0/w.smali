.class public final Lq0/w;
.super Lq0/y;
.source "SourceFile"

# interfaces
.implements LJ/i;
.implements LJ/j;
.implements LI/K;
.implements LI/L;
.implements Landroidx/lifecycle/W;
.implements Ld/y;
.implements Lf/g;
.implements LN0/f;
.implements Lq0/O;
.implements LU/l;


# instance fields
.field public final s:Li/l;

.field public final t:Li/l;

.field public final u:Landroid/os/Handler;

.field public final v:Lq0/M;

.field public final synthetic w:Li/l;


# direct methods
.method public constructor <init>(Li/l;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq0/w;->w:Li/l;

    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lq0/w;->s:Li/l;

    .line 12
    .line 13
    iput-object p1, p0, Lq0/w;->t:Li/l;

    .line 14
    .line 15
    iput-object v0, p0, Lq0/w;->u:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance p1, Lq0/M;

    .line 18
    .line 19
    invoke-direct {p1}, Landroidx/fragment/app/e;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lq0/w;->v:Lq0/M;

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public final a()LN0/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/w;->w:Li/l;

    .line 2
    .line 3
    iget-object v0, v0, Ld/m;->w:LN1/t;

    .line 4
    .line 5
    iget-object v0, v0, LN1/t;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LN0/e;

    .line 8
    .line 9
    return-object v0
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

.method public final b(Landroidx/fragment/app/e;Landroidx/fragment/app/b;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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

.method public final c(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/w;->w:Li/l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li/l;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/w;->w:Li/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final e()Landroidx/lifecycle/V;
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/w;->w:Li/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld/m;->e()Landroidx/lifecycle/V;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final g()Landroidx/lifecycle/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/w;->w:Li/l;

    .line 2
    .line 3
    iget-object v0, v0, Li/l;->K:Landroidx/lifecycle/u;

    .line 4
    .line 5
    return-object v0
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
