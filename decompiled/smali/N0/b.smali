.class public final LN0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/q;


# instance fields
.field public final synthetic s:I

.field public final t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LN0/b;->s:I

    iput-object p1, p0, LN0/b;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/s;Landroidx/lifecycle/m;)V
    .locals 5

    .line 1
    iget v0, p0, LN0/b;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p1, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 7
    .line 8
    if-ne p2, p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, LN0/b;->t:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Landroidx/fragment/app/b;

    .line 13
    .line 14
    iget-object p1, p1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_0
    iget-object p1, p0, LN0/b;->t:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Lb1/d;

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-virtual {p1, p2}, Lb1/d;->b(Z)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    sget-object v0, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 32
    .line 33
    if-ne p2, v0, :cond_1

    .line 34
    .line 35
    invoke-interface {p1}, Landroidx/lifecycle/s;->g()Landroidx/lifecycle/u;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1, p0}, Landroidx/lifecycle/u;->f(Landroidx/lifecycle/r;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, LN0/b;->t:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Landroidx/lifecycle/M;

    .line 45
    .line 46
    invoke-virtual {p1}, Landroidx/lifecycle/M;->b()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v0, "Next event must be ON_CREATE, it was "

    .line 53
    .line 54
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p2

    .line 74
    :pswitch_2
    new-instance p1, Ljava/util/HashMap;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, LN0/b;->t:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, [Landroidx/lifecycle/h;

    .line 82
    .line 83
    array-length p2, p1

    .line 84
    const/4 v0, 0x0

    .line 85
    const/4 v1, 0x0

    .line 86
    if-gtz p2, :cond_3

    .line 87
    .line 88
    array-length p2, p1

    .line 89
    if-gtz p2, :cond_2

    .line 90
    .line 91
    return-void

    .line 92
    :cond_2
    aget-object p1, p1, v1

    .line 93
    .line 94
    throw v0

    .line 95
    :cond_3
    aget-object p1, p1, v1

    .line 96
    .line 97
    throw v0

    .line 98
    :pswitch_3
    sget-object v0, LA0/c;->a:[I

    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    aget p2, v0, p2

    .line 105
    .line 106
    const/4 v0, 0x1

    .line 107
    iget-object v1, p0, LN0/b;->t:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v1, LA0/d;

    .line 110
    .line 111
    if-eq p2, v0, :cond_f

    .line 112
    .line 113
    const/4 v0, 0x2

    .line 114
    const/4 v2, 0x0

    .line 115
    if-eq p2, v0, :cond_c

    .line 116
    .line 117
    const/4 v0, 0x3

    .line 118
    if-eq p2, v0, :cond_8

    .line 119
    .line 120
    const/4 v0, 0x4

    .line 121
    if-eq p2, v0, :cond_4

    .line 122
    .line 123
    goto/16 :goto_4

    .line 124
    .line 125
    :cond_4
    check-cast p1, Lq0/o;

    .line 126
    .line 127
    invoke-virtual {v1}, Ly0/O;->b()Ly0/l;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    iget-object p2, p2, Ly0/l;->f:LP0/d;

    .line 132
    .line 133
    iget-object p2, p2, LP0/d;->t:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p2, LQ9/m;

    .line 136
    .line 137
    check-cast p2, LQ9/t;

    .line 138
    .line 139
    invoke-virtual {p2}, LQ9/t;->f()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    check-cast p2, Ljava/lang/Iterable;

    .line 144
    .line 145
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    :cond_5
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_6

    .line 154
    .line 155
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    move-object v3, v0

    .line 160
    check-cast v3, Ly0/j;

    .line 161
    .line 162
    iget-object v3, v3, Ly0/j;->x:Ljava/lang/String;

    .line 163
    .line 164
    iget-object v4, p1, Landroidx/fragment/app/b;->T:Ljava/lang/String;

    .line 165
    .line 166
    invoke-static {v3, v4}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-eqz v3, :cond_5

    .line 171
    .line 172
    move-object v2, v0

    .line 173
    goto :goto_0

    .line 174
    :cond_6
    check-cast v2, Ly0/j;

    .line 175
    .line 176
    if-eqz v2, :cond_7

    .line 177
    .line 178
    invoke-virtual {v1}, Ly0/O;->b()Ly0/l;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    invoke-virtual {p2, v2}, Ly0/l;->b(Ly0/j;)V

    .line 183
    .line 184
    .line 185
    :cond_7
    iget-object p1, p1, Landroidx/fragment/app/b;->l0:Landroidx/lifecycle/u;

    .line 186
    .line 187
    invoke-virtual {p1, p0}, Landroidx/lifecycle/u;->f(Landroidx/lifecycle/r;)V

    .line 188
    .line 189
    .line 190
    goto/16 :goto_4

    .line 191
    .line 192
    :cond_8
    check-cast p1, Lq0/o;

    .line 193
    .line 194
    invoke-virtual {p1}, Lq0/o;->l0()Landroid/app/Dialog;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    invoke-virtual {p2}, Landroid/app/Dialog;->isShowing()Z

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    if-nez p2, :cond_13

    .line 203
    .line 204
    invoke-virtual {v1}, Ly0/O;->b()Ly0/l;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    iget-object p2, p2, Ly0/l;->e:LP0/d;

    .line 209
    .line 210
    iget-object p2, p2, LP0/d;->t:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast p2, LQ9/m;

    .line 213
    .line 214
    check-cast p2, LQ9/t;

    .line 215
    .line 216
    invoke-virtual {p2}, LQ9/t;->f()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p2

    .line 220
    check-cast p2, Ljava/util/List;

    .line 221
    .line 222
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    invoke-interface {p2, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    :cond_9
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    if-eqz v2, :cond_a

    .line 235
    .line 236
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    check-cast v2, Ly0/j;

    .line 241
    .line 242
    iget-object v2, v2, Ly0/j;->x:Ljava/lang/String;

    .line 243
    .line 244
    iget-object v3, p1, Landroidx/fragment/app/b;->T:Ljava/lang/String;

    .line 245
    .line 246
    invoke-static {v2, v3}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-eqz v2, :cond_9

    .line 251
    .line 252
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    goto :goto_1

    .line 257
    :cond_a
    const/4 v0, -0x1

    .line 258
    :goto_1
    invoke-static {p2, v0}, Li8/k;->W(Ljava/util/List;I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    check-cast v2, Ly0/j;

    .line 263
    .line 264
    invoke-static {p2}, Li8/k;->c0(Ljava/util/List;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p2

    .line 268
    invoke-static {p2, v2}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result p2

    .line 272
    if-nez p2, :cond_b

    .line 273
    .line 274
    new-instance p2, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    const-string v3, "Dialog "

    .line 277
    .line 278
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string p1, " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog"

    .line 285
    .line 286
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    const-string p2, "DialogFragmentNavigator"

    .line 294
    .line 295
    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 296
    .line 297
    .line 298
    :cond_b
    if-eqz v2, :cond_13

    .line 299
    .line 300
    const/4 p1, 0x0

    .line 301
    invoke-virtual {v1, v0, v2, p1}, LA0/d;->l(ILy0/j;Z)V

    .line 302
    .line 303
    .line 304
    goto/16 :goto_4

    .line 305
    .line 306
    :cond_c
    check-cast p1, Lq0/o;

    .line 307
    .line 308
    invoke-virtual {v1}, Ly0/O;->b()Ly0/l;

    .line 309
    .line 310
    .line 311
    move-result-object p2

    .line 312
    iget-object p2, p2, Ly0/l;->f:LP0/d;

    .line 313
    .line 314
    iget-object p2, p2, LP0/d;->t:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast p2, LQ9/m;

    .line 317
    .line 318
    check-cast p2, LQ9/t;

    .line 319
    .line 320
    invoke-virtual {p2}, LQ9/t;->f()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object p2

    .line 324
    check-cast p2, Ljava/lang/Iterable;

    .line 325
    .line 326
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 327
    .line 328
    .line 329
    move-result-object p2

    .line 330
    :cond_d
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-eqz v0, :cond_e

    .line 335
    .line 336
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    move-object v3, v0

    .line 341
    check-cast v3, Ly0/j;

    .line 342
    .line 343
    iget-object v3, v3, Ly0/j;->x:Ljava/lang/String;

    .line 344
    .line 345
    iget-object v4, p1, Landroidx/fragment/app/b;->T:Ljava/lang/String;

    .line 346
    .line 347
    invoke-static {v3, v4}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    if-eqz v3, :cond_d

    .line 352
    .line 353
    move-object v2, v0

    .line 354
    goto :goto_2

    .line 355
    :cond_e
    check-cast v2, Ly0/j;

    .line 356
    .line 357
    if-eqz v2, :cond_13

    .line 358
    .line 359
    invoke-virtual {v1}, Ly0/O;->b()Ly0/l;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    invoke-virtual {p1, v2}, Ly0/l;->b(Ly0/j;)V

    .line 364
    .line 365
    .line 366
    goto :goto_4

    .line 367
    :cond_f
    check-cast p1, Lq0/o;

    .line 368
    .line 369
    invoke-virtual {v1}, Ly0/O;->b()Ly0/l;

    .line 370
    .line 371
    .line 372
    move-result-object p2

    .line 373
    iget-object p2, p2, Ly0/l;->e:LP0/d;

    .line 374
    .line 375
    iget-object p2, p2, LP0/d;->t:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast p2, LQ9/m;

    .line 378
    .line 379
    check-cast p2, LQ9/t;

    .line 380
    .line 381
    invoke-virtual {p2}, LQ9/t;->f()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object p2

    .line 385
    check-cast p2, Ljava/lang/Iterable;

    .line 386
    .line 387
    instance-of v0, p2, Ljava/util/Collection;

    .line 388
    .line 389
    if-eqz v0, :cond_10

    .line 390
    .line 391
    move-object v0, p2

    .line 392
    check-cast v0, Ljava/util/Collection;

    .line 393
    .line 394
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    if-eqz v0, :cond_10

    .line 399
    .line 400
    goto :goto_3

    .line 401
    :cond_10
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 402
    .line 403
    .line 404
    move-result-object p2

    .line 405
    :cond_11
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 406
    .line 407
    .line 408
    move-result v0

    .line 409
    if-eqz v0, :cond_12

    .line 410
    .line 411
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    check-cast v0, Ly0/j;

    .line 416
    .line 417
    iget-object v0, v0, Ly0/j;->x:Ljava/lang/String;

    .line 418
    .line 419
    iget-object v1, p1, Landroidx/fragment/app/b;->T:Ljava/lang/String;

    .line 420
    .line 421
    invoke-static {v0, v1}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-eqz v0, :cond_11

    .line 426
    .line 427
    goto :goto_4

    .line 428
    :cond_12
    :goto_3
    invoke-virtual {p1}, Lq0/o;->g0()V

    .line 429
    .line 430
    .line 431
    :cond_13
    :goto_4
    return-void

    .line 432
    :pswitch_4
    sget-object v0, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 433
    .line 434
    if-ne p2, v0, :cond_1a

    .line 435
    .line 436
    invoke-interface {p1}, Landroidx/lifecycle/s;->g()Landroidx/lifecycle/u;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    invoke-virtual {p1, p0}, Landroidx/lifecycle/u;->f(Landroidx/lifecycle/r;)V

    .line 441
    .line 442
    .line 443
    iget-object p1, p0, LN0/b;->t:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast p1, LN0/f;

    .line 446
    .line 447
    invoke-interface {p1}, LN0/f;->a()LN0/e;

    .line 448
    .line 449
    .line 450
    move-result-object p2

    .line 451
    const-string v0, "androidx.savedstate.Restarter"

    .line 452
    .line 453
    invoke-virtual {p2, v0}, LN0/e;->c(Ljava/lang/String;)Landroid/os/Bundle;

    .line 454
    .line 455
    .line 456
    move-result-object p2

    .line 457
    if-nez p2, :cond_14

    .line 458
    .line 459
    goto/16 :goto_7

    .line 460
    .line 461
    :cond_14
    const-string v0, "classes_to_restore"

    .line 462
    .line 463
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 464
    .line 465
    .line 466
    move-result-object p2

    .line 467
    if-eqz p2, :cond_19

    .line 468
    .line 469
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 470
    .line 471
    .line 472
    move-result-object p2

    .line 473
    :cond_15
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    if-eqz v0, :cond_18

    .line 478
    .line 479
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    check-cast v0, Ljava/lang/String;

    .line 484
    .line 485
    const-string v1, "Class "

    .line 486
    .line 487
    :try_start_0
    const-class v2, LN0/b;

    .line 488
    .line 489
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    const/4 v3, 0x0

    .line 494
    invoke-static {v0, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    move-result-object v2

    .line 498
    const-class v4, LN0/c;

    .line 499
    .line 500
    invoke-virtual {v2, v4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    const-string v4, "{\n                Class.\u2026class.java)\n            }"

    .line 505
    .line 506
    invoke-static {v2, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 507
    .line 508
    .line 509
    :try_start_1
    new-array v4, v3, [Ljava/lang/Class;

    .line 510
    .line 511
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 512
    .line 513
    .line 514
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 515
    const/4 v2, 0x1

    .line 516
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 517
    .line 518
    .line 519
    :try_start_2
    new-array v2, v3, [Ljava/lang/Object;

    .line 520
    .line 521
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    const-string v2, "{\n                constr\u2026wInstance()\n            }"

    .line 526
    .line 527
    invoke-static {v1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    check-cast v1, LN0/c;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 531
    .line 532
    instance-of v0, p1, Landroidx/lifecycle/W;

    .line 533
    .line 534
    if-eqz v0, :cond_17

    .line 535
    .line 536
    move-object v0, p1

    .line 537
    check-cast v0, Landroidx/lifecycle/W;

    .line 538
    .line 539
    invoke-interface {v0}, Landroidx/lifecycle/W;->e()Landroidx/lifecycle/V;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    invoke-interface {p1}, LN0/f;->a()LN0/e;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    new-instance v2, Ljava/util/HashSet;

    .line 551
    .line 552
    iget-object v0, v0, Landroidx/lifecycle/V;->a:Ljava/util/LinkedHashMap;

    .line 553
    .line 554
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 555
    .line 556
    .line 557
    move-result-object v3

    .line 558
    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 566
    .line 567
    .line 568
    move-result v3

    .line 569
    if-eqz v3, :cond_16

    .line 570
    .line 571
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v3

    .line 575
    check-cast v3, Ljava/lang/String;

    .line 576
    .line 577
    const-string v4, "key"

    .line 578
    .line 579
    invoke-static {v3, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v3

    .line 586
    check-cast v3, Landroidx/lifecycle/Q;

    .line 587
    .line 588
    invoke-static {v3}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    invoke-interface {p1}, Landroidx/lifecycle/s;->g()Landroidx/lifecycle/u;

    .line 592
    .line 593
    .line 594
    move-result-object v4

    .line 595
    invoke-static {v3, v1, v4}, Landroidx/lifecycle/L;->a(Landroidx/lifecycle/Q;LN0/e;Landroidx/lifecycle/u;)V

    .line 596
    .line 597
    .line 598
    goto :goto_6

    .line 599
    :cond_16
    new-instance v2, Ljava/util/HashSet;

    .line 600
    .line 601
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    .line 609
    .line 610
    .line 611
    move-result v0

    .line 612
    if-nez v0, :cond_15

    .line 613
    .line 614
    invoke-virtual {v1}, LN0/e;->g()V

    .line 615
    .line 616
    .line 617
    goto/16 :goto_5

    .line 618
    .line 619
    :cond_17
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 620
    .line 621
    const-string p2, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"

    .line 622
    .line 623
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    throw p1

    .line 627
    :catch_0
    move-exception p1

    .line 628
    new-instance p2, Ljava/lang/RuntimeException;

    .line 629
    .line 630
    const-string v1, "Failed to instantiate "

    .line 631
    .line 632
    invoke-static {v1, v0}, LE0/a;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 637
    .line 638
    .line 639
    throw p2

    .line 640
    :catch_1
    move-exception p1

    .line 641
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 642
    .line 643
    new-instance v0, Ljava/lang/StringBuilder;

    .line 644
    .line 645
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 653
    .line 654
    .line 655
    const-string v1, " must have default constructor in order to be automatically recreated"

    .line 656
    .line 657
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 658
    .line 659
    .line 660
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 665
    .line 666
    .line 667
    throw p2

    .line 668
    :catch_2
    move-exception p1

    .line 669
    new-instance p2, Ljava/lang/RuntimeException;

    .line 670
    .line 671
    const-string v2, " wasn\'t found"

    .line 672
    .line 673
    invoke-static {v1, v0, v2}, LE0/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 678
    .line 679
    .line 680
    throw p2

    .line 681
    :cond_18
    :goto_7
    return-void

    .line 682
    :cond_19
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 683
    .line 684
    const-string p2, "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    .line 685
    .line 686
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 687
    .line 688
    .line 689
    throw p1

    .line 690
    :cond_1a
    new-instance p1, Ljava/lang/AssertionError;

    .line 691
    .line 692
    const-string p2, "Next event must be ON_CREATE"

    .line 693
    .line 694
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 695
    .line 696
    .line 697
    throw p1

    .line 698
    nop

    .line 699
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
