.class public final LB6/e;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Z

.field public final synthetic u:LB6/h;


# direct methods
.method public synthetic constructor <init>(ZLB6/h;I)V
    .locals 0

    .line 1
    iput p3, p0, LB6/e;->s:I

    iput-boolean p1, p0, LB6/e;->t:Z

    iput-object p2, p0, LB6/e;->u:LB6/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LB6/e;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LB6/e;->u:LB6/h;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iget-boolean v2, p0, LB6/e;->t:Z

    .line 10
    .line 11
    const-string v3, "task"

    .line 12
    .line 13
    const-string v4, "android.permission.BODY_SENSORS_BACKGROUND"

    .line 14
    .line 15
    const-string v5, "pb"

    .line 16
    .line 17
    if-eqz v2, :cond_4

    .line 18
    .line 19
    iget-object v2, v0, LB6/h;->u0:LB6/i;

    .line 20
    .line 21
    if-eqz v2, :cond_3

    .line 22
    .line 23
    iget-object v2, v2, LB6/i;->f:Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    iget-object v2, v0, LB6/h;->u0:LB6/i;

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    iget-object v2, v2, LB6/i;->g:Ljava/util/LinkedHashSet;

    .line 33
    .line 34
    invoke-interface {v2, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    iget-object v2, v0, LB6/h;->u0:LB6/i;

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    iget-object v2, v2, LB6/i;->h:Ljava/util/LinkedHashSet;

    .line 42
    .line 43
    invoke-interface {v2, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    iget-object v0, v0, LB6/h;->v0:LB6/b;

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0}, LB6/b;->f()V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-static {v3}, Lv8/i;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :cond_1
    invoke-static {v5}, Lv8/i;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v1

    .line 62
    :cond_2
    invoke-static {v5}, Lv8/i;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v1

    .line 66
    :cond_3
    invoke-static {v5}, Lv8/i;->n(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v1

    .line 70
    :cond_4
    iget-object v2, v0, Landroidx/fragment/app/b;->O:Lq0/w;

    .line 71
    .line 72
    if-eqz v2, :cond_5

    .line 73
    .line 74
    iget-object v2, v2, Lq0/w;->w:Li/l;

    .line 75
    .line 76
    invoke-static {v2, v4}, LI/e;->g(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    :cond_5
    iget-object v2, v0, LB6/h;->u0:LB6/i;

    .line 80
    .line 81
    if-eqz v2, :cond_7

    .line 82
    .line 83
    iget-object v0, v0, LB6/h;->v0:LB6/b;

    .line 84
    .line 85
    if-eqz v0, :cond_6

    .line 86
    .line 87
    invoke-virtual {v0}, LB6/b;->f()V

    .line 88
    .line 89
    .line 90
    :goto_0
    sget-object v0, Lh8/m;->a:Lh8/m;

    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_6
    invoke-static {v3}, Lv8/i;->n(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v1

    .line 97
    :cond_7
    invoke-static {v5}, Lv8/i;->n(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v1

    .line 101
    :pswitch_0
    iget-object v0, p0, LB6/e;->u:LB6/h;

    .line 102
    .line 103
    const/4 v1, 0x0

    .line 104
    iget-boolean v2, p0, LB6/e;->t:Z

    .line 105
    .line 106
    const-string v3, "task"

    .line 107
    .line 108
    const-string v4, "android.permission.ACCESS_BACKGROUND_LOCATION"

    .line 109
    .line 110
    const-string v5, "pb"

    .line 111
    .line 112
    if-eqz v2, :cond_c

    .line 113
    .line 114
    iget-object v2, v0, LB6/h;->u0:LB6/i;

    .line 115
    .line 116
    if-eqz v2, :cond_b

    .line 117
    .line 118
    iget-object v2, v2, LB6/i;->f:Ljava/util/LinkedHashSet;

    .line 119
    .line 120
    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    iget-object v2, v0, LB6/h;->u0:LB6/i;

    .line 124
    .line 125
    if-eqz v2, :cond_a

    .line 126
    .line 127
    iget-object v2, v2, LB6/i;->g:Ljava/util/LinkedHashSet;

    .line 128
    .line 129
    invoke-interface {v2, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    iget-object v2, v0, LB6/h;->u0:LB6/i;

    .line 133
    .line 134
    if-eqz v2, :cond_9

    .line 135
    .line 136
    iget-object v2, v2, LB6/i;->h:Ljava/util/LinkedHashSet;

    .line 137
    .line 138
    invoke-interface {v2, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    iget-object v0, v0, LB6/h;->v0:LB6/b;

    .line 142
    .line 143
    if-eqz v0, :cond_8

    .line 144
    .line 145
    invoke-virtual {v0}, LB6/b;->f()V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_8
    invoke-static {v3}, Lv8/i;->n(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v1

    .line 153
    :cond_9
    invoke-static {v5}, Lv8/i;->n(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw v1

    .line 157
    :cond_a
    invoke-static {v5}, Lv8/i;->n(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v1

    .line 161
    :cond_b
    invoke-static {v5}, Lv8/i;->n(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v1

    .line 165
    :cond_c
    iget-object v2, v0, Landroidx/fragment/app/b;->O:Lq0/w;

    .line 166
    .line 167
    if-eqz v2, :cond_d

    .line 168
    .line 169
    iget-object v2, v2, Lq0/w;->w:Li/l;

    .line 170
    .line 171
    invoke-static {v2, v4}, LI/e;->g(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    :cond_d
    iget-object v2, v0, LB6/h;->u0:LB6/i;

    .line 175
    .line 176
    if-eqz v2, :cond_f

    .line 177
    .line 178
    iget-object v0, v0, LB6/h;->v0:LB6/b;

    .line 179
    .line 180
    if-eqz v0, :cond_e

    .line 181
    .line 182
    invoke-virtual {v0}, LB6/b;->f()V

    .line 183
    .line 184
    .line 185
    :goto_1
    sget-object v0, Lh8/m;->a:Lh8/m;

    .line 186
    .line 187
    return-object v0

    .line 188
    :cond_e
    invoke-static {v3}, Lv8/i;->n(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw v1

    .line 192
    :cond_f
    invoke-static {v5}, Lv8/i;->n(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw v1

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
