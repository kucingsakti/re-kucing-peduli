.class public abstract LI8/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LO8/D;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, LO8/D;

    .line 2
    .line 3
    new-instance v1, LK8/k;

    .line 4
    .line 5
    sget-object v2, LC9/i;->a:LC9/i;

    .line 6
    .line 7
    sget-object v2, LC9/i;->b:LC9/c;

    .line 8
    .line 9
    sget-object v3, LI8/o;->e:Lj9/c;

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    invoke-direct {v1, v2, v3, v4}, LK8/k;-><init>(LL8/y;Lj9/c;I)V

    .line 13
    .line 14
    .line 15
    sget-object v2, LI8/o;->f:Lj9/c;

    .line 16
    .line 17
    invoke-virtual {v2}, Lj9/c;->f()Lj9/f;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v3, Lz9/l;->e:Lz9/b;

    .line 22
    .line 23
    invoke-direct {v0, v1, v2, v3}, LO8/D;-><init>(LK8/k;Lj9/f;Lz9/b;)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    iput v1, v0, LO8/D;->z:I

    .line 28
    .line 29
    sget-object v1, LL8/o;->e:LL8/n;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    iput-object v1, v0, LO8/D;->A:LL8/n;

    .line 35
    .line 36
    const-string v1, "T"

    .line 37
    .line 38
    invoke-static {v1}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x2

    .line 44
    invoke-static {v0, v5, v1, v4, v3}, LO8/S;->c1(LO8/b;ILj9/f;ILz9/l;)LO8/S;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v3, v0, LO8/D;->C:Ljava/util/ArrayList;

    .line 53
    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    new-instance v3, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 59
    .line 60
    .line 61
    iput-object v3, v0, LO8/D;->C:Ljava/util/ArrayList;

    .line 62
    .line 63
    new-instance v1, LA9/k;

    .line 64
    .line 65
    iget-object v4, v0, LO8/D;->D:Ljava/util/ArrayList;

    .line 66
    .line 67
    iget-object v5, v0, LO8/D;->E:Lz9/b;

    .line 68
    .line 69
    invoke-direct {v1, v0, v3, v4, v5}, LA9/k;-><init>(LO8/B;Ljava/util/List;Ljava/util/Collection;Lz9/l;)V

    .line 70
    .line 71
    .line 72
    iput-object v1, v0, LO8/D;->B:LA9/k;

    .line 73
    .line 74
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 75
    .line 76
    if-eqz v1, :cond_1

    .line 77
    .line 78
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_0

    .line 87
    .line 88
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, LL8/t;

    .line 93
    .line 94
    check-cast v2, LO8/k;

    .line 95
    .line 96
    invoke-virtual {v0}, LO8/b;->p()LA9/D;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    iput-object v3, v2, LO8/w;->y:LA9/y;

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    sput-object v0, LI8/p;->a:LO8/D;

    .line 104
    .line 105
    return-void

    .line 106
    :cond_1
    const/16 v0, 0xd

    .line 107
    .line 108
    invoke-static {v0}, LO8/D;->d(I)V

    .line 109
    .line 110
    .line 111
    throw v2

    .line 112
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 113
    .line 114
    new-instance v2, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    const-string v3, "Type parameters are already set for "

    .line 117
    .line 118
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, LO8/b;->getName()Lj9/f;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v1

    .line 136
    :cond_3
    const/16 v0, 0x9

    .line 137
    .line 138
    invoke-static {v0}, LO8/D;->d(I)V

    .line 139
    .line 140
    .line 141
    throw v2
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
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
