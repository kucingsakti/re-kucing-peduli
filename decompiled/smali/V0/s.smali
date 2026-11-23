.class public final LV0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public s:LV0/p;

.field public t:Landroid/view/ViewGroup;


# virtual methods
.method public final onPreDraw()Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LV0/s;->t:Landroid/view/ViewGroup;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, LV0/t;->c:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v3, v0, LV0/s;->t:Landroid/view/ViewGroup;

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v8, 0x1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    return v8

    .line 27
    :cond_0
    invoke-static {}, LV0/t;->b()Lw/e;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v3}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/util/ArrayList;

    .line 36
    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    new-instance v2, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v3, v2}, Lw/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    :cond_1
    const/4 v5, 0x0

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-lez v5, :cond_1

    .line 54
    .line 55
    new-instance v5, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    iget-object v6, v0, LV0/s;->s:LV0/p;

    .line 61
    .line 62
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    new-instance v2, LV0/r;

    .line 66
    .line 67
    invoke-direct {v2, v0, v1}, LV0/r;-><init>(LV0/s;Lw/e;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6, v2}, LV0/p;->a(LV0/n;)V

    .line 71
    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    invoke-virtual {v6, v3, v1}, LV0/p;->i(Landroid/view/ViewGroup;Z)V

    .line 75
    .line 76
    .line 77
    if-eqz v5, :cond_3

    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_3

    .line 88
    .line 89
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, LV0/p;

    .line 94
    .line 95
    invoke-virtual {v5, v3}, LV0/p;->D(Landroid/view/View;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v2, v6, LV0/p;->C:Ljava/util/ArrayList;

    .line 105
    .line 106
    new-instance v2, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object v2, v6, LV0/p;->D:Ljava/util/ArrayList;

    .line 112
    .line 113
    iget-object v2, v6, LV0/p;->y:Lo4/r;

    .line 114
    .line 115
    iget-object v5, v6, LV0/p;->z:Lo4/r;

    .line 116
    .line 117
    new-instance v7, Lw/e;

    .line 118
    .line 119
    iget-object v9, v2, Lo4/r;->t:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v9, Lw/e;

    .line 122
    .line 123
    invoke-direct {v7, v9}, Lw/e;-><init>(Lw/e;)V

    .line 124
    .line 125
    .line 126
    new-instance v9, Lw/e;

    .line 127
    .line 128
    iget-object v10, v5, Lo4/r;->t:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v10, Lw/e;

    .line 131
    .line 132
    invoke-direct {v9, v10}, Lw/e;-><init>(Lw/e;)V

    .line 133
    .line 134
    .line 135
    move v10, v1

    .line 136
    :goto_2
    iget-object v11, v6, LV0/p;->B:[I

    .line 137
    .line 138
    array-length v12, v11

    .line 139
    if-ge v10, v12, :cond_f

    .line 140
    .line 141
    aget v11, v11, v10

    .line 142
    .line 143
    if-eq v11, v8, :cond_c

    .line 144
    .line 145
    const/4 v12, 0x2

    .line 146
    if-eq v11, v12, :cond_a

    .line 147
    .line 148
    const/4 v12, 0x3

    .line 149
    if-eq v11, v12, :cond_8

    .line 150
    .line 151
    const/4 v12, 0x4

    .line 152
    if-eq v11, v12, :cond_4

    .line 153
    .line 154
    move-object v1, v2

    .line 155
    move/from16 v17, v8

    .line 156
    .line 157
    goto/16 :goto_9

    .line 158
    .line 159
    :cond_4
    iget-object v11, v2, Lo4/r;->v:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v11, Lw/g;

    .line 162
    .line 163
    invoke-virtual {v11}, Lw/g;->l()I

    .line 164
    .line 165
    .line 166
    move-result v12

    .line 167
    move v13, v1

    .line 168
    :goto_3
    if-ge v13, v12, :cond_7

    .line 169
    .line 170
    invoke-virtual {v11, v13}, Lw/g;->m(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v14

    .line 174
    check-cast v14, Landroid/view/View;

    .line 175
    .line 176
    if-eqz v14, :cond_6

    .line 177
    .line 178
    invoke-virtual {v6, v14}, LV0/p;->x(Landroid/view/View;)Z

    .line 179
    .line 180
    .line 181
    move-result v15

    .line 182
    if-eqz v15, :cond_6

    .line 183
    .line 184
    move-object/from16 v16, v2

    .line 185
    .line 186
    invoke-virtual {v11, v13}, Lw/g;->i(I)J

    .line 187
    .line 188
    .line 189
    move-result-wide v1

    .line 190
    iget-object v15, v5, Lo4/r;->v:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v15, Lw/g;

    .line 193
    .line 194
    invoke-virtual {v15, v1, v2}, Lw/g;->e(J)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    check-cast v1, Landroid/view/View;

    .line 199
    .line 200
    if-eqz v1, :cond_5

    .line 201
    .line 202
    invoke-virtual {v6, v1}, LV0/p;->x(Landroid/view/View;)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-eqz v2, :cond_5

    .line 207
    .line 208
    invoke-virtual {v7, v14}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    check-cast v2, LV0/x;

    .line 213
    .line 214
    invoke-virtual {v9, v1}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v15

    .line 218
    check-cast v15, LV0/x;

    .line 219
    .line 220
    if-eqz v2, :cond_5

    .line 221
    .line 222
    if-eqz v15, :cond_5

    .line 223
    .line 224
    move/from16 v17, v8

    .line 225
    .line 226
    iget-object v8, v6, LV0/p;->C:Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    iget-object v2, v6, LV0/p;->D:Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    invoke-virtual {v7, v14}, Lw/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v9, v1}, Lw/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_5
    :goto_4
    move/from16 v17, v8

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_6
    move-object/from16 v16, v2

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :goto_5
    add-int/lit8 v13, v13, 0x1

    .line 250
    .line 251
    move-object/from16 v2, v16

    .line 252
    .line 253
    move/from16 v8, v17

    .line 254
    .line 255
    const/4 v1, 0x0

    .line 256
    goto :goto_3

    .line 257
    :cond_7
    move/from16 v17, v8

    .line 258
    .line 259
    move-object v1, v2

    .line 260
    goto/16 :goto_9

    .line 261
    .line 262
    :cond_8
    move-object v1, v2

    .line 263
    move/from16 v17, v8

    .line 264
    .line 265
    iget-object v2, v1, Lo4/r;->u:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v2, Landroid/util/SparseArray;

    .line 268
    .line 269
    iget-object v8, v5, Lo4/r;->u:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v8, Landroid/util/SparseArray;

    .line 272
    .line 273
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 274
    .line 275
    .line 276
    move-result v11

    .line 277
    const/4 v12, 0x0

    .line 278
    :goto_6
    if-ge v12, v11, :cond_e

    .line 279
    .line 280
    invoke-virtual {v2, v12}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v13

    .line 284
    check-cast v13, Landroid/view/View;

    .line 285
    .line 286
    if-eqz v13, :cond_9

    .line 287
    .line 288
    invoke-virtual {v6, v13}, LV0/p;->x(Landroid/view/View;)Z

    .line 289
    .line 290
    .line 291
    move-result v14

    .line 292
    if-eqz v14, :cond_9

    .line 293
    .line 294
    invoke-virtual {v2, v12}, Landroid/util/SparseArray;->keyAt(I)I

    .line 295
    .line 296
    .line 297
    move-result v14

    .line 298
    invoke-virtual {v8, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v14

    .line 302
    check-cast v14, Landroid/view/View;

    .line 303
    .line 304
    if-eqz v14, :cond_9

    .line 305
    .line 306
    invoke-virtual {v6, v14}, LV0/p;->x(Landroid/view/View;)Z

    .line 307
    .line 308
    .line 309
    move-result v15

    .line 310
    if-eqz v15, :cond_9

    .line 311
    .line 312
    invoke-virtual {v7, v13}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v15

    .line 316
    check-cast v15, LV0/x;

    .line 317
    .line 318
    invoke-virtual {v9, v14}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v16

    .line 322
    move-object/from16 v4, v16

    .line 323
    .line 324
    check-cast v4, LV0/x;

    .line 325
    .line 326
    if-eqz v15, :cond_9

    .line 327
    .line 328
    if-eqz v4, :cond_9

    .line 329
    .line 330
    iget-object v0, v6, LV0/p;->C:Ljava/util/ArrayList;

    .line 331
    .line 332
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    iget-object v0, v6, LV0/p;->D:Ljava/util/ArrayList;

    .line 336
    .line 337
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    invoke-virtual {v7, v13}, Lw/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v9, v14}, Lw/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    :cond_9
    add-int/lit8 v12, v12, 0x1

    .line 347
    .line 348
    move-object/from16 v0, p0

    .line 349
    .line 350
    goto :goto_6

    .line 351
    :cond_a
    move-object v1, v2

    .line 352
    move/from16 v17, v8

    .line 353
    .line 354
    iget-object v0, v1, Lo4/r;->w:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v0, Lw/e;

    .line 357
    .line 358
    iget-object v2, v5, Lo4/r;->w:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v2, Lw/e;

    .line 361
    .line 362
    iget v4, v0, Lw/i;->u:I

    .line 363
    .line 364
    const/4 v8, 0x0

    .line 365
    :goto_7
    if-ge v8, v4, :cond_e

    .line 366
    .line 367
    invoke-virtual {v0, v8}, Lw/i;->k(I)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v11

    .line 371
    check-cast v11, Landroid/view/View;

    .line 372
    .line 373
    if-eqz v11, :cond_b

    .line 374
    .line 375
    invoke-virtual {v6, v11}, LV0/p;->x(Landroid/view/View;)Z

    .line 376
    .line 377
    .line 378
    move-result v12

    .line 379
    if-eqz v12, :cond_b

    .line 380
    .line 381
    invoke-virtual {v0, v8}, Lw/i;->g(I)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v12

    .line 385
    invoke-virtual {v2, v12}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v12

    .line 389
    check-cast v12, Landroid/view/View;

    .line 390
    .line 391
    if-eqz v12, :cond_b

    .line 392
    .line 393
    invoke-virtual {v6, v12}, LV0/p;->x(Landroid/view/View;)Z

    .line 394
    .line 395
    .line 396
    move-result v13

    .line 397
    if-eqz v13, :cond_b

    .line 398
    .line 399
    invoke-virtual {v7, v11}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v13

    .line 403
    check-cast v13, LV0/x;

    .line 404
    .line 405
    invoke-virtual {v9, v12}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v14

    .line 409
    check-cast v14, LV0/x;

    .line 410
    .line 411
    if-eqz v13, :cond_b

    .line 412
    .line 413
    if-eqz v14, :cond_b

    .line 414
    .line 415
    iget-object v15, v6, LV0/p;->C:Ljava/util/ArrayList;

    .line 416
    .line 417
    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    iget-object v13, v6, LV0/p;->D:Ljava/util/ArrayList;

    .line 421
    .line 422
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    invoke-virtual {v7, v11}, Lw/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v9, v12}, Lw/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    :cond_b
    add-int/lit8 v8, v8, 0x1

    .line 432
    .line 433
    goto :goto_7

    .line 434
    :cond_c
    move-object v1, v2

    .line 435
    move/from16 v17, v8

    .line 436
    .line 437
    iget v0, v7, Lw/i;->u:I

    .line 438
    .line 439
    add-int/lit8 v0, v0, -0x1

    .line 440
    .line 441
    :goto_8
    if-ltz v0, :cond_e

    .line 442
    .line 443
    invoke-virtual {v7, v0}, Lw/i;->g(I)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    check-cast v2, Landroid/view/View;

    .line 448
    .line 449
    if-eqz v2, :cond_d

    .line 450
    .line 451
    invoke-virtual {v6, v2}, LV0/p;->x(Landroid/view/View;)Z

    .line 452
    .line 453
    .line 454
    move-result v4

    .line 455
    if-eqz v4, :cond_d

    .line 456
    .line 457
    invoke-virtual {v9, v2}, Lw/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    check-cast v2, LV0/x;

    .line 462
    .line 463
    if-eqz v2, :cond_d

    .line 464
    .line 465
    iget-object v4, v2, LV0/x;->b:Landroid/view/View;

    .line 466
    .line 467
    invoke-virtual {v6, v4}, LV0/p;->x(Landroid/view/View;)Z

    .line 468
    .line 469
    .line 470
    move-result v4

    .line 471
    if-eqz v4, :cond_d

    .line 472
    .line 473
    invoke-virtual {v7, v0}, Lw/i;->i(I)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v4

    .line 477
    check-cast v4, LV0/x;

    .line 478
    .line 479
    iget-object v8, v6, LV0/p;->C:Ljava/util/ArrayList;

    .line 480
    .line 481
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    iget-object v4, v6, LV0/p;->D:Ljava/util/ArrayList;

    .line 485
    .line 486
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    :cond_d
    add-int/lit8 v0, v0, -0x1

    .line 490
    .line 491
    goto :goto_8

    .line 492
    :cond_e
    :goto_9
    add-int/lit8 v10, v10, 0x1

    .line 493
    .line 494
    move-object/from16 v0, p0

    .line 495
    .line 496
    move-object v2, v1

    .line 497
    move/from16 v8, v17

    .line 498
    .line 499
    const/4 v1, 0x0

    .line 500
    goto/16 :goto_2

    .line 501
    .line 502
    :cond_f
    move/from16 v17, v8

    .line 503
    .line 504
    const/4 v0, 0x0

    .line 505
    :goto_a
    iget v1, v7, Lw/i;->u:I

    .line 506
    .line 507
    if-ge v0, v1, :cond_11

    .line 508
    .line 509
    invoke-virtual {v7, v0}, Lw/i;->k(I)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    check-cast v1, LV0/x;

    .line 514
    .line 515
    iget-object v2, v1, LV0/x;->b:Landroid/view/View;

    .line 516
    .line 517
    invoke-virtual {v6, v2}, LV0/p;->x(Landroid/view/View;)Z

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    if-eqz v2, :cond_10

    .line 522
    .line 523
    iget-object v2, v6, LV0/p;->C:Ljava/util/ArrayList;

    .line 524
    .line 525
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    iget-object v1, v6, LV0/p;->D:Ljava/util/ArrayList;

    .line 529
    .line 530
    const/4 v2, 0x0

    .line 531
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 532
    .line 533
    .line 534
    :cond_10
    add-int/lit8 v0, v0, 0x1

    .line 535
    .line 536
    goto :goto_a

    .line 537
    :cond_11
    const/4 v1, 0x0

    .line 538
    :goto_b
    iget v0, v9, Lw/i;->u:I

    .line 539
    .line 540
    if-ge v1, v0, :cond_13

    .line 541
    .line 542
    invoke-virtual {v9, v1}, Lw/i;->k(I)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    check-cast v0, LV0/x;

    .line 547
    .line 548
    iget-object v2, v0, LV0/x;->b:Landroid/view/View;

    .line 549
    .line 550
    invoke-virtual {v6, v2}, LV0/p;->x(Landroid/view/View;)Z

    .line 551
    .line 552
    .line 553
    move-result v2

    .line 554
    if-eqz v2, :cond_12

    .line 555
    .line 556
    iget-object v2, v6, LV0/p;->D:Ljava/util/ArrayList;

    .line 557
    .line 558
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    iget-object v0, v6, LV0/p;->C:Ljava/util/ArrayList;

    .line 562
    .line 563
    const/4 v2, 0x0

    .line 564
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    goto :goto_c

    .line 568
    :cond_12
    const/4 v2, 0x0

    .line 569
    :goto_c
    add-int/lit8 v1, v1, 0x1

    .line 570
    .line 571
    goto :goto_b

    .line 572
    :cond_13
    invoke-static {}, LV0/p;->s()Lw/e;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    iget v1, v0, Lw/i;->u:I

    .line 577
    .line 578
    invoke-virtual {v3}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    add-int/lit8 v1, v1, -0x1

    .line 583
    .line 584
    :goto_d
    if-ltz v1, :cond_19

    .line 585
    .line 586
    invoke-virtual {v0, v1}, Lw/i;->g(I)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v4

    .line 590
    check-cast v4, Landroid/animation/Animator;

    .line 591
    .line 592
    if-eqz v4, :cond_18

    .line 593
    .line 594
    invoke-virtual {v0, v4}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v5

    .line 598
    check-cast v5, LV0/j;

    .line 599
    .line 600
    if-eqz v5, :cond_18

    .line 601
    .line 602
    iget-object v7, v5, LV0/j;->a:Landroid/view/View;

    .line 603
    .line 604
    if-eqz v7, :cond_18

    .line 605
    .line 606
    iget-object v8, v5, LV0/j;->d:Landroid/view/WindowId;

    .line 607
    .line 608
    invoke-virtual {v2, v8}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    move-result v8

    .line 612
    if-eqz v8, :cond_18

    .line 613
    .line 614
    move/from16 v8, v17

    .line 615
    .line 616
    invoke-virtual {v6, v7, v8}, LV0/p;->u(Landroid/view/View;Z)LV0/x;

    .line 617
    .line 618
    .line 619
    move-result-object v9

    .line 620
    invoke-virtual {v6, v7, v8}, LV0/p;->q(Landroid/view/View;Z)LV0/x;

    .line 621
    .line 622
    .line 623
    move-result-object v10

    .line 624
    if-nez v9, :cond_14

    .line 625
    .line 626
    if-nez v10, :cond_14

    .line 627
    .line 628
    iget-object v8, v6, LV0/p;->z:Lo4/r;

    .line 629
    .line 630
    iget-object v8, v8, Lo4/r;->t:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v8, Lw/e;

    .line 633
    .line 634
    invoke-virtual {v8, v7}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v7

    .line 638
    move-object v10, v7

    .line 639
    check-cast v10, LV0/x;

    .line 640
    .line 641
    :cond_14
    if-nez v9, :cond_15

    .line 642
    .line 643
    if-eqz v10, :cond_18

    .line 644
    .line 645
    :cond_15
    iget-object v7, v5, LV0/j;->c:LV0/x;

    .line 646
    .line 647
    iget-object v5, v5, LV0/j;->e:LV0/p;

    .line 648
    .line 649
    invoke-virtual {v5, v7, v10}, LV0/p;->w(LV0/x;LV0/x;)Z

    .line 650
    .line 651
    .line 652
    move-result v7

    .line 653
    if-eqz v7, :cond_18

    .line 654
    .line 655
    invoke-virtual {v5}, LV0/p;->r()LV0/p;

    .line 656
    .line 657
    .line 658
    move-result-object v5

    .line 659
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v4}, Landroid/animation/Animator;->isRunning()Z

    .line 663
    .line 664
    .line 665
    move-result v5

    .line 666
    if-nez v5, :cond_17

    .line 667
    .line 668
    invoke-virtual {v4}, Landroid/animation/Animator;->isStarted()Z

    .line 669
    .line 670
    .line 671
    move-result v5

    .line 672
    if-eqz v5, :cond_16

    .line 673
    .line 674
    goto :goto_e

    .line 675
    :cond_16
    invoke-virtual {v0, v4}, Lw/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    goto :goto_f

    .line 679
    :cond_17
    :goto_e
    invoke-virtual {v4}, Landroid/animation/Animator;->cancel()V

    .line 680
    .line 681
    .line 682
    :cond_18
    :goto_f
    add-int/lit8 v1, v1, -0x1

    .line 683
    .line 684
    const/16 v17, 0x1

    .line 685
    .line 686
    goto :goto_d

    .line 687
    :cond_19
    iget-object v4, v6, LV0/p;->y:Lo4/r;

    .line 688
    .line 689
    iget-object v5, v6, LV0/p;->z:Lo4/r;

    .line 690
    .line 691
    iget-object v0, v6, LV0/p;->C:Ljava/util/ArrayList;

    .line 692
    .line 693
    iget-object v7, v6, LV0/p;->D:Ljava/util/ArrayList;

    .line 694
    .line 695
    move-object v2, v6

    .line 696
    move-object v6, v0

    .line 697
    invoke-virtual/range {v2 .. v7}, LV0/p;->m(Landroid/view/ViewGroup;Lo4/r;Lo4/r;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v2}, LV0/p;->E()V

    .line 701
    .line 702
    .line 703
    const/16 v17, 0x1

    .line 704
    .line 705
    return v17
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

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, LV0/s;->t:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, LV0/t;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v0, p0, LV0/s;->t:Landroid/view/ViewGroup;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    invoke-static {}, LV0/t;->b()Lw/e;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1, v0}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ljava/util/ArrayList;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-lez v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, LV0/p;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, LV0/p;->D(Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget-object p1, p0, LV0/s;->s:LV0/p;

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    invoke-virtual {p1, v0}, LV0/p;->j(Z)V

    .line 62
    .line 63
    .line 64
    return-void
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
