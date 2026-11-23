.class public final Li/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU/s;
.implements Lo/w;


# instance fields
.field public final synthetic s:Li/D;


# direct methods
.method public synthetic constructor <init>(Li/D;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li/s;->s:Li/D;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public E(Landroid/view/View;LU/B0;)LU/B0;
    .locals 16

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-virtual/range {p2 .. p2}, LU/B0;->d()I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    move-object/from16 v4, p0

    .line 9
    .line 10
    iget-object v5, v4, Li/s;->s:Li/D;

    .line 11
    .line 12
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p2 .. p2}, LU/B0;->d()I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    iget-object v7, v5, Li/D;->N:Landroidx/appcompat/widget/ActionBarContextView;

    .line 20
    .line 21
    const/16 v8, 0x8

    .line 22
    .line 23
    if-eqz v7, :cond_11

    .line 24
    .line 25
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    instance-of v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 30
    .line 31
    if-eqz v7, :cond_11

    .line 32
    .line 33
    iget-object v7, v5, Li/D;->N:Landroidx/appcompat/widget/ActionBarContextView;

    .line 34
    .line 35
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    check-cast v7, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 40
    .line 41
    iget-object v9, v5, Li/D;->N:Landroidx/appcompat/widget/ActionBarContextView;

    .line 42
    .line 43
    invoke-virtual {v9}, Landroid/view/View;->isShown()Z

    .line 44
    .line 45
    .line 46
    move-result v9

    .line 47
    if-eqz v9, :cond_f

    .line 48
    .line 49
    iget-object v9, v5, Li/D;->u0:Landroid/graphics/Rect;

    .line 50
    .line 51
    if-nez v9, :cond_0

    .line 52
    .line 53
    new-instance v9, Landroid/graphics/Rect;

    .line 54
    .line 55
    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v9, v5, Li/D;->u0:Landroid/graphics/Rect;

    .line 59
    .line 60
    new-instance v9, Landroid/graphics/Rect;

    .line 61
    .line 62
    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v9, v5, Li/D;->v0:Landroid/graphics/Rect;

    .line 66
    .line 67
    :cond_0
    iget-object v9, v5, Li/D;->u0:Landroid/graphics/Rect;

    .line 68
    .line 69
    iget-object v10, v5, Li/D;->v0:Landroid/graphics/Rect;

    .line 70
    .line 71
    invoke-virtual/range {p2 .. p2}, LU/B0;->b()I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    invoke-virtual/range {p2 .. p2}, LU/B0;->d()I

    .line 76
    .line 77
    .line 78
    move-result v12

    .line 79
    invoke-virtual/range {p2 .. p2}, LU/B0;->c()I

    .line 80
    .line 81
    .line 82
    move-result v13

    .line 83
    invoke-virtual/range {p2 .. p2}, LU/B0;->a()I

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    invoke-virtual {v9, v11, v12, v13, v14}, Landroid/graphics/Rect;->set(IIII)V

    .line 88
    .line 89
    .line 90
    iget-object v11, v5, Li/D;->S:Landroid/view/ViewGroup;

    .line 91
    .line 92
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 93
    .line 94
    const/16 v13, 0x1d

    .line 95
    .line 96
    if-lt v12, v13, :cond_1

    .line 97
    .line 98
    sget-boolean v0, Lp/f1;->a:Z

    .line 99
    .line 100
    invoke-static {v11, v9, v10}, Lp/e1;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_1
    sget-boolean v12, Lp/f1;->a:Z

    .line 105
    .line 106
    if-nez v12, :cond_2

    .line 107
    .line 108
    sput-boolean v1, Lp/f1;->a:Z

    .line 109
    .line 110
    :try_start_0
    const-class v12, Landroid/view/View;

    .line 111
    .line 112
    const-string v13, "computeFitSystemWindows"

    .line 113
    .line 114
    new-array v14, v0, [Ljava/lang/Class;

    .line 115
    .line 116
    const-class v15, Landroid/graphics/Rect;

    .line 117
    .line 118
    aput-object v15, v14, v2

    .line 119
    .line 120
    aput-object v15, v14, v1

    .line 121
    .line 122
    invoke-virtual {v12, v13, v14}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    sput-object v12, Lp/f1;->b:Ljava/lang/reflect/Method;

    .line 127
    .line 128
    invoke-virtual {v12}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 129
    .line 130
    .line 131
    move-result v12

    .line 132
    if-nez v12, :cond_2

    .line 133
    .line 134
    sget-object v12, Lp/f1;->b:Ljava/lang/reflect/Method;

    .line 135
    .line 136
    invoke-virtual {v12, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    .line 138
    .line 139
    :catch_0
    :cond_2
    sget-object v12, Lp/f1;->b:Ljava/lang/reflect/Method;

    .line 140
    .line 141
    if-eqz v12, :cond_3

    .line 142
    .line 143
    :try_start_1
    new-array v0, v0, [Ljava/lang/Object;

    .line 144
    .line 145
    aput-object v9, v0, v2

    .line 146
    .line 147
    aput-object v10, v0, v1

    .line 148
    .line 149
    invoke-virtual {v12, v11, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 150
    .line 151
    .line 152
    :catch_1
    :cond_3
    :goto_0
    iget v0, v9, Landroid/graphics/Rect;->top:I

    .line 153
    .line 154
    iget v10, v9, Landroid/graphics/Rect;->left:I

    .line 155
    .line 156
    iget v9, v9, Landroid/graphics/Rect;->right:I

    .line 157
    .line 158
    iget-object v11, v5, Li/D;->S:Landroid/view/ViewGroup;

    .line 159
    .line 160
    sget-object v12, LU/U;->a:Ljava/util/WeakHashMap;

    .line 161
    .line 162
    invoke-static {v11}, LU/I;->a(Landroid/view/View;)LU/B0;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    if-nez v11, :cond_4

    .line 167
    .line 168
    move v12, v2

    .line 169
    goto :goto_1

    .line 170
    :cond_4
    invoke-virtual {v11}, LU/B0;->b()I

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    :goto_1
    if-nez v11, :cond_5

    .line 175
    .line 176
    move v11, v2

    .line 177
    goto :goto_2

    .line 178
    :cond_5
    invoke-virtual {v11}, LU/B0;->c()I

    .line 179
    .line 180
    .line 181
    move-result v11

    .line 182
    :goto_2
    iget v13, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 183
    .line 184
    if-ne v13, v0, :cond_7

    .line 185
    .line 186
    iget v13, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 187
    .line 188
    if-ne v13, v10, :cond_7

    .line 189
    .line 190
    iget v13, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 191
    .line 192
    if-eq v13, v9, :cond_6

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_6
    move v9, v2

    .line 196
    goto :goto_4

    .line 197
    :cond_7
    :goto_3
    iput v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 198
    .line 199
    iput v10, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 200
    .line 201
    iput v9, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 202
    .line 203
    move v9, v1

    .line 204
    :goto_4
    iget-object v10, v5, Li/D;->C:Landroid/content/Context;

    .line 205
    .line 206
    if-lez v0, :cond_8

    .line 207
    .line 208
    iget-object v0, v5, Li/D;->U:Landroid/view/View;

    .line 209
    .line 210
    if-nez v0, :cond_8

    .line 211
    .line 212
    new-instance v0, Landroid/view/View;

    .line 213
    .line 214
    invoke-direct {v0, v10}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 215
    .line 216
    .line 217
    iput-object v0, v5, Li/D;->U:Landroid/view/View;

    .line 218
    .line 219
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 220
    .line 221
    .line 222
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 223
    .line 224
    iget v13, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 225
    .line 226
    const/16 v14, 0x33

    .line 227
    .line 228
    const/4 v15, -0x1

    .line 229
    invoke-direct {v0, v15, v13, v14}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 230
    .line 231
    .line 232
    iput v12, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 233
    .line 234
    iput v11, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 235
    .line 236
    iget-object v11, v5, Li/D;->S:Landroid/view/ViewGroup;

    .line 237
    .line 238
    iget-object v12, v5, Li/D;->U:Landroid/view/View;

    .line 239
    .line 240
    invoke-virtual {v11, v12, v15, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_8
    iget-object v0, v5, Li/D;->U:Landroid/view/View;

    .line 245
    .line 246
    if-eqz v0, :cond_a

    .line 247
    .line 248
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 253
    .line 254
    iget v13, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 255
    .line 256
    iget v14, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 257
    .line 258
    if-ne v13, v14, :cond_9

    .line 259
    .line 260
    iget v13, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 261
    .line 262
    if-ne v13, v12, :cond_9

    .line 263
    .line 264
    iget v13, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 265
    .line 266
    if-eq v13, v11, :cond_a

    .line 267
    .line 268
    :cond_9
    iput v14, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 269
    .line 270
    iput v12, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 271
    .line 272
    iput v11, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 273
    .line 274
    iget-object v11, v5, Li/D;->U:Landroid/view/View;

    .line 275
    .line 276
    invoke-virtual {v11, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 277
    .line 278
    .line 279
    :cond_a
    :goto_5
    iget-object v0, v5, Li/D;->U:Landroid/view/View;

    .line 280
    .line 281
    if-eqz v0, :cond_b

    .line 282
    .line 283
    goto :goto_6

    .line 284
    :cond_b
    move v1, v2

    .line 285
    :goto_6
    if-eqz v1, :cond_d

    .line 286
    .line 287
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-eqz v0, :cond_d

    .line 292
    .line 293
    iget-object v0, v5, Li/D;->U:Landroid/view/View;

    .line 294
    .line 295
    invoke-virtual {v0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 296
    .line 297
    .line 298
    move-result v11

    .line 299
    and-int/lit16 v11, v11, 0x2000

    .line 300
    .line 301
    if-eqz v11, :cond_c

    .line 302
    .line 303
    const v11, 0x7f060092

    .line 304
    .line 305
    .line 306
    invoke-static {v10, v11}, LJ/b;->a(Landroid/content/Context;I)I

    .line 307
    .line 308
    .line 309
    move-result v10

    .line 310
    goto :goto_7

    .line 311
    :cond_c
    const v11, 0x7f060091

    .line 312
    .line 313
    .line 314
    invoke-static {v10, v11}, LJ/b;->a(Landroid/content/Context;I)I

    .line 315
    .line 316
    .line 317
    move-result v10

    .line 318
    :goto_7
    invoke-virtual {v0, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 319
    .line 320
    .line 321
    :cond_d
    iget-boolean v0, v5, Li/D;->Z:Z

    .line 322
    .line 323
    if-nez v0, :cond_e

    .line 324
    .line 325
    if-eqz v1, :cond_e

    .line 326
    .line 327
    move v6, v2

    .line 328
    :cond_e
    move v0, v1

    .line 329
    move v1, v9

    .line 330
    goto :goto_8

    .line 331
    :cond_f
    iget v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 332
    .line 333
    if-eqz v0, :cond_10

    .line 334
    .line 335
    iput v2, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 336
    .line 337
    move v0, v2

    .line 338
    goto :goto_8

    .line 339
    :cond_10
    move v0, v2

    .line 340
    move v1, v0

    .line 341
    :goto_8
    if-eqz v1, :cond_12

    .line 342
    .line 343
    iget-object v1, v5, Li/D;->N:Landroidx/appcompat/widget/ActionBarContextView;

    .line 344
    .line 345
    invoke-virtual {v1, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 346
    .line 347
    .line 348
    goto :goto_9

    .line 349
    :cond_11
    move v0, v2

    .line 350
    :cond_12
    :goto_9
    iget-object v1, v5, Li/D;->U:Landroid/view/View;

    .line 351
    .line 352
    if-eqz v1, :cond_14

    .line 353
    .line 354
    if-eqz v0, :cond_13

    .line 355
    .line 356
    goto :goto_a

    .line 357
    :cond_13
    move v2, v8

    .line 358
    :goto_a
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 359
    .line 360
    .line 361
    :cond_14
    if-eq v3, v6, :cond_15

    .line 362
    .line 363
    invoke-virtual/range {p2 .. p2}, LU/B0;->b()I

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    invoke-virtual/range {p2 .. p2}, LU/B0;->c()I

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    invoke-virtual/range {p2 .. p2}, LU/B0;->a()I

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    move-object/from16 v3, p2

    .line 376
    .line 377
    invoke-virtual {v3, v0, v6, v1, v2}, LU/B0;->f(IIII)LU/B0;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    :goto_b
    move-object/from16 v1, p1

    .line 382
    .line 383
    goto :goto_c

    .line 384
    :cond_15
    move-object/from16 v3, p2

    .line 385
    .line 386
    move-object v0, v3

    .line 387
    goto :goto_b

    .line 388
    :goto_c
    invoke-static {v1, v0}, LU/U;->i(Landroid/view/View;LU/B0;)LU/B0;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    return-object v0
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
.end method

.method public c(Lo/l;Z)V
    .locals 0

    .line 1
    iget-object p2, p0, Li/s;->s:Li/D;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Li/D;->q(Lo/l;)V

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

.method public l(Lo/l;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Li/s;->s:Li/D;

    .line 2
    .line 3
    iget-object v0, v0, Li/D;->D:Landroid/view/Window;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/16 v1, 0x6c

    .line 12
    .line 13
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 p1, 0x1

    .line 17
    return p1
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
