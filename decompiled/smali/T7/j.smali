.class public final LT7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ7/f;
.implements LL7/b;


# instance fields
.field public final synthetic s:I

.field public t:Lua/a;

.field public u:J

.field public v:Z

.field public final w:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LT7/j;->s:I

    iput-object p1, p0, LT7/j;->w:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, LT7/j;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lb8/a;->s:Lb8/a;

    .line 7
    .line 8
    iput-object v0, p0, LT7/j;->t:Lua/a;

    .line 9
    .line 10
    iget-boolean v0, p0, LT7/j;->v:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, LT7/j;->v:Z

    .line 16
    .line 17
    iget-object v0, p0, LT7/j;->w:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, LJ7/p;

    .line 20
    .line 21
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, LJ7/p;->onError(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void

    .line 30
    :pswitch_0
    sget-object v0, Lb8/a;->s:Lb8/a;

    .line 31
    .line 32
    iput-object v0, p0, LT7/j;->t:Lua/a;

    .line 33
    .line 34
    iget-boolean v0, p0, LT7/j;->v:Z

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    iput-boolean v0, p0, LT7/j;->v:Z

    .line 40
    .line 41
    iget-object v0, p0, LT7/j;->w:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, LJ7/i;

    .line 44
    .line 45
    invoke-interface {v0}, LJ7/i;->a()V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final c(Lua/a;)V
    .locals 2

    .line 1
    iget v0, p0, LT7/j;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LT7/j;->t:Lua/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lb8/a;->h(Lua/a;Lua/a;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iput-object p1, p0, LT7/j;->t:Lua/a;

    .line 15
    .line 16
    iget-object v0, p0, LT7/j;->w:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LJ7/p;

    .line 19
    .line 20
    invoke-interface {v0, p0}, LJ7/p;->b(LL7/b;)V

    .line 21
    .line 22
    .line 23
    const-wide v0, 0x7fffffffffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-interface {p1, v0, v1}, Lua/a;->f(J)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    :pswitch_0
    iget-object v0, p0, LT7/j;->t:Lua/a;

    .line 33
    .line 34
    invoke-static {v0, p1}, Lb8/a;->h(Lua/a;Lua/a;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iput-object p1, p0, LT7/j;->t:Lua/a;

    .line 41
    .line 42
    iget-object v0, p0, LT7/j;->w:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, LJ7/i;

    .line 45
    .line 46
    invoke-interface {v0, p0}, LJ7/i;->b(LL7/b;)V

    .line 47
    .line 48
    .line 49
    const-wide v0, 0x7fffffffffffffffL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    invoke-interface {p1, v0, v1}, Lua/a;->f(J)V

    .line 55
    .line 56
    .line 57
    :cond_1
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .locals 4

    .line 1
    iget v0, p0, LT7/j;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LT7/j;->v:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-wide v0, p0, LT7/j;->u:J

    .line 12
    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v2, v0, v2

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, LT7/j;->v:Z

    .line 21
    .line 22
    iget-object v0, p0, LT7/j;->t:Lua/a;

    .line 23
    .line 24
    invoke-interface {v0}, Lua/a;->cancel()V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lb8/a;->s:Lb8/a;

    .line 28
    .line 29
    iput-object v0, p0, LT7/j;->t:Lua/a;

    .line 30
    .line 31
    iget-object v0, p0, LT7/j;->w:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, LJ7/p;

    .line 34
    .line 35
    invoke-interface {v0, p1}, LJ7/p;->c(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const-wide/16 v2, 0x1

    .line 40
    .line 41
    add-long/2addr v0, v2

    .line 42
    iput-wide v0, p0, LT7/j;->u:J

    .line 43
    .line 44
    :goto_0
    return-void

    .line 45
    :pswitch_0
    iget-boolean v0, p0, LT7/j;->v:Z

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    iget-wide v0, p0, LT7/j;->u:J

    .line 51
    .line 52
    const-wide/16 v2, 0x0

    .line 53
    .line 54
    cmp-long v2, v0, v2

    .line 55
    .line 56
    if-nez v2, :cond_3

    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    iput-boolean v0, p0, LT7/j;->v:Z

    .line 60
    .line 61
    iget-object v0, p0, LT7/j;->t:Lua/a;

    .line 62
    .line 63
    invoke-interface {v0}, Lua/a;->cancel()V

    .line 64
    .line 65
    .line 66
    sget-object v0, Lb8/a;->s:Lb8/a;

    .line 67
    .line 68
    iput-object v0, p0, LT7/j;->t:Lua/a;

    .line 69
    .line 70
    iget-object v0, p0, LT7/j;->w:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, LJ7/i;

    .line 73
    .line 74
    invoke-interface {v0, p1}, LJ7/i;->c(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    const-wide/16 v2, 0x1

    .line 79
    .line 80
    add-long/2addr v0, v2

    .line 81
    iput-wide v0, p0, LT7/j;->u:J

    .line 82
    .line 83
    :goto_1
    return-void

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final f()V
    .locals 1

    .line 1
    iget v0, p0, LT7/j;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LT7/j;->t:Lua/a;

    .line 7
    .line 8
    invoke-interface {v0}, Lua/a;->cancel()V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lb8/a;->s:Lb8/a;

    .line 12
    .line 13
    iput-object v0, p0, LT7/j;->t:Lua/a;

    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, LT7/j;->t:Lua/a;

    .line 17
    .line 18
    invoke-interface {v0}, Lua/a;->cancel()V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lb8/a;->s:Lb8/a;

    .line 22
    .line 23
    iput-object v0, p0, LT7/j;->t:Lua/a;

    .line 24
    .line 25
    return-void

    .line 26
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget v0, p0, LT7/j;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LT7/j;->v:Z

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
    iput-boolean v0, p0, LT7/j;->v:Z

    .line 16
    .line 17
    sget-object v0, Lb8/a;->s:Lb8/a;

    .line 18
    .line 19
    iput-object v0, p0, LT7/j;->t:Lua/a;

    .line 20
    .line 21
    iget-object v0, p0, LT7/j;->w:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, LJ7/p;

    .line 24
    .line 25
    invoke-interface {v0, p1}, LJ7/p;->onError(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    return-void

    .line 29
    :pswitch_0
    iget-boolean v0, p0, LT7/j;->v:Z

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-static {p1}, LJ7/j;->y(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, LT7/j;->v:Z

    .line 39
    .line 40
    sget-object v0, Lb8/a;->s:Lb8/a;

    .line 41
    .line 42
    iput-object v0, p0, LT7/j;->t:Lua/a;

    .line 43
    .line 44
    iget-object v0, p0, LT7/j;->w:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, LJ7/i;

    .line 47
    .line 48
    invoke-interface {v0, p1}, LJ7/i;->onError(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
