.class public abstract LN6/o;
.super LZ0/a;
.source "SourceFile"


# instance fields
.field public c:Lcom/smarteist/autoimageslider/SliderView;

.field public d:Ljava/util/LinkedList;


# virtual methods
.method public final a(LN6/l;ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p3, LN6/n;

    .line 2
    .line 3
    iget-object p2, p3, LN6/n;->a:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, LN6/l;->removeView(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LN6/o;->d:Ljava/util/LinkedList;

    .line 9
    .line 10
    invoke-virtual {p1, p3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
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
.end method

.method public final d()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final g(LN6/l;I)LN6/n;
    .locals 7

    .line 1
    iget-object v0, p0, LN6/o;->d:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LN6/n;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, LG4/h;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const v3, 0x7f0d00b2

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v3, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "inflate(...)"

    .line 30
    .line 31
    invoke-static {v2, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v2}, LN6/n;-><init>(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v2, v0, LN6/n;->a:Landroid/view/View;

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    move-object p1, p0

    .line 43
    check-cast p1, LG4/j;

    .line 44
    .line 45
    move-object v2, v0

    .line 46
    check-cast v2, LG4/h;

    .line 47
    .line 48
    iget-object p1, p1, LG4/j;->e:Ljava/util/List;

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Lcom/kcstream/cing/model/RecentItem;

    .line 57
    .line 58
    iget-object p2, v2, LN6/n;->a:Landroid/view/View;

    .line 59
    .line 60
    const v2, 0x7f0a0169

    .line 61
    .line 62
    .line 63
    invoke-static {p2, v2}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Lcom/kcstream/cing/utils/TopCropImageView;

    .line 68
    .line 69
    if-eqz v3, :cond_2

    .line 70
    .line 71
    const v2, 0x7f0a0316

    .line 72
    .line 73
    .line 74
    invoke-static {p2, v2}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, Lcom/google/android/material/textview/MaterialTextView;

    .line 79
    .line 80
    if-eqz v4, :cond_2

    .line 81
    .line 82
    const v2, 0x7f0a0318

    .line 83
    .line 84
    .line 85
    invoke-static {p2, v2}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    check-cast v5, Lcom/google/android/material/textview/MaterialTextView;

    .line 90
    .line 91
    if-eqz v5, :cond_2

    .line 92
    .line 93
    move-object v2, p2

    .line 94
    check-cast v2, Landroid/widget/FrameLayout;

    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/kcstream/cing/model/RecentItem;->d()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/kcstream/cing/model/RecentItem;->a()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-static {v2}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 111
    .line 112
    const/16 v6, 0x18

    .line 113
    .line 114
    if-lt v4, v6, :cond_1

    .line 115
    .line 116
    invoke-static {v2, v1}, LS/c;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    goto :goto_0

    .line 121
    :cond_1
    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    :goto_0
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    .line 127
    .line 128
    :try_start_0
    invoke-static {p2}, Lcom/bumptech/glide/b;->f(Landroid/view/View;)Lcom/bumptech/glide/l;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    new-instance v2, Lcom/bumptech/glide/j;

    .line 136
    .line 137
    iget-object v4, v1, Lcom/bumptech/glide/l;->s:Lcom/bumptech/glide/b;

    .line 138
    .line 139
    iget-object v5, v1, Lcom/bumptech/glide/l;->t:Landroid/content/Context;

    .line 140
    .line 141
    const-class v6, Landroid/graphics/Bitmap;

    .line 142
    .line 143
    invoke-direct {v2, v4, v1, v6, v5}, Lcom/bumptech/glide/j;-><init>(Lcom/bumptech/glide/b;Lcom/bumptech/glide/l;Ljava/lang/Class;Landroid/content/Context;)V

    .line 144
    .line 145
    .line 146
    sget-object v1, Lcom/bumptech/glide/l;->C:LQ1/e;

    .line 147
    .line 148
    invoke-virtual {v2, v1}, Lcom/bumptech/glide/j;->u(LQ1/a;)Lcom/bumptech/glide/j;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {p1}, Lcom/kcstream/cing/model/RecentItem;->c()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-virtual {v1, v2}, Lcom/bumptech/glide/j;->A(Ljava/lang/Object;)Lcom/bumptech/glide/j;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    sget-object v2, LA1/p;->e:LA1/p;

    .line 161
    .line 162
    invoke-virtual {v1, v2}, LQ1/a;->e(LA1/p;)LQ1/a;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, Lcom/bumptech/glide/j;

    .line 167
    .line 168
    new-instance v2, LG4/i;

    .line 169
    .line 170
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v2}, Lcom/bumptech/glide/j;->z(LG4/i;)Lcom/bumptech/glide/j;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v1, v3}, Lcom/bumptech/glide/j;->y(Landroid/widget/ImageView;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 178
    .line 179
    .line 180
    :catch_0
    new-instance v1, LE4/o;

    .line 181
    .line 182
    const/4 v2, 0x3

    .line 183
    invoke-direct {v1, v2, p2, p1}, LE4/o;-><init>(ILandroid/view/KeyEvent$Callback;Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 187
    .line 188
    .line 189
    return-object v0

    .line 190
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    new-instance p2, Ljava/lang/NullPointerException;

    .line 199
    .line 200
    const-string v0, "Missing required view with ID: "

    .line 201
    .line 202
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw p2

    .line 210
    :cond_3
    const-string p1, "data"

    .line 211
    .line 212
    invoke-static {p1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    const/4 p1, 0x0

    .line 216
    throw p1
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
.end method

.method public final h(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p2, LN6/n;

    .line 2
    .line 3
    iget-object p2, p2, LN6/n;->a:Landroid/view/View;

    .line 4
    .line 5
    if-ne p2, p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
.end method

.method public final i()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LZ0/a;->b:Landroid/database/DataSetObserver;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/database/DataSetObserver;->onChanged()V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    iget-object v0, p0, LZ0/a;->a:Landroid/database/DataSetObservable;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/database/DataSetObservable;->notifyChanged()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LN6/o;->c:Lcom/smarteist/autoimageslider/SliderView;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-boolean v1, v0, Lcom/smarteist/autoimageslider/SliderView;->B:Z

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, v0, Lcom/smarteist/autoimageslider/SliderView;->A:La7/a;

    .line 27
    .line 28
    invoke-virtual {v1}, LZ0/a;->i()V

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, Lcom/smarteist/autoimageslider/SliderView;->z:LN6/l;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v1, v1}, LN6/l;->t(IZ)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void

    .line 38
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw v0
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
