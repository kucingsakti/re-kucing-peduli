.class public final LM2/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Lcom/google/android/gms/measurement/internal/zzo;

.field public final synthetic u:Lcom/google/android/gms/measurement/internal/zzkx;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/zzkx;Lcom/google/android/gms/measurement/internal/zzo;I)V
    .locals 0

    .line 1
    iput p3, p0, LM2/c0;->s:I

    iput-object p2, p0, LM2/c0;->t:Lcom/google/android/gms/measurement/internal/zzo;

    iput-object p1, p0, LM2/c0;->u:Lcom/google/android/gms/measurement/internal/zzkx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LM2/c0;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM2/c0;->t:Lcom/google/android/gms/measurement/internal/zzo;

    .line 7
    .line 8
    iget-object v1, p0, LM2/c0;->u:Lcom/google/android/gms/measurement/internal/zzkx;

    .line 9
    .line 10
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzkx;->v:Lcom/google/android/gms/measurement/internal/zzfl;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "Failed to send consent settings to service"

    .line 19
    .line 20
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfy;->b(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    :try_start_0
    invoke-interface {v2, v0}, Lcom/google/android/gms/measurement/internal/zzfl;->I(Lcom/google/android/gms/measurement/internal/zzo;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzkx;->o1()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception v0

    .line 34
    invoke-virtual {v1}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, "Failed to send consent settings to the service"

    .line 39
    .line 40
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 41
    .line 42
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/measurement/internal/zzfy;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    return-void

    .line 46
    :pswitch_0
    iget-object v0, p0, LM2/c0;->t:Lcom/google/android/gms/measurement/internal/zzo;

    .line 47
    .line 48
    iget-object v1, p0, LM2/c0;->u:Lcom/google/android/gms/measurement/internal/zzkx;

    .line 49
    .line 50
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzkx;->v:Lcom/google/android/gms/measurement/internal/zzfl;

    .line 51
    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v1, "Failed to send measurementEnabled to service"

    .line 59
    .line 60
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfy;->b(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    :try_start_1
    invoke-interface {v2, v0}, Lcom/google/android/gms/measurement/internal/zzfl;->W(Lcom/google/android/gms/measurement/internal/zzo;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzkx;->o1()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catch_1
    move-exception v0

    .line 74
    invoke-virtual {v1}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const-string v2, "Failed to send measurementEnabled to the service"

    .line 79
    .line 80
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 81
    .line 82
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/measurement/internal/zzfy;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :goto_1
    return-void

    .line 86
    :pswitch_1
    iget-object v0, p0, LM2/c0;->t:Lcom/google/android/gms/measurement/internal/zzo;

    .line 87
    .line 88
    iget-object v1, p0, LM2/c0;->u:Lcom/google/android/gms/measurement/internal/zzkx;

    .line 89
    .line 90
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzkx;->v:Lcom/google/android/gms/measurement/internal/zzfl;

    .line 91
    .line 92
    if-nez v2, :cond_2

    .line 93
    .line 94
    invoke-virtual {v1}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v1, "Discarding data. Failed to send app launch"

    .line 99
    .line 100
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfy;->b(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_2
    :try_start_2
    invoke-interface {v2, v0}, Lcom/google/android/gms/measurement/internal/zzfl;->b0(Lcom/google/android/gms/measurement/internal/zzo;)V

    .line 107
    .line 108
    .line 109
    iget-object v3, v1, LB1/a;->s:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 112
    .line 113
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzhj;->p()Lcom/google/android/gms/measurement/internal/zzfp;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzfp;->g1()Z

    .line 118
    .line 119
    .line 120
    const/4 v3, 0x0

    .line 121
    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/measurement/internal/zzkx;->e1(Lcom/google/android/gms/measurement/internal/zzfl;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzo;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzkx;->o1()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :catch_2
    move-exception v0

    .line 129
    invoke-virtual {v1}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const-string v2, "Failed to send app launch to the service"

    .line 134
    .line 135
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 136
    .line 137
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/measurement/internal/zzfy;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :goto_2
    return-void

    .line 141
    :pswitch_2
    iget-object v0, p0, LM2/c0;->t:Lcom/google/android/gms/measurement/internal/zzo;

    .line 142
    .line 143
    iget-object v1, p0, LM2/c0;->u:Lcom/google/android/gms/measurement/internal/zzkx;

    .line 144
    .line 145
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzkx;->v:Lcom/google/android/gms/measurement/internal/zzfl;

    .line 146
    .line 147
    if-nez v2, :cond_3

    .line 148
    .line 149
    invoke-virtual {v1}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    const-string v1, "Failed to reset data on the service: not connected to service"

    .line 154
    .line 155
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfy;->b(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_3
    :try_start_3
    invoke-interface {v2, v0}, Lcom/google/android/gms/measurement/internal/zzfl;->y(Lcom/google/android/gms/measurement/internal/zzo;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :catch_3
    move-exception v0

    .line 166
    invoke-virtual {v1}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    const-string v3, "Failed to reset data on the service: remote exception"

    .line 171
    .line 172
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 173
    .line 174
    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/measurement/internal/zzfy;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    :goto_3
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzkx;->o1()V

    .line 178
    .line 179
    .line 180
    :goto_4
    return-void

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
