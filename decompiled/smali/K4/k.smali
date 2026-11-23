.class public final LK4/k;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:LX2/h;

.field public final synthetic u:LK4/m;

.field public final synthetic v:Ljava/lang/String;


# direct methods
.method public constructor <init>(LX2/h;LK4/m;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LK4/k;->s:I

    .line 1
    iput-object p1, p0, LK4/k;->t:LX2/h;

    iput-object p2, p0, LK4/k;->u:LK4/m;

    iput-object p3, p0, LK4/k;->v:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method

.method public constructor <init>(LX2/h;Ljava/lang/String;LK4/m;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LK4/k;->s:I

    .line 2
    iput-object p1, p0, LK4/k;->t:LX2/h;

    iput-object p2, p0, LK4/k;->v:Ljava/lang/String;

    iput-object p3, p0, LK4/k;->u:LK4/m;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, LK4/k;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK4/k;->t:LX2/h;

    .line 7
    .line 8
    invoke-virtual {v0}, Li/F;->dismiss()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LK4/k;->u:LK4/m;

    .line 12
    .line 13
    iget-object v1, v0, LK4/m;->f:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v2, v0, LK4/m;->j:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v2}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const-string v3, "download"

    .line 21
    .line 22
    iget-object v4, v0, LK4/m;->a:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {v4, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const-string v5, "null cannot be cast to non-null type android.app.DownloadManager"

    .line 29
    .line 30
    invoke-static {v3, v5}, Lv8/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    check-cast v3, Landroid/app/DownloadManager;

    .line 34
    .line 35
    sget-object v5, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v5}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    new-instance v6, Ljava/io/File;

    .line 42
    .line 43
    const-string v7, "NekoPoi"

    .line 44
    .line 45
    invoke-direct {v6, v5, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-nez v5, :cond_0

    .line 53
    .line 54
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 55
    .line 56
    .line 57
    :cond_0
    new-instance v5, Landroid/app/DownloadManager$Request;

    .line 58
    .line 59
    iget-object v6, p0, LK4/k;->v:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-direct {v5, v6}, Landroid/app/DownloadManager$Request;-><init>(Landroid/net/Uri;)V

    .line 66
    .line 67
    .line 68
    iget-object v6, v0, LK4/m;->h:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v5, v6}, Landroid/app/DownloadManager$Request;->setMimeType(Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    const-string v6, "User-Agent"

    .line 75
    .line 76
    invoke-virtual {v5, v6, v1}, Landroid/app/DownloadManager$Request;->addRequestHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const-string v5, "Content-Disposition"

    .line 81
    .line 82
    iget-object v0, v0, LK4/m;->d:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v1, v5, v0}, Landroid/app/DownloadManager$Request;->addRequestHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 89
    .line 90
    const-string v5, "NekoPoi/"

    .line 91
    .line 92
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v0, v1, v2}, Landroid/app/DownloadManager$Request;->setDestinationInExternalPublicDir(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    const/4 v1, 0x1

    .line 101
    invoke-virtual {v0, v1}, Landroid/app/DownloadManager$Request;->setNotificationVisibility(I)Landroid/app/DownloadManager$Request;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0, v1}, Landroid/app/DownloadManager$Request;->setAllowedOverMetered(Z)Landroid/app/DownloadManager$Request;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0, v1}, Landroid/app/DownloadManager$Request;->setAllowedOverRoaming(Z)Landroid/app/DownloadManager$Request;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v3, v0}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J

    .line 114
    .line 115
    .line 116
    const-string v0, "Unduhan akan dimulai dalam beberapa saat"

    .line 117
    .line 118
    const/4 v1, 0x0

    .line 119
    invoke-static {v4, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 124
    .line 125
    .line 126
    sget-object v0, Lh8/m;->a:Lh8/m;

    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_0
    iget-object v0, p0, LK4/k;->t:LX2/h;

    .line 130
    .line 131
    invoke-virtual {v0}, Li/F;->dismiss()V

    .line 132
    .line 133
    .line 134
    new-instance v0, Landroid/content/Intent;

    .line 135
    .line 136
    const-string v1, "android.intent.action.VIEW"

    .line 137
    .line 138
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget-object v1, p0, LK4/k;->v:Ljava/lang/String;

    .line 142
    .line 143
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 148
    .line 149
    .line 150
    iget-object v1, p0, LK4/k;->u:LK4/m;

    .line 151
    .line 152
    iget-object v1, v1, LK4/m;->b:Landroid/app/Activity;

    .line 153
    .line 154
    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 155
    .line 156
    .line 157
    sget-object v0, Lh8/m;->a:Lh8/m;

    .line 158
    .line 159
    return-object v0

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
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
