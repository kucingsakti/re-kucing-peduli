.class public final Lv1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile f:Lv1/f;


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LX9/g;LK0/g;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const-string v0, "this$0"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iput-object p1, p0, Lv1/f;->e:Ljava/lang/Object;

    .line 20
    iput-object p2, p0, Lv1/f;->b:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 21
    invoke-virtual {p2, v0}, LK0/g;->j(I)Lma/v;

    move-result-object p2

    iput-object p2, p0, Lv1/f;->c:Ljava/lang/Object;

    .line 22
    new-instance v0, LX9/f;

    invoke-direct {v0, p1, p0, p2}, LX9/f;-><init>(LX9/g;Lv1/f;Lma/v;)V

    iput-object v0, p0, Lv1/f;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;LE4/a;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lv1/f;->b:Ljava/lang/Object;

    .line 15
    iput-object p2, p0, Lv1/f;->c:Ljava/lang/Object;

    .line 16
    iput-object p3, p0, Lv1/f;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt1/G;Lcom/google/android/gms/internal/measurement/S;Ljava/lang/String;Lv1/f;Lv1/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lv1/f;->b:Ljava/lang/Object;

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 3
    :goto_0
    iput-boolean p1, p0, Lv1/f;->a:Z

    .line 4
    iput-object p2, p0, Lv1/f;->c:Ljava/lang/Object;

    .line 5
    iput-object p4, p0, Lv1/f;->d:Ljava/lang/Object;

    .line 6
    new-instance p1, Lt1/b;

    invoke-direct {p1, p4, p3, p5}, Lt1/b;-><init>(Lv1/f;Ljava/lang/String;Lv1/i;)V

    iput-object p1, p0, Lv1/f;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu1/b;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Lk7/e;

    invoke-direct {v0, p0}, Lk7/e;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lv1/f;->c:Ljava/lang/Object;

    .line 9
    new-instance v0, Lv1/e;

    invoke-direct {v0, p0}, Lv1/e;-><init>(Lv1/f;)V

    iput-object v0, p0, Lv1/f;->d:Ljava/lang/Object;

    .line 10
    new-instance v0, Lv1/e;

    invoke-direct {v0, p0}, Lv1/e;-><init>(Lv1/f;)V

    iput-object v0, p0, Lv1/f;->e:Ljava/lang/Object;

    .line 11
    iput-object p1, p0, Lv1/f;->b:Ljava/lang/Object;

    .line 12
    iget-boolean p1, p1, Lu1/b;->t:Z

    iput-boolean p1, p0, Lv1/f;->a:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lv1/f;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LX9/g;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-boolean v1, p0, Lv1/f;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    :try_start_1
    iput-boolean v1, p0, Lv1/f;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    iget-object v0, p0, Lv1/f;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lma/v;

    .line 19
    .line 20
    invoke-static {v0}, LY9/c;->d(Ljava/io/Closeable;)V

    .line 21
    .line 22
    .line 23
    :try_start_2
    iget-object v0, p0, Lv1/f;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, LK0/g;

    .line 26
    .line 27
    invoke-virtual {v0}, LK0/g;->c()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 28
    .line 29
    .line 30
    :catch_0
    return-void

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    monitor-exit v0

    .line 33
    throw v1
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
.end method

.method public b()V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lv1/f;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Lcom/google/android/material/tabs/TabLayout;

    .line 5
    .line 6
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->i()V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Lv1/f;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Landroidx/recyclerview/widget/s;

    .line 12
    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    invoke-virtual {v2}, Landroidx/recyclerview/widget/s;->a()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->h()Lv3/f;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    iget-object v6, p0, Lv1/f;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, LE4/a;

    .line 30
    .line 31
    sget v7, Lcom/kcstream/cing/activity/Browser2Activity;->X:I

    .line 32
    .line 33
    iget-object v6, v6, LE4/a;->t:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v6, Lcom/kcstream/cing/activity/Browser2Activity;

    .line 36
    .line 37
    iget-object v6, v6, Lcom/kcstream/cing/activity/Browser2Activity;->Q:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {v6}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    if-eqz v6, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    const-string v6, "No Title"

    .line 57
    .line 58
    :goto_1
    invoke-virtual {v5, v6}, Lv3/f;->a(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v5, v3}, Lcom/google/android/material/tabs/TabLayout;->b(Lv3/f;Z)V

    .line 62
    .line 63
    .line 64
    add-int/2addr v4, v0

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    if-lez v2, :cond_2

    .line 67
    .line 68
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    sub-int/2addr v2, v0

    .line 73
    iget-object v3, p0, Lv1/f;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v3, Landroidx/viewpager2/widget/ViewPager2;

    .line 76
    .line 77
    invoke-virtual {v3}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eq v2, v3, :cond_2

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Lcom/google/android/material/tabs/TabLayout;->g(I)Lv3/f;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v1, v2, v0}, Lcom/google/android/material/tabs/TabLayout;->j(Lv3/f;Z)V

    .line 96
    .line 97
    .line 98
    :cond_2
    return-void
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
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
