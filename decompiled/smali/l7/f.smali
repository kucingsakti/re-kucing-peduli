.class public final Ll7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:LJ4/c;

.field public final synthetic u:Lcom/tonyodev/fetch2/Download;


# direct methods
.method public synthetic constructor <init>(LJ4/c;Lcom/tonyodev/fetch2/Download;I)V
    .locals 0

    .line 1
    iput p3, p0, Ll7/f;->s:I

    iput-object p1, p0, Ll7/f;->t:LJ4/c;

    iput-object p2, p0, Ll7/f;->u:Lcom/tonyodev/fetch2/Download;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Ll7/f;->t:LJ4/c;

    .line 2
    .line 3
    iget-object v0, v0, LJ4/c;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LV3/b;

    .line 6
    .line 7
    iget-object v0, v0, LV3/b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v1, p0, Ll7/f;->t:LJ4/c;

    .line 11
    .line 12
    iget-object v1, v1, LJ4/c;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LV3/b;

    .line 15
    .line 16
    iget-object v1, v1, LV3/b;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, LN4/e;

    .line 35
    .line 36
    iget-object v2, p0, Ll7/f;->u:Lcom/tonyodev/fetch2/Download;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, LN4/e;->f(Lcom/tonyodev/fetch2/Download;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    monitor-exit v0

    .line 45
    return-void

    .line 46
    :goto_1
    monitor-exit v0

    .line 47
    throw v1
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

.method private final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Ll7/f;->t:LJ4/c;

    .line 2
    .line 3
    iget-object v0, v0, LJ4/c;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LV3/b;

    .line 6
    .line 7
    iget-object v0, v0, LV3/b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v1, p0, Ll7/f;->t:LJ4/c;

    .line 11
    .line 12
    iget-object v1, v1, LJ4/c;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LV3/b;

    .line 15
    .line 16
    iget-object v1, v1, LV3/b;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, LN4/e;

    .line 35
    .line 36
    iget-object v2, p0, Ll7/f;->u:Lcom/tonyodev/fetch2/Download;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, LN4/e;->f(Lcom/tonyodev/fetch2/Download;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    monitor-exit v0

    .line 45
    return-void

    .line 46
    :goto_1
    monitor-exit v0

    .line 47
    throw v1
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

.method private final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Ll7/f;->t:LJ4/c;

    .line 2
    .line 3
    iget-object v0, v0, LJ4/c;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LV3/b;

    .line 6
    .line 7
    iget-object v0, v0, LV3/b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v1, p0, Ll7/f;->t:LJ4/c;

    .line 11
    .line 12
    iget-object v1, v1, LJ4/c;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LV3/b;

    .line 15
    .line 16
    iget-object v1, v1, LV3/b;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, LN4/e;

    .line 35
    .line 36
    iget-object v2, p0, Ll7/f;->u:Lcom/tonyodev/fetch2/Download;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, LN4/e;->f(Lcom/tonyodev/fetch2/Download;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    monitor-exit v0

    .line 45
    return-void

    .line 46
    :goto_1
    monitor-exit v0

    .line 47
    throw v1
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

.method private final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Ll7/f;->t:LJ4/c;

    .line 2
    .line 3
    iget-object v0, v0, LJ4/c;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LV3/b;

    .line 6
    .line 7
    iget-object v0, v0, LV3/b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v1, p0, Ll7/f;->t:LJ4/c;

    .line 11
    .line 12
    iget-object v1, v1, LJ4/c;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LV3/b;

    .line 15
    .line 16
    iget-object v1, v1, LV3/b;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, LN4/e;

    .line 35
    .line 36
    iget-object v2, p0, Ll7/f;->u:Lcom/tonyodev/fetch2/Download;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, LN4/e;->f(Lcom/tonyodev/fetch2/Download;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    monitor-exit v0

    .line 45
    return-void

    .line 46
    :goto_1
    monitor-exit v0

    .line 47
    throw v1
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

.method private final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Ll7/f;->t:LJ4/c;

    .line 2
    .line 3
    iget-object v0, v0, LJ4/c;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LV3/b;

    .line 6
    .line 7
    iget-object v0, v0, LV3/b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v1, p0, Ll7/f;->t:LJ4/c;

    .line 11
    .line 12
    iget-object v1, v1, LJ4/c;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LV3/b;

    .line 15
    .line 16
    iget-object v1, v1, LV3/b;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, LN4/e;

    .line 35
    .line 36
    iget-object v2, p0, Ll7/f;->u:Lcom/tonyodev/fetch2/Download;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, LN4/e;->f(Lcom/tonyodev/fetch2/Download;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    monitor-exit v0

    .line 45
    return-void

    .line 46
    :goto_1
    monitor-exit v0

    .line 47
    throw v1
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


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Ll7/f;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll7/f;->t:LJ4/c;

    .line 7
    .line 8
    iget-object v0, v0, LJ4/c;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LV3/b;

    .line 11
    .line 12
    iget-object v0, v0, LV3/b;->a:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    iget-object v1, p0, Ll7/f;->t:LJ4/c;

    .line 16
    .line 17
    iget-object v1, v1, LJ4/c;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, LV3/b;

    .line 20
    .line 21
    iget-object v1, v1, LV3/b;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, LN4/e;

    .line 40
    .line 41
    iget-object v2, p0, Ll7/f;->u:Lcom/tonyodev/fetch2/Download;

    .line 42
    .line 43
    invoke-virtual {v1, v2}, LN4/e;->f(Lcom/tonyodev/fetch2/Download;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    monitor-exit v0

    .line 50
    return-void

    .line 51
    :goto_1
    monitor-exit v0

    .line 52
    throw v1

    .line 53
    :pswitch_0
    invoke-direct {p0}, Ll7/f;->e()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_1
    invoke-direct {p0}, Ll7/f;->d()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_2
    invoke-direct {p0}, Ll7/f;->c()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_3
    invoke-direct {p0}, Ll7/f;->b()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_4
    invoke-direct {p0}, Ll7/f;->a()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
