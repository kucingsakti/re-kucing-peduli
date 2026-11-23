.class public final LM2/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:J

.field public final synthetic u:Lcom/google/android/gms/measurement/internal/zzmh;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/zzmh;JI)V
    .locals 0

    .line 1
    iput p4, p0, LM2/i0;->s:I

    iput-wide p2, p0, LM2/i0;->t:J

    iput-object p1, p0, LM2/i0;->u:Lcom/google/android/gms/measurement/internal/zzmh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, LM2/i0;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM2/i0;->u:Lcom/google/android/gms/measurement/internal/zzmh;

    .line 7
    .line 8
    invoke-virtual {v0}, LM2/o;->W0()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzmh;->d1()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-wide v2, p0, LM2/i0;->t:J

    .line 19
    .line 20
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzfw;->F:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 25
    .line 26
    const-string v5, "Activity resumed, time"

    .line 27
    .line 28
    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/measurement/internal/zzfy;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, LB1/a;->s:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 34
    .line 35
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzhj;->y:Lcom/google/android/gms/measurement/internal/zzag;

    .line 36
    .line 37
    sget-object v5, Lcom/google/android/gms/measurement/internal/zzbf;->G0:Lcom/google/android/gms/measurement/internal/zzfj;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-virtual {v4, v6, v5}, Lcom/google/android/gms/measurement/internal/zzag;->h1(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfj;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzhj;->y:Lcom/google/android/gms/measurement/internal/zzag;

    .line 45
    .line 46
    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/zzmh;->x:LM2/k0;

    .line 47
    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzag;->k1()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_0

    .line 55
    .line 56
    iget-boolean v1, v0, Lcom/google/android/gms/measurement/internal/zzmh;->v:Z

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    :cond_0
    iget-object v1, v5, LM2/k0;->d:Lcom/google/android/gms/measurement/internal/zzmh;

    .line 61
    .line 62
    invoke-virtual {v1}, LM2/o;->W0()V

    .line 63
    .line 64
    .line 65
    iget-object v1, v5, LM2/k0;->c:LM2/l0;

    .line 66
    .line 67
    invoke-virtual {v1}, LM2/i;->a()V

    .line 68
    .line 69
    .line 70
    iput-wide v2, v5, LM2/k0;->a:J

    .line 71
    .line 72
    iput-wide v2, v5, LM2/k0;->b:J

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzag;->k1()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0}, LB1/a;->U0()LM2/w;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iget-object v1, v1, LM2/w;->L:Lcom/google/android/gms/measurement/internal/zzgk;

    .line 86
    .line 87
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgk;->b()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    :cond_2
    iget-object v1, v5, LM2/k0;->d:Lcom/google/android/gms/measurement/internal/zzmh;

    .line 94
    .line 95
    invoke-virtual {v1}, LM2/o;->W0()V

    .line 96
    .line 97
    .line 98
    iget-object v1, v5, LM2/k0;->c:LM2/l0;

    .line 99
    .line 100
    invoke-virtual {v1}, LM2/i;->a()V

    .line 101
    .line 102
    .line 103
    iput-wide v2, v5, LM2/k0;->a:J

    .line 104
    .line 105
    iput-wide v2, v5, LM2/k0;->b:J

    .line 106
    .line 107
    :cond_3
    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzmh;->y:Lo1/c;

    .line 108
    .line 109
    iget-object v2, v1, Lo1/c;->u:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzmh;

    .line 112
    .line 113
    invoke-virtual {v2}, LM2/o;->W0()V

    .line 114
    .line 115
    .line 116
    iget-object v1, v1, Lo1/c;->t:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v1, LM2/j0;

    .line 119
    .line 120
    if-eqz v1, :cond_4

    .line 121
    .line 122
    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/zzmh;->u:Lcom/google/android/gms/internal/measurement/zzcz;

    .line 123
    .line 124
    invoke-virtual {v3, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 125
    .line 126
    .line 127
    :cond_4
    invoke-virtual {v2}, LB1/a;->U0()LM2/w;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    iget-object v1, v1, LM2/w;->L:Lcom/google/android/gms/measurement/internal/zzgk;

    .line 132
    .line 133
    const/4 v3, 0x0

    .line 134
    invoke-virtual {v1, v3}, Lcom/google/android/gms/measurement/internal/zzgk;->a(Z)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, LM2/o;->W0()V

    .line 138
    .line 139
    .line 140
    iput-boolean v3, v2, Lcom/google/android/gms/measurement/internal/zzmh;->v:Z

    .line 141
    .line 142
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzmh;->w:LA1/r;

    .line 143
    .line 144
    iget-object v1, v0, LA1/r;->t:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzmh;

    .line 147
    .line 148
    invoke-virtual {v1}, LM2/o;->W0()V

    .line 149
    .line 150
    .line 151
    iget-object v1, v0, LA1/r;->t:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzmh;

    .line 154
    .line 155
    iget-object v2, v1, LB1/a;->s:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 158
    .line 159
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzhj;->h()Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    if-eqz v2, :cond_5

    .line 164
    .line 165
    iget-object v1, v1, LB1/a;->s:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 168
    .line 169
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzhj;->F:Lcom/google/android/gms/common/util/DefaultClock;

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 175
    .line 176
    .line 177
    move-result-wide v1

    .line 178
    invoke-virtual {v0, v1, v2}, LA1/r;->N(J)V

    .line 179
    .line 180
    .line 181
    :cond_5
    return-void

    .line 182
    :pswitch_0
    iget-object v0, p0, LM2/i0;->u:Lcom/google/android/gms/measurement/internal/zzmh;

    .line 183
    .line 184
    invoke-virtual {v0}, LM2/o;->W0()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzmh;->d1()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    iget-wide v6, p0, LM2/i0;->t:J

    .line 195
    .line 196
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzfw;->F:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 201
    .line 202
    const-string v3, "Activity paused, time"

    .line 203
    .line 204
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzfy;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    new-instance v2, LM2/j0;

    .line 208
    .line 209
    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzmh;->y:Lo1/c;

    .line 210
    .line 211
    iget-object v1, v3, Lo1/c;->u:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzmh;

    .line 214
    .line 215
    iget-object v4, v1, LB1/a;->s:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v4, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 218
    .line 219
    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/zzhj;->F:Lcom/google/android/gms/common/util/DefaultClock;

    .line 220
    .line 221
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 225
    .line 226
    .line 227
    move-result-wide v4

    .line 228
    invoke-direct/range {v2 .. v7}, LM2/j0;-><init>(Lo1/c;JJ)V

    .line 229
    .line 230
    .line 231
    iput-object v2, v3, Lo1/c;->t:Ljava/lang/Object;

    .line 232
    .line 233
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzmh;->u:Lcom/google/android/gms/internal/measurement/zzcz;

    .line 234
    .line 235
    const-wide/16 v3, 0x7d0

    .line 236
    .line 237
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 238
    .line 239
    .line 240
    iget-object v1, v0, LB1/a;->s:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 243
    .line 244
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzhj;->y:Lcom/google/android/gms/measurement/internal/zzag;

    .line 245
    .line 246
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzag;->k1()Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-eqz v1, :cond_6

    .line 251
    .line 252
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzmh;->x:LM2/k0;

    .line 253
    .line 254
    iget-object v0, v0, LM2/k0;->c:LM2/l0;

    .line 255
    .line 256
    invoke-virtual {v0}, LM2/i;->a()V

    .line 257
    .line 258
    .line 259
    :cond_6
    return-void

    .line 260
    nop

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
