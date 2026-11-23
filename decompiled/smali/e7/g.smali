.class public final Le7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:Le7/h;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;


# direct methods
.method public constructor <init>(Le7/h;Landroid/view/View;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le7/g;->a:Le7/h;

    .line 5
    .line 6
    iput-object p2, p0, Le7/g;->b:Landroid/view/View;

    .line 7
    .line 8
    iput-object p3, p0, Le7/g;->c:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 9
    .line 10
    return-void
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


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 6

    .line 1
    const/4 p1, 0x0

    .line 2
    iget-object v0, p0, Le7/g;->b:Landroid/view/View;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Le7/g;->c:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Le7/g;->a:Le7/h;

    .line 18
    .line 19
    iget-object v1, v0, Le7/h;->R0:Lc2/f;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_6

    .line 23
    .line 24
    iget-object v3, v0, Landroidx/fragment/app/b;->y:Landroid/os/Bundle;

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    const-string v4, "crypto"

    .line 29
    .line 30
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v3, v2

    .line 36
    :goto_0
    instance-of v4, v3, Lc7/a;

    .line 37
    .line 38
    if-nez v4, :cond_2

    .line 39
    .line 40
    move-object v3, v2

    .line 41
    :cond_2
    check-cast v3, Lc7/a;

    .line 42
    .line 43
    iget-object v4, v0, Le7/h;->Q0:LA1/J;

    .line 44
    .line 45
    if-eqz v4, :cond_5

    .line 46
    .line 47
    new-instance v2, LY1/c;

    .line 48
    .line 49
    const/4 v5, 0x6

    .line 50
    invoke-direct {v2, v1, v4, v3, v5}, LY1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    sget v1, LJ7/c;->a:I

    .line 54
    .line 55
    const/4 v1, 0x5

    .line 56
    const-string v3, "mode is null"

    .line 57
    .line 58
    invoke-static {v1, v3}, LE0/a;->m(ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance v1, LT7/f;

    .line 62
    .line 63
    invoke-direct {v1, v2, p1}, LT7/f;-><init>(Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    sget-object v2, LK7/b;->a:LK7/e;

    .line 67
    .line 68
    if-eqz v2, :cond_4

    .line 69
    .line 70
    sget v3, LJ7/c;->a:I

    .line 71
    .line 72
    if-lez v3, :cond_3

    .line 73
    .line 74
    new-instance v4, LT7/r;

    .line 75
    .line 76
    invoke-direct {v4, v1, v2, v3}, LT7/r;-><init>(LT7/f;LK7/e;I)V

    .line 77
    .line 78
    .line 79
    new-instance v1, Le7/d;

    .line 80
    .line 81
    invoke-direct {v1, v0}, Le7/d;-><init>(Le7/h;)V

    .line 82
    .line 83
    .line 84
    new-instance v2, LT7/i;

    .line 85
    .line 86
    invoke-direct {v2, v4, v1}, LT7/i;-><init>(LT7/r;Le7/d;)V

    .line 87
    .line 88
    .line 89
    sget-object v1, Le7/f;->s:Le7/f;

    .line 90
    .line 91
    new-instance v3, LT7/n;

    .line 92
    .line 93
    invoke-direct {v3, v2, v1}, LT7/n;-><init>(LJ7/c;LN7/d;)V

    .line 94
    .line 95
    .line 96
    new-instance v1, LT7/f;

    .line 97
    .line 98
    const/4 v2, 0x2

    .line 99
    invoke-direct {v1, v3, v2}, LT7/f;-><init>(Ljava/lang/Object;I)V

    .line 100
    .line 101
    .line 102
    new-instance v2, LP0/d;

    .line 103
    .line 104
    const/16 v3, 0x1a

    .line 105
    .line 106
    invoke-direct {v2, p0, v3}, LP0/d;-><init>(Ljava/lang/Object;I)V

    .line 107
    .line 108
    .line 109
    new-instance v3, LV/h;

    .line 110
    .line 111
    const/16 v4, 0x16

    .line 112
    .line 113
    invoke-direct {v3, p0, v4}, LV/h;-><init>(Ljava/lang/Object;I)V

    .line 114
    .line 115
    .line 116
    new-instance v4, LU7/a;

    .line 117
    .line 118
    invoke-direct {v4, v2, v3}, LU7/a;-><init>(LP0/d;LV/h;)V

    .line 119
    .line 120
    .line 121
    :try_start_0
    new-instance v2, LT7/j;

    .line 122
    .line 123
    invoke-direct {v2, v4, p1}, LT7/j;-><init>(Ljava/lang/Object;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v2}, LJ7/c;->a(LJ7/f;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    .line 128
    .line 129
    iget-object p1, v0, Le7/h;->S0:LL7/a;

    .line 130
    .line 131
    invoke-virtual {p1, v4}, LL7/a;->a(LL7/b;)Z

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :catchall_0
    move-exception p1

    .line 136
    invoke-static {p1}, Lga/l;->n(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    new-instance v0, Ljava/lang/NullPointerException;

    .line 140
    .line 141
    const-string v1, "subscribeActual failed"

    .line 142
    .line 143
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 147
    .line 148
    .line 149
    throw v0

    .line 150
    :catch_0
    move-exception p1

    .line 151
    throw p1

    .line 152
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 153
    .line 154
    const-string v0, "bufferSize > 0 required but it was "

    .line 155
    .line 156
    invoke-static {v3, v0}, Landroidx/datastore/preferences/protobuf/g;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p1

    .line 164
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 165
    .line 166
    const-string v0, "scheduler == null"

    .line 167
    .line 168
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw p1

    .line 172
    :cond_5
    const-string p1, "cancellationSignal"

    .line 173
    .line 174
    invoke-static {p1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v2

    .line 178
    :cond_6
    const-string p1, "authManager"

    .line 179
    .line 180
    invoke-static {p1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw v2
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
