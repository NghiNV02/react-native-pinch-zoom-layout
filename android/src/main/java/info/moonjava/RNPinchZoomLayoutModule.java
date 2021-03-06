
package info.moonjava;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNPinchZoomLayoutModule extends ReactContextBaseJavaModule {

    private static final String CLASS_NAME = "RNPinchZoomLayoutModule";
    private final ReactApplicationContext reactContext;

    public RNPinchZoomLayoutModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return CLASS_NAME;
    }
}