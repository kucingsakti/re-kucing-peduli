.class public final LK0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:LO0/b;

.field public final d:LA1/r;

.field public final e:Ljava/util/ArrayList;

.field public final f:Z

.field public final g:I

.field public final h:Ljava/util/concurrent/Executor;

.field public final i:Ljava/util/concurrent/Executor;

.field public final j:Z

.field public final k:Z

.field public final l:Ljava/util/LinkedHashSet;

.field public final m:Ljava/util/ArrayList;

.field public final n:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;LO0/b;LA1/r;Ljava/util/ArrayList;ZILjava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZLjava/util/LinkedHashSet;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "migrationContainer"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "journalMode"

    .line 12
    .line 13
    invoke-static {p7, v0}, Landroidx/datastore/preferences/protobuf/g;->p(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "queryExecutor"

    .line 17
    .line 18
    invoke-static {p8, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "transactionExecutor"

    .line 22
    .line 23
    invoke-static {p9, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "typeConverters"

    .line 27
    .line 28
    invoke-static {p13, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "autoMigrationSpecs"

    .line 32
    .line 33
    invoke-static {p14, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, LK0/b;->a:Landroid/content/Context;

    .line 40
    .line 41
    iput-object p2, p0, LK0/b;->b:Ljava/lang/String;

    .line 42
    .line 43
    iput-object p3, p0, LK0/b;->c:LO0/b;

    .line 44
    .line 45
    iput-object p4, p0, LK0/b;->d:LA1/r;

    .line 46
    .line 47
    iput-object p5, p0, LK0/b;->e:Ljava/util/ArrayList;

    .line 48
    .line 49
    iput-boolean p6, p0, LK0/b;->f:Z

    .line 50
    .line 51
    iput p7, p0, LK0/b;->g:I

    .line 52
    .line 53
    iput-object p8, p0, LK0/b;->h:Ljava/util/concurrent/Executor;

    .line 54
    .line 55
    iput-object p9, p0, LK0/b;->i:Ljava/util/concurrent/Executor;

    .line 56
    .line 57
    iput-boolean p10, p0, LK0/b;->j:Z

    .line 58
    .line 59
    iput-boolean p11, p0, LK0/b;->k:Z

    .line 60
    .line 61
    iput-object p12, p0, LK0/b;->l:Ljava/util/LinkedHashSet;

    .line 62
    .line 63
    iput-object p13, p0, LK0/b;->m:Ljava/util/ArrayList;

    .line 64
    .line 65
    iput-object p14, p0, LK0/b;->n:Ljava/util/ArrayList;

    .line 66
    .line 67
    return-void
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
.end method
