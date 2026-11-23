.class public final Landroidx/fragment/app/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/J;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/String;

.field public final synthetic c:Landroidx/fragment/app/e;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/e;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/fragment/app/d;->a:I

    iput-object p1, p0, Landroidx/fragment/app/d;->c:Landroidx/fragment/app/e;

    iput-object p2, p0, Landroidx/fragment/app/d;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v0, Landroidx/fragment/app/d;->a:I

    .line 8
    .line 9
    packed-switch v3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v3, v0, Landroidx/fragment/app/d;->c:Landroidx/fragment/app/e;

    .line 13
    .line 14
    iget-object v4, v0, Landroidx/fragment/app/d;->b:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v5, -0x1

    .line 17
    const/4 v6, 0x1

    .line 18
    invoke-virtual {v3, v4, v6, v5}, Landroidx/fragment/app/e;->C(Ljava/lang/String;ZI)I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-gez v5, :cond_0

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    goto/16 :goto_a

    .line 26
    .line 27
    :cond_0
    move v7, v5

    .line 28
    :goto_0
    iget-object v8, v3, Landroidx/fragment/app/e;->d:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    const/4 v9, 0x0

    .line 35
    const-string v10, "saveBackStack(\""

    .line 36
    .line 37
    if-ge v7, v8, :cond_2

    .line 38
    .line 39
    iget-object v8, v3, Landroidx/fragment/app/e;->d:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    check-cast v8, Lq0/a;

    .line 46
    .line 47
    iget-boolean v11, v8, Lq0/a;->p:Z

    .line 48
    .line 49
    if-eqz v11, :cond_1

    .line 50
    .line 51
    add-int/lit8 v7, v7, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 55
    .line 56
    new-instance v2, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v4, "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found "

    .line 65
    .line 66
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v4, " that did not use setReorderingAllowed(true)."

    .line 73
    .line 74
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v1}, Landroidx/fragment/app/e;->f0(Ljava/lang/RuntimeException;)V

    .line 85
    .line 86
    .line 87
    throw v9

    .line 88
    :cond_2
    new-instance v7, Ljava/util/HashSet;

    .line 89
    .line 90
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 91
    .line 92
    .line 93
    move v8, v5

    .line 94
    :goto_1
    iget-object v11, v3, Landroidx/fragment/app/e;->d:Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    if-ge v8, v11, :cond_c

    .line 101
    .line 102
    iget-object v11, v3, Landroidx/fragment/app/e;->d:Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    check-cast v11, Lq0/a;

    .line 109
    .line 110
    new-instance v12, Ljava/util/HashSet;

    .line 111
    .line 112
    invoke-direct {v12}, Ljava/util/HashSet;-><init>()V

    .line 113
    .line 114
    .line 115
    new-instance v13, Ljava/util/HashSet;

    .line 116
    .line 117
    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    .line 118
    .line 119
    .line 120
    iget-object v14, v11, Lq0/a;->a:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v14

    .line 126
    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v15

    .line 130
    if-eqz v15, :cond_9

    .line 131
    .line 132
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v15

    .line 136
    check-cast v15, Lq0/P;

    .line 137
    .line 138
    move-object/from16 v16, v9

    .line 139
    .line 140
    iget-object v9, v15, Lq0/P;->b:Landroidx/fragment/app/b;

    .line 141
    .line 142
    if-nez v9, :cond_3

    .line 143
    .line 144
    move-object/from16 v9, v16

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_3
    iget-boolean v6, v15, Lq0/P;->c:Z

    .line 148
    .line 149
    move/from16 v18, v6

    .line 150
    .line 151
    const/4 v6, 0x2

    .line 152
    if-eqz v18, :cond_4

    .line 153
    .line 154
    move/from16 v18, v8

    .line 155
    .line 156
    iget v8, v15, Lq0/P;->a:I

    .line 157
    .line 158
    move-object/from16 v19, v14

    .line 159
    .line 160
    const/4 v14, 0x1

    .line 161
    if-eq v8, v14, :cond_5

    .line 162
    .line 163
    if-eq v8, v6, :cond_5

    .line 164
    .line 165
    const/16 v14, 0x8

    .line 166
    .line 167
    if-ne v8, v14, :cond_6

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_4
    move/from16 v18, v8

    .line 171
    .line 172
    move-object/from16 v19, v14

    .line 173
    .line 174
    :cond_5
    :goto_3
    invoke-virtual {v7, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    :cond_6
    iget v8, v15, Lq0/P;->a:I

    .line 181
    .line 182
    const/4 v14, 0x1

    .line 183
    if-eq v8, v14, :cond_7

    .line 184
    .line 185
    if-ne v8, v6, :cond_8

    .line 186
    .line 187
    :cond_7
    invoke-virtual {v13, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    :cond_8
    move-object/from16 v9, v16

    .line 191
    .line 192
    move/from16 v8, v18

    .line 193
    .line 194
    move-object/from16 v14, v19

    .line 195
    .line 196
    const/4 v6, 0x1

    .line 197
    goto :goto_2

    .line 198
    :cond_9
    move/from16 v18, v8

    .line 199
    .line 200
    move-object/from16 v16, v9

    .line 201
    .line 202
    invoke-virtual {v12, v13}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12}, Ljava/util/HashSet;->isEmpty()Z

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-nez v6, :cond_b

    .line 210
    .line 211
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 212
    .line 213
    const-string v2, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment"

    .line 214
    .line 215
    invoke-static {v10, v4, v2}, Landroidx/datastore/preferences/protobuf/g;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v12}, Ljava/util/HashSet;->size()I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    const/4 v14, 0x1

    .line 224
    if-ne v4, v14, :cond_a

    .line 225
    .line 226
    new-instance v4, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    const-string v5, " "

    .line 229
    .line 230
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    goto :goto_4

    .line 249
    :cond_a
    new-instance v4, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v5, "s "

    .line 252
    .line 253
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    :goto_4
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    const-string v4, " in "

    .line 267
    .line 268
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    const-string v4, " that were previously added to the FragmentManager through a separate FragmentTransaction."

    .line 275
    .line 276
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v3, v1}, Landroidx/fragment/app/e;->f0(Ljava/lang/RuntimeException;)V

    .line 287
    .line 288
    .line 289
    throw v16

    .line 290
    :cond_b
    add-int/lit8 v8, v18, 0x1

    .line 291
    .line 292
    move-object/from16 v9, v16

    .line 293
    .line 294
    const/4 v6, 0x1

    .line 295
    goto/16 :goto_1

    .line 296
    .line 297
    :cond_c
    move-object/from16 v16, v9

    .line 298
    .line 299
    new-instance v6, Ljava/util/ArrayDeque;

    .line 300
    .line 301
    invoke-direct {v6, v7}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 302
    .line 303
    .line 304
    :cond_d
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    if-nez v8, :cond_11

    .line 309
    .line 310
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v8

    .line 314
    check-cast v8, Landroidx/fragment/app/b;

    .line 315
    .line 316
    iget-boolean v9, v8, Landroidx/fragment/app/b;->W:Z

    .line 317
    .line 318
    if-eqz v9, :cond_f

    .line 319
    .line 320
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 321
    .line 322
    const-string v2, "\") must not contain retained fragments. Found "

    .line 323
    .line 324
    invoke-static {v10, v4, v2}, Landroidx/datastore/preferences/protobuf/g;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    if-eqz v4, :cond_e

    .line 333
    .line 334
    const-string v4, "direct reference to retained "

    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_e
    const-string v4, "retained child "

    .line 338
    .line 339
    :goto_5
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    const-string v4, "fragment "

    .line 343
    .line 344
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v3, v1}, Landroidx/fragment/app/e;->f0(Ljava/lang/RuntimeException;)V

    .line 358
    .line 359
    .line 360
    throw v16

    .line 361
    :cond_f
    iget-object v8, v8, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 362
    .line 363
    iget-object v8, v8, Landroidx/fragment/app/e;->c:Lo4/r;

    .line 364
    .line 365
    invoke-virtual {v8}, Lo4/r;->k()Ljava/util/ArrayList;

    .line 366
    .line 367
    .line 368
    move-result-object v8

    .line 369
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 370
    .line 371
    .line 372
    move-result-object v8

    .line 373
    :cond_10
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result v9

    .line 377
    if-eqz v9, :cond_d

    .line 378
    .line 379
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v9

    .line 383
    check-cast v9, Landroidx/fragment/app/b;

    .line 384
    .line 385
    if-eqz v9, :cond_10

    .line 386
    .line 387
    invoke-virtual {v6, v9}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    goto :goto_6

    .line 391
    :cond_11
    new-instance v6, Ljava/util/ArrayList;

    .line 392
    .line 393
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v7}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    if-eqz v8, :cond_12

    .line 405
    .line 406
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v8

    .line 410
    check-cast v8, Landroidx/fragment/app/b;

    .line 411
    .line 412
    iget-object v8, v8, Landroidx/fragment/app/b;->x:Ljava/lang/String;

    .line 413
    .line 414
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    goto :goto_7

    .line 418
    :cond_12
    new-instance v7, Ljava/util/ArrayList;

    .line 419
    .line 420
    iget-object v8, v3, Landroidx/fragment/app/e;->d:Ljava/util/ArrayList;

    .line 421
    .line 422
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 423
    .line 424
    .line 425
    move-result v8

    .line 426
    sub-int/2addr v8, v5

    .line 427
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 428
    .line 429
    .line 430
    move v8, v5

    .line 431
    :goto_8
    iget-object v9, v3, Landroidx/fragment/app/e;->d:Ljava/util/ArrayList;

    .line 432
    .line 433
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 434
    .line 435
    .line 436
    move-result v9

    .line 437
    if-ge v8, v9, :cond_13

    .line 438
    .line 439
    move-object/from16 v9, v16

    .line 440
    .line 441
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    add-int/lit8 v8, v8, 0x1

    .line 445
    .line 446
    goto :goto_8

    .line 447
    :cond_13
    new-instance v8, Landroidx/fragment/app/BackStackState;

    .line 448
    .line 449
    invoke-direct {v8, v6, v7}, Landroidx/fragment/app/BackStackState;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 450
    .line 451
    .line 452
    iget-object v6, v3, Landroidx/fragment/app/e;->d:Ljava/util/ArrayList;

    .line 453
    .line 454
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 455
    .line 456
    .line 457
    move-result v6

    .line 458
    const/16 v17, 0x1

    .line 459
    .line 460
    add-int/lit8 v6, v6, -0x1

    .line 461
    .line 462
    :goto_9
    if-lt v6, v5, :cond_14

    .line 463
    .line 464
    iget-object v9, v3, Landroidx/fragment/app/e;->d:Ljava/util/ArrayList;

    .line 465
    .line 466
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v9

    .line 470
    check-cast v9, Lq0/a;

    .line 471
    .line 472
    new-instance v10, Lq0/a;

    .line 473
    .line 474
    invoke-direct {v10, v9}, Lq0/a;-><init>(Lq0/a;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v10}, Lq0/a;->e()V

    .line 478
    .line 479
    .line 480
    new-instance v11, Landroidx/fragment/app/BackStackRecordState;

    .line 481
    .line 482
    invoke-direct {v11, v10}, Landroidx/fragment/app/BackStackRecordState;-><init>(Lq0/a;)V

    .line 483
    .line 484
    .line 485
    sub-int v10, v6, v5

    .line 486
    .line 487
    invoke-virtual {v7, v10, v11}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    const/4 v14, 0x1

    .line 491
    iput-boolean v14, v9, Lq0/a;->u:Z

    .line 492
    .line 493
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 497
    .line 498
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    add-int/lit8 v6, v6, -0x1

    .line 502
    .line 503
    goto :goto_9

    .line 504
    :cond_14
    const/4 v14, 0x1

    .line 505
    iget-object v1, v3, Landroidx/fragment/app/e;->l:Ljava/util/Map;

    .line 506
    .line 507
    invoke-interface {v1, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move v6, v14

    .line 511
    :goto_a
    return v6

    .line 512
    :pswitch_0
    iget-object v3, v0, Landroidx/fragment/app/d;->c:Landroidx/fragment/app/e;

    .line 513
    .line 514
    iget-object v4, v3, Landroidx/fragment/app/e;->l:Ljava/util/Map;

    .line 515
    .line 516
    iget-object v5, v0, Landroidx/fragment/app/d;->b:Ljava/lang/String;

    .line 517
    .line 518
    invoke-interface {v4, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v4

    .line 522
    check-cast v4, Landroidx/fragment/app/BackStackState;

    .line 523
    .line 524
    const/4 v5, 0x0

    .line 525
    if-nez v4, :cond_15

    .line 526
    .line 527
    goto/16 :goto_11

    .line 528
    .line 529
    :cond_15
    new-instance v6, Ljava/util/HashMap;

    .line 530
    .line 531
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 535
    .line 536
    .line 537
    move-result-object v7

    .line 538
    :cond_16
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 539
    .line 540
    .line 541
    move-result v8

    .line 542
    if-eqz v8, :cond_18

    .line 543
    .line 544
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v8

    .line 548
    check-cast v8, Lq0/a;

    .line 549
    .line 550
    iget-boolean v9, v8, Lq0/a;->u:Z

    .line 551
    .line 552
    if-eqz v9, :cond_16

    .line 553
    .line 554
    iget-object v8, v8, Lq0/a;->a:Ljava/util/ArrayList;

    .line 555
    .line 556
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 557
    .line 558
    .line 559
    move-result-object v8

    .line 560
    :cond_17
    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 561
    .line 562
    .line 563
    move-result v9

    .line 564
    if-eqz v9, :cond_16

    .line 565
    .line 566
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v9

    .line 570
    check-cast v9, Lq0/P;

    .line 571
    .line 572
    iget-object v9, v9, Lq0/P;->b:Landroidx/fragment/app/b;

    .line 573
    .line 574
    if-eqz v9, :cond_17

    .line 575
    .line 576
    iget-object v10, v9, Landroidx/fragment/app/b;->x:Ljava/lang/String;

    .line 577
    .line 578
    invoke-virtual {v6, v10, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    goto :goto_b

    .line 582
    :cond_18
    new-instance v7, Ljava/util/HashMap;

    .line 583
    .line 584
    iget-object v8, v4, Landroidx/fragment/app/BackStackState;->s:Ljava/util/ArrayList;

    .line 585
    .line 586
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 587
    .line 588
    .line 589
    move-result v9

    .line 590
    invoke-direct {v7, v9}, Ljava/util/HashMap;-><init>(I)V

    .line 591
    .line 592
    .line 593
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 594
    .line 595
    .line 596
    move-result-object v8

    .line 597
    :cond_19
    :goto_c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 598
    .line 599
    .line 600
    move-result v9

    .line 601
    if-eqz v9, :cond_1d

    .line 602
    .line 603
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v9

    .line 607
    check-cast v9, Ljava/lang/String;

    .line 608
    .line 609
    invoke-virtual {v6, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v10

    .line 613
    check-cast v10, Landroidx/fragment/app/b;

    .line 614
    .line 615
    if-eqz v10, :cond_1a

    .line 616
    .line 617
    iget-object v9, v10, Landroidx/fragment/app/b;->x:Ljava/lang/String;

    .line 618
    .line 619
    invoke-virtual {v7, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    goto :goto_c

    .line 623
    :cond_1a
    const/4 v10, 0x0

    .line 624
    iget-object v11, v3, Landroidx/fragment/app/e;->c:Lo4/r;

    .line 625
    .line 626
    invoke-virtual {v11, v9, v10}, Lo4/r;->A(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 627
    .line 628
    .line 629
    move-result-object v9

    .line 630
    if-eqz v9, :cond_19

    .line 631
    .line 632
    iget-object v10, v3, Landroidx/fragment/app/e;->w:Lq0/w;

    .line 633
    .line 634
    iget-object v10, v10, Lq0/w;->t:Li/l;

    .line 635
    .line 636
    invoke-virtual {v10}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 637
    .line 638
    .line 639
    move-result-object v10

    .line 640
    const-string v11, "state"

    .line 641
    .line 642
    invoke-virtual {v9, v11}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 643
    .line 644
    .line 645
    move-result-object v11

    .line 646
    check-cast v11, Landroidx/fragment/app/FragmentState;

    .line 647
    .line 648
    invoke-virtual {v3}, Landroidx/fragment/app/e;->I()Lq0/F;

    .line 649
    .line 650
    .line 651
    move-result-object v12

    .line 652
    invoke-virtual {v11, v12}, Landroidx/fragment/app/FragmentState;->a(Lq0/F;)Landroidx/fragment/app/b;

    .line 653
    .line 654
    .line 655
    move-result-object v11

    .line 656
    iput-object v9, v11, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 657
    .line 658
    const-string v12, "savedInstanceState"

    .line 659
    .line 660
    invoke-virtual {v9, v12}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 661
    .line 662
    .line 663
    move-result-object v13

    .line 664
    if-nez v13, :cond_1b

    .line 665
    .line 666
    iget-object v13, v11, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 667
    .line 668
    new-instance v14, Landroid/os/Bundle;

    .line 669
    .line 670
    invoke-direct {v14}, Landroid/os/Bundle;-><init>()V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v13, v12, v14}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 674
    .line 675
    .line 676
    :cond_1b
    const-string v12, "arguments"

    .line 677
    .line 678
    invoke-virtual {v9, v12}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 679
    .line 680
    .line 681
    move-result-object v9

    .line 682
    if-eqz v9, :cond_1c

    .line 683
    .line 684
    invoke-virtual {v9, v10}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 685
    .line 686
    .line 687
    :cond_1c
    invoke-virtual {v11, v9}, Landroidx/fragment/app/b;->b0(Landroid/os/Bundle;)V

    .line 688
    .line 689
    .line 690
    iget-object v9, v11, Landroidx/fragment/app/b;->x:Ljava/lang/String;

    .line 691
    .line 692
    invoke-virtual {v7, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    goto :goto_c

    .line 696
    :cond_1d
    new-instance v6, Ljava/util/ArrayList;

    .line 697
    .line 698
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 699
    .line 700
    .line 701
    iget-object v4, v4, Landroidx/fragment/app/BackStackState;->t:Ljava/util/ArrayList;

    .line 702
    .line 703
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 704
    .line 705
    .line 706
    move-result-object v4

    .line 707
    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 708
    .line 709
    .line 710
    move-result v8

    .line 711
    if-eqz v8, :cond_21

    .line 712
    .line 713
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v8

    .line 717
    check-cast v8, Landroidx/fragment/app/BackStackRecordState;

    .line 718
    .line 719
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 720
    .line 721
    .line 722
    new-instance v9, Lq0/a;

    .line 723
    .line 724
    invoke-direct {v9, v3}, Lq0/a;-><init>(Landroidx/fragment/app/e;)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v8, v9}, Landroidx/fragment/app/BackStackRecordState;->a(Lq0/a;)V

    .line 728
    .line 729
    .line 730
    move v10, v5

    .line 731
    :goto_e
    iget-object v11, v8, Landroidx/fragment/app/BackStackRecordState;->t:Ljava/util/ArrayList;

    .line 732
    .line 733
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 734
    .line 735
    .line 736
    move-result v12

    .line 737
    if-ge v10, v12, :cond_20

    .line 738
    .line 739
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v11

    .line 743
    check-cast v11, Ljava/lang/String;

    .line 744
    .line 745
    if-eqz v11, :cond_1f

    .line 746
    .line 747
    invoke-virtual {v7, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v12

    .line 751
    check-cast v12, Landroidx/fragment/app/b;

    .line 752
    .line 753
    if-eqz v12, :cond_1e

    .line 754
    .line 755
    iget-object v11, v9, Lq0/a;->a:Ljava/util/ArrayList;

    .line 756
    .line 757
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v11

    .line 761
    check-cast v11, Lq0/P;

    .line 762
    .line 763
    iput-object v12, v11, Lq0/P;->b:Landroidx/fragment/app/b;

    .line 764
    .line 765
    goto :goto_f

    .line 766
    :cond_1e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 767
    .line 768
    new-instance v2, Ljava/lang/StringBuilder;

    .line 769
    .line 770
    const-string v3, "Restoring FragmentTransaction "

    .line 771
    .line 772
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 773
    .line 774
    .line 775
    iget-object v3, v8, Landroidx/fragment/app/BackStackRecordState;->x:Ljava/lang/String;

    .line 776
    .line 777
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 778
    .line 779
    .line 780
    const-string v3, " failed due to missing saved state for Fragment ("

    .line 781
    .line 782
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 786
    .line 787
    .line 788
    const-string v3, ")"

    .line 789
    .line 790
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 791
    .line 792
    .line 793
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v2

    .line 797
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 798
    .line 799
    .line 800
    throw v1

    .line 801
    :cond_1f
    :goto_f
    add-int/lit8 v10, v10, 0x1

    .line 802
    .line 803
    goto :goto_e

    .line 804
    :cond_20
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    goto :goto_d

    .line 808
    :cond_21
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 809
    .line 810
    .line 811
    move-result-object v3

    .line 812
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 813
    .line 814
    .line 815
    move-result v4

    .line 816
    if-eqz v4, :cond_22

    .line 817
    .line 818
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v4

    .line 822
    check-cast v4, Lq0/a;

    .line 823
    .line 824
    invoke-virtual {v4, v1, v2}, Lq0/a;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 825
    .line 826
    .line 827
    const/4 v5, 0x1

    .line 828
    goto :goto_10

    .line 829
    :cond_22
    :goto_11
    return v5

    .line 830
    nop

    .line 831
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
