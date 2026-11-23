.class public final Lp1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final s:Lg1/j;

.field public final t:Lo1/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "EnqueueRunnable"

    .line 2
    .line 3
    invoke-static {v0}, Lf1/q;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 4
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
.end method

.method public constructor <init>(Lg1/j;)V
    .locals 2

    .line 1
    new-instance v0, Lo1/r;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lo1/r;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lp1/d;->s:Lg1/j;

    .line 12
    .line 13
    iput-object v0, p0, Lp1/d;->t:Lo1/r;

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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static a(Lg1/j;)Z
    .locals 52

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lg1/j;->t(Lg1/j;)Ljava/util/HashSet;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    new-array v3, v2, [Ljava/lang/String;

    .line 12
    .line 13
    invoke-interface {v1, v3}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, [Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    iget-object v5, v0, Lg1/j;->a:Lg1/o;

    .line 24
    .line 25
    iget-object v6, v5, Lg1/o;->c:Landroidx/work/impl/WorkDatabase;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    array-length v8, v1

    .line 30
    if-lez v8, :cond_0

    .line 31
    .line 32
    const/4 v8, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v8, v2

    .line 35
    :goto_0
    const/4 v9, 0x6

    .line 36
    const/4 v10, 0x4

    .line 37
    if-eqz v8, :cond_6

    .line 38
    .line 39
    array-length v11, v1

    .line 40
    move v12, v2

    .line 41
    move v14, v12

    .line 42
    move v15, v14

    .line 43
    const/4 v13, 0x1

    .line 44
    :goto_1
    if-ge v12, v11, :cond_7

    .line 45
    .line 46
    aget-object v2, v1, v12

    .line 47
    .line 48
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->v()Lo1/p;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-virtual {v7, v2}, Lo1/p;->g(Ljava/lang/String;)Lo1/o;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-nez v2, :cond_2

    .line 57
    .line 58
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    :cond_1
    :goto_2
    const/4 v2, 0x0

    .line 66
    :goto_3
    const/4 v8, 0x1

    .line 67
    goto/16 :goto_14

    .line 68
    .line 69
    :cond_2
    iget v2, v2, Lo1/o;->b:I

    .line 70
    .line 71
    const/4 v7, 0x3

    .line 72
    if-ne v2, v7, :cond_3

    .line 73
    .line 74
    const/4 v7, 0x1

    .line 75
    goto :goto_4

    .line 76
    :cond_3
    const/4 v7, 0x0

    .line 77
    :goto_4
    and-int/2addr v13, v7

    .line 78
    if-ne v2, v10, :cond_4

    .line 79
    .line 80
    const/4 v15, 0x1

    .line 81
    goto :goto_5

    .line 82
    :cond_4
    if-ne v2, v9, :cond_5

    .line 83
    .line 84
    const/4 v14, 0x1

    .line 85
    :cond_5
    :goto_5
    add-int/lit8 v12, v12, 0x1

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    goto :goto_1

    .line 89
    :cond_6
    const/4 v13, 0x1

    .line 90
    const/4 v14, 0x0

    .line 91
    const/4 v15, 0x0

    .line 92
    :cond_7
    iget-object v2, v0, Lg1/j;->b:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-nez v7, :cond_f

    .line 99
    .line 100
    if-nez v8, :cond_f

    .line 101
    .line 102
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->v()Lo1/p;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    const-string v12, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    .line 110
    .line 111
    const/4 v9, 0x1

    .line 112
    invoke-static {v9, v12}, LK0/o;->c(ILjava/lang/String;)LK0/o;

    .line 113
    .line 114
    .line 115
    move-result-object v12

    .line 116
    if-nez v2, :cond_8

    .line 117
    .line 118
    invoke-virtual {v12, v9}, LK0/o;->v(I)V

    .line 119
    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_8
    invoke-virtual {v12, v9, v2}, LK0/o;->m(ILjava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :goto_6
    iget-object v11, v11, Lo1/p;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 126
    .line 127
    invoke-virtual {v11}, LK0/m;->b()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v11, v12}, LK0/m;->m(LO0/e;)Landroid/database/Cursor;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    :try_start_0
    new-instance v10, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-interface {v11}, Landroid/database/Cursor;->getCount()I

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    invoke-direct {v10, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 141
    .line 142
    .line 143
    :goto_7
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    if-eqz v9, :cond_a

    .line 148
    .line 149
    const/4 v9, 0x0

    .line 150
    invoke-interface {v11, v9}, Landroid/database/Cursor;->isNull(I)Z

    .line 151
    .line 152
    .line 153
    move-result v17

    .line 154
    if-eqz v17, :cond_9

    .line 155
    .line 156
    const/4 v9, 0x0

    .line 157
    :goto_8
    move-object/from16 v16, v6

    .line 158
    .line 159
    const/4 v6, 0x1

    .line 160
    goto :goto_9

    .line 161
    :cond_9
    invoke-interface {v11, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    goto :goto_8

    .line 166
    :goto_9
    invoke-interface {v11, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 167
    .line 168
    .line 169
    move-result v17

    .line 170
    invoke-static/range {v17 .. v17}, LC3/b;->H(I)I

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    move/from16 v17, v7

    .line 175
    .line 176
    new-instance v7, Lo1/n;

    .line 177
    .line 178
    move/from16 v19, v8

    .line 179
    .line 180
    const-string v8, "id"

    .line 181
    .line 182
    invoke-static {v9, v8}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 186
    .line 187
    .line 188
    iput-object v9, v7, Lo1/n;->a:Ljava/lang/String;

    .line 189
    .line 190
    iput v6, v7, Lo1/n;->b:I

    .line 191
    .line 192
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 193
    .line 194
    .line 195
    move-object/from16 v6, v16

    .line 196
    .line 197
    move/from16 v7, v17

    .line 198
    .line 199
    move/from16 v8, v19

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :catchall_0
    move-exception v0

    .line 203
    goto/16 :goto_c

    .line 204
    .line 205
    :cond_a
    move-object/from16 v16, v6

    .line 206
    .line 207
    move/from16 v17, v7

    .line 208
    .line 209
    move/from16 v19, v8

    .line 210
    .line 211
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12}, LK0/o;->g()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 218
    .line 219
    .line 220
    move-result v6

    .line 221
    if-nez v6, :cond_10

    .line 222
    .line 223
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    :cond_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v7

    .line 231
    if-eqz v7, :cond_c

    .line 232
    .line 233
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    check-cast v7, Lo1/n;

    .line 238
    .line 239
    iget v7, v7, Lo1/n;->b:I

    .line 240
    .line 241
    const/4 v8, 0x1

    .line 242
    if-eq v7, v8, :cond_1

    .line 243
    .line 244
    const/4 v8, 0x2

    .line 245
    if-ne v7, v8, :cond_b

    .line 246
    .line 247
    goto/16 :goto_2

    .line 248
    .line 249
    :cond_c
    new-instance v6, Lp1/b;

    .line 250
    .line 251
    const/4 v7, 0x1

    .line 252
    invoke-direct {v6, v5, v2, v7}, Lp1/b;-><init>(Lg1/o;Ljava/lang/Object;I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v6}, Lp1/c;->run()V

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v16 .. v16}, Landroidx/work/impl/WorkDatabase;->v()Lo1/p;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result v8

    .line 270
    if-eqz v8, :cond_e

    .line 271
    .line 272
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    check-cast v8, Lo1/n;

    .line 277
    .line 278
    iget-object v8, v8, Lo1/n;->a:Ljava/lang/String;

    .line 279
    .line 280
    iget-object v9, v6, Lo1/p;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 281
    .line 282
    invoke-virtual {v9}, LK0/m;->b()V

    .line 283
    .line 284
    .line 285
    iget-object v10, v6, Lo1/p;->c:Li7/d;

    .line 286
    .line 287
    invoke-virtual {v10}, LK0/q;->a()LP0/j;

    .line 288
    .line 289
    .line 290
    move-result-object v11

    .line 291
    const/4 v12, 0x1

    .line 292
    if-nez v8, :cond_d

    .line 293
    .line 294
    invoke-interface {v11, v12}, LO0/d;->v(I)V

    .line 295
    .line 296
    .line 297
    goto :goto_b

    .line 298
    :cond_d
    invoke-interface {v11, v12, v8}, LO0/d;->m(ILjava/lang/String;)V

    .line 299
    .line 300
    .line 301
    :goto_b
    invoke-virtual {v9}, LK0/m;->c()V

    .line 302
    .line 303
    .line 304
    :try_start_1
    invoke-virtual {v11}, LP0/j;->a()I

    .line 305
    .line 306
    .line 307
    invoke-virtual {v9}, LK0/m;->o()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 308
    .line 309
    .line 310
    invoke-virtual {v9}, LK0/m;->j()V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v10, v11}, LK0/q;->e(LP0/j;)V

    .line 314
    .line 315
    .line 316
    goto :goto_a

    .line 317
    :catchall_1
    move-exception v0

    .line 318
    invoke-virtual {v9}, LK0/m;->j()V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v10, v11}, LK0/q;->e(LP0/j;)V

    .line 322
    .line 323
    .line 324
    throw v0

    .line 325
    :cond_e
    const/4 v6, 0x1

    .line 326
    goto :goto_d

    .line 327
    :goto_c
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12}, LK0/o;->g()V

    .line 331
    .line 332
    .line 333
    throw v0

    .line 334
    :cond_f
    move-object/from16 v16, v6

    .line 335
    .line 336
    move/from16 v17, v7

    .line 337
    .line 338
    move/from16 v19, v8

    .line 339
    .line 340
    :cond_10
    const/4 v6, 0x0

    .line 341
    :goto_d
    iget-object v7, v0, Lg1/j;->c:Ljava/util/List;

    .line 342
    .line 343
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    move v8, v6

    .line 348
    :goto_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 349
    .line 350
    .line 351
    move-result v6

    .line 352
    if-eqz v6, :cond_1b

    .line 353
    .line 354
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v6

    .line 358
    check-cast v6, Lf1/r;

    .line 359
    .line 360
    iget-object v9, v6, Lf1/r;->b:Lo1/o;

    .line 361
    .line 362
    if-eqz v19, :cond_13

    .line 363
    .line 364
    if-nez v13, :cond_13

    .line 365
    .line 366
    if-eqz v15, :cond_11

    .line 367
    .line 368
    const/4 v10, 0x4

    .line 369
    iput v10, v9, Lo1/o;->b:I

    .line 370
    .line 371
    const/4 v11, 0x6

    .line 372
    goto :goto_f

    .line 373
    :cond_11
    const/4 v10, 0x4

    .line 374
    if-eqz v14, :cond_12

    .line 375
    .line 376
    const/4 v11, 0x6

    .line 377
    iput v11, v9, Lo1/o;->b:I

    .line 378
    .line 379
    goto :goto_f

    .line 380
    :cond_12
    const/4 v11, 0x6

    .line 381
    const/4 v12, 0x5

    .line 382
    iput v12, v9, Lo1/o;->b:I

    .line 383
    .line 384
    goto :goto_f

    .line 385
    :cond_13
    const/4 v10, 0x4

    .line 386
    const/4 v11, 0x6

    .line 387
    iput-wide v3, v9, Lo1/o;->n:J

    .line 388
    .line 389
    :goto_f
    iget v12, v9, Lo1/o;->b:I

    .line 390
    .line 391
    const/4 v10, 0x1

    .line 392
    if-ne v12, v10, :cond_14

    .line 393
    .line 394
    const/4 v8, 0x1

    .line 395
    :cond_14
    invoke-virtual/range {v16 .. v16}, Landroidx/work/impl/WorkDatabase;->v()Lo1/p;

    .line 396
    .line 397
    .line 398
    move-result-object v10

    .line 399
    iget-object v12, v5, Lg1/o;->e:Ljava/util/List;

    .line 400
    .line 401
    const-string v11, "schedulers"

    .line 402
    .line 403
    invoke-static {v12, v11}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 407
    .line 408
    const/16 v12, 0x1a

    .line 409
    .line 410
    if-ge v11, v12, :cond_16

    .line 411
    .line 412
    iget-object v11, v9, Lo1/o;->j:Lf1/d;

    .line 413
    .line 414
    const-class v12, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 415
    .line 416
    move-wide/from16 v20, v3

    .line 417
    .line 418
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    iget-object v4, v9, Lo1/o;->c:Ljava/lang/String;

    .line 423
    .line 424
    invoke-static {v4, v3}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    if-nez v3, :cond_17

    .line 429
    .line 430
    iget-boolean v3, v11, Lf1/d;->d:Z

    .line 431
    .line 432
    if-nez v3, :cond_15

    .line 433
    .line 434
    iget-boolean v3, v11, Lf1/d;->e:Z

    .line 435
    .line 436
    if-eqz v3, :cond_17

    .line 437
    .line 438
    :cond_15
    new-instance v3, LFa/d;

    .line 439
    .line 440
    const/4 v11, 0x1

    .line 441
    invoke-direct {v3, v11}, LFa/d;-><init>(I)V

    .line 442
    .line 443
    .line 444
    iget-object v11, v9, Lo1/o;->e:Lf1/g;

    .line 445
    .line 446
    iget-object v11, v11, Lf1/g;->a:Ljava/util/HashMap;

    .line 447
    .line 448
    invoke-virtual {v3, v11}, LFa/d;->a(Ljava/util/HashMap;)V

    .line 449
    .line 450
    .line 451
    iget-object v11, v3, LFa/d;->a:Ljava/util/HashMap;

    .line 452
    .line 453
    move-object/from16 v18, v5

    .line 454
    .line 455
    const-string v5, "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"

    .line 456
    .line 457
    invoke-virtual {v11, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    new-instance v4, Lf1/g;

    .line 461
    .line 462
    iget-object v3, v3, LFa/d;->a:Ljava/util/HashMap;

    .line 463
    .line 464
    invoke-direct {v4, v3}, Lf1/g;-><init>(Ljava/util/HashMap;)V

    .line 465
    .line 466
    .line 467
    invoke-static {v4}, Lf1/g;->c(Lf1/g;)[B

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v25

    .line 474
    iget v3, v9, Lo1/o;->b:I

    .line 475
    .line 476
    iget-object v5, v9, Lo1/o;->d:Ljava/lang/String;

    .line 477
    .line 478
    iget-wide v11, v9, Lo1/o;->g:J

    .line 479
    .line 480
    move-object/from16 v27, v4

    .line 481
    .line 482
    iget-object v4, v9, Lo1/o;->j:Lf1/d;

    .line 483
    .line 484
    move-object/from16 v50, v7

    .line 485
    .line 486
    move/from16 v51, v8

    .line 487
    .line 488
    iget-wide v7, v9, Lo1/o;->n:J

    .line 489
    .line 490
    move-object/from16 v26, v5

    .line 491
    .line 492
    iget-boolean v5, v9, Lo1/o;->q:Z

    .line 493
    .line 494
    move/from16 v46, v5

    .line 495
    .line 496
    const-string v5, "id"

    .line 497
    .line 498
    move-wide/from16 v40, v7

    .line 499
    .line 500
    iget-object v7, v9, Lo1/o;->a:Ljava/lang/String;

    .line 501
    .line 502
    invoke-static {v7, v5}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    const-string v5, "state"

    .line 506
    .line 507
    invoke-static {v3, v5}, Landroidx/datastore/preferences/protobuf/g;->p(ILjava/lang/String;)V

    .line 508
    .line 509
    .line 510
    iget-object v5, v9, Lo1/o;->f:Lf1/g;

    .line 511
    .line 512
    const-string v8, "output"

    .line 513
    .line 514
    invoke-static {v5, v8}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    const-string v8, "constraints"

    .line 518
    .line 519
    invoke-static {v4, v8}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    iget v8, v9, Lo1/o;->l:I

    .line 523
    .line 524
    move/from16 v24, v3

    .line 525
    .line 526
    const-string v3, "backoffPolicy"

    .line 527
    .line 528
    invoke-static {v8, v3}, Landroidx/datastore/preferences/protobuf/g;->p(ILjava/lang/String;)V

    .line 529
    .line 530
    .line 531
    iget v3, v9, Lo1/o;->r:I

    .line 532
    .line 533
    move-object/from16 v35, v4

    .line 534
    .line 535
    const-string v4, "outOfQuotaPolicy"

    .line 536
    .line 537
    invoke-static {v3, v4}, Landroidx/datastore/preferences/protobuf/g;->p(ILjava/lang/String;)V

    .line 538
    .line 539
    .line 540
    new-instance v22, Lo1/o;

    .line 541
    .line 542
    move/from16 v47, v3

    .line 543
    .line 544
    iget-wide v3, v9, Lo1/o;->h:J

    .line 545
    .line 546
    move-wide/from16 v31, v3

    .line 547
    .line 548
    iget-wide v3, v9, Lo1/o;->i:J

    .line 549
    .line 550
    move-wide/from16 v33, v3

    .line 551
    .line 552
    iget v3, v9, Lo1/o;->k:I

    .line 553
    .line 554
    move/from16 v36, v3

    .line 555
    .line 556
    iget-wide v3, v9, Lo1/o;->m:J

    .line 557
    .line 558
    move-wide/from16 v38, v3

    .line 559
    .line 560
    iget-wide v3, v9, Lo1/o;->o:J

    .line 561
    .line 562
    move-wide/from16 v42, v3

    .line 563
    .line 564
    iget-wide v3, v9, Lo1/o;->p:J

    .line 565
    .line 566
    move-wide/from16 v44, v3

    .line 567
    .line 568
    iget v3, v9, Lo1/o;->s:I

    .line 569
    .line 570
    iget v4, v9, Lo1/o;->t:I

    .line 571
    .line 572
    move/from16 v48, v3

    .line 573
    .line 574
    move/from16 v49, v4

    .line 575
    .line 576
    move-object/from16 v28, v5

    .line 577
    .line 578
    move-object/from16 v23, v7

    .line 579
    .line 580
    move/from16 v37, v8

    .line 581
    .line 582
    move-wide/from16 v29, v11

    .line 583
    .line 584
    invoke-direct/range {v22 .. v49}, Lo1/o;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lf1/g;Lf1/g;JJJLf1/d;IIJJJJZIII)V

    .line 585
    .line 586
    .line 587
    move-object/from16 v9, v22

    .line 588
    .line 589
    goto :goto_10

    .line 590
    :cond_16
    move-wide/from16 v20, v3

    .line 591
    .line 592
    :cond_17
    move-object/from16 v18, v5

    .line 593
    .line 594
    move-object/from16 v50, v7

    .line 595
    .line 596
    move/from16 v51, v8

    .line 597
    .line 598
    :goto_10
    iget-object v3, v10, Lo1/p;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 599
    .line 600
    invoke-virtual {v3}, LK0/m;->b()V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v3}, LK0/m;->c()V

    .line 604
    .line 605
    .line 606
    :try_start_2
    iget-object v4, v10, Lo1/p;->b:Lo1/b;

    .line 607
    .line 608
    invoke-virtual {v4, v9}, LK0/d;->h(Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v3}, LK0/m;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 612
    .line 613
    .line 614
    invoke-virtual {v3}, LK0/m;->j()V

    .line 615
    .line 616
    .line 617
    const-string v3, "id.toString()"

    .line 618
    .line 619
    iget-object v4, v6, Lf1/r;->a:Ljava/util/UUID;

    .line 620
    .line 621
    if-eqz v19, :cond_18

    .line 622
    .line 623
    array-length v5, v1

    .line 624
    const/4 v7, 0x0

    .line 625
    :goto_11
    if-ge v7, v5, :cond_18

    .line 626
    .line 627
    aget-object v8, v1, v7

    .line 628
    .line 629
    new-instance v9, Lo1/a;

    .line 630
    .line 631
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v10

    .line 635
    invoke-static {v10, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    invoke-direct {v9, v10, v8}, Lo1/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v16 .. v16}, Landroidx/work/impl/WorkDatabase;->q()Lo1/c;

    .line 642
    .line 643
    .line 644
    move-result-object v8

    .line 645
    iget-object v10, v8, Lo1/c;->t:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v10, Landroidx/work/impl/WorkDatabase_Impl;

    .line 648
    .line 649
    invoke-virtual {v10}, LK0/m;->b()V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v10}, LK0/m;->c()V

    .line 653
    .line 654
    .line 655
    :try_start_3
    iget-object v8, v8, Lo1/c;->u:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast v8, Lo1/b;

    .line 658
    .line 659
    invoke-virtual {v8, v9}, LK0/d;->h(Ljava/lang/Object;)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v10}, LK0/m;->o()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 663
    .line 664
    .line 665
    invoke-virtual {v10}, LK0/m;->j()V

    .line 666
    .line 667
    .line 668
    add-int/lit8 v7, v7, 0x1

    .line 669
    .line 670
    goto :goto_11

    .line 671
    :catchall_2
    move-exception v0

    .line 672
    invoke-virtual {v10}, LK0/m;->j()V

    .line 673
    .line 674
    .line 675
    throw v0

    .line 676
    :cond_18
    invoke-virtual/range {v16 .. v16}, Landroidx/work/impl/WorkDatabase;->w()Lo1/r;

    .line 677
    .line 678
    .line 679
    move-result-object v5

    .line 680
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v7

    .line 684
    invoke-static {v7, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    iget-object v6, v6, Lf1/r;->c:Ljava/util/Set;

    .line 691
    .line 692
    const-string v8, "tags"

    .line 693
    .line 694
    invoke-static {v6, v8}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 695
    .line 696
    .line 697
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 698
    .line 699
    .line 700
    move-result-object v6

    .line 701
    :goto_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 702
    .line 703
    .line 704
    move-result v8

    .line 705
    if-eqz v8, :cond_19

    .line 706
    .line 707
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v8

    .line 711
    check-cast v8, Ljava/lang/String;

    .line 712
    .line 713
    new-instance v9, Lo1/q;

    .line 714
    .line 715
    invoke-direct {v9, v8, v7}, Lo1/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 716
    .line 717
    .line 718
    iget-object v8, v5, Lo1/r;->t:Ljava/lang/Object;

    .line 719
    .line 720
    check-cast v8, Landroidx/work/impl/WorkDatabase_Impl;

    .line 721
    .line 722
    invoke-virtual {v8}, LK0/m;->b()V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v8}, LK0/m;->c()V

    .line 726
    .line 727
    .line 728
    :try_start_4
    iget-object v10, v5, Lo1/r;->u:Ljava/lang/Object;

    .line 729
    .line 730
    check-cast v10, Lo1/b;

    .line 731
    .line 732
    invoke-virtual {v10, v9}, LK0/d;->h(Ljava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v8}, LK0/m;->o()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 736
    .line 737
    .line 738
    invoke-virtual {v8}, LK0/m;->j()V

    .line 739
    .line 740
    .line 741
    goto :goto_12

    .line 742
    :catchall_3
    move-exception v0

    .line 743
    invoke-virtual {v8}, LK0/m;->j()V

    .line 744
    .line 745
    .line 746
    throw v0

    .line 747
    :cond_19
    if-nez v17, :cond_1a

    .line 748
    .line 749
    invoke-virtual/range {v16 .. v16}, Landroidx/work/impl/WorkDatabase;->t()Lo1/k;

    .line 750
    .line 751
    .line 752
    move-result-object v5

    .line 753
    new-instance v6, Lo1/j;

    .line 754
    .line 755
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v4

    .line 759
    invoke-static {v4, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    invoke-direct {v6, v2, v4}, Lo1/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 763
    .line 764
    .line 765
    iget-object v3, v5, Lo1/k;->s:Ljava/lang/Object;

    .line 766
    .line 767
    check-cast v3, Landroidx/work/impl/WorkDatabase_Impl;

    .line 768
    .line 769
    invoke-virtual {v3}, LK0/m;->b()V

    .line 770
    .line 771
    .line 772
    invoke-virtual {v3}, LK0/m;->c()V

    .line 773
    .line 774
    .line 775
    :try_start_5
    iget-object v4, v5, Lo1/k;->t:Ljava/lang/Object;

    .line 776
    .line 777
    check-cast v4, Lo1/b;

    .line 778
    .line 779
    invoke-virtual {v4, v6}, LK0/d;->h(Ljava/lang/Object;)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v3}, LK0/m;->o()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 783
    .line 784
    .line 785
    invoke-virtual {v3}, LK0/m;->j()V

    .line 786
    .line 787
    .line 788
    goto :goto_13

    .line 789
    :catchall_4
    move-exception v0

    .line 790
    invoke-virtual {v3}, LK0/m;->j()V

    .line 791
    .line 792
    .line 793
    throw v0

    .line 794
    :cond_1a
    :goto_13
    move-object/from16 v5, v18

    .line 795
    .line 796
    move-wide/from16 v3, v20

    .line 797
    .line 798
    move-object/from16 v7, v50

    .line 799
    .line 800
    move/from16 v8, v51

    .line 801
    .line 802
    goto/16 :goto_e

    .line 803
    .line 804
    :catchall_5
    move-exception v0

    .line 805
    invoke-virtual {v3}, LK0/m;->j()V

    .line 806
    .line 807
    .line 808
    throw v0

    .line 809
    :cond_1b
    move v2, v8

    .line 810
    goto/16 :goto_3

    .line 811
    .line 812
    :goto_14
    iput-boolean v8, v0, Lg1/j;->f:Z

    .line 813
    .line 814
    return v2
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


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lp1/d;->t:Lo1/r;

    .line 2
    .line 3
    iget-object v1, p0, Lp1/d;->s:Lg1/j;

    .line 4
    .line 5
    const-string v2, "WorkContinuation has cycles ("

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v3, Ljava/util/HashSet;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v4, v1, Lg1/j;->d:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-interface {v3, v4}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lg1/j;->t(Lg1/j;)Ljava/util/HashSet;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-eqz v6, :cond_1

    .line 33
    .line 34
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    check-cast v6, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_0

    .line 45
    .line 46
    const/4 v3, 0x1

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v4, v1, Lg1/j;->d:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-interface {v3, v4}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    :goto_0
    if-nez v3, :cond_3

    .line 55
    .line 56
    iget-object v2, v1, Lg1/j;->a:Lg1/o;

    .line 57
    .line 58
    :try_start_1
    iget-object v3, v2, Lg1/o;->c:Landroidx/work/impl/WorkDatabase;

    .line 59
    .line 60
    invoke-virtual {v3}, LK0/m;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    :try_start_2
    invoke-static {v1}, Lp1/d;->a(Lg1/j;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {v3}, LK0/m;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 68
    .line 69
    .line 70
    :try_start_3
    invoke-virtual {v3}, LK0/m;->j()V

    .line 71
    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    iget-object v1, v2, Lg1/o;->a:Landroid/content/Context;

    .line 76
    .line 77
    const-class v3, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    .line 78
    .line 79
    const/4 v4, 0x1

    .line 80
    invoke-static {v1, v3, v4}, Lp1/j;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 81
    .line 82
    .line 83
    iget-object v1, v2, Lg1/o;->b:Lf1/b;

    .line 84
    .line 85
    iget-object v3, v2, Lg1/o;->c:Landroidx/work/impl/WorkDatabase;

    .line 86
    .line 87
    iget-object v2, v2, Lg1/o;->e:Ljava/util/List;

    .line 88
    .line 89
    invoke-static {v1, v3, v2}, Lg1/h;->a(Lf1/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception v1

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    :goto_1
    sget-object v1, Lf1/v;->q:Lf1/u;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Lo1/r;->q(Lcom/bumptech/glide/d;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :catchall_1
    move-exception v1

    .line 102
    invoke-virtual {v3}, LK0/m;->j()V

    .line 103
    .line 104
    .line 105
    throw v1

    .line 106
    :cond_3
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    new-instance v4, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v1, ")"

    .line 117
    .line 118
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-direct {v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 129
    :goto_2
    new-instance v2, Lf1/s;

    .line 130
    .line 131
    invoke-direct {v2, v1}, Lf1/s;-><init>(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v2}, Lo1/r;->q(Lcom/bumptech/glide/d;)V

    .line 135
    .line 136
    .line 137
    return-void
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
