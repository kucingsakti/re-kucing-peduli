.class public Lcom/mukesh/OtpView;
.super Lp/t;
.source "SourceFile"


# static fields
.field public static final f0:[Landroid/text/InputFilter;

.field public static final g0:[I

.field public static final h0:[I


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:I

.field public final E:Landroid/graphics/Paint;

.field public final F:Landroid/text/TextPaint;

.field public G:Landroid/content/res/ColorStateList;

.field public H:I

.field public I:I

.field public final J:Landroid/graphics/Rect;

.field public final K:Landroid/graphics/RectF;

.field public final L:Landroid/graphics/RectF;

.field public final M:Landroid/graphics/Path;

.field public final N:Landroid/graphics/PointF;

.field public final O:Landroid/animation/ValueAnimator;

.field public P:Z

.field public Q:LM2/P;

.field public R:Z

.field public S:Z

.field public T:F

.field public U:I

.field public V:I

.field public W:I

.field public a0:Landroid/graphics/drawable/Drawable;

.field public b0:Z

.field public final c0:Z

.field public d0:Ljava/lang/String;

.field public e0:LO4/b;

.field public final y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Landroid/text/InputFilter;

    .line 3
    .line 4
    sput-object v0, Lcom/mukesh/OtpView;->f0:[Landroid/text/InputFilter;

    .line 5
    .line 6
    const v0, 0x10100a1

    .line 7
    .line 8
    .line 9
    filled-new-array {v0}, [I

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lcom/mukesh/OtpView;->g0:[I

    .line 14
    .line 15
    const v0, 0x7f04000c

    .line 16
    .line 17
    .line 18
    filled-new-array {v0}, [I

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lcom/mukesh/OtpView;->h0:[I

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    const v1, 0x7f0403cc

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1, p2, v1}, Lp/t;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Landroid/text/TextPaint;

    .line 9
    .line 10
    invoke-direct {v2}, Landroid/text/TextPaint;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, p0, Lcom/mukesh/OtpView;->F:Landroid/text/TextPaint;

    .line 14
    .line 15
    const/high16 v3, -0x1000000

    .line 16
    .line 17
    iput v3, p0, Lcom/mukesh/OtpView;->H:I

    .line 18
    .line 19
    new-instance v3, Landroid/graphics/Rect;

    .line 20
    .line 21
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v3, p0, Lcom/mukesh/OtpView;->J:Landroid/graphics/Rect;

    .line 25
    .line 26
    new-instance v3, Landroid/graphics/RectF;

    .line 27
    .line 28
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v3, p0, Lcom/mukesh/OtpView;->K:Landroid/graphics/RectF;

    .line 32
    .line 33
    new-instance v3, Landroid/graphics/RectF;

    .line 34
    .line 35
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v3, p0, Lcom/mukesh/OtpView;->L:Landroid/graphics/RectF;

    .line 39
    .line 40
    new-instance v3, Landroid/graphics/Path;

    .line 41
    .line 42
    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v3, p0, Lcom/mukesh/OtpView;->M:Landroid/graphics/Path;

    .line 46
    .line 47
    new-instance v3, Landroid/graphics/PointF;

    .line 48
    .line 49
    invoke-direct {v3}, Landroid/graphics/PointF;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v3, p0, Lcom/mukesh/OtpView;->N:Landroid/graphics/PointF;

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    iput-boolean v3, p0, Lcom/mukesh/OtpView;->P:Z

    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    new-instance v5, Landroid/graphics/Paint;

    .line 62
    .line 63
    const/4 v6, 0x1

    .line 64
    invoke-direct {v5, v6}, Landroid/graphics/Paint;-><init>(I)V

    .line 65
    .line 66
    .line 67
    iput-object v5, p0, Lcom/mukesh/OtpView;->E:Landroid/graphics/Paint;

    .line 68
    .line 69
    sget-object v7, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 70
    .line 71
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-virtual {v2, v7}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    sget-object v2, LO4/c;->a:[I

    .line 86
    .line 87
    invoke-virtual {p1, p2, v2, v1, v3}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const/16 p2, 0xf

    .line 92
    .line 93
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    iput p2, p0, Lcom/mukesh/OtpView;->y:I

    .line 98
    .line 99
    const/4 p2, 0x5

    .line 100
    const/4 v1, 0x4

    .line 101
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    iput p2, p0, Lcom/mukesh/OtpView;->z:I

    .line 106
    .line 107
    const p2, 0x7f07032e

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    int-to-float v2, v2

    .line 115
    const/4 v7, 0x6

    .line 116
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    float-to-int v2, v2

    .line 121
    iput v2, p0, Lcom/mukesh/OtpView;->B:I

    .line 122
    .line 123
    invoke-virtual {v4, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    int-to-float p2, p2

    .line 128
    const/16 v2, 0x9

    .line 129
    .line 130
    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    float-to-int p2, p2

    .line 135
    iput p2, p0, Lcom/mukesh/OtpView;->A:I

    .line 136
    .line 137
    const p2, 0x7f07032f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    const/16 v2, 0x8

    .line 145
    .line 146
    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    iput p2, p0, Lcom/mukesh/OtpView;->D:I

    .line 151
    .line 152
    const/4 p2, 0x7

    .line 153
    const/4 v2, 0x0

    .line 154
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    float-to-int p2, p2

    .line 159
    iput p2, p0, Lcom/mukesh/OtpView;->C:I

    .line 160
    .line 161
    const p2, 0x7f07032c

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    int-to-float p2, p2

    .line 169
    const/16 v2, 0xb

    .line 170
    .line 171
    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    float-to-int p2, p2

    .line 176
    iput p2, p0, Lcom/mukesh/OtpView;->I:I

    .line 177
    .line 178
    const/16 p2, 0xa

    .line 179
    .line 180
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    iput-object p2, p0, Lcom/mukesh/OtpView;->G:Landroid/content/res/ColorStateList;

    .line 185
    .line 186
    invoke-virtual {p1, v6, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 187
    .line 188
    .line 189
    move-result p2

    .line 190
    iput-boolean p2, p0, Lcom/mukesh/OtpView;->R:Z

    .line 191
    .line 192
    invoke-virtual {p0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 193
    .line 194
    .line 195
    move-result p2

    .line 196
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    iput p2, p0, Lcom/mukesh/OtpView;->V:I

    .line 201
    .line 202
    const p2, 0x7f07032b

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 206
    .line 207
    .line 208
    move-result p2

    .line 209
    const/4 v2, 0x3

    .line 210
    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 211
    .line 212
    .line 213
    move-result p2

    .line 214
    iput p2, p0, Lcom/mukesh/OtpView;->U:I

    .line 215
    .line 216
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 217
    .line 218
    .line 219
    move-result-object p2

    .line 220
    iput-object p2, p0, Lcom/mukesh/OtpView;->a0:Landroid/graphics/drawable/Drawable;

    .line 221
    .line 222
    invoke-virtual {p1, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 223
    .line 224
    .line 225
    move-result p2

    .line 226
    iput-boolean p2, p0, Lcom/mukesh/OtpView;->b0:Z

    .line 227
    .line 228
    const/16 p2, 0xd

    .line 229
    .line 230
    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 231
    .line 232
    .line 233
    move-result p2

    .line 234
    iput-boolean p2, p0, Lcom/mukesh/OtpView;->c0:Z

    .line 235
    .line 236
    const/16 p2, 0xc

    .line 237
    .line 238
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    iput-object p2, p0, Lcom/mukesh/OtpView;->d0:Ljava/lang/String;

    .line 243
    .line 244
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 245
    .line 246
    .line 247
    iget-object p1, p0, Lcom/mukesh/OtpView;->G:Landroid/content/res/ColorStateList;

    .line 248
    .line 249
    if-eqz p1, :cond_0

    .line 250
    .line 251
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    iput p1, p0, Lcom/mukesh/OtpView;->H:I

    .line 256
    .line 257
    :cond_0
    invoke-virtual {p0}, Lcom/mukesh/OtpView;->k()V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0}, Lcom/mukesh/OtpView;->b()V

    .line 261
    .line 262
    .line 263
    iget p1, p0, Lcom/mukesh/OtpView;->z:I

    .line 264
    .line 265
    invoke-direct {p0, p1}, Lcom/mukesh/OtpView;->setMaxLength(I)V

    .line 266
    .line 267
    .line 268
    iget p1, p0, Lcom/mukesh/OtpView;->I:I

    .line 269
    .line 270
    int-to-float p1, p1

    .line 271
    invoke-virtual {v5, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 272
    .line 273
    .line 274
    new-array p1, v0, [F

    .line 275
    .line 276
    fill-array-data p1, :array_0

    .line 277
    .line 278
    .line 279
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    iput-object p1, p0, Lcom/mukesh/OtpView;->O:Landroid/animation/ValueAnimator;

    .line 284
    .line 285
    const-wide/16 v1, 0x96

    .line 286
    .line 287
    invoke-virtual {p1, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 288
    .line 289
    .line 290
    iget-object p1, p0, Lcom/mukesh/OtpView;->O:Landroid/animation/ValueAnimator;

    .line 291
    .line 292
    new-instance p2, Landroid/view/animation/DecelerateInterpolator;

    .line 293
    .line 294
    invoke-direct {p2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 295
    .line 296
    .line 297
    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 298
    .line 299
    .line 300
    iget-object p1, p0, Lcom/mukesh/OtpView;->O:Landroid/animation/ValueAnimator;

    .line 301
    .line 302
    new-instance p2, LB4/K;

    .line 303
    .line 304
    invoke-direct {p2, p0, v0}, LB4/K;-><init>(Ljava/lang/Object;I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 308
    .line 309
    .line 310
    invoke-super {p0, v3}, Landroid/widget/EditText;->setCursorVisible(Z)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p0, v3}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    .line 314
    .line 315
    .line 316
    return-void

    .line 317
    :array_0
    .array-data 4
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
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

.method private setMaxLength(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    new-array v0, v0, [Landroid/text/InputFilter;

    .line 5
    .line 6
    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    aput-object v1, v0, p1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v0, Lcom/mukesh/OtpView;->f0:[Landroid/text/InputFilter;

    .line 16
    .line 17
    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 18
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
.end method


# virtual methods
.method public final b()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/high16 v1, 0x40000000    # 2.0f

    .line 3
    .line 4
    iget v2, p0, Lcom/mukesh/OtpView;->y:I

    .line 5
    .line 6
    if-ne v2, v0, :cond_1

    .line 7
    .line 8
    iget v0, p0, Lcom/mukesh/OtpView;->I:I

    .line 9
    .line 10
    int-to-float v0, v0

    .line 11
    div-float/2addr v0, v1

    .line 12
    iget v1, p0, Lcom/mukesh/OtpView;->C:I

    .line 13
    .line 14
    int-to-float v1, v1

    .line 15
    cmpl-float v0, v1, v0

    .line 16
    .line 17
    if-gtz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    const-string v1, "The itemRadius can not be greater than lineWidth when viewType is line"

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    if-nez v2, :cond_3

    .line 29
    .line 30
    iget v0, p0, Lcom/mukesh/OtpView;->A:I

    .line 31
    .line 32
    int-to-float v0, v0

    .line 33
    div-float/2addr v0, v1

    .line 34
    iget v1, p0, Lcom/mukesh/OtpView;->C:I

    .line 35
    .line 36
    int-to-float v1, v1

    .line 37
    cmpl-float v0, v1, v0

    .line 38
    .line 39
    if-gtz v0, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    const-string v1, "The itemRadius can not be greater than itemWidth"

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_3
    :goto_0
    return-void
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

.method public final c(Landroid/graphics/Canvas;I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, Lcom/mukesh/OtpView;->f(I)Landroid/text/TextPaint;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->getCurrentHintTextColor()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 10
    .line 11
    .line 12
    iget-boolean v1, p0, Lcom/mukesh/OtpView;->c0:Z

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget v1, p0, Lcom/mukesh/OtpView;->z:I

    .line 17
    .line 18
    sub-int/2addr v1, p2

    .line 19
    invoke-virtual {p0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    sub-int/2addr v1, p2

    .line 28
    if-gtz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p0, p1, v0, p2, v1}, Lcom/mukesh/OtpView;->e(Landroid/graphics/Canvas;Landroid/text/TextPaint;Ljava/lang/CharSequence;I)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :cond_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/mukesh/OtpView;->e(Landroid/graphics/Canvas;Landroid/text/TextPaint;Ljava/lang/CharSequence;I)V

    .line 47
    .line 48
    .line 49
    return-void
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

.method public final d(Landroid/graphics/Canvas;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/mukesh/OtpView;->d0:Ljava/lang/String;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/mukesh/OtpView;->c0:Z

    .line 4
    .line 5
    const/16 v2, 0x12

    .line 6
    .line 7
    const/16 v3, 0xe1

    .line 8
    .line 9
    const/16 v4, 0x81

    .line 10
    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v5, 0x2

    .line 18
    if-ne v0, v5, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    and-int/lit16 v0, v0, 0xfff

    .line 26
    .line 27
    if-eq v0, v4, :cond_1

    .line 28
    .line 29
    if-eq v0, v3, :cond_1

    .line 30
    .line 31
    if-ne v0, v2, :cond_4

    .line 32
    .line 33
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/mukesh/OtpView;->d0:Ljava/lang/String;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-static {v0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, p2}, Lcom/mukesh/OtpView;->f(I)Landroid/text/TextPaint;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {p0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 53
    .line 54
    .line 55
    const-string v3, "."

    .line 56
    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    iget v1, p0, Lcom/mukesh/OtpView;->z:I

    .line 60
    .line 61
    sub-int/2addr v1, p2

    .line 62
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    if-nez p2, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    sub-int/2addr v1, p2

    .line 78
    :goto_1
    if-gtz v1, :cond_9

    .line 79
    .line 80
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    if-eqz p2, :cond_9

    .line 85
    .line 86
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-virtual {p2, v3, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    invoke-virtual {p0, p1, v2, p2, v0}, Lcom/mukesh/OtpView;->e(Landroid/graphics/Canvas;Landroid/text/TextPaint;Ljava/lang/CharSequence;I)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_3
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    if-eqz v1, :cond_9

    .line 111
    .line 112
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v1, v3, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {p0, p1, v2, v0, p2}, Lcom/mukesh/OtpView;->e(Landroid/graphics/Canvas;Landroid/text/TextPaint;Ljava/lang/CharSequence;I)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_4
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    and-int/lit16 v0, v0, 0xfff

    .line 133
    .line 134
    if-eq v0, v4, :cond_8

    .line 135
    .line 136
    if-eq v0, v3, :cond_8

    .line 137
    .line 138
    if-ne v0, v2, :cond_5

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_5
    invoke-virtual {p0, p2}, Lcom/mukesh/OtpView;->f(I)Landroid/text/TextPaint;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {p0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 150
    .line 151
    .line 152
    if-eqz v1, :cond_7

    .line 153
    .line 154
    iget v1, p0, Lcom/mukesh/OtpView;->z:I

    .line 155
    .line 156
    sub-int/2addr v1, p2

    .line 157
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    if-nez p2, :cond_6

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_6
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    sub-int/2addr v1, p2

    .line 173
    :goto_2
    if-gtz v1, :cond_9

    .line 174
    .line 175
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    if-eqz p2, :cond_9

    .line 180
    .line 181
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    invoke-virtual {p0, p1, v0, p2, v1}, Lcom/mukesh/OtpView;->e(Landroid/graphics/Canvas;Landroid/text/TextPaint;Ljava/lang/CharSequence;I)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_7
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    if-eqz v1, :cond_9

    .line 198
    .line 199
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/mukesh/OtpView;->e(Landroid/graphics/Canvas;Landroid/text/TextPaint;Ljava/lang/CharSequence;I)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_8
    :goto_3
    invoke-virtual {p0, p2}, Lcom/mukesh/OtpView;->f(I)Landroid/text/TextPaint;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    iget-object v2, p0, Lcom/mukesh/OtpView;->N:Landroid/graphics/PointF;

    .line 212
    .line 213
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 214
    .line 215
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 216
    .line 217
    const/high16 v4, 0x40000000    # 2.0f

    .line 218
    .line 219
    if-eqz v1, :cond_a

    .line 220
    .line 221
    iget v1, p0, Lcom/mukesh/OtpView;->z:I

    .line 222
    .line 223
    sub-int/2addr v1, p2

    .line 224
    invoke-virtual {p0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 229
    .line 230
    .line 231
    move-result p2

    .line 232
    sub-int/2addr v1, p2

    .line 233
    if-gtz v1, :cond_9

    .line 234
    .line 235
    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    .line 236
    .line 237
    .line 238
    move-result p2

    .line 239
    div-float/2addr p2, v4

    .line 240
    invoke-virtual {p1, v3, v2, p2, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 241
    .line 242
    .line 243
    :cond_9
    return-void

    .line 244
    :cond_a
    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    .line 245
    .line 246
    .line 247
    move-result p2

    .line 248
    div-float/2addr p2, v4

    .line 249
    invoke-virtual {p1, v3, v2, p2, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 250
    .line 251
    .line 252
    return-void
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

.method public final drawableStateChanged()V
    .locals 1

    .line 1
    invoke-super {p0}, Lp/t;->drawableStateChanged()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/mukesh/OtpView;->G:Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void

    .line 16
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/mukesh/OtpView;->j()V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final e(Landroid/graphics/Canvas;Landroid/text/TextPaint;Ljava/lang/CharSequence;I)V
    .locals 8

    .line 1
    invoke-interface {p3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    add-int/lit8 v4, p4, 0x1

    .line 6
    .line 7
    iget-object v1, p0, Lcom/mukesh/OtpView;->J:Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-virtual {p2, v0, p4, v4, v1}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/mukesh/OtpView;->N:Landroid/graphics/PointF;

    .line 13
    .line 14
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 15
    .line 16
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    int-to-float v3, v3

    .line 23
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/high16 v5, 0x40000000    # 2.0f

    .line 28
    .line 29
    div-float/2addr v3, v5

    .line 30
    sub-float/2addr v2, v3

    .line 31
    iget v3, v1, Landroid/graphics/Rect;->left:I

    .line 32
    .line 33
    int-to-float v3, v3

    .line 34
    sub-float/2addr v2, v3

    .line 35
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    int-to-float v3, v3

    .line 40
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    div-float/2addr v3, v5

    .line 45
    add-float/2addr v3, v0

    .line 46
    iget v0, v1, Landroid/graphics/Rect;->bottom:I

    .line 47
    .line 48
    int-to-float v0, v0

    .line 49
    sub-float v6, v3, v0

    .line 50
    .line 51
    move-object v1, p1

    .line 52
    move-object v7, p2

    .line 53
    move v3, p4

    .line 54
    move v5, v2

    .line 55
    move-object v2, p3

    .line 56
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    .line 57
    .line 58
    .line 59
    return-void
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

.method public final f(I)Landroid/text/TextPaint;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/mukesh/OtpView;->P:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    add-int/lit8 v0, v0, -0x1

    .line 20
    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    iget-object p1, p0, Lcom/mukesh/OtpView;->F:Landroid/text/TextPaint;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
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
.end method

.method public final g(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/mukesh/OtpView;->S:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/mukesh/OtpView;->S:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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

.method public getCurrentLineColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mukesh/OtpView;->H:I

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

.method public getCursorColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mukesh/OtpView;->V:I

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

.method public getCursorWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mukesh/OtpView;->U:I

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

.method public getDefaultMovementMethod()Landroid/text/method/MovementMethod;
    .locals 1

    .line 1
    sget-object v0, LO4/a;->a:LO4/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LO4/a;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, LO4/a;->a:LO4/a;

    .line 11
    .line 12
    :cond_0
    sget-object v0, LO4/a;->a:LO4/a;

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

.method public getItemCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mukesh/OtpView;->z:I

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

.method public getItemHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mukesh/OtpView;->B:I

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

.method public getItemRadius()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mukesh/OtpView;->C:I

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

.method public getItemSpacing()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mukesh/OtpView;->D:I

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

.method public getItemWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mukesh/OtpView;->A:I

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

.method public getLineColors()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mukesh/OtpView;->G:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
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

.method public getLineWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mukesh/OtpView;->I:I

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

.method public getMaskingChar()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mukesh/OtpView;->d0:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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

.method public final h()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/mukesh/OtpView;->R:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/mukesh/OtpView;->Q:LM2/P;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, LM2/P;

    .line 16
    .line 17
    invoke-direct {v0, p0}, LM2/P;-><init>(Lcom/mukesh/OtpView;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/mukesh/OtpView;->Q:LM2/P;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/mukesh/OtpView;->Q:LM2/P;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, Lcom/mukesh/OtpView;->S:Z

    .line 29
    .line 30
    iget-object v0, p0, Lcom/mukesh/OtpView;->Q:LM2/P;

    .line 31
    .line 32
    const-wide/16 v1, 0x1f4

    .line 33
    .line 34
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    iget-object v0, p0, Lcom/mukesh/OtpView;->Q:LM2/P;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 43
    .line 44
    .line 45
    :cond_2
    return-void
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

.method public final i()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mukesh/OtpView;->K:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/high16 v3, 0x40000000    # 2.0f

    .line 14
    .line 15
    div-float/2addr v2, v3

    .line 16
    add-float/2addr v2, v1

    .line 17
    iget v1, v0, Landroid/graphics/RectF;->top:F

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    div-float/2addr v0, v3

    .line 28
    add-float/2addr v0, v1

    .line 29
    iget-object v1, p0, Lcom/mukesh/OtpView;->N:Landroid/graphics/PointF;

    .line 30
    .line 31
    invoke-virtual {v1, v2, v0}, Landroid/graphics/PointF;->set(FF)V

    .line 32
    .line 33
    .line 34
    return-void
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

.method public final isCursorVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/mukesh/OtpView;->R:Z

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

.method public final j()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/mukesh/OtpView;->G:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    :goto_0
    iget v1, p0, Lcom/mukesh/OtpView;->H:I

    .line 20
    .line 21
    if-eq v0, v1, :cond_1

    .line 22
    .line 23
    iput v0, p0, Lcom/mukesh/OtpView;->H:I

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
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
.end method

.method public final k()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    const/high16 v1, 0x40000000    # 2.0f

    .line 12
    .line 13
    mul-float/2addr v0, v1

    .line 14
    const/high16 v1, 0x3f000000    # 0.5f

    .line 15
    .line 16
    add-float/2addr v0, v1

    .line 17
    float-to-int v0, v0

    .line 18
    mul-int/lit8 v0, v0, 0x2

    .line 19
    .line 20
    iget v1, p0, Lcom/mukesh/OtpView;->B:I

    .line 21
    .line 22
    int-to-float v1, v1

    .line 23
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    sub-float/2addr v1, v2

    .line 28
    int-to-float v0, v0

    .line 29
    cmpl-float v1, v1, v0

    .line 30
    .line 31
    if-lez v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-float/2addr v1, v0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    :goto_0
    iput v1, p0, Lcom/mukesh/OtpView;->T:F

    .line 44
    .line 45
    return-void
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

.method public final l(I)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/mukesh/OtpView;->I:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    const/high16 v1, 0x40000000    # 2.0f

    .line 5
    .line 6
    div-float/2addr v0, v1

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    sget-object v2, LU/U;->a:Ljava/util/WeakHashMap;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    add-int/2addr v2, v1

    .line 18
    iget v1, p0, Lcom/mukesh/OtpView;->D:I

    .line 19
    .line 20
    iget v3, p0, Lcom/mukesh/OtpView;->A:I

    .line 21
    .line 22
    add-int v4, v1, v3

    .line 23
    .line 24
    mul-int/2addr v4, p1

    .line 25
    add-int/2addr v4, v2

    .line 26
    int-to-float v2, v4

    .line 27
    add-float/2addr v2, v0

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    if-lez p1, :cond_0

    .line 31
    .line 32
    iget v1, p0, Lcom/mukesh/OtpView;->I:I

    .line 33
    .line 34
    mul-int/2addr v1, p1

    .line 35
    int-to-float p1, v1

    .line 36
    sub-float/2addr v2, p1

    .line 37
    :cond_0
    int-to-float p1, v3

    .line 38
    add-float/2addr p1, v2

    .line 39
    iget v1, p0, Lcom/mukesh/OtpView;->I:I

    .line 40
    .line 41
    int-to-float v1, v1

    .line 42
    sub-float/2addr p1, v1

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    add-int/2addr v3, v1

    .line 52
    int-to-float v1, v3

    .line 53
    add-float/2addr v1, v0

    .line 54
    iget v0, p0, Lcom/mukesh/OtpView;->B:I

    .line 55
    .line 56
    int-to-float v0, v0

    .line 57
    add-float/2addr v0, v1

    .line 58
    iget v3, p0, Lcom/mukesh/OtpView;->I:I

    .line 59
    .line 60
    int-to-float v3, v3

    .line 61
    sub-float/2addr v0, v3

    .line 62
    iget-object v3, p0, Lcom/mukesh/OtpView;->K:Landroid/graphics/RectF;

    .line 63
    .line 64
    invoke-virtual {v3, v2, v1, p1, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 65
    .line 66
    .line 67
    return-void
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

.method public final m(I)V
    .locals 10

    .line 1
    iget v0, p0, Lcom/mukesh/OtpView;->D:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move v8, v1

    .line 7
    move v9, v8

    .line 8
    goto :goto_2

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    iget v2, p0, Lcom/mukesh/OtpView;->z:I

    .line 13
    .line 14
    sub-int/2addr v2, v1

    .line 15
    if-eq p1, v2, :cond_1

    .line 16
    .line 17
    move v2, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move v2, v0

    .line 20
    :goto_0
    iget v3, p0, Lcom/mukesh/OtpView;->z:I

    .line 21
    .line 22
    sub-int/2addr v3, v1

    .line 23
    if-ne p1, v3, :cond_2

    .line 24
    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    move v9, v1

    .line 28
    :goto_1
    move v8, v2

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    move v9, v0

    .line 31
    goto :goto_1

    .line 32
    :goto_2
    iget-object v5, p0, Lcom/mukesh/OtpView;->K:Landroid/graphics/RectF;

    .line 33
    .line 34
    iget p1, p0, Lcom/mukesh/OtpView;->C:I

    .line 35
    .line 36
    int-to-float v6, p1

    .line 37
    int-to-float v7, p1

    .line 38
    move-object v4, p0

    .line 39
    invoke-virtual/range {v4 .. v9}, Lcom/mukesh/OtpView;->n(Landroid/graphics/RectF;FFZZ)V

    .line 40
    .line 41
    .line 42
    return-void
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
.end method

.method public final n(Landroid/graphics/RectF;FFZZ)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/mukesh/OtpView;->M:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 7
    .line 8
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 9
    .line 10
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 11
    .line 12
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 13
    .line 14
    sub-float/2addr v3, v1

    .line 15
    sub-float/2addr p1, v2

    .line 16
    const/high16 v4, 0x40000000    # 2.0f

    .line 17
    .line 18
    mul-float v5, p2, v4

    .line 19
    .line 20
    sub-float/2addr v3, v5

    .line 21
    mul-float/2addr v4, p3

    .line 22
    sub-float/2addr p1, v4

    .line 23
    add-float/2addr v2, p3

    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz p4, :cond_0

    .line 29
    .line 30
    neg-float v2, p3

    .line 31
    invoke-virtual {v0, v1, v2, p2, v2}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    neg-float v2, p3

    .line 36
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {v0, v3, v1}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 43
    .line 44
    .line 45
    if-eqz p5, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0, p2, v1, p2, p3}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1, p3}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 55
    .line 56
    .line 57
    :goto_1
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 58
    .line 59
    .line 60
    if-eqz p5, :cond_2

    .line 61
    .line 62
    neg-float p5, p2

    .line 63
    invoke-virtual {v0, v1, p3, p5, p3}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {v0, v1, p3}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 68
    .line 69
    .line 70
    neg-float p5, p2

    .line 71
    invoke-virtual {v0, p5, v1}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 72
    .line 73
    .line 74
    :goto_2
    neg-float p5, v3

    .line 75
    invoke-virtual {v0, p5, v1}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 76
    .line 77
    .line 78
    if-eqz p4, :cond_3

    .line 79
    .line 80
    neg-float p2, p2

    .line 81
    neg-float p3, p3

    .line 82
    invoke-virtual {v0, p2, v1, p2, p3}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    neg-float p2, p2

    .line 87
    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 88
    .line 89
    .line 90
    neg-float p2, p3

    .line 91
    invoke-virtual {v0, v1, p2}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 92
    .line 93
    .line 94
    :goto_3
    neg-float p1, p1

    .line 95
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 99
    .line 100
    .line 101
    return-void
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

.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/EditText;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/mukesh/OtpView;->Q:LM2/P;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, v0, LM2/P;->t:Z

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/mukesh/OtpView;->h()V

    .line 12
    .line 13
    .line 14
    :cond_0
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
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Lp/t;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/mukesh/OtpView;->Q:LM2/P;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean v1, v0, LM2/P;->t:Z

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, v0, LM2/P;->u:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lcom/mukesh/OtpView;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    iput-boolean v1, v0, LM2/P;->t:Z

    .line 21
    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p0, v0}, Lcom/mukesh/OtpView;->g(Z)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 6
    .line 7
    .line 8
    iget-object v6, v0, Lcom/mukesh/OtpView;->E:Landroid/graphics/Paint;

    .line 9
    .line 10
    iget v2, v0, Lcom/mukesh/OtpView;->H:I

    .line 11
    .line 12
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    .line 15
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 16
    .line 17
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 18
    .line 19
    .line 20
    iget v2, v0, Lcom/mukesh/OtpView;->I:I

    .line 21
    .line 22
    int-to-float v2, v2

    .line 23
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 35
    .line 36
    .line 37
    iget-boolean v7, v0, Lcom/mukesh/OtpView;->c0:Z

    .line 38
    .line 39
    const/4 v8, 0x1

    .line 40
    if-eqz v7, :cond_0

    .line 41
    .line 42
    iget v2, v0, Lcom/mukesh/OtpView;->z:I

    .line 43
    .line 44
    sub-int/2addr v2, v8

    .line 45
    :goto_0
    move v10, v2

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    invoke-virtual {v0}, Lp/t;->getText()Landroid/text/Editable;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0}, Lp/t;->getText()Landroid/text/Editable;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 v10, 0x0

    .line 63
    :goto_1
    const/4 v11, 0x0

    .line 64
    :goto_2
    iget v2, v0, Lcom/mukesh/OtpView;->z:I

    .line 65
    .line 66
    sget-object v3, Lcom/mukesh/OtpView;->g0:[I

    .line 67
    .line 68
    iget v12, v0, Lcom/mukesh/OtpView;->y:I

    .line 69
    .line 70
    iget-object v13, v0, Lcom/mukesh/OtpView;->M:Landroid/graphics/Path;

    .line 71
    .line 72
    if-ge v11, v2, :cond_18

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    if-ne v10, v11, :cond_2

    .line 81
    .line 82
    move v2, v8

    .line 83
    goto :goto_3

    .line 84
    :cond_2
    const/4 v2, 0x0

    .line 85
    :goto_3
    if-ge v11, v10, :cond_3

    .line 86
    .line 87
    sget-object v3, Lcom/mukesh/OtpView;->h0:[I

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_3
    if-eqz v2, :cond_4

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_4
    const/4 v3, 0x0

    .line 94
    :goto_4
    if-eqz v3, :cond_6

    .line 95
    .line 96
    iget-object v4, v0, Lcom/mukesh/OtpView;->G:Landroid/content/res/ColorStateList;

    .line 97
    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    iget v5, v0, Lcom/mukesh/OtpView;->H:I

    .line 101
    .line 102
    invoke-virtual {v4, v3, v5}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    goto :goto_5

    .line 107
    :cond_5
    iget v4, v0, Lcom/mukesh/OtpView;->H:I

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_6
    iget v4, v0, Lcom/mukesh/OtpView;->H:I

    .line 111
    .line 112
    :goto_5
    invoke-virtual {v6, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v11}, Lcom/mukesh/OtpView;->l(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Lcom/mukesh/OtpView;->i()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 122
    .line 123
    .line 124
    if-nez v12, :cond_7

    .line 125
    .line 126
    invoke-virtual {v0, v11}, Lcom/mukesh/OtpView;->m(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v13}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 130
    .line 131
    .line 132
    :cond_7
    iget-object v4, v0, Lcom/mukesh/OtpView;->a0:Landroid/graphics/drawable/Drawable;

    .line 133
    .line 134
    iget-object v14, v0, Lcom/mukesh/OtpView;->K:Landroid/graphics/RectF;

    .line 135
    .line 136
    const/high16 v15, 0x40000000    # 2.0f

    .line 137
    .line 138
    if-nez v4, :cond_8

    .line 139
    .line 140
    move/from16 v16, v15

    .line 141
    .line 142
    goto :goto_7

    .line 143
    :cond_8
    iget v4, v0, Lcom/mukesh/OtpView;->I:I

    .line 144
    .line 145
    int-to-float v4, v4

    .line 146
    div-float/2addr v4, v15

    .line 147
    iget v5, v14, Landroid/graphics/RectF;->left:F

    .line 148
    .line 149
    sub-float/2addr v5, v4

    .line 150
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    iget v9, v14, Landroid/graphics/RectF;->top:F

    .line 155
    .line 156
    sub-float/2addr v9, v4

    .line 157
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    move/from16 v16, v15

    .line 162
    .line 163
    iget v15, v14, Landroid/graphics/RectF;->right:F

    .line 164
    .line 165
    add-float/2addr v15, v4

    .line 166
    invoke-static {v15}, Ljava/lang/Math;->round(F)I

    .line 167
    .line 168
    .line 169
    move-result v15

    .line 170
    iget v8, v14, Landroid/graphics/RectF;->bottom:F

    .line 171
    .line 172
    add-float/2addr v8, v4

    .line 173
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    iget-object v8, v0, Lcom/mukesh/OtpView;->a0:Landroid/graphics/drawable/Drawable;

    .line 178
    .line 179
    invoke-virtual {v8, v5, v9, v15, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 180
    .line 181
    .line 182
    const/4 v4, 0x2

    .line 183
    if-eq v12, v4, :cond_a

    .line 184
    .line 185
    iget-object v4, v0, Lcom/mukesh/OtpView;->a0:Landroid/graphics/drawable/Drawable;

    .line 186
    .line 187
    if-eqz v3, :cond_9

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_9
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    :goto_6
    invoke-virtual {v4, v3}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 195
    .line 196
    .line 197
    :cond_a
    iget-object v3, v0, Lcom/mukesh/OtpView;->a0:Landroid/graphics/drawable/Drawable;

    .line 198
    .line 199
    invoke-virtual {v3, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 200
    .line 201
    .line 202
    :goto_7
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 203
    .line 204
    .line 205
    if-eqz v2, :cond_b

    .line 206
    .line 207
    iget-boolean v2, v0, Lcom/mukesh/OtpView;->S:Z

    .line 208
    .line 209
    if-eqz v2, :cond_b

    .line 210
    .line 211
    iget-object v2, v0, Lcom/mukesh/OtpView;->N:Landroid/graphics/PointF;

    .line 212
    .line 213
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 214
    .line 215
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 216
    .line 217
    iget v4, v0, Lcom/mukesh/OtpView;->T:F

    .line 218
    .line 219
    div-float v4, v4, v16

    .line 220
    .line 221
    sub-float/2addr v2, v4

    .line 222
    invoke-virtual {v6}, Landroid/graphics/Paint;->getColor()I

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    invoke-virtual {v6}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 227
    .line 228
    .line 229
    move-result v9

    .line 230
    iget v4, v0, Lcom/mukesh/OtpView;->V:I

    .line 231
    .line 232
    invoke-virtual {v6, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 233
    .line 234
    .line 235
    iget v4, v0, Lcom/mukesh/OtpView;->U:I

    .line 236
    .line 237
    int-to-float v4, v4

    .line 238
    invoke-virtual {v6, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 239
    .line 240
    .line 241
    iget v4, v0, Lcom/mukesh/OtpView;->T:F

    .line 242
    .line 243
    add-float v5, v2, v4

    .line 244
    .line 245
    move v4, v3

    .line 246
    move/from16 v17, v3

    .line 247
    .line 248
    move v3, v2

    .line 249
    move/from16 v2, v17

    .line 250
    .line 251
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 252
    .line 253
    .line 254
    move-object v15, v6

    .line 255
    move-object v6, v1

    .line 256
    invoke-virtual {v15, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v15, v9}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 260
    .line 261
    .line 262
    goto :goto_8

    .line 263
    :cond_b
    move-object v15, v6

    .line 264
    move-object v6, v1

    .line 265
    :goto_8
    if-nez v12, :cond_d

    .line 266
    .line 267
    invoke-virtual {v0}, Lp/t;->getText()Landroid/text/Editable;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    if-eqz v1, :cond_c

    .line 272
    .line 273
    iget-boolean v1, v0, Lcom/mukesh/OtpView;->b0:Z

    .line 274
    .line 275
    if-eqz v1, :cond_c

    .line 276
    .line 277
    invoke-virtual {v0}, Lp/t;->getText()Landroid/text/Editable;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    if-ge v11, v1, :cond_c

    .line 286
    .line 287
    goto :goto_9

    .line 288
    :cond_c
    invoke-virtual {v6, v13, v15}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 289
    .line 290
    .line 291
    :goto_9
    const/4 v8, 0x1

    .line 292
    goto/16 :goto_c

    .line 293
    .line 294
    :cond_d
    const/4 v1, 0x1

    .line 295
    if-ne v12, v1, :cond_13

    .line 296
    .line 297
    invoke-virtual {v0}, Lp/t;->getText()Landroid/text/Editable;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    if-eqz v1, :cond_e

    .line 302
    .line 303
    iget-boolean v1, v0, Lcom/mukesh/OtpView;->b0:Z

    .line 304
    .line 305
    if-eqz v1, :cond_e

    .line 306
    .line 307
    invoke-virtual {v0}, Lp/t;->getText()Landroid/text/Editable;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    if-ge v11, v1, :cond_e

    .line 316
    .line 317
    goto :goto_9

    .line 318
    :cond_e
    iget v1, v0, Lcom/mukesh/OtpView;->D:I

    .line 319
    .line 320
    if-nez v1, :cond_11

    .line 321
    .line 322
    iget v1, v0, Lcom/mukesh/OtpView;->z:I

    .line 323
    .line 324
    const/4 v8, 0x1

    .line 325
    if-le v1, v8, :cond_12

    .line 326
    .line 327
    if-nez v11, :cond_f

    .line 328
    .line 329
    move v4, v8

    .line 330
    :goto_a
    const/4 v5, 0x0

    .line 331
    goto :goto_b

    .line 332
    :cond_f
    add-int/lit8 v1, v1, -0x1

    .line 333
    .line 334
    if-ne v11, v1, :cond_10

    .line 335
    .line 336
    move v5, v8

    .line 337
    const/4 v4, 0x0

    .line 338
    goto :goto_b

    .line 339
    :cond_10
    const/4 v4, 0x0

    .line 340
    goto :goto_a

    .line 341
    :cond_11
    const/4 v8, 0x1

    .line 342
    :cond_12
    move v4, v8

    .line 343
    move v5, v4

    .line 344
    :goto_b
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 345
    .line 346
    invoke-virtual {v15, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 347
    .line 348
    .line 349
    iget v1, v0, Lcom/mukesh/OtpView;->I:I

    .line 350
    .line 351
    int-to-float v1, v1

    .line 352
    const/high16 v2, 0x41200000    # 10.0f

    .line 353
    .line 354
    div-float/2addr v1, v2

    .line 355
    invoke-virtual {v15, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 356
    .line 357
    .line 358
    iget v1, v0, Lcom/mukesh/OtpView;->I:I

    .line 359
    .line 360
    int-to-float v1, v1

    .line 361
    div-float v1, v1, v16

    .line 362
    .line 363
    move v2, v1

    .line 364
    iget-object v1, v0, Lcom/mukesh/OtpView;->L:Landroid/graphics/RectF;

    .line 365
    .line 366
    iget v3, v14, Landroid/graphics/RectF;->left:F

    .line 367
    .line 368
    sub-float/2addr v3, v2

    .line 369
    iget v9, v14, Landroid/graphics/RectF;->bottom:F

    .line 370
    .line 371
    sub-float v12, v9, v2

    .line 372
    .line 373
    iget v14, v14, Landroid/graphics/RectF;->right:F

    .line 374
    .line 375
    add-float/2addr v14, v2

    .line 376
    add-float/2addr v9, v2

    .line 377
    invoke-virtual {v1, v3, v12, v14, v9}, Landroid/graphics/RectF;->set(FFFF)V

    .line 378
    .line 379
    .line 380
    iget v2, v0, Lcom/mukesh/OtpView;->C:I

    .line 381
    .line 382
    int-to-float v2, v2

    .line 383
    move v3, v2

    .line 384
    invoke-virtual/range {v0 .. v5}, Lcom/mukesh/OtpView;->n(Landroid/graphics/RectF;FFZZ)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v6, v13, v15}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 388
    .line 389
    .line 390
    goto :goto_c

    .line 391
    :cond_13
    move v8, v1

    .line 392
    :goto_c
    if-eqz v7, :cond_15

    .line 393
    .line 394
    iget v1, v0, Lcom/mukesh/OtpView;->z:I

    .line 395
    .line 396
    sub-int/2addr v1, v11

    .line 397
    invoke-virtual {v0}, Lp/t;->getText()Landroid/text/Editable;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 402
    .line 403
    .line 404
    move-result v2

    .line 405
    if-lt v2, v1, :cond_14

    .line 406
    .line 407
    invoke-virtual {v0, v6, v11}, Lcom/mukesh/OtpView;->d(Landroid/graphics/Canvas;I)V

    .line 408
    .line 409
    .line 410
    goto :goto_d

    .line 411
    :cond_14
    invoke-virtual {v0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    if-nez v1, :cond_17

    .line 420
    .line 421
    invoke-virtual {v0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    iget v2, v0, Lcom/mukesh/OtpView;->z:I

    .line 430
    .line 431
    if-ne v1, v2, :cond_17

    .line 432
    .line 433
    invoke-virtual {v0, v6, v11}, Lcom/mukesh/OtpView;->c(Landroid/graphics/Canvas;I)V

    .line 434
    .line 435
    .line 436
    goto :goto_d

    .line 437
    :cond_15
    invoke-virtual {v0}, Lp/t;->getText()Landroid/text/Editable;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 442
    .line 443
    .line 444
    move-result v1

    .line 445
    if-le v1, v11, :cond_16

    .line 446
    .line 447
    invoke-virtual {v0, v6, v11}, Lcom/mukesh/OtpView;->d(Landroid/graphics/Canvas;I)V

    .line 448
    .line 449
    .line 450
    goto :goto_d

    .line 451
    :cond_16
    invoke-virtual {v0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    if-nez v1, :cond_17

    .line 460
    .line 461
    invoke-virtual {v0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 466
    .line 467
    .line 468
    move-result v1

    .line 469
    iget v2, v0, Lcom/mukesh/OtpView;->z:I

    .line 470
    .line 471
    if-ne v1, v2, :cond_17

    .line 472
    .line 473
    invoke-virtual {v0, v6, v11}, Lcom/mukesh/OtpView;->c(Landroid/graphics/Canvas;I)V

    .line 474
    .line 475
    .line 476
    :cond_17
    :goto_d
    add-int/lit8 v11, v11, 0x1

    .line 477
    .line 478
    move-object v1, v6

    .line 479
    move-object v6, v15

    .line 480
    goto/16 :goto_2

    .line 481
    .line 482
    :cond_18
    move-object v15, v6

    .line 483
    move-object v6, v1

    .line 484
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 485
    .line 486
    .line 487
    move-result v1

    .line 488
    if-eqz v1, :cond_1b

    .line 489
    .line 490
    invoke-virtual {v0}, Lp/t;->getText()Landroid/text/Editable;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    if-eqz v1, :cond_1b

    .line 495
    .line 496
    invoke-virtual {v0}, Lp/t;->getText()Landroid/text/Editable;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    iget v2, v0, Lcom/mukesh/OtpView;->z:I

    .line 505
    .line 506
    if-eq v1, v2, :cond_1b

    .line 507
    .line 508
    if-nez v12, :cond_1b

    .line 509
    .line 510
    invoke-virtual {v0}, Lp/t;->getText()Landroid/text/Editable;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 515
    .line 516
    .line 517
    move-result v1

    .line 518
    invoke-virtual {v0, v1}, Lcom/mukesh/OtpView;->l(I)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v0}, Lcom/mukesh/OtpView;->i()V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v0, v1}, Lcom/mukesh/OtpView;->m(I)V

    .line 525
    .line 526
    .line 527
    iget-object v2, v0, Lcom/mukesh/OtpView;->G:Landroid/content/res/ColorStateList;

    .line 528
    .line 529
    if-eqz v2, :cond_19

    .line 530
    .line 531
    iget v4, v0, Lcom/mukesh/OtpView;->H:I

    .line 532
    .line 533
    invoke-virtual {v2, v3, v4}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 534
    .line 535
    .line 536
    move-result v2

    .line 537
    goto :goto_e

    .line 538
    :cond_19
    iget v2, v0, Lcom/mukesh/OtpView;->H:I

    .line 539
    .line 540
    :goto_e
    invoke-virtual {v15, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v0}, Lp/t;->getText()Landroid/text/Editable;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    if-eqz v2, :cond_1a

    .line 548
    .line 549
    iget-boolean v2, v0, Lcom/mukesh/OtpView;->b0:Z

    .line 550
    .line 551
    if-eqz v2, :cond_1a

    .line 552
    .line 553
    invoke-virtual {v0}, Lp/t;->getText()Landroid/text/Editable;

    .line 554
    .line 555
    .line 556
    move-result-object v2

    .line 557
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 558
    .line 559
    .line 560
    move-result v2

    .line 561
    if-ge v1, v2, :cond_1a

    .line 562
    .line 563
    goto :goto_f

    .line 564
    :cond_1a
    invoke-virtual {v6, v13, v15}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 565
    .line 566
    .line 567
    :cond_1b
    :goto_f
    invoke-virtual {v6}, Landroid/graphics/Canvas;->restore()V

    .line 568
    .line 569
    .line 570
    return-void
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

.method public final onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/widget/EditText;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/mukesh/OtpView;->h()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
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

.method public final onMeasure(II)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    iget v2, p0, Lcom/mukesh/OtpView;->B:I

    .line 18
    .line 19
    const/high16 v3, 0x40000000    # 2.0f

    .line 20
    .line 21
    if-ne v0, v3, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget p1, p0, Lcom/mukesh/OtpView;->z:I

    .line 25
    .line 26
    add-int/lit8 v0, p1, -0x1

    .line 27
    .line 28
    iget v4, p0, Lcom/mukesh/OtpView;->D:I

    .line 29
    .line 30
    mul-int/2addr v0, v4

    .line 31
    iget v4, p0, Lcom/mukesh/OtpView;->A:I

    .line 32
    .line 33
    mul-int/2addr p1, v4

    .line 34
    add-int/2addr p1, v0

    .line 35
    sget-object v0, LU/U;->a:Ljava/util/WeakHashMap;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    add-int/2addr v0, p1

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    add-int/2addr p1, v0

    .line 47
    iget v0, p0, Lcom/mukesh/OtpView;->D:I

    .line 48
    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    iget v0, p0, Lcom/mukesh/OtpView;->z:I

    .line 52
    .line 53
    add-int/lit8 v0, v0, -0x1

    .line 54
    .line 55
    iget v4, p0, Lcom/mukesh/OtpView;->I:I

    .line 56
    .line 57
    mul-int/2addr v0, v4

    .line 58
    sub-int/2addr p1, v0

    .line 59
    :cond_1
    :goto_0
    if-ne v1, v3, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    add-int/2addr p2, v2

    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    add-int/2addr p2, v0

    .line 72
    :goto_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 73
    .line 74
    .line 75
    return-void
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
.end method

.method public final onScreenStateChanged(I)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/widget/EditText;->onScreenStateChanged(I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne p1, v1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lcom/mukesh/OtpView;->Q:LM2/P;

    .line 9
    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    iput-boolean v0, p1, LM2/P;->t:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/mukesh/OtpView;->h()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    if-nez p1, :cond_2

    .line 19
    .line 20
    iget-object p1, p0, Lcom/mukesh/OtpView;->Q:LM2/P;

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-boolean v2, p1, LM2/P;->t:Z

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    iget-object v2, p1, LM2/P;->u:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Lcom/mukesh/OtpView;

    .line 31
    .line 32
    invoke-virtual {v2, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    iput-boolean v1, p1, LM2/P;->t:Z

    .line 36
    .line 37
    :cond_1
    invoke-virtual {p0, v0}, Lcom/mukesh/OtpView;->g(Z)V

    .line 38
    .line 39
    .line 40
    :cond_2
    return-void
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
.end method

.method public final onSelectionChanged(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/EditText;->onSelectionChanged(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eq p2, p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
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

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mukesh/OtpView;->O:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eq p2, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lp/t;->getText()Landroid/text/Editable;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-virtual {p0, p2}, Landroid/widget/EditText;->setSelection(I)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    iget v1, p0, Lcom/mukesh/OtpView;->z:I

    .line 31
    .line 32
    if-ne p2, v1, :cond_4

    .line 33
    .line 34
    iget-object p2, p0, Lcom/mukesh/OtpView;->e0:LO4/b;

    .line 35
    .line 36
    if-eqz p2, :cond_4

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p2, LE4/B;

    .line 43
    .line 44
    sget v1, Lcom/kcstream/cing/activity/PasscodeActivity;->W:I

    .line 45
    .line 46
    const-string v1, "this$0"

    .line 47
    .line 48
    iget-object v2, p2, LE4/B;->u:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lcom/kcstream/cing/activity/PasscodeActivity;

    .line 51
    .line 52
    invoke-static {v2, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-string v1, "is_setup_passcode"

    .line 56
    .line 57
    iget-object p2, p2, LE4/B;->t:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p2, Landroid/content/Intent;

    .line 60
    .line 61
    invoke-virtual {p2, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    const-string v1, "key_passcode"

    .line 66
    .line 67
    if-eqz p2, :cond_1

    .line 68
    .line 69
    invoke-virtual {v2}, LK4/f;->y()Landroid/content/SharedPreferences;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-interface {p2, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 78
    .line 79
    .line 80
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {v2}, LK4/f;->y()Landroid/content/SharedPreferences;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    const/4 v3, 0x0

    .line 92
    invoke-interface {p2, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-static {p1, p2}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    const/4 p2, 0x0

    .line 105
    if-eqz p1, :cond_3

    .line 106
    .line 107
    invoke-virtual {v2}, LK4/f;->y()Landroid/content/SharedPreferences;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    const-string v1, "unlocked"

    .line 116
    .line 117
    const/4 v3, 0x1

    .line 118
    invoke-interface {p1, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 119
    .line 120
    .line 121
    const-string v4, "app_locked"

    .line 122
    .line 123
    invoke-interface {p1, v4}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 124
    .line 125
    .line 126
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 127
    .line 128
    .line 129
    sget-object p1, LHa/a;->a:Lza/c;

    .line 130
    .line 131
    new-array p2, p2, [Ljava/lang/Object;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-static {p2}, Lza/c;->k([Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    new-instance p1, Landroid/content/Intent;

    .line 140
    .line 141
    const-string p2, "com.kcstream.cing.broadcast.guard"

    .line 142
    .line 143
    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, LK4/f;->y()Landroid/content/SharedPreferences;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    const-string p2, "is_splash"

    .line 157
    .line 158
    invoke-interface {p1, p2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-nez p1, :cond_2

    .line 163
    .line 164
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 165
    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_2
    const-class p1, Lcom/kcstream/cing/activity/MainActivity;

    .line 169
    .line 170
    invoke-static {v2, p1}, LD3/b;->H(Landroid/app/Activity;Ljava/lang/Class;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 174
    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_3
    sget-object p1, LHa/a;->a:Lza/c;

    .line 178
    .line 179
    new-array v1, p2, [Ljava/lang/Object;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-static {v1}, Lza/c;->k([Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    const-string p1, "PIN Salah"

    .line 188
    .line 189
    invoke-static {v2, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 194
    .line 195
    .line 196
    :cond_4
    :goto_0
    invoke-virtual {p0}, Lcom/mukesh/OtpView;->h()V

    .line 197
    .line 198
    .line 199
    iget-boolean p1, p0, Lcom/mukesh/OtpView;->P:Z

    .line 200
    .line 201
    if-eqz p1, :cond_5

    .line 202
    .line 203
    sub-int/2addr p4, p3

    .line 204
    if-lez p4, :cond_5

    .line 205
    .line 206
    if-eqz v0, :cond_5

    .line 207
    .line 208
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 212
    .line 213
    .line 214
    :cond_5
    return-void
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

.method public setAnimationEnable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/mukesh/OtpView;->P:Z

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

.method public setCursorColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mukesh/OtpView;->V:I

    .line 2
    .line 3
    iget-boolean p1, p0, Lcom/mukesh/OtpView;->R:Z

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-virtual {p0, p1}, Lcom/mukesh/OtpView;->g(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
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

.method public setCursorVisible(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/mukesh/OtpView;->R:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/mukesh/OtpView;->R:Z

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/mukesh/OtpView;->g(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/mukesh/OtpView;->h()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
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

.method public setCursorWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mukesh/OtpView;->U:I

    .line 2
    .line 3
    iget-boolean p1, p0, Lcom/mukesh/OtpView;->R:Z

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-virtual {p0, p1}, Lcom/mukesh/OtpView;->g(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
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

.method public setHideLineWhenFilled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/mukesh/OtpView;->b0:Z

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

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/mukesh/OtpView;->W:I

    .line 3
    .line 4
    iput-object p1, p0, Lcom/mukesh/OtpView;->a0:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public setItemBackgroundColor(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/mukesh/OtpView;->a0:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    instance-of v1, v0, Landroid/graphics/drawable/ColorDrawable;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/graphics/drawable/ColorDrawable;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/ColorDrawable;->setColor(I)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput p1, p0, Lcom/mukesh/OtpView;->W:I

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/mukesh/OtpView;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 26
    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setItemBackgroundResources(I)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lcom/mukesh/OtpView;->W:I

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sget-object v2, LK/o;->a:Ljava/lang/ThreadLocal;

    .line 21
    .line 22
    invoke-static {v0, p1, v1}, LK/i;->a(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/mukesh/OtpView;->a0:Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/mukesh/OtpView;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 29
    .line 30
    .line 31
    iput p1, p0, Lcom/mukesh/OtpView;->W:I

    .line 32
    .line 33
    return-void
.end method

.method public setItemCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mukesh/OtpView;->z:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/mukesh/OtpView;->setMaxLength(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public setItemHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mukesh/OtpView;->B:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/mukesh/OtpView;->k()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public setItemRadius(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mukesh/OtpView;->C:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/mukesh/OtpView;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public setItemSpacing(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mukesh/OtpView;->D:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

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
.end method

.method public setItemWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mukesh/OtpView;->A:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/mukesh/OtpView;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public setLineColor(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/mukesh/OtpView;->G:Landroid/content/res/ColorStateList;

    .line 2
    invoke-virtual {p0}, Lcom/mukesh/OtpView;->j()V

    return-void
.end method

.method public setLineColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 3
    iput-object p1, p0, Lcom/mukesh/OtpView;->G:Landroid/content/res/ColorStateList;

    .line 4
    invoke-virtual {p0}, Lcom/mukesh/OtpView;->j()V

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Color cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setLineWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mukesh/OtpView;->I:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/mukesh/OtpView;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public setMaskingChar(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/mukesh/OtpView;->d0:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

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
.end method

.method public setOtpCompletionListener(LO4/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/mukesh/OtpView;->e0:LO4/b;

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

.method public setTextSize(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/EditText;->setTextSize(F)V

    .line 2
    invoke-virtual {p0}, Lcom/mukesh/OtpView;->k()V

    return-void
.end method

.method public final setTextSize(IF)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroid/widget/EditText;->setTextSize(IF)V

    .line 4
    invoke-virtual {p0}, Lcom/mukesh/OtpView;->k()V

    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/mukesh/OtpView;->F:Landroid/text/TextPaint;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    .line 13
    .line 14
    .line 15
    :cond_0
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
