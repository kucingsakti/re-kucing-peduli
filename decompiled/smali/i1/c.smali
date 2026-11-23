.class public final Li1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg1/c;


# static fields
.field public static final w:Ljava/lang/String;


# instance fields
.field public final s:Landroid/content/Context;

.field public final t:Ljava/util/HashMap;

.field public final u:Ljava/lang/Object;

.field public final v:Lcom/google/android/gms/internal/measurement/S;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "CommandHandler"

    .line 2
    .line 3
    invoke-static {v0}, Lf1/q;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Li1/c;->w:Ljava/lang/String;

    .line 8
    .line 9
    return-void
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

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/S;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li1/c;->s:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Li1/c;->v:Lcom/google/android/gms/internal/measurement/S;

    .line 7
    .line 8
    new-instance p1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Li1/c;->t:Ljava/util/HashMap;

    .line 14
    .line 15
    new-instance p1, Ljava/lang/Object;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Li1/c;->u:Ljava/lang/Object;

    .line 21
    .line 22
    return-void
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
.end method

.method public static c(Landroid/content/Intent;)Lo1/i;
    .locals 4

    .line 1
    new-instance v0, Lo1/i;

    .line 2
    .line 3
    const-string v1, "KEY_WORKSPEC_ID"

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "KEY_WORKSPEC_GENERATION"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {p0, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-direct {v0, v1, p0}, Lo1/i;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    return-object v0
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

.method public static d(Landroid/content/Intent;Lo1/i;)V
    .locals 2

    .line 1
    const-string v0, "KEY_WORKSPEC_ID"

    .line 2
    .line 3
    iget-object v1, p1, Lo1/i;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    const-string v0, "KEY_WORKSPEC_GENERATION"

    .line 9
    .line 10
    iget p1, p1, Lo1/i;->b:I

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 13
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
    .line 27
    .line 28
    .line 29
    .line 30
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
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Li1/c;->u:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Li1/c;->t:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    xor-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return v1

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw v1
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

.method public final b(Landroid/content/Intent;ILi1/i;)V
    .locals 10

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const-string v2, "ACTION_CONSTRAINTS_CHANGED"

    .line 7
    .line 8
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v2, :cond_7

    .line 15
    .line 16
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance p1, Li1/e;

    .line 27
    .line 28
    iget-object v1, p0, Li1/c;->s:Landroid/content/Context;

    .line 29
    .line 30
    invoke-direct {p1, v1, p2, p3}, Li1/e;-><init>(Landroid/content/Context;ILi1/i;)V

    .line 31
    .line 32
    .line 33
    iget-object p2, p3, Li1/i;->w:Lg1/o;

    .line 34
    .line 35
    iget-object p2, p2, Lg1/o;->c:Landroidx/work/impl/WorkDatabase;

    .line 36
    .line 37
    invoke-virtual {p2}, Landroidx/work/impl/WorkDatabase;->v()Lo1/p;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p2}, Lo1/p;->d()Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    sget v1, Li1/d;->a:I

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move v2, v4

    .line 52
    move v5, v2

    .line 53
    move v6, v5

    .line 54
    move v7, v6

    .line 55
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-eqz v8, :cond_2

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    check-cast v8, Lo1/o;

    .line 66
    .line 67
    iget-object v8, v8, Lo1/o;->j:Lf1/d;

    .line 68
    .line 69
    iget-boolean v9, v8, Lf1/d;->d:Z

    .line 70
    .line 71
    or-int/2addr v2, v9

    .line 72
    iget-boolean v9, v8, Lf1/d;->b:Z

    .line 73
    .line 74
    or-int/2addr v5, v9

    .line 75
    iget-boolean v9, v8, Lf1/d;->e:Z

    .line 76
    .line 77
    or-int/2addr v6, v9

    .line 78
    iget v8, v8, Lf1/d;->a:I

    .line 79
    .line 80
    if-eq v8, v3, :cond_1

    .line 81
    .line 82
    move v8, v3

    .line 83
    goto :goto_0

    .line 84
    :cond_1
    move v8, v4

    .line 85
    :goto_0
    or-int/2addr v7, v8

    .line 86
    if-eqz v2, :cond_0

    .line 87
    .line 88
    if-eqz v5, :cond_0

    .line 89
    .line 90
    if-eqz v6, :cond_0

    .line 91
    .line 92
    if-eqz v7, :cond_0

    .line 93
    .line 94
    :cond_2
    sget v1, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;->a:I

    .line 95
    .line 96
    new-instance v1, Landroid/content/Intent;

    .line 97
    .line 98
    const-string v3, "androidx.work.impl.background.systemalarm.UpdateProxies"

    .line 99
    .line 100
    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    new-instance v3, Landroid/content/ComponentName;

    .line 104
    .line 105
    iget-object v4, p1, Li1/e;->a:Landroid/content/Context;

    .line 106
    .line 107
    const-class v8, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;

    .line 108
    .line 109
    invoke-direct {v3, v4, v8}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 113
    .line 114
    .line 115
    const-string v3, "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"

    .line 116
    .line 117
    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    const-string v3, "KEY_BATTERY_CHARGING_PROXY_ENABLED"

    .line 122
    .line 123
    invoke-virtual {v2, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    const-string v3, "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"

    .line 128
    .line 129
    invoke-virtual {v2, v3, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    const-string v3, "KEY_NETWORK_STATE_PROXY_ENABLED"

    .line 134
    .line 135
    invoke-virtual {v2, v3, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 139
    .line 140
    .line 141
    iget-object v1, p1, Li1/e;->c:LY1/c;

    .line 142
    .line 143
    invoke-virtual {v1, p2}, LY1/c;->K(Ljava/lang/Iterable;)V

    .line 144
    .line 145
    .line 146
    new-instance v2, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 153
    .line 154
    .line 155
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 156
    .line 157
    .line 158
    move-result-wide v5

    .line 159
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    if-eqz v3, :cond_5

    .line 168
    .line 169
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    check-cast v3, Lo1/o;

    .line 174
    .line 175
    iget-object v7, v3, Lo1/o;->a:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v3}, Lo1/o;->a()J

    .line 178
    .line 179
    .line 180
    move-result-wide v8

    .line 181
    cmp-long v8, v5, v8

    .line 182
    .line 183
    if-ltz v8, :cond_3

    .line 184
    .line 185
    invoke-virtual {v3}, Lo1/o;->b()Z

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    if-eqz v8, :cond_4

    .line 190
    .line 191
    invoke-virtual {v1, v7}, LY1/c;->j(Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    if-eqz v7, :cond_3

    .line 196
    .line 197
    :cond_4
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    if-eqz v2, :cond_6

    .line 210
    .line 211
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    check-cast v2, Lo1/o;

    .line 216
    .line 217
    iget-object v3, v2, Lo1/o;->a:Ljava/lang/String;

    .line 218
    .line 219
    invoke-static {v2}, LC3/a;->g(Lo1/o;)Lo1/i;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    new-instance v3, Landroid/content/Intent;

    .line 224
    .line 225
    const-class v5, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 226
    .line 227
    invoke-direct {v3, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 228
    .line 229
    .line 230
    const-string v5, "ACTION_DELAY_MET"

    .line 231
    .line 232
    invoke-virtual {v3, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 233
    .line 234
    .line 235
    invoke-static {v3, v2}, Li1/c;->d(Landroid/content/Intent;Lo1/i;)V

    .line 236
    .line 237
    .line 238
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    iget-object v2, p3, Li1/i;->t:LY1/c;

    .line 246
    .line 247
    iget-object v2, v2, LY1/c;->v:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v2, LM2/O;

    .line 250
    .line 251
    new-instance v5, LX2/a;

    .line 252
    .line 253
    iget v6, p1, Li1/e;->b:I

    .line 254
    .line 255
    invoke-direct {v5, p3, v3, v6, v0}, LX2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v5}, LM2/O;->execute(Ljava/lang/Runnable;)V

    .line 259
    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_6
    invoke-virtual {v1}, LY1/c;->L()V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :cond_7
    const-string v2, "ACTION_RESCHEDULE"

    .line 267
    .line 268
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    if-eqz v2, :cond_8

    .line 273
    .line 274
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    iget-object p1, p3, Li1/i;->w:Lg1/o;

    .line 285
    .line 286
    invoke-virtual {p1}, Lg1/o;->e()V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :cond_8
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    const-string v5, "KEY_WORKSPEC_ID"

    .line 295
    .line 296
    filled-new-array {v5}, [Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    if-eqz v2, :cond_18

    .line 301
    .line 302
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 303
    .line 304
    .line 305
    move-result v6

    .line 306
    if-eqz v6, :cond_9

    .line 307
    .line 308
    goto/16 :goto_b

    .line 309
    .line 310
    :cond_9
    aget-object v5, v5, v4

    .line 311
    .line 312
    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    if-nez v2, :cond_a

    .line 317
    .line 318
    goto/16 :goto_b

    .line 319
    .line 320
    :cond_a
    const-string v2, "ACTION_SCHEDULE_WORK"

    .line 321
    .line 322
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    if-eqz v2, :cond_e

    .line 327
    .line 328
    invoke-static {p1}, Li1/c;->c(Landroid/content/Intent;)Lo1/i;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-virtual {p1}, Lo1/i;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    iget-object v1, p3, Li1/i;->w:Lg1/o;

    .line 343
    .line 344
    iget-object v1, v1, Lg1/o;->c:Landroidx/work/impl/WorkDatabase;

    .line 345
    .line 346
    invoke-virtual {v1}, LK0/m;->c()V

    .line 347
    .line 348
    .line 349
    :try_start_0
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->v()Lo1/p;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    iget-object v3, p1, Lo1/i;->a:Ljava/lang/String;

    .line 354
    .line 355
    invoke-virtual {v2, v3}, Lo1/p;->g(Ljava/lang/String;)Lo1/o;

    .line 356
    .line 357
    .line 358
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 359
    const-string v3, "Skipping scheduling "

    .line 360
    .line 361
    sget-object v4, Li1/c;->w:Ljava/lang/String;

    .line 362
    .line 363
    if-nez v2, :cond_b

    .line 364
    .line 365
    :try_start_1
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 366
    .line 367
    .line 368
    move-result-object p2

    .line 369
    new-instance p3, Ljava/lang/StringBuilder;

    .line 370
    .line 371
    invoke-direct {p3, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    const-string p1, " because it\'s no longer in the DB"

    .line 378
    .line 379
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object p1

    .line 386
    invoke-virtual {p2, v4, p1}, Lf1/q;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 387
    .line 388
    .line 389
    invoke-virtual {v1}, LK0/m;->j()V

    .line 390
    .line 391
    .line 392
    return-void

    .line 393
    :catchall_0
    move-exception p1

    .line 394
    goto :goto_4

    .line 395
    :cond_b
    :try_start_2
    iget v5, v2, Lo1/o;->b:I

    .line 396
    .line 397
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/g;->b(I)Z

    .line 398
    .line 399
    .line 400
    move-result v5

    .line 401
    if-eqz v5, :cond_c

    .line 402
    .line 403
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 404
    .line 405
    .line 406
    move-result-object p2

    .line 407
    new-instance p3, Ljava/lang/StringBuilder;

    .line 408
    .line 409
    invoke-direct {p3, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    const-string p1, "because it is finished."

    .line 416
    .line 417
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object p1

    .line 424
    invoke-virtual {p2, v4, p1}, Lf1/q;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 425
    .line 426
    .line 427
    invoke-virtual {v1}, LK0/m;->j()V

    .line 428
    .line 429
    .line 430
    return-void

    .line 431
    :cond_c
    :try_start_3
    invoke-virtual {v2}, Lo1/o;->a()J

    .line 432
    .line 433
    .line 434
    move-result-wide v3

    .line 435
    invoke-virtual {v2}, Lo1/o;->b()Z

    .line 436
    .line 437
    .line 438
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 439
    iget-object v5, p0, Li1/c;->s:Landroid/content/Context;

    .line 440
    .line 441
    if-nez v2, :cond_d

    .line 442
    .line 443
    :try_start_4
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 444
    .line 445
    .line 446
    move-result-object p2

    .line 447
    invoke-virtual {p1}, Lo1/i;->toString()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    invoke-static {v5, v1, p1, v3, v4}, Li1/b;->b(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Lo1/i;J)V

    .line 454
    .line 455
    .line 456
    goto :goto_3

    .line 457
    :cond_d
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    invoke-virtual {p1}, Lo1/i;->toString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    invoke-static {v5, v1, p1, v3, v4}, Li1/b;->b(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Lo1/i;J)V

    .line 468
    .line 469
    .line 470
    new-instance p1, Landroid/content/Intent;

    .line 471
    .line 472
    const-class v2, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 473
    .line 474
    invoke-direct {p1, v5, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 475
    .line 476
    .line 477
    const-string v2, "ACTION_CONSTRAINTS_CHANGED"

    .line 478
    .line 479
    invoke-virtual {p1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 480
    .line 481
    .line 482
    iget-object v2, p3, Li1/i;->t:LY1/c;

    .line 483
    .line 484
    iget-object v2, v2, LY1/c;->v:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v2, LM2/O;

    .line 487
    .line 488
    new-instance v3, LX2/a;

    .line 489
    .line 490
    invoke-direct {v3, p3, p1, p2, v0}, LX2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2, v3}, LM2/O;->execute(Ljava/lang/Runnable;)V

    .line 494
    .line 495
    .line 496
    :goto_3
    invoke-virtual {v1}, LK0/m;->o()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 497
    .line 498
    .line 499
    invoke-virtual {v1}, LK0/m;->j()V

    .line 500
    .line 501
    .line 502
    return-void

    .line 503
    :goto_4
    invoke-virtual {v1}, LK0/m;->j()V

    .line 504
    .line 505
    .line 506
    throw p1

    .line 507
    :cond_e
    const-string v0, "ACTION_DELAY_MET"

    .line 508
    .line 509
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    if-eqz v0, :cond_10

    .line 514
    .line 515
    iget-object v0, p0, Li1/c;->u:Ljava/lang/Object;

    .line 516
    .line 517
    monitor-enter v0

    .line 518
    :try_start_5
    invoke-static {p1}, Li1/c;->c(Landroid/content/Intent;)Lo1/i;

    .line 519
    .line 520
    .line 521
    move-result-object p1

    .line 522
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    invoke-virtual {p1}, Lo1/i;->toString()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    iget-object v1, p0, Li1/c;->t:Ljava/util/HashMap;

    .line 533
    .line 534
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result v1

    .line 538
    if-nez v1, :cond_f

    .line 539
    .line 540
    new-instance v1, Li1/g;

    .line 541
    .line 542
    iget-object v2, p0, Li1/c;->s:Landroid/content/Context;

    .line 543
    .line 544
    iget-object v3, p0, Li1/c;->v:Lcom/google/android/gms/internal/measurement/S;

    .line 545
    .line 546
    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/measurement/S;->x(Lo1/i;)Lg1/i;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    invoke-direct {v1, v2, p2, p3, v3}, Li1/g;-><init>(Landroid/content/Context;ILi1/i;Lg1/i;)V

    .line 551
    .line 552
    .line 553
    iget-object p2, p0, Li1/c;->t:Ljava/util/HashMap;

    .line 554
    .line 555
    invoke-virtual {p2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v1}, Li1/g;->e()V

    .line 559
    .line 560
    .line 561
    goto :goto_5

    .line 562
    :catchall_1
    move-exception p1

    .line 563
    goto :goto_6

    .line 564
    :cond_f
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 565
    .line 566
    .line 567
    move-result-object p2

    .line 568
    invoke-virtual {p1}, Lo1/i;->toString()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    :goto_5
    monitor-exit v0

    .line 575
    return-void

    .line 576
    :goto_6
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 577
    throw p1

    .line 578
    :cond_10
    const-string p2, "ACTION_STOP_WORK"

    .line 579
    .line 580
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result p2

    .line 584
    if-eqz p2, :cond_16

    .line 585
    .line 586
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 587
    .line 588
    .line 589
    move-result-object p1

    .line 590
    const-string p2, "KEY_WORKSPEC_ID"

    .line 591
    .line 592
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object p2

    .line 596
    const-string v0, "KEY_WORKSPEC_GENERATION"

    .line 597
    .line 598
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 599
    .line 600
    .line 601
    move-result v1

    .line 602
    iget-object v2, p0, Li1/c;->v:Lcom/google/android/gms/internal/measurement/S;

    .line 603
    .line 604
    if-eqz v1, :cond_11

    .line 605
    .line 606
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 607
    .line 608
    .line 609
    move-result p1

    .line 610
    new-instance v0, Ljava/util/ArrayList;

    .line 611
    .line 612
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 613
    .line 614
    .line 615
    new-instance v1, Lo1/i;

    .line 616
    .line 617
    invoke-direct {v1, p2, p1}, Lo1/i;-><init>(Ljava/lang/String;I)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/measurement/S;->v(Lo1/i;)Lg1/i;

    .line 621
    .line 622
    .line 623
    move-result-object p1

    .line 624
    if-eqz p1, :cond_12

    .line 625
    .line 626
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    goto :goto_7

    .line 630
    :cond_11
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/measurement/S;->w(Ljava/lang/String;)Ljava/util/List;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    :cond_12
    :goto_7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 635
    .line 636
    .line 637
    move-result-object p1

    .line 638
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 639
    .line 640
    .line 641
    move-result p2

    .line 642
    if-eqz p2, :cond_15

    .line 643
    .line 644
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object p2

    .line 648
    check-cast p2, Lg1/i;

    .line 649
    .line 650
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 655
    .line 656
    .line 657
    iget-object v0, p3, Li1/i;->w:Lg1/o;

    .line 658
    .line 659
    invoke-virtual {v0, p2}, Lg1/o;->g(Lg1/i;)V

    .line 660
    .line 661
    .line 662
    iget-object v0, p3, Li1/i;->w:Lg1/o;

    .line 663
    .line 664
    iget-object v0, v0, Lg1/o;->c:Landroidx/work/impl/WorkDatabase;

    .line 665
    .line 666
    iget-object v1, p2, Lg1/i;->a:Lo1/i;

    .line 667
    .line 668
    sget v2, Li1/b;->a:I

    .line 669
    .line 670
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->s()Lo1/h;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    invoke-virtual {v0, v1}, Lo1/h;->h(Lo1/i;)Lo1/g;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    if-eqz v2, :cond_14

    .line 679
    .line 680
    iget v2, v2, Lo1/g;->c:I

    .line 681
    .line 682
    iget-object v5, p0, Li1/c;->s:Landroid/content/Context;

    .line 683
    .line 684
    invoke-static {v5, v1, v2}, Li1/b;->a(Landroid/content/Context;Lo1/i;I)V

    .line 685
    .line 686
    .line 687
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    invoke-virtual {v1}, Lo1/i;->toString()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    .line 696
    .line 697
    iget-object v2, v0, Lo1/h;->s:Ljava/lang/Object;

    .line 698
    .line 699
    check-cast v2, Landroidx/work/impl/WorkDatabase_Impl;

    .line 700
    .line 701
    invoke-virtual {v2}, LK0/m;->b()V

    .line 702
    .line 703
    .line 704
    iget-object v0, v0, Lo1/h;->u:Ljava/lang/Object;

    .line 705
    .line 706
    check-cast v0, Li7/d;

    .line 707
    .line 708
    invoke-virtual {v0}, LK0/q;->a()LP0/j;

    .line 709
    .line 710
    .line 711
    move-result-object v5

    .line 712
    iget-object v6, v1, Lo1/i;->a:Ljava/lang/String;

    .line 713
    .line 714
    if-nez v6, :cond_13

    .line 715
    .line 716
    invoke-interface {v5, v3}, LO0/d;->v(I)V

    .line 717
    .line 718
    .line 719
    goto :goto_9

    .line 720
    :cond_13
    invoke-interface {v5, v3, v6}, LO0/d;->m(ILjava/lang/String;)V

    .line 721
    .line 722
    .line 723
    :goto_9
    iget v1, v1, Lo1/i;->b:I

    .line 724
    .line 725
    int-to-long v6, v1

    .line 726
    const/4 v1, 0x2

    .line 727
    invoke-interface {v5, v1, v6, v7}, LO0/d;->I(IJ)V

    .line 728
    .line 729
    .line 730
    invoke-virtual {v2}, LK0/m;->c()V

    .line 731
    .line 732
    .line 733
    :try_start_6
    invoke-virtual {v5}, LP0/j;->a()I

    .line 734
    .line 735
    .line 736
    invoke-virtual {v2}, LK0/m;->o()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 737
    .line 738
    .line 739
    invoke-virtual {v2}, LK0/m;->j()V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v0, v5}, LK0/q;->e(LP0/j;)V

    .line 743
    .line 744
    .line 745
    goto :goto_a

    .line 746
    :catchall_2
    move-exception p1

    .line 747
    invoke-virtual {v2}, LK0/m;->j()V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v0, v5}, LK0/q;->e(LP0/j;)V

    .line 751
    .line 752
    .line 753
    throw p1

    .line 754
    :cond_14
    :goto_a
    iget-object p2, p2, Lg1/i;->a:Lo1/i;

    .line 755
    .line 756
    invoke-virtual {p3, p2, v4}, Li1/i;->f(Lo1/i;Z)V

    .line 757
    .line 758
    .line 759
    goto :goto_8

    .line 760
    :cond_15
    return-void

    .line 761
    :cond_16
    const-string p2, "ACTION_EXECUTION_COMPLETED"

    .line 762
    .line 763
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 764
    .line 765
    .line 766
    move-result p2

    .line 767
    if-eqz p2, :cond_17

    .line 768
    .line 769
    invoke-static {p1}, Li1/c;->c(Landroid/content/Intent;)Lo1/i;

    .line 770
    .line 771
    .line 772
    move-result-object p2

    .line 773
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 774
    .line 775
    .line 776
    move-result-object p3

    .line 777
    const-string v0, "KEY_NEEDS_RESCHEDULE"

    .line 778
    .line 779
    invoke-virtual {p3, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 780
    .line 781
    .line 782
    move-result p3

    .line 783
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 791
    .line 792
    .line 793
    invoke-virtual {p0, p2, p3}, Li1/c;->f(Lo1/i;Z)V

    .line 794
    .line 795
    .line 796
    return-void

    .line 797
    :cond_17
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 798
    .line 799
    .line 800
    move-result-object p2

    .line 801
    sget-object p3, Li1/c;->w:Ljava/lang/String;

    .line 802
    .line 803
    new-instance v0, Ljava/lang/StringBuilder;

    .line 804
    .line 805
    const-string v1, "Ignoring intent "

    .line 806
    .line 807
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 811
    .line 812
    .line 813
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object p1

    .line 817
    invoke-virtual {p2, p3, p1}, Lf1/q;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 818
    .line 819
    .line 820
    return-void

    .line 821
    :cond_18
    :goto_b
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 822
    .line 823
    .line 824
    move-result-object p1

    .line 825
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 826
    .line 827
    .line 828
    return-void
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

.method public final f(Lo1/i;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Li1/c;->u:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Li1/c;->t:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Li1/g;

    .line 11
    .line 12
    iget-object v2, p0, Li1/c;->v:Lcom/google/android/gms/internal/measurement/S;

    .line 13
    .line 14
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/measurement/S;->v(Lo1/i;)Lg1/i;

    .line 15
    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, p2}, Li1/g;->f(Z)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw p1
    .line 29
    .line 30
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
.end method
