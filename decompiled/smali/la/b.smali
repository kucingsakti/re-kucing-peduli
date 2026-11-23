.class public final Lla/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX9/z;


# instance fields
.field public volatile a:I

.field public final b:Lla/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lla/a;->a:Lla/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lla/b;->b:Lla/a;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput v0, p0, Lla/b;->a:I

    .line 10
    .line 11
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
.end method


# virtual methods
.method public final a(Lca/f;)LX9/L;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lla/b;->a:I

    .line 6
    .line 7
    iget-object v3, v0, Lca/f;->e:LX9/G;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    if-ne v2, v4, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Lca/f;->b(LX9/G;)LX9/L;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_0
    const/4 v5, 0x4

    .line 18
    if-ne v2, v5, :cond_1

    .line 19
    .line 20
    move v5, v4

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v5, 0x0

    .line 23
    :goto_0
    if-nez v5, :cond_3

    .line 24
    .line 25
    const/4 v7, 0x3

    .line 26
    if-ne v2, v7, :cond_2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_2
    const/4 v4, 0x0

    .line 30
    :cond_3
    :goto_1
    iget-object v2, v3, LX9/G;->d:LX9/J;

    .line 31
    .line 32
    iget-object v7, v0, Lca/f;->d:Lo4/r;

    .line 33
    .line 34
    if-nez v7, :cond_4

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    goto :goto_2

    .line 38
    :cond_4
    iget-object v7, v7, Lo4/r;->w:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v7, Lba/k;

    .line 41
    .line 42
    :goto_2
    new-instance v9, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v10, "--> "

    .line 45
    .line 46
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v10, v3, LX9/G;->b:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const/16 v10, 0x20

    .line 55
    .line 56
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v11, v3, LX9/G;->a:LX9/y;

    .line 60
    .line 61
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v11, ""

    .line 65
    .line 66
    if-eqz v7, :cond_5

    .line 67
    .line 68
    new-instance v12, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v13, " "

    .line 71
    .line 72
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v7, v7, Lba/k;->f:LX9/F;

    .line 76
    .line 77
    invoke-static {v7}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    goto :goto_3

    .line 88
    :cond_5
    move-object v7, v11

    .line 89
    :goto_3
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    const-string v9, "-byte body)"

    .line 97
    .line 98
    const-string v12, " ("

    .line 99
    .line 100
    if-nez v4, :cond_6

    .line 101
    .line 102
    if-eqz v2, :cond_6

    .line 103
    .line 104
    new-instance v13, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, LX9/J;->a()J

    .line 116
    .line 117
    .line 118
    move-result-wide v14

    .line 119
    invoke-virtual {v13, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    :cond_6
    iget-object v13, v1, Lla/b;->b:Lla/a;

    .line 130
    .line 131
    invoke-virtual {v13, v7}, Lla/a;->a(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const-string v7, "identity"

    .line 135
    .line 136
    const-string v13, "gzip"

    .line 137
    .line 138
    const-string v14, "Content-Encoding"

    .line 139
    .line 140
    const-string v15, "-byte body omitted)"

    .line 141
    .line 142
    const-string v6, "UTF_8"

    .line 143
    .line 144
    const-wide/16 v16, -0x1

    .line 145
    .line 146
    if-eqz v4, :cond_10

    .line 147
    .line 148
    iget-object v8, v3, LX9/G;->c:LX9/w;

    .line 149
    .line 150
    if-eqz v2, :cond_9

    .line 151
    .line 152
    move/from16 v18, v10

    .line 153
    .line 154
    invoke-virtual {v2}, LX9/J;->b()LX9/A;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    move/from16 v19, v4

    .line 159
    .line 160
    if-eqz v10, :cond_7

    .line 161
    .line 162
    const-string v4, "Content-Type"

    .line 163
    .line 164
    invoke-virtual {v8, v4}, LX9/w;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    if-nez v4, :cond_7

    .line 169
    .line 170
    iget-object v4, v1, Lla/b;->b:Lla/a;

    .line 171
    .line 172
    move/from16 v20, v5

    .line 173
    .line 174
    new-instance v5, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    const-string v0, "Content-Type: "

    .line 177
    .line 178
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v4, v0}, Lla/a;->a(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_7
    move/from16 v20, v5

    .line 193
    .line 194
    :goto_4
    invoke-virtual {v2}, LX9/J;->a()J

    .line 195
    .line 196
    .line 197
    move-result-wide v4

    .line 198
    cmp-long v0, v4, v16

    .line 199
    .line 200
    if-eqz v0, :cond_8

    .line 201
    .line 202
    const-string v0, "Content-Length"

    .line 203
    .line 204
    invoke-virtual {v8, v0}, LX9/w;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    if-nez v0, :cond_8

    .line 209
    .line 210
    iget-object v0, v1, Lla/b;->b:Lla/a;

    .line 211
    .line 212
    new-instance v4, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    const-string v5, "Content-Length: "

    .line 215
    .line 216
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    move-object v5, v9

    .line 220
    invoke-virtual {v2}, LX9/J;->a()J

    .line 221
    .line 222
    .line 223
    move-result-wide v9

    .line 224
    invoke-virtual {v4, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-virtual {v0, v4}, Lla/a;->a(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_8
    move-object v5, v9

    .line 236
    goto :goto_5

    .line 237
    :cond_9
    move/from16 v19, v4

    .line 238
    .line 239
    move/from16 v20, v5

    .line 240
    .line 241
    move-object v5, v9

    .line 242
    move/from16 v18, v10

    .line 243
    .line 244
    :goto_5
    invoke-virtual {v8}, LX9/w;->size()I

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    const/4 v4, 0x0

    .line 249
    :goto_6
    if-ge v4, v0, :cond_a

    .line 250
    .line 251
    invoke-virtual {v1, v8, v4}, Lla/b;->b(LX9/w;I)V

    .line 252
    .line 253
    .line 254
    add-int/lit8 v4, v4, 0x1

    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_a
    const-string v0, "--> END "

    .line 258
    .line 259
    if-eqz v20, :cond_b

    .line 260
    .line 261
    if-nez v2, :cond_c

    .line 262
    .line 263
    :cond_b
    move-object/from16 v21, v11

    .line 264
    .line 265
    goto/16 :goto_9

    .line 266
    .line 267
    :cond_c
    iget-object v4, v3, LX9/G;->c:LX9/w;

    .line 268
    .line 269
    invoke-virtual {v4, v14}, LX9/w;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    if-eqz v4, :cond_d

    .line 274
    .line 275
    invoke-virtual {v4, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 276
    .line 277
    .line 278
    move-result v8

    .line 279
    if-nez v8, :cond_d

    .line 280
    .line 281
    invoke-virtual {v4, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-nez v4, :cond_d

    .line 286
    .line 287
    iget-object v2, v1, Lla/b;->b:Lla/a;

    .line 288
    .line 289
    new-instance v4, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    iget-object v0, v3, LX9/G;->b:Ljava/lang/String;

    .line 295
    .line 296
    const-string v8, " (encoded body omitted)"

    .line 297
    .line 298
    invoke-static {v4, v0, v8}, LE0/a;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-virtual {v2, v0}, Lla/a;->a(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    :goto_7
    move-object/from16 v21, v11

    .line 306
    .line 307
    goto/16 :goto_a

    .line 308
    .line 309
    :cond_d
    new-instance v4, Lma/f;

    .line 310
    .line 311
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2, v4}, LX9/J;->d(Lma/g;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2}, LX9/J;->b()LX9/A;

    .line 318
    .line 319
    .line 320
    move-result-object v8

    .line 321
    if-eqz v8, :cond_e

    .line 322
    .line 323
    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 324
    .line 325
    invoke-virtual {v8, v9}, LX9/A;->a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 326
    .line 327
    .line 328
    move-result-object v8

    .line 329
    if-eqz v8, :cond_e

    .line 330
    .line 331
    goto :goto_8

    .line 332
    :cond_e
    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 333
    .line 334
    invoke-static {v8, v6}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    :goto_8
    iget-object v9, v1, Lla/b;->b:Lla/a;

    .line 338
    .line 339
    invoke-virtual {v9, v11}, Lla/a;->a(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-static {v4}, Lcom/bumptech/glide/c;->i(Lma/f;)Z

    .line 343
    .line 344
    .line 345
    move-result v9

    .line 346
    if-eqz v9, :cond_f

    .line 347
    .line 348
    iget-object v9, v1, Lla/b;->b:Lla/a;

    .line 349
    .line 350
    move-object/from16 v21, v11

    .line 351
    .line 352
    iget-wide v10, v4, Lma/f;->t:J

    .line 353
    .line 354
    invoke-virtual {v4, v10, v11, v8}, Lma/f;->H(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    invoke-virtual {v9, v4}, Lla/a;->a(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    iget-object v4, v1, Lla/b;->b:Lla/a;

    .line 362
    .line 363
    new-instance v8, Ljava/lang/StringBuilder;

    .line 364
    .line 365
    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    iget-object v0, v3, LX9/G;->b:Ljava/lang/String;

    .line 369
    .line 370
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2}, LX9/J;->a()J

    .line 377
    .line 378
    .line 379
    move-result-wide v9

    .line 380
    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-virtual {v4, v0}, Lla/a;->a(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    goto :goto_a

    .line 394
    :cond_f
    move-object/from16 v21, v11

    .line 395
    .line 396
    iget-object v4, v1, Lla/b;->b:Lla/a;

    .line 397
    .line 398
    new-instance v8, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    iget-object v0, v3, LX9/G;->b:Ljava/lang/String;

    .line 404
    .line 405
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    const-string v0, " (binary "

    .line 409
    .line 410
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v2}, LX9/J;->a()J

    .line 414
    .line 415
    .line 416
    move-result-wide v9

    .line 417
    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-virtual {v4, v0}, Lla/a;->a(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    goto :goto_a

    .line 431
    :goto_9
    iget-object v2, v1, Lla/b;->b:Lla/a;

    .line 432
    .line 433
    new-instance v4, Ljava/lang/StringBuilder;

    .line 434
    .line 435
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    iget-object v0, v3, LX9/G;->b:Ljava/lang/String;

    .line 439
    .line 440
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-virtual {v2, v0}, Lla/a;->a(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    goto :goto_a

    .line 451
    :cond_10
    move/from16 v19, v4

    .line 452
    .line 453
    move/from16 v20, v5

    .line 454
    .line 455
    move-object v5, v9

    .line 456
    move/from16 v18, v10

    .line 457
    .line 458
    goto/16 :goto_7

    .line 459
    .line 460
    :goto_a
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 461
    .line 462
    .line 463
    move-result-wide v8

    .line 464
    move-object/from16 v0, p1

    .line 465
    .line 466
    :try_start_0
    invoke-virtual {v0, v3}, Lca/f;->b(LX9/G;)LX9/L;

    .line 467
    .line 468
    .line 469
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 470
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 471
    .line 472
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 473
    .line 474
    .line 475
    move-result-wide v3

    .line 476
    sub-long/2addr v3, v8

    .line 477
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 478
    .line 479
    .line 480
    move-result-wide v2

    .line 481
    iget-object v4, v0, LX9/L;->y:LX9/O;

    .line 482
    .line 483
    invoke-static {v4}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v4}, LX9/O;->a()J

    .line 487
    .line 488
    .line 489
    move-result-wide v8

    .line 490
    cmp-long v10, v8, v16

    .line 491
    .line 492
    if-eqz v10, :cond_11

    .line 493
    .line 494
    new-instance v10, Ljava/lang/StringBuilder;

    .line 495
    .line 496
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    const-string v11, "-byte"

    .line 503
    .line 504
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v10

    .line 511
    goto :goto_b

    .line 512
    :cond_11
    const-string v10, "unknown-length"

    .line 513
    .line 514
    :goto_b
    iget-object v11, v1, Lla/b;->b:Lla/a;

    .line 515
    .line 516
    move-object/from16 v16, v4

    .line 517
    .line 518
    new-instance v4, Ljava/lang/StringBuilder;

    .line 519
    .line 520
    move-wide/from16 v22, v8

    .line 521
    .line 522
    const-string v8, "<-- "

    .line 523
    .line 524
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    iget v8, v0, LX9/L;->v:I

    .line 528
    .line 529
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    iget-object v8, v0, LX9/L;->u:Ljava/lang/String;

    .line 533
    .line 534
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 535
    .line 536
    .line 537
    move-result v8

    .line 538
    if-nez v8, :cond_12

    .line 539
    .line 540
    move-object/from16 v17, v5

    .line 541
    .line 542
    move-object/from16 v5, v21

    .line 543
    .line 544
    goto :goto_c

    .line 545
    :cond_12
    iget-object v8, v0, LX9/L;->u:Ljava/lang/String;

    .line 546
    .line 547
    new-instance v9, Ljava/lang/StringBuilder;

    .line 548
    .line 549
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 550
    .line 551
    .line 552
    move-object/from16 v17, v5

    .line 553
    .line 554
    invoke-static/range {v18 .. v18}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v5

    .line 558
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v5

    .line 568
    :goto_c
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    move/from16 v5, v18

    .line 572
    .line 573
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    iget-object v5, v0, LX9/L;->s:LX9/G;

    .line 577
    .line 578
    iget-object v5, v5, LX9/G;->a:LX9/y;

    .line 579
    .line 580
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    const-string v2, "ms"

    .line 590
    .line 591
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    if-nez v19, :cond_13

    .line 595
    .line 596
    const-string v2, ", "

    .line 597
    .line 598
    const-string v3, " body"

    .line 599
    .line 600
    invoke-static {v2, v10, v3}, LE0/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    goto :goto_d

    .line 605
    :cond_13
    move-object/from16 v2, v21

    .line 606
    .line 607
    :goto_d
    const/16 v3, 0x29

    .line 608
    .line 609
    invoke-static {v4, v2, v3}, Landroidx/datastore/preferences/protobuf/g;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    invoke-virtual {v11, v2}, Lla/a;->a(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    if-eqz v19, :cond_1d

    .line 617
    .line 618
    iget-object v2, v0, LX9/L;->x:LX9/w;

    .line 619
    .line 620
    invoke-virtual {v2}, LX9/w;->size()I

    .line 621
    .line 622
    .line 623
    move-result v3

    .line 624
    const/4 v4, 0x0

    .line 625
    :goto_e
    if-ge v4, v3, :cond_14

    .line 626
    .line 627
    invoke-virtual {v1, v2, v4}, Lla/b;->b(LX9/w;I)V

    .line 628
    .line 629
    .line 630
    add-int/lit8 v4, v4, 0x1

    .line 631
    .line 632
    goto :goto_e

    .line 633
    :cond_14
    if-eqz v20, :cond_1c

    .line 634
    .line 635
    invoke-static {v0}, Lca/e;->a(LX9/L;)Z

    .line 636
    .line 637
    .line 638
    move-result v3

    .line 639
    if-nez v3, :cond_15

    .line 640
    .line 641
    goto/16 :goto_11

    .line 642
    .line 643
    :cond_15
    iget-object v3, v0, LX9/L;->x:LX9/w;

    .line 644
    .line 645
    invoke-virtual {v3, v14}, LX9/w;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v3

    .line 649
    if-eqz v3, :cond_16

    .line 650
    .line 651
    invoke-virtual {v3, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 652
    .line 653
    .line 654
    move-result v4

    .line 655
    if-nez v4, :cond_16

    .line 656
    .line 657
    invoke-virtual {v3, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 658
    .line 659
    .line 660
    move-result v3

    .line 661
    if-nez v3, :cond_16

    .line 662
    .line 663
    iget-object v2, v1, Lla/b;->b:Lla/a;

    .line 664
    .line 665
    const-string v3, "<-- END HTTP (encoded body omitted)"

    .line 666
    .line 667
    invoke-virtual {v2, v3}, Lla/a;->a(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    return-object v0

    .line 671
    :cond_16
    invoke-virtual/range {v16 .. v16}, LX9/O;->c()Lma/h;

    .line 672
    .line 673
    .line 674
    move-result-object v3

    .line 675
    const-wide v4, 0x7fffffffffffffffL

    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    invoke-interface {v3, v4, v5}, Lma/h;->f(J)Z

    .line 681
    .line 682
    .line 683
    invoke-interface {v3}, Lma/h;->d()Lma/f;

    .line 684
    .line 685
    .line 686
    move-result-object v3

    .line 687
    invoke-virtual {v2, v14}, LX9/w;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    invoke-virtual {v13, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 692
    .line 693
    .line 694
    move-result v2

    .line 695
    if-eqz v2, :cond_17

    .line 696
    .line 697
    iget-wide v4, v3, Lma/f;->t:J

    .line 698
    .line 699
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 700
    .line 701
    .line 702
    move-result-object v8

    .line 703
    new-instance v2, Lma/m;

    .line 704
    .line 705
    invoke-virtual {v3}, Lma/f;->c()Lma/f;

    .line 706
    .line 707
    .line 708
    move-result-object v3

    .line 709
    invoke-direct {v2, v3}, Lma/m;-><init>(Lma/w;)V

    .line 710
    .line 711
    .line 712
    :try_start_1
    new-instance v3, Lma/f;

    .line 713
    .line 714
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v3, v2}, Lma/f;->c0(Lma/w;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 718
    .line 719
    .line 720
    invoke-virtual {v2}, Lma/m;->close()V

    .line 721
    .line 722
    .line 723
    goto :goto_f

    .line 724
    :catchall_0
    move-exception v0

    .line 725
    move-object v3, v0

    .line 726
    :try_start_2
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 727
    :catchall_1
    move-exception v0

    .line 728
    invoke-static {v2, v3}, Lcom/bumptech/glide/c;->c(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 729
    .line 730
    .line 731
    throw v0

    .line 732
    :cond_17
    const/4 v8, 0x0

    .line 733
    :goto_f
    invoke-virtual/range {v16 .. v16}, LX9/O;->b()LX9/A;

    .line 734
    .line 735
    .line 736
    move-result-object v2

    .line 737
    if-eqz v2, :cond_18

    .line 738
    .line 739
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 740
    .line 741
    invoke-virtual {v2, v4}, LX9/A;->a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 742
    .line 743
    .line 744
    move-result-object v2

    .line 745
    if-eqz v2, :cond_18

    .line 746
    .line 747
    goto :goto_10

    .line 748
    :cond_18
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 749
    .line 750
    invoke-static {v2, v6}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 751
    .line 752
    .line 753
    :goto_10
    invoke-static {v3}, Lcom/bumptech/glide/c;->i(Lma/f;)Z

    .line 754
    .line 755
    .line 756
    move-result v4

    .line 757
    if-nez v4, :cond_19

    .line 758
    .line 759
    iget-object v2, v1, Lla/b;->b:Lla/a;

    .line 760
    .line 761
    move-object/from16 v4, v21

    .line 762
    .line 763
    invoke-virtual {v2, v4}, Lla/a;->a(Ljava/lang/String;)V

    .line 764
    .line 765
    .line 766
    iget-object v2, v1, Lla/b;->b:Lla/a;

    .line 767
    .line 768
    new-instance v4, Ljava/lang/StringBuilder;

    .line 769
    .line 770
    const-string v5, "<-- END HTTP (binary "

    .line 771
    .line 772
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 773
    .line 774
    .line 775
    iget-wide v5, v3, Lma/f;->t:J

    .line 776
    .line 777
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 781
    .line 782
    .line 783
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v3

    .line 787
    invoke-virtual {v2, v3}, Lla/a;->a(Ljava/lang/String;)V

    .line 788
    .line 789
    .line 790
    return-object v0

    .line 791
    :cond_19
    move-object/from16 v4, v21

    .line 792
    .line 793
    const-wide/16 v5, 0x0

    .line 794
    .line 795
    cmp-long v5, v22, v5

    .line 796
    .line 797
    if-eqz v5, :cond_1a

    .line 798
    .line 799
    iget-object v5, v1, Lla/b;->b:Lla/a;

    .line 800
    .line 801
    invoke-virtual {v5, v4}, Lla/a;->a(Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    iget-object v4, v1, Lla/b;->b:Lla/a;

    .line 805
    .line 806
    invoke-virtual {v3}, Lma/f;->c()Lma/f;

    .line 807
    .line 808
    .line 809
    move-result-object v5

    .line 810
    iget-wide v6, v5, Lma/f;->t:J

    .line 811
    .line 812
    invoke-virtual {v5, v6, v7, v2}, Lma/f;->H(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    invoke-virtual {v4, v2}, Lla/a;->a(Ljava/lang/String;)V

    .line 817
    .line 818
    .line 819
    :cond_1a
    const-string v2, "<-- END HTTP ("

    .line 820
    .line 821
    if-eqz v8, :cond_1b

    .line 822
    .line 823
    iget-object v4, v1, Lla/b;->b:Lla/a;

    .line 824
    .line 825
    new-instance v5, Ljava/lang/StringBuilder;

    .line 826
    .line 827
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 828
    .line 829
    .line 830
    iget-wide v2, v3, Lma/f;->t:J

    .line 831
    .line 832
    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 833
    .line 834
    .line 835
    const-string v2, "-byte, "

    .line 836
    .line 837
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 841
    .line 842
    .line 843
    const-string v2, "-gzipped-byte body)"

    .line 844
    .line 845
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 846
    .line 847
    .line 848
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 849
    .line 850
    .line 851
    move-result-object v2

    .line 852
    invoke-virtual {v4, v2}, Lla/a;->a(Ljava/lang/String;)V

    .line 853
    .line 854
    .line 855
    return-object v0

    .line 856
    :cond_1b
    iget-object v4, v1, Lla/b;->b:Lla/a;

    .line 857
    .line 858
    new-instance v5, Ljava/lang/StringBuilder;

    .line 859
    .line 860
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    iget-wide v2, v3, Lma/f;->t:J

    .line 864
    .line 865
    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 866
    .line 867
    .line 868
    move-object/from16 v2, v17

    .line 869
    .line 870
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 871
    .line 872
    .line 873
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v2

    .line 877
    invoke-virtual {v4, v2}, Lla/a;->a(Ljava/lang/String;)V

    .line 878
    .line 879
    .line 880
    return-object v0

    .line 881
    :cond_1c
    :goto_11
    iget-object v2, v1, Lla/b;->b:Lla/a;

    .line 882
    .line 883
    const-string v3, "<-- END HTTP"

    .line 884
    .line 885
    invoke-virtual {v2, v3}, Lla/a;->a(Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    :cond_1d
    return-object v0

    .line 889
    :catch_0
    move-exception v0

    .line 890
    iget-object v2, v1, Lla/b;->b:Lla/a;

    .line 891
    .line 892
    new-instance v3, Ljava/lang/StringBuilder;

    .line 893
    .line 894
    const-string v4, "<-- HTTP FAILED: "

    .line 895
    .line 896
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 900
    .line 901
    .line 902
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 903
    .line 904
    .line 905
    move-result-object v3

    .line 906
    invoke-virtual {v2, v3}, Lla/a;->a(Ljava/lang/String;)V

    .line 907
    .line 908
    .line 909
    throw v0
    .line 910
    .line 911
    .line 912
    .line 913
.end method

.method public final b(LX9/w;I)V
    .locals 3

    .line 1
    invoke-virtual {p1, p2}, LX9/w;->f(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p2}, LX9/w;->m(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lla/b;->b:Lla/a;

    .line 9
    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, LX9/w;->f(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p1, ": "

    .line 23
    .line 24
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v1, p1}, Lla/a;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
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
