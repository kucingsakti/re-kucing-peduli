.class public final Lk7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk7/b;


# instance fields
.field public final A:LE/g;

.field public B:J

.field public C:Ljava/util/concurrent/ExecutorService;

.field public volatile D:I

.field public E:I

.field public final F:Ljava/lang/Object;

.field public volatile G:Ljava/lang/Exception;

.field public H:Ljava/util/List;

.field public I:LD6/a;

.field public J:I

.field public final K:Li3/b;

.field public final L:Lcom/tonyodev/fetch2/Download;

.field public final M:Lq7/d;

.field public final N:Lq7/f;

.field public final O:Lo7/a;

.field public final P:Ljava/lang/String;

.field public final Q:Lo1/k;

.field public volatile s:Z

.field public volatile t:Z

.field public u:Lm7/b;

.field public final v:Lh8/j;

.field public volatile w:J

.field public volatile x:J

.field public volatile y:Z

.field public z:D


# direct methods
.method public constructor <init>(Lcom/tonyodev/fetch2/Download;Lq7/d;Lq7/f;Lo7/a;Ljava/lang/String;Lo1/k;)V
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
    const-string v0, "fileTempDir"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lk7/c;->L:Lcom/tonyodev/fetch2/Download;

    .line 20
    .line 21
    iput-object p2, p0, Lk7/c;->M:Lq7/d;

    .line 22
    .line 23
    iput-object p3, p0, Lk7/c;->N:Lq7/f;

    .line 24
    .line 25
    iput-object p4, p0, Lk7/c;->O:Lo7/a;

    .line 26
    .line 27
    iput-object p5, p0, Lk7/c;->P:Ljava/lang/String;

    .line 28
    .line 29
    iput-object p6, p0, Lk7/c;->Q:Lo1/k;

    .line 30
    .line 31
    new-instance p1, Lc2/a;

    .line 32
    .line 33
    const/16 p2, 0xa

    .line 34
    .line 35
    invoke-direct {p1, p0, p2}, Lc2/a;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, LD3/b;->s(Lu8/a;)Lh8/j;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lk7/c;->v:Lh8/j;

    .line 43
    .line 44
    const-wide/16 p1, -0x1

    .line 45
    .line 46
    iput-wide p1, p0, Lk7/c;->x:J

    .line 47
    .line 48
    new-instance p3, LE/g;

    .line 49
    .line 50
    const/4 p4, 0x5

    .line 51
    invoke-direct {p3, p4}, LE/g;-><init>(I)V

    .line 52
    .line 53
    .line 54
    iput-object p3, p0, Lk7/c;->A:LE/g;

    .line 55
    .line 56
    iput-wide p1, p0, Lk7/c;->B:J

    .line 57
    .line 58
    new-instance p1, Ljava/lang/Object;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lk7/c;->F:Ljava/lang/Object;

    .line 64
    .line 65
    sget-object p1, Li8/s;->s:Li8/s;

    .line 66
    .line 67
    iput-object p1, p0, Lk7/c;->H:Ljava/util/List;

    .line 68
    .line 69
    new-instance p1, Li3/b;

    .line 70
    .line 71
    const/4 p2, 0x3

    .line 72
    invoke-direct {p1, p0, p2}, Li3/b;-><init>(Ljava/lang/Object;I)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lk7/c;->K:Li3/b;

    .line 76
    .line 77
    return-void
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
.end method

.method public static final a(Lk7/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk7/c;->F:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lk7/c;->D:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x1

    .line 7
    .line 8
    iput v1, p0, Lk7/c;->D:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    monitor-exit v0

    .line 14
    throw p0
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


# virtual methods
.method public final b(LFa/e;Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lk7/c;->D:I

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    iput v1, p0, Lk7/c;->E:I

    .line 9
    .line 10
    iget-object v1, p0, Lk7/c;->Q:Lo1/k;

    .line 11
    .line 12
    iget-object v2, p1, LFa/e;->v:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lo1/k;->k(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lk7/c;->Q:Lo1/k;

    .line 23
    .line 24
    iget-object v2, p1, LFa/e;->v:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Ljava/lang/String;

    .line 27
    .line 28
    iget-object v3, p0, Lk7/c;->L:Lcom/tonyodev/fetch2/Download;

    .line 29
    .line 30
    check-cast v3, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 31
    .line 32
    iget v3, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->G:I

    .line 33
    .line 34
    const/4 v4, 0x2

    .line 35
    if-ne v3, v4, :cond_0

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    :cond_0
    invoke-virtual {v1, v2, v0}, Lo1/k;->f(Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, Lk7/c;->Q:Lo1/k;

    .line 42
    .line 43
    iget-object v1, p1, LFa/e;->v:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {p0}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iget-wide v2, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 52
    .line 53
    invoke-virtual {v0, v1, v2, v3}, Lo1/k;->s(Ljava/lang/String;J)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lk7/c;->Q:Lo1/k;

    .line 57
    .line 58
    iget-object v0, v0, Lo1/k;->s:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Landroid/content/Context;

    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v1, "context.contentResolver"

    .line 67
    .line 68
    invoke-static {v0, v1}, Lv8/i;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p1, LFa/e;->v:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v0, p1}, LC4/a;->v(Landroid/content/ContentResolver;Ljava/lang/String;)LD6/a;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput-object p1, p0, Lk7/c;->I:LD6/a;

    .line 80
    .line 81
    const-wide/16 v0, 0x0

    .line 82
    .line 83
    invoke-virtual {p1, v0, v1}, LD6/a;->a(J)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-eqz p2, :cond_3

    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    check-cast p2, Lq7/g;

    .line 101
    .line 102
    iget-boolean v0, p0, Lk7/c;->s:Z

    .line 103
    .line 104
    if-nez v0, :cond_3

    .line 105
    .line 106
    iget-boolean v0, p0, Lk7/c;->t:Z

    .line 107
    .line 108
    if-nez v0, :cond_3

    .line 109
    .line 110
    iget-object v0, p0, Lk7/c;->C:Ljava/util/concurrent/ExecutorService;

    .line 111
    .line 112
    if-eqz v0, :cond_2

    .line 113
    .line 114
    new-instance v1, LP2/g;

    .line 115
    .line 116
    const/16 v2, 0xb

    .line 117
    .line 118
    invoke-direct {v1, p0, v2, p2}, LP2/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_3
    return-void
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

.method public final c()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lk7/c;->z:D

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

.method public final d()Lm7/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/c;->u:Lm7/b;

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

.method public final e()Lcom/tonyodev/fetch2/database/DownloadInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/c;->v:Lh8/j;

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

.method public final f(ZLFa/e;)Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lk7/c;->Q:Lo1/k;

    .line 4
    .line 5
    invoke-virtual {v0}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v2, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->v:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lo1/k;->k(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget v1, v1, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 22
    .line 23
    iget-object v2, v0, Lk7/c;->P:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v1, v2}, Lga/d;->j(ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {v0}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget v1, v1, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 33
    .line 34
    iget-object v2, v0, Lk7/c;->P:Ljava/lang/String;

    .line 35
    .line 36
    const-string v3, "fileTempDir"

    .line 37
    .line 38
    invoke-static {v2, v3}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 v4, -0x1

    .line 42
    :try_start_0
    invoke-static {v1, v2}, Lga/d;->s(ILjava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1}, LC3/b;->y(Ljava/lang/String;)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    long-to-int v4, v1

    .line 57
    :catch_0
    :cond_1
    const/4 v1, 0x1

    .line 58
    if-eqz p1, :cond_7

    .line 59
    .line 60
    iget-boolean v2, v0, Lk7/c;->y:Z

    .line 61
    .line 62
    if-nez v2, :cond_7

    .line 63
    .line 64
    iget-object v2, v0, Lk7/c;->M:Lq7/d;

    .line 65
    .line 66
    move-object/from16 v7, p2

    .line 67
    .line 68
    invoke-interface {v2, v7}, Lq7/d;->q(LFa/e;)V

    .line 69
    .line 70
    .line 71
    iget-wide v7, v0, Lk7/c;->x:J

    .line 72
    .line 73
    long-to-float v2, v7

    .line 74
    const/high16 v9, 0x44800000    # 1024.0f

    .line 75
    .line 76
    div-float v10, v2, v9

    .line 77
    .line 78
    mul-float/2addr v10, v9

    .line 79
    mul-float/2addr v9, v10

    .line 80
    const/high16 v11, 0x3f800000    # 1.0f

    .line 81
    .line 82
    cmpl-float v9, v9, v11

    .line 83
    .line 84
    if-ltz v9, :cond_2

    .line 85
    .line 86
    const/4 v7, 0x6

    .line 87
    int-to-float v8, v7

    .line 88
    div-float/2addr v2, v8

    .line 89
    float-to-double v8, v2

    .line 90
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 91
    .line 92
    .line 93
    move-result-wide v8

    .line 94
    double-to-float v2, v8

    .line 95
    float-to-long v8, v2

    .line 96
    new-instance v2, Lq7/h;

    .line 97
    .line 98
    invoke-direct {v2, v7, v8, v9}, Lq7/h;-><init>(IJ)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    cmpl-float v9, v10, v11

    .line 103
    .line 104
    if-ltz v9, :cond_3

    .line 105
    .line 106
    const/4 v7, 0x4

    .line 107
    int-to-float v8, v7

    .line 108
    div-float/2addr v2, v8

    .line 109
    float-to-double v8, v2

    .line 110
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 111
    .line 112
    .line 113
    move-result-wide v8

    .line 114
    double-to-float v2, v8

    .line 115
    float-to-long v8, v2

    .line 116
    new-instance v2, Lq7/h;

    .line 117
    .line 118
    invoke-direct {v2, v7, v8, v9}, Lq7/h;-><init>(IJ)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_3
    new-instance v2, Lq7/h;

    .line 123
    .line 124
    const/4 v9, 0x2

    .line 125
    invoke-direct {v2, v9, v7, v8}, Lq7/h;-><init>(IJ)V

    .line 126
    .line 127
    .line 128
    :goto_0
    iget v7, v2, Lq7/h;->a:I

    .line 129
    .line 130
    if-eq v4, v7, :cond_4

    .line 131
    .line 132
    invoke-virtual {v0}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    iget v4, v4, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 137
    .line 138
    iget-object v7, v0, Lk7/c;->P:Ljava/lang/String;

    .line 139
    .line 140
    invoke-static {v4, v7}, Lga/d;->j(ILjava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :cond_4
    invoke-virtual {v0}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    iget v4, v4, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 148
    .line 149
    iget v7, v2, Lq7/h;->a:I

    .line 150
    .line 151
    iget-object v8, v0, Lk7/c;->P:Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v4, v8, v7}, Lga/d;->A(ILjava/lang/String;I)V

    .line 154
    .line 155
    .line 156
    new-instance v4, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 159
    .line 160
    .line 161
    iget v7, v2, Lq7/h;->a:I

    .line 162
    .line 163
    if-gt v1, v7, :cond_a

    .line 164
    .line 165
    move v10, v1

    .line 166
    const-wide/16 v11, 0x0

    .line 167
    .line 168
    :goto_1
    iget-boolean v1, v0, Lk7/c;->s:Z

    .line 169
    .line 170
    if-nez v1, :cond_a

    .line 171
    .line 172
    iget-boolean v1, v0, Lk7/c;->t:Z

    .line 173
    .line 174
    if-nez v1, :cond_a

    .line 175
    .line 176
    iget v1, v2, Lq7/h;->a:I

    .line 177
    .line 178
    if-ne v1, v10, :cond_5

    .line 179
    .line 180
    iget-wide v8, v0, Lk7/c;->x:J

    .line 181
    .line 182
    :goto_2
    move-wide v13, v8

    .line 183
    goto :goto_3

    .line 184
    :cond_5
    iget-wide v8, v2, Lq7/h;->b:J

    .line 185
    .line 186
    add-long/2addr v8, v11

    .line 187
    goto :goto_2

    .line 188
    :goto_3
    new-instance v8, Lq7/g;

    .line 189
    .line 190
    invoke-virtual {v0}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    iget v9, v1, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 195
    .line 196
    invoke-virtual {v0}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    iget v1, v1, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 201
    .line 202
    iget-object v15, v0, Lk7/c;->P:Ljava/lang/String;

    .line 203
    .line 204
    invoke-static {v15, v3}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    :try_start_1
    invoke-static {v1, v15, v10}, Lga/d;->n(ILjava/lang/String;I)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-static {v1}, LC3/b;->y(Ljava/lang/String;)Ljava/lang/Long;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    if-eqz v1, :cond_6

    .line 216
    .line 217
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 218
    .line 219
    .line 220
    move-result-wide v15
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 221
    goto :goto_4

    .line 222
    :catch_1
    :cond_6
    const-wide/16 v15, 0x0

    .line 223
    .line 224
    :goto_4
    invoke-direct/range {v8 .. v16}, Lq7/g;-><init>(IIJJJ)V

    .line 225
    .line 226
    .line 227
    iget-wide v11, v0, Lk7/c;->w:J

    .line 228
    .line 229
    iget-wide v5, v8, Lq7/g;->e:J

    .line 230
    .line 231
    add-long/2addr v11, v5

    .line 232
    iput-wide v11, v0, Lk7/c;->w:J

    .line 233
    .line 234
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    if-eq v10, v7, :cond_a

    .line 238
    .line 239
    add-int/lit8 v10, v10, 0x1

    .line 240
    .line 241
    move-wide v11, v13

    .line 242
    goto :goto_1

    .line 243
    :cond_7
    if-eq v4, v1, :cond_8

    .line 244
    .line 245
    invoke-virtual {v0}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    iget v2, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 250
    .line 251
    iget-object v4, v0, Lk7/c;->P:Ljava/lang/String;

    .line 252
    .line 253
    invoke-static {v2, v4}, Lga/d;->j(ILjava/lang/String;)V

    .line 254
    .line 255
    .line 256
    :cond_8
    invoke-virtual {v0}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    iget v2, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 261
    .line 262
    iget-object v4, v0, Lk7/c;->P:Ljava/lang/String;

    .line 263
    .line 264
    invoke-static {v2, v4, v1}, Lga/d;->A(ILjava/lang/String;I)V

    .line 265
    .line 266
    .line 267
    new-instance v5, Lq7/g;

    .line 268
    .line 269
    invoke-virtual {v0}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    iget v6, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 274
    .line 275
    iget-wide v10, v0, Lk7/c;->x:J

    .line 276
    .line 277
    invoke-virtual {v0}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    iget v2, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 282
    .line 283
    iget-object v4, v0, Lk7/c;->P:Ljava/lang/String;

    .line 284
    .line 285
    invoke-static {v4, v3}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    :try_start_2
    invoke-static {v2, v4, v1}, Lga/d;->n(ILjava/lang/String;I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-static {v1}, LC3/b;->y(Ljava/lang/String;)Ljava/lang/Long;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    if-eqz v1, :cond_9

    .line 297
    .line 298
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 299
    .line 300
    .line 301
    move-result-wide v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 302
    move-wide v12, v1

    .line 303
    goto :goto_5

    .line 304
    :catch_2
    :cond_9
    const-wide/16 v12, 0x0

    .line 305
    .line 306
    :goto_5
    const/4 v7, 0x1

    .line 307
    const-wide/16 v8, 0x0

    .line 308
    .line 309
    invoke-direct/range {v5 .. v13}, Lq7/g;-><init>(IIJJJ)V

    .line 310
    .line 311
    .line 312
    iget-wide v1, v0, Lk7/c;->w:J

    .line 313
    .line 314
    iget-wide v3, v5, Lq7/g;->e:J

    .line 315
    .line 316
    add-long/2addr v1, v3

    .line 317
    iput-wide v1, v0, Lk7/c;->w:J

    .line 318
    .line 319
    invoke-static {v5}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    :cond_a
    return-object v4
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

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk7/c;->t:Z

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

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk7/c;->u:Lm7/b;

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
    iput-boolean v1, p0, Lk7/c;->s:Z

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
    iput-object p1, p0, Lk7/c;->u:Lm7/b;

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
    iget-object v0, p0, Lk7/c;->u:Lm7/b;

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
    iput-boolean v1, p0, Lk7/c;->t:Z

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

.method public final k()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lk7/c;->w:J

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
    iget-wide v0, p0, Lk7/c;->x:J

    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-gtz v0, :cond_1

    .line 14
    .line 15
    :cond_0
    iget-boolean v0, p0, Lk7/c;->y:Z

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    :cond_1
    iget-wide v0, p0, Lk7/c;->w:J

    .line 20
    .line 21
    iget-wide v2, p0, Lk7/c;->x:J

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

.method public final l()Lcom/tonyodev/fetch2/database/DownloadInfo;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-wide v1, p0, Lk7/c;->w:J

    .line 6
    .line 7
    iput-wide v1, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 8
    .line 9
    invoke-virtual {p0}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-wide v1, p0, Lk7/c;->x:J

    .line 14
    .line 15
    iput-wide v1, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 16
    .line 17
    invoke-virtual {p0}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

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

.method public final m(Lq7/c;)V
    .locals 4

    .line 1
    iget-boolean v0, p1, Lq7/c;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p1, Lq7/c;->c:J

    .line 6
    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    cmp-long p1, v0, v2

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lk7/c;->y:Z

    .line 15
    .line 16
    :cond_0
    return-void
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

.method public final n()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-wide v2, v1, Lk7/c;->w:J

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v4

    .line 9
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v6

    .line 13
    :goto_0
    iget v0, v1, Lk7/c;->D:I

    .line 14
    .line 15
    iget v8, v1, Lk7/c;->E:I

    .line 16
    .line 17
    if-eq v0, v8, :cond_5

    .line 18
    .line 19
    iget-boolean v0, v1, Lk7/c;->s:Z

    .line 20
    .line 21
    if-nez v0, :cond_5

    .line 22
    .line 23
    iget-boolean v0, v1, Lk7/c;->t:Z

    .line 24
    .line 25
    if-nez v0, :cond_5

    .line 26
    .line 27
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-wide v8, v1, Lk7/c;->w:J

    .line 32
    .line 33
    iput-wide v8, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 34
    .line 35
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-wide v8, v1, Lk7/c;->x:J

    .line 40
    .line 41
    iput-wide v8, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 42
    .line 43
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 44
    .line 45
    .line 46
    move-result-wide v8

    .line 47
    const-wide/16 v10, 0x3e8

    .line 48
    .line 49
    invoke-static/range {v6 .. v11}, LC3/b;->C(JJJ)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    move-wide v10, v6

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    iget-wide v6, v1, Lk7/c;->w:J

    .line 57
    .line 58
    sub-long/2addr v6, v2

    .line 59
    iget-object v2, v1, Lk7/c;->A:LE/g;

    .line 60
    .line 61
    long-to-double v6, v6

    .line 62
    invoke-virtual {v2, v6, v7}, LE/g;->a(D)V

    .line 63
    .line 64
    .line 65
    iget-object v2, v1, Lk7/c;->A:LE/g;

    .line 66
    .line 67
    invoke-static {v2}, LE/g;->b(LE/g;)D

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    iput-wide v2, v1, Lk7/c;->z:D

    .line 72
    .line 73
    iget-wide v12, v1, Lk7/c;->w:J

    .line 74
    .line 75
    iget-wide v14, v1, Lk7/c;->x:J

    .line 76
    .line 77
    invoke-virtual {v1}, Lk7/c;->c()J

    .line 78
    .line 79
    .line 80
    move-result-wide v16

    .line 81
    invoke-static/range {v12 .. v17}, LC3/b;->c(JJJ)J

    .line 82
    .line 83
    .line 84
    move-result-wide v2

    .line 85
    iput-wide v2, v1, Lk7/c;->B:J

    .line 86
    .line 87
    iget-wide v2, v1, Lk7/c;->w:J

    .line 88
    .line 89
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 90
    .line 91
    .line 92
    move-result-wide v6

    .line 93
    const-wide/16 v8, 0x190

    .line 94
    .line 95
    invoke-static/range {v4 .. v9}, LC3/b;->C(JJJ)Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-eqz v6, :cond_3

    .line 100
    .line 101
    iget-object v4, v1, Lk7/c;->F:Ljava/lang/Object;

    .line 102
    .line 103
    monitor-enter v4

    .line 104
    :try_start_0
    iget-boolean v5, v1, Lk7/c;->s:Z

    .line 105
    .line 106
    if-nez v5, :cond_2

    .line 107
    .line 108
    iget-boolean v5, v1, Lk7/c;->t:Z

    .line 109
    .line 110
    if-nez v5, :cond_2

    .line 111
    .line 112
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    iget-wide v6, v1, Lk7/c;->w:J

    .line 117
    .line 118
    iput-wide v6, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 119
    .line 120
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    iget-wide v6, v1, Lk7/c;->x:J

    .line 125
    .line 126
    iput-wide v6, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 127
    .line 128
    iget-object v5, v1, Lk7/c;->u:Lm7/b;

    .line 129
    .line 130
    if-eqz v5, :cond_1

    .line 131
    .line 132
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    invoke-virtual {v5, v6}, Lm7/b;->e(Lcom/tonyodev/fetch2/database/DownloadInfo;)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :catchall_0
    move-exception v0

    .line 141
    goto :goto_2

    .line 142
    :cond_1
    :goto_1
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    iget-wide v6, v1, Lk7/c;->B:J

    .line 147
    .line 148
    iput-wide v6, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 149
    .line 150
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-virtual {v1}, Lk7/c;->c()J

    .line 155
    .line 156
    .line 157
    move-result-wide v6

    .line 158
    iput-wide v6, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 159
    .line 160
    iget-object v12, v1, Lk7/c;->u:Lm7/b;

    .line 161
    .line 162
    if-eqz v12, :cond_2

    .line 163
    .line 164
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 165
    .line 166
    .line 167
    move-result-object v13

    .line 168
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    iget-wide v14, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 173
    .line 174
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    iget-wide v5, v5, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 179
    .line 180
    move-wide/from16 v16, v5

    .line 181
    .line 182
    invoke-virtual/range {v12 .. v17}, Lm7/b;->c(Lcom/tonyodev/fetch2/database/DownloadInfo;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    .line 184
    .line 185
    :cond_2
    monitor-exit v4

    .line 186
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 187
    .line 188
    .line 189
    move-result-wide v4

    .line 190
    goto :goto_3

    .line 191
    :goto_2
    monitor-exit v4

    .line 192
    throw v0

    .line 193
    :cond_3
    :goto_3
    if-eqz v0, :cond_4

    .line 194
    .line 195
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 196
    .line 197
    .line 198
    move-result-wide v6

    .line 199
    goto :goto_4

    .line 200
    :cond_4
    move-wide v6, v10

    .line 201
    :goto_4
    const-wide/16 v8, 0x190

    .line 202
    .line 203
    :try_start_1
    invoke-static {v8, v9}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 204
    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :catch_0
    iget-object v0, v1, Lk7/c;->N:Lq7/f;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_5
    return-void
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

.method public final p()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk7/c;->s:Z

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
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "FileDownloader"

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    const/16 v4, 0xa

    .line 7
    .line 8
    const-wide/16 v5, -0x1

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    :try_start_0
    iget-object v0, v1, Lk7/c;->L:Lcom/tonyodev/fetch2/Download;

    .line 12
    .line 13
    check-cast v0, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/tonyodev/fetch2/database/DownloadInfo;->a()J

    .line 16
    .line 17
    .line 18
    move-result-wide v8

    .line 19
    iput-wide v8, v1, Lk7/c;->w:J

    .line 20
    .line 21
    iget-object v0, v1, Lk7/c;->L:Lcom/tonyodev/fetch2/Download;

    .line 22
    .line 23
    check-cast v0, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/tonyodev/fetch2/database/DownloadInfo;->d()J

    .line 26
    .line 27
    .line 28
    move-result-wide v8

    .line 29
    iput-wide v8, v1, Lk7/c;->x:J

    .line 30
    .line 31
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-wide v8, v1, Lk7/c;->w:J

    .line 36
    .line 37
    invoke-virtual {v0, v8, v9}, Lcom/tonyodev/fetch2/database/DownloadInfo;->e(J)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-wide v8, v1, Lk7/c;->x:J

    .line 45
    .line 46
    invoke-virtual {v0, v8, v9}, Lcom/tonyodev/fetch2/database/DownloadInfo;->h(J)V

    .line 47
    .line 48
    .line 49
    iget-object v0, v1, Lk7/c;->M:Lq7/d;

    .line 50
    .line 51
    iget-object v8, v1, Lk7/c;->L:Lcom/tonyodev/fetch2/Download;

    .line 52
    .line 53
    invoke-static {v8}, Lga/d;->t(Lcom/tonyodev/fetch2/Download;)LFa/e;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    invoke-interface {v0, v8}, Lq7/d;->L(LFa/e;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, v1, Lk7/c;->L:Lcom/tonyodev/fetch2/Download;

    .line 61
    .line 62
    invoke-static {v0}, Lga/d;->t(Lcom/tonyodev/fetch2/Download;)LFa/e;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    iget-object v0, v1, Lk7/c;->M:Lq7/d;

    .line 67
    .line 68
    iget-object v9, v1, Lk7/c;->K:Li3/b;

    .line 69
    .line 70
    invoke-interface {v0, v8, v9}, Lq7/d;->P(LFa/e;Lq7/j;)Lq7/c;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    if-eqz v7, :cond_0

    .line 75
    .line 76
    invoke-virtual {v1, v7}, Lk7/c;->m(Lq7/c;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    move-object v3, v0

    .line 82
    goto/16 :goto_16

    .line 83
    .line 84
    :catch_0
    move-exception v0

    .line 85
    move-object v8, v7

    .line 86
    move-object v7, v0

    .line 87
    goto/16 :goto_10

    .line 88
    .line 89
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lk7/c;->p()Z

    .line 90
    .line 91
    .line 92
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    const-string v9, "empty_response_body"

    .line 94
    .line 95
    const-wide/16 v10, 0x0

    .line 96
    .line 97
    if-nez v0, :cond_a

    .line 98
    .line 99
    :try_start_1
    invoke-virtual {v1}, Lk7/c;->g()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-nez v0, :cond_a

    .line 104
    .line 105
    if-eqz v7, :cond_a

    .line 106
    .line 107
    iget-boolean v0, v7, Lq7/c;->b:Z

    .line 108
    .line 109
    if-ne v0, v3, :cond_a

    .line 110
    .line 111
    invoke-virtual {v7}, Lq7/c;->b()J

    .line 112
    .line 113
    .line 114
    move-result-wide v12

    .line 115
    iput-wide v12, v1, Lk7/c;->x:J

    .line 116
    .line 117
    iget-boolean v0, v1, Lk7/c;->y:Z

    .line 118
    .line 119
    if-nez v0, :cond_2

    .line 120
    .line 121
    iget-wide v12, v1, Lk7/c;->x:J

    .line 122
    .line 123
    cmp-long v0, v12, v10

    .line 124
    .line 125
    if-lez v0, :cond_1

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_1
    new-instance v0, Lcom/tonyodev/fetch2/exception/FetchException;

    .line 129
    .line 130
    invoke-direct {v0, v9}, Lcom/tonyodev/fetch2/exception/FetchException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v0

    .line 134
    :cond_2
    :goto_1
    iput-wide v10, v1, Lk7/c;->w:J

    .line 135
    .line 136
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iget-wide v12, v1, Lk7/c;->w:J

    .line 141
    .line 142
    invoke-virtual {v0, v12, v13}, Lcom/tonyodev/fetch2/database/DownloadInfo;->e(J)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    iget-wide v12, v1, Lk7/c;->x:J

    .line 150
    .line 151
    invoke-virtual {v0, v12, v13}, Lcom/tonyodev/fetch2/database/DownloadInfo;->h(J)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7}, Lq7/c;->a()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    invoke-virtual {v1, v0, v8}, Lk7/c;->f(ZLFa/e;)Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iput-object v0, v1, Lk7/c;->H:Ljava/util/List;

    .line 163
    .line 164
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    iput v0, v1, Lk7/c;->J:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 169
    .line 170
    :try_start_2
    iget-object v0, v1, Lk7/c;->M:Lq7/d;

    .line 171
    .line 172
    invoke-interface {v0, v7}, Lq7/d;->k(Lq7/c;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :catch_1
    move-exception v0

    .line 177
    :try_start_3
    iget-object v9, v1, Lk7/c;->N:Lq7/f;

    .line 178
    .line 179
    invoke-virtual {v9, v2, v0}, Lq7/f;->b(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 180
    .line 181
    .line 182
    :goto_2
    iget-object v0, v1, Lk7/c;->H:Ljava/util/List;

    .line 183
    .line 184
    check-cast v0, Ljava/lang/Iterable;

    .line 185
    .line 186
    new-instance v9, Ljava/util/ArrayList;

    .line 187
    .line 188
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 189
    .line 190
    .line 191
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    :cond_3
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v12

    .line 199
    if-eqz v12, :cond_4

    .line 200
    .line 201
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v12

    .line 205
    move-object v13, v12

    .line 206
    check-cast v13, Lq7/g;

    .line 207
    .line 208
    invoke-virtual {v13}, Lq7/g;->e()Z

    .line 209
    .line 210
    .line 211
    move-result v13

    .line 212
    if-nez v13, :cond_3

    .line 213
    .line 214
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_4
    invoke-virtual {v1}, Lk7/c;->p()Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-nez v0, :cond_10

    .line 223
    .line 224
    invoke-virtual {v1}, Lk7/c;->g()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-nez v0, :cond_10

    .line 229
    .line 230
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    iget-wide v12, v1, Lk7/c;->w:J

    .line 235
    .line 236
    invoke-virtual {v0, v12, v13}, Lcom/tonyodev/fetch2/database/DownloadInfo;->e(J)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    iget-wide v12, v1, Lk7/c;->x:J

    .line 244
    .line 245
    invoke-virtual {v0, v12, v13}, Lcom/tonyodev/fetch2/database/DownloadInfo;->h(J)V

    .line 246
    .line 247
    .line 248
    iget-object v0, v1, Lk7/c;->H:Ljava/util/List;

    .line 249
    .line 250
    check-cast v0, Ljava/lang/Iterable;

    .line 251
    .line 252
    new-instance v12, Ljava/util/ArrayList;

    .line 253
    .line 254
    invoke-static {v0, v4}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 255
    .line 256
    .line 257
    move-result v13

    .line 258
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 259
    .line 260
    .line 261
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v13

    .line 269
    if-eqz v13, :cond_5

    .line 270
    .line 271
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v13

    .line 275
    check-cast v13, Lq7/g;

    .line 276
    .line 277
    new-instance v14, Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 278
    .line 279
    invoke-direct {v14}, Lcom/tonyodev/fetch2core/DownloadBlockInfo;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v13}, Lq7/g;->b()I

    .line 283
    .line 284
    .line 285
    move-result v15

    .line 286
    invoke-virtual {v14, v15}, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->b(I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v13}, Lq7/g;->c()I

    .line 290
    .line 291
    .line 292
    move-result v15

    .line 293
    invoke-virtual {v14, v15}, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->a(I)V

    .line 294
    .line 295
    .line 296
    iget-wide v10, v13, Lq7/g;->e:J

    .line 297
    .line 298
    invoke-virtual {v14, v10, v11}, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->c(J)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v13}, Lq7/g;->d()J

    .line 302
    .line 303
    .line 304
    move-result-wide v10

    .line 305
    invoke-virtual {v14, v10, v11}, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->e(J)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v13}, Lq7/g;->a()J

    .line 309
    .line 310
    .line 311
    move-result-wide v10

    .line 312
    invoke-virtual {v14, v10, v11}, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->d(J)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    const-wide/16 v10, 0x0

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_5
    invoke-virtual {v1}, Lk7/c;->p()Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-nez v0, :cond_8

    .line 326
    .line 327
    invoke-virtual {v1}, Lk7/c;->g()Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-nez v0, :cond_8

    .line 332
    .line 333
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    iput-wide v5, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 338
    .line 339
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    iput-wide v5, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 344
    .line 345
    invoke-virtual {v1}, Lk7/c;->d()Lm7/b;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    if-eqz v0, :cond_6

    .line 350
    .line 351
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 352
    .line 353
    .line 354
    move-result-object v10

    .line 355
    iget v11, v1, Lk7/c;->J:I

    .line 356
    .line 357
    invoke-virtual {v0, v10, v12, v11}, Lm7/b;->d(Lcom/tonyodev/fetch2/database/DownloadInfo;Ljava/util/List;I)V

    .line 358
    .line 359
    .line 360
    :cond_6
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    :cond_7
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 365
    .line 366
    .line 367
    move-result v10

    .line 368
    if-eqz v10, :cond_8

    .line 369
    .line 370
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v10

    .line 374
    check-cast v10, Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 375
    .line 376
    invoke-virtual {v1}, Lk7/c;->d()Lm7/b;

    .line 377
    .line 378
    .line 379
    move-result-object v11

    .line 380
    if-eqz v11, :cond_7

    .line 381
    .line 382
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 383
    .line 384
    .line 385
    move-result-object v12

    .line 386
    iget v13, v1, Lk7/c;->J:I

    .line 387
    .line 388
    invoke-virtual {v11, v12, v10, v13}, Lm7/b;->a(Lcom/tonyodev/fetch2/database/DownloadInfo;Lcom/tonyodev/fetch2core/DownloadBlock;I)V

    .line 389
    .line 390
    .line 391
    goto :goto_5

    .line 392
    :cond_8
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-nez v0, :cond_9

    .line 397
    .line 398
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    iput-object v0, v1, Lk7/c;->C:Ljava/util/concurrent/ExecutorService;

    .line 407
    .line 408
    :cond_9
    invoke-virtual {v1, v8, v9}, Lk7/c;->b(LFa/e;Ljava/util/ArrayList;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v1}, Lk7/c;->n()V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    iget-wide v8, v1, Lk7/c;->w:J

    .line 419
    .line 420
    invoke-virtual {v0, v8, v9}, Lcom/tonyodev/fetch2/database/DownloadInfo;->e(J)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    iget-wide v8, v1, Lk7/c;->x:J

    .line 428
    .line 429
    invoke-virtual {v0, v8, v9}, Lcom/tonyodev/fetch2/database/DownloadInfo;->h(J)V

    .line 430
    .line 431
    .line 432
    goto :goto_8

    .line 433
    :cond_a
    if-nez v7, :cond_c

    .line 434
    .line 435
    invoke-virtual {v1}, Lk7/c;->p()Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    if-nez v0, :cond_c

    .line 440
    .line 441
    invoke-virtual {v1}, Lk7/c;->g()Z

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    if-nez v0, :cond_c

    .line 446
    .line 447
    invoke-virtual {v1}, Lk7/c;->k()Z

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    if-eqz v0, :cond_b

    .line 452
    .line 453
    goto :goto_6

    .line 454
    :cond_b
    new-instance v0, Lcom/tonyodev/fetch2/exception/FetchException;

    .line 455
    .line 456
    invoke-direct {v0, v9}, Lcom/tonyodev/fetch2/exception/FetchException;-><init>(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    throw v0

    .line 460
    :cond_c
    :goto_6
    if-eqz v7, :cond_e

    .line 461
    .line 462
    iget-boolean v0, v7, Lq7/c;->b:Z

    .line 463
    .line 464
    if-nez v0, :cond_e

    .line 465
    .line 466
    invoke-virtual {v1}, Lk7/c;->p()Z

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    if-nez v0, :cond_e

    .line 471
    .line 472
    invoke-virtual {v1}, Lk7/c;->g()Z

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    if-nez v0, :cond_e

    .line 477
    .line 478
    invoke-virtual {v1}, Lk7/c;->k()Z

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    if-eqz v0, :cond_d

    .line 483
    .line 484
    goto :goto_7

    .line 485
    :cond_d
    new-instance v0, Lcom/tonyodev/fetch2/exception/FetchException;

    .line 486
    .line 487
    const-string v8, "request_not_successful"

    .line 488
    .line 489
    invoke-direct {v0, v8}, Lcom/tonyodev/fetch2/exception/FetchException;-><init>(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    throw v0

    .line 493
    :cond_e
    :goto_7
    invoke-virtual {v1}, Lk7/c;->p()Z

    .line 494
    .line 495
    .line 496
    move-result v0

    .line 497
    if-nez v0, :cond_10

    .line 498
    .line 499
    invoke-virtual {v1}, Lk7/c;->g()Z

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    if-nez v0, :cond_10

    .line 504
    .line 505
    invoke-virtual {v1}, Lk7/c;->k()Z

    .line 506
    .line 507
    .line 508
    move-result v0

    .line 509
    if-eqz v0, :cond_f

    .line 510
    .line 511
    goto :goto_8

    .line 512
    :cond_f
    new-instance v0, Lcom/tonyodev/fetch2/exception/FetchException;

    .line 513
    .line 514
    const-string v8, "unknown"

    .line 515
    .line 516
    invoke-direct {v0, v8}, Lcom/tonyodev/fetch2/exception/FetchException;-><init>(Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    throw v0

    .line 520
    :cond_10
    :goto_8
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    iget-wide v8, v1, Lk7/c;->w:J

    .line 525
    .line 526
    invoke-virtual {v0, v8, v9}, Lcom/tonyodev/fetch2/database/DownloadInfo;->e(J)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    iget-wide v8, v1, Lk7/c;->x:J

    .line 534
    .line 535
    invoke-virtual {v0, v8, v9}, Lcom/tonyodev/fetch2/database/DownloadInfo;->h(J)V

    .line 536
    .line 537
    .line 538
    iget-object v0, v1, Lk7/c;->G:Ljava/lang/Exception;

    .line 539
    .line 540
    if-nez v0, :cond_1d

    .line 541
    .line 542
    invoke-virtual {v1}, Lk7/c;->k()Z

    .line 543
    .line 544
    .line 545
    move-result v0

    .line 546
    if-nez v0, :cond_12

    .line 547
    .line 548
    invoke-virtual {v1}, Lk7/c;->g()Z

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    if-nez v0, :cond_12

    .line 553
    .line 554
    invoke-virtual {v1}, Lk7/c;->p()Z

    .line 555
    .line 556
    .line 557
    move-result v0

    .line 558
    if-nez v0, :cond_12

    .line 559
    .line 560
    invoke-virtual {v1}, Lk7/c;->d()Lm7/b;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    if-eqz v0, :cond_11

    .line 565
    .line 566
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 567
    .line 568
    .line 569
    move-result-object v8

    .line 570
    invoke-virtual {v0, v8}, Lm7/b;->e(Lcom/tonyodev/fetch2/database/DownloadInfo;)V

    .line 571
    .line 572
    .line 573
    :cond_11
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    iget-wide v8, v1, Lk7/c;->B:J

    .line 578
    .line 579
    iput-wide v8, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 580
    .line 581
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    invoke-virtual {v1}, Lk7/c;->c()J

    .line 586
    .line 587
    .line 588
    move-result-wide v8

    .line 589
    iput-wide v8, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 590
    .line 591
    invoke-virtual {v1}, Lk7/c;->d()Lm7/b;

    .line 592
    .line 593
    .line 594
    move-result-object v10

    .line 595
    if-eqz v10, :cond_19

    .line 596
    .line 597
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 598
    .line 599
    .line 600
    move-result-object v11

    .line 601
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    iget-wide v12, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 606
    .line 607
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    iget-wide v14, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 612
    .line 613
    invoke-virtual/range {v10 .. v15}, Lm7/b;->c(Lcom/tonyodev/fetch2/database/DownloadInfo;JJ)V

    .line 614
    .line 615
    .line 616
    goto/16 :goto_b

    .line 617
    .line 618
    :cond_12
    invoke-virtual {v1}, Lk7/c;->p()Z

    .line 619
    .line 620
    .line 621
    move-result v0

    .line 622
    if-nez v0, :cond_19

    .line 623
    .line 624
    invoke-virtual {v1}, Lk7/c;->g()Z

    .line 625
    .line 626
    .line 627
    move-result v0

    .line 628
    if-nez v0, :cond_19

    .line 629
    .line 630
    invoke-virtual {v1}, Lk7/c;->k()Z

    .line 631
    .line 632
    .line 633
    move-result v0

    .line 634
    if-eqz v0, :cond_19

    .line 635
    .line 636
    iget-boolean v0, v1, Lk7/c;->y:Z

    .line 637
    .line 638
    if-nez v0, :cond_15

    .line 639
    .line 640
    iget-object v0, v1, Lk7/c;->H:Ljava/util/List;

    .line 641
    .line 642
    check-cast v0, Ljava/lang/Iterable;

    .line 643
    .line 644
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    const-wide/16 v10, 0x0

    .line 649
    .line 650
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 651
    .line 652
    .line 653
    move-result v8

    .line 654
    if-eqz v8, :cond_13

    .line 655
    .line 656
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v8

    .line 660
    check-cast v8, Lq7/g;

    .line 661
    .line 662
    iget-wide v8, v8, Lq7/g;->e:J

    .line 663
    .line 664
    add-long/2addr v10, v8

    .line 665
    goto :goto_9

    .line 666
    :cond_13
    iget-wide v8, v1, Lk7/c;->x:J

    .line 667
    .line 668
    cmp-long v0, v10, v8

    .line 669
    .line 670
    if-eqz v0, :cond_16

    .line 671
    .line 672
    new-instance v0, Lcom/tonyodev/fetch2/exception/FetchException;

    .line 673
    .line 674
    const-string v8, "download_incomplete"

    .line 675
    .line 676
    invoke-direct {v0, v8}, Lcom/tonyodev/fetch2/exception/FetchException;-><init>(Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    iput-object v0, v1, Lk7/c;->G:Ljava/lang/Exception;

    .line 680
    .line 681
    iget-object v0, v1, Lk7/c;->G:Ljava/lang/Exception;

    .line 682
    .line 683
    if-nez v0, :cond_14

    .line 684
    .line 685
    goto :goto_a

    .line 686
    :cond_14
    throw v0

    .line 687
    :cond_15
    iget-wide v8, v1, Lk7/c;->w:J

    .line 688
    .line 689
    iput-wide v8, v1, Lk7/c;->x:J

    .line 690
    .line 691
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    iget-wide v8, v1, Lk7/c;->w:J

    .line 696
    .line 697
    invoke-virtual {v0, v8, v9}, Lcom/tonyodev/fetch2/database/DownloadInfo;->e(J)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    iget-wide v8, v1, Lk7/c;->x:J

    .line 705
    .line 706
    invoke-virtual {v0, v8, v9}, Lcom/tonyodev/fetch2/database/DownloadInfo;->h(J)V

    .line 707
    .line 708
    .line 709
    :cond_16
    :goto_a
    invoke-virtual {v1}, Lk7/c;->g()Z

    .line 710
    .line 711
    .line 712
    move-result v0

    .line 713
    if-nez v0, :cond_17

    .line 714
    .line 715
    invoke-virtual {v1}, Lk7/c;->p()Z

    .line 716
    .line 717
    .line 718
    move-result v0

    .line 719
    if-nez v0, :cond_17

    .line 720
    .line 721
    invoke-virtual {v1}, Lk7/c;->d()Lm7/b;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    if-eqz v0, :cond_17

    .line 726
    .line 727
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 728
    .line 729
    .line 730
    move-result-object v8

    .line 731
    invoke-virtual {v0, v8}, Lm7/b;->e(Lcom/tonyodev/fetch2/database/DownloadInfo;)V

    .line 732
    .line 733
    .line 734
    :cond_17
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    invoke-virtual {v0}, Lcom/tonyodev/fetch2/database/DownloadInfo;->b()I

    .line 739
    .line 740
    .line 741
    move-result v0

    .line 742
    iget-object v8, v1, Lk7/c;->P:Ljava/lang/String;

    .line 743
    .line 744
    invoke-static {v0, v8}, Lga/d;->j(ILjava/lang/String;)V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v1}, Lk7/c;->p()Z

    .line 748
    .line 749
    .line 750
    move-result v0

    .line 751
    if-nez v0, :cond_19

    .line 752
    .line 753
    invoke-virtual {v1}, Lk7/c;->g()Z

    .line 754
    .line 755
    .line 756
    move-result v0

    .line 757
    if-nez v0, :cond_19

    .line 758
    .line 759
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    iget-wide v8, v1, Lk7/c;->B:J

    .line 764
    .line 765
    iput-wide v8, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 766
    .line 767
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    invoke-virtual {v1}, Lk7/c;->c()J

    .line 772
    .line 773
    .line 774
    move-result-wide v8

    .line 775
    iput-wide v8, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 776
    .line 777
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    new-instance v8, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 785
    .line 786
    invoke-direct {v8}, Lcom/tonyodev/fetch2/database/DownloadInfo;-><init>()V

    .line 787
    .line 788
    .line 789
    invoke-static {v0, v8}, Li8/C;->z(Lcom/tonyodev/fetch2/Download;Lcom/tonyodev/fetch2/database/DownloadInfo;)V

    .line 790
    .line 791
    .line 792
    invoke-virtual {v1}, Lk7/c;->d()Lm7/b;

    .line 793
    .line 794
    .line 795
    move-result-object v9

    .line 796
    if-eqz v9, :cond_18

    .line 797
    .line 798
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 799
    .line 800
    .line 801
    move-result-object v10

    .line 802
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    iget-wide v11, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 807
    .line 808
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    iget-wide v13, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 813
    .line 814
    invoke-virtual/range {v9 .. v14}, Lm7/b;->c(Lcom/tonyodev/fetch2/database/DownloadInfo;JJ)V

    .line 815
    .line 816
    .line 817
    :cond_18
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    iput-wide v5, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 822
    .line 823
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    iput-wide v5, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 828
    .line 829
    invoke-virtual {v1}, Lk7/c;->d()Lm7/b;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    if-eqz v0, :cond_19

    .line 834
    .line 835
    iget-boolean v9, v0, Lm7/b;->a:Z

    .line 836
    .line 837
    if-nez v9, :cond_19

    .line 838
    .line 839
    sget-object v9, Lh7/f;->x:Lh7/f;

    .line 840
    .line 841
    iput-object v9, v8, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 842
    .line 843
    iget-object v9, v0, Lm7/b;->b:Lm7/a;

    .line 844
    .line 845
    invoke-virtual {v9, v8}, Lm7/a;->b(Lcom/tonyodev/fetch2/database/DownloadInfo;)V

    .line 846
    .line 847
    .line 848
    iget-object v0, v0, Lm7/b;->c:LJ4/c;

    .line 849
    .line 850
    invoke-virtual {v0, v8}, LJ4/c;->b(Lcom/tonyodev/fetch2/Download;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 851
    .line 852
    .line 853
    :cond_19
    :goto_b
    :try_start_4
    iget-object v0, v1, Lk7/c;->C:Ljava/util/concurrent/ExecutorService;

    .line 854
    .line 855
    if-eqz v0, :cond_1a

    .line 856
    .line 857
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 858
    .line 859
    .line 860
    goto :goto_c

    .line 861
    :catch_2
    move-exception v0

    .line 862
    iget-object v3, v1, Lk7/c;->N:Lq7/f;

    .line 863
    .line 864
    invoke-virtual {v3, v2, v0}, Lq7/f;->b(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 865
    .line 866
    .line 867
    :cond_1a
    :goto_c
    :try_start_5
    iget-object v0, v1, Lk7/c;->I:LD6/a;

    .line 868
    .line 869
    if-eqz v0, :cond_1b

    .line 870
    .line 871
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 872
    .line 873
    .line 874
    goto :goto_d

    .line 875
    :catch_3
    move-exception v0

    .line 876
    iget-object v3, v1, Lk7/c;->N:Lq7/f;

    .line 877
    .line 878
    invoke-virtual {v3, v2, v0}, Lq7/f;->b(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 879
    .line 880
    .line 881
    :cond_1b
    :goto_d
    if-eqz v7, :cond_1c

    .line 882
    .line 883
    :try_start_6
    iget-object v0, v1, Lk7/c;->M:Lq7/d;

    .line 884
    .line 885
    invoke-interface {v0, v7}, Lq7/d;->k(Lq7/c;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 886
    .line 887
    .line 888
    goto :goto_f

    .line 889
    :catch_4
    move-exception v0

    .line 890
    :goto_e
    iget-object v3, v1, Lk7/c;->N:Lq7/f;

    .line 891
    .line 892
    invoke-virtual {v3, v2, v0}, Lq7/f;->b(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 893
    .line 894
    .line 895
    :cond_1c
    :goto_f
    invoke-virtual {v1}, Lk7/c;->j()V

    .line 896
    .line 897
    .line 898
    goto/16 :goto_15

    .line 899
    .line 900
    :cond_1d
    :try_start_7
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 901
    :goto_10
    :try_start_8
    invoke-virtual {v1}, Lk7/c;->p()Z

    .line 902
    .line 903
    .line 904
    move-result v0

    .line 905
    if-nez v0, :cond_21

    .line 906
    .line 907
    invoke-virtual {v1}, Lk7/c;->g()Z

    .line 908
    .line 909
    .line 910
    move-result v0

    .line 911
    if-nez v0, :cond_21

    .line 912
    .line 913
    iget-object v0, v1, Lk7/c;->N:Lq7/f;

    .line 914
    .line 915
    new-instance v9, Ljava/lang/StringBuilder;

    .line 916
    .line 917
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 918
    .line 919
    .line 920
    const-string v10, "FileDownloader download:"

    .line 921
    .line 922
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 923
    .line 924
    .line 925
    invoke-virtual {v1}, Lk7/c;->l()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 926
    .line 927
    .line 928
    move-result-object v10

    .line 929
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 930
    .line 931
    .line 932
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v9

    .line 936
    invoke-virtual {v0, v9, v7}, Lq7/f;->b(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 937
    .line 938
    .line 939
    invoke-static {v7}, LC4/a;->t(Ljava/lang/Exception;)Lh7/b;

    .line 940
    .line 941
    .line 942
    move-result-object v9

    .line 943
    iget-object v0, v1, Lk7/c;->O:Lo7/a;

    .line 944
    .line 945
    invoke-virtual {v0}, Lo7/a;->b()Z

    .line 946
    .line 947
    .line 948
    move-result v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 949
    xor-int/lit8 v10, v0, 0x1

    .line 950
    .line 951
    move v0, v3

    .line 952
    :goto_11
    if-gt v0, v4, :cond_1f

    .line 953
    .line 954
    const-wide/16 v11, 0x1f4

    .line 955
    .line 956
    :try_start_9
    invoke-static {v11, v12}, Ljava/lang/Thread;->sleep(J)V
    :try_end_9
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 957
    .line 958
    .line 959
    :try_start_a
    iget-object v11, v1, Lk7/c;->O:Lo7/a;

    .line 960
    .line 961
    invoke-virtual {v11}, Lo7/a;->b()Z

    .line 962
    .line 963
    .line 964
    move-result v11

    .line 965
    if-nez v11, :cond_1e

    .line 966
    .line 967
    goto :goto_12

    .line 968
    :cond_1e
    add-int/lit8 v0, v0, 0x1

    .line 969
    .line 970
    goto :goto_11

    .line 971
    :catchall_1
    move-exception v0

    .line 972
    move-object v3, v0

    .line 973
    move-object v7, v8

    .line 974
    goto/16 :goto_16

    .line 975
    .line 976
    :catch_5
    move-exception v0

    .line 977
    iget-object v3, v1, Lk7/c;->N:Lq7/f;

    .line 978
    .line 979
    invoke-virtual {v3, v2, v0}, Lq7/f;->b(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 980
    .line 981
    .line 982
    :cond_1f
    move v3, v10

    .line 983
    :goto_12
    if-eqz v3, :cond_20

    .line 984
    .line 985
    sget-object v9, Lh7/b;->B:Lh7/b;

    .line 986
    .line 987
    :cond_20
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    iget-wide v3, v1, Lk7/c;->w:J

    .line 992
    .line 993
    invoke-virtual {v0, v3, v4}, Lcom/tonyodev/fetch2/database/DownloadInfo;->e(J)V

    .line 994
    .line 995
    .line 996
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    iget-wide v3, v1, Lk7/c;->x:J

    .line 1001
    .line 1002
    invoke-virtual {v0, v3, v4}, Lcom/tonyodev/fetch2/database/DownloadInfo;->h(J)V

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v0

    .line 1009
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1010
    .line 1011
    .line 1012
    iput-object v9, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->C:Lh7/b;

    .line 1013
    .line 1014
    invoke-virtual {v1}, Lk7/c;->g()Z

    .line 1015
    .line 1016
    .line 1017
    move-result v0

    .line 1018
    if-nez v0, :cond_21

    .line 1019
    .line 1020
    invoke-virtual {v1}, Lk7/c;->p()Z

    .line 1021
    .line 1022
    .line 1023
    move-result v0

    .line 1024
    if-nez v0, :cond_21

    .line 1025
    .line 1026
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v0

    .line 1030
    iput-wide v5, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 1031
    .line 1032
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v0

    .line 1036
    iput-wide v5, v0, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 1037
    .line 1038
    invoke-virtual {v1}, Lk7/c;->d()Lm7/b;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    if-eqz v0, :cond_21

    .line 1043
    .line 1044
    invoke-virtual {v1}, Lk7/c;->e()Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v3

    .line 1048
    invoke-virtual {v0, v3, v9, v7}, Lm7/b;->b(Lcom/tonyodev/fetch2/database/DownloadInfo;Lh7/b;Ljava/lang/Exception;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 1049
    .line 1050
    .line 1051
    :cond_21
    :try_start_b
    iget-object v0, v1, Lk7/c;->C:Ljava/util/concurrent/ExecutorService;

    .line 1052
    .line 1053
    if-eqz v0, :cond_22

    .line 1054
    .line 1055
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_6

    .line 1056
    .line 1057
    .line 1058
    goto :goto_13

    .line 1059
    :catch_6
    move-exception v0

    .line 1060
    iget-object v3, v1, Lk7/c;->N:Lq7/f;

    .line 1061
    .line 1062
    invoke-virtual {v3, v2, v0}, Lq7/f;->b(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1063
    .line 1064
    .line 1065
    :cond_22
    :goto_13
    :try_start_c
    iget-object v0, v1, Lk7/c;->I:LD6/a;

    .line 1066
    .line 1067
    if-eqz v0, :cond_23

    .line 1068
    .line 1069
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_7

    .line 1070
    .line 1071
    .line 1072
    goto :goto_14

    .line 1073
    :catch_7
    move-exception v0

    .line 1074
    iget-object v3, v1, Lk7/c;->N:Lq7/f;

    .line 1075
    .line 1076
    invoke-virtual {v3, v2, v0}, Lq7/f;->b(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1077
    .line 1078
    .line 1079
    :cond_23
    :goto_14
    if-eqz v8, :cond_1c

    .line 1080
    .line 1081
    :try_start_d
    iget-object v0, v1, Lk7/c;->M:Lq7/d;

    .line 1082
    .line 1083
    invoke-interface {v0, v8}, Lq7/d;->k(Lq7/c;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_8

    .line 1084
    .line 1085
    .line 1086
    goto/16 :goto_f

    .line 1087
    .line 1088
    :catch_8
    move-exception v0

    .line 1089
    goto/16 :goto_e

    .line 1090
    .line 1091
    :goto_15
    return-void

    .line 1092
    :goto_16
    :try_start_e
    iget-object v0, v1, Lk7/c;->C:Ljava/util/concurrent/ExecutorService;

    .line 1093
    .line 1094
    if-eqz v0, :cond_24

    .line 1095
    .line 1096
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_9

    .line 1097
    .line 1098
    .line 1099
    goto :goto_17

    .line 1100
    :catch_9
    move-exception v0

    .line 1101
    iget-object v4, v1, Lk7/c;->N:Lq7/f;

    .line 1102
    .line 1103
    invoke-virtual {v4, v2, v0}, Lq7/f;->b(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1104
    .line 1105
    .line 1106
    :cond_24
    :goto_17
    :try_start_f
    iget-object v0, v1, Lk7/c;->I:LD6/a;

    .line 1107
    .line 1108
    if-eqz v0, :cond_25

    .line 1109
    .line 1110
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_a

    .line 1111
    .line 1112
    .line 1113
    goto :goto_18

    .line 1114
    :catch_a
    move-exception v0

    .line 1115
    iget-object v4, v1, Lk7/c;->N:Lq7/f;

    .line 1116
    .line 1117
    invoke-virtual {v4, v2, v0}, Lq7/f;->b(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1118
    .line 1119
    .line 1120
    :cond_25
    :goto_18
    if-eqz v7, :cond_26

    .line 1121
    .line 1122
    :try_start_10
    iget-object v0, v1, Lk7/c;->M:Lq7/d;

    .line 1123
    .line 1124
    invoke-interface {v0, v7}, Lq7/d;->k(Lq7/c;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_b

    .line 1125
    .line 1126
    .line 1127
    goto :goto_19

    .line 1128
    :catch_b
    move-exception v0

    .line 1129
    iget-object v4, v1, Lk7/c;->N:Lq7/f;

    .line 1130
    .line 1131
    invoke-virtual {v4, v2, v0}, Lq7/f;->b(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1132
    .line 1133
    .line 1134
    :cond_26
    :goto_19
    invoke-virtual {v1}, Lk7/c;->j()V

    .line 1135
    .line 1136
    .line 1137
    throw v3
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
