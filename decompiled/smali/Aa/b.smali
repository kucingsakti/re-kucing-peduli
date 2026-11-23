.class public final LAa/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lya/k;


# static fields
.field public static final u:LX9/A;

.field public static final v:Ljava/nio/charset/Charset;


# instance fields
.field public final s:Lcom/google/gson/i;

.field public final t:Lcom/google/gson/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LX9/A;->d:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    const-string v0, "application/json; charset=UTF-8"

    .line 4
    .line 5
    invoke-static {v0}, Lga/d;->k(Ljava/lang/String;)LX9/A;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LAa/b;->u:LX9/A;

    .line 10
    .line 11
    const-string v0, "UTF-8"

    .line 12
    .line 13
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, LAa/b;->v:Ljava/nio/charset/Charset;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public constructor <init>(Lcom/google/gson/i;Lcom/google/gson/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LAa/b;->s:Lcom/google/gson/i;

    .line 5
    .line 6
    iput-object p2, p0, LAa/b;->t:Lcom/google/gson/u;

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


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lma/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/OutputStreamWriter;

    .line 7
    .line 8
    new-instance v2, Le0/m;

    .line 9
    .line 10
    invoke-direct {v2, v0}, Le0/m;-><init>(Lma/f;)V

    .line 11
    .line 12
    .line 13
    sget-object v3, LAa/b;->v:Ljava/nio/charset/Charset;

    .line 14
    .line 15
    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, LAa/b;->s:Lcom/google/gson/i;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lcom/google/gson/i;->e(Ljava/io/Writer;)LA4/b;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v2, p0, LAa/b;->t:Lcom/google/gson/u;

    .line 25
    .line 26
    invoke-virtual {v2, v1, p1}, Lcom/google/gson/u;->c(LA4/b;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, LA4/b;->close()V

    .line 30
    .line 31
    .line 32
    iget-wide v1, v0, Lma/f;->t:J

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Lma/f;->B(J)Lma/i;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string v0, "content"

    .line 39
    .line 40
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v0, LX9/H;

    .line 44
    .line 45
    sget-object v1, LAa/b;->u:LX9/A;

    .line 46
    .line 47
    invoke-direct {v0, v1, p1}, LX9/H;-><init>(LX9/A;Lma/i;)V

    .line 48
    .line 49
    .line 50
    return-object v0
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
