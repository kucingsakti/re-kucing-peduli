.class public Lcom/google/firebase/FirebaseCommonRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    const/16 v1, 0x5f

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x2f

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
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


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    new-instance v3, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    const-class v4, Lq4/b;

    .line 10
    .line 11
    invoke-static {v4}, LI3/b;->b(Ljava/lang/Class;)LI3/a;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    new-instance v6, LI3/j;

    .line 16
    .line 17
    const-class v7, Lq4/a;

    .line 18
    .line 19
    invoke-direct {v6, v1, v2, v7}, LI3/j;-><init>(IILjava/lang/Class;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5, v6}, LI3/a;->a(LI3/j;)V

    .line 23
    .line 24
    .line 25
    new-instance v6, LY9/a;

    .line 26
    .line 27
    const/16 v7, 0xa

    .line 28
    .line 29
    invoke-direct {v6, v7}, LY9/a;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object v6, v5, LI3/a;->f:LI3/e;

    .line 33
    .line 34
    invoke-virtual {v5}, LI3/a;->b()LI3/b;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    new-instance v5, LI3/p;

    .line 42
    .line 43
    const-class v6, LH3/a;

    .line 44
    .line 45
    const-class v7, Ljava/util/concurrent/Executor;

    .line 46
    .line 47
    invoke-direct {v5, v6, v7}, LI3/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 48
    .line 49
    .line 50
    new-array v6, v1, [Ljava/lang/Class;

    .line 51
    .line 52
    const-class v7, Lf4/f;

    .line 53
    .line 54
    aput-object v7, v6, v2

    .line 55
    .line 56
    const-class v7, Lf4/g;

    .line 57
    .line 58
    aput-object v7, v6, v0

    .line 59
    .line 60
    new-instance v7, LI3/a;

    .line 61
    .line 62
    const-class v8, Lf4/d;

    .line 63
    .line 64
    invoke-direct {v7, v8, v6}, LI3/a;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    .line 65
    .line 66
    .line 67
    const-class v6, Landroid/content/Context;

    .line 68
    .line 69
    invoke-static {v6}, LI3/j;->b(Ljava/lang/Class;)LI3/j;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-virtual {v7, v6}, LI3/a;->a(LI3/j;)V

    .line 74
    .line 75
    .line 76
    const-class v6, LD3/g;

    .line 77
    .line 78
    invoke-static {v6}, LI3/j;->b(Ljava/lang/Class;)LI3/j;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-virtual {v7, v6}, LI3/a;->a(LI3/j;)V

    .line 83
    .line 84
    .line 85
    new-instance v6, LI3/j;

    .line 86
    .line 87
    const-class v8, Lf4/e;

    .line 88
    .line 89
    invoke-direct {v6, v1, v2, v8}, LI3/j;-><init>(IILjava/lang/Class;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v7, v6}, LI3/a;->a(LI3/j;)V

    .line 93
    .line 94
    .line 95
    new-instance v6, LI3/j;

    .line 96
    .line 97
    invoke-direct {v6, v0, v0, v4}, LI3/j;-><init>(IILjava/lang/Class;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7, v6}, LI3/a;->a(LI3/j;)V

    .line 101
    .line 102
    .line 103
    new-instance v4, LI3/j;

    .line 104
    .line 105
    invoke-direct {v4, v5, v0, v2}, LI3/j;-><init>(LI3/p;II)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v7, v4}, LI3/a;->a(LI3/j;)V

    .line 109
    .line 110
    .line 111
    new-instance v4, Lf4/b;

    .line 112
    .line 113
    invoke-direct {v4, v5, v2}, Lf4/b;-><init>(LI3/p;I)V

    .line 114
    .line 115
    .line 116
    iput-object v4, v7, LI3/a;->f:LI3/e;

    .line 117
    .line 118
    invoke-virtual {v7}, LI3/a;->b()LI3/b;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 126
    .line 127
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    const-string v5, "fire-android"

    .line 132
    .line 133
    invoke-static {v5, v4}, Lxa/d;->g(Ljava/lang/String;Ljava/lang/String;)LI3/b;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    const-string v4, "fire-core"

    .line 141
    .line 142
    const-string v5, "21.0.0"

    .line 143
    .line 144
    invoke-static {v4, v5}, Lxa/d;->g(Ljava/lang/String;Ljava/lang/String;)LI3/b;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    sget-object v4, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v4}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    const-string v5, "device-name"

    .line 158
    .line 159
    invoke-static {v5, v4}, Lxa/d;->g(Ljava/lang/String;Ljava/lang/String;)LI3/b;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    sget-object v4, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 167
    .line 168
    invoke-static {v4}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    const-string v5, "device-model"

    .line 173
    .line 174
    invoke-static {v5, v4}, Lxa/d;->g(Ljava/lang/String;Ljava/lang/String;)LI3/b;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 182
    .line 183
    invoke-static {v4}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    const-string v5, "device-brand"

    .line 188
    .line 189
    invoke-static {v5, v4}, Lxa/d;->g(Ljava/lang/String;Ljava/lang/String;)LI3/b;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    new-instance v4, LD3/i;

    .line 197
    .line 198
    invoke-direct {v4, v2}, LD3/i;-><init>(I)V

    .line 199
    .line 200
    .line 201
    const-string v2, "android-target-sdk"

    .line 202
    .line 203
    invoke-static {v2, v4}, Lxa/d;->j(Ljava/lang/String;LD3/i;)LI3/b;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    new-instance v2, LD3/i;

    .line 211
    .line 212
    invoke-direct {v2, v0}, LD3/i;-><init>(I)V

    .line 213
    .line 214
    .line 215
    const-string v0, "android-min-sdk"

    .line 216
    .line 217
    invoke-static {v0, v2}, Lxa/d;->j(Ljava/lang/String;LD3/i;)LI3/b;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    new-instance v0, LD3/i;

    .line 225
    .line 226
    invoke-direct {v0, v1}, LD3/i;-><init>(I)V

    .line 227
    .line 228
    .line 229
    const-string v1, "android-platform"

    .line 230
    .line 231
    invoke-static {v1, v0}, Lxa/d;->j(Ljava/lang/String;LD3/i;)LI3/b;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    new-instance v0, LD3/i;

    .line 239
    .line 240
    const/4 v1, 0x3

    .line 241
    invoke-direct {v0, v1}, LD3/i;-><init>(I)V

    .line 242
    .line 243
    .line 244
    const-string v1, "android-installer"

    .line 245
    .line 246
    invoke-static {v1, v0}, Lxa/d;->j(Ljava/lang/String;LD3/i;)LI3/b;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    :try_start_0
    sget-object v0, Lh8/c;->w:Lh8/c;

    .line 254
    .line 255
    invoke-virtual {v0}, Lh8/c;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 259
    goto :goto_0

    .line 260
    :catch_0
    const/4 v0, 0x0

    .line 261
    :goto_0
    if-eqz v0, :cond_0

    .line 262
    .line 263
    const-string v1, "kotlin"

    .line 264
    .line 265
    invoke-static {v1, v0}, Lxa/d;->g(Ljava/lang/String;Ljava/lang/String;)LI3/b;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    :cond_0
    return-object v3
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
