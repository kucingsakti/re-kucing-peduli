.class public final Lw9/o;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Lw9/q;

.field public final synthetic u:Le9/G;

.field public final synthetic v:Ly9/o;


# direct methods
.method public synthetic constructor <init>(Lw9/q;Le9/G;Ly9/o;I)V
    .locals 0

    .line 1
    iput p4, p0, Lw9/o;->s:I

    iput-object p1, p0, Lw9/o;->t:Lw9/q;

    iput-object p2, p0, Lw9/o;->u:Le9/G;

    iput-object p3, p0, Lw9/o;->v:Ly9/o;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lw9/o;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw9/o;->t:Lw9/q;

    .line 7
    .line 8
    iget-object v1, v0, Lw9/q;->a:LV3/b;

    .line 9
    .line 10
    iget-object v1, v1, LV3/b;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LI4/c;

    .line 13
    .line 14
    iget-object v1, v1, LI4/c;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lz9/l;

    .line 17
    .line 18
    new-instance v2, Lw9/o;

    .line 19
    .line 20
    iget-object v3, p0, Lw9/o;->v:Ly9/o;

    .line 21
    .line 22
    iget-object v4, p0, Lw9/o;->u:Le9/G;

    .line 23
    .line 24
    const/4 v5, 0x2

    .line 25
    invoke-direct {v2, v0, v4, v3, v5}, Lw9/o;-><init>(Lw9/q;Le9/G;Ly9/o;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v0, Lz9/h;

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, Lz9/h;-><init>(Lz9/l;Lu8/a;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_0
    iget-object v0, p0, Lw9/o;->t:Lw9/q;

    .line 38
    .line 39
    iget-object v1, v0, Lw9/q;->a:LV3/b;

    .line 40
    .line 41
    iget-object v1, v1, LV3/b;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, LL8/j;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lw9/q;->a(LL8/j;)LK0/q;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, Lw9/q;->a:LV3/b;

    .line 53
    .line 54
    iget-object v0, v0, LV3/b;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, LI4/c;

    .line 57
    .line 58
    iget-object v0, v0, LI4/c;->e:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lw9/a;

    .line 61
    .line 62
    iget-object v2, p0, Lw9/o;->v:Ly9/o;

    .line 63
    .line 64
    invoke-virtual {v2}, LO8/K;->w()LA9/y;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    const-string v3, "property.returnType"

    .line 69
    .line 70
    invoke-static {v2, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-object v3, p0, Lw9/o;->u:Le9/G;

    .line 74
    .line 75
    invoke-interface {v0, v1, v3, v2}, Lw9/a;->y0(LK0/q;Le9/G;LA9/y;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lo9/g;

    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_1
    iget-object v0, p0, Lw9/o;->t:Lw9/q;

    .line 83
    .line 84
    iget-object v1, v0, Lw9/q;->a:LV3/b;

    .line 85
    .line 86
    iget-object v1, v1, LV3/b;->a:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, LI4/c;

    .line 89
    .line 90
    iget-object v1, v1, LI4/c;->a:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Lz9/l;

    .line 93
    .line 94
    new-instance v2, Lw9/o;

    .line 95
    .line 96
    iget-object v3, p0, Lw9/o;->v:Ly9/o;

    .line 97
    .line 98
    iget-object v4, p0, Lw9/o;->u:Le9/G;

    .line 99
    .line 100
    const/4 v5, 0x0

    .line 101
    invoke-direct {v2, v0, v4, v3, v5}, Lw9/o;-><init>(Lw9/q;Le9/G;Ly9/o;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    new-instance v0, Lz9/h;

    .line 108
    .line 109
    invoke-direct {v0, v1, v2}, Lz9/h;-><init>(Lz9/l;Lu8/a;)V

    .line 110
    .line 111
    .line 112
    return-object v0

    .line 113
    :pswitch_2
    iget-object v0, p0, Lw9/o;->t:Lw9/q;

    .line 114
    .line 115
    iget-object v1, v0, Lw9/q;->a:LV3/b;

    .line 116
    .line 117
    iget-object v1, v1, LV3/b;->c:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, LL8/j;

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Lw9/q;->a(LL8/j;)LK0/q;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iget-object v0, v0, Lw9/q;->a:LV3/b;

    .line 129
    .line 130
    iget-object v0, v0, LV3/b;->a:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, LI4/c;

    .line 133
    .line 134
    iget-object v0, v0, LI4/c;->e:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Lw9/a;

    .line 137
    .line 138
    iget-object v2, p0, Lw9/o;->v:Ly9/o;

    .line 139
    .line 140
    invoke-virtual {v2}, LO8/K;->w()LA9/y;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    const-string v3, "property.returnType"

    .line 145
    .line 146
    invoke-static {v2, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object v3, p0, Lw9/o;->u:Le9/G;

    .line 150
    .line 151
    invoke-interface {v0, v1, v3, v2}, Lw9/a;->o0(LK0/q;Le9/G;LA9/y;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Lo9/g;

    .line 156
    .line 157
    return-object v0

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
