.class public final LO3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/io/Serializable;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh7/c;Lq7/i;Landroid/os/Handler;Ll7/a;Lq7/f;LV3/b;Li7/g;)V
    .locals 0

    const-string p1, "uiHandler"

    invoke-static {p3, p1}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "fetchHandler"

    invoke-static {p4, p1}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "logger"

    invoke-static {p5, p1}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/a;->d:Ljava/lang/Object;

    iput-object p3, p0, LO3/a;->e:Ljava/lang/Object;

    iput-object p4, p0, LO3/a;->f:Ljava/lang/Object;

    iput-object p5, p0, LO3/a;->g:Ljava/lang/Object;

    iput-object p6, p0, LO3/a;->h:Ljava/lang/Object;

    .line 2
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO3/a;->a:Ljava/lang/Object;

    .line 3
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, LO3/a;->b:Ljava/io/Serializable;

    .line 4
    new-instance p1, LA1/c;

    const/16 p3, 0x1d

    invoke-direct {p1, p0, p3}, LA1/c;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, LO3/a;->c:Ljava/lang/Object;

    .line 5
    new-instance p3, Lc2/a;

    const/16 p4, 0xb

    invoke-direct {p3, p0, p4}, Lc2/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, p3}, Lq7/i;->d(Lu8/a;)V

    .line 6
    iget-object p3, p2, Lq7/i;->a:Ljava/lang/Object;

    monitor-enter p3

    .line 7
    :try_start_0
    iget-boolean p4, p2, Lq7/i;->b:Z

    if-nez p4, :cond_0

    .line 8
    iget-object p2, p2, Lq7/i;->d:Landroid/os/Handler;

    const-wide/16 p4, 0x96

    invoke-virtual {p2, p1, p4, p5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 9
    :cond_0
    :goto_0
    monitor-exit p3

    return-void

    :goto_1
    monitor-exit p3

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo1/c;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, LO3/a;->a:Ljava/lang/Object;

    .line 12
    iput-object p2, p0, LO3/a;->b:Ljava/io/Serializable;

    .line 13
    iput-object p3, p0, LO3/a;->g:Ljava/lang/Object;

    .line 14
    iput-object p4, p0, LO3/a;->c:Ljava/lang/Object;

    .line 15
    iput-object p5, p0, LO3/a;->d:Ljava/lang/Object;

    .line 16
    iput-object p6, p0, LO3/a;->e:Ljava/lang/Object;

    .line 17
    iput-object p7, p0, LO3/a;->f:Ljava/lang/Object;

    .line 18
    iput-object p8, p0, LO3/a;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(LJ4/c;)LO3/a;
    .locals 4

    .line 1
    iget-object v0, p0, LO3/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LO3/a;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lq7/i;

    .line 7
    .line 8
    new-instance v2, Ll7/b;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v2, p0, p1, v3}, Ll7/b;-><init>(LO3/a;LJ4/c;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lq7/i;->d(Lu8/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-object p0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    monitor-exit v0

    .line 21
    throw p1
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

.method public b(Ljava/util/List;Lv1/g;)V
    .locals 4

    .line 1
    new-instance v0, Ll7/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Ll7/c;-><init>(LO3/a;Ljava/util/List;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LO3/a;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter p1

    .line 10
    :try_start_0
    iget-object v1, p0, LO3/a;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lq7/i;

    .line 13
    .line 14
    new-instance v2, LA0/j;

    .line 15
    .line 16
    const/16 v3, 0x8

    .line 17
    .line 18
    invoke-direct {v2, p0, v0, p2, v3}, LA0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lq7/i;->d(Lu8/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    monitor-exit p1

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p2

    .line 27
    monitor-exit p1

    .line 28
    throw p2
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

.method public c(Ljava/util/List;Lx9/d;)V
    .locals 4

    .line 1
    new-instance v0, Ll7/c;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, p1, v1}, Ll7/c;-><init>(LO3/a;Ljava/util/List;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LO3/a;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter p1

    .line 10
    :try_start_0
    iget-object v1, p0, LO3/a;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lq7/i;

    .line 13
    .line 14
    new-instance v2, LA0/j;

    .line 15
    .line 16
    const/16 v3, 0x9

    .line 17
    .line 18
    invoke-direct {v2, p0, v0, p2, v3}, LA0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lq7/i;->d(Lu8/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    monitor-exit p1

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p2

    .line 27
    monitor-exit p1

    .line 28
    throw p2
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

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, LO3/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    monitor-exit v0

    .line 5
    return-void
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

.method public e(Ljava/util/List;Lza/c;)V
    .locals 4

    .line 1
    iget-object v0, p0, LO3/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LO3/a;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lq7/i;

    .line 7
    .line 8
    new-instance v2, LA0/j;

    .line 9
    .line 10
    const/16 v3, 0xb

    .line 11
    .line 12
    invoke-direct {v2, p0, p1, p2, v3}, LA0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lq7/i;->d(Lu8/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    monitor-exit v0

    .line 22
    throw p1
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
    .locals 5

    .line 1
    iget-object v0, p0, LO3/a;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq7/i;

    .line 4
    .line 5
    iget-object v1, p0, LO3/a;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LA1/c;

    .line 8
    .line 9
    const-string v2, "runnable"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, v0, Lq7/i;->a:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    iget-boolean v3, v0, Lq7/i;->b:Z

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    iget-object v0, v0, Lq7/i;->d:Landroid/os/Handler;

    .line 22
    .line 23
    const-wide/16 v3, 0x96

    .line 24
    .line 25
    invoke-virtual {v0, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    monitor-exit v2

    .line 32
    return-void

    .line 33
    :goto_1
    monitor-exit v2

    .line 34
    throw v0
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

.method public g(Ljava/util/List;LK3/d;)V
    .locals 4

    .line 1
    iget-object v0, p0, LO3/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LO3/a;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lq7/i;

    .line 7
    .line 8
    new-instance v2, LA0/j;

    .line 9
    .line 10
    const/16 v3, 0xc

    .line 11
    .line 12
    invoke-direct {v2, p0, p1, p2, v3}, LA0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lq7/i;->d(Lu8/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    monitor-exit v0

    .line 22
    throw p1
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

.method public h(Ljava/util/List;Lf4/e;)V
    .locals 4

    .line 1
    iget-object v0, p0, LO3/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LO3/a;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lq7/i;

    .line 7
    .line 8
    new-instance v2, LA0/j;

    .line 9
    .line 10
    const/16 v3, 0xd

    .line 11
    .line 12
    invoke-direct {v2, p0, p1, p2, v3}, LA0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lq7/i;->d(Lu8/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    monitor-exit v0

    .line 22
    throw p1
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
