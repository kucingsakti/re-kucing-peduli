.class public final LZ1/a;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LZ1/a;->s:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    const-string v0, "/proc/cpuinfo"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    move-object/from16 v5, p0

    .line 9
    .line 10
    iget v6, v5, LZ1/a;->s:I

    .line 11
    .line 12
    packed-switch v6, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance v6, Ljava/io/File;

    .line 16
    .line 17
    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v6}, Ls8/h;->D(Ljava/io/File;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v1}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    check-cast v6, Ljava/util/Collection;

    .line 29
    .line 30
    invoke-static {v0}, LL9/f;->T(Ljava/lang/String;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/lang/Iterable;

    .line 35
    .line 36
    invoke-static {v6, v0}, Li8/k;->g0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v1}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    check-cast v6, Ljava/lang/Iterable;

    .line 45
    .line 46
    invoke-static {v0, v6}, Li8/k;->g0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v6, Ljava/util/ArrayList;

    .line 51
    .line 52
    const/16 v7, 0xa

    .line 53
    .line 54
    invoke-static {v0, v7}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    move v9, v3

    .line 66
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v10

    .line 70
    const/4 v11, 0x0

    .line 71
    if-eqz v10, :cond_1

    .line 72
    .line 73
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    add-int/lit8 v12, v9, 0x1

    .line 78
    .line 79
    if-ltz v9, :cond_0

    .line 80
    .line 81
    check-cast v10, Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    new-instance v11, Lh8/f;

    .line 88
    .line 89
    invoke-direct {v11, v10, v9}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move v9, v12

    .line 96
    goto :goto_0

    .line 97
    :cond_0
    invoke-static {}, Li8/l;->G()V

    .line 98
    .line 99
    .line 100
    throw v11

    .line 101
    :cond_1
    sget-object v8, Le2/a;->s:Le2/a;

    .line 102
    .line 103
    invoke-static {v6, v8}, Li8/k;->x0(Ljava/util/ArrayList;Lu8/b;)Ljava/util/ArrayList;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-static {v6}, Li8/k;->R(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    new-instance v8, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    move v9, v3

    .line 121
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    if-eqz v10, :cond_4

    .line 126
    .line 127
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v10

    .line 131
    add-int/lit8 v12, v9, 0x1

    .line 132
    .line 133
    if-ltz v9, :cond_3

    .line 134
    .line 135
    move-object v13, v10

    .line 136
    check-cast v13, Ljava/lang/String;

    .line 137
    .line 138
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-nez v9, :cond_2

    .line 147
    .line 148
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    :cond_2
    move v9, v12

    .line 152
    goto :goto_1

    .line 153
    :cond_3
    invoke-static {}, Li8/l;->G()V

    .line 154
    .line 155
    .line 156
    throw v11

    .line 157
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-static {v8, v7}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    move v9, v3

    .line 171
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    if-eqz v10, :cond_7

    .line 176
    .line 177
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v10

    .line 181
    add-int/lit8 v12, v9, 0x1

    .line 182
    .line 183
    if-ltz v9, :cond_6

    .line 184
    .line 185
    check-cast v10, Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    invoke-static {v10}, LL9/n;->D(Ljava/lang/CharSequence;)Z

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    if-eqz v10, :cond_5

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_5
    move-object v9, v11

    .line 199
    :goto_3
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move v9, v12

    .line 203
    goto :goto_2

    .line 204
    :cond_6
    invoke-static {}, Li8/l;->G()V

    .line 205
    .line 206
    .line 207
    throw v11

    .line 208
    :cond_7
    invoke-static {v0}, Li8/k;->R(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    new-instance v6, Le2/b;

    .line 213
    .line 214
    invoke-direct {v6, v8, v3}, Le2/b;-><init>(Ljava/lang/Object;I)V

    .line 215
    .line 216
    .line 217
    invoke-static {v0, v6}, Li8/k;->x0(Ljava/util/ArrayList;Lu8/b;)Ljava/util/ArrayList;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    new-instance v6, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-static {v0, v7}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v8

    .line 238
    if-eqz v8, :cond_11

    .line 239
    .line 240
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    check-cast v8, Ljava/util/List;

    .line 245
    .line 246
    check-cast v8, Ljava/lang/Iterable;

    .line 247
    .line 248
    new-instance v9, Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    :cond_8
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v10

    .line 261
    if-eqz v10, :cond_10

    .line 262
    .line 263
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v10

    .line 267
    check-cast v10, Ljava/lang/String;

    .line 268
    .line 269
    const-string v12, ":"

    .line 270
    .line 271
    filled-new-array {v12}, [Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v12

    .line 275
    const/4 v13, 0x2

    .line 276
    invoke-static {v10, v12, v13}, LL9/f;->a0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object v10

    .line 280
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 281
    .line 282
    .line 283
    move-result v12

    .line 284
    if-ne v12, v13, :cond_9

    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_9
    move-object v10, v11

    .line 288
    :goto_6
    if-eqz v10, :cond_f

    .line 289
    .line 290
    check-cast v10, Ljava/lang/Iterable;

    .line 291
    .line 292
    new-instance v12, Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-static {v10, v7}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 295
    .line 296
    .line 297
    move-result v13

    .line 298
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 299
    .line 300
    .line 301
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object v10

    .line 305
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    .line 307
    .line 308
    move-result v13

    .line 309
    if-eqz v13, :cond_e

    .line 310
    .line 311
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v13

    .line 315
    check-cast v13, Ljava/lang/String;

    .line 316
    .line 317
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 318
    .line 319
    .line 320
    move-result v14

    .line 321
    move v15, v3

    .line 322
    :goto_8
    if-ge v15, v14, :cond_b

    .line 323
    .line 324
    invoke-virtual {v13, v15}, Ljava/lang/String;->charAt(I)C

    .line 325
    .line 326
    .line 327
    move-result v16

    .line 328
    invoke-static/range {v16 .. v16}, LD3/b;->q(C)Z

    .line 329
    .line 330
    .line 331
    move-result v16

    .line 332
    if-nez v16, :cond_a

    .line 333
    .line 334
    invoke-virtual {v13, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v13

    .line 338
    const-string v14, "this as java.lang.String).substring(startIndex)"

    .line 339
    .line 340
    invoke-static {v13, v14}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    goto :goto_9

    .line 344
    :cond_a
    add-int/2addr v15, v4

    .line 345
    goto :goto_8

    .line 346
    :cond_b
    move-object v13, v1

    .line 347
    :goto_9
    invoke-static {v13}, LL9/f;->L(Ljava/lang/CharSequence;)I

    .line 348
    .line 349
    .line 350
    move-result v14

    .line 351
    :goto_a
    if-ge v2, v14, :cond_d

    .line 352
    .line 353
    invoke-virtual {v13, v14}, Ljava/lang/String;->charAt(I)C

    .line 354
    .line 355
    .line 356
    move-result v15

    .line 357
    invoke-static {v15}, LD3/b;->q(C)Z

    .line 358
    .line 359
    .line 360
    move-result v15

    .line 361
    if-nez v15, :cond_c

    .line 362
    .line 363
    add-int/2addr v14, v4

    .line 364
    invoke-virtual {v13, v3, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v13

    .line 368
    const-string v14, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 369
    .line 370
    invoke-static {v13, v14}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    goto :goto_b

    .line 374
    :cond_c
    add-int/2addr v14, v2

    .line 375
    goto :goto_a

    .line 376
    :cond_d
    move-object v13, v1

    .line 377
    :goto_b
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    goto :goto_7

    .line 381
    :cond_e
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v10

    .line 385
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v12

    .line 389
    new-instance v13, Lh8/f;

    .line 390
    .line 391
    invoke-direct {v13, v10, v12}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    goto :goto_c

    .line 395
    :cond_f
    move-object v13, v11

    .line 396
    :goto_c
    if-eqz v13, :cond_8

    .line 397
    .line 398
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    goto/16 :goto_5

    .line 402
    .line 403
    :cond_10
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    goto/16 :goto_4

    .line 407
    .line 408
    :cond_11
    new-instance v0, Ljava/util/ArrayList;

    .line 409
    .line 410
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    :cond_12
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    if-eqz v2, :cond_13

    .line 422
    .line 423
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    move-object v6, v2

    .line 428
    check-cast v6, Ljava/util/List;

    .line 429
    .line 430
    check-cast v6, Ljava/util/Collection;

    .line 431
    .line 432
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 433
    .line 434
    .line 435
    move-result v6

    .line 436
    if-nez v6, :cond_12

    .line 437
    .line 438
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    goto :goto_d

    .line 442
    :cond_13
    new-instance v1, Ljava/util/ArrayList;

    .line 443
    .line 444
    invoke-static {v0, v7}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 456
    .line 457
    .line 458
    move-result v6

    .line 459
    if-eqz v6, :cond_17

    .line 460
    .line 461
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v6

    .line 465
    check-cast v6, Ljava/util/List;

    .line 466
    .line 467
    check-cast v6, Ljava/lang/Iterable;

    .line 468
    .line 469
    new-instance v8, Ljava/util/ArrayList;

    .line 470
    .line 471
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 472
    .line 473
    .line 474
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 475
    .line 476
    .line 477
    move-result-object v6

    .line 478
    move v9, v3

    .line 479
    :cond_14
    :goto_f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 480
    .line 481
    .line 482
    move-result v10

    .line 483
    if-eqz v10, :cond_16

    .line 484
    .line 485
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v10

    .line 489
    if-eqz v9, :cond_15

    .line 490
    .line 491
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    goto :goto_f

    .line 495
    :cond_15
    move-object v11, v10

    .line 496
    check-cast v11, Lh8/f;

    .line 497
    .line 498
    invoke-static {v11}, Lcom/bumptech/glide/c;->k(Lh8/f;)Z

    .line 499
    .line 500
    .line 501
    move-result v11

    .line 502
    if-eqz v11, :cond_14

    .line 503
    .line 504
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move v9, v4

    .line 508
    goto :goto_f

    .line 509
    :cond_16
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    goto :goto_e

    .line 513
    :cond_17
    new-instance v2, Ljava/util/ArrayList;

    .line 514
    .line 515
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    :cond_18
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 523
    .line 524
    .line 525
    move-result v3

    .line 526
    if-eqz v3, :cond_19

    .line 527
    .line 528
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    move-object v4, v3

    .line 533
    check-cast v4, Ljava/util/List;

    .line 534
    .line 535
    check-cast v4, Ljava/util/Collection;

    .line 536
    .line 537
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 538
    .line 539
    .line 540
    move-result v4

    .line 541
    if-nez v4, :cond_18

    .line 542
    .line 543
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    goto :goto_10

    .line 547
    :cond_19
    new-instance v1, Ljava/util/ArrayList;

    .line 548
    .line 549
    invoke-static {v2, v7}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 550
    .line 551
    .line 552
    move-result v3

    .line 553
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 561
    .line 562
    .line 563
    move-result v3

    .line 564
    if-eqz v3, :cond_1c

    .line 565
    .line 566
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v3

    .line 570
    check-cast v3, Ljava/util/List;

    .line 571
    .line 572
    check-cast v3, Ljava/lang/Iterable;

    .line 573
    .line 574
    new-instance v4, Ljava/util/ArrayList;

    .line 575
    .line 576
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 577
    .line 578
    .line 579
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 580
    .line 581
    .line 582
    move-result-object v3

    .line 583
    :cond_1a
    :goto_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 584
    .line 585
    .line 586
    move-result v6

    .line 587
    if-eqz v6, :cond_1b

    .line 588
    .line 589
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v6

    .line 593
    move-object v8, v6

    .line 594
    check-cast v8, Lh8/f;

    .line 595
    .line 596
    invoke-static {v8}, Lcom/bumptech/glide/c;->k(Lh8/f;)Z

    .line 597
    .line 598
    .line 599
    move-result v8

    .line 600
    if-nez v8, :cond_1a

    .line 601
    .line 602
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    goto :goto_12

    .line 606
    :cond_1b
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    goto :goto_11

    .line 610
    :cond_1c
    new-instance v2, Ljava/util/ArrayList;

    .line 611
    .line 612
    invoke-static {v0, v7}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 613
    .line 614
    .line 615
    move-result v3

    .line 616
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 624
    .line 625
    .line 626
    move-result v3

    .line 627
    if-eqz v3, :cond_1f

    .line 628
    .line 629
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v3

    .line 633
    check-cast v3, Ljava/util/List;

    .line 634
    .line 635
    check-cast v3, Ljava/lang/Iterable;

    .line 636
    .line 637
    new-instance v4, Ljava/util/ArrayList;

    .line 638
    .line 639
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 640
    .line 641
    .line 642
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 643
    .line 644
    .line 645
    move-result-object v3

    .line 646
    :goto_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 647
    .line 648
    .line 649
    move-result v6

    .line 650
    if-eqz v6, :cond_1e

    .line 651
    .line 652
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v6

    .line 656
    move-object v7, v6

    .line 657
    check-cast v7, Lh8/f;

    .line 658
    .line 659
    invoke-static {v7}, Lcom/bumptech/glide/c;->k(Lh8/f;)Z

    .line 660
    .line 661
    .line 662
    move-result v7

    .line 663
    if-eqz v7, :cond_1d

    .line 664
    .line 665
    goto :goto_15

    .line 666
    :cond_1d
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    goto :goto_14

    .line 670
    :cond_1e
    :goto_15
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    goto :goto_13

    .line 674
    :cond_1f
    new-instance v0, Ljava/util/ArrayList;

    .line 675
    .line 676
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    :cond_20
    :goto_16
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 684
    .line 685
    .line 686
    move-result v3

    .line 687
    if-eqz v3, :cond_21

    .line 688
    .line 689
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v3

    .line 693
    move-object v4, v3

    .line 694
    check-cast v4, Ljava/util/List;

    .line 695
    .line 696
    check-cast v4, Ljava/util/Collection;

    .line 697
    .line 698
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 699
    .line 700
    .line 701
    move-result v4

    .line 702
    if-nez v4, :cond_20

    .line 703
    .line 704
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    goto :goto_16

    .line 708
    :cond_21
    new-instance v2, Ljava/util/ArrayList;

    .line 709
    .line 710
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 718
    .line 719
    .line 720
    move-result v3

    .line 721
    if-eqz v3, :cond_22

    .line 722
    .line 723
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v3

    .line 727
    check-cast v3, Ljava/lang/Iterable;

    .line 728
    .line 729
    invoke-static {v2, v3}, Li8/q;->J(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 730
    .line 731
    .line 732
    goto :goto_17

    .line 733
    :cond_22
    new-instance v0, Lc2/c;

    .line 734
    .line 735
    invoke-direct {v0, v2, v1}, Lc2/c;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 736
    .line 737
    .line 738
    return-object v0

    .line 739
    :pswitch_0
    new-instance v1, Ljava/util/HashMap;

    .line 740
    .line 741
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 742
    .line 743
    .line 744
    new-instance v6, Ljava/util/Scanner;

    .line 745
    .line 746
    new-instance v7, Ljava/io/File;

    .line 747
    .line 748
    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 749
    .line 750
    .line 751
    invoke-direct {v6, v7}, Ljava/util/Scanner;-><init>(Ljava/io/File;)V

    .line 752
    .line 753
    .line 754
    :cond_23
    :goto_18
    invoke-virtual {v6}, Ljava/util/Scanner;->hasNextLine()Z

    .line 755
    .line 756
    .line 757
    move-result v0

    .line 758
    if-eqz v0, :cond_30

    .line 759
    .line 760
    invoke-virtual {v6}, Ljava/util/Scanner;->nextLine()Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    const-string v7, "s.nextLine()"

    .line 765
    .line 766
    invoke-static {v0, v7}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 767
    .line 768
    .line 769
    const-string v7, ": "

    .line 770
    .line 771
    filled-new-array {v7}, [Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v7

    .line 775
    const/4 v8, 0x6

    .line 776
    invoke-static {v0, v7, v8}, LL9/f;->a0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 781
    .line 782
    .line 783
    move-result v7

    .line 784
    if-le v7, v4, :cond_23

    .line 785
    .line 786
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v7

    .line 790
    check-cast v7, Ljava/lang/String;

    .line 791
    .line 792
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 793
    .line 794
    .line 795
    move-result v8

    .line 796
    sub-int/2addr v8, v4

    .line 797
    move v9, v3

    .line 798
    move v10, v9

    .line 799
    :goto_19
    const/16 v11, 0x20

    .line 800
    .line 801
    if-gt v9, v8, :cond_29

    .line 802
    .line 803
    if-nez v10, :cond_24

    .line 804
    .line 805
    move v12, v9

    .line 806
    goto :goto_1a

    .line 807
    :cond_24
    move v12, v8

    .line 808
    :goto_1a
    invoke-virtual {v7, v12}, Ljava/lang/String;->charAt(I)C

    .line 809
    .line 810
    .line 811
    move-result v12

    .line 812
    invoke-static {v12, v11}, Lv8/i;->h(II)I

    .line 813
    .line 814
    .line 815
    move-result v12

    .line 816
    if-gtz v12, :cond_25

    .line 817
    .line 818
    move v12, v4

    .line 819
    goto :goto_1b

    .line 820
    :cond_25
    move v12, v3

    .line 821
    :goto_1b
    if-nez v10, :cond_27

    .line 822
    .line 823
    if-nez v12, :cond_26

    .line 824
    .line 825
    move v10, v4

    .line 826
    goto :goto_19

    .line 827
    :cond_26
    add-int/2addr v9, v4

    .line 828
    goto :goto_19

    .line 829
    :cond_27
    if-nez v12, :cond_28

    .line 830
    .line 831
    goto :goto_1c

    .line 832
    :cond_28
    add-int/2addr v8, v2

    .line 833
    goto :goto_19

    .line 834
    :cond_29
    :goto_1c
    add-int/2addr v8, v4

    .line 835
    invoke-virtual {v7, v9, v8}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 836
    .line 837
    .line 838
    move-result-object v7

    .line 839
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object v7

    .line 843
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    check-cast v0, Ljava/lang/String;

    .line 848
    .line 849
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 850
    .line 851
    .line 852
    move-result v8

    .line 853
    sub-int/2addr v8, v4

    .line 854
    move v9, v3

    .line 855
    move v10, v9

    .line 856
    :goto_1d
    if-gt v9, v8, :cond_2f

    .line 857
    .line 858
    if-nez v10, :cond_2a

    .line 859
    .line 860
    move v12, v9

    .line 861
    goto :goto_1e

    .line 862
    :cond_2a
    move v12, v8

    .line 863
    :goto_1e
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    .line 864
    .line 865
    .line 866
    move-result v12

    .line 867
    invoke-static {v12, v11}, Lv8/i;->h(II)I

    .line 868
    .line 869
    .line 870
    move-result v12

    .line 871
    if-gtz v12, :cond_2b

    .line 872
    .line 873
    move v12, v4

    .line 874
    goto :goto_1f

    .line 875
    :cond_2b
    move v12, v3

    .line 876
    :goto_1f
    if-nez v10, :cond_2d

    .line 877
    .line 878
    if-nez v12, :cond_2c

    .line 879
    .line 880
    move v10, v4

    .line 881
    goto :goto_1d

    .line 882
    :cond_2c
    add-int/2addr v9, v4

    .line 883
    goto :goto_1d

    .line 884
    :cond_2d
    if-nez v12, :cond_2e

    .line 885
    .line 886
    goto :goto_20

    .line 887
    :cond_2e
    add-int/2addr v8, v2

    .line 888
    goto :goto_1d

    .line 889
    :cond_2f
    :goto_20
    add-int/2addr v8, v4

    .line 890
    invoke-virtual {v0, v9, v8}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    invoke-virtual {v1, v7, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    goto/16 :goto_18

    .line 902
    .line 903
    :cond_30
    return-object v1

    .line 904
    :pswitch_1
    sget-object v0, Ld2/a;->a:Ljava/util/concurrent/ExecutorService;

    .line 905
    .line 906
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 907
    .line 908
    invoke-direct {v0, v4}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 909
    .line 910
    .line 911
    new-instance v2, Lv8/t;

    .line 912
    .line 913
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 914
    .line 915
    .line 916
    :try_start_0
    sget-object v6, Ld2/a;->a:Ljava/util/concurrent/ExecutorService;

    .line 917
    .line 918
    new-instance v7, LD4/a;

    .line 919
    .line 920
    const/16 v8, 0xd

    .line 921
    .line 922
    invoke-direct {v7, v2, v8, v0}, LD4/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 923
    .line 924
    .line 925
    invoke-interface {v6, v7}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 926
    .line 927
    .line 928
    move-result-object v6
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 929
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 930
    .line 931
    const-wide/16 v8, 0x3e8

    .line 932
    .line 933
    invoke-virtual {v0, v8, v9, v7}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 934
    .line 935
    .line 936
    move-result v0

    .line 937
    if-eqz v0, :cond_31

    .line 938
    .line 939
    iget-object v0, v2, Lv8/t;->s:Ljava/lang/Object;

    .line 940
    .line 941
    goto :goto_21

    .line 942
    :cond_31
    invoke-interface {v6, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 943
    .line 944
    .line 945
    new-instance v0, Ljava/util/concurrent/TimeoutException;

    .line 946
    .line 947
    invoke-direct {v0}, Ljava/util/concurrent/TimeoutException;-><init>()V

    .line 948
    .line 949
    .line 950
    invoke-static {v0}, LJ7/a;->d(Ljava/lang/Throwable;)Lh8/g;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    goto :goto_21

    .line 955
    :catch_0
    move-exception v0

    .line 956
    invoke-static {v0}, LJ7/a;->d(Ljava/lang/Throwable;)Lh8/g;

    .line 957
    .line 958
    .line 959
    move-result-object v0

    .line 960
    :goto_21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 961
    .line 962
    .line 963
    move-result-object v2

    .line 964
    instance-of v6, v0, Lh8/g;

    .line 965
    .line 966
    if-eqz v6, :cond_32

    .line 967
    .line 968
    move-object v0, v2

    .line 969
    :cond_32
    check-cast v0, Ljava/lang/Number;

    .line 970
    .line 971
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 972
    .line 973
    .line 974
    move-result v0

    .line 975
    new-instance v2, Ljava/util/LinkedList;

    .line 976
    .line 977
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 978
    .line 979
    .line 980
    :goto_22
    if-ge v3, v0, :cond_35

    .line 981
    .line 982
    new-instance v6, Landroid/hardware/Camera$CameraInfo;

    .line 983
    .line 984
    invoke-direct {v6}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 985
    .line 986
    .line 987
    invoke-static {v3, v6}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 988
    .line 989
    .line 990
    iget v7, v6, Landroid/hardware/Camera$CameraInfo;->facing:I

    .line 991
    .line 992
    if-eqz v7, :cond_34

    .line 993
    .line 994
    if-eq v7, v4, :cond_33

    .line 995
    .line 996
    move-object v7, v1

    .line 997
    goto :goto_23

    .line 998
    :cond_33
    const-string v7, "front"

    .line 999
    .line 1000
    goto :goto_23

    .line 1001
    :cond_34
    const-string v7, "back"

    .line 1002
    .line 1003
    :goto_23
    iget v6, v6, Landroid/hardware/Camera$CameraInfo;->orientation:I

    .line 1004
    .line 1005
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v6

    .line 1009
    new-instance v8, Lc2/b;

    .line 1010
    .line 1011
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v9

    .line 1015
    invoke-direct {v8, v9, v7, v6}, Lc2/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v2, v8}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 1019
    .line 1020
    .line 1021
    add-int/2addr v3, v4

    .line 1022
    goto :goto_22

    .line 1023
    :cond_35
    return-object v2

    .line 1024
    :pswitch_2
    new-instance v0, Ljava/util/UUID;

    .line 1025
    .line 1026
    const-wide v6, -0x121074568629b532L    # -3.563403477674908E221

    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    const-wide v8, -0x5c37d8232ae2de13L

    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    invoke-direct {v0, v6, v7, v8, v9}, Ljava/util/UUID;-><init>(JJ)V

    .line 1037
    .line 1038
    .line 1039
    new-instance v2, Landroid/media/MediaDrm;

    .line 1040
    .line 1041
    invoke-direct {v2, v0}, Landroid/media/MediaDrm;-><init>(Ljava/util/UUID;)V

    .line 1042
    .line 1043
    .line 1044
    const-string v0, "deviceUniqueId"

    .line 1045
    .line 1046
    invoke-virtual {v2, v0}, Landroid/media/MediaDrm;->getPropertyByteArray(Ljava/lang/String;)[B

    .line 1047
    .line 1048
    .line 1049
    move-result-object v0

    .line 1050
    const-string v6, "wvDrm.getPropertyByteArr\u2026ROPERTY_DEVICE_UNIQUE_ID)"

    .line 1051
    .line 1052
    invoke-static {v0, v6}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1053
    .line 1054
    .line 1055
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1056
    .line 1057
    const/16 v7, 0x1c

    .line 1058
    .line 1059
    if-lt v6, v7, :cond_36

    .line 1060
    .line 1061
    invoke-virtual {v2}, Landroid/media/MediaDrm;->release()V

    .line 1062
    .line 1063
    .line 1064
    goto :goto_24

    .line 1065
    :cond_36
    invoke-virtual {v2}, Landroid/media/MediaDrm;->release()V

    .line 1066
    .line 1067
    .line 1068
    :goto_24
    const-string v2, "SHA-256"

    .line 1069
    .line 1070
    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v2

    .line 1074
    const-string v6, "getInstance(\"SHA-256\")"

    .line 1075
    .line 1076
    invoke-static {v2, v6}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    .line 1083
    .line 1084
    .line 1085
    move-result-object v0

    .line 1086
    const-string v2, "md.digest()"

    .line 1087
    .line 1088
    invoke-static {v0, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1089
    .line 1090
    .line 1091
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1092
    .line 1093
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 1097
    .line 1098
    .line 1099
    array-length v6, v0

    .line 1100
    move v7, v3

    .line 1101
    move v8, v7

    .line 1102
    :goto_25
    if-ge v7, v6, :cond_38

    .line 1103
    .line 1104
    aget-byte v9, v0, v7

    .line 1105
    .line 1106
    add-int/2addr v8, v4

    .line 1107
    if-le v8, v4, :cond_37

    .line 1108
    .line 1109
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 1110
    .line 1111
    .line 1112
    :cond_37
    invoke-static {v9}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v9

    .line 1116
    new-array v10, v4, [Ljava/lang/Object;

    .line 1117
    .line 1118
    aput-object v9, v10, v3

    .line 1119
    .line 1120
    const-string v9, "%02x"

    .line 1121
    .line 1122
    invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v9

    .line 1126
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 1127
    .line 1128
    .line 1129
    add-int/2addr v7, v4

    .line 1130
    goto :goto_25

    .line 1131
    :cond_38
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v0

    .line 1138
    const-string v1, "toString(...)"

    .line 1139
    .line 1140
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1141
    .line 1142
    .line 1143
    return-object v0

    .line 1144
    nop

    .line 1145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
