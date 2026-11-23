.class public final Lcom/kcstream/cing/activity/Browser2Activity;
.super Li/l;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/kcstream/cing/activity/Browser2Activity;",
        "Li/l;",
        "<init>",
        "()V",
        "E4/c",
        "E4/g",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic X:I


# instance fields
.field public P:LFa/e;

.field public final Q:Ljava/util/ArrayList;

.field public R:LE4/c;

.field public S:Landroid/os/Bundle;

.field public T:Ljava/lang/String;

.field public U:Ljava/io/File;

.field public final V:Ljava/lang/String;

.field public final W:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Li/l;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/kcstream/cing/activity/Browser2Activity;->Q:Ljava/util/ArrayList;

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    iput-object v0, p0, Lcom/kcstream/cing/activity/Browser2Activity;->T:Ljava/lang/String;

    .line 14
    .line 15
    const-string v0, "1"

    .line 16
    .line 17
    iput-object v0, p0, Lcom/kcstream/cing/activity/Browser2Activity;->V:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/kcstream/cing/activity/Browser2Activity;->W:Ljava/lang/StringBuilder;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final onBackPressed()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kcstream/cing/activity/Browser2Activity;->R:LE4/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kcstream/cing/activity/Browser2Activity;->P:LFa/e;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    iget-object v2, v2, LFa/e;->x:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Landroidx/viewpager2/widget/ViewPager2;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget-object v0, v0, LE4/c;->n:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, LE4/g;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string v0, "binding"

    .line 32
    .line 33
    invoke-static {v0}, Lv8/i;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    move-object v0, v1

    .line 38
    :goto_0
    if-eqz v0, :cond_3

    .line 39
    .line 40
    iget-object v2, v0, LE4/g;->x0:LA1/h;

    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    iget-object v1, v2, LA1/h;->v:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Landroid/webkit/WebView;

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/webkit/WebView;->canGoBack()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :cond_2
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-static {v1, v2}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    const/4 v1, 0x0

    .line 64
    :goto_1
    if-eqz v1, :cond_5

    .line 65
    .line 66
    iget-object v0, v0, LE4/g;->x0:LA1/h;

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    iget-object v0, v0, LA1/h;->v:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Landroid/webkit/WebView;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    .line 75
    .line 76
    .line 77
    :cond_4
    return-void

    .line 78
    :cond_5
    invoke-super {p0}, Ld/m;->onBackPressed()V

    .line 79
    .line 80
    .line 81
    return-void
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 11

    .line 1
    invoke-super {p0, p1}, Li/l;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const v0, 0x7f0d001e

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {p1, v0, v2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const v0, 0x7f0a008c

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    move-object v5, v1

    .line 25
    check-cast v5, Landroid/widget/ImageButton;

    .line 26
    .line 27
    if-eqz v5, :cond_c

    .line 28
    .line 29
    const v0, 0x7f0a008d

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v0}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    move-object v6, v1

    .line 37
    check-cast v6, Landroid/widget/ImageButton;

    .line 38
    .line 39
    if-eqz v6, :cond_c

    .line 40
    .line 41
    const v0, 0x7f0a008e

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v0}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    move-object v7, v1

    .line 49
    check-cast v7, Landroid/widget/ImageButton;

    .line 50
    .line 51
    if-eqz v7, :cond_c

    .line 52
    .line 53
    const v0, 0x7f0a02de

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v0}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    move-object v8, v1

    .line 61
    check-cast v8, Lcom/google/android/material/tabs/TabLayout;

    .line 62
    .line 63
    if-eqz v8, :cond_c

    .line 64
    .line 65
    const v0, 0x7f0a0306

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v0}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Landroidx/appcompat/widget/Toolbar;

    .line 73
    .line 74
    if-eqz v1, :cond_c

    .line 75
    .line 76
    const v0, 0x7f0a034f

    .line 77
    .line 78
    .line 79
    invoke-static {p1, v0}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    move-object v9, v1

    .line 84
    check-cast v9, Landroidx/viewpager2/widget/ViewPager2;

    .line 85
    .line 86
    if-eqz v9, :cond_c

    .line 87
    .line 88
    new-instance v3, LFa/e;

    .line 89
    .line 90
    move-object v4, p1

    .line 91
    check-cast v4, Landroid/widget/RelativeLayout;

    .line 92
    .line 93
    const/4 v10, 0x2

    .line 94
    invoke-direct/range {v3 .. v10}, LFa/e;-><init>(Landroid/view/ViewGroup;Landroid/widget/ImageView;Landroid/view/View;Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/ViewGroup;I)V

    .line 95
    .line 96
    .line 97
    iput-object v3, p0, Lcom/kcstream/cing/activity/Browser2Activity;->P:LFa/e;

    .line 98
    .line 99
    invoke-virtual {p0, v4}, Li/l;->setContentView(Landroid/view/View;)V

    .line 100
    .line 101
    .line 102
    new-instance p1, Ljava/io/File;

    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-string v1, "adFile"

    .line 109
    .line 110
    invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iput-object p1, p0, Lcom/kcstream/cing/activity/Browser2Activity;->U:Ljava/io/File;

    .line 114
    .line 115
    iget-object v0, p0, Lcom/kcstream/cing/activity/Browser2Activity;->V:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_3

    .line 122
    .line 123
    iget-object p1, p0, Lcom/kcstream/cing/activity/Browser2Activity;->U:Ljava/io/File;

    .line 124
    .line 125
    if-eqz p1, :cond_2

    .line 126
    .line 127
    new-instance v1, Ljava/io/BufferedReader;

    .line 128
    .line 129
    new-instance v3, Ljava/io/InputStreamReader;

    .line 130
    .line 131
    new-instance v4, Ljava/io/FileInputStream;

    .line 132
    .line 133
    invoke-direct {v4, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 134
    .line 135
    .line 136
    invoke-direct {v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 137
    .line 138
    .line 139
    invoke-direct {v1, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 140
    .line 141
    .line 142
    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {p1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    const-string v3, "0"

    .line 150
    .line 151
    invoke-static {v0, v3}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    iget-object v4, p0, Lcom/kcstream/cing/activity/Browser2Activity;->W:Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v5, "\n"

    .line 158
    .line 159
    if-eqz v3, :cond_1

    .line 160
    .line 161
    :try_start_1
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :catchall_0
    move-exception v0

    .line 169
    move-object p1, v0

    .line 170
    goto :goto_3

    .line 171
    :catch_0
    move-exception v0

    .line 172
    move-object p1, v0

    .line 173
    goto :goto_2

    .line 174
    :cond_1
    :goto_1
    const-string v3, "1"

    .line 175
    .line 176
    invoke-static {v0, v3}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-eqz v3, :cond_0

    .line 181
    .line 182
    new-instance v3, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    const-string v6, ":::::"

    .line 188
    .line 189
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 203
    .line 204
    .line 205
    goto :goto_0

    .line 206
    :goto_2
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 207
    .line 208
    .line 209
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :catchall_1
    move-exception v0

    .line 217
    move-object p1, v0

    .line 218
    goto :goto_4

    .line 219
    :goto_3
    :try_start_4
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 220
    .line 221
    .line 222
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 223
    :goto_4
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 224
    :catchall_2
    move-exception v0

    .line 225
    invoke-static {v1, p1}, Lcom/bumptech/glide/c;->c(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 226
    .line 227
    .line 228
    throw v0

    .line 229
    :cond_2
    invoke-static {v1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw v2

    .line 233
    :cond_3
    :goto_5
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    if-eqz p1, :cond_4

    .line 238
    .line 239
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    goto :goto_6

    .line 244
    :cond_4
    move-object p1, v2

    .line 245
    :goto_6
    invoke-static {p1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    iput-object p1, p0, Lcom/kcstream/cing/activity/Browser2Activity;->S:Landroid/os/Bundle;

    .line 249
    .line 250
    const-string v0, "link"

    .line 251
    .line 252
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    iput-object p1, p0, Lcom/kcstream/cing/activity/Browser2Activity;->T:Ljava/lang/String;

    .line 261
    .line 262
    iget-object v0, p0, Lcom/kcstream/cing/activity/Browser2Activity;->Q:Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    new-instance p1, LE4/c;

    .line 268
    .line 269
    invoke-direct {p1, p0, p0, v0}, LE4/c;-><init>(Lcom/kcstream/cing/activity/Browser2Activity;Lcom/kcstream/cing/activity/Browser2Activity;Ljava/util/ArrayList;)V

    .line 270
    .line 271
    .line 272
    iput-object p1, p0, Lcom/kcstream/cing/activity/Browser2Activity;->R:LE4/c;

    .line 273
    .line 274
    iget-object v0, p0, Lcom/kcstream/cing/activity/Browser2Activity;->P:LFa/e;

    .line 275
    .line 276
    const-string v1, "binding"

    .line 277
    .line 278
    if-eqz v0, :cond_b

    .line 279
    .line 280
    iget-object v0, v0, LFa/e;->x:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    .line 283
    .line 284
    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/s;)V

    .line 285
    .line 286
    .line 287
    new-instance p1, Lv1/f;

    .line 288
    .line 289
    iget-object v0, p0, Lcom/kcstream/cing/activity/Browser2Activity;->P:LFa/e;

    .line 290
    .line 291
    if-eqz v0, :cond_a

    .line 292
    .line 293
    new-instance v3, LE4/a;

    .line 294
    .line 295
    const/4 v4, 0x0

    .line 296
    invoke-direct {v3, p0, v4}, LE4/a;-><init>(Ljava/lang/Object;I)V

    .line 297
    .line 298
    .line 299
    iget-object v4, v0, LFa/e;->w:Ljava/lang/Object;

    .line 300
    .line 301
    move-object v5, v4

    .line 302
    check-cast v5, Lcom/google/android/material/tabs/TabLayout;

    .line 303
    .line 304
    iget-object v0, v0, LFa/e;->x:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    .line 307
    .line 308
    invoke-direct {p1, v5, v0, v3}, Lv1/f;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;LE4/a;)V

    .line 309
    .line 310
    .line 311
    iget-boolean v3, p1, Lv1/f;->a:Z

    .line 312
    .line 313
    if-nez v3, :cond_9

    .line 314
    .line 315
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/s;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    iput-object v3, p1, Lv1/f;->e:Ljava/lang/Object;

    .line 320
    .line 321
    if-eqz v3, :cond_8

    .line 322
    .line 323
    const/4 v3, 0x1

    .line 324
    iput-boolean v3, p1, Lv1/f;->a:Z

    .line 325
    .line 326
    new-instance v3, Lv3/i;

    .line 327
    .line 328
    invoke-direct {v3, v5}, Lv3/i;-><init>(Lcom/google/android/material/tabs/TabLayout;)V

    .line 329
    .line 330
    .line 331
    iget-object v4, v0, Landroidx/viewpager2/widget/ViewPager2;->u:Lb1/b;

    .line 332
    .line 333
    iget-object v4, v4, Lb1/b;->b:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v4, Ljava/util/ArrayList;

    .line 336
    .line 337
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    new-instance v3, LJ4/m;

    .line 341
    .line 342
    const/4 v4, 0x2

    .line 343
    invoke-direct {v3, v0, v4}, LJ4/m;-><init>(Ljava/lang/Object;I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v5, v3}, Lcom/google/android/material/tabs/TabLayout;->a(Lv3/b;)V

    .line 347
    .line 348
    .line 349
    new-instance v3, Lb1/c;

    .line 350
    .line 351
    const/4 v4, 0x1

    .line 352
    invoke-direct {v3, p1, v4}, Lb1/c;-><init>(Ljava/lang/Object;I)V

    .line 353
    .line 354
    .line 355
    iget-object v4, p1, Lv1/f;->e:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v4, Landroidx/recyclerview/widget/s;

    .line 358
    .line 359
    iget-object v4, v4, Landroidx/recyclerview/widget/s;->a:LJ0/t;

    .line 360
    .line 361
    invoke-virtual {v4, v3}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {p1}, Lv1/f;->b()V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    const/4 v7, 0x0

    .line 372
    const/4 v8, 0x1

    .line 373
    const/4 v9, 0x1

    .line 374
    const/4 v10, 0x1

    .line 375
    invoke-virtual/range {v5 .. v10}, Lcom/google/android/material/tabs/TabLayout;->l(IFZZZ)V

    .line 376
    .line 377
    .line 378
    iget-object p1, p0, Lcom/kcstream/cing/activity/Browser2Activity;->P:LFa/e;

    .line 379
    .line 380
    if-eqz p1, :cond_7

    .line 381
    .line 382
    new-instance v0, LE4/b;

    .line 383
    .line 384
    const/4 v3, 0x0

    .line 385
    invoke-direct {v0, p0, v3}, LE4/b;-><init>(Lcom/kcstream/cing/activity/Browser2Activity;I)V

    .line 386
    .line 387
    .line 388
    iget-object p1, p1, LFa/e;->u:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast p1, Landroid/widget/ImageButton;

    .line 391
    .line 392
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 393
    .line 394
    .line 395
    iget-object p1, p0, Lcom/kcstream/cing/activity/Browser2Activity;->P:LFa/e;

    .line 396
    .line 397
    if-eqz p1, :cond_6

    .line 398
    .line 399
    new-instance v0, LE4/b;

    .line 400
    .line 401
    const/4 v3, 0x1

    .line 402
    invoke-direct {v0, p0, v3}, LE4/b;-><init>(Lcom/kcstream/cing/activity/Browser2Activity;I)V

    .line 403
    .line 404
    .line 405
    iget-object p1, p1, LFa/e;->v:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast p1, Landroid/widget/ImageButton;

    .line 408
    .line 409
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 410
    .line 411
    .line 412
    iget-object p1, p0, Lcom/kcstream/cing/activity/Browser2Activity;->P:LFa/e;

    .line 413
    .line 414
    if-eqz p1, :cond_5

    .line 415
    .line 416
    iget-object p1, p1, LFa/e;->t:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast p1, Landroid/widget/ImageButton;

    .line 419
    .line 420
    new-instance v0, LA0/r;

    .line 421
    .line 422
    const/4 v1, 0x5

    .line 423
    invoke-direct {v0, p0, v1}, LA0/r;-><init>(Ljava/lang/Object;I)V

    .line 424
    .line 425
    .line 426
    invoke-static {p1, v0}, LD3/b;->e(Landroid/view/View;Lu8/a;)V

    .line 427
    .line 428
    .line 429
    return-void

    .line 430
    :cond_5
    invoke-static {v1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    throw v2

    .line 434
    :cond_6
    invoke-static {v1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    throw v2

    .line 438
    :cond_7
    invoke-static {v1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    throw v2

    .line 442
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 443
    .line 444
    const-string v0, "TabLayoutMediator attached before ViewPager2 has an adapter"

    .line 445
    .line 446
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    throw p1

    .line 450
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 451
    .line 452
    const-string v0, "TabLayoutMediator is already attached"

    .line 453
    .line 454
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    throw p1

    .line 458
    :cond_a
    invoke-static {v1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    throw v2

    .line 462
    :cond_b
    invoke-static {v1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    throw v2

    .line 466
    :cond_c
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object p1

    .line 474
    new-instance v0, Ljava/lang/NullPointerException;

    .line 475
    .line 476
    const-string v1, "Missing required view with ID: "

    .line 477
    .line 478
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object p1

    .line 482
    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    throw v0
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
.end method
