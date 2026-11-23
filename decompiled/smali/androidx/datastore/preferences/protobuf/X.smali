.class public final Landroidx/datastore/preferences/protobuf/X;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Landroidx/datastore/preferences/protobuf/X;


# instance fields
.field public final a:Landroidx/datastore/preferences/protobuf/I;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/datastore/preferences/protobuf/X;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/datastore/preferences/protobuf/X;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/datastore/preferences/protobuf/X;->c:Landroidx/datastore/preferences/protobuf/X;

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

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/X;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Landroidx/datastore/preferences/protobuf/I;

    .line 12
    .line 13
    invoke-direct {v0}, Landroidx/datastore/preferences/protobuf/I;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/X;->a:Landroidx/datastore/preferences/protobuf/I;

    .line 17
    .line 18
    return-void
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
.method public final a(Ljava/lang/Class;)Landroidx/datastore/preferences/protobuf/b0;
    .locals 9

    .line 1
    const-string v0, "messageType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Landroidx/datastore/preferences/protobuf/z;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/X;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroidx/datastore/preferences/protobuf/b0;

    .line 13
    .line 14
    if-nez v1, :cond_a

    .line 15
    .line 16
    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/X;->a:Landroidx/datastore/preferences/protobuf/I;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v2, Landroidx/datastore/preferences/protobuf/c0;->a:Ljava/lang/Class;

    .line 22
    .line 23
    const-class v2, Landroidx/datastore/preferences/protobuf/w;

    .line 24
    .line 25
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    sget-object v3, Landroidx/datastore/preferences/protobuf/c0;->a:Ljava/lang/Class;

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    const-string v0, "Message classes must extend GeneratedMessage or GeneratedMessageLite"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_1
    :goto_0
    iget-object v1, v1, Landroidx/datastore/preferences/protobuf/I;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Landroidx/datastore/preferences/protobuf/H;

    .line 53
    .line 54
    invoke-virtual {v1, p1}, Landroidx/datastore/preferences/protobuf/H;->a(Ljava/lang/Class;)Landroidx/datastore/preferences/protobuf/Z;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iget v1, v3, Landroidx/datastore/preferences/protobuf/Z;->d:I

    .line 59
    .line 60
    const/4 v4, 0x2

    .line 61
    and-int/2addr v1, v4

    .line 62
    const-string v5, "Protobuf runtime is not correctly loaded."

    .line 63
    .line 64
    if-ne v1, v4, :cond_4

    .line 65
    .line 66
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    iget-object v2, v3, Landroidx/datastore/preferences/protobuf/Z;->a:Landroidx/datastore/preferences/protobuf/w;

    .line 71
    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    sget-object v1, Landroidx/datastore/preferences/protobuf/c0;->d:Landroidx/datastore/preferences/protobuf/l0;

    .line 75
    .line 76
    sget-object v3, Landroidx/datastore/preferences/protobuf/p;->a:Landroidx/datastore/preferences/protobuf/o;

    .line 77
    .line 78
    new-instance v4, Landroidx/datastore/preferences/protobuf/S;

    .line 79
    .line 80
    invoke-direct {v4, v1, v3, v2}, Landroidx/datastore/preferences/protobuf/S;-><init>(Landroidx/datastore/preferences/protobuf/j0;Landroidx/datastore/preferences/protobuf/o;Landroidx/datastore/preferences/protobuf/w;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    sget-object v1, Landroidx/datastore/preferences/protobuf/c0;->b:Landroidx/datastore/preferences/protobuf/j0;

    .line 85
    .line 86
    sget-object v3, Landroidx/datastore/preferences/protobuf/p;->b:Landroidx/datastore/preferences/protobuf/o;

    .line 87
    .line 88
    if-eqz v3, :cond_3

    .line 89
    .line 90
    new-instance v4, Landroidx/datastore/preferences/protobuf/S;

    .line 91
    .line 92
    invoke-direct {v4, v1, v3, v2}, Landroidx/datastore/preferences/protobuf/S;-><init>(Landroidx/datastore/preferences/protobuf/j0;Landroidx/datastore/preferences/protobuf/o;Landroidx/datastore/preferences/protobuf/w;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :cond_4
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    const/4 v2, 0x1

    .line 107
    if-eqz v1, :cond_6

    .line 108
    .line 109
    iget v1, v3, Landroidx/datastore/preferences/protobuf/Z;->d:I

    .line 110
    .line 111
    and-int/2addr v1, v2

    .line 112
    if-ne v1, v2, :cond_5

    .line 113
    .line 114
    sget-object v4, Landroidx/datastore/preferences/protobuf/U;->b:Landroidx/datastore/preferences/protobuf/T;

    .line 115
    .line 116
    sget-object v5, Landroidx/datastore/preferences/protobuf/F;->b:Landroidx/datastore/preferences/protobuf/E;

    .line 117
    .line 118
    sget-object v6, Landroidx/datastore/preferences/protobuf/c0;->d:Landroidx/datastore/preferences/protobuf/l0;

    .line 119
    .line 120
    sget-object v7, Landroidx/datastore/preferences/protobuf/p;->a:Landroidx/datastore/preferences/protobuf/o;

    .line 121
    .line 122
    sget-object v8, Landroidx/datastore/preferences/protobuf/N;->b:Landroidx/datastore/preferences/protobuf/M;

    .line 123
    .line 124
    invoke-static/range {v3 .. v8}, Landroidx/datastore/preferences/protobuf/Q;->x(Landroidx/datastore/preferences/protobuf/Z;Landroidx/datastore/preferences/protobuf/T;Landroidx/datastore/preferences/protobuf/F;Landroidx/datastore/preferences/protobuf/j0;Landroidx/datastore/preferences/protobuf/o;Landroidx/datastore/preferences/protobuf/M;)Landroidx/datastore/preferences/protobuf/Q;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    goto :goto_1

    .line 129
    :cond_5
    sget-object v4, Landroidx/datastore/preferences/protobuf/U;->b:Landroidx/datastore/preferences/protobuf/T;

    .line 130
    .line 131
    sget-object v5, Landroidx/datastore/preferences/protobuf/F;->b:Landroidx/datastore/preferences/protobuf/E;

    .line 132
    .line 133
    sget-object v6, Landroidx/datastore/preferences/protobuf/c0;->d:Landroidx/datastore/preferences/protobuf/l0;

    .line 134
    .line 135
    sget-object v8, Landroidx/datastore/preferences/protobuf/N;->b:Landroidx/datastore/preferences/protobuf/M;

    .line 136
    .line 137
    const/4 v7, 0x0

    .line 138
    invoke-static/range {v3 .. v8}, Landroidx/datastore/preferences/protobuf/Q;->x(Landroidx/datastore/preferences/protobuf/Z;Landroidx/datastore/preferences/protobuf/T;Landroidx/datastore/preferences/protobuf/F;Landroidx/datastore/preferences/protobuf/j0;Landroidx/datastore/preferences/protobuf/o;Landroidx/datastore/preferences/protobuf/M;)Landroidx/datastore/preferences/protobuf/Q;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    goto :goto_1

    .line 143
    :cond_6
    iget v1, v3, Landroidx/datastore/preferences/protobuf/Z;->d:I

    .line 144
    .line 145
    and-int/2addr v1, v2

    .line 146
    if-ne v1, v2, :cond_8

    .line 147
    .line 148
    sget-object v4, Landroidx/datastore/preferences/protobuf/U;->a:Landroidx/datastore/preferences/protobuf/T;

    .line 149
    .line 150
    move-object v1, v5

    .line 151
    sget-object v5, Landroidx/datastore/preferences/protobuf/F;->a:Landroidx/datastore/preferences/protobuf/D;

    .line 152
    .line 153
    sget-object v6, Landroidx/datastore/preferences/protobuf/c0;->b:Landroidx/datastore/preferences/protobuf/j0;

    .line 154
    .line 155
    sget-object v7, Landroidx/datastore/preferences/protobuf/p;->b:Landroidx/datastore/preferences/protobuf/o;

    .line 156
    .line 157
    if-eqz v7, :cond_7

    .line 158
    .line 159
    sget-object v8, Landroidx/datastore/preferences/protobuf/N;->a:Landroidx/datastore/preferences/protobuf/M;

    .line 160
    .line 161
    invoke-static/range {v3 .. v8}, Landroidx/datastore/preferences/protobuf/Q;->x(Landroidx/datastore/preferences/protobuf/Z;Landroidx/datastore/preferences/protobuf/T;Landroidx/datastore/preferences/protobuf/F;Landroidx/datastore/preferences/protobuf/j0;Landroidx/datastore/preferences/protobuf/o;Landroidx/datastore/preferences/protobuf/M;)Landroidx/datastore/preferences/protobuf/Q;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    goto :goto_1

    .line 166
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 167
    .line 168
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw p1

    .line 172
    :cond_8
    sget-object v4, Landroidx/datastore/preferences/protobuf/U;->a:Landroidx/datastore/preferences/protobuf/T;

    .line 173
    .line 174
    sget-object v5, Landroidx/datastore/preferences/protobuf/F;->a:Landroidx/datastore/preferences/protobuf/D;

    .line 175
    .line 176
    sget-object v6, Landroidx/datastore/preferences/protobuf/c0;->c:Landroidx/datastore/preferences/protobuf/j0;

    .line 177
    .line 178
    sget-object v8, Landroidx/datastore/preferences/protobuf/N;->a:Landroidx/datastore/preferences/protobuf/M;

    .line 179
    .line 180
    const/4 v7, 0x0

    .line 181
    invoke-static/range {v3 .. v8}, Landroidx/datastore/preferences/protobuf/Q;->x(Landroidx/datastore/preferences/protobuf/Z;Landroidx/datastore/preferences/protobuf/T;Landroidx/datastore/preferences/protobuf/F;Landroidx/datastore/preferences/protobuf/j0;Landroidx/datastore/preferences/protobuf/o;Landroidx/datastore/preferences/protobuf/M;)Landroidx/datastore/preferences/protobuf/Q;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    :goto_1
    invoke-virtual {v0, p1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    check-cast p1, Landroidx/datastore/preferences/protobuf/b0;

    .line 190
    .line 191
    if-eqz p1, :cond_9

    .line 192
    .line 193
    return-object p1

    .line 194
    :cond_9
    return-object v4

    .line 195
    :cond_a
    return-object v1
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
