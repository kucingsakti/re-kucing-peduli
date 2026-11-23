.class public final Lba/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lba/l;

.field public final b:LX9/a;

.field public final c:Lba/i;

.field public d:LP3/n;

.field public e:LB4/e;

.field public f:I

.field public g:I

.field public h:I

.field public i:LX9/P;


# direct methods
.method public constructor <init>(Lba/l;LX9/a;Lba/i;)V
    .locals 1

    .line 1
    const-string v0, "connectionPool"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "call"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lba/e;->a:Lba/l;

    .line 15
    .line 16
    iput-object p2, p0, Lba/e;->b:LX9/a;

    .line 17
    .line 18
    iput-object p3, p0, Lba/e;->c:Lba/i;

    .line 19
    .line 20
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


# virtual methods
.method public final a(IIIZZ)Lba/k;
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    :goto_0
    iget-object v1, p0, Lba/e;->c:Lba/i;

    .line 3
    .line 4
    iget-boolean v1, v1, Lba/i;->E:Z

    .line 5
    .line 6
    if-nez v1, :cond_15

    .line 7
    .line 8
    iget-object v1, p0, Lba/e;->c:Lba/i;

    .line 9
    .line 10
    iget-object v1, v1, Lba/i;->z:Lba/k;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_5

    .line 14
    .line 15
    monitor-enter v1

    .line 16
    :try_start_0
    iget-boolean v3, v1, Lba/k;->j:Z

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    iget-object v3, v1, Lba/k;->b:LX9/P;

    .line 21
    .line 22
    iget-object v3, v3, LX9/P;->a:LX9/a;

    .line 23
    .line 24
    iget-object v3, v3, LX9/a;->h:LX9/y;

    .line 25
    .line 26
    invoke-virtual {p0, v3}, Lba/e;->b(LX9/y;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    move-object v3, v2

    .line 34
    goto :goto_2

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    move-object p1, v0

    .line 37
    goto :goto_5

    .line 38
    :cond_1
    :goto_1
    iget-object v3, p0, Lba/e;->c:Lba/i;

    .line 39
    .line 40
    invoke-virtual {v3}, Lba/i;->l()Ljava/net/Socket;

    .line 41
    .line 42
    .line 43
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :goto_2
    monitor-exit v1

    .line 45
    iget-object v4, p0, Lba/e;->c:Lba/i;

    .line 46
    .line 47
    iget-object v4, v4, Lba/i;->z:Lba/k;

    .line 48
    .line 49
    if-eqz v4, :cond_3

    .line 50
    .line 51
    if-nez v3, :cond_2

    .line 52
    .line 53
    :goto_3
    move/from16 v2, p5

    .line 54
    .line 55
    goto/16 :goto_9

    .line 56
    .line 57
    :cond_2
    const-string p1, "Check failed."

    .line 58
    .line 59
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p2

    .line 65
    :cond_3
    if-nez v3, :cond_4

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_4
    invoke-static {v3}, LY9/c;->e(Ljava/net/Socket;)V

    .line 69
    .line 70
    .line 71
    :goto_4
    iget-object v1, p0, Lba/e;->c:Lba/i;

    .line 72
    .line 73
    const-string v3, "call"

    .line 74
    .line 75
    invoke-static {v1, v3}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_6

    .line 79
    :goto_5
    monitor-exit v1

    .line 80
    throw p1

    .line 81
    :cond_5
    :goto_6
    const/4 v1, 0x0

    .line 82
    iput v1, p0, Lba/e;->f:I

    .line 83
    .line 84
    iput v1, p0, Lba/e;->g:I

    .line 85
    .line 86
    iput v1, p0, Lba/e;->h:I

    .line 87
    .line 88
    iget-object v3, p0, Lba/e;->a:Lba/l;

    .line 89
    .line 90
    iget-object v4, p0, Lba/e;->b:LX9/a;

    .line 91
    .line 92
    iget-object v5, p0, Lba/e;->c:Lba/i;

    .line 93
    .line 94
    invoke-virtual {v3, v4, v5, v2, v1}, Lba/l;->a(LX9/a;Lba/i;Ljava/util/List;Z)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_6

    .line 99
    .line 100
    iget-object v1, p0, Lba/e;->c:Lba/i;

    .line 101
    .line 102
    iget-object v1, v1, Lba/i;->z:Lba/k;

    .line 103
    .line 104
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object v2, p0, Lba/e;->c:Lba/i;

    .line 108
    .line 109
    const-string v3, "call"

    .line 110
    .line 111
    invoke-static {v2, v3}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_6
    iget-object v3, p0, Lba/e;->i:LX9/P;

    .line 116
    .line 117
    if-eqz v3, :cond_7

    .line 118
    .line 119
    iput-object v2, p0, Lba/e;->i:LX9/P;

    .line 120
    .line 121
    :goto_7
    move-object v4, v2

    .line 122
    goto/16 :goto_8

    .line 123
    .line 124
    :cond_7
    iget-object v3, p0, Lba/e;->d:LP3/n;

    .line 125
    .line 126
    if-eqz v3, :cond_9

    .line 127
    .line 128
    invoke-virtual {v3}, LP3/n;->b()Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_9

    .line 133
    .line 134
    iget-object v1, p0, Lba/e;->d:LP3/n;

    .line 135
    .line 136
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, LP3/n;->b()Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_8

    .line 144
    .line 145
    iget v3, v1, LP3/n;->b:I

    .line 146
    .line 147
    add-int/lit8 v4, v3, 0x1

    .line 148
    .line 149
    iput v4, v1, LP3/n;->b:I

    .line 150
    .line 151
    iget-object v1, v1, LP3/n;->a:Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    move-object v3, v1

    .line 158
    check-cast v3, LX9/P;

    .line 159
    .line 160
    goto :goto_7

    .line 161
    :cond_8
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 162
    .line 163
    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 164
    .line 165
    .line 166
    throw p1

    .line 167
    :cond_9
    iget-object v3, p0, Lba/e;->e:LB4/e;

    .line 168
    .line 169
    if-nez v3, :cond_a

    .line 170
    .line 171
    new-instance v3, LB4/e;

    .line 172
    .line 173
    iget-object v4, p0, Lba/e;->b:LX9/a;

    .line 174
    .line 175
    iget-object v5, p0, Lba/e;->c:Lba/i;

    .line 176
    .line 177
    iget-object v6, v5, Lba/i;->s:LX9/E;

    .line 178
    .line 179
    iget-object v6, v6, LX9/E;->S:LP0/d;

    .line 180
    .line 181
    invoke-direct {v3, v4, v6, v5}, LB4/e;-><init>(LX9/a;LP0/d;LX9/j;)V

    .line 182
    .line 183
    .line 184
    iput-object v3, p0, Lba/e;->e:LB4/e;

    .line 185
    .line 186
    :cond_a
    invoke-virtual {v3}, LB4/e;->l()LP3/n;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    iput-object v3, p0, Lba/e;->d:LP3/n;

    .line 191
    .line 192
    iget-object v4, v3, LP3/n;->a:Ljava/util/ArrayList;

    .line 193
    .line 194
    iget-object v5, p0, Lba/e;->c:Lba/i;

    .line 195
    .line 196
    iget-boolean v5, v5, Lba/i;->E:Z

    .line 197
    .line 198
    if-nez v5, :cond_14

    .line 199
    .line 200
    iget-object v5, p0, Lba/e;->a:Lba/l;

    .line 201
    .line 202
    iget-object v6, p0, Lba/e;->b:LX9/a;

    .line 203
    .line 204
    iget-object v7, p0, Lba/e;->c:Lba/i;

    .line 205
    .line 206
    invoke-virtual {v5, v6, v7, v4, v1}, Lba/l;->a(LX9/a;Lba/i;Ljava/util/List;Z)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_b

    .line 211
    .line 212
    iget-object v1, p0, Lba/e;->c:Lba/i;

    .line 213
    .line 214
    iget-object v1, v1, Lba/i;->z:Lba/k;

    .line 215
    .line 216
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    iget-object v2, p0, Lba/e;->c:Lba/i;

    .line 220
    .line 221
    const-string v3, "call"

    .line 222
    .line 223
    invoke-static {v2, v3}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    goto/16 :goto_3

    .line 227
    .line 228
    :cond_b
    invoke-virtual {v3}, LP3/n;->b()Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_13

    .line 233
    .line 234
    iget v1, v3, LP3/n;->b:I

    .line 235
    .line 236
    add-int/lit8 v5, v1, 0x1

    .line 237
    .line 238
    iput v5, v3, LP3/n;->b:I

    .line 239
    .line 240
    iget-object v3, v3, LP3/n;->a:Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    move-object v3, v1

    .line 247
    check-cast v3, LX9/P;

    .line 248
    .line 249
    :goto_8
    new-instance v5, Lba/k;

    .line 250
    .line 251
    iget-object v1, p0, Lba/e;->a:Lba/l;

    .line 252
    .line 253
    invoke-direct {v5, v1, v3}, Lba/k;-><init>(Lba/l;LX9/P;)V

    .line 254
    .line 255
    .line 256
    iget-object v1, p0, Lba/e;->c:Lba/i;

    .line 257
    .line 258
    iput-object v5, v1, Lba/i;->G:Lba/k;

    .line 259
    .line 260
    :try_start_1
    iget-object v10, p0, Lba/e;->c:Lba/i;

    .line 261
    .line 262
    move v6, p1

    .line 263
    move v7, p2

    .line 264
    move v8, p3

    .line 265
    move v9, p4

    .line 266
    invoke-virtual/range {v5 .. v10}, Lba/k;->c(IIIZLX9/j;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 267
    .line 268
    .line 269
    iget-object v1, p0, Lba/e;->c:Lba/i;

    .line 270
    .line 271
    iput-object v2, v1, Lba/i;->G:Lba/k;

    .line 272
    .line 273
    iget-object v1, p0, Lba/e;->c:Lba/i;

    .line 274
    .line 275
    iget-object v1, v1, Lba/i;->s:LX9/E;

    .line 276
    .line 277
    iget-object v1, v1, LX9/E;->S:LP0/d;

    .line 278
    .line 279
    invoke-virtual {v1, v3}, LP0/d;->o(LX9/P;)V

    .line 280
    .line 281
    .line 282
    iget-object v1, p0, Lba/e;->a:Lba/l;

    .line 283
    .line 284
    iget-object v2, p0, Lba/e;->b:LX9/a;

    .line 285
    .line 286
    iget-object v6, p0, Lba/e;->c:Lba/i;

    .line 287
    .line 288
    invoke-virtual {v1, v2, v6, v4, v0}, Lba/l;->a(LX9/a;Lba/i;Ljava/util/List;Z)Z

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    if-eqz v1, :cond_c

    .line 293
    .line 294
    iget-object v1, p0, Lba/e;->c:Lba/i;

    .line 295
    .line 296
    iget-object v1, v1, Lba/i;->z:Lba/k;

    .line 297
    .line 298
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    iput-object v3, p0, Lba/e;->i:LX9/P;

    .line 302
    .line 303
    iget-object v2, v5, Lba/k;->d:Ljava/net/Socket;

    .line 304
    .line 305
    invoke-static {v2}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    invoke-static {v2}, LY9/c;->e(Ljava/net/Socket;)V

    .line 309
    .line 310
    .line 311
    iget-object v2, p0, Lba/e;->c:Lba/i;

    .line 312
    .line 313
    const-string v3, "call"

    .line 314
    .line 315
    invoke-static {v2, v3}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    goto/16 :goto_3

    .line 319
    .line 320
    :cond_c
    monitor-enter v5

    .line 321
    :try_start_2
    iget-object v1, p0, Lba/e;->a:Lba/l;

    .line 322
    .line 323
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    sget-object v2, LY9/c;->a:[B

    .line 327
    .line 328
    iget-object v2, v1, Lba/l;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 329
    .line 330
    invoke-virtual {v2, v5}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    iget-object v2, v1, Lba/l;->b:Laa/b;

    .line 334
    .line 335
    iget-object v1, v1, Lba/l;->c:LZ9/f;

    .line 336
    .line 337
    invoke-static {v2, v1}, Laa/b;->d(Laa/b;Laa/a;)V

    .line 338
    .line 339
    .line 340
    iget-object v1, p0, Lba/e;->c:Lba/i;

    .line 341
    .line 342
    invoke-virtual {v1, v5}, Lba/i;->c(Lba/k;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 343
    .line 344
    .line 345
    monitor-exit v5

    .line 346
    iget-object v1, p0, Lba/e;->c:Lba/i;

    .line 347
    .line 348
    const-string v2, "call"

    .line 349
    .line 350
    invoke-static {v1, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    move/from16 v2, p5

    .line 354
    .line 355
    move-object v1, v5

    .line 356
    :goto_9
    invoke-virtual {v1, v2}, Lba/k;->j(Z)Z

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    if-eqz v3, :cond_d

    .line 361
    .line 362
    return-object v1

    .line 363
    :cond_d
    invoke-virtual {v1}, Lba/k;->l()V

    .line 364
    .line 365
    .line 366
    iget-object v1, p0, Lba/e;->i:LX9/P;

    .line 367
    .line 368
    if-eqz v1, :cond_e

    .line 369
    .line 370
    goto/16 :goto_0

    .line 371
    .line 372
    :cond_e
    iget-object v1, p0, Lba/e;->d:LP3/n;

    .line 373
    .line 374
    if-nez v1, :cond_f

    .line 375
    .line 376
    move v1, v0

    .line 377
    goto :goto_a

    .line 378
    :cond_f
    invoke-virtual {v1}, LP3/n;->b()Z

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    :goto_a
    if-eqz v1, :cond_10

    .line 383
    .line 384
    goto/16 :goto_0

    .line 385
    .line 386
    :cond_10
    iget-object v1, p0, Lba/e;->e:LB4/e;

    .line 387
    .line 388
    if-nez v1, :cond_11

    .line 389
    .line 390
    move v1, v0

    .line 391
    goto :goto_b

    .line 392
    :cond_11
    invoke-virtual {v1}, LB4/e;->j()Z

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    :goto_b
    if-eqz v1, :cond_12

    .line 397
    .line 398
    goto/16 :goto_0

    .line 399
    .line 400
    :cond_12
    new-instance p1, Ljava/io/IOException;

    .line 401
    .line 402
    const-string p2, "exhausted all routes"

    .line 403
    .line 404
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    throw p1

    .line 408
    :catchall_1
    move-exception v0

    .line 409
    move-object p1, v0

    .line 410
    monitor-exit v5

    .line 411
    throw p1

    .line 412
    :catchall_2
    move-exception v0

    .line 413
    move-object p1, v0

    .line 414
    iget-object p2, p0, Lba/e;->c:Lba/i;

    .line 415
    .line 416
    iput-object v2, p2, Lba/i;->G:Lba/k;

    .line 417
    .line 418
    throw p1

    .line 419
    :cond_13
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 420
    .line 421
    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 422
    .line 423
    .line 424
    throw p1

    .line 425
    :cond_14
    new-instance p1, Ljava/io/IOException;

    .line 426
    .line 427
    const-string p2, "Canceled"

    .line 428
    .line 429
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    throw p1

    .line 433
    :cond_15
    new-instance p1, Ljava/io/IOException;

    .line 434
    .line 435
    const-string p2, "Canceled"

    .line 436
    .line 437
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    throw p1
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method public final b(LX9/y;)Z
    .locals 3

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lba/e;->b:LX9/a;

    .line 7
    .line 8
    iget-object v0, v0, LX9/a;->h:LX9/y;

    .line 9
    .line 10
    iget v1, v0, LX9/y;->e:I

    .line 11
    .line 12
    iget v2, p1, LX9/y;->e:I

    .line 13
    .line 14
    if-ne v2, v1, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, LX9/y;->d:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v0, v0, LX9/y;->d:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p1, v0}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    return p1

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    return p1
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final c(Ljava/io/IOException;)V
    .locals 2

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lba/e;->i:LX9/P;

    .line 8
    .line 9
    instance-of v0, p1, Lokhttp3/internal/http2/StreamResetException;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object v0, p1

    .line 14
    check-cast v0, Lokhttp3/internal/http2/StreamResetException;

    .line 15
    .line 16
    sget-object v1, Lea/a;->x:Lea/a;

    .line 17
    .line 18
    iget-object v0, v0, Lokhttp3/internal/http2/StreamResetException;->s:Lea/a;

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    iget p1, p0, Lba/e;->f:I

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x1

    .line 25
    .line 26
    iput p1, p0, Lba/e;->f:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    instance-of p1, p1, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget p1, p0, Lba/e;->g:I

    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    iput p1, p0, Lba/e;->g:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iget p1, p0, Lba/e;->h:I

    .line 41
    .line 42
    add-int/lit8 p1, p1, 0x1

    .line 43
    .line 44
    iput p1, p0, Lba/e;->h:I

    .line 45
    .line 46
    return-void
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
