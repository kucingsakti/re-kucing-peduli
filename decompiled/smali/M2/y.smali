.class public final LM2/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ljava/lang/Object;

.field public final synthetic w:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LJ4/c;Lcom/tonyodev/fetch2/Download;Lh7/b;Ljava/lang/Exception;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, LM2/y;->s:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM2/y;->u:Ljava/lang/Object;

    iput-object p2, p0, LM2/y;->v:Ljava/lang/Object;

    iput-object p3, p0, LM2/y;->t:Ljava/lang/Object;

    iput-object p4, p0, LM2/y;->w:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LM2/q0;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LM2/y;->s:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LM2/y;->t:Ljava/lang/Object;

    iput-object p3, p0, LM2/y;->u:Ljava/lang/Object;

    iput-object p4, p0, LM2/y;->v:Ljava/lang/Object;

    iput-object p1, p0, LM2/y;->w:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzkx;Lcom/google/android/gms/measurement/internal/zzbd;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzdg;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LM2/y;->s:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LM2/y;->v:Ljava/lang/Object;

    iput-object p3, p0, LM2/y;->t:Ljava/lang/Object;

    iput-object p4, p0, LM2/y;->u:Ljava/lang/Object;

    iput-object p1, p0, LM2/y;->w:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, LM2/y;->s:I

    iput-object p2, p0, LM2/y;->u:Ljava/lang/Object;

    iput-object p3, p0, LM2/y;->v:Ljava/lang/Object;

    iput-object p4, p0, LM2/y;->t:Ljava/lang/Object;

    iput-object p1, p0, LM2/y;->w:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 3
    iput p5, p0, LM2/y;->s:I

    iput-object p2, p0, LM2/y;->u:Ljava/lang/Object;

    iput-object p3, p0, LM2/y;->t:Ljava/lang/Object;

    iput-object p4, p0, LM2/y;->v:Ljava/lang/Object;

    iput-object p1, p0, LM2/y;->w:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    const/4 v1, 0x0

    .line 2
    const/4 v0, 0x0

    .line 3
    iget v2, p0, LM2/y;->s:I

    .line 4
    .line 5
    packed-switch v2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LM2/y;->t:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, Lq1/k;

    .line 12
    .line 13
    const-string v0, "Ignoring setProgressAsync(...). WorkSpec ("

    .line 14
    .line 15
    iget-object v3, p0, LM2/y;->u:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ljava/util/UUID;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    sget-object v6, Lp1/q;->c:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, LM2/y;->v:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Lf1/g;

    .line 35
    .line 36
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v5, p0, LM2/y;->w:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v5, Lp1/q;

    .line 45
    .line 46
    iget-object v7, v5, Lp1/q;->a:Landroidx/work/impl/WorkDatabase;

    .line 47
    .line 48
    iget-object v5, v5, Lp1/q;->a:Landroidx/work/impl/WorkDatabase;

    .line 49
    .line 50
    invoke-virtual {v7}, LK0/m;->c()V

    .line 51
    .line 52
    .line 53
    :try_start_0
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->v()Lo1/p;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-virtual {v7, v4}, Lo1/p;->g(Ljava/lang/String;)Lo1/o;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    if-eqz v7, :cond_1

    .line 62
    .line 63
    iget v7, v7, Lo1/o;->b:I

    .line 64
    .line 65
    const/4 v8, 0x2

    .line 66
    if-ne v7, v8, :cond_0

    .line 67
    .line 68
    new-instance v0, Lo1/l;

    .line 69
    .line 70
    invoke-direct {v0, v4, v3}, Lo1/l;-><init>(Ljava/lang/String;Lf1/g;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->u()Lo1/m;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iget-object v4, v3, Lo1/m;->s:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v4, Landroidx/work/impl/WorkDatabase_Impl;

    .line 80
    .line 81
    invoke-virtual {v4}, LK0/m;->b()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, LK0/m;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 85
    .line 86
    .line 87
    :try_start_1
    iget-object v3, v3, Lo1/m;->t:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v3, Lo1/b;

    .line 90
    .line 91
    invoke-virtual {v3, v0}, LK0/d;->h(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, LK0/m;->o()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    .line 96
    .line 97
    :try_start_2
    invoke-virtual {v4}, LK0/m;->j()V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :catchall_0
    move-exception v0

    .line 102
    invoke-virtual {v4}, LK0/m;->j()V

    .line 103
    .line 104
    .line 105
    throw v0

    .line 106
    :catchall_1
    move-exception v0

    .line 107
    goto :goto_2

    .line 108
    :cond_0
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    new-instance v7, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v0, ") is not in a RUNNING state."

    .line 121
    .line 122
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v3, v6, v0}, Lf1/q;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :goto_0
    invoke-virtual {v2, v1}, Lq1/k;->j(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5}, LK0/m;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 136
    .line 137
    .line 138
    :goto_1
    invoke-virtual {v5}, LK0/m;->j()V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_1
    :try_start_3
    const-string v0, "Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    .line 143
    .line 144
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 145
    .line 146
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 150
    :goto_2
    :try_start_4
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    sget-object v3, Lp1/q;->c:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v0}, Lq1/k;->k(Ljava/lang/Throwable;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :goto_3
    return-void

    .line 164
    :catchall_2
    move-exception v0

    .line 165
    invoke-virtual {v5}, LK0/m;->j()V

    .line 166
    .line 167
    .line 168
    throw v0

    .line 169
    :pswitch_0
    iget-object v2, p0, LM2/y;->u:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v2, Lo/e;

    .line 172
    .line 173
    if-eqz v2, :cond_2

    .line 174
    .line 175
    iget-object v3, p0, LM2/y;->w:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v3, Li3/b;

    .line 178
    .line 179
    iget-object v4, v3, Li3/b;->t:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v4, Lo/f;

    .line 182
    .line 183
    const/4 v5, 0x1

    .line 184
    iput-boolean v5, v4, Lo/f;->R:Z

    .line 185
    .line 186
    iget-object v2, v2, Lo/e;->b:Lo/l;

    .line 187
    .line 188
    invoke-virtual {v2, v0}, Lo/l;->c(Z)V

    .line 189
    .line 190
    .line 191
    iget-object v2, v3, Li3/b;->t:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v2, Lo/f;

    .line 194
    .line 195
    iput-boolean v0, v2, Lo/f;->R:Z

    .line 196
    .line 197
    :cond_2
    iget-object v0, p0, LM2/y;->v:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, Lo/n;

    .line 200
    .line 201
    invoke-virtual {v0}, Lo/n;->isEnabled()Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    if-eqz v2, :cond_3

    .line 206
    .line 207
    invoke-virtual {v0}, Lo/n;->hasSubMenu()Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_3

    .line 212
    .line 213
    iget-object v2, p0, LM2/y;->t:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v2, Lo/l;

    .line 216
    .line 217
    const/4 v3, 0x4

    .line 218
    invoke-virtual {v2, v0, v1, v3}, Lo/l;->q(Landroid/view/MenuItem;Lo/x;I)Z

    .line 219
    .line 220
    .line 221
    :cond_3
    return-void

    .line 222
    :pswitch_1
    iget-object v0, p0, LM2/y;->u:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, LJ4/c;

    .line 225
    .line 226
    iget-object v1, p0, LM2/y;->v:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v1, Lcom/tonyodev/fetch2/Download;

    .line 229
    .line 230
    iget-object v2, p0, LM2/y;->t:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v2, Lh7/b;

    .line 233
    .line 234
    iget-object v3, p0, LM2/y;->w:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v3, Ljava/lang/Exception;

    .line 237
    .line 238
    invoke-virtual {v0, v1, v2, v3}, LJ4/c;->e(Lcom/tonyodev/fetch2/Download;Lh7/b;Ljava/lang/Exception;)V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :pswitch_2
    iget-object v0, p0, LM2/y;->w:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v0, LM2/q0;

    .line 245
    .line 246
    iget-object v1, v0, LM2/q0;->s:Lcom/google/android/gms/measurement/internal/zznc;

    .line 247
    .line 248
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zznc;->a0()Lcom/google/android/gms/measurement/internal/zznp;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    iget-object v0, v0, LM2/q0;->s:Lcom/google/android/gms/measurement/internal/zznc;

    .line 253
    .line 254
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zznc;->a()Lcom/google/android/gms/common/util/Clock;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    check-cast v1, Lcom/google/android/gms/common/util/DefaultClock;

    .line 259
    .line 260
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 264
    .line 265
    .line 266
    move-result-wide v6

    .line 267
    iget-object v1, p0, LM2/y;->u:Ljava/lang/Object;

    .line 268
    .line 269
    move-object v3, v1

    .line 270
    check-cast v3, Ljava/lang/String;

    .line 271
    .line 272
    iget-object v1, p0, LM2/y;->v:Ljava/lang/Object;

    .line 273
    .line 274
    move-object v4, v1

    .line 275
    check-cast v4, Landroid/os/Bundle;

    .line 276
    .line 277
    const-string v5, "auto"

    .line 278
    .line 279
    const/4 v8, 0x0

    .line 280
    invoke-virtual/range {v2 .. v8}, Lcom/google/android/gms/measurement/internal/zznp;->j1(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)Lcom/google/android/gms/measurement/internal/zzbd;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->i(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    iget-object v2, p0, LM2/y;->t:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v2, Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zznc;->v(Lcom/google/android/gms/measurement/internal/zzbd;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :pswitch_3
    iget-object v1, p0, LM2/y;->w:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 298
    .line 299
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Lcom/google/android/gms/measurement/internal/zzhj;

    .line 300
    .line 301
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzhj;->r()Lcom/google/android/gms/measurement/internal/zzkx;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    invoke-virtual {v3}, LM2/o;->W0()V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v3}, LM2/n;->a1()V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v3, v0}, Lcom/google/android/gms/measurement/internal/zzkx;->p1(Z)Lcom/google/android/gms/measurement/internal/zzo;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    new-instance v2, LM2/e0;

    .line 316
    .line 317
    iget-object v0, p0, LM2/y;->v:Ljava/lang/Object;

    .line 318
    .line 319
    move-object v5, v0

    .line 320
    check-cast v5, Ljava/lang/String;

    .line 321
    .line 322
    iget-object v0, p0, LM2/y;->u:Ljava/lang/Object;

    .line 323
    .line 324
    move-object v7, v0

    .line 325
    check-cast v7, Lcom/google/android/gms/internal/measurement/zzdg;

    .line 326
    .line 327
    iget-object v0, p0, LM2/y;->t:Ljava/lang/Object;

    .line 328
    .line 329
    move-object v4, v0

    .line 330
    check-cast v4, Ljava/lang/String;

    .line 331
    .line 332
    invoke-direct/range {v2 .. v7}, LM2/e0;-><init>(Lcom/google/android/gms/measurement/internal/zzkx;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzo;Lcom/google/android/gms/internal/measurement/zzdg;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v3, v2}, Lcom/google/android/gms/measurement/internal/zzkx;->f1(Ljava/lang/Runnable;)V

    .line 336
    .line 337
    .line 338
    return-void

    .line 339
    :pswitch_4
    iget-object v0, p0, LM2/y;->u:Ljava/lang/Object;

    .line 340
    .line 341
    move-object v2, v0

    .line 342
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzdg;

    .line 343
    .line 344
    iget-object v0, p0, LM2/y;->w:Ljava/lang/Object;

    .line 345
    .line 346
    move-object v3, v0

    .line 347
    check-cast v3, Lcom/google/android/gms/measurement/internal/zzkx;

    .line 348
    .line 349
    :try_start_5
    iget-object v0, v3, Lcom/google/android/gms/measurement/internal/zzkx;->v:Lcom/google/android/gms/measurement/internal/zzfl;

    .line 350
    .line 351
    if-nez v0, :cond_4

    .line 352
    .line 353
    invoke-virtual {v3}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 358
    .line 359
    const-string v4, "Discarding data. Failed to send event to service to bundle"

    .line 360
    .line 361
    invoke-virtual {v0, v4}, Lcom/google/android/gms/measurement/internal/zzfy;->b(Ljava/lang/String;)V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 362
    .line 363
    .line 364
    invoke-virtual {v3}, LB1/a;->V0()Lcom/google/android/gms/measurement/internal/zznp;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/zznp;->w1(Lcom/google/android/gms/internal/measurement/zzdg;[B)V

    .line 369
    .line 370
    .line 371
    goto :goto_5

    .line 372
    :catchall_3
    move-exception v0

    .line 373
    goto :goto_6

    .line 374
    :catch_0
    move-exception v0

    .line 375
    goto :goto_4

    .line 376
    :cond_4
    :try_start_6
    iget-object v4, p0, LM2/y;->v:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v4, Lcom/google/android/gms/measurement/internal/zzbd;

    .line 379
    .line 380
    iget-object v5, p0, LM2/y;->t:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v5, Ljava/lang/String;

    .line 383
    .line 384
    invoke-interface {v0, v4, v5}, Lcom/google/android/gms/measurement/internal/zzfl;->C(Lcom/google/android/gms/measurement/internal/zzbd;Ljava/lang/String;)[B

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzkx;->o1()V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 389
    .line 390
    .line 391
    invoke-virtual {v3}, LB1/a;->V0()Lcom/google/android/gms/measurement/internal/zznp;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/zznp;->w1(Lcom/google/android/gms/internal/measurement/zzdg;[B)V

    .line 396
    .line 397
    .line 398
    goto :goto_5

    .line 399
    :goto_4
    :try_start_7
    invoke-virtual {v3}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 404
    .line 405
    const-string v5, "Failed to send event to the service to bundle"

    .line 406
    .line 407
    invoke-virtual {v4, v0, v5}, Lcom/google/android/gms/measurement/internal/zzfy;->a(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 408
    .line 409
    .line 410
    invoke-virtual {v3}, LB1/a;->V0()Lcom/google/android/gms/measurement/internal/zznp;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/zznp;->w1(Lcom/google/android/gms/internal/measurement/zzdg;[B)V

    .line 415
    .line 416
    .line 417
    :goto_5
    return-void

    .line 418
    :goto_6
    invoke-virtual {v3}, LB1/a;->V0()Lcom/google/android/gms/measurement/internal/zznp;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    invoke-virtual {v3, v2, v1}, Lcom/google/android/gms/measurement/internal/zznp;->w1(Lcom/google/android/gms/internal/measurement/zzdg;[B)V

    .line 423
    .line 424
    .line 425
    throw v0

    .line 426
    :pswitch_5
    iget-object v0, p0, LM2/y;->u:Ljava/lang/Object;

    .line 427
    .line 428
    move-object v1, v0

    .line 429
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 430
    .line 431
    monitor-enter v1

    .line 432
    :try_start_8
    iget-object v0, p0, LM2/y;->w:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzkx;

    .line 435
    .line 436
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzkx;->v:Lcom/google/android/gms/measurement/internal/zzfl;

    .line 437
    .line 438
    if-nez v2, :cond_5

    .line 439
    .line 440
    invoke-virtual {v0}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 445
    .line 446
    const-string v2, "Failed to get trigger URIs; not connected to service"

    .line 447
    .line 448
    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzfy;->b(Ljava/lang/String;)V
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 449
    .line 450
    .line 451
    :try_start_9
    iget-object v0, p0, LM2/y;->u:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 454
    .line 455
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 456
    .line 457
    .line 458
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 459
    goto :goto_9

    .line 460
    :catchall_4
    move-exception v0

    .line 461
    goto :goto_b

    .line 462
    :catchall_5
    move-exception v0

    .line 463
    goto :goto_a

    .line 464
    :catch_1
    move-exception v0

    .line 465
    goto :goto_7

    .line 466
    :cond_5
    :try_start_a
    iget-object v0, p0, LM2/y;->v:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzo;

    .line 469
    .line 470
    iget-object v3, p0, LM2/y;->u:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 473
    .line 474
    iget-object v4, p0, LM2/y;->t:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v4, Landroid/os/Bundle;

    .line 477
    .line 478
    invoke-interface {v2, v4, v0}, Lcom/google/android/gms/measurement/internal/zzfl;->o(Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/zzo;)Ljava/util/List;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    iget-object v0, p0, LM2/y;->w:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzkx;

    .line 488
    .line 489
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzkx;->o1()V
    :try_end_a
    .catch Landroid/os/RemoteException; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 490
    .line 491
    .line 492
    :try_start_b
    iget-object v0, p0, LM2/y;->u:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 495
    .line 496
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 497
    .line 498
    .line 499
    goto :goto_8

    .line 500
    :goto_7
    :try_start_c
    iget-object v2, p0, LM2/y;->w:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzkx;

    .line 503
    .line 504
    invoke-virtual {v2}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 509
    .line 510
    const-string v3, "Failed to get trigger URIs; remote exception"

    .line 511
    .line 512
    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/measurement/internal/zzfy;->a(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 513
    .line 514
    .line 515
    :try_start_d
    iget-object v0, p0, LM2/y;->u:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 518
    .line 519
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 520
    .line 521
    .line 522
    :goto_8
    monitor-exit v1

    .line 523
    :goto_9
    return-void

    .line 524
    :goto_a
    iget-object v2, p0, LM2/y;->u:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 527
    .line 528
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 529
    .line 530
    .line 531
    throw v0

    .line 532
    :goto_b
    monitor-exit v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 533
    throw v0

    .line 534
    :pswitch_6
    iget-object v1, p0, LM2/y;->w:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v1, Lcom/google/android/gms/measurement/internal/zziv;

    .line 537
    .line 538
    iget-object v1, v1, LB1/a;->s:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 541
    .line 542
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzhj;->r()Lcom/google/android/gms/measurement/internal/zzkx;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    invoke-virtual {v3}, LM2/o;->W0()V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v3}, LM2/n;->a1()V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v3, v0}, Lcom/google/android/gms/measurement/internal/zzkx;->p1(Z)Lcom/google/android/gms/measurement/internal/zzo;

    .line 553
    .line 554
    .line 555
    move-result-object v7

    .line 556
    new-instance v2, LM2/e0;

    .line 557
    .line 558
    iget-object v0, p0, LM2/y;->u:Ljava/lang/Object;

    .line 559
    .line 560
    move-object v4, v0

    .line 561
    check-cast v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 562
    .line 563
    iget-object v0, p0, LM2/y;->t:Ljava/lang/Object;

    .line 564
    .line 565
    move-object v5, v0

    .line 566
    check-cast v5, Ljava/lang/String;

    .line 567
    .line 568
    iget-object v0, p0, LM2/y;->v:Ljava/lang/Object;

    .line 569
    .line 570
    move-object v6, v0

    .line 571
    check-cast v6, Ljava/lang/String;

    .line 572
    .line 573
    const/4 v8, 0x0

    .line 574
    invoke-direct/range {v2 .. v8}, LM2/e0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v3, v2}, Lcom/google/android/gms/measurement/internal/zzkx;->f1(Ljava/lang/Runnable;)V

    .line 578
    .line 579
    .line 580
    return-void

    .line 581
    :pswitch_7
    iget-object v1, p0, LM2/y;->w:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 584
    .line 585
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Lcom/google/android/gms/measurement/internal/zzhj;

    .line 586
    .line 587
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzhj;->r()Lcom/google/android/gms/measurement/internal/zzkx;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    invoke-virtual {v1}, LM2/o;->W0()V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v1}, LM2/n;->a1()V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v1}, LB1/a;->V0()Lcom/google/android/gms/measurement/internal/zznp;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    sget-object v3, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->b:Lcom/google/android/gms/common/GoogleApiAvailabilityLight;

    .line 602
    .line 603
    iget-object v2, v2, LB1/a;->s:Ljava/lang/Object;

    .line 604
    .line 605
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 606
    .line 607
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzhj;->s:Landroid/content/Context;

    .line 608
    .line 609
    const v4, 0xbdfcb8

    .line 610
    .line 611
    .line 612
    invoke-virtual {v3, v2, v4}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->b(Landroid/content/Context;I)I

    .line 613
    .line 614
    .line 615
    move-result v2

    .line 616
    iget-object v3, p0, LM2/y;->u:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzdg;

    .line 619
    .line 620
    if-eqz v2, :cond_6

    .line 621
    .line 622
    invoke-virtual {v1}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    const-string v4, "Not bundling data. Service unavailable or out of date"

    .line 627
    .line 628
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzfw;->A:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 629
    .line 630
    invoke-virtual {v2, v4}, Lcom/google/android/gms/measurement/internal/zzfy;->b(Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v1}, LB1/a;->V0()Lcom/google/android/gms/measurement/internal/zznp;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    new-array v0, v0, [B

    .line 638
    .line 639
    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/measurement/internal/zznp;->w1(Lcom/google/android/gms/internal/measurement/zzdg;[B)V

    .line 640
    .line 641
    .line 642
    goto :goto_c

    .line 643
    :cond_6
    new-instance v0, LM2/y;

    .line 644
    .line 645
    iget-object v2, p0, LM2/y;->v:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzbd;

    .line 648
    .line 649
    iget-object v4, p0, LM2/y;->t:Ljava/lang/Object;

    .line 650
    .line 651
    check-cast v4, Ljava/lang/String;

    .line 652
    .line 653
    invoke-direct {v0, v1, v2, v4, v3}, LM2/y;-><init>(Lcom/google/android/gms/measurement/internal/zzkx;Lcom/google/android/gms/measurement/internal/zzbd;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzdg;)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v1, v0}, Lcom/google/android/gms/measurement/internal/zzkx;->f1(Ljava/lang/Runnable;)V

    .line 657
    .line 658
    .line 659
    :goto_c
    return-void

    .line 660
    nop

    .line 661
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
