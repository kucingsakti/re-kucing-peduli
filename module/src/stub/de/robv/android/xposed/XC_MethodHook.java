package de.robv.android.xposed;
// STUB (compile-only). Real class provided by Vector/LSPosed at runtime.
public abstract class XC_MethodHook {
    public XC_MethodHook() {}
    public XC_MethodHook(int priority) {}
    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {}
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {}

    public static class MethodHookParam {
        public Object[] args;
        public Object thisObject;
        public Object method;
        public Object getResult() { return null; }
        public void setResult(Object result) {}
        public Throwable getThrowable() { return null; }
        public void setThrowable(Throwable throwable) {}
        public boolean hasThrowable() { return false; }
    }
    public class Unhook { public void unhook() {} }
}
