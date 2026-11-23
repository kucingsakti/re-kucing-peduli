.class public final LX2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:I

.field public final t:I

.field public final u:Ljava/lang/Object;

.field public final v:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LX2/a;->s:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX2/a;->v:Ljava/lang/Object;

    iput-object p2, p0, LX2/a;->u:Ljava/lang/Object;

    iput p3, p0, LX2/a;->t:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LX2/a;->s:I

    iput-object p1, p0, LX2/a;->v:Ljava/lang/Object;

    iput p2, p0, LX2/a;->t:I

    iput-object p3, p0, LX2/a;->u:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p4, p0, LX2/a;->s:I

    iput-object p1, p0, LX2/a;->u:Ljava/lang/Object;

    iput-object p2, p0, LX2/a;->v:Ljava/lang/Object;

    iput p3, p0, LX2/a;->t:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LX2/a;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LX2/a;->v:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/graphics/Typeface;

    .line 9
    .line 10
    iget v1, p0, LX2/a;->t:I

    .line 11
    .line 12
    iget-object v2, p0, LX2/a;->u:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Landroid/widget/TextView;

    .line 15
    .line 16
    invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, LX2/a;->v:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 23
    .line 24
    iget-object v0, v0, Landroidx/work/impl/foreground/SystemForegroundService;->w:Landroid/app/NotificationManager;

    .line 25
    .line 26
    iget v1, p0, LX2/a;->t:I

    .line 27
    .line 28
    iget-object v2, p0, LX2/a;->u:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Landroid/app/Notification;

    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_1
    iget-object v0, p0, LX2/a;->v:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Landroid/content/Intent;

    .line 39
    .line 40
    iget v1, p0, LX2/a;->t:I

    .line 41
    .line 42
    iget-object v2, p0, LX2/a;->u:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Li1/i;

    .line 45
    .line 46
    invoke-virtual {v2, v1, v0}, Li1/i;->a(ILandroid/content/Intent;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_2
    new-instance v0, Landroid/content/Intent;

    .line 51
    .line 52
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v1, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"

    .line 62
    .line 63
    iget-object v2, p0, LX2/a;->u:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Landroid/content/IntentSender$SendIntentException;

    .line 66
    .line 67
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v1, p0, LX2/a;->v:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Ld/g;

    .line 74
    .line 75
    iget v2, p0, LX2/a;->t:I

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    invoke-virtual {v1, v2, v3, v0}, Ld/g;->a(IILandroid/content/Intent;)Z

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :pswitch_3
    iget-object v0, p0, LX2/a;->u:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, LP0/d;

    .line 85
    .line 86
    iget-object v0, v0, LP0/d;->t:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Ljava/io/Serializable;

    .line 89
    .line 90
    iget-object v1, p0, LX2/a;->v:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Ld/g;

    .line 93
    .line 94
    iget-object v2, v1, Ld/g;->a:Ljava/util/HashMap;

    .line 95
    .line 96
    iget v3, p0, LX2/a;->t:I

    .line 97
    .line 98
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Ljava/lang/String;

    .line 107
    .line 108
    if-nez v2, :cond_0

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_0
    iget-object v3, v1, Ld/g;->e:Ljava/util/HashMap;

    .line 112
    .line 113
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    check-cast v3, Lf/e;

    .line 118
    .line 119
    if-eqz v3, :cond_1

    .line 120
    .line 121
    iget-object v3, v3, Lf/e;->a:Lf/a;

    .line 122
    .line 123
    iget-object v1, v1, Ld/g;->d:Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_2

    .line 130
    .line 131
    invoke-interface {v3, v0}, Lf/a;->a(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_1
    iget-object v3, v1, Ld/g;->g:Landroid/os/Bundle;

    .line 136
    .line 137
    invoke-virtual {v3, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget-object v1, v1, Ld/g;->f:Ljava/util/HashMap;

    .line 141
    .line 142
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    :cond_2
    :goto_0
    return-void

    .line 146
    :pswitch_4
    iget-object v0, p0, LX2/a;->v:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 149
    .line 150
    iget-object v1, p0, LX2/a;->u:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v1, Landroid/view/View;

    .line 153
    .line 154
    iget v2, p0, LX2/a;->t:I

    .line 155
    .line 156
    const/4 v3, 0x0

    .line 157
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L(Landroid/view/View;IZ)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
