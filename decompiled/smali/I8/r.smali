.class public final enum LI8/r;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic v:[LI8/r;


# instance fields
.field public final s:Lj9/b;

.field public final t:Lj9/f;

.field public final u:Lj9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x0

    .line 5
    new-instance v4, LI8/r;

    .line 6
    .line 7
    const-string v5, "kotlin/UByte"

    .line 8
    .line 9
    invoke-static {v5, v3}, Lj9/b;->e(Ljava/lang/String;Z)Lj9/b;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    const-string v6, "UBYTE"

    .line 14
    .line 15
    invoke-direct {v4, v6, v3, v5}, LI8/r;-><init>(Ljava/lang/String;ILj9/b;)V

    .line 16
    .line 17
    .line 18
    new-instance v5, LI8/r;

    .line 19
    .line 20
    const-string v6, "kotlin/UShort"

    .line 21
    .line 22
    invoke-static {v6, v3}, Lj9/b;->e(Ljava/lang/String;Z)Lj9/b;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    const-string v7, "USHORT"

    .line 27
    .line 28
    invoke-direct {v5, v7, v2, v6}, LI8/r;-><init>(Ljava/lang/String;ILj9/b;)V

    .line 29
    .line 30
    .line 31
    new-instance v6, LI8/r;

    .line 32
    .line 33
    const-string v7, "kotlin/UInt"

    .line 34
    .line 35
    invoke-static {v7, v3}, Lj9/b;->e(Ljava/lang/String;Z)Lj9/b;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    const-string v8, "UINT"

    .line 40
    .line 41
    invoke-direct {v6, v8, v1, v7}, LI8/r;-><init>(Ljava/lang/String;ILj9/b;)V

    .line 42
    .line 43
    .line 44
    new-instance v7, LI8/r;

    .line 45
    .line 46
    const-string v8, "kotlin/ULong"

    .line 47
    .line 48
    invoke-static {v8, v3}, Lj9/b;->e(Ljava/lang/String;Z)Lj9/b;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    const-string v9, "ULONG"

    .line 53
    .line 54
    invoke-direct {v7, v9, v0, v8}, LI8/r;-><init>(Ljava/lang/String;ILj9/b;)V

    .line 55
    .line 56
    .line 57
    const/4 v8, 0x4

    .line 58
    new-array v8, v8, [LI8/r;

    .line 59
    .line 60
    aput-object v4, v8, v3

    .line 61
    .line 62
    aput-object v5, v8, v2

    .line 63
    .line 64
    aput-object v6, v8, v1

    .line 65
    .line 66
    aput-object v7, v8, v0

    .line 67
    .line 68
    sput-object v8, LI8/r;->v:[LI8/r;

    .line 69
    .line 70
    return-void
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

.method public constructor <init>(Ljava/lang/String;ILj9/b;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LI8/r;->s:Lj9/b;

    .line 5
    .line 6
    invoke-virtual {p3}, Lj9/b;->i()Lj9/f;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string p2, "classId.shortClassName"

    .line 11
    .line 12
    invoke-static {p1, p2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LI8/r;->t:Lj9/f;

    .line 16
    .line 17
    new-instance p2, Lj9/b;

    .line 18
    .line 19
    invoke-virtual {p3}, Lj9/b;->g()Lj9/c;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lj9/f;->g()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, "Array"

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {p2, p3, p1}, Lj9/b;-><init>(Lj9/c;Lj9/f;)V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, LI8/r;->u:Lj9/b;

    .line 52
    .line 53
    return-void
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

.method public static valueOf(Ljava/lang/String;)LI8/r;
    .locals 1

    .line 1
    const-class v0, LI8/r;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LI8/r;

    .line 8
    .line 9
    return-object p0
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

.method public static values()[LI8/r;
    .locals 1

    .line 1
    sget-object v0, LI8/r;->v:[LI8/r;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LI8/r;

    .line 8
    .line 9
    return-object v0
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
