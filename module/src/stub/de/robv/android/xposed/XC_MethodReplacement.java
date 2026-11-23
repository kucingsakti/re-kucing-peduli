package de.robv.android.xposed;
// STUB (compile-only).
public abstract class XC_MethodReplacement extends XC_MethodHook {
    public XC_MethodReplacement() {}
    public XC_MethodReplacement(int priority) {}
    protected abstract Object replaceHookedMethod(MethodHookParam param) throws Throwable;
    public static final XC_MethodReplacement DO_NOTHING = null;
    public static XC_MethodReplacement returnConstant(final Object constant) { return null; }
}
