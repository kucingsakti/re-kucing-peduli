.class public final LM2/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:I

.field public t:Z

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/mukesh/OtpView;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LM2/P;->s:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM2/P;->u:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, LM2/P;->s:I

    iput-boolean p2, p0, LM2/P;->t:Z

    iput-object p1, p0, LM2/P;->u:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget v2, p0, LM2/P;->s:I

    .line 4
    .line 5
    packed-switch v2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v2, p0, LM2/P;->t:Z

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v2, p0, LM2/P;->u:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lcom/mukesh/OtpView;

    .line 16
    .line 17
    invoke-virtual {v2, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    sget-object v3, Lcom/mukesh/OtpView;->f0:[Landroid/text/InputFilter;

    .line 21
    .line 22
    iget-boolean v3, v2, Lcom/mukesh/OtpView;->R:Z

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/view/View;->isFocused()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    move v0, v1

    .line 33
    :cond_1
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-boolean v0, v2, Lcom/mukesh/OtpView;->S:Z

    .line 36
    .line 37
    xor-int/2addr v0, v1

    .line 38
    invoke-virtual {v2, v0}, Lcom/mukesh/OtpView;->g(Z)V

    .line 39
    .line 40
    .line 41
    const-wide/16 v0, 0x1f4

    .line 42
    .line 43
    invoke-virtual {v2, p0, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    return-void

    .line 47
    :pswitch_0
    iget-object v0, p0, LM2/P;->u:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, LN1/s;

    .line 50
    .line 51
    iget-object v0, v0, LN1/s;->b:LN1/o;

    .line 52
    .line 53
    iget-boolean v1, p0, LM2/P;->t:Z

    .line 54
    .line 55
    invoke-virtual {v0, v1}, LN1/o;->a(Z)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_1
    iget-object v0, p0, LM2/P;->u:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, LN1/q;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {}, LU1/n;->a()V

    .line 67
    .line 68
    .line 69
    iget-object v0, v0, LN1/q;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, LK0/g;

    .line 72
    .line 73
    iget-boolean v1, v0, LK0/g;->b:Z

    .line 74
    .line 75
    iget-boolean v2, p0, LM2/P;->t:Z

    .line 76
    .line 77
    iput-boolean v2, v0, LK0/g;->b:Z

    .line 78
    .line 79
    if-eq v1, v2, :cond_3

    .line 80
    .line 81
    iget-object v0, v0, LK0/g;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, LN1/o;

    .line 84
    .line 85
    invoke-virtual {v0, v2}, LN1/o;->a(Z)V

    .line 86
    .line 87
    .line 88
    :cond_3
    return-void

    .line 89
    :pswitch_2
    iget-object v2, p0, LM2/P;->u:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v2, Lcom/google/android/gms/measurement/internal/zziv;

    .line 92
    .line 93
    iget-object v3, v2, LB1/a;->s:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v3, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 96
    .line 97
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzhj;->h()Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    iget-object v4, v2, LB1/a;->s:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v4, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 104
    .line 105
    iget-object v5, v4, Lcom/google/android/gms/measurement/internal/zzhj;->S:Ljava/lang/Boolean;

    .line 106
    .line 107
    if-eqz v5, :cond_4

    .line 108
    .line 109
    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/zzhj;->S:Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_4

    .line 116
    .line 117
    move v4, v1

    .line 118
    goto :goto_1

    .line 119
    :cond_4
    move v4, v0

    .line 120
    :goto_1
    iget-object v5, v2, LB1/a;->s:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v5, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 123
    .line 124
    iget-boolean v6, p0, LM2/P;->t:Z

    .line 125
    .line 126
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    iput-object v7, v5, Lcom/google/android/gms/measurement/internal/zzhj;->S:Ljava/lang/Boolean;

    .line 131
    .line 132
    if-ne v4, v6, :cond_5

    .line 133
    .line 134
    iget-object v4, v2, LB1/a;->s:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v4, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 137
    .line 138
    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/zzhj;->A:Lcom/google/android/gms/measurement/internal/zzfw;

    .line 139
    .line 140
    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/zzhj;->g(LM2/L;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/zzfw;->F:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 148
    .line 149
    const-string v7, "Default data collection state already set to"

    .line 150
    .line 151
    invoke-virtual {v4, v5, v7}, Lcom/google/android/gms/measurement/internal/zzfy;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    :cond_5
    iget-object v4, v2, LB1/a;->s:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v4, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 157
    .line 158
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzhj;->h()Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-eq v4, v3, :cond_7

    .line 163
    .line 164
    iget-object v4, v2, LB1/a;->s:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v4, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 167
    .line 168
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzhj;->h()Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    iget-object v5, v2, LB1/a;->s:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v5, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 175
    .line 176
    iget-object v7, v5, Lcom/google/android/gms/measurement/internal/zzhj;->S:Ljava/lang/Boolean;

    .line 177
    .line 178
    if-eqz v7, :cond_6

    .line 179
    .line 180
    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/zzhj;->S:Ljava/lang/Boolean;

    .line 181
    .line 182
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-eqz v5, :cond_6

    .line 187
    .line 188
    move v0, v1

    .line 189
    :cond_6
    if-eq v4, v0, :cond_8

    .line 190
    .line 191
    :cond_7
    iget-object v0, v2, LB1/a;->s:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 194
    .line 195
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzhj;->A:Lcom/google/android/gms/measurement/internal/zzfw;

    .line 196
    .line 197
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzhj;->g(LM2/L;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzfw;->C:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 209
    .line 210
    const-string v4, "Default data collection is different than actual status"

    .line 211
    .line 212
    invoke-virtual {v0, v4, v1, v3}, Lcom/google/android/gms/measurement/internal/zzfy;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :cond_8
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zziv;->y1()V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
