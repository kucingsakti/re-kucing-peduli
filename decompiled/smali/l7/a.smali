.class public final Ll7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final A:Lo1/k;

.field public final B:LN4/e;

.field public final s:I

.field public final t:Ljava/util/LinkedHashSet;

.field public volatile u:Z

.field public final v:Li7/g;

.field public final w:Lk7/a;

.field public final x:Lm7/e;

.field public final y:Lq7/f;

.field public final z:LV3/b;


# direct methods
.method public constructor <init>(Li7/g;Lk7/a;Lm7/e;Lq7/f;Ls7/a;Lh7/d;LV3/b;Landroid/os/Handler;Lo1/k;LN4/e;LY1/c;)V
    .locals 0

    .line 1
    const-string p5, "logger"

    .line 2
    .line 3
    invoke-static {p4, p5}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p5, "fileServerDownloader"

    .line 7
    .line 8
    invoke-static {p6, p5}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p5, "uiHandler"

    .line 12
    .line 13
    invoke-static {p8, p5}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p5, "prioritySort"

    .line 17
    .line 18
    const/4 p6, 0x1

    .line 19
    invoke-static {p6, p5}, Landroidx/datastore/preferences/protobuf/g;->v(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Ll7/a;->v:Li7/g;

    .line 26
    .line 27
    iput-object p2, p0, Ll7/a;->w:Lk7/a;

    .line 28
    .line 29
    iput-object p3, p0, Ll7/a;->x:Lm7/e;

    .line 30
    .line 31
    iput-object p4, p0, Ll7/a;->y:Lq7/f;

    .line 32
    .line 33
    iput-object p7, p0, Ll7/a;->z:LV3/b;

    .line 34
    .line 35
    iput-object p9, p0, Ll7/a;->A:Lo1/k;

    .line 36
    .line 37
    iput-object p10, p0, Ll7/a;->B:LN4/e;

    .line 38
    .line 39
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/util/UUID;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iput p1, p0, Ll7/a;->s:I

    .line 48
    .line 49
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Ll7/a;->t:Ljava/util/LinkedHashSet;

    .line 55
    .line 56
    return-void
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
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 16
    .line 17
    iget-object v1, p0, Ll7/a;->w:Lk7/a;

    .line 18
    .line 19
    iget v0, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 20
    .line 21
    iget-object v2, v1, Lk7/a;->s:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v2

    .line 24
    :try_start_0
    invoke-virtual {v1, v0}, Lk7/a;->h(I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    monitor-exit v2

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    monitor-exit v2

    .line 31
    throw p1

    .line 32
    :cond_0
    return-void
    .line 33
.end method

.method public final b(Z)Z
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "Looper.getMainLooper()"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lv8/i;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v0, v1}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_4

    .line 23
    .line 24
    iget-object v0, p0, Ll7/a;->v:Li7/g;

    .line 25
    .line 26
    iget-object v1, v0, Li7/g;->s:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v1

    .line 29
    :try_start_0
    iget-object v0, v0, Li7/g;->t:Li7/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    const-wide/16 v2, -0x1

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    :try_start_1
    iget-object p1, v0, Li7/f;->x:Ljava/lang/String;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p1, v0, Li7/f;->w:Ljava/lang/String;

    .line 39
    .line 40
    :goto_0
    iget-object v0, v0, Li7/f;->v:LP0/c;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, LP0/c;->n(Ljava/lang/String;)Landroid/database/Cursor;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    int-to-long v4, v0

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-wide v4, v2

    .line 55
    :goto_1
    if-eqz p1, :cond_2

    .line 56
    .line 57
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    .line 60
    :cond_2
    move-wide v2, v4

    .line 61
    :catch_0
    monitor-exit v1

    .line 62
    const-wide/16 v0, 0x0

    .line 63
    .line 64
    cmp-long p1, v2, v0

    .line 65
    .line 66
    if-lez p1, :cond_3

    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    return p1

    .line 70
    :cond_3
    const/4 p1, 0x0

    .line 71
    return p1

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    monitor-exit v1

    .line 74
    throw p1

    .line 75
    :cond_4
    new-instance p1, Lcom/tonyodev/fetch2/exception/FetchException;

    .line 76
    .line 77
    const-string v0, "blocking_call_on_ui_thread"

    .line 78
    .line 79
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final c(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Ll7/a;->a(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 26
    .line 27
    const-string v2, "download"

    .line 28
    .line 29
    invoke-static {v1, v2}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v2, v1, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/4 v3, 0x1

    .line 39
    if-eq v2, v3, :cond_0

    .line 40
    .line 41
    const/4 v3, 0x2

    .line 42
    if-eq v2, v3, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    sget-object v2, Lh7/f;->w:Lh7/f;

    .line 46
    .line 47
    iput-object v2, v1, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-object p1, p0, Ll7/a;->v:Li7/g;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Li7/g;->i(Ljava/util/ArrayList;)V

    .line 56
    .line 57
    .line 58
    return-object v0
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

.method public final close()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Ll7/a;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Ll7/a;->u:Z

    .line 8
    .line 9
    iget-object v0, p0, Ll7/a;->t:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    iget-object v1, p0, Ll7/a;->t:Ljava/util/LinkedHashSet;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, LJ4/c;

    .line 29
    .line 30
    iget-object v3, p0, Ll7/a;->z:LV3/b;

    .line 31
    .line 32
    iget v4, p0, Ll7/a;->s:I

    .line 33
    .line 34
    invoke-virtual {v3, v4, v2}, LV3/b;->h(ILJ4/c;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    iget-object v1, p0, Ll7/a;->t:Ljava/util/LinkedHashSet;

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Set;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    monitor-exit v0

    .line 46
    iget-object v0, p0, Ll7/a;->B:LN4/e;

    .line 47
    .line 48
    iget-object v1, p0, Ll7/a;->z:LV3/b;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, LV3/b;->i(LN4/e;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Ll7/a;->z:LV3/b;

    .line 54
    .line 55
    iget-object v1, p0, Ll7/a;->B:LN4/e;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, LV3/b;->b(LN4/e;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Ll7/a;->x:Lm7/e;

    .line 61
    .line 62
    invoke-virtual {v0}, Lm7/e;->h()V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Ll7/a;->x:Lm7/e;

    .line 66
    .line 67
    invoke-virtual {v0}, Lm7/e;->close()V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Ll7/a;->w:Lk7/a;

    .line 71
    .line 72
    invoke-virtual {v0}, Lk7/a;->close()V

    .line 73
    .line 74
    .line 75
    invoke-static {}, Ll7/e;->a()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :goto_1
    monitor-exit v0

    .line 80
    throw v1
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
.end method

.method public final g(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    iget-object v0, p0, Ll7/a;->v:Li7/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li7/g;->a(Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Li8/k;->R(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 31
    .line 32
    iget v3, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 33
    .line 34
    iget-object v4, p0, Ll7/a;->w:Lk7/a;

    .line 35
    .line 36
    invoke-virtual {v4, v3}, Lk7/a;->i(I)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_0

    .line 41
    .line 42
    iget-object v3, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const/4 v4, 0x1

    .line 49
    if-eq v3, v4, :cond_1

    .line 50
    .line 51
    const/4 v4, 0x3

    .line 52
    if-eq v3, v4, :cond_1

    .line 53
    .line 54
    const/16 v4, 0x9

    .line 55
    .line 56
    if-eq v3, v4, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    sget-object v3, Lh7/f;->u:Lh7/f;

    .line 60
    .line 61
    iput-object v3, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {v0, v1}, Li7/g;->i(Ljava/util/ArrayList;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Ll7/a;->i()V

    .line 71
    .line 72
    .line 73
    return-object v1
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

.method public final h(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    iget-object v0, p0, Ll7/a;->v:Li7/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li7/g;->a(Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Li8/k;->R(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 31
    .line 32
    const-string v3, "download"

    .line 33
    .line 34
    invoke-static {v2, v3}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v3, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/4 v4, 0x5

    .line 44
    if-eq v3, v4, :cond_0

    .line 45
    .line 46
    const/4 v4, 0x6

    .line 47
    if-eq v3, v4, :cond_0

    .line 48
    .line 49
    const/16 v4, 0x9

    .line 50
    .line 51
    if-eq v3, v4, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    sget-object v3, Lh7/f;->u:Lh7/f;

    .line 55
    .line 56
    iput-object v3, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 57
    .line 58
    sget-object v3, Lp7/a;->a:Lh7/d;

    .line 59
    .line 60
    sget-object v3, Lh7/b;->u:Lh7/b;

    .line 61
    .line 62
    iput-object v3, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->C:Lh7/b;

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-virtual {v0, v1}, Li7/g;->i(Ljava/util/ArrayList;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Ll7/a;->i()V

    .line 72
    .line 73
    .line 74
    return-object v1
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

.method public final i()V
    .locals 5

    .line 1
    iget-object v0, p0, Ll7/a;->x:Lm7/e;

    .line 2
    .line 3
    iget-object v1, v0, Lm7/e;->s:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    .line 7
    .line 8
    const-string v3, "com.tonyodev.fetch2.action.QUEUE_BACKOFF_RESET"

    .line 9
    .line 10
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v3, "com.tonyodev.fetch2.extra.NAMESPACE"

    .line 14
    .line 15
    const-string v4, "LibGlobalFetchLib"

    .line 16
    .line 17
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Lm7/e;->E:Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit v1

    .line 26
    iget-object v0, p0, Ll7/a;->x:Lm7/e;

    .line 27
    .line 28
    iget-boolean v0, v0, Lm7/e;->t:Z

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    iget-boolean v0, p0, Ll7/a;->u:Z

    .line 33
    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    iget-object v0, p0, Ll7/a;->x:Lm7/e;

    .line 37
    .line 38
    invoke-virtual {v0}, Lm7/e;->g()V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    monitor-exit v1

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
