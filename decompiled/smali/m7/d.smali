.class public final Lm7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm7/d;->s:I

    iput-object p1, p0, Lm7/d;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lu8/a;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lm7/d;->s:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Lv8/k;

    iput-object p1, p0, Lm7/d;->t:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lm7/d;->s:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LB7/b;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v2}, LB7/a;->c(Lu7/b;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    new-instance v0, Lr3/e;

    .line 18
    .line 19
    const/16 v2, 0x1d

    .line 20
    .line 21
    invoke-direct {v0, v2}, Lr3/e;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iget-object v2, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, LB7/i;

    .line 27
    .line 28
    invoke-virtual {v2, v0}, LB7/a;->c(Lu7/b;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1
    new-instance v0, Lf4/e;

    .line 33
    .line 34
    const/16 v2, 0x1d

    .line 35
    .line 36
    invoke-direct {v0, v2}, Lf4/e;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iget-object v2, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, LB7/e;

    .line 42
    .line 43
    invoke-virtual {v2, v0}, LB7/a;->c(Lu7/b;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_2
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lcom/google/android/gms/common/api/internal/zact;

    .line 50
    .line 51
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/zact;->h:Lx2/o;

    .line 52
    .line 53
    new-instance v2, Lcom/google/android/gms/common/ConnectionResult;

    .line 54
    .line 55
    const/4 v3, 0x4

    .line 56
    invoke-direct {v2, v3}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Lx2/o;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_3
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lcom/google/android/gms/common/api/internal/zabq;

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/zabq;->e()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_4
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Lcom/google/android/gms/common/api/internal/zaaw;

    .line 74
    .line 75
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/zaaw;->d:Lcom/google/android/gms/common/GoogleApiAvailabilityLight;

    .line 76
    .line 77
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/zaaw;->c:Landroid/content/Context;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    sget-object v2, Lcom/google/android/gms/common/GooglePlayServicesUtilLight;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 83
    .line 84
    const/4 v3, 0x1

    .line 85
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_0

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    :try_start_0
    const-string v2, "notification"

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Landroid/app/NotificationManager;

    .line 99
    .line 100
    if-eqz v0, :cond_1

    .line 101
    .line 102
    const/16 v2, 0x28c4

    .line 103
    .line 104
    invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->cancel(I)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    .line 106
    .line 107
    :catch_0
    :cond_1
    :goto_0
    return-void

    .line 108
    :pswitch_5
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Lx7/b;

    .line 111
    .line 112
    const/4 v2, 0x0

    .line 113
    invoke-virtual {v0, v2}, Lx7/a;->b(Lu7/b;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_6
    new-instance v0, Lza/c;

    .line 118
    .line 119
    const/16 v2, 0x1b

    .line 120
    .line 121
    invoke-direct {v0, v2}, Lza/c;-><init>(I)V

    .line 122
    .line 123
    .line 124
    iget-object v2, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v2, Lx7/i;

    .line 127
    .line 128
    invoke-virtual {v2, v0}, Lx7/a;->b(Lu7/b;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :pswitch_7
    new-instance v0, Lx9/d;

    .line 133
    .line 134
    const/16 v2, 0x1b

    .line 135
    .line 136
    invoke-direct {v0, v2}, Lx9/d;-><init>(I)V

    .line 137
    .line 138
    .line 139
    iget-object v2, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v2, Lx7/e;

    .line 142
    .line 143
    invoke-virtual {v2, v0}, Lx7/a;->b(Lu7/b;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_8
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 150
    .line 151
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->u:Lw3/l;

    .line 152
    .line 153
    iget-object v0, v0, Lw3/l;->y:Lcom/google/android/material/internal/CheckableImageButton;

    .line 154
    .line 155
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :pswitch_9
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, Lv8/k;

    .line 165
    .line 166
    invoke-interface {v0}, Lu8/a;->invoke()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    const-string v2, "invoke(...)"

    .line 171
    .line 172
    invoke-static {v0, v2}, Lv8/i;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :pswitch_a
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, Landroidx/fragment/app/e;

    .line 179
    .line 180
    const/4 v2, 0x1

    .line 181
    invoke-virtual {v0, v2}, Landroidx/fragment/app/e;->z(Z)Z

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :pswitch_b
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, Landroidx/fragment/app/b;

    .line 188
    .line 189
    iget-object v2, v0, Landroidx/fragment/app/b;->f0:Lq0/t;

    .line 190
    .line 191
    if-eqz v2, :cond_2

    .line 192
    .line 193
    invoke-virtual {v0}, Landroidx/fragment/app/b;->j()Lq0/t;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    :cond_2
    return-void

    .line 201
    :pswitch_c
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, Lq0/o;

    .line 204
    .line 205
    iget-object v2, v0, Lq0/o;->w0:Lq0/l;

    .line 206
    .line 207
    iget-object v0, v0, Lq0/o;->E0:Landroid/app/Dialog;

    .line 208
    .line 209
    invoke-virtual {v2, v0}, Lq0/l;->onDismiss(Landroid/content/DialogInterface;)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :pswitch_d
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 216
    .line 217
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->v()Z

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :pswitch_e
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 224
    .line 225
    iget-boolean v2, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->x:Z

    .line 226
    .line 227
    if-eqz v2, :cond_3

    .line 228
    .line 229
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    const-string v3, "input_method"

    .line 234
    .line 235
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 240
    .line 241
    const/4 v3, 0x0

    .line 242
    invoke-virtual {v2, v0, v3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 243
    .line 244
    .line 245
    iput-boolean v3, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->x:Z

    .line 246
    .line 247
    :cond_3
    return-void

    .line 248
    :pswitch_f
    const/4 v0, 0x0

    .line 249
    iget-object v2, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v2, Lp/p0;

    .line 252
    .line 253
    iput-object v0, v2, Lp/p0;->D:Lm7/d;

    .line 254
    .line 255
    invoke-virtual {v2}, Lp/p0;->drawableStateChanged()V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :pswitch_10
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v0, Lm7/e;

    .line 262
    .line 263
    invoke-static {v0}, Lm7/e;->a(Lm7/e;)Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_16

    .line 268
    .line 269
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v0, Lm7/e;

    .line 272
    .line 273
    iget-object v0, v0, Lm7/e;->A:Lk7/a;

    .line 274
    .line 275
    invoke-virtual {v0}, Lk7/a;->b()Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-eqz v0, :cond_15

    .line 280
    .line 281
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, Lm7/e;

    .line 284
    .line 285
    invoke-static {v0}, Lm7/e;->a(Lm7/e;)Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_15

    .line 290
    .line 291
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v0, Lm7/e;

    .line 294
    .line 295
    iget-object v2, v0, Lm7/e;->s:Ljava/lang/Object;

    .line 296
    .line 297
    monitor-enter v2

    .line 298
    const/4 v3, 0x1

    .line 299
    :try_start_1
    iget-object v4, v0, Lm7/e;->z:Lm7/a;

    .line 300
    .line 301
    const-string v5, "prioritySort"

    .line 302
    .line 303
    invoke-static {v3, v5}, Landroidx/datastore/preferences/protobuf/g;->v(ILjava/lang/String;)V

    .line 304
    .line 305
    .line 306
    iget-object v4, v4, Lm7/a;->a:Li7/g;

    .line 307
    .line 308
    invoke-virtual {v4}, Li7/g;->g()Ljava/util/List;

    .line 309
    .line 310
    .line 311
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 312
    goto :goto_1

    .line 313
    :catchall_0
    move-exception v0

    .line 314
    goto/16 :goto_9

    .line 315
    .line 316
    :catch_1
    :try_start_2
    iget-object v0, v0, Lm7/e;->C:Lq7/f;

    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    sget-object v0, Li8/s;->s:Li8/s;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 322
    .line 323
    :goto_1
    monitor-exit v2

    .line 324
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    const/4 v4, 0x0

    .line 329
    if-nez v2, :cond_5

    .line 330
    .line 331
    iget-object v2, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v2, Lm7/e;

    .line 334
    .line 335
    iget-object v2, v2, Lm7/e;->B:Lo7/a;

    .line 336
    .line 337
    iget-object v2, v2, Lo7/a;->g:Landroid/content/Context;

    .line 338
    .line 339
    invoke-static {v2}, LC3/a;->j(Landroid/content/Context;)Z

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    if-nez v2, :cond_4

    .line 344
    .line 345
    goto :goto_2

    .line 346
    :cond_4
    move v2, v4

    .line 347
    goto :goto_3

    .line 348
    :cond_5
    :goto_2
    move v2, v3

    .line 349
    :goto_3
    if-nez v2, :cond_12

    .line 350
    .line 351
    invoke-static {v0}, Li8/l;->B(Ljava/util/List;)I

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    if-ltz v2, :cond_13

    .line 356
    .line 357
    move v6, v3

    .line 358
    move v5, v4

    .line 359
    :goto_4
    iget-object v7, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v7, Lm7/e;

    .line 362
    .line 363
    iget-object v7, v7, Lm7/e;->A:Lk7/a;

    .line 364
    .line 365
    invoke-virtual {v7}, Lk7/a;->b()Z

    .line 366
    .line 367
    .line 368
    move-result v7

    .line 369
    if-eqz v7, :cond_11

    .line 370
    .line 371
    iget-object v7, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v7, Lm7/e;

    .line 374
    .line 375
    invoke-static {v7}, Lm7/e;->a(Lm7/e;)Z

    .line 376
    .line 377
    .line 378
    move-result v7

    .line 379
    if-eqz v7, :cond_11

    .line 380
    .line 381
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v7

    .line 385
    check-cast v7, Lcom/tonyodev/fetch2/Download;

    .line 386
    .line 387
    move-object v8, v7

    .line 388
    check-cast v8, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 389
    .line 390
    iget-object v9, v8, Lcom/tonyodev/fetch2/database/DownloadInfo;->u:Ljava/lang/String;

    .line 391
    .line 392
    invoke-static {v9}, LC3/b;->I(Ljava/lang/String;)Z

    .line 393
    .line 394
    .line 395
    move-result v9

    .line 396
    if-nez v9, :cond_6

    .line 397
    .line 398
    iget-object v10, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v10, Lm7/e;

    .line 401
    .line 402
    iget-object v10, v10, Lm7/e;->B:Lo7/a;

    .line 403
    .line 404
    iget-object v10, v10, Lo7/a;->g:Landroid/content/Context;

    .line 405
    .line 406
    invoke-static {v10}, LC3/a;->j(Landroid/content/Context;)Z

    .line 407
    .line 408
    .line 409
    move-result v10

    .line 410
    if-eqz v10, :cond_11

    .line 411
    .line 412
    :cond_6
    iget-object v10, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v10, Lm7/e;

    .line 415
    .line 416
    invoke-static {v10}, Lm7/e;->a(Lm7/e;)Z

    .line 417
    .line 418
    .line 419
    move-result v10

    .line 420
    if-eqz v10, :cond_11

    .line 421
    .line 422
    iget-object v10, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v10, Lm7/e;

    .line 425
    .line 426
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    iget v10, v8, Lcom/tonyodev/fetch2/database/DownloadInfo;->D:I

    .line 430
    .line 431
    const/4 v11, 0x2

    .line 432
    if-ne v10, v3, :cond_7

    .line 433
    .line 434
    move v10, v11

    .line 435
    :cond_7
    iget-object v12, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v12, Lm7/e;

    .line 438
    .line 439
    iget-object v12, v12, Lm7/e;->B:Lo7/a;

    .line 440
    .line 441
    const-string v13, "networkType"

    .line 442
    .line 443
    invoke-static {v10, v13}, Landroidx/datastore/preferences/protobuf/g;->v(ILjava/lang/String;)V

    .line 444
    .line 445
    .line 446
    const-string v13, "null cannot be cast to non-null type android.net.ConnectivityManager"

    .line 447
    .line 448
    const-string v14, "connectivity"

    .line 449
    .line 450
    iget-object v12, v12, Lo7/a;->g:Landroid/content/Context;

    .line 451
    .line 452
    const/4 v15, 0x3

    .line 453
    if-ne v10, v15, :cond_9

    .line 454
    .line 455
    const-string v15, "$this$isOnWiFi"

    .line 456
    .line 457
    invoke-static {v12, v15}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12, v14}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v15

    .line 464
    if-eqz v15, :cond_8

    .line 465
    .line 466
    check-cast v15, Landroid/net/ConnectivityManager;

    .line 467
    .line 468
    invoke-virtual {v15}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 469
    .line 470
    .line 471
    move-result-object v15

    .line 472
    if-eqz v15, :cond_9

    .line 473
    .line 474
    invoke-virtual {v15}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 475
    .line 476
    .line 477
    move-result v16

    .line 478
    if-eqz v16, :cond_9

    .line 479
    .line 480
    invoke-virtual {v15}, Landroid/net/NetworkInfo;->getType()I

    .line 481
    .line 482
    .line 483
    move-result v15

    .line 484
    if-ne v15, v3, :cond_9

    .line 485
    .line 486
    :goto_5
    move v10, v3

    .line 487
    goto :goto_6

    .line 488
    :cond_8
    new-instance v0, Lkotlin/TypeCastException;

    .line 489
    .line 490
    invoke-direct {v0, v13}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    throw v0

    .line 494
    :cond_9
    const/4 v15, 0x4

    .line 495
    if-ne v10, v15, :cond_b

    .line 496
    .line 497
    const-string v15, "$this$isOnMeteredConnection"

    .line 498
    .line 499
    invoke-static {v12, v15}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12, v14}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v14

    .line 506
    if-eqz v14, :cond_a

    .line 507
    .line 508
    check-cast v14, Landroid/net/ConnectivityManager;

    .line 509
    .line 510
    invoke-virtual {v14}, Landroid/net/ConnectivityManager;->isActiveNetworkMetered()Z

    .line 511
    .line 512
    .line 513
    move-result v13

    .line 514
    if-nez v13, :cond_b

    .line 515
    .line 516
    goto :goto_5

    .line 517
    :cond_a
    new-instance v0, Lkotlin/TypeCastException;

    .line 518
    .line 519
    invoke-direct {v0, v13}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    throw v0

    .line 523
    :cond_b
    if-ne v10, v11, :cond_c

    .line 524
    .line 525
    invoke-static {v12}, LC3/a;->j(Landroid/content/Context;)Z

    .line 526
    .line 527
    .line 528
    move-result v10

    .line 529
    if-eqz v10, :cond_c

    .line 530
    .line 531
    goto :goto_5

    .line 532
    :cond_c
    move v10, v4

    .line 533
    :goto_6
    if-nez v10, :cond_d

    .line 534
    .line 535
    iget-object v11, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast v11, Lm7/e;

    .line 538
    .line 539
    iget-object v11, v11, Lm7/e;->D:LV3/b;

    .line 540
    .line 541
    iget-object v11, v11, LV3/b;->g:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast v11, LJ4/c;

    .line 544
    .line 545
    invoke-virtual {v11, v7}, LJ4/c;->k(Lcom/tonyodev/fetch2/Download;)V

    .line 546
    .line 547
    .line 548
    :cond_d
    if-nez v9, :cond_e

    .line 549
    .line 550
    if-eqz v10, :cond_10

    .line 551
    .line 552
    :cond_e
    iget-object v6, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v6, Lm7/e;

    .line 555
    .line 556
    iget-object v6, v6, Lm7/e;->A:Lk7/a;

    .line 557
    .line 558
    iget v8, v8, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 559
    .line 560
    invoke-virtual {v6, v8}, Lk7/a;->i(I)Z

    .line 561
    .line 562
    .line 563
    move-result v6

    .line 564
    if-nez v6, :cond_f

    .line 565
    .line 566
    iget-object v6, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 567
    .line 568
    check-cast v6, Lm7/e;

    .line 569
    .line 570
    invoke-static {v6}, Lm7/e;->a(Lm7/e;)Z

    .line 571
    .line 572
    .line 573
    move-result v6

    .line 574
    if-eqz v6, :cond_f

    .line 575
    .line 576
    iget-object v6, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 577
    .line 578
    check-cast v6, Lm7/e;

    .line 579
    .line 580
    iget-object v6, v6, Lm7/e;->A:Lk7/a;

    .line 581
    .line 582
    invoke-virtual {v6, v7}, Lk7/a;->n(Lcom/tonyodev/fetch2/Download;)V

    .line 583
    .line 584
    .line 585
    :cond_f
    move v6, v4

    .line 586
    :cond_10
    if-eq v5, v2, :cond_11

    .line 587
    .line 588
    add-int/lit8 v5, v5, 0x1

    .line 589
    .line 590
    goto/16 :goto_4

    .line 591
    .line 592
    :cond_11
    move v3, v6

    .line 593
    goto :goto_7

    .line 594
    :cond_12
    move v3, v2

    .line 595
    :cond_13
    :goto_7
    if-eqz v3, :cond_15

    .line 596
    .line 597
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v0, Lm7/e;

    .line 600
    .line 601
    iget-wide v2, v0, Lm7/e;->u:J

    .line 602
    .line 603
    const-wide/16 v4, 0x1f4

    .line 604
    .line 605
    cmp-long v2, v2, v4

    .line 606
    .line 607
    if-nez v2, :cond_14

    .line 608
    .line 609
    const-wide/32 v2, 0xea60

    .line 610
    .line 611
    .line 612
    goto :goto_8

    .line 613
    :cond_14
    iget-wide v2, v0, Lm7/e;->u:J

    .line 614
    .line 615
    const-wide/16 v4, 0x2

    .line 616
    .line 617
    mul-long/2addr v2, v4

    .line 618
    :goto_8
    iput-wide v2, v0, Lm7/e;->u:J

    .line 619
    .line 620
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 621
    .line 622
    iget-wide v3, v0, Lm7/e;->u:J

    .line 623
    .line 624
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    .line 625
    .line 626
    .line 627
    move-result-wide v2

    .line 628
    iget-object v0, v0, Lm7/e;->C:Lq7/f;

    .line 629
    .line 630
    new-instance v4, Ljava/lang/StringBuilder;

    .line 631
    .line 632
    const-string v5, "PriorityIterator backoffTime increased to "

    .line 633
    .line 634
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    const-string v2, " minute(s)"

    .line 641
    .line 642
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    invoke-virtual {v0, v2}, Lq7/f;->a(Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    goto :goto_a

    .line 653
    :goto_9
    monitor-exit v2

    .line 654
    throw v0

    .line 655
    :cond_15
    :goto_a
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast v0, Lm7/e;

    .line 658
    .line 659
    invoke-static {v0}, Lm7/e;->a(Lm7/e;)Z

    .line 660
    .line 661
    .line 662
    move-result v0

    .line 663
    if-eqz v0, :cond_16

    .line 664
    .line 665
    iget-object v0, v1, Lm7/d;->t:Ljava/lang/Object;

    .line 666
    .line 667
    check-cast v0, Lm7/e;

    .line 668
    .line 669
    invoke-virtual {v0}, Lm7/e;->b()V

    .line 670
    .line 671
    .line 672
    :cond_16
    return-void

    .line 673
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
