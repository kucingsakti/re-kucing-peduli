.class public final LB6/h;
.super Landroidx/fragment/app/b;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "LB6/h;",
        "Landroidx/fragment/app/b;",
        "<init>",
        "()V",
        "permissionx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final A0:Lq0/p;

.field public final B0:Lq0/p;

.field public final C0:Lq0/p;

.field public final D0:Lq0/p;

.field public final t0:Landroid/os/Handler;

.field public u0:LB6/i;

.field public v0:LB6/b;

.field public final w0:Lq0/p;

.field public final x0:Lq0/p;

.field public final y0:Lq0/p;

.field public final z0:Lq0/p;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, LB6/h;->t0:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, Lg/a;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Lg/a;-><init>(I)V

    .line 19
    .line 20
    .line 21
    new-instance v1, LB6/c;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, p0, v2}, LB6/c;-><init>(LB6/h;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/b;->U(Lf/a;Lga/l;)Lq0/p;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, LB6/h;->w0:Lq0/p;

    .line 32
    .line 33
    new-instance v0, Lg/a;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {v0, v1}, Lg/a;-><init>(I)V

    .line 37
    .line 38
    .line 39
    new-instance v1, LB6/c;

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    invoke-direct {v1, p0, v2}, LB6/c;-><init>(LB6/h;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/b;->U(Lf/a;Lga/l;)Lq0/p;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, LB6/h;->x0:Lq0/p;

    .line 50
    .line 51
    new-instance v0, Lg/a;

    .line 52
    .line 53
    const/4 v1, 0x2

    .line 54
    invoke-direct {v0, v1}, Lg/a;-><init>(I)V

    .line 55
    .line 56
    .line 57
    new-instance v1, LB6/c;

    .line 58
    .line 59
    const/4 v2, 0x2

    .line 60
    invoke-direct {v1, p0, v2}, LB6/c;-><init>(LB6/h;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/b;->U(Lf/a;Lga/l;)Lq0/p;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, LB6/h;->y0:Lq0/p;

    .line 68
    .line 69
    new-instance v0, Lg/a;

    .line 70
    .line 71
    const/4 v1, 0x2

    .line 72
    invoke-direct {v0, v1}, Lg/a;-><init>(I)V

    .line 73
    .line 74
    .line 75
    new-instance v1, LB6/c;

    .line 76
    .line 77
    const/4 v2, 0x3

    .line 78
    invoke-direct {v1, p0, v2}, LB6/c;-><init>(LB6/h;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/b;->U(Lf/a;Lga/l;)Lq0/p;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, LB6/h;->z0:Lq0/p;

    .line 86
    .line 87
    new-instance v0, Lg/a;

    .line 88
    .line 89
    const/4 v1, 0x2

    .line 90
    invoke-direct {v0, v1}, Lg/a;-><init>(I)V

    .line 91
    .line 92
    .line 93
    new-instance v1, LB6/c;

    .line 94
    .line 95
    const/4 v2, 0x4

    .line 96
    invoke-direct {v1, p0, v2}, LB6/c;-><init>(LB6/h;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/b;->U(Lf/a;Lga/l;)Lq0/p;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iput-object v0, p0, LB6/h;->A0:Lq0/p;

    .line 104
    .line 105
    new-instance v0, Lg/a;

    .line 106
    .line 107
    const/4 v1, 0x2

    .line 108
    invoke-direct {v0, v1}, Lg/a;-><init>(I)V

    .line 109
    .line 110
    .line 111
    new-instance v1, LB6/c;

    .line 112
    .line 113
    const/4 v2, 0x5

    .line 114
    invoke-direct {v1, p0, v2}, LB6/c;-><init>(LB6/h;I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/b;->U(Lf/a;Lga/l;)Lq0/p;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iput-object v0, p0, LB6/h;->B0:Lq0/p;

    .line 122
    .line 123
    new-instance v0, Lg/a;

    .line 124
    .line 125
    const/4 v1, 0x2

    .line 126
    invoke-direct {v0, v1}, Lg/a;-><init>(I)V

    .line 127
    .line 128
    .line 129
    new-instance v1, LB6/c;

    .line 130
    .line 131
    const/4 v2, 0x6

    .line 132
    invoke-direct {v1, p0, v2}, LB6/c;-><init>(LB6/h;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/b;->U(Lf/a;Lga/l;)Lq0/p;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iput-object v0, p0, LB6/h;->C0:Lq0/p;

    .line 140
    .line 141
    new-instance v0, Lg/a;

    .line 142
    .line 143
    const/4 v1, 0x1

    .line 144
    invoke-direct {v0, v1}, Lg/a;-><init>(I)V

    .line 145
    .line 146
    .line 147
    new-instance v1, LB6/c;

    .line 148
    .line 149
    const/4 v2, 0x7

    .line 150
    invoke-direct {v1, p0, v2}, LB6/c;-><init>(LB6/h;I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/b;->U(Lf/a;Lga/l;)Lq0/p;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    iput-object v0, p0, LB6/h;->D0:Lq0/p;

    .line 158
    .line 159
    new-instance v0, Lg/a;

    .line 160
    .line 161
    const/4 v1, 0x2

    .line 162
    invoke-direct {v0, v1}, Lg/a;-><init>(I)V

    .line 163
    .line 164
    .line 165
    new-instance v1, LB6/c;

    .line 166
    .line 167
    const/16 v2, 0x8

    .line 168
    .line 169
    invoke-direct {v1, p0, v2}, LB6/c;-><init>(LB6/h;I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/b;->U(Lf/a;Lga/l;)Lq0/p;

    .line 173
    .line 174
    .line 175
    return-void
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


# virtual methods
.method public final F()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/b;->a0:Z

    .line 3
    .line 4
    invoke-virtual {p0}, LB6/h;->g0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, LB6/h;->u0:LB6/i;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string v0, "pb"

    .line 16
    .line 17
    invoke-static {v0}, Lv8/i;->n(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    throw v0

    .line 22
    :cond_1
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final g0()Z
    .locals 2

    .line 1
    iget-object v0, p0, LB6/h;->u0:LB6/i;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LB6/h;->v0:LB6/b;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const-string v0, "PermissionX"

    .line 13
    .line 14
    const-string v1, "PermissionBuilder and ChainTask should not be null at this time, so we can do nothing in this case."

    .line 15
    .line 16
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final h0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LB6/h;->g0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/b;->X()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, LB6/h;->v0:LB6/b;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, LB6/b;->f()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string v0, "task"

    .line 27
    .line 28
    invoke-static {v0}, Lv8/i;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :cond_1
    iget-object v0, p0, LB6/h;->u0:LB6/i;

    .line 33
    .line 34
    const-string v2, "pb"

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static {v2}, Lv8/i;->n(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v1

    .line 45
    :cond_3
    invoke-static {v2}, Lv8/i;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v1

    .line 49
    :cond_4
    :goto_0
    return-void
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

.method public final i0(Lu8/a;)V
    .locals 1

    .line 1
    new-instance v0, LB6/d;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LB6/d;-><init>(Lu8/a;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LB6/h;->t0:Landroid/os/Handler;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
