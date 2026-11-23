.class public final Lcom/google/android/gms/internal/measurement/S0;
.super Lcom/google/android/gms/internal/measurement/zzal;
.source "SourceFile"


# instance fields
.field public final u:Z

.field public final v:Z

.field public final synthetic w:Lcom/google/android/gms/internal/measurement/zzr;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzr;ZZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/S0;->w:Lcom/google/android/gms/internal/measurement/zzr;

    .line 2
    .line 3
    const-string p1, "log"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzal;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/S0;->u:Z

    .line 9
    .line 10
    iput-boolean p3, p0, Lcom/google/android/gms/internal/measurement/S0;->v:Z

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
.method public final a(Lcom/google/android/gms/internal/measurement/zzh;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/zzaq;
    .locals 18

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
    const-string v3, "log"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-static {v3, v4, v2}, Lcom/google/android/gms/internal/measurement/zzg;->k(Ljava/lang/String;ILjava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    sget-object v6, Lcom/google/android/gms/internal/measurement/zzs;->u:Lcom/google/android/gms/internal/measurement/zzs;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    sget-object v11, Lcom/google/android/gms/internal/measurement/zzaq;->i:Lcom/google/android/gms/internal/measurement/zzax;

    .line 21
    .line 22
    iget-object v7, v0, Lcom/google/android/gms/internal/measurement/S0;->w:Lcom/google/android/gms/internal/measurement/zzr;

    .line 23
    .line 24
    if-ne v3, v4, :cond_0

    .line 25
    .line 26
    iget-object v3, v7, Lcom/google/android/gms/internal/measurement/zzr;->u:Le1/j;

    .line 27
    .line 28
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 33
    .line 34
    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 35
    .line 36
    invoke-virtual {v4, v1, v2}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/zzaq;->f()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    sget-object v8, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 45
    .line 46
    iget-boolean v9, v0, Lcom/google/android/gms/internal/measurement/S0;->u:Z

    .line 47
    .line 48
    iget-boolean v10, v0, Lcom/google/android/gms/internal/measurement/S0;->v:Z

    .line 49
    .line 50
    move-object v5, v3

    .line 51
    invoke-virtual/range {v5 .. v10}, Le1/j;->K(Lcom/google/android/gms/internal/measurement/zzs;Ljava/lang/String;Ljava/util/List;ZZ)V

    .line 52
    .line 53
    .line 54
    return-object v11

    .line 55
    :cond_0
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 60
    .line 61
    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 62
    .line 63
    invoke-virtual {v5, v1, v3}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 72
    .line 73
    .line 74
    move-result-wide v8

    .line 75
    invoke-static {v8, v9}, Lcom/google/android/gms/internal/measurement/zzg;->i(D)I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    const/4 v5, 0x5

    .line 80
    const/4 v8, 0x2

    .line 81
    if-eq v3, v8, :cond_4

    .line 82
    .line 83
    const/4 v9, 0x3

    .line 84
    if-eq v3, v9, :cond_3

    .line 85
    .line 86
    if-eq v3, v5, :cond_2

    .line 87
    .line 88
    const/4 v9, 0x6

    .line 89
    if-eq v3, v9, :cond_1

    .line 90
    .line 91
    :goto_0
    move-object v13, v6

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    sget-object v6, Lcom/google/android/gms/internal/measurement/zzs;->t:Lcom/google/android/gms/internal/measurement/zzs;

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    sget-object v6, Lcom/google/android/gms/internal/measurement/zzs;->w:Lcom/google/android/gms/internal/measurement/zzs;

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    sget-object v6, Lcom/google/android/gms/internal/measurement/zzs;->s:Lcom/google/android/gms/internal/measurement/zzs;

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_4
    sget-object v6, Lcom/google/android/gms/internal/measurement/zzs;->v:Lcom/google/android/gms/internal/measurement/zzs;

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :goto_1
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 110
    .line 111
    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 112
    .line 113
    invoke-virtual {v4, v1, v3}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/zzaq;->f()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v14

    .line 121
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-ne v3, v8, :cond_5

    .line 126
    .line 127
    iget-object v12, v7, Lcom/google/android/gms/internal/measurement/zzr;->u:Le1/j;

    .line 128
    .line 129
    sget-object v15, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 130
    .line 131
    iget-boolean v1, v0, Lcom/google/android/gms/internal/measurement/S0;->u:Z

    .line 132
    .line 133
    iget-boolean v2, v0, Lcom/google/android/gms/internal/measurement/S0;->v:Z

    .line 134
    .line 135
    move/from16 v16, v1

    .line 136
    .line 137
    move/from16 v17, v2

    .line 138
    .line 139
    invoke-virtual/range {v12 .. v17}, Le1/j;->K(Lcom/google/android/gms/internal/measurement/zzs;Ljava/lang/String;Ljava/util/List;ZZ)V

    .line 140
    .line 141
    .line 142
    return-object v11

    .line 143
    :cond_5
    new-instance v15, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-ge v8, v3, :cond_6

    .line 157
    .line 158
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 163
    .line 164
    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 165
    .line 166
    invoke-virtual {v4, v1, v3}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/zzaq;->f()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    add-int/lit8 v8, v8, 0x1

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_6
    iget-object v12, v7, Lcom/google/android/gms/internal/measurement/zzr;->u:Le1/j;

    .line 181
    .line 182
    iget-boolean v1, v0, Lcom/google/android/gms/internal/measurement/S0;->u:Z

    .line 183
    .line 184
    iget-boolean v2, v0, Lcom/google/android/gms/internal/measurement/S0;->v:Z

    .line 185
    .line 186
    move/from16 v16, v1

    .line 187
    .line 188
    move/from16 v17, v2

    .line 189
    .line 190
    invoke-virtual/range {v12 .. v17}, Le1/j;->K(Lcom/google/android/gms/internal/measurement/zzs;Ljava/lang/String;Ljava/util/List;ZZ)V

    .line 191
    .line 192
    .line 193
    return-object v11
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
