package plugin.tapas.com.signaturechecker;
import android.app.Activity;
import android.content.Context;

public class SignatureChecker {
    // Used to load the 'signature-checker' library on application startup.
    static {
        System.loadLibrary("signature-checker");
    }
    private static SignatureChecker instance;
    private static SignatureChecker getInstance()
    {
        if(instance == null)
        {
            instance = new SignatureChecker();
        }
        return instance;
    }

    /**
     * Pass UnityActivity as parameter then retrieve apk signature string(SHA-1 digest).
     * @param activity
     * @return APK Signature string
     */
    public static String getSignature(Activity activity)
    {
        return getInstance().getSignature(activity.getApplicationContext());
    }

    public static String getSignatureSalted(Activity activity, String saltStr)
    {
        return getInstance().getSignatureSalted(activity.getApplicationContext(), saltStr);
    }

    public native String getSignature(Context context);
    public native String getSignatureSalted(Context context, String saltStr);
}
