.class public final Lcom/kcstream/cing/fragment/TabsIndexFragment;
.super LK4/g;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/kcstream/cing/fragment/TabsIndexFragment;",
        "LK4/g;",
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


# instance fields
.field public A0:I

.field public v0:LFa/e;

.field public w0:Lcom/kcstream/cing/model/GetList;

.field public x0:Ljava/util/ArrayList;

.field public y0:Ljava/lang/String;

.field public z0:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LK4/g;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "hentai"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/kcstream/cing/fragment/TabsIndexFragment;->y0:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "0-9"

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kcstream/cing/fragment/TabsIndexFragment;->z0:Ljava/lang/String;

    .line 11
    .line 12
    return-void
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


# virtual methods
.method public final C(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, LK4/g;->C(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Landroidx/fragment/app/b;->c0(Z)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final D(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    .line 1
    const-string v0, "menu"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "inflater"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const v0, 0x7f0f0005

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 15
    .line 16
    .line 17
    return-void
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

.method public final E(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    .line 1
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/b;->W()Li/l;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    check-cast p3, Lcom/kcstream/cing/activity/MainActivity;

    .line 11
    .line 12
    invoke-virtual {p3}, Lcom/kcstream/cing/activity/MainActivity;->z()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/b;->W()Li/l;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    check-cast p3, Lcom/kcstream/cing/activity/MainActivity;

    .line 20
    .line 21
    invoke-virtual {p3}, Lcom/kcstream/cing/activity/MainActivity;->A()V

    .line 22
    .line 23
    .line 24
    const p3, 0x7f0d0058

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const p2, 0x7f0a0173

    .line 33
    .line 34
    .line 35
    invoke-static {p1, p2}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    move-object v2, p3

    .line 40
    check-cast v2, Landroid/widget/ImageView;

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    const p2, 0x7f0a0246

    .line 45
    .line 46
    .line 47
    invoke-static {p1, p2}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    move-object v3, p3

    .line 52
    check-cast v3, Landroid/widget/ProgressBar;

    .line 53
    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    const p2, 0x7f0a025f

    .line 57
    .line 58
    .line 59
    invoke-static {p1, p2}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    move-object v4, p3

    .line 64
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 65
    .line 66
    if-eqz v4, :cond_0

    .line 67
    .line 68
    const p2, 0x7f0a026a

    .line 69
    .line 70
    .line 71
    invoke-static {p1, p2}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    move-object v5, p3

    .line 76
    check-cast v5, Landroid/widget/RelativeLayout;

    .line 77
    .line 78
    if-eqz v5, :cond_0

    .line 79
    .line 80
    const p2, 0x7f0a02de

    .line 81
    .line 82
    .line 83
    invoke-static {p1, p2}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    move-object v6, p3

    .line 88
    check-cast v6, Lcom/google/android/material/tabs/TabLayout;

    .line 89
    .line 90
    if-eqz v6, :cond_0

    .line 91
    .line 92
    new-instance v0, LFa/e;

    .line 93
    .line 94
    move-object v1, p1

    .line 95
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 96
    .line 97
    const/4 v7, 0x6

    .line 98
    invoke-direct/range {v0 .. v7}, LFa/e;-><init>(Landroid/view/ViewGroup;Landroid/widget/ImageView;Landroid/view/View;Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/ViewGroup;I)V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, Lcom/kcstream/cing/fragment/TabsIndexFragment;->v0:LFa/e;

    .line 102
    .line 103
    const-string p1, "getRoot(...)"

    .line 104
    .line 105
    invoke-static {v1, p1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-object v1

    .line 109
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    new-instance p2, Ljava/lang/NullPointerException;

    .line 118
    .line 119
    const-string p3, "Missing required view with ID: "

    .line 120
    .line 121
    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p2
    .line 129
    .line 130
    .line 131
    .line 132
.end method

.method public final F()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/kcstream/cing/fragment/TabsIndexFragment;->v0:LFa/e;

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/b;->a0:Z

    .line 6
    .line 7
    return-void
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

.method public final K(Landroid/view/MenuItem;)Z
    .locals 7

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
    move-result p1

    .line 10
    const v0, 0x7f0a0040

    .line 11
    .line 12
    .line 13
    if-ne p1, v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/b;->n()Landroid/view/LayoutInflater;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 v0, 0x0

    .line 20
    const v1, 0x7f0d004d

    .line 21
    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {p1, v1, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const v0, 0x7f0a026a

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v0}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 36
    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    const v0, 0x7f0a0331

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v0}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Lcom/google/android/material/textview/MaterialTextView;

    .line 47
    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    const v0, 0x7f0a0332

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v0}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lcom/google/android/material/textview/MaterialTextView;

    .line 58
    .line 59
    if-eqz v2, :cond_0

    .line 60
    .line 61
    const v0, 0x7f0a0333

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v0}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Lcom/google/android/material/textview/MaterialTextView;

    .line 69
    .line 70
    if-eqz v3, :cond_0

    .line 71
    .line 72
    const v0, 0x7f0a0334

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v0}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, Lcom/google/android/material/textview/MaterialTextView;

    .line 80
    .line 81
    if-eqz v4, :cond_0

    .line 82
    .line 83
    const v0, 0x7f0a0335

    .line 84
    .line 85
    .line 86
    invoke-static {p1, v0}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    check-cast v5, Lcom/google/android/material/textview/MaterialTextView;

    .line 91
    .line 92
    if-eqz v5, :cond_0

    .line 93
    .line 94
    check-cast p1, Landroid/widget/RelativeLayout;

    .line 95
    .line 96
    new-instance v0, LX2/h;

    .line 97
    .line 98
    invoke-virtual {p0}, Landroidx/fragment/app/b;->X()Landroid/content/Context;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-direct {v0, v6}, LX2/h;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, LX2/h;->setContentView(Landroid/view/View;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 109
    .line 110
    .line 111
    new-instance p1, LJ4/n;

    .line 112
    .line 113
    const/4 v6, 0x0

    .line 114
    invoke-direct {p1, p0, v0, v6}, LJ4/n;-><init>(Lcom/kcstream/cing/fragment/TabsIndexFragment;LX2/h;I)V

    .line 115
    .line 116
    .line 117
    invoke-static {v3, p1}, LD3/b;->e(Landroid/view/View;Lu8/a;)V

    .line 118
    .line 119
    .line 120
    new-instance p1, LJ4/n;

    .line 121
    .line 122
    const/4 v3, 0x1

    .line 123
    invoke-direct {p1, p0, v0, v3}, LJ4/n;-><init>(Lcom/kcstream/cing/fragment/TabsIndexFragment;LX2/h;I)V

    .line 124
    .line 125
    .line 126
    invoke-static {v4, p1}, LD3/b;->e(Landroid/view/View;Lu8/a;)V

    .line 127
    .line 128
    .line 129
    new-instance p1, LJ4/n;

    .line 130
    .line 131
    const/4 v3, 0x2

    .line 132
    invoke-direct {p1, p0, v0, v3}, LJ4/n;-><init>(Lcom/kcstream/cing/fragment/TabsIndexFragment;LX2/h;I)V

    .line 133
    .line 134
    .line 135
    invoke-static {v5, p1}, LD3/b;->e(Landroid/view/View;Lu8/a;)V

    .line 136
    .line 137
    .line 138
    new-instance p1, LJ4/n;

    .line 139
    .line 140
    const/4 v3, 0x3

    .line 141
    invoke-direct {p1, p0, v0, v3}, LJ4/n;-><init>(Lcom/kcstream/cing/fragment/TabsIndexFragment;LX2/h;I)V

    .line 142
    .line 143
    .line 144
    invoke-static {v2, p1}, LD3/b;->e(Landroid/view/View;Lu8/a;)V

    .line 145
    .line 146
    .line 147
    new-instance p1, LJ4/n;

    .line 148
    .line 149
    const/4 v2, 0x4

    .line 150
    invoke-direct {p1, p0, v0, v2}, LJ4/n;-><init>(Lcom/kcstream/cing/fragment/TabsIndexFragment;LX2/h;I)V

    .line 151
    .line 152
    .line 153
    invoke-static {v1, p1}, LD3/b;->e(Landroid/view/View;Lu8/a;)V

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    new-instance v0, Ljava/lang/NullPointerException;

    .line 166
    .line 167
    const-string v1, "Missing required view with ID: "

    .line 168
    .line 169
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw v0

    .line 177
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 178
    return p1
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
.end method

.method public final R(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "view"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/b;->n()Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Lp/b1;->c(Landroid/view/LayoutInflater;)Lp/b1;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/fragment/app/b;->W()Li/l;

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Lcom/kcstream/cing/fragment/TabsIndexFragment;->v0:LFa/e;

    .line 21
    .line 22
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v1, LFa/e;->t:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Landroid/widget/ImageView;

    .line 28
    .line 29
    const v2, 0x7f080133

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v1, v2}, LD3/b;->t(Landroid/widget/ImageView;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    const-string v26, "W"

    .line 40
    .line 41
    const-string v27, "X"

    .line 42
    .line 43
    const-string v3, "0-9"

    .line 44
    .line 45
    const-string v4, "A"

    .line 46
    .line 47
    const-string v5, "B"

    .line 48
    .line 49
    const-string v6, "C"

    .line 50
    .line 51
    const-string v7, "D"

    .line 52
    .line 53
    const-string v8, "E"

    .line 54
    .line 55
    const-string v9, "F"

    .line 56
    .line 57
    const-string v10, "G"

    .line 58
    .line 59
    const-string v11, "H"

    .line 60
    .line 61
    const-string v12, "I"

    .line 62
    .line 63
    const-string v13, "J"

    .line 64
    .line 65
    const-string v14, "K"

    .line 66
    .line 67
    const-string v15, "L"

    .line 68
    .line 69
    const-string v16, "M"

    .line 70
    .line 71
    const-string v17, "N"

    .line 72
    .line 73
    const-string v18, "O"

    .line 74
    .line 75
    const-string v19, "P"

    .line 76
    .line 77
    const-string v20, "Q"

    .line 78
    .line 79
    const-string v21, "R"

    .line 80
    .line 81
    const-string v22, "S"

    .line 82
    .line 83
    const-string v23, "T"

    .line 84
    .line 85
    const-string v24, "U"

    .line 86
    .line 87
    const-string v25, "V"

    .line 88
    .line 89
    const-string v28, "Y"

    .line 90
    .line 91
    const-string v29, "Z"

    .line 92
    .line 93
    filled-new-array/range {v3 .. v29}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    new-instance v2, Ljava/util/ArrayList;

    .line 98
    .line 99
    new-instance v3, Li8/g;

    .line 100
    .line 101
    const/4 v4, 0x1

    .line 102
    invoke-direct {v3, v1, v4}, Li8/g;-><init>([Ljava/lang/Object;Z)V

    .line 103
    .line 104
    .line 105
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 106
    .line 107
    .line 108
    iput-object v2, v0, Lcom/kcstream/cing/fragment/TabsIndexFragment;->x0:Ljava/util/ArrayList;

    .line 109
    .line 110
    iget-object v1, v0, Lcom/kcstream/cing/fragment/TabsIndexFragment;->v0:LFa/e;

    .line 111
    .line 112
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object v1, v1, LFa/e;->v:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 118
    .line 119
    const/16 v2, 0x8

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 122
    .line 123
    .line 124
    iget-object v1, v0, Lcom/kcstream/cing/fragment/TabsIndexFragment;->v0:LFa/e;

    .line 125
    .line 126
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget-object v2, v0, Lcom/kcstream/cing/fragment/TabsIndexFragment;->x0:Ljava/util/ArrayList;

    .line 130
    .line 131
    if-eqz v2, :cond_3

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    iget-object v5, v1, LFa/e;->x:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v5, Lcom/google/android/material/tabs/TabLayout;

    .line 144
    .line 145
    if-eqz v3, :cond_0

    .line 146
    .line 147
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    check-cast v3, Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {v5}, Lcom/google/android/material/tabs/TabLayout;->h()Lv3/f;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-virtual {v6, v3}, Lv3/f;->a(Ljava/lang/CharSequence;)V

    .line 158
    .line 159
    .line 160
    iget-object v3, v5, Lcom/google/android/material/tabs/TabLayout;->t:Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    invoke-virtual {v5, v6, v3}, Lcom/google/android/material/tabs/TabLayout;->b(Lv3/f;Z)V

    .line 167
    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_0
    iget v1, v0, Lcom/kcstream/cing/fragment/TabsIndexFragment;->A0:I

    .line 171
    .line 172
    invoke-virtual {v5, v1}, Lcom/google/android/material/tabs/TabLayout;->g(I)Lv3/f;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    if-eqz v1, :cond_2

    .line 177
    .line 178
    iget-object v2, v1, Lv3/f;->d:Lcom/google/android/material/tabs/TabLayout;

    .line 179
    .line 180
    if-eqz v2, :cond_1

    .line 181
    .line 182
    invoke-virtual {v2, v1, v4}, Lcom/google/android/material/tabs/TabLayout;->j(Lv3/f;Z)V

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 187
    .line 188
    const-string v2, "Tab not attached to a TabLayout"

    .line 189
    .line 190
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw v1

    .line 194
    :cond_2
    :goto_1
    new-instance v1, LJ4/m;

    .line 195
    .line 196
    const/4 v2, 0x0

    .line 197
    invoke-direct {v1, v0, v2}, LJ4/m;-><init>(Ljava/lang/Object;I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v5, v1}, Lcom/google/android/material/tabs/TabLayout;->a(Lv3/b;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0}, Lcom/kcstream/cing/fragment/TabsIndexFragment;->g0()V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_3
    const-string v1, "listOrder"

    .line 208
    .line 209
    invoke-static {v1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const/4 v1, 0x0

    .line 213
    throw v1
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
.end method

.method public final g0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kcstream/cing/fragment/TabsIndexFragment;->v0:LFa/e;

    .line 2
    .line 3
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, LFa/e;->w:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/kcstream/cing/fragment/TabsIndexFragment;->v0:LFa/e;

    .line 16
    .line 17
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, LFa/e;->u:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Landroid/widget/ProgressBar;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/kcstream/cing/fragment/TabsIndexFragment;->v0:LFa/e;

    .line 29
    .line 30
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, LFa/e;->v:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    new-instance v0, LJ4/l;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-direct {v0, p0, v1}, LJ4/l;-><init>(Lcom/kcstream/cing/fragment/TabsIndexFragment;Lm8/d;)V

    .line 44
    .line 45
    .line 46
    const/4 v2, 0x3

    .line 47
    invoke-static {p0, v1, v0, v2}, LN9/z;->n(LN9/y;Lm8/a;Lu8/c;I)LN9/p0;

    .line 48
    .line 49
    .line 50
    return-void
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
