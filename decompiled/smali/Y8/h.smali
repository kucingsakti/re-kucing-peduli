.class public final LY8/h;
.super LA9/b;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final d:Lz9/i;

.field public final synthetic e:LO8/b;


# direct methods
.method public constructor <init>(LY8/j;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, LY8/h;->c:I

    .line 1
    iput-object p1, p0, LY8/h;->e:LO8/b;

    .line 2
    iget-object v0, p1, LY8/j;->B:LFa/e;

    .line 3
    iget-object v0, v0, LFa/e;->t:Ljava/lang/Object;

    check-cast v0, LI4/a;

    .line 4
    iget-object v0, v0, LI4/a;->a:Ljava/lang/Object;

    check-cast v0, Lz9/l;

    .line 5
    invoke-direct {p0, v0}, LA9/b;-><init>(Lz9/l;)V

    .line 6
    iget-object v0, p1, LY8/j;->B:LFa/e;

    iget-object v0, v0, LFa/e;->t:Ljava/lang/Object;

    check-cast v0, LI4/a;

    .line 7
    iget-object v0, v0, LI4/a;->a:Ljava/lang/Object;

    check-cast v0, Lz9/l;

    .line 8
    new-instance v1, LY8/g;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, LY8/g;-><init>(LY8/j;I)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    new-instance p1, Lz9/i;

    .line 10
    invoke-direct {p1, v0, v1}, Lz9/h;-><init>(Lz9/l;Lu8/a;)V

    .line 11
    iput-object p1, p0, LY8/h;->d:Lz9/i;

    return-void
.end method

.method public constructor <init>(Ly9/g;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, LY8/h;->c:I

    .line 12
    iput-object p1, p0, LY8/h;->e:LO8/b;

    .line 13
    iget-object v0, p1, Ly9/g;->D:LV3/b;

    .line 14
    iget-object v0, v0, LV3/b;->a:Ljava/lang/Object;

    check-cast v0, LI4/c;

    .line 15
    iget-object v0, v0, LI4/c;->a:Ljava/lang/Object;

    check-cast v0, Lz9/l;

    .line 16
    invoke-direct {p0, v0}, LA9/b;-><init>(Lz9/l;)V

    .line 17
    iget-object v0, p1, Ly9/g;->D:LV3/b;

    iget-object v0, v0, LV3/b;->a:Ljava/lang/Object;

    check-cast v0, LI4/c;

    .line 18
    iget-object v0, v0, LI4/c;->a:Ljava/lang/Object;

    check-cast v0, Lz9/l;

    .line 19
    new-instance v1, Ly9/f;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Ly9/f;-><init>(Ly9/g;I)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    new-instance p1, Lz9/i;

    .line 21
    invoke-direct {p1, v0, v1}, Lz9/h;-><init>(Lz9/l;Lu8/a;)V

    .line 22
    iput-object p1, p0, LY8/h;->d:Lz9/i;

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Collection;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/16 v2, 0xa

    .line 5
    .line 6
    const-string v4, "<this>"

    .line 7
    .line 8
    iget-object v5, v0, LY8/h;->e:LO8/b;

    .line 9
    .line 10
    iget v6, v0, LY8/h;->c:I

    .line 11
    .line 12
    packed-switch v6, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v5, Ly9/g;

    .line 16
    .line 17
    iget-object v1, v5, Ly9/g;->w:Le9/j;

    .line 18
    .line 19
    iget-object v6, v5, Ly9/g;->D:LV3/b;

    .line 20
    .line 21
    iget-object v7, v6, LV3/b;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v7, Lg9/g;

    .line 24
    .line 25
    invoke-static {v1, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v4, v1, Le9/j;->z:Ljava/util/List;

    .line 29
    .line 30
    move-object v8, v4

    .line 31
    check-cast v8, Ljava/util/Collection;

    .line 32
    .line 33
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    if-nez v8, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v4, 0x0

    .line 41
    :goto_0
    if-nez v4, :cond_1

    .line 42
    .line 43
    iget-object v1, v1, Le9/j;->A:Ljava/util/List;

    .line 44
    .line 45
    const-string v4, "supertypeIdList"

    .line 46
    .line 47
    invoke-static {v1, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    check-cast v1, Ljava/lang/Iterable;

    .line 51
    .line 52
    new-instance v4, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-static {v1, v2}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-eqz v8, :cond_1

    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    check-cast v8, Ljava/lang/Integer;

    .line 76
    .line 77
    const-string v9, "it"

    .line 78
    .line 79
    invoke-static {v8, v9}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    invoke-virtual {v7, v8}, Lg9/g;->a(I)Le9/Q;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    check-cast v4, Ljava/lang/Iterable;

    .line 95
    .line 96
    new-instance v1, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-static {v4, v2}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-eqz v7, :cond_2

    .line 114
    .line 115
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    check-cast v7, Le9/Q;

    .line 120
    .line 121
    iget-object v8, v6, LV3/b;->h:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v8, Lp/b1;

    .line 124
    .line 125
    invoke-virtual {v8, v7}, Lp/b1;->h(Le9/Q;)LA9/y;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_2
    iget-object v4, v6, LV3/b;->a:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v4, LI4/c;

    .line 136
    .line 137
    iget-object v4, v4, LI4/c;->n:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v4, LN8/b;

    .line 140
    .line 141
    invoke-interface {v4, v5}, LN8/b;->c(LL8/e;)Ljava/util/Collection;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    check-cast v4, Ljava/lang/Iterable;

    .line 146
    .line 147
    invoke-static {v1, v4}, Li8/k;->g0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    new-instance v4, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    :cond_3
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    if-eqz v8, :cond_5

    .line 165
    .line 166
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    check-cast v8, LA9/y;

    .line 171
    .line 172
    invoke-virtual {v8}, LA9/y;->D()LA9/O;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    invoke-interface {v8}, LA9/O;->w()LL8/g;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    instance-of v9, v8, LL8/B;

    .line 181
    .line 182
    if-eqz v9, :cond_4

    .line 183
    .line 184
    check-cast v8, LL8/B;

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_4
    const/4 v8, 0x0

    .line 188
    :goto_4
    if-eqz v8, :cond_3

    .line 189
    .line 190
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    if-nez v3, :cond_8

    .line 199
    .line 200
    iget-object v3, v6, LV3/b;->a:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v3, LI4/c;

    .line 203
    .line 204
    iget-object v3, v3, LI4/c;->h:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v3, Lw9/j;

    .line 207
    .line 208
    new-instance v6, Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-static {v4, v2}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-eqz v4, :cond_7

    .line 226
    .line 227
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    check-cast v4, LL8/B;

    .line 232
    .line 233
    invoke-static {v4}, Lq9/d;->f(LL8/g;)Lj9/b;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    if-eqz v7, :cond_6

    .line 238
    .line 239
    invoke-virtual {v7}, Lj9/b;->b()Lj9/c;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    invoke-virtual {v4}, Lj9/c;->b()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    goto :goto_6

    .line 248
    :cond_6
    invoke-virtual {v4}, LO8/b;->getName()Lj9/f;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    invoke-virtual {v4}, Lj9/f;->g()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    :goto_6
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_7
    invoke-interface {v3, v5, v6}, Lw9/j;->b(LL8/e;Ljava/util/ArrayList;)V

    .line 261
    .line 262
    .line 263
    :cond_8
    invoke-static {v1}, Li8/k;->s0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    check-cast v1, Ljava/util/Collection;

    .line 268
    .line 269
    return-object v1

    .line 270
    :pswitch_0
    check-cast v5, LY8/j;

    .line 271
    .line 272
    iget-object v6, v5, LY8/j;->z:LR8/n;

    .line 273
    .line 274
    iget-object v6, v6, LR8/n;->a:Ljava/lang/Class;

    .line 275
    .line 276
    const-class v7, Ljava/lang/Object;

    .line 277
    .line 278
    invoke-static {v6, v7}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    sget-object v12, Li8/s;->s:Li8/s;

    .line 283
    .line 284
    const/4 v9, 0x2

    .line 285
    if-eqz v8, :cond_9

    .line 286
    .line 287
    move-object v7, v12

    .line 288
    goto :goto_9

    .line 289
    :cond_9
    new-instance v8, LEa/a;

    .line 290
    .line 291
    invoke-direct {v8, v9}, LEa/a;-><init>(I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v6}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 295
    .line 296
    .line 297
    move-result-object v10

    .line 298
    if-nez v10, :cond_a

    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_a
    move-object v7, v10

    .line 302
    :goto_7
    invoke-virtual {v8, v7}, LEa/a;->a(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v6}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 306
    .line 307
    .line 308
    move-result-object v6

    .line 309
    const-string v7, "klass.genericInterfaces"

    .line 310
    .line 311
    invoke-static {v6, v7}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v8, v6}, LEa/a;->b(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    iget-object v6, v8, LEa/a;->a:Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 320
    .line 321
    .line 322
    move-result v7

    .line 323
    new-array v7, v7, [Ljava/lang/reflect/Type;

    .line 324
    .line 325
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    invoke-static {v6}, Li8/l;->C([Ljava/lang/Object;)Ljava/util/List;

    .line 330
    .line 331
    .line 332
    move-result-object v6

    .line 333
    check-cast v6, Ljava/lang/Iterable;

    .line 334
    .line 335
    new-instance v7, Ljava/util/ArrayList;

    .line 336
    .line 337
    invoke-static {v6, v2}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 338
    .line 339
    .line 340
    move-result v8

    .line 341
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 342
    .line 343
    .line 344
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 345
    .line 346
    .line 347
    move-result-object v6

    .line 348
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 349
    .line 350
    .line 351
    move-result v8

    .line 352
    if-eqz v8, :cond_b

    .line 353
    .line 354
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v8

    .line 358
    check-cast v8, Ljava/lang/reflect/Type;

    .line 359
    .line 360
    new-instance v10, LR8/p;

    .line 361
    .line 362
    invoke-direct {v10, v8}, LR8/p;-><init>(Ljava/lang/reflect/Type;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    goto :goto_8

    .line 369
    :cond_b
    :goto_9
    new-instance v6, Ljava/util/ArrayList;

    .line 370
    .line 371
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 372
    .line 373
    .line 374
    move-result v8

    .line 375
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 376
    .line 377
    .line 378
    new-instance v8, Ljava/util/ArrayList;

    .line 379
    .line 380
    const/4 v15, 0x0

    .line 381
    invoke-direct {v8, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 382
    .line 383
    .line 384
    sget-object v10, LU8/x;->n:Lj9/c;

    .line 385
    .line 386
    const-string v11, "PURELY_IMPLEMENTS_ANNOTATION"

    .line 387
    .line 388
    invoke-static {v10, v11}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    iget-object v11, v5, LY8/j;->M:LX8/b;

    .line 392
    .line 393
    invoke-virtual {v11, v10}, LX8/b;->H(Lj9/c;)LM8/b;

    .line 394
    .line 395
    .line 396
    move-result-object v10

    .line 397
    if-nez v10, :cond_d

    .line 398
    .line 399
    :cond_c
    :goto_a
    const/4 v3, 0x0

    .line 400
    goto :goto_e

    .line 401
    :cond_d
    invoke-interface {v10}, LM8/b;->b()Ljava/util/Map;

    .line 402
    .line 403
    .line 404
    move-result-object v10

    .line 405
    invoke-interface {v10}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 406
    .line 407
    .line 408
    move-result-object v10

    .line 409
    check-cast v10, Ljava/lang/Iterable;

    .line 410
    .line 411
    invoke-static {v10}, Li8/k;->l0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v10

    .line 415
    instance-of v11, v10, Lo9/v;

    .line 416
    .line 417
    if-eqz v11, :cond_e

    .line 418
    .line 419
    check-cast v10, Lo9/v;

    .line 420
    .line 421
    goto :goto_b

    .line 422
    :cond_e
    const/4 v10, 0x0

    .line 423
    :goto_b
    if-eqz v10, :cond_c

    .line 424
    .line 425
    iget-object v10, v10, Lo9/g;->a:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v10, Ljava/lang/String;

    .line 428
    .line 429
    if-nez v10, :cond_f

    .line 430
    .line 431
    goto :goto_a

    .line 432
    :cond_f
    move v13, v1

    .line 433
    move v11, v15

    .line 434
    :goto_c
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 435
    .line 436
    .line 437
    move-result v14

    .line 438
    const/4 v3, 0x3

    .line 439
    if-ge v11, v14, :cond_15

    .line 440
    .line 441
    invoke-virtual {v10, v11}, Ljava/lang/String;->charAt(I)C

    .line 442
    .line 443
    .line 444
    move-result v14

    .line 445
    invoke-static {v13}, Lz/e;->d(I)I

    .line 446
    .line 447
    .line 448
    move-result v15

    .line 449
    if-eqz v15, :cond_12

    .line 450
    .line 451
    if-eq v15, v1, :cond_10

    .line 452
    .line 453
    if-eq v15, v9, :cond_12

    .line 454
    .line 455
    goto :goto_d

    .line 456
    :cond_10
    const/16 v15, 0x2e

    .line 457
    .line 458
    if-ne v14, v15, :cond_11

    .line 459
    .line 460
    move v13, v3

    .line 461
    goto :goto_d

    .line 462
    :cond_11
    invoke-static {v14}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 463
    .line 464
    .line 465
    move-result v3

    .line 466
    if-nez v3, :cond_14

    .line 467
    .line 468
    goto :goto_a

    .line 469
    :cond_12
    invoke-static {v14}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 470
    .line 471
    .line 472
    move-result v3

    .line 473
    if-nez v3, :cond_13

    .line 474
    .line 475
    goto :goto_a

    .line 476
    :cond_13
    move v13, v9

    .line 477
    :cond_14
    :goto_d
    add-int/2addr v11, v1

    .line 478
    const/4 v15, 0x0

    .line 479
    goto :goto_c

    .line 480
    :cond_15
    if-eq v13, v3, :cond_c

    .line 481
    .line 482
    new-instance v3, Lj9/c;

    .line 483
    .line 484
    invoke-direct {v3, v10}, Lj9/c;-><init>(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    :goto_e
    if-eqz v3, :cond_16

    .line 488
    .line 489
    invoke-virtual {v3}, Lj9/c;->d()Z

    .line 490
    .line 491
    .line 492
    move-result v9

    .line 493
    if-nez v9, :cond_16

    .line 494
    .line 495
    sget-object v9, LI8/o;->j:Lj9/f;

    .line 496
    .line 497
    invoke-virtual {v3, v9}, Lj9/c;->h(Lj9/f;)Z

    .line 498
    .line 499
    .line 500
    move-result v9

    .line 501
    if-eqz v9, :cond_16

    .line 502
    .line 503
    goto :goto_f

    .line 504
    :cond_16
    const/4 v3, 0x0

    .line 505
    :goto_f
    iget-object v9, v5, LY8/j;->B:LFa/e;

    .line 506
    .line 507
    if-nez v3, :cond_18

    .line 508
    .line 509
    sget-object v10, LU8/k;->a:Ljava/util/LinkedHashMap;

    .line 510
    .line 511
    invoke-static {v5}, Lq9/d;->g(LL8/j;)Lj9/c;

    .line 512
    .line 513
    .line 514
    move-result-object v10

    .line 515
    sget-object v11, LU8/k;->b:Ljava/util/Map;

    .line 516
    .line 517
    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v10

    .line 521
    check-cast v10, Lj9/c;

    .line 522
    .line 523
    if-nez v10, :cond_19

    .line 524
    .line 525
    :cond_17
    :goto_10
    const/4 v3, 0x0

    .line 526
    goto/16 :goto_14

    .line 527
    .line 528
    :cond_18
    move-object v10, v3

    .line 529
    :cond_19
    iget-object v11, v9, LFa/e;->t:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast v11, LI4/a;

    .line 532
    .line 533
    sget-object v13, LT8/b;->z:LT8/b;

    .line 534
    .line 535
    sget v14, Lq9/d;->a:I

    .line 536
    .line 537
    iget-object v11, v11, LI4/a;->o:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast v11, LO8/C;

    .line 540
    .line 541
    invoke-static {v11, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v10}, Lj9/c;->d()Z

    .line 545
    .line 546
    .line 547
    invoke-virtual {v10}, Lj9/c;->e()Lj9/c;

    .line 548
    .line 549
    .line 550
    move-result-object v4

    .line 551
    const-string v14, "topLevelClassFqName.parent()"

    .line 552
    .line 553
    invoke-static {v4, v14}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v11, v4}, LO8/C;->K(Lj9/c;)LL8/H;

    .line 557
    .line 558
    .line 559
    move-result-object v4

    .line 560
    check-cast v4, LO8/z;

    .line 561
    .line 562
    invoke-virtual {v10}, Lj9/c;->f()Lj9/f;

    .line 563
    .line 564
    .line 565
    move-result-object v10

    .line 566
    const-string v11, "topLevelClassFqName.shortName()"

    .line 567
    .line 568
    invoke-static {v10, v11}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    iget-object v4, v4, LO8/z;->y:Lt9/j;

    .line 572
    .line 573
    invoke-virtual {v4, v10, v13}, Lt9/j;->a(Lj9/f;LT8/b;)LL8/g;

    .line 574
    .line 575
    .line 576
    move-result-object v4

    .line 577
    instance-of v10, v4, LL8/e;

    .line 578
    .line 579
    if-eqz v10, :cond_1a

    .line 580
    .line 581
    check-cast v4, LL8/e;

    .line 582
    .line 583
    goto :goto_11

    .line 584
    :cond_1a
    const/4 v4, 0x0

    .line 585
    :goto_11
    if-nez v4, :cond_1b

    .line 586
    .line 587
    goto :goto_10

    .line 588
    :cond_1b
    invoke-interface {v4}, LL8/g;->I()LA9/O;

    .line 589
    .line 590
    .line 591
    move-result-object v10

    .line 592
    invoke-interface {v10}, LA9/O;->u()Ljava/util/List;

    .line 593
    .line 594
    .line 595
    move-result-object v10

    .line 596
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 597
    .line 598
    .line 599
    move-result v10

    .line 600
    iget-object v11, v5, LY8/j;->H:LY8/h;

    .line 601
    .line 602
    invoke-virtual {v11}, LY8/h;->u()Ljava/util/List;

    .line 603
    .line 604
    .line 605
    move-result-object v11

    .line 606
    const-string v13, "getTypeConstructor().parameters"

    .line 607
    .line 608
    invoke-static {v11, v13}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 612
    .line 613
    .line 614
    move-result v13

    .line 615
    if-ne v13, v10, :cond_1c

    .line 616
    .line 617
    check-cast v11, Ljava/lang/Iterable;

    .line 618
    .line 619
    new-instance v3, Ljava/util/ArrayList;

    .line 620
    .line 621
    invoke-static {v11, v2}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 622
    .line 623
    .line 624
    move-result v10

    .line 625
    invoke-direct {v3, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 626
    .line 627
    .line 628
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 629
    .line 630
    .line 631
    move-result-object v10

    .line 632
    :goto_12
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 633
    .line 634
    .line 635
    move-result v11

    .line 636
    if-eqz v11, :cond_1e

    .line 637
    .line 638
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v11

    .line 642
    check-cast v11, LL8/P;

    .line 643
    .line 644
    new-instance v13, LA9/T;

    .line 645
    .line 646
    invoke-interface {v11}, LL8/g;->p()LA9/D;

    .line 647
    .line 648
    .line 649
    move-result-object v11

    .line 650
    invoke-direct {v13, v1, v11}, LA9/T;-><init>(ILA9/y;)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    goto :goto_12

    .line 657
    :cond_1c
    if-ne v13, v1, :cond_17

    .line 658
    .line 659
    if-le v10, v1, :cond_17

    .line 660
    .line 661
    if-nez v3, :cond_17

    .line 662
    .line 663
    new-instance v3, LA9/T;

    .line 664
    .line 665
    invoke-static {v11}, Li8/k;->k0(Ljava/util/List;)Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v11

    .line 669
    check-cast v11, LL8/P;

    .line 670
    .line 671
    invoke-interface {v11}, LL8/g;->p()LA9/D;

    .line 672
    .line 673
    .line 674
    move-result-object v11

    .line 675
    invoke-direct {v3, v1, v11}, LA9/T;-><init>(ILA9/y;)V

    .line 676
    .line 677
    .line 678
    new-instance v11, LB8/c;

    .line 679
    .line 680
    invoke-direct {v11, v1, v10, v1}, LB8/a;-><init>(III)V

    .line 681
    .line 682
    .line 683
    new-instance v10, Ljava/util/ArrayList;

    .line 684
    .line 685
    invoke-static {v11, v2}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 686
    .line 687
    .line 688
    move-result v13

    .line 689
    invoke-direct {v10, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v11}, LB8/a;->e()LB8/b;

    .line 693
    .line 694
    .line 695
    move-result-object v11

    .line 696
    :goto_13
    iget-boolean v13, v11, LB8/b;->u:Z

    .line 697
    .line 698
    if-eqz v13, :cond_1d

    .line 699
    .line 700
    invoke-virtual {v11}, Li8/w;->a()I

    .line 701
    .line 702
    .line 703
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    goto :goto_13

    .line 707
    :cond_1d
    move-object v3, v10

    .line 708
    :cond_1e
    sget-object v10, LA9/K;->t:Lo1/c;

    .line 709
    .line 710
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 711
    .line 712
    .line 713
    sget-object v10, LA9/K;->u:LA9/K;

    .line 714
    .line 715
    invoke-static {v10, v4, v3}, LA9/f;->q(LA9/K;LL8/e;Ljava/util/List;)LA9/D;

    .line 716
    .line 717
    .line 718
    move-result-object v3

    .line 719
    :goto_14
    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 720
    .line 721
    .line 722
    move-result-object v4

    .line 723
    :goto_15
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 724
    .line 725
    .line 726
    move-result v7

    .line 727
    if-eqz v7, :cond_24

    .line 728
    .line 729
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v7

    .line 733
    check-cast v7, LR8/p;

    .line 734
    .line 735
    iget-object v10, v9, LFa/e;->x:Ljava/lang/Object;

    .line 736
    .line 737
    check-cast v10, LY1/c;

    .line 738
    .line 739
    const/4 v11, 0x7

    .line 740
    const/4 v13, 0x0

    .line 741
    const/4 v15, 0x0

    .line 742
    invoke-static {v1, v15, v13, v11}, LC8/E;->A(IZLY8/F;I)LZ8/a;

    .line 743
    .line 744
    .line 745
    move-result-object v11

    .line 746
    invoke-virtual {v10, v7, v11}, LY1/c;->P(La9/d;LZ8/a;)LA9/y;

    .line 747
    .line 748
    .line 749
    move-result-object v11

    .line 750
    iget-object v10, v9, LFa/e;->t:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast v10, LI4/a;

    .line 753
    .line 754
    iget-object v10, v10, LI4/a;->r:Ljava/lang/Object;

    .line 755
    .line 756
    check-cast v10, Lb9/d;

    .line 757
    .line 758
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 759
    .line 760
    .line 761
    new-instance v17, LO0/a;

    .line 762
    .line 763
    sget-object v21, LU8/a;->w:LU8/a;

    .line 764
    .line 765
    const/16 v19, 0x0

    .line 766
    .line 767
    const/16 v22, 0x1

    .line 768
    .line 769
    const/16 v18, 0x0

    .line 770
    .line 771
    move-object/from16 v20, v9

    .line 772
    .line 773
    invoke-direct/range {v17 .. v22}, LO0/a;-><init>(LL8/k;ZLFa/e;LU8/a;Z)V

    .line 774
    .line 775
    .line 776
    const/4 v14, 0x0

    .line 777
    const/4 v13, 0x0

    .line 778
    move-object v9, v10

    .line 779
    move-object/from16 v10, v17

    .line 780
    .line 781
    move-object/from16 v15, v20

    .line 782
    .line 783
    invoke-virtual/range {v9 .. v14}, Lb9/d;->a(LO0/a;LA9/y;Ljava/util/List;Lb9/p;Z)LA9/y;

    .line 784
    .line 785
    .line 786
    move-result-object v9

    .line 787
    if-nez v9, :cond_1f

    .line 788
    .line 789
    goto :goto_16

    .line 790
    :cond_1f
    move-object v11, v9

    .line 791
    :goto_16
    invoke-virtual {v11}, LA9/y;->D()LA9/O;

    .line 792
    .line 793
    .line 794
    move-result-object v9

    .line 795
    invoke-interface {v9}, LA9/O;->w()LL8/g;

    .line 796
    .line 797
    .line 798
    move-result-object v9

    .line 799
    instance-of v9, v9, LL8/B;

    .line 800
    .line 801
    if-eqz v9, :cond_20

    .line 802
    .line 803
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    :cond_20
    invoke-virtual {v11}, LA9/y;->D()LA9/O;

    .line 807
    .line 808
    .line 809
    move-result-object v7

    .line 810
    if-eqz v3, :cond_21

    .line 811
    .line 812
    invoke-virtual {v3}, LA9/y;->D()LA9/O;

    .line 813
    .line 814
    .line 815
    move-result-object v13

    .line 816
    goto :goto_17

    .line 817
    :cond_21
    const/4 v13, 0x0

    .line 818
    :goto_17
    invoke-static {v7, v13}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    move-result v7

    .line 822
    if-eqz v7, :cond_23

    .line 823
    .line 824
    :cond_22
    :goto_18
    move-object v9, v15

    .line 825
    goto :goto_15

    .line 826
    :cond_23
    invoke-static {v11}, LI8/i;->x(LA9/y;)Z

    .line 827
    .line 828
    .line 829
    move-result v7

    .line 830
    if-nez v7, :cond_22

    .line 831
    .line 832
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 833
    .line 834
    .line 835
    goto :goto_18

    .line 836
    :cond_24
    move-object v15, v9

    .line 837
    iget-object v4, v5, LY8/j;->A:LL8/e;

    .line 838
    .line 839
    if-eqz v4, :cond_25

    .line 840
    .line 841
    invoke-static {v4, v5}, Lxa/d;->i(LL8/e;LL8/e;)LA9/J;

    .line 842
    .line 843
    .line 844
    move-result-object v7

    .line 845
    new-instance v9, LA9/Z;

    .line 846
    .line 847
    invoke-direct {v9, v7}, LA9/Z;-><init>(LA9/W;)V

    .line 848
    .line 849
    .line 850
    invoke-interface {v4}, LL8/e;->p()LA9/D;

    .line 851
    .line 852
    .line 853
    move-result-object v4

    .line 854
    invoke-virtual {v9, v1, v4}, LA9/Z;->i(ILA9/y;)LA9/y;

    .line 855
    .line 856
    .line 857
    move-result-object v13

    .line 858
    goto :goto_19

    .line 859
    :cond_25
    const/4 v13, 0x0

    .line 860
    :goto_19
    invoke-static {v6, v13}, LJ9/l;->b(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    .line 861
    .line 862
    .line 863
    invoke-static {v6, v3}, LJ9/l;->b(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 867
    .line 868
    .line 869
    move-result v1

    .line 870
    if-nez v1, :cond_27

    .line 871
    .line 872
    iget-object v1, v15, LFa/e;->t:Ljava/lang/Object;

    .line 873
    .line 874
    check-cast v1, LI4/a;

    .line 875
    .line 876
    new-instance v3, Ljava/util/ArrayList;

    .line 877
    .line 878
    invoke-static {v8, v2}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 879
    .line 880
    .line 881
    move-result v2

    .line 882
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 883
    .line 884
    .line 885
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 886
    .line 887
    .line 888
    move-result-object v2

    .line 889
    :goto_1a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 890
    .line 891
    .line 892
    move-result v4

    .line 893
    if-eqz v4, :cond_26

    .line 894
    .line 895
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v4

    .line 899
    check-cast v4, La9/d;

    .line 900
    .line 901
    const-string v6, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType"

    .line 902
    .line 903
    invoke-static {v4, v6}, Lv8/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 904
    .line 905
    .line 906
    check-cast v4, LR8/p;

    .line 907
    .line 908
    iget-object v4, v4, LR8/p;->a:Ljava/lang/reflect/Type;

    .line 909
    .line 910
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v4

    .line 914
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 915
    .line 916
    .line 917
    goto :goto_1a

    .line 918
    :cond_26
    iget-object v1, v1, LI4/a;->f:Ljava/lang/Object;

    .line 919
    .line 920
    check-cast v1, LQ8/d;

    .line 921
    .line 922
    invoke-virtual {v1, v5, v3}, LQ8/d;->b(LL8/e;Ljava/util/ArrayList;)V

    .line 923
    .line 924
    .line 925
    const/16 v16, 0x0

    .line 926
    .line 927
    throw v16

    .line 928
    :cond_27
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 929
    .line 930
    .line 931
    move-result v1

    .line 932
    if-nez v1, :cond_28

    .line 933
    .line 934
    invoke-static {v6}, Li8/k;->s0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 935
    .line 936
    .line 937
    move-result-object v1

    .line 938
    :goto_1b
    check-cast v1, Ljava/util/Collection;

    .line 939
    .line 940
    goto :goto_1c

    .line 941
    :cond_28
    iget-object v1, v15, LFa/e;->t:Ljava/lang/Object;

    .line 942
    .line 943
    check-cast v1, LI4/a;

    .line 944
    .line 945
    iget-object v1, v1, LI4/a;->o:Ljava/lang/Object;

    .line 946
    .line 947
    check-cast v1, LO8/C;

    .line 948
    .line 949
    iget-object v1, v1, LO8/C;->v:LI8/i;

    .line 950
    .line 951
    invoke-virtual {v1}, LI8/i;->e()LA9/D;

    .line 952
    .line 953
    .line 954
    move-result-object v1

    .line 955
    invoke-static {v1}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 956
    .line 957
    .line 958
    move-result-object v1

    .line 959
    goto :goto_1b

    .line 960
    :goto_1c
    return-object v1

    .line 961
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final d()LL8/N;
    .locals 1

    .line 1
    iget v0, p0, LY8/h;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, LL8/N;->u:LL8/N;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, LY8/h;->e:LO8/b;

    .line 10
    .line 11
    check-cast v0, LY8/j;

    .line 12
    .line 13
    iget-object v0, v0, LY8/j;->B:LFa/e;

    .line 14
    .line 15
    iget-object v0, v0, LFa/e;->t:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, LI4/a;

    .line 18
    .line 19
    iget-object v0, v0, LI4/a;->m:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, LL8/N;

    .line 22
    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 26
.end method

.method public final i()LL8/e;
    .locals 1

    .line 1
    iget v0, p0, LY8/h;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY8/h;->e:LO8/b;

    .line 7
    .line 8
    check-cast v0, Ly9/g;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, LY8/h;->e:LO8/b;

    .line 12
    .line 13
    check-cast v0, LY8/j;

    .line 14
    .line 15
    return-object v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, LY8/h;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY8/h;->e:LO8/b;

    .line 7
    .line 8
    check-cast v0, Ly9/g;

    .line 9
    .line 10
    invoke-virtual {v0}, LO8/b;->getName()Lj9/f;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, Lj9/f;->s:Ljava/lang/String;

    .line 15
    .line 16
    const-string v1, "name.toString()"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    iget-object v0, p0, LY8/h;->e:LO8/b;

    .line 23
    .line 24
    check-cast v0, LY8/j;

    .line 25
    .line 26
    invoke-virtual {v0}, LO8/b;->getName()Lj9/f;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lj9/f;->g()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "name.asString()"

    .line 35
    .line 36
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final u()Ljava/util/List;
    .locals 1

    .line 1
    iget v0, p0, LY8/h;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY8/h;->d:Lz9/i;

    .line 7
    .line 8
    invoke-virtual {v0}, Lz9/i;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/List;

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, LY8/h;->d:Lz9/i;

    .line 16
    .line 17
    invoke-virtual {v0}, Lz9/i;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/util/List;

    .line 22
    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 26
.end method

.method public final v()Z
    .locals 1

    .line 1
    iget v0, p0, LY8/h;->c:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final w()LL8/g;
    .locals 1

    .line 1
    iget v0, p0, LY8/h;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY8/h;->e:LO8/b;

    .line 7
    .line 8
    check-cast v0, Ly9/g;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, LY8/h;->e:LO8/b;

    .line 12
    .line 13
    check-cast v0, LY8/j;

    .line 14
    .line 15
    return-object v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
