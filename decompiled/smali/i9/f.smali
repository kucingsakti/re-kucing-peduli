.class public final Li9/f;
.super Lg9/a;
.source "SourceFile"


# static fields
.field public static final g:Li9/f;

.field public static final h:Li9/f;


# instance fields
.field public final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Li9/f;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    filled-new-array {v1, v2, v3}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, v2, v3}, Li9/f;-><init>([IZ)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Li9/f;->g:Li9/f;

    .line 15
    .line 16
    iget v2, v0, Lg9/a;->c:I

    .line 17
    .line 18
    iget v0, v0, Lg9/a;->b:I

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    const/16 v4, 0x9

    .line 23
    .line 24
    if-ne v2, v4, :cond_0

    .line 25
    .line 26
    new-instance v0, Li9/f;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    filled-new-array {v1, v3, v3}, [I

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v0, v1, v3}, Li9/f;-><init>([IZ)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v4, Li9/f;

    .line 38
    .line 39
    add-int/2addr v2, v1

    .line 40
    filled-new-array {v0, v2, v3}, [I

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-direct {v4, v0, v3}, Li9/f;-><init>([IZ)V

    .line 45
    .line 46
    .line 47
    move-object v0, v4

    .line 48
    :goto_0
    sput-object v0, Li9/f;->h:Li9/f;

    .line 49
    .line 50
    new-instance v0, Li9/f;

    .line 51
    .line 52
    new-array v1, v3, [I

    .line 53
    .line 54
    invoke-direct {v0, v1, v3}, Li9/f;-><init>([IZ)V

    .line 55
    .line 56
    .line 57
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
.end method

.method public constructor <init>([IZ)V
    .locals 1

    .line 1
    const-string v0, "versionArray"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Lg9/a;-><init>([I)V

    .line 12
    .line 13
    .line 14
    iput-boolean p2, p0, Li9/f;->f:Z

    .line 15
    .line 16
    return-void
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
.method public final b(Li9/f;)Z
    .locals 6

    .line 1
    const-string v0, "metadataVersionFromLanguageVersion"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    sget-object v1, Li9/f;->g:Li9/f;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    iget v3, p0, Lg9/a;->b:I

    .line 11
    .line 12
    iget v4, p0, Lg9/a;->c:I

    .line 13
    .line 14
    if-ne v3, v0, :cond_0

    .line 15
    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    iget v0, v1, Lg9/a;->b:I

    .line 19
    .line 20
    if-ne v0, v2, :cond_0

    .line 21
    .line 22
    const/16 v0, 0x8

    .line 23
    .line 24
    iget v5, v1, Lg9/a;->c:I

    .line 25
    .line 26
    if-ne v5, v0, :cond_0

    .line 27
    .line 28
    return v2

    .line 29
    :cond_0
    iget-boolean v0, p0, Li9/f;->f:Z

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    sget-object v1, Li9/f;->h:Li9/f;

    .line 35
    .line 36
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget v0, p1, Lg9/a;->b:I

    .line 40
    .line 41
    iget v5, v1, Lg9/a;->b:I

    .line 42
    .line 43
    if-le v5, v0, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    if-ge v5, v0, :cond_3

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_3
    iget v0, v1, Lg9/a;->c:I

    .line 50
    .line 51
    iget v5, p1, Lg9/a;->c:I

    .line 52
    .line 53
    if-le v0, v5, :cond_4

    .line 54
    .line 55
    :goto_1
    move-object p1, v1

    .line 56
    :cond_4
    :goto_2
    const/4 v0, 0x0

    .line 57
    if-ne v3, v2, :cond_5

    .line 58
    .line 59
    if-nez v4, :cond_5

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_5
    if-nez v3, :cond_6

    .line 63
    .line 64
    :goto_3
    return v0

    .line 65
    :cond_6
    iget v1, p1, Lg9/a;->b:I

    .line 66
    .line 67
    if-le v3, v1, :cond_7

    .line 68
    .line 69
    :goto_4
    move v0, v2

    .line 70
    goto :goto_5

    .line 71
    :cond_7
    if-ge v3, v1, :cond_8

    .line 72
    .line 73
    goto :goto_5

    .line 74
    :cond_8
    iget p1, p1, Lg9/a;->c:I

    .line 75
    .line 76
    if-le v4, p1, :cond_9

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_9
    :goto_5
    xor-int/lit8 p1, v0, 0x1

    .line 80
    .line 81
    return p1
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
