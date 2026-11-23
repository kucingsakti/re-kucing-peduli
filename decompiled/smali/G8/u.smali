.class public final LG8/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG8/e;


# instance fields
.field public final a:LG8/e;

.field public final b:Z

.field public final c:LA1/h;


# direct methods
.method public constructor <init>(LG8/e;LL8/t;Z)V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "descriptor"

    .line 4
    .line 5
    invoke-static {p2, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LG8/u;->a:LG8/e;

    .line 12
    .line 13
    iput-boolean p3, p0, LG8/u;->b:Z

    .line 14
    .line 15
    invoke-interface {p2}, LL8/b;->w()LA9/y;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-static {p3}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p3}, LC4/a;->G(LA9/y;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz p3, :cond_0

    .line 28
    .line 29
    :try_start_0
    const-string v3, "box-impl"

    .line 30
    .line 31
    invoke-static {p3, p2}, LC4/a;->z(Ljava/lang/Class;LL8/c;)Ljava/lang/reflect/Method;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    new-array v5, v0, [Ljava/lang/Class;

    .line 40
    .line 41
    aput-object v4, v5, v1

    .line 42
    .line 43
    invoke-virtual {p3, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    const-string v4, "{\n        getDeclaredMet\u2026riptor).returnType)\n    }"

    .line 48
    .line 49
    invoke-static {v3, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_0
    new-instance p1, LF8/p0;

    .line 54
    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v2, "No box method found in inline class: "

    .line 58
    .line 59
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p3, " (calling "

    .line 66
    .line 67
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const/16 p2, 0x29

    .line 74
    .line 75
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-direct {p1, p2, v1}, LF8/p0;-><init>(Ljava/lang/String;I)V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_0
    move-object v3, v2

    .line 87
    :goto_0
    invoke-static {p2}, Lm9/g;->a(LL8/c;)Z

    .line 88
    .line 89
    .line 90
    move-result p3

    .line 91
    if-eqz p3, :cond_1

    .line 92
    .line 93
    new-instance p1, LA1/h;

    .line 94
    .line 95
    sget-object p2, LB8/c;->v:LB8/c;

    .line 96
    .line 97
    new-array p3, v1, [Ljava/lang/reflect/Method;

    .line 98
    .line 99
    invoke-direct {p1, p2, p3, v3}, LA1/h;-><init>(LB8/c;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_9

    .line 103
    .line 104
    :cond_1
    instance-of p3, p1, LG8/r;

    .line 105
    .line 106
    const-string v4, "descriptor.containingDeclaration"

    .line 107
    .line 108
    const/4 v5, -0x1

    .line 109
    if-eqz p3, :cond_2

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_2
    instance-of p3, p2, LL8/i;

    .line 113
    .line 114
    if-eqz p3, :cond_4

    .line 115
    .line 116
    instance-of p1, p1, LG8/d;

    .line 117
    .line 118
    if-eqz p1, :cond_3

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    :goto_1
    move v5, v1

    .line 122
    goto :goto_2

    .line 123
    :cond_4
    invoke-interface {p2}, LL8/b;->G()LO8/x;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    if-eqz p3, :cond_3

    .line 128
    .line 129
    instance-of p1, p1, LG8/d;

    .line 130
    .line 131
    if-nez p1, :cond_3

    .line 132
    .line 133
    invoke-interface {p2}, LL8/j;->v()LL8/j;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-static {p1, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-static {p1}, Lm9/g;->b(LL8/j;)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-eqz p1, :cond_5

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_5
    move v5, v0

    .line 148
    :goto_2
    new-instance p1, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-interface {p2}, LL8/b;->R()LO8/x;

    .line 154
    .line 155
    .line 156
    move-result-object p3

    .line 157
    if-eqz p3, :cond_6

    .line 158
    .line 159
    invoke-virtual {p3}, LO8/x;->getType()LA9/y;

    .line 160
    .line 161
    .line 162
    move-result-object p3

    .line 163
    goto :goto_3

    .line 164
    :cond_6
    move-object p3, v2

    .line 165
    :goto_3
    if-eqz p3, :cond_7

    .line 166
    .line 167
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_7
    instance-of p3, p2, LL8/i;

    .line 172
    .line 173
    if-eqz p3, :cond_8

    .line 174
    .line 175
    move-object p3, p2

    .line 176
    check-cast p3, LL8/i;

    .line 177
    .line 178
    invoke-interface {p3}, LL8/i;->Q()LL8/e;

    .line 179
    .line 180
    .line 181
    move-result-object p3

    .line 182
    const-string v4, "descriptor.constructedClass"

    .line 183
    .line 184
    invoke-static {p3, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-interface {p3}, LL8/h;->r()Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-eqz v4, :cond_9

    .line 192
    .line 193
    invoke-interface {p3}, LL8/j;->v()LL8/j;

    .line 194
    .line 195
    .line 196
    move-result-object p3

    .line 197
    const-string v4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    .line 198
    .line 199
    invoke-static {p3, v4}, Lv8/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    check-cast p3, LL8/e;

    .line 203
    .line 204
    invoke-interface {p3}, LL8/e;->p()LA9/D;

    .line 205
    .line 206
    .line 207
    move-result-object p3

    .line 208
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_8
    invoke-interface {p2}, LL8/j;->v()LL8/j;

    .line 213
    .line 214
    .line 215
    move-result-object p3

    .line 216
    invoke-static {p3, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    instance-of v4, p3, LL8/e;

    .line 220
    .line 221
    if-eqz v4, :cond_9

    .line 222
    .line 223
    invoke-static {p3}, Lm9/g;->b(LL8/j;)Z

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    if-eqz v4, :cond_9

    .line 228
    .line 229
    check-cast p3, LL8/e;

    .line 230
    .line 231
    invoke-interface {p3}, LL8/e;->p()LA9/D;

    .line 232
    .line 233
    .line 234
    move-result-object p3

    .line 235
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    :cond_9
    :goto_4
    invoke-interface {p2}, LL8/b;->H0()Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object p3

    .line 242
    const-string v4, "descriptor.valueParameters"

    .line 243
    .line 244
    invoke-static {p3, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    check-cast p3, Ljava/lang/Iterable;

    .line 248
    .line 249
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 250
    .line 251
    .line 252
    move-result-object p3

    .line 253
    :goto_5
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    if-eqz v4, :cond_a

    .line 258
    .line 259
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    check-cast v4, LO8/U;

    .line 264
    .line 265
    check-cast v4, LO8/V;

    .line 266
    .line 267
    invoke-virtual {v4}, LO8/V;->getType()LA9/y;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_a
    iget-boolean p3, p0, LG8/u;->b:Z

    .line 276
    .line 277
    if-eqz p3, :cond_b

    .line 278
    .line 279
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 280
    .line 281
    .line 282
    move-result p3

    .line 283
    add-int/lit8 p3, p3, 0x1f

    .line 284
    .line 285
    div-int/lit8 p3, p3, 0x20

    .line 286
    .line 287
    add-int/2addr p3, v0

    .line 288
    goto :goto_6

    .line 289
    :cond_b
    move p3, v1

    .line 290
    :goto_6
    invoke-interface {p2}, LL8/t;->t()Z

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    add-int/2addr v4, p3

    .line 295
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 296
    .line 297
    .line 298
    move-result p3

    .line 299
    add-int/2addr p3, v5

    .line 300
    add-int/2addr p3, v4

    .line 301
    invoke-static {p0}, LC3/b;->o(LG8/e;)I

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    if-ne v4, p3, :cond_e

    .line 306
    .line 307
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 312
    .line 313
    .line 314
    move-result v6

    .line 315
    add-int/2addr v6, v5

    .line 316
    invoke-static {v4, v6}, Ls3/a;->w(II)LB8/c;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    new-array v6, p3, [Ljava/lang/reflect/Method;

    .line 321
    .line 322
    :goto_7
    if-ge v1, p3, :cond_d

    .line 323
    .line 324
    iget v7, v4, LB8/a;->s:I

    .line 325
    .line 326
    iget v8, v4, LB8/a;->t:I

    .line 327
    .line 328
    if-gt v1, v8, :cond_c

    .line 329
    .line 330
    if-gt v7, v1, :cond_c

    .line 331
    .line 332
    sub-int v7, v1, v5

    .line 333
    .line 334
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v7

    .line 338
    check-cast v7, LA9/y;

    .line 339
    .line 340
    invoke-static {v7}, LC4/a;->G(LA9/y;)Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    if-eqz v7, :cond_c

    .line 345
    .line 346
    invoke-static {v7, p2}, LC4/a;->z(Ljava/lang/Class;LL8/c;)Ljava/lang/reflect/Method;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    goto :goto_8

    .line 351
    :cond_c
    move-object v7, v2

    .line 352
    :goto_8
    aput-object v7, v6, v1

    .line 353
    .line 354
    add-int/2addr v1, v0

    .line 355
    goto :goto_7

    .line 356
    :cond_d
    new-instance p1, LA1/h;

    .line 357
    .line 358
    invoke-direct {p1, v4, v6, v3}, LA1/h;-><init>(LB8/c;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 359
    .line 360
    .line 361
    :goto_9
    iput-object p1, p0, LG8/u;->c:LA1/h;

    .line 362
    .line 363
    return-void

    .line 364
    :cond_e
    new-instance p1, LF8/p0;

    .line 365
    .line 366
    new-instance v0, Ljava/lang/StringBuilder;

    .line 367
    .line 368
    const-string v2, "Inconsistent number of parameters in the descriptor and Java reflection object: "

    .line 369
    .line 370
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    invoke-static {p0}, LC3/b;->o(LG8/e;)I

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    const-string v2, " != "

    .line 381
    .line 382
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    const-string p3, "\nCalling: "

    .line 389
    .line 390
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    const-string p2, "\nParameter types: "

    .line 397
    .line 398
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    iget-object p2, p0, LG8/u;->a:LG8/e;

    .line 402
    .line 403
    invoke-interface {p2}, LG8/e;->x()Ljava/util/List;

    .line 404
    .line 405
    .line 406
    move-result-object p2

    .line 407
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    const-string p2, ")\nDefault: "

    .line 411
    .line 412
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    iget-boolean p2, p0, LG8/u;->b:Z

    .line 416
    .line 417
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object p2

    .line 424
    invoke-direct {p1, p2, v1}, LF8/p0;-><init>(Ljava/lang/String;I)V

    .line 425
    .line 426
    .line 427
    throw p1
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


# virtual methods
.method public final v([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "args"

    .line 4
    .line 5
    invoke-static {p1, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, LG8/u;->c:LA1/h;

    .line 9
    .line 10
    iget-object v3, v2, LA1/h;->t:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, LB8/c;

    .line 13
    .line 14
    array-length v4, p1

    .line 15
    invoke-static {p1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const-string v5, "copyOf(this, size)"

    .line 20
    .line 21
    invoke-static {v4, v5}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget v5, v3, LB8/a;->s:I

    .line 25
    .line 26
    iget v3, v3, LB8/a;->t:I

    .line 27
    .line 28
    if-gt v5, v3, :cond_2

    .line 29
    .line 30
    :goto_0
    iget-object v6, v2, LA1/h;->u:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v6, [Ljava/lang/reflect/Method;

    .line 33
    .line 34
    aget-object v6, v6, v5

    .line 35
    .line 36
    aget-object v7, p1, v5

    .line 37
    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    if-eqz v7, :cond_0

    .line 41
    .line 42
    new-array v8, v1, [Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v6, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    const-string v7, "method.returnType"

    .line 54
    .line 55
    invoke-static {v6, v7}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v6}, LF8/y0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    :cond_1
    :goto_1
    aput-object v7, v4, v5

    .line 63
    .line 64
    if-eq v5, v3, :cond_2

    .line 65
    .line 66
    add-int/2addr v5, v0

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    iget-object p1, p0, LG8/u;->a:LG8/e;

    .line 69
    .line 70
    invoke-interface {p1, v4}, LG8/e;->v([Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object v2, v2, LA1/h;->v:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Ljava/lang/reflect/Method;

    .line 77
    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    new-array v0, v0, [Ljava/lang/Object;

    .line 82
    .line 83
    aput-object p1, v0, v1

    .line 84
    .line 85
    invoke-virtual {v2, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-nez v0, :cond_3

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    return-object v0

    .line 93
    :cond_4
    :goto_2
    return-object p1
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
.end method

.method public final w()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, LG8/u;->a:LG8/e;

    .line 2
    .line 3
    invoke-interface {v0}, LG8/e;->w()Ljava/lang/reflect/Type;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final x()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LG8/u;->a:LG8/e;

    .line 2
    .line 3
    invoke-interface {v0}, LG8/e;->x()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final y()Ljava/lang/reflect/Member;
    .locals 1

    .line 1
    iget-object v0, p0, LG8/u;->a:LG8/e;

    .line 2
    .line 3
    invoke-interface {v0}, LG8/e;->y()Ljava/lang/reflect/Member;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
