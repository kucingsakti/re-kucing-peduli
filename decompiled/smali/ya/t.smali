.class public final Lya/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lya/c;


# instance fields
.field public final s:Lya/K;

.field public final t:[Ljava/lang/Object;

.field public final u:LX9/i;

.field public final v:Lya/k;

.field public volatile w:Z

.field public x:Lba/i;

.field public y:Ljava/lang/Throwable;

.field public z:Z


# direct methods
.method public constructor <init>(Lya/K;[Ljava/lang/Object;LX9/i;Lya/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lya/t;->s:Lya/K;

    .line 5
    .line 6
    iput-object p2, p0, Lya/t;->t:[Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lya/t;->u:LX9/i;

    .line 9
    .line 10
    iput-object p4, p0, Lya/t;->v:Lya/k;

    .line 11
    .line 12
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
.end method


# virtual methods
.method public final declared-synchronized K()LX9/G;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lya/t;->d()LX9/j;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    check-cast v0, Lba/i;

    .line 7
    .line 8
    iget-object v0, v0, Lba/i;->t:LX9/G;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-object v0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 16
    .line 17
    const-string v2, "Unable to create request."

    .line 18
    .line 19
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    throw v1

    .line 23
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw v0
    .line 25
    .line 26
.end method

.method public final T()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lya/t;->w:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    monitor-enter p0

    .line 8
    :try_start_0
    iget-object v0, p0, Lya/t;->x:Lba/i;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-boolean v0, v0, Lba/i;->E:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v1, 0x0

    .line 18
    :goto_0
    monitor-exit p0

    .line 19
    return v1

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw v0
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final a()Lba/i;
    .locals 14

    .line 1
    iget-object v0, p0, Lya/t;->s:Lya/K;

    .line 2
    .line 3
    iget-object v1, p0, Lya/t;->t:[Ljava/lang/Object;

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    iget-object v3, v0, Lya/K;->j:[Lya/T;

    .line 7
    .line 8
    array-length v4, v3

    .line 9
    if-ne v2, v4, :cond_a

    .line 10
    .line 11
    new-instance v5, Lya/I;

    .line 12
    .line 13
    iget-boolean v12, v0, Lya/K;->h:Z

    .line 14
    .line 15
    iget-boolean v13, v0, Lya/K;->i:Z

    .line 16
    .line 17
    iget-object v6, v0, Lya/K;->c:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v7, v0, Lya/K;->b:LX9/y;

    .line 20
    .line 21
    iget-object v8, v0, Lya/K;->d:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v9, v0, Lya/K;->e:LX9/w;

    .line 24
    .line 25
    iget-object v10, v0, Lya/K;->f:LX9/A;

    .line 26
    .line 27
    iget-boolean v11, v0, Lya/K;->g:Z

    .line 28
    .line 29
    invoke-direct/range {v5 .. v13}, Lya/I;-><init>(Ljava/lang/String;LX9/y;Ljava/lang/String;LX9/w;LX9/A;ZZZ)V

    .line 30
    .line 31
    .line 32
    iget-boolean v4, v0, Lya/K;->k:Z

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    add-int/lit8 v2, v2, -0x1

    .line 37
    .line 38
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    move v7, v6

    .line 45
    :goto_0
    if-ge v7, v2, :cond_1

    .line 46
    .line 47
    aget-object v8, v1, v7

    .line 48
    .line 49
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    aget-object v8, v3, v7

    .line 53
    .line 54
    aget-object v9, v1, v7

    .line 55
    .line 56
    invoke-virtual {v8, v5, v9}, Lya/T;->a(Lya/I;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v7, v7, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-object v1, v5, Lya/I;->d:LX9/x;

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {v1}, LX9/x;->a()LX9/y;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    iget-object v1, v5, Lya/I;->c:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v2, v5, Lya/I;->b:LX9/y;

    .line 74
    .line 75
    invoke-virtual {v2, v1}, LX9/y;->h(Ljava/lang/String;)LX9/y;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-eqz v1, :cond_9

    .line 80
    .line 81
    :goto_1
    iget-object v2, v5, Lya/I;->k:LX9/J;

    .line 82
    .line 83
    if-nez v2, :cond_6

    .line 84
    .line 85
    iget-object v3, v5, Lya/I;->j:Lo1/e;

    .line 86
    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    new-instance v2, LX9/s;

    .line 90
    .line 91
    iget-object v6, v3, Lo1/e;->t:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v6, Ljava/util/ArrayList;

    .line 94
    .line 95
    iget-object v3, v3, Lo1/e;->u:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v2, v6, v3}, LX9/s;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    iget-object v3, v5, Lya/I;->i:LA1/h;

    .line 104
    .line 105
    if-eqz v3, :cond_5

    .line 106
    .line 107
    iget-object v2, v3, LA1/h;->v:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v2, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-nez v6, :cond_4

    .line 116
    .line 117
    new-instance v6, LX9/C;

    .line 118
    .line 119
    iget-object v7, v3, LA1/h;->t:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v7, Lma/i;

    .line 122
    .line 123
    iget-object v3, v3, LA1/h;->u:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v3, LX9/A;

    .line 126
    .line 127
    invoke-static {v2}, LY9/c;->x(Ljava/util/List;)Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-direct {v6, v7, v3, v2}, LX9/C;-><init>(Lma/i;LX9/A;Ljava/util/List;)V

    .line 132
    .line 133
    .line 134
    move-object v2, v6

    .line 135
    goto :goto_2

    .line 136
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 137
    .line 138
    const-string v1, "Multipart body must have at least one part."

    .line 139
    .line 140
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw v0

    .line 144
    :cond_5
    iget-boolean v3, v5, Lya/I;->h:Z

    .line 145
    .line 146
    if-eqz v3, :cond_6

    .line 147
    .line 148
    new-array v2, v6, [B

    .line 149
    .line 150
    int-to-long v7, v6

    .line 151
    move-wide v9, v7

    .line 152
    move-wide v11, v7

    .line 153
    invoke-static/range {v7 .. v12}, LY9/c;->c(JJJ)V

    .line 154
    .line 155
    .line 156
    new-instance v3, LX9/I;

    .line 157
    .line 158
    const/4 v7, 0x0

    .line 159
    invoke-direct {v3, v7, v6, v2}, LX9/I;-><init>(LX9/A;I[B)V

    .line 160
    .line 161
    .line 162
    move-object v2, v3

    .line 163
    :cond_6
    :goto_2
    iget-object v3, v5, Lya/I;->g:LX9/A;

    .line 164
    .line 165
    iget-object v6, v5, Lya/I;->f:LM1/c;

    .line 166
    .line 167
    if-eqz v3, :cond_8

    .line 168
    .line 169
    if-eqz v2, :cond_7

    .line 170
    .line 171
    new-instance v7, LX9/H;

    .line 172
    .line 173
    invoke-direct {v7, v2, v3}, LX9/H;-><init>(LX9/J;LX9/A;)V

    .line 174
    .line 175
    .line 176
    move-object v2, v7

    .line 177
    goto :goto_3

    .line 178
    :cond_7
    const-string v7, "Content-Type"

    .line 179
    .line 180
    iget-object v3, v3, LX9/A;->a:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {v6, v7, v3}, LM1/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    :cond_8
    :goto_3
    iget-object v3, v5, Lya/I;->e:LFa/e;

    .line 186
    .line 187
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    iput-object v1, v3, LFa/e;->t:Ljava/lang/Object;

    .line 191
    .line 192
    invoke-virtual {v6}, LM1/c;->d()LX9/w;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-virtual {v1}, LX9/w;->g()LM1/c;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    iput-object v1, v3, LFa/e;->v:Ljava/lang/Object;

    .line 201
    .line 202
    iget-object v1, v5, Lya/I;->a:Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v3, v1, v2}, LFa/e;->v(Ljava/lang/String;LX9/J;)V

    .line 205
    .line 206
    .line 207
    new-instance v1, Lya/o;

    .line 208
    .line 209
    iget-object v0, v0, Lya/K;->a:Ljava/lang/reflect/Method;

    .line 210
    .line 211
    invoke-direct {v1, v0, v4}, Lya/o;-><init>(Ljava/lang/reflect/Method;Ljava/util/ArrayList;)V

    .line 212
    .line 213
    .line 214
    const-class v0, Lya/o;

    .line 215
    .line 216
    invoke-virtual {v3, v0, v1}, LFa/e;->A(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3}, LFa/e;->j()LX9/G;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    iget-object v1, p0, Lya/t;->u:LX9/i;

    .line 224
    .line 225
    check-cast v1, LX9/E;

    .line 226
    .line 227
    invoke-virtual {v1, v0}, LX9/E;->c(LX9/G;)Lba/i;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    return-object v0

    .line 232
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 233
    .line 234
    new-instance v1, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    const-string v3, "Malformed URL. Base: "

    .line 237
    .line 238
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string v2, ", Relative: "

    .line 245
    .line 246
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    iget-object v2, v5, Lya/I;->c:Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v0

    .line 262
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 263
    .line 264
    const-string v1, "Argument count ("

    .line 265
    .line 266
    const-string v4, ") doesn\'t match expected count ("

    .line 267
    .line 268
    invoke-static {v1, v2, v4}, Landroidx/datastore/preferences/protobuf/g;->l(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    array-length v2, v3

    .line 273
    const-string v3, ")"

    .line 274
    .line 275
    invoke-static {v1, v2, v3}, LE0/a;->j(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    throw v0
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

.method public final c()Lya/L;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lya/t;->z:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lya/t;->z:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lya/t;->d()LX9/j;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    iget-boolean v1, p0, Lya/t;->w:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    move-object v1, v0

    .line 19
    check-cast v1, Lba/i;

    .line 20
    .line 21
    invoke-virtual {v1}, Lba/i;->cancel()V

    .line 22
    .line 23
    .line 24
    :cond_0
    check-cast v0, Lba/i;

    .line 25
    .line 26
    invoke-virtual {v0}, Lba/i;->f()LX9/L;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0, v0}, Lya/t;->e(LX9/L;)Lya/L;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v1, "Already executed."

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw v0
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

.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lya/t;->w:Z

    .line 3
    .line 4
    monitor-enter p0

    .line 5
    :try_start_0
    iget-object v0, p0, Lya/t;->x:Lba/i;

    .line 6
    .line 7
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lba/i;->cancel()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw v0
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

.method public final clone()Ljava/lang/Object;
    .locals 5

    .line 1
    new-instance v0, Lya/t;

    .line 2
    .line 3
    iget-object v1, p0, Lya/t;->v:Lya/k;

    .line 4
    .line 5
    iget-object v2, p0, Lya/t;->s:Lya/K;

    .line 6
    .line 7
    iget-object v3, p0, Lya/t;->t:[Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Lya/t;->u:LX9/i;

    .line 10
    .line 11
    invoke-direct {v0, v2, v3, v4, v1}, Lya/t;-><init>(Lya/K;[Ljava/lang/Object;LX9/i;Lya/k;)V

    .line 12
    .line 13
    .line 14
    return-object v0
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

.method public final d()LX9/j;
    .locals 2

    .line 1
    iget-object v0, p0, Lya/t;->x:Lba/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lya/t;->y:Ljava/lang/Throwable;

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    instance-of v1, v0, Ljava/io/IOException;

    .line 11
    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    instance-of v1, v0, Ljava/lang/RuntimeException;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    check-cast v0, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    throw v0

    .line 21
    :cond_1
    check-cast v0, Ljava/lang/Error;

    .line 22
    .line 23
    throw v0

    .line 24
    :cond_2
    check-cast v0, Ljava/io/IOException;

    .line 25
    .line 26
    throw v0

    .line 27
    :cond_3
    :try_start_0
    invoke-virtual {p0}, Lya/t;->a()Lba/i;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lya/t;->x:Lba/i;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    return-object v0

    .line 34
    :catch_0
    move-exception v0

    .line 35
    goto :goto_0

    .line 36
    :catch_1
    move-exception v0

    .line 37
    goto :goto_0

    .line 38
    :catch_2
    move-exception v0

    .line 39
    :goto_0
    invoke-static {v0}, Lya/T;->o(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lya/t;->y:Ljava/lang/Throwable;

    .line 43
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

.method public final e(LX9/L;)Lya/L;
    .locals 5

    .line 1
    invoke-virtual {p1}, LX9/L;->g()LX9/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lya/s;

    .line 6
    .line 7
    iget-object p1, p1, LX9/L;->y:LX9/O;

    .line 8
    .line 9
    invoke-virtual {p1}, LX9/O;->b()LX9/A;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, LX9/O;->a()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    invoke-direct {v1, v2, v3, v4}, Lya/s;-><init>(LX9/A;J)V

    .line 18
    .line 19
    .line 20
    iput-object v1, v0, LX9/K;->g:LX9/O;

    .line 21
    .line 22
    invoke-virtual {v0}, LX9/K;->a()LX9/L;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/16 v1, 0xc8

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    iget v3, v0, LX9/L;->v:I

    .line 30
    .line 31
    if-lt v3, v1, :cond_6

    .line 32
    .line 33
    const/16 v1, 0x12c

    .line 34
    .line 35
    if-lt v3, v1, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    const/16 v1, 0xcc

    .line 39
    .line 40
    const-string v4, "rawResponse must be successful response"

    .line 41
    .line 42
    if-eq v3, v1, :cond_4

    .line 43
    .line 44
    const/16 v1, 0xcd

    .line 45
    .line 46
    if-ne v3, v1, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    new-instance v1, Lya/r;

    .line 50
    .line 51
    invoke-direct {v1, p1}, Lya/r;-><init>(LX9/O;)V

    .line 52
    .line 53
    .line 54
    :try_start_0
    iget-object p1, p0, Lya/t;->v:Lya/k;

    .line 55
    .line 56
    invoke-interface {p1, v1}, Lya/k;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v0}, LX9/L;->c()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    new-instance v2, Lya/L;

    .line 67
    .line 68
    invoke-direct {v2, v0, p1}, Lya/L;-><init>(LX9/L;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-object v2

    .line 72
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    invoke-direct {p1, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    :catch_0
    move-exception p1

    .line 79
    iget-object v0, v1, Lya/r;->v:Ljava/io/IOException;

    .line 80
    .line 81
    if-nez v0, :cond_3

    .line 82
    .line 83
    throw p1

    .line 84
    :cond_3
    throw v0

    .line 85
    :cond_4
    :goto_0
    invoke-virtual {p1}, LX9/O;->close()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, LX9/L;->c()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_5

    .line 93
    .line 94
    new-instance p1, Lya/L;

    .line 95
    .line 96
    invoke-direct {p1, v0, v2}, Lya/L;-><init>(LX9/L;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-object p1

    .line 100
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 101
    .line 102
    invoke-direct {p1, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1

    .line 106
    :cond_6
    :goto_1
    :try_start_1
    new-instance v1, Lma/f;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, LX9/O;->c()Lma/h;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-interface {v3, v1}, Lma/h;->D(Lma/f;)J

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, LX9/O;->b()LX9/A;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, LX9/O;->a()J

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, LX9/L;->c()Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-nez v1, :cond_7

    .line 129
    .line 130
    new-instance v1, Lya/L;

    .line 131
    .line 132
    invoke-direct {v1, v0, v2}, Lya/L;-><init>(LX9/L;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, LX9/O;->close()V

    .line 136
    .line 137
    .line 138
    return-object v1

    .line 139
    :cond_7
    :try_start_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 140
    .line 141
    const-string v1, "rawResponse should not be successful response"

    .line 142
    .line 143
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 147
    :catchall_0
    move-exception v0

    .line 148
    invoke-virtual {p1}, LX9/O;->close()V

    .line 149
    .line 150
    .line 151
    throw v0
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
.end method

.method public final g()Lya/c;
    .locals 5

    .line 1
    new-instance v0, Lya/t;

    .line 2
    .line 3
    iget-object v1, p0, Lya/t;->v:Lya/k;

    .line 4
    .line 5
    iget-object v2, p0, Lya/t;->s:Lya/K;

    .line 6
    .line 7
    iget-object v3, p0, Lya/t;->t:[Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Lya/t;->u:LX9/i;

    .line 10
    .line 11
    invoke-direct {v0, v2, v3, v4, v1}, Lya/t;-><init>(Lya/K;[Ljava/lang/Object;LX9/i;Lya/k;)V

    .line 12
    .line 13
    .line 14
    return-object v0
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

.method public final n(Lya/f;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lya/t;->z:Z

    .line 3
    .line 4
    if-nez v0, :cond_3

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lya/t;->z:Z

    .line 8
    .line 9
    iget-object v0, p0, Lya/t;->x:Lba/i;

    .line 10
    .line 11
    iget-object v1, p0, Lya/t;->y:Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    :try_start_1
    invoke-virtual {p0}, Lya/t;->a()Lba/i;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iput-object v2, p0, Lya/t;->x:Lba/i;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    move-object v0, v2

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    :try_start_2
    invoke-static {v1}, Lya/T;->o(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lya/t;->y:Ljava/lang/Throwable;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_1
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-interface {p1, p0, v1}, Lya/f;->g(Lya/c;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    iget-boolean v1, p0, Lya/t;->w:Z

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0}, Lba/i;->cancel()V

    .line 46
    .line 47
    .line 48
    :cond_2
    new-instance v1, Lo1/r;

    .line 49
    .line 50
    const/16 v2, 0x14

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-direct {v1, p0, p1, v2, v3}, Lo1/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lba/i;->e(LX9/k;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v0, "Already executed."

    .line 63
    .line 64
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :goto_1
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 69
    throw p1
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
