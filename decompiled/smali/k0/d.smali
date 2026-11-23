.class public final Lk0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final p:Lk0/c;

.field public static final q:Lk0/c;

.field public static final r:Lk0/c;

.field public static final s:Lk0/c;

.field public static final t:Lk0/c;

.field public static final u:Lk0/c;


# instance fields
.field public a:F

.field public b:F

.field public c:Z

.field public final d:Ln3/f;

.field public final e:Lt1/Y;

.field public f:Z

.field public final g:F

.field public final h:F

.field public i:J

.field public final j:F

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/ArrayList;

.field public m:Lk0/e;

.field public n:F

.field public o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk0/c;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lk0/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lk0/d;->p:Lk0/c;

    .line 8
    .line 9
    new-instance v0, Lk0/c;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1}, Lk0/c;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lk0/d;->q:Lk0/c;

    .line 16
    .line 17
    new-instance v0, Lk0/c;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, v1}, Lk0/c;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lk0/d;->r:Lk0/c;

    .line 24
    .line 25
    new-instance v0, Lk0/c;

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    invoke-direct {v0, v1}, Lk0/c;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lk0/d;->s:Lk0/c;

    .line 32
    .line 33
    new-instance v0, Lk0/c;

    .line 34
    .line 35
    const/4 v1, 0x5

    .line 36
    invoke-direct {v0, v1}, Lk0/c;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lk0/d;->t:Lk0/c;

    .line 40
    .line 41
    new-instance v0, Lk0/c;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-direct {v0, v1}, Lk0/c;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lk0/d;->u:Lk0/c;

    .line 48
    .line 49
    return-void
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

.method public constructor <init>(Ln3/f;)V
    .locals 5

    .line 1
    sget-object v0, Ln3/f;->I:Ln3/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput v1, p0, Lk0/d;->a:F

    .line 8
    .line 9
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 10
    .line 11
    .line 12
    iput v1, p0, Lk0/d;->b:F

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iput-boolean v2, p0, Lk0/d;->c:Z

    .line 16
    .line 17
    iput-boolean v2, p0, Lk0/d;->f:Z

    .line 18
    .line 19
    iput v1, p0, Lk0/d;->g:F

    .line 20
    .line 21
    const v3, -0x800001

    .line 22
    .line 23
    .line 24
    iput v3, p0, Lk0/d;->h:F

    .line 25
    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    iput-wide v3, p0, Lk0/d;->i:J

    .line 29
    .line 30
    new-instance v3, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v3, p0, Lk0/d;->k:Ljava/util/ArrayList;

    .line 36
    .line 37
    new-instance v3, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v3, p0, Lk0/d;->l:Ljava/util/ArrayList;

    .line 43
    .line 44
    iput-object p1, p0, Lk0/d;->d:Ln3/f;

    .line 45
    .line 46
    iput-object v0, p0, Lk0/d;->e:Lt1/Y;

    .line 47
    .line 48
    sget-object p1, Lk0/d;->r:Lk0/c;

    .line 49
    .line 50
    if-eq v0, p1, :cond_4

    .line 51
    .line 52
    sget-object p1, Lk0/d;->s:Lk0/c;

    .line 53
    .line 54
    if-eq v0, p1, :cond_4

    .line 55
    .line 56
    sget-object p1, Lk0/d;->t:Lk0/c;

    .line 57
    .line 58
    if-ne v0, p1, :cond_0

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    sget-object p1, Lk0/d;->u:Lk0/c;

    .line 62
    .line 63
    const/high16 v3, 0x3b800000    # 0.00390625f

    .line 64
    .line 65
    if-ne v0, p1, :cond_1

    .line 66
    .line 67
    iput v3, p0, Lk0/d;->j:F

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_1
    sget-object p1, Lk0/d;->p:Lk0/c;

    .line 71
    .line 72
    if-eq v0, p1, :cond_3

    .line 73
    .line 74
    sget-object p1, Lk0/d;->q:Lk0/c;

    .line 75
    .line 76
    if-ne v0, p1, :cond_2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 80
    .line 81
    iput p1, p0, Lk0/d;->j:F

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    :goto_0
    iput v3, p0, Lk0/d;->j:F

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    :goto_1
    const p1, 0x3dcccccd    # 0.1f

    .line 88
    .line 89
    .line 90
    iput p1, p0, Lk0/d;->j:F

    .line 91
    .line 92
    :goto_2
    const/4 p1, 0x0

    .line 93
    iput-object p1, p0, Lk0/d;->m:Lk0/e;

    .line 94
    .line 95
    iput v1, p0, Lk0/d;->n:F

    .line 96
    .line 97
    iput-boolean v2, p0, Lk0/d;->o:Z

    .line 98
    .line 99
    return-void
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


# virtual methods
.method public final a(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/d;->e:Lt1/Y;

    .line 2
    .line 3
    iget-object v1, p0, Lk0/d;->d:Ln3/f;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lt1/Y;->y(Ln3/f;F)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    :goto_0
    iget-object v0, p0, Lk0/d;->l:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ge p1, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    add-int/lit8 p1, p1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, LV0/m;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    throw p1

    .line 37
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    add-int/lit8 p1, p1, -0x1

    .line 42
    .line 43
    :goto_1
    if-ltz p1, :cond_3

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_2
    add-int/lit8 p1, p1, -0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    return-void
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

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lk0/d;->m:Lk0/e;

    .line 2
    .line 3
    iget-wide v0, v0, Lk0/e;->b:D

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmpl-double v0, v0, v2

    .line 8
    .line 9
    if-lez v0, :cond_2

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget-boolean v0, p0, Lk0/d;->f:Z

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lk0/d;->o:Z

    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    new-instance v0, Landroid/util/AndroidRuntimeException;

    .line 30
    .line 31
    const-string v1, "Animations may only be started on the main thread"

    .line 32
    .line 33
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 38
    .line 39
    const-string v1, "Spring animations can only come to an end when there is damping"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
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
