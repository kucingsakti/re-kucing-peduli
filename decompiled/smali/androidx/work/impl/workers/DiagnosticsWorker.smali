.class public final Landroidx/work/impl/workers/DiagnosticsWorker;
.super Landroidx/work/Worker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/work/impl/workers/DiagnosticsWorker;",
        "Landroidx/work/Worker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "parameters",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "parameters"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 12
    .line 13
    .line 14
    return-void
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
.method public final a()Lf1/n;
    .locals 75

    .line 1
    invoke-virtual/range {p0 .. p0}, Lf1/p;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lg1/o;->b(Landroid/content/Context;)Lg1/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Lg1/o;->c:Landroidx/work/impl/WorkDatabase;

    .line 10
    .line 11
    const-string v1, "workManager.workDatabase"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->v()Lo1/p;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->t()Lo1/k;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->w()Lo1/r;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->s()Lo1/h;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 33
    .line 34
    .line 35
    move-result-wide v4

    .line 36
    sget-object v6, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 37
    .line 38
    const-wide/16 v7, 0x1

    .line 39
    .line 40
    invoke-virtual {v6, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v6

    .line 44
    sub-long/2addr v4, v6

    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const-string v6, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC"

    .line 49
    .line 50
    const/4 v7, 0x1

    .line 51
    invoke-static {v7, v6}, LK0/o;->c(ILjava/lang/String;)LK0/o;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v6, v7, v4, v5}, LK0/o;->I(IJ)V

    .line 56
    .line 57
    .line 58
    iget-object v4, v1, Lo1/p;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 59
    .line 60
    invoke-virtual {v4}, LK0/m;->b()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v6}, LK0/m;->m(LO0/e;)Landroid/database/Cursor;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    :try_start_0
    const-string v5, "id"

    .line 68
    .line 69
    invoke-static {v4, v5}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    const-string v8, "state"

    .line 74
    .line 75
    invoke-static {v4, v8}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    const-string v9, "worker_class_name"

    .line 80
    .line 81
    invoke-static {v4, v9}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    const-string v10, "input_merger_class_name"

    .line 86
    .line 87
    invoke-static {v4, v10}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    const-string v11, "input"

    .line 92
    .line 93
    invoke-static {v4, v11}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    const-string v12, "output"

    .line 98
    .line 99
    invoke-static {v4, v12}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    const-string v13, "initial_delay"

    .line 104
    .line 105
    invoke-static {v4, v13}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    const-string v14, "interval_duration"

    .line 110
    .line 111
    invoke-static {v4, v14}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    const-string v15, "flex_duration"

    .line 116
    .line 117
    invoke-static {v4, v15}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    const-string v7, "run_attempt_count"

    .line 122
    .line 123
    invoke-static {v4, v7}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    move-object/from16 v16, v1

    .line 128
    .line 129
    const-string v1, "backoff_policy"

    .line 130
    .line 131
    invoke-static {v4, v1}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 135
    move-object/from16 v17, v6

    .line 136
    .line 137
    :try_start_1
    const-string v6, "backoff_delay_duration"

    .line 138
    .line 139
    invoke-static {v4, v6}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    move-object/from16 v18, v0

    .line 144
    .line 145
    const-string v0, "last_enqueue_time"

    .line 146
    .line 147
    invoke-static {v4, v0}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    move-object/from16 v19, v2

    .line 152
    .line 153
    const-string v2, "minimum_retention_duration"

    .line 154
    .line 155
    invoke-static {v4, v2}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    move-object/from16 v20, v3

    .line 160
    .line 161
    const-string v3, "schedule_requested_at"

    .line 162
    .line 163
    invoke-static {v4, v3}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    move/from16 v21, v3

    .line 168
    .line 169
    const-string v3, "run_in_foreground"

    .line 170
    .line 171
    invoke-static {v4, v3}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    move/from16 v22, v3

    .line 176
    .line 177
    const-string v3, "out_of_quota_policy"

    .line 178
    .line 179
    invoke-static {v4, v3}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    move/from16 v23, v3

    .line 184
    .line 185
    const-string v3, "period_count"

    .line 186
    .line 187
    invoke-static {v4, v3}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    move/from16 v24, v3

    .line 192
    .line 193
    const-string v3, "generation"

    .line 194
    .line 195
    invoke-static {v4, v3}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    move/from16 v25, v3

    .line 200
    .line 201
    const-string v3, "required_network_type"

    .line 202
    .line 203
    invoke-static {v4, v3}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    move/from16 v26, v3

    .line 208
    .line 209
    const-string v3, "requires_charging"

    .line 210
    .line 211
    invoke-static {v4, v3}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    move/from16 v27, v3

    .line 216
    .line 217
    const-string v3, "requires_device_idle"

    .line 218
    .line 219
    invoke-static {v4, v3}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    move/from16 v28, v3

    .line 224
    .line 225
    const-string v3, "requires_battery_not_low"

    .line 226
    .line 227
    invoke-static {v4, v3}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    move/from16 v29, v3

    .line 232
    .line 233
    const-string v3, "requires_storage_not_low"

    .line 234
    .line 235
    invoke-static {v4, v3}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    move/from16 v30, v3

    .line 240
    .line 241
    const-string v3, "trigger_content_update_delay"

    .line 242
    .line 243
    invoke-static {v4, v3}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    move/from16 v31, v3

    .line 248
    .line 249
    const-string v3, "trigger_max_content_delay"

    .line 250
    .line 251
    invoke-static {v4, v3}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    move/from16 v32, v3

    .line 256
    .line 257
    const-string v3, "content_uri_triggers"

    .line 258
    .line 259
    invoke-static {v4, v3}, LQ3/u0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    move/from16 v33, v3

    .line 264
    .line 265
    new-instance v3, Ljava/util/ArrayList;

    .line 266
    .line 267
    move/from16 v34, v2

    .line 268
    .line 269
    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 274
    .line 275
    .line 276
    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    if-eqz v2, :cond_b

    .line 281
    .line 282
    invoke-interface {v4, v5}, Landroid/database/Cursor;->isNull(I)Z

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    const/16 v35, 0x0

    .line 287
    .line 288
    if-eqz v2, :cond_0

    .line 289
    .line 290
    move-object/from16 v37, v35

    .line 291
    .line 292
    goto :goto_1

    .line 293
    :cond_0
    invoke-interface {v4, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    move-object/from16 v37, v2

    .line 298
    .line 299
    :goto_1
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    invoke-static {v2}, LC3/b;->H(I)I

    .line 304
    .line 305
    .line 306
    move-result v38

    .line 307
    invoke-interface {v4, v9}, Landroid/database/Cursor;->isNull(I)Z

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    if-eqz v2, :cond_1

    .line 312
    .line 313
    move-object/from16 v39, v35

    .line 314
    .line 315
    goto :goto_2

    .line 316
    :cond_1
    invoke-interface {v4, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    move-object/from16 v39, v2

    .line 321
    .line 322
    :goto_2
    invoke-interface {v4, v10}, Landroid/database/Cursor;->isNull(I)Z

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    if-eqz v2, :cond_2

    .line 327
    .line 328
    move-object/from16 v40, v35

    .line 329
    .line 330
    goto :goto_3

    .line 331
    :cond_2
    invoke-interface {v4, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    move-object/from16 v40, v2

    .line 336
    .line 337
    :goto_3
    invoke-interface {v4, v11}, Landroid/database/Cursor;->isNull(I)Z

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    if-eqz v2, :cond_3

    .line 342
    .line 343
    move-object/from16 v2, v35

    .line 344
    .line 345
    goto :goto_4

    .line 346
    :cond_3
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    :goto_4
    invoke-static {v2}, Lf1/g;->a([B)Lf1/g;

    .line 351
    .line 352
    .line 353
    move-result-object v41

    .line 354
    invoke-interface {v4, v12}, Landroid/database/Cursor;->isNull(I)Z

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    if-eqz v2, :cond_4

    .line 359
    .line 360
    move-object/from16 v2, v35

    .line 361
    .line 362
    goto :goto_5

    .line 363
    :cond_4
    invoke-interface {v4, v12}, Landroid/database/Cursor;->getBlob(I)[B

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    :goto_5
    invoke-static {v2}, Lf1/g;->a([B)Lf1/g;

    .line 368
    .line 369
    .line 370
    move-result-object v42

    .line 371
    invoke-interface {v4, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 372
    .line 373
    .line 374
    move-result-wide v43

    .line 375
    invoke-interface {v4, v14}, Landroid/database/Cursor;->getLong(I)J

    .line 376
    .line 377
    .line 378
    move-result-wide v45

    .line 379
    invoke-interface {v4, v15}, Landroid/database/Cursor;->getLong(I)J

    .line 380
    .line 381
    .line 382
    move-result-wide v47

    .line 383
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 384
    .line 385
    .line 386
    move-result v50

    .line 387
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    invoke-static {v2}, LC3/b;->E(I)I

    .line 392
    .line 393
    .line 394
    move-result v51

    .line 395
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 396
    .line 397
    .line 398
    move-result-wide v52

    .line 399
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 400
    .line 401
    .line 402
    move-result-wide v54

    .line 403
    move/from16 v2, v34

    .line 404
    .line 405
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 406
    .line 407
    .line 408
    move-result-wide v56

    .line 409
    move/from16 v34, v0

    .line 410
    .line 411
    move/from16 v0, v21

    .line 412
    .line 413
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 414
    .line 415
    .line 416
    move-result-wide v58

    .line 417
    move/from16 v21, v0

    .line 418
    .line 419
    move/from16 v0, v22

    .line 420
    .line 421
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 422
    .line 423
    .line 424
    move-result v22

    .line 425
    const/16 v36, 0x0

    .line 426
    .line 427
    if-eqz v22, :cond_5

    .line 428
    .line 429
    const/16 v60, 0x1

    .line 430
    .line 431
    :goto_6
    move/from16 v22, v0

    .line 432
    .line 433
    move/from16 v0, v23

    .line 434
    .line 435
    goto :goto_7

    .line 436
    :cond_5
    move/from16 v60, v36

    .line 437
    .line 438
    goto :goto_6

    .line 439
    :goto_7
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 440
    .line 441
    .line 442
    move-result v23

    .line 443
    invoke-static/range {v23 .. v23}, LC3/b;->G(I)I

    .line 444
    .line 445
    .line 446
    move-result v61

    .line 447
    move/from16 v23, v0

    .line 448
    .line 449
    move/from16 v0, v24

    .line 450
    .line 451
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 452
    .line 453
    .line 454
    move-result v62

    .line 455
    move/from16 v24, v0

    .line 456
    .line 457
    move/from16 v0, v25

    .line 458
    .line 459
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 460
    .line 461
    .line 462
    move-result v63

    .line 463
    move/from16 v25, v0

    .line 464
    .line 465
    move/from16 v0, v26

    .line 466
    .line 467
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 468
    .line 469
    .line 470
    move-result v26

    .line 471
    invoke-static/range {v26 .. v26}, LC3/b;->F(I)I

    .line 472
    .line 473
    .line 474
    move-result v65

    .line 475
    move/from16 v26, v0

    .line 476
    .line 477
    move/from16 v0, v27

    .line 478
    .line 479
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 480
    .line 481
    .line 482
    move-result v27

    .line 483
    if-eqz v27, :cond_6

    .line 484
    .line 485
    const/16 v66, 0x1

    .line 486
    .line 487
    :goto_8
    move/from16 v27, v0

    .line 488
    .line 489
    move/from16 v0, v28

    .line 490
    .line 491
    goto :goto_9

    .line 492
    :cond_6
    move/from16 v66, v36

    .line 493
    .line 494
    goto :goto_8

    .line 495
    :goto_9
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 496
    .line 497
    .line 498
    move-result v28

    .line 499
    if-eqz v28, :cond_7

    .line 500
    .line 501
    const/16 v67, 0x1

    .line 502
    .line 503
    :goto_a
    move/from16 v28, v0

    .line 504
    .line 505
    move/from16 v0, v29

    .line 506
    .line 507
    goto :goto_b

    .line 508
    :cond_7
    move/from16 v67, v36

    .line 509
    .line 510
    goto :goto_a

    .line 511
    :goto_b
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 512
    .line 513
    .line 514
    move-result v29

    .line 515
    if-eqz v29, :cond_8

    .line 516
    .line 517
    const/16 v68, 0x1

    .line 518
    .line 519
    :goto_c
    move/from16 v29, v0

    .line 520
    .line 521
    move/from16 v0, v30

    .line 522
    .line 523
    goto :goto_d

    .line 524
    :cond_8
    move/from16 v68, v36

    .line 525
    .line 526
    goto :goto_c

    .line 527
    :goto_d
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 528
    .line 529
    .line 530
    move-result v30

    .line 531
    if-eqz v30, :cond_9

    .line 532
    .line 533
    const/16 v69, 0x1

    .line 534
    .line 535
    :goto_e
    move/from16 v30, v0

    .line 536
    .line 537
    move/from16 v0, v31

    .line 538
    .line 539
    goto :goto_f

    .line 540
    :cond_9
    move/from16 v69, v36

    .line 541
    .line 542
    goto :goto_e

    .line 543
    :goto_f
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 544
    .line 545
    .line 546
    move-result-wide v70

    .line 547
    move/from16 v31, v0

    .line 548
    .line 549
    move/from16 v0, v32

    .line 550
    .line 551
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 552
    .line 553
    .line 554
    move-result-wide v72

    .line 555
    move/from16 v32, v0

    .line 556
    .line 557
    move/from16 v0, v33

    .line 558
    .line 559
    invoke-interface {v4, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 560
    .line 561
    .line 562
    move-result v33

    .line 563
    if-eqz v33, :cond_a

    .line 564
    .line 565
    goto :goto_10

    .line 566
    :cond_a
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 567
    .line 568
    .line 569
    move-result-object v35

    .line 570
    :goto_10
    invoke-static/range {v35 .. v35}, LC3/b;->b([B)Ljava/util/LinkedHashSet;

    .line 571
    .line 572
    .line 573
    move-result-object v74

    .line 574
    new-instance v64, Lf1/d;

    .line 575
    .line 576
    invoke-direct/range {v64 .. v74}, Lf1/d;-><init>(IZZZZJJLjava/util/Set;)V

    .line 577
    .line 578
    .line 579
    new-instance v36, Lo1/o;

    .line 580
    .line 581
    move-object/from16 v49, v64

    .line 582
    .line 583
    invoke-direct/range {v36 .. v63}, Lo1/o;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lf1/g;Lf1/g;JJJLf1/d;IIJJJJZIII)V

    .line 584
    .line 585
    .line 586
    move/from16 v33, v0

    .line 587
    .line 588
    move-object/from16 v0, v36

    .line 589
    .line 590
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 591
    .line 592
    .line 593
    move/from16 v0, v34

    .line 594
    .line 595
    move/from16 v34, v2

    .line 596
    .line 597
    goto/16 :goto_0

    .line 598
    .line 599
    :catchall_0
    move-exception v0

    .line 600
    goto/16 :goto_12

    .line 601
    .line 602
    :cond_b
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v17 .. v17}, LK0/o;->g()V

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {v16 .. v16}, Lo1/p;->c()Ljava/util/ArrayList;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    invoke-virtual/range {v16 .. v16}, Lo1/p;->a()Ljava/util/ArrayList;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 617
    .line 618
    .line 619
    move-result v2

    .line 620
    if-nez v2, :cond_c

    .line 621
    .line 622
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    sget-object v4, Ls1/b;->a:Ljava/lang/String;

    .line 627
    .line 628
    const-string v5, "Recently completed work:\n\n"

    .line 629
    .line 630
    invoke-virtual {v2, v4, v5}, Lf1/q;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    move-object/from16 v7, v18

    .line 638
    .line 639
    move-object/from16 v5, v19

    .line 640
    .line 641
    move-object/from16 v6, v20

    .line 642
    .line 643
    invoke-static {v5, v6, v7, v3}, Ls1/b;->a(Lo1/k;Lo1/r;Lo1/h;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v3

    .line 647
    invoke-virtual {v2, v4, v3}, Lf1/q;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    goto :goto_11

    .line 651
    :cond_c
    move-object/from16 v7, v18

    .line 652
    .line 653
    move-object/from16 v5, v19

    .line 654
    .line 655
    move-object/from16 v6, v20

    .line 656
    .line 657
    :goto_11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 658
    .line 659
    .line 660
    move-result v2

    .line 661
    if-nez v2, :cond_d

    .line 662
    .line 663
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    sget-object v3, Ls1/b;->a:Ljava/lang/String;

    .line 668
    .line 669
    const-string v4, "Running work:\n\n"

    .line 670
    .line 671
    invoke-virtual {v2, v3, v4}, Lf1/q;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    invoke-static {v5, v6, v7, v0}, Ls1/b;->a(Lo1/k;Lo1/r;Lo1/h;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-virtual {v2, v3, v0}, Lf1/q;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 683
    .line 684
    .line 685
    :cond_d
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 686
    .line 687
    .line 688
    move-result v0

    .line 689
    if-nez v0, :cond_e

    .line 690
    .line 691
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    sget-object v2, Ls1/b;->a:Ljava/lang/String;

    .line 696
    .line 697
    const-string v3, "Enqueued work:\n\n"

    .line 698
    .line 699
    invoke-virtual {v0, v2, v3}, Lf1/q;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    invoke-static {v5, v6, v7, v1}, Ls1/b;->a(Lo1/k;Lo1/r;Lo1/h;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v1

    .line 710
    invoke-virtual {v0, v2, v1}, Lf1/q;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 711
    .line 712
    .line 713
    :cond_e
    invoke-static {}, Lf1/o;->a()Lf1/n;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    return-object v0

    .line 718
    :catchall_1
    move-exception v0

    .line 719
    move-object/from16 v17, v6

    .line 720
    .line 721
    :goto_12
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 722
    .line 723
    .line 724
    invoke-virtual/range {v17 .. v17}, LK0/o;->g()V

    .line 725
    .line 726
    .line 727
    throw v0
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
