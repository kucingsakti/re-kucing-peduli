.class public final Lta/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:[Ljava/lang/String;

.field public static final e:[Ljava/lang/String;

.field public static final f:Ljava/util/regex/Pattern;

.field public static final g:Ljava/util/regex/Pattern;


# instance fields
.field public final a:LS3/a;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v0, "~"

    .line 2
    .line 3
    const-string v1, " "

    .line 4
    .line 5
    const-string v2, ","

    .line 6
    .line 7
    const-string v3, ">"

    .line 8
    .line 9
    const-string v4, "+"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lta/o;->d:[Ljava/lang/String;

    .line 16
    .line 17
    const-string v5, "*="

    .line 18
    .line 19
    const-string v6, "~="

    .line 20
    .line 21
    const-string v1, "="

    .line 22
    .line 23
    const-string v2, "!="

    .line 24
    .line 25
    const-string v3, "^="

    .line 26
    .line 27
    const-string v4, "$="

    .line 28
    .line 29
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lta/o;->e:[Ljava/lang/String;

    .line 34
    .line 35
    const-string v0, "(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?"

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lta/o;->f:Ljava/util/regex/Pattern;

    .line 43
    .line 44
    const-string v0, "([+-])?(\\d+)"

    .line 45
    .line 46
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lta/o;->g:Ljava/util/regex/Pattern;

    .line 51
    .line 52
    return-void
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

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lta/o;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-static {p1}, Lqa/b;->u(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lta/o;->b:Ljava/lang/String;

    .line 19
    .line 20
    new-instance v0, LS3/a;

    .line 21
    .line 22
    invoke-direct {v0, p1}, LS3/a;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lta/o;->a:LS3/a;

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static j(Ljava/lang/String;)Lta/m;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lta/o;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lta/o;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lta/o;->i()Lta/m;

    .line 7
    .line 8
    .line 9
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return-object p0

    .line 11
    :catch_0
    move-exception p0

    .line 12
    new-instance v0, Lorg/jsoup/select/Selector$SelectorParseException;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
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
.method public final a(C)V
    .locals 10

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v3, p0, Lta/o;->a:LS3/a;

    .line 5
    .line 6
    invoke-virtual {v3}, LS3/a;->f()Z

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lra/a;->b()Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    :goto_0
    invoke-virtual {v3}, LS3/a;->g()Z

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    if-nez v5, :cond_4

    .line 18
    .line 19
    const-string v5, "("

    .line 20
    .line 21
    invoke-virtual {v3, v5}, LS3/a;->i(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v5, 0x28

    .line 31
    .line 32
    const/16 v6, 0x29

    .line 33
    .line 34
    invoke-virtual {v3, v5, v6}, LS3/a;->a(CC)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v5, ")"

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const-string v5, "["

    .line 48
    .line 49
    invoke-virtual {v3, v5}, LS3/a;->i(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const/16 v5, 0x5b

    .line 59
    .line 60
    const/16 v6, 0x5d

    .line 61
    .line 62
    invoke-virtual {v3, v5, v6}, LS3/a;->a(CC)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v5, "]"

    .line 70
    .line 71
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    sget-object v5, Lta/o;->d:[Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v3, v5}, LS3/a;->j([Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_3

    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-lez v5, :cond_2

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    invoke-virtual {v3}, LS3/a;->c()C

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    invoke-virtual {v3}, LS3/a;->c()C

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_4
    :goto_1
    invoke-static {v4}, Lra/a;->g(Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-static {v3}, Lta/o;->j(Ljava/lang/String;)Lta/m;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    iget-object v4, p0, Lta/o;->c:Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    const/16 v6, 0x2c

    .line 117
    .line 118
    if-ne v5, v1, :cond_7

    .line 119
    .line 120
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    check-cast v5, Lta/m;

    .line 125
    .line 126
    instance-of v7, v5, Lta/b;

    .line 127
    .line 128
    if-eqz v7, :cond_6

    .line 129
    .line 130
    if-eq p1, v6, :cond_6

    .line 131
    .line 132
    move-object v7, v5

    .line 133
    check-cast v7, Lta/b;

    .line 134
    .line 135
    iget v8, v7, Lta/c;->b:I

    .line 136
    .line 137
    if-lez v8, :cond_5

    .line 138
    .line 139
    iget-object v7, v7, Lta/c;->a:Ljava/util/ArrayList;

    .line 140
    .line 141
    sub-int/2addr v8, v1

    .line 142
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    check-cast v7, Lta/m;

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_5
    const/4 v7, 0x0

    .line 150
    :goto_2
    move-object v8, v7

    .line 151
    move-object v7, v5

    .line 152
    move-object v5, v8

    .line 153
    move v8, v1

    .line 154
    goto :goto_4

    .line 155
    :cond_6
    :goto_3
    move v8, v2

    .line 156
    move-object v7, v5

    .line 157
    goto :goto_4

    .line 158
    :cond_7
    new-instance v5, Lta/a;

    .line 159
    .line 160
    invoke-direct {v5, v4}, Lta/a;-><init>(Ljava/util/List;)V

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :goto_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 165
    .line 166
    .line 167
    const/16 v9, 0x20

    .line 168
    .line 169
    if-eq p1, v9, :cond_d

    .line 170
    .line 171
    const/16 v9, 0x3e

    .line 172
    .line 173
    if-eq p1, v9, :cond_c

    .line 174
    .line 175
    const/16 v9, 0x7e

    .line 176
    .line 177
    if-eq p1, v9, :cond_b

    .line 178
    .line 179
    const/16 v9, 0x2b

    .line 180
    .line 181
    if-eq p1, v9, :cond_a

    .line 182
    .line 183
    if-ne p1, v6, :cond_9

    .line 184
    .line 185
    instance-of p1, v5, Lta/b;

    .line 186
    .line 187
    if-eqz p1, :cond_8

    .line 188
    .line 189
    check-cast v5, Lta/b;

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_8
    new-instance p1, Lta/b;

    .line 193
    .line 194
    invoke-direct {p1}, Lta/c;-><init>()V

    .line 195
    .line 196
    .line 197
    iget-object v0, p1, Lta/c;->a:Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    iput v0, p1, Lta/c;->b:I

    .line 207
    .line 208
    move-object v5, p1

    .line 209
    :goto_5
    iget-object p1, v5, Lta/c;->a:Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    iput p1, v5, Lta/c;->b:I

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_9
    new-instance v0, Lorg/jsoup/select/Selector$SelectorParseException;

    .line 222
    .line 223
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    new-array v1, v1, [Ljava/lang/Object;

    .line 228
    .line 229
    aput-object p1, v1, v2

    .line 230
    .line 231
    const-string p1, "Unknown combinator \'%s\'"

    .line 232
    .line 233
    invoke-direct {v0, p1, v1}, Lorg/jsoup/select/Selector$SelectorParseException;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    throw v0

    .line 237
    :cond_a
    new-instance p1, Lta/a;

    .line 238
    .line 239
    new-instance v6, Lta/q;

    .line 240
    .line 241
    invoke-direct {v6, v1}, Lta/q;-><init>(I)V

    .line 242
    .line 243
    .line 244
    iput-object v5, v6, Lta/r;->a:Lta/m;

    .line 245
    .line 246
    new-array v0, v0, [Lta/m;

    .line 247
    .line 248
    aput-object v6, v0, v2

    .line 249
    .line 250
    aput-object v3, v0, v1

    .line 251
    .line 252
    invoke-direct {p1, v0}, Lta/a;-><init>([Lta/m;)V

    .line 253
    .line 254
    .line 255
    :goto_6
    move-object v5, p1

    .line 256
    goto :goto_7

    .line 257
    :cond_b
    new-instance p1, Lta/a;

    .line 258
    .line 259
    new-instance v6, Lta/q;

    .line 260
    .line 261
    const/4 v9, 0x4

    .line 262
    invoke-direct {v6, v9}, Lta/q;-><init>(I)V

    .line 263
    .line 264
    .line 265
    iput-object v5, v6, Lta/r;->a:Lta/m;

    .line 266
    .line 267
    new-array v0, v0, [Lta/m;

    .line 268
    .line 269
    aput-object v6, v0, v2

    .line 270
    .line 271
    aput-object v3, v0, v1

    .line 272
    .line 273
    invoke-direct {p1, v0}, Lta/a;-><init>([Lta/m;)V

    .line 274
    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_c
    new-instance p1, Lta/a;

    .line 278
    .line 279
    new-instance v6, Lta/q;

    .line 280
    .line 281
    invoke-direct {v6, v2}, Lta/q;-><init>(I)V

    .line 282
    .line 283
    .line 284
    iput-object v5, v6, Lta/r;->a:Lta/m;

    .line 285
    .line 286
    new-array v0, v0, [Lta/m;

    .line 287
    .line 288
    aput-object v6, v0, v2

    .line 289
    .line 290
    aput-object v3, v0, v1

    .line 291
    .line 292
    invoke-direct {p1, v0}, Lta/a;-><init>([Lta/m;)V

    .line 293
    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_d
    new-instance p1, Lta/a;

    .line 297
    .line 298
    new-instance v6, Lta/q;

    .line 299
    .line 300
    const/4 v9, 0x3

    .line 301
    invoke-direct {v6, v9}, Lta/q;-><init>(I)V

    .line 302
    .line 303
    .line 304
    iput-object v5, v6, Lta/r;->a:Lta/m;

    .line 305
    .line 306
    new-array v0, v0, [Lta/m;

    .line 307
    .line 308
    aput-object v6, v0, v2

    .line 309
    .line 310
    aput-object v3, v0, v1

    .line 311
    .line 312
    invoke-direct {p1, v0}, Lta/a;-><init>([Lta/m;)V

    .line 313
    .line 314
    .line 315
    goto :goto_6

    .line 316
    :goto_7
    if-eqz v8, :cond_e

    .line 317
    .line 318
    move-object p1, v7

    .line 319
    check-cast p1, Lta/b;

    .line 320
    .line 321
    iget-object v0, p1, Lta/c;->a:Ljava/util/ArrayList;

    .line 322
    .line 323
    iget p1, p1, Lta/c;->b:I

    .line 324
    .line 325
    sub-int/2addr p1, v1

    .line 326
    invoke-virtual {v0, p1, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_e
    move-object v7, v5

    .line 331
    :goto_8
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    return-void
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
.end method

.method public final b()I
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lta/o;->a:LS3/a;

    .line 3
    .line 4
    invoke-virtual {v1}, LS3/a;->b()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Lra/a;->a:[Ljava/lang/String;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    move v4, v2

    .line 29
    :goto_0
    if-ge v4, v3, :cond_3

    .line 30
    .line 31
    invoke-virtual {v1, v4}, Ljava/lang/String;->codePointAt(I)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-static {v5}, Ljava/lang/Character;->isDigit(I)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_2

    .line 40
    .line 41
    :cond_1
    :goto_1
    move v0, v2

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    add-int/2addr v4, v0

    .line 44
    goto :goto_0

    .line 45
    :cond_3
    :goto_2
    if-eqz v0, :cond_4

    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    return v0

    .line 52
    :cond_4
    new-instance v0, Lorg/jsoup/helper/ValidationException;

    .line 53
    .line 54
    const-string v1, "Index must be numeric"

    .line 55
    .line 56
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v0
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

.method public final c(Z)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, ":containsOwn"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v0, ":contains"

    .line 7
    .line 8
    :goto_0
    iget-object v1, p0, Lta/o;->a:LS3/a;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, LS3/a;->d(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/16 v2, 0x28

    .line 14
    .line 15
    const/16 v3, 0x29

    .line 16
    .line 17
    invoke-virtual {v1, v2, v3}, LS3/a;->a(CC)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, LS3/a;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "(text) query must not be empty"

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v1, v0}, Lqa/b;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lta/o;->c:Ljava/util/ArrayList;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    new-instance p1, Lta/e;

    .line 39
    .line 40
    const/4 v2, 0x4

    .line 41
    invoke-direct {p1, v1, v2}, Lta/e;-><init>(Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    new-instance p1, Lta/e;

    .line 46
    .line 47
    const/4 v2, 0x5

    .line 48
    invoke-direct {p1, v1, v2}, Lta/e;-><init>(Ljava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    :goto_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    return-void
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

.method public final d(Z)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, ":containsWholeOwnText"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v0, ":containsWholeText"

    .line 7
    .line 8
    :goto_0
    iget-object v1, p0, Lta/o;->a:LS3/a;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, LS3/a;->d(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/16 v2, 0x28

    .line 14
    .line 15
    const/16 v3, 0x29

    .line 16
    .line 17
    invoke-virtual {v1, v2, v3}, LS3/a;->a(CC)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, LS3/a;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "(text) query must not be empty"

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v1, v0}, Lqa/b;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lta/o;->c:Ljava/util/ArrayList;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    new-instance p1, Lta/e;

    .line 39
    .line 40
    const/4 v2, 0x6

    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-direct {p1, v1, v3, v2}, Lta/e;-><init>(Ljava/lang/String;ZI)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Lta/e;

    .line 47
    .line 48
    const/4 v2, 0x7

    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-direct {p1, v1, v3, v2}, Lta/e;-><init>(Ljava/lang/String;ZI)V

    .line 51
    .line 52
    .line 53
    :goto_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    return-void
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

.method public final e(ZZ)V
    .locals 10

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Lta/o;->a:LS3/a;

    .line 4
    .line 5
    invoke-virtual {v2}, LS3/a;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {v2}, LJ7/j;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v3, Lta/o;->f:Ljava/util/regex/Pattern;

    .line 14
    .line 15
    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sget-object v4, Lta/o;->g:Ljava/util/regex/Pattern;

    .line 20
    .line 21
    invoke-virtual {v4, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const-string v5, "odd"

    .line 26
    .line 27
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const/4 v6, 0x2

    .line 32
    const/4 v7, 0x1

    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    move v2, v6

    .line 36
    move v3, v7

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    const-string v5, "even"

    .line 39
    .line 40
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_1

    .line 45
    .line 46
    move v3, v1

    .line 47
    move v2, v6

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    const-string v8, ""

    .line 54
    .line 55
    const-string v9, "^\\+"

    .line 56
    .line 57
    if-eqz v5, :cond_4

    .line 58
    .line 59
    invoke-virtual {v3, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    invoke-virtual {v3, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2, v9, v8}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    move v2, v7

    .line 79
    :goto_0
    const/4 v4, 0x4

    .line 80
    invoke-virtual {v3, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    if-eqz v5, :cond_3

    .line 85
    .line 86
    invoke-virtual {v3, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v3, v9, v8}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    goto :goto_1

    .line 99
    :cond_3
    move v3, v1

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_8

    .line 106
    .line 107
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v2, v9, v8}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    move v2, v1

    .line 120
    :goto_1
    iget-object v4, p0, Lta/o;->c:Ljava/util/ArrayList;

    .line 121
    .line 122
    if-eqz p2, :cond_6

    .line 123
    .line 124
    if-eqz p1, :cond_5

    .line 125
    .line 126
    new-instance p1, Lta/k;

    .line 127
    .line 128
    invoke-direct {p1, v2, v3, v6}, Lta/k;-><init>(III)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_5
    new-instance p1, Lta/k;

    .line 136
    .line 137
    invoke-direct {p1, v2, v3, v0}, Lta/k;-><init>(III)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_6
    if-eqz p1, :cond_7

    .line 145
    .line 146
    new-instance p1, Lta/k;

    .line 147
    .line 148
    invoke-direct {p1, v2, v3, v7}, Lta/k;-><init>(III)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_7
    new-instance p1, Lta/k;

    .line 156
    .line 157
    invoke-direct {p1, v2, v3, v1}, Lta/k;-><init>(III)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_8
    new-instance p1, Lorg/jsoup/select/Selector$SelectorParseException;

    .line 165
    .line 166
    const-string p2, "Could not parse nth-index \'%s\': unexpected format"

    .line 167
    .line 168
    new-array v0, v7, [Ljava/lang/Object;

    .line 169
    .line 170
    aput-object v2, v0, v1

    .line 171
    .line 172
    invoke-direct {p1, p2, v0}, Lorg/jsoup/select/Selector$SelectorParseException;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    throw p1
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

.method public final f()V
    .locals 11

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x2

    .line 7
    const/4 v5, 0x0

    .line 8
    iget-object v6, p0, Lta/o;->a:LS3/a;

    .line 9
    .line 10
    const-string v7, "#"

    .line 11
    .line 12
    invoke-virtual {v6, v7}, LS3/a;->h(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v7

    .line 16
    iget-object v8, p0, Lta/o;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    if-eqz v7, :cond_0

    .line 19
    .line 20
    invoke-virtual {v6}, LS3/a;->e()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lqa/b;->u(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Lta/e;

    .line 28
    .line 29
    const/16 v2, 0x8

    .line 30
    .line 31
    invoke-direct {v1, v0, v5, v2}, Lta/e;-><init>(Ljava/lang/String;ZI)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    const-string v7, "."

    .line 39
    .line 40
    invoke-virtual {v6, v7}, LS3/a;->h(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_1

    .line 45
    .line 46
    invoke-virtual {v6}, LS3/a;->e()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Lqa/b;->u(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    new-instance v1, Lta/e;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {v1, v0, v5, v4}, Lta/e;-><init>(Ljava/lang/String;ZI)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    invoke-virtual {v6}, LS3/a;->k()Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    const-string v9, "*|"

    .line 71
    .line 72
    if-nez v7, :cond_29

    .line 73
    .line 74
    invoke-virtual {v6, v9}, LS3/a;->i(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_2

    .line 79
    .line 80
    goto/16 :goto_1

    .line 81
    .line 82
    :cond_2
    const-string v0, "["

    .line 83
    .line 84
    invoke-virtual {v6, v0}, LS3/a;->i(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object v7, p0, Lta/o;->b:Ljava/lang/String;

    .line 89
    .line 90
    if-eqz v0, :cond_c

    .line 91
    .line 92
    new-instance v0, LS3/a;

    .line 93
    .line 94
    const/16 v9, 0x5b

    .line 95
    .line 96
    const/16 v10, 0x5d

    .line 97
    .line 98
    invoke-virtual {v6, v9, v10}, LS3/a;->a(CC)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-direct {v0, v6}, LS3/a;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    sget-object v6, Lta/o;->e:[Ljava/lang/String;

    .line 106
    .line 107
    iget v9, v0, LS3/a;->c:I

    .line 108
    .line 109
    :goto_0
    invoke-virtual {v0}, LS3/a;->g()Z

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    if-nez v10, :cond_3

    .line 114
    .line 115
    invoke-virtual {v0, v6}, LS3/a;->j([Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    if-nez v10, :cond_3

    .line 120
    .line 121
    iget v10, v0, LS3/a;->c:I

    .line 122
    .line 123
    add-int/2addr v10, v3

    .line 124
    iput v10, v0, LS3/a;->c:I

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    iget-object v6, v0, LS3/a;->b:Ljava/lang/String;

    .line 128
    .line 129
    iget v10, v0, LS3/a;->c:I

    .line 130
    .line 131
    invoke-virtual {v6, v9, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    invoke-static {v6}, Lqa/b;->u(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, LS3/a;->f()Z

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, LS3/a;->g()Z

    .line 142
    .line 143
    .line 144
    move-result v9

    .line 145
    if-eqz v9, :cond_5

    .line 146
    .line 147
    const-string v0, "^"

    .line 148
    .line 149
    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_4

    .line 154
    .line 155
    new-instance v0, Lta/e;

    .line 156
    .line 157
    invoke-virtual {v6, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-direct {v0, v1, v3}, Lta/e;-><init>(Ljava/lang/String;I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_4
    new-instance v0, Lta/e;

    .line 169
    .line 170
    invoke-direct {v0, v6, v5, v5}, Lta/e;-><init>(Ljava/lang/String;ZI)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_5
    const-string v9, "="

    .line 178
    .line 179
    invoke-virtual {v0, v9}, LS3/a;->h(Ljava/lang/String;)Z

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    if-eqz v9, :cond_6

    .line 184
    .line 185
    new-instance v1, Lta/f;

    .line 186
    .line 187
    invoke-virtual {v0}, LS3/a;->l()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-direct {v1, v6, v5, v0, v3}, Lta/f;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_6
    const-string v9, "!="

    .line 199
    .line 200
    invoke-virtual {v0, v9}, LS3/a;->h(Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-eqz v9, :cond_7

    .line 205
    .line 206
    new-instance v1, Lta/f;

    .line 207
    .line 208
    invoke-virtual {v0}, LS3/a;->l()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-direct {v1, v6, v2, v0, v3}, Lta/f;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_7
    const-string v2, "^="

    .line 220
    .line 221
    invoke-virtual {v0, v2}, LS3/a;->h(Ljava/lang/String;)Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_8

    .line 226
    .line 227
    new-instance v2, Lta/f;

    .line 228
    .line 229
    invoke-virtual {v0}, LS3/a;->l()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-direct {v2, v6, v1, v0, v5}, Lta/f;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :cond_8
    const-string v1, "$="

    .line 241
    .line 242
    invoke-virtual {v0, v1}, LS3/a;->h(Ljava/lang/String;)Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-eqz v1, :cond_9

    .line 247
    .line 248
    new-instance v1, Lta/f;

    .line 249
    .line 250
    invoke-virtual {v0}, LS3/a;->l()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-direct {v1, v6, v4, v0, v5}, Lta/f;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    return-void

    .line 261
    :cond_9
    const-string v1, "*="

    .line 262
    .line 263
    invoke-virtual {v0, v1}, LS3/a;->h(Ljava/lang/String;)Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-eqz v1, :cond_a

    .line 268
    .line 269
    new-instance v1, Lta/f;

    .line 270
    .line 271
    invoke-virtual {v0}, LS3/a;->l()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-direct {v1, v6, v3, v0, v3}, Lta/f;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :cond_a
    const-string v1, "~="

    .line 283
    .line 284
    invoke-virtual {v0, v1}, LS3/a;->h(Ljava/lang/String;)Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-eqz v1, :cond_b

    .line 289
    .line 290
    new-instance v1, Lta/g;

    .line 291
    .line 292
    invoke-virtual {v0}, LS3/a;->l()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 301
    .line 302
    .line 303
    invoke-static {v6}, LJ7/j;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    iput-object v2, v1, Lta/g;->a:Ljava/lang/String;

    .line 308
    .line 309
    iput-object v0, v1, Lta/g;->b:Ljava/util/regex/Pattern;

    .line 310
    .line 311
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :cond_b
    new-instance v1, Lorg/jsoup/select/Selector$SelectorParseException;

    .line 316
    .line 317
    invoke-virtual {v0}, LS3/a;->l()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    new-array v2, v4, [Ljava/lang/Object;

    .line 322
    .line 323
    aput-object v7, v2, v5

    .line 324
    .line 325
    aput-object v0, v2, v3

    .line 326
    .line 327
    const-string v0, "Could not parse attribute query \'%s\': unexpected token at \'%s\'"

    .line 328
    .line 329
    invoke-direct {v1, v0, v2}, Lorg/jsoup/select/Selector$SelectorParseException;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    throw v1

    .line 333
    :cond_c
    const-string v0, "*"

    .line 334
    .line 335
    invoke-virtual {v6, v0}, LS3/a;->h(Ljava/lang/String;)Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-eqz v0, :cond_d

    .line 340
    .line 341
    new-instance v0, Lta/d;

    .line 342
    .line 343
    invoke-direct {v0, v5}, Lta/d;-><init>(I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    return-void

    .line 350
    :cond_d
    const-string v0, ":lt("

    .line 351
    .line 352
    invoke-virtual {v6, v0}, LS3/a;->h(Ljava/lang/String;)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-eqz v0, :cond_e

    .line 357
    .line 358
    new-instance v0, Lta/h;

    .line 359
    .line 360
    invoke-virtual {p0}, Lta/o;->b()I

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    invoke-direct {v0, v1, v4}, Lta/h;-><init>(II)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :cond_e
    const-string v0, ":gt("

    .line 372
    .line 373
    invoke-virtual {v6, v0}, LS3/a;->h(Ljava/lang/String;)Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-eqz v0, :cond_f

    .line 378
    .line 379
    new-instance v0, Lta/h;

    .line 380
    .line 381
    invoke-virtual {p0}, Lta/o;->b()I

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    invoke-direct {v0, v1, v3}, Lta/h;-><init>(II)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    return-void

    .line 392
    :cond_f
    const-string v0, ":eq("

    .line 393
    .line 394
    invoke-virtual {v6, v0}, LS3/a;->h(Ljava/lang/String;)Z

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    if-eqz v0, :cond_10

    .line 399
    .line 400
    new-instance v0, Lta/h;

    .line 401
    .line 402
    invoke-virtual {p0}, Lta/o;->b()I

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    invoke-direct {v0, v1, v5}, Lta/h;-><init>(II)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    return-void

    .line 413
    :cond_10
    const-string v0, ":has("

    .line 414
    .line 415
    invoke-virtual {v6, v0}, LS3/a;->i(Ljava/lang/String;)Z

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    const/16 v9, 0x29

    .line 420
    .line 421
    const/16 v10, 0x28

    .line 422
    .line 423
    if-eqz v0, :cond_11

    .line 424
    .line 425
    const-string v0, ":has"

    .line 426
    .line 427
    invoke-virtual {v6, v0}, LS3/a;->d(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v6, v10, v9}, LS3/a;->a(CC)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    const-string v1, ":has(selector) sub-select must not be empty"

    .line 435
    .line 436
    invoke-static {v0, v1}, Lqa/b;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    new-instance v1, Lta/p;

    .line 440
    .line 441
    invoke-static {v0}, Lta/o;->j(Ljava/lang/String;)Lta/m;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    invoke-direct {v1, v0}, Lta/p;-><init>(Lta/m;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    return-void

    .line 452
    :cond_11
    const-string v0, ":contains("

    .line 453
    .line 454
    invoke-virtual {v6, v0}, LS3/a;->i(Ljava/lang/String;)Z

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    if-eqz v0, :cond_12

    .line 459
    .line 460
    invoke-virtual {p0, v5}, Lta/o;->c(Z)V

    .line 461
    .line 462
    .line 463
    return-void

    .line 464
    :cond_12
    const-string v0, ":containsOwn("

    .line 465
    .line 466
    invoke-virtual {v6, v0}, LS3/a;->i(Ljava/lang/String;)Z

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    if-eqz v0, :cond_13

    .line 471
    .line 472
    invoke-virtual {p0, v3}, Lta/o;->c(Z)V

    .line 473
    .line 474
    .line 475
    return-void

    .line 476
    :cond_13
    const-string v0, ":containsWholeText("

    .line 477
    .line 478
    invoke-virtual {v6, v0}, LS3/a;->i(Ljava/lang/String;)Z

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    if-eqz v0, :cond_14

    .line 483
    .line 484
    invoke-virtual {p0, v5}, Lta/o;->d(Z)V

    .line 485
    .line 486
    .line 487
    return-void

    .line 488
    :cond_14
    const-string v0, ":containsWholeOwnText("

    .line 489
    .line 490
    invoke-virtual {v6, v0}, LS3/a;->i(Ljava/lang/String;)Z

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    if-eqz v0, :cond_15

    .line 495
    .line 496
    invoke-virtual {p0, v3}, Lta/o;->d(Z)V

    .line 497
    .line 498
    .line 499
    return-void

    .line 500
    :cond_15
    const-string v0, ":containsData("

    .line 501
    .line 502
    invoke-virtual {v6, v0}, LS3/a;->i(Ljava/lang/String;)Z

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    if-eqz v0, :cond_16

    .line 507
    .line 508
    const-string v0, ":containsData"

    .line 509
    .line 510
    invoke-virtual {v6, v0}, LS3/a;->d(Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v6, v10, v9}, LS3/a;->a(CC)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-static {v0}, LS3/a;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    const-string v1, ":containsData(text) query must not be empty"

    .line 522
    .line 523
    invoke-static {v0, v1}, Lqa/b;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    new-instance v1, Lta/e;

    .line 527
    .line 528
    invoke-direct {v1, v0, v2}, Lta/e;-><init>(Ljava/lang/String;I)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 532
    .line 533
    .line 534
    return-void

    .line 535
    :cond_16
    const-string v0, ":matches("

    .line 536
    .line 537
    invoke-virtual {v6, v0}, LS3/a;->i(Ljava/lang/String;)Z

    .line 538
    .line 539
    .line 540
    move-result v0

    .line 541
    if-eqz v0, :cond_17

    .line 542
    .line 543
    invoke-virtual {p0, v5}, Lta/o;->g(Z)V

    .line 544
    .line 545
    .line 546
    return-void

    .line 547
    :cond_17
    const-string v0, ":matchesOwn("

    .line 548
    .line 549
    invoke-virtual {v6, v0}, LS3/a;->i(Ljava/lang/String;)Z

    .line 550
    .line 551
    .line 552
    move-result v0

    .line 553
    if-eqz v0, :cond_18

    .line 554
    .line 555
    invoke-virtual {p0, v3}, Lta/o;->g(Z)V

    .line 556
    .line 557
    .line 558
    return-void

    .line 559
    :cond_18
    const-string v0, ":matchesWholeText("

    .line 560
    .line 561
    invoke-virtual {v6, v0}, LS3/a;->i(Ljava/lang/String;)Z

    .line 562
    .line 563
    .line 564
    move-result v0

    .line 565
    if-eqz v0, :cond_19

    .line 566
    .line 567
    invoke-virtual {p0, v5}, Lta/o;->h(Z)V

    .line 568
    .line 569
    .line 570
    return-void

    .line 571
    :cond_19
    const-string v0, ":matchesWholeOwnText("

    .line 572
    .line 573
    invoke-virtual {v6, v0}, LS3/a;->i(Ljava/lang/String;)Z

    .line 574
    .line 575
    .line 576
    move-result v0

    .line 577
    if-eqz v0, :cond_1a

    .line 578
    .line 579
    invoke-virtual {p0, v3}, Lta/o;->h(Z)V

    .line 580
    .line 581
    .line 582
    return-void

    .line 583
    :cond_1a
    const-string v0, ":not("

    .line 584
    .line 585
    invoke-virtual {v6, v0}, LS3/a;->i(Ljava/lang/String;)Z

    .line 586
    .line 587
    .line 588
    move-result v0

    .line 589
    if-eqz v0, :cond_1b

    .line 590
    .line 591
    const-string v0, ":not"

    .line 592
    .line 593
    invoke-virtual {v6, v0}, LS3/a;->d(Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v6, v10, v9}, LS3/a;->a(CC)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    const-string v1, ":not(selector) subselect must not be empty"

    .line 601
    .line 602
    invoke-static {v0, v1}, Lqa/b;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    new-instance v1, Lta/q;

    .line 606
    .line 607
    invoke-static {v0}, Lta/o;->j(Ljava/lang/String;)Lta/m;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    invoke-direct {v1, v4}, Lta/q;-><init>(I)V

    .line 612
    .line 613
    .line 614
    iput-object v0, v1, Lta/r;->a:Lta/m;

    .line 615
    .line 616
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    return-void

    .line 620
    :cond_1b
    const-string v0, ":nth-child("

    .line 621
    .line 622
    invoke-virtual {v6, v0}, LS3/a;->h(Ljava/lang/String;)Z

    .line 623
    .line 624
    .line 625
    move-result v0

    .line 626
    if-eqz v0, :cond_1c

    .line 627
    .line 628
    invoke-virtual {p0, v5, v5}, Lta/o;->e(ZZ)V

    .line 629
    .line 630
    .line 631
    return-void

    .line 632
    :cond_1c
    const-string v0, ":nth-last-child("

    .line 633
    .line 634
    invoke-virtual {v6, v0}, LS3/a;->h(Ljava/lang/String;)Z

    .line 635
    .line 636
    .line 637
    move-result v0

    .line 638
    if-eqz v0, :cond_1d

    .line 639
    .line 640
    invoke-virtual {p0, v3, v5}, Lta/o;->e(ZZ)V

    .line 641
    .line 642
    .line 643
    return-void

    .line 644
    :cond_1d
    const-string v0, ":nth-of-type("

    .line 645
    .line 646
    invoke-virtual {v6, v0}, LS3/a;->h(Ljava/lang/String;)Z

    .line 647
    .line 648
    .line 649
    move-result v0

    .line 650
    if-eqz v0, :cond_1e

    .line 651
    .line 652
    invoke-virtual {p0, v5, v3}, Lta/o;->e(ZZ)V

    .line 653
    .line 654
    .line 655
    return-void

    .line 656
    :cond_1e
    const-string v0, ":nth-last-of-type("

    .line 657
    .line 658
    invoke-virtual {v6, v0}, LS3/a;->h(Ljava/lang/String;)Z

    .line 659
    .line 660
    .line 661
    move-result v0

    .line 662
    if-eqz v0, :cond_1f

    .line 663
    .line 664
    invoke-virtual {p0, v3, v3}, Lta/o;->e(ZZ)V

    .line 665
    .line 666
    .line 667
    return-void

    .line 668
    :cond_1f
    const-string v0, ":first-child"

    .line 669
    .line 670
    invoke-virtual {v6, v0}, LS3/a;->h(Ljava/lang/String;)Z

    .line 671
    .line 672
    .line 673
    move-result v0

    .line 674
    if-eqz v0, :cond_20

    .line 675
    .line 676
    new-instance v0, Lta/d;

    .line 677
    .line 678
    invoke-direct {v0, v4}, Lta/d;-><init>(I)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    return-void

    .line 685
    :cond_20
    const-string v0, ":last-child"

    .line 686
    .line 687
    invoke-virtual {v6, v0}, LS3/a;->h(Ljava/lang/String;)Z

    .line 688
    .line 689
    .line 690
    move-result v0

    .line 691
    if-eqz v0, :cond_21

    .line 692
    .line 693
    new-instance v0, Lta/d;

    .line 694
    .line 695
    invoke-direct {v0, v2}, Lta/d;-><init>(I)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 699
    .line 700
    .line 701
    return-void

    .line 702
    :cond_21
    const-string v0, ":first-of-type"

    .line 703
    .line 704
    invoke-virtual {v6, v0}, LS3/a;->h(Ljava/lang/String;)Z

    .line 705
    .line 706
    .line 707
    move-result v0

    .line 708
    if-eqz v0, :cond_22

    .line 709
    .line 710
    new-instance v0, Lta/i;

    .line 711
    .line 712
    invoke-direct {v0, v5, v3, v2}, Lta/k;-><init>(III)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    return-void

    .line 719
    :cond_22
    const-string v0, ":last-of-type"

    .line 720
    .line 721
    invoke-virtual {v6, v0}, LS3/a;->h(Ljava/lang/String;)Z

    .line 722
    .line 723
    .line 724
    move-result v0

    .line 725
    if-eqz v0, :cond_23

    .line 726
    .line 727
    new-instance v0, Lta/j;

    .line 728
    .line 729
    invoke-direct {v0, v5, v3, v4}, Lta/k;-><init>(III)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 733
    .line 734
    .line 735
    return-void

    .line 736
    :cond_23
    const-string v0, ":only-child"

    .line 737
    .line 738
    invoke-virtual {v6, v0}, LS3/a;->h(Ljava/lang/String;)Z

    .line 739
    .line 740
    .line 741
    move-result v0

    .line 742
    if-eqz v0, :cond_24

    .line 743
    .line 744
    new-instance v0, Lta/d;

    .line 745
    .line 746
    invoke-direct {v0, v1}, Lta/d;-><init>(I)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    return-void

    .line 753
    :cond_24
    const-string v0, ":only-of-type"

    .line 754
    .line 755
    invoke-virtual {v6, v0}, LS3/a;->h(Ljava/lang/String;)Z

    .line 756
    .line 757
    .line 758
    move-result v0

    .line 759
    if-eqz v0, :cond_25

    .line 760
    .line 761
    new-instance v0, Lta/d;

    .line 762
    .line 763
    const/4 v1, 0x5

    .line 764
    invoke-direct {v0, v1}, Lta/d;-><init>(I)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 768
    .line 769
    .line 770
    return-void

    .line 771
    :cond_25
    const-string v0, ":empty"

    .line 772
    .line 773
    invoke-virtual {v6, v0}, LS3/a;->h(Ljava/lang/String;)Z

    .line 774
    .line 775
    .line 776
    move-result v0

    .line 777
    if-eqz v0, :cond_26

    .line 778
    .line 779
    new-instance v0, Lta/d;

    .line 780
    .line 781
    invoke-direct {v0, v3}, Lta/d;-><init>(I)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    return-void

    .line 788
    :cond_26
    const-string v0, ":root"

    .line 789
    .line 790
    invoke-virtual {v6, v0}, LS3/a;->h(Ljava/lang/String;)Z

    .line 791
    .line 792
    .line 793
    move-result v0

    .line 794
    if-eqz v0, :cond_27

    .line 795
    .line 796
    new-instance v0, Lta/d;

    .line 797
    .line 798
    const/4 v1, 0x6

    .line 799
    invoke-direct {v0, v1}, Lta/d;-><init>(I)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 803
    .line 804
    .line 805
    return-void

    .line 806
    :cond_27
    const-string v0, ":matchText"

    .line 807
    .line 808
    invoke-virtual {v6, v0}, LS3/a;->h(Ljava/lang/String;)Z

    .line 809
    .line 810
    .line 811
    move-result v0

    .line 812
    if-eqz v0, :cond_28

    .line 813
    .line 814
    new-instance v0, Lta/d;

    .line 815
    .line 816
    const/4 v1, 0x7

    .line 817
    invoke-direct {v0, v1}, Lta/d;-><init>(I)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    return-void

    .line 824
    :cond_28
    new-instance v0, Lorg/jsoup/select/Selector$SelectorParseException;

    .line 825
    .line 826
    invoke-virtual {v6}, LS3/a;->l()Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v1

    .line 830
    new-array v2, v4, [Ljava/lang/Object;

    .line 831
    .line 832
    aput-object v7, v2, v5

    .line 833
    .line 834
    aput-object v1, v2, v3

    .line 835
    .line 836
    const-string v1, "Could not parse query \'%s\': unexpected token at \'%s\'"

    .line 837
    .line 838
    invoke-direct {v0, v1, v2}, Lorg/jsoup/select/Selector$SelectorParseException;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 839
    .line 840
    .line 841
    throw v0

    .line 842
    :cond_29
    :goto_1
    iget v1, v6, LS3/a;->c:I

    .line 843
    .line 844
    :goto_2
    invoke-virtual {v6}, LS3/a;->g()Z

    .line 845
    .line 846
    .line 847
    move-result v2

    .line 848
    const-string v7, "|"

    .line 849
    .line 850
    if-nez v2, :cond_2b

    .line 851
    .line 852
    invoke-virtual {v6}, LS3/a;->k()Z

    .line 853
    .line 854
    .line 855
    move-result v2

    .line 856
    if-nez v2, :cond_2a

    .line 857
    .line 858
    const-string v2, "_"

    .line 859
    .line 860
    const-string v10, "-"

    .line 861
    .line 862
    filled-new-array {v9, v7, v2, v10}, [Ljava/lang/String;

    .line 863
    .line 864
    .line 865
    move-result-object v2

    .line 866
    invoke-virtual {v6, v2}, LS3/a;->j([Ljava/lang/String;)Z

    .line 867
    .line 868
    .line 869
    move-result v2

    .line 870
    if-eqz v2, :cond_2b

    .line 871
    .line 872
    :cond_2a
    iget v2, v6, LS3/a;->c:I

    .line 873
    .line 874
    add-int/2addr v2, v3

    .line 875
    iput v2, v6, LS3/a;->c:I

    .line 876
    .line 877
    goto :goto_2

    .line 878
    :cond_2b
    iget-object v2, v6, LS3/a;->b:Ljava/lang/String;

    .line 879
    .line 880
    iget v6, v6, LS3/a;->c:I

    .line 881
    .line 882
    invoke-virtual {v2, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v1

    .line 886
    invoke-static {v1}, LJ7/j;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v1

    .line 890
    invoke-static {v1}, Lqa/b;->u(Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {v1, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 894
    .line 895
    .line 896
    move-result v2

    .line 897
    const-string v6, ":"

    .line 898
    .line 899
    if-eqz v2, :cond_2d

    .line 900
    .line 901
    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v2

    .line 905
    new-instance v7, Lta/b;

    .line 906
    .line 907
    new-instance v10, Lta/e;

    .line 908
    .line 909
    invoke-direct {v10, v2, v5, v0}, Lta/e;-><init>(Ljava/lang/String;ZI)V

    .line 910
    .line 911
    .line 912
    new-instance v0, Lta/e;

    .line 913
    .line 914
    invoke-virtual {v1, v9, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v1

    .line 918
    const/16 v2, 0xa

    .line 919
    .line 920
    invoke-direct {v0, v1, v5, v2}, Lta/e;-><init>(Ljava/lang/String;ZI)V

    .line 921
    .line 922
    .line 923
    new-array v1, v4, [Lta/m;

    .line 924
    .line 925
    aput-object v10, v1, v5

    .line 926
    .line 927
    aput-object v0, v1, v3

    .line 928
    .line 929
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    invoke-direct {v7}, Lta/c;-><init>()V

    .line 934
    .line 935
    .line 936
    iget v1, v7, Lta/c;->b:I

    .line 937
    .line 938
    iget-object v2, v7, Lta/c;->a:Ljava/util/ArrayList;

    .line 939
    .line 940
    if-le v1, v3, :cond_2c

    .line 941
    .line 942
    new-instance v1, Lta/a;

    .line 943
    .line 944
    check-cast v0, Ljava/util/List;

    .line 945
    .line 946
    invoke-direct {v1, v0}, Lta/a;-><init>(Ljava/util/List;)V

    .line 947
    .line 948
    .line 949
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 950
    .line 951
    .line 952
    goto :goto_3

    .line 953
    :cond_2c
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 954
    .line 955
    .line 956
    :goto_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 957
    .line 958
    .line 959
    move-result v0

    .line 960
    iput v0, v7, Lta/c;->b:I

    .line 961
    .line 962
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 963
    .line 964
    .line 965
    return-void

    .line 966
    :cond_2d
    invoke-virtual {v1, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 967
    .line 968
    .line 969
    move-result v2

    .line 970
    if-eqz v2, :cond_2e

    .line 971
    .line 972
    invoke-virtual {v1, v7, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 973
    .line 974
    .line 975
    move-result-object v1

    .line 976
    :cond_2e
    new-instance v2, Lta/e;

    .line 977
    .line 978
    invoke-direct {v2, v1, v5, v0}, Lta/e;-><init>(Ljava/lang/String;ZI)V

    .line 979
    .line 980
    .line 981
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 982
    .line 983
    .line 984
    return-void
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

.method public final g(Z)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, ":matchesOwn"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v0, ":matches"

    .line 7
    .line 8
    :goto_0
    iget-object v1, p0, Lta/o;->a:LS3/a;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, LS3/a;->d(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/16 v2, 0x28

    .line 14
    .line 15
    const/16 v3, 0x29

    .line 16
    .line 17
    invoke-virtual {v1, v2, v3}, LS3/a;->a(CC)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "(regex) query must not be empty"

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v1, v0}, Lqa/b;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lta/o;->c:Ljava/util/ArrayList;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    new-instance p1, Lta/l;

    .line 35
    .line 36
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-direct {p1, v1, v2}, Lta/l;-><init>(Ljava/util/regex/Pattern;I)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    new-instance p1, Lta/l;

    .line 46
    .line 47
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-direct {p1, v1, v2}, Lta/l;-><init>(Ljava/util/regex/Pattern;I)V

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    return-void
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

.method public final h(Z)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, ":matchesWholeOwnText"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v0, ":matchesWholeText"

    .line 7
    .line 8
    :goto_0
    iget-object v1, p0, Lta/o;->a:LS3/a;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, LS3/a;->d(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/16 v2, 0x28

    .line 14
    .line 15
    const/16 v3, 0x29

    .line 16
    .line 17
    invoke-virtual {v1, v2, v3}, LS3/a;->a(CC)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "(regex) query must not be empty"

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v1, v0}, Lqa/b;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lta/o;->c:Ljava/util/ArrayList;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    new-instance p1, Lta/l;

    .line 35
    .line 36
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const/4 v2, 0x2

    .line 41
    invoke-direct {p1, v1, v2}, Lta/l;-><init>(Ljava/util/regex/Pattern;I)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    new-instance p1, Lta/l;

    .line 46
    .line 47
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/4 v2, 0x3

    .line 52
    invoke-direct {p1, v1, v2}, Lta/l;-><init>(Ljava/util/regex/Pattern;I)V

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    return-void
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

.method public final i()Lta/m;
    .locals 5

    .line 1
    iget-object v0, p0, Lta/o;->a:LS3/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LS3/a;->f()Z

    .line 4
    .line 5
    .line 6
    sget-object v1, Lta/o;->d:[Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, LS3/a;->j([Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    iget-object v3, p0, Lta/o;->c:Ljava/util/ArrayList;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    new-instance v2, Lta/d;

    .line 17
    .line 18
    const/16 v4, 0x8

    .line 19
    .line 20
    invoke-direct {v2, v4}, Lta/d;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, LS3/a;->c()C

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {p0, v2}, Lta/o;->a(C)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0}, Lta/o;->f()V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual {v0}, LS3/a;->g()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_3

    .line 42
    .line 43
    invoke-virtual {v0}, LS3/a;->f()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-virtual {v0, v1}, LS3/a;->j([Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0}, LS3/a;->c()C

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-virtual {p0, v2}, Lta/o;->a(C)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    if-eqz v2, :cond_2

    .line 62
    .line 63
    const/16 v2, 0x20

    .line 64
    .line 65
    invoke-virtual {p0, v2}, Lta/o;->a(C)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-virtual {p0}, Lta/o;->f()V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    const/4 v1, 0x1

    .line 78
    if-ne v0, v1, :cond_4

    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Lta/m;

    .line 86
    .line 87
    return-object v0

    .line 88
    :cond_4
    new-instance v0, Lta/a;

    .line 89
    .line 90
    invoke-direct {v0, v3}, Lta/a;-><init>(Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    return-object v0
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lta/o;->b:Ljava/lang/String;

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
