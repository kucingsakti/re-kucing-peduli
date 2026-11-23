.class public final LE1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE1/s;
.implements LU1/g;
.implements Ll0/f;


# instance fields
.field public final synthetic s:I

.field public t:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput v0, p0, LE1/l;->s:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LE1/l;->s:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LE1/l;->t:Landroid/content/Context;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 2
    iput p2, p0, LE1/l;->s:I

    iput-object p1, p0, LE1/l;->t:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/ContextWrapper;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, LE1/l;->s:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LE1/l;->t:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public D(LE1/x;)LE1/r;
    .locals 2

    .line 1
    iget p1, p0, LE1/l;->s:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, LE1/n;

    .line 7
    .line 8
    iget-object v0, p0, LE1/l;->t:Landroid/content/Context;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {p1, v0, v1}, LE1/n;-><init>(Landroid/content/Context;I)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, LE1/n;

    .line 16
    .line 17
    iget-object v0, p0, LE1/l;->t:Landroid/content/Context;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, v0, v1}, LE1/n;-><init>(Landroid/content/Context;I)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public a(LC8/E;)V
    .locals 8

    .line 1
    new-instance v7, LN9/t0;

    .line 2
    .line 3
    const-string v0, "EmojiCompatInitializer"

    .line 4
    .line 5
    invoke-direct {v7, v0}, LN9/t0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 9
    .line 10
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    new-instance v6, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 13
    .line 14
    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 15
    .line 16
    .line 17
    const-wide/16 v3, 0xf

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 26
    .line 27
    .line 28
    new-instance v1, LO3/z;

    .line 29
    .line 30
    const/4 v2, 0x7

    .line 31
    invoke-direct {v1, p0, p1, v0, v2}, LO3/z;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

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

.method public b()Li2/j;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LE1/l;->t:Landroid/content/Context;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    new-instance v2, Li2/j;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    sget-object v3, Li2/m;->a:Lza/c;

    .line 13
    .line 14
    invoke-static {v3}, Lk2/a;->a(Lk2/b;)Ljavax/inject/Provider;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    iput-object v3, v2, Li2/j;->s:Ljavax/inject/Provider;

    .line 19
    .line 20
    new-instance v3, LV/h;

    .line 21
    .line 22
    const/16 v4, 0x1d

    .line 23
    .line 24
    invoke-direct {v3, v1, v4}, LV/h;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    iput-object v3, v2, Li2/j;->t:LV/h;

    .line 28
    .line 29
    new-instance v1, Lj2/e;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-direct {v1, v3, v4}, Lj2/e;-><init>(LV/h;I)V

    .line 33
    .line 34
    .line 35
    new-instance v4, Lo1/c;

    .line 36
    .line 37
    const/16 v5, 0xf

    .line 38
    .line 39
    invoke-direct {v4, v3, v5, v1}, Lo1/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v4}, Lk2/a;->a(Lk2/b;)Ljavax/inject/Provider;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iput-object v1, v2, Li2/j;->u:Ljavax/inject/Provider;

    .line 47
    .line 48
    iget-object v1, v2, Li2/j;->t:LV/h;

    .line 49
    .line 50
    new-instance v3, Lj2/e;

    .line 51
    .line 52
    const/4 v4, 0x1

    .line 53
    invoke-direct {v3, v1, v4}, Lj2/e;-><init>(LV/h;I)V

    .line 54
    .line 55
    .line 56
    iput-object v3, v2, Li2/j;->v:Lj2/e;

    .line 57
    .line 58
    new-instance v3, Lk7/e;

    .line 59
    .line 60
    invoke-direct {v3, v1}, Lk7/e;-><init>(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v3}, Lk2/a;->a(Lk2/b;)Ljavax/inject/Provider;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput-object v1, v2, Li2/j;->w:Ljavax/inject/Provider;

    .line 68
    .line 69
    iget-object v3, v2, Li2/j;->v:Lj2/e;

    .line 70
    .line 71
    new-instance v4, Lcom/google/android/gms/internal/measurement/S;

    .line 72
    .line 73
    const/16 v5, 0x11

    .line 74
    .line 75
    const/4 v6, 0x0

    .line 76
    invoke-direct {v4, v3, v1, v5, v6}, Lcom/google/android/gms/internal/measurement/S;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 77
    .line 78
    .line 79
    invoke-static {v4}, Lk2/a;->a(Lk2/b;)Ljavax/inject/Provider;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    iput-object v10, v2, Li2/j;->x:Ljavax/inject/Provider;

    .line 84
    .line 85
    new-instance v1, Lf4/e;

    .line 86
    .line 87
    const/16 v3, 0x19

    .line 88
    .line 89
    invoke-direct {v1, v3}, Lf4/e;-><init>(I)V

    .line 90
    .line 91
    .line 92
    iget-object v3, v2, Li2/j;->t:LV/h;

    .line 93
    .line 94
    new-instance v11, LY1/c;

    .line 95
    .line 96
    const/16 v4, 0x12

    .line 97
    .line 98
    invoke-direct {v11, v3, v10, v1, v4}, LY1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 99
    .line 100
    .line 101
    iget-object v8, v2, Li2/j;->s:Ljavax/inject/Provider;

    .line 102
    .line 103
    iget-object v9, v2, Li2/j;->u:Ljavax/inject/Provider;

    .line 104
    .line 105
    new-instance v7, LFa/e;

    .line 106
    .line 107
    const/16 v13, 0xe

    .line 108
    .line 109
    move-object v12, v10

    .line 110
    move-object/from16 v16, v11

    .line 111
    .line 112
    move-object v11, v10

    .line 113
    move-object/from16 v10, v16

    .line 114
    .line 115
    invoke-direct/range {v7 .. v13}, LFa/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    move-object v1, v11

    .line 119
    move-object v11, v10

    .line 120
    move-object v10, v1

    .line 121
    move-object v1, v7

    .line 122
    new-instance v7, Lp/b1;

    .line 123
    .line 124
    const/4 v15, 0x3

    .line 125
    move-object v13, v10

    .line 126
    move-object v14, v10

    .line 127
    move-object v12, v8

    .line 128
    move-object v8, v3

    .line 129
    invoke-direct/range {v7 .. v15}, Lp/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 130
    .line 131
    .line 132
    move-object v8, v12

    .line 133
    new-instance v3, Lo1/m;

    .line 134
    .line 135
    invoke-direct {v3, v8, v10, v11, v10}, Lo1/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    new-instance v4, LY1/c;

    .line 139
    .line 140
    const/16 v5, 0xc

    .line 141
    .line 142
    invoke-direct {v4, v1, v7, v3, v5}, LY1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 143
    .line 144
    .line 145
    invoke-static {v4}, Lk2/a;->a(Lk2/b;)Ljavax/inject/Provider;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iput-object v1, v2, Li2/j;->y:Ljavax/inject/Provider;

    .line 150
    .line 151
    return-object v2

    .line 152
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 153
    .line 154
    new-instance v2, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const-class v3, Landroid/content/Context;

    .line 160
    .line 161
    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v3, " must be set"

    .line 169
    .line 170
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw v1
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

.method public c()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE1/l;->t:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, LN/b;->c(Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, LN/b;->d(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE1/l;->t:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, LN/b;->c(Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, LN/b;->e(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LE1/l;->t:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "connectivity"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 10
    .line 11
    return-object v0
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
