.class public final LU2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:I

.field public t:Z

.field public final u:Ljava/lang/Object;

.field public final v:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LJ4/c;Lcom/tonyodev/fetch2/Download;Z)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LU2/b;->s:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU2/b;->u:Ljava/lang/Object;

    iput-object p2, p0, LU2/b;->v:Ljava/lang/Object;

    iput-boolean p3, p0, LU2/b;->t:Z

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/u;Landroidx/lifecycle/m;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LU2/b;->s:I

    const-string v0, "registry"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LU2/b;->u:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, LU2/b;->v:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LU2/b;->s:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU2/b;->v:Ljava/lang/Object;

    .line 6
    iput-object p2, p0, LU2/b;->u:Ljava/lang/Object;

    .line 7
    iput-boolean p3, p0, LU2/b;->t:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LU2/b;->v:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, LU2/b;->u:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, LU2/b;->s:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v1, LJ4/c;

    .line 11
    .line 12
    check-cast v0, Lcom/tonyodev/fetch2/Download;

    .line 13
    .line 14
    iget-boolean v2, p0, LU2/b;->t:Z

    .line 15
    .line 16
    invoke-virtual {v1, v0, v2}, LJ4/c;->h(Lcom/tonyodev/fetch2/Download;Z)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-boolean v2, p0, LU2/b;->t:Z

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    check-cast v1, Landroidx/lifecycle/u;

    .line 25
    .line 26
    check-cast v0, Landroidx/lifecycle/m;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p0, LU2/b;->t:Z

    .line 33
    .line 34
    :cond_0
    return-void

    .line 35
    :pswitch_1
    check-cast v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 36
    .line 37
    iget-object v2, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->s:Ld0/f;

    .line 38
    .line 39
    check-cast v1, Landroid/view/View;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-virtual {v2}, Ld0/f;->g()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    sget-object v0, LU/U;->a:Ljava/util/WeakHashMap;

    .line 50
    .line 51
    invoke-virtual {v1, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-boolean v2, p0, LU2/b;->t:Z

    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    iget-object v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->t:Li3/b;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Li3/b;->E(Landroid/view/View;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    :goto_0
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
.end method
