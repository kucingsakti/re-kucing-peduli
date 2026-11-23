.class public final Lcom/kcstream/cing/activity/SearchActivity;
.super LK4/f;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/kcstream/cing/activity/SearchActivity;",
        "LK4/f;",
        "<init>",
        "()V",
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
.field public static final synthetic f0:[LC8/u;


# instance fields
.field public V:LI4/b;

.field public W:Lcom/kcstream/cing/model/Search;

.field public final X:Li3/b;

.field public final Y:Ljava/util/ArrayList;

.field public final Z:Li3/b;

.field public final a0:Ljava/lang/reflect/Type;

.field public final b0:Lcom/google/gson/i;

.field public c0:Ljava/util/ArrayList;

.field public final d0:Ljava/lang/reflect/Type;

.field public e0:LCa/b;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lv8/l;

    .line 2
    .line 3
    const-string v1, "page"

    .line 4
    .line 5
    const-string v2, "getPage()I"

    .line 6
    .line 7
    const-class v3, Lcom/kcstream/cing/activity/SearchActivity;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Lv8/l;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lv8/u;->a:Lv8/v;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lv8/v;->d(Lv8/l;)LC8/i;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v2, Lv8/l;

    .line 19
    .line 20
    const-string v4, "totalPages"

    .line 21
    .line 22
    const-string v5, "getTotalPages()I"

    .line 23
    .line 24
    invoke-direct {v2, v3, v4, v5}, Lv8/l;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lv8/v;->d(Lv8/l;)LC8/i;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v2, 0x2

    .line 32
    new-array v2, v2, [LC8/u;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    aput-object v0, v2, v3

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    aput-object v1, v2, v0

    .line 39
    .line 40
    sput-object v2, Lcom/kcstream/cing/activity/SearchActivity;->f0:[LC8/u;

    .line 41
    .line 42
    return-void
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

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, LK4/f;-><init>()V

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
    new-instance v0, Li3/b;

    .line 10
    .line 11
    const/16 v1, 0x18

    .line 12
    .line 13
    invoke-direct {v0, v1}, Li3/b;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/kcstream/cing/activity/SearchActivity;->X:Li3/b;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/kcstream/cing/activity/SearchActivity;->Y:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance v0, Li3/b;

    .line 26
    .line 27
    const/16 v1, 0x18

    .line 28
    .line 29
    invoke-direct {v0, v1}, Li3/b;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/kcstream/cing/activity/SearchActivity;->Z:Li3/b;

    .line 33
    .line 34
    new-instance v0, Lcom/kcstream/cing/activity/SearchActivity$b;

    .line 35
    .line 36
    invoke-direct {v0}, Lcom/kcstream/cing/activity/SearchActivity$b;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v0, v0, Lz4/a;->b:Ljava/lang/reflect/Type;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/kcstream/cing/activity/SearchActivity;->a0:Ljava/lang/reflect/Type;

    .line 42
    .line 43
    new-instance v0, Lcom/google/gson/i;

    .line 44
    .line 45
    invoke-direct {v0}, Lcom/google/gson/i;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lcom/kcstream/cing/activity/SearchActivity;->b0:Lcom/google/gson/i;

    .line 49
    .line 50
    new-instance v0, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lcom/kcstream/cing/activity/SearchActivity;->c0:Ljava/util/ArrayList;

    .line 56
    .line 57
    new-instance v0, Lcom/kcstream/cing/activity/SearchActivity$a;

    .line 58
    .line 59
    invoke-direct {v0}, Lcom/kcstream/cing/activity/SearchActivity$a;-><init>()V

    .line 60
    .line 61
    .line 62
    iget-object v0, v0, Lz4/a;->b:Ljava/lang/reflect/Type;

    .line 63
    .line 64
    iput-object v0, p0, Lcom/kcstream/cing/activity/SearchActivity;->d0:Ljava/lang/reflect/Type;

    .line 65
    .line 66
    return-void
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

.method public static final z(Lcom/kcstream/cing/activity/SearchActivity;)I
    .locals 2

    .line 1
    sget-object v0, Lcom/kcstream/cing/activity/SearchActivity;->f0:[LC8/u;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, Lcom/kcstream/cing/activity/SearchActivity;->X:Li3/b;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, Li3/b;->y(LC8/u;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
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
.end method


# virtual methods
.method public final A()LI4/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kcstream/cing/activity/SearchActivity;->V:LI4/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "binding"

    .line 7
    .line 8
    invoke-static {v0}, Lv8/i;->n(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
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

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, LK4/f;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const v2, 0x7f0d0027

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const v2, 0x7f0a004d

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    check-cast v5, Landroid/widget/RelativeLayout;

    .line 27
    .line 28
    if-eqz v5, :cond_5

    .line 29
    .line 30
    const v2, 0x7f0a00a5

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v2}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    check-cast v6, Lcom/google/android/material/chip/ChipGroup;

    .line 38
    .line 39
    if-eqz v6, :cond_5

    .line 40
    .line 41
    const v2, 0x7f0a00d8

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    check-cast v7, Landroid/widget/LinearLayout;

    .line 49
    .line 50
    if-eqz v7, :cond_5

    .line 51
    .line 52
    const v2, 0x7f0a0178

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v2}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, Landroid/widget/ImageView;

    .line 60
    .line 61
    if-eqz v7, :cond_5

    .line 62
    .line 63
    move-object v2, v1

    .line 64
    check-cast v2, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 65
    .line 66
    const v8, 0x7f0a0192

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v8}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    check-cast v9, Landroidx/core/widget/NestedScrollView;

    .line 74
    .line 75
    if-eqz v9, :cond_4

    .line 76
    .line 77
    const v8, 0x7f0a0193

    .line 78
    .line 79
    .line 80
    invoke-static {v1, v8}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    check-cast v10, Landroid/widget/LinearLayout;

    .line 85
    .line 86
    if-eqz v10, :cond_4

    .line 87
    .line 88
    const v8, 0x7f0a0246

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v8}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    check-cast v11, Landroid/widget/ProgressBar;

    .line 96
    .line 97
    if-eqz v11, :cond_4

    .line 98
    .line 99
    const v8, 0x7f0a027c

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v8}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    check-cast v12, Landroidx/recyclerview/widget/RecyclerView;

    .line 107
    .line 108
    if-eqz v12, :cond_4

    .line 109
    .line 110
    const v8, 0x7f0a0298

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v8}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v13

    .line 117
    check-cast v13, Landroidx/recyclerview/widget/RecyclerView;

    .line 118
    .line 119
    if-eqz v13, :cond_4

    .line 120
    .line 121
    const v8, 0x7f0a028c

    .line 122
    .line 123
    .line 124
    invoke-static {v1, v8}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v14

    .line 128
    check-cast v14, Lcom/ferfalk/simplesearchview/SimpleSearchView;

    .line 129
    .line 130
    if-eqz v14, :cond_4

    .line 131
    .line 132
    const v8, 0x7f0a0306

    .line 133
    .line 134
    .line 135
    invoke-static {v1, v8}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v15

    .line 139
    check-cast v15, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 140
    .line 141
    if-eqz v15, :cond_4

    .line 142
    .line 143
    const v8, 0x7f0a0338

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v8}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v16

    .line 150
    move-object/from16 v4, v16

    .line 151
    .line 152
    check-cast v4, Landroid/widget/RelativeLayout;

    .line 153
    .line 154
    if-eqz v4, :cond_4

    .line 155
    .line 156
    new-instance v1, LI4/b;

    .line 157
    .line 158
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 159
    .line 160
    .line 161
    iput-object v2, v1, LI4/b;->a:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object v5, v1, LI4/b;->b:Ljava/lang/Object;

    .line 164
    .line 165
    iput-object v6, v1, LI4/b;->d:Ljava/lang/Object;

    .line 166
    .line 167
    iput-object v7, v1, LI4/b;->e:Ljava/lang/Object;

    .line 168
    .line 169
    iput-object v9, v1, LI4/b;->f:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object v10, v1, LI4/b;->g:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v11, v1, LI4/b;->h:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object v12, v1, LI4/b;->i:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object v13, v1, LI4/b;->j:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object v14, v1, LI4/b;->k:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object v15, v1, LI4/b;->l:Ljava/lang/Object;

    .line 182
    .line 183
    iput-object v4, v1, LI4/b;->c:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object v1, v0, Lcom/kcstream/cing/activity/SearchActivity;->V:LI4/b;

    .line 186
    .line 187
    invoke-virtual {v0}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    iget-object v1, v1, LI4/b;->a:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Li/l;->setContentView(Landroid/view/View;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    iget-object v1, v1, LI4/b;->l:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 205
    .line 206
    invoke-virtual {v0, v1}, Li/l;->v(Landroidx/appcompat/widget/Toolbar;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, Li/l;->l()LJ7/j;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    const/4 v2, 0x1

    .line 217
    invoke-virtual {v1, v2}, LJ7/j;->H(Z)V

    .line 218
    .line 219
    .line 220
    const v2, 0x7f0800e9

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v2}, LJ7/j;->K(I)V

    .line 224
    .line 225
    .line 226
    const-string v2, "Cari"

    .line 227
    .line 228
    invoke-virtual {v1, v2}, LJ7/j;->R(Ljava/lang/CharSequence;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    iget-object v1, v1, LI4/b;->e:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v1, Landroid/widget/ImageView;

    .line 238
    .line 239
    const v2, 0x7f080134

    .line 240
    .line 241
    .line 242
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    invoke-static {v1, v2}, LD3/b;->t(Landroid/widget/ImageView;Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0}, LK4/f;->y()Landroid/content/SharedPreferences;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    const-string v2, "saved_search"

    .line 254
    .line 255
    invoke-interface {v1, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    const-string v4, "fromJson(...)"

    .line 260
    .line 261
    const-string v5, ""

    .line 262
    .line 263
    iget-object v6, v0, Lcom/kcstream/cing/activity/SearchActivity;->b0:Lcom/google/gson/i;

    .line 264
    .line 265
    if-eqz v1, :cond_1

    .line 266
    .line 267
    invoke-virtual {v0}, LK4/f;->y()Landroid/content/SharedPreferences;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-interface {v1, v2, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    iget-object v2, v0, Lcom/kcstream/cing/activity/SearchActivity;->d0:Ljava/lang/reflect/Type;

    .line 276
    .line 277
    invoke-virtual {v6, v1, v2}, Lcom/google/gson/i;->b(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-static {v1, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    check-cast v1, Ljava/util/ArrayList;

    .line 285
    .line 286
    iput-object v1, v0, Lcom/kcstream/cing/activity/SearchActivity;->c0:Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    const/4 v2, 0x0

    .line 293
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 294
    .line 295
    .line 296
    move-result v7

    .line 297
    if-eqz v7, :cond_1

    .line 298
    .line 299
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    add-int/lit8 v8, v2, 0x1

    .line 304
    .line 305
    if-ltz v2, :cond_0

    .line 306
    .line 307
    check-cast v7, Ljava/lang/String;

    .line 308
    .line 309
    new-instance v2, Lcom/google/android/material/chip/Chip;

    .line 310
    .line 311
    invoke-direct {v2, v0, v3}, Lcom/google/android/material/chip/Chip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 315
    .line 316
    .line 317
    new-instance v9, LA9/A;

    .line 318
    .line 319
    const/4 v10, 0x4

    .line 320
    invoke-direct {v9, v0, v10, v7}, LA9/A;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    invoke-static {v2, v9}, LD3/b;->e(Landroid/view/View;Lu8/a;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 327
    .line 328
    .line 329
    move-result-object v7

    .line 330
    iget-object v7, v7, LI4/b;->d:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v7, Lcom/google/android/material/chip/ChipGroup;

    .line 333
    .line 334
    invoke-virtual {v7, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 335
    .line 336
    .line 337
    move v2, v8

    .line 338
    goto :goto_0

    .line 339
    :cond_0
    invoke-static {}, Li8/l;->G()V

    .line 340
    .line 341
    .line 342
    throw v3

    .line 343
    :cond_1
    invoke-virtual {v0}, LK4/f;->y()Landroid/content/SharedPreferences;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    const-string v2, "genreData"

    .line 348
    .line 349
    invoke-interface {v1, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    if-eqz v1, :cond_3

    .line 354
    .line 355
    invoke-virtual {v0}, LK4/f;->y()Landroid/content/SharedPreferences;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-interface {v1, v2, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    iget-object v2, v0, Lcom/kcstream/cing/activity/SearchActivity;->a0:Ljava/lang/reflect/Type;

    .line 364
    .line 365
    invoke-virtual {v6, v1, v2}, Lcom/google/gson/i;->b(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    invoke-static {v1, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    check-cast v1, Ljava/util/ArrayList;

    .line 373
    .line 374
    invoke-static {v1}, Li8/C;->q(Ljava/util/List;)Z

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    if-eqz v2, :cond_2

    .line 379
    .line 380
    goto :goto_1

    .line 381
    :cond_2
    invoke-static {v1}, Li8/k;->t0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    :goto_1
    invoke-static {v1}, Lv8/x;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    new-instance v2, LCa/c;

    .line 390
    .line 391
    invoke-direct {v2, v1}, LCa/c;-><init>(Ljava/util/List;)V

    .line 392
    .line 393
    .line 394
    new-instance v1, Lt1/G;

    .line 395
    .line 396
    invoke-direct {v1, v2}, Lt1/G;-><init>(LCa/c;)V

    .line 397
    .line 398
    .line 399
    sget-object v2, Lv8/u;->a:Lv8/v;

    .line 400
    .line 401
    const-class v3, Lcom/kcstream/cing/model/SearchListGenresData;

    .line 402
    .line 403
    invoke-virtual {v2, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    const-class v4, LG4/l;

    .line 408
    .line 409
    invoke-virtual {v2, v4}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    invoke-virtual {v1, v3, v2}, Lt1/G;->x(LC8/c;LC8/c;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    iget-object v2, v2, LI4/b;->i:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    .line 423
    .line 424
    invoke-virtual {v1, v2}, Lt1/G;->r(Landroidx/recyclerview/widget/RecyclerView;)LCa/c;

    .line 425
    .line 426
    .line 427
    :cond_3
    new-instance v1, LA1/h;

    .line 428
    .line 429
    const/16 v2, 0x10

    .line 430
    .line 431
    invoke-direct {v1, v2}, LA1/h;-><init>(I)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    iget-object v2, v2, LI4/b;->b:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v2, Landroid/widget/RelativeLayout;

    .line 441
    .line 442
    iget-object v3, v0, LK4/f;->R:Ljava/lang/String;

    .line 443
    .line 444
    invoke-virtual {v1, v0, v2, v3}, LA1/h;->l(Landroid/app/Activity;Landroid/widget/RelativeLayout;Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    return-void

    .line 448
    :cond_4
    move v2, v8

    .line 449
    :cond_5
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    new-instance v2, Ljava/lang/NullPointerException;

    .line 458
    .line 459
    const-string v3, "Missing required view with ID: "

    .line 460
    .line 461
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    invoke-direct {v2, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    throw v2
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
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

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    .line 1
    const-string v0, "menu"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Li/l;->getMenuInflater()Landroid/view/MenuInflater;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const v1, 0x7f0f000c

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 14
    .line 15
    .line 16
    const v0, 0x7f0a0049

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v1, v1, LI4/b;->k:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lcom/ferfalk/simplesearchview/SimpleSearchView;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setMenuItem(Landroid/view/MenuItem;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, LA1/r;

    .line 35
    .line 36
    const/16 v2, 0x9

    .line 37
    .line 38
    invoke-direct {v0, p0, v2}, LA1/r;-><init>(Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setOnQueryTextListener(LW1/h;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Le1/j;

    .line 45
    .line 46
    const/16 v2, 0x8

    .line 47
    .line 48
    invoke-direct {v0, p0, v2}, Le1/j;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v0}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setOnSearchViewListener(LW1/i;)V

    .line 52
    .line 53
    .line 54
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    return p1
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
.end method

.method public final onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Li/l;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, LI4/b;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/google/android/material/chip/ChipGroup;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const v1, 0x102002c

    .line 11
    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
