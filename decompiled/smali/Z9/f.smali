.class public final LZ9/f;
.super Laa/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, LZ9/f;->e:I

    iput-object p1, p0, LZ9/f;->f:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p2, p1}, Laa/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, LZ9/f;->e:I

    iput-object p2, p0, LZ9/f;->f:Ljava/lang/Object;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Laa/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method private final b()J
    .locals 13

    .line 1
    iget-object v0, p0, LZ9/f;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lba/l;

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    iget-object v3, v0, Lba/l;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    const-wide/high16 v6, -0x8000000000000000L

    .line 18
    .line 19
    move-wide v7, v6

    .line 20
    move-object v6, v5

    .line 21
    move v5, v4

    .line 22
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    if-eqz v9, :cond_2

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    check-cast v9, Lba/k;

    .line 33
    .line 34
    const-string v10, "connection"

    .line 35
    .line 36
    invoke-static {v9, v10}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    monitor-enter v9

    .line 40
    :try_start_0
    invoke-virtual {v0, v9, v1, v2}, Lba/l;->b(Lba/k;J)I

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    if-lez v10, :cond_0

    .line 45
    .line 46
    add-int/lit8 v5, v5, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    iget-wide v10, v9, Lba/k;->q:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    sub-long v10, v1, v10

    .line 54
    .line 55
    cmp-long v12, v10, v7

    .line 56
    .line 57
    if-lez v12, :cond_1

    .line 58
    .line 59
    move-object v6, v9

    .line 60
    move-wide v7, v10

    .line 61
    :cond_1
    :goto_1
    monitor-exit v9

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    monitor-exit v9

    .line 65
    throw v0

    .line 66
    :cond_2
    iget-wide v9, v0, Lba/l;->a:J

    .line 67
    .line 68
    cmp-long v3, v7, v9

    .line 69
    .line 70
    if-gez v3, :cond_6

    .line 71
    .line 72
    const/4 v3, 0x5

    .line 73
    if-le v4, v3, :cond_3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    if-lez v4, :cond_4

    .line 77
    .line 78
    sub-long/2addr v9, v7

    .line 79
    return-wide v9

    .line 80
    :cond_4
    if-lez v5, :cond_5

    .line 81
    .line 82
    return-wide v9

    .line 83
    :cond_5
    const-wide/16 v0, -0x1

    .line 84
    .line 85
    return-wide v0

    .line 86
    :cond_6
    :goto_2
    invoke-static {v6}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    monitor-enter v6

    .line 90
    :try_start_1
    iget-object v3, v6, Lba/k;->p:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 96
    const-wide/16 v4, 0x0

    .line 97
    .line 98
    if-nez v3, :cond_7

    .line 99
    .line 100
    monitor-exit v6

    .line 101
    return-wide v4

    .line 102
    :cond_7
    :try_start_2
    iget-wide v9, v6, Lba/k;->q:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 103
    .line 104
    add-long/2addr v9, v7

    .line 105
    cmp-long v1, v9, v1

    .line 106
    .line 107
    if-eqz v1, :cond_8

    .line 108
    .line 109
    monitor-exit v6

    .line 110
    return-wide v4

    .line 111
    :cond_8
    const/4 v1, 0x1

    .line 112
    :try_start_3
    iput-boolean v1, v6, Lba/k;->j:Z

    .line 113
    .line 114
    iget-object v1, v0, Lba/l;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 115
    .line 116
    invoke-virtual {v1, v6}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 117
    .line 118
    .line 119
    monitor-exit v6

    .line 120
    iget-object v1, v6, Lba/k;->d:Ljava/net/Socket;

    .line 121
    .line 122
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v1}, LY9/c;->e(Ljava/net/Socket;)V

    .line 126
    .line 127
    .line 128
    iget-object v1, v0, Lba/l;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_9

    .line 135
    .line 136
    iget-object v0, v0, Lba/l;->b:Laa/b;

    .line 137
    .line 138
    invoke-virtual {v0}, Laa/b;->a()V

    .line 139
    .line 140
    .line 141
    :cond_9
    return-wide v4

    .line 142
    :catchall_1
    move-exception v0

    .line 143
    monitor-exit v6

    .line 144
    throw v0
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


# virtual methods
.method public final a()J
    .locals 5

    .line 1
    iget v0, p0, LZ9/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ9/f;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lea/o;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-object v1, v0, Lea/o;->O:Lea/w;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x2

    .line 17
    invoke-virtual {v1, v3, v2, v2}, Lea/w;->i(IIZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception v1

    .line 22
    invoke-virtual {v0, v1}, Lea/o;->b(Ljava/io/IOException;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    const-wide/16 v0, -0x1

    .line 26
    .line 27
    return-wide v0

    .line 28
    :pswitch_0
    invoke-direct {p0}, LZ9/f;->b()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    return-wide v0

    .line 33
    :pswitch_1
    iget-object v0, p0, LZ9/f;->f:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, LO8/h;

    .line 36
    .line 37
    invoke-virtual {v0}, LO8/h;->invoke()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    const-wide/16 v0, -0x1

    .line 41
    .line 42
    return-wide v0

    .line 43
    :pswitch_2
    iget-object v0, p0, LZ9/f;->f:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, LZ9/g;

    .line 46
    .line 47
    monitor-enter v0

    .line 48
    :try_start_1
    iget-boolean v1, v0, LZ9/g;->C:Z

    .line 49
    .line 50
    const-wide/16 v2, -0x1

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iget-boolean v1, v0, LZ9/g;->D:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_0
    const/4 v1, 0x1

    .line 60
    :try_start_2
    invoke-virtual {v0}, LZ9/g;->A()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catchall_0
    move-exception v1

    .line 65
    goto :goto_5

    .line 66
    :catch_1
    :try_start_3
    iput-boolean v1, v0, LZ9/g;->E:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 67
    .line 68
    :goto_1
    :try_start_4
    invoke-virtual {v0}, LZ9/g;->i()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_1

    .line 73
    .line 74
    invoke-virtual {v0}, LZ9/g;->p()V

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    iput v4, v0, LZ9/g;->z:I
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :catch_2
    :try_start_5
    iput-boolean v1, v0, LZ9/g;->F:Z

    .line 82
    .line 83
    new-instance v1, Lma/d;

    .line 84
    .line 85
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-static {v1}, Lga/d;->c(Lma/v;)Lma/q;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iput-object v1, v0, LZ9/g;->x:Lma/q;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 93
    .line 94
    :cond_1
    :goto_2
    monitor-exit v0

    .line 95
    goto :goto_4

    .line 96
    :cond_2
    :goto_3
    monitor-exit v0

    .line 97
    :goto_4
    return-wide v2

    .line 98
    :goto_5
    monitor-exit v0

    .line 99
    throw v1

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
