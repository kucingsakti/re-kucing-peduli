.class public final Li7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final A:Ll7/j;

.field public final B:Lo1/k;

.field public volatile s:Z

.field public t:Lk7/e;

.field public final u:Lcom/tonyodev/fetch2/database/DownloadDatabase;

.field public final v:LP0/c;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/util/ArrayList;

.field public final z:Lq7/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lq7/f;[Lj7/a;Ll7/j;Lo1/k;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "logger"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Li7/f;->z:Lq7/f;

    .line 15
    .line 16
    iput-object p4, p0, Li7/f;->A:Ll7/j;

    .line 17
    .line 18
    iput-object p5, p0, Li7/f;->B:Lo1/k;

    .line 19
    .line 20
    const-string p2, "LibGlobalFetchLib.db"

    .line 21
    .line 22
    const-class p4, Lcom/tonyodev/fetch2/database/DownloadDatabase;

    .line 23
    .line 24
    invoke-static {p1, p4, p2}, Lt1/Y;->k(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)LK0/l;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    array-length p2, p3

    .line 29
    invoke-static {p3, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, [LL0/a;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, LK0/l;->a([LL0/a;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, LK0/l;->b()LK0/m;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lcom/tonyodev/fetch2/database/DownloadDatabase;

    .line 43
    .line 44
    iput-object p1, p0, Li7/f;->u:Lcom/tonyodev/fetch2/database/DownloadDatabase;

    .line 45
    .line 46
    invoke-virtual {p1}, LK0/m;->g()LO0/c;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-interface {p1}, LO0/c;->S()LP0/c;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-string p2, "requestDatabase.openHelper.writableDatabase"

    .line 55
    .line 56
    invoke-static {p1, p2}, Lv8/i;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Li7/f;->v:LP0/c;

    .line 60
    .line 61
    const-string p1, "SELECT _id FROM requests WHERE _status = \'1\' OR _status = \'2\'"

    .line 62
    .line 63
    iput-object p1, p0, Li7/f;->w:Ljava/lang/String;

    .line 64
    .line 65
    const-string p1, "SELECT _id FROM requests WHERE _status = \'1\' OR _status = \'2\' OR _status = \'9\'"

    .line 66
    .line 67
    iput-object p1, p0, Li7/f;->x:Ljava/lang/String;

    .line 68
    .line 69
    new-instance p1, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Li7/f;->y:Ljava/util/ArrayList;

    .line 75
    .line 76
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
.method public final a(Ljava/util/List;)Ljava/util/List;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "ids"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Li7/f;->j()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, Li7/f;->u:Lcom/tonyodev/fetch2/database/DownloadDatabase;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/tonyodev/fetch2/database/DownloadDatabase;->q()Lo4/r;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v3, v0, Lo4/r;->u:Ljava/lang/Object;

    .line 20
    .line 21
    const-string v3, "SELECT * FROM requests WHERE _id IN ("

    .line 22
    .line 23
    invoke-static {v3}, Lz/e;->c(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-static {v3, v4}, Lcom/bumptech/glide/c;->a(Ljava/lang/StringBuilder;I)V

    .line 32
    .line 33
    .line 34
    const-string v5, ")"

    .line 35
    .line 36
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v4, v3}, LK0/o;->c(ILjava/lang/String;)LK0/o;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const/4 v5, 0x1

    .line 52
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_1

    .line 57
    .line 58
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    check-cast v6, Ljava/lang/Integer;

    .line 63
    .line 64
    if-nez v6, :cond_0

    .line 65
    .line 66
    invoke-virtual {v3, v5}, LK0/o;->v(I)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_0
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    int-to-long v6, v6

    .line 75
    invoke-virtual {v3, v5, v6, v7}, LK0/o;->I(IJ)V

    .line 76
    .line 77
    .line 78
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    iget-object v0, v0, Lo4/r;->t:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lcom/tonyodev/fetch2/database/DownloadDatabase_Impl;

    .line 84
    .line 85
    invoke-virtual {v0}, LK0/m;->b()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v3}, LK0/m;->m(LO0/e;)Landroid/database/Cursor;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    :try_start_0
    const-string v0, "_id"

    .line 93
    .line 94
    invoke-static {v2, v0}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    const-string v5, "_namespace"

    .line 99
    .line 100
    invoke-static {v2, v5}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    const-string v6, "_url"

    .line 105
    .line 106
    invoke-static {v2, v6}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    const-string v7, "_file"

    .line 111
    .line 112
    invoke-static {v2, v7}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    const-string v8, "_group"

    .line 117
    .line 118
    invoke-static {v2, v8}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    const-string v9, "_priority"

    .line 123
    .line 124
    invoke-static {v2, v9}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    const-string v10, "_headers"

    .line 129
    .line 130
    invoke-static {v2, v10}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    const-string v11, "_written_bytes"

    .line 135
    .line 136
    invoke-static {v2, v11}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    const-string v12, "_total_bytes"

    .line 141
    .line 142
    invoke-static {v2, v12}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    const-string v13, "_status"

    .line 147
    .line 148
    invoke-static {v2, v13}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    const-string v14, "_error"

    .line 153
    .line 154
    invoke-static {v2, v14}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result v14

    .line 158
    const-string v15, "_network_type"

    .line 159
    .line 160
    invoke-static {v2, v15}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    move-result v15

    .line 164
    const-string v4, "_created"

    .line 165
    .line 166
    invoke-static {v2, v4}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 167
    .line 168
    .line 169
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 170
    move-object/from16 v16, v3

    .line 171
    .line 172
    :try_start_1
    const-string v3, "_tag"

    .line 173
    .line 174
    invoke-static {v2, v3}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 175
    .line 176
    .line 177
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 178
    :try_start_2
    const-string v1, "_enqueue_action"

    .line 179
    .line 180
    invoke-static {v2, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    move/from16 v17, v1

    .line 185
    .line 186
    const-string v1, "_identifier"

    .line 187
    .line 188
    invoke-static {v2, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    move/from16 v18, v1

    .line 193
    .line 194
    const-string v1, "_download_on_enqueue"

    .line 195
    .line 196
    invoke-static {v2, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    move/from16 v19, v1

    .line 201
    .line 202
    const-string v1, "_extras"

    .line 203
    .line 204
    invoke-static {v2, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    move/from16 v20, v1

    .line 209
    .line 210
    const-string v1, "_auto_retry_max_attempts"

    .line 211
    .line 212
    invoke-static {v2, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    move/from16 v21, v1

    .line 217
    .line 218
    const-string v1, "_auto_retry_attempts"

    .line 219
    .line 220
    invoke-static {v2, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    move/from16 v22, v1

    .line 225
    .line 226
    new-instance v1, Ljava/util/ArrayList;

    .line 227
    .line 228
    move/from16 v23, v3

    .line 229
    .line 230
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 235
    .line 236
    .line 237
    :goto_2
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    move/from16 v24, v3

    .line 242
    .line 243
    if-eqz v24, :cond_3

    .line 244
    .line 245
    new-instance v3, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 246
    .line 247
    invoke-direct {v3}, Lcom/tonyodev/fetch2/database/DownloadInfo;-><init>()V

    .line 248
    .line 249
    .line 250
    move-object/from16 v25, v1

    .line 251
    .line 252
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    iput v1, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 257
    .line 258
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-virtual {v3, v1}, Lcom/tonyodev/fetch2/database/DownloadInfo;->g(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-virtual {v3, v1}, Lcom/tonyodev/fetch2/database/DownloadInfo;->i(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-virtual {v3, v1}, Lcom/tonyodev/fetch2/database/DownloadInfo;->f(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    iput v1, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->w:I

    .line 284
    .line 285
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getInt(I)I

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    invoke-static {v1}, LK3/d;->s(I)I

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    iput v1, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->x:I

    .line 294
    .line 295
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-static {v1}, LK3/d;->q(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    iput-object v1, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->y:Ljava/util/Map;

    .line 304
    .line 305
    move/from16 v26, v0

    .line 306
    .line 307
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 308
    .line 309
    .line 310
    move-result-wide v0

    .line 311
    iput-wide v0, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 312
    .line 313
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getLong(I)J

    .line 314
    .line 315
    .line 316
    move-result-wide v0

    .line 317
    iput-wide v0, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 318
    .line 319
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    invoke-static {v0}, LK3/d;->t(I)Lh7/f;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    iput-object v0, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 328
    .line 329
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getInt(I)I

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    invoke-static {v0}, LK3/d;->m(I)Lh7/b;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    iput-object v0, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->C:Lh7/b;

    .line 338
    .line 339
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getInt(I)I

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    invoke-static {v0}, LK3/d;->r(I)I

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    iput v0, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->D:I

    .line 348
    .line 349
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 350
    .line 351
    .line 352
    move-result-wide v0

    .line 353
    iput-wide v0, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->E:J

    .line 354
    .line 355
    move/from16 v0, v23

    .line 356
    .line 357
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    iput-object v1, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->F:Ljava/lang/String;

    .line 362
    .line 363
    move/from16 v1, v17

    .line 364
    .line 365
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 366
    .line 367
    .line 368
    move-result v17

    .line 369
    move/from16 v23, v0

    .line 370
    .line 371
    invoke-static/range {v17 .. v17}, LK3/d;->f(I)I

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    iput v0, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->G:I

    .line 376
    .line 377
    move/from16 v17, v5

    .line 378
    .line 379
    move/from16 v0, v18

    .line 380
    .line 381
    move/from16 v18, v4

    .line 382
    .line 383
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 384
    .line 385
    .line 386
    move-result-wide v4

    .line 387
    iput-wide v4, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->H:J

    .line 388
    .line 389
    move/from16 v4, v19

    .line 390
    .line 391
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 392
    .line 393
    .line 394
    move-result v5

    .line 395
    if-eqz v5, :cond_2

    .line 396
    .line 397
    const/4 v5, 0x1

    .line 398
    goto :goto_3

    .line 399
    :cond_2
    const/4 v5, 0x0

    .line 400
    :goto_3
    iput-boolean v5, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->I:Z

    .line 401
    .line 402
    move/from16 v5, v20

    .line 403
    .line 404
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v19

    .line 408
    move/from16 v20, v0

    .line 409
    .line 410
    invoke-static/range {v19 .. v19}, LK3/d;->o(Ljava/lang/String;)Lcom/tonyodev/fetch2core/Extras;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    iput-object v0, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->J:Lcom/tonyodev/fetch2core/Extras;

    .line 415
    .line 416
    move/from16 v19, v1

    .line 417
    .line 418
    move/from16 v0, v21

    .line 419
    .line 420
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    iput v1, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->K:I

    .line 425
    .line 426
    move/from16 v21, v0

    .line 427
    .line 428
    move/from16 v1, v22

    .line 429
    .line 430
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    iput v0, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->L:I

    .line 435
    .line 436
    move-object/from16 v0, v25

    .line 437
    .line 438
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 439
    .line 440
    .line 441
    move/from16 v22, v19

    .line 442
    .line 443
    move/from16 v19, v4

    .line 444
    .line 445
    move/from16 v4, v18

    .line 446
    .line 447
    move/from16 v18, v20

    .line 448
    .line 449
    move/from16 v20, v5

    .line 450
    .line 451
    move/from16 v5, v17

    .line 452
    .line 453
    move/from16 v17, v22

    .line 454
    .line 455
    move/from16 v22, v1

    .line 456
    .line 457
    move-object v1, v0

    .line 458
    move/from16 v0, v26

    .line 459
    .line 460
    goto/16 :goto_2

    .line 461
    .line 462
    :catchall_0
    move-exception v0

    .line 463
    move-object/from16 v1, p0

    .line 464
    .line 465
    goto :goto_4

    .line 466
    :cond_3
    move-object v0, v1

    .line 467
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v16 .. v16}, LK0/o;->g()V

    .line 471
    .line 472
    .line 473
    const/4 v2, 0x0

    .line 474
    move-object/from16 v1, p0

    .line 475
    .line 476
    invoke-virtual {v1, v0, v2}, Li7/f;->h(Ljava/util/ArrayList;Z)Z

    .line 477
    .line 478
    .line 479
    return-object v0

    .line 480
    :catchall_1
    move-exception v0

    .line 481
    goto :goto_4

    .line 482
    :catchall_2
    move-exception v0

    .line 483
    move-object/from16 v16, v3

    .line 484
    .line 485
    :goto_4
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v16 .. v16}, LK0/o;->g()V

    .line 489
    .line 490
    .line 491
    throw v0
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
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
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
.end method

.method public final b(I)Ljava/util/List;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Li7/f;->j()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v1, Li7/f;->u:Lcom/tonyodev/fetch2/database/DownloadDatabase;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/tonyodev/fetch2/database/DownloadDatabase;->q()Lo4/r;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v2, v0, Lo4/r;->u:Ljava/lang/Object;

    .line 13
    .line 14
    const-string v2, "SELECT * FROM requests WHERE _group = ?"

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-static {v3, v2}, LK0/o;->c(ILjava/lang/String;)LK0/o;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    move/from16 v4, p1

    .line 22
    .line 23
    int-to-long v4, v4

    .line 24
    invoke-virtual {v2, v3, v4, v5}, LK0/o;->I(IJ)V

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, Lo4/r;->t:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lcom/tonyodev/fetch2/database/DownloadDatabase_Impl;

    .line 30
    .line 31
    invoke-virtual {v0}, LK0/m;->b()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2}, LK0/m;->m(LO0/e;)Landroid/database/Cursor;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    :try_start_0
    const-string v0, "_id"

    .line 39
    .line 40
    invoke-static {v4, v0}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const-string v5, "_namespace"

    .line 45
    .line 46
    invoke-static {v4, v5}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    const-string v6, "_url"

    .line 51
    .line 52
    invoke-static {v4, v6}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    const-string v7, "_file"

    .line 57
    .line 58
    invoke-static {v4, v7}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const-string v8, "_group"

    .line 63
    .line 64
    invoke-static {v4, v8}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    const-string v9, "_priority"

    .line 69
    .line 70
    invoke-static {v4, v9}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    const-string v10, "_headers"

    .line 75
    .line 76
    invoke-static {v4, v10}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    const-string v11, "_written_bytes"

    .line 81
    .line 82
    invoke-static {v4, v11}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    const-string v12, "_total_bytes"

    .line 87
    .line 88
    invoke-static {v4, v12}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    const-string v13, "_status"

    .line 93
    .line 94
    invoke-static {v4, v13}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    const-string v14, "_error"

    .line 99
    .line 100
    invoke-static {v4, v14}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v14

    .line 104
    const-string v15, "_network_type"

    .line 105
    .line 106
    invoke-static {v4, v15}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v15

    .line 110
    const-string v3, "_created"

    .line 111
    .line 112
    invoke-static {v4, v3}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 116
    move-object/from16 v16, v2

    .line 117
    .line 118
    :try_start_1
    const-string v2, "_tag"

    .line 119
    .line 120
    invoke-static {v4, v2}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 124
    :try_start_2
    const-string v1, "_enqueue_action"

    .line 125
    .line 126
    invoke-static {v4, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    move/from16 p1, v1

    .line 131
    .line 132
    const-string v1, "_identifier"

    .line 133
    .line 134
    invoke-static {v4, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    move/from16 v17, v1

    .line 139
    .line 140
    const-string v1, "_download_on_enqueue"

    .line 141
    .line 142
    invoke-static {v4, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    move/from16 v18, v1

    .line 147
    .line 148
    const-string v1, "_extras"

    .line 149
    .line 150
    invoke-static {v4, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    move/from16 v19, v1

    .line 155
    .line 156
    const-string v1, "_auto_retry_max_attempts"

    .line 157
    .line 158
    invoke-static {v4, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    move/from16 v20, v1

    .line 163
    .line 164
    const-string v1, "_auto_retry_attempts"

    .line 165
    .line 166
    invoke-static {v4, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    move/from16 v21, v1

    .line 171
    .line 172
    new-instance v1, Ljava/util/ArrayList;

    .line 173
    .line 174
    move/from16 v22, v2

    .line 175
    .line 176
    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 181
    .line 182
    .line 183
    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    move/from16 v23, v2

    .line 188
    .line 189
    if-eqz v23, :cond_1

    .line 190
    .line 191
    new-instance v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 192
    .line 193
    invoke-direct {v2}, Lcom/tonyodev/fetch2/database/DownloadInfo;-><init>()V

    .line 194
    .line 195
    .line 196
    move-object/from16 v24, v1

    .line 197
    .line 198
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    iput v1, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 203
    .line 204
    invoke-interface {v4, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {v2, v1}, Lcom/tonyodev/fetch2/database/DownloadInfo;->g(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-virtual {v2, v1}, Lcom/tonyodev/fetch2/database/DownloadInfo;->i(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v2, v1}, Lcom/tonyodev/fetch2/database/DownloadInfo;->f(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    iput v1, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->w:I

    .line 230
    .line 231
    invoke-interface {v4, v9}, Landroid/database/Cursor;->getInt(I)I

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    invoke-static {v1}, LK3/d;->s(I)I

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    iput v1, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->x:I

    .line 240
    .line 241
    invoke-interface {v4, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-static {v1}, LK3/d;->q(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    iput-object v1, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->y:Ljava/util/Map;

    .line 250
    .line 251
    move/from16 v25, v0

    .line 252
    .line 253
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 254
    .line 255
    .line 256
    move-result-wide v0

    .line 257
    iput-wide v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 258
    .line 259
    invoke-interface {v4, v12}, Landroid/database/Cursor;->getLong(I)J

    .line 260
    .line 261
    .line 262
    move-result-wide v0

    .line 263
    iput-wide v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 264
    .line 265
    invoke-interface {v4, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    invoke-static {v0}, LK3/d;->t(I)Lh7/f;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    iput-object v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 274
    .line 275
    invoke-interface {v4, v14}, Landroid/database/Cursor;->getInt(I)I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    invoke-static {v0}, LK3/d;->m(I)Lh7/b;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    iput-object v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->C:Lh7/b;

    .line 284
    .line 285
    invoke-interface {v4, v15}, Landroid/database/Cursor;->getInt(I)I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    invoke-static {v0}, LK3/d;->r(I)I

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    iput v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->D:I

    .line 294
    .line 295
    invoke-interface {v4, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 296
    .line 297
    .line 298
    move-result-wide v0

    .line 299
    iput-wide v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->E:J

    .line 300
    .line 301
    move/from16 v0, v22

    .line 302
    .line 303
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    iput-object v1, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->F:Ljava/lang/String;

    .line 308
    .line 309
    move/from16 v1, p1

    .line 310
    .line 311
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 312
    .line 313
    .line 314
    move-result v22

    .line 315
    move/from16 p1, v0

    .line 316
    .line 317
    invoke-static/range {v22 .. v22}, LK3/d;->f(I)I

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    iput v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->G:I

    .line 322
    .line 323
    move/from16 v22, v6

    .line 324
    .line 325
    move/from16 v0, v17

    .line 326
    .line 327
    move/from16 v17, v5

    .line 328
    .line 329
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 330
    .line 331
    .line 332
    move-result-wide v5

    .line 333
    iput-wide v5, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->H:J

    .line 334
    .line 335
    move/from16 v5, v18

    .line 336
    .line 337
    invoke-interface {v4, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 338
    .line 339
    .line 340
    move-result v6

    .line 341
    if-eqz v6, :cond_0

    .line 342
    .line 343
    const/4 v6, 0x1

    .line 344
    goto :goto_1

    .line 345
    :cond_0
    const/4 v6, 0x0

    .line 346
    :goto_1
    iput-boolean v6, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->I:Z

    .line 347
    .line 348
    move/from16 v6, v19

    .line 349
    .line 350
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v18

    .line 354
    move/from16 v19, v0

    .line 355
    .line 356
    invoke-static/range {v18 .. v18}, LK3/d;->o(Ljava/lang/String;)Lcom/tonyodev/fetch2core/Extras;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    iput-object v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->J:Lcom/tonyodev/fetch2core/Extras;

    .line 361
    .line 362
    move/from16 v18, v1

    .line 363
    .line 364
    move/from16 v0, v20

    .line 365
    .line 366
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    iput v1, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->K:I

    .line 371
    .line 372
    move/from16 v20, v0

    .line 373
    .line 374
    move/from16 v1, v21

    .line 375
    .line 376
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    iput v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->L:I

    .line 381
    .line 382
    move-object/from16 v0, v24

    .line 383
    .line 384
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 385
    .line 386
    .line 387
    move/from16 v21, v22

    .line 388
    .line 389
    move/from16 v22, p1

    .line 390
    .line 391
    move/from16 p1, v18

    .line 392
    .line 393
    move/from16 v18, v5

    .line 394
    .line 395
    move/from16 v5, v17

    .line 396
    .line 397
    move/from16 v17, v19

    .line 398
    .line 399
    move/from16 v19, v6

    .line 400
    .line 401
    move/from16 v6, v21

    .line 402
    .line 403
    move/from16 v21, v1

    .line 404
    .line 405
    move-object v1, v0

    .line 406
    move/from16 v0, v25

    .line 407
    .line 408
    goto/16 :goto_0

    .line 409
    .line 410
    :catchall_0
    move-exception v0

    .line 411
    move-object/from16 v1, p0

    .line 412
    .line 413
    goto :goto_2

    .line 414
    :cond_1
    move-object v0, v1

    .line 415
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v16 .. v16}, LK0/o;->g()V

    .line 419
    .line 420
    .line 421
    const/4 v2, 0x0

    .line 422
    move-object/from16 v1, p0

    .line 423
    .line 424
    invoke-virtual {v1, v0, v2}, Li7/f;->h(Ljava/util/ArrayList;Z)Z

    .line 425
    .line 426
    .line 427
    return-object v0

    .line 428
    :catchall_1
    move-exception v0

    .line 429
    goto :goto_2

    .line 430
    :catchall_2
    move-exception v0

    .line 431
    move-object/from16 v16, v2

    .line 432
    .line 433
    :goto_2
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v16 .. v16}, LK0/o;->g()V

    .line 437
    .line 438
    .line 439
    throw v0
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
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
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
.end method

.method public final c(Ljava/util/List;)Ljava/util/List;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Li7/f;->j()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v1, Li7/f;->u:Lcom/tonyodev/fetch2/database/DownloadDatabase;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/tonyodev/fetch2/database/DownloadDatabase;->q()Lo4/r;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v3, "SELECT * FROM requests WHERE _status IN ("

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {v2, v3}, Lcom/bumptech/glide/c;->a(Ljava/lang/StringBuilder;I)V

    .line 30
    .line 31
    .line 32
    const-string v4, ")"

    .line 33
    .line 34
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v3, v2}, LK0/o;->c(ILjava/lang/String;)LK0/o;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    const/4 v4, 0x1

    .line 50
    move v5, v4

    .line 51
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_0

    .line 56
    .line 57
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    check-cast v6, Lh7/f;

    .line 62
    .line 63
    const-string v7, "status"

    .line 64
    .line 65
    invoke-static {v6, v7}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget v6, v6, Lh7/f;->s:I

    .line 69
    .line 70
    int-to-long v6, v6

    .line 71
    invoke-virtual {v2, v5, v6, v7}, LK0/o;->I(IJ)V

    .line 72
    .line 73
    .line 74
    add-int/2addr v5, v4

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    iget-object v0, v0, Lo4/r;->t:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Lcom/tonyodev/fetch2/database/DownloadDatabase_Impl;

    .line 79
    .line 80
    invoke-virtual {v0}, LK0/m;->b()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v2}, LK0/m;->m(LO0/e;)Landroid/database/Cursor;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    :try_start_0
    const-string v0, "_id"

    .line 88
    .line 89
    invoke-static {v3, v0}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    const-string v5, "_namespace"

    .line 94
    .line 95
    invoke-static {v3, v5}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    const-string v6, "_url"

    .line 100
    .line 101
    invoke-static {v3, v6}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    const-string v7, "_file"

    .line 106
    .line 107
    invoke-static {v3, v7}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    const-string v8, "_group"

    .line 112
    .line 113
    invoke-static {v3, v8}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    const-string v9, "_priority"

    .line 118
    .line 119
    invoke-static {v3, v9}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    const-string v10, "_headers"

    .line 124
    .line 125
    invoke-static {v3, v10}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    const-string v11, "_written_bytes"

    .line 130
    .line 131
    invoke-static {v3, v11}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    const-string v12, "_total_bytes"

    .line 136
    .line 137
    invoke-static {v3, v12}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    move-result v12

    .line 141
    const-string v13, "_status"

    .line 142
    .line 143
    invoke-static {v3, v13}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 144
    .line 145
    .line 146
    move-result v13

    .line 147
    const-string v14, "_error"

    .line 148
    .line 149
    invoke-static {v3, v14}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    const-string v15, "_network_type"

    .line 154
    .line 155
    invoke-static {v3, v15}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v15

    .line 159
    const-string v4, "_created"

    .line 160
    .line 161
    invoke-static {v3, v4}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 162
    .line 163
    .line 164
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 165
    move-object/from16 v16, v2

    .line 166
    .line 167
    :try_start_1
    const-string v2, "_tag"

    .line 168
    .line 169
    invoke-static {v3, v2}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 170
    .line 171
    .line 172
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 173
    :try_start_2
    const-string v1, "_enqueue_action"

    .line 174
    .line 175
    invoke-static {v3, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    move/from16 v17, v1

    .line 180
    .line 181
    const-string v1, "_identifier"

    .line 182
    .line 183
    invoke-static {v3, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    move/from16 v18, v1

    .line 188
    .line 189
    const-string v1, "_download_on_enqueue"

    .line 190
    .line 191
    invoke-static {v3, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    move/from16 v19, v1

    .line 196
    .line 197
    const-string v1, "_extras"

    .line 198
    .line 199
    invoke-static {v3, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    move/from16 v20, v1

    .line 204
    .line 205
    const-string v1, "_auto_retry_max_attempts"

    .line 206
    .line 207
    invoke-static {v3, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    move/from16 v21, v1

    .line 212
    .line 213
    const-string v1, "_auto_retry_attempts"

    .line 214
    .line 215
    invoke-static {v3, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    move/from16 v22, v1

    .line 220
    .line 221
    new-instance v1, Ljava/util/ArrayList;

    .line 222
    .line 223
    move/from16 v23, v2

    .line 224
    .line 225
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 230
    .line 231
    .line 232
    :goto_1
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    move/from16 v24, v2

    .line 237
    .line 238
    if-eqz v24, :cond_2

    .line 239
    .line 240
    new-instance v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 241
    .line 242
    invoke-direct {v2}, Lcom/tonyodev/fetch2/database/DownloadInfo;-><init>()V

    .line 243
    .line 244
    .line 245
    move-object/from16 v25, v1

    .line 246
    .line 247
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    iput v1, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 252
    .line 253
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-virtual {v2, v1}, Lcom/tonyodev/fetch2/database/DownloadInfo;->g(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {v2, v1}, Lcom/tonyodev/fetch2/database/DownloadInfo;->i(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v2, v1}, Lcom/tonyodev/fetch2/database/DownloadInfo;->f(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    iput v1, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->w:I

    .line 279
    .line 280
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getInt(I)I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    invoke-static {v1}, LK3/d;->s(I)I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    iput v1, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->x:I

    .line 289
    .line 290
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-static {v1}, LK3/d;->q(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    iput-object v1, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->y:Ljava/util/Map;

    .line 299
    .line 300
    move/from16 v26, v0

    .line 301
    .line 302
    invoke-interface {v3, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 303
    .line 304
    .line 305
    move-result-wide v0

    .line 306
    iput-wide v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 307
    .line 308
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getLong(I)J

    .line 309
    .line 310
    .line 311
    move-result-wide v0

    .line 312
    iput-wide v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 313
    .line 314
    invoke-interface {v3, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    invoke-static {v0}, LK3/d;->t(I)Lh7/f;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    iput-object v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 323
    .line 324
    invoke-interface {v3, v14}, Landroid/database/Cursor;->getInt(I)I

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    invoke-static {v0}, LK3/d;->m(I)Lh7/b;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    iput-object v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->C:Lh7/b;

    .line 333
    .line 334
    invoke-interface {v3, v15}, Landroid/database/Cursor;->getInt(I)I

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    invoke-static {v0}, LK3/d;->r(I)I

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    iput v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->D:I

    .line 343
    .line 344
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 345
    .line 346
    .line 347
    move-result-wide v0

    .line 348
    iput-wide v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->E:J

    .line 349
    .line 350
    move/from16 v0, v23

    .line 351
    .line 352
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    iput-object v1, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->F:Ljava/lang/String;

    .line 357
    .line 358
    move/from16 v1, v17

    .line 359
    .line 360
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 361
    .line 362
    .line 363
    move-result v17

    .line 364
    move/from16 v23, v0

    .line 365
    .line 366
    invoke-static/range {v17 .. v17}, LK3/d;->f(I)I

    .line 367
    .line 368
    .line 369
    move-result v0

    .line 370
    iput v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->G:I

    .line 371
    .line 372
    move/from16 v17, v5

    .line 373
    .line 374
    move/from16 v0, v18

    .line 375
    .line 376
    move/from16 v18, v4

    .line 377
    .line 378
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 379
    .line 380
    .line 381
    move-result-wide v4

    .line 382
    iput-wide v4, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->H:J

    .line 383
    .line 384
    move/from16 v4, v19

    .line 385
    .line 386
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 387
    .line 388
    .line 389
    move-result v5

    .line 390
    if-eqz v5, :cond_1

    .line 391
    .line 392
    const/4 v5, 0x1

    .line 393
    goto :goto_2

    .line 394
    :cond_1
    const/4 v5, 0x0

    .line 395
    :goto_2
    iput-boolean v5, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->I:Z

    .line 396
    .line 397
    move/from16 v5, v20

    .line 398
    .line 399
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v19

    .line 403
    move/from16 v20, v0

    .line 404
    .line 405
    invoke-static/range {v19 .. v19}, LK3/d;->o(Ljava/lang/String;)Lcom/tonyodev/fetch2core/Extras;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    iput-object v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->J:Lcom/tonyodev/fetch2core/Extras;

    .line 410
    .line 411
    move/from16 v19, v1

    .line 412
    .line 413
    move/from16 v0, v21

    .line 414
    .line 415
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    iput v1, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->K:I

    .line 420
    .line 421
    move/from16 v21, v0

    .line 422
    .line 423
    move/from16 v1, v22

    .line 424
    .line 425
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    iput v0, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->L:I

    .line 430
    .line 431
    move-object/from16 v0, v25

    .line 432
    .line 433
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 434
    .line 435
    .line 436
    move/from16 v22, v19

    .line 437
    .line 438
    move/from16 v19, v4

    .line 439
    .line 440
    move/from16 v4, v18

    .line 441
    .line 442
    move/from16 v18, v20

    .line 443
    .line 444
    move/from16 v20, v5

    .line 445
    .line 446
    move/from16 v5, v17

    .line 447
    .line 448
    move/from16 v17, v22

    .line 449
    .line 450
    move/from16 v22, v1

    .line 451
    .line 452
    move-object v1, v0

    .line 453
    move/from16 v0, v26

    .line 454
    .line 455
    goto/16 :goto_1

    .line 456
    .line 457
    :catchall_0
    move-exception v0

    .line 458
    move-object/from16 v1, p0

    .line 459
    .line 460
    goto :goto_4

    .line 461
    :cond_2
    move-object v0, v1

    .line 462
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v16 .. v16}, LK0/o;->g()V

    .line 466
    .line 467
    .line 468
    const/4 v2, 0x0

    .line 469
    move-object/from16 v1, p0

    .line 470
    .line 471
    invoke-virtual {v1, v0, v2}, Li7/f;->h(Ljava/util/ArrayList;Z)Z

    .line 472
    .line 473
    .line 474
    move-result v2

    .line 475
    if-eqz v2, :cond_5

    .line 476
    .line 477
    new-instance v2, Ljava/util/ArrayList;

    .line 478
    .line 479
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    :cond_3
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 487
    .line 488
    .line 489
    move-result v3

    .line 490
    if-eqz v3, :cond_4

    .line 491
    .line 492
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    move-object v4, v3

    .line 497
    check-cast v4, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 498
    .line 499
    iget-object v4, v4, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 500
    .line 501
    move-object/from16 v5, p1

    .line 502
    .line 503
    invoke-interface {v5, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v4

    .line 507
    if-eqz v4, :cond_3

    .line 508
    .line 509
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    goto :goto_3

    .line 513
    :cond_4
    return-object v2

    .line 514
    :cond_5
    return-object v0

    .line 515
    :catchall_1
    move-exception v0

    .line 516
    goto :goto_4

    .line 517
    :catchall_2
    move-exception v0

    .line 518
    move-object/from16 v16, v2

    .line 519
    .line 520
    :goto_4
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v16 .. v16}, LK0/o;->g()V

    .line 524
    .line 525
    .line 526
    throw v0
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
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
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
.end method

.method public final close()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Li7/f;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Li7/f;->s:Z

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, Li7/f;->v:LP0/c;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    :catch_0
    :try_start_1
    iget-object v0, p0, Li7/f;->u:Lcom/tonyodev/fetch2/database/DownloadDatabase;

    .line 15
    .line 16
    invoke-virtual {v0}, LK0/m;->l()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v1, v0, LK0/m;->h:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "readWriteLock.writeLock()"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 34
    .line 35
    .line 36
    :try_start_2
    iget-object v2, v0, LK0/m;->d:LK0/i;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, LK0/m;->g()LO0/c;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 46
    .line 47
    .line 48
    :try_start_3
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 54
    .line 55
    .line 56
    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 57
    :catch_1
    :cond_1
    :goto_0
    iget-object v0, p0, Li7/f;->z:Lq7/f;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    :goto_1
    return-void
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

.method public final g()Ljava/util/List;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "prioritySort"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-static {v2, v0}, Landroidx/datastore/preferences/protobuf/g;->v(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Li7/f;->j()V

    .line 10
    .line 11
    .line 12
    const-string v0, "_download_on_enqueue"

    .line 13
    .line 14
    const-string v3, "_identifier"

    .line 15
    .line 16
    const-string v4, "_enqueue_action"

    .line 17
    .line 18
    const-string v5, "_tag"

    .line 19
    .line 20
    const-string v6, "_created"

    .line 21
    .line 22
    const-string v7, "_network_type"

    .line 23
    .line 24
    const-string v8, "_error"

    .line 25
    .line 26
    const-string v9, "_status"

    .line 27
    .line 28
    const-string v10, "_total_bytes"

    .line 29
    .line 30
    const-string v11, "_written_bytes"

    .line 31
    .line 32
    const-string v12, "_headers"

    .line 33
    .line 34
    const-string v13, "_priority"

    .line 35
    .line 36
    const-string v14, "_group"

    .line 37
    .line 38
    const-string v15, "_file"

    .line 39
    .line 40
    const-string v2, "_url"

    .line 41
    .line 42
    move-object/from16 v17, v0

    .line 43
    .line 44
    const-string v0, "_namespace"

    .line 45
    .line 46
    move-object/from16 v18, v3

    .line 47
    .line 48
    const-string v3, "_id"

    .line 49
    .line 50
    move-object/from16 v19, v4

    .line 51
    .line 52
    sget-object v4, Lh7/f;->u:Lh7/f;

    .line 53
    .line 54
    move-object/from16 v20, v4

    .line 55
    .line 56
    iget-object v4, v1, Li7/f;->u:Lcom/tonyodev/fetch2/database/DownloadDatabase;

    .line 57
    .line 58
    invoke-virtual {v4}, Lcom/tonyodev/fetch2/database/DownloadDatabase;->q()Lo4/r;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    const-string v1, "SELECT * FROM requests WHERE _status = ? ORDER BY _priority DESC, _created ASC"

    .line 66
    .line 67
    move-object/from16 v21, v5

    .line 68
    .line 69
    const/4 v5, 0x1

    .line 70
    invoke-static {v5, v1}, LK0/o;->c(ILjava/lang/String;)LK0/o;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    move-object/from16 v16, v6

    .line 75
    .line 76
    move-object/from16 v22, v7

    .line 77
    .line 78
    int-to-long v6, v5

    .line 79
    invoke-virtual {v1, v5, v6, v7}, LK0/o;->I(IJ)V

    .line 80
    .line 81
    .line 82
    iget-object v4, v4, Lo4/r;->t:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v4, Lcom/tonyodev/fetch2/database/DownloadDatabase_Impl;

    .line 85
    .line 86
    invoke-virtual {v4}, LK0/m;->b()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4, v1}, LK0/m;->m(LO0/e;)Landroid/database/Cursor;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    :try_start_0
    invoke-static {v4, v3}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-static {v4, v0}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-static {v4, v2}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    invoke-static {v4, v15}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    invoke-static {v4, v14}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    invoke-static {v4, v13}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v13

    .line 117
    invoke-static {v4, v12}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    invoke-static {v4, v11}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    invoke-static {v4, v10}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    invoke-static {v4, v9}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    invoke-static {v4, v8}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    move-object/from16 v14, v22

    .line 138
    .line 139
    invoke-static {v4, v14}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v14

    .line 143
    move-object/from16 v15, v16

    .line 144
    .line 145
    invoke-static {v4, v15}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    move-result v15

    .line 149
    move-object/from16 v5, v21

    .line 150
    .line 151
    invoke-static {v4, v5}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 152
    .line 153
    .line 154
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 155
    move-object/from16 v21, v1

    .line 156
    .line 157
    move-object/from16 v1, v19

    .line 158
    .line 159
    :try_start_1
    invoke-static {v4, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    move/from16 v19, v1

    .line 164
    .line 165
    move-object/from16 v1, v18

    .line 166
    .line 167
    invoke-static {v4, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    move/from16 v18, v1

    .line 172
    .line 173
    move-object/from16 v1, v17

    .line 174
    .line 175
    invoke-static {v4, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    move/from16 v17, v1

    .line 180
    .line 181
    const-string v1, "_extras"

    .line 182
    .line 183
    invoke-static {v4, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    move/from16 v22, v1

    .line 188
    .line 189
    const-string v1, "_auto_retry_max_attempts"

    .line 190
    .line 191
    invoke-static {v4, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    move/from16 v23, v1

    .line 196
    .line 197
    const-string v1, "_auto_retry_attempts"

    .line 198
    .line 199
    invoke-static {v4, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    move/from16 v24, v1

    .line 204
    .line 205
    new-instance v1, Ljava/util/ArrayList;

    .line 206
    .line 207
    move/from16 v25, v5

    .line 208
    .line 209
    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 214
    .line 215
    .line 216
    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    move/from16 v26, v5

    .line 221
    .line 222
    if-eqz v26, :cond_1

    .line 223
    .line 224
    new-instance v5, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 225
    .line 226
    invoke-direct {v5}, Lcom/tonyodev/fetch2/database/DownloadInfo;-><init>()V

    .line 227
    .line 228
    .line 229
    move-object/from16 v27, v1

    .line 230
    .line 231
    invoke-interface {v4, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    iput v1, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 236
    .line 237
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {v5, v1}, Lcom/tonyodev/fetch2/database/DownloadInfo;->g(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-virtual {v5, v1}, Lcom/tonyodev/fetch2/database/DownloadInfo;->i(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-virtual {v5, v1}, Lcom/tonyodev/fetch2/database/DownloadInfo;->f(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    iput v1, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->w:I

    .line 263
    .line 264
    invoke-interface {v4, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    invoke-static {v1}, LK3/d;->s(I)I

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    iput v1, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->x:I

    .line 273
    .line 274
    invoke-interface {v4, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-static {v1}, LK3/d;->q(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    iput-object v1, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->y:Ljava/util/Map;

    .line 283
    .line 284
    move/from16 v28, v0

    .line 285
    .line 286
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 287
    .line 288
    .line 289
    move-result-wide v0

    .line 290
    iput-wide v0, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 291
    .line 292
    invoke-interface {v4, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 293
    .line 294
    .line 295
    move-result-wide v0

    .line 296
    iput-wide v0, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 297
    .line 298
    invoke-interface {v4, v9}, Landroid/database/Cursor;->getInt(I)I

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    invoke-static {v0}, LK3/d;->t(I)Lh7/f;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    iput-object v0, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 307
    .line 308
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    invoke-static {v0}, LK3/d;->m(I)Lh7/b;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    iput-object v0, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->C:Lh7/b;

    .line 317
    .line 318
    invoke-interface {v4, v14}, Landroid/database/Cursor;->getInt(I)I

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    invoke-static {v0}, LK3/d;->r(I)I

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    iput v0, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->D:I

    .line 327
    .line 328
    invoke-interface {v4, v15}, Landroid/database/Cursor;->getLong(I)J

    .line 329
    .line 330
    .line 331
    move-result-wide v0

    .line 332
    iput-wide v0, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->E:J

    .line 333
    .line 334
    move/from16 v0, v25

    .line 335
    .line 336
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    iput-object v1, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->F:Ljava/lang/String;

    .line 341
    .line 342
    move/from16 v1, v19

    .line 343
    .line 344
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 345
    .line 346
    .line 347
    move-result v19

    .line 348
    move/from16 v25, v0

    .line 349
    .line 350
    invoke-static/range {v19 .. v19}, LK3/d;->f(I)I

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    iput v0, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->G:I

    .line 355
    .line 356
    move/from16 v19, v1

    .line 357
    .line 358
    move/from16 v0, v18

    .line 359
    .line 360
    move/from16 v18, v2

    .line 361
    .line 362
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 363
    .line 364
    .line 365
    move-result-wide v1

    .line 366
    iput-wide v1, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->H:J

    .line 367
    .line 368
    move/from16 v1, v17

    .line 369
    .line 370
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 371
    .line 372
    .line 373
    move-result v2

    .line 374
    if-eqz v2, :cond_0

    .line 375
    .line 376
    const/4 v2, 0x1

    .line 377
    goto :goto_1

    .line 378
    :cond_0
    const/4 v2, 0x0

    .line 379
    :goto_1
    iput-boolean v2, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->I:Z

    .line 380
    .line 381
    move/from16 v2, v22

    .line 382
    .line 383
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v17

    .line 387
    move/from16 v22, v0

    .line 388
    .line 389
    invoke-static/range {v17 .. v17}, LK3/d;->o(Ljava/lang/String;)Lcom/tonyodev/fetch2core/Extras;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    iput-object v0, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->J:Lcom/tonyodev/fetch2core/Extras;

    .line 394
    .line 395
    move/from16 v17, v1

    .line 396
    .line 397
    move/from16 v0, v23

    .line 398
    .line 399
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    iput v1, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->K:I

    .line 404
    .line 405
    move/from16 v23, v0

    .line 406
    .line 407
    move/from16 v1, v24

    .line 408
    .line 409
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    iput v0, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->L:I

    .line 414
    .line 415
    move-object/from16 v0, v27

    .line 416
    .line 417
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 418
    .line 419
    .line 420
    move/from16 v24, v22

    .line 421
    .line 422
    move/from16 v22, v2

    .line 423
    .line 424
    move/from16 v2, v18

    .line 425
    .line 426
    move/from16 v18, v24

    .line 427
    .line 428
    move/from16 v24, v1

    .line 429
    .line 430
    move-object v1, v0

    .line 431
    move/from16 v0, v28

    .line 432
    .line 433
    goto/16 :goto_0

    .line 434
    .line 435
    :catchall_0
    move-exception v0

    .line 436
    :goto_2
    move-object/from16 v1, p0

    .line 437
    .line 438
    goto :goto_4

    .line 439
    :cond_1
    move-object v0, v1

    .line 440
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v21 .. v21}, LK0/o;->g()V

    .line 444
    .line 445
    .line 446
    const/4 v2, 0x0

    .line 447
    move-object/from16 v1, p0

    .line 448
    .line 449
    invoke-virtual {v1, v0, v2}, Li7/f;->h(Ljava/util/ArrayList;Z)Z

    .line 450
    .line 451
    .line 452
    move-result v2

    .line 453
    if-eqz v2, :cond_4

    .line 454
    .line 455
    new-instance v2, Ljava/util/ArrayList;

    .line 456
    .line 457
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 458
    .line 459
    .line 460
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 465
    .line 466
    .line 467
    move-result v3

    .line 468
    if-eqz v3, :cond_3

    .line 469
    .line 470
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    move-object v4, v3

    .line 475
    check-cast v4, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 476
    .line 477
    iget-object v4, v4, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 478
    .line 479
    move-object/from16 v5, v20

    .line 480
    .line 481
    if-ne v4, v5, :cond_2

    .line 482
    .line 483
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    :cond_2
    move-object/from16 v20, v5

    .line 487
    .line 488
    goto :goto_3

    .line 489
    :cond_3
    return-object v2

    .line 490
    :cond_4
    return-object v0

    .line 491
    :catchall_1
    move-exception v0

    .line 492
    move-object/from16 v21, v1

    .line 493
    .line 494
    goto :goto_2

    .line 495
    :goto_4
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v21 .. v21}, LK0/o;->g()V

    .line 499
    .line 500
    .line 501
    throw v0
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
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
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

.method public final h(Ljava/util/ArrayList;Z)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, v0, Li7/f;->y:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x0

    .line 14
    move v5, v4

    .line 15
    :goto_0
    if-ge v5, v3, :cond_5

    .line 16
    .line 17
    move-object/from16 v6, p1

    .line 18
    .line 19
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    check-cast v7, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 24
    .line 25
    iget-object v8, v7, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 26
    .line 27
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    sget-object v9, Lh7/b;->u:Lh7/b;

    .line 32
    .line 33
    const-wide/16 v10, 0x0

    .line 34
    .line 35
    if-eq v8, v1, :cond_3

    .line 36
    .line 37
    const/4 v12, 0x2

    .line 38
    if-eq v8, v12, :cond_1

    .line 39
    .line 40
    const/4 v12, 0x3

    .line 41
    if-eq v8, v12, :cond_3

    .line 42
    .line 43
    const/4 v12, 0x4

    .line 44
    if-eq v8, v12, :cond_0

    .line 45
    .line 46
    goto/16 :goto_2

    .line 47
    .line 48
    :cond_0
    iget-wide v12, v7, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 49
    .line 50
    const-wide/16 v14, 0x1

    .line 51
    .line 52
    cmp-long v8, v12, v14

    .line 53
    .line 54
    if-gez v8, :cond_4

    .line 55
    .line 56
    iget-wide v12, v7, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 57
    .line 58
    cmp-long v8, v12, v10

    .line 59
    .line 60
    if-lez v8, :cond_4

    .line 61
    .line 62
    iput-wide v12, v7, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 63
    .line 64
    sget-object v8, Lp7/a;->a:Lh7/d;

    .line 65
    .line 66
    iput-object v9, v7, Lcom/tonyodev/fetch2/database/DownloadInfo;->C:Lh7/b;

    .line 67
    .line 68
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_1
    if-eqz p2, :cond_4

    .line 73
    .line 74
    iget-wide v12, v7, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 75
    .line 76
    cmp-long v8, v12, v10

    .line 77
    .line 78
    if-lez v8, :cond_2

    .line 79
    .line 80
    iget-wide v14, v7, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 81
    .line 82
    cmp-long v8, v14, v10

    .line 83
    .line 84
    if-lez v8, :cond_2

    .line 85
    .line 86
    cmp-long v8, v12, v14

    .line 87
    .line 88
    if-ltz v8, :cond_2

    .line 89
    .line 90
    sget-object v8, Lh7/f;->x:Lh7/f;

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    sget-object v8, Lh7/f;->u:Lh7/f;

    .line 94
    .line 95
    :goto_1
    iput-object v8, v7, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 96
    .line 97
    sget-object v8, Lp7/a;->a:Lh7/d;

    .line 98
    .line 99
    iput-object v9, v7, Lcom/tonyodev/fetch2/database/DownloadInfo;->C:Lh7/b;

    .line 100
    .line 101
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    iget-wide v12, v7, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 106
    .line 107
    cmp-long v8, v12, v10

    .line 108
    .line 109
    if-lez v8, :cond_4

    .line 110
    .line 111
    iget-object v8, v7, Lcom/tonyodev/fetch2/database/DownloadInfo;->v:Ljava/lang/String;

    .line 112
    .line 113
    iget-object v12, v0, Li7/f;->B:Lo1/k;

    .line 114
    .line 115
    invoke-virtual {v12, v8}, Lo1/k;->k(Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-nez v8, :cond_4

    .line 120
    .line 121
    iput-wide v10, v7, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 122
    .line 123
    const-wide/16 v10, -0x1

    .line 124
    .line 125
    iput-wide v10, v7, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 126
    .line 127
    sget-object v8, Lp7/a;->a:Lh7/d;

    .line 128
    .line 129
    iput-object v9, v7, Lcom/tonyodev/fetch2/database/DownloadInfo;->C:Lh7/b;

    .line 130
    .line 131
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    iget-object v8, v0, Li7/f;->t:Lk7/e;

    .line 135
    .line 136
    if-eqz v8, :cond_4

    .line 137
    .line 138
    iget-object v8, v8, Lk7/e;->s:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v8, LT3/c;

    .line 141
    .line 142
    iget-object v8, v8, LT3/c;->c:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v8, Lh7/c;

    .line 145
    .line 146
    iget-object v8, v8, Lh7/c;->e:Lo1/k;

    .line 147
    .line 148
    invoke-static {v7}, Lga/d;->t(Lcom/tonyodev/fetch2/Download;)LFa/e;

    .line 149
    .line 150
    .line 151
    iget v7, v7, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 152
    .line 153
    iget-object v8, v8, Lo1/k;->t:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v8, Ljava/lang/String;

    .line 156
    .line 157
    invoke-static {v7, v8}, Lga/d;->j(ILjava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :cond_4
    :goto_2
    add-int/2addr v5, v1

    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    if-lez v3, :cond_6

    .line 168
    .line 169
    :try_start_0
    invoke-virtual {v0, v2}, Li7/f;->n(Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :catch_0
    iget-object v5, v0, Li7/f;->z:Lq7/f;

    .line 174
    .line 175
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    :cond_6
    :goto_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 179
    .line 180
    .line 181
    if-lez v3, :cond_7

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_7
    move v1, v4

    .line 185
    :goto_4
    return v1
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

.method public final i()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Li7/f;->j()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li7/f;->A:Ll7/j;

    .line 5
    .line 6
    new-instance v1, Le2/b;

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-direct {v1, p0, v2}, Le2/b;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Ll7/j;->a:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v2

    .line 15
    :try_start_0
    invoke-virtual {v1, v0}, Le2/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    monitor-exit v2

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    monitor-exit v2

    .line 22
    throw v0
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final j()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Li7/f;->s:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lcom/tonyodev/fetch2/exception/FetchException;

    .line 7
    .line 8
    const-string v1, "LibGlobalFetchLib database is closed"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcom/tonyodev/fetch2/exception/FetchException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
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

.method public final l(Lcom/tonyodev/fetch2/database/DownloadInfo;)V
    .locals 3

    .line 1
    const-string v0, "downloadInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Li7/f;->j()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Li7/f;->u:Lcom/tonyodev/fetch2/database/DownloadDatabase;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/tonyodev/fetch2/database/DownloadDatabase;->q()Lo4/r;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, v0, Lo4/r;->t:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lcom/tonyodev/fetch2/database/DownloadDatabase_Impl;

    .line 18
    .line 19
    invoke-virtual {v1}, LK0/m;->b()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, LK0/m;->c()V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object v0, v0, Lo4/r;->w:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Li7/c;

    .line 28
    .line 29
    invoke-virtual {v0}, LK0/q;->a()LP0/j;

    .line 30
    .line 31
    .line 32
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    :try_start_1
    invoke-virtual {v0, v2, p1}, Li7/c;->f(LP0/j;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, LP0/j;->a()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    .line 38
    .line 39
    :try_start_2
    invoke-virtual {v0, v2}, LK0/q;->e(LP0/j;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, LK0/m;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, LK0/m;->j()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_0

    .line 51
    :catchall_1
    move-exception p1

    .line 52
    :try_start_3
    invoke-virtual {v0, v2}, LK0/q;->e(LP0/j;)V

    .line 53
    .line 54
    .line 55
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 56
    :goto_0
    invoke-virtual {v1}, LK0/m;->j()V

    .line 57
    .line 58
    .line 59
    throw p1
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

.method public final n(Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    const-string v0, "downloadInfoList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Li7/f;->j()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Li7/f;->u:Lcom/tonyodev/fetch2/database/DownloadDatabase;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/tonyodev/fetch2/database/DownloadDatabase;->q()Lo4/r;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, v0, Lo4/r;->t:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lcom/tonyodev/fetch2/database/DownloadDatabase_Impl;

    .line 18
    .line 19
    invoke-virtual {v1}, LK0/m;->b()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, LK0/m;->c()V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object v0, v0, Lo4/r;->w:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Li7/c;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, LK0/d;->g(Ljava/util/List;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, LK0/m;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, LK0/m;->j()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    invoke-virtual {v1}, LK0/m;->j()V

    .line 41
    .line 42
    .line 43
    throw p1
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

.method public final o(Lcom/tonyodev/fetch2/database/DownloadInfo;)V
    .locals 8

    .line 1
    iget-object v0, p0, Li7/f;->z:Lq7/f;

    .line 2
    .line 3
    iget-object v1, p0, Li7/f;->v:LP0/c;

    .line 4
    .line 5
    const-string v2, "downloadInfo"

    .line 6
    .line 7
    invoke-static {p1, v2}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Li7/f;->j()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v1}, LP0/c;->a()V

    .line 14
    .line 15
    .line 16
    const-string v2, "UPDATE requests SET _written_bytes = ?, _total_bytes = ?, _status = ? WHERE _id = ?"

    .line 17
    .line 18
    iget-wide v3, p1, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 19
    .line 20
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-wide v4, p1, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 25
    .line 26
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    iget-object v5, p1, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 31
    .line 32
    iget v5, v5, Lh7/f;->s:I

    .line 33
    .line 34
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iget p1, p1, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 39
    .line 40
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const/4 v6, 0x4

    .line 45
    new-array v6, v6, [Ljava/lang/Object;

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    aput-object v3, v6, v7

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    aput-object v4, v6, v3

    .line 52
    .line 53
    const/4 v3, 0x2

    .line 54
    aput-object v5, v6, v3

    .line 55
    .line 56
    const/4 v3, 0x3

    .line 57
    aput-object p1, v6, v3

    .line 58
    .line 59
    iget-object p1, v1, LP0/c;->s:Landroid/database/sqlite/SQLiteDatabase;

    .line 60
    .line 61
    invoke-virtual {p1, v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, LP0/c;->o()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catch_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    :goto_0
    :try_start_1
    invoke-virtual {v1}, LP0/c;->g()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catch_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    :goto_1
    return-void
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
