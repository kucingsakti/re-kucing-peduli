.class public final synthetic LW1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field public final synthetic a:Lcom/ferfalk/simplesearchview/SimpleSearchView;


# direct methods
.method public synthetic constructor <init>(Lcom/ferfalk/simplesearchview/SimpleSearchView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW1/b;->a:Lcom/ferfalk/simplesearchview/SimpleSearchView;

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 8

    .line 1
    const/4 p1, 0x1

    .line 2
    sget p2, Lcom/ferfalk/simplesearchview/SimpleSearchView;->O:I

    .line 3
    .line 4
    iget-object p2, p0, LW1/b;->a:Lcom/ferfalk/simplesearchview/SimpleSearchView;

    .line 5
    .line 6
    iget-object p3, p2, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 7
    .line 8
    invoke-virtual {p3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    if-eqz p3, :cond_5

    .line 13
    .line 14
    invoke-static {p3}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-lez v0, :cond_5

    .line 19
    .line 20
    iget-object v0, p2, Lcom/ferfalk/simplesearchview/SimpleSearchView;->K:LW1/h;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    invoke-interface {p3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast v0, LA1/r;

    .line 31
    .line 32
    const-string p3, "query"

    .line 33
    .line 34
    invoke-static {p2, p3}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object p3, v0, LA1/r;->t:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p3, Lcom/kcstream/cing/activity/SearchActivity;

    .line 40
    .line 41
    iget-object v0, p3, Lcom/kcstream/cing/activity/SearchActivity;->c0:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/16 v3, 0x8

    .line 48
    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    iget-object v0, p3, Lcom/kcstream/cing/activity/SearchActivity;->c0:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-ne v0, v3, :cond_0

    .line 58
    .line 59
    iget-object v0, p3, Lcom/kcstream/cing/activity/SearchActivity;->c0:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 62
    .line 63
    .line 64
    :cond_0
    iget-object v0, p3, Lcom/kcstream/cing/activity/SearchActivity;->c0:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    iget-object v0, p3, Lcom/kcstream/cing/activity/SearchActivity;->c0:Ljava/util/ArrayList;

    .line 70
    .line 71
    iget-object v4, p3, Lcom/kcstream/cing/activity/SearchActivity;->b0:Lcom/google/gson/i;

    .line 72
    .line 73
    invoke-virtual {v4, v0}, Lcom/google/gson/i;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p3}, LK4/f;->y()Landroid/content/SharedPreferences;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    const-string v5, "saved_search"

    .line 86
    .line 87
    invoke-interface {v4, v5, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 88
    .line 89
    .line 90
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 91
    .line 92
    .line 93
    :cond_1
    sget-object v0, Lcom/kcstream/cing/activity/SearchActivity;->f0:[LC8/u;

    .line 94
    .line 95
    aget-object v4, v0, v2

    .line 96
    .line 97
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    iget-object v6, p3, Lcom/kcstream/cing/activity/SearchActivity;->X:Li3/b;

    .line 102
    .line 103
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    const-string v7, "property"

    .line 107
    .line 108
    invoke-static {v4, v7}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iput-object v5, v6, Li3/b;->t:Ljava/lang/Object;

    .line 112
    .line 113
    aget-object v0, v0, p1

    .line 114
    .line 115
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    iget-object v5, p3, Lcom/kcstream/cing/activity/SearchActivity;->Z:Li3/b;

    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-static {v0, v7}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iput-object v4, v5, Li3/b;->t:Ljava/lang/Object;

    .line 128
    .line 129
    invoke-virtual {p3}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iget-object v0, v0, LI4/b;->j:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 136
    .line 137
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p3}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iget-object v0, v0, LI4/b;->h:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, Landroid/widget/ProgressBar;

    .line 147
    .line 148
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p3}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-object v0, v0, LI4/b;->g:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Landroid/widget/LinearLayout;

    .line 158
    .line 159
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 160
    .line 161
    .line 162
    iget-object v0, p3, Lcom/kcstream/cing/activity/SearchActivity;->Y:Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-nez v4, :cond_2

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 171
    .line 172
    .line 173
    :cond_2
    invoke-virtual {p3}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    iget-object v4, v4, LI4/b;->c:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v4, Landroid/widget/RelativeLayout;

    .line 180
    .line 181
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 182
    .line 183
    .line 184
    new-instance v3, LE4/F;

    .line 185
    .line 186
    invoke-direct {v3, p3, p2, v1}, LE4/F;-><init>(Lcom/kcstream/cing/activity/SearchActivity;Ljava/lang/String;Lm8/d;)V

    .line 187
    .line 188
    .line 189
    const/4 v4, 0x3

    .line 190
    invoke-static {p3, v1, v3, v4}, LN9/z;->n(LN9/y;Lm8/a;Lu8/c;I)LN9/p0;

    .line 191
    .line 192
    .line 193
    invoke-static {v0}, Li8/C;->q(Ljava/util/List;)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-eqz v1, :cond_3

    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_3
    invoke-static {v0}, Li8/k;->t0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    :goto_0
    invoke-static {v0}, Lv8/x;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    new-instance v1, LCa/b;

    .line 209
    .line 210
    invoke-direct {v1, v0}, LCa/b;-><init>(Ljava/util/List;)V

    .line 211
    .line 212
    .line 213
    new-instance v0, Lt1/G;

    .line 214
    .line 215
    invoke-direct {v0, v1}, Lt1/G;-><init>(LCa/c;)V

    .line 216
    .line 217
    .line 218
    sget-object v1, Lv8/u;->a:Lv8/v;

    .line 219
    .line 220
    const-class v3, Lcom/kcstream/cing/model/SearchResult;

    .line 221
    .line 222
    invoke-virtual {v1, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    const-class v4, LG4/m;

    .line 227
    .line 228
    invoke-virtual {v1, v4}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-virtual {v0, v3, v1}, Lt1/G;->x(LC8/c;LC8/c;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p3}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    iget-object v1, v1, LI4/b;->j:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 242
    .line 243
    invoke-virtual {v0, v1}, Lt1/G;->r(Landroidx/recyclerview/widget/RecyclerView;)LCa/c;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    check-cast v0, LCa/b;

    .line 248
    .line 249
    const v1, 0x7f0d005c

    .line 250
    .line 251
    .line 252
    iput v1, v0, LCa/b;->n:I

    .line 253
    .line 254
    iput-boolean p1, v0, LCa/b;->l:Z

    .line 255
    .line 256
    new-instance v1, LE0/b;

    .line 257
    .line 258
    invoke-direct {v1, p3, p1, p2}, LE0/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    iput-object v1, v0, LCa/b;->m:Lv8/k;

    .line 262
    .line 263
    iput-object v0, p3, Lcom/kcstream/cing/activity/SearchActivity;->e0:LCa/b;

    .line 264
    .line 265
    const-string p2, "input_method"

    .line 266
    .line 267
    invoke-virtual {p3, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object p2

    .line 271
    const-string p3, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    .line 272
    .line 273
    invoke-static {p2, p3}, Lv8/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    check-cast p2, Landroid/view/inputmethod/InputMethodManager;

    .line 277
    .line 278
    const/4 p3, 0x2

    .line 279
    invoke-virtual {p2, p3, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 280
    .line 281
    .line 282
    goto :goto_1

    .line 283
    :cond_4
    invoke-virtual {p2}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->a()V

    .line 284
    .line 285
    .line 286
    iput-boolean p1, p2, Lcom/ferfalk/simplesearchview/SimpleSearchView;->M:Z

    .line 287
    .line 288
    iget-object p3, p2, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 289
    .line 290
    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 291
    .line 292
    .line 293
    iput-boolean v2, p2, Lcom/ferfalk/simplesearchview/SimpleSearchView;->M:Z

    .line 294
    .line 295
    :cond_5
    :goto_1
    return p1
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
