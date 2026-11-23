.class public final LA1/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP3/j;
.implements Lj3/E;
.implements Lo/w;
.implements LJ7/k;


# instance fields
.field public final synthetic s:I

.field public t:Z

.field public u:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, LA1/J;->s:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Landroid/os/Handler;

    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, LA1/I;

    const/4 v3, 0x0

    .line 7
    invoke-direct {v2, v3}, LA1/I;-><init>(I)V

    .line 8
    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, LA1/J;->u:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA1/J;->s:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LS/j;Z)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LA1/J;->s:I

    const/4 v0, 0x5

    .line 9
    invoke-direct {p0, p1, v0}, LA1/J;-><init>(Ljava/lang/Object;I)V

    .line 10
    iput-boolean p2, p0, LA1/J;->t:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, LA1/J;->s:I

    iput-object p1, p0, LA1/J;->u:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 3
    iput p3, p0, LA1/J;->s:I

    iput-object p1, p0, LA1/J;->u:Ljava/lang/Object;

    iput-boolean p2, p0, LA1/J;->t:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/StringBuilder;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LA1/J;->s:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA1/J;->u:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, LA1/J;->t:Z

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LA1/J;->s:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-boolean p1, p0, LA1/J;->t:Z

    .line 13
    iput-object p2, p0, LA1/J;->u:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LA1/J;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LA1/J;->u:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LJ7/k;

    .line 8
    .line 9
    invoke-interface {v0}, LJ7/k;->a()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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

.method public b(LL7/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LA1/J;->u:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LJ7/k;

    .line 4
    .line 5
    invoke-interface {v0, p1}, LJ7/k;->b(LL7/b;)V

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
.end method

.method public c(Lo/l;Z)V
    .locals 2

    .line 1
    iget-boolean p2, p0, LA1/J;->t:Z

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 p2, 0x1

    .line 7
    iput-boolean p2, p0, LA1/J;->t:Z

    .line 8
    .line 9
    iget-object p2, p0, LA1/J;->u:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p2, Li/M;

    .line 12
    .line 13
    iget-object v0, p2, Li/M;->b:Lp/X0;

    .line 14
    .line 15
    iget-object v0, v0, Lp/X0;->a:Landroidx/appcompat/widget/Toolbar;

    .line 16
    .line 17
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->s:Landroidx/appcompat/widget/ActionMenuView;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->L:Landroidx/appcompat/widget/b;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/appcompat/widget/b;->b()Z

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, Landroidx/appcompat/widget/b;->M:Lp/g;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Lo/v;->b()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-object v0, v0, Lo/v;->i:Lo/t;

    .line 39
    .line 40
    invoke-interface {v0}, Lo/B;->dismiss()V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object p2, p2, Li/M;->c:Li/z;

    .line 44
    .line 45
    const/16 v0, 0x6c

    .line 46
    .line 47
    invoke-virtual {p2, v0, p1}, Li/z;->onPanelClosed(ILandroid/view/Menu;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    iput-boolean p1, p0, LA1/J;->t:Z

    .line 52
    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
.end method

.method public d(Ljava/lang/Object;)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    check-cast p1, Lya/L;

    .line 3
    .line 4
    iget-object v1, p1, Lya/L;->a:LX9/L;

    .line 5
    .line 6
    invoke-virtual {v1}, LX9/L;->c()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iget-object v2, p0, LA1/J;->u:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, LJ7/k;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, Lya/L;->b:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {v2, p1}, LJ7/k;->d(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iput-boolean v0, p0, LA1/J;->t:Z

    .line 23
    .line 24
    new-instance v1, Lretrofit2/adapter/rxjava2/HttpException;

    .line 25
    .line 26
    invoke-direct {v1, p1}, Lretrofit2/HttpException;-><init>(Lya/L;)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-interface {v2, v1}, LJ7/k;->onError(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    invoke-static {p1}, Lga/l;->n(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    new-instance v2, Lio/reactivex/exceptions/CompositeException;

    .line 38
    .line 39
    const/4 v3, 0x2

    .line 40
    new-array v3, v3, [Ljava/lang/Throwable;

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    aput-object v1, v3, v4

    .line 44
    .line 45
    aput-object p1, v3, v0

    .line 46
    .line 47
    invoke-direct {v2, v3}, Lio/reactivex/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v2}, LJ7/j;->y(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
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
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public e(LP3/i;I)V
    .locals 1

    .line 1
    iget-boolean p1, p0, LA1/J;->t:Z

    .line 2
    .line 3
    iget-object v0, p0, LA1/J;->u:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, LA1/J;->t:Z

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p1, ", "

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    return-void
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

.method public f()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LA1/J;->t:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, LA1/J;->t:Z

    .line 12
    .line 13
    iget-object v0, p0, LA1/J;->u:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Landroid/os/CancellationSignal;

    .line 16
    .line 17
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    :try_start_1
    invoke-virtual {v0}, Landroid/os/CancellationSignal;->cancel()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_1
    move-exception v0

    .line 25
    monitor-enter p0

    .line 26
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 27
    .line 28
    .line 29
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 30
    throw v0

    .line 31
    :catchall_2
    move-exception v0

    .line 32
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 33
    throw v0

    .line 34
    :cond_1
    :goto_0
    monitor-enter p0

    .line 35
    :try_start_4
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 36
    .line 37
    .line 38
    monitor-exit p0

    .line 39
    return-void

    .line 40
    :catchall_3
    move-exception v0

    .line 41
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 42
    throw v0

    .line 43
    :goto_1
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 44
    throw v0
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
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
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

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LA1/J;->t:Z

    .line 2
    .line 3
    return v0
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
.end method

.method public h(Ljava/lang/String;)LB4/g;
    .locals 3

    .line 1
    iget-boolean v0, p0, LA1/J;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LA1/J;->j()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LA1/J;->u:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LB4/g;

    .line 11
    .line 12
    iget-object v1, v0, LB4/g;->k:Lo1/c;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Lo1/c;->s(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    iget-object p1, v0, LB4/g;->d:LA1/r;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget-object p1, p1, LA1/r;->t:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LB4/M;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/16 v2, 0x8

    .line 38
    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    iput v2, p1, LB4/M;->A:F

    .line 47
    .line 48
    invoke-virtual {p1, v1}, LB4/M;->a(Z)V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-object v0
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
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
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public i(ILjava/lang/CharSequence;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p2, :cond_6

    .line 3
    .line 4
    if-ltz p1, :cond_6

    .line 5
    .line 6
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    sub-int/2addr v1, p1

    .line 11
    if-ltz v1, :cond_6

    .line 12
    .line 13
    iget-object v1, p0, LA1/J;->u:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, LS/j;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, LA1/J;->g()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    const/4 v2, 0x2

    .line 26
    move v3, v1

    .line 27
    move v4, v2

    .line 28
    :goto_0
    if-ge v3, p1, :cond_3

    .line 29
    .line 30
    if-ne v4, v2, :cond_3

    .line 31
    .line 32
    invoke-interface {p2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-static {v4}, Ljava/lang/Character;->getDirectionality(C)B

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    sget-object v5, LS/k;->a:LA1/J;

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    if-eq v4, v0, :cond_1

    .line 45
    .line 46
    if-eq v4, v2, :cond_1

    .line 47
    .line 48
    packed-switch v4, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    move v4, v2

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    :pswitch_0
    move v4, v1

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :pswitch_1
    move v4, v0

    .line 56
    :goto_1
    add-int/2addr v3, v0

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    if-eqz v4, :cond_5

    .line 59
    .line 60
    if-eq v4, v0, :cond_4

    .line 61
    .line 62
    invoke-virtual {p0}, LA1/J;->g()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    return p1

    .line 67
    :cond_4
    return v1

    .line 68
    :cond_5
    return v0

    .line 69
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 70
    .line 71
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
.end method

.method public j()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    iget-boolean v4, v1, LA1/J;->t:Z

    .line 6
    .line 7
    if-nez v4, :cond_16

    .line 8
    .line 9
    iget-object v4, v1, LA1/J;->u:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v4, LB4/g;

    .line 12
    .line 13
    iget-object v5, v4, LB4/g;->a:Landroid/app/Activity;

    .line 14
    .line 15
    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    sget-object v5, LB4/j;->a:Ljava/lang/String;

    .line 19
    .line 20
    const-class v5, LB4/j;

    .line 21
    .line 22
    monitor-enter v5

    .line 23
    :try_start_0
    sget-boolean v6, LB4/j;->b:Z

    .line 24
    .line 25
    if-nez v6, :cond_0

    .line 26
    .line 27
    sput-boolean v3, LB4/j;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto/16 :goto_c

    .line 32
    .line 33
    :cond_0
    :goto_0
    monitor-exit v5

    .line 34
    iget-object v5, v4, LB4/g;->c:LB1/a;

    .line 35
    .line 36
    if-nez v5, :cond_1

    .line 37
    .line 38
    new-instance v5, LB4/m;

    .line 39
    .line 40
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v5, v4, LB4/g;->c:LB1/a;

    .line 44
    .line 45
    :cond_1
    invoke-virtual {v5, v4}, LB1/a;->P0(LB4/g;)V

    .line 46
    .line 47
    .line 48
    iget-object v6, v4, LB4/g;->h:LB1/a;

    .line 49
    .line 50
    if-nez v6, :cond_2

    .line 51
    .line 52
    iput-object v5, v4, LB4/g;->h:LB1/a;

    .line 53
    .line 54
    :cond_2
    iget-object v6, v4, LB4/g;->b:LB4/E;

    .line 55
    .line 56
    iget-object v6, v6, LB4/E;->f:Landroid/webkit/WebView;

    .line 57
    .line 58
    invoke-virtual {v6}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    iput-object v7, v5, LB1/a;->s:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-virtual {v7, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 65
    .line 66
    .line 67
    iget-object v7, v5, LB1/a;->s:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v7, Landroid/webkit/WebSettings;

    .line 70
    .line 71
    invoke-virtual {v7, v3}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 72
    .line 73
    .line 74
    iget-object v7, v5, LB1/a;->s:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v7, Landroid/webkit/WebSettings;

    .line 77
    .line 78
    invoke-virtual {v7, v2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 79
    .line 80
    .line 81
    iget-object v7, v5, LB1/a;->s:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v7, Landroid/webkit/WebSettings;

    .line 84
    .line 85
    invoke-virtual {v7, v2}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    const-string v8, "connectivity"

    .line 97
    .line 98
    invoke-virtual {v7, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    check-cast v7, Landroid/net/ConnectivityManager;

    .line 103
    .line 104
    if-nez v7, :cond_3

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    invoke-virtual {v7}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    if-eqz v7, :cond_4

    .line 112
    .line 113
    invoke-virtual {v7}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-eqz v7, :cond_4

    .line 118
    .line 119
    iget-object v7, v5, LB1/a;->s:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v7, Landroid/webkit/WebSettings;

    .line 122
    .line 123
    const/4 v8, -0x1

    .line 124
    invoke-virtual {v7, v8}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    :goto_1
    iget-object v7, v5, LB1/a;->s:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v7, Landroid/webkit/WebSettings;

    .line 131
    .line 132
    invoke-virtual {v7, v3}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 133
    .line 134
    .line 135
    :goto_2
    iget-object v7, v5, LB1/a;->s:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v7, Landroid/webkit/WebSettings;

    .line 138
    .line 139
    invoke-virtual {v7, v2}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 140
    .line 141
    .line 142
    const/4 v7, 0x2

    .line 143
    const/4 v8, 0x0

    .line 144
    invoke-virtual {v6, v7, v8}, Landroid/webkit/WebView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 145
    .line 146
    .line 147
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v9, Landroid/webkit/WebSettings;

    .line 150
    .line 151
    const/16 v10, 0x64

    .line 152
    .line 153
    invoke-virtual {v9, v10}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 154
    .line 155
    .line 156
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v9, Landroid/webkit/WebSettings;

    .line 159
    .line 160
    invoke-virtual {v9, v3}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 161
    .line 162
    .line 163
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v9, Landroid/webkit/WebSettings;

    .line 166
    .line 167
    invoke-virtual {v9, v3}, Landroid/webkit/WebSettings;->setLoadsImagesAutomatically(Z)V

    .line 168
    .line 169
    .line 170
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v9, Landroid/webkit/WebSettings;

    .line 173
    .line 174
    invoke-virtual {v9, v2}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 175
    .line 176
    .line 177
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v9, Landroid/webkit/WebSettings;

    .line 180
    .line 181
    invoke-virtual {v9, v2}, Landroid/webkit/WebSettings;->setBlockNetworkImage(Z)V

    .line 182
    .line 183
    .line 184
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v9, Landroid/webkit/WebSettings;

    .line 187
    .line 188
    invoke-virtual {v9, v3}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 189
    .line 190
    .line 191
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v9, Landroid/webkit/WebSettings;

    .line 194
    .line 195
    invoke-virtual {v9, v2}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 196
    .line 197
    .line 198
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v9, Landroid/webkit/WebSettings;

    .line 201
    .line 202
    invoke-virtual {v9, v2}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V

    .line 203
    .line 204
    .line 205
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v9, Landroid/webkit/WebSettings;

    .line 208
    .line 209
    invoke-virtual {v9, v3}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 210
    .line 211
    .line 212
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v9, Landroid/webkit/WebSettings;

    .line 215
    .line 216
    sget-object v10, Landroid/webkit/WebSettings$LayoutAlgorithm;->SINGLE_COLUMN:Landroid/webkit/WebSettings$LayoutAlgorithm;

    .line 217
    .line 218
    invoke-virtual {v9, v10}, Landroid/webkit/WebSettings;->setLayoutAlgorithm(Landroid/webkit/WebSettings$LayoutAlgorithm;)V

    .line 219
    .line 220
    .line 221
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v9, Landroid/webkit/WebSettings;

    .line 224
    .line 225
    invoke-virtual {v9, v2}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 226
    .line 227
    .line 228
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v9, Landroid/webkit/WebSettings;

    .line 231
    .line 232
    invoke-virtual {v9, v2}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 233
    .line 234
    .line 235
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v9, Landroid/webkit/WebSettings;

    .line 238
    .line 239
    invoke-virtual {v9, v3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 240
    .line 241
    .line 242
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v9, Landroid/webkit/WebSettings;

    .line 245
    .line 246
    invoke-virtual {v9, v3}, Landroid/webkit/WebSettings;->setNeedInitialFocus(Z)V

    .line 247
    .line 248
    .line 249
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v9, Landroid/webkit/WebSettings;

    .line 252
    .line 253
    const-string v10, "utf-8"

    .line 254
    .line 255
    invoke-virtual {v9, v10}, Landroid/webkit/WebSettings;->setDefaultTextEncodingName(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v9, Landroid/webkit/WebSettings;

    .line 261
    .line 262
    const/16 v10, 0x10

    .line 263
    .line 264
    invoke-virtual {v9, v10}, Landroid/webkit/WebSettings;->setDefaultFontSize(I)V

    .line 265
    .line 266
    .line 267
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v9, Landroid/webkit/WebSettings;

    .line 270
    .line 271
    const/16 v10, 0xc

    .line 272
    .line 273
    invoke-virtual {v9, v10}, Landroid/webkit/WebSettings;->setMinimumFontSize(I)V

    .line 274
    .line 275
    .line 276
    iget-object v9, v5, LB1/a;->s:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v9, Landroid/webkit/WebSettings;

    .line 279
    .line 280
    invoke-virtual {v9, v3}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 284
    .line 285
    .line 286
    move-result-object v9

    .line 287
    invoke-static {v9}, LB4/j;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    invoke-static {v6}, LB4/j;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    iget-object v6, v5, LB1/a;->s:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v6, Landroid/webkit/WebSettings;

    .line 301
    .line 302
    invoke-virtual {v6, v9}, Landroid/webkit/WebSettings;->setGeolocationDatabasePath(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    iget-object v6, v5, LB1/a;->s:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v6, Landroid/webkit/WebSettings;

    .line 308
    .line 309
    invoke-virtual {v6, v9}, Landroid/webkit/WebSettings;->setDatabasePath(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    iget-object v6, v5, LB1/a;->s:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v6, Landroid/webkit/WebSettings;

    .line 315
    .line 316
    invoke-virtual {v6}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v9

    .line 320
    const-string v10, " AgentWeb/5.0.8 "

    .line 321
    .line 322
    invoke-virtual {v9, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v9

    .line 326
    const-string v10, " UCBrowser/11.6.4.950 "

    .line 327
    .line 328
    invoke-virtual {v9, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v9

    .line 332
    invoke-virtual {v6, v9}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    iget-object v5, v5, LB1/a;->s:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v5, Landroid/webkit/WebSettings;

    .line 338
    .line 339
    invoke-virtual {v5}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    iget-object v5, v4, LB4/g;->q:LA1/q;

    .line 343
    .line 344
    if-nez v5, :cond_5

    .line 345
    .line 346
    iget-object v5, v4, LB4/g;->b:LB4/E;

    .line 347
    .line 348
    iget v6, v4, LB4/g;->r:I

    .line 349
    .line 350
    new-instance v9, LA1/q;

    .line 351
    .line 352
    invoke-direct {v9, v3}, LA1/q;-><init>(I)V

    .line 353
    .line 354
    .line 355
    iput v6, v9, LA1/q;->b:I

    .line 356
    .line 357
    iput-object v5, v9, LA1/q;->c:Ljava/lang/Object;

    .line 358
    .line 359
    iget-object v5, v5, LB4/E;->f:Landroid/webkit/WebView;

    .line 360
    .line 361
    iput-object v5, v9, LA1/q;->d:Ljava/lang/Object;

    .line 362
    .line 363
    iput-object v9, v4, LB4/g;->q:LA1/q;

    .line 364
    .line 365
    :cond_5
    iget-object v5, v4, LB4/g;->g:Lw/e;

    .line 366
    .line 367
    iget v6, v5, Lw/i;->u:I

    .line 368
    .line 369
    invoke-virtual {v5}, Lw/i;->isEmpty()Z

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    if-nez v5, :cond_d

    .line 374
    .line 375
    iget-object v5, v4, LB4/g;->q:LA1/q;

    .line 376
    .line 377
    iget-object v6, v4, LB4/g;->g:Lw/e;

    .line 378
    .line 379
    iget v9, v5, LA1/q;->b:I

    .line 380
    .line 381
    iget-object v10, v5, LA1/q;->c:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v10, LB4/E;

    .line 384
    .line 385
    if-eq v9, v7, :cond_6

    .line 386
    .line 387
    goto :goto_3

    .line 388
    :cond_6
    iget v9, v10, LB4/E;->h:I

    .line 389
    .line 390
    :goto_3
    invoke-virtual {v6}, Lw/e;->entrySet()Ljava/util/Set;

    .line 391
    .line 392
    .line 393
    move-result-object v6

    .line 394
    check-cast v6, Landroidx/datastore/preferences/protobuf/i0;

    .line 395
    .line 396
    invoke-virtual {v6}, Landroidx/datastore/preferences/protobuf/i0;->iterator()Ljava/util/Iterator;

    .line 397
    .line 398
    .line 399
    move-result-object v6

    .line 400
    :goto_4
    move-object v9, v6

    .line 401
    check-cast v9, Lw/c;

    .line 402
    .line 403
    invoke-virtual {v9}, Lw/c;->hasNext()Z

    .line 404
    .line 405
    .line 406
    move-result v11

    .line 407
    if-eqz v11, :cond_d

    .line 408
    .line 409
    invoke-virtual {v9}, Lw/c;->next()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v9}, Lw/c;->getValue()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v11

    .line 416
    iget v12, v10, LB4/E;->h:I

    .line 417
    .line 418
    if-ne v12, v7, :cond_7

    .line 419
    .line 420
    move v15, v3

    .line 421
    move/from16 v17, v15

    .line 422
    .line 423
    goto :goto_8

    .line 424
    :cond_7
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    move-result-object v12

    .line 428
    invoke-virtual {v12}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 429
    .line 430
    .line 431
    move-result-object v12

    .line 432
    array-length v13, v12

    .line 433
    move v14, v2

    .line 434
    move v15, v14

    .line 435
    :goto_5
    if-ge v14, v13, :cond_b

    .line 436
    .line 437
    aget-object v16, v12, v14

    .line 438
    .line 439
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 440
    .line 441
    .line 442
    move-result-object v7

    .line 443
    array-length v8, v7

    .line 444
    move/from16 v17, v3

    .line 445
    .line 446
    move v3, v2

    .line 447
    :goto_6
    if-ge v3, v8, :cond_9

    .line 448
    .line 449
    aget-object v0, v7, v3

    .line 450
    .line 451
    instance-of v0, v0, Landroid/webkit/JavascriptInterface;

    .line 452
    .line 453
    if-eqz v0, :cond_8

    .line 454
    .line 455
    move/from16 v15, v17

    .line 456
    .line 457
    goto :goto_7

    .line 458
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 459
    .line 460
    goto :goto_6

    .line 461
    :cond_9
    :goto_7
    if-eqz v15, :cond_a

    .line 462
    .line 463
    goto :goto_8

    .line 464
    :cond_a
    add-int/lit8 v14, v14, 0x1

    .line 465
    .line 466
    move/from16 v3, v17

    .line 467
    .line 468
    const/4 v7, 0x2

    .line 469
    const/4 v8, 0x0

    .line 470
    goto :goto_5

    .line 471
    :cond_b
    move/from16 v17, v3

    .line 472
    .line 473
    :goto_8
    if-eqz v15, :cond_c

    .line 474
    .line 475
    invoke-virtual {v9}, Lw/c;->getKey()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    check-cast v0, Ljava/lang/String;

    .line 480
    .line 481
    invoke-static {v11}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    sget-object v3, LB4/j;->a:Ljava/lang/String;

    .line 485
    .line 486
    iget-object v3, v5, LA1/q;->d:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v3, Landroid/webkit/WebView;

    .line 489
    .line 490
    invoke-virtual {v3, v11, v0}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    move/from16 v3, v17

    .line 494
    .line 495
    const/4 v7, 0x2

    .line 496
    const/4 v8, 0x0

    .line 497
    goto :goto_4

    .line 498
    :cond_c
    new-instance v0, Lcom/just/agentweb/JsInterfaceObjectException;

    .line 499
    .line 500
    const-string v2, "This object has not offer method javascript to call ,please check addJavascriptInterface annotation was be added"

    .line 501
    .line 502
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    throw v0

    .line 506
    :cond_d
    move/from16 v17, v3

    .line 507
    .line 508
    iget-object v0, v4, LB4/g;->h:LB1/a;

    .line 509
    .line 510
    if-eqz v0, :cond_15

    .line 511
    .line 512
    iget-object v3, v4, LB4/g;->b:LB4/E;

    .line 513
    .line 514
    iget-object v3, v3, LB4/E;->f:Landroid/webkit/WebView;

    .line 515
    .line 516
    invoke-virtual {v0, v3}, LB1/a;->S0(Landroid/webkit/WebView;)LB1/a;

    .line 517
    .line 518
    .line 519
    iget-object v0, v4, LB4/g;->h:LB1/a;

    .line 520
    .line 521
    iget-object v3, v4, LB4/g;->b:LB4/E;

    .line 522
    .line 523
    iget-object v5, v3, LB4/E;->f:Landroid/webkit/WebView;

    .line 524
    .line 525
    iget-object v6, v4, LB4/g;->d:LA1/r;

    .line 526
    .line 527
    if-nez v6, :cond_e

    .line 528
    .line 529
    new-instance v6, LA1/r;

    .line 530
    .line 531
    const/4 v7, 0x3

    .line 532
    invoke-direct {v6, v7, v2}, LA1/r;-><init>(IZ)V

    .line 533
    .line 534
    .line 535
    iget-object v7, v3, LB4/E;->e:LB4/M;

    .line 536
    .line 537
    iput-object v7, v6, LA1/r;->t:Ljava/lang/Object;

    .line 538
    .line 539
    :cond_e
    new-instance v7, LB4/p;

    .line 540
    .line 541
    iput-object v6, v4, LB4/g;->d:LA1/r;

    .line 542
    .line 543
    iget-object v8, v4, LB4/g;->m:LB4/e;

    .line 544
    .line 545
    iget-object v9, v4, LB4/g;->a:Landroid/app/Activity;

    .line 546
    .line 547
    if-nez v8, :cond_f

    .line 548
    .line 549
    new-instance v8, LB4/e;

    .line 550
    .line 551
    iget-object v10, v3, LB4/E;->f:Landroid/webkit/WebView;

    .line 552
    .line 553
    move/from16 v11, v17

    .line 554
    .line 555
    invoke-direct {v8, v11}, LB4/e;-><init>(I)V

    .line 556
    .line 557
    .line 558
    const/4 v11, 0x0

    .line 559
    iput-object v11, v8, LB4/e;->e:Ljava/lang/Object;

    .line 560
    .line 561
    iput-object v11, v8, LB4/e;->f:Ljava/lang/Object;

    .line 562
    .line 563
    iput-object v11, v8, LB4/e;->g:Ljava/lang/Object;

    .line 564
    .line 565
    iput-object v9, v8, LB4/e;->b:Ljava/lang/Object;

    .line 566
    .line 567
    iput-object v10, v8, LB4/e;->d:Ljava/lang/Object;

    .line 568
    .line 569
    new-instance v10, Ljava/util/HashSet;

    .line 570
    .line 571
    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    .line 572
    .line 573
    .line 574
    iput-object v10, v8, LB4/e;->e:Ljava/lang/Object;

    .line 575
    .line 576
    :cond_f
    iput-object v8, v4, LB4/g;->m:LB4/e;

    .line 577
    .line 578
    iget-object v3, v3, LB4/E;->f:Landroid/webkit/WebView;

    .line 579
    .line 580
    invoke-direct {v7, v2}, LB4/G;-><init>(I)V

    .line 581
    .line 582
    .line 583
    const/4 v11, 0x0

    .line 584
    iput-object v11, v7, LB4/p;->b:Ljava/lang/ref/WeakReference;

    .line 585
    .line 586
    iput-object v11, v7, LB4/p;->f:Ljava/lang/String;

    .line 587
    .line 588
    iput-object v11, v7, LB4/p;->g:Landroid/webkit/GeolocationPermissions$Callback;

    .line 589
    .line 590
    iput-object v11, v7, LB4/p;->h:Ljava/lang/ref/WeakReference;

    .line 591
    .line 592
    new-instance v10, Le1/j;

    .line 593
    .line 594
    const/4 v11, 0x3

    .line 595
    invoke-direct {v10, v7, v11}, Le1/j;-><init>(Ljava/lang/Object;I)V

    .line 596
    .line 597
    .line 598
    iput-object v10, v7, LB4/p;->j:Le1/j;

    .line 599
    .line 600
    iput-object v6, v7, LB4/p;->i:LA1/r;

    .line 601
    .line 602
    iput-boolean v2, v7, LB4/p;->c:Z

    .line 603
    .line 604
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 605
    .line 606
    invoke-direct {v2, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    iput-object v2, v7, LB4/p;->b:Ljava/lang/ref/WeakReference;

    .line 610
    .line 611
    iput-object v8, v7, LB4/p;->d:LB4/e;

    .line 612
    .line 613
    iput-object v3, v7, LB4/p;->e:Landroid/webkit/WebView;

    .line 614
    .line 615
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 616
    .line 617
    invoke-static {v3}, LB4/f;->c(Landroid/webkit/WebView;)LB4/a;

    .line 618
    .line 619
    .line 620
    move-result-object v3

    .line 621
    invoke-direct {v2, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    iput-object v2, v7, LB4/p;->h:Ljava/lang/ref/WeakReference;

    .line 625
    .line 626
    iget-object v2, v4, LB4/g;->e:LB4/J;

    .line 627
    .line 628
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    sget-object v3, LB4/j;->a:Ljava/lang/String;

    .line 632
    .line 633
    if-eqz v2, :cond_10

    .line 634
    .line 635
    const/4 v11, 0x0

    .line 636
    iput-object v11, v2, LB4/G;->a:Landroid/webkit/WebChromeClient;

    .line 637
    .line 638
    goto :goto_9

    .line 639
    :cond_10
    const/4 v2, 0x0

    .line 640
    :goto_9
    if-eqz v2, :cond_11

    .line 641
    .line 642
    iput-object v7, v2, LB4/G;->a:Landroid/webkit/WebChromeClient;

    .line 643
    .line 644
    move-object v7, v2

    .line 645
    :cond_11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v5, v7}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 649
    .line 650
    .line 651
    iget-object v0, v4, LB4/g;->h:LB1/a;

    .line 652
    .line 653
    iget-object v2, v4, LB4/g;->b:LB4/E;

    .line 654
    .line 655
    iget-object v2, v2, LB4/E;->f:Landroid/webkit/WebView;

    .line 656
    .line 657
    new-instance v3, LB4/D;

    .line 658
    .line 659
    invoke-direct {v3}, LB4/S;-><init>()V

    .line 660
    .line 661
    .line 662
    const/4 v11, 0x0

    .line 663
    iput-object v11, v3, LB4/D;->b:Ljava/lang/ref/WeakReference;

    .line 664
    .line 665
    const/4 v5, 0x1

    .line 666
    iput-boolean v5, v3, LB4/D;->c:Z

    .line 667
    .line 668
    const/16 v6, 0xfa

    .line 669
    .line 670
    iput v6, v3, LB4/D;->d:I

    .line 671
    .line 672
    iput-boolean v5, v3, LB4/D;->e:Z

    .line 673
    .line 674
    iput-object v11, v3, LB4/D;->f:Ljava/lang/ref/WeakReference;

    .line 675
    .line 676
    iput-object v11, v3, LB4/D;->h:LB4/r;

    .line 677
    .line 678
    new-instance v5, Ljava/util/HashSet;

    .line 679
    .line 680
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 681
    .line 682
    .line 683
    iput-object v5, v3, LB4/D;->j:Ljava/util/HashSet;

    .line 684
    .line 685
    new-instance v5, Ljava/util/HashSet;

    .line 686
    .line 687
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 688
    .line 689
    .line 690
    iput-object v5, v3, LB4/D;->k:Ljava/util/HashSet;

    .line 691
    .line 692
    iput-object v2, v3, LB4/D;->g:Landroid/webkit/WebView;

    .line 693
    .line 694
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 695
    .line 696
    iget-object v7, v4, LB4/g;->a:Landroid/app/Activity;

    .line 697
    .line 698
    invoke-direct {v5, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    iput-object v5, v3, LB4/D;->b:Ljava/lang/ref/WeakReference;

    .line 702
    .line 703
    iget-boolean v5, v4, LB4/g;->n:Z

    .line 704
    .line 705
    iput-boolean v5, v3, LB4/D;->c:Z

    .line 706
    .line 707
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 708
    .line 709
    invoke-static {v2}, LB4/f;->c(Landroid/webkit/WebView;)LB4/a;

    .line 710
    .line 711
    .line 712
    move-result-object v7

    .line 713
    invoke-direct {v5, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 714
    .line 715
    .line 716
    iput-object v5, v3, LB4/D;->f:Ljava/lang/ref/WeakReference;

    .line 717
    .line 718
    iget-boolean v5, v4, LB4/g;->o:Z

    .line 719
    .line 720
    iput-boolean v5, v3, LB4/D;->e:Z

    .line 721
    .line 722
    iget v5, v4, LB4/g;->p:I

    .line 723
    .line 724
    if-gtz v5, :cond_12

    .line 725
    .line 726
    iput v6, v3, LB4/D;->d:I

    .line 727
    .line 728
    goto :goto_a

    .line 729
    :cond_12
    iput v5, v3, LB4/D;->d:I

    .line 730
    .line 731
    :goto_a
    iget-object v4, v4, LB4/g;->f:LB4/Q;

    .line 732
    .line 733
    const/4 v11, 0x0

    .line 734
    if-eqz v4, :cond_13

    .line 735
    .line 736
    iput-object v11, v4, LB4/S;->a:Landroid/webkit/WebViewClient;

    .line 737
    .line 738
    move-object v8, v4

    .line 739
    goto :goto_b

    .line 740
    :cond_13
    move-object v8, v11

    .line 741
    :goto_b
    if-eqz v8, :cond_14

    .line 742
    .line 743
    iput-object v3, v8, LB4/S;->a:Landroid/webkit/WebViewClient;

    .line 744
    .line 745
    move-object v3, v8

    .line 746
    :cond_14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 750
    .line 751
    .line 752
    :cond_15
    const/4 v5, 0x1

    .line 753
    iput-boolean v5, v1, LA1/J;->t:Z

    .line 754
    .line 755
    return-void

    .line 756
    :goto_c
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 757
    throw v0

    .line 758
    :cond_16
    return-void
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
.end method

.method public k(Landroid/view/View;LU/B0;LT6/k;)LU/B0;
    .locals 10

    .line 1
    iget-object v0, p2, LU/B0;->a:LU/y0;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-virtual {v0, v1}, LU/y0;->f(I)LL/c;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/16 v2, 0x20

    .line 9
    .line 10
    invoke-virtual {v0, v2}, LU/y0;->f(I)LL/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v2, v1, LL/c;->b:I

    .line 15
    .line 16
    iget-object v3, p0, LA1/J;->u:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 19
    .line 20
    iput v2, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O:I

    .line 21
    .line 22
    invoke-static {p1}, Lj3/C;->h(Landroid/view/View;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    iget-boolean v7, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G:Z

    .line 39
    .line 40
    if-eqz v7, :cond_0

    .line 41
    .line 42
    invoke-virtual {p2}, LU/B0;->a()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    iput v4, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N:I

    .line 47
    .line 48
    iget v7, p3, LT6/k;->d:I

    .line 49
    .line 50
    add-int/2addr v4, v7

    .line 51
    :cond_0
    iget-boolean v7, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:Z

    .line 52
    .line 53
    iget v8, v1, LL/c;->a:I

    .line 54
    .line 55
    if-eqz v7, :cond_2

    .line 56
    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    iget v5, p3, LT6/k;->c:I

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget v5, p3, LT6/k;->a:I

    .line 63
    .line 64
    :goto_0
    add-int/2addr v5, v8

    .line 65
    :cond_2
    iget-boolean v7, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I:Z

    .line 66
    .line 67
    iget v9, v1, LL/c;->c:I

    .line 68
    .line 69
    if-eqz v7, :cond_4

    .line 70
    .line 71
    if-eqz v2, :cond_3

    .line 72
    .line 73
    iget p3, p3, LT6/k;->a:I

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    iget p3, p3, LT6/k;->c:I

    .line 77
    .line 78
    :goto_1
    add-int v6, p3, v9

    .line 79
    .line 80
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    check-cast p3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 85
    .line 86
    iget-boolean v2, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 87
    .line 88
    const/4 v7, 0x1

    .line 89
    if-eqz v2, :cond_5

    .line 90
    .line 91
    iget v2, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 92
    .line 93
    if-eq v2, v8, :cond_5

    .line 94
    .line 95
    iput v8, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 96
    .line 97
    move v2, v7

    .line 98
    goto :goto_2

    .line 99
    :cond_5
    const/4 v2, 0x0

    .line 100
    :goto_2
    iget-boolean v8, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 101
    .line 102
    if-eqz v8, :cond_6

    .line 103
    .line 104
    iget v8, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 105
    .line 106
    if-eq v8, v9, :cond_6

    .line 107
    .line 108
    iput v9, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 109
    .line 110
    move v2, v7

    .line 111
    :cond_6
    iget-boolean v8, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:Z

    .line 112
    .line 113
    if-eqz v8, :cond_7

    .line 114
    .line 115
    iget v8, p3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 116
    .line 117
    iget v1, v1, LL/c;->b:I

    .line 118
    .line 119
    if-eq v8, v1, :cond_7

    .line 120
    .line 121
    iput v1, p3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_7
    move v7, v2

    .line 125
    :goto_3
    if-eqz v7, :cond_8

    .line 126
    .line 127
    invoke-virtual {p1, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 128
    .line 129
    .line 130
    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 131
    .line 132
    .line 133
    move-result p3

    .line 134
    invoke-virtual {p1, v5, p3, v6, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 135
    .line 136
    .line 137
    iget-boolean p1, p0, LA1/J;->t:Z

    .line 138
    .line 139
    if-eqz p1, :cond_9

    .line 140
    .line 141
    iget p3, v0, LL/c;->d:I

    .line 142
    .line 143
    iput p3, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E:I

    .line 144
    .line 145
    :cond_9
    iget-boolean p3, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G:Z

    .line 146
    .line 147
    if-nez p3, :cond_b

    .line 148
    .line 149
    if-eqz p1, :cond_a

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_a
    return-object p2

    .line 153
    :cond_b
    :goto_4
    invoke-virtual {v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P()V

    .line 154
    .line 155
    .line 156
    return-object p2
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
.end method

.method public l(Lo/l;)Z
    .locals 2

    .line 1
    iget-object v0, p0, LA1/J;->u:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li/M;

    .line 4
    .line 5
    iget-object v0, v0, Li/M;->c:Li/z;

    .line 6
    .line 7
    const/16 v1, 0x6c

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Li/z;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1
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

.method public declared-synchronized m(LA1/F;Z)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LA1/J;->t:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iput-boolean v1, p0, LA1/J;->t:Z

    .line 11
    .line 12
    invoke-interface {p1}, LA1/F;->c()V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, LA1/J;->t:Z

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_2

    .line 21
    :cond_1
    :goto_0
    iget-object p2, p0, LA1/J;->u:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p2, Landroid/os/Handler;

    .line 24
    .line 25
    invoke-virtual {p2, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    :goto_1
    monitor-exit p0

    .line 33
    return-void

    .line 34
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw p1
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

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LA1/J;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LA1/J;->u:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LJ7/k;

    .line 8
    .line 9
    invoke-interface {v0, p1}, LJ7/k;->onError(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 14
    .line 15
    const-string v1, "This should never happen! Report as a bug with the full stacktrace."

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, LJ7/j;->y(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, LA1/J;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-boolean v0, p0, LA1/J;->t:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string v0, "FALL_THROUGH"

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, LA1/J;->u:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    return-object v0

    .line 25
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
    .line 26
.end method
