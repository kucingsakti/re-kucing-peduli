.class public final Lk7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk7/b;


# instance fields
.field public A:D

.field public final B:LE/g;

.field public final C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

.field public final D:I

.field public final E:Lk7/e;

.field public final F:Lcom/tonyodev/fetch2/Download;

.field public final G:Lq7/d;

.field public final H:Lq7/f;

.field public final I:Lo7/a;

.field public final J:Lo1/k;

.field public volatile s:Z

.field public volatile t:Z

.field public u:Lm7/b;

.field public volatile v:J

.field public volatile w:Z

.field public volatile x:J

.field public y:J

.field public final z:Lh8/j;


# direct methods
.method public constructor <init>(Lcom/tonyodev/fetch2/Download;Lq7/d;Lq7/f;Lo7/a;Lo1/k;)V
    .locals 1

    .line 1
    const-string v0, "downloader"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "logger"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lk7/f;->F:Lcom/tonyodev/fetch2/Download;

    .line 15
    .line 16
    iput-object p2, p0, Lk7/f;->G:Lq7/d;

    .line 17
    .line 18
    iput-object p3, p0, Lk7/f;->H:Lq7/f;

    .line 19
    .line 20
    iput-object p4, p0, Lk7/f;->I:Lo7/a;

    .line 21
    .line 22
    iput-object p5, p0, Lk7/f;->J:Lo1/k;

    .line 23
    .line 24
    const-wide/16 p1, -0x1

    .line 25
    .line 26
    iput-wide p1, p0, Lk7/f;->v:J

    .line 27
    .line 28
    iput-wide p1, p0, Lk7/f;->y:J

    .line 29
    .line 30
    new-instance p1, Lk7/d;

    .line 31
    .line 32
    const/4 p2, 0x1

    .line 33
    invoke-direct {p1, p0, p2}, Lk7/d;-><init>(Lk7/f;I)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, LD3/b;->s(Lu8/a;)Lh8/j;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lk7/f;->z:Lh8/j;

    .line 41
    .line 42
    new-instance p1, LE/g;

    .line 43
    .line 44
    const/4 p2, 0x5

    .line 45
    invoke-direct {p1, p2}, LE/g;-><init>(I)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lk7/f;->B:LE/g;

    .line 49
    .line 50
    new-instance p1, Lk7/d;

    .line 51
    .line 52
    const/4 p2, 0x0

    .line 53
    invoke-direct {p1, p0, p2}, Lk7/d;-><init>(Lk7/f;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lk7/d;->invoke()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 61
    .line 62
    iput-object p1, p0, Lk7/f;->C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 63
    .line 64
    const/4 p1, 0x1

    .line 65
    iput p1, p0, Lk7/f;->D:I

    .line 66
    .line 67
    new-instance p1, Lk7/e;

    .line 68
    .line 69
    invoke-direct {p1, p0}, Lk7/e;-><init>(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lk7/f;->E:Lk7/e;

    .line 73
    .line 74
    return-void
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
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
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


# virtual methods
.method public final a()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lk7/f;->A:D

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    int-to-double v2, v2

    .line 5
    cmpg-double v2, v0, v2

    .line 6
    .line 7
    if-gez v2, :cond_0

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    double-to-long v0, v0

    .line 17
    return-wide v0
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

.method public final b()Lcom/tonyodev/fetch2/database/DownloadInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/f;->z:Lh8/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh8/j;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 8
    .line 9
    return-object v0
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

.method public final c()LFa/e;
    .locals 14

    .line 1
    iget-object v0, p0, Lk7/f;->F:Lcom/tonyodev/fetch2/Download;

    .line 2
    .line 3
    check-cast v0, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->y:Ljava/util/Map;

    .line 6
    .line 7
    invoke-static {v0}, Li8/y;->C(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "bytes="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, Lk7/f;->x:J

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 v1, 0x2d

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "Range"

    .line 33
    .line 34
    invoke-interface {v4, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    new-instance v1, LFa/e;

    .line 38
    .line 39
    iget-object v0, p0, Lk7/f;->F:Lcom/tonyodev/fetch2/Download;

    .line 40
    .line 41
    check-cast v0, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 42
    .line 43
    iget v2, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 44
    .line 45
    iget-object v3, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->u:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v5, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->v:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v5}, LC3/b;->v(Ljava/lang/String;)Landroid/net/Uri;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    iget-object v0, p0, Lk7/f;->F:Lcom/tonyodev/fetch2/Download;

    .line 54
    .line 55
    check-cast v0, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 56
    .line 57
    iget-object v7, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->F:Ljava/lang/String;

    .line 58
    .line 59
    iget-wide v8, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->H:J

    .line 60
    .line 61
    iget-object v11, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->J:Lcom/tonyodev/fetch2core/Extras;

    .line 62
    .line 63
    const/4 v13, 0x1

    .line 64
    const-string v10, "GET"

    .line 65
    .line 66
    const-string v12, ""

    .line 67
    .line 68
    invoke-direct/range {v1 .. v13}, LFa/e;-><init>(ILjava/lang/String;Ljava/util/LinkedHashMap;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;JLjava/lang/String;Lcom/tonyodev/fetch2core/Extras;Ljava/lang/String;I)V

    .line 69
    .line 70
    .line 71
    return-object v1
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

.method public final d()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lk7/f;->x:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lk7/f;->v:J

    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-gtz v0, :cond_1

    .line 14
    .line 15
    :cond_0
    iget-boolean v0, p0, Lk7/f;->w:Z

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    :cond_1
    iget-wide v0, p0, Lk7/f;->x:J

    .line 20
    .line 21
    iget-wide v2, p0, Lk7/f;->v:J

    .line 22
    .line 23
    cmp-long v0, v0, v2

    .line 24
    .line 25
    if-ltz v0, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :cond_2
    const/4 v0, 0x0

    .line 30
    return v0
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

.method public final e()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lk7/f;->s:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, Lk7/f;->t:Z

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0}, Lk7/f;->d()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    iget-wide v0, p0, Lk7/f;->x:J

    .line 16
    .line 17
    iput-wide v0, p0, Lk7/f;->v:J

    .line 18
    .line 19
    invoke-virtual {p0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-wide v1, p0, Lk7/f;->x:J

    .line 24
    .line 25
    iput-wide v1, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 26
    .line 27
    invoke-virtual {p0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-wide v1, p0, Lk7/f;->v:J

    .line 32
    .line 33
    iput-wide v1, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 34
    .line 35
    iget-object v0, p0, Lk7/f;->C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 36
    .line 37
    iget-wide v1, p0, Lk7/f;->x:J

    .line 38
    .line 39
    iput-wide v1, v0, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->w:J

    .line 40
    .line 41
    iget-object v0, p0, Lk7/f;->C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 42
    .line 43
    iget-wide v1, p0, Lk7/f;->v:J

    .line 44
    .line 45
    iput-wide v1, v0, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->v:J

    .line 46
    .line 47
    iget-boolean v0, p0, Lk7/f;->t:Z

    .line 48
    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    iget-boolean v0, p0, Lk7/f;->s:Z

    .line 52
    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    iget-object v0, p0, Lk7/f;->u:Lm7/b;

    .line 56
    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    invoke-virtual {p0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Lm7/b;->e(Lcom/tonyodev/fetch2/database/DownloadInfo;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    iget-object v0, p0, Lk7/f;->u:Lm7/b;

    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    invoke-virtual {p0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v2, p0, Lk7/f;->C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 75
    .line 76
    iget v3, p0, Lk7/f;->D:I

    .line 77
    .line 78
    invoke-virtual {v0, v1, v2, v3}, Lm7/b;->a(Lcom/tonyodev/fetch2/database/DownloadInfo;Lcom/tonyodev/fetch2core/DownloadBlock;I)V

    .line 79
    .line 80
    .line 81
    :cond_1
    invoke-virtual {p0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-wide v1, p0, Lk7/f;->y:J

    .line 86
    .line 87
    iput-wide v1, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 88
    .line 89
    invoke-virtual {p0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p0}, Lk7/f;->a()J

    .line 94
    .line 95
    .line 96
    move-result-wide v1

    .line 97
    iput-wide v1, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 98
    .line 99
    invoke-virtual {p0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    new-instance v1, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 107
    .line 108
    invoke-direct {v1}, Lcom/tonyodev/fetch2/database/DownloadInfo;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v1}, Li8/C;->z(Lcom/tonyodev/fetch2/Download;Lcom/tonyodev/fetch2/database/DownloadInfo;)V

    .line 112
    .line 113
    .line 114
    iget-object v2, p0, Lk7/f;->u:Lm7/b;

    .line 115
    .line 116
    if-eqz v2, :cond_2

    .line 117
    .line 118
    invoke-virtual {p0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {p0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-wide v4, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 127
    .line 128
    invoke-virtual {p0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iget-wide v6, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 133
    .line 134
    invoke-virtual/range {v2 .. v7}, Lm7/b;->c(Lcom/tonyodev/fetch2/database/DownloadInfo;JJ)V

    .line 135
    .line 136
    .line 137
    :cond_2
    invoke-virtual {p0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const-wide/16 v2, -0x1

    .line 142
    .line 143
    iput-wide v2, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 144
    .line 145
    invoke-virtual {p0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    iput-wide v2, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 150
    .line 151
    iget-object v0, p0, Lk7/f;->u:Lm7/b;

    .line 152
    .line 153
    if-eqz v0, :cond_3

    .line 154
    .line 155
    iget-boolean v2, v0, Lm7/b;->a:Z

    .line 156
    .line 157
    if-nez v2, :cond_3

    .line 158
    .line 159
    sget-object v2, Lh7/f;->x:Lh7/f;

    .line 160
    .line 161
    iput-object v2, v1, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 162
    .line 163
    iget-object v2, v0, Lm7/b;->b:Lm7/a;

    .line 164
    .line 165
    invoke-virtual {v2, v1}, Lm7/a;->b(Lcom/tonyodev/fetch2/database/DownloadInfo;)V

    .line 166
    .line 167
    .line 168
    iget-object v0, v0, Lm7/b;->c:LJ4/c;

    .line 169
    .line 170
    invoke-virtual {v0, v1}, LJ4/c;->b(Lcom/tonyodev/fetch2/Download;)V

    .line 171
    .line 172
    .line 173
    :cond_3
    return-void
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

.method public final f(Ljava/io/BufferedInputStream;LD6/a;I)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    iget-wide v3, v0, Lk7/f;->x:J

    .line 8
    .line 9
    new-array v5, v2, [B

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v6

    .line 15
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 16
    .line 17
    .line 18
    move-result-wide v8

    .line 19
    const/4 v10, 0x0

    .line 20
    invoke-virtual {v1, v5, v10, v2}, Ljava/io/BufferedInputStream;->read([BII)I

    .line 21
    .line 22
    .line 23
    move-result v11

    .line 24
    move-wide v13, v6

    .line 25
    move v6, v11

    .line 26
    move-wide v11, v13

    .line 27
    move-wide v13, v8

    .line 28
    :goto_0
    iget-boolean v7, v0, Lk7/f;->s:Z

    .line 29
    .line 30
    if-nez v7, :cond_7

    .line 31
    .line 32
    iget-boolean v7, v0, Lk7/f;->t:Z

    .line 33
    .line 34
    if-nez v7, :cond_7

    .line 35
    .line 36
    const/4 v7, -0x1

    .line 37
    if-eq v6, v7, :cond_7

    .line 38
    .line 39
    move-object/from16 v7, p2

    .line 40
    .line 41
    invoke-virtual {v7, v6, v5}, LD6/a;->c(I[B)V

    .line 42
    .line 43
    .line 44
    iget-boolean v8, v0, Lk7/f;->t:Z

    .line 45
    .line 46
    if-nez v8, :cond_6

    .line 47
    .line 48
    iget-boolean v8, v0, Lk7/f;->s:Z

    .line 49
    .line 50
    if-nez v8, :cond_6

    .line 51
    .line 52
    iget-wide v8, v0, Lk7/f;->x:J

    .line 53
    .line 54
    move-wide/from16 v19, v11

    .line 55
    .line 56
    int-to-long v10, v6

    .line 57
    add-long/2addr v8, v10

    .line 58
    iput-wide v8, v0, Lk7/f;->x:J

    .line 59
    .line 60
    invoke-virtual {v0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    iget-wide v8, v0, Lk7/f;->x:J

    .line 65
    .line 66
    iput-wide v8, v6, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 67
    .line 68
    invoke-virtual {v0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    iget-wide v8, v0, Lk7/f;->v:J

    .line 73
    .line 74
    iput-wide v8, v6, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 75
    .line 76
    iget-object v6, v0, Lk7/f;->C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 77
    .line 78
    iget-wide v8, v0, Lk7/f;->x:J

    .line 79
    .line 80
    iput-wide v8, v6, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->w:J

    .line 81
    .line 82
    iget-object v6, v0, Lk7/f;->C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 83
    .line 84
    iget-wide v8, v0, Lk7/f;->v:J

    .line 85
    .line 86
    iput-wide v8, v6, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->v:J

    .line 87
    .line 88
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 89
    .line 90
    .line 91
    move-result-wide v15

    .line 92
    const-wide/16 v17, 0x3e8

    .line 93
    .line 94
    invoke-static/range {v13 .. v18}, LC3/b;->C(JJJ)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    move-wide v8, v13

    .line 99
    if-eqz v6, :cond_0

    .line 100
    .line 101
    iget-wide v10, v0, Lk7/f;->x:J

    .line 102
    .line 103
    sub-long/2addr v10, v3

    .line 104
    iget-object v3, v0, Lk7/f;->B:LE/g;

    .line 105
    .line 106
    long-to-double v10, v10

    .line 107
    invoke-virtual {v3, v10, v11}, LE/g;->a(D)V

    .line 108
    .line 109
    .line 110
    iget-object v3, v0, Lk7/f;->B:LE/g;

    .line 111
    .line 112
    invoke-static {v3}, LE/g;->b(LE/g;)D

    .line 113
    .line 114
    .line 115
    move-result-wide v3

    .line 116
    iput-wide v3, v0, Lk7/f;->A:D

    .line 117
    .line 118
    iget-wide v10, v0, Lk7/f;->x:J

    .line 119
    .line 120
    iget-wide v12, v0, Lk7/f;->v:J

    .line 121
    .line 122
    invoke-virtual {v0}, Lk7/f;->a()J

    .line 123
    .line 124
    .line 125
    move-result-wide v14

    .line 126
    invoke-static/range {v10 .. v15}, LC3/b;->c(JJJ)J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    iput-wide v3, v0, Lk7/f;->y:J

    .line 131
    .line 132
    iget-wide v3, v0, Lk7/f;->x:J

    .line 133
    .line 134
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 135
    .line 136
    .line 137
    move-result-wide v13

    .line 138
    const-wide/16 v15, 0x190

    .line 139
    .line 140
    move-wide/from16 v11, v19

    .line 141
    .line 142
    invoke-static/range {v11 .. v16}, LC3/b;->C(JJJ)Z

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    if-eqz v10, :cond_4

    .line 147
    .line 148
    iget-object v10, v0, Lk7/f;->C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 149
    .line 150
    iget-wide v11, v0, Lk7/f;->x:J

    .line 151
    .line 152
    iput-wide v11, v10, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->w:J

    .line 153
    .line 154
    iget-boolean v10, v0, Lk7/f;->t:Z

    .line 155
    .line 156
    if-nez v10, :cond_3

    .line 157
    .line 158
    iget-boolean v10, v0, Lk7/f;->s:Z

    .line 159
    .line 160
    if-nez v10, :cond_3

    .line 161
    .line 162
    iget-object v10, v0, Lk7/f;->u:Lm7/b;

    .line 163
    .line 164
    if-eqz v10, :cond_1

    .line 165
    .line 166
    invoke-virtual {v0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    invoke-virtual {v10, v11}, Lm7/b;->e(Lcom/tonyodev/fetch2/database/DownloadInfo;)V

    .line 171
    .line 172
    .line 173
    :cond_1
    iget-object v10, v0, Lk7/f;->u:Lm7/b;

    .line 174
    .line 175
    if-eqz v10, :cond_2

    .line 176
    .line 177
    invoke-virtual {v0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 178
    .line 179
    .line 180
    move-result-object v11

    .line 181
    iget-object v12, v0, Lk7/f;->C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 182
    .line 183
    iget v13, v0, Lk7/f;->D:I

    .line 184
    .line 185
    invoke-virtual {v10, v11, v12, v13}, Lm7/b;->a(Lcom/tonyodev/fetch2/database/DownloadInfo;Lcom/tonyodev/fetch2core/DownloadBlock;I)V

    .line 186
    .line 187
    .line 188
    :cond_2
    invoke-virtual {v0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    iget-wide v11, v0, Lk7/f;->y:J

    .line 193
    .line 194
    iput-wide v11, v10, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 195
    .line 196
    invoke-virtual {v0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 197
    .line 198
    .line 199
    move-result-object v10

    .line 200
    invoke-virtual {v0}, Lk7/f;->a()J

    .line 201
    .line 202
    .line 203
    move-result-wide v11

    .line 204
    iput-wide v11, v10, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 205
    .line 206
    iget-object v13, v0, Lk7/f;->u:Lm7/b;

    .line 207
    .line 208
    if-eqz v13, :cond_3

    .line 209
    .line 210
    invoke-virtual {v0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 211
    .line 212
    .line 213
    move-result-object v14

    .line 214
    invoke-virtual {v0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    iget-wide v10, v10, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 219
    .line 220
    invoke-virtual {v0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 221
    .line 222
    .line 223
    move-result-object v12

    .line 224
    move-wide/from16 v21, v3

    .line 225
    .line 226
    iget-wide v3, v12, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 227
    .line 228
    move-wide/from16 v17, v3

    .line 229
    .line 230
    move-wide v15, v10

    .line 231
    invoke-virtual/range {v13 .. v18}, Lm7/b;->c(Lcom/tonyodev/fetch2/database/DownloadInfo;JJ)V

    .line 232
    .line 233
    .line 234
    goto :goto_1

    .line 235
    :cond_3
    move-wide/from16 v21, v3

    .line 236
    .line 237
    :goto_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 238
    .line 239
    .line 240
    move-result-wide v11

    .line 241
    goto :goto_2

    .line 242
    :cond_4
    move-wide/from16 v21, v3

    .line 243
    .line 244
    move-wide/from16 v11, v19

    .line 245
    .line 246
    :goto_2
    if-eqz v6, :cond_5

    .line 247
    .line 248
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 249
    .line 250
    .line 251
    move-result-wide v13

    .line 252
    :goto_3
    const/4 v10, 0x0

    .line 253
    goto :goto_4

    .line 254
    :cond_5
    move-wide v13, v8

    .line 255
    goto :goto_3

    .line 256
    :goto_4
    invoke-virtual {v1, v5, v10, v2}, Ljava/io/BufferedInputStream;->read([BII)I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    move v6, v3

    .line 261
    move-wide/from16 v3, v21

    .line 262
    .line 263
    goto/16 :goto_0

    .line 264
    .line 265
    :cond_6
    move-wide/from16 v19, v11

    .line 266
    .line 267
    move-wide v8, v13

    .line 268
    move-wide v13, v8

    .line 269
    move-wide/from16 v11, v19

    .line 270
    .line 271
    goto/16 :goto_0

    .line 272
    .line 273
    :cond_7
    move-object/from16 v7, p2

    .line 274
    .line 275
    invoke-virtual {v7}, LD6/a;->flush()V

    .line 276
    .line 277
    .line 278
    return-void
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
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
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
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk7/f;->u:Lm7/b;

    .line 2
    .line 3
    instance-of v1, v0, Lm7/b;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iput-boolean v1, v0, Lm7/b;->a:Z

    .line 12
    .line 13
    :cond_1
    iput-boolean v1, p0, Lk7/f;->s:Z

    .line 14
    .line 15
    return-void
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

.method public final i(Lm7/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk7/f;->u:Lm7/b;

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk7/f;->u:Lm7/b;

    .line 2
    .line 3
    instance-of v1, v0, Lm7/b;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iput-boolean v1, v0, Lm7/b;->a:Z

    .line 12
    .line 13
    :cond_1
    iput-boolean v1, p0, Lk7/f;->t:Z

    .line 14
    .line 15
    return-void
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

.method public final l()Lcom/tonyodev/fetch2/database/DownloadInfo;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-wide v1, p0, Lk7/f;->x:J

    .line 6
    .line 7
    iput-wide v1, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 8
    .line 9
    invoke-virtual {p0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-wide v1, p0, Lk7/f;->v:J

    .line 14
    .line 15
    iput-wide v1, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 16
    .line 17
    invoke-virtual {p0}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final p()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk7/f;->s:Z

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
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

.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "FileDownloader download:"

    .line 4
    .line 5
    const-string v0, "FileDownloader starting Download "

    .line 6
    .line 7
    const-string v3, "FileDownloader resuming Download "

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const-wide/16 v5, -0x1

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    :try_start_0
    iget-object v8, v1, Lk7/f;->F:Lcom/tonyodev/fetch2/Download;

    .line 14
    .line 15
    check-cast v8, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 16
    .line 17
    iget-wide v8, v8, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 18
    .line 19
    iput-wide v8, v1, Lk7/f;->x:J

    .line 20
    .line 21
    iget-object v8, v1, Lk7/f;->F:Lcom/tonyodev/fetch2/Download;

    .line 22
    .line 23
    check-cast v8, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 24
    .line 25
    iget-wide v8, v8, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 26
    .line 27
    iput-wide v8, v1, Lk7/f;->v:J

    .line 28
    .line 29
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    iget-wide v9, v1, Lk7/f;->x:J

    .line 34
    .line 35
    iput-wide v9, v8, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 36
    .line 37
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    iget-wide v9, v1, Lk7/f;->v:J

    .line 42
    .line 43
    iput-wide v9, v8, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 44
    .line 45
    iget-boolean v8, v1, Lk7/f;->s:Z

    .line 46
    .line 47
    if-nez v8, :cond_11

    .line 48
    .line 49
    iget-boolean v8, v1, Lk7/f;->t:Z

    .line 50
    .line 51
    if-nez v8, :cond_11

    .line 52
    .line 53
    invoke-virtual {v1}, Lk7/f;->c()LFa/e;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    iget-object v9, v1, Lk7/f;->G:Lq7/d;

    .line 58
    .line 59
    iget-object v10, v1, Lk7/f;->E:Lk7/e;

    .line 60
    .line 61
    invoke-interface {v9, v8, v10}, Lq7/d;->P(LFa/e;Lq7/j;)Lq7/c;

    .line 62
    .line 63
    .line 64
    move-result-object v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 65
    if-eqz v9, :cond_0

    .line 66
    .line 67
    :try_start_1
    iget-boolean v10, v9, Lq7/c;->b:Z

    .line 68
    .line 69
    if-eqz v10, :cond_0

    .line 70
    .line 71
    iget-wide v10, v9, Lq7/c;->c:J

    .line 72
    .line 73
    cmp-long v10, v10, v5

    .line 74
    .line 75
    if-nez v10, :cond_0

    .line 76
    .line 77
    iput-boolean v4, v1, Lk7/f;->w:Z

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :goto_0
    move-object v3, v7

    .line 81
    goto/16 :goto_1d

    .line 82
    .line 83
    :goto_1
    move-object v3, v7

    .line 84
    move-object v8, v3

    .line 85
    :goto_2
    move-object v7, v9

    .line 86
    goto/16 :goto_17

    .line 87
    .line 88
    :cond_0
    :goto_3
    if-eqz v9, :cond_1

    .line 89
    .line 90
    iget-boolean v11, v9, Lq7/c;->b:Z

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_1
    const/4 v11, 0x0

    .line 94
    :goto_4
    iget-boolean v12, v1, Lk7/f;->s:Z

    .line 95
    .line 96
    if-nez v12, :cond_a

    .line 97
    .line 98
    iget-boolean v12, v1, Lk7/f;->t:Z

    .line 99
    .line 100
    if-nez v12, :cond_a

    .line 101
    .line 102
    if-eqz v9, :cond_a

    .line 103
    .line 104
    if-eqz v11, :cond_a

    .line 105
    .line 106
    iget v11, v9, Lq7/c;->a:I

    .line 107
    .line 108
    const-wide/16 v12, 0x0

    .line 109
    .line 110
    const/16 v14, 0xce

    .line 111
    .line 112
    if-eq v11, v14, :cond_3

    .line 113
    .line 114
    iget-boolean v11, v9, Lq7/c;->f:Z

    .line 115
    .line 116
    if-eqz v11, :cond_2

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_2
    move-wide v10, v12

    .line 120
    goto :goto_6

    .line 121
    :cond_3
    :goto_5
    iget-object v11, v1, Lk7/f;->F:Lcom/tonyodev/fetch2/Download;

    .line 122
    .line 123
    check-cast v11, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 124
    .line 125
    iget-wide v10, v11, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 126
    .line 127
    :goto_6
    iput-wide v10, v1, Lk7/f;->x:J

    .line 128
    .line 129
    iget-wide v10, v9, Lq7/c;->c:J

    .line 130
    .line 131
    iput-wide v10, v1, Lk7/f;->v:J

    .line 132
    .line 133
    iget v10, v9, Lq7/c;->a:I

    .line 134
    .line 135
    if-ne v10, v14, :cond_4

    .line 136
    .line 137
    iget-object v0, v1, Lk7/f;->H:Lq7/f;

    .line 138
    .line 139
    new-instance v10, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v10, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Lk7/f;->l()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-virtual {v0, v3}, Lq7/f;->a(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    iget-wide v12, v1, Lk7/f;->x:J

    .line 159
    .line 160
    goto :goto_7

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    goto :goto_0

    .line 163
    :catch_0
    move-exception v0

    .line 164
    goto :goto_1

    .line 165
    :cond_4
    iget-object v3, v1, Lk7/f;->H:Lq7/f;

    .line 166
    .line 167
    new-instance v10, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1}, Lk7/f;->l()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v3, v0}, Lq7/f;->a(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    :goto_7
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iget-wide v10, v1, Lk7/f;->x:J

    .line 191
    .line 192
    iput-wide v10, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 193
    .line 194
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    iget-wide v10, v1, Lk7/f;->v:J

    .line 199
    .line 200
    iput-wide v10, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 201
    .line 202
    iget-object v0, v1, Lk7/f;->J:Lo1/k;

    .line 203
    .line 204
    iget-object v3, v8, LFa/e;->v:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v3, Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v0, v3}, Lo1/k;->k(Ljava/lang/String;)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-nez v0, :cond_6

    .line 213
    .line 214
    iget-object v0, v1, Lk7/f;->J:Lo1/k;

    .line 215
    .line 216
    iget-object v3, v8, LFa/e;->v:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v3, Ljava/lang/String;

    .line 219
    .line 220
    iget-object v10, v1, Lk7/f;->F:Lcom/tonyodev/fetch2/Download;

    .line 221
    .line 222
    check-cast v10, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 223
    .line 224
    iget v10, v10, Lcom/tonyodev/fetch2/database/DownloadInfo;->G:I

    .line 225
    .line 226
    const/4 v11, 0x2

    .line 227
    if-ne v10, v11, :cond_5

    .line 228
    .line 229
    move v10, v4

    .line 230
    goto :goto_8

    .line 231
    :cond_5
    const/4 v10, 0x0

    .line 232
    :goto_8
    invoke-virtual {v0, v3, v10}, Lo1/k;->f(Ljava/lang/String;Z)V

    .line 233
    .line 234
    .line 235
    :cond_6
    iget-object v0, v1, Lk7/f;->J:Lo1/k;

    .line 236
    .line 237
    iget-object v3, v8, LFa/e;->v:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v3, Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 242
    .line 243
    .line 244
    move-result-object v10

    .line 245
    iget-wide v10, v10, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 246
    .line 247
    invoke-virtual {v0, v3, v10, v11}, Lo1/k;->s(Ljava/lang/String;J)V

    .line 248
    .line 249
    .line 250
    iget-object v0, v1, Lk7/f;->J:Lo1/k;

    .line 251
    .line 252
    iget-object v0, v0, Lo1/k;->s:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v0, Landroid/content/Context;

    .line 255
    .line 256
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    const-string v3, "context.contentResolver"

    .line 261
    .line 262
    invoke-static {v0, v3}, Lv8/i;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    iget-object v3, v8, LFa/e;->v:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v3, Ljava/lang/String;

    .line 268
    .line 269
    invoke-static {v0, v3}, LC4/a;->v(Landroid/content/ContentResolver;Ljava/lang/String;)LD6/a;

    .line 270
    .line 271
    .line 272
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 273
    :try_start_2
    invoke-virtual {v3, v12, v13}, LD6/a;->a(J)V

    .line 274
    .line 275
    .line 276
    iget-boolean v0, v1, Lk7/f;->s:Z

    .line 277
    .line 278
    if-nez v0, :cond_9

    .line 279
    .line 280
    iget-boolean v0, v1, Lk7/f;->t:Z

    .line 281
    .line 282
    if-nez v0, :cond_9

    .line 283
    .line 284
    iget-object v0, v1, Lk7/f;->G:Lq7/d;

    .line 285
    .line 286
    invoke-interface {v0, v8}, Lq7/d;->y(LFa/e;)V

    .line 287
    .line 288
    .line 289
    new-instance v8, Ljava/io/BufferedInputStream;

    .line 290
    .line 291
    iget-object v0, v9, Lq7/c;->d:Ljava/io/InputStream;

    .line 292
    .line 293
    const/16 v10, 0x2000

    .line 294
    .line 295
    invoke-direct {v8, v0, v10}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 296
    .line 297
    .line 298
    :try_start_3
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    iget-wide v14, v1, Lk7/f;->x:J

    .line 303
    .line 304
    iput-wide v14, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 305
    .line 306
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    iget-wide v14, v1, Lk7/f;->v:J

    .line 311
    .line 312
    iput-wide v14, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 313
    .line 314
    iget-object v0, v1, Lk7/f;->C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 315
    .line 316
    iget-wide v14, v1, Lk7/f;->x:J

    .line 317
    .line 318
    iput-wide v14, v0, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->w:J

    .line 319
    .line 320
    iget-object v0, v1, Lk7/f;->C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 321
    .line 322
    iput-wide v12, v0, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->u:J

    .line 323
    .line 324
    iget-wide v11, v1, Lk7/f;->v:J

    .line 325
    .line 326
    iput-wide v11, v0, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->v:J

    .line 327
    .line 328
    iget-boolean v0, v1, Lk7/f;->t:Z

    .line 329
    .line 330
    if-nez v0, :cond_8

    .line 331
    .line 332
    iget-boolean v0, v1, Lk7/f;->s:Z

    .line 333
    .line 334
    if-nez v0, :cond_8

    .line 335
    .line 336
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    iput-wide v5, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 341
    .line 342
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    iput-wide v5, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 347
    .line 348
    iget-object v0, v1, Lk7/f;->u:Lm7/b;

    .line 349
    .line 350
    if-eqz v0, :cond_7

    .line 351
    .line 352
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 353
    .line 354
    .line 355
    move-result-object v7

    .line 356
    iget-object v11, v1, Lk7/f;->C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 357
    .line 358
    invoke-static {v11}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object v11

    .line 362
    iget v12, v1, Lk7/f;->D:I

    .line 363
    .line 364
    invoke-virtual {v0, v7, v11, v12}, Lm7/b;->d(Lcom/tonyodev/fetch2/database/DownloadInfo;Ljava/util/List;I)V

    .line 365
    .line 366
    .line 367
    goto :goto_a

    .line 368
    :goto_9
    move-object v7, v8

    .line 369
    goto/16 :goto_1d

    .line 370
    .line 371
    :catchall_1
    move-exception v0

    .line 372
    goto :goto_9

    .line 373
    :catch_1
    move-exception v0

    .line 374
    goto/16 :goto_2

    .line 375
    .line 376
    :cond_7
    :goto_a
    iget-object v0, v1, Lk7/f;->u:Lm7/b;

    .line 377
    .line 378
    if-eqz v0, :cond_8

    .line 379
    .line 380
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 381
    .line 382
    .line 383
    move-result-object v7

    .line 384
    iget-object v11, v1, Lk7/f;->C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 385
    .line 386
    iget v12, v1, Lk7/f;->D:I

    .line 387
    .line 388
    invoke-virtual {v0, v7, v11, v12}, Lm7/b;->a(Lcom/tonyodev/fetch2/database/DownloadInfo;Lcom/tonyodev/fetch2core/DownloadBlock;I)V

    .line 389
    .line 390
    .line 391
    :cond_8
    invoke-virtual {v1, v8, v3, v10}, Lk7/f;->f(Ljava/io/BufferedInputStream;LD6/a;I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 392
    .line 393
    .line 394
    :goto_b
    move-object v7, v9

    .line 395
    goto/16 :goto_f

    .line 396
    .line 397
    :catchall_2
    move-exception v0

    .line 398
    goto/16 :goto_1d

    .line 399
    .line 400
    :catch_2
    move-exception v0

    .line 401
    move-object v8, v7

    .line 402
    goto/16 :goto_2

    .line 403
    .line 404
    :cond_9
    move-object v8, v7

    .line 405
    goto :goto_b

    .line 406
    :cond_a
    if-nez v9, :cond_c

    .line 407
    .line 408
    :try_start_4
    iget-boolean v0, v1, Lk7/f;->s:Z

    .line 409
    .line 410
    if-nez v0, :cond_c

    .line 411
    .line 412
    iget-boolean v0, v1, Lk7/f;->t:Z

    .line 413
    .line 414
    if-nez v0, :cond_c

    .line 415
    .line 416
    invoke-virtual {v1}, Lk7/f;->d()Z

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    if-eqz v0, :cond_b

    .line 421
    .line 422
    goto :goto_c

    .line 423
    :cond_b
    new-instance v0, Lcom/tonyodev/fetch2/exception/FetchException;

    .line 424
    .line 425
    const-string v3, "empty_response_body"

    .line 426
    .line 427
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    throw v0

    .line 431
    :cond_c
    :goto_c
    if-nez v11, :cond_e

    .line 432
    .line 433
    iget-boolean v0, v1, Lk7/f;->s:Z

    .line 434
    .line 435
    if-nez v0, :cond_e

    .line 436
    .line 437
    invoke-virtual {v1}, Lk7/f;->d()Z

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    if-eqz v0, :cond_d

    .line 442
    .line 443
    goto :goto_d

    .line 444
    :cond_d
    new-instance v0, Lcom/tonyodev/fetch2/exception/FetchException;

    .line 445
    .line 446
    const-string v3, "request_not_successful"

    .line 447
    .line 448
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    throw v0

    .line 452
    :cond_e
    :goto_d
    iget-boolean v0, v1, Lk7/f;->s:Z

    .line 453
    .line 454
    if-nez v0, :cond_10

    .line 455
    .line 456
    iget-boolean v0, v1, Lk7/f;->t:Z

    .line 457
    .line 458
    if-nez v0, :cond_10

    .line 459
    .line 460
    iget-wide v10, v1, Lk7/f;->x:J

    .line 461
    .line 462
    iget-wide v12, v1, Lk7/f;->v:J

    .line 463
    .line 464
    cmp-long v0, v10, v12

    .line 465
    .line 466
    if-gez v0, :cond_10

    .line 467
    .line 468
    invoke-virtual {v1}, Lk7/f;->d()Z

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    if-eqz v0, :cond_f

    .line 473
    .line 474
    goto :goto_e

    .line 475
    :cond_f
    new-instance v0, Lcom/tonyodev/fetch2/exception/FetchException;

    .line 476
    .line 477
    const-string v3, "unknown"

    .line 478
    .line 479
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 483
    :cond_10
    :goto_e
    move-object v3, v7

    .line 484
    move-object v8, v3

    .line 485
    goto :goto_b

    .line 486
    :catchall_3
    move-exception v0

    .line 487
    move-object v3, v7

    .line 488
    move-object v9, v3

    .line 489
    goto/16 :goto_1d

    .line 490
    .line 491
    :catch_3
    move-exception v0

    .line 492
    move-object v3, v7

    .line 493
    move-object v8, v3

    .line 494
    goto/16 :goto_17

    .line 495
    .line 496
    :cond_11
    move-object v3, v7

    .line 497
    move-object v8, v3

    .line 498
    :goto_f
    :try_start_5
    invoke-virtual {v1}, Lk7/f;->d()Z

    .line 499
    .line 500
    .line 501
    move-result v0

    .line 502
    if-nez v0, :cond_14

    .line 503
    .line 504
    iget-boolean v0, v1, Lk7/f;->t:Z

    .line 505
    .line 506
    if-nez v0, :cond_14

    .line 507
    .line 508
    iget-boolean v0, v1, Lk7/f;->s:Z

    .line 509
    .line 510
    if-nez v0, :cond_14

    .line 511
    .line 512
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    iget-wide v9, v1, Lk7/f;->x:J

    .line 517
    .line 518
    iput-wide v9, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 519
    .line 520
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    iget-wide v9, v1, Lk7/f;->v:J

    .line 525
    .line 526
    iput-wide v9, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 527
    .line 528
    iget-object v0, v1, Lk7/f;->C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 529
    .line 530
    iget-wide v9, v1, Lk7/f;->x:J

    .line 531
    .line 532
    iput-wide v9, v0, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->w:J

    .line 533
    .line 534
    iget-object v0, v1, Lk7/f;->C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 535
    .line 536
    iget-wide v9, v1, Lk7/f;->v:J

    .line 537
    .line 538
    iput-wide v9, v0, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->v:J

    .line 539
    .line 540
    iget-boolean v0, v1, Lk7/f;->t:Z

    .line 541
    .line 542
    if-nez v0, :cond_15

    .line 543
    .line 544
    iget-boolean v0, v1, Lk7/f;->s:Z

    .line 545
    .line 546
    if-nez v0, :cond_15

    .line 547
    .line 548
    iget-object v0, v1, Lk7/f;->u:Lm7/b;

    .line 549
    .line 550
    if-eqz v0, :cond_12

    .line 551
    .line 552
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 553
    .line 554
    .line 555
    move-result-object v9

    .line 556
    invoke-virtual {v0, v9}, Lm7/b;->e(Lcom/tonyodev/fetch2/database/DownloadInfo;)V

    .line 557
    .line 558
    .line 559
    goto :goto_11

    .line 560
    :goto_10
    move-object v9, v7

    .line 561
    goto/16 :goto_9

    .line 562
    .line 563
    :catchall_4
    move-exception v0

    .line 564
    goto :goto_10

    .line 565
    :catch_4
    move-exception v0

    .line 566
    goto/16 :goto_17

    .line 567
    .line 568
    :cond_12
    :goto_11
    iget-object v0, v1, Lk7/f;->u:Lm7/b;

    .line 569
    .line 570
    if-eqz v0, :cond_13

    .line 571
    .line 572
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 573
    .line 574
    .line 575
    move-result-object v9

    .line 576
    iget-object v10, v1, Lk7/f;->C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 577
    .line 578
    iget v11, v1, Lk7/f;->D:I

    .line 579
    .line 580
    invoke-virtual {v0, v9, v10, v11}, Lm7/b;->a(Lcom/tonyodev/fetch2/database/DownloadInfo;Lcom/tonyodev/fetch2core/DownloadBlock;I)V

    .line 581
    .line 582
    .line 583
    :cond_13
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    iget-wide v9, v1, Lk7/f;->y:J

    .line 588
    .line 589
    iput-wide v9, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 590
    .line 591
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-virtual {v1}, Lk7/f;->a()J

    .line 596
    .line 597
    .line 598
    move-result-wide v9

    .line 599
    iput-wide v9, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 600
    .line 601
    iget-object v11, v1, Lk7/f;->u:Lm7/b;

    .line 602
    .line 603
    if-eqz v11, :cond_15

    .line 604
    .line 605
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 606
    .line 607
    .line 608
    move-result-object v12

    .line 609
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    iget-wide v13, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 614
    .line 615
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    iget-wide v9, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 620
    .line 621
    move-wide v15, v9

    .line 622
    invoke-virtual/range {v11 .. v16}, Lm7/b;->c(Lcom/tonyodev/fetch2/database/DownloadInfo;JJ)V

    .line 623
    .line 624
    .line 625
    goto :goto_12

    .line 626
    :cond_14
    invoke-virtual {v1}, Lk7/f;->d()Z

    .line 627
    .line 628
    .line 629
    move-result v0

    .line 630
    if-eqz v0, :cond_15

    .line 631
    .line 632
    if-eqz v7, :cond_15

    .line 633
    .line 634
    invoke-virtual {v1}, Lk7/f;->e()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 635
    .line 636
    .line 637
    :cond_15
    :goto_12
    if-eqz v8, :cond_16

    .line 638
    .line 639
    :try_start_6
    invoke-virtual {v8}, Ljava/io/BufferedInputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 640
    .line 641
    .line 642
    goto :goto_13

    .line 643
    :catch_5
    iget-object v0, v1, Lk7/f;->H:Lq7/f;

    .line 644
    .line 645
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    :cond_16
    :goto_13
    if-eqz v7, :cond_17

    .line 649
    .line 650
    :try_start_7
    iget-object v0, v1, Lk7/f;->G:Lq7/d;

    .line 651
    .line 652
    invoke-interface {v0, v7}, Lq7/d;->k(Lq7/c;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    .line 653
    .line 654
    .line 655
    goto :goto_14

    .line 656
    :catch_6
    iget-object v0, v1, Lk7/f;->H:Lq7/f;

    .line 657
    .line 658
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    :cond_17
    :goto_14
    if-eqz v3, :cond_18

    .line 662
    .line 663
    :try_start_8
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    .line 664
    .line 665
    .line 666
    goto :goto_16

    .line 667
    :catch_7
    iget-object v0, v1, Lk7/f;->H:Lq7/f;

    .line 668
    .line 669
    :goto_15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 670
    .line 671
    .line 672
    :cond_18
    :goto_16
    invoke-virtual {v1}, Lk7/f;->j()V

    .line 673
    .line 674
    .line 675
    goto/16 :goto_1c

    .line 676
    .line 677
    :goto_17
    :try_start_9
    iget-boolean v9, v1, Lk7/f;->s:Z

    .line 678
    .line 679
    if-nez v9, :cond_1c

    .line 680
    .line 681
    iget-boolean v9, v1, Lk7/f;->t:Z

    .line 682
    .line 683
    if-nez v9, :cond_1c

    .line 684
    .line 685
    iget-object v9, v1, Lk7/f;->H:Lq7/f;

    .line 686
    .line 687
    new-instance v10, Ljava/lang/StringBuilder;

    .line 688
    .line 689
    invoke-direct {v10, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v1}, Lk7/f;->l()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    invoke-virtual {v9, v2, v0}, Lq7/f;->b(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 704
    .line 705
    .line 706
    invoke-static {v0}, LC4/a;->t(Ljava/lang/Exception;)Lh7/b;

    .line 707
    .line 708
    .line 709
    move-result-object v2

    .line 710
    iget-object v9, v1, Lk7/f;->I:Lo7/a;

    .line 711
    .line 712
    iget-object v9, v9, Lo7/a;->g:Landroid/content/Context;

    .line 713
    .line 714
    invoke-static {v9}, LC3/a;->j(Landroid/content/Context;)Z

    .line 715
    .line 716
    .line 717
    move-result v9
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 718
    xor-int/2addr v9, v4

    .line 719
    move v10, v4

    .line 720
    :goto_18
    const/16 v11, 0xa

    .line 721
    .line 722
    if-gt v10, v11, :cond_1a

    .line 723
    .line 724
    const-wide/16 v11, 0x1f4

    .line 725
    .line 726
    :try_start_a
    invoke-static {v11, v12}, Ljava/lang/Thread;->sleep(J)V
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_8
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 727
    .line 728
    .line 729
    :try_start_b
    iget-object v11, v1, Lk7/f;->I:Lo7/a;

    .line 730
    .line 731
    iget-object v11, v11, Lo7/a;->g:Landroid/content/Context;

    .line 732
    .line 733
    invoke-static {v11}, LC3/a;->j(Landroid/content/Context;)Z

    .line 734
    .line 735
    .line 736
    move-result v11

    .line 737
    if-nez v11, :cond_19

    .line 738
    .line 739
    goto :goto_19

    .line 740
    :cond_19
    add-int/lit8 v10, v10, 0x1

    .line 741
    .line 742
    goto :goto_18

    .line 743
    :catch_8
    iget-object v4, v1, Lk7/f;->H:Lq7/f;

    .line 744
    .line 745
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 746
    .line 747
    .line 748
    :cond_1a
    move v4, v9

    .line 749
    :goto_19
    if-eqz v4, :cond_1b

    .line 750
    .line 751
    sget-object v2, Lh7/b;->B:Lh7/b;

    .line 752
    .line 753
    :cond_1b
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 754
    .line 755
    .line 756
    move-result-object v4

    .line 757
    iget-wide v9, v1, Lk7/f;->x:J

    .line 758
    .line 759
    iput-wide v9, v4, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 760
    .line 761
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 762
    .line 763
    .line 764
    move-result-object v4

    .line 765
    iget-wide v9, v1, Lk7/f;->v:J

    .line 766
    .line 767
    iput-wide v9, v4, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 768
    .line 769
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 770
    .line 771
    .line 772
    move-result-object v4

    .line 773
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    .line 775
    .line 776
    iput-object v2, v4, Lcom/tonyodev/fetch2/database/DownloadInfo;->C:Lh7/b;

    .line 777
    .line 778
    iget-object v4, v1, Lk7/f;->C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 779
    .line 780
    iget-wide v9, v1, Lk7/f;->x:J

    .line 781
    .line 782
    iput-wide v9, v4, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->w:J

    .line 783
    .line 784
    iget-object v4, v1, Lk7/f;->C:Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 785
    .line 786
    iget-wide v9, v1, Lk7/f;->v:J

    .line 787
    .line 788
    iput-wide v9, v4, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->v:J

    .line 789
    .line 790
    iget-boolean v4, v1, Lk7/f;->t:Z

    .line 791
    .line 792
    if-nez v4, :cond_1c

    .line 793
    .line 794
    iget-boolean v4, v1, Lk7/f;->s:Z

    .line 795
    .line 796
    if-nez v4, :cond_1c

    .line 797
    .line 798
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 799
    .line 800
    .line 801
    move-result-object v4

    .line 802
    iput-wide v5, v4, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 803
    .line 804
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 805
    .line 806
    .line 807
    move-result-object v4

    .line 808
    iput-wide v5, v4, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 809
    .line 810
    iget-object v4, v1, Lk7/f;->u:Lm7/b;

    .line 811
    .line 812
    if-eqz v4, :cond_1c

    .line 813
    .line 814
    invoke-virtual {v1}, Lk7/f;->b()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 815
    .line 816
    .line 817
    move-result-object v5

    .line 818
    invoke-virtual {v4, v5, v2, v0}, Lm7/b;->b(Lcom/tonyodev/fetch2/database/DownloadInfo;Lh7/b;Ljava/lang/Exception;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 819
    .line 820
    .line 821
    :cond_1c
    if-eqz v8, :cond_1d

    .line 822
    .line 823
    :try_start_c
    invoke-virtual {v8}, Ljava/io/BufferedInputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_9

    .line 824
    .line 825
    .line 826
    goto :goto_1a

    .line 827
    :catch_9
    iget-object v0, v1, Lk7/f;->H:Lq7/f;

    .line 828
    .line 829
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 830
    .line 831
    .line 832
    :cond_1d
    :goto_1a
    if-eqz v7, :cond_1e

    .line 833
    .line 834
    :try_start_d
    iget-object v0, v1, Lk7/f;->G:Lq7/d;

    .line 835
    .line 836
    invoke-interface {v0, v7}, Lq7/d;->k(Lq7/c;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_a

    .line 837
    .line 838
    .line 839
    goto :goto_1b

    .line 840
    :catch_a
    iget-object v0, v1, Lk7/f;->H:Lq7/f;

    .line 841
    .line 842
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 843
    .line 844
    .line 845
    :cond_1e
    :goto_1b
    if-eqz v3, :cond_18

    .line 846
    .line 847
    :try_start_e
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_b

    .line 848
    .line 849
    .line 850
    goto/16 :goto_16

    .line 851
    .line 852
    :catch_b
    iget-object v0, v1, Lk7/f;->H:Lq7/f;

    .line 853
    .line 854
    goto/16 :goto_15

    .line 855
    .line 856
    :goto_1c
    return-void

    .line 857
    :goto_1d
    if-eqz v7, :cond_1f

    .line 858
    .line 859
    :try_start_f
    invoke-virtual {v7}, Ljava/io/BufferedInputStream;->close()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_c

    .line 860
    .line 861
    .line 862
    goto :goto_1e

    .line 863
    :catch_c
    iget-object v2, v1, Lk7/f;->H:Lq7/f;

    .line 864
    .line 865
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 866
    .line 867
    .line 868
    :cond_1f
    :goto_1e
    if-eqz v9, :cond_20

    .line 869
    .line 870
    :try_start_10
    iget-object v2, v1, Lk7/f;->G:Lq7/d;

    .line 871
    .line 872
    invoke-interface {v2, v9}, Lq7/d;->k(Lq7/c;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_d

    .line 873
    .line 874
    .line 875
    goto :goto_1f

    .line 876
    :catch_d
    iget-object v2, v1, Lk7/f;->H:Lq7/f;

    .line 877
    .line 878
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 879
    .line 880
    .line 881
    :cond_20
    :goto_1f
    if-eqz v3, :cond_21

    .line 882
    .line 883
    :try_start_11
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_e

    .line 884
    .line 885
    .line 886
    goto :goto_20

    .line 887
    :catch_e
    iget-object v2, v1, Lk7/f;->H:Lq7/f;

    .line 888
    .line 889
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 890
    .line 891
    .line 892
    :cond_21
    :goto_20
    invoke-virtual {v1}, Lk7/f;->j()V

    .line 893
    .line 894
    .line 895
    throw v0
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
.end method
