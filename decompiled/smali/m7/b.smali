.class public final Lm7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public volatile a:Z

.field public final b:Lm7/a;

.field public final c:LJ4/c;


# direct methods
.method public constructor <init>(Lm7/a;LJ4/c;)V
    .locals 1

    .line 1
    const-string v0, "fetchListener"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lm7/b;->b:Lm7/a;

    .line 10
    .line 11
    iput-object p2, p0, Lm7/b;->c:LJ4/c;

    .line 12
    .line 13
    return-void
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


# virtual methods
.method public final a(Lcom/tonyodev/fetch2/database/DownloadInfo;Lcom/tonyodev/fetch2core/DownloadBlock;I)V
    .locals 1

    .line 1
    const-string v0, "download"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "downloadBlock"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lm7/b;->a:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lm7/b;->c:LJ4/c;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2, p3}, LJ4/c;->d(Lcom/tonyodev/fetch2/database/DownloadInfo;Lcom/tonyodev/fetch2core/DownloadBlock;I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
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
.end method

.method public final b(Lcom/tonyodev/fetch2/database/DownloadInfo;Lh7/b;Ljava/lang/Exception;)V
    .locals 5

    .line 1
    const-string v0, "download"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lm7/b;->a:Z

    .line 7
    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    sget-object v0, Lh7/b;->u:Lh7/b;

    .line 11
    .line 12
    sget-object v1, Lh7/f;->u:Lh7/f;

    .line 13
    .line 14
    iget-object v2, p1, Lcom/tonyodev/fetch2/database/DownloadInfo;->C:Lh7/b;

    .line 15
    .line 16
    sget-object v3, Lh7/b;->B:Lh7/b;

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    if-ne v2, v3, :cond_0

    .line 20
    .line 21
    iput-object v1, p1, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 22
    .line 23
    sget-object p2, Lp7/a;->a:Lh7/d;

    .line 24
    .line 25
    iput-object v0, p1, Lcom/tonyodev/fetch2/database/DownloadInfo;->C:Lh7/b;

    .line 26
    .line 27
    iget-object p2, p0, Lm7/b;->b:Lm7/a;

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Lm7/a;->b(Lcom/tonyodev/fetch2/database/DownloadInfo;)V

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, Lm7/b;->c:LJ4/c;

    .line 33
    .line 34
    invoke-virtual {p2, p1, v4}, LJ4/c;->h(Lcom/tonyodev/fetch2/Download;Z)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    iget v2, p1, Lcom/tonyodev/fetch2/database/DownloadInfo;->L:I

    .line 39
    .line 40
    const/4 v3, 0x2

    .line 41
    if-ge v2, v3, :cond_1

    .line 42
    .line 43
    add-int/2addr v2, v4

    .line 44
    iput v2, p1, Lcom/tonyodev/fetch2/database/DownloadInfo;->L:I

    .line 45
    .line 46
    iput-object v1, p1, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 47
    .line 48
    sget-object p2, Lp7/a;->a:Lh7/d;

    .line 49
    .line 50
    iput-object v0, p1, Lcom/tonyodev/fetch2/database/DownloadInfo;->C:Lh7/b;

    .line 51
    .line 52
    iget-object p2, p0, Lm7/b;->b:Lm7/a;

    .line 53
    .line 54
    invoke-virtual {p2, p1}, Lm7/a;->b(Lcom/tonyodev/fetch2/database/DownloadInfo;)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lm7/b;->c:LJ4/c;

    .line 58
    .line 59
    invoke-virtual {p2, p1, v4}, LJ4/c;->h(Lcom/tonyodev/fetch2/Download;Z)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    sget-object v0, Lh7/f;->z:Lh7/f;

    .line 64
    .line 65
    iput-object v0, p1, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 66
    .line 67
    iget-object v0, p0, Lm7/b;->b:Lm7/a;

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Lm7/a;->b(Lcom/tonyodev/fetch2/database/DownloadInfo;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lm7/b;->c:LJ4/c;

    .line 73
    .line 74
    invoke-virtual {v0, p1, p2, p3}, LJ4/c;->e(Lcom/tonyodev/fetch2/Download;Lh7/b;Ljava/lang/Exception;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    return-void
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
.end method

.method public final c(Lcom/tonyodev/fetch2/database/DownloadInfo;JJ)V
    .locals 7

    .line 1
    const-string v0, "download"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lm7/b;->a:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lm7/b;->c:LJ4/c;

    .line 11
    .line 12
    move-object v2, p1

    .line 13
    move-wide v3, p2

    .line 14
    move-wide v5, p4

    .line 15
    invoke-virtual/range {v1 .. v6}, LJ4/c;->g(Lcom/tonyodev/fetch2/database/DownloadInfo;JJ)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
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
.end method

.method public final d(Lcom/tonyodev/fetch2/database/DownloadInfo;Ljava/util/List;I)V
    .locals 1

    .line 1
    const-string v0, "download"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lm7/b;->a:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lh7/f;->v:Lh7/f;

    .line 11
    .line 12
    iput-object v0, p1, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 13
    .line 14
    iget-object v0, p0, Lm7/b;->b:Lm7/a;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lm7/a;->b(Lcom/tonyodev/fetch2/database/DownloadInfo;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lm7/b;->c:LJ4/c;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2, p3}, LJ4/c;->j(Lcom/tonyodev/fetch2/database/DownloadInfo;Ljava/util/List;I)V

    .line 22
    .line 23
    .line 24
    :cond_0
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
.end method

.method public final e(Lcom/tonyodev/fetch2/database/DownloadInfo;)V
    .locals 2

    .line 1
    const-string v0, "download"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lm7/b;->a:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lh7/f;->v:Lh7/f;

    .line 11
    .line 12
    iput-object v0, p1, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 13
    .line 14
    iget-object v0, p0, Lm7/b;->b:Lm7/a;

    .line 15
    .line 16
    iget-object v0, v0, Lm7/a;->a:Li7/g;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const-string v1, "downloadInfo"

    .line 22
    .line 23
    invoke-static {p1, v1}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, v0, Li7/g;->s:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v1

    .line 29
    :try_start_0
    iget-object v0, v0, Li7/g;->t:Li7/f;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Li7/f;->o(Lcom/tonyodev/fetch2/database/DownloadInfo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    monitor-exit v1

    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    monitor-exit v1

    .line 38
    throw p1

    .line 39
    :cond_0
    return-void
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
    .line 87
    .line 88
    .line 89
    .line 90
.end method
