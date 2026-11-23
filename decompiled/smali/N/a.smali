.class public final LN/a;
.super Landroid/hardware/fingerprint/FingerprintManager$AuthenticationCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:LV/h;


# direct methods
.method public constructor <init>(LV/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/a;->a:LV/h;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/hardware/fingerprint/FingerprintManager$AuthenticationCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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


# virtual methods
.method public final onAuthenticationError(ILjava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, LN/a;->a:LV/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ld7/a;

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string p2, ""

    .line 12
    .line 13
    :goto_0
    invoke-direct {v1, p1, p2}, Ld7/a;-><init>(ILjava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, v0, LV/h;->t:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, LT7/b;

    .line 19
    .line 20
    invoke-interface {p1, v1}, LJ7/d;->d(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method public final onAuthenticationFailed()V
    .locals 2

    .line 1
    iget-object v0, p0, LN/a;->a:LV/h;

    .line 2
    .line 3
    sget-object v1, Ld7/b;->a:Ld7/b;

    .line 4
    .line 5
    iget-object v0, v0, LV/h;->t:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LT7/b;

    .line 8
    .line 9
    invoke-interface {v0, v1}, LJ7/d;->d(Ljava/lang/Object;)V

    .line 10
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
.end method

.method public final onAuthenticationHelp(ILjava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, LN/a;->a:LV/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ld7/c;

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string p2, ""

    .line 12
    .line 13
    :goto_0
    invoke-direct {v1, p1, p2}, Ld7/c;-><init>(ILjava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, v0, LV/h;->t:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, LT7/b;

    .line 19
    .line 20
    invoke-interface {p1, v1}, LJ7/d;->d(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method public final onAuthenticationSucceeded(Landroid/hardware/fingerprint/FingerprintManager$AuthenticationResult;)V
    .locals 4

    .line 1
    new-instance v0, LA1/r;

    .line 2
    .line 3
    invoke-static {p1}, LN/b;->b(Ljava/lang/Object;)Landroid/hardware/fingerprint/FingerprintManager$CryptoObject;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, LN/b;->f(Ljava/lang/Object;)LN/c;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/16 v1, 0x1a

    .line 12
    .line 13
    invoke-direct {v0, p1, v1}, LA1/r;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LN/a;->a:LV/h;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, LA1/r;->t:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, LN/c;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    new-instance v1, Lc7/a;

    .line 28
    .line 29
    iget-object v2, v0, LN/c;->c:Ljavax/crypto/Mac;

    .line 30
    .line 31
    iget-object v3, v0, LN/c;->a:Ljava/security/Signature;

    .line 32
    .line 33
    iget-object v0, v0, LN/c;->b:Ljavax/crypto/Cipher;

    .line 34
    .line 35
    invoke-direct {v1, v3, v0, v2}, Lc7/a;-><init>(Ljava/security/Signature;Ljavax/crypto/Cipher;Ljavax/crypto/Mac;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v1, 0x0

    .line 40
    :goto_0
    new-instance v0, Ld7/d;

    .line 41
    .line 42
    invoke-direct {v0, v1}, Ld7/d;-><init>(Lc7/a;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p1, LV/h;->t:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, LT7/b;

    .line 48
    .line 49
    invoke-interface {p1, v0}, LJ7/d;->d(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void
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
