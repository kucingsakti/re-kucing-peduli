.class public final LA1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LA1/c;ZZ)V
    .locals 0

    const/16 p2, 0x1c

    iput p2, p0, LA1/c;->s:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA1/c;->t:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LM2/v;Z)V
    .locals 0

    const/16 p2, 0x8

    iput p2, p0, LA1/c;->s:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA1/c;->t:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, LA1/c;->s:I

    iput-object p1, p0, LA1/c;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 3
    iput p2, p0, LA1/c;->s:I

    iput-object p1, p0, LA1/c;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b()V
    .locals 5

    .line 1
    iget-object v0, p0, LA1/c;->t:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LK0/i;

    .line 4
    .line 5
    iget-object v0, v0, LK0/i;->a:LK0/m;

    .line 6
    .line 7
    iget-object v0, v0, LK0/m;->h:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "readWriteLock.readLock()"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 19
    .line 20
    .line 21
    :try_start_0
    iget-object v1, p0, LA1/c;->t:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, LK0/i;

    .line 24
    .line 25
    invoke-virtual {v1}, LK0/i;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, LA1/c;->t:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, LK0/i;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    :try_start_1
    iget-object v1, p0, LA1/c;->t:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, LK0/i;

    .line 45
    .line 46
    iget-object v1, v1, LK0/i;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 51
    .line 52
    .line 53
    move-result v1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, LA1/c;->t:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, LK0/i;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    :try_start_2
    iget-object v1, p0, LA1/c;->t:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, LK0/i;

    .line 70
    .line 71
    iget-object v1, v1, LK0/i;->a:LK0/m;

    .line 72
    .line 73
    invoke-virtual {v1}, LK0/m;->g()LO0/c;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-interface {v1}, LO0/c;->S()LP0/c;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, LP0/c;->i()Z

    .line 82
    .line 83
    .line 84
    move-result v1
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, LA1/c;->t:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, LK0/i;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_2
    :try_start_3
    iget-object v1, p0, LA1/c;->t:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, LK0/i;

    .line 101
    .line 102
    iget-object v1, v1, LK0/i;->a:LK0/m;

    .line 103
    .line 104
    invoke-virtual {v1}, LK0/m;->g()LO0/c;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-interface {v1}, LO0/c;->S()LP0/c;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, LP0/c;->b()V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 113
    .line 114
    .line 115
    :try_start_4
    invoke-virtual {p0}, LA1/c;->a()Lj8/h;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v1}, LP0/c;->o()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 120
    .line 121
    .line 122
    :try_start_5
    invoke-virtual {v1}, LP0/c;->g()V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 123
    .line 124
    .line 125
    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, LA1/c;->t:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, LK0/i;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :catchall_0
    move-exception v1

    .line 137
    goto :goto_5

    .line 138
    :catchall_1
    move-exception v2

    .line 139
    :try_start_6
    invoke-virtual {v1}, LP0/c;->g()V

    .line 140
    .line 141
    .line 142
    throw v2
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 143
    :catch_0
    :try_start_7
    sget-object v2, Li8/u;->s:Li8/u;

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :catch_1
    sget-object v2, Li8/u;->s:Li8/u;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :goto_1
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_4

    .line 154
    .line 155
    iget-object v0, p0, LA1/c;->t:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, LK0/i;

    .line 158
    .line 159
    iget-object v1, v0, LK0/i;->i:Lr/f;

    .line 160
    .line 161
    monitor-enter v1

    .line 162
    :try_start_8
    iget-object v0, v0, LK0/i;->i:Lr/f;

    .line 163
    .line 164
    invoke-virtual {v0}, Lr/f;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    :goto_2
    move-object v3, v0

    .line 169
    check-cast v3, Lr/b;

    .line 170
    .line 171
    invoke-virtual {v3}, Lr/b;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-eqz v4, :cond_3

    .line 176
    .line 177
    invoke-virtual {v3}, Lr/b;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    check-cast v3, Ljava/util/Map$Entry;

    .line 182
    .line 183
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    check-cast v3, LK0/h;

    .line 188
    .line 189
    invoke-virtual {v3, v2}, LK0/h;->a(Ljava/util/Set;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :catchall_2
    move-exception v0

    .line 194
    goto :goto_3

    .line 195
    :cond_3
    monitor-exit v1

    .line 196
    goto :goto_4

    .line 197
    :goto_3
    monitor-exit v1

    .line 198
    throw v0

    .line 199
    :cond_4
    :goto_4
    return-void

    .line 200
    :goto_5
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 201
    .line 202
    .line 203
    iget-object v0, p0, LA1/c;->t:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v0, LK0/i;

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    throw v1
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
.end method

.method private final c()V
    .locals 2

    .line 1
    iget-object v0, p0, LA1/c;->t:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LP2/d;

    .line 4
    .line 5
    iget-object v0, v0, LP2/d;->t:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, LA1/c;->t:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LP2/d;

    .line 11
    .line 12
    iget-object v1, v1, LP2/d;->v:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lcom/google/android/gms/tasks/OnCanceledListener;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v1}, Lcom/google/android/gms/tasks/OnCanceledListener;->h()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw v1
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
.end method

.method private final d()V
    .locals 8

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, LA1/c;->t:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Laa/c;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-virtual {v0}, Laa/c;->c()Laa/a;

    .line 7
    .line 8
    .line 9
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 10
    monitor-exit v0

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    iget-object v0, v1, Laa/a;->c:Laa/b;

    .line 15
    .line 16
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, LA1/c;->t:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Laa/c;

    .line 22
    .line 23
    sget-object v3, Laa/c;->i:Ljava/util/logging/Logger;

    .line 24
    .line 25
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    iget-object v4, v0, Laa/b;->a:Laa/c;

    .line 34
    .line 35
    iget-object v4, v4, Laa/c;->a:LP0/d;

    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    const-string v6, "starting"

    .line 42
    .line 43
    invoke-static {v1, v0, v6}, Ls3/a;->a(Laa/a;Laa/b;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const-wide/16 v4, -0x1

    .line 48
    .line 49
    :goto_1
    :try_start_1
    invoke-static {v2, v1}, Laa/c;->a(Laa/c;Laa/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    iget-object v2, v0, Laa/b;->a:Laa/c;

    .line 55
    .line 56
    iget-object v2, v2, Laa/c;->a:LP0/d;

    .line 57
    .line 58
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    sub-long/2addr v2, v4

    .line 63
    const-string v4, "finished run in "

    .line 64
    .line 65
    invoke-static {v2, v3}, Ls3/a;->h(J)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {v2, v4}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v1, v0, v2}, Ls3/a;->a(Laa/a;Laa/b;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception v6

    .line 78
    :try_start_2
    iget-object v2, v2, Laa/c;->a:LP0/d;

    .line 79
    .line 80
    iget-object v2, v2, LP0/d;->t:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 83
    .line 84
    invoke-virtual {v2, p0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 85
    .line 86
    .line 87
    throw v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 88
    :catchall_1
    move-exception v2

    .line 89
    if-eqz v3, :cond_3

    .line 90
    .line 91
    iget-object v3, v0, Laa/b;->a:Laa/c;

    .line 92
    .line 93
    iget-object v3, v3, Laa/c;->a:LP0/d;

    .line 94
    .line 95
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 96
    .line 97
    .line 98
    move-result-wide v6

    .line 99
    sub-long/2addr v6, v4

    .line 100
    const-string v3, "failed a run in "

    .line 101
    .line 102
    invoke-static {v6, v7}, Ls3/a;->h(J)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-static {v4, v3}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-static {v1, v0, v3}, Ls3/a;->a(Laa/a;Laa/b;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    throw v2

    .line 114
    :catchall_2
    move-exception v1

    .line 115
    monitor-exit v0

    .line 116
    throw v1
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
.end method

.method private final e()V
    .locals 4

    .line 1
    iget-object v0, p0, LA1/c;->t:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/A;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/lifecycle/A;->a:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, LA1/c;->t:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroidx/lifecycle/A;

    .line 11
    .line 12
    iget-object v1, v1, Landroidx/lifecycle/A;->f:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v2, p0, LA1/c;->t:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Landroidx/lifecycle/A;

    .line 17
    .line 18
    sget-object v3, Landroidx/lifecycle/A;->k:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object v3, v2, Landroidx/lifecycle/A;->f:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    iget-object v0, p0, LA1/c;->t:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Landroidx/lifecycle/A;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroidx/lifecycle/A;->e(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw v1
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
.end method

.method private final f()V
    .locals 3

    .line 1
    iget-object v0, p0, LA1/c;->t:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA1/c;

    .line 4
    .line 5
    iget-object v1, v0, LA1/c;->t:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LO3/a;

    .line 8
    .line 9
    iget-object v1, v1, LO3/a;->a:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    monitor-exit v1

    .line 13
    iget-object v1, v0, LA1/c;->t:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, LO3/a;

    .line 16
    .line 17
    iget-object v1, v1, LO3/a;->b:Ljava/io/Serializable;

    .line 18
    .line 19
    check-cast v1, Ljava/util/LinkedHashSet;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    iget-object v1, v0, LA1/c;->t:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, LO3/a;

    .line 34
    .line 35
    invoke-virtual {v1}, LO3/a;->d()V

    .line 36
    .line 37
    .line 38
    iget-object v0, v0, LA1/c;->t:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, LO3/a;

    .line 41
    .line 42
    invoke-virtual {v0}, LO3/a;->f()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    invoke-static {v1}, LE0/a;->e(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    throw v0
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
.method public a()Lj8/h;
    .locals 4

    .line 1
    iget-object v0, p0, LA1/c;->t:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LK0/i;

    .line 4
    .line 5
    new-instance v1, Lj8/h;

    .line 6
    .line 7
    invoke-direct {v1}, Lj8/h;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, LK0/i;->a:LK0/m;

    .line 11
    .line 12
    new-instance v2, LL8/x;

    .line 13
    .line 14
    const-string v3, "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"

    .line 15
    .line 16
    invoke-direct {v2, v3}, LL8/x;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, LK0/m;->m(LO0/e;)Landroid/database/Cursor;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_0
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1, v2}, Lj8/h;->add(Ljava/lang/Object;)Z
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
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Li8/C;->d(Lj8/h;)Lj8/h;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v1, v0, Lj8/h;->s:Lj8/e;

    .line 52
    .line 53
    invoke-virtual {v1}, Lj8/e;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    iget-object v1, p0, LA1/c;->t:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, LK0/i;

    .line 62
    .line 63
    iget-object v1, v1, LK0/i;->g:LP0/j;

    .line 64
    .line 65
    const-string v2, "Required value was null."

    .line 66
    .line 67
    if-eqz v1, :cond_2

    .line 68
    .line 69
    iget-object v1, p0, LA1/c;->t:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, LK0/i;

    .line 72
    .line 73
    iget-object v1, v1, LK0/i;->g:LP0/j;

    .line 74
    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    invoke-virtual {v1}, LP0/j;->a()I

    .line 78
    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 82
    .line 83
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v0

    .line 93
    :cond_3
    return-object v0

    .line 94
    :goto_1
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    :catchall_1
    move-exception v2

    .line 96
    invoke-static {v0, v1}, Lcom/bumptech/glide/c;->c(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    throw v2
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
.end method

.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v2, 0x2

    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x1

    .line 9
    const/4 v7, 0x0

    .line 10
    iget v8, v1, LA1/c;->s:I

    .line 11
    .line 12
    packed-switch v8, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, LO3/a;

    .line 18
    .line 19
    iget-object v2, v0, LO3/a;->a:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v2

    .line 22
    monitor-exit v2

    .line 23
    iget-object v2, v0, LO3/a;->f:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Ll7/a;

    .line 26
    .line 27
    invoke-virtual {v2, v6}, Ll7/a;->b(Z)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v3, v0, LO3/a;->f:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Ll7/a;

    .line 34
    .line 35
    invoke-virtual {v3, v7}, Ll7/a;->b(Z)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    iget-object v0, v0, LO3/a;->e:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Landroid/os/Handler;

    .line 42
    .line 43
    new-instance v4, LA1/c;

    .line 44
    .line 45
    invoke-direct {v4, v1, v2, v3}, LA1/c;-><init>(LA1/c;ZZ)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_0
    invoke-direct {v1}, LA1/c;->f()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_1
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lk/e;

    .line 59
    .line 60
    invoke-virtual {v0, v6}, Lk/e;->a(Z)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_2
    iget-object v2, v1, LA1/c;->t:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Lj0/e;

    .line 70
    .line 71
    iget-object v3, v2, Lj0/e;->b:Ld0/f;

    .line 72
    .line 73
    iget v3, v3, Ld0/f;->o:I

    .line 74
    .line 75
    iget v4, v2, Lj0/e;->a:I

    .line 76
    .line 77
    if-ne v4, v0, :cond_0

    .line 78
    .line 79
    move v5, v6

    .line 80
    goto :goto_0

    .line 81
    :cond_0
    move v5, v7

    .line 82
    :goto_0
    iget-object v8, v2, Lj0/e;->d:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 83
    .line 84
    const/4 v9, 0x5

    .line 85
    if-eqz v5, :cond_2

    .line 86
    .line 87
    invoke-virtual {v8, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->f(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    if-eqz v10, :cond_1

    .line 92
    .line 93
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    neg-int v11, v11

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    move v11, v7

    .line 100
    :goto_1
    add-int/2addr v11, v3

    .line 101
    goto :goto_2

    .line 102
    :cond_2
    invoke-virtual {v8, v9}, Landroidx/drawerlayout/widget/DrawerLayout;->f(I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    .line 107
    .line 108
    .line 109
    move-result v11

    .line 110
    sub-int/2addr v11, v3

    .line 111
    :goto_2
    if-eqz v10, :cond_8

    .line 112
    .line 113
    if-eqz v5, :cond_3

    .line 114
    .line 115
    invoke-virtual {v10}, Landroid/view/View;->getLeft()I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-lt v3, v11, :cond_4

    .line 120
    .line 121
    :cond_3
    if-nez v5, :cond_8

    .line 122
    .line 123
    invoke-virtual {v10}, Landroid/view/View;->getLeft()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-le v3, v11, :cond_8

    .line 128
    .line 129
    :cond_4
    invoke-virtual {v8, v10}, Landroidx/drawerlayout/widget/DrawerLayout;->j(Landroid/view/View;)I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-nez v3, :cond_8

    .line 134
    .line 135
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    check-cast v3, Lj0/d;

    .line 140
    .line 141
    iget-object v2, v2, Lj0/e;->b:Ld0/f;

    .line 142
    .line 143
    invoke-virtual {v10}, Landroid/view/View;->getTop()I

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    invoke-virtual {v2, v10, v11, v5}, Ld0/f;->r(Landroid/view/View;II)Z

    .line 148
    .line 149
    .line 150
    iput-boolean v6, v3, Lj0/d;->c:Z

    .line 151
    .line 152
    invoke-virtual {v8}, Landroid/view/View;->invalidate()V

    .line 153
    .line 154
    .line 155
    if-ne v4, v0, :cond_5

    .line 156
    .line 157
    move v0, v9

    .line 158
    :cond_5
    invoke-virtual {v8, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->f(I)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    if-eqz v0, :cond_6

    .line 163
    .line 164
    invoke-virtual {v8, v0, v6}, Landroidx/drawerlayout/widget/DrawerLayout;->c(Landroid/view/View;Z)V

    .line 165
    .line 166
    .line 167
    :cond_6
    iget-boolean v0, v8, Landroidx/drawerlayout/widget/DrawerLayout;->J:Z

    .line 168
    .line 169
    if-nez v0, :cond_8

    .line 170
    .line 171
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 172
    .line 173
    .line 174
    move-result-wide v9

    .line 175
    const/4 v13, 0x3

    .line 176
    const/4 v14, 0x0

    .line 177
    const/4 v15, 0x0

    .line 178
    const/16 v16, 0x0

    .line 179
    .line 180
    move-wide v11, v9

    .line 181
    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v8}, Landroid/view/ViewGroup;->getChildCount()I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    :goto_3
    if-ge v7, v2, :cond_7

    .line 190
    .line 191
    invoke-virtual {v8, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-virtual {v3, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 196
    .line 197
    .line 198
    add-int/2addr v7, v6

    .line 199
    goto :goto_3

    .line 200
    :cond_7
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 201
    .line 202
    .line 203
    iput-boolean v6, v8, Landroidx/drawerlayout/widget/DrawerLayout;->J:Z

    .line 204
    .line 205
    :cond_8
    return-void

    .line 206
    :pswitch_3
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, Li/M;

    .line 209
    .line 210
    iget-object v2, v0, Li/M;->c:Li/z;

    .line 211
    .line 212
    invoke-virtual {v0}, Li/M;->a0()Landroid/view/Menu;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    instance-of v3, v0, Lo/l;

    .line 217
    .line 218
    if-eqz v3, :cond_9

    .line 219
    .line 220
    move-object v3, v0

    .line 221
    check-cast v3, Lo/l;

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_9
    move-object v3, v5

    .line 225
    :goto_4
    if-eqz v3, :cond_a

    .line 226
    .line 227
    invoke-virtual {v3}, Lo/l;->y()V

    .line 228
    .line 229
    .line 230
    :cond_a
    :try_start_0
    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v7, v0}, Li/z;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    if-eqz v4, :cond_b

    .line 238
    .line 239
    invoke-virtual {v2, v7, v5, v0}, Li/z;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-nez v2, :cond_c

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :catchall_0
    move-exception v0

    .line 247
    goto :goto_6

    .line 248
    :cond_b
    :goto_5
    invoke-interface {v0}, Landroid/view/Menu;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 249
    .line 250
    .line 251
    :cond_c
    if-eqz v3, :cond_d

    .line 252
    .line 253
    invoke-virtual {v3}, Lo/l;->x()V

    .line 254
    .line 255
    .line 256
    :cond_d
    return-void

    .line 257
    :goto_6
    if-eqz v3, :cond_e

    .line 258
    .line 259
    invoke-virtual {v3}, Lo/l;->x()V

    .line 260
    .line 261
    .line 262
    :cond_e
    throw v0

    .line 263
    :pswitch_4
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 264
    .line 265
    move-object v2, v0

    .line 266
    check-cast v2, Landroidx/work/Worker;

    .line 267
    .line 268
    :try_start_1
    invoke-virtual {v2}, Landroidx/work/Worker;->a()Lf1/n;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    iget-object v3, v2, Landroidx/work/Worker;->s:Lq1/k;

    .line 273
    .line 274
    invoke-virtual {v3, v0}, Lq1/k;->j(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 275
    .line 276
    .line 277
    goto :goto_7

    .line 278
    :catchall_1
    move-exception v0

    .line 279
    iget-object v2, v2, Landroidx/work/Worker;->s:Lq1/k;

    .line 280
    .line 281
    invoke-virtual {v2, v0}, Lq1/k;->k(Ljava/lang/Throwable;)Z

    .line 282
    .line 283
    .line 284
    :goto_7
    return-void

    .line 285
    :pswitch_5
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v0, Ld0/f;

    .line 288
    .line 289
    invoke-virtual {v0, v7}, Ld0/f;->o(I)V

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :pswitch_6
    :try_start_2
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v0, Ld/m;

    .line 296
    .line 297
    invoke-static {v0}, Ld/m;->f(Ld/m;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_0

    .line 298
    .line 299
    .line 300
    goto :goto_a

    .line 301
    :catch_0
    move-exception v0

    .line 302
    goto :goto_8

    .line 303
    :catch_1
    move-exception v0

    .line 304
    goto :goto_9

    .line 305
    :goto_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    const-string v3, "Attempt to invoke virtual method \'android.os.Handler android.app.FragmentHostCallback.getHandler()\' on a null object reference"

    .line 310
    .line 311
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    if-eqz v2, :cond_f

    .line 316
    .line 317
    goto :goto_a

    .line 318
    :cond_f
    throw v0

    .line 319
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    const-string v3, "Can not perform this action after onSaveInstanceState"

    .line 324
    .line 325
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    if-eqz v2, :cond_10

    .line 330
    .line 331
    :goto_a
    return-void

    .line 332
    :cond_10
    throw v0

    .line 333
    :pswitch_7
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v0, Lcom/unity3d/scar/adapter/common/f;

    .line 336
    .line 337
    iget-object v0, v0, Lcom/unity3d/scar/adapter/common/f;->c:Lu7/a;

    .line 338
    .line 339
    invoke-interface {v0}, Lu7/a;->a()V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
    :pswitch_8
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v0, Lcom/bumptech/glide/l;

    .line 346
    .line 347
    iget-object v2, v0, Lcom/bumptech/glide/l;->u:LN1/g;

    .line 348
    .line 349
    invoke-interface {v2, v0}, LN1/g;->b(LN1/i;)V

    .line 350
    .line 351
    .line 352
    return-void

    .line 353
    :pswitch_9
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v0, Lb1/e;

    .line 356
    .line 357
    iput-boolean v7, v0, Lb1/e;->k:Z

    .line 358
    .line 359
    invoke-virtual {v0}, Lb1/e;->o()V

    .line 360
    .line 361
    .line 362
    return-void

    .line 363
    :pswitch_a
    invoke-direct {v1}, LA1/c;->e()V

    .line 364
    .line 365
    .line 366
    return-void

    .line 367
    :pswitch_b
    invoke-direct {v1}, LA1/c;->d()V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :pswitch_c
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v0, La0/g;

    .line 374
    .line 375
    iget-boolean v2, v0, La0/g;->G:Z

    .line 376
    .line 377
    if-nez v2, :cond_11

    .line 378
    .line 379
    goto/16 :goto_c

    .line 380
    .line 381
    :cond_11
    iget-boolean v2, v0, La0/g;->E:Z

    .line 382
    .line 383
    iget-object v5, v0, La0/g;->s:La0/a;

    .line 384
    .line 385
    if-eqz v2, :cond_12

    .line 386
    .line 387
    iput-boolean v7, v0, La0/g;->E:Z

    .line 388
    .line 389
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 390
    .line 391
    .line 392
    move-result-wide v8

    .line 393
    iput-wide v8, v5, La0/a;->e:J

    .line 394
    .line 395
    const-wide/16 v10, -0x1

    .line 396
    .line 397
    iput-wide v10, v5, La0/a;->g:J

    .line 398
    .line 399
    iput-wide v8, v5, La0/a;->f:J

    .line 400
    .line 401
    const/high16 v2, 0x3f000000    # 0.5f

    .line 402
    .line 403
    iput v2, v5, La0/a;->h:F

    .line 404
    .line 405
    :cond_12
    iget-wide v8, v5, La0/a;->g:J

    .line 406
    .line 407
    cmp-long v2, v8, v3

    .line 408
    .line 409
    if-lez v2, :cond_13

    .line 410
    .line 411
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 412
    .line 413
    .line 414
    move-result-wide v8

    .line 415
    iget-wide v10, v5, La0/a;->g:J

    .line 416
    .line 417
    iget v2, v5, La0/a;->i:I

    .line 418
    .line 419
    int-to-long v12, v2

    .line 420
    add-long/2addr v10, v12

    .line 421
    cmp-long v2, v8, v10

    .line 422
    .line 423
    if-lez v2, :cond_13

    .line 424
    .line 425
    goto :goto_b

    .line 426
    :cond_13
    invoke-virtual {v0}, La0/g;->e()Z

    .line 427
    .line 428
    .line 429
    move-result v2

    .line 430
    if-nez v2, :cond_14

    .line 431
    .line 432
    :goto_b
    iput-boolean v7, v0, La0/g;->G:Z

    .line 433
    .line 434
    goto :goto_c

    .line 435
    :cond_14
    iget-boolean v2, v0, La0/g;->F:Z

    .line 436
    .line 437
    iget-object v6, v0, La0/g;->u:Landroid/widget/ListView;

    .line 438
    .line 439
    if-eqz v2, :cond_15

    .line 440
    .line 441
    iput-boolean v7, v0, La0/g;->F:Z

    .line 442
    .line 443
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 444
    .line 445
    .line 446
    move-result-wide v8

    .line 447
    const/4 v14, 0x0

    .line 448
    const/4 v15, 0x0

    .line 449
    const/4 v12, 0x3

    .line 450
    const/4 v13, 0x0

    .line 451
    move-wide v10, v8

    .line 452
    invoke-static/range {v8 .. v15}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    invoke-virtual {v6, v2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 457
    .line 458
    .line 459
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 460
    .line 461
    .line 462
    :cond_15
    iget-wide v7, v5, La0/a;->f:J

    .line 463
    .line 464
    cmp-long v2, v7, v3

    .line 465
    .line 466
    if-eqz v2, :cond_16

    .line 467
    .line 468
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 469
    .line 470
    .line 471
    move-result-wide v2

    .line 472
    invoke-virtual {v5, v2, v3}, La0/a;->a(J)F

    .line 473
    .line 474
    .line 475
    move-result v4

    .line 476
    const/high16 v7, -0x3f800000    # -4.0f

    .line 477
    .line 478
    mul-float/2addr v7, v4

    .line 479
    mul-float/2addr v7, v4

    .line 480
    const/high16 v8, 0x40800000    # 4.0f

    .line 481
    .line 482
    mul-float/2addr v4, v8

    .line 483
    add-float/2addr v4, v7

    .line 484
    iget-wide v7, v5, La0/a;->f:J

    .line 485
    .line 486
    sub-long v7, v2, v7

    .line 487
    .line 488
    iput-wide v2, v5, La0/a;->f:J

    .line 489
    .line 490
    long-to-float v2, v7

    .line 491
    mul-float/2addr v2, v4

    .line 492
    iget v3, v5, La0/a;->d:F

    .line 493
    .line 494
    mul-float/2addr v2, v3

    .line 495
    float-to-int v2, v2

    .line 496
    iget-object v0, v0, La0/g;->I:Lp/p0;

    .line 497
    .line 498
    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 499
    .line 500
    .line 501
    sget-object v0, LU/U;->a:Ljava/util/WeakHashMap;

    .line 502
    .line 503
    invoke-virtual {v6, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 504
    .line 505
    .line 506
    :goto_c
    return-void

    .line 507
    :cond_16
    new-instance v0, Ljava/lang/RuntimeException;

    .line 508
    .line 509
    const-string v2, "Cannot compute scroll delta before calling start()"

    .line 510
    .line 511
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    throw v0

    .line 515
    :pswitch_d
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast v0, LX2/d;

    .line 518
    .line 519
    iput-boolean v7, v0, LX2/d;->c:Z

    .line 520
    .line 521
    iget-object v3, v0, LX2/d;->e:LG/b;

    .line 522
    .line 523
    check-cast v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 524
    .line 525
    iget-object v4, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e0:Ld0/f;

    .line 526
    .line 527
    if-eqz v4, :cond_17

    .line 528
    .line 529
    invoke-virtual {v4}, Ld0/f;->g()Z

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    if-eqz v4, :cond_17

    .line 534
    .line 535
    iget v2, v0, LX2/d;->b:I

    .line 536
    .line 537
    invoke-virtual {v0, v2}, LX2/d;->a(I)V

    .line 538
    .line 539
    .line 540
    goto :goto_d

    .line 541
    :cond_17
    iget v4, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d0:I

    .line 542
    .line 543
    if-ne v4, v2, :cond_18

    .line 544
    .line 545
    iget v0, v0, LX2/d;->b:I

    .line 546
    .line 547
    invoke-virtual {v3, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(I)V

    .line 548
    .line 549
    .line 550
    :cond_18
    :goto_d
    return-void

    .line 551
    :pswitch_e
    invoke-direct {v1}, LA1/c;->c()V

    .line 552
    .line 553
    .line 554
    return-void

    .line 555
    :pswitch_f
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 556
    .line 557
    check-cast v0, Lo1/h;

    .line 558
    .line 559
    iget-object v0, v0, Lo1/h;->v:Ljava/lang/Object;

    .line 560
    .line 561
    check-cast v0, Ljava/lang/ThreadLocal;

    .line 562
    .line 563
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 564
    .line 565
    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    return-void

    .line 569
    :pswitch_10
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v0, Lcom/smarteist/autoimageslider/SliderView;

    .line 572
    .line 573
    iget-object v2, v0, Lcom/smarteist/autoimageslider/SliderView;->s:Landroid/os/Handler;

    .line 574
    .line 575
    invoke-virtual {v2, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 576
    .line 577
    .line 578
    iget v3, v0, Lcom/smarteist/autoimageslider/SliderView;->w:I

    .line 579
    .line 580
    int-to-long v3, v3

    .line 581
    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 582
    .line 583
    .line 584
    return-void

    .line 585
    :pswitch_11
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast v0, LN6/l;

    .line 588
    .line 589
    invoke-virtual {v0, v7}, LN6/l;->setScrollState(I)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v0}, LN6/l;->o()V

    .line 593
    .line 594
    .line 595
    return-void

    .line 596
    :pswitch_12
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v0, Lcom/google/android/gms/measurement/internal/zznc;

    .line 599
    .line 600
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zznc;->l()Lcom/google/android/gms/measurement/internal/zzhc;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzhc;->W0()V

    .line 605
    .line 606
    .line 607
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzgq;

    .line 608
    .line 609
    invoke-direct {v2, v0}, Lcom/google/android/gms/measurement/internal/zzgq;-><init>(Lcom/google/android/gms/measurement/internal/zznc;)V

    .line 610
    .line 611
    .line 612
    iput-object v2, v0, Lcom/google/android/gms/measurement/internal/zznc;->C:Lcom/google/android/gms/measurement/internal/zzgq;

    .line 613
    .line 614
    new-instance v2, LM2/g;

    .line 615
    .line 616
    invoke-direct {v2, v0}, LM2/g;-><init>(Lcom/google/android/gms/measurement/internal/zznc;)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v2}, LM2/m0;->b1()V

    .line 620
    .line 621
    .line 622
    iput-object v2, v0, Lcom/google/android/gms/measurement/internal/zznc;->u:LM2/g;

    .line 623
    .line 624
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zznc;->S()Lcom/google/android/gms/measurement/internal/zzag;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/zznc;->s:Lcom/google/android/gms/measurement/internal/zzgt;

    .line 629
    .line 630
    invoke-static {v7}, Lcom/google/android/gms/common/internal/Preconditions;->i(Ljava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    iput-object v7, v2, Lcom/google/android/gms/measurement/internal/zzag;->v:LM2/e;

    .line 634
    .line 635
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzmc;

    .line 636
    .line 637
    invoke-direct {v2, v0}, Lcom/google/android/gms/measurement/internal/zzmc;-><init>(Lcom/google/android/gms/measurement/internal/zznc;)V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v2}, LM2/m0;->b1()V

    .line 641
    .line 642
    .line 643
    iput-object v2, v0, Lcom/google/android/gms/measurement/internal/zznc;->A:Lcom/google/android/gms/measurement/internal/zzmc;

    .line 644
    .line 645
    new-instance v2, LM2/v0;

    .line 646
    .line 647
    invoke-direct {v2, v0}, LM2/m0;-><init>(Lcom/google/android/gms/measurement/internal/zznc;)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v2}, LM2/m0;->b1()V

    .line 651
    .line 652
    .line 653
    iput-object v2, v0, Lcom/google/android/gms/measurement/internal/zznc;->x:LM2/v0;

    .line 654
    .line 655
    new-instance v2, LM2/Y;

    .line 656
    .line 657
    invoke-direct {v2, v0}, LM2/m0;-><init>(Lcom/google/android/gms/measurement/internal/zznc;)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v2}, LM2/m0;->b1()V

    .line 661
    .line 662
    .line 663
    iput-object v2, v0, Lcom/google/android/gms/measurement/internal/zznc;->z:LM2/Y;

    .line 664
    .line 665
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzmw;

    .line 666
    .line 667
    invoke-direct {v2, v0}, Lcom/google/android/gms/measurement/internal/zzmw;-><init>(Lcom/google/android/gms/measurement/internal/zznc;)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v2}, LM2/m0;->b1()V

    .line 671
    .line 672
    .line 673
    iput-object v2, v0, Lcom/google/android/gms/measurement/internal/zznc;->w:Lcom/google/android/gms/measurement/internal/zzmw;

    .line 674
    .line 675
    new-instance v2, LM2/v;

    .line 676
    .line 677
    invoke-direct {v2, v0}, LM2/v;-><init>(Lcom/google/android/gms/measurement/internal/zznc;)V

    .line 678
    .line 679
    .line 680
    iput-object v2, v0, Lcom/google/android/gms/measurement/internal/zznc;->v:LM2/v;

    .line 681
    .line 682
    iget v2, v0, Lcom/google/android/gms/measurement/internal/zznc;->J:I

    .line 683
    .line 684
    iget v7, v0, Lcom/google/android/gms/measurement/internal/zznc;->K:I

    .line 685
    .line 686
    if-eq v2, v7, :cond_19

    .line 687
    .line 688
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zznc;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 689
    .line 690
    .line 691
    move-result-object v2

    .line 692
    iget v7, v0, Lcom/google/android/gms/measurement/internal/zznc;->J:I

    .line 693
    .line 694
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 695
    .line 696
    .line 697
    move-result-object v7

    .line 698
    iget v8, v0, Lcom/google/android/gms/measurement/internal/zznc;->K:I

    .line 699
    .line 700
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 701
    .line 702
    .line 703
    move-result-object v8

    .line 704
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 705
    .line 706
    const-string v9, "Not all upload components initialized"

    .line 707
    .line 708
    invoke-virtual {v2, v9, v7, v8}, Lcom/google/android/gms/measurement/internal/zzfy;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 709
    .line 710
    .line 711
    :cond_19
    iput-boolean v6, v0, Lcom/google/android/gms/measurement/internal/zznc;->E:Z

    .line 712
    .line 713
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zznc;->l()Lcom/google/android/gms/measurement/internal/zzhc;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzhc;->W0()V

    .line 718
    .line 719
    .line 720
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zznc;->u:LM2/g;

    .line 721
    .line 722
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/zznc;->n(LM2/m0;)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v2}, LM2/g;->Z1()V

    .line 726
    .line 727
    .line 728
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zznc;->u:LM2/g;

    .line 729
    .line 730
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/zznc;->n(LM2/m0;)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v2}, LB1/a;->W0()V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v2}, LM2/m0;->a1()V

    .line 737
    .line 738
    .line 739
    invoke-virtual {v2}, LM2/g;->E1()Z

    .line 740
    .line 741
    .line 742
    move-result v6

    .line 743
    if-eqz v6, :cond_1b

    .line 744
    .line 745
    sget-object v6, Lcom/google/android/gms/measurement/internal/zzbf;->g0:Lcom/google/android/gms/measurement/internal/zzfj;

    .line 746
    .line 747
    invoke-virtual {v6, v5}, Lcom/google/android/gms/measurement/internal/zzfj;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v7

    .line 751
    check-cast v7, Ljava/lang/Long;

    .line 752
    .line 753
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 754
    .line 755
    .line 756
    move-result-wide v7

    .line 757
    cmp-long v7, v7, v3

    .line 758
    .line 759
    if-nez v7, :cond_1a

    .line 760
    .line 761
    goto :goto_e

    .line 762
    :cond_1a
    invoke-virtual {v2}, LM2/g;->d1()Landroid/database/sqlite/SQLiteDatabase;

    .line 763
    .line 764
    .line 765
    move-result-object v7

    .line 766
    iget-object v8, v2, LB1/a;->s:Ljava/lang/Object;

    .line 767
    .line 768
    check-cast v8, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 769
    .line 770
    iget-object v8, v8, Lcom/google/android/gms/measurement/internal/zzhj;->F:Lcom/google/android/gms/common/util/DefaultClock;

    .line 771
    .line 772
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 773
    .line 774
    .line 775
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 776
    .line 777
    .line 778
    move-result-wide v8

    .line 779
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v8

    .line 783
    invoke-virtual {v6, v5}, Lcom/google/android/gms/measurement/internal/zzfj;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v5

    .line 787
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v5

    .line 791
    filled-new-array {v8, v5}, [Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v5

    .line 795
    const-string v6, "trigger_uris"

    .line 796
    .line 797
    const-string v8, "abs(timestamp_millis - ?) > cast(? as integer)"

    .line 798
    .line 799
    invoke-virtual {v7, v6, v8, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 800
    .line 801
    .line 802
    move-result v5

    .line 803
    if-lez v5, :cond_1b

    .line 804
    .line 805
    invoke-virtual {v2}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 806
    .line 807
    .line 808
    move-result-object v2

    .line 809
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 810
    .line 811
    .line 812
    move-result-object v5

    .line 813
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzfw;->F:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 814
    .line 815
    const-string v6, "Deleted stale trigger uris. rowsDeleted"

    .line 816
    .line 817
    invoke-virtual {v2, v5, v6}, Lcom/google/android/gms/measurement/internal/zzfy;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 818
    .line 819
    .line 820
    :cond_1b
    :goto_e
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zznc;->A:Lcom/google/android/gms/measurement/internal/zzmc;

    .line 821
    .line 822
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzmc;->y:Lcom/google/android/gms/measurement/internal/zzgm;

    .line 823
    .line 824
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzgm;->a()J

    .line 825
    .line 826
    .line 827
    move-result-wide v5

    .line 828
    cmp-long v2, v5, v3

    .line 829
    .line 830
    if-nez v2, :cond_1c

    .line 831
    .line 832
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zznc;->A:Lcom/google/android/gms/measurement/internal/zzmc;

    .line 833
    .line 834
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzmc;->y:Lcom/google/android/gms/measurement/internal/zzgm;

    .line 835
    .line 836
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zznc;->a()Lcom/google/android/gms/common/util/Clock;

    .line 837
    .line 838
    .line 839
    move-result-object v3

    .line 840
    check-cast v3, Lcom/google/android/gms/common/util/DefaultClock;

    .line 841
    .line 842
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 843
    .line 844
    .line 845
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 846
    .line 847
    .line 848
    move-result-wide v3

    .line 849
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/zzgm;->b(J)V

    .line 850
    .line 851
    .line 852
    :cond_1c
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zznc;->G()V

    .line 853
    .line 854
    .line 855
    return-void

    .line 856
    :pswitch_13
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 857
    .line 858
    check-cast v0, Lcom/google/android/gms/measurement/internal/zziv;

    .line 859
    .line 860
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zziv;->H:Lcom/google/android/gms/measurement/internal/zzr;

    .line 861
    .line 862
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzr;->a:Lcom/google/android/gms/measurement/internal/zzhj;

    .line 863
    .line 864
    iget-object v6, v2, Lcom/google/android/gms/measurement/internal/zzhj;->B:Lcom/google/android/gms/measurement/internal/zzhc;

    .line 865
    .line 866
    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/zzhj;->g(LM2/L;)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzhc;->W0()V

    .line 870
    .line 871
    .line 872
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzr;->b()Z

    .line 873
    .line 874
    .line 875
    move-result v6

    .line 876
    if-nez v6, :cond_1d

    .line 877
    .line 878
    goto/16 :goto_13

    .line 879
    .line 880
    :cond_1d
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzr;->c()Z

    .line 881
    .line 882
    .line 883
    move-result v0

    .line 884
    iget-object v6, v2, Lcom/google/android/gms/measurement/internal/zzhj;->H:Lcom/google/android/gms/measurement/internal/zziv;

    .line 885
    .line 886
    iget-object v7, v2, Lcom/google/android/gms/measurement/internal/zzhj;->z:LM2/w;

    .line 887
    .line 888
    const-wide/16 v8, 0x1

    .line 889
    .line 890
    const-string v10, "_cc"

    .line 891
    .line 892
    if-eqz v0, :cond_1e

    .line 893
    .line 894
    invoke-static {v7}, Lcom/google/android/gms/measurement/internal/zzhj;->e(LB1/a;)V

    .line 895
    .line 896
    .line 897
    iget-object v0, v7, LM2/w;->P:Lcom/google/android/gms/measurement/internal/zzgn;

    .line 898
    .line 899
    invoke-virtual {v0, v5}, Lcom/google/android/gms/measurement/internal/zzgn;->b(Ljava/lang/String;)V

    .line 900
    .line 901
    .line 902
    new-instance v0, Landroid/os/Bundle;

    .line 903
    .line 904
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 905
    .line 906
    .line 907
    const-string v2, "source"

    .line 908
    .line 909
    const-string v5, "(not set)"

    .line 910
    .line 911
    invoke-virtual {v0, v2, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    const-string v2, "medium"

    .line 915
    .line 916
    invoke-virtual {v0, v2, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 917
    .line 918
    .line 919
    const-string v2, "_cis"

    .line 920
    .line 921
    const-string v5, "intent"

    .line 922
    .line 923
    invoke-virtual {v0, v2, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v0, v10, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 927
    .line 928
    .line 929
    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/zzhj;->f(LM2/n;)V

    .line 930
    .line 931
    .line 932
    const-string v2, "auto"

    .line 933
    .line 934
    const-string v5, "_cmpx"

    .line 935
    .line 936
    invoke-virtual {v6, v2, v5, v0}, Lcom/google/android/gms/measurement/internal/zziv;->B1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 937
    .line 938
    .line 939
    goto/16 :goto_12

    .line 940
    .line 941
    :cond_1e
    invoke-static {v7}, Lcom/google/android/gms/measurement/internal/zzhj;->e(LB1/a;)V

    .line 942
    .line 943
    .line 944
    iget-object v0, v7, LM2/w;->P:Lcom/google/android/gms/measurement/internal/zzgn;

    .line 945
    .line 946
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgn;->a()Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 951
    .line 952
    .line 953
    move-result v11

    .line 954
    if-eqz v11, :cond_1f

    .line 955
    .line 956
    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/zzhj;->A:Lcom/google/android/gms/measurement/internal/zzfw;

    .line 957
    .line 958
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzhj;->g(LM2/L;)V

    .line 959
    .line 960
    .line 961
    const-string v2, "Cache still valid but referrer not found"

    .line 962
    .line 963
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzfw;->y:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 964
    .line 965
    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzfy;->b(Ljava/lang/String;)V

    .line 966
    .line 967
    .line 968
    goto :goto_11

    .line 969
    :cond_1f
    invoke-static {v7}, Lcom/google/android/gms/measurement/internal/zzhj;->e(LB1/a;)V

    .line 970
    .line 971
    .line 972
    iget-object v2, v7, LM2/w;->Q:Lcom/google/android/gms/measurement/internal/zzgm;

    .line 973
    .line 974
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzgm;->a()J

    .line 975
    .line 976
    .line 977
    move-result-wide v11

    .line 978
    const-wide/32 v13, 0x36ee80

    .line 979
    .line 980
    .line 981
    div-long/2addr v11, v13

    .line 982
    sub-long/2addr v11, v8

    .line 983
    mul-long/2addr v11, v13

    .line 984
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 985
    .line 986
    .line 987
    move-result-object v0

    .line 988
    new-instance v2, Landroid/os/Bundle;

    .line 989
    .line 990
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 991
    .line 992
    .line 993
    new-instance v8, Landroid/util/Pair;

    .line 994
    .line 995
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v9

    .line 999
    invoke-direct {v8, v9, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v0}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v9

    .line 1006
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v9

    .line 1010
    :goto_f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1011
    .line 1012
    .line 1013
    move-result v13

    .line 1014
    if-eqz v13, :cond_20

    .line 1015
    .line 1016
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v13

    .line 1020
    check-cast v13, Ljava/lang/String;

    .line 1021
    .line 1022
    invoke-virtual {v0, v13}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v14

    .line 1026
    invoke-virtual {v2, v13, v14}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1027
    .line 1028
    .line 1029
    goto :goto_f

    .line 1030
    :cond_20
    iget-object v0, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1031
    .line 1032
    check-cast v0, Landroid/os/Bundle;

    .line 1033
    .line 1034
    invoke-virtual {v0, v10, v11, v12}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 1035
    .line 1036
    .line 1037
    iget-object v0, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1038
    .line 1039
    if-nez v0, :cond_21

    .line 1040
    .line 1041
    const-string v0, "app"

    .line 1042
    .line 1043
    goto :goto_10

    .line 1044
    :cond_21
    check-cast v0, Ljava/lang/String;

    .line 1045
    .line 1046
    :goto_10
    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/zzhj;->f(LM2/n;)V

    .line 1047
    .line 1048
    .line 1049
    iget-object v2, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1050
    .line 1051
    check-cast v2, Landroid/os/Bundle;

    .line 1052
    .line 1053
    const-string v8, "_cmp"

    .line 1054
    .line 1055
    invoke-virtual {v6, v0, v8, v2}, Lcom/google/android/gms/measurement/internal/zziv;->B1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1056
    .line 1057
    .line 1058
    :goto_11
    invoke-static {v7}, Lcom/google/android/gms/measurement/internal/zzhj;->e(LB1/a;)V

    .line 1059
    .line 1060
    .line 1061
    iget-object v0, v7, LM2/w;->P:Lcom/google/android/gms/measurement/internal/zzgn;

    .line 1062
    .line 1063
    invoke-virtual {v0, v5}, Lcom/google/android/gms/measurement/internal/zzgn;->b(Ljava/lang/String;)V

    .line 1064
    .line 1065
    .line 1066
    :goto_12
    invoke-static {v7}, Lcom/google/android/gms/measurement/internal/zzhj;->e(LB1/a;)V

    .line 1067
    .line 1068
    .line 1069
    iget-object v0, v7, LM2/w;->Q:Lcom/google/android/gms/measurement/internal/zzgm;

    .line 1070
    .line 1071
    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/measurement/internal/zzgm;->b(J)V

    .line 1072
    .line 1073
    .line 1074
    :goto_13
    return-void

    .line 1075
    :pswitch_14
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 1076
    .line 1077
    check-cast v0, LM2/v;

    .line 1078
    .line 1079
    iget-object v0, v0, LM2/v;->a:Lcom/google/android/gms/measurement/internal/zznc;

    .line 1080
    .line 1081
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zznc;->G()V

    .line 1082
    .line 1083
    .line 1084
    return-void

    .line 1085
    :pswitch_15
    invoke-direct {v1}, LA1/c;->b()V

    .line 1086
    .line 1087
    .line 1088
    return-void

    .line 1089
    :pswitch_16
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 1090
    .line 1091
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 1092
    .line 1093
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->J0()Z

    .line 1094
    .line 1095
    .line 1096
    return-void

    .line 1097
    :pswitch_17
    iget-object v3, v1, LA1/c;->t:Ljava/lang/Object;

    .line 1098
    .line 1099
    check-cast v3, LJ0/e;

    .line 1100
    .line 1101
    iget v4, v3, LJ0/e;->A:I

    .line 1102
    .line 1103
    iget-object v5, v3, LJ0/e;->z:Landroid/animation/ValueAnimator;

    .line 1104
    .line 1105
    if-eq v4, v6, :cond_22

    .line 1106
    .line 1107
    if-eq v4, v2, :cond_23

    .line 1108
    .line 1109
    goto :goto_14

    .line 1110
    :cond_22
    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->cancel()V

    .line 1111
    .line 1112
    .line 1113
    :cond_23
    iput v0, v3, LJ0/e;->A:I

    .line 1114
    .line 1115
    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v0

    .line 1119
    check-cast v0, Ljava/lang/Float;

    .line 1120
    .line 1121
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 1122
    .line 1123
    .line 1124
    move-result v0

    .line 1125
    new-array v2, v2, [F

    .line 1126
    .line 1127
    aput v0, v2, v7

    .line 1128
    .line 1129
    const/4 v0, 0x0

    .line 1130
    aput v0, v2, v6

    .line 1131
    .line 1132
    invoke-virtual {v5, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 1133
    .line 1134
    .line 1135
    const/16 v0, 0x1f4

    .line 1136
    .line 1137
    int-to-long v2, v0

    .line 1138
    invoke-virtual {v5, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->start()V

    .line 1142
    .line 1143
    .line 1144
    :goto_14
    return-void

    .line 1145
    :pswitch_18
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 1146
    .line 1147
    check-cast v0, LCa/a;

    .line 1148
    .line 1149
    iget-object v2, v0, LCa/a;->s:LCa/b;

    .line 1150
    .line 1151
    iget-object v2, v2, LCa/b;->m:Lv8/k;

    .line 1152
    .line 1153
    iget-object v0, v0, LCa/a;->t:LGa/c;

    .line 1154
    .line 1155
    if-eqz v2, :cond_24

    .line 1156
    .line 1157
    invoke-interface {v2, v0}, Lu8/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v2

    .line 1161
    check-cast v2, Lh8/m;

    .line 1162
    .line 1163
    :cond_24
    check-cast v0, LGa/b;

    .line 1164
    .line 1165
    invoke-virtual {v0, v6}, LGa/b;->s(Z)V

    .line 1166
    .line 1167
    .line 1168
    return-void

    .line 1169
    :pswitch_19
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 1170
    .line 1171
    check-cast v0, LC0/t;

    .line 1172
    .line 1173
    invoke-virtual {v0}, LC0/t;->p()V

    .line 1174
    .line 1175
    .line 1176
    return-void

    .line 1177
    :pswitch_1a
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 1178
    .line 1179
    check-cast v0, LC0/r;

    .line 1180
    .line 1181
    iget-object v0, v0, LC0/r;->v0:Landroidx/recyclerview/widget/RecyclerView;

    .line 1182
    .line 1183
    invoke-virtual {v0, v0}, Landroid/view/ViewGroup;->focusableViewAvailable(Landroid/view/View;)V

    .line 1184
    .line 1185
    .line 1186
    return-void

    .line 1187
    :pswitch_1b
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 1188
    .line 1189
    check-cast v0, LC0/c;

    .line 1190
    .line 1191
    invoke-virtual {v0}, LC0/c;->s0()V

    .line 1192
    .line 1193
    .line 1194
    return-void

    .line 1195
    :pswitch_1c
    iget-object v0, v1, LA1/c;->t:Ljava/lang/Object;

    .line 1196
    .line 1197
    check-cast v0, Lo1/h;

    .line 1198
    .line 1199
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1200
    .line 1201
    .line 1202
    :goto_15
    :try_start_3
    iget-object v2, v0, Lo1/h;->u:Ljava/lang/Object;

    .line 1203
    .line 1204
    check-cast v2, Ljava/lang/ref/ReferenceQueue;

    .line 1205
    .line 1206
    invoke-virtual {v2}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v2

    .line 1210
    check-cast v2, LA1/d;

    .line 1211
    .line 1212
    invoke-virtual {v0, v2}, Lo1/h;->d(LA1/d;)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_2

    .line 1213
    .line 1214
    .line 1215
    goto :goto_15

    .line 1216
    :catch_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v2

    .line 1220
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 1221
    .line 1222
    .line 1223
    goto :goto_15

    .line 1224
    nop

    .line 1225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
.end method
