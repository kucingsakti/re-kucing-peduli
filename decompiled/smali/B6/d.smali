.class public final synthetic LB6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LIa/a;Landroid/content/Intent;)V
    .locals 0

    .line 1
    const/16 p1, 0x18

    iput p1, p0, LB6/d;->s:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LB6/d;->t:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, LB6/d;->s:I

    iput-object p1, p0, LB6/d;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lu8/a;)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, LB6/d;->s:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Lv8/k;

    iput-object p1, p0, LB6/d;->t:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LB6/d;->t:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Ll0/m;

    .line 5
    .line 6
    const-string v2, "fetchFonts result is not OK. ("

    .line 7
    .line 8
    iget-object v3, v1, Ll0/m;->v:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v3

    .line 11
    :try_start_0
    iget-object v4, v1, Ll0/m;->z:LC8/E;

    .line 12
    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    monitor-exit v3

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto/16 :goto_6

    .line 19
    .line 20
    :cond_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :try_start_1
    invoke-virtual {v1}, Ll0/m;->d()LR/h;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget v4, v3, LR/h;->e:I

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    if-ne v4, v5, :cond_1

    .line 29
    .line 30
    iget-object v5, v1, Ll0/m;->v:Ljava/lang/Object;

    .line 31
    .line 32
    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 33
    :try_start_2
    monitor-exit v5

    .line 34
    goto :goto_0

    .line 35
    :catchall_1
    move-exception v0

    .line 36
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 37
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 38
    :catchall_2
    move-exception v0

    .line 39
    goto/16 :goto_3

    .line 40
    .line 41
    :cond_1
    :goto_0
    if-nez v4, :cond_4

    .line 42
    .line 43
    :try_start_4
    const-string v2, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 44
    .line 45
    sget v4, LQ/m;->a:I

    .line 46
    .line 47
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v1, Ll0/m;->u:LK3/d;

    .line 51
    .line 52
    iget-object v4, v1, Ll0/m;->s:Landroid/content/Context;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    const/4 v2, 0x1

    .line 58
    new-array v2, v2, [LR/h;

    .line 59
    .line 60
    aput-object v3, v2, v0

    .line 61
    .line 62
    sget-object v5, LL/g;->a:LC4/a;

    .line 63
    .line 64
    invoke-virtual {v5, v4, v2, v0}, LC4/a;->j(Landroid/content/Context;[LR/h;I)Landroid/graphics/Typeface;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v2, v1, Ll0/m;->s:Landroid/content/Context;

    .line 69
    .line 70
    iget-object v3, v3, LR/h;->a:Landroid/net/Uri;

    .line 71
    .line 72
    invoke-static {v2, v3}, LC8/E;->w(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 73
    .line 74
    .line 75
    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 76
    if-eqz v2, :cond_3

    .line 77
    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    :try_start_5
    const-string v3, "EmojiCompat.MetadataRepo.create"

    .line 81
    .line 82
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    new-instance v3, Lo1/h;

    .line 86
    .line 87
    invoke-static {v2}, LJ7/a;->r(Ljava/nio/MappedByteBuffer;)Lm0/b;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-direct {v3, v0, v2}, Lo1/h;-><init>(Landroid/graphics/Typeface;Lm0/b;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 92
    .line 93
    .line 94
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 95
    .line 96
    .line 97
    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 98
    .line 99
    .line 100
    iget-object v0, v1, Ll0/m;->v:Ljava/lang/Object;

    .line 101
    .line 102
    monitor-enter v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 103
    :try_start_8
    iget-object v2, v1, Ll0/m;->z:LC8/E;

    .line 104
    .line 105
    if-eqz v2, :cond_2

    .line 106
    .line 107
    invoke-virtual {v2, v3}, LC8/E;->y(Lo1/h;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :catchall_3
    move-exception v2

    .line 112
    goto :goto_2

    .line 113
    :cond_2
    :goto_1
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 114
    :try_start_9
    invoke-virtual {v1}, Ll0/m;->b()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :goto_2
    :try_start_a
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 119
    :try_start_b
    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 120
    :catchall_4
    move-exception v0

    .line 121
    :try_start_c
    sget v2, LQ/m;->a:I

    .line 122
    .line 123
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 124
    .line 125
    .line 126
    throw v0

    .line 127
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    .line 128
    .line 129
    const-string v2, "Unable to open file."

    .line 130
    .line 131
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 135
    :catchall_5
    move-exception v0

    .line 136
    :try_start_d
    sget v2, LQ/m;->a:I

    .line 137
    .line 138
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 139
    .line 140
    .line 141
    throw v0

    .line 142
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    .line 143
    .line 144
    new-instance v3, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v2, ")"

    .line 153
    .line 154
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 165
    :goto_3
    iget-object v2, v1, Ll0/m;->v:Ljava/lang/Object;

    .line 166
    .line 167
    monitor-enter v2

    .line 168
    :try_start_e
    iget-object v3, v1, Ll0/m;->z:LC8/E;

    .line 169
    .line 170
    if-eqz v3, :cond_5

    .line 171
    .line 172
    invoke-virtual {v3, v0}, LC8/E;->x(Ljava/lang/Throwable;)V

    .line 173
    .line 174
    .line 175
    goto :goto_4

    .line 176
    :catchall_6
    move-exception v0

    .line 177
    goto :goto_5

    .line 178
    :cond_5
    :goto_4
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 179
    invoke-virtual {v1}, Ll0/m;->b()V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :goto_5
    :try_start_f
    monitor-exit v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 184
    throw v0

    .line 185
    :goto_6
    :try_start_10
    monitor-exit v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 186
    throw v0
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

.method private final b()V
    .locals 7

    .line 1
    iget-object v0, p0, LB6/d;->t:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LFa/e;

    .line 4
    .line 5
    iget-object v1, v0, LFa/e;->w:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/ArrayDeque;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iget-object v2, v0, LFa/e;->t:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Landroid/content/SharedPreferences;

    .line 13
    .line 14
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v3, v0, LFa/e;->u:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Ljava/lang/String;

    .line 21
    .line 22
    new-instance v4, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v5, v0, LFa/e;->w:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v5, Ljava/util/ArrayDeque;

    .line 30
    .line 31
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    check-cast v6, Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v6, v0, LFa/e;->v:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v6, Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 67
    .line 68
    .line 69
    monitor-exit v1

    .line 70
    return-void

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    throw v0
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


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    const/4 v2, 0x6

    .line 5
    const/4 v4, 0x1

    .line 6
    const/4 v5, 0x0

    .line 7
    iget v6, v1, LB6/d;->s:I

    .line 8
    .line 9
    packed-switch v6, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 15
    .line 16
    const-string v2, "this$0"

    .line 17
    .line 18
    invoke-static {v0, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v2, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->v:Lq1/k;

    .line 22
    .line 23
    iget-object v2, v2, Lq1/i;->s:Ljava/lang/Object;

    .line 24
    .line 25
    instance-of v2, v2, Lq1/a;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0}, Lf1/p;->getInputData()Lf1/g;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Lf1/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {}, Lf1/q;->a()Lf1/q;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const-string v4, "get()"

    .line 46
    .line 47
    invoke-static {v3, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    if-eqz v2, :cond_6

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-nez v3, :cond_1

    .line 57
    .line 58
    goto/16 :goto_2

    .line 59
    .line 60
    :cond_1
    invoke-virtual {v0}, Lf1/p;->getWorkerFactory()Lf1/y;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v0}, Lf1/p;->getApplicationContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    iget-object v5, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->s:Landroidx/work/WorkerParameters;

    .line 69
    .line 70
    invoke-virtual {v3, v4, v2, v5}, Lf1/y;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Lf1/p;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iput-object v2, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->w:Lf1/p;

    .line 75
    .line 76
    if-nez v2, :cond_2

    .line 77
    .line 78
    sget v2, Ls1/a;->a:I

    .line 79
    .line 80
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->v:Lq1/k;

    .line 81
    .line 82
    const-string v2, "future"

    .line 83
    .line 84
    invoke-static {v0, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    new-instance v2, Lf1/l;

    .line 88
    .line 89
    invoke-direct {v2}, Lf1/l;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v2}, Lq1/k;->j(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto/16 :goto_3

    .line 96
    .line 97
    :cond_2
    invoke-virtual {v0}, Lf1/p;->getApplicationContext()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-static {v2}, Lg1/o;->b(Landroid/content/Context;)Lg1/o;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    iget-object v3, v2, Lg1/o;->c:Landroidx/work/impl/WorkDatabase;

    .line 106
    .line 107
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->v()Lo1/p;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v0}, Lf1/p;->getId()Ljava/util/UUID;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    const-string v5, "id.toString()"

    .line 120
    .line 121
    invoke-static {v4, v5}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3, v4}, Lo1/p;->g(Ljava/lang/String;)Lo1/o;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    if-nez v3, :cond_3

    .line 129
    .line 130
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->v:Lq1/k;

    .line 131
    .line 132
    const-string v2, "future"

    .line 133
    .line 134
    invoke-static {v0, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    sget v2, Ls1/a;->a:I

    .line 138
    .line 139
    new-instance v2, Lf1/l;

    .line 140
    .line 141
    invoke-direct {v2}, Lf1/l;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v2}, Lq1/k;->j(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto/16 :goto_3

    .line 148
    .line 149
    :cond_3
    new-instance v4, LY1/c;

    .line 150
    .line 151
    iget-object v2, v2, Lg1/o;->j:Lo4/r;

    .line 152
    .line 153
    const-string v5, "workManagerImpl.trackers"

    .line 154
    .line 155
    invoke-static {v2, v5}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-direct {v4, v2, v0}, LY1/c;-><init>(Lo4/r;Lk1/b;)V

    .line 159
    .line 160
    .line 161
    invoke-static {v3}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    check-cast v2, Ljava/lang/Iterable;

    .line 166
    .line 167
    invoke-virtual {v4, v2}, LY1/c;->K(Ljava/lang/Iterable;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Lf1/p;->getId()Ljava/util/UUID;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    const-string v3, "id.toString()"

    .line 179
    .line 180
    invoke-static {v2, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v2}, LY1/c;->j(Ljava/lang/String;)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-eqz v2, :cond_5

    .line 188
    .line 189
    sget v2, Ls1/a;->a:I

    .line 190
    .line 191
    :try_start_0
    iget-object v2, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->w:Lf1/p;

    .line 192
    .line 193
    invoke-static {v2}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2}, Lf1/p;->startWork()LC3/d;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const-string v3, "delegate!!.startWork()"

    .line 201
    .line 202
    invoke-static {v2, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    new-instance v3, LD4/a;

    .line 206
    .line 207
    const/16 v4, 0x16

    .line 208
    .line 209
    invoke-direct {v3, v0, v4, v2}, LD4/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0}, Lf1/p;->getBackgroundExecutor()Ljava/util/concurrent/Executor;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-interface {v2, v3, v4}, LC3/d;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :catchall_0
    sget v2, Ls1/a;->a:I

    .line 221
    .line 222
    iget-object v2, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->t:Ljava/lang/Object;

    .line 223
    .line 224
    monitor-enter v2

    .line 225
    :try_start_1
    iget-boolean v3, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->u:Z

    .line 226
    .line 227
    if-eqz v3, :cond_4

    .line 228
    .line 229
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->v:Lq1/k;

    .line 230
    .line 231
    const-string v3, "future"

    .line 232
    .line 233
    invoke-static {v0, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    new-instance v3, Lf1/m;

    .line 237
    .line 238
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, v3}, Lq1/k;->j(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    goto :goto_0

    .line 245
    :catchall_1
    move-exception v0

    .line 246
    goto :goto_1

    .line 247
    :cond_4
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->v:Lq1/k;

    .line 248
    .line 249
    const-string v3, "future"

    .line 250
    .line 251
    invoke-static {v0, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    new-instance v3, Lf1/l;

    .line 255
    .line 256
    invoke-direct {v3}, Lf1/l;-><init>()V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v3}, Lq1/k;->j(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 260
    .line 261
    .line 262
    :goto_0
    monitor-exit v2

    .line 263
    goto :goto_3

    .line 264
    :goto_1
    monitor-exit v2

    .line 265
    throw v0

    .line 266
    :cond_5
    sget v2, Ls1/a;->a:I

    .line 267
    .line 268
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->v:Lq1/k;

    .line 269
    .line 270
    const-string v2, "future"

    .line 271
    .line 272
    invoke-static {v0, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    new-instance v2, Lf1/m;

    .line 276
    .line 277
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v2}, Lq1/k;->j(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_6
    :goto_2
    sget v2, Ls1/a;->a:I

    .line 285
    .line 286
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->v:Lq1/k;

    .line 287
    .line 288
    const-string v2, "future"

    .line 289
    .line 290
    invoke-static {v0, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    new-instance v2, Lf1/l;

    .line 294
    .line 295
    invoke-direct {v2}, Lf1/l;-><init>()V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, v2}, Lq1/k;->j(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    :goto_3
    return-void

    .line 302
    :pswitch_0
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, Landroidx/fragment/app/e;

    .line 305
    .line 306
    iget-object v0, v0, Landroidx/fragment/app/e;->n:Ljava/util/ArrayList;

    .line 307
    .line 308
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    if-eqz v2, :cond_7

    .line 317
    .line 318
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    check-cast v2, Lq0/I;

    .line 323
    .line 324
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_7
    return-void

    .line 329
    :pswitch_1
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v0, Landroidx/fragment/app/b;

    .line 332
    .line 333
    iget-object v2, v0, Landroidx/fragment/app/b;->m0:Lq0/Q;

    .line 334
    .line 335
    iget-object v3, v0, Landroidx/fragment/app/b;->v:Landroid/os/Bundle;

    .line 336
    .line 337
    iget-object v2, v2, Lq0/Q;->w:LN1/t;

    .line 338
    .line 339
    invoke-virtual {v2, v3}, LN1/t;->f(Landroid/os/Bundle;)V

    .line 340
    .line 341
    .line 342
    iput-object v5, v0, Landroidx/fragment/app/b;->v:Landroid/os/Bundle;

    .line 343
    .line 344
    return-void

    .line 345
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 346
    .line 347
    const-string v2, "Service took too long to process intent: "

    .line 348
    .line 349
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    iget-object v2, v1, LB6/d;->t:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v2, Lo4/C;

    .line 355
    .line 356
    iget-object v3, v2, Lo4/C;->a:Landroid/content/Intent;

    .line 357
    .line 358
    invoke-virtual {v3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    const-string v3, " finishing."

    .line 366
    .line 367
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    const-string v3, "FirebaseMessaging"

    .line 375
    .line 376
    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 377
    .line 378
    .line 379
    iget-object v0, v2, Lo4/C;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 380
    .line 381
    invoke-virtual {v0, v5}, Lcom/google/android/gms/tasks/TaskCompletionSource;->d(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    return-void

    .line 385
    :pswitch_3
    invoke-direct {v1}, LB6/d;->b()V

    .line 386
    .line 387
    .line 388
    return-void

    .line 389
    :pswitch_4
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v0, Landroid/content/Intent;

    .line 392
    .line 393
    invoke-static {v0}, LIa/a;->a(Landroid/content/Intent;)V

    .line 394
    .line 395
    .line 396
    return-void

    .line 397
    :pswitch_5
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v0, Lo2/i;

    .line 400
    .line 401
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    new-instance v2, LE4/a;

    .line 405
    .line 406
    const/16 v3, 0x14

    .line 407
    .line 408
    invoke-direct {v2, v0, v3}, LE4/a;-><init>(Ljava/lang/Object;I)V

    .line 409
    .line 410
    .line 411
    iget-object v0, v0, Lo2/i;->d:Lq2/b;

    .line 412
    .line 413
    check-cast v0, Lp2/g;

    .line 414
    .line 415
    invoke-virtual {v0, v2}, Lp2/g;->i(Lq2/a;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    return-void

    .line 419
    :pswitch_6
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v0, LY1/c;

    .line 422
    .line 423
    iget-object v2, v0, LY1/c;->t:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v2, Ll3/c;

    .line 426
    .line 427
    if-eqz v2, :cond_8

    .line 428
    .line 429
    iget-object v3, v0, LY1/c;->u:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v3, Ll3/b;

    .line 432
    .line 433
    iget-object v0, v0, LY1/c;->v:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v0, Landroid/view/View;

    .line 436
    .line 437
    invoke-virtual {v2, v3, v0, v4}, Ll3/c;->b(Ll3/b;Landroid/view/View;Z)V

    .line 438
    .line 439
    .line 440
    :cond_8
    return-void

    .line 441
    :pswitch_7
    invoke-direct {v1}, LB6/d;->a()V

    .line 442
    .line 443
    .line 444
    return-void

    .line 445
    :pswitch_8
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v0, Lk5/c;

    .line 448
    .line 449
    invoke-static {v0}, Lk5/c;->a(Lk5/c;)V

    .line 450
    .line 451
    .line 452
    return-void

    .line 453
    :pswitch_9
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v0, Landroid/view/View;

    .line 456
    .line 457
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    const-class v3, Landroid/view/inputmethod/InputMethodManager;

    .line 462
    .line 463
    invoke-static {v2, v3}, LJ/b;->b(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 468
    .line 469
    invoke-virtual {v2, v0, v4}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 470
    .line 471
    .line 472
    return-void

    .line 473
    :pswitch_a
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast v0, Landroidx/work/CoroutineWorker;

    .line 476
    .line 477
    invoke-static {v0}, Landroidx/work/CoroutineWorker;->a(Landroidx/work/CoroutineWorker;)V

    .line 478
    .line 479
    .line 480
    return-void

    .line 481
    :pswitch_b
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v0, Ld/n;

    .line 484
    .line 485
    invoke-static {v0}, Ld/n;->b(Ld/n;)V

    .line 486
    .line 487
    .line 488
    return-void

    .line 489
    :pswitch_c
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v0, Ld/l;

    .line 492
    .line 493
    iget-object v2, v0, Ld/l;->t:Ljava/lang/Runnable;

    .line 494
    .line 495
    if-eqz v2, :cond_9

    .line 496
    .line 497
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 498
    .line 499
    .line 500
    iput-object v5, v0, Ld/l;->t:Ljava/lang/Runnable;

    .line 501
    .line 502
    :cond_9
    return-void

    .line 503
    :pswitch_d
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 504
    .line 505
    check-cast v0, Li/l;

    .line 506
    .line 507
    invoke-virtual {v0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    .line 508
    .line 509
    .line 510
    return-void

    .line 511
    :pswitch_e
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v0, Lcom/unity3d/ads/IUnityAdsInitializationListener;

    .line 514
    .line 515
    invoke-interface {v0}, Lcom/unity3d/ads/IUnityAdsInitializationListener;->onInitializationComplete()V

    .line 516
    .line 517
    .line 518
    return-void

    .line 519
    :pswitch_f
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast v0, Lcom/unity3d/services/banners/view/ScarBannerContainer;

    .line 522
    .line 523
    invoke-static {v0}, Lcom/unity3d/services/banners/view/ScarBannerContainer;->a(Lcom/unity3d/services/banners/view/ScarBannerContainer;)V

    .line 524
    .line 525
    .line 526
    return-void

    .line 527
    :pswitch_10
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast v0, Lcom/unity3d/services/banners/BannerView;

    .line 530
    .line 531
    invoke-static {v0}, Lcom/unity3d/services/banners/BannerView;->a(Lcom/unity3d/services/banners/BannerView;)V

    .line 532
    .line 533
    .line 534
    return-void

    .line 535
    :pswitch_11
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast v0, Lcom/unity3d/services/ads/operation/show/ShowOperationState;

    .line 538
    .line 539
    invoke-static {v0}, Lcom/unity3d/services/ads/operation/show/ShowOperationState;->a(Lcom/unity3d/services/ads/operation/show/ShowOperationState;)V

    .line 540
    .line 541
    .line 542
    return-void

    .line 543
    :pswitch_12
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast v0, Lcom/unity3d/services/ads/operation/load/LoadOperationState;

    .line 546
    .line 547
    invoke-static {v0}, Lcom/unity3d/services/ads/operation/load/LoadOperationState;->a(Lcom/unity3d/services/ads/operation/load/LoadOperationState;)V

    .line 548
    .line 549
    .line 550
    return-void

    .line 551
    :pswitch_13
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 552
    .line 553
    check-cast v0, Lcom/unity3d/services/ads/gmascar/managers/BiddingBaseManager;

    .line 554
    .line 555
    invoke-static {v0}, Lcom/unity3d/services/ads/gmascar/managers/BiddingBaseManager;->c(Lcom/unity3d/services/ads/gmascar/managers/BiddingBaseManager;)V

    .line 556
    .line 557
    .line 558
    return-void

    .line 559
    :pswitch_14
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 560
    .line 561
    check-cast v0, Lcom/onesignal/core/internal/purchases/impl/c;

    .line 562
    .line 563
    invoke-static {v0}, Lcom/onesignal/core/internal/purchases/impl/c;->a(Lcom/onesignal/core/internal/purchases/impl/c;)V

    .line 564
    .line 565
    .line 566
    return-void

    .line 567
    :pswitch_15
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 568
    .line 569
    check-cast v0, Lcom/onesignal/common/threading/b;

    .line 570
    .line 571
    invoke-static {v0}, Lcom/onesignal/core/internal/application/impl/a;->b(Lcom/onesignal/common/threading/b;)V

    .line 572
    .line 573
    .line 574
    return-void

    .line 575
    :pswitch_16
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast v0, Lcom/google/android/material/timepicker/e;

    .line 578
    .line 579
    invoke-virtual {v0}, Lcom/google/android/material/timepicker/e;->m()V

    .line 580
    .line 581
    .line 582
    return-void

    .line 583
    :pswitch_17
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast v0, Landroidx/lifecycle/F;

    .line 586
    .line 587
    const-string v2, "this$0"

    .line 588
    .line 589
    invoke-static {v0, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    iget v2, v0, Landroidx/lifecycle/F;->t:I

    .line 593
    .line 594
    iget-object v3, v0, Landroidx/lifecycle/F;->x:Landroidx/lifecycle/u;

    .line 595
    .line 596
    if-nez v2, :cond_a

    .line 597
    .line 598
    iput-boolean v4, v0, Landroidx/lifecycle/F;->u:Z

    .line 599
    .line 600
    sget-object v2, Landroidx/lifecycle/m;->ON_PAUSE:Landroidx/lifecycle/m;

    .line 601
    .line 602
    invoke-virtual {v3, v2}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 603
    .line 604
    .line 605
    :cond_a
    iget v2, v0, Landroidx/lifecycle/F;->s:I

    .line 606
    .line 607
    if-nez v2, :cond_b

    .line 608
    .line 609
    iget-boolean v2, v0, Landroidx/lifecycle/F;->u:Z

    .line 610
    .line 611
    if-eqz v2, :cond_b

    .line 612
    .line 613
    sget-object v2, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 614
    .line 615
    invoke-virtual {v3, v2}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 616
    .line 617
    .line 618
    iput-boolean v4, v0, Landroidx/lifecycle/F;->v:Z

    .line 619
    .line 620
    :cond_b
    return-void

    .line 621
    :pswitch_18
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 622
    .line 623
    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 624
    .line 625
    invoke-virtual {v0}, Landroidx/recyclerview/widget/w;->u0()V

    .line 626
    .line 627
    .line 628
    return-void

    .line 629
    :pswitch_19
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 630
    .line 631
    check-cast v0, Lcom/kcstream/cing/fragment/TabsDownloadsFragment;

    .line 632
    .line 633
    const-string v2, "this$0"

    .line 634
    .line 635
    invoke-static {v0, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    iget-object v2, v0, Lcom/kcstream/cing/fragment/TabsDownloadsFragment;->v0:Ljava/util/ArrayList;

    .line 639
    .line 640
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 641
    .line 642
    .line 643
    iget-object v2, v0, Lcom/kcstream/cing/fragment/TabsDownloadsFragment;->x0:Ljava/io/File;

    .line 644
    .line 645
    if-eqz v2, :cond_11

    .line 646
    .line 647
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    if-eqz v2, :cond_f

    .line 652
    .line 653
    new-instance v5, Ljava/util/ArrayList;

    .line 654
    .line 655
    array-length v6, v2

    .line 656
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 657
    .line 658
    .line 659
    array-length v6, v2

    .line 660
    const/4 v3, 0x0

    .line 661
    :goto_5
    if-ge v3, v6, :cond_c

    .line 662
    .line 663
    aget-object v7, v2, v3

    .line 664
    .line 665
    new-instance v8, LJ4/e;

    .line 666
    .line 667
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v13

    .line 671
    const-string v9, "getName(...)"

    .line 672
    .line 673
    invoke-static {v13, v9}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v7}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v14

    .line 680
    const-string v9, "getPath(...)"

    .line 681
    .line 682
    invoke-static {v14, v9}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v7}, Ljava/io/File;->lastModified()J

    .line 686
    .line 687
    .line 688
    move-result-wide v9

    .line 689
    invoke-virtual {v7}, Ljava/io/File;->length()J

    .line 690
    .line 691
    .line 692
    move-result-wide v11

    .line 693
    invoke-direct/range {v8 .. v14}, LJ4/e;-><init>(JJLjava/lang/String;Ljava/lang/String;)V

    .line 694
    .line 695
    .line 696
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 697
    .line 698
    .line 699
    add-int/2addr v3, v4

    .line 700
    goto :goto_5

    .line 701
    :cond_c
    new-instance v2, Ljava/util/ArrayList;

    .line 702
    .line 703
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 707
    .line 708
    .line 709
    move-result-object v3

    .line 710
    :cond_d
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 711
    .line 712
    .line 713
    move-result v4

    .line 714
    if-eqz v4, :cond_e

    .line 715
    .line 716
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v4

    .line 720
    move-object v5, v4

    .line 721
    check-cast v5, LJ4/e;

    .line 722
    .line 723
    iget-object v5, v5, LJ4/e;->a:Ljava/lang/String;

    .line 724
    .line 725
    const-string v6, ".mp4"

    .line 726
    .line 727
    invoke-static {v5, v6}, LL9/n;->B(Ljava/lang/String;Ljava/lang/String;)Z

    .line 728
    .line 729
    .line 730
    move-result v5

    .line 731
    if-eqz v5, :cond_d

    .line 732
    .line 733
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 734
    .line 735
    .line 736
    goto :goto_6

    .line 737
    :cond_e
    iget-object v3, v0, Lcom/kcstream/cing/fragment/TabsDownloadsFragment;->u0:LCa/c;

    .line 738
    .line 739
    if-eqz v3, :cond_f

    .line 740
    .line 741
    invoke-virtual {v3, v2}, LCa/c;->m(Ljava/util/List;)V

    .line 742
    .line 743
    .line 744
    :cond_f
    iget-object v0, v0, Lcom/kcstream/cing/fragment/TabsDownloadsFragment;->u0:LCa/c;

    .line 745
    .line 746
    if-eqz v0, :cond_10

    .line 747
    .line 748
    invoke-virtual {v0}, LCa/c;->q()V

    .line 749
    .line 750
    .line 751
    :cond_10
    return-void

    .line 752
    :cond_11
    const-string v0, "path"

    .line 753
    .line 754
    invoke-static {v0}, Lv8/i;->n(Ljava/lang/String;)V

    .line 755
    .line 756
    .line 757
    throw v5

    .line 758
    :pswitch_1a
    iget-object v6, v1, LB6/d;->t:Ljava/lang/Object;

    .line 759
    .line 760
    check-cast v6, Landroid/app/Activity;

    .line 761
    .line 762
    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    .line 763
    .line 764
    .line 765
    move-result v7

    .line 766
    if-nez v7, :cond_1c

    .line 767
    .line 768
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 769
    .line 770
    const/16 v8, 0x1c

    .line 771
    .line 772
    if-lt v7, v8, :cond_12

    .line 773
    .line 774
    sget-object v0, LI/g;->a:Ljava/lang/Class;

    .line 775
    .line 776
    invoke-virtual {v6}, Landroid/app/Activity;->recreate()V

    .line 777
    .line 778
    .line 779
    goto/16 :goto_e

    .line 780
    .line 781
    :cond_12
    sget-object v8, LI/g;->a:Ljava/lang/Class;

    .line 782
    .line 783
    const/16 v8, 0x1b

    .line 784
    .line 785
    const/16 v9, 0x1a

    .line 786
    .line 787
    if-eq v7, v9, :cond_14

    .line 788
    .line 789
    if-ne v7, v8, :cond_13

    .line 790
    .line 791
    goto :goto_7

    .line 792
    :cond_13
    const/4 v10, 0x0

    .line 793
    goto :goto_8

    .line 794
    :cond_14
    :goto_7
    move v10, v4

    .line 795
    :goto_8
    sget-object v11, LI/g;->f:Ljava/lang/reflect/Method;

    .line 796
    .line 797
    if-eqz v10, :cond_15

    .line 798
    .line 799
    if-nez v11, :cond_15

    .line 800
    .line 801
    goto/16 :goto_d

    .line 802
    .line 803
    :cond_15
    sget-object v10, LI/g;->e:Ljava/lang/reflect/Method;

    .line 804
    .line 805
    if-nez v10, :cond_16

    .line 806
    .line 807
    sget-object v10, LI/g;->d:Ljava/lang/reflect/Method;

    .line 808
    .line 809
    if-nez v10, :cond_16

    .line 810
    .line 811
    goto/16 :goto_d

    .line 812
    .line 813
    :cond_16
    :try_start_2
    sget-object v10, LI/g;->c:Ljava/lang/reflect/Field;

    .line 814
    .line 815
    invoke-virtual {v10, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v10

    .line 819
    if-nez v10, :cond_17

    .line 820
    .line 821
    goto :goto_d

    .line 822
    :cond_17
    sget-object v12, LI/g;->b:Ljava/lang/reflect/Field;

    .line 823
    .line 824
    invoke-virtual {v12, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v12

    .line 828
    if-nez v12, :cond_18

    .line 829
    .line 830
    goto :goto_d

    .line 831
    :cond_18
    invoke-virtual {v6}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 832
    .line 833
    .line 834
    move-result-object v13

    .line 835
    new-instance v14, LI/f;

    .line 836
    .line 837
    invoke-direct {v14, v6}, LI/f;-><init>(Landroid/app/Activity;)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v13, v14}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 841
    .line 842
    .line 843
    sget-object v15, LI/g;->g:Landroid/os/Handler;

    .line 844
    .line 845
    const/16 v16, 0x0

    .line 846
    .line 847
    :try_start_3
    new-instance v3, LC3/c;

    .line 848
    .line 849
    invoke-direct {v3, v14, v0, v10}, LC3/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 850
    .line 851
    .line 852
    invoke-virtual {v15, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 853
    .line 854
    .line 855
    if-eq v7, v9, :cond_1a

    .line 856
    .line 857
    if-ne v7, v8, :cond_19

    .line 858
    .line 859
    goto :goto_9

    .line 860
    :cond_19
    move/from16 v3, v16

    .line 861
    .line 862
    goto :goto_a

    .line 863
    :cond_1a
    :goto_9
    move v3, v4

    .line 864
    :goto_a
    if-eqz v3, :cond_1b

    .line 865
    .line 866
    :try_start_4
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 867
    .line 868
    .line 869
    move-result-object v3

    .line 870
    const/16 v7, 0x9

    .line 871
    .line 872
    new-array v7, v7, [Ljava/lang/Object;

    .line 873
    .line 874
    aput-object v10, v7, v16

    .line 875
    .line 876
    aput-object v5, v7, v4

    .line 877
    .line 878
    const/4 v4, 0x2

    .line 879
    aput-object v5, v7, v4

    .line 880
    .line 881
    const/4 v4, 0x3

    .line 882
    aput-object v3, v7, v4

    .line 883
    .line 884
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 885
    .line 886
    const/4 v4, 0x4

    .line 887
    aput-object v3, v7, v4

    .line 888
    .line 889
    aput-object v5, v7, v0

    .line 890
    .line 891
    aput-object v5, v7, v2

    .line 892
    .line 893
    const/4 v0, 0x7

    .line 894
    aput-object v3, v7, v0

    .line 895
    .line 896
    const/16 v0, 0x8

    .line 897
    .line 898
    aput-object v3, v7, v0

    .line 899
    .line 900
    invoke-virtual {v11, v12, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    goto :goto_b

    .line 904
    :catchall_2
    move-exception v0

    .line 905
    goto :goto_c

    .line 906
    :cond_1b
    invoke-virtual {v6}, Landroid/app/Activity;->recreate()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 907
    .line 908
    .line 909
    :goto_b
    :try_start_5
    new-instance v0, LC3/c;

    .line 910
    .line 911
    invoke-direct {v0, v13, v2, v14}, LC3/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 912
    .line 913
    .line 914
    invoke-virtual {v15, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 915
    .line 916
    .line 917
    goto :goto_e

    .line 918
    :goto_c
    new-instance v3, LC3/c;

    .line 919
    .line 920
    invoke-direct {v3, v13, v2, v14}, LC3/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 921
    .line 922
    .line 923
    invoke-virtual {v15, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 924
    .line 925
    .line 926
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 927
    :catchall_3
    :goto_d
    invoke-virtual {v6}, Landroid/app/Activity;->recreate()V

    .line 928
    .line 929
    .line 930
    :cond_1c
    :goto_e
    return-void

    .line 931
    :pswitch_1b
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 932
    .line 933
    check-cast v0, Lcom/unity3d/ads/IUnityAdsTokenListener;

    .line 934
    .line 935
    invoke-static {v0}, Lcom/unity3d/services/ads/UnityAdsImplementation;->a(Lcom/unity3d/ads/IUnityAdsTokenListener;)V

    .line 936
    .line 937
    .line 938
    return-void

    .line 939
    :pswitch_1c
    iget-object v0, v1, LB6/d;->t:Ljava/lang/Object;

    .line 940
    .line 941
    check-cast v0, Lv8/k;

    .line 942
    .line 943
    invoke-interface {v0}, Lu8/a;->invoke()Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    return-void

    .line 947
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
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
