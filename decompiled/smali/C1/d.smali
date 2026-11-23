.class public final LC1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/a;


# instance fields
.field public final s:Lo1/r;

.field public final t:Ljava/io/File;

.field public final u:J

.field public final v:Lo1/k;

.field public w:Lw1/c;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lo1/k;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, Lo1/k;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LC1/d;->v:Lo1/k;

    .line 11
    .line 12
    iput-object p1, p0, LC1/d;->t:Ljava/io/File;

    .line 13
    .line 14
    const-wide/32 v0, 0xfa00000

    .line 15
    .line 16
    .line 17
    iput-wide v0, p0, LC1/d;->u:J

    .line 18
    .line 19
    new-instance p1, Lo1/r;

    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    invoke-direct {p1, v0}, Lo1/r;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LC1/d;->s:Lo1/r;

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public final a(Ly1/e;)Ljava/io/File;
    .locals 3

    .line 1
    iget-object v0, p0, LC1/d;->s:Lo1/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lo1/r;->o(Ly1/e;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x2

    .line 8
    const-string v2, "DiskLruCacheWrapper"

    .line 9
    .line 10
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    :cond_0
    :try_start_0
    invoke-virtual {p0}, LC1/d;->b()Lw1/c;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1, v0}, Lw1/c;->i(Ljava/lang/String;)Lk7/e;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p1, Lk7/e;->s:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, [Ljava/io/File;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    aget-object p1, p1, v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    return-object p1

    .line 37
    :catch_0
    move-exception p1

    .line 38
    const/4 v0, 0x5

    .line 39
    invoke-static {v2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    const-string v0, "Unable to get from disk cache"

    .line 46
    .line 47
    invoke-static {v2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 48
    .line 49
    .line 50
    :cond_1
    const/4 p1, 0x0

    .line 51
    return-object p1
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

.method public final declared-synchronized b()Lw1/c;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LC1/d;->w:Lw1/c;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, LC1/d;->t:Ljava/io/File;

    .line 7
    .line 8
    iget-wide v1, p0, LC1/d;->u:J

    .line 9
    .line 10
    invoke-static {v0, v1, v2}, Lw1/c;->l(Ljava/io/File;J)Lw1/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, LC1/d;->w:Lw1/c;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    iget-object v0, p0, LC1/d;->w:Lw1/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return-object v0

    .line 23
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw v0
    .line 25
    .line 26
.end method

.method public final d(Ly1/e;LA1/h;)V
    .locals 6

    .line 1
    const-string v0, "Had two simultaneous puts for: "

    .line 2
    .line 3
    iget-object v1, p0, LC1/d;->s:Lo1/r;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lo1/r;->o(Ly1/e;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, LC1/d;->v:Lo1/k;

    .line 10
    .line 11
    monitor-enter v2

    .line 12
    :try_start_0
    iget-object v3, v2, Lo1/k;->s:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, LC1/b;

    .line 21
    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    iget-object v3, v2, Lo1/k;->t:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, LC1/c;

    .line 27
    .line 28
    invoke-virtual {v3}, LC1/c;->a()LC1/b;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iget-object v4, v2, Lo1/k;->s:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v4, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v4, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :cond_0
    :goto_0
    iget v4, v3, LC1/b;->b:I

    .line 44
    .line 45
    const/4 v5, 0x1

    .line 46
    add-int/2addr v4, v5

    .line 47
    iput v4, v3, LC1/b;->b:I

    .line 48
    .line 49
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    iget-object v2, v3, LC1/b;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 53
    .line 54
    .line 55
    :try_start_1
    const-string v2, "DiskLruCacheWrapper"

    .line 56
    .line 57
    const/4 v3, 0x2

    .line 58
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catchall_1
    move-exception p1

    .line 69
    goto :goto_4

    .line 70
    :cond_1
    :goto_1
    :try_start_2
    invoke-virtual {p0}, LC1/d;->b()Lw1/c;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1, v1}, Lw1/c;->i(Ljava/lang/String;)Lk7/e;

    .line 75
    .line 76
    .line 77
    move-result-object v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    iget-object p1, p0, LC1/d;->v:Lo1/k;

    .line 81
    .line 82
    invoke-virtual {p1, v1}, Lo1/k;->u(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_2
    :try_start_3
    invoke-virtual {p1, v1}, Lw1/c;->g(Ljava/lang/String;)LK0/g;

    .line 87
    .line 88
    .line 89
    move-result-object p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    :try_start_4
    invoke-virtual {p1}, LK0/g;->f()Ljava/io/File;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget-object v2, p2, LA1/h;->u:Ljava/lang/Object;

    .line 97
    .line 98
    iget-object v3, p2, LA1/h;->v:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v3, Ly1/h;

    .line 101
    .line 102
    iget-object p2, p2, LA1/h;->t:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p2, Ly1/b;

    .line 105
    .line 106
    invoke-interface {p2, v2, v0, v3}, Ly1/b;->a(Ljava/lang/Object;Ljava/io/File;Ly1/h;)Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-eqz p2, :cond_3

    .line 111
    .line 112
    iget-object p2, p1, LK0/g;->e:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p2, Lw1/c;

    .line 115
    .line 116
    invoke-static {p2, p1, v5}, Lw1/c;->a(Lw1/c;LK0/g;Z)V

    .line 117
    .line 118
    .line 119
    iput-boolean v5, p1, LK0/g;->b:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 120
    .line 121
    :cond_3
    :try_start_5
    iget-boolean p2, p1, LK0/g;->b:Z
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 122
    .line 123
    if-nez p2, :cond_6

    .line 124
    .line 125
    :try_start_6
    invoke-virtual {p1}, LK0/g;->c()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :catchall_2
    move-exception p2

    .line 130
    :try_start_7
    iget-boolean v0, p1, LK0/g;->b:Z
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 131
    .line 132
    if-nez v0, :cond_4

    .line 133
    .line 134
    :try_start_8
    invoke-virtual {p1}, LK0/g;->c()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 135
    .line 136
    .line 137
    :catch_0
    :cond_4
    :try_start_9
    throw p2

    .line 138
    :catch_1
    move-exception p1

    .line 139
    goto :goto_2

    .line 140
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p1
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 150
    :goto_2
    :try_start_a
    const-string p2, "DiskLruCacheWrapper"

    .line 151
    .line 152
    const/4 v0, 0x5

    .line 153
    invoke-static {p2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    if-eqz p2, :cond_6

    .line 158
    .line 159
    const-string p2, "DiskLruCacheWrapper"

    .line 160
    .line 161
    const-string v0, "Unable to put to disk cache"

    .line 162
    .line 163
    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 164
    .line 165
    .line 166
    :catch_2
    :cond_6
    :goto_3
    iget-object p1, p0, LC1/d;->v:Lo1/k;

    .line 167
    .line 168
    invoke-virtual {p1, v1}, Lo1/k;->u(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :goto_4
    iget-object p2, p0, LC1/d;->v:Lo1/k;

    .line 173
    .line 174
    invoke-virtual {p2, v1}, Lo1/k;->u(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw p1

    .line 178
    :goto_5
    :try_start_b
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 179
    throw p1
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
