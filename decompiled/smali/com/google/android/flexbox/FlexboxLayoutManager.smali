.class public Lcom/google/android/flexbox/FlexboxLayoutManager;
.super Landroidx/recyclerview/widget/w;
.source "SourceFile"

# interfaces
.implements LJ0/C;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;,
        Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;
    }
.end annotation


# static fields
.field public static final O:Landroid/graphics/Rect;


# instance fields
.field public A:Lt2/c;

.field public final B:Lt2/b;

.field public C:LJ0/p;

.field public D:LJ0/p;

.field public E:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public final J:Landroid/util/SparseArray;

.field public final K:Landroid/content/Context;

.field public L:Landroid/view/View;

.field public M:I

.field public final N:Lg9/g;

.field public q:I

.field public final r:I

.field public final s:I

.field public final t:I

.field public u:Z

.field public v:Z

.field public w:Ljava/util/List;

.field public final x:Lcom/google/android/flexbox/a;

.field public y:Landroidx/recyclerview/widget/A;

.field public z:LJ0/D;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->O:Landroid/graphics/Rect;

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
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/w;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:I

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 13
    .line 14
    new-instance v1, Lcom/google/android/flexbox/a;

    .line 15
    .line 16
    invoke-direct {v1, p0}, Lcom/google/android/flexbox/a;-><init>(Lcom/google/android/flexbox/FlexboxLayoutManager;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 20
    .line 21
    new-instance v1, Lt2/b;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Lt2/b;-><init>(Lcom/google/android/flexbox/FlexboxLayoutManager;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:Lt2/b;

    .line 27
    .line 28
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->F:I

    .line 29
    .line 30
    const/high16 v1, -0x80000000

    .line 31
    .line 32
    iput v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->G:I

    .line 33
    .line 34
    iput v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->H:I

    .line 35
    .line 36
    iput v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->I:I

    .line 37
    .line 38
    new-instance v1, Landroid/util/SparseArray;

    .line 39
    .line 40
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->J:Landroid/util/SparseArray;

    .line 44
    .line 45
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->M:I

    .line 46
    .line 47
    new-instance v0, Lg9/g;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->N:Lg9/g;

    .line 53
    .line 54
    invoke-static {p1, p2, p3, p4}, Landroidx/recyclerview/widget/w;->N(Landroid/content/Context;Landroid/util/AttributeSet;II)LJ0/y;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    iget p3, p2, LJ0/y;->a:I

    .line 59
    .line 60
    const/4 p4, 0x0

    .line 61
    const/4 v0, 0x1

    .line 62
    if-eqz p3, :cond_2

    .line 63
    .line 64
    if-eq p3, v0, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    iget-boolean p2, p2, LJ0/y;->c:Z

    .line 68
    .line 69
    if-eqz p2, :cond_1

    .line 70
    .line 71
    const/4 p2, 0x3

    .line 72
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->d1(I)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    const/4 p2, 0x2

    .line 77
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->d1(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    iget-boolean p2, p2, LJ0/y;->c:Z

    .line 82
    .line 83
    if-eqz p2, :cond_3

    .line 84
    .line 85
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->d1(I)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    invoke-virtual {p0, p4}, Lcom/google/android/flexbox/FlexboxLayoutManager;->d1(I)V

    .line 90
    .line 91
    .line 92
    :goto_0
    iget p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 93
    .line 94
    if-eq p2, v0, :cond_5

    .line 95
    .line 96
    if-eqz p2, :cond_4

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->p0()V

    .line 100
    .line 101
    .line 102
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 105
    .line 106
    .line 107
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:Lt2/b;

    .line 108
    .line 109
    invoke-static {p2}, Lt2/b;->b(Lt2/b;)V

    .line 110
    .line 111
    .line 112
    iput p4, p2, Lt2/b;->d:I

    .line 113
    .line 114
    :goto_1
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 115
    .line 116
    const/4 p2, 0x0

    .line 117
    iput-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 118
    .line 119
    iput-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->D:LJ0/p;

    .line 120
    .line 121
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->u0()V

    .line 122
    .line 123
    .line 124
    :cond_5
    iget p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->s:I

    .line 125
    .line 126
    const/4 p3, 0x4

    .line 127
    if-eq p2, p3, :cond_6

    .line 128
    .line 129
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->p0()V

    .line 130
    .line 131
    .line 132
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 133
    .line 134
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 135
    .line 136
    .line 137
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:Lt2/b;

    .line 138
    .line 139
    invoke-static {p2}, Lt2/b;->b(Lt2/b;)V

    .line 140
    .line 141
    .line 142
    iput p4, p2, Lt2/b;->d:I

    .line 143
    .line 144
    iput p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->s:I

    .line 145
    .line 146
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->u0()V

    .line 147
    .line 148
    .line 149
    :cond_6
    iput-boolean v0, p0, Landroidx/recyclerview/widget/w;->h:Z

    .line 150
    .line 151
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->K:Landroid/content/Context;

    .line 152
    .line 153
    return-void
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
.end method

.method public static R(III)Z
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v1, 0x0

    .line 10
    if-lez p2, :cond_0

    .line 11
    .line 12
    if-eq p0, p2, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    const/high16 p2, -0x80000000

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, p2, :cond_4

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    const/high16 p2, 0x40000000    # 2.0f

    .line 23
    .line 24
    if-eq v0, p2, :cond_1

    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    if-ne p1, p0, :cond_2

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    return v1

    .line 31
    :cond_3
    return v2

    .line 32
    :cond_4
    if-lt p1, p0, :cond_5

    .line 33
    .line 34
    return v2

    .line 35
    :cond_5
    return v1
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


# virtual methods
.method public final G0(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    .line 1
    new-instance v0, LJ0/m;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, LJ0/m;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput p2, v0, LJ0/m;->a:I

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/w;->H0(LJ0/m;)V

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

.method public final J0(LJ0/D;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->w()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, LJ0/D;->b()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->M0()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->O0(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Q0(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1}, LJ0/D;->b()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, LJ0/p;->b(Landroid/view/View;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, LJ0/p;->e(Landroid/view/View;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    sub-int/2addr p1, v0

    .line 47
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 48
    .line 49
    invoke-virtual {v0}, LJ0/p;->l()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1

    .line 58
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 59
    return p1
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

.method public final K0(LJ0/D;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->w()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, LJ0/D;->b()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->O0(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Q0(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1}, LJ0/D;->b()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_3

    .line 25
    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-static {v1}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-static {v0}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 40
    .line 41
    invoke-virtual {v3, v0}, LJ0/p;->b(Landroid/view/View;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 46
    .line 47
    invoke-virtual {v3, v1}, LJ0/p;->e(Landroid/view/View;)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    sub-int/2addr v0, v3

    .line 52
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 57
    .line 58
    iget-object v3, v3, Lcom/google/android/flexbox/a;->c:[I

    .line 59
    .line 60
    aget p1, v3, p1

    .line 61
    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    const/4 v4, -0x1

    .line 65
    if-ne p1, v4, :cond_2

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    aget v2, v3, v2

    .line 69
    .line 70
    sub-int/2addr v2, p1

    .line 71
    add-int/lit8 v2, v2, 0x1

    .line 72
    .line 73
    int-to-float v0, v0

    .line 74
    int-to-float v2, v2

    .line 75
    div-float/2addr v0, v2

    .line 76
    int-to-float p1, p1

    .line 77
    mul-float/2addr p1, v0

    .line 78
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 79
    .line 80
    invoke-virtual {v0}, LJ0/p;->k()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 85
    .line 86
    invoke-virtual {v2, v1}, LJ0/p;->e(Landroid/view/View;)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    sub-int/2addr v0, v1

    .line 91
    int-to-float v0, v0

    .line 92
    add-float/2addr p1, v0

    .line 93
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    return p1

    .line 98
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 99
    return p1
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
.end method

.method public final L0(LJ0/D;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->w()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    invoke-virtual {p1}, LJ0/D;->b()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->O0(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Q0(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1}, LJ0/D;->b()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_4

    .line 26
    .line 27
    if-eqz v2, :cond_4

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->w()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {p0, v1, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->S0(II)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const/4 v3, -0x1

    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    move v1, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static {v1}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->w()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    add-int/lit8 v4, v4, -0x1

    .line 54
    .line 55
    invoke-virtual {p0, v4, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->S0(II)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    if-nez v4, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {v4}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    :goto_1
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 67
    .line 68
    invoke-virtual {v4, v0}, LJ0/p;->b(Landroid/view/View;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 73
    .line 74
    invoke-virtual {v4, v2}, LJ0/p;->e(Landroid/view/View;)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    sub-int/2addr v0, v2

    .line 79
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    sub-int/2addr v3, v1

    .line 84
    add-int/lit8 v3, v3, 0x1

    .line 85
    .line 86
    int-to-float v0, v0

    .line 87
    int-to-float v1, v3

    .line 88
    div-float/2addr v0, v1

    .line 89
    invoke-virtual {p1}, LJ0/D;->b()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    int-to-float p1, p1

    .line 94
    mul-float/2addr v0, p1

    .line 95
    float-to-int p1, v0

    .line 96
    return p1

    .line 97
    :cond_4
    :goto_2
    return v1
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
.end method

.method public final M0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    new-instance v0, LJ0/o;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, p0, v1}, LJ0/o;-><init>(Landroidx/recyclerview/widget/w;I)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 23
    .line 24
    new-instance v0, LJ0/o;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, p0, v1}, LJ0/o;-><init>(Landroidx/recyclerview/widget/w;I)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->D:LJ0/p;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    new-instance v0, LJ0/o;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {v0, p0, v1}, LJ0/o;-><init>(Landroidx/recyclerview/widget/w;I)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 40
    .line 41
    new-instance v0, LJ0/o;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-direct {v0, p0, v1}, LJ0/o;-><init>(Landroidx/recyclerview/widget/w;I)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->D:LJ0/p;

    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 51
    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    new-instance v0, LJ0/o;

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    invoke-direct {v0, p0, v1}, LJ0/o;-><init>(Landroidx/recyclerview/widget/w;I)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 61
    .line 62
    new-instance v0, LJ0/o;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-direct {v0, p0, v1}, LJ0/o;-><init>(Landroidx/recyclerview/widget/w;I)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->D:LJ0/p;

    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    new-instance v0, LJ0/o;

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    invoke-direct {v0, p0, v1}, LJ0/o;-><init>(Landroidx/recyclerview/widget/w;I)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 78
    .line 79
    new-instance v0, LJ0/o;

    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    invoke-direct {v0, p0, v1}, LJ0/o;-><init>(Landroidx/recyclerview/widget/w;I)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->D:LJ0/p;

    .line 86
    .line 87
    return-void
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

.method public final N0(Landroidx/recyclerview/widget/A;LJ0/D;Lt2/c;)I
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget v3, v2, Lt2/c;->f:I

    .line 8
    .line 9
    const/high16 v4, -0x80000000

    .line 10
    .line 11
    if-eq v3, v4, :cond_1

    .line 12
    .line 13
    iget v5, v2, Lt2/c;->a:I

    .line 14
    .line 15
    if-gez v5, :cond_0

    .line 16
    .line 17
    add-int/2addr v3, v5

    .line 18
    iput v3, v2, Lt2/c;->f:I

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0, v1, v2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->c1(Landroidx/recyclerview/widget/A;Lt2/c;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget v3, v2, Lt2/c;->a:I

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    move v7, v3

    .line 30
    const/4 v8, 0x0

    .line 31
    :goto_0
    if-gtz v7, :cond_3

    .line 32
    .line 33
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 34
    .line 35
    iget-boolean v9, v9, Lt2/c;->b:Z

    .line 36
    .line 37
    if-eqz v9, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move/from16 v21, v3

    .line 41
    .line 42
    goto/16 :goto_b

    .line 43
    .line 44
    :cond_3
    :goto_1
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 45
    .line 46
    iget v10, v2, Lt2/c;->d:I

    .line 47
    .line 48
    if-ltz v10, :cond_2

    .line 49
    .line 50
    invoke-virtual/range {p2 .. p2}, LJ0/D;->b()I

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    if-ge v10, v11, :cond_2

    .line 55
    .line 56
    iget v10, v2, Lt2/c;->c:I

    .line 57
    .line 58
    if-ltz v10, :cond_2

    .line 59
    .line 60
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-ge v10, v9, :cond_2

    .line 65
    .line 66
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 67
    .line 68
    iget v10, v2, Lt2/c;->c:I

    .line 69
    .line 70
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    move-object v12, v9

    .line 75
    check-cast v12, Lt2/a;

    .line 76
    .line 77
    iget v9, v12, Lt2/a;->k:I

    .line 78
    .line 79
    iput v9, v2, Lt2/c;->d:I

    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:Lt2/b;

    .line 86
    .line 87
    const/4 v11, -0x1

    .line 88
    const/16 v18, 0x20

    .line 89
    .line 90
    iget-object v14, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 91
    .line 92
    sget-object v15, Lcom/google/android/flexbox/FlexboxLayoutManager;->O:Landroid/graphics/Rect;

    .line 93
    .line 94
    if-eqz v9, :cond_9

    .line 95
    .line 96
    invoke-virtual {v0}, Landroidx/recyclerview/widget/w;->J()I

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    invoke-virtual {v0}, Landroidx/recyclerview/widget/w;->K()I

    .line 101
    .line 102
    .line 103
    move-result v16

    .line 104
    iget v6, v0, Landroidx/recyclerview/widget/w;->o:I

    .line 105
    .line 106
    iget v13, v2, Lt2/c;->e:I

    .line 107
    .line 108
    iget v4, v2, Lt2/c;->h:I

    .line 109
    .line 110
    if-ne v4, v11, :cond_4

    .line 111
    .line 112
    iget v4, v12, Lt2/a;->c:I

    .line 113
    .line 114
    sub-int/2addr v13, v4

    .line 115
    :cond_4
    move v4, v13

    .line 116
    iget v13, v2, Lt2/c;->d:I

    .line 117
    .line 118
    int-to-float v9, v9

    .line 119
    sub-int v6, v6, v16

    .line 120
    .line 121
    int-to-float v6, v6

    .line 122
    iget v10, v10, Lt2/b;->d:I

    .line 123
    .line 124
    int-to-float v10, v10

    .line 125
    sub-float/2addr v9, v10

    .line 126
    sub-float/2addr v6, v10

    .line 127
    const/4 v10, 0x0

    .line 128
    invoke-static {v10, v10}, Ljava/lang/Math;->max(FF)F

    .line 129
    .line 130
    .line 131
    move-result v20

    .line 132
    iget v10, v12, Lt2/a;->d:I

    .line 133
    .line 134
    move/from16 v21, v3

    .line 135
    .line 136
    move/from16 v22, v4

    .line 137
    .line 138
    move v11, v13

    .line 139
    const/4 v3, 0x0

    .line 140
    :goto_2
    add-int v4, v13, v10

    .line 141
    .line 142
    if-ge v11, v4, :cond_8

    .line 143
    .line 144
    move v4, v11

    .line 145
    invoke-virtual {v0, v4}, Lcom/google/android/flexbox/FlexboxLayoutManager;->X0(I)Landroid/view/View;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    move/from16 v23, v4

    .line 150
    .line 151
    iget v4, v2, Lt2/c;->h:I

    .line 152
    .line 153
    move/from16 v24, v5

    .line 154
    .line 155
    const/4 v5, 0x1

    .line 156
    if-ne v4, v5, :cond_5

    .line 157
    .line 158
    invoke-virtual {v0, v15, v11}, Landroidx/recyclerview/widget/w;->d(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 159
    .line 160
    .line 161
    const/4 v4, 0x0

    .line 162
    const/4 v5, -0x1

    .line 163
    invoke-virtual {v0, v11, v5, v4}, Landroidx/recyclerview/widget/w;->b(Landroid/view/View;IZ)V

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_5
    const/4 v4, 0x0

    .line 168
    const/4 v5, -0x1

    .line 169
    invoke-virtual {v0, v15, v11}, Landroidx/recyclerview/widget/w;->d(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v11, v3, v4}, Landroidx/recyclerview/widget/w;->b(Landroid/view/View;IZ)V

    .line 173
    .line 174
    .line 175
    add-int/lit8 v3, v3, 0x1

    .line 176
    .line 177
    :goto_3
    iget-object v4, v14, Lcom/google/android/flexbox/a;->d:[J

    .line 178
    .line 179
    move/from16 v16, v6

    .line 180
    .line 181
    aget-wide v5, v4, v23

    .line 182
    .line 183
    long-to-int v4, v5

    .line 184
    shr-long v5, v5, v18

    .line 185
    .line 186
    long-to-int v5, v5

    .line 187
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    check-cast v6, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;

    .line 192
    .line 193
    invoke-virtual {v0, v11, v4, v5, v6}, Lcom/google/android/flexbox/FlexboxLayoutManager;->e1(Landroid/view/View;IILcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;)Z

    .line 194
    .line 195
    .line 196
    move-result v26

    .line 197
    if-eqz v26, :cond_6

    .line 198
    .line 199
    invoke-virtual {v11, v4, v5}, Landroid/view/View;->measure(II)V

    .line 200
    .line 201
    .line 202
    :cond_6
    iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 203
    .line 204
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    check-cast v5, Landroidx/recyclerview/widget/x;

    .line 209
    .line 210
    iget-object v5, v5, Landroidx/recyclerview/widget/x;->t:Landroid/graphics/Rect;

    .line 211
    .line 212
    iget v5, v5, Landroid/graphics/Rect;->left:I

    .line 213
    .line 214
    add-int/2addr v4, v5

    .line 215
    int-to-float v4, v4

    .line 216
    add-float/2addr v9, v4

    .line 217
    iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 218
    .line 219
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    check-cast v5, Landroidx/recyclerview/widget/x;

    .line 224
    .line 225
    iget-object v5, v5, Landroidx/recyclerview/widget/x;->t:Landroid/graphics/Rect;

    .line 226
    .line 227
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 228
    .line 229
    add-int/2addr v4, v5

    .line 230
    int-to-float v4, v4

    .line 231
    sub-float v4, v16, v4

    .line 232
    .line 233
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    check-cast v5, Landroidx/recyclerview/widget/x;

    .line 238
    .line 239
    iget-object v5, v5, Landroidx/recyclerview/widget/x;->t:Landroid/graphics/Rect;

    .line 240
    .line 241
    iget v5, v5, Landroid/graphics/Rect;->top:I

    .line 242
    .line 243
    add-int v5, v22, v5

    .line 244
    .line 245
    move/from16 v26, v3

    .line 246
    .line 247
    iget-boolean v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 248
    .line 249
    if-eqz v3, :cond_7

    .line 250
    .line 251
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 256
    .line 257
    .line 258
    move-result v16

    .line 259
    sub-int v3, v3, v16

    .line 260
    .line 261
    move-object/from16 v16, v15

    .line 262
    .line 263
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 264
    .line 265
    .line 266
    move-result v15

    .line 267
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 268
    .line 269
    .line 270
    move-result v27

    .line 271
    add-int v27, v27, v5

    .line 272
    .line 273
    move/from16 v28, v10

    .line 274
    .line 275
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 276
    .line 277
    move/from16 v17, v13

    .line 278
    .line 279
    move-object/from16 v29, v16

    .line 280
    .line 281
    move/from16 v25, v23

    .line 282
    .line 283
    move/from16 v16, v27

    .line 284
    .line 285
    move v13, v3

    .line 286
    move-object v3, v14

    .line 287
    move v14, v5

    .line 288
    const/4 v5, -0x1

    .line 289
    invoke-virtual/range {v10 .. v16}, Lcom/google/android/flexbox/a;->k(Landroid/view/View;Lt2/a;IIII)V

    .line 290
    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_7
    move/from16 v28, v10

    .line 294
    .line 295
    move/from16 v17, v13

    .line 296
    .line 297
    move-object v3, v14

    .line 298
    move-object/from16 v29, v15

    .line 299
    .line 300
    move/from16 v25, v23

    .line 301
    .line 302
    move v14, v5

    .line 303
    const/4 v5, -0x1

    .line 304
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 305
    .line 306
    .line 307
    move-result v13

    .line 308
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 309
    .line 310
    .line 311
    move-result v10

    .line 312
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 313
    .line 314
    .line 315
    move-result v15

    .line 316
    add-int/2addr v15, v10

    .line 317
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 318
    .line 319
    .line 320
    move-result v10

    .line 321
    add-int v16, v10, v14

    .line 322
    .line 323
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 324
    .line 325
    invoke-virtual/range {v10 .. v16}, Lcom/google/android/flexbox/a;->k(Landroid/view/View;Lt2/a;IIII)V

    .line 326
    .line 327
    .line 328
    :goto_4
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 329
    .line 330
    .line 331
    move-result v10

    .line 332
    iget v13, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 333
    .line 334
    add-int/2addr v10, v13

    .line 335
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 336
    .line 337
    .line 338
    move-result-object v13

    .line 339
    check-cast v13, Landroidx/recyclerview/widget/x;

    .line 340
    .line 341
    iget-object v13, v13, Landroidx/recyclerview/widget/x;->t:Landroid/graphics/Rect;

    .line 342
    .line 343
    iget v13, v13, Landroid/graphics/Rect;->right:I

    .line 344
    .line 345
    add-int/2addr v10, v13

    .line 346
    int-to-float v10, v10

    .line 347
    add-float v10, v10, v20

    .line 348
    .line 349
    add-float/2addr v9, v10

    .line 350
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 351
    .line 352
    .line 353
    move-result v10

    .line 354
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 355
    .line 356
    add-int/2addr v10, v6

    .line 357
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    check-cast v6, Landroidx/recyclerview/widget/x;

    .line 362
    .line 363
    iget-object v6, v6, Landroidx/recyclerview/widget/x;->t:Landroid/graphics/Rect;

    .line 364
    .line 365
    iget v6, v6, Landroid/graphics/Rect;->left:I

    .line 366
    .line 367
    add-int/2addr v10, v6

    .line 368
    int-to-float v6, v10

    .line 369
    add-float v6, v6, v20

    .line 370
    .line 371
    sub-float v6, v4, v6

    .line 372
    .line 373
    add-int/lit8 v11, v25, 0x1

    .line 374
    .line 375
    move-object v14, v3

    .line 376
    move/from16 v13, v17

    .line 377
    .line 378
    move/from16 v5, v24

    .line 379
    .line 380
    move/from16 v3, v26

    .line 381
    .line 382
    move/from16 v10, v28

    .line 383
    .line 384
    move-object/from16 v15, v29

    .line 385
    .line 386
    goto/16 :goto_2

    .line 387
    .line 388
    :cond_8
    move/from16 v24, v5

    .line 389
    .line 390
    iget v3, v2, Lt2/c;->c:I

    .line 391
    .line 392
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 393
    .line 394
    iget v4, v4, Lt2/c;->h:I

    .line 395
    .line 396
    add-int/2addr v3, v4

    .line 397
    iput v3, v2, Lt2/c;->c:I

    .line 398
    .line 399
    iget v3, v12, Lt2/a;->c:I

    .line 400
    .line 401
    move/from16 v19, v7

    .line 402
    .line 403
    goto/16 :goto_9

    .line 404
    .line 405
    :cond_9
    move/from16 v21, v3

    .line 406
    .line 407
    move/from16 v24, v5

    .line 408
    .line 409
    move v5, v11

    .line 410
    move-object v3, v14

    .line 411
    move-object/from16 v29, v15

    .line 412
    .line 413
    invoke-virtual {v0}, Landroidx/recyclerview/widget/w;->L()I

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    invoke-virtual {v0}, Landroidx/recyclerview/widget/w;->I()I

    .line 418
    .line 419
    .line 420
    move-result v6

    .line 421
    iget v9, v0, Landroidx/recyclerview/widget/w;->p:I

    .line 422
    .line 423
    iget v11, v2, Lt2/c;->e:I

    .line 424
    .line 425
    iget v13, v2, Lt2/c;->h:I

    .line 426
    .line 427
    if-ne v13, v5, :cond_a

    .line 428
    .line 429
    iget v13, v12, Lt2/a;->c:I

    .line 430
    .line 431
    sub-int v14, v11, v13

    .line 432
    .line 433
    add-int/2addr v11, v13

    .line 434
    move/from16 v25, v11

    .line 435
    .line 436
    move/from16 v22, v14

    .line 437
    .line 438
    goto :goto_5

    .line 439
    :cond_a
    move/from16 v22, v11

    .line 440
    .line 441
    move/from16 v25, v22

    .line 442
    .line 443
    :goto_5
    iget v11, v2, Lt2/c;->d:I

    .line 444
    .line 445
    int-to-float v4, v4

    .line 446
    sub-int/2addr v9, v6

    .line 447
    int-to-float v6, v9

    .line 448
    iget v9, v10, Lt2/b;->d:I

    .line 449
    .line 450
    int-to-float v9, v9

    .line 451
    sub-float/2addr v4, v9

    .line 452
    sub-float/2addr v6, v9

    .line 453
    const/4 v10, 0x0

    .line 454
    invoke-static {v10, v10}, Ljava/lang/Math;->max(FF)F

    .line 455
    .line 456
    .line 457
    move-result v9

    .line 458
    iget v10, v12, Lt2/a;->d:I

    .line 459
    .line 460
    move v13, v6

    .line 461
    move v14, v11

    .line 462
    const/4 v6, 0x0

    .line 463
    :goto_6
    add-int v15, v11, v10

    .line 464
    .line 465
    if-ge v14, v15, :cond_10

    .line 466
    .line 467
    move v15, v11

    .line 468
    invoke-virtual {v0, v14}, Lcom/google/android/flexbox/FlexboxLayoutManager;->X0(I)Landroid/view/View;

    .line 469
    .line 470
    .line 471
    move-result-object v11

    .line 472
    iget-object v5, v3, Lcom/google/android/flexbox/a;->d:[J

    .line 473
    .line 474
    move-object/from16 v26, v3

    .line 475
    .line 476
    move/from16 v16, v4

    .line 477
    .line 478
    aget-wide v3, v5, v14

    .line 479
    .line 480
    long-to-int v5, v3

    .line 481
    shr-long v3, v3, v18

    .line 482
    .line 483
    long-to-int v3, v3

    .line 484
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    check-cast v4, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;

    .line 489
    .line 490
    invoke-virtual {v0, v11, v5, v3, v4}, Lcom/google/android/flexbox/FlexboxLayoutManager;->e1(Landroid/view/View;IILcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;)Z

    .line 491
    .line 492
    .line 493
    move-result v17

    .line 494
    if-eqz v17, :cond_b

    .line 495
    .line 496
    invoke-virtual {v11, v5, v3}, Landroid/view/View;->measure(II)V

    .line 497
    .line 498
    .line 499
    :cond_b
    iget v3, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 500
    .line 501
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 502
    .line 503
    .line 504
    move-result-object v5

    .line 505
    check-cast v5, Landroidx/recyclerview/widget/x;

    .line 506
    .line 507
    iget-object v5, v5, Landroidx/recyclerview/widget/x;->t:Landroid/graphics/Rect;

    .line 508
    .line 509
    iget v5, v5, Landroid/graphics/Rect;->top:I

    .line 510
    .line 511
    add-int/2addr v3, v5

    .line 512
    int-to-float v3, v3

    .line 513
    add-float v3, v16, v3

    .line 514
    .line 515
    iget v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 516
    .line 517
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 518
    .line 519
    .line 520
    move-result-object v16

    .line 521
    move/from16 v27, v3

    .line 522
    .line 523
    move-object/from16 v3, v16

    .line 524
    .line 525
    check-cast v3, Landroidx/recyclerview/widget/x;

    .line 526
    .line 527
    iget-object v3, v3, Landroidx/recyclerview/widget/x;->t:Landroid/graphics/Rect;

    .line 528
    .line 529
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 530
    .line 531
    add-int/2addr v5, v3

    .line 532
    int-to-float v3, v5

    .line 533
    sub-float v3, v13, v3

    .line 534
    .line 535
    iget v5, v2, Lt2/c;->h:I

    .line 536
    .line 537
    const/4 v13, 0x1

    .line 538
    if-ne v5, v13, :cond_c

    .line 539
    .line 540
    move-object/from16 v5, v29

    .line 541
    .line 542
    invoke-virtual {v0, v5, v11}, Landroidx/recyclerview/widget/w;->d(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 543
    .line 544
    .line 545
    move/from16 v23, v3

    .line 546
    .line 547
    move/from16 v19, v7

    .line 548
    .line 549
    const/4 v3, 0x0

    .line 550
    const/4 v7, -0x1

    .line 551
    invoke-virtual {v0, v11, v7, v3}, Landroidx/recyclerview/widget/w;->b(Landroid/view/View;IZ)V

    .line 552
    .line 553
    .line 554
    goto :goto_7

    .line 555
    :cond_c
    move/from16 v23, v3

    .line 556
    .line 557
    move/from16 v19, v7

    .line 558
    .line 559
    move-object/from16 v5, v29

    .line 560
    .line 561
    const/4 v3, 0x0

    .line 562
    const/4 v7, -0x1

    .line 563
    invoke-virtual {v0, v5, v11}, Landroidx/recyclerview/widget/w;->d(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v0, v11, v6, v3}, Landroidx/recyclerview/widget/w;->b(Landroid/view/View;IZ)V

    .line 567
    .line 568
    .line 569
    add-int/lit8 v6, v6, 0x1

    .line 570
    .line 571
    :goto_7
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 572
    .line 573
    .line 574
    move-result-object v16

    .line 575
    move-object/from16 v3, v16

    .line 576
    .line 577
    check-cast v3, Landroidx/recyclerview/widget/x;

    .line 578
    .line 579
    iget-object v3, v3, Landroidx/recyclerview/widget/x;->t:Landroid/graphics/Rect;

    .line 580
    .line 581
    iget v3, v3, Landroid/graphics/Rect;->left:I

    .line 582
    .line 583
    add-int v3, v22, v3

    .line 584
    .line 585
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 586
    .line 587
    .line 588
    move-result-object v16

    .line 589
    move-object/from16 v7, v16

    .line 590
    .line 591
    check-cast v7, Landroidx/recyclerview/widget/x;

    .line 592
    .line 593
    iget-object v7, v7, Landroidx/recyclerview/widget/x;->t:Landroid/graphics/Rect;

    .line 594
    .line 595
    iget v7, v7, Landroid/graphics/Rect;->right:I

    .line 596
    .line 597
    sub-int v16, v25, v7

    .line 598
    .line 599
    move/from16 v17, v13

    .line 600
    .line 601
    iget-boolean v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 602
    .line 603
    if-eqz v13, :cond_e

    .line 604
    .line 605
    iget-boolean v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Z

    .line 606
    .line 607
    if-eqz v3, :cond_d

    .line 608
    .line 609
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 610
    .line 611
    .line 612
    move-result v3

    .line 613
    sub-int v3, v16, v3

    .line 614
    .line 615
    invoke-static/range {v23 .. v23}, Ljava/lang/Math;->round(F)I

    .line 616
    .line 617
    .line 618
    move-result v7

    .line 619
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 620
    .line 621
    .line 622
    move-result v29

    .line 623
    sub-int v7, v7, v29

    .line 624
    .line 625
    move/from16 v29, v17

    .line 626
    .line 627
    invoke-static/range {v23 .. v23}, Ljava/lang/Math;->round(F)I

    .line 628
    .line 629
    .line 630
    move-result v17

    .line 631
    move/from16 v30, v10

    .line 632
    .line 633
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 634
    .line 635
    move/from16 v31, v15

    .line 636
    .line 637
    move v15, v7

    .line 638
    move/from16 v7, v31

    .line 639
    .line 640
    move/from16 v31, v14

    .line 641
    .line 642
    move v14, v3

    .line 643
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/a;->l(Landroid/view/View;Lt2/a;ZIIII)V

    .line 644
    .line 645
    .line 646
    goto :goto_8

    .line 647
    :cond_d
    move/from16 v30, v10

    .line 648
    .line 649
    move/from16 v31, v14

    .line 650
    .line 651
    move v7, v15

    .line 652
    move/from16 v29, v17

    .line 653
    .line 654
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 655
    .line 656
    .line 657
    move-result v3

    .line 658
    sub-int v14, v16, v3

    .line 659
    .line 660
    invoke-static/range {v27 .. v27}, Ljava/lang/Math;->round(F)I

    .line 661
    .line 662
    .line 663
    move-result v15

    .line 664
    invoke-static/range {v27 .. v27}, Ljava/lang/Math;->round(F)I

    .line 665
    .line 666
    .line 667
    move-result v3

    .line 668
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 669
    .line 670
    .line 671
    move-result v10

    .line 672
    add-int v17, v10, v3

    .line 673
    .line 674
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 675
    .line 676
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/a;->l(Landroid/view/View;Lt2/a;ZIIII)V

    .line 677
    .line 678
    .line 679
    goto :goto_8

    .line 680
    :cond_e
    move/from16 v30, v10

    .line 681
    .line 682
    move/from16 v31, v14

    .line 683
    .line 684
    move v7, v15

    .line 685
    move/from16 v29, v17

    .line 686
    .line 687
    iget-boolean v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Z

    .line 688
    .line 689
    if-eqz v10, :cond_f

    .line 690
    .line 691
    invoke-static/range {v23 .. v23}, Ljava/lang/Math;->round(F)I

    .line 692
    .line 693
    .line 694
    move-result v10

    .line 695
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 696
    .line 697
    .line 698
    move-result v14

    .line 699
    sub-int v15, v10, v14

    .line 700
    .line 701
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 702
    .line 703
    .line 704
    move-result v10

    .line 705
    add-int v16, v10, v3

    .line 706
    .line 707
    invoke-static/range {v23 .. v23}, Ljava/lang/Math;->round(F)I

    .line 708
    .line 709
    .line 710
    move-result v17

    .line 711
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 712
    .line 713
    move v14, v3

    .line 714
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/a;->l(Landroid/view/View;Lt2/a;ZIIII)V

    .line 715
    .line 716
    .line 717
    goto :goto_8

    .line 718
    :cond_f
    move v14, v3

    .line 719
    invoke-static/range {v27 .. v27}, Ljava/lang/Math;->round(F)I

    .line 720
    .line 721
    .line 722
    move-result v15

    .line 723
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 724
    .line 725
    .line 726
    move-result v3

    .line 727
    add-int v16, v3, v14

    .line 728
    .line 729
    invoke-static/range {v27 .. v27}, Ljava/lang/Math;->round(F)I

    .line 730
    .line 731
    .line 732
    move-result v3

    .line 733
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 734
    .line 735
    .line 736
    move-result v10

    .line 737
    add-int v17, v10, v3

    .line 738
    .line 739
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 740
    .line 741
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/a;->l(Landroid/view/View;Lt2/a;ZIIII)V

    .line 742
    .line 743
    .line 744
    :goto_8
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 745
    .line 746
    .line 747
    move-result v3

    .line 748
    iget v10, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 749
    .line 750
    add-int/2addr v3, v10

    .line 751
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 752
    .line 753
    .line 754
    move-result-object v10

    .line 755
    check-cast v10, Landroidx/recyclerview/widget/x;

    .line 756
    .line 757
    iget-object v10, v10, Landroidx/recyclerview/widget/x;->t:Landroid/graphics/Rect;

    .line 758
    .line 759
    iget v10, v10, Landroid/graphics/Rect;->bottom:I

    .line 760
    .line 761
    add-int/2addr v3, v10

    .line 762
    int-to-float v3, v3

    .line 763
    add-float/2addr v3, v9

    .line 764
    add-float v3, v3, v27

    .line 765
    .line 766
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 767
    .line 768
    .line 769
    move-result v10

    .line 770
    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 771
    .line 772
    add-int/2addr v10, v4

    .line 773
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 774
    .line 775
    .line 776
    move-result-object v4

    .line 777
    check-cast v4, Landroidx/recyclerview/widget/x;

    .line 778
    .line 779
    iget-object v4, v4, Landroidx/recyclerview/widget/x;->t:Landroid/graphics/Rect;

    .line 780
    .line 781
    iget v4, v4, Landroid/graphics/Rect;->top:I

    .line 782
    .line 783
    add-int/2addr v10, v4

    .line 784
    int-to-float v4, v10

    .line 785
    add-float/2addr v4, v9

    .line 786
    sub-float v13, v23, v4

    .line 787
    .line 788
    add-int/lit8 v14, v31, 0x1

    .line 789
    .line 790
    move v4, v3

    .line 791
    move-object/from16 v29, v5

    .line 792
    .line 793
    move v11, v7

    .line 794
    move/from16 v7, v19

    .line 795
    .line 796
    move-object/from16 v3, v26

    .line 797
    .line 798
    move/from16 v10, v30

    .line 799
    .line 800
    const/4 v5, -0x1

    .line 801
    goto/16 :goto_6

    .line 802
    .line 803
    :cond_10
    move/from16 v19, v7

    .line 804
    .line 805
    iget v3, v2, Lt2/c;->c:I

    .line 806
    .line 807
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 808
    .line 809
    iget v4, v4, Lt2/c;->h:I

    .line 810
    .line 811
    add-int/2addr v3, v4

    .line 812
    iput v3, v2, Lt2/c;->c:I

    .line 813
    .line 814
    iget v3, v12, Lt2/a;->c:I

    .line 815
    .line 816
    :goto_9
    add-int/2addr v8, v3

    .line 817
    if-nez v24, :cond_11

    .line 818
    .line 819
    iget-boolean v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 820
    .line 821
    if-eqz v3, :cond_11

    .line 822
    .line 823
    iget v3, v2, Lt2/c;->e:I

    .line 824
    .line 825
    iget v4, v12, Lt2/a;->c:I

    .line 826
    .line 827
    iget v5, v2, Lt2/c;->h:I

    .line 828
    .line 829
    mul-int/2addr v4, v5

    .line 830
    sub-int/2addr v3, v4

    .line 831
    iput v3, v2, Lt2/c;->e:I

    .line 832
    .line 833
    goto :goto_a

    .line 834
    :cond_11
    iget v3, v2, Lt2/c;->e:I

    .line 835
    .line 836
    iget v4, v12, Lt2/a;->c:I

    .line 837
    .line 838
    iget v5, v2, Lt2/c;->h:I

    .line 839
    .line 840
    mul-int/2addr v4, v5

    .line 841
    add-int/2addr v4, v3

    .line 842
    iput v4, v2, Lt2/c;->e:I

    .line 843
    .line 844
    :goto_a
    iget v3, v12, Lt2/a;->c:I

    .line 845
    .line 846
    sub-int v7, v19, v3

    .line 847
    .line 848
    move/from16 v3, v21

    .line 849
    .line 850
    move/from16 v5, v24

    .line 851
    .line 852
    const/high16 v4, -0x80000000

    .line 853
    .line 854
    goto/16 :goto_0

    .line 855
    .line 856
    :goto_b
    iget v3, v2, Lt2/c;->a:I

    .line 857
    .line 858
    sub-int/2addr v3, v8

    .line 859
    iput v3, v2, Lt2/c;->a:I

    .line 860
    .line 861
    iget v4, v2, Lt2/c;->f:I

    .line 862
    .line 863
    const/high16 v5, -0x80000000

    .line 864
    .line 865
    if-eq v4, v5, :cond_13

    .line 866
    .line 867
    add-int/2addr v4, v8

    .line 868
    iput v4, v2, Lt2/c;->f:I

    .line 869
    .line 870
    if-gez v3, :cond_12

    .line 871
    .line 872
    add-int/2addr v4, v3

    .line 873
    iput v4, v2, Lt2/c;->f:I

    .line 874
    .line 875
    :cond_12
    invoke-virtual {v0, v1, v2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->c1(Landroidx/recyclerview/widget/A;Lt2/c;)V

    .line 876
    .line 877
    .line 878
    :cond_13
    iget v1, v2, Lt2/c;->a:I

    .line 879
    .line 880
    sub-int v3, v21, v1

    .line 881
    .line 882
    return v3
.end method

.method public final O0(I)Landroid/view/View;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->w()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-virtual {p0, v0, v1, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->T0(III)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p1}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/google/android/flexbox/a;->c:[I

    .line 20
    .line 21
    aget v0, v1, v0

    .line 22
    .line 23
    const/4 v1, -0x1

    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    :goto_0
    const/4 p1, 0x0

    .line 27
    return-object p1

    .line 28
    :cond_1
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lt2/a;

    .line 35
    .line 36
    invoke-virtual {p0, p1, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->P0(Landroid/view/View;Lt2/a;)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
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
.end method

.method public final P0(Landroid/view/View;Lt2/a;)Landroid/view/View;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget p2, p2, Lt2/a;->d:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    :goto_0
    if-ge v1, p2, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/16 v4, 0x8

    .line 21
    .line 22
    if-ne v3, v4, :cond_0

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    iget-boolean v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 32
    .line 33
    invoke-virtual {v3, p1}, LJ0/p;->b(Landroid/view/View;)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 38
    .line 39
    invoke-virtual {v4, v2}, LJ0/p;->b(Landroid/view/View;)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-ge v3, v4, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 47
    .line 48
    invoke-virtual {v3, p1}, LJ0/p;->e(Landroid/view/View;)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 53
    .line 54
    invoke-virtual {v4, v2}, LJ0/p;->e(Landroid/view/View;)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-le v3, v4, :cond_2

    .line 59
    .line 60
    :goto_1
    move-object p1, v2

    .line 61
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    return-object p1
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
.end method

.method public final Q0(I)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->w()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    invoke-virtual {p0, v0, v1, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->T0(III)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-static {p1}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 21
    .line 22
    iget-object v1, v1, Lcom/google/android/flexbox/a;->c:[I

    .line 23
    .line 24
    aget v0, v1, v0

    .line 25
    .line 26
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lt2/a;

    .line 33
    .line 34
    invoke-virtual {p0, p1, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->R0(Landroid/view/View;Lt2/a;)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
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
.end method

.method public final R0(Landroid/view/View;Lt2/a;)Landroid/view/View;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->w()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x2

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->w()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget p2, p2, Lt2/a;->d:I

    .line 16
    .line 17
    sub-int/2addr v2, p2

    .line 18
    add-int/lit8 v2, v2, -0x1

    .line 19
    .line 20
    :goto_0
    if-le v1, v2, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-eqz p2, :cond_2

    .line 27
    .line 28
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/16 v4, 0x8

    .line 33
    .line 34
    if-ne v3, v4, :cond_0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    iget-boolean v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 44
    .line 45
    invoke-virtual {v3, p1}, LJ0/p;->e(Landroid/view/View;)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 50
    .line 51
    invoke-virtual {v4, p2}, LJ0/p;->e(Landroid/view/View;)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-le v3, v4, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 59
    .line 60
    invoke-virtual {v3, p1}, LJ0/p;->b(Landroid/view/View;)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 65
    .line 66
    invoke-virtual {v4, p2}, LJ0/p;->b(Landroid/view/View;)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-ge v3, v4, :cond_2

    .line 71
    .line 72
    :goto_1
    move-object p1, p2

    .line 73
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, -0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    return-object p1
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
.end method

.method public final S0(II)Landroid/view/View;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    if-le p2, p1, :cond_0

    .line 3
    .line 4
    move v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, -0x1

    .line 7
    :goto_0
    if-eq p1, p2, :cond_6

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->J()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->L()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    iget v5, p0, Landroidx/recyclerview/widget/w;->o:I

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->K()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    sub-int/2addr v5, v6

    .line 28
    iget v6, p0, Landroidx/recyclerview/widget/w;->p:I

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->I()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    sub-int/2addr v6, v7

    .line 35
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    check-cast v7, Landroidx/recyclerview/widget/x;

    .line 40
    .line 41
    invoke-static {v2}, Landroidx/recyclerview/widget/w;->B(Landroid/view/View;)I

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 46
    .line 47
    sub-int/2addr v8, v7

    .line 48
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    check-cast v7, Landroidx/recyclerview/widget/x;

    .line 53
    .line 54
    invoke-static {v2}, Landroidx/recyclerview/widget/w;->F(Landroid/view/View;)I

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 59
    .line 60
    sub-int/2addr v9, v7

    .line 61
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    check-cast v7, Landroidx/recyclerview/widget/x;

    .line 66
    .line 67
    invoke-static {v2}, Landroidx/recyclerview/widget/w;->E(Landroid/view/View;)I

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 72
    .line 73
    add-int/2addr v10, v7

    .line 74
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    check-cast v7, Landroidx/recyclerview/widget/x;

    .line 79
    .line 80
    invoke-static {v2}, Landroidx/recyclerview/widget/w;->z(Landroid/view/View;)I

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 85
    .line 86
    add-int/2addr v11, v7

    .line 87
    const/4 v7, 0x0

    .line 88
    if-ge v8, v5, :cond_2

    .line 89
    .line 90
    if-lt v10, v3, :cond_1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move v3, v7

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    :goto_1
    move v3, v0

    .line 96
    :goto_2
    if-ge v9, v6, :cond_3

    .line 97
    .line 98
    if-lt v11, v4, :cond_4

    .line 99
    .line 100
    :cond_3
    move v7, v0

    .line 101
    :cond_4
    if-eqz v3, :cond_5

    .line 102
    .line 103
    if-eqz v7, :cond_5

    .line 104
    .line 105
    return-object v2

    .line 106
    :cond_5
    add-int/2addr p1, v1

    .line 107
    goto :goto_0

    .line 108
    :cond_6
    const/4 p1, 0x0

    .line 109
    return-object p1
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
.end method

.method public final T0(III)Landroid/view/View;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lt2/c;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput v1, v0, Lt2/c;->h:I

    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 19
    .line 20
    invoke-virtual {v0}, LJ0/p;->k()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 25
    .line 26
    invoke-virtual {v2}, LJ0/p;->g()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-le p2, p1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v1, -0x1

    .line 34
    :goto_0
    const/4 v3, 0x0

    .line 35
    move-object v4, v3

    .line 36
    :goto_1
    if-eq p1, p2, :cond_6

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-static {v5}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-ltz v6, :cond_5

    .line 47
    .line 48
    if-ge v6, p3, :cond_5

    .line 49
    .line 50
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    check-cast v6, Landroidx/recyclerview/widget/x;

    .line 55
    .line 56
    iget-object v6, v6, Landroidx/recyclerview/widget/x;->s:Landroidx/recyclerview/widget/RecyclerView$a;

    .line 57
    .line 58
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView$a;->j()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_2

    .line 63
    .line 64
    if-nez v4, :cond_5

    .line 65
    .line 66
    move-object v4, v5

    .line 67
    goto :goto_3

    .line 68
    :cond_2
    iget-object v6, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 69
    .line 70
    invoke-virtual {v6, v5}, LJ0/p;->e(Landroid/view/View;)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-lt v6, v0, :cond_4

    .line 75
    .line 76
    iget-object v6, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 77
    .line 78
    invoke-virtual {v6, v5}, LJ0/p;->b(Landroid/view/View;)I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-le v6, v2, :cond_3

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    return-object v5

    .line 86
    :cond_4
    :goto_2
    if-nez v3, :cond_5

    .line 87
    .line 88
    move-object v3, v5

    .line 89
    :cond_5
    :goto_3
    add-int/2addr p1, v1

    .line 90
    goto :goto_1

    .line 91
    :cond_6
    if-eqz v3, :cond_7

    .line 92
    .line 93
    return-object v3

    .line 94
    :cond_7
    return-object v4
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

.method public final U0(ILandroidx/recyclerview/widget/A;LJ0/D;Z)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 12
    .line 13
    invoke-virtual {v0}, LJ0/p;->k()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sub-int v0, p1, v0

    .line 18
    .line 19
    if-lez v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v0, p3, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z0(ILJ0/D;Landroidx/recyclerview/widget/A;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 27
    .line 28
    invoke-virtual {v0}, LJ0/p;->g()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sub-int/2addr v0, p1

    .line 33
    if-lez v0, :cond_2

    .line 34
    .line 35
    neg-int v0, v0

    .line 36
    invoke-virtual {p0, v0, p3, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z0(ILJ0/D;Landroidx/recyclerview/widget/A;)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    neg-int p2, p2

    .line 41
    :goto_0
    add-int/2addr p1, p2

    .line 42
    if-eqz p4, :cond_1

    .line 43
    .line 44
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 45
    .line 46
    invoke-virtual {p3}, LJ0/p;->g()I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    sub-int/2addr p3, p1

    .line 51
    if-lez p3, :cond_1

    .line 52
    .line 53
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 54
    .line 55
    invoke-virtual {p1, p3}, LJ0/p;->p(I)V

    .line 56
    .line 57
    .line 58
    add-int/2addr p3, p2

    .line 59
    return p3

    .line 60
    :cond_1
    return p2

    .line 61
    :cond_2
    const/4 p1, 0x0

    .line 62
    return p1
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
.end method

.method public final V()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->p0()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public final V0(ILandroidx/recyclerview/widget/A;LJ0/D;Z)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 12
    .line 13
    invoke-virtual {v0}, LJ0/p;->g()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sub-int/2addr v0, p1

    .line 18
    if-lez v0, :cond_2

    .line 19
    .line 20
    neg-int v0, v0

    .line 21
    invoke-virtual {p0, v0, p3, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z0(ILJ0/D;Landroidx/recyclerview/widget/A;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 27
    .line 28
    invoke-virtual {v0}, LJ0/p;->k()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sub-int v0, p1, v0

    .line 33
    .line 34
    if-lez v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0, v0, p3, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z0(ILJ0/D;Landroidx/recyclerview/widget/A;)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    neg-int p2, p2

    .line 41
    :goto_0
    add-int/2addr p1, p2

    .line 42
    if-eqz p4, :cond_1

    .line 43
    .line 44
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 45
    .line 46
    invoke-virtual {p3}, LJ0/p;->k()I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    sub-int/2addr p1, p3

    .line 51
    if-lez p1, :cond_1

    .line 52
    .line 53
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 54
    .line 55
    neg-int p4, p1

    .line 56
    invoke-virtual {p3, p4}, LJ0/p;->p(I)V

    .line 57
    .line 58
    .line 59
    sub-int/2addr p2, p1

    .line 60
    :cond_1
    return p2

    .line 61
    :cond_2
    const/4 p1, 0x0

    .line 62
    return p1
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
.end method

.method public final W(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->L:Landroid/view/View;

    .line 8
    .line 9
    return-void
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

.method public final W0(Landroid/view/View;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroidx/recyclerview/widget/x;

    .line 12
    .line 13
    iget-object v0, v0, Landroidx/recyclerview/widget/x;->t:Landroid/graphics/Rect;

    .line 14
    .line 15
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Landroidx/recyclerview/widget/x;

    .line 22
    .line 23
    iget-object p1, p1, Landroidx/recyclerview/widget/x;->t:Landroid/graphics/Rect;

    .line 24
    .line 25
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 26
    .line 27
    add-int/2addr v0, p1

    .line 28
    return v0

    .line 29
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroidx/recyclerview/widget/x;

    .line 34
    .line 35
    iget-object v0, v0, Landroidx/recyclerview/widget/x;->t:Landroid/graphics/Rect;

    .line 36
    .line 37
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Landroidx/recyclerview/widget/x;

    .line 44
    .line 45
    iget-object p1, p1, Landroidx/recyclerview/widget/x;->t:Landroid/graphics/Rect;

    .line 46
    .line 47
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 48
    .line 49
    add-int/2addr v0, p1

    .line 50
    return v0
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
.end method

.method public final X(Landroidx/recyclerview/widget/RecyclerView;)V
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final X0(I)Landroid/view/View;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->J:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/View;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->y:Landroidx/recyclerview/widget/A;

    .line 13
    .line 14
    const-wide v1, 0x7fffffffffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1, v1, v2}, Landroidx/recyclerview/widget/A;->k(IJ)Landroidx/recyclerview/widget/RecyclerView$a;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$a;->s:Landroid/view/View;

    .line 24
    .line 25
    return-object p1
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final Y0()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/high16 v2, -0x80000000

    .line 18
    .line 19
    :goto_0
    if-ge v1, v0, :cond_1

    .line 20
    .line 21
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lt2/a;

    .line 28
    .line 29
    iget v3, v3, Lt2/a;->a:I

    .line 30
    .line 31
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return v2
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

.method public final Z0(ILJ0/D;Landroidx/recyclerview/widget/A;)I
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/w;->w()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_14

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_d

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->M0()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    iput-boolean v3, v1, Lt2/c;->i:Z

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    iget-boolean v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    move v1, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v1, v2

    .line 35
    :goto_0
    const/4 v4, -0x1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-gez p1, :cond_2

    .line 39
    .line 40
    :goto_1
    move v5, v3

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move v5, v4

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    if-lez p1, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :goto_2
    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(I)I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 52
    .line 53
    iput v5, v7, Lt2/c;->h:I

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    iget v8, v0, Landroidx/recyclerview/widget/w;->o:I

    .line 60
    .line 61
    iget v9, v0, Landroidx/recyclerview/widget/w;->m:I

    .line 62
    .line 63
    invoke-static {v8, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 64
    .line 65
    .line 66
    move-result v12

    .line 67
    iget v8, v0, Landroidx/recyclerview/widget/w;->p:I

    .line 68
    .line 69
    iget v9, v0, Landroidx/recyclerview/widget/w;->n:I

    .line 70
    .line 71
    invoke-static {v8, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 72
    .line 73
    .line 74
    move-result v13

    .line 75
    if-nez v7, :cond_4

    .line 76
    .line 77
    iget-boolean v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 78
    .line 79
    if-eqz v8, :cond_4

    .line 80
    .line 81
    move v8, v3

    .line 82
    goto :goto_3

    .line 83
    :cond_4
    move v8, v2

    .line 84
    :goto_3
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 85
    .line 86
    if-ne v5, v3, :cond_a

    .line 87
    .line 88
    invoke-virtual {v0}, Landroidx/recyclerview/widget/w;->w()I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    sub-int/2addr v10, v3

    .line 93
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    iget-object v11, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 98
    .line 99
    iget-object v14, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 100
    .line 101
    invoke-virtual {v14, v10}, LJ0/p;->b(Landroid/view/View;)I

    .line 102
    .line 103
    .line 104
    move-result v14

    .line 105
    iput v14, v11, Lt2/c;->e:I

    .line 106
    .line 107
    invoke-static {v10}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    iget-object v14, v9, Lcom/google/android/flexbox/a;->c:[I

    .line 112
    .line 113
    aget v14, v14, v11

    .line 114
    .line 115
    iget-object v15, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 116
    .line 117
    invoke-interface {v15, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v14

    .line 121
    check-cast v14, Lt2/a;

    .line 122
    .line 123
    invoke-virtual {v0, v10, v14}, Lcom/google/android/flexbox/FlexboxLayoutManager;->R0(Landroid/view/View;Lt2/a;)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    iget-object v14, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 128
    .line 129
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    add-int/2addr v11, v3

    .line 133
    iput v11, v14, Lt2/c;->d:I

    .line 134
    .line 135
    iget-object v15, v9, Lcom/google/android/flexbox/a;->c:[I

    .line 136
    .line 137
    move/from16 v16, v3

    .line 138
    .line 139
    array-length v3, v15

    .line 140
    if-gt v3, v11, :cond_5

    .line 141
    .line 142
    iput v4, v14, Lt2/c;->c:I

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_5
    aget v3, v15, v11

    .line 146
    .line 147
    iput v3, v14, Lt2/c;->c:I

    .line 148
    .line 149
    :goto_4
    if-eqz v8, :cond_7

    .line 150
    .line 151
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 152
    .line 153
    invoke-virtual {v3, v10}, LJ0/p;->e(Landroid/view/View;)I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    iput v3, v14, Lt2/c;->e:I

    .line 158
    .line 159
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 160
    .line 161
    iget-object v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 162
    .line 163
    invoke-virtual {v8, v10}, LJ0/p;->e(Landroid/view/View;)I

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    neg-int v8, v8

    .line 168
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 169
    .line 170
    invoke-virtual {v10}, LJ0/p;->k()I

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    add-int/2addr v10, v8

    .line 175
    iput v10, v3, Lt2/c;->f:I

    .line 176
    .line 177
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 178
    .line 179
    iget v8, v3, Lt2/c;->f:I

    .line 180
    .line 181
    if-ltz v8, :cond_6

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_6
    move v8, v2

    .line 185
    :goto_5
    iput v8, v3, Lt2/c;->f:I

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_7
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 189
    .line 190
    invoke-virtual {v3, v10}, LJ0/p;->b(Landroid/view/View;)I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    iput v3, v14, Lt2/c;->e:I

    .line 195
    .line 196
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 197
    .line 198
    iget-object v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 199
    .line 200
    invoke-virtual {v8, v10}, LJ0/p;->b(Landroid/view/View;)I

    .line 201
    .line 202
    .line 203
    move-result v8

    .line 204
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 205
    .line 206
    invoke-virtual {v10}, LJ0/p;->g()I

    .line 207
    .line 208
    .line 209
    move-result v10

    .line 210
    sub-int/2addr v8, v10

    .line 211
    iput v8, v3, Lt2/c;->f:I

    .line 212
    .line 213
    :goto_6
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 214
    .line 215
    iget v3, v3, Lt2/c;->c:I

    .line 216
    .line 217
    if-eq v3, v4, :cond_8

    .line 218
    .line 219
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 220
    .line 221
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    add-int/lit8 v4, v4, -0x1

    .line 226
    .line 227
    if-le v3, v4, :cond_10

    .line 228
    .line 229
    :cond_8
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 230
    .line 231
    iget v3, v3, Lt2/c;->d:I

    .line 232
    .line 233
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:LJ0/D;

    .line 234
    .line 235
    invoke-virtual {v4}, LJ0/D;->b()I

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-gt v3, v4, :cond_10

    .line 240
    .line 241
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 242
    .line 243
    iget v4, v3, Lt2/c;->f:I

    .line 244
    .line 245
    sub-int v14, v6, v4

    .line 246
    .line 247
    iget-object v11, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->N:Lg9/g;

    .line 248
    .line 249
    const/4 v4, 0x0

    .line 250
    iput-object v4, v11, Lg9/g;->a:Ljava/util/List;

    .line 251
    .line 252
    if-lez v14, :cond_10

    .line 253
    .line 254
    if-eqz v7, :cond_9

    .line 255
    .line 256
    iget v15, v3, Lt2/c;->d:I

    .line 257
    .line 258
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 259
    .line 260
    const/16 v16, -0x1

    .line 261
    .line 262
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 263
    .line 264
    move-object/from16 v17, v3

    .line 265
    .line 266
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/a;->a(Lg9/g;IIIIILjava/util/List;)V

    .line 267
    .line 268
    .line 269
    goto :goto_7

    .line 270
    :cond_9
    iget v15, v3, Lt2/c;->d:I

    .line 271
    .line 272
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 273
    .line 274
    const/16 v16, -0x1

    .line 275
    .line 276
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 277
    .line 278
    move/from16 v17, v13

    .line 279
    .line 280
    move v13, v12

    .line 281
    move/from16 v12, v17

    .line 282
    .line 283
    move-object/from16 v17, v3

    .line 284
    .line 285
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/a;->a(Lg9/g;IIIIILjava/util/List;)V

    .line 286
    .line 287
    .line 288
    move/from16 v18, v13

    .line 289
    .line 290
    move v13, v12

    .line 291
    move/from16 v12, v18

    .line 292
    .line 293
    :goto_7
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 294
    .line 295
    iget v3, v3, Lt2/c;->d:I

    .line 296
    .line 297
    invoke-virtual {v9, v12, v13, v3}, Lcom/google/android/flexbox/a;->d(III)V

    .line 298
    .line 299
    .line 300
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 301
    .line 302
    iget v3, v3, Lt2/c;->d:I

    .line 303
    .line 304
    invoke-virtual {v9, v3}, Lcom/google/android/flexbox/a;->p(I)V

    .line 305
    .line 306
    .line 307
    goto/16 :goto_b

    .line 308
    .line 309
    :cond_a
    move/from16 v16, v3

    .line 310
    .line 311
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 316
    .line 317
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 318
    .line 319
    invoke-virtual {v10, v3}, LJ0/p;->e(Landroid/view/View;)I

    .line 320
    .line 321
    .line 322
    move-result v10

    .line 323
    iput v10, v7, Lt2/c;->e:I

    .line 324
    .line 325
    invoke-static {v3}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 326
    .line 327
    .line 328
    move-result v7

    .line 329
    iget-object v10, v9, Lcom/google/android/flexbox/a;->c:[I

    .line 330
    .line 331
    aget v10, v10, v7

    .line 332
    .line 333
    iget-object v11, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 334
    .line 335
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v10

    .line 339
    check-cast v10, Lt2/a;

    .line 340
    .line 341
    invoke-virtual {v0, v3, v10}, Lcom/google/android/flexbox/FlexboxLayoutManager;->P0(Landroid/view/View;Lt2/a;)Landroid/view/View;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 346
    .line 347
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    iget-object v9, v9, Lcom/google/android/flexbox/a;->c:[I

    .line 351
    .line 352
    aget v9, v9, v7

    .line 353
    .line 354
    if-ne v9, v4, :cond_b

    .line 355
    .line 356
    move v9, v2

    .line 357
    :cond_b
    if-lez v9, :cond_c

    .line 358
    .line 359
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 360
    .line 361
    add-int/lit8 v10, v9, -0x1

    .line 362
    .line 363
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    check-cast v4, Lt2/a;

    .line 368
    .line 369
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 370
    .line 371
    iget v4, v4, Lt2/a;->d:I

    .line 372
    .line 373
    sub-int/2addr v7, v4

    .line 374
    iput v7, v10, Lt2/c;->d:I

    .line 375
    .line 376
    goto :goto_8

    .line 377
    :cond_c
    iput v4, v10, Lt2/c;->d:I

    .line 378
    .line 379
    :goto_8
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 380
    .line 381
    if-lez v9, :cond_d

    .line 382
    .line 383
    add-int/lit8 v9, v9, -0x1

    .line 384
    .line 385
    goto :goto_9

    .line 386
    :cond_d
    move v9, v2

    .line 387
    :goto_9
    iput v9, v4, Lt2/c;->c:I

    .line 388
    .line 389
    if-eqz v8, :cond_f

    .line 390
    .line 391
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 392
    .line 393
    invoke-virtual {v7, v3}, LJ0/p;->b(Landroid/view/View;)I

    .line 394
    .line 395
    .line 396
    move-result v7

    .line 397
    iput v7, v4, Lt2/c;->e:I

    .line 398
    .line 399
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 400
    .line 401
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 402
    .line 403
    invoke-virtual {v7, v3}, LJ0/p;->b(Landroid/view/View;)I

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 408
    .line 409
    invoke-virtual {v7}, LJ0/p;->g()I

    .line 410
    .line 411
    .line 412
    move-result v7

    .line 413
    sub-int/2addr v3, v7

    .line 414
    iput v3, v4, Lt2/c;->f:I

    .line 415
    .line 416
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 417
    .line 418
    iget v4, v3, Lt2/c;->f:I

    .line 419
    .line 420
    if-ltz v4, :cond_e

    .line 421
    .line 422
    goto :goto_a

    .line 423
    :cond_e
    move v4, v2

    .line 424
    :goto_a
    iput v4, v3, Lt2/c;->f:I

    .line 425
    .line 426
    goto :goto_b

    .line 427
    :cond_f
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 428
    .line 429
    invoke-virtual {v7, v3}, LJ0/p;->e(Landroid/view/View;)I

    .line 430
    .line 431
    .line 432
    move-result v7

    .line 433
    iput v7, v4, Lt2/c;->e:I

    .line 434
    .line 435
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 436
    .line 437
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 438
    .line 439
    invoke-virtual {v7, v3}, LJ0/p;->e(Landroid/view/View;)I

    .line 440
    .line 441
    .line 442
    move-result v3

    .line 443
    neg-int v3, v3

    .line 444
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 445
    .line 446
    invoke-virtual {v7}, LJ0/p;->k()I

    .line 447
    .line 448
    .line 449
    move-result v7

    .line 450
    add-int/2addr v7, v3

    .line 451
    iput v7, v4, Lt2/c;->f:I

    .line 452
    .line 453
    :cond_10
    :goto_b
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 454
    .line 455
    iget v4, v3, Lt2/c;->f:I

    .line 456
    .line 457
    sub-int v7, v6, v4

    .line 458
    .line 459
    iput v7, v3, Lt2/c;->a:I

    .line 460
    .line 461
    move-object/from16 v7, p2

    .line 462
    .line 463
    move-object/from16 v8, p3

    .line 464
    .line 465
    invoke-virtual {v0, v8, v7, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->N0(Landroidx/recyclerview/widget/A;LJ0/D;Lt2/c;)I

    .line 466
    .line 467
    .line 468
    move-result v3

    .line 469
    add-int/2addr v3, v4

    .line 470
    if-gez v3, :cond_11

    .line 471
    .line 472
    goto :goto_d

    .line 473
    :cond_11
    if-eqz v1, :cond_13

    .line 474
    .line 475
    if-le v6, v3, :cond_12

    .line 476
    .line 477
    neg-int v1, v5

    .line 478
    mul-int/2addr v1, v3

    .line 479
    goto :goto_c

    .line 480
    :cond_12
    move/from16 v1, p1

    .line 481
    .line 482
    goto :goto_c

    .line 483
    :cond_13
    if-le v6, v3, :cond_12

    .line 484
    .line 485
    mul-int v1, v5, v3

    .line 486
    .line 487
    :goto_c
    iget-object v2, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 488
    .line 489
    neg-int v3, v1

    .line 490
    invoke-virtual {v2, v3}, LJ0/p;->p(I)V

    .line 491
    .line 492
    .line 493
    iget-object v2, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 494
    .line 495
    iput v1, v2, Lt2/c;->g:I

    .line 496
    .line 497
    return v1

    .line 498
    :cond_14
    :goto_d
    return v2
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
.end method

.method public final a(I)Landroid/graphics/PointF;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->w()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-ge p1, v0, :cond_1

    .line 19
    .line 20
    const/4 p1, -0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p1, 0x1

    .line 23
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    new-instance v0, Landroid/graphics/PointF;

    .line 31
    .line 32
    int-to-float p1, p1

    .line 33
    invoke-direct {v0, v1, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_2
    new-instance v0, Landroid/graphics/PointF;

    .line 38
    .line 39
    int-to-float p1, p1

    .line 40
    invoke-direct {v0, p1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 41
    .line 42
    .line 43
    return-object v0
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
.end method

.method public final a1(I)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->w()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->M0()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->L:Landroid/view/View;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    :goto_0
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget v0, p0, Landroidx/recyclerview/widget/w;->o:I

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    iget v0, p0, Landroidx/recyclerview/widget/w;->p:I

    .line 36
    .line 37
    :goto_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->H()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/4 v3, 0x1

    .line 42
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:Lt2/b;

    .line 43
    .line 44
    if-ne v2, v3, :cond_4

    .line 45
    .line 46
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-gez p1, :cond_3

    .line 51
    .line 52
    iget p1, v4, Lt2/b;->d:I

    .line 53
    .line 54
    add-int/2addr v0, p1

    .line 55
    sub-int/2addr v0, v1

    .line 56
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    neg-int p1, p1

    .line 61
    return p1

    .line 62
    :cond_3
    iget v0, v4, Lt2/b;->d:I

    .line 63
    .line 64
    add-int v1, v0, p1

    .line 65
    .line 66
    if-lez v1, :cond_6

    .line 67
    .line 68
    neg-int p1, v0

    .line 69
    return p1

    .line 70
    :cond_4
    if-lez p1, :cond_5

    .line 71
    .line 72
    iget v2, v4, Lt2/b;->d:I

    .line 73
    .line 74
    sub-int/2addr v0, v2

    .line 75
    sub-int/2addr v0, v1

    .line 76
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    return p1

    .line 81
    :cond_5
    iget v0, v4, Lt2/b;->d:I

    .line 82
    .line 83
    add-int v1, v0, p1

    .line 84
    .line 85
    if-ltz v1, :cond_7

    .line 86
    .line 87
    :cond_6
    return p1

    .line 88
    :cond_7
    neg-int p1, v0

    .line 89
    return p1

    .line 90
    :cond_8
    :goto_2
    const/4 p1, 0x0

    .line 91
    return p1
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
.end method

.method public final b1()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_1
    :goto_0
    return v1
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

.method public final c1(Landroidx/recyclerview/widget/A;Lt2/c;)V
    .locals 9

    .line 1
    iget-boolean v0, p2, Lt2/c;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_6

    .line 6
    .line 7
    :cond_0
    iget v0, p2, Lt2/c;->h:I

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    iget-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 11
    .line 12
    if-ne v0, v1, :cond_9

    .line 13
    .line 14
    iget v0, p2, Lt2/c;->f:I

    .line 15
    .line 16
    if-gez v0, :cond_1

    .line 17
    .line 18
    goto/16 :goto_6

    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 21
    .line 22
    invoke-virtual {v0}, LJ0/p;->f()I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->w()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :cond_2
    add-int/lit8 v3, v0, -0x1

    .line 34
    .line 35
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iget-object v2, v2, Lcom/google/android/flexbox/a;->c:[I

    .line 40
    .line 41
    invoke-static {v4}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    aget v2, v2, v4

    .line 46
    .line 47
    if-ne v2, v1, :cond_3

    .line 48
    .line 49
    goto/16 :goto_6

    .line 50
    .line 51
    :cond_3
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Lt2/a;

    .line 58
    .line 59
    move v4, v3

    .line 60
    :goto_0
    if-ltz v4, :cond_7

    .line 61
    .line 62
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    iget v6, p2, Lt2/c;->f:I

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-nez v7, :cond_4

    .line 73
    .line 74
    iget-boolean v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 75
    .line 76
    if-eqz v7, :cond_4

    .line 77
    .line 78
    iget-object v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 79
    .line 80
    invoke-virtual {v7, v5}, LJ0/p;->b(Landroid/view/View;)I

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-gt v7, v6, :cond_7

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    iget-object v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 88
    .line 89
    invoke-virtual {v7, v5}, LJ0/p;->e(Landroid/view/View;)I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    iget-object v8, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 94
    .line 95
    invoke-virtual {v8}, LJ0/p;->f()I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    sub-int/2addr v8, v6

    .line 100
    if-lt v7, v8, :cond_7

    .line 101
    .line 102
    :goto_1
    iget v6, v1, Lt2/a;->k:I

    .line 103
    .line 104
    invoke-static {v5}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-ne v6, v5, :cond_6

    .line 109
    .line 110
    if-gtz v2, :cond_5

    .line 111
    .line 112
    move v0, v4

    .line 113
    goto :goto_2

    .line 114
    :cond_5
    iget v0, p2, Lt2/c;->h:I

    .line 115
    .line 116
    add-int/2addr v2, v0

    .line 117
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 118
    .line 119
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Lt2/a;

    .line 124
    .line 125
    move-object v1, v0

    .line 126
    move v0, v4

    .line 127
    :cond_6
    add-int/lit8 v4, v4, -0x1

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_7
    :goto_2
    if-lt v3, v0, :cond_12

    .line 131
    .line 132
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    if-eqz v1, :cond_8

    .line 141
    .line 142
    iget-object v1, p0, Landroidx/recyclerview/widget/w;->a:Landroidx/recyclerview/widget/b;

    .line 143
    .line 144
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/b;->j(I)V

    .line 145
    .line 146
    .line 147
    :cond_8
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/A;->h(Landroid/view/View;)V

    .line 148
    .line 149
    .line 150
    add-int/lit8 v3, v3, -0x1

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_9
    iget v0, p2, Lt2/c;->f:I

    .line 154
    .line 155
    if-gez v0, :cond_a

    .line 156
    .line 157
    goto/16 :goto_6

    .line 158
    .line 159
    :cond_a
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->w()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-nez v0, :cond_b

    .line 164
    .line 165
    goto/16 :goto_6

    .line 166
    .line 167
    :cond_b
    const/4 v3, 0x0

    .line 168
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    iget-object v2, v2, Lcom/google/android/flexbox/a;->c:[I

    .line 173
    .line 174
    invoke-static {v4}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    aget v2, v2, v4

    .line 179
    .line 180
    if-ne v2, v1, :cond_c

    .line 181
    .line 182
    goto/16 :goto_6

    .line 183
    .line 184
    :cond_c
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 185
    .line 186
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    check-cast v4, Lt2/a;

    .line 191
    .line 192
    :goto_3
    if-ge v3, v0, :cond_10

    .line 193
    .line 194
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    iget v6, p2, Lt2/c;->f:I

    .line 199
    .line 200
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    if-nez v7, :cond_d

    .line 205
    .line 206
    iget-boolean v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 207
    .line 208
    if-eqz v7, :cond_d

    .line 209
    .line 210
    iget-object v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 211
    .line 212
    invoke-virtual {v7}, LJ0/p;->f()I

    .line 213
    .line 214
    .line 215
    move-result v7

    .line 216
    iget-object v8, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 217
    .line 218
    invoke-virtual {v8, v5}, LJ0/p;->e(Landroid/view/View;)I

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    sub-int/2addr v7, v8

    .line 223
    if-gt v7, v6, :cond_10

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_d
    iget-object v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 227
    .line 228
    invoke-virtual {v7, v5}, LJ0/p;->b(Landroid/view/View;)I

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    if-gt v7, v6, :cond_10

    .line 233
    .line 234
    :goto_4
    iget v6, v4, Lt2/a;->l:I

    .line 235
    .line 236
    invoke-static {v5}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    if-ne v6, v5, :cond_f

    .line 241
    .line 242
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 243
    .line 244
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    add-int/lit8 v1, v1, -0x1

    .line 249
    .line 250
    if-lt v2, v1, :cond_e

    .line 251
    .line 252
    move v1, v3

    .line 253
    goto :goto_5

    .line 254
    :cond_e
    iget v1, p2, Lt2/c;->h:I

    .line 255
    .line 256
    add-int/2addr v2, v1

    .line 257
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 258
    .line 259
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    check-cast v1, Lt2/a;

    .line 264
    .line 265
    move-object v4, v1

    .line 266
    move v1, v3

    .line 267
    :cond_f
    add-int/lit8 v3, v3, 0x1

    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_10
    :goto_5
    if-ltz v1, :cond_12

    .line 271
    .line 272
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    if-eqz v0, :cond_11

    .line 281
    .line 282
    iget-object v0, p0, Landroidx/recyclerview/widget/w;->a:Landroidx/recyclerview/widget/b;

    .line 283
    .line 284
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/b;->j(I)V

    .line 285
    .line 286
    .line 287
    :cond_11
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/A;->h(Landroid/view/View;)V

    .line 288
    .line 289
    .line 290
    add-int/lit8 v1, v1, -0x1

    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_12
    :goto_6
    return-void
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
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
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
.end method

.method public final d0(II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1(I)V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public final d1(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->p0()V

    .line 6
    .line 7
    .line 8
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->D:LJ0/p;

    .line 14
    .line 15
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:Lt2/b;

    .line 21
    .line 22
    invoke-static {p1}, Lt2/b;->b(Lt2/b;)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput v0, p1, Lt2/b;->d:I

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->u0()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
    .line 32
    .line 33
.end method

.method public final e()Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    iget v0, p0, Landroidx/recyclerview/widget/w;->o:I

    .line 17
    .line 18
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->L:Landroid/view/View;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v1, v2

    .line 29
    :goto_0
    if-le v0, v1, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    return v2

    .line 33
    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 34
    return v0
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

.method public final e1(Landroid/view/View;IILcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/recyclerview/widget/w;->i:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 16
    .line 17
    invoke-static {v0, p2, v1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->R(III)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget p2, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 28
    .line 29
    invoke-static {p1, p3, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->R(III)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p1, 0x0

    .line 37
    return p1

    .line 38
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 39
    return p1
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
.end method

.method public final f()Z
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    xor-int/2addr v0, v1

    .line 11
    return v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    iget v0, p0, Landroidx/recyclerview/widget/w;->p:I

    .line 19
    .line 20
    iget-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->L:Landroid/view/View;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v2, v3

    .line 31
    :goto_0
    if-le v0, v2, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    return v3

    .line 35
    :cond_3
    :goto_1
    return v1
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

.method public final f0(II)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1(I)V

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

.method public final f1(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->w()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    invoke-virtual {p0, v0, v1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->S0(II)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :goto_0
    if-lt p1, v1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->w()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Lcom/google/android/flexbox/a;->f(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lcom/google/android/flexbox/a;->g(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Lcom/google/android/flexbox/a;->e(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, v1, Lcom/google/android/flexbox/a;->c:[I

    .line 38
    .line 39
    array-length v0, v0

    .line 40
    if-lt p1, v0, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->M:I

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-nez p1, :cond_3

    .line 51
    .line 52
    :goto_1
    return-void

    .line 53
    :cond_3
    invoke-static {p1}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->F:I

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_4

    .line 64
    .line 65
    iget-boolean v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 70
    .line 71
    invoke-virtual {v0, p1}, LJ0/p;->b(Landroid/view/View;)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 76
    .line 77
    invoke-virtual {v0}, LJ0/p;->h()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    add-int/2addr v0, p1

    .line 82
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->G:I

    .line 83
    .line 84
    return-void

    .line 85
    :cond_4
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, LJ0/p;->e(Landroid/view/View;)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 92
    .line 93
    invoke-virtual {v0}, LJ0/p;->k()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    sub-int/2addr p1, v0

    .line 98
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->G:I

    .line 99
    .line 100
    return-void
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
.end method

.method public final g(Landroidx/recyclerview/widget/x;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;

    .line 2
    .line 3
    return p1
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final g0(II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1(I)V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public final g1(Lt2/b;ZZ)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/high16 v2, -0x80000000

    .line 4
    .line 5
    if-eqz p3, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    iget p3, p0, Landroidx/recyclerview/widget/w;->n:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget p3, p0, Landroidx/recyclerview/widget/w;->m:I

    .line 17
    .line 18
    :goto_0
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    if-ne p3, v2, :cond_2

    .line 23
    .line 24
    :cond_1
    move v1, v0

    .line 25
    :cond_2
    iput-boolean v1, v3, Lt2/c;->b:Z

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_3
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 29
    .line 30
    iput-boolean v1, p3, Lt2/c;->b:Z

    .line 31
    .line 32
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    if-nez p3, :cond_4

    .line 37
    .line 38
    iget-boolean p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 39
    .line 40
    if-eqz p3, :cond_4

    .line 41
    .line 42
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 43
    .line 44
    iget v1, p1, Lt2/b;->c:I

    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->K()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    sub-int/2addr v1, v3

    .line 51
    iput v1, p3, Lt2/c;->a:I

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_4
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 55
    .line 56
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 57
    .line 58
    invoke-virtual {v1}, LJ0/p;->g()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    iget v3, p1, Lt2/b;->c:I

    .line 63
    .line 64
    sub-int/2addr v1, v3

    .line 65
    iput v1, p3, Lt2/c;->a:I

    .line 66
    .line 67
    :goto_2
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 68
    .line 69
    iget v1, p1, Lt2/b;->a:I

    .line 70
    .line 71
    iput v1, p3, Lt2/c;->d:I

    .line 72
    .line 73
    iput v0, p3, Lt2/c;->h:I

    .line 74
    .line 75
    iget v1, p1, Lt2/b;->c:I

    .line 76
    .line 77
    iput v1, p3, Lt2/c;->e:I

    .line 78
    .line 79
    iput v2, p3, Lt2/c;->f:I

    .line 80
    .line 81
    iget v1, p1, Lt2/b;->b:I

    .line 82
    .line 83
    iput v1, p3, Lt2/c;->c:I

    .line 84
    .line 85
    if-eqz p2, :cond_5

    .line 86
    .line 87
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 88
    .line 89
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-le p2, v0, :cond_5

    .line 94
    .line 95
    iget p2, p1, Lt2/b;->b:I

    .line 96
    .line 97
    if-ltz p2, :cond_5

    .line 98
    .line 99
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    sub-int/2addr p3, v0

    .line 106
    if-ge p2, p3, :cond_5

    .line 107
    .line 108
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 109
    .line 110
    iget p1, p1, Lt2/b;->b:I

    .line 111
    .line 112
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Lt2/a;

    .line 117
    .line 118
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 119
    .line 120
    iget p3, p2, Lt2/c;->c:I

    .line 121
    .line 122
    add-int/2addr p3, v0

    .line 123
    iput p3, p2, Lt2/c;->c:I

    .line 124
    .line 125
    iget p3, p2, Lt2/c;->d:I

    .line 126
    .line 127
    iget p1, p1, Lt2/a;->d:I

    .line 128
    .line 129
    add-int/2addr p3, p1

    .line 130
    iput p3, p2, Lt2/c;->d:I

    .line 131
    .line 132
    :cond_5
    return-void
.end method

.method public final h0(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1(I)V

    .line 2
    .line 3
    .line 4
    return-void
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final h1(Lt2/b;ZZ)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/high16 v2, -0x80000000

    .line 4
    .line 5
    if-eqz p3, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    iget p3, p0, Landroidx/recyclerview/widget/w;->n:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget p3, p0, Landroidx/recyclerview/widget/w;->m:I

    .line 17
    .line 18
    :goto_0
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    if-ne p3, v2, :cond_2

    .line 23
    .line 24
    :cond_1
    move v1, v0

    .line 25
    :cond_2
    iput-boolean v1, v3, Lt2/c;->b:Z

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_3
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 29
    .line 30
    iput-boolean v1, p3, Lt2/c;->b:Z

    .line 31
    .line 32
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    if-nez p3, :cond_4

    .line 37
    .line 38
    iget-boolean p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 39
    .line 40
    if-eqz p3, :cond_4

    .line 41
    .line 42
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 43
    .line 44
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->L:Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    iget v3, p1, Lt2/b;->c:I

    .line 51
    .line 52
    sub-int/2addr v1, v3

    .line 53
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 54
    .line 55
    invoke-virtual {v3}, LJ0/p;->k()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    sub-int/2addr v1, v3

    .line 60
    iput v1, p3, Lt2/c;->a:I

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 64
    .line 65
    iget v1, p1, Lt2/b;->c:I

    .line 66
    .line 67
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 68
    .line 69
    invoke-virtual {v3}, LJ0/p;->k()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    sub-int/2addr v1, v3

    .line 74
    iput v1, p3, Lt2/c;->a:I

    .line 75
    .line 76
    :goto_2
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 77
    .line 78
    iget v1, p1, Lt2/b;->a:I

    .line 79
    .line 80
    iput v1, p3, Lt2/c;->d:I

    .line 81
    .line 82
    const/4 v1, -0x1

    .line 83
    iput v1, p3, Lt2/c;->h:I

    .line 84
    .line 85
    iget v1, p1, Lt2/b;->c:I

    .line 86
    .line 87
    iput v1, p3, Lt2/c;->e:I

    .line 88
    .line 89
    iput v2, p3, Lt2/c;->f:I

    .line 90
    .line 91
    iget v1, p1, Lt2/b;->b:I

    .line 92
    .line 93
    iput v1, p3, Lt2/c;->c:I

    .line 94
    .line 95
    if-eqz p2, :cond_5

    .line 96
    .line 97
    if-lez v1, :cond_5

    .line 98
    .line 99
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    iget p1, p1, Lt2/b;->b:I

    .line 106
    .line 107
    if-le p2, p1, :cond_5

    .line 108
    .line 109
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast p1, Lt2/a;

    .line 116
    .line 117
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 118
    .line 119
    iget p3, p2, Lt2/c;->c:I

    .line 120
    .line 121
    sub-int/2addr p3, v0

    .line 122
    iput p3, p2, Lt2/c;->c:I

    .line 123
    .line 124
    iget p3, p2, Lt2/c;->d:I

    .line 125
    .line 126
    iget p1, p1, Lt2/a;->d:I

    .line 127
    .line 128
    sub-int/2addr p3, p1

    .line 129
    iput p3, p2, Lt2/c;->d:I

    .line 130
    .line 131
    :cond_5
    return-void
    .line 132
.end method

.method public final i0(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1(I)V

    .line 5
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

.method public final i1(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->J:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public final j0(Landroidx/recyclerview/widget/A;LJ0/D;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iput-object v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->y:Landroidx/recyclerview/widget/A;

    .line 8
    .line 9
    iput-object v2, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:LJ0/D;

    .line 10
    .line 11
    invoke-virtual {v2}, LJ0/D;->b()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    iget-boolean v4, v2, LJ0/D;->g:Z

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    goto/16 :goto_1c

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/w;->H()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:I

    .line 28
    .line 29
    const/4 v6, 0x1

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x2

    .line 32
    if-eqz v5, :cond_a

    .line 33
    .line 34
    if-eq v5, v6, :cond_7

    .line 35
    .line 36
    if-eq v5, v8, :cond_4

    .line 37
    .line 38
    const/4 v9, 0x3

    .line 39
    if-eq v5, v9, :cond_1

    .line 40
    .line 41
    iput-boolean v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 42
    .line 43
    iput-boolean v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Z

    .line 44
    .line 45
    goto :goto_6

    .line 46
    :cond_1
    if-ne v4, v6, :cond_2

    .line 47
    .line 48
    move v4, v6

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move v4, v7

    .line 51
    :goto_0
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 52
    .line 53
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 54
    .line 55
    if-ne v5, v8, :cond_3

    .line 56
    .line 57
    xor-int/2addr v4, v6

    .line 58
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 59
    .line 60
    :cond_3
    iput-boolean v6, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Z

    .line 61
    .line 62
    goto :goto_6

    .line 63
    :cond_4
    if-ne v4, v6, :cond_5

    .line 64
    .line 65
    move v4, v6

    .line 66
    goto :goto_1

    .line 67
    :cond_5
    move v4, v7

    .line 68
    :goto_1
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 69
    .line 70
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 71
    .line 72
    if-ne v5, v8, :cond_6

    .line 73
    .line 74
    xor-int/2addr v4, v6

    .line 75
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 76
    .line 77
    :cond_6
    iput-boolean v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Z

    .line 78
    .line 79
    goto :goto_6

    .line 80
    :cond_7
    if-eq v4, v6, :cond_8

    .line 81
    .line 82
    move v4, v6

    .line 83
    goto :goto_2

    .line 84
    :cond_8
    move v4, v7

    .line 85
    :goto_2
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 86
    .line 87
    iget v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 88
    .line 89
    if-ne v4, v8, :cond_9

    .line 90
    .line 91
    move v4, v6

    .line 92
    goto :goto_3

    .line 93
    :cond_9
    move v4, v7

    .line 94
    :goto_3
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Z

    .line 95
    .line 96
    goto :goto_6

    .line 97
    :cond_a
    if-ne v4, v6, :cond_b

    .line 98
    .line 99
    move v4, v6

    .line 100
    goto :goto_4

    .line 101
    :cond_b
    move v4, v7

    .line 102
    :goto_4
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 103
    .line 104
    iget v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 105
    .line 106
    if-ne v4, v8, :cond_c

    .line 107
    .line 108
    move v4, v6

    .line 109
    goto :goto_5

    .line 110
    :cond_c
    move v4, v7

    .line 111
    :goto_5
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Z

    .line 112
    .line 113
    :goto_6
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->M0()V

    .line 114
    .line 115
    .line 116
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 117
    .line 118
    if-nez v4, :cond_d

    .line 119
    .line 120
    new-instance v4, Lt2/c;

    .line 121
    .line 122
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 123
    .line 124
    .line 125
    iput v6, v4, Lt2/c;->h:I

    .line 126
    .line 127
    iput-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 128
    .line 129
    :cond_d
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 130
    .line 131
    invoke-virtual {v4, v3}, Lcom/google/android/flexbox/a;->f(I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v3}, Lcom/google/android/flexbox/a;->g(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4, v3}, Lcom/google/android/flexbox/a;->e(I)V

    .line 138
    .line 139
    .line 140
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 141
    .line 142
    iput-boolean v7, v5, Lt2/c;->i:Z

    .line 143
    .line 144
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->E:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 145
    .line 146
    if-eqz v5, :cond_e

    .line 147
    .line 148
    iget v8, v5, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->s:I

    .line 149
    .line 150
    if-ltz v8, :cond_e

    .line 151
    .line 152
    if-ge v8, v3, :cond_e

    .line 153
    .line 154
    iput v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->F:I

    .line 155
    .line 156
    :cond_e
    iget-object v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:Lt2/b;

    .line 157
    .line 158
    iget-boolean v9, v8, Lt2/b;->f:Z

    .line 159
    .line 160
    const/high16 v10, -0x80000000

    .line 161
    .line 162
    const/4 v11, -0x1

    .line 163
    if-eqz v9, :cond_f

    .line 164
    .line 165
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->F:I

    .line 166
    .line 167
    if-ne v9, v11, :cond_f

    .line 168
    .line 169
    if-eqz v5, :cond_28

    .line 170
    .line 171
    :cond_f
    invoke-static {v8}, Lt2/b;->b(Lt2/b;)V

    .line 172
    .line 173
    .line 174
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->E:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 175
    .line 176
    iget-boolean v9, v2, LJ0/D;->g:Z

    .line 177
    .line 178
    if-nez v9, :cond_1d

    .line 179
    .line 180
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->F:I

    .line 181
    .line 182
    if-ne v9, v11, :cond_10

    .line 183
    .line 184
    goto/16 :goto_a

    .line 185
    .line 186
    :cond_10
    if-ltz v9, :cond_1c

    .line 187
    .line 188
    invoke-virtual {v2}, LJ0/D;->b()I

    .line 189
    .line 190
    .line 191
    move-result v12

    .line 192
    if-lt v9, v12, :cond_11

    .line 193
    .line 194
    goto/16 :goto_9

    .line 195
    .line 196
    :cond_11
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->F:I

    .line 197
    .line 198
    iput v9, v8, Lt2/b;->a:I

    .line 199
    .line 200
    iget-object v12, v4, Lcom/google/android/flexbox/a;->c:[I

    .line 201
    .line 202
    aget v9, v12, v9

    .line 203
    .line 204
    iput v9, v8, Lt2/b;->b:I

    .line 205
    .line 206
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->E:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 207
    .line 208
    if-eqz v9, :cond_12

    .line 209
    .line 210
    invoke-virtual {v2}, LJ0/D;->b()I

    .line 211
    .line 212
    .line 213
    move-result v12

    .line 214
    iget v9, v9, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->s:I

    .line 215
    .line 216
    if-ltz v9, :cond_12

    .line 217
    .line 218
    if-ge v9, v12, :cond_12

    .line 219
    .line 220
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 221
    .line 222
    invoke-virtual {v9}, LJ0/p;->k()I

    .line 223
    .line 224
    .line 225
    move-result v9

    .line 226
    iget v5, v5, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->t:I

    .line 227
    .line 228
    add-int/2addr v9, v5

    .line 229
    iput v9, v8, Lt2/b;->c:I

    .line 230
    .line 231
    iput-boolean v6, v8, Lt2/b;->g:Z

    .line 232
    .line 233
    iput v11, v8, Lt2/b;->b:I

    .line 234
    .line 235
    goto/16 :goto_11

    .line 236
    .line 237
    :cond_12
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->G:I

    .line 238
    .line 239
    if-ne v5, v10, :cond_1a

    .line 240
    .line 241
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->F:I

    .line 242
    .line 243
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/w;->r(I)Landroid/view/View;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    if-eqz v5, :cond_17

    .line 248
    .line 249
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 250
    .line 251
    invoke-virtual {v9, v5}, LJ0/p;->c(Landroid/view/View;)I

    .line 252
    .line 253
    .line 254
    move-result v9

    .line 255
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 256
    .line 257
    invoke-virtual {v12}, LJ0/p;->l()I

    .line 258
    .line 259
    .line 260
    move-result v12

    .line 261
    if-le v9, v12, :cond_13

    .line 262
    .line 263
    invoke-static {v8}, Lt2/b;->a(Lt2/b;)V

    .line 264
    .line 265
    .line 266
    goto/16 :goto_11

    .line 267
    .line 268
    :cond_13
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 269
    .line 270
    invoke-virtual {v9, v5}, LJ0/p;->e(Landroid/view/View;)I

    .line 271
    .line 272
    .line 273
    move-result v9

    .line 274
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 275
    .line 276
    invoke-virtual {v12}, LJ0/p;->k()I

    .line 277
    .line 278
    .line 279
    move-result v12

    .line 280
    sub-int/2addr v9, v12

    .line 281
    if-gez v9, :cond_14

    .line 282
    .line 283
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 284
    .line 285
    invoke-virtual {v5}, LJ0/p;->k()I

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    iput v5, v8, Lt2/b;->c:I

    .line 290
    .line 291
    iput-boolean v7, v8, Lt2/b;->e:Z

    .line 292
    .line 293
    goto/16 :goto_11

    .line 294
    .line 295
    :cond_14
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 296
    .line 297
    invoke-virtual {v9}, LJ0/p;->g()I

    .line 298
    .line 299
    .line 300
    move-result v9

    .line 301
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 302
    .line 303
    invoke-virtual {v12, v5}, LJ0/p;->b(Landroid/view/View;)I

    .line 304
    .line 305
    .line 306
    move-result v12

    .line 307
    sub-int/2addr v9, v12

    .line 308
    if-gez v9, :cond_15

    .line 309
    .line 310
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 311
    .line 312
    invoke-virtual {v5}, LJ0/p;->g()I

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    iput v5, v8, Lt2/b;->c:I

    .line 317
    .line 318
    iput-boolean v6, v8, Lt2/b;->e:Z

    .line 319
    .line 320
    goto/16 :goto_11

    .line 321
    .line 322
    :cond_15
    iget-boolean v9, v8, Lt2/b;->e:Z

    .line 323
    .line 324
    if-eqz v9, :cond_16

    .line 325
    .line 326
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 327
    .line 328
    invoke-virtual {v9, v5}, LJ0/p;->b(Landroid/view/View;)I

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 333
    .line 334
    invoke-virtual {v9}, LJ0/p;->m()I

    .line 335
    .line 336
    .line 337
    move-result v9

    .line 338
    add-int/2addr v9, v5

    .line 339
    goto :goto_7

    .line 340
    :cond_16
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 341
    .line 342
    invoke-virtual {v9, v5}, LJ0/p;->e(Landroid/view/View;)I

    .line 343
    .line 344
    .line 345
    move-result v9

    .line 346
    :goto_7
    iput v9, v8, Lt2/b;->c:I

    .line 347
    .line 348
    goto/16 :goto_11

    .line 349
    .line 350
    :cond_17
    invoke-virtual {v0}, Landroidx/recyclerview/widget/w;->w()I

    .line 351
    .line 352
    .line 353
    move-result v5

    .line 354
    if-lez v5, :cond_19

    .line 355
    .line 356
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 357
    .line 358
    .line 359
    move-result-object v5

    .line 360
    invoke-static {v5}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->F:I

    .line 365
    .line 366
    if-ge v9, v5, :cond_18

    .line 367
    .line 368
    move v5, v6

    .line 369
    goto :goto_8

    .line 370
    :cond_18
    move v5, v7

    .line 371
    :goto_8
    iput-boolean v5, v8, Lt2/b;->e:Z

    .line 372
    .line 373
    :cond_19
    invoke-static {v8}, Lt2/b;->a(Lt2/b;)V

    .line 374
    .line 375
    .line 376
    goto/16 :goto_11

    .line 377
    .line 378
    :cond_1a
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    if-nez v5, :cond_1b

    .line 383
    .line 384
    iget-boolean v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 385
    .line 386
    if-eqz v5, :cond_1b

    .line 387
    .line 388
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->G:I

    .line 389
    .line 390
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 391
    .line 392
    invoke-virtual {v9}, LJ0/p;->h()I

    .line 393
    .line 394
    .line 395
    move-result v9

    .line 396
    sub-int/2addr v5, v9

    .line 397
    iput v5, v8, Lt2/b;->c:I

    .line 398
    .line 399
    goto/16 :goto_11

    .line 400
    .line 401
    :cond_1b
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 402
    .line 403
    invoke-virtual {v5}, LJ0/p;->k()I

    .line 404
    .line 405
    .line 406
    move-result v5

    .line 407
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->G:I

    .line 408
    .line 409
    add-int/2addr v5, v9

    .line 410
    iput v5, v8, Lt2/b;->c:I

    .line 411
    .line 412
    goto/16 :goto_11

    .line 413
    .line 414
    :cond_1c
    :goto_9
    iput v11, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->F:I

    .line 415
    .line 416
    iput v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->G:I

    .line 417
    .line 418
    :cond_1d
    :goto_a
    invoke-virtual {v0}, Landroidx/recyclerview/widget/w;->w()I

    .line 419
    .line 420
    .line 421
    move-result v5

    .line 422
    if-nez v5, :cond_1e

    .line 423
    .line 424
    goto/16 :goto_10

    .line 425
    .line 426
    :cond_1e
    iget-boolean v5, v8, Lt2/b;->e:Z

    .line 427
    .line 428
    if-eqz v5, :cond_1f

    .line 429
    .line 430
    invoke-virtual {v2}, LJ0/D;->b()I

    .line 431
    .line 432
    .line 433
    move-result v5

    .line 434
    invoke-virtual {v0, v5}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Q0(I)Landroid/view/View;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    goto :goto_b

    .line 439
    :cond_1f
    invoke-virtual {v2}, LJ0/D;->b()I

    .line 440
    .line 441
    .line 442
    move-result v5

    .line 443
    invoke-virtual {v0, v5}, Lcom/google/android/flexbox/FlexboxLayoutManager;->O0(I)Landroid/view/View;

    .line 444
    .line 445
    .line 446
    move-result-object v5

    .line 447
    :goto_b
    if-eqz v5, :cond_26

    .line 448
    .line 449
    iget-object v9, v8, Lt2/b;->h:Lcom/google/android/flexbox/FlexboxLayoutManager;

    .line 450
    .line 451
    iget v12, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 452
    .line 453
    if-nez v12, :cond_20

    .line 454
    .line 455
    iget-object v12, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->D:LJ0/p;

    .line 456
    .line 457
    goto :goto_c

    .line 458
    :cond_20
    iget-object v12, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 459
    .line 460
    :goto_c
    invoke-virtual {v9}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 461
    .line 462
    .line 463
    move-result v13

    .line 464
    if-nez v13, :cond_22

    .line 465
    .line 466
    iget-boolean v13, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 467
    .line 468
    if-eqz v13, :cond_22

    .line 469
    .line 470
    iget-boolean v13, v8, Lt2/b;->e:Z

    .line 471
    .line 472
    if-eqz v13, :cond_21

    .line 473
    .line 474
    invoke-virtual {v12, v5}, LJ0/p;->e(Landroid/view/View;)I

    .line 475
    .line 476
    .line 477
    move-result v13

    .line 478
    invoke-virtual {v12}, LJ0/p;->m()I

    .line 479
    .line 480
    .line 481
    move-result v12

    .line 482
    add-int/2addr v12, v13

    .line 483
    iput v12, v8, Lt2/b;->c:I

    .line 484
    .line 485
    goto :goto_d

    .line 486
    :cond_21
    invoke-virtual {v12, v5}, LJ0/p;->b(Landroid/view/View;)I

    .line 487
    .line 488
    .line 489
    move-result v12

    .line 490
    iput v12, v8, Lt2/b;->c:I

    .line 491
    .line 492
    goto :goto_d

    .line 493
    :cond_22
    iget-boolean v13, v8, Lt2/b;->e:Z

    .line 494
    .line 495
    if-eqz v13, :cond_23

    .line 496
    .line 497
    invoke-virtual {v12, v5}, LJ0/p;->b(Landroid/view/View;)I

    .line 498
    .line 499
    .line 500
    move-result v13

    .line 501
    invoke-virtual {v12}, LJ0/p;->m()I

    .line 502
    .line 503
    .line 504
    move-result v12

    .line 505
    add-int/2addr v12, v13

    .line 506
    iput v12, v8, Lt2/b;->c:I

    .line 507
    .line 508
    goto :goto_d

    .line 509
    :cond_23
    invoke-virtual {v12, v5}, LJ0/p;->e(Landroid/view/View;)I

    .line 510
    .line 511
    .line 512
    move-result v12

    .line 513
    iput v12, v8, Lt2/b;->c:I

    .line 514
    .line 515
    :goto_d
    invoke-static {v5}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 516
    .line 517
    .line 518
    move-result v5

    .line 519
    iput v5, v8, Lt2/b;->a:I

    .line 520
    .line 521
    iput-boolean v7, v8, Lt2/b;->g:Z

    .line 522
    .line 523
    iget-object v12, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 524
    .line 525
    iget-object v12, v12, Lcom/google/android/flexbox/a;->c:[I

    .line 526
    .line 527
    if-eq v5, v11, :cond_24

    .line 528
    .line 529
    goto :goto_e

    .line 530
    :cond_24
    move v5, v7

    .line 531
    :goto_e
    aget v5, v12, v5

    .line 532
    .line 533
    if-eq v5, v11, :cond_25

    .line 534
    .line 535
    goto :goto_f

    .line 536
    :cond_25
    move v5, v7

    .line 537
    :goto_f
    iput v5, v8, Lt2/b;->b:I

    .line 538
    .line 539
    iget-object v5, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 540
    .line 541
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 542
    .line 543
    .line 544
    move-result v5

    .line 545
    iget v12, v8, Lt2/b;->b:I

    .line 546
    .line 547
    if-le v5, v12, :cond_27

    .line 548
    .line 549
    iget-object v5, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 550
    .line 551
    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v5

    .line 555
    check-cast v5, Lt2/a;

    .line 556
    .line 557
    iget v5, v5, Lt2/a;->k:I

    .line 558
    .line 559
    iput v5, v8, Lt2/b;->a:I

    .line 560
    .line 561
    goto :goto_11

    .line 562
    :cond_26
    :goto_10
    invoke-static {v8}, Lt2/b;->a(Lt2/b;)V

    .line 563
    .line 564
    .line 565
    iput v7, v8, Lt2/b;->a:I

    .line 566
    .line 567
    iput v7, v8, Lt2/b;->b:I

    .line 568
    .line 569
    :cond_27
    :goto_11
    iput-boolean v6, v8, Lt2/b;->f:Z

    .line 570
    .line 571
    :cond_28
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/w;->q(Landroidx/recyclerview/widget/A;)V

    .line 572
    .line 573
    .line 574
    iget-boolean v5, v8, Lt2/b;->e:Z

    .line 575
    .line 576
    if-eqz v5, :cond_29

    .line 577
    .line 578
    invoke-virtual {v0, v8, v7, v6}, Lcom/google/android/flexbox/FlexboxLayoutManager;->h1(Lt2/b;ZZ)V

    .line 579
    .line 580
    .line 581
    goto :goto_12

    .line 582
    :cond_29
    invoke-virtual {v0, v8, v7, v6}, Lcom/google/android/flexbox/FlexboxLayoutManager;->g1(Lt2/b;ZZ)V

    .line 583
    .line 584
    .line 585
    :goto_12
    iget v5, v0, Landroidx/recyclerview/widget/w;->o:I

    .line 586
    .line 587
    iget v9, v0, Landroidx/recyclerview/widget/w;->m:I

    .line 588
    .line 589
    invoke-static {v5, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 590
    .line 591
    .line 592
    move-result v14

    .line 593
    iget v5, v0, Landroidx/recyclerview/widget/w;->p:I

    .line 594
    .line 595
    iget v9, v0, Landroidx/recyclerview/widget/w;->n:I

    .line 596
    .line 597
    invoke-static {v5, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 598
    .line 599
    .line 600
    move-result v15

    .line 601
    iget v5, v0, Landroidx/recyclerview/widget/w;->o:I

    .line 602
    .line 603
    iget v9, v0, Landroidx/recyclerview/widget/w;->p:I

    .line 604
    .line 605
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 606
    .line 607
    .line 608
    move-result v12

    .line 609
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->K:Landroid/content/Context;

    .line 610
    .line 611
    if-eqz v12, :cond_2c

    .line 612
    .line 613
    iget v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->H:I

    .line 614
    .line 615
    if-eq v12, v10, :cond_2a

    .line 616
    .line 617
    if-eq v12, v5, :cond_2a

    .line 618
    .line 619
    move v10, v6

    .line 620
    goto :goto_13

    .line 621
    :cond_2a
    move v10, v7

    .line 622
    :goto_13
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 623
    .line 624
    iget-boolean v6, v12, Lt2/c;->b:Z

    .line 625
    .line 626
    if-eqz v6, :cond_2b

    .line 627
    .line 628
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 629
    .line 630
    .line 631
    move-result-object v6

    .line 632
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 633
    .line 634
    .line 635
    move-result-object v6

    .line 636
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 637
    .line 638
    goto :goto_14

    .line 639
    :cond_2b
    iget v6, v12, Lt2/c;->a:I

    .line 640
    .line 641
    :goto_14
    move/from16 v16, v6

    .line 642
    .line 643
    goto :goto_16

    .line 644
    :cond_2c
    iget v6, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->I:I

    .line 645
    .line 646
    if-eq v6, v10, :cond_2d

    .line 647
    .line 648
    if-eq v6, v9, :cond_2d

    .line 649
    .line 650
    const/4 v10, 0x1

    .line 651
    goto :goto_15

    .line 652
    :cond_2d
    move v10, v7

    .line 653
    :goto_15
    iget-object v6, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 654
    .line 655
    iget-boolean v12, v6, Lt2/c;->b:Z

    .line 656
    .line 657
    if-eqz v12, :cond_2e

    .line 658
    .line 659
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 660
    .line 661
    .line 662
    move-result-object v6

    .line 663
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 664
    .line 665
    .line 666
    move-result-object v6

    .line 667
    iget v6, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 668
    .line 669
    goto :goto_14

    .line 670
    :cond_2e
    iget v6, v6, Lt2/c;->a:I

    .line 671
    .line 672
    goto :goto_14

    .line 673
    :goto_16
    iput v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->H:I

    .line 674
    .line 675
    iput v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->I:I

    .line 676
    .line 677
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->M:I

    .line 678
    .line 679
    iget-object v6, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->N:Lg9/g;

    .line 680
    .line 681
    const/4 v9, 0x0

    .line 682
    if-ne v5, v11, :cond_32

    .line 683
    .line 684
    iget v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->F:I

    .line 685
    .line 686
    if-ne v12, v11, :cond_2f

    .line 687
    .line 688
    if-eqz v10, :cond_32

    .line 689
    .line 690
    :cond_2f
    iget-boolean v3, v8, Lt2/b;->e:Z

    .line 691
    .line 692
    if-eqz v3, :cond_30

    .line 693
    .line 694
    goto/16 :goto_1a

    .line 695
    .line 696
    :cond_30
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 697
    .line 698
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 699
    .line 700
    .line 701
    iput-object v9, v6, Lg9/g;->a:Ljava/util/List;

    .line 702
    .line 703
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 704
    .line 705
    .line 706
    move-result v3

    .line 707
    if-eqz v3, :cond_31

    .line 708
    .line 709
    iget v3, v8, Lt2/b;->a:I

    .line 710
    .line 711
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 712
    .line 713
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->N:Lg9/g;

    .line 714
    .line 715
    const/16 v17, 0x0

    .line 716
    .line 717
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 718
    .line 719
    move/from16 v18, v3

    .line 720
    .line 721
    move-object/from16 v19, v5

    .line 722
    .line 723
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/a;->a(Lg9/g;IIIIILjava/util/List;)V

    .line 724
    .line 725
    .line 726
    goto :goto_17

    .line 727
    :cond_31
    iget v3, v8, Lt2/b;->a:I

    .line 728
    .line 729
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 730
    .line 731
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->N:Lg9/g;

    .line 732
    .line 733
    const/16 v17, 0x0

    .line 734
    .line 735
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 736
    .line 737
    move/from16 v18, v15

    .line 738
    .line 739
    move v15, v14

    .line 740
    move/from16 v14, v18

    .line 741
    .line 742
    move/from16 v18, v3

    .line 743
    .line 744
    move-object/from16 v19, v5

    .line 745
    .line 746
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/a;->a(Lg9/g;IIIIILjava/util/List;)V

    .line 747
    .line 748
    .line 749
    move/from16 v20, v15

    .line 750
    .line 751
    move v15, v14

    .line 752
    move/from16 v14, v20

    .line 753
    .line 754
    :goto_17
    iget-object v3, v6, Lg9/g;->a:Ljava/util/List;

    .line 755
    .line 756
    iput-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 757
    .line 758
    invoke-virtual {v4, v14, v15, v7}, Lcom/google/android/flexbox/a;->d(III)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v4, v7}, Lcom/google/android/flexbox/a;->p(I)V

    .line 762
    .line 763
    .line 764
    iget-object v3, v4, Lcom/google/android/flexbox/a;->c:[I

    .line 765
    .line 766
    iget v4, v8, Lt2/b;->a:I

    .line 767
    .line 768
    aget v3, v3, v4

    .line 769
    .line 770
    iput v3, v8, Lt2/b;->b:I

    .line 771
    .line 772
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 773
    .line 774
    iput v3, v4, Lt2/c;->c:I

    .line 775
    .line 776
    goto/16 :goto_1a

    .line 777
    .line 778
    :cond_32
    if-eq v5, v11, :cond_33

    .line 779
    .line 780
    iget v10, v8, Lt2/b;->a:I

    .line 781
    .line 782
    invoke-static {v5, v10}, Ljava/lang/Math;->min(II)I

    .line 783
    .line 784
    .line 785
    move-result v5

    .line 786
    goto :goto_18

    .line 787
    :cond_33
    iget v5, v8, Lt2/b;->a:I

    .line 788
    .line 789
    :goto_18
    iput-object v9, v6, Lg9/g;->a:Ljava/util/List;

    .line 790
    .line 791
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 792
    .line 793
    .line 794
    move-result v9

    .line 795
    if-eqz v9, :cond_35

    .line 796
    .line 797
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 798
    .line 799
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 800
    .line 801
    .line 802
    move-result v9

    .line 803
    if-lez v9, :cond_34

    .line 804
    .line 805
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 806
    .line 807
    invoke-virtual {v4, v3, v5}, Lcom/google/android/flexbox/a;->c(Ljava/util/List;I)V

    .line 808
    .line 809
    .line 810
    iget v3, v8, Lt2/b;->a:I

    .line 811
    .line 812
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 813
    .line 814
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 815
    .line 816
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->N:Lg9/g;

    .line 817
    .line 818
    move/from16 v18, v3

    .line 819
    .line 820
    move/from16 v17, v5

    .line 821
    .line 822
    move-object/from16 v19, v9

    .line 823
    .line 824
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/a;->a(Lg9/g;IIIIILjava/util/List;)V

    .line 825
    .line 826
    .line 827
    goto :goto_19

    .line 828
    :cond_34
    invoke-virtual {v4, v3}, Lcom/google/android/flexbox/a;->e(I)V

    .line 829
    .line 830
    .line 831
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 832
    .line 833
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->N:Lg9/g;

    .line 834
    .line 835
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 836
    .line 837
    const/16 v18, -0x1

    .line 838
    .line 839
    const/16 v17, 0x0

    .line 840
    .line 841
    move-object/from16 v19, v3

    .line 842
    .line 843
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/a;->a(Lg9/g;IIIIILjava/util/List;)V

    .line 844
    .line 845
    .line 846
    goto :goto_19

    .line 847
    :cond_35
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 848
    .line 849
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 850
    .line 851
    .line 852
    move-result v9

    .line 853
    if-lez v9, :cond_36

    .line 854
    .line 855
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 856
    .line 857
    invoke-virtual {v4, v3, v5}, Lcom/google/android/flexbox/a;->c(Ljava/util/List;I)V

    .line 858
    .line 859
    .line 860
    iget v3, v8, Lt2/b;->a:I

    .line 861
    .line 862
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 863
    .line 864
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 865
    .line 866
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->N:Lg9/g;

    .line 867
    .line 868
    move/from16 v17, v15

    .line 869
    .line 870
    move v15, v14

    .line 871
    move/from16 v14, v17

    .line 872
    .line 873
    move/from16 v18, v3

    .line 874
    .line 875
    move/from16 v17, v5

    .line 876
    .line 877
    move-object/from16 v19, v9

    .line 878
    .line 879
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/a;->a(Lg9/g;IIIIILjava/util/List;)V

    .line 880
    .line 881
    .line 882
    move v5, v15

    .line 883
    move v15, v14

    .line 884
    move v14, v5

    .line 885
    move/from16 v5, v17

    .line 886
    .line 887
    goto :goto_19

    .line 888
    :cond_36
    invoke-virtual {v4, v3}, Lcom/google/android/flexbox/a;->e(I)V

    .line 889
    .line 890
    .line 891
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 892
    .line 893
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->N:Lg9/g;

    .line 894
    .line 895
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:Lcom/google/android/flexbox/a;

    .line 896
    .line 897
    const/16 v18, -0x1

    .line 898
    .line 899
    const/16 v17, 0x0

    .line 900
    .line 901
    move/from16 v19, v15

    .line 902
    .line 903
    move v15, v14

    .line 904
    move/from16 v14, v19

    .line 905
    .line 906
    move-object/from16 v19, v3

    .line 907
    .line 908
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/a;->a(Lg9/g;IIIIILjava/util/List;)V

    .line 909
    .line 910
    .line 911
    move/from16 v20, v15

    .line 912
    .line 913
    move v15, v14

    .line 914
    move/from16 v14, v20

    .line 915
    .line 916
    :goto_19
    iget-object v3, v6, Lg9/g;->a:Ljava/util/List;

    .line 917
    .line 918
    iput-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Ljava/util/List;

    .line 919
    .line 920
    invoke-virtual {v4, v14, v15, v5}, Lcom/google/android/flexbox/a;->d(III)V

    .line 921
    .line 922
    .line 923
    invoke-virtual {v4, v5}, Lcom/google/android/flexbox/a;->p(I)V

    .line 924
    .line 925
    .line 926
    :goto_1a
    iget-boolean v3, v8, Lt2/b;->e:Z

    .line 927
    .line 928
    if-eqz v3, :cond_37

    .line 929
    .line 930
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 931
    .line 932
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->N0(Landroidx/recyclerview/widget/A;LJ0/D;Lt2/c;)I

    .line 933
    .line 934
    .line 935
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 936
    .line 937
    iget v3, v3, Lt2/c;->e:I

    .line 938
    .line 939
    const/4 v4, 0x1

    .line 940
    invoke-virtual {v0, v8, v4, v7}, Lcom/google/android/flexbox/FlexboxLayoutManager;->g1(Lt2/b;ZZ)V

    .line 941
    .line 942
    .line 943
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 944
    .line 945
    invoke-virtual {v0, v1, v2, v4}, Lcom/google/android/flexbox/FlexboxLayoutManager;->N0(Landroidx/recyclerview/widget/A;LJ0/D;Lt2/c;)I

    .line 946
    .line 947
    .line 948
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 949
    .line 950
    iget v4, v4, Lt2/c;->e:I

    .line 951
    .line 952
    goto :goto_1b

    .line 953
    :cond_37
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 954
    .line 955
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->N0(Landroidx/recyclerview/widget/A;LJ0/D;Lt2/c;)I

    .line 956
    .line 957
    .line 958
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 959
    .line 960
    iget v4, v3, Lt2/c;->e:I

    .line 961
    .line 962
    const/4 v3, 0x1

    .line 963
    invoke-virtual {v0, v8, v3, v7}, Lcom/google/android/flexbox/FlexboxLayoutManager;->h1(Lt2/b;ZZ)V

    .line 964
    .line 965
    .line 966
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 967
    .line 968
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->N0(Landroidx/recyclerview/widget/A;LJ0/D;Lt2/c;)I

    .line 969
    .line 970
    .line 971
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:Lt2/c;

    .line 972
    .line 973
    iget v3, v3, Lt2/c;->e:I

    .line 974
    .line 975
    :goto_1b
    invoke-virtual {v0}, Landroidx/recyclerview/widget/w;->w()I

    .line 976
    .line 977
    .line 978
    move-result v5

    .line 979
    if-lez v5, :cond_39

    .line 980
    .line 981
    iget-boolean v5, v8, Lt2/b;->e:Z

    .line 982
    .line 983
    if-eqz v5, :cond_38

    .line 984
    .line 985
    const/4 v5, 0x1

    .line 986
    invoke-virtual {v0, v4, v1, v2, v5}, Lcom/google/android/flexbox/FlexboxLayoutManager;->U0(ILandroidx/recyclerview/widget/A;LJ0/D;Z)I

    .line 987
    .line 988
    .line 989
    move-result v4

    .line 990
    add-int/2addr v4, v3

    .line 991
    invoke-virtual {v0, v4, v1, v2, v7}, Lcom/google/android/flexbox/FlexboxLayoutManager;->V0(ILandroidx/recyclerview/widget/A;LJ0/D;Z)I

    .line 992
    .line 993
    .line 994
    return-void

    .line 995
    :cond_38
    const/4 v5, 0x1

    .line 996
    invoke-virtual {v0, v3, v1, v2, v5}, Lcom/google/android/flexbox/FlexboxLayoutManager;->V0(ILandroidx/recyclerview/widget/A;LJ0/D;Z)I

    .line 997
    .line 998
    .line 999
    move-result v3

    .line 1000
    add-int/2addr v3, v4

    .line 1001
    invoke-virtual {v0, v3, v1, v2, v7}, Lcom/google/android/flexbox/FlexboxLayoutManager;->U0(ILandroidx/recyclerview/widget/A;LJ0/D;Z)I

    .line 1002
    .line 1003
    .line 1004
    :cond_39
    :goto_1c
    return-void
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
.end method

.method public final k(LJ0/D;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->J0(LJ0/D;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final k0(LJ0/D;)V
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->E:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->F:I

    .line 6
    .line 7
    const/high16 v0, -0x80000000

    .line 8
    .line 9
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->G:I

    .line 10
    .line 11
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->M:I

    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:Lt2/b;

    .line 14
    .line 15
    invoke-static {p1}, Lt2/b;->b(Lt2/b;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->J:Landroid/util/SparseArray;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    .line 21
    .line 22
    .line 23
    return-void
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

.method public final l(LJ0/D;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->K0(LJ0/D;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final l0(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->E:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->u0()V

    .line 10
    .line 11
    .line 12
    :cond_0
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final m(LJ0/D;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->L0(LJ0/D;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final m0()Landroid/os/Parcelable;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->E:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iget v2, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->s:I

    .line 11
    .line 12
    iput v2, v1, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->s:I

    .line 13
    .line 14
    iget v0, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->t:I

    .line 15
    .line 16
    iput v0, v1, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->t:I

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    new-instance v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->w()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-lez v1, :cond_1

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/w;->v(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Landroidx/recyclerview/widget/w;->M(Landroid/view/View;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    iput v2, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->s:I

    .line 40
    .line 41
    iget-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 42
    .line 43
    invoke-virtual {v2, v1}, LJ0/p;->e(Landroid/view/View;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->C:LJ0/p;

    .line 48
    .line 49
    invoke-virtual {v2}, LJ0/p;->k()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    sub-int/2addr v1, v2

    .line 54
    iput v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->t:I

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_1
    const/4 v1, -0x1

    .line 58
    iput v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->s:I

    .line 59
    .line 60
    return-object v0
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

.method public final n(LJ0/D;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->J0(LJ0/D;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final o(LJ0/D;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->K0(LJ0/D;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final p(LJ0/D;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->L0(LJ0/D;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final s()Landroidx/recyclerview/widget/x;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Landroidx/recyclerview/widget/x;-><init>(II)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->w:F

    .line 9
    .line 10
    const/high16 v1, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iput v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->x:F

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    iput v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->y:I

    .line 16
    .line 17
    const/high16 v1, -0x40800000    # -1.0f

    .line 18
    .line 19
    iput v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->z:F

    .line 20
    .line 21
    const v1, 0xffffff

    .line 22
    .line 23
    .line 24
    iput v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->C:I

    .line 25
    .line 26
    iput v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->D:I

    .line 27
    .line 28
    return-object v0
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
.end method

.method public final t(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/x;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/recyclerview/widget/x;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->w:F

    .line 8
    .line 9
    const/high16 p1, 0x3f800000    # 1.0f

    .line 10
    .line 11
    iput p1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->x:F

    .line 12
    .line 13
    const/4 p1, -0x1

    .line 14
    iput p1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->y:I

    .line 15
    .line 16
    const/high16 p1, -0x40800000    # -1.0f

    .line 17
    .line 18
    iput p1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->z:F

    .line 19
    .line 20
    const p1, 0xffffff

    .line 21
    .line 22
    .line 23
    iput p1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->C:I

    .line 24
    .line 25
    iput p1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->D:I

    .line 26
    .line 27
    return-object v0
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

.method public final v0(ILJ0/D;Landroidx/recyclerview/widget/A;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->a1(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:Lt2/b;

    .line 23
    .line 24
    iget p3, p2, Lt2/b;->d:I

    .line 25
    .line 26
    add-int/2addr p3, p1

    .line 27
    iput p3, p2, Lt2/b;->d:I

    .line 28
    .line 29
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->D:LJ0/p;

    .line 30
    .line 31
    neg-int p3, p1

    .line 32
    invoke-virtual {p2, p3}, LJ0/p;->p(I)V

    .line 33
    .line 34
    .line 35
    return p1

    .line 36
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z0(ILJ0/D;Landroidx/recyclerview/widget/A;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->J:Landroid/util/SparseArray;

    .line 41
    .line 42
    invoke-virtual {p2}, Landroid/util/SparseArray;->clear()V

    .line 43
    .line 44
    .line 45
    return p1
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

.method public final w0(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->F:I

    .line 2
    .line 3
    const/high16 p1, -0x80000000

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->G:I

    .line 6
    .line 7
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->E:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput v0, p1, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->s:I

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/w;->u0()V

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
.end method

.method public final x0(ILJ0/D;Landroidx/recyclerview/widget/A;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->a1(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:Lt2/b;

    .line 23
    .line 24
    iget p3, p2, Lt2/b;->d:I

    .line 25
    .line 26
    add-int/2addr p3, p1

    .line 27
    iput p3, p2, Lt2/b;->d:I

    .line 28
    .line 29
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->D:LJ0/p;

    .line 30
    .line 31
    neg-int p3, p1

    .line 32
    invoke-virtual {p2, p3}, LJ0/p;->p(I)V

    .line 33
    .line 34
    .line 35
    return p1

    .line 36
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z0(ILJ0/D;Landroidx/recyclerview/widget/A;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->J:Landroid/util/SparseArray;

    .line 41
    .line 42
    invoke-virtual {p2}, Landroid/util/SparseArray;->clear()V

    .line 43
    .line 44
    .line 45
    return p1
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
