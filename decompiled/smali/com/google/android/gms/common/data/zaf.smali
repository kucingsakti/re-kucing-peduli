.class public final Lcom/google/android/gms/common/data/zaf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->r(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move-object v5, v1

    .line 8
    move-object v6, v5

    .line 9
    move-object v8, v6

    .line 10
    move v4, v2

    .line 11
    move v7, v4

    .line 12
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v3, v0, :cond_6

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    int-to-char v9, v3

    .line 23
    const/4 v10, 0x1

    .line 24
    if-eq v9, v10, :cond_4

    .line 25
    .line 26
    const/4 v10, 0x2

    .line 27
    if-eq v9, v10, :cond_3

    .line 28
    .line 29
    const/4 v10, 0x3

    .line 30
    if-eq v9, v10, :cond_2

    .line 31
    .line 32
    const/4 v10, 0x4

    .line 33
    if-eq v9, v10, :cond_1

    .line 34
    .line 35
    const/16 v10, 0x3e8

    .line 36
    .line 37
    if-eq v9, v10, :cond_0

    .line 38
    .line 39
    invoke-static {p1, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->q(Landroid/os/Parcel;I)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {p1, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->m(Landroid/os/Parcel;I)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-static {p1, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->b(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-static {p1, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->m(Landroid/os/Parcel;I)I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    sget-object v6, Landroid/database/CursorWindow;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 59
    .line 60
    invoke-static {p1, v3, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->h(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    move-object v6, v3

    .line 65
    check-cast v6, [Landroid/database/CursorWindow;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    invoke-static {p1, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->p(Landroid/os/Parcel;I)I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-nez v3, :cond_5

    .line 77
    .line 78
    move-object v5, v1

    .line 79
    goto :goto_0

    .line 80
    :cond_5
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    add-int/2addr v5, v3

    .line 85
    invoke-virtual {p1, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 86
    .line 87
    .line 88
    move-object v5, v9

    .line 89
    goto :goto_0

    .line 90
    :cond_6
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->j(Landroid/os/Parcel;I)V

    .line 91
    .line 92
    .line 93
    new-instance v3, Lcom/google/android/gms/common/data/DataHolder;

    .line 94
    .line 95
    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/common/data/DataHolder;-><init>(I[Ljava/lang/String;[Landroid/database/CursorWindow;ILandroid/os/Bundle;)V

    .line 96
    .line 97
    .line 98
    new-instance p1, Landroid/os/Bundle;

    .line 99
    .line 100
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object p1, v3, Lcom/google/android/gms/common/data/DataHolder;->u:Landroid/os/Bundle;

    .line 104
    .line 105
    move p1, v2

    .line 106
    :goto_1
    iget-object v0, v3, Lcom/google/android/gms/common/data/DataHolder;->t:[Ljava/lang/String;

    .line 107
    .line 108
    array-length v1, v0

    .line 109
    if-ge p1, v1, :cond_7

    .line 110
    .line 111
    iget-object v1, v3, Lcom/google/android/gms/common/data/DataHolder;->u:Landroid/os/Bundle;

    .line 112
    .line 113
    aget-object v0, v0, p1

    .line 114
    .line 115
    invoke-virtual {v1, v0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 116
    .line 117
    .line 118
    add-int/lit8 p1, p1, 0x1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_7
    iget-object p1, v3, Lcom/google/android/gms/common/data/DataHolder;->v:[Landroid/database/CursorWindow;

    .line 122
    .line 123
    array-length v0, p1

    .line 124
    new-array v0, v0, [I

    .line 125
    .line 126
    iput-object v0, v3, Lcom/google/android/gms/common/data/DataHolder;->y:[I

    .line 127
    .line 128
    move v0, v2

    .line 129
    :goto_2
    array-length v1, p1

    .line 130
    if-ge v2, v1, :cond_8

    .line 131
    .line 132
    iget-object v1, v3, Lcom/google/android/gms/common/data/DataHolder;->y:[I

    .line 133
    .line 134
    aput v0, v1, v2

    .line 135
    .line 136
    aget-object v1, p1, v2

    .line 137
    .line 138
    invoke-virtual {v1}, Landroid/database/CursorWindow;->getStartPosition()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    sub-int v1, v0, v1

    .line 143
    .line 144
    aget-object v4, p1, v2

    .line 145
    .line 146
    invoke-virtual {v4}, Landroid/database/CursorWindow;->getNumRows()I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    sub-int/2addr v4, v1

    .line 151
    add-int/2addr v0, v4

    .line 152
    add-int/lit8 v2, v2, 0x1

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_8
    return-object v3
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

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/google/android/gms/common/data/DataHolder;

    .line 2
    .line 3
    return-object p1
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
