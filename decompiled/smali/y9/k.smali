.class public final Ly9/k;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/b;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ly9/l;


# direct methods
.method public synthetic constructor <init>(Ly9/l;I)V
    .locals 0

    .line 1
    iput p2, p0, Ly9/k;->s:I

    iput-object p1, p0, Ly9/k;->t:Ly9/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Ly9/k;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lj9/f;

    .line 7
    .line 8
    const-string v0, "it"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Ly9/k;->t:Ly9/l;

    .line 14
    .line 15
    iget-object v2, v1, Ly9/l;->c:Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, [B

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 27
    .line 28
    invoke-direct {v2, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v1, Ly9/l;->i:Ly9/m;

    .line 32
    .line 33
    iget-object v1, p1, Ly9/m;->b:LV3/b;

    .line 34
    .line 35
    iget-object v1, v1, LV3/b;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, LI4/c;

    .line 38
    .line 39
    iget-object v1, v1, LI4/c;->p:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lk9/g;

    .line 42
    .line 43
    sget-object v3, Le9/T;->H:Le9/a;

    .line 44
    .line 45
    invoke-virtual {v3, v2, v1}, Lk9/b;->b(Ljava/io/ByteArrayInputStream;Lk9/g;)Lk9/a;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    move-object v8, v1

    .line 50
    check-cast v8, Le9/T;

    .line 51
    .line 52
    if-nez v8, :cond_1

    .line 53
    .line 54
    :goto_0
    const/4 p1, 0x0

    .line 55
    goto/16 :goto_6

    .line 56
    .line 57
    :cond_1
    iget-object p1, p1, Ly9/m;->b:LV3/b;

    .line 58
    .line 59
    iget-object p1, p1, LV3/b;->i:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Lw9/q;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object v1, v8, Le9/T;->C:Ljava/util/List;

    .line 67
    .line 68
    const-string v2, "proto.annotationList"

    .line 69
    .line 70
    invoke-static {v1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    check-cast v1, Ljava/lang/Iterable;

    .line 74
    .line 75
    new-instance v2, Ljava/util/ArrayList;

    .line 76
    .line 77
    const/16 v3, 0xa

    .line 78
    .line 79
    invoke-static {v1, v3}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    iget-object v13, p1, Lw9/q;->a:LV3/b;

    .line 95
    .line 96
    if-eqz v3, :cond_2

    .line 97
    .line 98
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, Le9/g;

    .line 103
    .line 104
    invoke-static {v3, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object v4, v13, LV3/b;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v4, Lg9/f;

    .line 110
    .line 111
    iget-object v5, p1, Lw9/q;->b:Lo1/k;

    .line 112
    .line 113
    invoke-virtual {v5, v3, v4}, Lo1/k;->h(Le9/g;Lg9/f;)LM8/c;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_3

    .line 126
    .line 127
    sget-object p1, LM8/g;->a:LM8/f;

    .line 128
    .line 129
    :goto_2
    move-object v5, p1

    .line 130
    goto :goto_3

    .line 131
    :cond_3
    new-instance p1, LM8/i;

    .line 132
    .line 133
    const/4 v0, 0x0

    .line 134
    invoke-direct {p1, v2, v0}, LM8/i;-><init>(Ljava/util/List;I)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :goto_3
    sget-object p1, Lg9/e;->d:Lg9/c;

    .line 139
    .line 140
    iget v0, v8, Le9/T;->v:I

    .line 141
    .line 142
    invoke-virtual {p1, v0}, Lg9/c;->c(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    check-cast p1, Le9/f0;

    .line 147
    .line 148
    invoke-static {p1}, LJ7/j;->i(Le9/f0;)LL8/n;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    new-instance v2, Ly9/q;

    .line 153
    .line 154
    iget-object p1, v13, LV3/b;->a:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p1, LI4/c;

    .line 157
    .line 158
    iget-object p1, p1, LI4/c;->a:Ljava/lang/Object;

    .line 159
    .line 160
    move-object v3, p1

    .line 161
    check-cast v3, Lz9/l;

    .line 162
    .line 163
    iget p1, v8, Le9/T;->w:I

    .line 164
    .line 165
    iget-object v0, v13, LV3/b;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Lg9/f;

    .line 168
    .line 169
    invoke-static {v0, p1}, LJ7/a;->i(Lg9/f;I)Lj9/f;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    iget-object p1, v13, LV3/b;->d:Ljava/lang/Object;

    .line 174
    .line 175
    move-object v10, p1

    .line 176
    check-cast v10, Lg9/g;

    .line 177
    .line 178
    iget-object p1, v13, LV3/b;->e:Ljava/lang/Object;

    .line 179
    .line 180
    move-object v11, p1

    .line 181
    check-cast v11, Lg9/h;

    .line 182
    .line 183
    iget-object p1, v13, LV3/b;->g:Ljava/lang/Object;

    .line 184
    .line 185
    move-object v12, p1

    .line 186
    check-cast v12, Lc9/f;

    .line 187
    .line 188
    iget-object p1, v13, LV3/b;->c:Ljava/lang/Object;

    .line 189
    .line 190
    move-object v4, p1

    .line 191
    check-cast v4, LL8/j;

    .line 192
    .line 193
    iget-object p1, v13, LV3/b;->b:Ljava/lang/Object;

    .line 194
    .line 195
    move-object v9, p1

    .line 196
    check-cast v9, Lg9/f;

    .line 197
    .line 198
    invoke-direct/range {v2 .. v12}, Ly9/q;-><init>(Lz9/l;LL8/j;LM8/h;Lj9/f;LL8/n;Le9/T;Lg9/f;Lg9/g;Lg9/h;Lc9/f;)V

    .line 199
    .line 200
    .line 201
    iget-object p1, v8, Le9/T;->x:Ljava/util/List;

    .line 202
    .line 203
    const-string v0, "proto.typeParameterList"

    .line 204
    .line 205
    invoke-static {p1, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-static {v13, v2, p1}, LV3/b;->d(LV3/b;LO8/p;Ljava/util/List;)LV3/b;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    iget-object p1, p1, LV3/b;->h:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast p1, Lp/b1;

    .line 215
    .line 216
    invoke-virtual {p1}, Lp/b1;->b()Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    iget v1, v8, Le9/T;->u:I

    .line 221
    .line 222
    and-int/lit8 v3, v1, 0x4

    .line 223
    .line 224
    const/4 v4, 0x4

    .line 225
    if-ne v3, v4, :cond_4

    .line 226
    .line 227
    iget-object v1, v8, Le9/T;->y:Le9/Q;

    .line 228
    .line 229
    const-string v3, "underlyingType"

    .line 230
    .line 231
    invoke-static {v1, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_4
    const/16 v3, 0x8

    .line 236
    .line 237
    and-int/2addr v1, v3

    .line 238
    if-ne v1, v3, :cond_7

    .line 239
    .line 240
    iget v1, v8, Le9/T;->z:I

    .line 241
    .line 242
    invoke-virtual {v10, v1}, Lg9/g;->a(I)Le9/Q;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    :goto_4
    const/4 v3, 0x0

    .line 247
    invoke-virtual {p1, v1, v3}, Lp/b1;->e(Le9/Q;Z)LA9/D;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    iget v4, v8, Le9/T;->u:I

    .line 252
    .line 253
    and-int/lit8 v5, v4, 0x10

    .line 254
    .line 255
    const/16 v6, 0x10

    .line 256
    .line 257
    if-ne v5, v6, :cond_5

    .line 258
    .line 259
    iget-object v4, v8, Le9/T;->A:Le9/Q;

    .line 260
    .line 261
    const-string v5, "expandedType"

    .line 262
    .line 263
    invoke-static {v4, v5}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_5
    const/16 v5, 0x20

    .line 268
    .line 269
    and-int/2addr v4, v5

    .line 270
    if-ne v4, v5, :cond_6

    .line 271
    .line 272
    iget v4, v8, Le9/T;->B:I

    .line 273
    .line 274
    invoke-virtual {v10, v4}, Lg9/g;->a(I)Le9/Q;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    :goto_5
    invoke-virtual {p1, v4, v3}, Lp/b1;->e(Le9/Q;Z)LA9/D;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-virtual {v2, v0, v1, p1}, Ly9/q;->c1(Ljava/util/List;LA9/D;LA9/D;)V

    .line 283
    .line 284
    .line 285
    move-object p1, v2

    .line 286
    :goto_6
    return-object p1

    .line 287
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 288
    .line 289
    const-string v0, "No expandedType in ProtoBuf.TypeAlias"

    .line 290
    .line 291
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw p1

    .line 295
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 296
    .line 297
    const-string v0, "No underlyingType in ProtoBuf.TypeAlias"

    .line 298
    .line 299
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    throw p1

    .line 303
    :pswitch_0
    check-cast p1, Lj9/f;

    .line 304
    .line 305
    const-string v0, "it"

    .line 306
    .line 307
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    iget-object v1, p0, Ly9/k;->t:Ly9/l;

    .line 311
    .line 312
    iget-object v2, v1, Ly9/l;->b:Ljava/util/LinkedHashMap;

    .line 313
    .line 314
    sget-object v3, Le9/G;->N:Le9/a;

    .line 315
    .line 316
    const-string v4, "PARSER"

    .line 317
    .line 318
    invoke-static {v3, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    check-cast v2, [B

    .line 326
    .line 327
    iget-object v1, v1, Ly9/l;->i:Ly9/m;

    .line 328
    .line 329
    if-eqz v2, :cond_8

    .line 330
    .line 331
    new-instance v4, Ljava/io/ByteArrayInputStream;

    .line 332
    .line 333
    invoke-direct {v4, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 334
    .line 335
    .line 336
    new-instance v2, LA0/j;

    .line 337
    .line 338
    const/16 v5, 0xe

    .line 339
    .line 340
    invoke-direct {v2, v3, v4, v1, v5}, LA0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 341
    .line 342
    .line 343
    new-instance v3, LK9/k;

    .line 344
    .line 345
    new-instance v4, LA0/m;

    .line 346
    .line 347
    const/16 v5, 0xb

    .line 348
    .line 349
    invoke-direct {v4, v2, v5}, LA0/m;-><init>(Ljava/lang/Object;I)V

    .line 350
    .line 351
    .line 352
    invoke-direct {v3, v2, v4}, LK9/k;-><init>(Lu8/a;Lu8/b;)V

    .line 353
    .line 354
    .line 355
    new-instance v2, LK9/a;

    .line 356
    .line 357
    invoke-direct {v2, v3}, LK9/a;-><init>(LK9/l;)V

    .line 358
    .line 359
    .line 360
    invoke-static {v2}, LK9/n;->B(LK9/l;)Ljava/util/List;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    check-cast v2, Ljava/util/Collection;

    .line 365
    .line 366
    goto :goto_7

    .line 367
    :cond_8
    sget-object v2, Li8/s;->s:Li8/s;

    .line 368
    .line 369
    :goto_7
    move-object v3, v2

    .line 370
    check-cast v3, Ljava/lang/Iterable;

    .line 371
    .line 372
    new-instance v4, Ljava/util/ArrayList;

    .line 373
    .line 374
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 379
    .line 380
    .line 381
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    if-eqz v3, :cond_9

    .line 390
    .line 391
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    check-cast v3, Le9/G;

    .line 396
    .line 397
    iget-object v5, v1, Ly9/m;->b:LV3/b;

    .line 398
    .line 399
    iget-object v5, v5, LV3/b;->i:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v5, Lw9/q;

    .line 402
    .line 403
    invoke-static {v3, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v5, v3}, Lw9/q;->f(Le9/G;)Ly9/o;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    goto :goto_8

    .line 414
    :cond_9
    invoke-virtual {v1, p1, v4}, Ly9/m;->k(Lj9/f;Ljava/util/ArrayList;)V

    .line 415
    .line 416
    .line 417
    invoke-static {v4}, LJ9/l;->e(Ljava/util/ArrayList;)Ljava/util/List;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    check-cast p1, Ljava/util/Collection;

    .line 422
    .line 423
    return-object p1

    .line 424
    :pswitch_1
    check-cast p1, Lj9/f;

    .line 425
    .line 426
    const-string v0, "it"

    .line 427
    .line 428
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    iget-object v1, p0, Ly9/k;->t:Ly9/l;

    .line 432
    .line 433
    iget-object v2, v1, Ly9/l;->a:Ljava/util/LinkedHashMap;

    .line 434
    .line 435
    sget-object v3, Le9/y;->N:Le9/a;

    .line 436
    .line 437
    const-string v4, "PARSER"

    .line 438
    .line 439
    invoke-static {v3, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    check-cast v2, [B

    .line 447
    .line 448
    iget-object v1, v1, Ly9/l;->i:Ly9/m;

    .line 449
    .line 450
    if-eqz v2, :cond_a

    .line 451
    .line 452
    new-instance v4, Ljava/io/ByteArrayInputStream;

    .line 453
    .line 454
    invoke-direct {v4, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 455
    .line 456
    .line 457
    new-instance v2, LA0/j;

    .line 458
    .line 459
    const/16 v5, 0xe

    .line 460
    .line 461
    invoke-direct {v2, v3, v4, v1, v5}, LA0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 462
    .line 463
    .line 464
    new-instance v3, LK9/k;

    .line 465
    .line 466
    new-instance v4, LA0/m;

    .line 467
    .line 468
    const/16 v5, 0xb

    .line 469
    .line 470
    invoke-direct {v4, v2, v5}, LA0/m;-><init>(Ljava/lang/Object;I)V

    .line 471
    .line 472
    .line 473
    invoke-direct {v3, v2, v4}, LK9/k;-><init>(Lu8/a;Lu8/b;)V

    .line 474
    .line 475
    .line 476
    new-instance v2, LK9/a;

    .line 477
    .line 478
    invoke-direct {v2, v3}, LK9/a;-><init>(LK9/l;)V

    .line 479
    .line 480
    .line 481
    invoke-static {v2}, LK9/n;->B(LK9/l;)Ljava/util/List;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    check-cast v2, Ljava/util/Collection;

    .line 486
    .line 487
    goto :goto_9

    .line 488
    :cond_a
    sget-object v2, Li8/s;->s:Li8/s;

    .line 489
    .line 490
    :goto_9
    move-object v3, v2

    .line 491
    check-cast v3, Ljava/lang/Iterable;

    .line 492
    .line 493
    new-instance v4, Ljava/util/ArrayList;

    .line 494
    .line 495
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 496
    .line 497
    .line 498
    move-result v2

    .line 499
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 500
    .line 501
    .line 502
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    :cond_b
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 507
    .line 508
    .line 509
    move-result v3

    .line 510
    if-eqz v3, :cond_d

    .line 511
    .line 512
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    check-cast v3, Le9/y;

    .line 517
    .line 518
    iget-object v5, v1, Ly9/m;->b:LV3/b;

    .line 519
    .line 520
    iget-object v5, v5, LV3/b;->i:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v5, Lw9/q;

    .line 523
    .line 524
    invoke-static {v3, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v5, v3}, Lw9/q;->e(Le9/y;)Ly9/p;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    invoke-virtual {v1, v3}, Ly9/m;->r(Ly9/p;)Z

    .line 532
    .line 533
    .line 534
    move-result v5

    .line 535
    if-eqz v5, :cond_c

    .line 536
    .line 537
    goto :goto_b

    .line 538
    :cond_c
    const/4 v3, 0x0

    .line 539
    :goto_b
    if-eqz v3, :cond_b

    .line 540
    .line 541
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    goto :goto_a

    .line 545
    :cond_d
    invoke-virtual {v1, p1, v4}, Ly9/m;->j(Lj9/f;Ljava/util/ArrayList;)V

    .line 546
    .line 547
    .line 548
    invoke-static {v4}, LJ9/l;->e(Ljava/util/ArrayList;)Ljava/util/List;

    .line 549
    .line 550
    .line 551
    move-result-object p1

    .line 552
    check-cast p1, Ljava/util/Collection;

    .line 553
    .line 554
    return-object p1

    .line 555
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
