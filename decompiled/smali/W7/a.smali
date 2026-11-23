.class public final LW7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ7/k;
.implements LL7/b;


# instance fields
.field public final synthetic s:I

.field public t:LL7/b;

.field public u:Ljava/lang/Object;

.field public v:Z

.field public final w:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LW7/a;->s:I

    iput-object p1, p0, LW7/a;->w:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, LW7/a;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LW7/a;->v:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, LW7/a;->v:Z

    .line 13
    .line 14
    iget-object v0, p0, LW7/a;->u:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-object v1, p0, LW7/a;->u:Ljava/lang/Object;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    move-object v0, v1

    .line 22
    :cond_1
    iget-object v1, p0, LW7/a;->w:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, LJ7/p;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-interface {v1, v0}, LJ7/p;->c(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-interface {v1, v0}, LJ7/p;->onError(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void

    .line 41
    :pswitch_0
    iget-boolean v0, p0, LW7/a;->v:Z

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    const/4 v0, 0x1

    .line 47
    iput-boolean v0, p0, LW7/a;->v:Z

    .line 48
    .line 49
    iget-object v0, p0, LW7/a;->u:Ljava/lang/Object;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    iput-object v1, p0, LW7/a;->u:Ljava/lang/Object;

    .line 53
    .line 54
    iget-object v1, p0, LW7/a;->w:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, LJ7/i;

    .line 57
    .line 58
    if-nez v0, :cond_4

    .line 59
    .line 60
    invoke-interface {v1}, LJ7/i;->a()V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    invoke-interface {v1, v0}, LJ7/i;->c(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final b(LL7/b;)V
    .locals 1

    .line 1
    iget v0, p0, LW7/a;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LW7/a;->t:LL7/b;

    .line 7
    .line 8
    invoke-static {v0, p1}, LO7/b;->k(LL7/b;LL7/b;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iput-object p1, p0, LW7/a;->t:LL7/b;

    .line 15
    .line 16
    iget-object p1, p0, LW7/a;->w:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, LJ7/p;

    .line 19
    .line 20
    invoke-interface {p1, p0}, LJ7/p;->b(LL7/b;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :pswitch_0
    iget-object v0, p0, LW7/a;->t:LL7/b;

    .line 25
    .line 26
    invoke-static {v0, p1}, LO7/b;->k(LL7/b;LL7/b;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iput-object p1, p0, LW7/a;->t:LL7/b;

    .line 33
    .line 34
    iget-object p1, p0, LW7/a;->w:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, LJ7/i;

    .line 37
    .line 38
    invoke-interface {p1, p0}, LJ7/i;->b(LL7/b;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final d(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, LW7/a;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LW7/a;->v:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, LW7/a;->u:Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, LW7/a;->v:Z

    .line 17
    .line 18
    iget-object p1, p0, LW7/a;->t:LL7/b;

    .line 19
    .line 20
    invoke-interface {p1}, LL7/b;->f()V

    .line 21
    .line 22
    .line 23
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    const-string v0, "Sequence contains more than one element!"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, LW7/a;->w:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LJ7/p;

    .line 33
    .line 34
    invoke-interface {v0, p1}, LJ7/p;->onError(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iput-object p1, p0, LW7/a;->u:Ljava/lang/Object;

    .line 39
    .line 40
    :goto_0
    return-void

    .line 41
    :pswitch_0
    iget-boolean v0, p0, LW7/a;->v:Z

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget-object v0, p0, LW7/a;->u:Ljava/lang/Object;

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    iput-boolean p1, p0, LW7/a;->v:Z

    .line 52
    .line 53
    iget-object p1, p0, LW7/a;->t:LL7/b;

    .line 54
    .line 55
    invoke-interface {p1}, LL7/b;->f()V

    .line 56
    .line 57
    .line 58
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 59
    .line 60
    const-string v0, "Sequence contains more than one element!"

    .line 61
    .line 62
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, LW7/a;->w:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, LJ7/i;

    .line 68
    .line 69
    invoke-interface {v0, p1}, LJ7/i;->onError(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    iput-object p1, p0, LW7/a;->u:Ljava/lang/Object;

    .line 74
    .line 75
    :goto_1
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final f()V
    .locals 1

    .line 1
    iget v0, p0, LW7/a;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LW7/a;->t:LL7/b;

    .line 7
    .line 8
    invoke-interface {v0}, LL7/b;->f()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, LW7/a;->t:LL7/b;

    .line 13
    .line 14
    invoke-interface {v0}, LL7/b;->f()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget v0, p0, LW7/a;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LW7/a;->v:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, LJ7/j;->y(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, LW7/a;->v:Z

    .line 16
    .line 17
    iget-object v0, p0, LW7/a;->w:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, LJ7/p;

    .line 20
    .line 21
    invoke-interface {v0, p1}, LJ7/p;->onError(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    return-void

    .line 25
    :pswitch_0
    iget-boolean v0, p0, LW7/a;->v:Z

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-static {p1}, LJ7/j;->y(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, LW7/a;->v:Z

    .line 35
    .line 36
    iget-object v0, p0, LW7/a;->w:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, LJ7/i;

    .line 39
    .line 40
    invoke-interface {v0, p1}, LJ7/i;->onError(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :goto_1
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 87
    .line 88
    .line 89
    .line 90
.end method
