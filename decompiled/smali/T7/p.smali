.class public final LT7/p;
.super LT7/o;
.source "SourceFile"


# instance fields
.field public final E:LQ7/a;

.field public F:J


# direct methods
.method public constructor <init>(LQ7/a;LJ7/m;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, LT7/o;-><init>(LJ7/m;I)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT7/p;->E:LQ7/a;

    .line 5
    .line 6
    return-void
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


# virtual methods
.method public final c(Lua/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, LT7/o;->w:Lua/a;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lb8/a;->h(Lua/a;Lua/a;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iput-object p1, p0, LT7/o;->w:Lua/a;

    .line 10
    .line 11
    instance-of v0, p1, LQ7/c;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    move-object v0, p1

    .line 16
    check-cast v0, LQ7/c;

    .line 17
    .line 18
    invoke-interface {v0}, LQ7/b;->g()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x1

    .line 23
    if-ne v1, v2, :cond_0

    .line 24
    .line 25
    iput v2, p0, LT7/o;->B:I

    .line 26
    .line 27
    iput-object v0, p0, LT7/o;->x:LQ7/d;

    .line 28
    .line 29
    iput-boolean v2, p0, LT7/o;->z:Z

    .line 30
    .line 31
    iget-object p1, p0, LT7/p;->E:LQ7/a;

    .line 32
    .line 33
    invoke-interface {p1, p0}, LJ7/f;->c(Lua/a;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const/4 v2, 0x2

    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    iput v2, p0, LT7/o;->B:I

    .line 41
    .line 42
    iput-object v0, p0, LT7/o;->x:LQ7/d;

    .line 43
    .line 44
    iget-object v0, p0, LT7/p;->E:LQ7/a;

    .line 45
    .line 46
    invoke-interface {v0, p0}, LJ7/f;->c(Lua/a;)V

    .line 47
    .line 48
    .line 49
    iget v0, p0, LT7/o;->t:I

    .line 50
    .line 51
    int-to-long v0, v0

    .line 52
    invoke-interface {p1, v0, v1}, Lua/a;->f(J)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    new-instance v0, LY7/a;

    .line 57
    .line 58
    iget v1, p0, LT7/o;->t:I

    .line 59
    .line 60
    invoke-direct {v0, v1}, LY7/a;-><init>(I)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, LT7/o;->x:LQ7/d;

    .line 64
    .line 65
    iget-object v0, p0, LT7/p;->E:LQ7/a;

    .line 66
    .line 67
    invoke-interface {v0, p0}, LJ7/f;->c(Lua/a;)V

    .line 68
    .line 69
    .line 70
    iget v0, p0, LT7/o;->t:I

    .line 71
    .line 72
    int-to-long v0, v0

    .line 73
    invoke-interface {p1, v0, v1}, Lua/a;->f(J)V

    .line 74
    .line 75
    .line 76
    :cond_2
    return-void
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

.method public final k()V
    .locals 14

    .line 1
    iget-object v0, p0, LT7/p;->E:LQ7/a;

    .line 2
    .line 3
    iget-object v1, p0, LT7/o;->x:LQ7/d;

    .line 4
    .line 5
    iget-wide v2, p0, LT7/o;->C:J

    .line 6
    .line 7
    iget-wide v4, p0, LT7/p;->F:J

    .line 8
    .line 9
    const/4 v6, 0x1

    .line 10
    move v7, v6

    .line 11
    :cond_0
    :goto_0
    iget-object v8, p0, LT7/o;->v:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    .line 13
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 14
    .line 15
    .line 16
    move-result-wide v8

    .line 17
    :cond_1
    :goto_1
    cmp-long v10, v2, v8

    .line 18
    .line 19
    if-eqz v10, :cond_6

    .line 20
    .line 21
    iget-boolean v11, p0, LT7/o;->z:Z

    .line 22
    .line 23
    :try_start_0
    invoke-interface {v1}, LQ7/d;->poll()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-nez v12, :cond_2

    .line 28
    .line 29
    move v13, v6

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    const/4 v13, 0x0

    .line 32
    :goto_2
    invoke-virtual {p0, v11, v13, v0}, LT7/o;->e(ZZLJ7/f;)Z

    .line 33
    .line 34
    .line 35
    move-result v11

    .line 36
    if-eqz v11, :cond_3

    .line 37
    .line 38
    goto :goto_4

    .line 39
    :cond_3
    if-eqz v13, :cond_4

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_4
    invoke-interface {v0, v12}, LQ7/a;->b(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v10

    .line 46
    const-wide/16 v11, 0x1

    .line 47
    .line 48
    if-eqz v10, :cond_5

    .line 49
    .line 50
    add-long/2addr v2, v11

    .line 51
    :cond_5
    add-long/2addr v4, v11

    .line 52
    iget v10, p0, LT7/o;->u:I

    .line 53
    .line 54
    int-to-long v10, v10

    .line 55
    cmp-long v10, v4, v10

    .line 56
    .line 57
    if-nez v10, :cond_1

    .line 58
    .line 59
    iget-object v10, p0, LT7/o;->w:Lua/a;

    .line 60
    .line 61
    invoke-interface {v10, v4, v5}, Lua/a;->f(J)V

    .line 62
    .line 63
    .line 64
    const-wide/16 v4, 0x0

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catchall_0
    move-exception v2

    .line 68
    invoke-static {v2}, Lga/l;->n(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    iput-boolean v6, p0, LT7/o;->y:Z

    .line 72
    .line 73
    iget-object v3, p0, LT7/o;->w:Lua/a;

    .line 74
    .line 75
    invoke-interface {v3}, Lua/a;->cancel()V

    .line 76
    .line 77
    .line 78
    invoke-interface {v1}, LQ7/d;->clear()V

    .line 79
    .line 80
    .line 81
    invoke-interface {v0, v2}, LJ7/f;->onError(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, LT7/o;->s:LJ7/m;

    .line 85
    .line 86
    invoke-interface {v0}, LL7/b;->f()V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_6
    :goto_3
    if-nez v10, :cond_7

    .line 91
    .line 92
    iget-boolean v8, p0, LT7/o;->z:Z

    .line 93
    .line 94
    invoke-interface {v1}, LQ7/d;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    invoke-virtual {p0, v8, v9, v0}, LT7/o;->e(ZZLJ7/f;)Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-eqz v8, :cond_7

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_7
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    if-ne v7, v8, :cond_8

    .line 110
    .line 111
    iput-wide v2, p0, LT7/o;->C:J

    .line 112
    .line 113
    iput-wide v4, p0, LT7/p;->F:J

    .line 114
    .line 115
    neg-int v7, v7

    .line 116
    invoke-virtual {p0, v7}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-nez v7, :cond_0

    .line 121
    .line 122
    :goto_4
    return-void

    .line 123
    :cond_8
    move v7, v8

    .line 124
    goto :goto_0
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

.method public final m()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    move v1, v0

    .line 3
    :cond_0
    iget-boolean v2, p0, LT7/o;->y:Z

    .line 4
    .line 5
    if-eqz v2, :cond_1

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_1
    iget-boolean v2, p0, LT7/o;->z:Z

    .line 9
    .line 10
    iget-object v3, p0, LT7/p;->E:LQ7/a;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-interface {v3, v4}, LJ7/f;->d(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    if-eqz v2, :cond_3

    .line 17
    .line 18
    iput-boolean v0, p0, LT7/o;->y:Z

    .line 19
    .line 20
    iget-object v0, p0, LT7/o;->A:Ljava/lang/Throwable;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v1, p0, LT7/p;->E:LQ7/a;

    .line 25
    .line 26
    invoke-interface {v1, v0}, LJ7/f;->onError(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    iget-object v0, p0, LT7/p;->E:LQ7/a;

    .line 31
    .line 32
    invoke-interface {v0}, LJ7/f;->a()V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v0, p0, LT7/o;->s:LJ7/m;

    .line 36
    .line 37
    invoke-interface {v0}, LL7/b;->f()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    neg-int v1, v1

    .line 42
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    :goto_1
    return-void
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

.method public final n()V
    .locals 10

    .line 1
    iget-object v0, p0, LT7/p;->E:LQ7/a;

    .line 2
    .line 3
    iget-object v1, p0, LT7/o;->x:LQ7/d;

    .line 4
    .line 5
    iget-wide v2, p0, LT7/o;->C:J

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    move v5, v4

    .line 9
    :cond_0
    :goto_0
    iget-object v6, p0, LT7/o;->v:Ljava/util/concurrent/atomic/AtomicLong;

    .line 10
    .line 11
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 12
    .line 13
    .line 14
    move-result-wide v6

    .line 15
    :cond_1
    :goto_1
    cmp-long v8, v2, v6

    .line 16
    .line 17
    if-eqz v8, :cond_4

    .line 18
    .line 19
    :try_start_0
    invoke-interface {v1}, LQ7/d;->poll()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    iget-boolean v9, p0, LT7/o;->y:Z

    .line 24
    .line 25
    if-eqz v9, :cond_2

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_2
    if-nez v8, :cond_3

    .line 29
    .line 30
    iput-boolean v4, p0, LT7/o;->y:Z

    .line 31
    .line 32
    invoke-interface {v0}, LJ7/f;->a()V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, LT7/o;->s:LJ7/m;

    .line 36
    .line 37
    invoke-interface {v0}, LL7/b;->f()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    invoke-interface {v0, v8}, LQ7/a;->b(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    if-eqz v8, :cond_1

    .line 46
    .line 47
    const-wide/16 v8, 0x1

    .line 48
    .line 49
    add-long/2addr v2, v8

    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception v1

    .line 52
    invoke-static {v1}, Lga/l;->n(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    iput-boolean v4, p0, LT7/o;->y:Z

    .line 56
    .line 57
    iget-object v2, p0, LT7/o;->w:Lua/a;

    .line 58
    .line 59
    invoke-interface {v2}, Lua/a;->cancel()V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0, v1}, LJ7/f;->onError(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, LT7/o;->s:LJ7/m;

    .line 66
    .line 67
    invoke-interface {v0}, LL7/b;->f()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_4
    iget-boolean v6, p0, LT7/o;->y:Z

    .line 72
    .line 73
    if-eqz v6, :cond_5

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_5
    invoke-interface {v1}, LQ7/d;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-eqz v6, :cond_6

    .line 81
    .line 82
    iput-boolean v4, p0, LT7/o;->y:Z

    .line 83
    .line 84
    invoke-interface {v0}, LJ7/f;->a()V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, LT7/o;->s:LJ7/m;

    .line 88
    .line 89
    invoke-interface {v0}, LL7/b;->f()V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_6
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-ne v5, v6, :cond_7

    .line 98
    .line 99
    iput-wide v2, p0, LT7/o;->C:J

    .line 100
    .line 101
    neg-int v5, v5

    .line 102
    invoke-virtual {p0, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-nez v5, :cond_0

    .line 107
    .line 108
    :goto_2
    return-void

    .line 109
    :cond_7
    move v5, v6

    .line 110
    goto :goto_0
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

.method public final poll()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, LT7/o;->x:LQ7/d;

    .line 2
    .line 3
    invoke-interface {v0}, LQ7/d;->poll()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget v1, p0, LT7/o;->B:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v1, v2, :cond_1

    .line 13
    .line 14
    iget-wide v1, p0, LT7/p;->F:J

    .line 15
    .line 16
    const-wide/16 v3, 0x1

    .line 17
    .line 18
    add-long/2addr v1, v3

    .line 19
    iget v3, p0, LT7/o;->u:I

    .line 20
    .line 21
    int-to-long v3, v3

    .line 22
    cmp-long v3, v1, v3

    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    iput-wide v3, p0, LT7/p;->F:J

    .line 29
    .line 30
    iget-object v3, p0, LT7/o;->w:Lua/a;

    .line 31
    .line 32
    invoke-interface {v3, v1, v2}, Lua/a;->f(J)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_0
    iput-wide v1, p0, LT7/p;->F:J

    .line 37
    .line 38
    :cond_1
    return-object v0
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
