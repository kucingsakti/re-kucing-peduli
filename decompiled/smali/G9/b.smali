.class public final LG9/b;
.super Li8/a;
.source "SourceFile"


# instance fields
.field public u:I

.field public final synthetic v:LG9/c;


# direct methods
.method public constructor <init>(LG9/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG9/b;->v:LG9/c;

    .line 2
    .line 3
    invoke-direct {p0}, Li8/a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, LG9/b;->u:I

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


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    :cond_0
    iget v0, p0, LG9/b;->u:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, LG9/b;->u:I

    .line 6
    .line 7
    iget-object v1, p0, LG9/b;->v:LG9/c;

    .line 8
    .line 9
    iget-object v1, v1, LG9/c;->s:[Ljava/lang/Object;

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    if-ge v0, v2, :cond_1

    .line 13
    .line 14
    aget-object v2, v1, v0

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    :cond_1
    array-length v2, v1

    .line 19
    if-lt v0, v2, :cond_2

    .line 20
    .line 21
    sget-object v0, Li8/D;->u:Li8/D;

    .line 22
    .line 23
    iput-object v0, p0, Li8/a;->s:Li8/D;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_2
    aget-object v0, v1, v0

    .line 27
    .line 28
    const-string v1, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl"

    .line 29
    .line 30
    invoke-static {v0, v1}, Lv8/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Li8/a;->t:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v0, Li8/D;->s:Li8/D;

    .line 36
    .line 37
    iput-object v0, p0, Li8/a;->s:Li8/D;

    .line 38
    .line 39
    return-void
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
